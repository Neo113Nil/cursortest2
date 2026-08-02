package com.google.android.gms.internal.safetynet;

/* loaded from: classes8.dex */
abstract class zzv extends com.google.android.gms.internal.safetynet.zze<com.google.android.gms.safetynet.SafetyNetApi.HarmfulAppsResult> {
    protected final com.google.android.gms.internal.safetynet.zzg zza;

    public zzv(com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        super(googleApiClient);
        this.zza = new com.google.android.gms.internal.safetynet.zzu(this);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ com.google.android.gms.common.api.Result createFailedResult(com.google.android.gms.common.api.Status status) {
        return new com.google.android.gms.internal.safetynet.zzaa(status, null);
    }
}
