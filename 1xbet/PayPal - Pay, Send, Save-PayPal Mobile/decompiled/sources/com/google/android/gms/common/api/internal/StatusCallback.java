package com.google.android.gms.common.api.internal;

/* loaded from: classes8.dex */
public class StatusCallback extends com.google.android.gms.common.api.internal.IStatusCallback.Stub {
    private final com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.common.api.Status> resultHolder;

    public StatusCallback(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.common.api.Status> resultHolder) {
        this.resultHolder = resultHolder;
    }

    @Override // com.google.android.gms.common.api.internal.IStatusCallback
    public void onResult(com.google.android.gms.common.api.Status status) {
        this.resultHolder.setResult(status);
    }
}
