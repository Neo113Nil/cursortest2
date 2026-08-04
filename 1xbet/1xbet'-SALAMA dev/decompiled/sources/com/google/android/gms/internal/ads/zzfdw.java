package com.google.android.gms.internal.ads;

import F2.C0254t;

/* JADX INFO: loaded from: classes.dex */
public final class zzfdw implements zzheg {
    public static zzfdw zza() {
        return zzfdv.zza;
    }

    public static zzgbn zzc() {
        zzgbn zzgbnVar;
        zzbbp zzbbpVar = zzbby.zzfK;
        C0254t c0254t = C0254t.f2723d;
        if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
            zzgbnVar = zzbza.zzc;
        } else {
            zzgbnVar = ((Boolean) c0254t.f2726c.zzb(zzbby.zzfJ)).booleanValue() ? zzbza.zza : zzbza.zzf;
        }
        zzheo.zzb(zzgbnVar);
        return zzgbnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhev, com.google.android.gms.internal.ads.zzheu
    public final /* synthetic */ Object zzb() {
        return zzc();
    }
}
