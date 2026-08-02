package com.google.common.cache;

/* loaded from: classes9.dex */
public final class RemovalNotification<K, V> extends java.util.AbstractMap.SimpleImmutableEntry<K, V> {
    private static final long serialVersionUID = 0;
    private final com.google.common.cache.RemovalCause cause;

    public static <K, V> com.google.common.cache.RemovalNotification<K, V> create(K k, V v, com.google.common.cache.RemovalCause removalCause) {
        return new com.google.common.cache.RemovalNotification<>(k, v, removalCause);
    }

    private RemovalNotification(K k, V v, com.google.common.cache.RemovalCause removalCause) {
        super(k, v);
        this.cause = (com.google.common.cache.RemovalCause) com.google.common.base.Preconditions.checkNotNull(removalCause);
    }

    public final com.google.common.cache.RemovalCause getCause() {
        return this.cause;
    }

    public final boolean wasEvicted() {
        return this.cause.wasEvicted();
    }
}
