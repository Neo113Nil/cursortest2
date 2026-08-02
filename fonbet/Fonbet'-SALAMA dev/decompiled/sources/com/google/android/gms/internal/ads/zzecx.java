package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzecx implements zzheg {
    private final zzhep zza;
    private final zzhep zzb;
    private final zzhep zzc;

    public zzecx(zzhep zzhepVar, zzhep zzhepVar2, zzhep zzhepVar3) {
        this.zza = zzhepVar;
        this.zzb = zzhepVar2;
        this.zzc = zzhepVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzhev, com.google.android.gms.internal.ads.zzheu
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzecw((Context) this.zza.zzb(), (zzcot) this.zzb.zzb(), (Executor) this.zzc.zzb());
    }
}
