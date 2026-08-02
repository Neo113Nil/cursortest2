package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbyy implements java.lang.Runnable {
    final /* synthetic */ com.google.android.libraries.places.internal.zzbzc zza;

    zzbyy(com.google.android.libraries.places.internal.zzbzc zzbzcVar) {
        java.util.Objects.requireNonNull(zzbzcVar);
        this.zza = zzbzcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.libraries.places.internal.zzbzf zzbzfVar = this.zza.zzb;
        zzbzfVar.zzae(true);
        com.google.android.libraries.places.internal.zzbys zzV = zzbzfVar.zzV();
        com.google.android.libraries.places.internal.zzbys zzV2 = zzbzfVar.zzV();
        zzbzfVar.zzY().zzc(zzbzfVar.zzV().zza(), zzV2.zzb(), zzV.zzc());
    }
}
