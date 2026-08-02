package com.google.common.util.concurrent;

/* loaded from: classes4.dex */
public final class SettableFuture<V> extends com.google.common.util.concurrent.AbstractFuture.TrustedFuture<V> {
    public static <V> com.google.common.util.concurrent.SettableFuture<V> create() {
        return new com.google.common.util.concurrent.SettableFuture<>();
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    public final boolean set(V v) {
        return super.set(v);
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    public final boolean setException(java.lang.Throwable th) {
        return super.setException(th);
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    public final boolean setFuture(com.google.common.util.concurrent.ListenableFuture<? extends V> listenableFuture) {
        return super.setFuture(listenableFuture);
    }

    private SettableFuture() {
    }
}
