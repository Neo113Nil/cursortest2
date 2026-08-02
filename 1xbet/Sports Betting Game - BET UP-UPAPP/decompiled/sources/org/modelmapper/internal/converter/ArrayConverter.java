package org.modelmapper.internal.converter;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.util.Iterator;
import org.modelmapper.internal.util.Iterables;
import org.modelmapper.internal.util.Types;
import org.modelmapper.spi.ConditionalConverter;
import org.modelmapper.spi.MappingContext;

/* loaded from: classes4.dex */
class ArrayConverter implements ConditionalConverter<Object, Object> {
    ArrayConverter() {
    }

    @Override // org.modelmapper.spi.ConditionalConverter
    public ConditionalConverter.MatchResult match(Class<?> cls, Class<?> cls2) {
        return (Iterables.isIterable(cls) && cls2.isArray()) ? ConditionalConverter.MatchResult.FULL : ConditionalConverter.MatchResult.NONE;
    }

    @Override // org.modelmapper.Converter
    public Object convert(MappingContext<Object, Object> mappingContext) {
        Object create;
        Object source = mappingContext.getSource();
        if (source == null) {
            return null;
        }
        int i = 0;
        boolean z = mappingContext.getDestination() != null;
        Object createDestination = createDestination(mappingContext);
        Class<?> elementType = getElementType(mappingContext);
        Iterator<Object> it = Iterables.iterator(source);
        while (it.hasNext()) {
            Object next = it.next();
            Object element = z ? Iterables.getElement(createDestination, i) : null;
            if (next != null) {
                if (element == null) {
                    create = mappingContext.create((MappingContext<Object, Object>) next, (Class) elementType);
                } else {
                    create = mappingContext.create((MappingContext<Object, Object>) next, element);
                }
                element = mappingContext.getMappingEngine().map(create);
            }
            Array.set(createDestination, i, element);
            i++;
        }
        return createDestination;
    }

    private Object createDestination(MappingContext<Object, Object> mappingContext) {
        int length = Iterables.getLength(mappingContext.getSource());
        int length2 = mappingContext.getDestination() != null ? Iterables.getLength(mappingContext.getDestination()) : 0;
        int max = Math.max(length, length2);
        Object destination = mappingContext.getDestination();
        Class<?> destinationType = mappingContext.getDestinationType();
        if (destinationType.isArray()) {
            destinationType = destinationType.getComponentType();
        }
        Object newInstance = Array.newInstance(destinationType, max);
        if (destination != null) {
            System.arraycopy(destination, 0, newInstance, 0, length2);
        }
        return newInstance;
    }

    private Class<?> getElementType(MappingContext<Object, Object> mappingContext) {
        if (mappingContext.getGenericDestinationType() instanceof GenericArrayType) {
            return Types.rawTypeFor(mappingContext.getGenericDestinationType()).getComponentType();
        }
        return mappingContext.getDestinationType().getComponentType();
    }
}
