package com.bytedance.sdk.component.adexpress.sf;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class hc {
    private JSONObject atb;
    private boolean dax;
    private int fum;
    private Map<String, String> gbb;
    private String gm;
    private int gpj;
    private String hc;
    private int jr;
    private boolean jsj;
    private String kj;
    private int lo;
    private String lq;
    private int lu;
    private JSONObject mk;
    private final String mu;
    private String nac;
    private final String nn;
    private String of;
    private vy oo;
    private int ork;
    private JSONObject pcc;
    private final boolean pq;
    private String qf;
    private int qy;
    private final boolean rnn;
    private vj sf;
    private int tmg;
    private JSONObject tsz;
    private int tz;
    private long vh;
    private int vj;
    private boolean vy;
    private String wh;
    private boolean ye;
    private double yt;
    private int zti;

    public hc(pcc pccVar) {
        this.pcc = pccVar.pcc;
        this.sf = pccVar.sf;
        this.gm = pccVar.gm;
        this.oo = pccVar.oo;
        this.vj = pccVar.vj;
        this.wh = pccVar.wh;
        this.qf = pccVar.qf;
        this.kj = pccVar.kj;
        this.vy = pccVar.vy;
        this.ork = pccVar.ork;
        this.vh = pccVar.vh;
        this.tmg = pccVar.tmg;
        this.hc = pccVar.hc;
        this.gbb = pccVar.gbb;
        this.jr = pccVar.jr;
        this.dax = pccVar.dax;
        this.nac = pccVar.nac;
        this.lu = pccVar.lu;
        this.gpj = pccVar.gpj;
        this.lo = pccVar.lo;
        this.fum = pccVar.fum;
        this.tz = pccVar.tz;
        this.of = pccVar.of;
        this.yt = pccVar.yt;
        this.qy = pccVar.qy;
        this.jsj = pccVar.jsj;
        this.tsz = pccVar.tsz;
        this.mk = pccVar.mk;
        this.atb = pccVar.atb;
        this.ye = pccVar.ye;
        this.lq = pccVar.lq;
        this.zti = pccVar.nn;
        this.pq = pccVar.zti;
        this.mu = pccVar.pq;
        this.nn = pccVar.mu;
        this.rnn = pccVar.rnn;
    }

    public boolean pcc() {
        return this.jsj;
    }

    public double sf() {
        return this.yt;
    }

    public JSONObject gm() {
        vj vjVar;
        if (this.pcc == null && (vjVar = this.sf) != null) {
            this.pcc = vjVar.pcc();
        }
        return this.pcc;
    }

    public String oo() {
        return this.gm;
    }

    public vy vj() {
        return this.oo;
    }

    public int wh() {
        return this.vj;
    }

    public int qf() {
        return this.qy;
    }

    public boolean kj() {
        return this.vy;
    }

    public long vy() {
        return this.vh;
    }

    public int ork() {
        return this.tmg;
    }

    public Map<String, String> vh() {
        return this.gbb;
    }

    public int tmg() {
        return this.jr;
    }

    public boolean hc() {
        return this.dax;
    }

    public String gbb() {
        return this.nac;
    }

    public int jr() {
        return this.lu;
    }

    public int dax() {
        return this.gpj;
    }

    public int nac() {
        return this.lo;
    }

    public JSONObject lu() {
        return this.tsz;
    }

    public JSONObject gpj() {
        return this.mk;
    }

    public JSONObject lo() {
        return this.atb;
    }

    public int fum() {
        return this.fum;
    }

    public int tz() {
        return this.tz;
    }

    public boolean of() {
        return this.ye;
    }

    public String yt() {
        return this.lq;
    }

    public int qy() {
        return this.zti;
    }

    public boolean jsj() {
        return this.pq;
    }

    public String tsz() {
        return this.mu;
    }

    public String mk() {
        return this.nn;
    }

    public boolean atb() {
        return this.rnn;
    }

    public static class pcc {
        private JSONObject atb;
        private boolean dax;
        private int fum;
        private Map<String, String> gbb;
        private String gm;
        private int gpj;
        private String hc;
        private int jr;
        private String kj;
        private int lo;
        private String lq;
        private int lu;
        private JSONObject mk;
        private String mu;
        private String nac;
        private int nn;
        private String of;
        private vy oo;
        private int ork;
        private JSONObject pcc;
        private String pq;
        private String qf;
        private int qy;
        private vj sf;
        private int tmg;
        private JSONObject tsz;
        private int tz;
        private long vh;
        private int vj;
        private boolean vy;
        private String wh;
        private boolean ye;
        private double yt;
        private boolean jsj = true;
        private boolean zti = true;
        private boolean rnn = false;

        public pcc pcc(vj vjVar) {
            this.sf = vjVar;
            return this;
        }

        public pcc pcc(boolean z) {
            this.jsj = z;
            return this;
        }

        public pcc pcc(String str) {
            this.gm = str;
            return this;
        }

        public pcc pcc(vy vyVar) {
            this.oo = vyVar;
            return this;
        }

        public pcc pcc(int i) {
            this.vj = i;
            return this;
        }

        public pcc sf(String str) {
            this.wh = str;
            return this;
        }

        public pcc gm(String str) {
            this.qf = str;
            return this;
        }

        public pcc oo(String str) {
            this.kj = str;
            return this;
        }

        public pcc sf(boolean z) {
            this.vy = z;
            return this;
        }

        public pcc gm(boolean z) {
            this.zti = z;
            return this;
        }

        public pcc sf(int i) {
            this.ork = i;
            return this;
        }

        public pcc pcc(long j) {
            this.vh = j;
            return this;
        }

        public pcc gm(int i) {
            this.tmg = i;
            return this;
        }

        public pcc pcc(Map<String, String> map) {
            this.gbb = map;
            return this;
        }

        public pcc oo(int i) {
            this.jr = i;
            return this;
        }

        public pcc oo(boolean z) {
            this.dax = z;
            return this;
        }

        public pcc vj(String str) {
            this.nac = str;
            return this;
        }

        public pcc vj(int i) {
            this.qy = i;
            return this;
        }

        public pcc vj(boolean z) {
            this.ye = z;
            return this;
        }

        public pcc wh(String str) {
            this.lq = str;
            return this;
        }

        public pcc wh(int i) {
            this.nn = i;
            return this;
        }

        public hc pcc() {
            return new hc(this);
        }

        public pcc pcc(double d) {
            this.yt = d;
            return this;
        }

        public pcc qf(String str) {
            this.pq = str;
            return this;
        }

        public pcc kj(String str) {
            this.mu = str;
            return this;
        }

        public pcc wh(boolean z) {
            this.rnn = z;
            return this;
        }
    }
}
