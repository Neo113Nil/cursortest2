package P1;

/* loaded from: classes.dex */
public final class s implements N1.e {

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.List f1536g = J1.b.l("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.List f1537h = J1.b.l("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: a, reason: collision with root package name */
    public final M1.k f1538a;

    /* renamed from: b, reason: collision with root package name */
    public final N1.g f1539b;

    /* renamed from: c, reason: collision with root package name */
    public final P1.r f1540c;

    /* renamed from: d, reason: collision with root package name */
    public volatile P1.z f1541d;

    /* renamed from: e, reason: collision with root package name */
    public final I1.t f1542e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f1543f;

    public s(I1.s client, M1.k connection, N1.g gVar, P1.r http2Connection) {
        kotlin.jvm.internal.i.e(client, "client");
        kotlin.jvm.internal.i.e(connection, "connection");
        kotlin.jvm.internal.i.e(http2Connection, "http2Connection");
        this.f1538a = connection;
        this.f1539b = gVar;
        this.f1540c = http2Connection;
        I1.t tVar = I1.t.H2_PRIOR_KNOWLEDGE;
        this.f1542e = client.f813r.contains(tVar) ? tVar : I1.t.HTTP_2;
    }

    @Override // N1.e
    public final V1.u a(I1.v request, long j2) {
        kotlin.jvm.internal.i.e(request, "request");
        P1.z zVar = this.f1541d;
        kotlin.jvm.internal.i.b(zVar);
        return zVar.g();
    }

    @Override // N1.e
    public final V1.w b(I1.y yVar) {
        P1.z zVar = this.f1541d;
        kotlin.jvm.internal.i.b(zVar);
        return zVar.f1573i;
    }

    @Override // N1.e
    public final void c() {
        P1.z zVar = this.f1541d;
        kotlin.jvm.internal.i.b(zVar);
        zVar.g().close();
    }

    @Override // N1.e
    public final void cancel() {
        this.f1543f = true;
        P1.z zVar = this.f1541d;
        if (zVar == null) {
            return;
        }
        zVar.e(P1.EnumC0054b.CANCEL);
    }

    @Override // N1.e
    public final void d() {
        this.f1540c.flush();
    }

    @Override // N1.e
    public final long e(I1.y yVar) {
        if (N1.f.a(yVar)) {
            return J1.b.k(yVar);
        }
        return 0L;
    }

    @Override // N1.e
    public final I1.x f(boolean z2) {
        I1.m mVar;
        P1.z zVar = this.f1541d;
        if (zVar == null) {
            throw new java.io.IOException("stream wasn't created");
        }
        synchronized (zVar) {
            zVar.f1575k.h();
            while (zVar.f1571g.isEmpty() && zVar.f1577m == null) {
                try {
                    zVar.l();
                } catch (java.lang.Throwable th) {
                    zVar.f1575k.k();
                    throw th;
                }
            }
            zVar.f1575k.k();
            if (zVar.f1571g.isEmpty()) {
                java.io.IOException iOException = zVar.f1578n;
                if (iOException != null) {
                    throw iOException;
                }
                P1.EnumC0054b enumC0054b = zVar.f1577m;
                kotlin.jvm.internal.i.b(enumC0054b);
                throw new P1.F(enumC0054b);
            }
            java.lang.Object removeFirst = zVar.f1571g.removeFirst();
            kotlin.jvm.internal.i.d(removeFirst, "headersQueue.removeFirst()");
            mVar = (I1.m) removeFirst;
        }
        I1.t protocol = this.f1542e;
        kotlin.jvm.internal.i.e(protocol, "protocol");
        java.util.ArrayList arrayList = new java.util.ArrayList(20);
        int size = mVar.size();
        N1.h hVar = null;
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 1;
            java.lang.String name = mVar.b(i2);
            java.lang.String value = mVar.d(i2);
            if (kotlin.jvm.internal.i.a(name, ":status")) {
                hVar = a.AbstractC0059a.v(kotlin.jvm.internal.i.h(value, "HTTP/1.1 "));
            } else if (!f1537h.contains(name)) {
                kotlin.jvm.internal.i.e(name, "name");
                kotlin.jvm.internal.i.e(value, "value");
                arrayList.add(name);
                arrayList.add(y1.g.c0(value).toString());
            }
            i2 = i3;
        }
        if (hVar == null) {
            throw new java.net.ProtocolException("Expected ':status' header not present");
        }
        I1.x xVar = new I1.x();
        xVar.f845b = protocol;
        xVar.f846c = hVar.f1160b;
        xVar.f847d = (java.lang.String) hVar.f1162d;
        java.lang.Object[] array = arrayList.toArray(new java.lang.String[0]);
        if (array == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        I1.l lVar = new I1.l(0);
        i1.AbstractC0196o.L(lVar.f750a, (java.lang.String[]) array);
        xVar.f849f = lVar;
        if (z2 && xVar.f846c == 100) {
            return null;
        }
        return xVar;
    }

    @Override // N1.e
    public final M1.k g() {
        return this.f1538a;
    }

    @Override // N1.e
    public final void h(I1.v request) {
        int i2;
        P1.z zVar;
        kotlin.jvm.internal.i.e(request, "request");
        if (this.f1541d != null) {
            return;
        }
        boolean z2 = true;
        boolean z3 = request.f837d != null;
        I1.m mVar = request.f836c;
        java.util.ArrayList arrayList = new java.util.ArrayList(mVar.size() + 4);
        arrayList.add(new P1.C0055c(P1.C0055c.f1454f, request.f835b));
        V1.j jVar = P1.C0055c.f1455g;
        I1.o url = request.f834a;
        kotlin.jvm.internal.i.e(url, "url");
        java.lang.String b2 = url.b();
        java.lang.String d2 = url.d();
        if (d2 != null) {
            b2 = b2 + '?' + ((java.lang.Object) d2);
        }
        arrayList.add(new P1.C0055c(jVar, b2));
        java.lang.String a2 = request.f836c.a("Host");
        if (a2 != null) {
            arrayList.add(new P1.C0055c(P1.C0055c.f1457i, a2));
        }
        arrayList.add(new P1.C0055c(P1.C0055c.f1456h, url.f761a));
        int size = mVar.size();
        int i3 = 0;
        while (i3 < size) {
            int i4 = i3 + 1;
            java.lang.String b3 = mVar.b(i3);
            java.util.Locale US = java.util.Locale.US;
            kotlin.jvm.internal.i.d(US, "US");
            java.lang.String lowerCase = b3.toLowerCase(US);
            kotlin.jvm.internal.i.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (!f1536g.contains(lowerCase) || (lowerCase.equals("te") && kotlin.jvm.internal.i.a(mVar.d(i3), "trailers"))) {
                arrayList.add(new P1.C0055c(lowerCase, mVar.d(i3)));
            }
            i3 = i4;
        }
        P1.r rVar = this.f1540c;
        rVar.getClass();
        boolean z4 = !z3;
        synchronized (rVar.f1533w) {
            synchronized (rVar) {
                try {
                    if (rVar.f1516e > 1073741823) {
                        rVar.k(P1.EnumC0054b.REFUSED_STREAM);
                    }
                    if (rVar.f1517f) {
                        throw new P1.C0053a();
                    }
                    i2 = rVar.f1516e;
                    rVar.f1516e = i2 + 2;
                    zVar = new P1.z(i2, rVar, z4, false, null);
                    if (z3 && rVar.t < rVar.f1531u && zVar.f1569e < zVar.f1570f) {
                        z2 = false;
                    }
                    if (zVar.i()) {
                        rVar.f1513b.put(java.lang.Integer.valueOf(i2), zVar);
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
            rVar.f1533w.k(z4, i2, arrayList);
        }
        if (z2) {
            rVar.f1533w.flush();
        }
        this.f1541d = zVar;
        if (this.f1543f) {
            P1.z zVar2 = this.f1541d;
            kotlin.jvm.internal.i.b(zVar2);
            zVar2.e(P1.EnumC0054b.CANCEL);
            throw new java.io.IOException("Canceled");
        }
        P1.z zVar3 = this.f1541d;
        kotlin.jvm.internal.i.b(zVar3);
        P1.y yVar = zVar3.f1575k;
        long j2 = this.f1539b.f1156g;
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
        yVar.g(j2, timeUnit);
        P1.z zVar4 = this.f1541d;
        kotlin.jvm.internal.i.b(zVar4);
        zVar4.f1576l.g(this.f1539b.f1157h, timeUnit);
    }
}
