package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhnz {
    public static final /* synthetic */ int zza = 0;

    static {
        java.nio.charset.Charset.forName("UTF-8");
    }

    public static final com.google.android.gms.internal.ads.zziaz zza(java.lang.String str) {
        byte[] bArr = new byte[str.length()];
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt < '!' || charAt > '~') {
                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(charAt).length() + 33);
                sb.append("Not a printable ASCII character: ");
                sb.append(charAt);
                throw new com.google.android.gms.internal.ads.zzhny(sb.toString());
            }
            bArr[i] = (byte) charAt;
        }
        return com.google.android.gms.internal.ads.zziaz.zza(bArr);
    }

    public static final com.google.android.gms.internal.ads.zziaz zzb(java.lang.String str) throws java.security.GeneralSecurityException {
        byte[] bArr = new byte[str.length()];
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt < '!' || charAt > '~') {
                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(charAt).length() + 33);
                sb.append("Not a printable ASCII character: ");
                sb.append(charAt);
                throw new java.security.GeneralSecurityException(sb.toString());
            }
            bArr[i] = (byte) charAt;
        }
        return com.google.android.gms.internal.ads.zziaz.zza(bArr);
    }

    public static boolean zzc() {
        return java.util.Objects.equals(java.lang.System.getProperty("java.vendor"), "The Android Project");
    }

    @javax.annotation.Nullable
    public static java.lang.Integer zzd() {
        if (zzc()) {
            return java.lang.Integer.valueOf(android.os.Build.VERSION.SDK_INT);
        }
        return null;
    }

    public static boolean zze(byte[] bArr, byte[] bArr2) {
        if (bArr2.length < bArr.length) {
            return false;
        }
        for (int i = 0; i < bArr.length; i++) {
            if (bArr2[i] != bArr[i]) {
                return false;
            }
        }
        return true;
    }
}
