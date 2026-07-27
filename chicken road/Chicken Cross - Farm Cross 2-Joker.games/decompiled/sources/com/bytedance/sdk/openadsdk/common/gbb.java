package com.bytedance.sdk.openadsdk.common;

import com.bytedance.sdk.openadsdk.common.pcc;

/* loaded from: classes4.dex */
public class gbb {
    private final Runnable gm;
    private final pcc.sf oo;
    private final com.bytedance.sdk.openadsdk.component.reward.pcc.sf pcc;
    private pcc.InterfaceC0142pcc qf;
    private final String sf;
    private boolean vj;
    private dax wh;

    public static class pcc {
        private final Runnable gm;
        private final pcc.sf oo;
        private final com.bytedance.sdk.openadsdk.component.reward.pcc.sf pcc;
        private final String sf;
        private boolean vj = false;
        private dax wh = null;
        private pcc.InterfaceC0142pcc qf = null;

        public pcc(com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar, String str, Runnable runnable, pcc.sf sfVar2) {
            this.pcc = sfVar;
            this.sf = str;
            this.gm = runnable;
            this.oo = sfVar2;
        }

        public pcc pcc(boolean z) {
            this.vj = z;
            return this;
        }

        public pcc pcc(dax daxVar) {
            this.wh = daxVar;
            return this;
        }

        public pcc pcc(pcc.InterfaceC0142pcc interfaceC0142pcc) {
            this.qf = interfaceC0142pcc;
            return this;
        }

        public gbb pcc() {
            if (this.pcc == null) {
                throw new IllegalArgumentException("RewardFullContext cannot be null");
            }
            if (this.gm == null) {
                throw new IllegalArgumentException("Runnable finishAction cannot be null");
            }
            if (this.oo == null) {
                throw new IllegalArgumentException("SkipResultHandler cannot be null");
            }
            return new gbb(this);
        }
    }

    private gbb(pcc pccVar) {
        this.pcc = pccVar.pcc;
        this.sf = pccVar.sf;
        this.gm = pccVar.gm;
        this.oo = pccVar.oo;
        this.vj = pccVar.vj;
        this.wh = pccVar.wh;
        this.qf = pccVar.qf;
    }

    public com.bytedance.sdk.openadsdk.component.reward.pcc.sf pcc() {
        return this.pcc;
    }

    public String sf() {
        return this.sf;
    }

    public Runnable gm() {
        return this.gm;
    }

    public pcc.sf oo() {
        return this.oo;
    }

    public boolean vj() {
        return this.vj;
    }

    public dax wh() {
        return this.wh;
    }

    public pcc.InterfaceC0142pcc qf() {
        return this.qf;
    }
}
