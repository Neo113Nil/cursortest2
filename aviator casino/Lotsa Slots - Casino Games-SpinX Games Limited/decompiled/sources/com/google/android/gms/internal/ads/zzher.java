package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzher implements com.google.android.gms.internal.ads.zzhdn {
    zzher() {
    }

    @Override // com.google.android.gms.internal.ads.zzhdn
    public final java.lang.Object zza(com.google.android.gms.internal.ads.zzhec zzhecVar, java.lang.Class cls) throws java.security.GeneralSecurityException {
        if (cls == com.google.android.gms.internal.ads.zzhdi.class) {
            return cls.cast(com.google.android.gms.internal.ads.zzhjy.zza(zzhecVar, com.google.android.gms.internal.ads.zzheq.zza));
        }
        throw new java.security.GeneralSecurityException("AeadConfigurationV1 can only create AEADs");
    }
}
