package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
final class zzbvd implements java.lang.Runnable {
    final /* synthetic */ com.google.android.libraries.places.internal.zzbvl zza;

    zzbvd(com.google.android.libraries.places.internal.zzbvl zzbvlVar) {
        java.util.Objects.requireNonNull(zzbvlVar);
        this.zza = zzbvlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.libraries.places.internal.zzbkq zzbkqVar;
        com.google.android.libraries.places.internal.zzbvl zzbvlVar = this.zza;
        com.google.android.libraries.places.internal.zzbvr zzbvrVar = zzbvlVar.zza;
        if (zzbvrVar.zzI() == null) {
            java.lang.Object obj = zzbvlVar.zzf().get();
            zzbkqVar = com.google.android.libraries.places.internal.zzbvr.zzh;
            if (obj == zzbkqVar) {
                zzbvlVar.zzf().set(null);
            }
            zzbvrVar.zzM().zza(com.google.android.libraries.places.internal.zzbvr.zzc);
        }
    }
}
