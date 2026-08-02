package com.google.android.gms.internal.ads;

import I2.J;
import J2.j;
import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class zzfbi implements zzbiz {
    public final /* synthetic */ zzdcp zza;
    public final /* synthetic */ zzcln zzb;
    public final /* synthetic */ zzfia zzc;
    public final /* synthetic */ zzeaf zzd;

    public /* synthetic */ zzfbi(zzdcp zzdcpVar, zzcln zzclnVar, zzfia zzfiaVar, zzeaf zzeafVar) {
        this.zza = zzdcpVar;
        this.zzb = zzclnVar;
        this.zzc = zzfiaVar;
        this.zzd = zzeafVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbiz
    public final void zza(Object obj, Map map) {
        zzceb zzcebVar = (zzceb) obj;
        zzbiy.zzc(map, this.zza);
        String str = (String) map.get("u");
        if (str == null) {
            int i7 = J.f3546b;
            j.g("URL missing from click GMSG.");
        } else {
            zzeaf zzeafVar = this.zzd;
            zzfia zzfiaVar = this.zzc;
            zzgbc.zzr(zzbiy.zza(zzcebVar, str), new zzfbk(zzcebVar, this.zzb, zzfiaVar, zzeafVar), zzbza.zza);
        }
    }
}
