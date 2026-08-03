package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhgp {
    public static final /* synthetic */ int zza = 0;
    private static final com.google.android.gms.internal.ads.zzhnf zzb = com.google.android.gms.internal.ads.zzhnf.zzd(com.google.android.gms.internal.ads.zzhgo.zza, com.google.android.gms.internal.ads.zzhgu.class, com.google.android.gms.internal.ads.zzhdi.class);
    private static final com.google.android.gms.internal.ads.zzhdr zzc = com.google.android.gms.internal.ads.zzhlw.zze("type.googleapis.com/google.crypto.tink.KmsAeadKey", com.google.android.gms.internal.ads.zzhdi.class, com.google.android.gms.internal.ads.zzhsp.REMOTE, com.google.android.gms.internal.ads.zzhtf.zze());
    private static final com.google.android.gms.internal.ads.zzhln zzd = com.google.android.gms.internal.ads.zzhgn.zza;

    public static void zza(boolean z) throws java.security.GeneralSecurityException {
        if (!com.google.android.gms.internal.ads.zzhkr.zza(1)) {
            throw new java.security.GeneralSecurityException("Registering KMS AEAD is not supported in FIPS mode");
        }
        int i = com.google.android.gms.internal.ads.zzhhb.zza;
        com.google.android.gms.internal.ads.zzhhb.zza(com.google.android.gms.internal.ads.zzhmr.zza());
        com.google.android.gms.internal.ads.zzhmo.zza().zzb(zzb);
        com.google.android.gms.internal.ads.zzhmi.zza().zzb(zzd, com.google.android.gms.internal.ads.zzhgw.class);
        com.google.android.gms.internal.ads.zzhlo.zza().zzb(zzc, true);
    }
}
