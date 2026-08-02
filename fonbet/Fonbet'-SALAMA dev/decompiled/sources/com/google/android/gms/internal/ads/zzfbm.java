package com.google.android.gms.internal.ads;

import F2.C0252s;
import F2.C0254t;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class zzfbm {
    private final zzfaf zza;
    private final zzfai zzb;
    private final zzfia zzc;
    private final zzfhr zzd;
    private final zzffy zze;
    private final zzcln zzf;

    public zzfbm(zzfia zzfiaVar, zzfhr zzfhrVar, zzfaf zzfafVar, zzfai zzfaiVar, zzcln zzclnVar, zzffy zzffyVar) {
        this.zza = zzfafVar;
        this.zzb = zzfaiVar;
        this.zzc = zzfiaVar;
        this.zzd = zzfhrVar;
        this.zzf = zzclnVar;
        this.zze = zzffyVar;
    }

    public final void zza(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzb((String) it.next(), 2);
        }
    }

    public final void zzb(String str, int i7) {
        zzfaf zzfafVar = this.zza;
        if (zzfafVar.zzai) {
            this.zzd.zza(str, this.zzb.zzb, i7);
            return;
        }
        this.zzc.zzd(str, zzfafVar.zzax, this.zze);
    }

    public final void zzc(List list, int i7) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            zzgbc.zzr((((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzka)).booleanValue() && zzcln.zzj(str)) ? this.zzf.zze(str, C0252s.f2717f.f2722e) : zzgbc.zzh(str), new zzfbl(this, i7), zzbza.zza);
        }
    }
}
