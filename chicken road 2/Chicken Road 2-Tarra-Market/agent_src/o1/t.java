package o1;

import P.B;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import p.AbstractC0819i;

/* loaded from: classes.dex */
public final class t implements Closeable {

    /* renamed from: e, reason: collision with root package name */
    public static final Logger f6345e = Logger.getLogger(f.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final s1.n f6346a;

    /* renamed from: b, reason: collision with root package name */
    public final s f6347b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f6348c;

    /* renamed from: d, reason: collision with root package name */
    public final c f6349d;

    public t(s1.n nVar, boolean z2) {
        this.f6346a = nVar;
        this.f6348c = z2;
        s sVar = new s(nVar);
        this.f6347b = sVar;
        this.f6349d = new c(sVar);
    }

    public static int a(int i2, byte b2, short s2) {
        if ((b2 & 8) != 0) {
            i2--;
        }
        if (s2 <= i2) {
            return (short) (i2 - s2);
        }
        f.c("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s2), Integer.valueOf(i2));
        throw null;
    }

    public static int l(s1.n nVar) {
        return (nVar.g() & 255) | ((nVar.g() & 255) << 16) | ((nVar.g() & 255) << 8);
    }

    public final boolean b(boolean z2, p pVar) {
        int i2;
        int i3;
        w[] wVarArr;
        int i4 = 0;
        try {
            this.f6346a.o(9L);
            int l2 = l(this.f6346a);
            if (l2 < 0 || l2 > 16384) {
                f.c("FRAME_SIZE_ERROR: %s", Integer.valueOf(l2));
                throw null;
            }
            byte g2 = (byte) (this.f6346a.g() & 255);
            if (z2 && g2 != 4) {
                f.c("Expected a SETTINGS frame but was %s", Byte.valueOf(g2));
                throw null;
            }
            byte g3 = (byte) (this.f6346a.g() & 255);
            int k2 = this.f6346a.k();
            int i5 = Integer.MAX_VALUE & k2;
            Logger logger = f6345e;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(f.a(true, i5, l2, g2, g3));
            }
            switch (g2) {
                case 0:
                    i(pVar, l2, g3, i5);
                    return true;
                case 1:
                    k(pVar, l2, g3, i5);
                    return true;
                case 2:
                    if (l2 != 5) {
                        f.c("TYPE_PRIORITY length: %d != 5", Integer.valueOf(l2));
                        throw null;
                    }
                    if (i5 == 0) {
                        f.c("TYPE_PRIORITY streamId == 0", new Object[0]);
                        throw null;
                    }
                    s1.n nVar = this.f6346a;
                    nVar.k();
                    nVar.g();
                    pVar.getClass();
                    return true;
                case 3:
                    if (l2 != 4) {
                        f.c("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(l2));
                        throw null;
                    }
                    if (i5 == 0) {
                        f.c("TYPE_RST_STREAM streamId == 0", new Object[0]);
                        throw null;
                    }
                    int k3 = this.f6346a.k();
                    int[] d2 = AbstractC0819i.d(11);
                    int length = d2.length;
                    int i6 = 0;
                    while (true) {
                        if (i6 < length) {
                            i2 = d2[i6];
                            if (C0.g.d(i2) != k3) {
                                i6++;
                            }
                        } else {
                            i2 = 0;
                        }
                    }
                    if (i2 == 0) {
                        f.c("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(k3));
                        throw null;
                    }
                    r rVar = (r) pVar.f6315c;
                    rVar.getClass();
                    if (i5 != 0 && (k2 & 1) == 0) {
                        i4 = 1;
                    }
                    if (i4 != 0) {
                        rVar.j(new k(rVar, new Object[]{rVar.f6322d, Integer.valueOf(i5)}, i5, i2));
                    } else {
                        w k4 = rVar.k(i5);
                        if (k4 != null) {
                            synchronized (k4) {
                                if (k4.f6370k == 0) {
                                    k4.f6370k = i2;
                                    k4.notifyAll();
                                }
                            }
                        }
                    }
                    return true;
                case 4:
                    n(pVar, l2, g3, i5);
                    return true;
                case 5:
                    m(pVar, l2, g3, i5);
                    return true;
                case 6:
                    if (l2 != 8) {
                        f.c("TYPE_PING length != 8: %s", Integer.valueOf(l2));
                        throw null;
                    }
                    if (i5 != 0) {
                        f.c("TYPE_PING streamId != 0", new Object[0]);
                        throw null;
                    }
                    int k5 = this.f6346a.k();
                    int k6 = this.f6346a.k();
                    boolean z3 = (g3 & 1) != 0;
                    pVar.getClass();
                    if (z3) {
                        synchronized (((r) pVar.f6315c)) {
                            r rVar2 = (r) pVar.f6315c;
                            rVar2.f6329k = false;
                            rVar2.notifyAll();
                        }
                    } else {
                        try {
                            r rVar3 = (r) pVar.f6315c;
                            rVar3.f6326h.execute(new o(rVar3, true, k5, k6));
                        } catch (RejectedExecutionException unused) {
                        }
                    }
                    return true;
                case 7:
                    if (l2 < 8) {
                        f.c("TYPE_GOAWAY length < 8: %s", Integer.valueOf(l2));
                        throw null;
                    }
                    if (i5 != 0) {
                        f.c("TYPE_GOAWAY streamId != 0", new Object[0]);
                        throw null;
                    }
                    int k7 = this.f6346a.k();
                    int k8 = this.f6346a.k();
                    int i7 = l2 - 8;
                    int[] d3 = AbstractC0819i.d(11);
                    int length2 = d3.length;
                    int i8 = 0;
                    while (true) {
                        if (i8 < length2) {
                            i3 = d3[i8];
                            if (C0.g.d(i3) != k8) {
                                i8++;
                            }
                        } else {
                            i3 = 0;
                        }
                    }
                    if (i3 == 0) {
                        f.c("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(k8));
                        throw null;
                    }
                    s1.h hVar = s1.h.f6620e;
                    if (i7 > 0) {
                        hVar = this.f6346a.i(i7);
                    }
                    pVar.getClass();
                    hVar.i();
                    synchronized (((r) pVar.f6315c)) {
                        wVarArr = (w[]) ((r) pVar.f6315c).f6321c.values().toArray(new w[((r) pVar.f6315c).f6321c.size()]);
                        ((r) pVar.f6315c).f6325g = true;
                    }
                    int length3 = wVarArr.length;
                    while (i4 < length3) {
                        w wVar = wVarArr[i4];
                        if (wVar.f6362c > k7 && wVar.f()) {
                            synchronized (wVar) {
                                if (wVar.f6370k == 0) {
                                    wVar.f6370k = 5;
                                    wVar.notifyAll();
                                }
                            }
                            ((r) pVar.f6315c).k(wVar.f6362c);
                        }
                        i4++;
                    }
                    return true;
                case 8:
                    if (l2 != 4) {
                        f.c("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(l2));
                        throw null;
                    }
                    long k9 = this.f6346a.k() & 2147483647L;
                    if (k9 == 0) {
                        f.c("windowSizeIncrement was 0", Long.valueOf(k9));
                        throw null;
                    }
                    if (i5 == 0) {
                        synchronized (((r) pVar.f6315c)) {
                            r rVar4 = (r) pVar.f6315c;
                            rVar4.f6331m += k9;
                            rVar4.notifyAll();
                        }
                    } else {
                        w g4 = ((r) pVar.f6315c).g(i5);
                        if (g4 != null) {
                            synchronized (g4) {
                                g4.f6361b += k9;
                                if (k9 > 0) {
                                    g4.notifyAll();
                                }
                            }
                        }
                    }
                    return true;
                default:
                    this.f6346a.p(l2);
                    return true;
            }
        } catch (IOException unused2) {
            return false;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f6346a.close();
    }

    public final void g(p pVar) {
        if (this.f6348c) {
            if (b(true, pVar)) {
                return;
            }
            f.c("Required SETTINGS preface not received", new Object[0]);
            throw null;
        }
        s1.h hVar = f.f6281a;
        s1.h i2 = this.f6346a.i(hVar.f6621a.length);
        Level level = Level.FINE;
        Logger logger = f6345e;
        if (logger.isLoggable(level)) {
            String e2 = i2.e();
            byte[] bArr = j1.d.f6053a;
            Locale locale = Locale.US;
            logger.fine("<< CONNECTION " + e2);
        }
        if (hVar.equals(i2)) {
            return;
        }
        f.c("Expected a connection header but was %s", i2.l());
        throw null;
    }

    public final void i(p pVar, int i2, byte b2, int i3) {
        int i4;
        short s2;
        boolean z2;
        boolean z3;
        boolean z4;
        if (i3 == 0) {
            f.c("PROTOCOL_ERROR: TYPE_DATA streamId == 0", new Object[0]);
            throw null;
        }
        boolean z5 = (b2 & 1) != 0;
        if ((b2 & 32) != 0) {
            f.c("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
            throw null;
        }
        if ((b2 & 8) != 0) {
            s2 = (short) (this.f6346a.g() & 255);
            i4 = i2;
        } else {
            i4 = i2;
            s2 = 0;
        }
        int a2 = a(i4, b2, s2);
        s1.n nVar = this.f6346a;
        ((r) pVar.f6315c).getClass();
        if (i3 == 0 || (i3 & 1) != 0) {
            w g2 = ((r) pVar.f6315c).g(i3);
            if (g2 == null) {
                ((r) pVar.f6315c).o(i3, 2);
                long j2 = a2;
                ((r) pVar.f6315c).m(j2);
                nVar.p(j2);
            } else {
                v vVar = g2.f6366g;
                long j3 = a2;
                while (true) {
                    if (j3 <= 0) {
                        z2 = z5;
                        vVar.getClass();
                        break;
                    }
                    synchronized (vVar.f6359f) {
                        z3 = vVar.f6358e;
                        z2 = z5;
                        z4 = vVar.f6355b.f6618b + j3 > vVar.f6356c;
                    }
                    if (z4) {
                        nVar.p(j3);
                        w wVar = vVar.f6359f;
                        if (wVar.d(4)) {
                            wVar.f6363d.o(wVar.f6362c, 4);
                        }
                    } else {
                        if (z3) {
                            nVar.p(j3);
                            break;
                        }
                        long c2 = nVar.c(vVar.f6354a, j3);
                        if (c2 == -1) {
                            throw new EOFException();
                        }
                        j3 -= c2;
                        synchronized (vVar.f6359f) {
                            try {
                                s1.e eVar = vVar.f6355b;
                                boolean z6 = eVar.f6618b == 0;
                                while (vVar.f6354a.c(eVar, 8192L) != -1) {
                                }
                                if (z6) {
                                    vVar.f6359f.notifyAll();
                                }
                            } finally {
                            }
                        }
                        z5 = z2;
                    }
                }
                if (z2) {
                    g2.h();
                }
            }
        } else {
            r rVar = (r) pVar.f6315c;
            rVar.getClass();
            s1.e eVar2 = new s1.e();
            long j4 = a2;
            nVar.o(j4);
            nVar.c(eVar2, j4);
            if (eVar2.f6618b != j4) {
                throw new IOException(eVar2.f6618b + " != " + a2);
            }
            rVar.j(new l(rVar, new Object[]{rVar.f6322d, Integer.valueOf(i3)}, i3, eVar2, a2, z5));
        }
        this.f6346a.p(s2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00de, code lost:
    
        throw new java.io.IOException("Invalid dynamic table size update " + r3.f6266d);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList j(int i2, short s2, byte b2, int i3) {
        int e2;
        s sVar = this.f6347b;
        sVar.f6343e = i2;
        sVar.f6340b = i2;
        sVar.f6344f = s2;
        sVar.f6341c = b2;
        sVar.f6342d = i3;
        while (true) {
            c cVar = this.f6349d;
            s1.n nVar = cVar.f6264b;
            boolean a2 = nVar.a();
            ArrayList arrayList = cVar.f6263a;
            if (a2) {
                ArrayList arrayList2 = new ArrayList(arrayList);
                arrayList.clear();
                return arrayList2;
            }
            byte g2 = nVar.g();
            int i4 = g2 & 255;
            if (i4 == 128) {
                throw new IOException("index == 0");
            }
            if ((g2 & 128) == 128) {
                e2 = cVar.e(i4, 127);
                int i5 = e2 - 1;
                if (i5 >= 0) {
                    b[] bVarArr = e.f6279a;
                    if (i5 <= bVarArr.length - 1) {
                        arrayList.add(bVarArr[i5]);
                    }
                }
                int length = cVar.f6268f + 1 + (i5 - e.f6279a.length);
                if (length < 0) {
                    break;
                }
                b[] bVarArr2 = cVar.f6267e;
                if (length >= bVarArr2.length) {
                    break;
                }
                arrayList.add(bVarArr2[length]);
            } else if (i4 == 64) {
                s1.h d2 = cVar.d();
                e.a(d2);
                cVar.c(new b(d2, cVar.d()));
            } else if ((g2 & 64) == 64) {
                cVar.c(new b(cVar.b(cVar.e(i4, 63) - 1), cVar.d()));
            } else if ((g2 & 32) == 32) {
                int e3 = cVar.e(i4, 31);
                cVar.f6266d = e3;
                if (e3 < 0 || e3 > cVar.f6265c) {
                    break;
                }
                int i6 = cVar.f6270h;
                if (e3 < i6) {
                    if (e3 == 0) {
                        Arrays.fill(cVar.f6267e, (Object) null);
                        cVar.f6268f = cVar.f6267e.length - 1;
                        cVar.f6269g = 0;
                        cVar.f6270h = 0;
                    } else {
                        cVar.a(i6 - e3);
                    }
                }
            } else if (i4 == 16 || i4 == 0) {
                s1.h d3 = cVar.d();
                e.a(d3);
                arrayList.add(new b(d3, cVar.d()));
            } else {
                arrayList.add(new b(cVar.b(cVar.e(i4, 15) - 1), cVar.d()));
            }
        }
        throw new IOException(C0.g.g(e2, "Header index too large "));
    }

    public final void k(p pVar, int i2, byte b2, int i3) {
        boolean g2;
        if (i3 == 0) {
            f.c("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
            throw null;
        }
        boolean z2 = (b2 & 1) != 0;
        short g3 = (b2 & 8) != 0 ? (short) (this.f6346a.g() & 255) : (short) 0;
        if ((b2 & 32) != 0) {
            s1.n nVar = this.f6346a;
            nVar.k();
            nVar.g();
            pVar.getClass();
            i2 -= 5;
        }
        ArrayList j2 = j(a(i2, b2, g3), g3, b2, i3);
        ((r) pVar.f6315c).getClass();
        if (i3 != 0 && (i3 & 1) == 0) {
            r rVar = (r) pVar.f6315c;
            rVar.getClass();
            try {
                rVar.j(new k(rVar, new Object[]{rVar.f6322d, Integer.valueOf(i3)}, i3, j2, z2));
                return;
            } catch (RejectedExecutionException unused) {
                return;
            }
        }
        synchronized (((r) pVar.f6315c)) {
            try {
                w g4 = ((r) pVar.f6315c).g(i3);
                if (g4 == null) {
                    r rVar2 = (r) pVar.f6315c;
                    if (!rVar2.f6325g) {
                        if (i3 > rVar2.f6323e) {
                            if (i3 % 2 != rVar2.f6324f % 2) {
                                w wVar = new w(i3, (r) pVar.f6315c, false, z2, j1.d.r(j2));
                                r rVar3 = (r) pVar.f6315c;
                                rVar3.f6323e = i3;
                                rVar3.f6321c.put(Integer.valueOf(i3), wVar);
                                r.f6318u.execute(new p(pVar, new Object[]{((r) pVar.f6315c).f6322d, Integer.valueOf(i3)}, wVar));
                            }
                        }
                    }
                } else {
                    synchronized (g4) {
                        g4.f6365f = true;
                        g4.f6364e.add(j1.d.r(j2));
                        g2 = g4.g();
                        g4.notifyAll();
                    }
                    if (!g2) {
                        g4.f6363d.k(g4.f6362c);
                    }
                    if (z2) {
                        g4.h();
                    }
                }
            } finally {
            }
        }
    }

    public final void m(p pVar, int i2, byte b2, int i3) {
        if (i3 == 0) {
            f.c("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
            throw null;
        }
        short g2 = (b2 & 8) != 0 ? (short) (this.f6346a.g() & 255) : (short) 0;
        int k2 = this.f6346a.k() & Integer.MAX_VALUE;
        ArrayList j2 = j(a(i2 - 4, b2, g2), g2, b2, i3);
        r rVar = (r) pVar.f6315c;
        synchronized (rVar) {
            try {
                if (rVar.f6338t.contains(Integer.valueOf(k2))) {
                    rVar.o(k2, 2);
                    return;
                }
                rVar.f6338t.add(Integer.valueOf(k2));
                try {
                    rVar.j(new k(rVar, new Object[]{rVar.f6322d, Integer.valueOf(k2)}, k2, j2));
                } catch (RejectedExecutionException unused) {
                }
            } finally {
            }
        }
    }

    public final void n(p pVar, int i2, byte b2, int i3) {
        long j2;
        w[] wVarArr = null;
        if (i3 != 0) {
            f.c("TYPE_SETTINGS streamId != 0", new Object[0]);
            throw null;
        }
        if ((b2 & 1) != 0) {
            if (i2 == 0) {
                pVar.getClass();
                return;
            } else {
                f.c("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
                throw null;
            }
        }
        if (i2 % 6 != 0) {
            f.c("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(i2));
            throw null;
        }
        B b3 = new B();
        for (int i4 = 0; i4 < i2; i4 += 6) {
            int l2 = this.f6346a.l() & 65535;
            int k2 = this.f6346a.k();
            if (l2 != 2) {
                if (l2 == 3) {
                    l2 = 4;
                } else if (l2 == 4) {
                    if (k2 < 0) {
                        f.c("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                        throw null;
                    }
                    l2 = 7;
                } else if (l2 == 5 && (k2 < 16384 || k2 > 16777215)) {
                    f.c("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(k2));
                    throw null;
                }
            } else if (k2 != 0 && k2 != 1) {
                f.c("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                throw null;
            }
            b3.b(l2, k2);
        }
        synchronized (((r) pVar.f6315c)) {
            try {
                int a2 = ((r) pVar.f6315c).f6333o.a();
                B b4 = ((r) pVar.f6315c).f6333o;
                b4.getClass();
                for (int i5 = 0; i5 < 10; i5++) {
                    if (((1 << i5) & b3.f286a) != 0) {
                        b4.b(i5, ((int[]) b3.f287b)[i5]);
                    }
                }
                try {
                    r rVar = (r) pVar.f6315c;
                    rVar.f6326h.execute(new p(pVar, new Object[]{rVar.f6322d}, b3));
                } catch (RejectedExecutionException unused) {
                }
                int a3 = ((r) pVar.f6315c).f6333o.a();
                if (a3 == -1 || a3 == a2) {
                    j2 = 0;
                } else {
                    j2 = a3 - a2;
                    r rVar2 = (r) pVar.f6315c;
                    if (!rVar2.f6334p) {
                        rVar2.f6334p = true;
                    }
                    if (!rVar2.f6321c.isEmpty()) {
                        wVarArr = (w[]) ((r) pVar.f6315c).f6321c.values().toArray(new w[((r) pVar.f6315c).f6321c.size()]);
                    }
                }
                r.f6318u.execute(new q(pVar, ((r) pVar.f6315c).f6322d));
            } finally {
            }
        }
        if (wVarArr == null || j2 == 0) {
            return;
        }
        for (w wVar : wVarArr) {
            synchronized (wVar) {
                wVar.f6361b += j2;
                if (j2 > 0) {
                    wVar.notifyAll();
                }
            }
        }
    }
}
