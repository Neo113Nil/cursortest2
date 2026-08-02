package com.google.android.gms.common.api;

/* loaded from: classes8.dex */
final class zag<R extends com.google.android.gms.common.api.Result> extends com.google.android.gms.common.api.internal.BasePendingResult<R> {
    private final com.google.android.gms.common.api.Result zae;

    public zag(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.common.api.Result result) {
        super(googleApiClient);
        this.zae = result;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final R createFailedResult(com.google.android.gms.common.api.Status status) {
        return (R) this.zae;
    }
}
