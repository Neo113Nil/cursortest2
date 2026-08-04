package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zzeou implements zzheg {
    private final zzhep zza;
    private final zzhep zzb;
    private final zzhep zzc;

    public zzeou(zzhep zzhepVar, zzhep zzhepVar2, zzhep zzhepVar3) {
        this.zza = zzhepVar;
        this.zzb = zzhepVar2;
        this.zzc = zzhepVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzhev, com.google.android.gms.internal.ads.zzheu
    public final /* bridge */ /* synthetic */ Object zzb() {
        Object objZzb = ((zzeqw) this.zza).zzb();
        zzemz zzemzVar = (zzemz) this.zzb.zzb();
        if (true == ((List) this.zzc.zzb()).contains("29")) {
            objZzb = zzemzVar;
        }
        zzheo.zzb(objZzb);
        return objZzb;
    }
}
