package com.google.android.gms.tasks;

/* loaded from: classes4.dex */
public interface Continuation<TResult, TContinuationResult> {
    TContinuationResult then(com.google.android.gms.tasks.Task<TResult> task) throws java.lang.Exception;
}
