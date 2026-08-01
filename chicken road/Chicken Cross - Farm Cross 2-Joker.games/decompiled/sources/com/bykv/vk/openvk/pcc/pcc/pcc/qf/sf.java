package com.bykv.vk.openvk.pcc.pcc.pcc.qf;

import android.text.TextUtils;
import com.google.common.base.Ascii;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes5.dex */
public class sf {
    private static final MessageDigest pcc = pcc();
    private static final char[] sf = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    private sf() {
    }

    private static MessageDigest pcc() {
        try {
            return MessageDigest.getInstance("md5");
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public static String pcc(String str) {
        byte[] digest;
        MessageDigest messageDigest = pcc;
        if (messageDigest == null || TextUtils.isEmpty(str)) {
            return "";
        }
        byte[] bytes = str.getBytes(Charset.forName("UTF-8"));
        synchronized (sf.class) {
            digest = messageDigest.digest(bytes);
        }
        return pcc(digest);
    }

    public static String pcc(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        char[] cArr = new char[bArr.length << 1];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = sf;
            cArr[i] = cArr2[(b & 240) >> 4];
            i += 2;
            cArr[i2] = cArr2[b & Ascii.SI];
        }
        return new String(cArr);
    }
}
