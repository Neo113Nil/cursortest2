package com.google.android.gms.internal.safetynet;

/* loaded from: classes8.dex */
final class zzu extends com.google.android.gms.internal.safetynet.zzd {
    final /* synthetic */ com.google.android.gms.internal.safetynet.zzv zza;

    zzu(com.google.android.gms.internal.safetynet.zzv zzvVar) {
        this.zza = zzvVar;
    }

    @Override // com.google.android.gms.internal.safetynet.zzd, com.google.android.gms.internal.safetynet.zzg
    public final void zzg(com.google.android.gms.common.api.Status status, com.google.android.gms.safetynet.zzd zzdVar) {
        this.zza.setResult((com.google.android.gms.internal.safetynet.zzv) new com.google.android.gms.internal.safetynet.zzaa(status, zzdVar));
    }
}
