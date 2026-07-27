package com.bytedance.sdk.component.wh.pcc.oo.sf;

/* loaded from: classes4.dex */
public class pcc {
    private int pcc;
    private int sf;

    public int pcc() {
        return this.pcc;
    }

    public int sf() {
        return this.sf;
    }

    pcc(int i, int i2, long j) {
        if (i2 < i) {
            throw new IllegalStateException("atMostBatchSendCount should meet a condition (atMostBatchSendCount >= maxCacheCount)");
        }
        this.pcc = i;
        this.sf = i2;
    }

    public static pcc pcc(int i, int i2) {
        return new pcc(i, i2, 172800000L);
    }

    public static pcc gm() {
        return new pcc(1, 100, 172800000L);
    }
}
