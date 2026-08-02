package org.modelmapper.internal;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.modelmapper.config.Configuration;
import org.modelmapper.internal.PropertyInfoImpl;

/* loaded from: classes4.dex */
class PropertyInfoRegistry {
    private static final Map<Integer, Mutator> MUTATOR_CACHE = new ConcurrentHashMap();
    private static final Map<Integer, Accessor> ACCESSOR_CACHE = new ConcurrentHashMap();
    private static final Map<Integer, PropertyInfoImpl.FieldPropertyInfo> FIELD_CACHE = new ConcurrentHashMap();

    PropertyInfoRegistry() {
    }

    private static Integer hashCodeFor(Class<?> cls, String str, Configuration configuration) {
        return Integer.valueOf(((((cls.hashCode() + 31) * 31) + str.hashCode()) * 31) + configuration.hashCode());
    }

    static Accessor accessorFor(Class<?> cls, String str, InheritingConfiguration inheritingConfiguration) {
        Integer hashCodeFor = hashCodeFor(cls, str, inheritingConfiguration);
        if (!ACCESSOR_CACHE.containsKey(hashCodeFor) || !FIELD_CACHE.containsKey(hashCodeFor)) {
            for (Map.Entry<String, Accessor> entry : TypeInfoRegistry.typeInfoFor(cls, inheritingConfiguration).getAccessors().entrySet()) {
                if (entry.getValue().getMember() instanceof Method) {
                    accessorFor(cls, (Method) entry.getValue().getMember(), inheritingConfiguration, entry.getKey());
                } else if (entry.getValue().getMember() instanceof Field) {
                    fieldPropertyFor(cls, (Field) entry.getValue().getMember(), inheritingConfiguration, entry.getKey());
                }
            }
        }
        Map<Integer, Accessor> map = ACCESSOR_CACHE;
        if (map.containsKey(hashCodeFor)) {
            return map.get(hashCodeFor);
        }
        return FIELD_CACHE.get(hashCodeFor);
    }

    static synchronized Accessor accessorFor(Class<?> cls, Method method, Configuration configuration, String str) {
        Accessor accessor;
        synchronized (PropertyInfoRegistry.class) {
            Integer hashCodeFor = hashCodeFor(cls, str, configuration);
            Map<Integer, Accessor> map = ACCESSOR_CACHE;
            accessor = map.get(hashCodeFor);
            if (accessor == null) {
                accessor = new PropertyInfoImpl.MethodAccessor(cls, method, str);
                map.put(hashCodeFor, accessor);
            }
        }
        return accessor;
    }

    static synchronized PropertyInfoImpl.FieldPropertyInfo fieldPropertyFor(Class<?> cls, Field field, Configuration configuration, String str) {
        PropertyInfoImpl.FieldPropertyInfo fieldPropertyInfo;
        synchronized (PropertyInfoRegistry.class) {
            Integer hashCodeFor = hashCodeFor(cls, str, configuration);
            Map<Integer, PropertyInfoImpl.FieldPropertyInfo> map = FIELD_CACHE;
            fieldPropertyInfo = map.get(hashCodeFor);
            if (fieldPropertyInfo == null) {
                fieldPropertyInfo = new PropertyInfoImpl.FieldPropertyInfo(cls, field, str);
                map.put(hashCodeFor, fieldPropertyInfo);
            }
        }
        return fieldPropertyInfo;
    }

    static synchronized Mutator mutatorFor(Class<?> cls, String str, InheritingConfiguration inheritingConfiguration) {
        synchronized (PropertyInfoRegistry.class) {
            Integer hashCodeFor = hashCodeFor(cls, str, inheritingConfiguration);
            if (!MUTATOR_CACHE.containsKey(hashCodeFor) || !FIELD_CACHE.containsKey(hashCodeFor)) {
                for (Map.Entry<String, Mutator> entry : TypeInfoRegistry.typeInfoFor(cls, inheritingConfiguration).getMutators().entrySet()) {
                    if (entry.getValue().getMember() instanceof Method) {
                        mutatorFor(cls, (Method) entry.getValue().getMember(), inheritingConfiguration, entry.getKey());
                    } else if (entry.getValue().getMember() instanceof Field) {
                        fieldPropertyFor(cls, (Field) entry.getValue().getMember(), inheritingConfiguration, entry.getKey());
                    }
                }
            }
            Map<Integer, Mutator> map = MUTATOR_CACHE;
            if (map.containsKey(hashCodeFor)) {
                return map.get(hashCodeFor);
            }
            return FIELD_CACHE.get(hashCodeFor);
        }
    }

    static synchronized Mutator mutatorFor(Class<?> cls, Method method, Configuration configuration, String str) {
        Mutator mutator;
        synchronized (PropertyInfoRegistry.class) {
            Integer hashCodeFor = hashCodeFor(cls, str, configuration);
            Map<Integer, Mutator> map = MUTATOR_CACHE;
            mutator = map.get(hashCodeFor);
            if (mutator == null) {
                mutator = new PropertyInfoImpl.MethodMutator(cls, method, str);
                map.put(hashCodeFor, mutator);
            }
        }
        return mutator;
    }
}
