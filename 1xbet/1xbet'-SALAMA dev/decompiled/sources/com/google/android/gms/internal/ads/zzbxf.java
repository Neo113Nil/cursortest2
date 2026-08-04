package com.google.android.gms.internal.ads;

import I2.L;
import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
final class zzbxf {
    private Context zza;
    private p090m3.a zzb;
    private L zzc;
    private zzbxm zzd;

    private zzbxf() {
        throw null;
    }

    public final zzbxf zza(L l7) {
        this.zzc = l7;
        return this;
    }

    public final zzbxf zzb(Context context) {
        context.getClass();
        this.zza = context;
        return this;
    }

    public final zzbxf zzc(p090m3.a aVar) {
        aVar.getClass();
        this.zzb = aVar;
        return this;
    }

    public final zzbxf zzd(zzbxm zzbxmVar) {
        this.zzd = zzbxmVar;
        return this;
    }

    public final zzbxn zze() {
        zzheo.zzc(this.zza, Context.class);
        zzheo.zzc(this.zzb, p090m3.a.class);
        zzheo.zzc(this.zzc, L.class);
        zzheo.zzc(this.zzd, zzbxm.class);
        return new zzbxg(this.zza, this.zzb, this.zzc, this.zzd);
    }

    public /* synthetic */ zzbxf(zzbxh zzbxhVar) {
    }
}
