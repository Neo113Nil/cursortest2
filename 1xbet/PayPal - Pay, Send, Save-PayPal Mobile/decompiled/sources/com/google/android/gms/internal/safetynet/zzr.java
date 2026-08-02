package com.google.android.gms.internal.safetynet;

/* loaded from: classes8.dex */
abstract class zzr extends com.google.android.gms.internal.safetynet.zze<com.google.android.gms.safetynet.SafetyNetApi.AttestationResult> {
    protected final com.google.android.gms.internal.safetynet.zzg zzc;

    public zzr(com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        super(googleApiClient);
        this.zzc = new com.google.android.gms.internal.safetynet.zzq(this);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ com.google.android.gms.common.api.Result createFailedResult(com.google.android.gms.common.api.Status status) {
        return new com.google.android.gms.internal.safetynet.zzp(status, null);
    }
}
