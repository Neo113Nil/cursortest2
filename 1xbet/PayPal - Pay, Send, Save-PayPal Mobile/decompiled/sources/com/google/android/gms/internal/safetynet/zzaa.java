package com.google.android.gms.internal.safetynet;

/* loaded from: classes8.dex */
final class zzaa implements com.google.android.gms.safetynet.SafetyNetApi.HarmfulAppsResult {
    private final com.google.android.gms.common.api.Status zza;
    private final com.google.android.gms.safetynet.zzd zzb;

    @Override // com.google.android.gms.safetynet.SafetyNetApi.HarmfulAppsResult
    public final java.util.List<com.google.android.gms.safetynet.HarmfulAppsData> getHarmfulAppsList() {
        com.google.android.gms.safetynet.zzd zzdVar = this.zzb;
        return zzdVar == null ? java.util.Collections.emptyList() : java.util.Arrays.asList(zzdVar.zzb);
    }

    @Override // com.google.android.gms.common.api.Result
    public final com.google.android.gms.common.api.Status getStatus() {
        return this.zza;
    }

    @Override // com.google.android.gms.safetynet.SafetyNetApi.HarmfulAppsResult
    public final long getLastScanTimeMs() {
        com.google.android.gms.safetynet.zzd zzdVar = this.zzb;
        if (zzdVar == null) {
            return 0L;
        }
        return zzdVar.zza;
    }

    @Override // com.google.android.gms.safetynet.SafetyNetApi.HarmfulAppsResult
    public final int getHoursSinceLastScanWithHarmfulApp() {
        com.google.android.gms.safetynet.zzd zzdVar = this.zzb;
        if (zzdVar == null) {
            return -1;
        }
        return zzdVar.zzc;
    }

    public zzaa(com.google.android.gms.common.api.Status status, com.google.android.gms.safetynet.zzd zzdVar) {
        this.zza = status;
        this.zzb = zzdVar;
    }
}
