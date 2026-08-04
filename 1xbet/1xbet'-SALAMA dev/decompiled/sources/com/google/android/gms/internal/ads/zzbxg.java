package com.google.android.gms.internal.ads;

import I2.L;
import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
final class zzbxg extends zzbxn {
    final zzhep zza;
    final zzhep zzb;
    final zzhep zzc;
    final zzhep zzd;
    final zzhep zze;
    final zzhep zzf;
    final zzhep zzg;
    final zzhep zzh;
    private final p090m3.a zzj;

    public zzbxg(Context context, p090m3.a aVar, L l7, zzbxm zzbxmVar) {
        this.zzj = aVar;
        zzheg zzhegVarZza = zzheh.zza(context);
        this.zza = zzhegVarZza;
        zzheg zzhegVarZza2 = zzheh.zza(l7);
        this.zzb = zzhegVarZza2;
        this.zzc = zzhef.zzc(new zzbxa(zzhegVarZza, zzhegVarZza2));
        zzheg zzhegVarZza3 = zzheh.zza(aVar);
        this.zzd = zzhegVarZza3;
        zzheg zzhegVarZza4 = zzheh.zza(zzbxmVar);
        this.zze = zzhegVarZza4;
        zzhep zzhepVarZzc = zzhef.zzc(new zzbxc(zzhegVarZza3, zzhegVarZza2, zzhegVarZza4));
        this.zzf = zzhepVarZzc;
        zzbxe zzbxeVar = new zzbxe(zzhegVarZza3, zzhepVarZzc);
        this.zzg = zzbxeVar;
        this.zzh = zzhef.zzc(new zzbxs(zzhegVarZza, zzbxeVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbxn
    public final zzbxd zza() {
        return new zzbxd(this.zzj, (zzbxb) this.zzf.zzb());
    }
}
