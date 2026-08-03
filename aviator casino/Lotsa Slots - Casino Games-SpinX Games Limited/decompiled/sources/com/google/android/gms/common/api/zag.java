package com.google.android.gms.common.api;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes3.dex */
final class zag<R extends com.google.android.gms.common.api.Result> extends com.google.android.gms.common.api.internal.BasePendingResult<R> {
    private final com.google.android.gms.common.api.Result zae;

    public zag(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.common.api.Result result) {
        super(googleApiClient);
        this.zae = result;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final R createFailedResult(com.google.android.gms.common.api.Status status) {
        return (R) this.zae;
    }
}
