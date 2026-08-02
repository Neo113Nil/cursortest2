package com.google.android.gms.internal.safetynet;

/* loaded from: classes8.dex */
abstract class zzx extends com.google.android.gms.internal.safetynet.zze<com.google.android.gms.safetynet.SafetyNetApi.RecaptchaTokenResult> {
    protected final com.google.android.gms.internal.safetynet.zzg zzb;

    public zzx(com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        super(googleApiClient);
        this.zzb = new com.google.android.gms.internal.safetynet.zzw(this);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ com.google.android.gms.common.api.Result createFailedResult(com.google.android.gms.common.api.Status status) {
        return new com.google.android.gms.internal.safetynet.zzab(status, null);
    }
}
