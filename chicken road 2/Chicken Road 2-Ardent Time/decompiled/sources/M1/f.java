package M1;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final M1.l f1042a;

    /* renamed from: b, reason: collision with root package name */
    public final I1.C0026a f1043b;

    /* renamed from: c, reason: collision with root package name */
    public final M1.i f1044c;

    /* renamed from: d, reason: collision with root package name */
    public M1.n f1045d;

    /* renamed from: e, reason: collision with root package name */
    public M1.o f1046e;

    /* renamed from: f, reason: collision with root package name */
    public int f1047f;

    /* renamed from: g, reason: collision with root package name */
    public int f1048g;

    /* renamed from: h, reason: collision with root package name */
    public int f1049h;

    /* renamed from: i, reason: collision with root package name */
    public I1.A f1050i;

    public f(M1.l connectionPool, I1.C0026a c0026a, M1.i call) {
        kotlin.jvm.internal.i.e(connectionPool, "connectionPool");
        kotlin.jvm.internal.i.e(call, "call");
        this.f1042a = connectionPool;
        this.f1043b = c0026a;
        this.f1044c = call;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0354 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02f4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v15, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final M1.k a(int i2, int i3, int i4, boolean z2, boolean z3) {
        java.util.ArrayList arrayList;
        java.lang.String hostName;
        int i5;
        java.util.List list;
        boolean contains;
        C.j jVar;
        java.net.Socket h2;
        while (!this.f1044c.f1065m) {
            M1.k kVar = this.f1044c.f1060h;
            if (kVar != null) {
                synchronized (kVar) {
                    try {
                        if (!kVar.f1077j && b(kVar.f1069b.f660a.f677h)) {
                            h2 = null;
                        }
                        h2 = this.f1044c.h();
                    } catch (java.lang.Throwable th) {
                        throw th;
                    }
                }
                if (this.f1044c.f1060h != null) {
                    if (h2 != null) {
                        throw new java.lang.IllegalStateException("Check failed.");
                    }
                    if (!kVar.i(z3)) {
                        return kVar;
                    }
                    kVar.k();
                    if (this.f1050i == null) {
                        M1.n nVar = this.f1045d;
                        if (nVar == null ? true : nVar.a()) {
                            continue;
                        } else {
                            M1.o oVar = this.f1046e;
                            if (!(oVar == null ? true : oVar.i())) {
                                throw new java.io.IOException("exhausted all routes");
                            }
                        }
                    }
                } else {
                    if (h2 != null) {
                        J1.b.e(h2);
                    }
                    M1.i call = this.f1044c;
                    kotlin.jvm.internal.i.e(call, "call");
                }
            }
            this.f1047f = 0;
            this.f1048g = 0;
            this.f1049h = 0;
            if (this.f1042a.a(this.f1043b, this.f1044c, null, false)) {
                kVar = this.f1044c.f1060h;
                kotlin.jvm.internal.i.b(kVar);
                M1.i call2 = this.f1044c;
                kotlin.jvm.internal.i.e(call2, "call");
            } else {
                I1.A a2 = this.f1050i;
                try {
                    if (a2 != null) {
                        this.f1050i = null;
                    } else {
                        M1.n nVar2 = this.f1045d;
                        if (nVar2 == null || !nVar2.a()) {
                            M1.o oVar2 = this.f1046e;
                            if (oVar2 == null) {
                                I1.C0026a c0026a = this.f1043b;
                                M1.i iVar = this.f1044c;
                                oVar2 = new M1.o(c0026a, iVar.f1053a.f819y, iVar);
                                this.f1046e = oVar2;
                            }
                            if (!oVar2.i()) {
                                throw new java.util.NoSuchElementException();
                            }
                            arrayList = new java.util.ArrayList();
                            while (oVar2.f1095a < ((java.util.List) oVar2.f1099e).size()) {
                                boolean z4 = oVar2.f1095a < ((java.util.List) oVar2.f1099e).size();
                                I1.C0026a c0026a2 = (I1.C0026a) oVar2.f1096b;
                                if (!z4) {
                                    throw new java.net.SocketException("No route to " + c0026a2.f677h.f764d + "; exhausted proxy configurations: " + ((java.util.List) oVar2.f1099e));
                                }
                                java.util.List list2 = (java.util.List) oVar2.f1099e;
                                int i6 = oVar2.f1095a;
                                oVar2.f1095a = i6 + 1;
                                java.net.Proxy proxy = (java.net.Proxy) list2.get(i6);
                                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                                oVar2.f1100f = arrayList2;
                                if (proxy.type() == java.net.Proxy.Type.DIRECT || proxy.type() == java.net.Proxy.Type.SOCKS) {
                                    I1.o oVar3 = c0026a2.f677h;
                                    hostName = oVar3.f764d;
                                    i5 = oVar3.f765e;
                                } else {
                                    java.net.SocketAddress proxyAddress = proxy.address();
                                    if (!(proxyAddress instanceof java.net.InetSocketAddress)) {
                                        throw new java.lang.IllegalArgumentException(kotlin.jvm.internal.i.h(proxyAddress.getClass(), "Proxy.address() is not an InetSocketAddress: ").toString());
                                    }
                                    kotlin.jvm.internal.i.d(proxyAddress, "proxyAddress");
                                    java.net.InetSocketAddress inetSocketAddress = (java.net.InetSocketAddress) proxyAddress;
                                    kotlin.jvm.internal.i.e(inetSocketAddress, "<this>");
                                    java.net.InetAddress address = inetSocketAddress.getAddress();
                                    if (address == null) {
                                        hostName = inetSocketAddress.getHostName();
                                        kotlin.jvm.internal.i.d(hostName, "hostName");
                                    } else {
                                        hostName = address.getHostAddress();
                                        kotlin.jvm.internal.i.d(hostName, "address.hostAddress");
                                    }
                                    i5 = inetSocketAddress.getPort();
                                }
                                if (1 > i5 || i5 >= 65536) {
                                    throw new java.net.SocketException("No route to " + hostName + ':' + i5 + "; port is out of range");
                                }
                                if (proxy.type() == java.net.Proxy.Type.SOCKS) {
                                    arrayList2.add(java.net.InetSocketAddress.createUnresolved(hostName, i5));
                                } else {
                                    byte[] bArr = J1.b.f932a;
                                    kotlin.jvm.internal.i.e(hostName, "<this>");
                                    y1.f fVar = J1.b.f936e;
                                    fVar.getClass();
                                    if (fVar.f8503a.matcher(hostName).matches()) {
                                        list = u0.AbstractC0995a.q(java.net.InetAddress.getByName(hostName));
                                    } else {
                                        M1.i call3 = (M1.i) oVar2.f1098d;
                                        kotlin.jvm.internal.i.e(call3, "call");
                                        c0026a2.f670a.getClass();
                                        try {
                                            java.net.InetAddress[] allByName = java.net.InetAddress.getAllByName(hostName);
                                            kotlin.jvm.internal.i.d(allByName, "getAllByName(hostname)");
                                            java.util.List S2 = i1.AbstractC0189h.S(allByName);
                                            if (S2.isEmpty()) {
                                                throw new java.net.UnknownHostException(c0026a2.f670a + " returned no addresses for " + hostName);
                                            }
                                            list = S2;
                                        } catch (java.lang.NullPointerException e2) {
                                            java.net.UnknownHostException unknownHostException = new java.net.UnknownHostException(kotlin.jvm.internal.i.h(hostName, "Broken system behaviour for dns lookup of "));
                                            unknownHostException.initCause(e2);
                                            throw unknownHostException;
                                        }
                                    }
                                    java.util.Iterator it = list.iterator();
                                    while (it.hasNext()) {
                                        arrayList2.add(new java.net.InetSocketAddress((java.net.InetAddress) it.next(), i5));
                                    }
                                }
                                java.util.Iterator it2 = oVar2.f1100f.iterator();
                                while (it2.hasNext()) {
                                    I1.A a3 = new I1.A((I1.C0026a) oVar2.f1096b, proxy, (java.net.InetSocketAddress) it2.next());
                                    C.j jVar2 = (C.j) oVar2.f1097c;
                                    synchronized (jVar2) {
                                        contains = ((java.util.LinkedHashSet) jVar2.f88b).contains(a3);
                                    }
                                    if (contains) {
                                        ((java.util.ArrayList) oVar2.f1101g).add(a3);
                                    } else {
                                        arrayList.add(a3);
                                    }
                                }
                                if (!arrayList.isEmpty()) {
                                    break;
                                }
                            }
                            if (arrayList.isEmpty()) {
                                java.util.ArrayList elements = (java.util.ArrayList) oVar2.f1101g;
                                kotlin.jvm.internal.i.e(elements, "elements");
                                arrayList.addAll(elements);
                                ((java.util.ArrayList) oVar2.f1101g).clear();
                            }
                            M1.n nVar3 = new M1.n(arrayList);
                            this.f1045d = nVar3;
                            if (this.f1044c.f1065m) {
                                throw new java.io.IOException("Canceled");
                            }
                            if (this.f1042a.a(this.f1043b, this.f1044c, arrayList, false)) {
                                kVar = this.f1044c.f1060h;
                                kotlin.jvm.internal.i.b(kVar);
                                M1.i call4 = this.f1044c;
                                kotlin.jvm.internal.i.e(call4, "call");
                            } else {
                                if (!nVar3.a()) {
                                    throw new java.util.NoSuchElementException();
                                }
                                int i7 = nVar3.f1093a;
                                nVar3.f1093a = i7 + 1;
                                a2 = (I1.A) arrayList.get(i7);
                                kVar = new M1.k(this.f1042a, a2);
                                this.f1044c.f1067o = kVar;
                                kVar.c(i2, i3, i4, z2, this.f1044c);
                                this.f1044c.f1067o = null;
                                jVar = this.f1044c.f1053a.f819y;
                                synchronized (jVar) {
                                    ((java.util.LinkedHashSet) jVar.f88b).remove(a2);
                                }
                                if (this.f1042a.a(this.f1043b, this.f1044c, arrayList, true)) {
                                    M1.k kVar2 = this.f1044c.f1060h;
                                    kotlin.jvm.internal.i.b(kVar2);
                                    this.f1050i = a2;
                                    java.net.Socket socket = kVar.f1071d;
                                    kotlin.jvm.internal.i.b(socket);
                                    J1.b.e(socket);
                                    M1.i call5 = this.f1044c;
                                    kotlin.jvm.internal.i.e(call5, "call");
                                    kVar = kVar2;
                                } else {
                                    synchronized (kVar) {
                                        M1.l lVar = this.f1042a;
                                        lVar.getClass();
                                        byte[] bArr2 = J1.b.f932a;
                                        ((java.util.concurrent.ConcurrentLinkedQueue) lVar.f1090d).add(kVar);
                                        ((L1.c) lVar.f1088b).c((L1.b) lVar.f1089c, 0L);
                                        this.f1044c.a(kVar);
                                    }
                                    M1.i call6 = this.f1044c;
                                    kotlin.jvm.internal.i.e(call6, "call");
                                }
                            }
                        } else {
                            M1.n nVar4 = this.f1045d;
                            kotlin.jvm.internal.i.b(nVar4);
                            if (!nVar4.a()) {
                                throw new java.util.NoSuchElementException();
                            }
                            int i8 = nVar4.f1093a;
                            nVar4.f1093a = i8 + 1;
                            a2 = (I1.A) ((java.util.ArrayList) nVar4.f1094b).get(i8);
                        }
                    }
                    kVar.c(i2, i3, i4, z2, this.f1044c);
                    this.f1044c.f1067o = null;
                    jVar = this.f1044c.f1053a.f819y;
                    synchronized (jVar) {
                    }
                } catch (java.lang.Throwable th2) {
                    this.f1044c.f1067o = null;
                    throw th2;
                }
                arrayList = null;
                kVar = new M1.k(this.f1042a, a2);
                this.f1044c.f1067o = kVar;
            }
            if (!kVar.i(z3)) {
            }
        }
        throw new java.io.IOException("Canceled");
    }

    public final boolean b(I1.o url) {
        kotlin.jvm.internal.i.e(url, "url");
        I1.o oVar = this.f1043b.f677h;
        return url.f765e == oVar.f765e && kotlin.jvm.internal.i.a(url.f764d, oVar.f764d);
    }

    public final void c(java.io.IOException e2) {
        kotlin.jvm.internal.i.e(e2, "e");
        this.f1050i = null;
        if (e2 instanceof P1.F) {
            if (((P1.F) e2).f1443a == P1.EnumC0054b.REFUSED_STREAM) {
                this.f1047f++;
                return;
            }
        }
        if (e2 instanceof P1.C0053a) {
            this.f1048g++;
        } else {
            this.f1049h++;
        }
    }
}
