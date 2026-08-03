package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzhit extends java.lang.ThreadLocal {
    zzhit() {
    }

    protected static final javax.crypto.Cipher zza() {
        try {
            return (javax.crypto.Cipher) com.google.android.gms.internal.ads.zzhzz.zza.zzb("AES/GCM/NoPadding");
        } catch (java.security.GeneralSecurityException e) {
            throw new java.lang.IllegalStateException(e);
        }
    }

    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ java.lang.Object initialValue() {
        return zza();
    }
}
