package com.google.common.util.concurrent;

/* loaded from: classes4.dex */
public interface AsyncFunction<I, O> {
    com.google.common.util.concurrent.ListenableFuture<O> apply(I i) throws java.lang.Exception;
}
