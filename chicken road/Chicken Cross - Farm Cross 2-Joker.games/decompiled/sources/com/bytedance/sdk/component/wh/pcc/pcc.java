package com.bytedance.sdk.component.wh.pcc;

/* loaded from: classes4.dex */
public class pcc {
    private com.bytedance.sdk.component.wh.pcc.oo.sf.pcc gm;
    private vj kj;
    private com.bytedance.sdk.component.wh.pcc.oo.sf.pcc oo;
    private int ork;
    private com.bytedance.sdk.component.wh.pcc.pcc.vj pcc;
    private com.bytedance.sdk.component.wh.pcc.oo.sf.pcc qf;
    private com.bytedance.sdk.component.wh.pcc.sf.gm sf;
    private long tmg;
    private int vh;
    private com.bytedance.sdk.component.wh.pcc.oo.sf.pcc vj;
    private boolean vy;
    private com.bytedance.sdk.component.wh.pcc.oo.sf.pcc wh;

    private pcc() {
        this.ork = 200;
        this.vh = 10;
    }

    public com.bytedance.sdk.component.wh.pcc.pcc.vj pcc() {
        return this.pcc;
    }

    public com.bytedance.sdk.component.wh.pcc.oo.sf.pcc sf() {
        return this.wh;
    }

    public boolean gm() {
        return this.vy;
    }

    public vj oo() {
        return this.kj;
    }

    public long vj() {
        return this.tmg;
    }

    public com.bytedance.sdk.component.wh.pcc.oo.sf.pcc wh() {
        return this.qf;
    }

    public com.bytedance.sdk.component.wh.pcc.oo.sf.pcc qf() {
        return this.gm;
    }

    public com.bytedance.sdk.component.wh.pcc.oo.sf.pcc kj() {
        return this.oo;
    }

    public com.bytedance.sdk.component.wh.pcc.oo.sf.pcc vy() {
        return this.vj;
    }

    public com.bytedance.sdk.component.wh.pcc.sf.gm ork() {
        return this.sf;
    }

    public int vh() {
        return this.ork;
    }

    public int tmg() {
        return this.vh;
    }

    /* renamed from: com.bytedance.sdk.component.wh.pcc.pcc$pcc, reason: collision with other inner class name */
    public static class C0134pcc {
        private com.bytedance.sdk.component.wh.pcc.oo.sf.pcc gm;
        private boolean kj;
        private com.bytedance.sdk.component.wh.pcc.oo.sf.pcc oo;
        private com.bytedance.sdk.component.wh.pcc.sf.gm pcc;
        private com.bytedance.sdk.component.wh.pcc.pcc.vj qf;
        private com.bytedance.sdk.component.wh.pcc.oo.sf.pcc sf;
        private long vh;
        private com.bytedance.sdk.component.wh.pcc.oo.sf.pcc vj;
        private vj wh;
        private int vy = 5000;
        private int ork = 10;

        public C0134pcc pcc(long j) {
            this.vh = j;
            return this;
        }

        public C0134pcc pcc(com.bytedance.sdk.component.wh.pcc.pcc.vj vjVar) {
            this.qf = vjVar;
            return this;
        }

        public C0134pcc pcc(vj vjVar) {
            this.wh = vjVar;
            return this;
        }

        public C0134pcc pcc(com.bytedance.sdk.component.wh.pcc.oo.sf.pcc pccVar) {
            this.sf = pccVar;
            return this;
        }

        public C0134pcc sf(com.bytedance.sdk.component.wh.pcc.oo.sf.pcc pccVar) {
            this.gm = pccVar;
            return this;
        }

        public C0134pcc gm(com.bytedance.sdk.component.wh.pcc.oo.sf.pcc pccVar) {
            this.oo = pccVar;
            return this;
        }

        public C0134pcc pcc(com.bytedance.sdk.component.wh.pcc.sf.gm gmVar) {
            this.pcc = gmVar;
            return this;
        }

        public C0134pcc pcc(int i) {
            this.vy = i;
            return this;
        }

        public C0134pcc sf(int i) {
            this.ork = i;
            return this;
        }

        public pcc pcc() {
            pcc pccVar = new pcc();
            pccVar.sf = this.pcc;
            pccVar.gm = this.sf;
            pccVar.oo = this.gm;
            pccVar.vj = this.oo;
            pccVar.wh = this.vj;
            pccVar.kj = this.wh;
            pccVar.pcc = this.qf;
            pccVar.vy = this.kj;
            pccVar.vh = this.ork;
            pccVar.ork = this.vy;
            pccVar.tmg = this.vh;
            return pccVar;
        }
    }
}
