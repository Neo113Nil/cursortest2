package org.modelmapper.internal.converter;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import org.modelmapper.internal.typetools.TypeResolver;
import org.modelmapper.spi.ConditionalConverter;
import org.modelmapper.spi.Mapping;
import org.modelmapper.spi.MappingContext;
import org.modelmapper.spi.PropertyInfo;
import org.modelmapper.spi.PropertyMapping;

/* loaded from: classes4.dex */
class MapConverter implements ConditionalConverter<Map<?, ?>, Map<Object, Object>> {
    MapConverter() {
    }

    @Override // org.modelmapper.Converter
    public /* bridge */ /* synthetic */ Object convert(MappingContext mappingContext) {
        return convert((MappingContext<Map<?, ?>, Map<Object, Object>>) mappingContext);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.modelmapper.Converter
    public Map<Object, Object> convert(MappingContext<Map<?, ?>, Map<Object, Object>> mappingContext) {
        Map<?, ?> source = mappingContext.getSource();
        if (source == null) {
            return null;
        }
        Map<Object, Object> createDestination = mappingContext.getDestination() == null ? createDestination(mappingContext) : mappingContext.getDestination();
        Mapping mapping = mappingContext.getMapping();
        Class<Object> cls = Object.class;
        Class<Object> cls2 = Object.class;
        Class<CD> cls3 = cls;
        Class<CD> cls4 = cls2;
        if (mapping != null) {
            cls3 = cls;
            cls4 = cls2;
            if (mapping instanceof PropertyMapping) {
                PropertyInfo lastDestinationProperty = ((PropertyMapping) mapping).getLastDestinationProperty();
                Class<?>[] resolveRawArguments = TypeResolver.resolveRawArguments(lastDestinationProperty.getGenericType(), lastDestinationProperty.getMember().getDeclaringClass());
                cls3 = cls;
                cls4 = cls2;
                if (resolveRawArguments != null) {
                    Class<?> cls5 = resolveRawArguments[0];
                    Class<?> cls6 = cls5;
                    if (cls5 == TypeResolver.Unknown.class) {
                        cls6 = Object.class;
                    }
                    Class<?> cls7 = resolveRawArguments[1];
                    Class<?> cls8 = cls7;
                    if (cls7 == TypeResolver.Unknown.class) {
                        cls8 = Object.class;
                    }
                    cls4 = cls8;
                    cls3 = cls6;
                }
            }
        }
        for (Map.Entry<?, ?> entry : source.entrySet()) {
            createDestination.put(entry.getKey() != null ? mappingContext.getMappingEngine().map(mappingContext.create((MappingContext<Map<?, ?>, Map<Object, Object>>) entry.getKey(), (Class) cls3)) : null, entry.getValue() != null ? mappingContext.getMappingEngine().map(mappingContext.create((MappingContext<Map<?, ?>, Map<Object, Object>>) entry.getValue(), (Class) cls4)) : null);
        }
        return createDestination;
    }

    @Override // org.modelmapper.spi.ConditionalConverter
    public ConditionalConverter.MatchResult match(Class<?> cls, Class<?> cls2) {
        return (Map.class.isAssignableFrom(cls) && Map.class.isAssignableFrom(cls2)) ? ConditionalConverter.MatchResult.FULL : ConditionalConverter.MatchResult.NONE;
    }

    protected Map<Object, Object> createDestination(MappingContext<Map<?, ?>, Map<Object, Object>> mappingContext) {
        if (!mappingContext.getDestinationType().isInterface()) {
            return (Map) mappingContext.getMappingEngine().createDestination(mappingContext);
        }
        if (SortedMap.class.isAssignableFrom(mappingContext.getDestinationType())) {
            return new TreeMap();
        }
        return new HashMap();
    }
}
