package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class A7 extends com.facebook.ads.redexgen.core.AbstractC2081oQ {
    public int[] A00;
    public int[] A01;

    @Override // com.facebook.ads.redexgen.core.AbstractC2081oQ
    public final com.facebook.ads.redexgen.core.C04043i A09(com.facebook.ads.redexgen.core.C04043i c04043i) throws com.facebook.ads.redexgen.core.C04053j {
        int[] iArr = this.A01;
        if (iArr == null) {
            return com.facebook.ads.redexgen.core.C04043i.A05;
        }
        if (c04043i.A02 == 2) {
            int i = c04043i.A01 != iArr.length ? 1 : 0;
            int i2 = 0;
            while (i2 < iArr.length) {
                int i3 = iArr[i2];
                if (i3 < c04043i.A01) {
                    i |= i3 != i2 ? 1 : 0;
                    i2++;
                } else {
                    throw new com.facebook.ads.redexgen.core.C04053j(c04043i);
                }
            }
            if (i != 0) {
                return new com.facebook.ads.redexgen.core.C04043i(c04043i.A03, iArr.length, 2);
            }
            return com.facebook.ads.redexgen.core.C04043i.A05;
        }
        throw new com.facebook.ads.redexgen.core.C04053j(c04043i);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2081oQ
    public final void A0A() {
        this.A00 = this.A01;
    }

    public final void A0C(int[] iArr) {
        this.A01 = iArr;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC04063k
    public final void AHH(java.nio.ByteBuffer byteBuffer) {
        int[] iArr = (int[]) com.facebook.ads.redexgen.core.AbstractC04203y.A01(this.A00);
        int position = byteBuffer.position();
        int outputSize = byteBuffer.limit();
        int position2 = outputSize - position;
        java.nio.ByteBuffer A00 = A00(this.A06.A00 * (position2 / this.A05.A00));
        while (position < outputSize) {
            for (int i : iArr) {
                A00.putShort(byteBuffer.getShort((i * 2) + position));
            }
            position += this.A05.A00;
        }
        byteBuffer.position(outputSize);
        A00.flip();
    }
}
