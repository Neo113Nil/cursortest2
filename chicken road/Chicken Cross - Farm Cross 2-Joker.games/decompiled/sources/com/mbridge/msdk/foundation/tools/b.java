package com.mbridge.msdk.foundation.tools;

import android.util.Base64;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: AESGCMUtil.java */
/* loaded from: classes6.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static byte[] f9409a = new byte[32];

    static {
        a(k0.a("HkzwDFeD4QuyLdx5igfZYcu9xTM9NN=="));
    }

    private static void a(String str) {
        try {
            System.arraycopy(MessageDigest.getInstance("SHA-384").digest(str.getBytes()), 0, f9409a, 0, 32);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String b(String str, byte[] bArr, byte[] bArr2) throws Exception {
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(1, new SecretKeySpec(bArr, "AES"), new GCMParameterSpec(128, bArr2));
        return Base64.encodeToString(cipher.doFinal(str.getBytes(StandardCharsets.UTF_8)), 2);
    }

    public static String a(String str, byte[] bArr, byte[] bArr2) {
        try {
            byte[] decode = Base64.decode(str, 2);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(2, secretKeySpec, new GCMParameterSpec(128, bArr2));
            return new String(cipher.doFinal(decode), "UTF-8");
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
