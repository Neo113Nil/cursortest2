package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Build;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class zzpr {
    public static final Charset zza = Charset.forName("UTF-8");

    public static int zza() {
        SecureRandom secureRandom = new SecureRandom();
        byte[] bArr = new byte[4];
        int i7 = 0;
        while (i7 == 0) {
            secureRandom.nextBytes(bArr);
            i7 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        }
        return i7;
    }

    public static final zzzc zzb(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i7 = 0; i7 < str.length(); i7++) {
            char cCharAt = str.charAt(i7);
            if (cCharAt < '!' || cCharAt > '~') {
                throw new zzpp("Not a printable ASCII character: " + cCharAt);
            }
            bArr[i7] = (byte) cCharAt;
        }
        return zzzc.zza(bArr);
    }

    public static final zzzc zza(String str) throws GeneralSecurityException {
        byte[] bArr = new byte[str.length()];
        for (int i7 = 0; i7 < str.length(); i7++) {
            char cCharAt = str.charAt(i7);
            if (cCharAt >= '!' && cCharAt <= '~') {
                bArr[i7] = (byte) cCharAt;
            } else {
                throw new GeneralSecurityException("Not a printable ASCII character: " + cCharAt);
            }
        }
        return zzzc.zza(bArr);
    }

    public static Integer zzb() {
        if (Objects.equals(System.getProperty("java.vendor"), "The Android Project")) {
            return Integer.valueOf(Build.VERSION.SDK_INT);
        }
        return null;
    }

    public static boolean zza(byte[] bArr, byte[] bArr2) {
        if (bArr2.length < bArr.length) {
            return false;
        }
        for (int i7 = 0; i7 < bArr.length; i7++) {
            if (bArr2[i7] != bArr[i7]) {
                return false;
            }
        }
        return true;
    }
}
