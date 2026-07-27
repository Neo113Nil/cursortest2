package com.bytedance.sdk.component.gm.pcc;

import android.os.SystemClock;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes4.dex */
public class pcc {
    long gm;
    long kj;
    long oo;
    long pcc = SystemClock.elapsedRealtime();
    long qf;
    long sf;
    long vj;
    long wh;

    public void pcc() {
        this.gm = SystemClock.elapsedRealtime();
    }

    public void sf() {
        this.oo = SystemClock.elapsedRealtime();
    }

    public void gm() {
        this.vj = SystemClock.elapsedRealtime();
    }

    public long oo() {
        return this.pcc;
    }

    public void vj() {
        this.wh = SystemClock.elapsedRealtime();
    }

    public long wh() {
        return this.wh;
    }

    public long qf() {
        return this.gm;
    }

    public long kj() {
        return this.oo;
    }

    public long vy() {
        return this.vj;
    }

    public long ork() {
        return this.qf;
    }

    public void vh() {
        this.qf = SystemClock.elapsedRealtime();
    }

    public long tmg() {
        return this.kj;
    }

    public void hc() {
        this.kj = SystemClock.elapsedRealtime();
    }

    public long gbb() {
        return this.sf;
    }

    public void jr() {
        this.sf = SystemClock.elapsedRealtime();
    }

    public String toString() {
        return "RequestHttpTime{requestBuildTs=" + this.pcc + ", asyncCallExecTs=" + this.sf + ", requestStartExecTs=" + this.gm + ", requestConnectStartTs=" + this.oo + ", requestConnectFinishTs=" + this.vj + ", reqCallServerStartTs=" + this.qf + ", reqCallServerFinishTs=" + this.kj + AbstractJsonLexerKt.END_OBJ;
    }
}
