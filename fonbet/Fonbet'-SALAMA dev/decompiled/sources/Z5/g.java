package Z5;

import A1.C0011c;
import U5.C0435b;
import U5.b0;
import U5.k0;
import U5.l0;
import W5.C0509i0;
import W5.C0538s0;
import W5.C0553x0;
import W5.EnumC0491c0;
import W5.EnumC0543u;
import W5.RunnableC0506h0;
import W5.RunnableC0533q0;
import X5.l;
import X5.m;
import X5.v;
import e1.k;
import e6.AbstractC1053b;
import e6.C1054c;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import v2.n;
import w1.P2;

/* loaded from: classes2.dex */
public final class g implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final N6.i f7909a;

    /* renamed from: b, reason: collision with root package name */
    public final e f7910b;

    /* renamed from: c, reason: collision with root package name */
    public final c f7911c;

    public g(N6.i iVar) {
        this.f7909a = iVar;
        e eVar = new e(iVar);
        this.f7910b = eVar;
        this.f7911c = new c(eVar);
    }

    public final boolean a(l lVar) {
        C0509i0 c0509i0;
        a aVar;
        v vVar;
        try {
            this.f7909a.d(9L);
            int a2 = i.a(this.f7909a);
            if (a2 < 0 || a2 > 16384) {
                i.c("FRAME_SIZE_ERROR: %s", Integer.valueOf(a2));
                throw null;
            }
            byte a4 = (byte) (this.f7909a.a() & 255);
            byte a7 = (byte) (this.f7909a.a() & 255);
            int c3 = this.f7909a.c() & com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
            Logger logger = i.f7917a;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(f.a(true, c3, a2, a4, a7));
            }
            switch (a4) {
                case 0:
                    b(lVar, a2, a7, c3);
                    return true;
                case 1:
                    d(lVar, a2, a7, c3);
                    return true;
                case 2:
                    if (a2 != 5) {
                        i.c("TYPE_PRIORITY length: %d != 5", Integer.valueOf(a2));
                        throw null;
                    }
                    if (c3 == 0) {
                        i.c("TYPE_PRIORITY streamId == 0", new Object[0]);
                        throw null;
                    }
                    N6.i iVar = this.f7909a;
                    iVar.c();
                    iVar.a();
                    lVar.getClass();
                    return true;
                case 3:
                    f(lVar, a2, c3);
                    return true;
                case 4:
                    g(lVar, a2, a7, c3);
                    return true;
                case 5:
                    e(lVar, a2, a7, c3);
                    return true;
                case 6:
                    if (a2 != 8) {
                        i.c("TYPE_PING length != 8: %s", Integer.valueOf(a2));
                        throw null;
                    }
                    if (c3 != 0) {
                        i.c("TYPE_PING streamId != 0", new Object[0]);
                        throw null;
                    }
                    int c4 = this.f7909a.c();
                    int c7 = this.f7909a.c();
                    r3 = (a7 & 1) != 0 ? 1 : 0;
                    long j = (c4 << 32) | (c7 & 4294967295L);
                    lVar.f7559a.H(1, j);
                    if (r3 == 0) {
                        synchronized (lVar.f7562d.f7589k) {
                            lVar.f7562d.f7588i.c(c4, c7, true);
                        }
                    } else {
                        synchronized (lVar.f7562d.f7589k) {
                            try {
                                m mVar = lVar.f7562d;
                                c0509i0 = mVar.f7602x;
                                if (c0509i0 != null) {
                                    long j3 = c0509i0.f7240a;
                                    if (j3 == j) {
                                        mVar.f7602x = null;
                                    } else {
                                        Logger logger2 = m.f7564Q;
                                        Level level = Level.WARNING;
                                        Locale locale = Locale.US;
                                        logger2.log(level, "Received unexpected ping ack. Expecting " + j3 + ", got " + j);
                                    }
                                } else {
                                    m.f7564Q.warning("Received unexpected ping ack. No ping outstanding");
                                }
                                c0509i0 = null;
                            } finally {
                            }
                        }
                        if (c0509i0 != null) {
                            synchronized (c0509i0) {
                                try {
                                    if (!c0509i0.f7243d) {
                                        c0509i0.f7243d = true;
                                        long a8 = c0509i0.f7241b.a(TimeUnit.NANOSECONDS);
                                        c0509i0.f7245f = a8;
                                        LinkedHashMap linkedHashMap = c0509i0.f7242c;
                                        c0509i0.f7242c = null;
                                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                                            try {
                                                ((Executor) entry.getValue()).execute(new RunnableC0506h0((C0553x0) entry.getKey(), a8));
                                            } catch (Throwable th) {
                                                C0509i0.f7239g.log(Level.SEVERE, "Failed to execute PingCallback", th);
                                            }
                                        }
                                    }
                                } finally {
                                }
                            }
                        }
                    }
                    return true;
                case 7:
                    if (a2 < 8) {
                        i.c("TYPE_GOAWAY length < 8: %s", Integer.valueOf(a2));
                        throw null;
                    }
                    if (c3 != 0) {
                        i.c("TYPE_GOAWAY streamId != 0", new Object[0]);
                        throw null;
                    }
                    N6.i iVar2 = this.f7909a;
                    int c8 = iVar2.c();
                    int c9 = iVar2.c();
                    int i7 = a2 - 8;
                    a[] values = a.values();
                    int length = values.length;
                    while (true) {
                        if (r3 < length) {
                            aVar = values[r3];
                            if (aVar.f7880a != c9) {
                                r3++;
                            }
                        } else {
                            aVar = null;
                        }
                    }
                    if (aVar == null) {
                        i.c("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(c9));
                        throw null;
                    }
                    N6.f fVar = N6.f.f4798d;
                    if (i7 > 0) {
                        fVar = iVar2.b(i7);
                    }
                    lVar.f7559a.G(1, c8, aVar, fVar);
                    a aVar2 = a.ENHANCE_YOUR_CALM;
                    m mVar2 = lVar.f7562d;
                    if (aVar == aVar2) {
                        String y4 = fVar.y();
                        m.f7564Q.log(Level.WARNING, lVar + ": Received GOAWAY with ENHANCE_YOUR_CALM. Debug data: " + y4);
                        if ("too_many_pings".equals(y4)) {
                            mVar2.f7574J.run();
                        }
                    }
                    long j7 = aVar.f7880a;
                    EnumC0491c0[] enumC0491c0Arr = EnumC0491c0.f7149d;
                    EnumC0491c0 enumC0491c0 = (j7 >= ((long) enumC0491c0Arr.length) || j7 < 0) ? null : enumC0491c0Arr[(int) j7];
                    l0 a9 = (enumC0491c0 == null ? l0.c(EnumC0491c0.f7148c.f7152b.f6547a.f6531a).g("Unrecognized HTTP/2 error code: " + j7) : enumC0491c0.f7152b).a("Received Goaway");
                    if (fVar.b() > 0) {
                        a9 = a9.a(fVar.y());
                    }
                    Map map = m.f7563P;
                    mVar2.s(c8, null, a9);
                    return true;
                case 8:
                    if (a2 != 4) {
                        i.c("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(a2));
                        throw null;
                    }
                    long c10 = this.f7909a.c() & 2147483647L;
                    if (c10 == 0) {
                        i.c("windowSizeIncrement was 0", new Object[0]);
                        throw null;
                    }
                    lVar.f7559a.K(1, c10, c3);
                    if (c10 != 0) {
                        synchronized (lVar.f7562d.f7589k) {
                            try {
                                if (c3 == 0) {
                                    lVar.f7562d.j.i(null, (int) c10);
                                } else {
                                    X5.j jVar = (X5.j) lVar.f7562d.f7592n.get(Integer.valueOf(c3));
                                    if (jVar != null) {
                                        n nVar = lVar.f7562d.j;
                                        X5.i iVar3 = jVar.f7555n;
                                        synchronized (iVar3.f7547w) {
                                            vVar = iVar3.f7543J;
                                        }
                                        nVar.i(vVar, (int) c10);
                                    } else if (!lVar.f7562d.n(c3)) {
                                        r3 = 1;
                                    }
                                    if (r3 != 0) {
                                        m.g(lVar.f7562d, "Received window_update for unknown stream: " + c3);
                                    }
                                }
                            } finally {
                            }
                        }
                    } else if (c3 == 0) {
                        m.g(lVar.f7562d, "Received 0 flow control window increment.");
                    } else {
                        lVar.f7562d.j(c3, l0.f6543m.g("Received 0 flow control window increment."), EnumC0543u.f7372a, false, a.PROTOCOL_ERROR, null);
                    }
                    return true;
                default:
                    this.f7909a.e(a2);
                    return true;
            }
        } catch (IOException unused) {
            return false;
        }
    }

    public final void b(l lVar, int i7, byte b7, int i8) {
        X5.j jVar;
        boolean z4 = (b7 & 1) != 0;
        if ((b7 & 32) != 0) {
            i.c("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
            throw null;
        }
        short a2 = (b7 & 8) != 0 ? (short) (this.f7909a.a() & 255) : (short) 0;
        int b8 = i.b(i7, b7, a2);
        N6.i iVar = this.f7909a;
        lVar.f7559a.F(1, i8, iVar.f4807b, b8, z4);
        m mVar = lVar.f7562d;
        synchronized (mVar.f7589k) {
            jVar = (X5.j) mVar.f7592n.get(Integer.valueOf(i8));
        }
        if (jVar != null) {
            long j = b8;
            iVar.d(j);
            N6.d dVar = new N6.d();
            dVar.m(iVar.f4807b, j);
            C1054c c1054c = jVar.f7555n.f7542I;
            AbstractC1053b.f12736a.getClass();
            synchronized (lVar.f7562d.f7589k) {
                jVar.f7555n.n(i7 - b8, dVar, z4);
            }
        } else {
            if (!lVar.f7562d.n(i8)) {
                m.g(lVar.f7562d, "Received data for unknown stream: " + i8);
                this.f7909a.e(a2);
            }
            synchronized (lVar.f7562d.f7589k) {
                lVar.f7562d.f7588i.d(i8, a.STREAM_CLOSED);
            }
            iVar.e(b8);
        }
        m mVar2 = lVar.f7562d;
        int i9 = mVar2.f7597s + i7;
        mVar2.f7597s = i9;
        if (i9 >= mVar2.f7585f * 0.5f) {
            synchronized (mVar2.f7589k) {
                lVar.f7562d.f7588i.e(0, r13.f7597s);
            }
            lVar.f7562d.f7597s = 0;
        }
        this.f7909a.e(a2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0100, code lost:
    
        throw new java.io.IOException("Invalid dynamic table size update " + r5.f7892d);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList c(int i7, short s7, byte b7, int i8) {
        int e7;
        e eVar = this.f7910b;
        eVar.f7904e = i7;
        eVar.f7901b = i7;
        eVar.f7905f = s7;
        eVar.f7902c = b7;
        eVar.f7903d = i8;
        while (true) {
            c cVar = this.f7911c;
            N6.i iVar = cVar.f7890b;
            if (iVar.f4808c) {
                throw new IllegalStateException("closed");
            }
            N6.d dVar = iVar.f4807b;
            long j = dVar.f4797b;
            ArrayList arrayList = cVar.f7889a;
            if (j == 0 && iVar.f4806a.t(dVar, 8192L) == -1) {
                ArrayList arrayList2 = new ArrayList(arrayList);
                arrayList.clear();
                return arrayList2;
            }
            byte a2 = iVar.a();
            int i9 = a2 & 255;
            if (i9 == 128) {
                throw new IOException("index == 0");
            }
            if ((a2 & 128) == 128) {
                e7 = cVar.e(i9, 127);
                int i10 = e7 - 1;
                if (i10 >= 0) {
                    b[] bVarArr = d.f7898b;
                    if (i10 <= bVarArr.length - 1) {
                        arrayList.add(bVarArr[i10]);
                    }
                }
                int length = cVar.f7894f + 1 + (i10 - d.f7898b.length);
                if (length < 0) {
                    break;
                }
                b[] bVarArr2 = cVar.f7893e;
                if (length > bVarArr2.length - 1) {
                    break;
                }
                arrayList.add(bVarArr2[length]);
            } else if (i9 == 64) {
                N6.f d7 = cVar.d();
                d.a(d7);
                cVar.c(new b(d7, cVar.d()));
            } else if ((a2 & 64) == 64) {
                cVar.c(new b(cVar.b(cVar.e(i9, 63) - 1), cVar.d()));
            } else if ((a2 & 32) == 32) {
                int e8 = cVar.e(i9, 31);
                cVar.f7892d = e8;
                if (e8 < 0 || e8 > cVar.f7891c) {
                    break;
                }
                int i11 = cVar.f7896h;
                if (e8 < i11) {
                    if (e8 == 0) {
                        Arrays.fill(cVar.f7893e, (Object) null);
                        cVar.f7894f = cVar.f7893e.length - 1;
                        cVar.f7895g = 0;
                        cVar.f7896h = 0;
                    } else {
                        cVar.a(i11 - e8);
                    }
                }
            } else if (i9 == 16 || i9 == 0) {
                N6.f d8 = cVar.d();
                d.a(d8);
                arrayList.add(new b(d8, cVar.d()));
            } else {
                arrayList.add(new b(cVar.b(cVar.e(i9, 15) - 1), cVar.d()));
            }
        }
        throw new IOException(k.d(e7, "Header index too large "));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f7909a.close();
    }

    public final void d(l lVar, int i7, byte b7, int i8) {
        l0 l0Var = null;
        boolean z4 = false;
        if (i8 == 0) {
            i.c("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
            throw null;
        }
        boolean z7 = (b7 & 1) != 0;
        short a2 = (b7 & 8) != 0 ? (short) (this.f7909a.a() & 255) : (short) 0;
        if ((b7 & 32) != 0) {
            N6.i iVar = this.f7909a;
            iVar.c();
            iVar.a();
            lVar.getClass();
            i7 -= 5;
        }
        ArrayList c3 = c(i.b(i7, b7, a2), a2, b7, i8);
        P2 p22 = lVar.f7559a;
        if (p22.D()) {
            ((Logger) p22.f17508b).log((Level) p22.f17509c, "INBOUND HEADERS: streamId=" + i8 + " headers=" + c3 + " endStream=" + z7);
        }
        if (lVar.f7562d.f7575K != Integer.MAX_VALUE) {
            long j = 0;
            for (int i9 = 0; i9 < c3.size(); i9++) {
                b bVar = (b) c3.get(i9);
                j += bVar.f7887b.b() + bVar.f7886a.b() + 32;
            }
            int min = (int) Math.min(j, 2147483647L);
            int i10 = lVar.f7562d.f7575K;
            if (min > i10) {
                l0 l0Var2 = l0.f6541k;
                Locale locale = Locale.US;
                l0Var = l0Var2.g("Response " + (z7 ? "trailer" : "header") + " metadata larger than " + i10 + ": " + min);
            }
        }
        synchronized (lVar.f7562d.f7589k) {
            try {
                X5.j jVar = (X5.j) lVar.f7562d.f7592n.get(Integer.valueOf(i8));
                if (jVar == null) {
                    if (lVar.f7562d.n(i8)) {
                        lVar.f7562d.f7588i.d(i8, a.STREAM_CLOSED);
                    } else {
                        z4 = true;
                    }
                } else if (l0Var == null) {
                    C1054c c1054c = jVar.f7555n.f7542I;
                    AbstractC1053b.f12736a.getClass();
                    jVar.f7555n.o(c3, z7);
                } else {
                    if (!z7) {
                        lVar.f7562d.f7588i.d(i8, a.CANCEL);
                    }
                    jVar.f7555n.g(l0Var, false, new b0());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z4) {
            m.g(lVar.f7562d, "Received header for unknown stream: " + i8);
        }
    }

    public final void e(l lVar, int i7, byte b7, int i8) {
        if (i8 == 0) {
            i.c("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
            throw null;
        }
        short a2 = (b7 & 8) != 0 ? (short) (this.f7909a.a() & 255) : (short) 0;
        int c3 = this.f7909a.c() & com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        ArrayList c4 = c(i.b(i7 - 4, b7, a2), a2, b7, i8);
        P2 p22 = lVar.f7559a;
        if (p22.D()) {
            ((Logger) p22.f17508b).log((Level) p22.f17509c, "INBOUND PUSH_PROMISE: streamId=" + i8 + " promisedStreamId=" + c3 + " headers=" + c4);
        }
        synchronized (lVar.f7562d.f7589k) {
            lVar.f7562d.f7588i.d(i8, a.PROTOCOL_ERROR);
        }
    }

    public final void f(l lVar, int i7, int i8) {
        a aVar;
        if (i7 != 4) {
            i.c("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(i7));
            throw null;
        }
        if (i8 == 0) {
            i.c("TYPE_RST_STREAM streamId == 0", new Object[0]);
            throw null;
        }
        int c3 = this.f7909a.c();
        a[] values = a.values();
        int length = values.length;
        int i9 = 0;
        while (true) {
            if (i9 >= length) {
                aVar = null;
                break;
            }
            aVar = values[i9];
            if (aVar.f7880a == c3) {
                break;
            } else {
                i9++;
            }
        }
        if (aVar == null) {
            i.c("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(c3));
            throw null;
        }
        boolean z4 = true;
        lVar.f7559a.I(1, i8, aVar);
        l0 a2 = m.w(aVar).a("Rst Stream");
        k0 k0Var = a2.f6547a;
        if (k0Var != k0.CANCELLED && k0Var != k0.DEADLINE_EXCEEDED) {
            z4 = false;
        }
        synchronized (lVar.f7562d.f7589k) {
            try {
                X5.j jVar = (X5.j) lVar.f7562d.f7592n.get(Integer.valueOf(i8));
                if (jVar != null) {
                    C1054c c1054c = jVar.f7555n.f7542I;
                    AbstractC1053b.f12736a.getClass();
                    lVar.f7562d.j(i8, a2, aVar == a.REFUSED_STREAM ? EnumC0543u.f7373b : EnumC0543u.f7372a, z4, null, null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void g(l lVar, int i7, byte b7, int i8) {
        boolean z4;
        char c3;
        int i9;
        short s7;
        if (i8 != 0) {
            i.c("TYPE_SETTINGS streamId != 0", new Object[0]);
            throw null;
        }
        if ((b7 & 1) != 0) {
            if (i7 == 0) {
                lVar.getClass();
                return;
            } else {
                i.c("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
                throw null;
            }
        }
        if (i7 % 6 != 0) {
            i.c("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(i7));
            throw null;
        }
        B.v vVar = new B.v(7, (byte) 0);
        for (int i10 = 0; i10 < i7; i10 += 6) {
            N6.i iVar = this.f7909a;
            iVar.d(2L);
            N6.d dVar = iVar.f4807b;
            if (dVar.f4797b < 2) {
                throw new EOFException();
            }
            N6.j jVar = dVar.f4796a;
            t6.h.b(jVar);
            int i11 = jVar.f4810b;
            int i12 = jVar.f4811c;
            if (i12 - i11 < 2) {
                s7 = (short) (((dVar.c() & 255) << 8) | (dVar.c() & 255));
            } else {
                int i13 = i11 + 1;
                byte[] bArr = jVar.f4809a;
                int i14 = (bArr[i11] & 255) << 8;
                int i15 = i11 + 2;
                int i16 = i14 | (bArr[i13] & 255);
                dVar.f4797b -= 2;
                if (i15 == i12) {
                    dVar.f4796a = jVar.a();
                    N6.k.a(jVar);
                } else {
                    jVar.f4810b = i15;
                }
                s7 = (short) i16;
            }
            int c4 = this.f7909a.c();
            switch (s7) {
                case 1:
                case 6:
                    vVar.n(s7, c4);
                case 2:
                    if (c4 != 0 && c4 != 1) {
                        i.c("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                        throw null;
                    }
                    vVar.n(s7, c4);
                    break;
                case 3:
                    s7 = 4;
                    vVar.n(s7, c4);
                case 4:
                    if (c4 < 0) {
                        i.c("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                        throw null;
                    }
                    s7 = 7;
                    vVar.n(s7, c4);
                case 5:
                    if (c4 < 16384 || c4 > 16777215) {
                        i.c("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(c4));
                        throw null;
                    }
                    vVar.n(s7, c4);
                    break;
                default:
            }
        }
        lVar.f7559a.J(1, vVar);
        synchronized (lVar.f7562d.f7589k) {
            try {
                if (vVar.k(4)) {
                    lVar.f7562d.f7567C = ((int[]) vVar.f966c)[4];
                }
                if (vVar.k(7)) {
                    int i17 = ((int[]) vVar.f966c)[7];
                    n nVar = lVar.f7562d.j;
                    if (i17 < 0) {
                        nVar.getClass();
                        throw new IllegalArgumentException(k.d(i17, "Invalid initial window size: "));
                    }
                    int i18 = i17 - nVar.f17136a;
                    nVar.f17136a = i17;
                    for (v vVar2 : ((m) nVar.f17137b).k()) {
                        vVar2.a(i18);
                    }
                    z4 = i18 > 0;
                } else {
                    z4 = false;
                }
                if (lVar.f7561c) {
                    m mVar = lVar.f7562d;
                    C0011c c0011c = mVar.f7587h;
                    C0435b c0435b = mVar.f7599u;
                    Iterator it = ((C0538s0) c0011c.f334d).j.iterator();
                    if (it.hasNext()) {
                        it.next().getClass();
                        throw new ClassCastException();
                    }
                    mVar.f7599u = c0435b;
                    C0011c c0011c2 = lVar.f7562d.f7587h;
                    C0538s0 c0538s0 = (C0538s0) c0011c2.f334d;
                    c0538s0.f7348i.l(2, "READY");
                    c0538s0.f7349k.execute(new RunnableC0533q0(c0011c2, 0));
                    lVar.f7561c = false;
                }
                X5.d dVar2 = lVar.f7562d.f7588i;
                P2 p22 = dVar2.f7499c;
                if (p22.D()) {
                    ((Logger) p22.f17508b).log((Level) p22.f17509c, "OUTBOUND".concat(" SETTINGS: ack=true"));
                }
                try {
                    dVar2.f7498b.a(vVar);
                } catch (IOException e7) {
                    dVar2.f7497a.p(e7);
                }
                if (z4) {
                    lVar.f7562d.j.j();
                }
                lVar.f7562d.t();
            } catch (Throwable th) {
                throw th;
            }
        }
        int i19 = vVar.f965b;
        if ((i19 & 2) != 0) {
            c3 = 1;
            i9 = ((int[]) vVar.f966c)[1];
        } else {
            c3 = 1;
            i9 = -1;
        }
        if (i9 >= 0) {
            c cVar = this.f7911c;
            int i20 = (i19 & 2) != 0 ? ((int[]) vVar.f966c)[c3] : -1;
            cVar.f7891c = i20;
            cVar.f7892d = i20;
            int i21 = cVar.f7896h;
            if (i20 < i21) {
                if (i20 != 0) {
                    cVar.a(i21 - i20);
                    return;
                }
                Arrays.fill(cVar.f7893e, (Object) null);
                cVar.f7894f = cVar.f7893e.length - 1;
                cVar.f7895g = 0;
                cVar.f7896h = 0;
            }
        }
    }
}
