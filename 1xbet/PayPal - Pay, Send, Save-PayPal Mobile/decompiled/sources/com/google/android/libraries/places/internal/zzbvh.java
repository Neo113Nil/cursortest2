package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbvh implements java.lang.Runnable {
    final /* synthetic */ com.google.android.libraries.places.internal.zzbvk zza;
    final /* synthetic */ com.google.android.libraries.places.internal.zzbvl zzb;

    zzbvh(com.google.android.libraries.places.internal.zzbvl zzbvlVar, com.google.android.libraries.places.internal.zzbvk zzbvkVar) {
        this.zza = zzbvkVar;
        java.util.Objects.requireNonNull(zzbvlVar);
        this.zzb = zzbvlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.libraries.places.internal.zzbkq zzbkqVar;
        com.google.android.libraries.places.internal.zzbvl zzbvlVar = this.zzb;
        java.lang.Object obj = zzbvlVar.zzf().get();
        zzbkqVar = com.google.android.libraries.places.internal.zzbvr.zzh;
        if (obj != zzbkqVar) {
            this.zza.zzl();
            return;
        }
        com.google.android.libraries.places.internal.zzbvr zzbvrVar = zzbvlVar.zza;
        if (zzbvrVar.zzI() == null) {
            zzbvrVar.zzJ(new java.util.LinkedHashSet());
            zzbvrVar.zzf.zza(zzbvrVar.zzK(), true);
        }
        zzbvrVar.zzI().add(this.zza);
    }
}
