package com.google.common.util.concurrent;

@com.google.errorprone.annotations.DoNotMock("Use the methods in Futures (like immediateFuture) or SettableFuture")
@org.jspecify.annotations.NullMarked
/* loaded from: classes.dex */
public interface ListenableFuture<V> extends java.util.concurrent.Future<V> {
    void addListener(java.lang.Runnable runnable, java.util.concurrent.Executor executor);
}
