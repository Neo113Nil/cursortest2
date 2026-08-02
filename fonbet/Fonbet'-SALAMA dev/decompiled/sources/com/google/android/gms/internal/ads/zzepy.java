package com.google.android.gms.internal.ads;

import android.content.Intent;

/* loaded from: classes.dex */
public final class zzepy implements zzheg {
    private final zzhep zza;
    private final zzhep zzb;

    public zzepy(zzhep zzhepVar, zzhep zzhepVar2) {
        this.zza = zzhepVar;
        this.zzb = zzhepVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhev, com.google.android.gms.internal.ads.zzheu
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzepw zzb() {
        return new zzepw(((zzcgi) this.zza).zza(), (Intent) this.zzb.zzb());
    }
}
