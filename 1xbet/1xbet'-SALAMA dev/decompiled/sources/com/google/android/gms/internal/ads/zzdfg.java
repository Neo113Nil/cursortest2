package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class zzdfg implements zzcpz {
    private final Map zza;
    private final Map zzb;
    private final Map zzc;
    private final zzhev zzd;
    private final zzdhn zze;

    public zzdfg(Map map, Map map2, Map map3, zzhev zzhevVar, zzdhn zzdhnVar) {
        this.zza = map;
        this.zzb = map2;
        this.zzc = map3;
        this.zzd = zzhevVar;
        this.zze = zzdhnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcpz
    public final zzebr zza(int i7, String str) {
        zzebr zzebrVarZza;
        zzebr zzebrVar = (zzebr) this.zza.get(str);
        if (zzebrVar != null) {
            return zzebrVar;
        }
        if (i7 != 1) {
            if (i7 != 4) {
                return null;
            }
            zzeea zzeeaVar = (zzeea) this.zzc.get(str);
            if (zzeeaVar != null) {
                return new zzebs(zzeeaVar, new zzfsw() { // from class: com.google.android.gms.internal.ads.zzcqb
                    @Override // com.google.android.gms.internal.ads.zzfsw
                    public final Object apply(Object obj) {
                        return new zzcqe((List) obj);
                    }
                });
            }
            zzebrVarZza = (zzebr) this.zzb.get(str);
            if (zzebrVarZza == null) {
                return null;
            }
        } else if (this.zze.zze() == null || (zzebrVarZza = ((zzcpz) this.zzd.zzb()).zza(i7, str)) == null) {
            return null;
        }
        return new zzebs(zzebrVarZza, new zzfsw() { // from class: com.google.android.gms.internal.ads.zzcqc
            @Override // com.google.android.gms.internal.ads.zzfsw
            public final Object apply(Object obj) {
                return new zzcqe((zzcpw) obj);
            }
        });
    }
}
