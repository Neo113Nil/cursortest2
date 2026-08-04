package p028d6;

import U5.C0447n;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import p113p3.f;

/* JADX INFO: loaded from: classes2.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o f12449a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Long f12452d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12453e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile k f12450b = new k(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public k f12451c = new k(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashSet f12454f = new HashSet();

    public l(o oVar) {
        this.f12449a = oVar;
    }

    public final void a(s sVar) {
        if (d() && !sVar.f12474c) {
            sVar.r();
        } else if (!d() && sVar.f12474c) {
            sVar.f12474c = false;
            C0447n c0447n = sVar.f12475d;
            if (c0447n != null) {
                sVar.f12476e.a(c0447n);
                sVar.f12477f.m(2, "Subchannel unejected: {0}", sVar);
            }
        }
        sVar.f12473b = this;
        this.f12454f.add(sVar);
    }

    public final void b(long j) {
        this.f12452d = Long.valueOf(j);
        this.f12453e++;
        Iterator it = this.f12454f.iterator();
        while (it.hasNext()) {
            ((s) it.next()).r();
        }
    }

    public final long c() {
        return ((AtomicLong) this.f12451c.f12448c).get() + ((AtomicLong) this.f12451c.f12447b).get();
    }

    public final boolean d() {
        return this.f12452d != null;
    }

    public final void e() {
        f.q("not currently ejected", this.f12452d != null);
        this.f12452d = null;
        for (s sVar : this.f12454f) {
            sVar.f12474c = false;
            C0447n c0447n = sVar.f12475d;
            if (c0447n != null) {
                sVar.f12476e.a(c0447n);
                sVar.f12477f.m(2, "Subchannel unejected: {0}", sVar);
            }
        }
    }

    public final String toString() {
        return "AddressTracker{subchannels=" + this.f12454f + '}';
    }
}
