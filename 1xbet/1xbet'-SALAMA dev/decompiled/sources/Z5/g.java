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
import p031e1.k;
import p151v2.n;
import p155w1.P2;

/* JADX INFO: loaded from: classes2.dex */
public final class g implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final N6.i f7909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f7910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f7911c;

    public g(N6.i iVar) {
        this.f7909a = iVar;
        e eVar = new e(iVar);
        this.f7910b = eVar;
        this.f7911c = new c(eVar);
    }

    public final boolean a(l lVar) throws IOException {
        C0509i0 c0509i0;
        a aVar;
        v vVar;
        int i7 = 0;
        try {
            this.f7909a.d(9L);
            int iA = i.a(this.f7909a);
            if (iA < 0 || iA > 16384) {
                i.c("FRAME_SIZE_ERROR: %s", Integer.valueOf(iA));
                throw null;
            }
            byte bA = (byte) (this.f7909a.a() & 255);
            byte bA2 = (byte) (this.f7909a.a() & 255);
            int iC = this.f7909a.c() & com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
            Logger logger = i.f7917a;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(f.a(true, iC, iA, bA, bA2));
            }
            switch (bA) {
                case 0:
                    b(lVar, iA, bA2, iC);
                    return true;
                case 1:
                    d(lVar, iA, bA2, iC);
                    return true;
                case 2:
                    if (iA != 5) {
                        i.c("TYPE_PRIORITY length: %d != 5", Integer.valueOf(iA));
                        throw null;
                    }
                    if (iC == 0) {
                        i.c("TYPE_PRIORITY streamId == 0", new Object[0]);
                        throw null;
                    }
                    N6.i iVar = this.f7909a;
                    iVar.c();
                    iVar.a();
                    lVar.getClass();
                    return true;
                case 3:
                    f(lVar, iA, iC);
                    return true;
                case 4:
                    g(lVar, iA, bA2, iC);
                    return true;
                case 5:
                    e(lVar, iA, bA2, iC);
                    return true;
                case 6:
                    if (iA != 8) {
                        i.c("TYPE_PING length != 8: %s", Integer.valueOf(iA));
                        throw null;
                    }
                    if (iC != 0) {
                        i.c("TYPE_PING streamId != 0", new Object[0]);
                        throw null;
                    }
                    int iC2 = this.f7909a.c();
                    int iC3 = this.f7909a.c();
                    i7 = (bA2 & 1) != 0 ? 1 : 0;
                    long j = (((long) iC2) << 32) | (((long) iC3) & 4294967295L);
                    lVar.f7559a.H(1, j);
                    if (i7 != 0) {
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
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                        if (c0509i0 != null) {
                            synchronized (c0509i0) {
                                try {
                                    if (!c0509i0.f7243d) {
                                        c0509i0.f7243d = true;
                                        long jA = c0509i0.f7241b.a(TimeUnit.NANOSECONDS);
                                        c0509i0.f7245f = jA;
                                        LinkedHashMap linkedHashMap = c0509i0.f7242c;
                                        c0509i0.f7242c = null;
                                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                                            try {
                                                ((Executor) entry.getValue()).execute(new RunnableC0506h0((C0553x0) entry.getKey(), jA));
                                            } catch (Throwable th2) {
                                                C0509i0.f7239g.log(Level.SEVERE, "Failed to execute PingCallback", th2);
                                            }
                                        }
                                    }
                                } catch (Throwable th3) {
                                    throw th3;
                                }
                            }
                        }
                        break;
                    } else {
                        synchronized (lVar.f7562d.f7589k) {
                            lVar.f7562d.f7588i.c(iC2, iC3, true);
                            break;
                        }
                    }
                    return true;
                case 7:
                    if (iA < 8) {
                        i.c("TYPE_GOAWAY length < 8: %s", Integer.valueOf(iA));
                        throw null;
                    }
                    if (iC != 0) {
                        i.c("TYPE_GOAWAY streamId != 0", new Object[0]);
                        throw null;
                    }
                    N6.i iVar2 = this.f7909a;
                    int iC4 = iVar2.c();
                    int iC5 = iVar2.c();
                    int i8 = iA - 8;
                    a[] aVarArrValues = a.values();
                    int length = aVarArrValues.length;
                    while (true) {
                        if (i7 < length) {
                            aVar = aVarArrValues[i7];
                            if (aVar.f7880a != iC5) {
                                i7++;
                            }
                        } else {
                            aVar = null;
                        }
                    }
                    if (aVar == null) {
                        i.c("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(iC5));
                        throw null;
                    }
                    N6.f fVarB = N6.f.f4798d;
                    if (i8 > 0) {
                        fVarB = iVar2.b(i8);
                    }
                    lVar.f7559a.G(1, iC4, aVar, fVarB);
                    a aVar2 = a.ENHANCE_YOUR_CALM;
                    m mVar2 = lVar.f7562d;
                    if (aVar == aVar2) {
                        String strY = fVarB.y();
                        m.f7564Q.log(Level.WARNING, lVar + ": Received GOAWAY with ENHANCE_YOUR_CALM. Debug data: " + strY);
                        if ("too_many_pings".equals(strY)) {
                            mVar2.f7574J.run();
                        }
                    }
                    long j7 = aVar.f7880a;
                    EnumC0491c0[] enumC0491c0Arr = EnumC0491c0.f7149d;
                    EnumC0491c0 enumC0491c0 = (j7 >= ((long) enumC0491c0Arr.length) || j7 < 0) ? null : enumC0491c0Arr[(int) j7];
                    l0 l0VarA = (enumC0491c0 == null ? l0.c(EnumC0491c0.f7148c.f7152b.f6547a.f6531a).g("Unrecognized HTTP/2 error code: " + j7) : enumC0491c0.f7152b).a("Received Goaway");
                    if (fVarB.b() > 0) {
                        l0VarA = l0VarA.a(fVarB.y());
                    }
                    Map map = m.f7563P;
                    mVar2.s(iC4, null, l0VarA);
                    return true;
                case 8:
                    if (iA != 4) {
                        i.c("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(iA));
                        throw null;
                    }
                    long jC = ((long) this.f7909a.c()) & 2147483647L;
                    if (jC == 0) {
                        i.c("windowSizeIncrement was 0", new Object[0]);
                        throw null;
                    }
                    lVar.f7559a.K(1, jC, iC);
                    if (jC != 0) {
                        synchronized (lVar.f7562d.f7589k) {
                            try {
                                if (iC == 0) {
                                    lVar.f7562d.j.i(null, (int) jC);
                                } else {
                                    X5.j jVar = (X5.j) lVar.f7562d.f7592n.get(Integer.valueOf(iC));
                                    if (jVar != null) {
                                        n nVar = lVar.f7562d.j;
                                        X5.i iVar3 = jVar.f7555n;
                                        synchronized (iVar3.f7547w) {
                                            vVar = iVar3.f7543J;
                                            break;
                                        }
                                        nVar.i(vVar, (int) jC);
                                    } else if (!lVar.f7562d.n(iC)) {
                                        i7 = 1;
                                    }
                                    if (i7 != 0) {
                                        m.g(lVar.f7562d, "Received window_update for unknown stream: " + iC);
                                    }
                                }
                            } catch (Throwable th4) {
                                throw th4;
                            }
                        }
                    } else if (iC == 0) {
                        m.g(lVar.f7562d, "Received 0 flow control window increment.");
                    } else {
                        lVar.f7562d.j(iC, l0.f6543m.g("Received 0 flow control window increment."), EnumC0543u.f7372a, false, a.PROTOCOL_ERROR, null);
                    }
                    return true;
                default:
                    this.f7909a.e(iA);
                    return true;
            }
        } catch (IOException unused) {
            return false;
        }
    }

    public final void b(l lVar, int i7, byte b7, int i8) throws IOException {
        X5.j jVar;
        boolean z4 = (b7 & 1) != 0;
        if ((b7 & 32) != 0) {
            i.c("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
            throw null;
        }
        short sA = (b7 & 8) != 0 ? (short) (this.f7909a.a() & 255) : (short) 0;
        int iB = i.b(i7, b7, sA);
        N6.i iVar = this.f7909a;
        lVar.f7559a.F(1, i8, iVar.f4807b, iB, z4);
        m mVar = lVar.f7562d;
        synchronized (mVar.f7589k) {
            jVar = (X5.j) mVar.f7592n.get(Integer.valueOf(i8));
        }
        if (jVar == null) {
            if (lVar.f7562d.n(i8)) {
                synchronized (lVar.f7562d.f7589k) {
                    lVar.f7562d.f7588i.d(i8, a.STREAM_CLOSED);
                }
                iVar.e(iB);
            } else {
                m.g(lVar.f7562d, "Received data for unknown stream: " + i8);
            }
            this.f7909a.e(sA);
        }
        long j = iB;
        iVar.d(j);
        N6.d dVar = new N6.d();
        dVar.m(iVar.f4807b, j);
        p036e6.c cVar = jVar.f7555n.f7542I;
        p036e6.b.f12742a.getClass();
        synchronized (lVar.f7562d.f7589k) {
            jVar.f7555n.n(i7 - iB, dVar, z4);
        }
        m mVar2 = lVar.f7562d;
        int i9 = mVar2.f7597s + i7;
        mVar2.f7597s = i9;
        if (i9 >= mVar2.f7585f * 0.5f) {
            synchronized (mVar2.f7589k) {
                m mVar3 = lVar.f7562d;
                mVar3.f7588i.e(0, mVar3.f7597s);
            }
            lVar.f7562d.f7597s = 0;
        }
        this.f7909a.e(sA);
    }

    public final ArrayList c(int i7, short s7, byte b7, int i8) throws IOException {
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
            byte bA = iVar.a();
            int i9 = bA & 255;
            if (i9 == 128) {
                throw new IOException("index == 0");
            }
            if ((bA & 128) == 128) {
                int iE = cVar.e(i9, 127);
                int i10 = iE - 1;
                if (i10 >= 0) {
                    b[] bVarArr = d.f7898b;
                    if (i10 <= bVarArr.length - 1) {
                        arrayList.add(bVarArr[i10]);
                    }
                }
                int length = cVar.f7894f + 1 + (i10 - d.f7898b.length);
                if (length >= 0) {
                    b[] bVarArr2 = cVar.f7893e;
                    if (length <= bVarArr2.length - 1) {
                        arrayList.add(bVarArr2[length]);
                    }
                }
                throw new IOException(k.d(iE, "Header index too large "));
            }
            if (i9 == 64) {
                N6.f fVarD = cVar.d();
                d.a(fVarD);
                cVar.c(new b(fVarD, cVar.d()));
            } else if ((bA & 64) == 64) {
                cVar.c(new b(cVar.b(cVar.e(i9, 63) - 1), cVar.d()));
            } else if ((bA & 32) == 32) {
                int iE2 = cVar.e(i9, 31);
                cVar.f7892d = iE2;
                if (iE2 < 0 || iE2 > cVar.f7891c) {
                    throw new IOException("Invalid dynamic table size update " + cVar.f7892d);
                }
                int i11 = cVar.f7896h;
                if (iE2 < i11) {
                    if (iE2 == 0) {
                        Arrays.fill(cVar.f7893e, (Object) null);
                        cVar.f7894f = cVar.f7893e.length - 1;
                        cVar.f7895g = 0;
                        cVar.f7896h = 0;
                    } else {
                        cVar.a(i11 - iE2);
                    }
                }
            } else if (i9 == 16 || i9 == 0) {
                N6.f fVarD2 = cVar.d();
                d.a(fVarD2);
                arrayList.add(new b(fVarD2, cVar.d()));
            } else {
                arrayList.add(new b(cVar.b(cVar.e(i9, 15) - 1), cVar.d()));
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f7909a.close();
    }

    public final void d(l lVar, int i7, byte b7, int i8) throws IOException {
        l0 l0VarG = null;
        boolean z4 = false;
        if (i8 == 0) {
            i.c("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
            throw null;
        }
        boolean z7 = (b7 & 1) != 0;
        short sA = (b7 & 8) != 0 ? (short) (this.f7909a.a() & 255) : (short) 0;
        if ((b7 & 32) != 0) {
            N6.i iVar = this.f7909a;
            iVar.c();
            iVar.a();
            lVar.getClass();
            i7 -= 5;
        }
        ArrayList arrayListC = c(i.b(i7, b7, sA), sA, b7, i8);
        P2 p5 = lVar.f7559a;
        if (p5.D()) {
            ((Logger) p5.f17514b).log((Level) p5.f17515c, "INBOUND HEADERS: streamId=" + i8 + " headers=" + arrayListC + " endStream=" + z7);
        }
        if (lVar.f7562d.f7575K != Integer.MAX_VALUE) {
            long jB = 0;
            for (int i9 = 0; i9 < arrayListC.size(); i9++) {
                b bVar = (b) arrayListC.get(i9);
                jB += (long) (bVar.f7887b.b() + bVar.f7886a.b() + 32);
            }
            int iMin = (int) Math.min(jB, 2147483647L);
            int i10 = lVar.f7562d.f7575K;
            if (iMin > i10) {
                l0 l0Var = l0.f6541k;
                Locale locale = Locale.US;
                l0VarG = l0Var.g("Response " + (z7 ? "trailer" : "header") + " metadata larger than " + i10 + ": " + iMin);
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
                } else if (l0VarG == null) {
                    p036e6.c cVar = jVar.f7555n.f7542I;
                    p036e6.b.f12742a.getClass();
                    jVar.f7555n.o(arrayListC, z7);
                } else {
                    if (!z7) {
                        lVar.f7562d.f7588i.d(i8, a.CANCEL);
                    }
                    jVar.f7555n.g(l0VarG, false, new b0());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z4) {
            m.g(lVar.f7562d, "Received header for unknown stream: " + i8);
        }
    }

    public final void e(l lVar, int i7, byte b7, int i8) throws IOException {
        if (i8 == 0) {
            i.c("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
            throw null;
        }
        short sA = (b7 & 8) != 0 ? (short) (this.f7909a.a() & 255) : (short) 0;
        int iC = this.f7909a.c() & com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        ArrayList arrayListC = c(i.b(i7 - 4, b7, sA), sA, b7, i8);
        P2 p5 = lVar.f7559a;
        if (p5.D()) {
            ((Logger) p5.f17514b).log((Level) p5.f17515c, "INBOUND PUSH_PROMISE: streamId=" + i8 + " promisedStreamId=" + iC + " headers=" + arrayListC);
        }
        synchronized (lVar.f7562d.f7589k) {
            lVar.f7562d.f7588i.d(i8, a.PROTOCOL_ERROR);
        }
    }

    public final void f(l lVar, int i7, int i8) throws IOException {
        a aVar;
        if (i7 != 4) {
            i.c("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(i7));
            throw null;
        }
        if (i8 == 0) {
            i.c("TYPE_RST_STREAM streamId == 0", new Object[0]);
            throw null;
        }
        int iC = this.f7909a.c();
        a[] aVarArrValues = a.values();
        int length = aVarArrValues.length;
        int i9 = 0;
        while (true) {
            if (i9 >= length) {
                aVar = null;
                break;
            }
            aVar = aVarArrValues[i9];
            if (aVar.f7880a == iC) {
                break;
            } else {
                i9++;
            }
        }
        if (aVar == null) {
            i.c("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(iC));
            throw null;
        }
        boolean z4 = true;
        lVar.f7559a.I(1, i8, aVar);
        l0 l0VarA = m.w(aVar).a("Rst Stream");
        k0 k0Var = l0VarA.f6547a;
        if (k0Var != k0.CANCELLED && k0Var != k0.DEADLINE_EXCEEDED) {
            z4 = false;
        }
        synchronized (lVar.f7562d.f7589k) {
            try {
                X5.j jVar = (X5.j) lVar.f7562d.f7592n.get(Integer.valueOf(i8));
                if (jVar != null) {
                    p036e6.c cVar = jVar.f7555n.f7542I;
                    p036e6.b.f12742a.getClass();
                    lVar.f7562d.j(i8, l0VarA, aVar == a.REFUSED_STREAM ? EnumC0543u.f7373b : EnumC0543u.f7372a, z4, null, null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g(l lVar, int i7, byte b7, int i8) throws IOException {
        boolean z4;
        char c3;
        int i9;
        short sC;
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
                sC = (short) (((dVar.c() & 255) << 8) | (dVar.c() & 255));
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
                sC = (short) i16;
            }
            int iC = this.f7909a.c();
            switch (sC) {
                case 1:
                case 6:
                    break;
                case 2:
                    if (iC != 0 && iC != 1) {
                        i.c("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                        throw null;
                    }
                    break;
                case 3:
                    sC = 4;
                    break;
                case 4:
                    if (iC < 0) {
                        i.c("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                        throw null;
                    }
                    sC = 7;
                    break;
                    break;
                case 5:
                    if (iC < 16384 || iC > 16777215) {
                        i.c("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(iC));
                        throw null;
                    }
                    break;
                default:
                    continue;
                    break;
            }
            vVar.n(sC, iC);
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
                    int i18 = i17 - nVar.f17142a;
                    nVar.f17142a = i17;
                    for (v vVar2 : ((m) nVar.f17143b).k()) {
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
                P2 p5 = dVar2.f7499c;
                if (p5.D()) {
                    ((Logger) p5.f17514b).log((Level) p5.f17515c, "OUTBOUND".concat(" SETTINGS: ack=true"));
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
