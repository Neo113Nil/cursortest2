package com.google.android.gms.internal.ads;

import E2.o;
import I2.C0306n;
import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* JADX INFO: loaded from: classes.dex */
public final class zzcoe implements zzheg {
    private final zzcnw zza;
    private final zzhep zzb;
    private final zzhep zzc;
    private final zzhep zzd;
    private final zzhep zze;

    public zzcoe(zzcnw zzcnwVar, zzhep zzhepVar, zzhep zzhepVar2, zzhep zzhepVar3, zzhep zzhepVar4) {
        this.zza = zzcnwVar;
        this.zzb = zzhepVar;
        this.zzc = zzhepVar2;
        this.zzd = zzhepVar3;
        this.zze = zzhepVar4;
    }

    public static zzdch zza(zzcnw zzcnwVar, final Context context, final VersionInfoParcel versionInfoParcel, final zzfaf zzfafVar, final zzfba zzfbaVar) {
        return new zzdch(new zzcwe() { // from class: com.google.android.gms.internal.ads.zzcnu
            @Override // com.google.android.gms.internal.ads.zzcwe
            public final void zzs() {
                C0306n c0306n = o.f1952C.f1967n;
                Context context2 = context;
                zzfba zzfbaVar2 = zzfbaVar;
                c0306n.i(context2, versionInfoParcel.f10834a, zzfafVar.zzC.toString(), zzfbaVar2.zzf);
            }
        }, zzbza.zzg);
    }

    @Override // com.google.android.gms.internal.ads.zzhev, com.google.android.gms.internal.ads.zzheu
    public final /* bridge */ /* synthetic */ Object zzb() {
        return zza(this.zza, (Context) this.zzb.zzb(), ((zzcgw) this.zzc).zza(), ((zzcqn) this.zzd).zza(), ((zzcuh) this.zze).zza());
    }
}
