package F4;

import B.K;
import L4.C0229l;
import L4.G;
import L4.I;
import a3.AbstractC0467k;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import o0.C2202f;
import o4.AbstractC2227e;
import t3.AbstractC2425d;

/* loaded from: classes.dex */
public final class p implements D4.d {

    /* renamed from: g, reason: collision with root package name */
    public static final List f1635g = z4.b.k("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* renamed from: h, reason: collision with root package name */
    public static final List f1636h = z4.b.k("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: a, reason: collision with root package name */
    public final C4.k f1637a;

    /* renamed from: b, reason: collision with root package name */
    public final D4.f f1638b;

    /* renamed from: c, reason: collision with root package name */
    public final o f1639c;

    /* renamed from: d, reason: collision with root package name */
    public volatile w f1640d;

    /* renamed from: e, reason: collision with root package name */
    public final y4.v f1641e;
    public volatile boolean f;

    public p(y4.u uVar, C4.k kVar, D4.f fVar, o oVar) {
        kotlin.jvm.internal.l.f("client", uVar);
        kotlin.jvm.internal.l.f("connection", kVar);
        kotlin.jvm.internal.l.f("http2Connection", oVar);
        this.f1637a = kVar;
        this.f1638b = fVar;
        this.f1639c = oVar;
        y4.v vVar = y4.v.f21431p;
        this.f1641e = uVar.f21403B.contains(vVar) ? vVar : y4.v.f21430o;
    }

    @Override // D4.d
    public final I a(y4.z zVar) {
        w wVar = this.f1640d;
        kotlin.jvm.internal.l.c(wVar);
        return wVar.i;
    }

    @Override // D4.d
    public final G b(C0.c cVar, long j5) {
        kotlin.jvm.internal.l.f("request", cVar);
        w wVar = this.f1640d;
        kotlin.jvm.internal.l.c(wVar);
        return wVar.g();
    }

    @Override // D4.d
    public final void c() {
        w wVar = this.f1640d;
        kotlin.jvm.internal.l.c(wVar);
        wVar.g().close();
    }

    @Override // D4.d
    public final void cancel() {
        this.f = true;
        w wVar = this.f1640d;
        if (wVar != null) {
            wVar.e(9);
        }
    }

    @Override // D4.d
    public final void d() {
        this.f1639c.flush();
    }

    @Override // D4.d
    public final void e(C0.c cVar) {
        int i;
        w wVar;
        kotlin.jvm.internal.l.f("request", cVar);
        if (this.f1640d != null) {
            return;
        }
        boolean z3 = true;
        boolean z5 = ((y4.x) cVar.f814e) != null;
        y4.m mVar = (y4.m) cVar.f813d;
        ArrayList arrayList = new ArrayList(mVar.size() + 4);
        arrayList.add(new C0122b(C0122b.f, (String) cVar.f812c));
        C0229l c0229l = C0122b.f1570g;
        y4.n nVar = (y4.n) cVar.f811b;
        kotlin.jvm.internal.l.f("url", nVar);
        String b3 = nVar.b();
        String d5 = nVar.d();
        if (d5 != null) {
            b3 = b3 + '?' + d5;
        }
        arrayList.add(new C0122b(c0229l, b3));
        String c5 = ((y4.m) cVar.f813d).c("Host");
        if (c5 != null) {
            arrayList.add(new C0122b(C0122b.i, c5));
        }
        arrayList.add(new C0122b(C0122b.f1571h, nVar.f21362a));
        int size = mVar.size();
        for (int i5 = 0; i5 < size; i5++) {
            String e3 = mVar.e(i5);
            Locale locale = Locale.US;
            kotlin.jvm.internal.l.e("US", locale);
            String lowerCase = e3.toLowerCase(locale);
            kotlin.jvm.internal.l.e("this as java.lang.String).toLowerCase(locale)", lowerCase);
            if (!f1635g.contains(lowerCase) || (lowerCase.equals("te") && kotlin.jvm.internal.l.a(mVar.g(i5), "trailers"))) {
                arrayList.add(new C0122b(lowerCase, mVar.g(i5)));
            }
        }
        o oVar = this.f1639c;
        oVar.getClass();
        boolean z6 = !z5;
        synchronized (oVar.f1616G) {
            synchronized (oVar) {
                try {
                    if (oVar.f1623o > 1073741823) {
                        oVar.i(8);
                    }
                    if (oVar.f1624p) {
                        throw new C0121a();
                    }
                    i = oVar.f1623o;
                    oVar.f1623o = i + 2;
                    wVar = new w(i, oVar, z6, false, null);
                    if (z5 && oVar.f1613D < oVar.f1614E && wVar.f1667e < wVar.f) {
                        z3 = false;
                    }
                    if (wVar.i()) {
                        oVar.f1620l.put(Integer.valueOf(i), wVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            oVar.f1616G.i(z6, i, arrayList);
        }
        if (z3) {
            oVar.f1616G.flush();
        }
        this.f1640d = wVar;
        if (this.f) {
            w wVar2 = this.f1640d;
            kotlin.jvm.internal.l.c(wVar2);
            wVar2.e(9);
            throw new IOException("Canceled");
        }
        w wVar3 = this.f1640d;
        kotlin.jvm.internal.l.c(wVar3);
        v vVar = wVar3.f1671k;
        long j5 = this.f1638b.f981g;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        vVar.g(j5);
        w wVar4 = this.f1640d;
        kotlin.jvm.internal.l.c(wVar4);
        wVar4.f1672l.g(this.f1638b.f982h);
    }

    @Override // D4.d
    public final y4.y f(boolean z3) {
        y4.m mVar;
        w wVar = this.f1640d;
        if (wVar == null) {
            throw new IOException("stream wasn't created");
        }
        synchronized (wVar) {
            wVar.f1671k.h();
            while (wVar.f1668g.isEmpty() && wVar.f1673m == 0) {
                try {
                    wVar.l();
                } catch (Throwable th) {
                    wVar.f1671k.k();
                    throw th;
                }
            }
            wVar.f1671k.k();
            if (wVar.f1668g.isEmpty()) {
                IOException iOException = wVar.f1674n;
                if (iOException != null) {
                    throw iOException;
                }
                int i = wVar.f1673m;
                AbstractC0467k.x(i);
                throw new C(i);
            }
            Object removeFirst = wVar.f1668g.removeFirst();
            kotlin.jvm.internal.l.e("headersQueue.removeFirst()", removeFirst);
            mVar = (y4.m) removeFirst;
        }
        y4.v vVar = this.f1641e;
        kotlin.jvm.internal.l.f("protocol", vVar);
        ArrayList arrayList = new ArrayList(20);
        int size = mVar.size();
        K k5 = null;
        for (int i5 = 0; i5 < size; i5++) {
            String e3 = mVar.e(i5);
            String g5 = mVar.g(i5);
            if (kotlin.jvm.internal.l.a(e3, ":status")) {
                k5 = AbstractC2425d.B("HTTP/1.1 " + g5);
            } else if (!f1636h.contains(e3)) {
                kotlin.jvm.internal.l.f("name", e3);
                kotlin.jvm.internal.l.f("value", g5);
                arrayList.add(e3);
                arrayList.add(AbstractC2227e.Q0(g5).toString());
            }
        }
        if (k5 == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        y4.y yVar = new y4.y();
        yVar.f21438b = vVar;
        yVar.f21439c = k5.f637b;
        yVar.f21440d = (String) k5.f639d;
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        C2202f c2202f = new C2202f(1);
        ArrayList arrayList2 = c2202f.f18548a;
        kotlin.jvm.internal.l.f("<this>", arrayList2);
        kotlin.jvm.internal.l.f("elements", strArr);
        arrayList2.addAll(X3.l.o0(strArr));
        yVar.f = c2202f;
        if (z3 && yVar.f21439c == 100) {
            return null;
        }
        return yVar;
    }

    @Override // D4.d
    public final long g(y4.z zVar) {
        if (D4.e.a(zVar)) {
            return z4.b.j(zVar);
        }
        return 0L;
    }

    @Override // D4.d
    public final C4.k h() {
        return this.f1637a;
    }
}
