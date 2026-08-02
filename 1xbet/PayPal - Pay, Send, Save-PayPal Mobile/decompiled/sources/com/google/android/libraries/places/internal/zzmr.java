package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzmr {
    public static java.lang.String zza(android.content.pm.PackageManager packageManager, java.lang.String str) {
        try {
            android.content.pm.PackageInfo packageInfo = packageManager.getPackageInfo(str, 64);
            if (packageInfo != null && packageInfo.signatures != null && packageInfo.signatures.length != 0 && packageInfo.signatures[0] != null) {
                return zzb(packageInfo.signatures[0]);
            }
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
        }
        return null;
    }

    private static java.lang.String zzb(android.content.pm.Signature signature) {
        try {
            return com.google.common.io.BaseEncoding.base16().encode(java.security.MessageDigest.getInstance("SHA-1").digest(signature.toByteArray()));
        } catch (java.security.NoSuchAlgorithmException unused) {
            return null;
        }
    }
}
