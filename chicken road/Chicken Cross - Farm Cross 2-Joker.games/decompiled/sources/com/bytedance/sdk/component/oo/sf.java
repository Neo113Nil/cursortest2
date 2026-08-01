package com.bytedance.sdk.component.oo;

import android.util.Log;
import java.security.SecureRandom;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes4.dex */
public class sf {
    private static final Random pcc = new SecureRandom();

    public static byte[] pcc(byte[] bArr, byte[] bArr2) {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
        try {
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            byte[] bArr3 = new byte[12];
            System.arraycopy(bArr, 0, bArr3, 0, 12);
            cipher.init(2, secretKeySpec, new GCMParameterSpec(128, bArr3));
            return cipher.doFinal(bArr, 12, bArr.length - 12);
        } catch (Throwable th) {
            Log.e("AESGCM", "decryptByAESGCM: ", th);
            return null;
        }
    }

    public static byte[] sf(byte[] bArr, byte[] bArr2) {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
        try {
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            byte[] bArr3 = new byte[12];
            pcc.nextBytes(bArr3);
            cipher.init(1, secretKeySpec, new GCMParameterSpec(128, bArr3));
            byte[] doFinal = cipher.doFinal(bArr);
            byte[] bArr4 = new byte[doFinal.length + 12];
            System.arraycopy(bArr3, 0, bArr4, 0, 12);
            System.arraycopy(doFinal, 0, bArr4, 12, doFinal.length);
            return bArr4;
        } catch (Throwable th) {
            Log.e("AESGCM", "encryptByAESGCM: ", th);
            return null;
        }
    }
}
