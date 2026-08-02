package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzcsw implements zzheg {
    private final zzhep zza;
    private final zzhep zzb;

    public zzcsw(zzhep zzhepVar, zzhep zzhepVar2) {
        this.zza = zzhepVar;
        this.zzb = zzhepVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhev, com.google.android.gms.internal.ads.zzheu
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdch((zzcyz) this.zza.zzb(), (Executor) this.zzb.zzb());
    }
}
