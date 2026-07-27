package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public class zzhnc implements zzhet {
    final String zza;
    final Class zzb;
    final int zzc;

    zzhnc(String str, Class cls, int i, zzihe zziheVar) {
        this.zza = str;
        this.zzb = cls;
        this.zzc = i;
    }

    public static zzhfk zze(String str, Class cls, zzihe zziheVar) {
        return new zzhnb(str, cls, zziheVar);
    }

    public static zzhet zzf(String str, Class cls, int i, zzihe zziheVar) {
        return new zzhnc(str, cls, i, zziheVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhet
    public final Object zza(zziei zzieiVar) throws GeneralSecurityException {
        return zzhnt.zza().zzd(zzhnw.zza().zzg(zzhos.zza(this.zza, zzieiVar, zzhor.zzc(this.zzc), zzhor.zzd(5), null), zzheq.zza()), this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzhet
    public final String zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhet
    public final Class zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhet
    public final zzhtt zzd(zziei zzieiVar) throws GeneralSecurityException {
        zzhtv zzd = zzhtw.zzd();
        zzd.zza(this.zza);
        zzd.zzb(zzieiVar);
        zzd.zzc(5);
        zzhos zzhosVar = (zzhos) zzhnw.zza().zzh(zzhnn.zza().zzc(zzhnw.zza().zzj(zzhot.zzb((zzhtw) zzd.zzbu())), null), zzhos.class, zzheq.zza());
        zzhts zzc = zzhtt.zzc();
        zzc.zza(zzhosVar.zzg());
        zzc.zzb(zzhosVar.zzb());
        zzc.zzc(zzhor.zzb(zzhosVar.zzc()));
        return (zzhtt) zzc.zzbu();
    }
}
