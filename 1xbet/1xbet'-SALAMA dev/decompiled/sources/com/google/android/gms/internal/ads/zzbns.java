package com.google.android.gms.internal.ads;

import I2.J;

/* JADX INFO: loaded from: classes.dex */
final class zzbns implements zzbzh {
    final /* synthetic */ zzbzf zza;
    final /* synthetic */ zzbmw zzb;

    public zzbns(zzbnu zzbnuVar, zzbzf zzbzfVar, zzbmw zzbmwVar) {
        this.zza = zzbzfVar;
        this.zzb = zzbmwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbzh
    public final void zza() {
        J.k("callJs > getEngine: Promise rejected");
        this.zza.zzd(new zzbnf("Unable to obtain a JavascriptEngine."));
        this.zzb.zzb();
    }
}
