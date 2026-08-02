package com.google.common.collect;

@com.google.errorprone.annotations.Immutable(containerOf = {"B"})
/* loaded from: classes9.dex */
public final class ImmutableClassToInstanceMap<B> extends com.google.common.collect.ForwardingMap<java.lang.Class<? extends B>, B> implements com.google.common.collect.ClassToInstanceMap<B>, java.io.Serializable {
    private static final com.google.common.collect.ImmutableClassToInstanceMap<java.lang.Object> EMPTY = new com.google.common.collect.ImmutableClassToInstanceMap<>(com.google.common.collect.ImmutableMap.of());
    private final com.google.common.collect.ImmutableMap<java.lang.Class<? extends B>, B> delegate;

    public static <B> com.google.common.collect.ImmutableClassToInstanceMap<B> of() {
        return (com.google.common.collect.ImmutableClassToInstanceMap<B>) EMPTY;
    }

    public static <B, T extends B> com.google.common.collect.ImmutableClassToInstanceMap<B> of(java.lang.Class<T> cls, T t) {
        return new com.google.common.collect.ImmutableClassToInstanceMap<>(com.google.common.collect.ImmutableMap.of(cls, t));
    }

    public static <B> com.google.common.collect.ImmutableClassToInstanceMap.Builder<B> builder() {
        return new com.google.common.collect.ImmutableClassToInstanceMap.Builder<>();
    }

    public static final class Builder<B> {
        private final com.google.common.collect.ImmutableMap.Builder<java.lang.Class<? extends B>, B> mapBuilder = com.google.common.collect.ImmutableMap.builder();

        public final <T extends B> com.google.common.collect.ImmutableClassToInstanceMap.Builder<B> put(java.lang.Class<T> cls, T t) {
            this.mapBuilder.put(cls, t);
            return this;
        }

        public final <T extends B> com.google.common.collect.ImmutableClassToInstanceMap.Builder<B> putAll(java.util.Map<? extends java.lang.Class<? extends T>, ? extends T> map) {
            for (java.util.Map.Entry<? extends java.lang.Class<? extends T>, ? extends T> entry : map.entrySet()) {
                java.lang.Class<? extends T> key = entry.getKey();
                this.mapBuilder.put(key, cast(key, entry.getValue()));
            }
            return this;
        }

        private static <T> T cast(java.lang.Class<T> cls, java.lang.Object obj) {
            return (T) com.google.common.primitives.Primitives.wrap(cls).cast(obj);
        }

        public final com.google.common.collect.ImmutableClassToInstanceMap<B> build() {
            com.google.common.collect.ImmutableMap<java.lang.Class<? extends B>, B> buildOrThrow = this.mapBuilder.buildOrThrow();
            if (buildOrThrow.isEmpty()) {
                return com.google.common.collect.ImmutableClassToInstanceMap.of();
            }
            return new com.google.common.collect.ImmutableClassToInstanceMap<>(buildOrThrow);
        }
    }

    public static <B, S extends B> com.google.common.collect.ImmutableClassToInstanceMap<B> copyOf(java.util.Map<? extends java.lang.Class<? extends S>, ? extends S> map) {
        if (map instanceof com.google.common.collect.ImmutableClassToInstanceMap) {
            return (com.google.common.collect.ImmutableClassToInstanceMap) map;
        }
        return new com.google.common.collect.ImmutableClassToInstanceMap.Builder().putAll(map).build();
    }

    private ImmutableClassToInstanceMap(com.google.common.collect.ImmutableMap<java.lang.Class<? extends B>, B> immutableMap) {
        this.delegate = immutableMap;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
    public final java.util.Map<java.lang.Class<? extends B>, B> delegate() {
        return this.delegate;
    }

    @Override // com.google.common.collect.ClassToInstanceMap
    public final <T extends B> T getInstance(java.lang.Class<T> cls) {
        return this.delegate.get(com.google.common.base.Preconditions.checkNotNull(cls));
    }

    @Override // com.google.common.collect.ClassToInstanceMap
    @java.lang.Deprecated
    public final <T extends B> T putInstance(java.lang.Class<T> cls, T t) {
        throw new java.lang.UnsupportedOperationException();
    }

    final java.lang.Object readResolve() {
        return isEmpty() ? of() : this;
    }
}
