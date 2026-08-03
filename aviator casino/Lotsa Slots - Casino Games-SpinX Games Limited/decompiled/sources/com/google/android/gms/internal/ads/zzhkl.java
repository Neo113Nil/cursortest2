package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzhkl extends java.lang.ThreadLocal {
    zzhkl() {
    }

    @javax.annotation.Nullable
    protected static final javax.crypto.Cipher zza() {
        try {
            javax.crypto.Cipher cipher = (javax.crypto.Cipher) com.google.android.gms.internal.ads.zzhzz.zza.zzb("AES/GCM-SIV/NoPadding");
            if (com.google.android.gms.internal.ads.zzhjb.zzb(cipher)) {
                return cipher;
            }
            return null;
        } catch (java.security.GeneralSecurityException e) {
            throw new java.lang.IllegalStateException(e);
        }
    }

    @Override // java.lang.ThreadLocal
    @javax.annotation.Nullable
    protected final /* bridge */ /* synthetic */ java.lang.Object initialValue() {
        return zza();
    }
}
