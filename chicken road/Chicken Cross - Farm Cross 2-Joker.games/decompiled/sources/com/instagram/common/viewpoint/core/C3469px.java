package com.instagram.common.viewpoint.core;

import android.os.Bundle;
import com.google.common.base.Ascii;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.px, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C3469px implements AnonymousClass24 {
    public static byte[] A03;
    public static String[] A04 = {"UnBMZo2POSkJfz8F5ORuhqz31kXq7ERt", "GIL9xJe6rQGrNyWVB8WflXUexCYVOXiL", "1YJSMghIf03NGeOR9kmJ9bGOSAOIDk9h", "FbkWhL7EvytxWPK79enAjrYaTxkw07sQ", "DvmeNztcauqB3GuZI4NFBZAXEAF", "3h1K0W52WnqAecgG5ddVr1SgL8ZiRxH3", "SzBXc", "YkLyJW6tcdkoyMoq5nPmYT201JvYdNzP"};
    public static final AnonymousClass23<C3469px> A05;
    public static final C3469px A06;
    public static final String A07;
    public static final String A08;
    public final float A00;
    public final float A01;
    public final int A02;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 19);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{109, 81, 92, 68, 95, 92, 94, 86, 109, 92, 79, 92, 80, 88, 73, 88, 79, 78, Ascii.NAK, 78, 77, 88, 88, 89, 0, Ascii.CAN, 19, Ascii.SI, 91, 17, Ascii.GS, 77, 84, 73, 94, 85, 0, Ascii.CAN, 19, Ascii.SI, 91, Ascii.DC4};
    }

    static {
        A02();
        A06 = new C3469px(1.0f);
        A08 = C5C.A0h(0);
        A07 = C5C.A0h(1);
        A05 = new AnonymousClass23() { // from class: com.facebook.ads.redexgen.X.py
            @Override // com.instagram.common.viewpoint.core.AnonymousClass23
            public final AnonymousClass24 A6f(Bundle bundle) {
                return C3469px.A00(bundle);
            }
        };
    }

    public C3469px(float f) {
        this(f, 1.0f);
    }

    public C3469px(float f, float f2) {
        AbstractC17143y.A07(f > 0.0f);
        AbstractC17143y.A07(f2 > 0.0f);
        this.A01 = f;
        this.A00 = f2;
        this.A02 = Math.round(1000.0f * f);
    }

    public static /* synthetic */ C3469px A00(Bundle bundle) {
        float f = bundle.getFloat(A08, 1.0f);
        float pitch = bundle.getFloat(A07, 1.0f);
        return new C3469px(f, pitch);
    }

    public final long A03(long j) {
        return this.A02 * j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C3469px c3469px = (C3469px) obj;
        if (this.A01 == c3469px.A01) {
            float f = this.A00;
            float f2 = c3469px.A00;
            if (A04[7].charAt(19) == 'U') {
                throw new RuntimeException();
            }
            String[] strArr = A04;
            strArr[6] = "pC9U2";
            strArr[4] = "3ca7HvojzYBlvf3WwnTfkyYQmWq";
            if (f == f2) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int result = Float.floatToRawIntBits(this.A01);
        return (((17 * 31) + result) * 31) + Float.floatToRawIntBits(this.A00);
    }

    public final String toString() {
        return C5C.A0n(A01(0, 42, 46), Float.valueOf(this.A01), Float.valueOf(this.A00));
    }
}
