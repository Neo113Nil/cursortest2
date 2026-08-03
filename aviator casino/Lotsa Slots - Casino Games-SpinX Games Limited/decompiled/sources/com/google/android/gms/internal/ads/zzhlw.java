package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public class zzhlw implements com.google.android.gms.internal.ads.zzhdr {
    final java.lang.String zza;
    final java.lang.Class zzb;
    final com.google.android.gms.internal.ads.zzhsp zzc;

    zzhlw(java.lang.String str, java.lang.Class cls, com.google.android.gms.internal.ads.zzhsp zzhspVar, com.google.android.gms.internal.ads.zzifx zzifxVar) {
        this.zza = str;
        this.zzb = cls;
        this.zzc = zzhspVar;
    }

    public static com.google.android.gms.internal.ads.zzhdr zze(java.lang.String str, java.lang.Class cls, com.google.android.gms.internal.ads.zzhsp zzhspVar, com.google.android.gms.internal.ads.zzifx zzifxVar) {
        return new com.google.android.gms.internal.ads.zzhlw(str, cls, zzhspVar, zzifxVar);
    }

    public static com.google.android.gms.internal.ads.zzhei zzf(java.lang.String str, java.lang.Class cls, com.google.android.gms.internal.ads.zzifx zzifxVar) {
        return new com.google.android.gms.internal.ads.zzhlv(str, cls, zzifxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhdr
    public final java.lang.Object zza(com.google.android.gms.internal.ads.zzida zzidaVar) throws java.security.GeneralSecurityException {
        return com.google.android.gms.internal.ads.zzhmo.zza().zzd(com.google.android.gms.internal.ads.zzhmr.zza().zzg(com.google.android.gms.internal.ads.zzhnm.zza(this.zza, zzidaVar, this.zzc, com.google.android.gms.internal.ads.zzhtm.RAW, null), com.google.android.gms.internal.ads.zzhdo.zza()), this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzhdr
    public final java.lang.String zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhdr
    public final java.lang.Class zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhdr
    public final com.google.android.gms.internal.ads.zzhsq zzd(com.google.android.gms.internal.ads.zzida zzidaVar) throws java.security.GeneralSecurityException {
        com.google.android.gms.internal.ads.zzhss zze = com.google.android.gms.internal.ads.zzhst.zze();
        zze.zza(this.zza);
        zze.zzb(zzidaVar);
        zze.zzc(com.google.android.gms.internal.ads.zzhtm.RAW);
        com.google.android.gms.internal.ads.zzhnm zzhnmVar = (com.google.android.gms.internal.ads.zzhnm) com.google.android.gms.internal.ads.zzhmr.zza().zzh(com.google.android.gms.internal.ads.zzhmi.zza().zzc(com.google.android.gms.internal.ads.zzhmr.zza().zzj(com.google.android.gms.internal.ads.zzhnn.zzb((com.google.android.gms.internal.ads.zzhst) zze.zzbu())), null), com.google.android.gms.internal.ads.zzhnm.class, com.google.android.gms.internal.ads.zzhdo.zza());
        com.google.android.gms.internal.ads.zzhso zzd = com.google.android.gms.internal.ads.zzhsq.zzd();
        zzd.zza(zzhnmVar.zzg());
        zzd.zzb(zzhnmVar.zzb());
        zzd.zzc(zzhnmVar.zzc());
        return (com.google.android.gms.internal.ads.zzhsq) zzd.zzbu();
    }
}
