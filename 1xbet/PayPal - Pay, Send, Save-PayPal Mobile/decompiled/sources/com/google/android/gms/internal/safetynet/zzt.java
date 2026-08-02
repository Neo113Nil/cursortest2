package com.google.android.gms.internal.safetynet;

/* loaded from: classes8.dex */
abstract class zzt extends com.google.android.gms.internal.safetynet.zze<com.google.android.gms.safetynet.SafetyNetApi.VerifyAppsUserResult> {
    protected final com.google.android.gms.internal.safetynet.zzg zza;

    public zzt(com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        super(googleApiClient);
        this.zza = new com.google.android.gms.internal.safetynet.zzs(this);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ com.google.android.gms.common.api.Result createFailedResult(com.google.android.gms.common.api.Status status) {
        return new com.google.android.gms.internal.safetynet.zzad(status, false);
    }
}
