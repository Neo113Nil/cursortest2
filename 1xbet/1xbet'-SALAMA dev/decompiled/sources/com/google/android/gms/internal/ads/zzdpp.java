package com.google.android.gms.internal.ads;

import F2.C0254t;
import android.content.Context;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class zzdpp implements zzheg {
    private final zzhep zza;
    private final zzhep zzb;
    private final zzhep zzc;

    public zzdpp(zzhep zzhepVar, zzhep zzhepVar2, zzhep zzhepVar3, zzhep zzhepVar4) {
        this.zza = zzhepVar;
        this.zzb = zzhepVar2;
        this.zzc = zzhepVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzhev, com.google.android.gms.internal.ads.zzheu
    public final Object zzb() {
        Set setEmptySet;
        final String strZza = ((zzeut) this.zza).zza();
        Context contextZza = ((zzcgi) this.zzb).zza();
        zzgbn zzgbnVarZzc = zzfdy.zzc();
        Map mapZzb = ((zzhek) this.zzc).zzb();
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzfe)).booleanValue()) {
            zzbaw zzbawVar = new zzbaw(new zzbbc(contextZza));
            zzbawVar.zzb(new zzbav() { // from class: com.google.android.gms.internal.ads.zzdpq
                @Override // com.google.android.gms.internal.ads.zzbav
                public final void zza(zzbbd.zzt.zza zzaVar) {
                    zzaVar.zzO(strZza);
                }
            });
            setEmptySet = Collections.singleton(new zzdch(new zzdps(zzbawVar, mapZzb), zzgbnVarZzc));
        } else {
            setEmptySet = Collections.emptySet();
        }
        zzheo.zzb(setEmptySet);
        return setEmptySet;
    }
}
