package com.google.android.gms.common.api.internal;

/* loaded from: classes8.dex */
public abstract class DataHolderResult implements com.google.android.gms.common.api.Result, com.google.android.gms.common.api.Releasable {
    protected final com.google.android.gms.common.data.DataHolder mDataHolder;
    protected final com.google.android.gms.common.api.Status mStatus;

    protected DataHolderResult(com.google.android.gms.common.data.DataHolder dataHolder) {
        this(dataHolder, new com.google.android.gms.common.api.Status(dataHolder.getStatusCode()));
    }

    @Override // com.google.android.gms.common.api.Releasable
    public void release() {
        com.google.android.gms.common.data.DataHolder dataHolder = this.mDataHolder;
        if (dataHolder != null) {
            dataHolder.close();
        }
    }

    @Override // com.google.android.gms.common.api.Result
    public com.google.android.gms.common.api.Status getStatus() {
        return this.mStatus;
    }

    protected DataHolderResult(com.google.android.gms.common.data.DataHolder dataHolder, com.google.android.gms.common.api.Status status) {
        this.mStatus = status;
        this.mDataHolder = dataHolder;
    }
}
