package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class zzded implements zzheg {
    private final zzddr zza;
    private final zzhep zzb;

    public zzded(zzddr zzddrVar, zzhep zzhepVar) {
        this.zza = zzddrVar;
        this.zzb = zzhepVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhev, com.google.android.gms.internal.ads.zzheu
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setZzf = this.zza.zzf((zzctl) this.zzb.zzb());
        zzheo.zzb(setZzf);
        return setZzf;
    }
}
