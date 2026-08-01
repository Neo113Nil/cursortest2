package com.bytedance.sdk.component.sf.pcc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public abstract class tmg {
    private List<String> gm;
    public vh pcc;
    private long oo = 30000;
    public com.bytedance.sdk.component.gm.pcc.pcc sf = new com.bytedance.sdk.component.gm.pcc.pcc();

    public abstract Object gm();

    public abstract String kj();

    public abstract qf oo();

    public hc ork() {
        return null;
    }

    public abstract com.bytedance.sdk.component.sf.pcc.pcc qf();

    public abstract String vj();

    public abstract int vy();

    public abstract Map<String, List<String>> wh();

    public List<String> pcc() {
        return this.gm;
    }

    public long sf() {
        return this.oo;
    }

    public void pcc(vh vhVar) {
        this.pcc = vhVar;
    }

    public pcc vh() {
        return new pcc(this);
    }

    public static class pcc {
        qf gm;
        String kj;
        String oo;
        private long ork;
        com.bytedance.sdk.component.sf.pcc.pcc pcc;
        int qf;
        Map<String, List<String>> sf;
        Object vj;
        private List<String> vy;
        hc wh;

        public pcc() {
            this.ork = 30000L;
            this.sf = new HashMap();
        }

        public pcc pcc(com.bytedance.sdk.component.sf.pcc.pcc pccVar) {
            this.pcc = pccVar;
            return this;
        }

        public pcc pcc(String str) {
            this.kj = str;
            return this;
        }

        public pcc pcc(int i) {
            this.qf = i;
            return this;
        }

        pcc(tmg tmgVar) {
            this.ork = 30000L;
            this.gm = tmgVar.oo();
            this.oo = tmgVar.vj();
            this.sf = tmgVar.wh();
            this.vj = tmgVar.gm();
            this.wh = tmgVar.ork();
            this.pcc = tmgVar.qf();
            this.qf = tmgVar.vy();
            this.kj = tmgVar.kj();
            this.vy = tmgVar.pcc();
            this.ork = tmgVar.sf();
        }

        public pcc pcc(Object obj) {
            this.vj = obj;
            return this;
        }

        public pcc sf(String str) {
            return pcc(qf.gm(str));
        }

        public pcc pcc(qf qfVar) {
            this.gm = qfVar;
            return this;
        }

        public pcc pcc(String str, String str2) {
            return sf(str, str2);
        }

        public pcc sf(String str, String str2) {
            if (!this.sf.containsKey(str)) {
                this.sf.put(str, new ArrayList());
            }
            this.sf.get(str).add(str2);
            return this;
        }

        public pcc pcc() {
            return pcc("GET", (hc) null);
        }

        private pcc pcc(String str, hc hcVar) {
            this.oo = str;
            this.wh = hcVar;
            return this;
        }

        public pcc pcc(hc hcVar) {
            return pcc("POST", hcVar);
        }

        public pcc pcc(List<String> list) {
            this.vy = list;
            return this;
        }

        public pcc pcc(long j) {
            this.ork = j;
            return this;
        }

        public tmg sf() {
            return new tmg() { // from class: com.bytedance.sdk.component.sf.pcc.tmg.pcc.1
                @Override // com.bytedance.sdk.component.sf.pcc.tmg
                public Object gm() {
                    return pcc.this.vj;
                }

                @Override // com.bytedance.sdk.component.sf.pcc.tmg
                public qf oo() {
                    return pcc.this.gm;
                }

                @Override // com.bytedance.sdk.component.sf.pcc.tmg
                public String vj() {
                    return pcc.this.oo;
                }

                @Override // com.bytedance.sdk.component.sf.pcc.tmg
                public Map wh() {
                    return pcc.this.sf;
                }

                @Override // com.bytedance.sdk.component.sf.pcc.tmg
                public com.bytedance.sdk.component.sf.pcc.pcc qf() {
                    return pcc.this.pcc;
                }

                @Override // com.bytedance.sdk.component.sf.pcc.tmg
                public String kj() {
                    return pcc.this.kj;
                }

                @Override // com.bytedance.sdk.component.sf.pcc.tmg
                public int vy() {
                    return pcc.this.qf;
                }

                public String toString() {
                    return "";
                }

                @Override // com.bytedance.sdk.component.sf.pcc.tmg
                public hc ork() {
                    return pcc.this.wh;
                }

                @Override // com.bytedance.sdk.component.sf.pcc.tmg
                public List<String> pcc() {
                    return pcc.this.vy;
                }

                @Override // com.bytedance.sdk.component.sf.pcc.tmg
                public long sf() {
                    return pcc.this.ork;
                }
            };
        }
    }
}
