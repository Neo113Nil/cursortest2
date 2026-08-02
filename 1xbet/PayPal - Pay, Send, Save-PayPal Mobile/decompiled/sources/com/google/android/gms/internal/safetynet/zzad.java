package com.google.android.gms.internal.safetynet;

/* loaded from: classes8.dex */
public final class zzad implements com.google.android.gms.safetynet.SafetyNetApi.VerifyAppsUserResult {
    private com.google.android.gms.common.api.Status zza;
    private boolean zzb;

    public zzad() {
    }

    @Override // com.google.android.gms.safetynet.SafetyNetApi.VerifyAppsUserResult
    public final boolean isVerifyAppsEnabled() {
        com.google.android.gms.common.api.Status status = this.zza;
        if (status == null || !status.isSuccess()) {
            return false;
        }
        return this.zzb;
    }

    @Override // com.google.android.gms.common.api.Result
    public final com.google.android.gms.common.api.Status getStatus() {
        return this.zza;
    }

    public zzad(com.google.android.gms.common.api.Status status, boolean z) {
        this.zza = status;
        this.zzb = z;
    }
}
