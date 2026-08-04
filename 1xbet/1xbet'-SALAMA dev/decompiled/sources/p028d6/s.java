package p028d6;

import U5.AbstractC0438e;
import U5.AbstractC0457y;
import U5.C0434a;
import U5.C0435b;
import U5.C0447n;
import U5.C0453u;
import U5.EnumC0446m;
import U5.M;
import U5.l0;
import android.support.v4.media.session.t;
import io.sentry.Session;
import java.lang.reflect.Array;
import java.net.SocketAddress;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import p113p3.f;
import p155w1.C1017n0;

/* JADX INFO: loaded from: classes2.dex */
public final class s extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC0457y f12472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l f12473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f12474c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C0447n f12475d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public M f12476e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AbstractC0438e f12477f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ t f12478g;

    public s(t tVar, C1017n0 c1017n0, h hVar) {
        this.f12478g = tVar;
        M m7 = (M) c1017n0.y();
        if (m7 != null) {
            this.f12476e = m7;
            f fVar = new f(this, m7, 1);
            c1017n0.getClass();
            t tVarE = C1017n0.E();
            tVarE.x0((List) c1017n0.f17811b);
            C0435b c0435b = (C0435b) c1017n0.f17812c;
            f.k(c0435b, Session.JsonKeys.ATTRS);
            tVarE.f8077c = c0435b;
            Object[][] objArr = (Object[][]) c1017n0.f17813d;
            Object[][] objArr2 = (Object[][]) Array.newInstance((Class<?>) Object.class, objArr.length, 2);
            tVarE.f8078d = objArr2;
            System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
            tVarE.Q(fVar);
            this.f12472a = hVar.g(tVarE.T());
        } else {
            this.f12472a = hVar.g(c1017n0);
        }
        this.f12477f = this.f12472a.d();
    }

    @Override // U5.AbstractC0457y
    public final C0435b c() {
        l lVar = this.f12473b;
        AbstractC0457y abstractC0457y = this.f12472a;
        if (lVar == null) {
            return abstractC0457y.c();
        }
        C0435b c0435bC = abstractC0457y.c();
        c0435bC.getClass();
        C0434a c0434a = t.f12479n;
        l lVar2 = this.f12473b;
        IdentityHashMap identityHashMap = new IdentityHashMap(1);
        identityHashMap.put(c0434a, lVar2);
        for (Map.Entry entry : c0435bC.f6455a.entrySet()) {
            if (!identityHashMap.containsKey(entry.getKey())) {
                identityHashMap.put((C0434a) entry.getKey(), entry.getValue());
            }
        }
        return new C0435b(identityHashMap);
    }

    @Override // p028d6.b, U5.AbstractC0457y
    public final void m() {
        l lVar = this.f12473b;
        if (lVar != null) {
            this.f12473b = null;
            lVar.f12454f.remove(this);
        }
        super.m();
    }

    @Override // U5.AbstractC0457y
    public final void o(M m7) {
        if (this.f12476e != null) {
            q().o(m7);
            return;
        }
        this.f12476e = m7;
        q().o(new f(this, m7, 1));
    }

    @Override // p028d6.b, U5.AbstractC0457y
    public final void p(List list) {
        boolean zG = t.g(b());
        t tVar = this.f12478g;
        if (zG && t.g(list)) {
            if (tVar.f12480f.containsValue(this.f12473b)) {
                l lVar = this.f12473b;
                lVar.getClass();
                this.f12473b = null;
                lVar.f12454f.remove(this);
            }
            SocketAddress socketAddress = (SocketAddress) ((C0453u) list.get(0)).f6592a.get(0);
            if (tVar.f12480f.containsKey(socketAddress)) {
                ((l) tVar.f12480f.get(socketAddress)).a(this);
            }
        } else if (!t.g(b()) || t.g(list)) {
            if (!t.g(b()) && t.g(list)) {
                SocketAddress socketAddress2 = (SocketAddress) ((C0453u) list.get(0)).f6592a.get(0);
                if (tVar.f12480f.containsKey(socketAddress2)) {
                    ((l) tVar.f12480f.get(socketAddress2)).a(this);
                }
            }
        } else if (tVar.f12480f.containsKey(a().f6592a.get(0))) {
            l lVar2 = (l) tVar.f12480f.get(a().f6592a.get(0));
            lVar2.getClass();
            this.f12473b = null;
            lVar2.f12454f.remove(this);
            k kVar = lVar2.f12450b;
            ((AtomicLong) kVar.f12447b).set(0L);
            ((AtomicLong) kVar.f12448c).set(0L);
            k kVar2 = lVar2.f12451c;
            ((AtomicLong) kVar2.f12447b).set(0L);
            ((AtomicLong) kVar2.f12448c).set(0L);
        }
        this.f12472a.p(list);
    }

    @Override // p028d6.b
    public final AbstractC0457y q() {
        return this.f12472a;
    }

    public final void r() {
        this.f12474c = true;
        M m7 = this.f12476e;
        l0 l0Var = l0.f6544n;
        f.d("The error status must not be OK", true ^ l0Var.e());
        m7.a(new C0447n(EnumC0446m.f6552c, l0Var));
        this.f12477f.m(2, "Subchannel ejected: {0}", this);
    }

    @Override // p028d6.b
    public final String toString() {
        return "OutlierDetectionSubchannel{addresses=" + this.f12472a.b() + '}';
    }
}
