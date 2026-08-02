package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzdek implements zzheg {
    private final zzddr zza;
    private final zzhep zzb;

    public zzdek(zzddr zzddrVar, zzhep zzhepVar) {
        this.zza = zzddrVar;
        this.zzb = zzhepVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhev, com.google.android.gms.internal.ads.zzheu
    public final /* bridge */ /* synthetic */ Object zzb() {
        return this.zza.zzd((Executor) this.zzb.zzb());
    }
}
