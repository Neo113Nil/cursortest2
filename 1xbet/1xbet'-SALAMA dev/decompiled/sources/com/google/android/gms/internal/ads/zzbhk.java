package com.google.android.gms.internal.ads;

import B2.g;
import B2.h;

/* JADX INFO: loaded from: classes.dex */
public final class zzbhk {
    private final h zza;
    private final g zzb;
    private zzbge zzc;

    public zzbhk(h hVar, g gVar) {
        this.zza = hVar;
        this.zzb = gVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized zzbge zzf(zzbgd zzbgdVar) {
        zzbge zzbgeVar = this.zzc;
        if (zzbgeVar != null) {
            return zzbgeVar;
        }
        zzbge zzbgeVar2 = new zzbge(zzbgdVar);
        this.zzc = zzbgeVar2;
        return zzbgeVar2;
    }

    public final zzbgn zzc() {
        zzbhj zzbhjVar = null;
        if (this.zzb == null) {
            return null;
        }
        return new zzbhh(this, zzbhjVar);
    }

    public final zzbgq zzd() {
        return new zzbhi(this, null);
    }
}
