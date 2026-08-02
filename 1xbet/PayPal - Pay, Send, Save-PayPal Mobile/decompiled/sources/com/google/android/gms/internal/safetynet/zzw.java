package com.google.android.gms.internal.safetynet;

/* loaded from: classes8.dex */
final class zzw extends com.google.android.gms.internal.safetynet.zzd {
    final /* synthetic */ com.google.android.gms.internal.safetynet.zzx zza;

    zzw(com.google.android.gms.internal.safetynet.zzx zzxVar) {
        this.zza = zzxVar;
    }

    @Override // com.google.android.gms.internal.safetynet.zzd, com.google.android.gms.internal.safetynet.zzg
    public final void zzh(com.google.android.gms.common.api.Status status, com.google.android.gms.safetynet.zzf zzfVar) {
        this.zza.setResult((com.google.android.gms.internal.safetynet.zzx) new com.google.android.gms.internal.safetynet.zzab(status, zzfVar));
    }
}
