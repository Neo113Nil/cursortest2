package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final /* synthetic */ class zzhmh implements com.google.android.gms.internal.ads.zzhln {
    static final /* synthetic */ com.google.android.gms.internal.ads.zzhmh zza = new com.google.android.gms.internal.ads.zzhmh();

    private /* synthetic */ zzhmh() {
    }

    @Override // com.google.android.gms.internal.ads.zzhln
    public final /* synthetic */ com.google.android.gms.internal.ads.zzhdq zza(com.google.android.gms.internal.ads.zzheh zzhehVar, java.lang.Integer num) {
        int i = com.google.android.gms.internal.ads.zzhmi.zza;
        com.google.android.gms.internal.ads.zzhst zzc = ((com.google.android.gms.internal.ads.zzhma) zzhehVar).zzb().zzc();
        com.google.android.gms.internal.ads.zzhdr zzd = com.google.android.gms.internal.ads.zzhlo.zza().zzd(zzc.zza());
        if (!com.google.android.gms.internal.ads.zzhlo.zza().zze(zzc.zza())) {
            throw new java.security.GeneralSecurityException("Creating new keys is not allowed.");
        }
        com.google.android.gms.internal.ads.zzhsq zzd2 = zzd.zzd(zzc.zzb());
        return new com.google.android.gms.internal.ads.zzhlz(com.google.android.gms.internal.ads.zzhnm.zza(zzd2.zza(), zzd2.zzb(), zzd2.zzc(), zzc.zzc(), num), com.google.android.gms.internal.ads.zzhdo.zza());
    }
}
