package d6;

import U5.AbstractC0438e;
import U5.AbstractC0457y;
import U5.C0434a;
import U5.C0435b;
import U5.C0447n;
import U5.C0453u;
import U5.EnumC0446m;
import U5.M;
import U5.l0;
import io.sentry.Session;
import java.lang.reflect.Array;
import java.net.SocketAddress;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import w1.C1726n0;

/* renamed from: d6.s, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0985s extends AbstractC0968b {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0457y f12466a;

    /* renamed from: b, reason: collision with root package name */
    public C0978l f12467b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f12468c;

    /* renamed from: d, reason: collision with root package name */
    public C0447n f12469d;

    /* renamed from: e, reason: collision with root package name */
    public M f12470e;

    /* renamed from: f, reason: collision with root package name */
    public final AbstractC0438e f12471f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0986t f12472g;

    public C0985s(C0986t c0986t, C1726n0 c1726n0, C0974h c0974h) {
        this.f12472g = c0986t;
        M m7 = (M) c1726n0.y();
        if (m7 != null) {
            this.f12470e = m7;
            C0972f c0972f = new C0972f(this, m7, 1);
            c1726n0.getClass();
            android.support.v4.media.session.t E7 = C1726n0.E();
            E7.x0((List) c1726n0.f17805b);
            C0435b c0435b = (C0435b) c1726n0.f17806c;
            p3.f.k(c0435b, Session.JsonKeys.ATTRS);
            E7.f8077c = c0435b;
            Object[][] objArr = (Object[][]) c1726n0.f17807d;
            Object[][] objArr2 = (Object[][]) Array.newInstance((Class<?>) Object.class, objArr.length, 2);
            E7.f8078d = objArr2;
            System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
            E7.Q(c0972f);
            this.f12466a = c0974h.g(E7.T());
        } else {
            this.f12466a = c0974h.g(c1726n0);
        }
        this.f12471f = this.f12466a.d();
    }

    @Override // U5.AbstractC0457y
    public final C0435b c() {
        C0978l c0978l = this.f12467b;
        AbstractC0457y abstractC0457y = this.f12466a;
        if (c0978l == null) {
            return abstractC0457y.c();
        }
        C0435b c3 = abstractC0457y.c();
        c3.getClass();
        C0434a c0434a = C0986t.f12473n;
        C0978l c0978l2 = this.f12467b;
        IdentityHashMap identityHashMap = new IdentityHashMap(1);
        identityHashMap.put(c0434a, c0978l2);
        for (Map.Entry entry : c3.f6455a.entrySet()) {
            if (!identityHashMap.containsKey(entry.getKey())) {
                identityHashMap.put((C0434a) entry.getKey(), entry.getValue());
            }
        }
        return new C0435b(identityHashMap);
    }

    @Override // d6.AbstractC0968b, U5.AbstractC0457y
    public final void m() {
        C0978l c0978l = this.f12467b;
        if (c0978l != null) {
            this.f12467b = null;
            c0978l.f12448f.remove(this);
        }
        super.m();
    }

    @Override // U5.AbstractC0457y
    public final void o(M m7) {
        if (this.f12470e != null) {
            q().o(m7);
            return;
        }
        this.f12470e = m7;
        q().o(new C0972f(this, m7, 1));
    }

    @Override // d6.AbstractC0968b, U5.AbstractC0457y
    public final void p(List list) {
        boolean g3 = C0986t.g(b());
        C0986t c0986t = this.f12472g;
        if (g3 && C0986t.g(list)) {
            if (c0986t.f12474f.containsValue(this.f12467b)) {
                C0978l c0978l = this.f12467b;
                c0978l.getClass();
                this.f12467b = null;
                c0978l.f12448f.remove(this);
            }
            SocketAddress socketAddress = (SocketAddress) ((C0453u) list.get(0)).f6592a.get(0);
            if (c0986t.f12474f.containsKey(socketAddress)) {
                ((C0978l) c0986t.f12474f.get(socketAddress)).a(this);
            }
        } else if (!C0986t.g(b()) || C0986t.g(list)) {
            if (!C0986t.g(b()) && C0986t.g(list)) {
                SocketAddress socketAddress2 = (SocketAddress) ((C0453u) list.get(0)).f6592a.get(0);
                if (c0986t.f12474f.containsKey(socketAddress2)) {
                    ((C0978l) c0986t.f12474f.get(socketAddress2)).a(this);
                }
            }
        } else if (c0986t.f12474f.containsKey(a().f6592a.get(0))) {
            C0978l c0978l2 = (C0978l) c0986t.f12474f.get(a().f6592a.get(0));
            c0978l2.getClass();
            this.f12467b = null;
            c0978l2.f12448f.remove(this);
            C0977k c0977k = c0978l2.f12444b;
            ((AtomicLong) c0977k.f12441b).set(0L);
            ((AtomicLong) c0977k.f12442c).set(0L);
            C0977k c0977k2 = c0978l2.f12445c;
            ((AtomicLong) c0977k2.f12441b).set(0L);
            ((AtomicLong) c0977k2.f12442c).set(0L);
        }
        this.f12466a.p(list);
    }

    @Override // d6.AbstractC0968b
    public final AbstractC0457y q() {
        return this.f12466a;
    }

    public final void r() {
        this.f12468c = true;
        M m7 = this.f12470e;
        l0 l0Var = l0.f6544n;
        p3.f.d("The error status must not be OK", true ^ l0Var.e());
        m7.a(new C0447n(EnumC0446m.f6552c, l0Var));
        this.f12471f.m(2, "Subchannel ejected: {0}", this);
    }

    @Override // d6.AbstractC0968b
    public final String toString() {
        return "OutlierDetectionSubchannel{addresses=" + this.f12466a.b() + '}';
    }
}
