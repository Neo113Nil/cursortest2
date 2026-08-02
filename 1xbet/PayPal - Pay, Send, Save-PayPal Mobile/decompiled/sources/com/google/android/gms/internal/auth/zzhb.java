package com.google.android.gms.internal.auth;

/* loaded from: classes8.dex */
final class zzhb extends com.google.android.gms.internal.auth.zzgz {
    @Override // com.google.android.gms.internal.auth.zzgz
    final /* synthetic */ java.lang.Object zza(java.lang.Object obj) {
        com.google.android.gms.internal.auth.zzev zzevVar = (com.google.android.gms.internal.auth.zzev) obj;
        com.google.android.gms.internal.auth.zzha zzhaVar = zzevVar.zzc;
        if (zzhaVar != com.google.android.gms.internal.auth.zzha.zza()) {
            return zzhaVar;
        }
        com.google.android.gms.internal.auth.zzha zzd = com.google.android.gms.internal.auth.zzha.zzd();
        zzevVar.zzc = zzd;
        return zzd;
    }

    @Override // com.google.android.gms.internal.auth.zzgz
    final /* synthetic */ java.lang.Object zzb(java.lang.Object obj) {
        return ((com.google.android.gms.internal.auth.zzev) obj).zzc;
    }

    @Override // com.google.android.gms.internal.auth.zzgz
    final /* synthetic */ java.lang.Object zzc(java.lang.Object obj, java.lang.Object obj2) {
        if (!com.google.android.gms.internal.auth.zzha.zza().equals(obj2)) {
            if (com.google.android.gms.internal.auth.zzha.zza().equals(obj)) {
                return com.google.android.gms.internal.auth.zzha.zzc((com.google.android.gms.internal.auth.zzha) obj, (com.google.android.gms.internal.auth.zzha) obj2);
            }
            ((com.google.android.gms.internal.auth.zzha) obj).zzb((com.google.android.gms.internal.auth.zzha) obj2);
        }
        return obj;
    }

    @Override // com.google.android.gms.internal.auth.zzgz
    final /* synthetic */ void zzd(java.lang.Object obj, int i, long j) {
        ((com.google.android.gms.internal.auth.zzha) obj).zzh(i << 3, java.lang.Long.valueOf(j));
    }

    @Override // com.google.android.gms.internal.auth.zzgz
    final void zze(java.lang.Object obj) {
        ((com.google.android.gms.internal.auth.zzev) obj).zzc.zzf();
    }

    @Override // com.google.android.gms.internal.auth.zzgz
    final /* synthetic */ void zzf(java.lang.Object obj, java.lang.Object obj2) {
        ((com.google.android.gms.internal.auth.zzev) obj).zzc = (com.google.android.gms.internal.auth.zzha) obj2;
    }

    zzhb() {
    }
}
