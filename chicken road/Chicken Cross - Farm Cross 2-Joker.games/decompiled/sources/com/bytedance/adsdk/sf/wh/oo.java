package com.bytedance.adsdk.sf.wh;

/* loaded from: classes4.dex */
public class oo {
    private float pcc;
    private int sf;

    public void pcc(float f) {
        float f2 = this.pcc + f;
        this.pcc = f2;
        int i = this.sf + 1;
        this.sf = i;
        if (i == Integer.MAX_VALUE) {
            this.pcc = f2 / 2.0f;
            this.sf = i / 2;
        }
    }
}
