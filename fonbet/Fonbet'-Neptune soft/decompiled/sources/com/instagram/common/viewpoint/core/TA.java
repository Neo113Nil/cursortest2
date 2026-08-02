package com.instagram.common.viewpoint.core;

import java.util.Arrays;
import okio.Utf8;

/* loaded from: assets/audience_network.dex */
public class TA extends MQ {
    public static byte[] A01;
    public final /* synthetic */ C0696Qc A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 30);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{95, 112, 101, 120, 103, 116, 49, 112, 117, 98, 49, 124, 112, Byte.MAX_VALUE, 112, 118, 116, 99, 49, 101, 121, 116, 120, 99, 49, 126, 102, Byte.MAX_VALUE, 49, 120, 124, 97, 99, 116, 98, 98, 120, 126, Byte.MAX_VALUE, 98, Utf8.REPLACEMENT_BYTE};
    }

    public TA(C0696Qc c0696Qc) {
        this.A00 = c0696Qc;
    }

    @Override // com.instagram.common.viewpoint.core.MQ
    public final void A0B(C1449iN c1449iN) {
        this.A00.A1W(c1449iN);
    }

    @Override // com.instagram.common.viewpoint.core.MQ
    public final void A0C() {
        QQ qq;
        QQ qq2;
        qq = this.A00.A0G;
        if (qq != null) {
            qq2 = this.A00.A0G;
            qq2.ACD();
        }
    }

    @Override // com.instagram.common.viewpoint.core.MQ
    public final void A0D() {
        throw new IllegalStateException(A00(0, 41, 15));
    }

    @Override // com.instagram.common.viewpoint.core.MQ
    public final void A0F(MP mp) {
        C02166w c02166w;
        C02166w c02166w2;
        c02166w = this.A00.A0A;
        if (c02166w != null) {
            c02166w2 = this.A00.A0A;
            c02166w2.A0M();
        }
    }

    @Override // com.instagram.common.viewpoint.core.MQ
    public final void A0G(V1 v1) {
        long j;
        QQ qq;
        QQ qq2;
        LH A0F = this.A00.A12().A0F();
        j = this.A00.A00;
        A0F.A3F(XG.A01(j), v1.A03().getErrorCode(), v1.A04());
        qq = this.A00.A0G;
        if (qq != null) {
            qq2 = this.A00.A0G;
            qq2.ADB(v1);
        }
    }
}
