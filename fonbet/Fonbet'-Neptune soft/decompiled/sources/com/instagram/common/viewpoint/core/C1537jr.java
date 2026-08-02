package com.instagram.common.viewpoint.core;

import com.google.common.base.Ascii;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.jr, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1537jr implements KJ {
    public static byte[] A06;
    public int A00;
    public int A01;
    public long A02 = -9223372036854775807L;
    public boolean A03;
    public final List<C0541Ka> A04;
    public final H1[] A05;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 49);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A06 = new byte[]{1, 16, 16, Ascii.FF, 9, 3, 1, Ascii.DC4, 9, Ascii.SI, Ascii.SO, -49, 4, Ascii.SYN, 2, 19, Ascii.NAK, 2, 19};
    }

    public C1537jr(List<C0541Ka> list) {
        this.A04 = list;
        this.A05 = new H1[list.size()];
    }

    private boolean A02(C4J c4j, int i) {
        if (c4j.A07() == 0) {
            return false;
        }
        if (c4j.A0I() != i) {
            this.A03 = false;
        }
        this.A00--;
        return this.A03;
    }

    @Override // com.instagram.common.viewpoint.core.KJ
    public final void A52(C4J c4j) {
        if (this.A03) {
            if (this.A00 == 2 && !A02(c4j, 32)) {
                return;
            }
            if (this.A00 == 1 && !A02(c4j, 0)) {
                return;
            }
            int A09 = c4j.A09();
            int A07 = c4j.A07();
            for (H1 h1 : this.A05) {
                c4j.A0f(A09);
                h1.AI7(c4j, A07);
            }
            int dataPosition = this.A01;
            this.A01 = dataPosition + A07;
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0004 */
    @Override // com.instagram.common.viewpoint.core.KJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A5U(GY gy, C0545Ke c0545Ke) {
        for (int i = 0; i < i; i++) {
            C0541Ka c0541Ka = this.A04.get(i);
            c0545Ke.A05();
            H1 AJh = gy.AJh(c0545Ke.A03(), 3);
            AJh.A6W(new C2D().A0y(c0545Ke.A04()).A11(A00(0, 19, 111)).A12(Collections.singletonList(c0541Ka.A02)).A10(c0541Ka.A01).A14());
            this.A05[i] = AJh;
        }
    }

    @Override // com.instagram.common.viewpoint.core.KJ
    public final void AG5() {
        if (this.A03) {
            if (this.A02 != -9223372036854775807L) {
                for (H1 h1 : this.A05) {
                    h1.AIA(this.A02, 1, this.A01, 0, null);
                }
            }
            this.A03 = false;
        }
    }

    @Override // com.instagram.common.viewpoint.core.KJ
    public final void AG6(long j, int i) {
        if ((i & 4) == 0) {
            return;
        }
        this.A03 = true;
        if (j != -9223372036854775807L) {
            this.A02 = j;
        }
        this.A01 = 0;
        this.A00 = 2;
    }

    @Override // com.instagram.common.viewpoint.core.KJ
    public final void AIL() {
        this.A03 = false;
        this.A02 = -9223372036854775807L;
    }
}
