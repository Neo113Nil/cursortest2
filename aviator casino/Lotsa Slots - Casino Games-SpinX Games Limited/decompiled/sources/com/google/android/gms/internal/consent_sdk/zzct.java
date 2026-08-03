package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* loaded from: classes4.dex */
public final class zzct {
    private static java.lang.String zza;

    public static synchronized java.lang.String zza(android.content.Context context) {
        java.lang.String str;
        synchronized (com.google.android.gms.internal.consent_sdk.zzct.class) {
            if (zza == null) {
                android.content.ContentResolver contentResolver = context.getContentResolver();
                java.lang.String string = contentResolver == null ? null : android.provider.Settings.Secure.getString(contentResolver, "android_id");
                if (string == null || com.google.android.gms.internal.consent_sdk.zzdb.zza(true)) {
                    string = "emulator";
                }
                zza = zzb(string);
            }
            str = zza;
        }
        return str;
    }

    private static java.lang.String zzb(java.lang.String str) {
        for (int i = 0; i < 3; i++) {
            try {
                java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("MD5");
                messageDigest.update(str.getBytes());
                return java.lang.String.format("%032X", new java.math.BigInteger(1, messageDigest.digest()));
            } catch (java.lang.ArithmeticException unused) {
                return "";
            } catch (java.security.NoSuchAlgorithmException unused2) {
            }
        }
        return "";
    }
}
