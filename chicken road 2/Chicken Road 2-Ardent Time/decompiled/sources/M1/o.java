package M1;

/* loaded from: classes.dex */
public final class o implements N1.e {

    /* renamed from: a, reason: collision with root package name */
    public int f1095a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f1096b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Object f1097c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f1098d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Object f1099e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f1100f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Iterable f1101g;

    public o(I1.C0026a c0026a, C.j routeDatabase, M1.i call) {
        java.util.List l2;
        kotlin.jvm.internal.i.e(routeDatabase, "routeDatabase");
        kotlin.jvm.internal.i.e(call, "call");
        this.f1096b = c0026a;
        this.f1097c = routeDatabase;
        this.f1098d = call;
        i1.C0199r c0199r = i1.C0199r.f3325a;
        this.f1099e = c0199r;
        this.f1100f = c0199r;
        this.f1101g = new java.util.ArrayList();
        I1.o url = c0026a.f677h;
        kotlin.jvm.internal.i.e(url, "url");
        java.net.URI f2 = url.f();
        if (f2.getHost() == null) {
            l2 = J1.b.l(java.net.Proxy.NO_PROXY);
        } else {
            java.util.List<java.net.Proxy> select = c0026a.f676g.select(f2);
            l2 = (select == null || select.isEmpty()) ? J1.b.l(java.net.Proxy.NO_PROXY) : J1.b.w(select);
        }
        this.f1099e = l2;
        this.f1095a = 0;
    }

