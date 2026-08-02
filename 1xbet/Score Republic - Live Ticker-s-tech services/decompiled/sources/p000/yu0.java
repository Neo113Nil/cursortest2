package p000;

import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class yu0 {

    /* JADX INFO: renamed from: a */
    public cv0 f9467a;

    /* JADX INFO: renamed from: d */
    public Long f9470d;

    /* JADX INFO: renamed from: e */
    public int f9471e;

    /* JADX INFO: renamed from: b */
    public volatile f50 f9468b = new f50(18);

    /* JADX INFO: renamed from: c */
    public f50 f9469c = new f50(18);

    /* JADX INFO: renamed from: f */
    public final HashSet f9472f = new HashSet();

    public yu0(cv0 cv0Var) {
        this.f9467a = cv0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m5834a(gv0 gv0Var) {
        if (m5837d() && !gv0Var.f2949y) {
            gv0Var.m2155H();
        } else if (!m5837d() && gv0Var.f2949y) {
            gv0Var.f2949y = false;
            C0511nl c0511nl = gv0Var.f2950z;
            if (c0511nl != null) {
                gv0Var.f2944A.mo3228a(c0511nl);
                gv0Var.f2945B.mo5320h(2, "Subchannel unejected: {0}", gv0Var);
            }
        }
        gv0Var.f2948x = this;
        this.f9472f.add(gv0Var);
    }

    /* JADX INFO: renamed from: b */
    public final void m5835b(long j) {
        this.f9470d = Long.valueOf(j);
        this.f9471e++;
        Iterator it = this.f9472f.iterator();
        while (it.hasNext()) {
            ((gv0) it.next()).m2155H();
        }
    }

    /* JADX INFO: renamed from: c */
    public final long m5836c() {
        return ((AtomicLong) this.f9469c.f2314l).get() + ((AtomicLong) this.f9469c.f2313k).get();
    }

    /* JADX INFO: renamed from: d */
    public final boolean m5837d() {
        return this.f9470d != null;
    }

    /* JADX INFO: renamed from: e */
    public final void m5838e() {
        a90.m132p("not currently ejected", this.f9470d != null);
        this.f9470d = null;
        for (gv0 gv0Var : this.f9472f) {
            gv0Var.f2949y = false;
            C0511nl c0511nl = gv0Var.f2950z;
            if (c0511nl != null) {
                gv0Var.f2944A.mo3228a(c0511nl);
                gv0Var.f2945B.mo5320h(2, "Subchannel unejected: {0}", gv0Var);
            }
        }
    }

    public final String toString() {
        return "AddressTracker{subchannels=" + this.f9472f + '}';
    }
}
