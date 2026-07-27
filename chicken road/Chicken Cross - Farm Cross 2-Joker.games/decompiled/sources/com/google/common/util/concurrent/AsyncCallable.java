package com.google.common.util.concurrent;

@ElementTypesAreNonnullByDefault
/* loaded from: classes8.dex */
public interface AsyncCallable<V> {
    ListenableFuture<V> call() throws Exception;
}
