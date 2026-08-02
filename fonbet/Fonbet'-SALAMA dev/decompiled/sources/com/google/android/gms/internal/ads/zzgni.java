package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzgni {
    public static final /* synthetic */ int zza = 0;

    static {
        Charset.forName("UTF-8");
    }

    public static final zzgvd zza(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i7 = 0; i7 < str.length(); i7++) {
            char charAt = str.charAt(i7);
            if (charAt < '!' || charAt > '~') {
                throw new GeneralSecurityException("Not a printable ASCII character: " + charAt);
            }
            bArr[i7] = (byte) charAt;
        }
        return zzgvd.zzb(bArr);
    }

    public static final zzgvd zzb(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i7 = 0; i7 < str.length(); i7++) {
            char charAt = str.charAt(i7);
            if (charAt < '!' || charAt > '~') {
                throw new zzgnh("Not a printable ASCII character: " + charAt);
            }
            bArr[i7] = (byte) charAt;
        }
        return zzgvd.zzb(bArr);
    }

    public static boolean zzc(byte[] bArr, byte[] bArr2) {
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
