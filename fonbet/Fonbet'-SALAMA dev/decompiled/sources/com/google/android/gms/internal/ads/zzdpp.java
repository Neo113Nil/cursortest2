package com.google.android.gms.internal.ads;

import F2.C0254t;
import android.content.Context;
import com.google.android.gms.internal.ads.zzbbd;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
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
        Set emptySet;
        final String zza = ((zzeut) this.zza).zza();
        Context zza2 = ((zzcgi) this.zzb).zza();
        zzgbn zzc = zzfdy.zzc();
        Map zzb = ((zzhek) this.zzc).zzb();
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzfe)).booleanValue()) {
            zzbaw zzbawVar = new zzbaw(new zzbbc(zza2));
            zzbawVar.zzb(new zzbav() { // from class: com.google.android.gms.internal.ads.zzdpq
                @Override // com.google.android.gms.internal.ads.zzbav
                public final void zza(zzbbd.zzt.zza zzaVar) {
                    zzaVar.zzO(zza);
                }
            });
            emptySet = Collections.singleton(new zzdch(new zzdps(zzbawVar, zzb), zzc));
        } else {
            emptySet = Collections.emptySet();
        }
        zzheo.zzb(emptySet);
        return emptySet;
    }
}
