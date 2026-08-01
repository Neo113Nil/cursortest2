package com.bytedance.sdk.component.vj.sf.gm;

import android.content.Context;
import com.bytedance.sdk.component.vj.fum;
import com.bytedance.sdk.component.vj.hc;
import com.bytedance.sdk.component.vj.lo;
import com.bytedance.sdk.component.vj.lu;
import com.bytedance.sdk.component.vj.nac;
import com.bytedance.sdk.component.vj.tmg;
import java.util.concurrent.ExecutorService;

/* loaded from: classes4.dex */
public class vj implements hc {
    private com.bytedance.sdk.component.vj.oo gm;
    private lo kj;
    private nac oo;
    private boolean ork;
    private tmg pcc;
    private com.bytedance.sdk.component.vj.sf qf;
    private ExecutorService sf;
    private lu vj;
    private fum vy;
    private com.bytedance.sdk.component.vj.gm wh;

    private vj(pcc pccVar) {
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
    }

    @Override // com.bytedance.sdk.component.vj.hc
    public ExecutorService pcc() {
        return this.sf;
    }

    @Override // com.bytedance.sdk.component.vj.hc
    public com.bytedance.sdk.component.vj.oo gm() {
        return this.gm;
    }

    @Override // com.bytedance.sdk.component.vj.hc
    public com.bytedance.sdk.component.vj.gm oo() {
        return this.wh;
    }

    @Override // com.bytedance.sdk.component.vj.hc
    public lo sf() {
        return this.kj;
    }

    @Override // com.bytedance.sdk.component.vj.hc
    public com.bytedance.sdk.component.vj.sf vj() {
        return this.qf;
    }

    @Override // com.bytedance.sdk.component.vj.hc
    public fum wh() {
        return this.vy;
    }

    @Override // com.bytedance.sdk.component.vj.hc
    public boolean qf() {
        return this.ork;
    }

    public static vj pcc(Context context) {
        return new pcc().pcc();
    }

    public static class pcc {
        private com.bytedance.sdk.component.vj.oo gm;
        private lo kj;
        private nac oo;
        private boolean ork;
        private tmg pcc;
        private com.bytedance.sdk.component.vj.sf qf;
        private ExecutorService sf;
        private lu vj;
        private fum vy;
        private com.bytedance.sdk.component.vj.gm wh;

        public pcc pcc(com.bytedance.sdk.component.vj.sf sfVar) {
            this.qf = sfVar;
            return this;
        }

        public pcc pcc(boolean z) {
            this.ork = z;
            return this;
        }

        public pcc pcc(fum fumVar) {
            this.vy = fumVar;
            return this;
        }

        public pcc pcc(lo loVar) {
            this.kj = loVar;
            return this;
        }

        public pcc pcc(com.bytedance.sdk.component.vj.oo ooVar) {
            this.gm = ooVar;
            return this;
        }

        public vj pcc() {
            return new vj(this);
        }
    }
}
