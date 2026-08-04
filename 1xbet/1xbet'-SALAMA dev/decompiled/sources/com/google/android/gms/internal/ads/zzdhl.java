package com.google.android.gms.internal.ads;

import p122r.l;

/* JADX INFO: loaded from: classes.dex */
public final class zzdhl {
    zzbgk zza;
    zzbgh zzb;
    zzbgx zzc;
    zzbgu zzd;
    zzbls zze;
    final l zzf = new l();
    final l zzg = new l();

    public final zzdhl zza(zzbgh zzbghVar) {
        this.zzb = zzbghVar;
        return this;
    }

    public final zzdhl zzb(zzbgk zzbgkVar) {
        this.zza = zzbgkVar;
        return this;
    }

    public final zzdhl zzc(String str, zzbgq zzbgqVar, zzbgn zzbgnVar) {
        this.zzf.put(str, zzbgqVar);
        if (zzbgnVar != null) {
            this.zzg.put(str, zzbgnVar);
        }
        return this;
    }

    public final zzdhl zzd(zzbls zzblsVar) {
        this.zze = zzblsVar;
        return this;
    }

    public final zzdhl zze(zzbgu zzbguVar) {
        this.zzd = zzbguVar;
        return this;
    }

    public final zzdhl zzf(zzbgx zzbgxVar) {
        this.zzc = zzbgxVar;
        return this;
    }

    public final zzdhn zzg() {
        return new zzdhn(this);
    }
}
