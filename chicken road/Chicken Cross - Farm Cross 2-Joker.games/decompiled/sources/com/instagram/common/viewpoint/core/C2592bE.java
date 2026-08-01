package com.instagram.common.viewpoint.core;

import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.bE, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2592bE implements InterfaceC2157Lu {
    public static byte[] A01;
    public final T8 A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 24);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-93, -73, -56, -82, -118, -71, -78, -78, -87, -80, -87, -40, -47, -47, -56, -49, -99, -125, -39, -24, -2, -52, -3, -20, -11, -5, -26, -117, -102, -109, -109, -118, -111, -68, -53, -60, -60, -69, -62, -75, -62, -59, -67, -67, -69, -70, -58, -43, -50, -50, -59, -52, -65, -52, -49, -57, -57, -55, -50, -57, -65, -51, -49, -60, -59};
    }

    public C2592bE(T8 t8) {
        this.A00 = t8;
    }

    private void A02(int i, String str, JSONObject jSONObject, boolean z, int i2) {
        C2343Te c2343Te = new C2343Te(A00(4, 6, 44));
        c2343Te.A07(jSONObject);
        c2343Te.A05(1);
        c2343Te.A09(z);
        c2343Te.A04(i2);
        try {
            jSONObject.put(A00(33, 13, 62), TX.A0H(this.A00));
        } catch (JSONException unused) {
        }
        try {
            jSONObject.put(A00(46, 19, 72), i2);
        } catch (JSONException unused2) {
        }
        this.A00.A08().ABD(A00(27, 6, 13), i + 4000, c2343Te);
        if (this.A00.A05().AAO()) {
            String str2 = A00(10, 8, 75) + str + A00(0, 1, 99) + i + A00(1, 3, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE) + jSONObject.toString();
        }
    }

    public static boolean A03(EnumC2159Lw enumC2159Lw) {
        for (EnumC2159Lw enumC2159Lw2 : ZJ.A06) {
            if (enumC2159Lw2.equals(enumC2159Lw)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2157Lu
    public final void ABE(EnumC2159Lw enumC2159Lw, JSONObject jSONObject, int i) {
        A02(enumC2159Lw.A03(), enumC2159Lw.toString(), jSONObject, A03(enumC2159Lw), i);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2157Lu
    public final void ABs(int i, JSONObject jSONObject, int i2) {
        A02(i, A00(18, 9, 111) + i, jSONObject, false, i2);
    }
}
