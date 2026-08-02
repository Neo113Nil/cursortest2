package com.google.android.play.core.splitinstall.internal;

/* loaded from: classes9.dex */
public final class zzbt {
    public static java.lang.String zza(byte[] bArr) {
        try {
            java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("SHA-256");
            messageDigest.update(bArr);
            return android.util.Base64.encodeToString(messageDigest.digest(), 11);
        } catch (java.security.NoSuchAlgorithmException unused) {
            return "";
        }
    }
}
