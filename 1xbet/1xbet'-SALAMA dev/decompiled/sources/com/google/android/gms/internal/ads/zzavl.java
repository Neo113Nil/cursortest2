package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
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
        HashMap map = new HashMap();
        zzfme zzfmeVar = this.zza;
        zzasm zzasmVarZzb = this.zzb.zzb();
        map.put("v", zzfmeVar.zzd());
        map.put("gms", Boolean.valueOf(this.zza.zzg()));
        map.put("int", zzasmVarZzb.zzg());
        map.put("attts", Long.valueOf(zzasmVarZzb.zzf().zza()));
        map.put("att", zzasmVarZzb.zzf().zzd());
        map.put("attkid", zzasmVarZzb.zzf().zzf());
        map.put("up", Boolean.valueOf(this.zzd.zza()));
        map.put("t", new Throwable());
        zzavs zzavsVar = this.zzg;
        if (zzavsVar != null) {
            map.put("tcq", Long.valueOf(zzavsVar.zzc()));
            map.put("tpq", Long.valueOf(this.zzg.zzg()));
            map.put("tcv", Long.valueOf(this.zzg.zzd()));
            map.put("tpv", Long.valueOf(this.zzg.zzh()));
            map.put("tchv", Long.valueOf(this.zzg.zzb()));
            map.put("tphv", Long.valueOf(this.zzg.zzf()));
            map.put("tcc", Long.valueOf(this.zzg.zza()));
            map.put("tpc", Long.valueOf(this.zzg.zze()));
            zzauu zzauuVar = this.zze;
            if (zzauuVar != null) {
                map.put("nt", Long.valueOf(zzauuVar.zza()));
            }
            zzawa zzawaVar = this.zzf;
            if (zzawaVar != null) {
                map.put("vs", Long.valueOf(zzawaVar.zzc()));
                map.put("vf", Long.valueOf(this.zzf.zzb()));
            }
        }
        return map;
    }

    @Override // com.google.android.gms.internal.ads.zzfnz
    public final Map zza() {
        zzavy zzavyVar = this.zzc;
        Map mapZze = zze();
        mapZze.put("lts", Long.valueOf(zzavyVar.zza()));
        return mapZze;
    }

    @Override // com.google.android.gms.internal.ads.zzfnz
    public final Map zzb() {
        return zze();
    }

    @Override // com.google.android.gms.internal.ads.zzfnz
    public final Map zzc() {
        zzavj zzavjVar = this.zzh;
        Map mapZze = zze();
        if (zzavjVar != null) {
            mapZze.put("vst", zzavjVar.zza());
        }
        return mapZze;
    }

    public final void zzd(View view) {
        this.zzc.zzd(view);
    }
}
