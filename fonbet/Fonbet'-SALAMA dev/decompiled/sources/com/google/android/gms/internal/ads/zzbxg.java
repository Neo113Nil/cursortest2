package com.google.android.gms.internal.ads;

import I2.L;
import android.content.Context;
import m3.InterfaceC1436a;

/* loaded from: classes.dex */
final class zzbxg extends zzbxn {
    final zzhep zza;
    final zzhep zzb;
    final zzhep zzc;
    final zzhep zzd;
    final zzhep zze;
    final zzhep zzf;
    final zzhep zzg;
    final zzhep zzh;
    private final InterfaceC1436a zzj;

    public zzbxg(Context context, InterfaceC1436a interfaceC1436a, L l7, zzbxm zzbxmVar) {
        this.zzj = interfaceC1436a;
        zzheg zza = zzheh.zza(context);
        this.zza = zza;
        zzheg zza2 = zzheh.zza(l7);
        this.zzb = zza2;
        this.zzc = zzhef.zzc(new zzbxa(zza, zza2));
        zzheg zza3 = zzheh.zza(interfaceC1436a);
        this.zzd = zza3;
        zzheg zza4 = zzheh.zza(zzbxmVar);
        this.zze = zza4;
        zzhep zzc = zzhef.zzc(new zzbxc(zza3, zza2, zza4));
        this.zzf = zzc;
        zzbxe zzbxeVar = new zzbxe(zza3, zzc);
        this.zzg = zzbxeVar;
        this.zzh = zzhef.zzc(new zzbxs(zza, zzbxeVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbxn
    public final zzbxd zza() {
        return new zzbxd(this.zzj, (zzbxb) this.zzf.zzb());
    }
}
