package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbxx implements java.lang.Runnable {
    final /* synthetic */ com.google.android.libraries.places.internal.zzbxy zza;

    zzbxx(com.google.android.libraries.places.internal.zzbxy zzbxyVar) {
        java.util.Objects.requireNonNull(zzbxyVar);
        this.zza = zzbxyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.libraries.places.internal.zzbzf zzbzfVar = this.zza.zzf;
        zzbzfVar.zzae(true);
        com.google.android.libraries.places.internal.zzbys zzV = zzbzfVar.zzV();
        com.google.android.libraries.places.internal.zzbys zzV2 = zzbzfVar.zzV();
        zzbzfVar.zzY().zzc(zzbzfVar.zzV().zza(), zzV2.zzb(), zzV.zzc());
    }
}
