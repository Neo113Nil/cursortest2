package com.bytedance.sdk.openadsdk.of;

import java.lang.reflect.Array;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class gm {
    private final int gm;
    private final byte[][] pcc;
    private final int sf;

    public gm(int i, int i2) {
        this.pcc = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i2, i);
        this.sf = i;
        this.gm = i2;
    }

    public int pcc() {
        return this.gm;
    }

    public int sf() {
        return this.sf;
    }

    public byte pcc(int i, int i2) {
        return this.pcc[i2][i];
    }

    public byte[][] gm() {
        return this.pcc;
    }

    public void pcc(int i, int i2, int i3) {
        this.pcc[i2][i] = (byte) i3;
    }

    public void pcc(int i, int i2, boolean z) {
        this.pcc[i2][i] = z ? (byte) 1 : (byte) 0;
    }

    public void pcc(byte b) {
        for (byte[] bArr : this.pcc) {
            Arrays.fill(bArr, b);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((this.sf * 2 * this.gm) + 2);
        for (int i = 0; i < this.gm; i++) {
            byte[] bArr = this.pcc[i];
            for (int i2 = 0; i2 < this.sf; i2++) {
                byte b = bArr[i2];
                if (b == 0) {
                    sb.append(" 0");
                } else if (b == 1) {
                    sb.append(" 1");
                } else {
                    sb.append("  ");
                }
            }
            sb.append('\n');
        }
        return sb.toString();
    }
}
