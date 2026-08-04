package com.google.android.gms.internal.ads;

import J2.n;
import Q2.c;
import Q2.d;
import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* JADX INFO: loaded from: classes.dex */
public final class zzdra implements zzheg {
    private final zzhep zza;
    private final zzhep zzb;
    private final zzhep zzc;
    private final zzhep zzd;

    public zzdra(zzhep zzhepVar, zzhep zzhepVar2, zzhep zzhepVar3, zzhep zzhepVar4, zzhep zzhepVar5) {
        this.zza = zzhepVar2;
        this.zzb = zzhepVar3;
        this.zzc = zzhepVar4;
        this.zzd = zzhepVar5;
    }

    @Override // com.google.android.gms.internal.ads.zzhev, com.google.android.gms.internal.ads.zzheu
    public final Object zzb() {
        zzgbn zzgbnVarZzc = zzfdy.zzc();
        n nVar = (n) this.zza.zzb();
        Q2.b bVar = (Q2.b) this.zzb;
        Q2.a aVar = new Q2.a((Context) bVar.f5795a.zzb(), (VersionInfoParcel) bVar.f5796b.zzb());
        ((d) this.zzc).getClass();
        return new zzdqv(zzgbnVarZzc, nVar, aVar, new c(), ((zzcgi) this.zzd).zza());
    }
}
