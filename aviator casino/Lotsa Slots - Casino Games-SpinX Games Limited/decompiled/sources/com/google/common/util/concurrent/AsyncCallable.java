package com.google.common.util.concurrent;

@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
/* loaded from: classes3.dex */
public interface AsyncCallable<V> {
    com.google.common.util.concurrent.ListenableFuture<V> call() throws java.lang.Exception;
}
