package com.google.android.datatransport.runtime.retries;

/* loaded from: classes8.dex */
public final class Retries {
    private Retries() {
    }

    public static <TInput, TResult, TException extends java.lang.Throwable> TResult retry(int i, TInput tinput, com.google.android.datatransport.runtime.retries.Function<TInput, TResult, TException> function, com.google.android.datatransport.runtime.retries.RetryStrategy<TInput, TResult> retryStrategy) throws java.lang.Throwable {
        TResult apply;
        if (i <= 0) {
            return function.apply(tinput);
        }
        do {
            apply = function.apply(tinput);
            tinput = retryStrategy.shouldRetry(tinput, apply);
            if (tinput == null) {
                break;
            }
            i--;
        } while (i > 0);
        return apply;
    }
}
