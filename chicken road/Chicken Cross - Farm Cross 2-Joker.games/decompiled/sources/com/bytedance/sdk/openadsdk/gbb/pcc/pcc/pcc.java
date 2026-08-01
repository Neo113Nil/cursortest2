package com.bytedance.sdk.openadsdk.gbb.pcc.pcc;

import android.text.TextUtils;
import android.util.Base64;
import java.nio.charset.StandardCharsets;

/* loaded from: classes4.dex */
public class pcc {
    public static String pcc(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String encodeToString = Base64.encodeToString(pcc(str.getBytes(StandardCharsets.UTF_8)), 0);
        StringBuilder sb = new StringBuilder();
        if (str2 == null) {
            str2 = "";
        }
        return sb.append(str2).append(encodeToString).toString();
    }

    public static String sf(String str, String str2) {
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                if (str.startsWith(str2)) {
                    str = str.substring(str2.length());
                }
                if (TextUtils.isEmpty(str)) {
                    return null;
                }
                return new String(pcc(Base64.decode(str, 0)), StandardCharsets.UTF_8);
            }
        } catch (Exception unused) {
        }
        return null;
    }

    private static byte[] pcc(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return new byte[0];
        }
        byte[] bytes = "PAGAdSDK".getBytes(StandardCharsets.UTF_8);
        int length = bytes.length;
        byte[] bArr2 = new byte[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            bArr2[i] = (byte) (bArr[i] ^ bytes[i % length]);
        }
        return bArr2;
    }
}
