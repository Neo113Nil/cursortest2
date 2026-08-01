package com.bytedance.sdk.openadsdk.of;

/* loaded from: classes4.dex */
public final class vy {
    public static final vy pcc = new vy(285, 256, 0);
    private final int[] gm;
    private final ork oo;
    private final int[] sf;
    private final int vj;
    private final int wh;

    static int sf(int i, int i2) {
        return i ^ i2;
    }

    public vy(int i, int i2, int i3) {
        this.vj = i2;
        this.wh = i3;
        this.sf = new int[i2];
        this.gm = new int[i2];
        int i4 = 1;
        for (int i5 = 0; i5 < i2; i5++) {
            this.sf[i5] = i4;
            i4 *= 2;
            if (i4 >= i2) {
                i4 = (i4 ^ i) & (i2 - 1);
            }
        }
        for (int i6 = 0; i6 < i2 - 1; i6++) {
            this.gm[this.sf[i6]] = i6;
        }
        this.oo = new ork(this, new int[]{0});
    }

    ork pcc() {
        return this.oo;
    }

    ork pcc(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        if (i2 == 0) {
            return this.oo;
        }
        int[] iArr = new int[i + 1];
        iArr[0] = i2;
        return new ork(this, iArr);
    }

    int pcc(int i) {
        return this.sf[i];
    }

    int sf(int i) {
        if (i == 0) {
            throw new ArithmeticException();
        }
        return this.sf[(this.vj - this.gm[i]) - 1];
    }

    int gm(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return 0;
        }
        int[] iArr = this.sf;
        int[] iArr2 = this.gm;
        return iArr[(iArr2[i] + iArr2[i2]) % (this.vj - 1)];
    }

    public int sf() {
        return this.wh;
    }
}
