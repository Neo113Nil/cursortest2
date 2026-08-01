package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class O6 {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 102);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{10, 76, 80, 73, 72, 121, 126, 100, 117, 98, 99, 100, 121, 100, 121, 113, 124, 101, 114, 96, 118, 101, 115, 114, 115, 72, 97, 126, 115, 114, 120};
    }

    /* JADX WARN: Incorrect condition in loop: B:10:0x00da */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void A02(C2930gi c2930gi, C2336Sx c2336Sx, C18057l c18057l) {
        c2336Sx.A0d(new C2334Sv(c18057l.A2C().A01(), C2767e4.A04, C2767e4.A04, c18057l.A1D(), A00(17, 14, 113)));
        boolean A1g = c18057l.A1g();
        String A002 = A00(17, 14, 113);
        if (A1g) {
            C2332St c2332St = new C2332St(c18057l.A0x(), c18057l.A1D(), A002);
            c2332St.A04 = true;
            c2332St.A03 = A00(0, 5, 66);
            c2336Sx.A0Y(c2332St);
        }
        boolean A30 = C2380Up.A30(c2930gi, C2857fX.A03());
        C2332St c2332St2 = new C2332St(c18057l.A29().A0H().A09(), c18057l.A1D(), A00(17, 14, 113), c18057l.A29().A0H().A06());
        if (A1g && !A30) {
            c2336Sx.A0Y(c2332St2);
        } else {
            c2336Sx.A0b(c2332St2);
        }
        c2336Sx.A0d(new C2334Sv(c18057l.A29().A0H().A08(), O1.A00(c18057l.A29().A0H()), O1.A01(c18057l.A29().A0H()), c18057l.A1D(), A00(17, 14, 113)));
        O0.A00(c18057l, c2336Sx, A002);
        Iterator<String> it = c18057l.A29().A0K().A02().iterator();
        while (isDSL) {
            String url = it.next();
            c2336Sx.A0d(new C2334Sv(url, -1, -1, c18057l.A1D(), A00(17, 14, 113)));
        }
    }

    public static void A03(C2930gi c2930gi, C2336Sx c2336Sx, C18057l c18057l) {
        int i = 0;
        for (NR nr : c18057l.A2G()) {
            C2334Sv c2334Sv = new C2334Sv(nr.A0H().A08(), O1.A00(nr.A0H()), O1.A01(nr.A0H()), c18057l.A1D(), A00(5, 12, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE));
            if (i == 0) {
                c2336Sx.A0c(c2334Sv);
            } else {
                c2336Sx.A0d(c2334Sv);
            }
            O0.A00(c18057l, c2336Sx, A00(17, 14, 113));
            Iterator<String> it = nr.A0K().A02().iterator();
            while (it.hasNext()) {
                c2336Sx.A0d(new C2334Sv(it.next(), -1, -1, c18057l.A1D(), A00(5, 12, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE)));
            }
            if (!TextUtils.isEmpty(nr.A0H().A09())) {
                new C2332St(nr.A0H().A09(), c18057l.A1D(), A00(5, 12, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE), nr.A0H().A06()).A04 = false;
            }
            i++;
        }
    }
}
