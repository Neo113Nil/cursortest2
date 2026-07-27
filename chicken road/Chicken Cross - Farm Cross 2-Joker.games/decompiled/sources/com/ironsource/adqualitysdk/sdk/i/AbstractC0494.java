package com.ironsource.adqualitysdk.sdk.i;

import android.util.Base64;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.io.ByteArrayInputStream;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.Ϯ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public abstract class AbstractC0494 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static final String f1141 = StringFog.decrypt("HlTBeClF6lkmZeRkJFo=\n", "XzCQDUgpgy0=\n");

    static {
        StringFog.decrypt("VjFyNcltPmZXP349x21weQ==\n", "JV4dWKUMExI=\n");
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static String m5475(String str, String str2, String str3, String str4) {
        CipherInputStream cipherInputStream;
        StringBuilder sb = new StringBuilder();
        try {
            byte[] decode = Base64.decode(str.getBytes(), 0);
            byte[] copyOfRange = Arrays.copyOfRange(decode, 16, decode.length);
            CipherInputStream cipherInputStream2 = null;
            try {
                try {
                    int length = str3.length();
                    byte[] bArr = new byte[length / 2];
                    for (int i = 0; i < length; i += 2) {
                        bArr[i / 2] = (byte) (Character.digit(str3.charAt(i + 1), 16) + (Character.digit(str3.charAt(i), 16) << 4));
                    }
                    int length2 = str4.length();
                    byte[] bArr2 = new byte[length2 / 2];
                    for (int i2 = 0; i2 < length2; i2 += 2) {
                        bArr2[i2 / 2] = (byte) (Character.digit(str4.charAt(i2 + 1), 16) + (Character.digit(str4.charAt(i2), 16) << 4));
                    }
                    Cipher cipher = Cipher.getInstance(StringFog.decrypt("7lovuehgFq//VD/FnnI05Mt2EvE=\n", "rx98lqsiVYA=\n"));
                    cipher.init(2, SecretKeyFactory.getInstance(StringFog.decrypt("aNAzDS82+xJ8pzcUIlCGaXrbIhsjMZ4cetFbFTYn/Qxr3g==\n", "OJJ2WmZis18=\n"), StringFog.decrypt("XJU=\n", "HtbYlG7vU8A=\n")).generateSecret(new PBEKeySpec(str2.toCharArray(), bArr2, 1, 256)), new IvParameterSpec(bArr, 0, cipher.getBlockSize()));
                    cipherInputStream = new CipherInputStream(new ByteArrayInputStream(copyOfRange), cipher);
                } catch (Throwable unused) {
                }
                try {
                    StringFog.decrypt("UO0VnQU=\n", "BblTsD13wGc=\n");
                    byte[] bArr3 = new byte[8192];
                    for (int read = cipherInputStream.read(bArr3); read > -1; read = cipherInputStream.read(bArr3)) {
                        sb.append(new String(bArr3, 0, read, StringFog.decrypt("trTK/oM=\n", "4+CM07s6U1s=\n")));
                    }
                    cipherInputStream.close();
                } catch (Throwable th) {
                    th = th;
                    cipherInputStream2 = cipherInputStream;
                    try {
                        AbstractC0480.m5464(f1141, StringFog.decrypt("4PVGQ0H3a7/G9U1cR75hvYX0QF5auWg=\n", "pYc0LDPXD9o=\n"), th, false);
                        if (cipherInputStream2 != null) {
                            cipherInputStream2.close();
                        }
                        return sb.toString();
                    } catch (Throwable th2) {
                        if (cipherInputStream2 != null) {
                            try {
                                cipherInputStream2.close();
                            } catch (Throwable unused2) {
                            }
                        }
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            AbstractC0480.m5464(f1141, StringFog.decrypt("l79XVaGc8g63rFFTvduxGLeuV0OjyLEdvqpK\n", "0s0lOtO8kXw=\n"), th4, false);
        }
        return sb.toString();
    }
}
