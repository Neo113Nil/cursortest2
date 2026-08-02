package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* loaded from: classes.dex */
public final class zzcum implements zzheg {
    private final zzhep zza;
    private final zzhep zzb;
    private final zzhep zzc;

    public zzcum(zzcul zzculVar, zzhep zzhepVar, zzhep zzhepVar2, zzhep zzhepVar3, zzhep zzhepVar4) {
        this.zza = zzhepVar;
        this.zzb = zzhepVar2;
        this.zzc = zzhepVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzhev, com.google.android.gms.internal.ads.zzheu
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context context = (Context) this.zza.zzb();
        VersionInfoParcel zza = ((zzcgw) this.zzb).zza();
        zzfaf zza2 = ((zzcqn) this.zzc).zza();
        zzbwu zzbwuVar = new zzbwu();
        zzbwv zzbwvVar = zza2.zzA;
        if (zzbwvVar == null) {
            return null;
        }
        zzfak zzfakVar = zza2.zzs;
        return new zzbwt(context, zza, zzbwvVar, zzfakVar == null ? null : zzfakVar.zzb, zzbwuVar);
    }
}
