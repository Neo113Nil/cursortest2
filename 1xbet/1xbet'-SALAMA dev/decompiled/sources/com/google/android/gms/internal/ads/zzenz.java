package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zzenz implements zzheg {
    private final zzhep zza;
    private final zzhep zzb;
    private final zzhep zzc;

    public zzenz(zzhep zzhepVar, zzhep zzhepVar2, zzhep zzhepVar3) {
        this.zza = zzhepVar;
        this.zzb = zzhepVar2;
        this.zzc = zzhepVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzhev, com.google.android.gms.internal.ads.zzheu
    public final /* bridge */ /* synthetic */ Object zzb() {
        Object objZzb = ((zzekd) this.zza).zzb();
        zzemz zzemzVar = (zzemz) this.zzb.zzb();
        if (true == ((List) this.zzc.zzb()).contains("2")) {
            objZzb = zzemzVar;
        }
        zzheo.zzb(objZzb);
        return objZzb;
    }
}
