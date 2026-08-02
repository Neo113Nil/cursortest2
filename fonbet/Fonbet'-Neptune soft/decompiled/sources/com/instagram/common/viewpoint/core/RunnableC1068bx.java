package com.instagram.common.viewpoint.core;

import com.google.common.base.Ascii;
import java.util.Arrays;
import kotlin.io.encoding.Base64;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.bx, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC1068bx implements Runnable {
    public static byte[] A02;
    public final /* synthetic */ C1072c1 A00;
    public final /* synthetic */ String A01;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 97);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{Ascii.CR, 33, 59, 34, 42, 110, 32, 33, 58, 110, 62, 47, 60, Base64.padSymbol, 43, 110, Base64.padSymbol, 43, 60, 56, 43, 60, 110, 35, 43, Base64.padSymbol, Base64.padSymbol, 47, 41, 43, 72, Byte.MAX_VALUE, Byte.MAX_VALUE, 98, Byte.MAX_VALUE, 45, 125, 108, Byte.MAX_VALUE, 126, 100, 99, 106, 45, 71, 94, 66, 67, 45, 100, 99, 45, 125, 98, 126, 121, 64, 104, 126, 126, 108, 106, 104, 45, 87, 67, 66, 94, 125, 83, 79, 53, 40, 36, 34, 49, Ascii.SI, 52, 49, 36, 49, Ascii.SO, 3, 10, Ascii.US, 58, 60};
    }

    public RunnableC1068bx(C1072c1 c1072c1, String str) {
        this.A00 = c1072c1;
        this.A01 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1051bg c1051bg;
        String str;
        C1051bg c1051bg2;
        if (AbstractC0832Vl.A02(this)) {
            return;
        }
        try {
            try {
                JSONObject jSONObject = new JSONObject(this.A01);
                str = this.A00.A05;
                if (str.equals(jSONObject.optString(A00(64, 7, 87)))) {
                    this.A00.A0C(EnumC1070bz.A00(jSONObject.optString(A00(81, 4, 27))), jSONObject.optString(A00(71, 10, 49), A00(85, 2, 32)));
                } else {
                    c1051bg2 = this.A00.A04;
                    c1051bg2.A04(AbstractC0766Sv.A11, A00(0, 30, 47));
                }
            } catch (JSONException e) {
                c1051bg = this.A00.A04;
                c1051bg.A04(AbstractC0766Sv.A15, A00(30, 34, 108) + e.getMessage());
            }
        } catch (Throwable th) {
            AbstractC0832Vl.A00(th, this);
        }
    }
}
