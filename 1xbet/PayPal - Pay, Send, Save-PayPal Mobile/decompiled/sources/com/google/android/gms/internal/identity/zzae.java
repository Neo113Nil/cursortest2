package com.google.android.gms.internal.identity;

/* loaded from: classes8.dex */
abstract class zzae extends com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl {
    public zzae(com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        super(com.google.android.gms.location.ActivityRecognition.API, googleApiClient);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ com.google.android.gms.common.api.Result createFailedResult(com.google.android.gms.common.api.Status status) {
        return status;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl, com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder
    public final /* bridge */ /* synthetic */ void setResult(java.lang.Object obj) {
        super.setResult((com.google.android.gms.internal.identity.zzae) obj);
    }
}
