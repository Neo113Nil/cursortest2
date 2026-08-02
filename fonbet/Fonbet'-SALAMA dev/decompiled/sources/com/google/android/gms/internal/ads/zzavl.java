package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
final class zzavl implements zzfnz {
    private final zzfme zza;
    private final zzfmt zzb;
    private final zzavy zzc;
    private final zzavk zzd;
    private final zzauu zze;
    private final zzawa zzf;
    private final zzavs zzg;
    private final zzavj zzh;

    public zzavl(zzfme zzfmeVar, zzfmt zzfmtVar, zzavy zzavyVar, zzavk zzavkVar, zzauu zzauuVar, zzawa zzawaVar, zzavs zzavsVar, zzavj zzavjVar) {
        this.zza = zzfmeVar;
        this.zzb = zzfmtVar;
        this.zzc = zzavyVar;
        this.zzd = zzavkVar;
        this.zze = zzauuVar;
        this.zzf = zzawaVar;
        this.zzg = zzavsVar;
        this.zzh = zzavjVar;
    }

    private final Map zze() {
        HashMap hashMap = new HashMap();
        zzfme zzfmeVar = this.zza;
        zzasm zzb = this.zzb.zzb();
        hashMap.put("v", zzfmeVar.zzd());
        hashMap.put("gms", Boolean.valueOf(this.zza.zzg()));
        hashMap.put("int", zzb.zzg());
        hashMap.put("attts", Long.valueOf(zzb.zzf().zza()));
        hashMap.put("att", zzb.zzf().zzd());
        hashMap.put("attkid", zzb.zzf().zzf());
        hashMap.put("up", Boolean.valueOf(this.zzd.zza()));
        hashMap.put("t", new Throwable());
        zzavs zzavsVar = this.zzg;
        if (zzavsVar != null) {
            hashMap.put("tcq", Long.valueOf(zzavsVar.zzc()));
            hashMap.put("tpq", Long.valueOf(this.zzg.zzg()));
            hashMap.put("tcv", Long.valueOf(this.zzg.zzd()));
            hashMap.put("tpv", Long.valueOf(this.zzg.zzh()));
            hashMap.put("tchv", Long.valueOf(this.zzg.zzb()));
            hashMap.put("tphv", Long.valueOf(this.zzg.zzf()));
            hashMap.put("tcc", Long.valueOf(this.zzg.zza()));
            hashMap.put("tpc", Long.valueOf(this.zzg.zze()));
            zzauu zzauuVar = this.zze;
            if (zzauuVar != null) {
                hashMap.put("nt", Long.valueOf(zzauuVar.zza()));
            }
            zzawa zzawaVar = this.zzf;
            if (zzawaVar != null) {
                hashMap.put("vs", Long.valueOf(zzawaVar.zzc()));
                hashMap.put("vf", Long.valueOf(this.zzf.zzb()));
            }
        }
        return hashMap;
    }

    @Override // com.google.android.gms.internal.ads.zzfnz
    public final Map zza() {
        zzavy zzavyVar = this.zzc;
        Map zze = zze();
        zze.put("lts", Long.valueOf(zzavyVar.zza()));
        return zze;
    }

    @Override // com.google.android.gms.internal.ads.zzfnz
    public final Map zzb() {
        return zze();
    }

    @Override // com.google.android.gms.internal.ads.zzfnz
    public final Map zzc() {
        zzavj zzavjVar = this.zzh;
        Map zze = zze();
        if (zzavjVar != null) {
            zze.put("vst", zzavjVar.zza());
        }
        return zze;
    }

    public final void zzd(View view) {
        this.zzc.zzd(view);
    }
}
