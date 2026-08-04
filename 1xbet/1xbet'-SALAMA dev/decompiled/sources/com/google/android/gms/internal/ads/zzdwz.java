package com.google.android.gms.internal.ads;

import F2.C0254t;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class zzdwz implements zzdxb {
    private final Map zza;
    private final zzgbn zzb;
    private final zzcxl zzc;

    public zzdwz(Map map, zzgbn zzgbnVar, zzcxl zzcxlVar) {
        this.zza = map;
        this.zzb = zzgbnVar;
        this.zzc = zzcxlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdxb
    public final I3.b zzc(final zzbuo zzbuoVar) {
        this.zzc.zzdl(zzbuoVar);
        I3.b bVarZzg = zzgbc.zzg(new zzdus(3));
        for (String str : ((String) C0254t.f2723d.f2726c.zzb(zzbby.zzij)).split(",")) {
            final zzhev zzhevVar = (zzhev) this.zza.get(str.trim());
            if (zzhevVar != null) {
                bVarZzg = zzgbc.zzf(bVarZzg, zzdus.class, new zzgaj() { // from class: com.google.android.gms.internal.ads.zzdwx
                    @Override // com.google.android.gms.internal.ads.zzgaj
                    public final I3.b zza(Object obj) {
                        return ((zzdxb) zzhevVar.zzb()).zzc(zzbuoVar);
                    }
                }, this.zzb);
            }
        }
        zzgbc.zzr(bVarZzg, new zzdwy(this), zzbza.zzg);
        return bVarZzg;
    }
}
