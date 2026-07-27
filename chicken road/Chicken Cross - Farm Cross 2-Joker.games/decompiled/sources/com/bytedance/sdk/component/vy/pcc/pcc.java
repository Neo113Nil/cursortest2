package com.bytedance.sdk.component.vy.pcc;

/* loaded from: classes4.dex */
public class pcc {
    private static volatile pcc sf;
    private volatile sf pcc;

    private pcc() {
    }

    public static pcc pcc() {
        if (sf == null) {
            synchronized (pcc.class) {
                if (sf == null) {
                    sf = new pcc();
                }
            }
        }
        return sf;
    }

    public void pcc(sf sfVar) {
        this.pcc = sfVar;
    }

    public sf sf() {
        return this.pcc;
    }
}
