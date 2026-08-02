package com.google.android.gms.internal.safetynet;

/* loaded from: classes8.dex */
final class zzp implements com.google.android.gms.safetynet.SafetyNetApi.AttestationResult {
    private final com.google.android.gms.common.api.Status zza;
    private final com.google.android.gms.safetynet.zza zzb;

    @Override // com.google.android.gms.common.api.Result
    public final com.google.android.gms.common.api.Status getStatus() {
        return this.zza;
    }

    @Override // com.google.android.gms.safetynet.SafetyNetApi.AttestationResult
    public final java.lang.String getJwsResult() {
        com.google.android.gms.safetynet.zza zzaVar = this.zzb;
        if (zzaVar == null) {
            return null;
        }
        return zzaVar.zza();
    }

    public zzp(com.google.android.gms.common.api.Status status, com.google.android.gms.safetynet.zza zzaVar) {
        this.zza = status;
        this.zzb = zzaVar;
    }
}
