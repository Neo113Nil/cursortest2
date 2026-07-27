package com.bytedance.sdk.component.sf.pcc;

import com.bytedance.sdk.component.qf.pcc;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public abstract class vh implements Cloneable {
    public TimeUnit gm;
    public final pcc.sf kj;
    public long oo;
    public List<kj> pcc;
    public TimeUnit qf;
    public long sf;
    public TimeUnit vj;
    public long wh;

    public abstract sf pcc(tmg tmgVar);

    public abstract oo sf();

    public vh(pcc pccVar) {
        this.sf = pccVar.gm;
        this.oo = pccVar.vj;
        this.wh = pccVar.qf;
        this.pcc = pccVar.pcc;
        this.gm = pccVar.oo;
        this.vj = pccVar.wh;
        this.qf = pccVar.kj;
        this.pcc = pccVar.pcc;
        this.kj = pccVar.sf;
    }

    public pcc.sf pcc() {
        return this.kj;
    }

    public static final class pcc {
        public long gm;
        public TimeUnit kj;
        public TimeUnit oo;
        public final List<kj> pcc;
        public long qf;
        pcc.sf sf;
        public long vj;
        public TimeUnit wh;

        public pcc() {
            this.pcc = new ArrayList();
            this.gm = 10000L;
            this.oo = TimeUnit.MILLISECONDS;
            this.vj = 10000L;
            this.wh = TimeUnit.MILLISECONDS;
            this.qf = 10000L;
            this.kj = TimeUnit.MILLISECONDS;
        }

        public pcc(String str) {
            this.pcc = new ArrayList();
            this.gm = 10000L;
            this.oo = TimeUnit.MILLISECONDS;
            this.vj = 10000L;
            this.wh = TimeUnit.MILLISECONDS;
            this.qf = 10000L;
            this.kj = TimeUnit.MILLISECONDS;
        }

        public pcc(vh vhVar) {
            this.pcc = new ArrayList();
            this.gm = 10000L;
            this.oo = TimeUnit.MILLISECONDS;
            this.vj = 10000L;
            this.wh = TimeUnit.MILLISECONDS;
            this.qf = 10000L;
            this.kj = TimeUnit.MILLISECONDS;
            this.gm = vhVar.sf;
            this.oo = vhVar.gm;
            this.vj = vhVar.oo;
            this.wh = vhVar.vj;
            this.qf = vhVar.wh;
            this.kj = vhVar.qf;
        }

        public pcc pcc(long j, TimeUnit timeUnit) {
            this.gm = j;
            this.oo = timeUnit;
            return this;
        }

        public pcc sf(long j, TimeUnit timeUnit) {
            this.vj = j;
            this.wh = timeUnit;
            return this;
        }

        public pcc gm(long j, TimeUnit timeUnit) {
            this.qf = j;
            this.kj = timeUnit;
            return this;
        }

        public pcc pcc(kj kjVar) {
            this.pcc.add(kjVar);
            return this;
        }

        public pcc pcc(pcc.sf sfVar) {
            this.sf = sfVar;
            return this;
        }

        public vh pcc() {
            return com.bytedance.sdk.component.sf.pcc.pcc.pcc.pcc(this);
        }
    }

    public pcc gm() {
        return new pcc(this);
    }
}
