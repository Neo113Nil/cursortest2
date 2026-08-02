package com.google.android.gms.common.api;

/* loaded from: classes8.dex */
public abstract class ResultTransform<R extends com.google.android.gms.common.api.Result, S extends com.google.android.gms.common.api.Result> {
    public final com.google.android.gms.common.api.PendingResult<S> createFailedResult(com.google.android.gms.common.api.Status status) {
        return new com.google.android.gms.common.api.internal.zacp(status);
    }

    public com.google.android.gms.common.api.Status onFailure(com.google.android.gms.common.api.Status status) {
        return status;
    }

    public abstract com.google.android.gms.common.api.PendingResult<S> onSuccess(R r);
}
