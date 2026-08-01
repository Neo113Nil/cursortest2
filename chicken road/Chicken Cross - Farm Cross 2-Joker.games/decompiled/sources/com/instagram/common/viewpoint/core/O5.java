package com.instagram.common.viewpoint.core;

import com.facebook.ads.AdError;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class O5 {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 115);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{Ascii.VT, 77, 81, 72, 73, 93, 90, SignedBytes.MAX_POWER_OF_TWO, 81, 70, 71, SignedBytes.MAX_POWER_OF_TWO, 93, SignedBytes.MAX_POWER_OF_TWO, 93, 85, 88};
    }

    public static void A02(C2930gi c2930gi, AbstractC3095jd abstractC3095jd, boolean z, O3 o3) {
        if (!C2380Up.A2E(c2930gi)) {
            C2336Sx c2336Sx = new C2336Sx(c2930gi);
            C2202No A07 = abstractC3095jd.A29().A0H().A07();
            c2336Sx.A0e(new VI(abstractC3095jd.A2E(), c2930gi.A0A()));
            if (A07 == null) {
                o3.AFF(AdError.CACHE_ERROR);
                return;
            }
            if (A07.A0Y()) {
                o3.AFG();
                return;
            }
            C2332St c2332St = new C2332St(A07.A0L(), abstractC3095jd.A1D(), abstractC3095jd.A10());
            c2332St.A04 = true;
            c2332St.A03 = A00(0, 5, 86);
            switch (O2.A00[A07.A0G().ordinal()]) {
                case 1:
                case 2:
                    c2336Sx.A0Y(c2332St);
                    break;
            }
            c2336Sx.A0c(new C2334Sv(abstractC3095jd.A2C().A01(), -1, -1, abstractC3095jd.A1D(), abstractC3095jd.A10()));
            c2336Sx.A0c(new C2334Sv(A07.A0K(), -1, -1, abstractC3095jd.A1D(), abstractC3095jd.A10()));
            O0.A00(abstractC3095jd, c2336Sx, A00(5, 12, 71));
            c2336Sx.A0X(new C3073jA(c2930gi, o3, c2336Sx, A07, z), new C2329Sq(abstractC3095jd.A1D(), abstractC3095jd.A10()));
            return;
        }
        o3.AFG();
    }
}
