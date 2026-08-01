package com.bytedance.adsdk.sf.gm.sf;

import java.util.Arrays;

/* loaded from: classes4.dex */
public class oo {
    private final float[] pcc;
    private final int[] sf;

    public oo(float[] fArr, int[] iArr) {
        this.pcc = fArr;
        this.sf = iArr;
    }

    public float[] pcc() {
        return this.pcc;
    }

    public int[] sf() {
        return this.sf;
    }

    public int gm() {
        return this.sf.length;
    }

    public void pcc(oo ooVar, oo ooVar2, float f) {
        if (ooVar.sf.length != ooVar2.sf.length) {
            throw new IllegalArgumentException("Cannot interpolate between gradients. Lengths vary (" + ooVar.sf.length + " vs " + ooVar2.sf.length + ")");
        }
        for (int i = 0; i < ooVar.sf.length; i++) {
            this.pcc[i] = com.bytedance.adsdk.sf.wh.vj.pcc(ooVar.pcc[i], ooVar2.pcc[i], f);
            this.sf[i] = com.bytedance.adsdk.sf.wh.sf.pcc(f, ooVar.sf[i], ooVar2.sf[i]);
        }
    }

    public oo pcc(float[] fArr) {
        int[] iArr = new int[fArr.length];
        for (int i = 0; i < fArr.length; i++) {
            iArr[i] = pcc(fArr[i]);
        }
        return new oo(fArr, iArr);
    }

    private int pcc(float f) {
        int binarySearch = Arrays.binarySearch(this.pcc, f);
        if (binarySearch >= 0) {
            return this.sf[binarySearch];
        }
        int i = -(binarySearch + 1);
        if (i == 0) {
            return this.sf[0];
        }
        int[] iArr = this.sf;
        if (i == iArr.length - 1) {
            return iArr[iArr.length - 1];
        }
        float[] fArr = this.pcc;
        int i2 = i - 1;
        float f2 = fArr[i2];
        return com.bytedance.adsdk.sf.wh.sf.pcc((f - f2) / (fArr[i] - f2), iArr[i2], iArr[i]);
    }
}
