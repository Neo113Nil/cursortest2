package com.google.android.gms.common.api;

/* loaded from: classes8.dex */
final class zah<R extends com.google.android.gms.common.api.Result> extends com.google.android.gms.common.api.internal.BasePendingResult<R> {
    public zah(com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        super(googleApiClient);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final R createFailedResult(com.google.android.gms.common.api.Status status) {
        throw new java.lang.UnsupportedOperationException("Creating failed results is not supported");
    }
}
