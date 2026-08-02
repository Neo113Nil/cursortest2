package d6;

import U5.C0447n;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: d6.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0978l {

    /* renamed from: a, reason: collision with root package name */
    public C0981o f12443a;

    /* renamed from: d, reason: collision with root package name */
    public Long f12446d;

    /* renamed from: e, reason: collision with root package name */
    public int f12447e;

    /* renamed from: b, reason: collision with root package name */
    public volatile C0977k f12444b = new C0977k(0);

    /* renamed from: c, reason: collision with root package name */
    public C0977k f12445c = new C0977k(0);

    /* renamed from: f, reason: collision with root package name */
    public final HashSet f12448f = new HashSet();

    public C0978l(C0981o c0981o) {
        this.f12443a = c0981o;
    }

    public final void a(C0985s c0985s) {
        if (d() && !c0985s.f12468c) {
            c0985s.r();
        } else if (!d() && c0985s.f12468c) {
            c0985s.f12468c = false;
            C0447n c0447n = c0985s.f12469d;
            if (c0447n != null) {
                c0985s.f12470e.a(c0447n);
                c0985s.f12471f.m(2, "Subchannel unejected: {0}", c0985s);
            }
        }
        c0985s.f12467b = this;
        this.f12448f.add(c0985s);
    }

    public final void b(long j) {
        this.f12446d = Long.valueOf(j);
        this.f12447e++;
        Iterator it = this.f12448f.iterator();
        while (it.hasNext()) {
            ((C0985s) it.next()).r();
        }
    }

    public final long c() {
        return ((AtomicLong) this.f12445c.f12442c).get() + ((AtomicLong) this.f12445c.f12441b).get();
    }

    public final boolean d() {
        return this.f12446d != null;
    }

    public final void e() {
        p3.f.q("not currently ejected", this.f12446d != null);
        this.f12446d = null;
        Iterator it = this.f12448f.iterator();
        while (it.hasNext()) {
            C0985s c0985s = (C0985s) it.next();
            c0985s.f12468c = false;
            C0447n c0447n = c0985s.f12469d;
            if (c0447n != null) {
                c0985s.f12470e.a(c0447n);
                c0985s.f12471f.m(2, "Subchannel unejected: {0}", c0985s);
            }
        }
    }

    public final String toString() {
        return "AddressTracker{subchannels=" + this.f12448f + '}';
    }
}
