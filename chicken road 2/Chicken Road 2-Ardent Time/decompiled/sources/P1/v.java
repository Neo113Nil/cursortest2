package P1;

/* loaded from: classes.dex */
public final class v implements java.io.Closeable {

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.logging.Logger f1550d;

    /* renamed from: a, reason: collision with root package name */
    public final V1.q f1551a;

    /* renamed from: b, reason: collision with root package name */
    public final P1.u f1552b;

    /* renamed from: c, reason: collision with root package name */
    public final P1.C0056d f1553c;

    static {
        java.util.logging.Logger logger = java.util.logging.Logger.getLogger(P1.g.class.getName());
        kotlin.jvm.internal.i.d(logger, "getLogger(Http2::class.java.name)");
        f1550d = logger;
    }

    public v(V1.q source) {
        kotlin.jvm.internal.i.e(source, "source");
        this.f1551a = source;
        P1.u uVar = new P1.u(source);
        this.f1552b = uVar;
        this.f1553c = new P1.C0056d(uVar);
    }

    public final boolean a(boolean z2, P1.m handler) {
        P1.EnumC0054b enumC0054b;
        int l2;
        java.lang.Object[] array;
        int i2 = 2;
        kotlin.jvm.internal.i.e(handler, "handler");
        int i3 = 0;
        try {
            this.f1551a.q(9L);
            int s2 = J1.b.s(this.f1551a);
            if (s2 > 16384) {
                throw new java.io.IOException(kotlin.jvm.internal.i.h(java.lang.Integer.valueOf(s2), "FRAME_SIZE_ERROR: "));
            }
            int g2 = this.f1551a.g() & 255;
            byte g3 = this.f1551a.g();
            int i4 = g3 & 255;
            int l3 = this.f1551a.l();
            int i5 = Integer.MAX_VALUE & l3;
            java.util.logging.Logger logger = f1550d;
            if (logger.isLoggable(java.util.logging.Level.FINE)) {
                logger.fine(P1.g.a(true, i5, s2, g2, i4));
            }
            if (z2 && g2 != 4) {
                java.lang.String[] strArr = P1.g.f1480b;
                throw new java.io.IOException(kotlin.jvm.internal.i.h(g2 < strArr.length ? strArr[g2] : J1.b.i("0x%02x", java.lang.Integer.valueOf(g2)), "Expected a SETTINGS frame but was "));
            }
            P1.EnumC0054b enumC0054b2 = null;
            switch (g2) {
                case 0:
                    g(handler, s2, i4, i5);
                    return true;
                case 1:
                    k(handler, s2, i4, i5);
                    return true;
                case 2:
                    if (s2 != 5) {
                        throw new java.io.IOException(B1.a.g(s2, "TYPE_PRIORITY length: ", " != 5"));
                    }
                    if (i5 == 0) {
                        throw new java.io.IOException("TYPE_PRIORITY streamId == 0");
                    }
                    V1.q qVar = this.f1551a;
                    qVar.l();
                    qVar.g();
                    return true;
                case 3:
                    if (s2 != 4) {
                        throw new java.io.IOException(B1.a.g(s2, "TYPE_RST_STREAM length: ", " != 4"));
                    }
                    if (i5 == 0) {
                        throw new java.io.IOException("TYPE_RST_STREAM streamId == 0");
                    }
                    int l4 = this.f1551a.l();
                    P1.EnumC0054b[] values = P1.EnumC0054b.values();
                    int length = values.length;
                    while (true) {
                        if (i3 < length) {
                            enumC0054b = values[i3];
                            if (enumC0054b.f1451a != l4) {
                                i3++;
                            }
                        } else {
                            enumC0054b = null;
                        }
                    }
                    if (enumC0054b == null) {
                        throw new java.io.IOException(kotlin.jvm.internal.i.h(java.lang.Integer.valueOf(l4), "TYPE_RST_STREAM unexpected error code: "));
                    }
                    P1.r rVar = handler.f1497b;
                    rVar.getClass();
                    if (i5 == 0 || (l3 & 1) != 0) {
                        P1.z j2 = rVar.j(i5);
                        if (j2 != null) {
                            j2.k(enumC0054b);
                        }
                    } else {
                        rVar.f1520i.c(new P1.o(rVar.f1514c + '[' + i5 + "] onReset", rVar, i5, enumC0054b, 2), 0L);
                    }
                    return true;
                case 4:
                    if (i5 != 0) {
                        throw new java.io.IOException("TYPE_SETTINGS streamId != 0");
                    }
                    if ((g3 & 1) != 0) {
                        if (s2 != 0) {
                            throw new java.io.IOException("FRAME_SIZE_ERROR ack frame should be empty!");
                        }
                    } else {
                        if (s2 % 6 != 0) {
                            throw new java.io.IOException(kotlin.jvm.internal.i.h(java.lang.Integer.valueOf(s2), "TYPE_SETTINGS length % 6 != 0: "));
                        }
                        P1.E e2 = new P1.E();
                        v1.C1000a C2 = u0.AbstractC0995a.C(u0.AbstractC0995a.F(0, s2), 6);
                        int i6 = C2.f8387a;
                        int i7 = C2.f8388b;
                        int i8 = C2.f8389c;
                        if ((i8 > 0 && i6 <= i7) || (i8 < 0 && i7 <= i6)) {
                            while (true) {
                                int i9 = i6 + i8;
                                V1.q qVar2 = this.f1551a;
                                short n2 = qVar2.n();
                                byte[] bArr = J1.b.f932a;
                                int i10 = n2 & 65535;
                                l2 = qVar2.l();
                                if (i10 != 2) {
                                    if (i10 == 3) {
                                        i10 = 4;
                                    } else if (i10 != 4) {
                                        if (i10 == 5 && (l2 < 16384 || l2 > 16777215)) {
                                        }
                                    } else {
                                        if (l2 < 0) {
                                            throw new java.io.IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                        }
                                        i10 = 7;
                                    }
                                } else if (l2 != 0 && l2 != 1) {
                                    throw new java.io.IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                                }
                                e2.c(i10, l2);
                                if (i6 != i7) {
                                    i6 = i9;
                                }
                            }
                            throw new java.io.IOException(kotlin.jvm.internal.i.h(java.lang.Integer.valueOf(l2), "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
                        }
                        P1.r rVar2 = handler.f1497b;
                        rVar2.f1519h.c(new P1.k(kotlin.jvm.internal.i.h(" applyAndAckSettings", rVar2.f1514c), handler, e2, i2), 0L);
                    }
                    return true;
                case 5:
                    l(handler, s2, i4, i5);
                    return true;
                case 6:
                    if (s2 != 8) {
                        throw new java.io.IOException(kotlin.jvm.internal.i.h(java.lang.Integer.valueOf(s2), "TYPE_PING length != 8: "));
                    }
                    if (i5 != 0) {
                        throw new java.io.IOException("TYPE_PING streamId != 0");
                    }
                    int l5 = this.f1551a.l();
                    int l6 = this.f1551a.l();
                    if ((g3 & 1) != 0) {
                        P1.r rVar3 = handler.f1497b;
                        synchronized (rVar3) {
                            try {
                                if (l5 == 1) {
                                    rVar3.f1523l++;
                                } else if (l5 == 2) {
                                    rVar3.f1525n++;
                                } else if (l5 == 3) {
                                    rVar3.notifyAll();
                                }
                            } catch (java.lang.Throwable th) {
                                throw th;
                            }
                        }
                    } else {
                        P1.r rVar4 = handler.f1497b;
                        rVar4.f1519h.c(new P1.l(kotlin.jvm.internal.i.h(" ping", rVar4.f1514c), handler.f1497b, l5, l6), 0L);
                    }
                    return true;
                case 7:
                    if (s2 < 8) {
                        throw new java.io.IOException(kotlin.jvm.internal.i.h(java.lang.Integer.valueOf(s2), "TYPE_GOAWAY length < 8: "));
                    }
                    if (i5 != 0) {
                        throw new java.io.IOException("TYPE_GOAWAY streamId != 0");
                    }
                    int l7 = this.f1551a.l();
                    int l8 = this.f1551a.l();
                    int i11 = s2 - 8;
                    P1.EnumC0054b[] values2 = P1.EnumC0054b.values();
                    int length2 = values2.length;
                    int i12 = 0;
                    while (true) {
                        if (i12 < length2) {
                            P1.EnumC0054b enumC0054b3 = values2[i12];
                            if (enumC0054b3.f1451a == l8) {
                                enumC0054b2 = enumC0054b3;
                            } else {
                                i12++;
                            }
                        }
                    }
                    if (enumC0054b2 == null) {
                        throw new java.io.IOException(kotlin.jvm.internal.i.h(java.lang.Integer.valueOf(l8), "TYPE_GOAWAY unexpected error code: "));
                    }
                    V1.j debugData = V1.j.f1765d;
                    if (i11 > 0) {
                        debugData = this.f1551a.j(i11);
                    }
                    kotlin.jvm.internal.i.e(debugData, "debugData");
                    debugData.a();
                    P1.r rVar5 = handler.f1497b;
                    synchronized (rVar5) {
                        array = rVar5.f1513b.values().toArray(new P1.z[0]);
                        if (array == null) {
                            throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                        }
                        rVar5.f1517f = true;
                    }
                    P1.z[] zVarArr = (P1.z[]) array;
                    int length3 = zVarArr.length;
                    while (i3 < length3) {
                        P1.z zVar = zVarArr[i3];
                        i3++;
                        if (zVar.f1565a > l7 && zVar.h()) {
                            zVar.k(P1.EnumC0054b.REFUSED_STREAM);
                            handler.f1497b.j(zVar.f1565a);
                        }
                    }
                    return true;
                case 8:
                    if (s2 != 4) {
                        throw new java.io.IOException(kotlin.jvm.internal.i.h(java.lang.Integer.valueOf(s2), "TYPE_WINDOW_UPDATE length !=4: "));
                    }
                    long l9 = this.f1551a.l() & 2147483647L;
                    if (l9 == 0) {
                        throw new java.io.IOException("windowSizeIncrement was 0");
                    }
                    if (i5 == 0) {
                        P1.r rVar6 = handler.f1497b;
                        synchronized (rVar6) {
                            rVar6.f1531u += l9;
                            rVar6.notifyAll();
                        }
                    } else {
                        P1.z g4 = handler.f1497b.g(i5);
                        if (g4 != null) {
                            synchronized (g4) {
                                g4.f1570f += l9;
                                if (l9 > 0) {
                                    g4.notifyAll();
                                }
                            }
                        }
                    }
                    return true;
                default:
                    this.f1551a.r(s2);
                    return true;
            }
        } catch (java.io.EOFException unused) {
            return false;
        }
    }

    public final void b(P1.m handler) {
        kotlin.jvm.internal.i.e(handler, "handler");
        if (!a(true, handler)) {
            throw new java.io.IOException("Required SETTINGS preface not received");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f1551a.close();
    }

    public final void g(P1.m mVar, int i2, int i3, int i4) {
        int i5;
        int i6;
        P1.z zVar;
        boolean z2;
        boolean z3;
        long j2;
        if (i4 == 0) {
            throw new java.io.IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
        }
        boolean z4 = (i3 & 1) != 0;
        if ((i3 & 32) != 0) {
            throw new java.io.IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        if ((i3 & 8) != 0) {
            byte g2 = this.f1551a.g();
            byte[] bArr = J1.b.f932a;
            i6 = g2 & 255;
            i5 = i2;
        } else {
            i5 = i2;
            i6 = 0;
        }
        int a2 = P1.t.a(i5, i3, i6);
        V1.q source = this.f1551a;
        mVar.getClass();
        kotlin.jvm.internal.i.e(source, "source");
        mVar.f1497b.getClass();
        if (i4 != 0 && (i4 & 1) == 0) {
            P1.r rVar = mVar.f1497b;
            rVar.getClass();
            V1.g gVar = new V1.g();
            long j3 = a2;
            source.q(j3);
            source.c(gVar, j3);
            rVar.f1520i.c(new P1.n(rVar.f1514c + '[' + i4 + "] onData", rVar, i4, gVar, a2, z4), 0L);
        } else {
            P1.z g3 = mVar.f1497b.g(i4);
            if (g3 == null) {
                mVar.f1497b.n(i4, P1.EnumC0054b.PROTOCOL_ERROR);
                long j4 = a2;
                mVar.f1497b.l(j4);
                source.r(j4);
            } else {
                byte[] bArr2 = J1.b.f932a;
                P1.x xVar = g3.f1573i;
                long j5 = a2;
                xVar.getClass();
                while (true) {
                    if (j5 <= 0) {
                        zVar = g3;
                        break;
                    }
                    synchronized (xVar.f1563f) {
                        z2 = xVar.f1559b;
                        zVar = g3;
                        z3 = xVar.f1561d.f1764b + j5 > xVar.f1558a;
                    }
                    if (z3) {
                        source.r(j5);
                        xVar.f1563f.e(P1.EnumC0054b.FLOW_CONTROL_ERROR);
                        break;
                    }
                    if (z2) {
                        source.r(j5);
                        break;
                    }
                    long c2 = source.c(xVar.f1560c, j5);
                    if (c2 == -1) {
                        throw new java.io.EOFException();
                    }
                    j5 -= c2;
                    P1.z zVar2 = xVar.f1563f;
                    synchronized (zVar2) {
                        if (xVar.f1562e) {
                            V1.g gVar2 = xVar.f1560c;
                            j2 = gVar2.f1764b;
                            gVar2.o(j2);
                        } else {
                            V1.g gVar3 = xVar.f1561d;
                            boolean z5 = gVar3.f1764b == 0;
                            gVar3.t(xVar.f1560c);
                            if (z5) {
                                zVar2.notifyAll();
                            }
                            j2 = 0;
                        }
                    }
                    if (j2 > 0) {
                        xVar.a(j2);
                    }
                    g3 = zVar;
                }
                if (z4) {
                    zVar.j(J1.b.f933b, true);
                }
            }
        }
        this.f1551a.r(i6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e4, code lost:
    
        throw new java.io.IOException(kotlin.jvm.internal.i.h(java.lang.Integer.valueOf(r6.f1461a), "Invalid dynamic table size update "));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.util.List j(int i2, int i3, int i4, int i5) {
        int e2;
        P1.u uVar = this.f1552b;
        uVar.f1548e = i2;
        uVar.f1545b = i2;
        uVar.f1549f = i3;
        uVar.f1546c = i4;
        uVar.f1547d = i5;
        while (true) {
            P1.C0056d c0056d = this.f1553c;
            V1.q qVar = c0056d.f1463c;
            boolean a2 = qVar.a();
            java.util.ArrayList arrayList = c0056d.f1462b;
            if (a2) {
                java.util.List X2 = i1.AbstractC0190i.X(arrayList);
                arrayList.clear();
                return X2;
            }
            byte g2 = qVar.g();
            byte[] bArr = J1.b.f932a;
            int i6 = g2 & 255;
            if (i6 == 128) {
                throw new java.io.IOException("index == 0");
            }
            if ((g2 & 128) == 128) {
                e2 = c0056d.e(i6, 127);
                int i7 = e2 - 1;
                if (i7 >= 0) {
                    P1.C0055c[] c0055cArr = P1.AbstractC0058f.f1477a;
                    if (i7 <= c0055cArr.length - 1) {
                        arrayList.add(c0055cArr[i7]);
                    }
                }
                int length = c0056d.f1465e + 1 + (i7 - P1.AbstractC0058f.f1477a.length);
                if (length < 0) {
                    break;
                }
                P1.C0055c[] c0055cArr2 = c0056d.f1464d;
                if (length >= c0055cArr2.length) {
                    break;
                }
                P1.C0055c c0055c = c0055cArr2[length];
                kotlin.jvm.internal.i.b(c0055c);
                arrayList.add(c0055c);
            } else if (i6 == 64) {
                P1.C0055c[] c0055cArr3 = P1.AbstractC0058f.f1477a;
                V1.j d2 = c0056d.d();
                P1.AbstractC0058f.a(d2);
                c0056d.c(new P1.C0055c(d2, c0056d.d()));
            } else if ((g2 & 64) == 64) {
                c0056d.c(new P1.C0055c(c0056d.b(c0056d.e(i6, 63) - 1), c0056d.d()));
            } else if ((g2 & 32) == 32) {
                int e3 = c0056d.e(i6, 31);
                c0056d.f1461a = e3;
                if (e3 < 0 || e3 > 4096) {
                    break;
                }
                int i8 = c0056d.f1467g;
                if (e3 < i8) {
                    if (e3 == 0) {
                        P1.C0055c[] c0055cArr4 = c0056d.f1464d;
                        i1.AbstractC0189h.N(c0055cArr4, 0, c0055cArr4.length);
                        c0056d.f1465e = c0056d.f1464d.length - 1;
                        c0056d.f1466f = 0;
                        c0056d.f1467g = 0;
                    } else {
                        c0056d.a(i8 - e3);
                    }
                }
            } else if (i6 == 16 || i6 == 0) {
                P1.C0055c[] c0055cArr5 = P1.AbstractC0058f.f1477a;
                V1.j d3 = c0056d.d();
                P1.AbstractC0058f.a(d3);
                arrayList.add(new P1.C0055c(d3, c0056d.d()));
            } else {
                arrayList.add(new P1.C0055c(c0056d.b(c0056d.e(i6, 15) - 1), c0056d.d()));
            }
        }
        throw new java.io.IOException(kotlin.jvm.internal.i.h(java.lang.Integer.valueOf(e2), "Header index too large "));
    }

    public final void k(P1.m mVar, int i2, int i3, int i4) {
        int i5;
        int i6 = 1;
        if (i4 == 0) {
            throw new java.io.IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        boolean z2 = false;
        boolean z3 = (i3 & 1) != 0;
        if ((i3 & 8) != 0) {
            byte g2 = this.f1551a.g();
            byte[] bArr = J1.b.f932a;
            i5 = g2 & 255;
        } else {
            i5 = 0;
        }
        if ((i3 & 32) != 0) {
            V1.q qVar = this.f1551a;
            qVar.l();
            qVar.g();
            byte[] bArr2 = J1.b.f932a;
            mVar.getClass();
            i2 -= 5;
        }
        java.util.List j2 = j(P1.t.a(i2, i3, i5), i5, i3, i4);
        mVar.getClass();
        mVar.f1497b.getClass();
        if (i4 != 0 && (i4 & 1) == 0) {
            z2 = true;
        }
        if (z2) {
            P1.r rVar = mVar.f1497b;
            rVar.getClass();
            rVar.f1520i.c(new P1.o(rVar.f1514c + '[' + i4 + "] onHeaders", rVar, i4, j2, z3), 0L);
            return;
        }
        P1.r rVar2 = mVar.f1497b;
        synchronized (rVar2) {
            P1.z g3 = rVar2.g(i4);
            if (g3 != null) {
                g3.j(J1.b.u(j2), z3);
                return;
            }
            if (rVar2.f1517f) {
                return;
            }
            if (i4 <= rVar2.f1515d) {
                return;
            }
            if (i4 % 2 == rVar2.f1516e % 2) {
                return;
            }
            P1.z zVar = new P1.z(i4, rVar2, false, z3, J1.b.u(j2));
            rVar2.f1515d = i4;
            rVar2.f1513b.put(java.lang.Integer.valueOf(i4), zVar);
            rVar2.f1518g.e().c(new P1.k(rVar2.f1514c + '[' + i4 + "] onStream", rVar2, zVar, i6), 0L);
        }
    }

    public final void l(P1.m mVar, int i2, int i3, int i4) {
        int i5;
        if (i4 == 0) {
            throw new java.io.IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        if ((i3 & 8) != 0) {
            byte g2 = this.f1551a.g();
            byte[] bArr = J1.b.f932a;
            i5 = g2 & 255;
        } else {
            i5 = 0;
        }
        int l2 = this.f1551a.l() & Integer.MAX_VALUE;
        java.util.List j2 = j(P1.t.a(i2 - 4, i3, i5), i5, i3, i4);
        mVar.getClass();
        P1.r rVar = mVar.f1497b;
        rVar.getClass();
        synchronized (rVar) {
            if (rVar.f1535y.contains(java.lang.Integer.valueOf(l2))) {
                rVar.n(l2, P1.EnumC0054b.PROTOCOL_ERROR);
                return;
            }
            rVar.f1535y.add(java.lang.Integer.valueOf(l2));
            rVar.f1520i.c(new P1.o(rVar.f1514c + '[' + l2 + "] onRequest", rVar, l2, j2, 1), 0L);
        }
    }
}
