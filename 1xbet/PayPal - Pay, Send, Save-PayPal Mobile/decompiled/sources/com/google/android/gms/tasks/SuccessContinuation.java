package com.google.android.gms.tasks;

/* loaded from: classes4.dex */
public interface SuccessContinuation<TResult, TContinuationResult> {
    com.google.android.gms.tasks.Task<TContinuationResult> then(TResult tresult) throws java.lang.Exception;
}
