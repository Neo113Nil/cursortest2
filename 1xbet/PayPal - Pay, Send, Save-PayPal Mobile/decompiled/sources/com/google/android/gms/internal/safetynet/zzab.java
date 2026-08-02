package com.google.android.gms.internal.safetynet;

/* loaded from: classes8.dex */
final class zzab implements com.google.android.gms.safetynet.SafetyNetApi.RecaptchaTokenResult {
    private final com.google.android.gms.common.api.Status zza;
    private final com.google.android.gms.safetynet.zzf zzb;

    @Override // com.google.android.gms.safetynet.SafetyNetApi.RecaptchaTokenResult
    public final java.lang.String getTokenResult() {
        com.google.android.gms.safetynet.zzf zzfVar = this.zzb;
        if (zzfVar == null) {
            return null;
        }
        return zzfVar.zza();
    }

    @Override // com.google.android.gms.common.api.Result
    public final com.google.android.gms.common.api.Status getStatus() {
        return this.zza;
    }

    public zzab(com.google.android.gms.common.api.Status status, com.google.android.gms.safetynet.zzf zzfVar) {
        this.zza = status;
        this.zzb = zzfVar;
    }
}
