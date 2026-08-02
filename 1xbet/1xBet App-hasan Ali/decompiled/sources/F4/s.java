package F4;

import L4.C0226i;
import L4.C0229l;
import a.AbstractC0444a;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import l4.C2060b;
import n.AbstractC2107A;
import u.AbstractC2462i;

/* loaded from: classes.dex */
public final class s implements Closeable, AutoCloseable {

    /* renamed from: n, reason: collision with root package name */
    public static final Logger f1648n;

    /* renamed from: k, reason: collision with root package name */
    public final L4.C f1649k;

    /* renamed from: l, reason: collision with root package name */
    public final r f1650l;

    /* renamed from: m, reason: collision with root package name */
    public final C0123c f1651m;

    static {
        Logger logger = Logger.getLogger(f.class.getName());
        kotlin.jvm.internal.l.e("getLogger(Http2::class.java.name)", logger);
        f1648n = logger;
    }

    public s(L4.C c5) {
        kotlin.jvm.internal.l.f("source", c5);
        this.f1649k = c5;
        r rVar = new r(c5);
        this.f1650l = rVar;
        this.f1651m = new C0123c(rVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x0144, code lost:
    
        throw new java.io.IOException(n.AbstractC2107A.q("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: ", r10));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(boolean z3, k kVar) {
        int i;
        int i5 = 2;
        try {
            this.f1649k.s(9L);
            int r5 = z4.b.r(this.f1649k);
            if (r5 > 16384) {
                throw new IOException(AbstractC2107A.q("FRAME_SIZE_ERROR: ", r5));
            }
            int f = this.f1649k.f() & 255;
            byte f5 = this.f1649k.f();
            int i6 = f5 & 255;
            int i7 = this.f1649k.i();
            int i8 = Integer.MAX_VALUE & i7;
            Logger logger = f1648n;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(f.a(true, i8, r5, f, i6));
            }
            if (z3 && f != 4) {
                StringBuilder sb = new StringBuilder("Expected a SETTINGS frame but was ");
                String[] strArr = f.f1591b;
                sb.append(f < strArr.length ? strArr[f] : z4.b.h("0x%02x", Integer.valueOf(f)));
                throw new IOException(sb.toString());
            }
            switch (f) {
                case 0:
                    d(kVar, r5, i6, i8);
                    return true;
                case 1:
                    i(kVar, r5, i6, i8);
                    return true;
                case 2:
                    if (r5 != 5) {
                        throw new IOException(L1.a.l(r5, "TYPE_PRIORITY length: ", " != 5"));
                    }
                    if (i8 == 0) {
                        throw new IOException("TYPE_PRIORITY streamId == 0");
                    }
                    L4.C c5 = this.f1649k;
                    c5.i();
                    c5.f();
                    return true;
                case 3:
                    if (r5 != 4) {
                        throw new IOException(L1.a.l(r5, "TYPE_RST_STREAM length: ", " != 4"));
                    }
                    if (i8 == 0) {
                        throw new IOException("TYPE_RST_STREAM streamId == 0");
                    }
                    int i9 = this.f1649k.i();
                    int[] c6 = AbstractC2462i.c(14);
                    int length = c6.length;
                    int i10 = 0;
                    while (true) {
                        if (i10 < length) {
                            int i11 = c6[i10];
                            if (AbstractC2462i.b(i11) == i9) {
                                i = i11;
                            } else {
                                i10++;
                            }
                        } else {
                            i = 0;
                        }
                    }
                    if (i == 0) {
                        throw new IOException(AbstractC2107A.q("TYPE_RST_STREAM unexpected error code: ", i9));
                    }
                    o oVar = (o) kVar.f1602m;
                    oVar.getClass();
                    if (i8 == 0 || (i7 & 1) != 0) {
                        int i12 = i;
                        w h3 = oVar.h(i8);
                        if (h3 != null) {
                            h3.k(i12);
                        }
                        return true;
                    }
                    oVar.f1627s.c(new j(oVar.f1621m + '[' + i8 + "] onReset", oVar, i8, i, 1), 0L);
                    return true;
                case 4:
                    if (i8 != 0) {
                        throw new IOException("TYPE_SETTINGS streamId != 0");
                    }
                    if ((f5 & 1) != 0) {
                        if (r5 != 0) {
                            throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
                        }
                        return true;
                    }
                    if (r5 % 6 != 0) {
                        throw new IOException(AbstractC2107A.q("TYPE_SETTINGS length % 6 != 0: ", r5));
                    }
                    B b3 = new B();
                    C2060b c02 = AbstractC0444a.c0(AbstractC0444a.f0(0, r5), 6);
                    int i13 = c02.f17851k;
                    int i14 = c02.f17852l;
                    int i15 = c02.f17853m;
                    if ((i15 > 0 && i13 <= i14) || (i15 < 0 && i14 <= i13)) {
                        while (true) {
                            L4.C c7 = this.f1649k;
                            short m5 = c7.m();
                            byte[] bArr = z4.b.f21979a;
                            int i16 = m5 & 65535;
                            int i17 = c7.i();
                            if (i16 != 2) {
                                if (i16 == 3) {
                                    i16 = 4;
                                } else if (i16 != 4) {
                                    if (i16 == 5 && (i17 < 16384 || i17 > 16777215)) {
                                    }
                                } else {
                                    if (i17 < 0) {
                                        throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                    }
                                    i16 = 7;
                                }
                            } else if (i17 != 0 && i17 != 1) {
                                throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                            }
                            b3.c(i16, i17);
                            if (i13 != i14) {
                                i13 += i15;
                            }
                        }
                    }
                    o oVar2 = (o) kVar.f1602m;
                    oVar2.f1626r.c(new i(i5, kVar, b3, AbstractC2107A.u(new StringBuilder(), oVar2.f1621m, " applyAndAckSettings")), 0L);
                    return true;
                case 5:
                    l(kVar, r5, i6, i8);
                    return true;
                case 6:
                    k(kVar, r5, i6, i8);
                    return true;
                case 7:
                    f(kVar, r5, i8);
                    return true;
                case 8:
                    if (r5 != 4) {
                        throw new IOException(AbstractC2107A.q("TYPE_WINDOW_UPDATE length !=4: ", r5));
                    }
                    long i18 = this.f1649k.i() & 2147483647L;
                    if (i18 == 0) {
                        throw new IOException("windowSizeIncrement was 0");
                    }
                    if (i8 == 0) {
                        o oVar3 = (o) kVar.f1602m;
                        synchronized (oVar3) {
                            oVar3.f1614E += i18;
                            oVar3.notifyAll();
                        }
                        return true;
                    }
                    w d5 = ((o) kVar.f1602m).d(i8);
                    if (d5 != null) {
                        synchronized (d5) {
                            d5.f += i18;
                            if (i18 > 0) {
                                d5.notifyAll();
                            }
                        }
                        return true;
                    }
                    return true;
                default:
                    this.f1649k.t(r5);
                    return true;
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f1649k.close();
    }

    public final void d(k kVar, int i, int i5, int i6) {
        int i7;
        w wVar;
        boolean z3;
        long j5;
        boolean z5;
        if (i6 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
        }
        boolean z6 = (i5 & 1) != 0;
        if ((i5 & 32) != 0) {
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        if ((i5 & 8) != 0) {
            byte f = this.f1649k.f();
            byte[] bArr = z4.b.f21979a;
            i7 = f & 255;
        } else {
            i7 = 0;
        }
        int a5 = q.a(i, i5, i7);
        L4.C c5 = this.f1649k;
        kotlin.jvm.internal.l.f("source", c5);
        ((o) kVar.f1602m).getClass();
        long j6 = 0;
        if (i6 != 0 && (i6 & 1) == 0) {
            o oVar = (o) kVar.f1602m;
            oVar.getClass();
            C0226i c0226i = new C0226i();
            long j7 = a5;
            c5.s(j7);
            c5.e(c0226i, j7);
            oVar.f1627s.c(new l(oVar.f1621m + '[' + i6 + "] onData", oVar, i6, c0226i, a5, z6), 0L);
        } else {
            w d5 = ((o) kVar.f1602m).d(i6);
            if (d5 == null) {
                ((o) kVar.f1602m).m(i6, 2);
                long j8 = a5;
                ((o) kVar.f1602m).k(j8);
                c5.t(j8);
            } else {
                byte[] bArr2 = z4.b.f21979a;
                u uVar = d5.i;
                long j9 = a5;
                uVar.getClass();
                long j10 = j9;
                while (true) {
                    if (j10 <= j6) {
                        wVar = d5;
                        byte[] bArr3 = z4.b.f21979a;
                        uVar.f1661p.f1664b.k(j9);
                        break;
                    }
                    synchronized (uVar.f1661p) {
                        z3 = uVar.f1657l;
                        j5 = j6;
                        wVar = d5;
                        z5 = uVar.f1659n.f3091l + j10 > uVar.f1656k;
                    }
                    if (z5) {
                        c5.t(j10);
                        uVar.f1661p.e(4);
                        break;
                    }
                    if (z3) {
                        c5.t(j10);
                        break;
                    }
                    long e3 = c5.e(uVar.f1658m, j10);
                    if (e3 == -1) {
                        throw new EOFException();
                    }
                    j10 -= e3;
                    w wVar2 = uVar.f1661p;
                    synchronized (wVar2) {
                        try {
                            if (uVar.f1660o) {
                                uVar.f1658m.b();
                            } else {
                                C0226i c0226i2 = uVar.f1659n;
                                boolean z7 = c0226i2.f3091l == j5;
                                c0226i2.O(uVar.f1658m);
                                if (z7) {
                                    wVar2.notifyAll();
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    j6 = j5;
                    d5 = wVar;
                }
                if (z6) {
                    wVar.j(z4.b.f21980b, true);
                }
            }
        }
        this.f1649k.t(i7);
    }

    public final void f(k kVar, int i, int i5) {
        int i6;
        Object[] array;
        if (i < 8) {
            throw new IOException(AbstractC2107A.q("TYPE_GOAWAY length < 8: ", i));
        }
        if (i5 != 0) {
            throw new IOException("TYPE_GOAWAY streamId != 0");
        }
        int i7 = this.f1649k.i();
        int i8 = this.f1649k.i();
        int i9 = i - 8;
        int[] c5 = AbstractC2462i.c(14);
        int length = c5.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                i6 = 0;
                break;
            }
            i6 = c5[i10];
            if (AbstractC2462i.b(i6) == i8) {
                break;
            } else {
                i10++;
            }
        }
        if (i6 == 0) {
            throw new IOException(AbstractC2107A.q("TYPE_GOAWAY unexpected error code: ", i8));
        }
        C0229l c0229l = C0229l.f3092n;
        if (i9 > 0) {
            c0229l = this.f1649k.h(i9);
        }
        kotlin.jvm.internal.l.f("debugData", c0229l);
        c0229l.c();
        o oVar = (o) kVar.f1602m;
        synchronized (oVar) {
            array = oVar.f1620l.values().toArray(new w[0]);
            oVar.f1624p = true;
        }
        for (w wVar : (w[]) array) {
            if (wVar.f1663a > i7 && wVar.h()) {
                wVar.k(8);
                ((o) kVar.f1602m).h(wVar.f1663a);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e3, code lost:
    
        throw new java.io.IOException("Invalid dynamic table size update " + r6.f1575a);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List h(int i, int i5, int i6, int i7) {
        int e3;
        r rVar = this.f1650l;
        rVar.f1646o = i;
        rVar.f1643l = i;
        rVar.f1647p = i5;
        rVar.f1644m = i6;
        rVar.f1645n = i7;
        while (true) {
            C0123c c0123c = this.f1651m;
            L4.C c5 = c0123c.f1577c;
            boolean b3 = c5.b();
            ArrayList arrayList = c0123c.f1576b;
            if (b3) {
                List m02 = X3.m.m0(arrayList);
                arrayList.clear();
                return m02;
            }
            byte f = c5.f();
            byte[] bArr = z4.b.f21979a;
            int i8 = f & 255;
            if (i8 == 128) {
                throw new IOException("index == 0");
            }
            if ((f & 128) == 128) {
                e3 = c0123c.e(i8, 127);
                int i9 = e3 - 1;
                if (i9 >= 0) {
                    C0122b[] c0122bArr = e.f1588a;
                    if (i9 <= c0122bArr.length - 1) {
                        arrayList.add(c0122bArr[i9]);
                    }
                }
                int length = c0123c.f1579e + 1 + (i9 - e.f1588a.length);
                if (length < 0) {
                    break;
                }
                C0122b[] c0122bArr2 = c0123c.f1578d;
                if (length >= c0122bArr2.length) {
                    break;
                }
                C0122b c0122b = c0122bArr2[length];
                kotlin.jvm.internal.l.c(c0122b);
                arrayList.add(c0122b);
            } else if (i8 == 64) {
                C0122b[] c0122bArr3 = e.f1588a;
                C0229l d5 = c0123c.d();
                e.a(d5);
                c0123c.c(new C0122b(d5, c0123c.d()));
            } else if ((f & 64) == 64) {
                c0123c.c(new C0122b(c0123c.b(c0123c.e(i8, 63) - 1), c0123c.d()));
            } else if ((f & 32) == 32) {
                int e5 = c0123c.e(i8, 31);
                c0123c.f1575a = e5;
                if (e5 < 0 || e5 > 4096) {
                    break;
                }
                int i10 = c0123c.f1580g;
                if (e5 < i10) {
                    if (e5 == 0) {
                        X3.l.B0(r7, 0, c0123c.f1578d.length);
                        c0123c.f1579e = c0123c.f1578d.length - 1;
                        c0123c.f = 0;
                        c0123c.f1580g = 0;
                    } else {
                        c0123c.a(i10 - e5);
                    }
                }
            } else if (i8 == 16 || i8 == 0) {
                C0122b[] c0122bArr4 = e.f1588a;
                C0229l d6 = c0123c.d();
                e.a(d6);
                arrayList.add(new C0122b(d6, c0123c.d()));
            } else {
                arrayList.add(new C0122b(c0123c.b(c0123c.e(i8, 15) - 1), c0123c.d()));
            }
        }
        throw new IOException(AbstractC2107A.q("Header index too large ", e3));
    }

    public final void i(k kVar, int i, int i5, int i6) {
        int i7;
        int i8 = 1;
        if (i6 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        boolean z3 = false;
        boolean z5 = (i5 & 1) != 0;
        if ((i5 & 8) != 0) {
            byte f = this.f1649k.f();
            byte[] bArr = z4.b.f21979a;
            i7 = f & 255;
        } else {
            i7 = 0;
        }
        if ((i5 & 32) != 0) {
            L4.C c5 = this.f1649k;
            c5.i();
            c5.f();
            byte[] bArr2 = z4.b.f21979a;
            i -= 5;
        }
        List h3 = h(q.a(i, i5, i7), i7, i5, i6);
        ((o) kVar.f1602m).getClass();
        if (i6 != 0 && (i6 & 1) == 0) {
            z3 = true;
        }
        if (z3) {
            o oVar = (o) kVar.f1602m;
            oVar.getClass();
            oVar.f1627s.c(new m(oVar.f1621m + '[' + i6 + "] onHeaders", oVar, i6, h3, z5), 0L);
            return;
        }
        o oVar2 = (o) kVar.f1602m;
        synchronized (oVar2) {
            w d5 = oVar2.d(i6);
            if (d5 != null) {
                d5.j(z4.b.t(h3), z5);
                return;
            }
            if (oVar2.f1624p) {
                return;
            }
            if (i6 <= oVar2.f1622n) {
                return;
            }
            if (i6 % 2 == oVar2.f1623o % 2) {
                return;
            }
            w wVar = new w(i6, oVar2, false, z5, z4.b.t(h3));
            oVar2.f1622n = i6;
            oVar2.f1620l.put(Integer.valueOf(i6), wVar);
            oVar2.f1625q.e().c(new i(i8, oVar2, wVar, oVar2.f1621m + '[' + i6 + "] onStream"), 0L);
        }
    }

    public final void k(k kVar, int i, int i5, int i6) {
        if (i != 8) {
            throw new IOException(AbstractC2107A.q("TYPE_PING length != 8: ", i));
        }
        if (i6 != 0) {
            throw new IOException("TYPE_PING streamId != 0");
        }
        int i7 = this.f1649k.i();
        int i8 = this.f1649k.i();
        if ((i5 & 1) == 0) {
            ((o) kVar.f1602m).f1626r.c(new j(AbstractC2107A.u(new StringBuilder(), ((o) kVar.f1602m).f1621m, " ping"), (o) kVar.f1602m, i7, i8, 0), 0L);
            return;
        }
        o oVar = (o) kVar.f1602m;
        synchronized (oVar) {
            try {
                if (i7 == 1) {
                    oVar.f1630v++;
                } else if (i7 == 2) {
                    oVar.f1632x++;
                } else if (i7 == 3) {
                    oVar.notifyAll();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void l(k kVar, int i, int i5, int i6) {
        int i7;
        if (i6 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        if ((i5 & 8) != 0) {
            byte f = this.f1649k.f();
            byte[] bArr = z4.b.f21979a;
            i7 = f & 255;
        } else {
            i7 = 0;
        }
        int i8 = this.f1649k.i() & Integer.MAX_VALUE;
        List h3 = h(q.a(i - 4, i5, i7), i7, i5, i6);
        o oVar = (o) kVar.f1602m;
        oVar.getClass();
        synchronized (oVar) {
            if (oVar.f1618I.contains(Integer.valueOf(i8))) {
                oVar.m(i8, 2);
                return;
            }
            oVar.f1618I.add(Integer.valueOf(i8));
            oVar.f1627s.c(new m(oVar.f1621m + '[' + i8 + "] onRequest", oVar, i8, h3), 0L);
        }
    }
}
