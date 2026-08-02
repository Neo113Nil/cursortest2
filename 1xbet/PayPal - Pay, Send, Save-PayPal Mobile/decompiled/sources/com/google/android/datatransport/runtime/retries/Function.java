package com.google.android.datatransport.runtime.retries;

/* loaded from: classes8.dex */
public interface Function<TInput, TResult, TException extends java.lang.Throwable> {
    TResult apply(TInput tinput) throws java.lang.Throwable;
}
