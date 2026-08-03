package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
final class zzigv extends com.google.android.gms.internal.ads.zzigt {
    zzigv() {
    }

    @Override // com.google.android.gms.internal.ads.zzigt
    final /* bridge */ /* synthetic */ void zza(java.lang.Object obj, int i, long j) {
        ((com.google.android.gms.internal.ads.zzigu) obj).zzk(i << 3, java.lang.Long.valueOf(j));
    }

    @Override // com.google.android.gms.internal.ads.zzigt
    final /* bridge */ /* synthetic */ void zzb(java.lang.Object obj, int i, int i2) {
        ((com.google.android.gms.internal.ads.zzigu) obj).zzk((i << 3) | 5, java.lang.Integer.valueOf(i2));
    }

    @Override // com.google.android.gms.internal.ads.zzigt
    final /* bridge */ /* synthetic */ void zzc(java.lang.Object obj, int i, long j) {
        ((com.google.android.gms.internal.ads.zzigu) obj).zzk((i << 3) | 1, java.lang.Long.valueOf(j));
    }

    @Override // com.google.android.gms.internal.ads.zzigt
    final /* bridge */ /* synthetic */ void zzd(java.lang.Object obj, int i, com.google.android.gms.internal.ads.zzida zzidaVar) {
        ((com.google.android.gms.internal.ads.zzigu) obj).zzk((i << 3) | 2, zzidaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzigt
    final /* bridge */ /* synthetic */ void zze(java.lang.Object obj, int i, java.lang.Object obj2) {
        ((com.google.android.gms.internal.ads.zzigu) obj).zzk((i << 3) | 3, (com.google.android.gms.internal.ads.zzigu) obj2);
    }

    @Override // com.google.android.gms.internal.ads.zzigt
    final /* synthetic */ java.lang.Object zzf() {
        return com.google.android.gms.internal.ads.zzigu.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzigt
    final /* synthetic */ java.lang.Object zzg(java.lang.Object obj) {
        com.google.android.gms.internal.ads.zzigu zziguVar = (com.google.android.gms.internal.ads.zzigu) obj;
        zziguVar.zzd();
        return zziguVar;
    }

    @Override // com.google.android.gms.internal.ads.zzigt
    final /* bridge */ /* synthetic */ java.lang.Object zzh(java.lang.Object obj) {
        com.google.android.gms.internal.ads.zziee zzieeVar = (com.google.android.gms.internal.ads.zziee) obj;
        com.google.android.gms.internal.ads.zzigu zziguVar = zzieeVar.zzt;
        if (zziguVar != com.google.android.gms.internal.ads.zzigu.zza()) {
            return zziguVar;
        }
        com.google.android.gms.internal.ads.zzigu zzb = com.google.android.gms.internal.ads.zzigu.zzb();
        zzieeVar.zzt = zzb;
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzigt
    final /* synthetic */ void zzi(java.lang.Object obj, java.lang.Object obj2) {
        ((com.google.android.gms.internal.ads.zziee) obj).zzt = (com.google.android.gms.internal.ads.zzigu) obj2;
    }

    @Override // com.google.android.gms.internal.ads.zzigt
    final void zzj(java.lang.Object obj) {
        ((com.google.android.gms.internal.ads.zziee) obj).zzt.zzd();
    }
}
