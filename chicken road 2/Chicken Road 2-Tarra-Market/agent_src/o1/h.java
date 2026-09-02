package o1;

import a.AbstractC0009a;
import i1.C0071b;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class h implements m1.b {

    /* renamed from: f, reason: collision with root package name */
    public static final List f6289f = j1.d.k("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* renamed from: g, reason: collision with root package name */
    public static final List f6290g = j1.d.k("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: a, reason: collision with root package name */
    public final m1.e f6291a;

    /* renamed from: b, reason: collision with root package name */
    public final l1.g f6292b;

    /* renamed from: c, reason: collision with root package name */
    public final r f6293c;

    /* renamed from: d, reason: collision with root package name */
    public w f6294d;

    /* renamed from: e, reason: collision with root package name */
    public final i1.s f6295e;

    public h(i1.r rVar, m1.e eVar, l1.g gVar, r rVar2) {
        this.f6291a = eVar;
        this.f6292b = gVar;
        this.f6293c = rVar2;
        rVar.getClass();
        List list = i1.r.f1386v;
        i1.s sVar = i1.s.H2_PRIOR_KNOWLEDGE;
        this.f6295e = list.contains(sVar) ? sVar : i1.s.HTTP_2;
    }

    @Override // m1.b
    public final s1.r a(i1.w wVar, long j2) {
        return this.f6294d.e();
    }

    @Override // m1.b
    public final void b() {
        this.f6294d.e().close();
    }

    @Override // m1.b
    public final void c() {
        this.f6293c.flush();
    }

    @Override // m1.b
    public final void cancel() {
        w wVar = this.f6294d;
        if (wVar == null || !wVar.d(6)) {
            return;
        }
        wVar.f6363d.o(wVar.f6362c, 6);
    }

    @Override // m1.b
    public final void d(i1.w wVar) {
        int i2;
        w wVar2;
        if (this.f6294d != null) {
            return;
        }
        boolean z2 = true;
        boolean z3 = wVar.f1433d != null;
        i1.m mVar = wVar.f1432c;
        ArrayList arrayList = new ArrayList(mVar.d() + 4);
        arrayList.add(new b(b.f6256f, wVar.f1431b));
        s1.h hVar = b.f6257g;
        i1.o oVar = wVar.f1430a;
        arrayList.add(new b(hVar, AbstractC0009a.C(oVar)));
        String a2 = wVar.f1432c.a("Host");
        if (a2 != null) {
            arrayList.add(new b(b.f6259i, a2));
        }
        arrayList.add(new b(b.f6258h, oVar.f1376a));
        int d2 = mVar.d();
        for (int i3 = 0; i3 < d2; i3++) {
            s1.h c2 = s1.h.c(mVar.b(i3).toLowerCase(Locale.US));
            if (!f6289f.contains(c2.l())) {
                arrayList.add(new b(c2, mVar.e(i3)));
            }
        }
        r rVar = this.f6293c;
        boolean z4 = !z3;
        synchronized (rVar.f6336r) {
            synchronized (rVar) {
                try {
                    if (rVar.f6324f > 1073741823) {
                        rVar.l(5);
                    }
                    if (rVar.f6325g) {
                        throw new C0810a();
                    }
                    i2 = rVar.f6324f;
                    rVar.f6324f = i2 + 2;
                    wVar2 = new w(i2, rVar, z4, false, null);
                    if (z3 && rVar.f6331m != 0 && wVar2.f6361b != 0) {
                        z2 = false;
                    }
                    if (wVar2.g()) {
                        rVar.f6321c.put(Integer.valueOf(i2), wVar2);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            x xVar = rVar.f6336r;
            synchronized (xVar) {
                if (xVar.f6376e) {
                    throw new IOException("closed");
                }
                xVar.j(z4, i2, arrayList);
            }
        }
        if (z2) {
            rVar.f6336r.flush();
        }
        this.f6294d = wVar2;
        i1.t tVar = wVar2.f6368i;
        long j2 = this.f6291a.f6139j;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        tVar.g(j2, timeUnit);
        this.f6294d.f6369j.g(this.f6291a.f6140k, timeUnit);
    }

    @Override // m1.b
    public final i1.x e(boolean z2) {
        i1.m mVar;
        w wVar = this.f6294d;
        synchronized (wVar) {
            wVar.f6368i.i();
            while (wVar.f6364e.isEmpty() && wVar.f6370k == 0) {
                try {
                    wVar.i();
                } catch (Throwable th) {
                    wVar.f6368i.n();
                    throw th;
                }
            }
            wVar.f6368i.n();
            if (wVar.f6364e.isEmpty()) {
                throw new A(wVar.f6370k);
            }
            mVar = (i1.m) wVar.f6364e.removeFirst();
        }
        i1.s sVar = this.f6295e;
        ArrayList arrayList = new ArrayList(20);
        int d2 = mVar.d();
        H0.b bVar = null;
        for (int i2 = 0; i2 < d2; i2++) {
            String b2 = mVar.b(i2);
            String e2 = mVar.e(i2);
            if (b2.equals(":status")) {
                bVar = H0.b.f("HTTP/1.1 " + e2);
            } else if (!f6290g.contains(b2)) {
                C0071b.f1293e.getClass();
                arrayList.add(b2);
                arrayList.add(e2.trim());
            }
        }
        if (bVar == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        i1.x xVar = new i1.x();
        xVar.f1437b = sVar;
        xVar.f1438c = bVar.f180b;
        xVar.f1439d = (String) bVar.f182d;
        String[] strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
        i1.l lVar = new i1.l(0);
        Collections.addAll(lVar.f1365a, strArr);
        xVar.f1441f = lVar;
        if (z2) {
            C0071b.f1293e.getClass();
            if (xVar.f1438c == 100) {
                return null;
            }
        }
        return xVar;
    }

    @Override // m1.b
    public final i1.z f(i1.y yVar) {
        this.f6292b.f6118f.getClass();
        yVar.a("Content-Type");
        long a2 = m1.d.a(yVar);
        g gVar = new g(this, this.f6294d.f6366g);
        Logger logger = s1.l.f6634a;
        return new i1.z(a2, new s1.n(gVar), 1);
    }
}
