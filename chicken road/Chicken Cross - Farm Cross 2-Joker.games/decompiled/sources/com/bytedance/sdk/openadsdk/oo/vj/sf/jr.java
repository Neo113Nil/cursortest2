package com.bytedance.sdk.openadsdk.oo.vj.sf;

import com.bytedance.sdk.openadsdk.core.model.of;

/* loaded from: classes4.dex */
public class jr {
    private int gm;
    private com.bykv.vk.openvk.pcc.pcc.pcc.gm.gm oo;
    private long pcc;
    private String sf;
    private of vj;

    public jr(long j, String str, int i, com.bykv.vk.openvk.pcc.pcc.pcc.gm.gm gmVar, of ofVar) {
        this.pcc = j;
        this.sf = str;
        this.gm = i;
        this.oo = gmVar;
        this.vj = ofVar;
    }

    public long pcc() {
        return this.pcc;
    }

    public String sf() {
        return this.sf;
    }

    public int gm() {
        return this.gm;
    }

    public com.bykv.vk.openvk.pcc.pcc.pcc.gm.gm oo() {
        return this.oo;
    }

    public of vj() {
        return this.vj;
    }

    public static class pcc {
        private com.bykv.vk.openvk.pcc.pcc.pcc.gm.pcc gbb;
        private int kj;
        private boolean oo;
        private int ork;
        private int tmg;
        private int vh;
        private boolean vj;
        private int vy;
        private long pcc = 0;
        private long sf = 0;
        private long gm = 0;
        private long wh = 0;
        private boolean qf = false;
        private boolean hc = false;

        public long pcc() {
            return this.wh;
        }

        public void pcc(long j) {
            this.wh = j;
        }

        public long sf() {
            return this.pcc;
        }

        public void sf(long j) {
            this.pcc = j;
            dax();
        }

        private void dax() {
            long j = this.gm;
            if (j > 0) {
                long j2 = this.pcc;
                if (j2 > j) {
                    long j3 = j2 % j;
                    this.pcc = j3;
                    if (j3 == 0) {
                        this.pcc = j;
                    }
                }
            }
        }

        public long gm() {
            return this.sf;
        }

        public void gm(long j) {
            this.sf = j;
        }

        public long oo() {
            return this.gm;
        }

        public void oo(long j) {
            this.gm = j;
            dax();
        }

        public int vj() {
            return this.kj;
        }

        public void pcc(int i) {
            this.kj = i;
        }

        public int wh() {
            return this.vy;
        }

        public void sf(int i) {
            this.vy = i;
        }

        public int qf() {
            long j = this.gm;
            if (j <= 0) {
                return 0;
            }
            return Math.min((int) ((this.pcc * 100) / j), 100);
        }

        public int kj() {
            return this.ork;
        }

        public void gm(int i) {
            this.ork = i;
        }

        public int vy() {
            return this.vh;
        }

        public int ork() {
            return this.tmg;
        }

        public void oo(int i) {
            this.tmg = i;
        }

        public boolean vh() {
            return this.hc;
        }

        public boolean tmg() {
            return this.qf;
        }

        public void pcc(boolean z) {
            this.qf = z;
        }

        public void pcc(com.bykv.vk.openvk.pcc.pcc.pcc.gm.pcc pccVar) {
            this.gbb = pccVar;
        }

        public com.bykv.vk.openvk.pcc.pcc.pcc.gm.pcc hc() {
            return this.gbb;
        }

        public void sf(boolean z) {
            this.oo = z;
        }

        public boolean gbb() {
            return this.oo;
        }

        public void gm(boolean z) {
            this.vj = z;
        }

        public boolean jr() {
            return this.vj;
        }
    }
}
