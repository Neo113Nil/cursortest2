package com.google.android.gms.internal.ads;

import I2.J;

/* JADX INFO: loaded from: classes.dex */
final class zzbmu implements zzbzj {
    final /* synthetic */ zzbmw zza;

    public zzbmu(zzbmw zzbmwVar) {
        this.zza = zzbmwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbzj
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        J.k("Releasing engine reference.");
        this.zza.zzb.zzd();
    }
}
