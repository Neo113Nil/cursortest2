package org.modelmapper.internal;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.modelmapper.config.Configuration;

/* loaded from: classes4.dex */
class TypeInfoRegistry {
    private static final Map<TypeInfoKey, TypeInfoImpl<?>> cache = new ConcurrentHashMap();

    TypeInfoRegistry() {
    }

    private static class TypeInfoKey {
        private final Configuration configuration;
        private final Class<?> type;

        TypeInfoKey(Class<?> cls, Configuration configuration) {
            this.type = cls;
            this.configuration = configuration;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TypeInfoKey)) {
                return false;
            }
            TypeInfoKey typeInfoKey = (TypeInfoKey) obj;
            return this.type.equals(typeInfoKey.type) && this.configuration.equals(typeInfoKey.configuration);
        }

        public int hashCode() {
            return (this.type.hashCode() * 961) + this.configuration.hashCode();
        }
    }

    static <T> TypeInfoImpl<T> typeInfoFor(Accessor accessor, InheritingConfiguration inheritingConfiguration) {
        return typeInfoFor(null, accessor.getType(), inheritingConfiguration);
    }

    static <T> TypeInfoImpl<T> typeInfoFor(T t, Class<T> cls, InheritingConfiguration inheritingConfiguration) {
        if (inheritingConfiguration.valueAccessStore.getFirstSupportedReader(cls) != null) {
            return new TypeInfoImpl<>(t, cls, inheritingConfiguration);
        }
        return typeInfoFor(cls, inheritingConfiguration);
    }

    static <T> TypeInfoImpl<T> typeInfoFor(Class<T> cls, InheritingConfiguration inheritingConfiguration) {
        TypeInfoKey typeInfoKey = new TypeInfoKey(cls, inheritingConfiguration);
        Map<TypeInfoKey, TypeInfoImpl<?>> map = cache;
        TypeInfoImpl<T> typeInfoImpl = (TypeInfoImpl) map.get(typeInfoKey);
        if (typeInfoImpl == null) {
            synchronized (map) {
                typeInfoImpl = (TypeInfoImpl) map.get(typeInfoKey);
                if (typeInfoImpl == null) {
                    typeInfoImpl = new TypeInfoImpl<>(null, cls, inheritingConfiguration);
                    map.put(typeInfoKey, typeInfoImpl);
                }
            }
        }
        return typeInfoImpl;
    }
}