    @Override // N1.e
    public V1.u a(I1.v request, long j2) {
        kotlin.jvm.internal.i.e(request, "request");
        if ("chunked".equalsIgnoreCase(request.f836c.a("Transfer-Encoding"))) {
            int i2 = this.f1095a;
            if (i2 != 1) {
                throw new java.lang.IllegalStateException(kotlin.jvm.internal.i.h(java.lang.Integer.valueOf(i2), "state: ").toString());
            }
            this.f1095a = 2;
            return new O1.c(this);
        }
        if (j2 == -1) {
            throw new java.lang.IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        int i3 = this.f1095a;
        if (i3 != 1) {
            throw new java.lang.IllegalStateException(kotlin.jvm.internal.i.h(java.lang.Integer.valueOf(i3), "state: ").toString());
        }
        this.f1095a = 2;
        return new O1.f(this);
    }

    @Override // N1.e
    public V1.w b(I1.y yVar) {
        if (!N1.f.a(yVar)) {
            return j(0L);
        }
        if ("chunked".equalsIgnoreCase(I1.y.a(yVar, "Transfer-Encoding"))) {
            I1.o oVar = yVar.f857a.f834a;
            int i2 = this.f1095a;
            if (i2 != 4) {
                throw new java.lang.IllegalStateException(kotlin.jvm.internal.i.h(java.lang.Integer.valueOf(i2), "state: ").toString());
            }
            this.f1095a = 5;
            return new O1.d(this, oVar);
        }
        long k2 = J1.b.k(yVar);
        if (k2 != -1) {
            return j(k2);
        }
        int i3 = this.f1095a;
        if (i3 != 4) {
            throw new java.lang.IllegalStateException(kotlin.jvm.internal.i.h(java.lang.Integer.valueOf(i3), "state: ").toString());
        }
        this.f1095a = 5;
        ((M1.k) this.f1097c).k();
        return new O1.g(this);
    }

    @Override // N1.e
    public void c() {
        ((V1.p) this.f1099e).flush();
    }

    @Override // N1.e
    public void cancel() {
        java.net.Socket socket = ((M1.k) this.f1097c).f1070c;
        if (socket == null) {
            return;
        }
        J1.b.e(socket);
    }

    @Override // N1.e
    public void d() {
        ((V1.p) this.f1099e).flush();
    }

    @Override // N1.e
    public long e(I1.y yVar) {
        if (!N1.f.a(yVar)) {
            return 0L;
        }
        if ("chunked".equalsIgnoreCase(I1.y.a(yVar, "Transfer-Encoding"))) {
            return -1L;
        }
        return J1.b.k(yVar);
    }

    @Override // N1.e
    public I1.x f(boolean z2) {
        O1.a aVar = (O1.a) this.f1100f;
        int i2 = this.f1095a;
        if (i2 != 1 && i2 != 2 && i2 != 3) {
            throw new java.lang.IllegalStateException(kotlin.jvm.internal.i.h(java.lang.Integer.valueOf(i2), "state: ").toString());
        }
        I1.n nVar = null;
        try {
            java.lang.String o2 = ((V1.q) aVar.f1167c).o(aVar.f1166b);
            aVar.f1166b -= o2.length();
            N1.h v2 = a.AbstractC0059a.v(o2);
            int i3 = v2.f1160b;
            I1.x xVar = new I1.x();
            xVar.f845b = (I1.t) v2.f1161c;
            xVar.f846c = i3;
            xVar.f847d = (java.lang.String) v2.f1162d;
            xVar.f849f = aVar.c().c();
            if (z2 && i3 == 100) {
                return null;
            }
            if (i3 == 100) {
                this.f1095a = 3;
            } else if (102 > i3 || i3 >= 200) {
                this.f1095a = 4;
            } else {
                this.f1095a = 3;
            }
            return xVar;
        } catch (java.io.EOFException e2) {
            I1.o oVar = ((M1.k) this.f1097c).f1069b.f660a.f677h;
            oVar.getClass();
            try {
                I1.n nVar2 = new I1.n();
                nVar2.c(oVar, "/...");
                nVar = nVar2;
            } catch (java.lang.IllegalArgumentException unused) {
            }
            kotlin.jvm.internal.i.b(nVar);
            nVar.f753b = I1.C0027b.b("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 251);
            nVar.f754c = I1.C0027b.b("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 251);
            throw new java.io.IOException(kotlin.jvm.internal.i.h(nVar.a().f768h, "unexpected end of stream on "), e2);
        }
    }

    @Override // N1.e
    public M1.k g() {
        return (M1.k) this.f1097c;
    }

    @Override // N1.e
    public void h(I1.v request) {
        kotlin.jvm.internal.i.e(request, "request");
        java.net.Proxy.Type type = ((M1.k) this.f1097c).f1069b.f661b.type();
        kotlin.jvm.internal.i.d(type, "connection.route().proxy.type()");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(request.f835b);
        sb.append(' ');
        I1.o oVar = request.f834a;
        if (oVar.f769i || type != java.net.Proxy.Type.HTTP) {
            java.lang.String b2 = oVar.b();
            java.lang.String d2 = oVar.d();
            if (d2 != null) {
                b2 = b2 + '?' + ((java.lang.Object) d2);
            }
            sb.append(b2);
        } else {
            sb.append(oVar);
        }
        sb.append(" HTTP/1.1");
        java.lang.String sb2 = sb.toString();
        kotlin.jvm.internal.i.d(sb2, "StringBuilder().apply(builderAction).toString()");
        k(request.f836c, sb2);
    }

    public boolean i() {
        return this.f1095a < ((java.util.List) this.f1099e).size() || !((java.util.ArrayList) this.f1101g).isEmpty();
    }

    public O1.e j(long j2) {
        int i2 = this.f1095a;
        if (i2 != 4) {
            throw new java.lang.IllegalStateException(kotlin.jvm.internal.i.h(java.lang.Integer.valueOf(i2), "state: ").toString());
        }
        this.f1095a = 5;
        return new O1.e(this, j2);
    }

    public void k(I1.m mVar, java.lang.String requestLine) {
        kotlin.jvm.internal.i.e(requestLine, "requestLine");
        int i2 = this.f1095a;
        if (i2 != 0) {
            throw new java.lang.IllegalStateException(kotlin.jvm.internal.i.h(java.lang.Integer.valueOf(i2), "state: ").toString());
        }
        V1.p pVar = (V1.p) this.f1099e;
        pVar.h(requestLine);
        pVar.h("\r\n");
        int size = mVar.size();
        for (int i3 = 0; i3 < size; i3++) {
            pVar.h(mVar.b(i3));
            pVar.h(": ");
            pVar.h(mVar.d(i3));
            pVar.h("\r\n");
        }
        pVar.h("\r\n");
        this.f1095a = 1;
    }

    public o(I1.s sVar, M1.k connection, V1.q source, V1.p sink) {
        kotlin.jvm.internal.i.e(connection, "connection");
        kotlin.jvm.internal.i.e(source, "source");
        kotlin.jvm.internal.i.e(sink, "sink");
        this.f1096b = sVar;
        this.f1097c = connection;
        this.f1098d = source;
        this.f1099e = sink;
        this.f1100f = new O1.a(source);
    }
}
