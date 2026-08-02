package com.google.android.gms.internal.safetynet;

/* loaded from: classes8.dex */
final class zzq extends com.google.android.gms.internal.safetynet.zzd {
    final /* synthetic */ com.google.android.gms.internal.safetynet.zzr zza;

    zzq(com.google.android.gms.internal.safetynet.zzr zzrVar) {
        this.zza = zzrVar;
    }

    @Override // com.google.android.gms.internal.safetynet.zzd, com.google.android.gms.internal.safetynet.zzg
    public final void zzd(com.google.android.gms.common.api.Status status, com.google.android.gms.safetynet.zza zzaVar) {
        this.zza.setResult((com.google.android.gms.internal.safetynet.zzr) new com.google.android.gms.internal.safetynet.zzp(status, zzaVar));
    }
}
