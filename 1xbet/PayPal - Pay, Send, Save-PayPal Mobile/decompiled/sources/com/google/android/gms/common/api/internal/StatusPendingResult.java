package com.google.android.gms.common.api.internal;

/* loaded from: classes8.dex */
public class StatusPendingResult extends com.google.android.gms.common.api.internal.BasePendingResult<com.google.android.gms.common.api.Status> {
    @java.lang.Deprecated
    public StatusPendingResult(android.os.Looper looper) {
        super(looper);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final /* bridge */ /* synthetic */ com.google.android.gms.common.api.Status createFailedResult(com.google.android.gms.common.api.Status status) {
        return status;
    }

    public StatusPendingResult(com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        super(googleApiClient);
    }
}
