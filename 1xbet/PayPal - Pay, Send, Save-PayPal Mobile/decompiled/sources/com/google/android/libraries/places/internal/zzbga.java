package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbga extends com.google.android.libraries.places.internal.zzbfy {
    @Override // com.google.android.libraries.places.internal.zzbfy
    final /* synthetic */ void zza(java.lang.Object obj, int i, long j) {
        ((com.google.android.libraries.places.internal.zzbfz) obj).zzk(i << 3, java.lang.Long.valueOf(j));
    }

    @Override // com.google.android.libraries.places.internal.zzbfy
    final /* synthetic */ void zzb(java.lang.Object obj, int i, int i2) {
        ((com.google.android.libraries.places.internal.zzbfz) obj).zzk((i << 3) | 5, java.lang.Integer.valueOf(i2));
    }

    @Override // com.google.android.libraries.places.internal.zzbfy
    final /* synthetic */ void zzc(java.lang.Object obj, int i, long j) {
        ((com.google.android.libraries.places.internal.zzbfz) obj).zzk((i << 3) | 1, java.lang.Long.valueOf(j));
    }

    @Override // com.google.android.libraries.places.internal.zzbfy
    final /* synthetic */ void zzd(java.lang.Object obj, int i, com.google.android.libraries.places.internal.zzbcl zzbclVar) {
        ((com.google.android.libraries.places.internal.zzbfz) obj).zzk((i << 3) | 2, zzbclVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbfy
    final /* synthetic */ void zze(java.lang.Object obj, int i, java.lang.Object obj2) {
        ((com.google.android.libraries.places.internal.zzbfz) obj).zzk((i << 3) | 3, (com.google.android.libraries.places.internal.zzbfz) obj2);
    }

    @Override // com.google.android.libraries.places.internal.zzbfy
    final /* synthetic */ java.lang.Object zzg(java.lang.Object obj) {
        com.google.android.libraries.places.internal.zzbfz zzbfzVar = (com.google.android.libraries.places.internal.zzbfz) obj;
        zzbfzVar.zzd();
        return zzbfzVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbfy
    final /* synthetic */ java.lang.Object zzh(java.lang.Object obj) {
        com.google.android.libraries.places.internal.zzbdq zzbdqVar = (com.google.android.libraries.places.internal.zzbdq) obj;
        com.google.android.libraries.places.internal.zzbfz zzbfzVar = zzbdqVar.zzc;
        if (zzbfzVar != com.google.android.libraries.places.internal.zzbfz.zza()) {
            return zzbfzVar;
        }
        com.google.android.libraries.places.internal.zzbfz zzb = com.google.android.libraries.places.internal.zzbfz.zzb();
        zzbdqVar.zzc = zzb;
        return zzb;
    }

    @Override // com.google.android.libraries.places.internal.zzbfy
    final /* synthetic */ void zzi(java.lang.Object obj, java.lang.Object obj2) {
        ((com.google.android.libraries.places.internal.zzbdq) obj).zzc = (com.google.android.libraries.places.internal.zzbfz) obj2;
    }

    @Override // com.google.android.libraries.places.internal.zzbfy
    final void zzj(java.lang.Object obj) {
        ((com.google.android.libraries.places.internal.zzbdq) obj).zzc.zzd();
    }

    @Override // com.google.android.libraries.places.internal.zzbfy
    final /* synthetic */ java.lang.Object zzf() {
        return com.google.android.libraries.places.internal.zzbfz.zzb();
    }

    zzbga() {
    }
}
