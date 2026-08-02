package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzcph implements zzheg {
    private final zzhep zza;
    private final zzhep zzb;

    public zzcph(zzhep zzhepVar, zzhep zzhepVar2) {
        this.zza = zzhepVar;
        this.zzb = zzhepVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhev, com.google.android.gms.internal.ads.zzheu
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzcpg zzb() {
        return new zzcpg(((zzcom) this.zza).zza(), (Executor) this.zzb.zzb());
    }
}
