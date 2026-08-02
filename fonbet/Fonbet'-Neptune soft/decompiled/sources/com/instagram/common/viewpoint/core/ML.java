package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import com.google.common.base.Ascii;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public abstract class ML {
    public static byte[] A00;
    public static String[] A01 = {"jSoy8XspXCFqO9NWG0uega5zyBcMMpnv", "8I941vkvBihlhZSR3", "E0n4xhy7f55RdYtJKKgnHTy6BEjDvFXE", "Oow628hlFtykEPzM3xMW0Wh", "gjSfO6YGNNbsKn6TLZq3stDSfq2Vbbu6", "XJoMwGgC8l1BSQaiX90ZQnicuTGj509z", "JK4GcCSwzapE3gOVlVNykyUw2lU6lT6d", "8BqJ2MeWpSgEuyxwl"};

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 71);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        byte[] bArr = {86, 115, 55, 126, 100, 55, 126, 121, 97, 118, 123, 126, 115, 118, 99, 114, 115, 55, 96, 126, 99, Byte.MAX_VALUE, 120, 98, 99, 55, 99, 120, 124, 114, 121, 57, Ascii.ESC, 10, 19, 117, 116, 101, 116, 114, 101, 120, 126, Byte.MAX_VALUE, 78, 98, 101, 99, 120, Byte.MAX_VALUE, 118, 98, 39, 32, 56, 47, 34, 39, 42, 47, 58, 39, 33, 32, 17, 44, 43, 38, 47, 56, 39, 33, 60, 45, 60, 47, 46, 52, 51, 58};
        if (A01[6].length() == 14) {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[7] = "4DtSv1ItoT1AnjNkW";
        strArr[1] = "xsdhzuZMhKe1kPAxh";
        A00 = bArr;
    }

    static {
        A05();
    }

    public static MJ A00(JSONObject jSONObject) {
        return MJ.A00(jSONObject.optString(A02(52, 21, 9)));
    }

    public static C1474io A01(C1153dL c1153dL, JSONObject jSONObject, String str) {
        return new C1474io(jSONObject, c1153dL, str);
    }

    public static Collection<String> A03(C1153dL c1153dL, JSONObject jSONObject) {
        JSONArray jSONArray = null;
        try {
            String detectionStringJSON = jSONObject.optString(A02(35, 17, 86));
            if (!TextUtils.isEmpty(detectionStringJSON)) {
                JSONArray detectionStringsArray = new JSONArray(detectionStringJSON);
                jSONArray = detectionStringsArray;
            }
        } catch (JSONException e) {
            c1153dL.A08().AAy(A02(73, 7, 26), AbstractC0766Sv.A2C, new C0767Sw(e));
        }
        return A04(jSONArray);
    }

    public static Collection<String> A04(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        HashSet hashSet = new HashSet();
        for (int i = 0; i < jSONArray.length(); i++) {
            hashSet.add(jSONArray.optString(i));
        }
        return hashSet;
    }

    public static boolean A06(C1153dL c1153dL, MK mk, US us) {
        MJ A8C = mk.A8C();
        if (A8C != null) {
            MJ invalidationBehavior = MJ.A03;
            if (A8C != invalidationBehavior) {
                boolean packageInstalled = false;
                Collection<String> A7h = mk.A7h();
                if (A7h == null || A7h.isEmpty()) {
                    return false;
                }
                Iterator<String> it = A7h.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (AbstractC0867Ww.A04(c1153dL, it.next())) {
                        packageInstalled = true;
                        break;
                    }
                }
                MJ invalidationBehavior2 = MJ.A02;
                if (packageInstalled != (A8C == invalidationBehavior2)) {
                    return false;
                }
                String clientToken = mk.A7G();
                if (!TextUtils.isEmpty(clientToken)) {
                    us.AB6(clientToken, null);
                    return true;
                }
                c1153dL.A08().AAy(A02(32, 3, 61), AbstractC0766Sv.A0Z, new C0767Sw(A02(0, 32, 80)));
                return true;
            }
        }
        return false;
    }
}
