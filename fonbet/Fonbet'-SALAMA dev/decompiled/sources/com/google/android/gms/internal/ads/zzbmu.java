package com.google.android.gms.internal.ads;

import I2.J;

/* loaded from: classes.dex */
final class zzbmu implements zzbzj {
    final /* synthetic */ zzbmw zza;

    public zzbmu(zzbmw zzbmwVar) {
        this.zza = zzbmwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbzj
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        zzbnb zzbnbVar;
        J.k("Releasing engine reference.");
        zzbnbVar = this.zza.zzb;
        zzbnbVar.zzd();
    }
}
