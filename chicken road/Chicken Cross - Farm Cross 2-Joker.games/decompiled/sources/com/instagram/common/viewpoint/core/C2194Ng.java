package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import com.google.android.gms.nearby.uwb.RangingPosition;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import java.io.Serializable;
import java.util.Arrays;
import kotlin.io.encoding.Base64;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Ng, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2194Ng implements Serializable {
    public static byte[] A05 = null;
    public static final long serialVersionUID = 238472947123L;
    public int A00;
    public String A01;
    public String A02;
    public String A03;
    public boolean A04;

    static {
        A05();
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C2194Ng A00(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString(A04(0, 6, 78));
        String optString2 = jSONObject.optString(A04(36, 8, 81));
        String optString3 = jSONObject.optString(A04(24, 12, 84));
        int optInt = jSONObject.optInt(A04(44, 14, 5), -1);
        boolean optBoolean = jSONObject.optBoolean(A04(6, 18, 35), false);
        if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2) || TextUtils.isEmpty(optString3) || optInt == -1) {
            return null;
        }
        return new C2194Ng(optString, optString2, optString3, optInt, optBoolean);
    }

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) + RangingPosition.RSSI_MIN);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A05 = new byte[]{46, Base64.padSymbol, Base64.padSymbol, 44, 54, 49, 8, 3, Ascii.SO, Ascii.SO, 4, 3, 5, Ascii.CR, 1, Ascii.VT, Ascii.DLE, Ascii.NAK, Ascii.SYN, 3, 9, Ascii.DC4, 3, Ascii.SI, 67, 52, 54, 62, 52, 58, 56, 50, 65, 52, SignedBytes.MAX_POWER_OF_TWO, 56, 66, 53, 54, 53, 66, 66, 53, 66, -10, -23, -12, -13, -10, -8, -19, -14, -21, -29, -15, -13, -24, -23};
    }

    public C2194Ng(String str, String str2, String str3, int i, boolean z) {
        this.A01 = str;
        this.A03 = str2;
        this.A02 = str3;
        this.A00 = i;
        this.A04 = z;
    }

    private final String A01() {
        return this.A01;
    }

    private final String A02() {
        return this.A02;
    }

    private final String A03() {
        return this.A03;
    }

    public static void A06(C2194Ng c2194Ng, C2930gi c2930gi) {
        if (c2194Ng != null && c2194Ng.A09()) {
            new W6(c2930gi).A04(true, c2194Ng.A01(), c2194Ng.A03(), c2194Ng.A02(), System.currentTimeMillis(), c2194Ng.A08());
        }
    }

    public static void A07(C2194Ng c2194Ng, C2930gi c2930gi) {
        if (c2194Ng != null && c2194Ng.A0A()) {
            new W6(c2930gi).A04(false, c2194Ng.A01(), c2194Ng.A03(), c2194Ng.A02(), System.currentTimeMillis(), c2194Ng.A08());
        }
    }

    private final boolean A08() {
        return this.A04;
    }

    private final boolean A09() {
        return (this.A00 & 2) != 0;
    }

    private final boolean A0A() {
        return (this.A00 & 1) != 0;
    }
}
