package com.google.android.gms.internal.ads;

import E2.o;
import I2.C0306n;
import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* loaded from: classes.dex */
public final class zzddy implements zzheg {
    private final zzhep zza;
    private final zzhep zzb;
    private final zzhep zzc;
    private final zzhep zzd;

    public zzddy(zzddr zzddrVar, zzhep zzhepVar, zzhep zzhepVar2, zzhep zzhepVar3, zzhep zzhepVar4) {
        this.zza = zzhepVar;
        this.zzb = zzhepVar2;
        this.zzc = zzhepVar3;
        this.zzd = zzhepVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzhev, com.google.android.gms.internal.ads.zzheu
    public final /* bridge */ /* synthetic */ Object zzb() {
        final Context context = (Context) this.zza.zzb();
        final VersionInfoParcel zza = ((zzcgw) this.zzb).zza();
        final zzfaf zza2 = ((zzcqn) this.zzc).zza();
        final zzfba zza3 = ((zzcuh) this.zzd).zza();
        return new zzdch(new zzcwe() { // from class: com.google.android.gms.internal.ads.zzddp
            @Override // com.google.android.gms.internal.ads.zzcwe
            public final void zzs() {
                C0306n c0306n = o.f1952C.f1967n;
                Context context2 = context;
                zzfba zzfbaVar = zza3;
                c0306n.i(context2, zza.f10834a, zza2.zzC.toString(), zzfbaVar.zzf);
            }
        }, zzbza.zzg);
    }
}
