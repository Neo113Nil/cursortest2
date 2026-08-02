package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;

/* loaded from: classes.dex */
public final class zzeqn implements zzheg {
    private final zzhep zza;
    private final zzhep zzb;
    private final zzhep zzc;

    public zzeqn(zzhep zzhepVar, zzhep zzhepVar2, zzhep zzhepVar3, zzhep zzhepVar4) {
        this.zza = zzhepVar2;
        this.zzb = zzhepVar3;
        this.zzc = zzhepVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzhev, com.google.android.gms.internal.ads.zzheu
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzeql(zzfdy.zzc(), ((zzcuh) this.zza).zza(), (PackageInfo) this.zzb.zzb(), ((zzcgf) this.zzc).zzb());
    }
}
