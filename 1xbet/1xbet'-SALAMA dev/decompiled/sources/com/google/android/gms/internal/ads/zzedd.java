package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class zzedd implements zzheg {
    private final zzhep zza;
    private final zzhep zzb;

    public zzedd(zzhep zzhepVar, zzhep zzhepVar2) {
        this.zza = zzhepVar;
        this.zzb = zzhepVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhev, com.google.android.gms.internal.ads.zzheu
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzedc zzb() {
        return new zzedc((Context) this.zza.zzb(), (zzcot) this.zzb.zzb());
    }
}
