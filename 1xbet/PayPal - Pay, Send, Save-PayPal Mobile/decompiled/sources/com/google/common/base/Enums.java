package com.google.common.base;

/* loaded from: classes9.dex */
public final class Enums {
    private static final java.util.Map<java.lang.Class<? extends java.lang.Enum<?>>, java.util.Map<java.lang.String, java.lang.ref.WeakReference<? extends java.lang.Enum<?>>>> enumConstantCache = new java.util.WeakHashMap();

    private Enums() {
    }

    public static java.lang.reflect.Field getField(java.lang.Enum<?> r1) {
        try {
            return r1.getDeclaringClass().getDeclaredField(r1.name());
        } catch (java.lang.NoSuchFieldException e) {
            throw new java.lang.AssertionError(e);
        }
    }

    public static <T extends java.lang.Enum<T>> com.google.common.base.Optional<T> getIfPresent(java.lang.Class<T> cls, java.lang.String str) {
        com.google.common.base.Preconditions.checkNotNull(cls);
        com.google.common.base.Preconditions.checkNotNull(str);
        return com.google.common.base.Platform.getEnumIfPresent(cls, str);
    }

    private static <T extends java.lang.Enum<T>> java.util.Map<java.lang.String, java.lang.ref.WeakReference<? extends java.lang.Enum<?>>> populateCache(java.lang.Class<T> cls) {
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.Iterator it = java.util.EnumSet.allOf(cls).iterator();
        while (it.hasNext()) {
            java.lang.Enum r2 = (java.lang.Enum) it.next();
            hashMap.put(r2.name(), new java.lang.ref.WeakReference(r2));
        }
        enumConstantCache.put(cls, hashMap);
        return hashMap;
    }

    static <T extends java.lang.Enum<T>> java.util.Map<java.lang.String, java.lang.ref.WeakReference<? extends java.lang.Enum<?>>> getEnumConstants(java.lang.Class<T> cls) {
        java.util.Map<java.lang.String, java.lang.ref.WeakReference<? extends java.lang.Enum<?>>> map;
        java.util.Map<java.lang.Class<? extends java.lang.Enum<?>>, java.util.Map<java.lang.String, java.lang.ref.WeakReference<? extends java.lang.Enum<?>>>> map2 = enumConstantCache;
        synchronized (map2) {
            map = map2.get(cls);
            if (map == null) {
                map = populateCache(cls);
            }
        }
        return map;
    }

    public static <T extends java.lang.Enum<T>> com.google.common.base.Converter<java.lang.String, T> stringConverter(java.lang.Class<T> cls) {
        return new com.google.common.base.Enums.StringConverter(cls);
    }

    static final class StringConverter<T extends java.lang.Enum<T>> extends com.google.common.base.Converter<java.lang.String, T> implements java.io.Serializable {
        private static final long serialVersionUID = 0;
        private final java.lang.Class<T> enumClass;

        StringConverter(java.lang.Class<T> cls) {
            this.enumClass = (java.lang.Class) com.google.common.base.Preconditions.checkNotNull(cls);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.base.Converter
        public final T doForward(java.lang.String str) {
            return (T) java.lang.Enum.valueOf(this.enumClass, str);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.base.Converter
        public final java.lang.String doBackward(T t) {
            return t.name();
        }

        @Override // com.google.common.base.Converter, com.google.common.base.Function
        public final boolean equals(java.lang.Object obj) {
            if (obj instanceof com.google.common.base.Enums.StringConverter) {
                return this.enumClass.equals(((com.google.common.base.Enums.StringConverter) obj).enumClass);
            }
            return false;
        }

        public final int hashCode() {
            return this.enumClass.hashCode();
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Enums.stringConverter(");
            sb.append(this.enumClass.getName());
            sb.append(".class)");
            return sb.toString();
        }
    }
}
