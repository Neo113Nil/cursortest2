package com.google.android.gms.internal.ads;

import J2.o;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zzdct {
    private final List zza;
    private final zzfia zzb;
    private final o zzc;
    private boolean zzd;

    public zzdct(zzfaf zzfafVar, zzfia zzfiaVar) {
        this.zza = zzfafVar.zzp;
        this.zzb = zzfiaVar;
        this.zzc = zzfafVar.zzax;
    }

    public final void zza() {
        if (this.zzd) {
            return;
        }
        this.zzb.zze(this.zza, this.zzc);
        this.zzd = true;
    }
}
