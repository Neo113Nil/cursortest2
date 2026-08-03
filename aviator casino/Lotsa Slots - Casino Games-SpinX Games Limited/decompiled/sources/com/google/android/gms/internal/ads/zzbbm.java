package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzbbm implements com.google.android.gms.internal.ads.zzfza {
    private final com.google.android.gms.internal.ads.zzfxi zza;
    private final com.google.android.gms.internal.ads.zzfxw zzb;
    private final com.google.android.gms.internal.ads.zzbbz zzc;
    private final com.google.android.gms.internal.ads.zzbbl zzd;
    private final com.google.android.gms.internal.ads.zzbav zze;
    private final com.google.android.gms.internal.ads.zzbcb zzf;
    private final com.google.android.gms.internal.ads.zzbbt zzg;
    private final com.google.android.gms.internal.ads.zzbbk zzh;

    zzbbm(com.google.android.gms.internal.ads.zzfxi zzfxiVar, com.google.android.gms.internal.ads.zzfxw zzfxwVar, com.google.android.gms.internal.ads.zzbbz zzbbzVar, com.google.android.gms.internal.ads.zzbbl zzbblVar, com.google.android.gms.internal.ads.zzbav zzbavVar, com.google.android.gms.internal.ads.zzbcb zzbcbVar, com.google.android.gms.internal.ads.zzbbt zzbbtVar, com.google.android.gms.internal.ads.zzbbk zzbbkVar) {
        this.zza = zzfxiVar;
        this.zzb = zzfxwVar;
        this.zzc = zzbbzVar;
        this.zzd = zzbblVar;
        this.zze = zzbavVar;
        this.zzf = zzbcbVar;
        this.zzg = zzbbtVar;
        this.zzh = zzbbkVar;
    }

    private final java.util.Map zzf() {
        java.util.HashMap hashMap = new java.util.HashMap();
        com.google.android.gms.internal.ads.zzfxi zzfxiVar = this.zza;
        com.google.android.gms.internal.ads.zzaym zzb = this.zzb.zzb();
        hashMap.put("v", zzfxiVar.zza());
        hashMap.put("gms", java.lang.Boolean.valueOf(zzfxiVar.zzc()));
        hashMap.put("gv", java.lang.Long.valueOf(zzb.zzd()));
        hashMap.put("int", zzb.zzb());
        hashMap.put("attts", java.lang.Long.valueOf(zzb.zzh().zzb()));
        hashMap.put("att", zzb.zzh().zzd());
        hashMap.put("attkid", zzb.zzh().zzc());
        hashMap.put("up", java.lang.Boolean.valueOf(this.zzd.zza()));
        hashMap.put("t", new java.lang.Throwable());
        com.google.android.gms.internal.ads.zzbbt zzbbtVar = this.zzg;
        hashMap.put("tcq", java.lang.Long.valueOf(zzbbtVar.zze()));
        hashMap.put("tpq", java.lang.Long.valueOf(zzbbtVar.zzd()));
        hashMap.put("tcv", java.lang.Long.valueOf(zzbbtVar.zzf()));
        hashMap.put("tpv", java.lang.Long.valueOf(zzbbtVar.zzg()));
        hashMap.put("tchv", java.lang.Long.valueOf(zzbbtVar.zzi()));
        hashMap.put("tphv", java.lang.Long.valueOf(zzbbtVar.zzh()));
        hashMap.put("tcc", java.lang.Long.valueOf(zzbbtVar.zzj()));
        hashMap.put("tpc", java.lang.Long.valueOf(zzbbtVar.zzk()));
        com.google.android.gms.internal.ads.zzbav zzbavVar = this.zze;
        if (zzbavVar != null) {
            hashMap.put("nt", java.lang.Long.valueOf(zzbavVar.zzc()));
        }
        com.google.android.gms.internal.ads.zzbcb zzbcbVar = this.zzf;
        hashMap.put("vs", java.lang.Long.valueOf(zzbcbVar.zzc()));
        hashMap.put("vf", java.lang.Long.valueOf(zzbcbVar.zzd()));
        return hashMap;
    }

    final void zza(android.view.View view) {
        this.zzc.zza(view);
    }

    @Override // com.google.android.gms.internal.ads.zzfza
    public final java.util.Map zzb() {
        return zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzfza
    public final java.util.Map zzc() {
        java.util.Map zzf = zzf();
        zzf.put("vst", this.zzh.zzb());
        return zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzfza
    public final java.util.Map zzd() {
        com.google.android.gms.internal.ads.zzbbz zzbbzVar = this.zzc;
        java.util.Map zzf = zzf();
        zzf.put("lts", java.lang.Long.valueOf(zzbbzVar.zzc()));
        return zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzfza
    public final java.util.Map zze() {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("t", new java.lang.Throwable());
        return hashMap;
    }
}
