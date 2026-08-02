package com.google.android.gms.internal.identity;

/* loaded from: classes8.dex */
abstract class zzcy extends com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl {
    public zzcy(com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        super((com.google.android.gms.common.api.Api<?>) com.google.android.gms.internal.identity.zzbi.zzb, googleApiClient);
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl, com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder
    public final /* bridge */ /* synthetic */ void setResult(java.lang.Object obj) {
        super.setResult((com.google.android.gms.internal.identity.zzcy) obj);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ com.google.android.gms.common.api.Result createFailedResult(com.google.android.gms.common.api.Status status) {
        return new com.google.android.gms.location.LocationSettingsResult(status, null);
    }
}
