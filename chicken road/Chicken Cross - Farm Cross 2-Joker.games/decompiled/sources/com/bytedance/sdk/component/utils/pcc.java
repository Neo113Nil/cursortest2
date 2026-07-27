package com.bytedance.sdk.component.utils;

import android.os.Build;
import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import java.security.SecureRandom;
import java.util.Random;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class pcc {

    /* renamed from: com.bytedance.sdk.component.utils.pcc$pcc, reason: collision with other inner class name */
    static class C0130pcc {
        static final Random pcc = pcc.gm();
    }

    public static JSONObject pcc(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new JSONObject();
        }
        return pcc(jSONObject.toString());
    }

    public static JSONObject pcc(String str) {
        JSONObject jSONObject = new JSONObject();
        if (TextUtils.isEmpty(str)) {
            return jSONObject;
        }
        try {
            try {
                String sf = sf(str);
                if (!TextUtils.isEmpty(sf)) {
                    jSONObject.put("message", sf);
                    jSONObject.put("cypher", 3);
                } else {
                    jSONObject.put("message", str);
                    jSONObject.put("cypher", 0);
                }
            } catch (Throwable th) {
                th.getMessage();
            }
        } catch (Throwable unused) {
            jSONObject.put("message", str);
            jSONObject.put("cypher", 0);
        }
        return jSONObject;
    }

    public static String sf(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        String pcc = pcc();
        String pcc2 = pcc(pcc, 32);
        String sf = sf();
        String pcc3 = (pcc2 == null || sf == null) ? null : com.bytedance.sdk.component.oo.pcc.pcc(str, sf, pcc2);
        StringBuilder sb = new StringBuilder(ExifInterface.GPS_MEASUREMENT_3D);
        sb.append(pcc).append(sf).append(pcc3);
        return sb.toString();
    }

    public static String gm(String str) {
        if (TextUtils.isEmpty(str) || str.length() < 49) {
            return str;
        }
        String pcc = pcc(str.substring(1, 33), 32);
        String substring = str.substring(33, 49);
        return (substring == null || pcc == null) ? str : com.bytedance.sdk.component.oo.pcc.sf(str.substring(49), substring, pcc);
    }

    public static String pcc() {
        String pcc = pcc(16);
        if (pcc == null || pcc.length() != 32) {
            return null;
        }
        return pcc;
    }

    public static String pcc(String str, int i) {
        if (str == null || str.length() != i) {
            return null;
        }
        int i2 = i / 2;
        return str.substring(i2, i) + str.substring(0, i2);
    }

    public static String sf() {
        String pcc = pcc(8);
        if (pcc == null || pcc.length() != 16) {
            return null;
        }
        return pcc;
    }

    public static String pcc(int i) {
        try {
            byte[] bArr = new byte[i];
            C0130pcc.pcc.nextBytes(bArr);
            return vj.pcc(bArr);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Random gm() {
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                return SecureRandom.getInstanceStrong();
            } catch (Throwable unused) {
                return new SecureRandom();
            }
        }
        return new SecureRandom();
    }
}
