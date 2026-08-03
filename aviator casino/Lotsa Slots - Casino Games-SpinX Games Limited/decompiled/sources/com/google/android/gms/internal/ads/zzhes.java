package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhes {
    private static final com.google.android.gms.internal.ads.zzhdn zza = new com.google.android.gms.internal.ads.zzher();

    public static com.google.android.gms.internal.ads.zzhdn zza() throws java.security.GeneralSecurityException {
        if (com.google.android.gms.internal.ads.zzhks.zza()) {
            throw new java.security.GeneralSecurityException("Cannot use non-FIPS-compliant AeadConfigurationV1 in FIPS mode");
        }
        return zza;
    }
}
