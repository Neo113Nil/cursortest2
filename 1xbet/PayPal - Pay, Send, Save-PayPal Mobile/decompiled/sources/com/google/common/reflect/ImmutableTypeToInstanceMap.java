package com.google.common.reflect;

/* loaded from: classes9.dex */
public final class ImmutableTypeToInstanceMap<B> extends com.google.common.collect.ForwardingMap<com.google.common.reflect.TypeToken<? extends B>, B> implements com.google.common.reflect.TypeToInstanceMap<B> {
    private final com.google.common.collect.ImmutableMap<com.google.common.reflect.TypeToken<? extends B>, B> delegate;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ForwardingMap, java.util.Map, com.google.common.collect.BiMap
    @java.lang.Deprecated
    public final /* bridge */ /* synthetic */ java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        return put((com.google.common.reflect.TypeToken<? extends com.google.common.reflect.TypeToken<? extends B>>) obj, (com.google.common.reflect.TypeToken<? extends B>) obj2);
    }

    public static <B> com.google.common.reflect.ImmutableTypeToInstanceMap<B> of() {
        return new com.google.common.reflect.ImmutableTypeToInstanceMap<>(com.google.common.collect.ImmutableMap.of());
    }

    public static <B> com.google.common.reflect.ImmutableTypeToInstanceMap.Builder<B> builder() {
        return new com.google.common.reflect.ImmutableTypeToInstanceMap.Builder<>();
    }

    public static final class Builder<B> {
        private final com.google.common.collect.ImmutableMap.Builder<com.google.common.reflect.TypeToken<? extends B>, B> mapBuilder;

        private Builder() {
            this.mapBuilder = com.google.common.collect.ImmutableMap.builder();
        }

        public final <T extends B> com.google.common.reflect.ImmutableTypeToInstanceMap.Builder<B> put(java.lang.Class<T> cls, T t) {
            this.mapBuilder.put(com.google.common.reflect.TypeToken.of((java.lang.Class) cls), t);
            return this;
        }

        public final <T extends B> com.google.common.reflect.ImmutableTypeToInstanceMap.Builder<B> put(com.google.common.reflect.TypeToken<T> typeToken, T t) {
            this.mapBuilder.put(typeToken.rejectTypeVariables(), t);
            return this;
        }

        public final com.google.common.reflect.ImmutableTypeToInstanceMap<B> build() {
            return new com.google.common.reflect.ImmutableTypeToInstanceMap<>(this.mapBuilder.buildOrThrow());
        }
    }

    private ImmutableTypeToInstanceMap(com.google.common.collect.ImmutableMap<com.google.common.reflect.TypeToken<? extends B>, B> immutableMap) {
        this.delegate = immutableMap;
    }

    @Override // com.google.common.reflect.TypeToInstanceMap
    public final <T extends B> T getInstance(com.google.common.reflect.TypeToken<T> typeToken) {
        return (T) trustedGet(typeToken.rejectTypeVariables());
    }

    @Override // com.google.common.reflect.TypeToInstanceMap
    public final <T extends B> T getInstance(java.lang.Class<T> cls) {
        return (T) trustedGet(com.google.common.reflect.TypeToken.of((java.lang.Class) cls));
    }

    @Override // com.google.common.reflect.TypeToInstanceMap
    @java.lang.Deprecated
    public final <T extends B> T putInstance(com.google.common.reflect.TypeToken<T> typeToken, T t) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.common.reflect.TypeToInstanceMap
    @java.lang.Deprecated
    public final <T extends B> T putInstance(java.lang.Class<T> cls, T t) {
        throw new java.lang.UnsupportedOperationException();
    }

    @java.lang.Deprecated
    public final B put(com.google.common.reflect.TypeToken<? extends B> typeToken, B b) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map, com.google.common.collect.BiMap
    @java.lang.Deprecated
    public final void putAll(java.util.Map<? extends com.google.common.reflect.TypeToken<? extends B>, ? extends B> map) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
    public final java.util.Map<com.google.common.reflect.TypeToken<? extends B>, B> delegate() {
        return this.delegate;
    }

    private <T extends B> T trustedGet(com.google.common.reflect.TypeToken<T> typeToken) {
        return this.delegate.get(typeToken);
    }
}
