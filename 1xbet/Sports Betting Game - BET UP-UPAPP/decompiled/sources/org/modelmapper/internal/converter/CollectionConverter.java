package org.modelmapper.internal.converter;

import java.util.Collection;
import java.util.Iterator;
import org.modelmapper.internal.util.Iterables;
import org.modelmapper.internal.util.MappingContextHelper;
import org.modelmapper.spi.ConditionalConverter;
import org.modelmapper.spi.MappingContext;

/* loaded from: classes4.dex */
class CollectionConverter implements ConditionalConverter<Object, Collection<Object>> {
    CollectionConverter() {
    }

    @Override // org.modelmapper.Converter
    public /* bridge */ /* synthetic */ Object convert(MappingContext mappingContext) {
        return convert((MappingContext<Object, Collection<Object>>) mappingContext);
    }

    @Override // org.modelmapper.spi.ConditionalConverter
    public ConditionalConverter.MatchResult match(Class<?> cls, Class<?> cls2) {
        return (Iterables.isIterable(cls) && Collection.class.isAssignableFrom(cls2)) ? ConditionalConverter.MatchResult.FULL : ConditionalConverter.MatchResult.NONE;
    }

    @Override // org.modelmapper.Converter
    public Collection<Object> convert(MappingContext<Object, Collection<Object>> mappingContext) {
        Object create;
        Object source = mappingContext.getSource();
        if (source == null) {
            return null;
        }
        int length = Iterables.getLength(source);
        Collection<Object> destination = mappingContext.getDestination();
        Collection<Object> createCollection = MappingContextHelper.createCollection(mappingContext);
        Class resolveDestinationGenericType = MappingContextHelper.resolveDestinationGenericType(mappingContext);
        Iterator<Object> it = Iterables.iterator(source);
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            Object element = destination != null ? Iterables.getElement(destination, i) : null;
            if (next != null) {
                if (element == null) {
                    create = mappingContext.create((MappingContext<Object, Collection<Object>>) next, resolveDestinationGenericType);
                } else {
                    create = mappingContext.create((MappingContext<Object, Collection<Object>>) next, element);
                }
                element = mappingContext.getMappingEngine().map(create);
            }
            createCollection.add(element);
            i++;
        }
        Iterator<Object> it2 = Iterables.subIterable(destination, length).iterator();
        while (it2.hasNext()) {
            createCollection.add(it2.next());
        }
        return createCollection;
    }
}
