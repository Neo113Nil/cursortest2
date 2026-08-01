package com.bytedance.adsdk.sf.qf;

/* loaded from: classes4.dex */
public class gm {
    private float pcc;
    private float sf;

    public gm(float f, float f2) {
        this.pcc = f;
        this.sf = f2;
    }

    public gm() {
        this(1.0f, 1.0f);
    }

    public float pcc() {
        return this.pcc;
    }

    public float sf() {
        return this.sf;
    }

    public void pcc(float f, float f2) {
        this.pcc = f;
        this.sf = f2;
    }

    public boolean sf(float f, float f2) {
        return this.pcc == f && this.sf == f2;
    }

    public String toString() {
        return pcc() + "x" + sf();
    }
}
