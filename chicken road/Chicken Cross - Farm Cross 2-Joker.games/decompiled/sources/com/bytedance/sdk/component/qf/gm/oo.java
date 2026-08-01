package com.bytedance.sdk.component.qf.gm;

/* loaded from: classes4.dex */
public class oo {
    private pcc pcc;
    private sf sf;

    public enum pcc {
        DEBUG,
        INFO,
        ERROR,
        OFF
    }

    public interface sf {
    }

    private oo() {
        this.pcc = pcc.OFF;
        this.sf = new com.bytedance.sdk.component.qf.gm.sf();
    }

    private static class gm {
        private static final oo pcc = new oo();
    }

    public static void pcc(pcc pccVar) {
        synchronized (oo.class) {
            gm.pcc.pcc = pccVar;
        }
    }
}
