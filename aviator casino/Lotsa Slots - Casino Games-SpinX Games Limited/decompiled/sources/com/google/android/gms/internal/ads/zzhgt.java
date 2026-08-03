package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhgt {
    public static final /* synthetic */ int zza = 0;
    private static final com.google.android.gms.internal.ads.zzhdr zzb = com.google.android.gms.internal.ads.zzhlw.zze("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", com.google.android.gms.internal.ads.zzhdi.class, com.google.android.gms.internal.ads.zzhsp.SYMMETRIC, com.google.android.gms.internal.ads.zzhtj.zze());
    private static final com.google.android.gms.internal.ads.zzhln zzc = com.google.android.gms.internal.ads.zzhgs.zza;
    private static final com.google.android.gms.internal.ads.zzhnf zzd = com.google.android.gms.internal.ads.zzhnf.zzd(com.google.android.gms.internal.ads.zzhgr.zza, com.google.android.gms.internal.ads.zzhhc.class, com.google.android.gms.internal.ads.zzhdi.class);

    public static void zza(boolean z) throws java.security.GeneralSecurityException {
        if (!com.google.android.gms.internal.ads.zzhkr.zza(1)) {
            throw new java.security.GeneralSecurityException("Registering KMS Envelope AEAD is not supported in FIPS mode");
        }
        int i = com.google.android.gms.internal.ads.zzhhl.zza;
        com.google.android.gms.internal.ads.zzhhl.zza(com.google.android.gms.internal.ads.zzhmr.zza());
        com.google.android.gms.internal.ads.zzhmi.zza().zzb(zzc, com.google.android.gms.internal.ads.zzhhg.class);
        com.google.android.gms.internal.ads.zzhmo.zza().zzb(zzd);
        com.google.android.gms.internal.ads.zzhlo.zza().zzb(zzb, true);
    }
}
