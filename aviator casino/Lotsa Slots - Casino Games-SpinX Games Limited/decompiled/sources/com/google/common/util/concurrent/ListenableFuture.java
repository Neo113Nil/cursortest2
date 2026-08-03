package com.google.common.util.concurrent;

@com.google.errorprone.annotations.DoNotMock("Use the methods in Futures (like immediateFuture) or SettableFuture")
@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
/* loaded from: classes3.dex */
public interface ListenableFuture<V> extends java.util.concurrent.Future<V> {
    void addListener(java.lang.Runnable listener, java.util.concurrent.Executor executor);
}
