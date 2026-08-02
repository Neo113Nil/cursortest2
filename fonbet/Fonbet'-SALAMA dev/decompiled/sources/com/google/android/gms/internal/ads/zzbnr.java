package com.google.android.gms.internal.ads;

import I2.J;

/* loaded from: classes.dex */
final class zzbnr implements zzbzj {
    final /* synthetic */ zzbmw zza;
    final /* synthetic */ Object zzb;
    final /* synthetic */ zzbzf zzc;
    final /* synthetic */ zzbnu zzd;

    public zzbnr(zzbnu zzbnuVar, zzbmw zzbmwVar, Object obj, zzbzf zzbzfVar) {
        this.zza = zzbmwVar;
        this.zzb = obj;
        this.zzc = zzbzfVar;
        this.zzd = zzbnuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbzj
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        J.k("callJs > getEngine: Promise fulfilled");
        Object obj2 = this.zzb;
        zzbzf zzbzfVar = this.zzc;
        zzbnu.zzd(this.zzd, this.zza, (zzbnd) obj, obj2, zzbzfVar);
    }
}
