package org.modelmapper.internal.util;

import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import org.modelmapper.internal.typetools.TypeResolver;
import org.modelmapper.spi.Mapping;
import org.modelmapper.spi.MappingContext;
import org.modelmapper.spi.PropertyInfo;
import org.modelmapper.spi.PropertyMapping;

/* loaded from: classes4.dex */
public final class MappingContextHelper {
    private MappingContextHelper() {
    }

    public static <T> Collection<T> createCollection(MappingContext<?, Collection<T>> mappingContext) {
        if (mappingContext.getDestinationType().isInterface()) {
            if (SortedSet.class.isAssignableFrom(mappingContext.getDestinationType())) {
                return new TreeSet();
            }
            if (Set.class.isAssignableFrom(mappingContext.getDestinationType())) {
                return new HashSet();
            }
            return new ArrayList();
        }
        return (Collection) mappingContext.getMappingEngine().createDestination(mappingContext);
    }

    public static Class<?> resolveDestinationGenericType(MappingContext<?, ?> mappingContext) {
        Mapping mapping = mappingContext.getMapping();
        if (mapping instanceof PropertyMapping) {
            PropertyInfo lastDestinationProperty = mapping.getLastDestinationProperty();
            Class<?> resolveRawArgument = TypeResolver.resolveRawArgument(lastDestinationProperty.getGenericType(), lastDestinationProperty.getInitialType());
            if (resolveRawArgument != TypeResolver.Unknown.class) {
                return resolveRawArgument;
            }
        }
        if (mappingContext.getGenericDestinationType() instanceof ParameterizedType) {
            return Types.rawTypeFor(((ParameterizedType) mappingContext.getGenericDestinationType()).getActualTypeArguments()[0]);
        }
        return Object.class;
    }
}
