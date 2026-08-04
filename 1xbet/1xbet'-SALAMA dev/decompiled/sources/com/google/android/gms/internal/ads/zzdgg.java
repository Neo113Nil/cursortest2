package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class zzdgg implements zzheg {
    private final zzhep zza;
    private final zzhep zzb;

    public zzdgg(zzhep zzhepVar, zzhep zzhepVar2) {
        this.zza = zzhepVar;
        this.zzb = zzhepVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhev, com.google.android.gms.internal.ads.zzheu
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdcj((Context) this.zza.zzb(), new HashSet(), ((zzcqn) this.zzb).zza());
    }
}
