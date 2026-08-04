package X5;

import A1.C0011c;
import A1.x0;
import C0.I;
import C0.RunnableC0085d;
import U5.AbstractC0442i;
import U5.C0434a;
import U5.C0435b;
import U5.C0437d;
import U5.C0458z;
import U5.F;
import U5.b0;
import U5.c0;
import U5.l0;
import U5.m0;
import W5.A;
import W5.AbstractC0486a1;
import W5.AbstractC0494d0;
import W5.C0509i0;
import W5.C0512j0;
import W5.C0553x0;
import W5.C0556y0;
import W5.EnumC0543u;
import W5.InterfaceC0540t;
import W5.RunnableC0506h0;
import W5.W1;
import W5.X0;
import W5.Z1;
import W5.d2;
import W5.f2;
import W5.h2;
import io.sentry.SentryLockReason;
import io.sentry.protocol.Request;
import java.io.EOFException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import p155w1.P2;
import p155w1.V0;

/* JADX INFO: loaded from: classes2.dex */
public final class m implements A {

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static final Map f7563P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final Logger f7564Q;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final SocketFactory f7565A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final SSLSocketFactory f7566B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f7567C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final LinkedList f7568D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final Y5.b f7569E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public C0556y0 f7570F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f7571G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public long f7572H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public long f7573I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final RunnableC0085d f7574J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final int f7575K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final h2 f7576L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final C0512j0 f7577M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final C0458z f7578N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final int f7579O;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InetSocketAddress f7580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f7582c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Random f7583d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f2 f7584e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f7585f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Z5.i f7586g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public C0011c f7587h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public d f7588i;
    public p151v2.n j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f7589k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final F f7590l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f7591m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final HashMap f7592n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Executor f7593o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final W1 f7594p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ScheduledExecutorService f7595q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f7596r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f7597s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public l f7598t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public C0435b f7599u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public l0 f7600v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f7601w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public C0509i0 f7602x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f7603y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f7604z;

    static {
        EnumMap enumMap = new EnumMap(Z5.a.class);
        Z5.a aVar = Z5.a.NO_ERROR;
        l0 l0Var = l0.f6543m;
        enumMap.put(aVar, l0Var.g("No error: A GRPC status of OK should have been sent"));
        enumMap.put(Z5.a.PROTOCOL_ERROR, l0Var.g("Protocol error"));
        enumMap.put(Z5.a.INTERNAL_ERROR, l0Var.g("Internal error"));
        enumMap.put(Z5.a.FLOW_CONTROL_ERROR, l0Var.g("Flow control error"));
        enumMap.put(Z5.a.STREAM_CLOSED, l0Var.g("Stream closed"));
        enumMap.put(Z5.a.FRAME_TOO_LARGE, l0Var.g("Frame too large"));
        enumMap.put(Z5.a.REFUSED_STREAM, l0.f6544n.g("Refused stream"));
        enumMap.put(Z5.a.CANCEL, l0.f6537f.g("Cancelled"));
        enumMap.put(Z5.a.COMPRESSION_ERROR, l0Var.g("Compression error"));
        enumMap.put(Z5.a.CONNECT_ERROR, l0Var.g("Connect error"));
        enumMap.put(Z5.a.ENHANCE_YOUR_CALM, l0.f6541k.g("Enhance your calm"));
        enumMap.put(Z5.a.INADEQUATE_SECURITY, l0.f6540i.g("Inadequate security"));
        f7563P = Collections.unmodifiableMap(enumMap);
        f7564Q = Logger.getLogger(m.class.getName());
    }

    public m(f fVar, InetSocketAddress inetSocketAddress, String str, C0435b c0435b, C0458z c0458z, RunnableC0085d runnableC0085d) {
        f2 f2Var = AbstractC0494d0.f7179r;
        Z5.i iVar = new Z5.i();
        this.f7583d = new Random();
        Object obj = new Object();
        this.f7589k = obj;
        this.f7592n = new HashMap();
        this.f7567C = 0;
        this.f7568D = new LinkedList();
        this.f7577M = new C0512j0(this, 2);
        this.f7579O = 30000;
        p113p3.f.k(inetSocketAddress, SentryLockReason.JsonKeys.ADDRESS);
        this.f7580a = inetSocketAddress;
        this.f7581b = str;
        this.f7596r = fVar.f7518y;
        this.f7585f = fVar.f7508C;
        Executor executor = fVar.f7512b;
        p113p3.f.k(executor, "executor");
        this.f7593o = executor;
        this.f7594p = new W1(fVar.f7512b);
        ScheduledExecutorService scheduledExecutorService = fVar.f7514d;
        p113p3.f.k(scheduledExecutorService, "scheduledExecutorService");
        this.f7595q = scheduledExecutorService;
        this.f7591m = 3;
        this.f7565A = SocketFactory.getDefault();
        this.f7566B = fVar.f7516f;
        Y5.b bVar = fVar.f7517x;
        p113p3.f.k(bVar, "connectionSpec");
        this.f7569E = bVar;
        p113p3.f.k(f2Var, "stopwatchFactory");
        this.f7584e = f2Var;
        this.f7586g = iVar;
        this.f7582c = "grpc-java-okhttp/1.62.2";
        this.f7578N = c0458z;
        this.f7574J = runnableC0085d;
        this.f7575K = fVar.f7509D;
        fVar.f7515e.getClass();
        this.f7576L = new h2();
        this.f7590l = F.a(m.class, inetSocketAddress.toString());
        C0435b c0435b2 = C0435b.f6454b;
        C0434a c0434a = Z1.f7104b;
        IdentityHashMap identityHashMap = new IdentityHashMap(1);
        identityHashMap.put(c0434a, c0435b);
        for (Map.Entry entry : c0435b2.f6455a.entrySet()) {
            if (!identityHashMap.containsKey(entry.getKey())) {
                identityHashMap.put((C0434a) entry.getKey(), entry.getValue());
            }
        }
        this.f7599u = new C0435b(identityHashMap);
        synchronized (obj) {
        }
    }

    public static void g(m mVar, String str) {
        Z5.a aVar = Z5.a.PROTOCOL_ERROR;
        mVar.getClass();
        mVar.s(0, aVar, w(aVar).a(str));
    }

    public static Socket h(m mVar, InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, String str, String str2) throws m0 {
        mVar.getClass();
        Socket socket = null;
        try {
            InetAddress address = inetSocketAddress2.getAddress();
            SocketFactory socketFactory = mVar.f7565A;
            Socket socketCreateSocket = address != null ? socketFactory.createSocket(inetSocketAddress2.getAddress(), inetSocketAddress2.getPort()) : socketFactory.createSocket(inetSocketAddress2.getHostName(), inetSocketAddress2.getPort());
            try {
                socketCreateSocket.setTcpNoDelay(true);
                socketCreateSocket.setSoTimeout(mVar.f7579O);
                N6.c cVarY = Q0.a.Y(socketCreateSocket);
                N6.h hVar = new N6.h(Q0.a.W(socketCreateSocket));
                P2 p2I = mVar.i(inetSocketAddress, str, str2);
                p145u1.c cVar = (p145u1.c) p2I.f17515c;
                p008a6.a aVar = (p008a6.a) p2I.f17514b;
                Locale locale = Locale.US;
                hVar.e("CONNECT " + aVar.f7973a + ":" + aVar.f7974b + " HTTP/1.1");
                hVar.e("\r\n");
                int length = ((String[]) cVar.f16597b).length / 2;
                for (int i7 = 0; i7 < length; i7++) {
                    int i8 = i7 * 2;
                    String[] strArr = (String[]) cVar.f16597b;
                    hVar.e((i8 < 0 || i8 >= strArr.length) ? null : strArr[i8]);
                    hVar.e(": ");
                    int i9 = i8 + 1;
                    hVar.e((i9 < 0 || i9 >= strArr.length) ? null : strArr[i9]);
                    hVar.e("\r\n");
                }
                hVar.e("\r\n");
                hVar.flush();
                B1.m mVarN = B1.m.n(q(cVarY));
                while (!q(cVarY).equals("")) {
                }
                int i10 = mVarN.f1014b;
                if (i10 >= 200 && i10 < 300) {
                    socketCreateSocket.setSoTimeout(0);
                    return socketCreateSocket;
                }
                N6.d dVar = new N6.d();
                try {
                    socketCreateSocket.shutdownOutput();
                    cVarY.t(dVar, 1024L);
                } catch (IOException e7) {
                    dVar.p("Unable to read body: " + e7.toString());
                }
                try {
                    socketCreateSocket.close();
                } catch (IOException unused) {
                }
                Locale locale2 = Locale.US;
                throw new m0(l0.f6544n.g("Response returned from proxy was not successful (expected 2xx, got " + i10 + " " + ((String) mVarN.f1016d) + "). Response body:\n" + dVar.f(dVar.f4797b, C6.a.f1581a)));
            } catch (IOException e8) {
                e = e8;
                socket = socketCreateSocket;
                if (socket != null) {
                    AbstractC0494d0.b(socket);
                }
                throw new m0(l0.f6544n.g("Failed trying to connect with proxy").f(e));
            }
        } catch (IOException e9) {
            e = e9;
        }
    }

    public static String q(N6.c cVar) throws EOFException {
        N6.j jVar;
        long j;
        long j3;
        long j7;
        N6.d dVar = new N6.d();
        while (cVar.t(dVar, 1L) != -1) {
            if (dVar.b(dVar.f4797b - 1) == 10) {
                long j8 = dVar.f4797b;
                long j9 = Long.MAX_VALUE > j8 ? j8 : Long.MAX_VALUE;
                if (0 == j9 || (jVar = dVar.f4796a) == null) {
                    j3 = -1;
                    j7 = -1;
                } else if (j8 < 0) {
                    while (j8 > 0) {
                        jVar = jVar.f4815g;
                        t6.h.b(jVar);
                        j8 -= (long) (jVar.f4811c - jVar.f4810b);
                    }
                    long j10 = 0;
                    while (true) {
                        if (j8 < j9) {
                            int iMin = (int) Math.min(jVar.f4811c, (((long) jVar.f4810b) + j9) - j8);
                            int i7 = (int) ((((long) jVar.f4810b) + j10) - j8);
                            while (true) {
                                if (i7 >= iMin) {
                                    j10 = j8 + ((long) (jVar.f4811c - jVar.f4810b));
                                    jVar = jVar.f4814f;
                                    t6.h.b(jVar);
                                    j8 = j10;
                                } else if (jVar.f4809a[i7] == 10) {
                                    j = i7 - jVar.f4810b;
                                    j7 = j + j8;
                                    j3 = -1;
                                } else {
                                    i7++;
                                }
                            }
                        } else {
                            j3 = -1;
                            j7 = -1;
                        }
                    }
                } else {
                    j8 = 0;
                    while (true) {
                        long j11 = ((long) (jVar.f4811c - jVar.f4810b)) + j8;
                        if (j11 > 0) {
                            break;
                        }
                        jVar = jVar.f4814f;
                        t6.h.b(jVar);
                        j8 = j11;
                    }
                    long j12 = 0;
                    while (true) {
                        if (j8 < j9) {
                            int iMin2 = (int) Math.min(jVar.f4811c, (((long) jVar.f4810b) + j9) - j8);
                            int i8 = (int) ((((long) jVar.f4810b) + j12) - j8);
                            while (true) {
                                if (i8 >= iMin2) {
                                    j12 = ((long) (jVar.f4811c - jVar.f4810b)) + j8;
                                    jVar = jVar.f4814f;
                                    t6.h.b(jVar);
                                    j8 = j12;
                                } else if (jVar.f4809a[i8] == 10) {
                                    j = i8 - jVar.f4810b;
                                    j7 = j + j8;
                                    j3 = -1;
                                } else {
                                    i8++;
                                }
                            }
                        } else {
                            j3 = -1;
                            j7 = -1;
                        }
                    }
                }
                if (j7 != j3) {
                    return O6.a.a(dVar, j7);
                }
                if (Long.MAX_VALUE < dVar.f4797b && dVar.b(9223372036854775806L) == 13 && dVar.b(Long.MAX_VALUE) == 10) {
                    return O6.a.a(dVar, Long.MAX_VALUE);
                }
                N6.d dVar2 = new N6.d();
                long jMin = Math.min(32, dVar.f4797b);
                long j13 = 0;
                p113p3.f.m(dVar.f4797b, 0L, jMin);
                if (jMin != 0) {
                    dVar2.f4797b += jMin;
                    N6.j jVar2 = dVar.f4796a;
                    while (true) {
                        t6.h.b(jVar2);
                        long j14 = jVar2.f4811c - jVar2.f4810b;
                        if (j13 < j14) {
                            break;
                        }
                        j13 -= j14;
                        jVar2 = jVar2.f4814f;
                    }
                    while (jMin > 0) {
                        t6.h.b(jVar2);
                        N6.j jVarC = jVar2.c();
                        int i9 = jVarC.f4810b + ((int) j13);
                        jVarC.f4810b = i9;
                        jVarC.f4811c = Math.min(i9 + ((int) jMin), jVarC.f4811c);
                        N6.j jVar3 = dVar2.f4796a;
                        if (jVar3 == null) {
                            jVarC.f4815g = jVarC;
                            jVarC.f4814f = jVarC;
                            dVar2.f4796a = jVarC;
                        } else {
                            N6.j jVar4 = jVar3.f4815g;
                            t6.h.b(jVar4);
                            jVar4.b(jVarC);
                        }
                        jMin -= (long) (jVarC.f4811c - jVarC.f4810b);
                        jVar2 = jVar2.f4814f;
                        j13 = 0;
                    }
                }
                throw new EOFException("\\n not found: limit=" + Math.min(dVar.f4797b, Long.MAX_VALUE) + " content=" + dVar2.e(dVar2.f4797b).c() + (char) 8230);
            }
        }
        throw new EOFException("\\n not found: " + dVar.e(dVar.f4797b).c());
    }

    public static l0 w(Z5.a aVar) {
        l0 l0Var = (l0) f7563P.get(aVar);
        if (l0Var != null) {
            return l0Var;
        }
        return l0.f6538g.g("Unknown http2 error code: " + aVar.f7880a);
    }

    @Override // W5.InterfaceC0549w
    public final InterfaceC0540t a(H2.r rVar, b0 b0Var, C0437d c0437d, AbstractC0442i[] abstractC0442iArr) throws Throwable {
        p113p3.f.k(rVar, Request.JsonKeys.METHOD);
        p113p3.f.k(b0Var, "headers");
        C0435b c0435b = this.f7599u;
        d2 d2Var = new d2(abstractC0442iArr);
        for (AbstractC0442i abstractC0442i : abstractC0442iArr) {
            abstractC0442i.n(c0435b, b0Var);
        }
        synchronized (this.f7589k) {
            try {
                try {
                    return new j(rVar, b0Var, this.f7588i, this, this.j, this.f7589k, this.f7596r, this.f7585f, this.f7581b, this.f7582c, d2Var, this.f7576L, c0437d);
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }

    @Override // W5.Y0
    public final Runnable b(X0 x1) {
        this.f7587h = (C0011c) x1;
        if (this.f7571G) {
            C0556y0 c0556y0 = new C0556y0(new x0(this, 10), this.f7595q, this.f7572H, this.f7573I);
            this.f7570F = c0556y0;
            synchronized (c0556y0) {
            }
        }
        c cVar = new c(this.f7594p, this);
        Z5.i iVar = this.f7586g;
        N6.h hVar = new N6.h(cVar);
        iVar.getClass();
        b bVar = new b(cVar, new Z5.h(hVar));
        synchronized (this.f7589k) {
            d dVar = new d(this, bVar);
            this.f7588i = dVar;
            p151v2.n nVar = new p151v2.n();
            nVar.f17143b = this;
            nVar.f17144c = dVar;
            nVar.f17142a = 65535;
            nVar.f17145d = new v(nVar, 0, 65535, null);
            this.j = nVar;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.f7594p.execute(new H2.q(11, this, countDownLatch, cVar, false));
        try {
            r();
            countDownLatch.countDown();
            this.f7594p.execute(new RunnableC0085d(this, 27));
            return null;
        } catch (Throwable th) {
            countDownLatch.countDown();
            throw th;
        }
    }

    @Override // W5.Y0
    public final void c(l0 l0Var) {
        e(l0Var);
        synchronized (this.f7589k) {
            try {
                Iterator it = this.f7592n.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    it.remove();
                    ((j) entry.getValue()).f7555n.g(l0Var, false, new b0());
                    o((j) entry.getValue());
                }
                for (j jVar : this.f7568D) {
                    jVar.f7555n.f(l0Var, EnumC0543u.f7375d, true, new b0());
                    o(jVar);
                }
                this.f7568D.clear();
                v();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // W5.A
    public final C0435b d() {
        return this.f7599u;
    }

    @Override // W5.Y0
    public final void e(l0 l0Var) {
        synchronized (this.f7589k) {
            try {
                if (this.f7600v != null) {
                    return;
                }
                this.f7600v = l0Var;
                this.f7587h.k(l0Var);
                v();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // U5.E
    public final F f() {
        return this.f7590l;
    }

    /* JADX WARN: Code duplicated, block: B:114:0x0284 A[LOOP:9: B:86:0x023b->B:114:0x0284, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:122:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:125:0x02b2 A[LOOP:4: B:121:0x02a3->B:125:0x02b2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:139:0x02fa A[EDGE_INSN: B:139:0x02fa->B:196:0x046c BREAK  A[LOOP:11: B:183:0x0449->B:194:0x0468]] */
    /* JADX WARN: Code duplicated, block: B:140:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:142:0x0306  */
    /* JADX WARN: Code duplicated, block: B:145:0x030c  */
    /* JADX WARN: Code duplicated, block: B:147:0x030f  */
    /* JADX WARN: Code duplicated, block: B:154:0x0324  */
    /* JADX WARN: Code duplicated, block: B:159:0x0334  */
    /* JADX WARN: Code duplicated, block: B:165:0x0346  */
    /* JADX WARN: Code duplicated, block: B:168:0x035f  */
    /* JADX WARN: Code duplicated, block: B:169:0x0372  */
    /* JADX WARN: Code duplicated, block: B:171:0x03ee A[LOOP:8: B:170:0x03ec->B:171:0x03ee, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:175:0x042a  */
    /* JADX WARN: Code duplicated, block: B:20:0x0064  */
    /* JADX WARN: Code duplicated, block: B:22:0x0068  */
    /* JADX WARN: Code duplicated, block: B:235:0x012c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x006c  */
    /* JADX WARN: Code duplicated, block: B:249:0x02b0 A[EDGE_INSN: B:249:0x02b0->B:124:0x02b0 BREAK  A[LOOP:4: B:121:0x02a3->B:125:0x02b2], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:252:0x0326 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:256:0x0344 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:257:0x0340 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:259:0x0338 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x0070  */
    /* JADX WARN: Code duplicated, block: B:262:0x0331 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:267:0x01fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0095  */
    /* JADX WARN: Code duplicated, block: B:271:0x027c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:33:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:34:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:36:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:40:0x0137  */
    /* JADX WARN: Code duplicated, block: B:42:0x018c  */
    /* JADX WARN: Code duplicated, block: B:47:0x0199 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x019b  */
    /* JADX WARN: Code duplicated, block: B:49:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:51:0x01af  */
    /* JADX WARN: Code duplicated, block: B:53:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:98:0x0255  */
    public final P2 i(InetSocketAddress inetSocketAddress, String str, String str2) throws EOFException {
        String strSubstring;
        int i7;
        String strF;
        int i8;
        InetAddress byAddress;
        byte[] address;
        int i9;
        int i10;
        int i11;
        int i12;
        N6.d dVar;
        int i13;
        long j;
        N6.j jVarJ;
        int i14;
        int i15;
        byte[] bArr;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        char cCharAt;
        int i25;
        int i26;
        int iA;
        String str3;
        char[] cArr;
        int i27;
        int i28;
        int i29 = -1;
        int i30 = 4;
        int i31 = 2;
        B1.m mVar = new B1.m(9, (char) 0);
        mVar.f1014b = -1;
        mVar.f1016d = "https";
        String hostName = inetSocketAddress.getHostName();
        if (hostName == null) {
            throw new IllegalArgumentException("host == null");
        }
        int length = hostName.length();
        int iCharCount = 0;
        while (true) {
            if (iCharCount >= length) {
                strSubstring = hostName.substring(0, length);
                break;
            }
            int i32 = 37;
            if (hostName.charAt(iCharCount) == '%') {
                N6.d dVar2 = new N6.d();
                dVar2.o(iCharCount, hostName);
                while (iCharCount < length) {
                    int iCodePointAt = hostName.codePointAt(iCharCount);
                    if (iCodePointAt == i32 && (i28 = iCharCount + 2) < length) {
                        int iA2 = p008a6.a.a(hostName.charAt(iCharCount + 1));
                        int iA3 = p008a6.a.a(hostName.charAt(i28));
                        if (iA2 != i29 && iA3 != i29) {
                            dVar2.n((iA2 << i30) + iA3);
                            iCharCount = i28;
                        } else if (iCodePointAt < 128) {
                            dVar2.n(iCodePointAt);
                        } else if (iCodePointAt < 2048) {
                            N6.j jVarJ2 = dVar2.j(i31);
                            int i33 = jVarJ2.f4811c;
                            byte[] bArr2 = jVarJ2.f4809a;
                            bArr2[i33] = (byte) ((iCodePointAt >> 6) | 192);
                            bArr2[i33 + 1] = (byte) (128 | (iCodePointAt & 63));
                            jVarJ2.f4811c = i33 + i31;
                            dVar2.f4797b += 2;
                        } else if (55296 > iCodePointAt) {
                            if (iCodePointAt < 65536) {
                                N6.j jVarJ3 = dVar2.j(3);
                                int i34 = jVarJ3.f4811c;
                                byte[] bArr3 = jVarJ3.f4809a;
                                bArr3[i34] = (byte) ((iCodePointAt >> 12) | 224);
                                bArr3[i34 + 1] = (byte) (((iCodePointAt >> 6) & 63) | 128);
                                bArr3[i34 + 2] = (byte) (128 | (iCodePointAt & 63));
                                jVarJ3.f4811c = i34 + 3;
                                dVar2.f4797b += 3;
                            } else {
                                if (iCodePointAt > 1114111) {
                                    StringBuilder sb = new StringBuilder("Unexpected code point: 0x");
                                    if (iCodePointAt != 0) {
                                        char[] cArr2 = O6.b.f5016a;
                                        cArr = new char[]{cArr2[(iCodePointAt >> 28) & 15], cArr2[(iCodePointAt >> 24) & 15], cArr2[(iCodePointAt >> 20) & 15], cArr2[(iCodePointAt >> 16) & 15], cArr2[(iCodePointAt >> 12) & 15], cArr2[(iCodePointAt >> 8) & 15], cArr2[(iCodePointAt >> 4) & 15], cArr2[iCodePointAt & 15]};
                                        i27 = 0;
                                        while (i27 < 8) {
                                            i27++;
                                        }
                                        if (i27 < 0) {
                                            throw new IndexOutOfBoundsException(AbstractC0486a1.f(i27, "startIndex: ", ", endIndex: 8, size: 8"));
                                        }
                                        if (i27 > 8) {
                                            throw new IllegalArgumentException(AbstractC0486a1.f(i27, "startIndex: ", " > endIndex: 8"));
                                        }
                                        str3 = new String(cArr, i27, 8 - i27);
                                    } else {
                                        str3 = "0";
                                    }
                                    sb.append(str3);
                                    throw new IllegalArgumentException(sb.toString());
                                }
                                N6.j jVarJ4 = dVar2.j(4);
                                int i35 = jVarJ4.f4811c;
                                byte[] bArr4 = jVarJ4.f4809a;
                                bArr4[i35] = (byte) ((iCodePointAt >> 18) | 240);
                                bArr4[i35 + 1] = (byte) (((iCodePointAt >> 12) & 63) | 128);
                                bArr4[i35 + 2] = (byte) (((iCodePointAt >> 6) & 63) | 128);
                                bArr4[i35 + 3] = (byte) (128 | (iCodePointAt & 63));
                                jVarJ4.f4811c = i35 + 4;
                                dVar2.f4797b += 4;
                            }
                        } else if (iCodePointAt < 65536) {
                            N6.j jVarJ5 = dVar2.j(3);
                            int i36 = jVarJ5.f4811c;
                            byte[] bArr5 = jVarJ5.f4809a;
                            bArr5[i36] = (byte) ((iCodePointAt >> 12) | 224);
                            bArr5[i36 + 1] = (byte) (((iCodePointAt >> 6) & 63) | 128);
                            bArr5[i36 + 2] = (byte) (128 | (iCodePointAt & 63));
                            jVarJ5.f4811c = i36 + 3;
                            dVar2.f4797b += 3;
                        } else {
                            if (iCodePointAt > 1114111) {
                                StringBuilder sb2 = new StringBuilder("Unexpected code point: 0x");
                                if (iCodePointAt != 0) {
                                    char[] cArr3 = O6.b.f5016a;
                                    cArr = new char[]{cArr3[(iCodePointAt >> 28) & 15], cArr3[(iCodePointAt >> 24) & 15], cArr3[(iCodePointAt >> 20) & 15], cArr3[(iCodePointAt >> 16) & 15], cArr3[(iCodePointAt >> 12) & 15], cArr3[(iCodePointAt >> 8) & 15], cArr3[(iCodePointAt >> 4) & 15], cArr3[iCodePointAt & 15]};
                                    i27 = 0;
                                    while (i27 < 8) {
                                        i27++;
                                    }
                                    if (i27 < 0) {
                                        throw new IndexOutOfBoundsException(AbstractC0486a1.f(i27, "startIndex: ", ", endIndex: 8, size: 8"));
                                    }
                                    if (i27 > 8) {
                                        throw new IllegalArgumentException(AbstractC0486a1.f(i27, "startIndex: ", " > endIndex: 8"));
                                    }
                                    str3 = new String(cArr, i27, 8 - i27);
                                } else {
                                    str3 = "0";
                                }
                                sb2.append(str3);
                                throw new IllegalArgumentException(sb2.toString());
                            }
                            N6.j jVarJ6 = dVar2.j(4);
                            int i37 = jVarJ6.f4811c;
                            byte[] bArr6 = jVarJ6.f4809a;
                            bArr6[i37] = (byte) ((iCodePointAt >> 18) | 240);
                            bArr6[i37 + 1] = (byte) (((iCodePointAt >> 12) & 63) | 128);
                            bArr6[i37 + 2] = (byte) (((iCodePointAt >> 6) & 63) | 128);
                            bArr6[i37 + 3] = (byte) (128 | (iCodePointAt & 63));
                            jVarJ6.f4811c = i37 + 4;
                            dVar2.f4797b += 4;
                        }
                    } else if (iCodePointAt < 128) {
                        dVar2.n(iCodePointAt);
                    } else if (iCodePointAt < 2048) {
                        N6.j jVarJ7 = dVar2.j(i31);
                        int i38 = jVarJ7.f4811c;
                        byte[] bArr7 = jVarJ7.f4809a;
                        bArr7[i38] = (byte) ((iCodePointAt >> 6) | 192);
                        bArr7[i38 + 1] = (byte) (128 | (iCodePointAt & 63));
                        jVarJ7.f4811c = i38 + i31;
                        dVar2.f4797b += 2;
                    } else if (55296 > iCodePointAt && iCodePointAt < 57344) {
                        dVar2.n(63);
                    } else if (iCodePointAt < 65536) {
                        N6.j jVarJ8 = dVar2.j(3);
                        int i39 = jVarJ8.f4811c;
                        byte[] bArr8 = jVarJ8.f4809a;
                        bArr8[i39] = (byte) ((iCodePointAt >> 12) | 224);
                        bArr8[i39 + 1] = (byte) (((iCodePointAt >> 6) & 63) | 128);
                        bArr8[i39 + 2] = (byte) (128 | (iCodePointAt & 63));
                        jVarJ8.f4811c = i39 + 3;
                        dVar2.f4797b += 3;
                    } else {
                        if (iCodePointAt > 1114111) {
                            StringBuilder sb3 = new StringBuilder("Unexpected code point: 0x");
                            if (iCodePointAt != 0) {
                                char[] cArr4 = O6.b.f5016a;
                                cArr = new char[]{cArr4[(iCodePointAt >> 28) & 15], cArr4[(iCodePointAt >> 24) & 15], cArr4[(iCodePointAt >> 20) & 15], cArr4[(iCodePointAt >> 16) & 15], cArr4[(iCodePointAt >> 12) & 15], cArr4[(iCodePointAt >> 8) & 15], cArr4[(iCodePointAt >> 4) & 15], cArr4[iCodePointAt & 15]};
                                i27 = 0;
                                while (i27 < 8 && cArr[i27] == '0') {
                                    i27++;
                                }
                                if (i27 < 0) {
                                    throw new IndexOutOfBoundsException(AbstractC0486a1.f(i27, "startIndex: ", ", endIndex: 8, size: 8"));
                                }
                                if (i27 > 8) {
                                    throw new IllegalArgumentException(AbstractC0486a1.f(i27, "startIndex: ", " > endIndex: 8"));
                                }
                                str3 = new String(cArr, i27, 8 - i27);
                            } else {
                                str3 = "0";
                            }
                            sb3.append(str3);
                            throw new IllegalArgumentException(sb3.toString());
                        }
                        N6.j jVarJ9 = dVar2.j(4);
                        int i310 = jVarJ9.f4811c;
                        byte[] bArr9 = jVarJ9.f4809a;
                        bArr9[i310] = (byte) ((iCodePointAt >> 18) | 240);
                        bArr9[i310 + 1] = (byte) (((iCodePointAt >> 12) & 63) | 128);
                        bArr9[i310 + 2] = (byte) (((iCodePointAt >> 6) & 63) | 128);
                        bArr9[i310 + 3] = (byte) (128 | (iCodePointAt & 63));
                        jVarJ9.f4811c = i310 + 4;
                        dVar2.f4797b += 4;
                    }
                    iCharCount += Character.charCount(iCodePointAt);
                    i32 = 37;
                    i29 = -1;
                    i30 = 4;
                    i31 = 2;
                }
                strSubstring = dVar2.f(dVar2.f4797b, C6.a.f1581a);
                break;
            }
            iCharCount++;
        }
        if (!strSubstring.startsWith("[") || !strSubstring.endsWith("]")) {
            try {
                String lowerCase = IDN.toASCII(strSubstring).toLowerCase(Locale.US);
                if (!lowerCase.isEmpty()) {
                    while (true) {
                        if (i7 >= lowerCase.length()) {
                            strF = lowerCase;
                            break;
                        }
                        char cCharAt2 = lowerCase.charAt(i7);
                        i7 = (cCharAt2 > 31 && cCharAt2 < 127 && " #%/:?@[\\]".indexOf(cCharAt2) == -1) ? i7 + 1 : 0;
                    }
                }
            } catch (IllegalArgumentException unused) {
            }
            strF = null;
            break;
        }
        int length2 = strSubstring.length() - 1;
        int i40 = 16;
        byte[] bArr10 = new byte[16];
        int i41 = 0;
        int i42 = -1;
        int i43 = -1;
        int i44 = 1;
        while (true) {
            try {
                if (i44 < length2) {
                    if (i41 != i40) {
                        int i45 = i44 + 2;
                        if (i45 <= length2) {
                            i19 = 0;
                            if (strSubstring.regionMatches(i44, "::", 0, 2)) {
                                if (i42 == -1) {
                                    i41 += 2;
                                    i42 = i41;
                                    if (i45 == length2) {
                                        i8 = 16;
                                    } else {
                                        i43 = i45;
                                        i44 = i43;
                                        i25 = 0;
                                        while (i44 < length2) {
                                            iA = p008a6.a.a(strSubstring.charAt(i44));
                                            if (iA == -1) {
                                                break;
                                            }
                                            i25 = (i25 << 4) + iA;
                                            i44++;
                                        }
                                        i26 = i44 - i43;
                                        if (i26 == 0 && i26 <= 4) {
                                            int i46 = i41 + 1;
                                            bArr10[i41] = (byte) ((i25 >>> 8) & 255);
                                            i41 += 2;
                                            bArr10[i46] = (byte) (i25 & 255);
                                            length2 = length2;
                                            i40 = 16;
                                        }
                                    }
                                }
                            }
                        } else {
                            i19 = 0;
                        }
                        if (i41 != 0) {
                            if (strSubstring.regionMatches(i44, ":", i19, 1)) {
                                i44++;
                            } else if (strSubstring.regionMatches(i44, ".", i19, 1)) {
                                int i47 = i41 - 2;
                                int i48 = i47;
                                while (true) {
                                    if (i20 >= length2) {
                                        i20 = i43;
                                        int i49 = i42;
                                        if (i48 == i41 + 2) {
                                            i41 += 2;
                                            i42 = i49;
                                            i8 = 16;
                                        }
                                        if (byAddress == null) {
                                            strF = null;
                                            break;
                                        }
                                        address = byAddress.getAddress();
                                        i9 = 16;
                                        if (address.length == 16) {
                                            throw new AssertionError();
                                        }
                                        i10 = -1;
                                        i11 = 0;
                                        i12 = 0;
                                        while (i12 < address.length) {
                                            i17 = i12;
                                            while (i17 < i9 && address[i17] == 0 && address[i17 + 1] == 0) {
                                                i17 += 2;
                                                i9 = 16;
                                            }
                                            i18 = i17 - i12;
                                            if (i18 > i11) {
                                                i10 = i12;
                                                i11 = i18;
                                            }
                                            i12 = i17 + 2;
                                            i9 = 16;
                                        }
                                        dVar = new N6.d();
                                        i13 = 0;
                                        while (i13 < address.length) {
                                            if (i13 == i10) {
                                                dVar.n(58);
                                                i13 += i11;
                                                if (i13 == 16) {
                                                    dVar.n(58);
                                                }
                                            } else {
                                                if (i13 > 0) {
                                                    dVar.n(58);
                                                }
                                                j = ((address[i13] & 255) << 8) | (address[i13 + 1] & 255);
                                                if (j == 0) {
                                                    dVar.n(48);
                                                    bArr = address;
                                                    i16 = i10;
                                                } else {
                                                    long j3 = j | (j >>> 1);
                                                    long j7 = j3 | (j3 >>> 2);
                                                    long j8 = j7 | (j7 >>> 4);
                                                    long j9 = j8 | (j8 >>> 8);
                                                    long j10 = j9 | (j9 >>> 16);
                                                    long j11 = j10 | (j10 >>> 32);
                                                    long j12 = j11 - ((j11 >>> 1) & 6148914691236517205L);
                                                    long j13 = ((j12 >>> 2) & 3689348814741910323L) + (j12 & 3689348814741910323L);
                                                    long j14 = ((j13 >>> 4) + j13) & 1085102592571150095L;
                                                    long j15 = j14 + (j14 >>> 8);
                                                    long j16 = j15 + (j15 >>> 16);
                                                    int i50 = (int) ((((j16 & 63) + ((j16 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
                                                    jVarJ = dVar.j(i50);
                                                    i14 = jVarJ.f4811c;
                                                    i15 = (i14 + i50) - 1;
                                                    while (i15 >= i14) {
                                                        jVarJ.f4809a[i15] = O6.a.f5015a[(int) (j & 15)];
                                                        j >>>= 4;
                                                        i15--;
                                                        address = address;
                                                        i10 = i10;
                                                    }
                                                    bArr = address;
                                                    i16 = i10;
                                                    jVarJ.f4811c += i50;
                                                    dVar.f4797b += (long) i50;
                                                }
                                                i13 += 2;
                                                address = bArr;
                                                i10 = i16;
                                            }
                                        }
                                        strF = dVar.f(dVar.f4797b, C6.a.f1581a);
                                    } else if (i48 == 16) {
                                        i20 = i43;
                                    } else if (i48 == i47) {
                                        i21 = i20;
                                        i22 = 0;
                                        while (true) {
                                            i23 = i47;
                                            if (i21 < length2) {
                                                cCharAt = strSubstring.charAt(i21);
                                                i24 = i42;
                                                if (cCharAt < '0' && cCharAt <= '9') {
                                                    if ((i22 != 0 || i20 == i21) && (i22 = ((i22 * 10) + cCharAt) - 48) <= 255) {
                                                        i21++;
                                                        i47 = i23;
                                                        i42 = i24;
                                                    }
                                                }
                                            } else {
                                                i24 = i42;
                                            }
                                            if (i21 - i20 == 0) {
                                                bArr10[i48] = (byte) i22;
                                                i48++;
                                                i20 = i21;
                                                i47 = i23;
                                                i42 = i24;
                                            }
                                        }
                                    } else if (strSubstring.charAt(i20) == '.') {
                                        i20++;
                                        i21 = i20;
                                        i22 = 0;
                                        while (true) {
                                            i23 = i47;
                                            if (i21 < length2) {
                                                cCharAt = strSubstring.charAt(i21);
                                                i24 = i42;
                                                if (cCharAt < '0') {
                                                }
                                            } else {
                                                i24 = i42;
                                            }
                                            if (i21 - i20 == 0) {
                                                bArr10[i48] = (byte) i22;
                                                i48++;
                                                i20 = i21;
                                                i47 = i23;
                                                i42 = i24;
                                            }
                                            i21++;
                                            i47 = i23;
                                            i42 = i24;
                                        }
                                    }
                                }
                            }
                        }
                        i43 = i44;
                        i44 = i43;
                        i25 = 0;
                        while (i44 < length2) {
                            iA = p008a6.a.a(strSubstring.charAt(i44));
                            if (iA == -1) {
                                break;
                                break;
                            }
                            i25 = (i25 << 4) + iA;
                            i44++;
                        }
                        i26 = i44 - i43;
                        if (i26 == 0) {
                        }
                    }
                    byAddress = null;
                    if (byAddress == null) {
                        strF = null;
                        break;
                    }
                    address = byAddress.getAddress();
                    i9 = 16;
                    if (address.length == 16) {
                        throw new AssertionError();
                    }
                    i10 = -1;
                    i11 = 0;
                    i12 = 0;
                    while (i12 < address.length) {
                        i17 = i12;
                        while (i17 < i9) {
                            i17 += 2;
                            i9 = 16;
                        }
                        i18 = i17 - i12;
                        if (i18 > i11) {
                            i10 = i12;
                            i11 = i18;
                        }
                        i12 = i17 + 2;
                        i9 = 16;
                    }
                    dVar = new N6.d();
                    i13 = 0;
                    while (i13 < address.length) {
                        if (i13 == i10) {
                            dVar.n(58);
                            i13 += i11;
                            if (i13 == 16) {
                                dVar.n(58);
                            }
                        } else {
                            if (i13 > 0) {
                                dVar.n(58);
                            }
                            j = ((address[i13] & 255) << 8) | (address[i13 + 1] & 255);
                            if (j == 0) {
                                dVar.n(48);
                                bArr = address;
                                i16 = i10;
                            } else {
                                long j17 = j | (j >>> 1);
                                long j18 = j17 | (j17 >>> 2);
                                long j19 = j18 | (j18 >>> 4);
                                long j20 = j19 | (j19 >>> 8);
                                long j110 = j20 | (j20 >>> 16);
                                long j111 = j110 | (j110 >>> 32);
                                long j112 = j111 - ((j111 >>> 1) & 6148914691236517205L);
                                long j113 = ((j112 >>> 2) & 3689348814741910323L) + (j112 & 3689348814741910323L);
                                long j114 = ((j113 >>> 4) + j113) & 1085102592571150095L;
                                long j115 = j114 + (j114 >>> 8);
                                long j116 = j115 + (j115 >>> 16);
                                int i51 = (int) ((((j116 & 63) + ((j116 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
                                jVarJ = dVar.j(i51);
                                i14 = jVarJ.f4811c;
                                i15 = (i14 + i51) - 1;
                                while (i15 >= i14) {
                                    jVarJ.f4809a[i15] = O6.a.f5015a[(int) (j & 15)];
                                    j >>>= 4;
                                    i15--;
                                    address = address;
                                    i10 = i10;
                                }
                                bArr = address;
                                i16 = i10;
                                jVarJ.f4811c += i51;
                                dVar.f4797b += (long) i51;
                            }
                            i13 += 2;
                            address = bArr;
                            i10 = i16;
                        }
                    }
                    strF = dVar.f(dVar.f4797b, C6.a.f1581a);
                } else {
                    i8 = i40;
                }
                if (i41 != i8) {
                    if (i42 == -1) {
                        byAddress = null;
                    } else {
                        int i52 = i41 - i42;
                        System.arraycopy(bArr10, i42, bArr10, 16 - i52, i52);
                        Arrays.fill(bArr10, i42, (16 - i41) + i42, (byte) 0);
                    }
                    if (byAddress == null) {
                        strF = null;
                        break;
                    }
                    address = byAddress.getAddress();
                    i9 = 16;
                    if (address.length == 16) {
                        throw new AssertionError();
                    }
                    i10 = -1;
                    i11 = 0;
                    i12 = 0;
                    while (i12 < address.length) {
                        i17 = i12;
                        while (i17 < i9) {
                            i17 += 2;
                            i9 = 16;
                        }
                        i18 = i17 - i12;
                        if (i18 > i11) {
                            i10 = i12;
                            i11 = i18;
                        }
                        i12 = i17 + 2;
                        i9 = 16;
                    }
                    dVar = new N6.d();
                    i13 = 0;
                    while (i13 < address.length) {
                        if (i13 == i10) {
                            dVar.n(58);
                            i13 += i11;
                            if (i13 == 16) {
                                dVar.n(58);
                            }
                        } else {
                            if (i13 > 0) {
                                dVar.n(58);
                            }
                            j = ((address[i13] & 255) << 8) | (address[i13 + 1] & 255);
                            if (j == 0) {
                                dVar.n(48);
                                bArr = address;
                                i16 = i10;
                            } else {
                                long j117 = j | (j >>> 1);
                                long j118 = j117 | (j117 >>> 2);
                                long j119 = j118 | (j118 >>> 4);
                                long j21 = j119 | (j119 >>> 8);
                                long j1110 = j21 | (j21 >>> 16);
                                long j1111 = j1110 | (j1110 >>> 32);
                                long j1112 = j1111 - ((j1111 >>> 1) & 6148914691236517205L);
                                long j1113 = ((j1112 >>> 2) & 3689348814741910323L) + (j1112 & 3689348814741910323L);
                                long j1114 = ((j1113 >>> 4) + j1113) & 1085102592571150095L;
                                long j1115 = j1114 + (j1114 >>> 8);
                                long j1116 = j1115 + (j1115 >>> 16);
                                int i53 = (int) ((((j1116 & 63) + ((j1116 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
                                jVarJ = dVar.j(i53);
                                i14 = jVarJ.f4811c;
                                i15 = (i14 + i53) - 1;
                                while (i15 >= i14) {
                                    jVarJ.f4809a[i15] = O6.a.f5015a[(int) (j & 15)];
                                    j >>>= 4;
                                    i15--;
                                    address = address;
                                    i10 = i10;
                                }
                                bArr = address;
                                i16 = i10;
                                jVarJ.f4811c += i53;
                                dVar.f4797b += (long) i53;
                            }
                            i13 += 2;
                            address = bArr;
                            i10 = i16;
                        }
                    }
                    strF = dVar.f(dVar.f4797b, C6.a.f1581a);
                }
                byAddress = InetAddress.getByAddress(bArr10);
                if (byAddress == null) {
                    strF = null;
                    break;
                }
                address = byAddress.getAddress();
                i9 = 16;
                if (address.length == 16) {
                    throw new AssertionError();
                }
                i10 = -1;
                i11 = 0;
                i12 = 0;
                while (i12 < address.length) {
                    i17 = i12;
                    while (i17 < i9) {
                        i17 += 2;
                        i9 = 16;
                    }
                    i18 = i17 - i12;
                    if (i18 > i11) {
                        i10 = i12;
                        i11 = i18;
                    }
                    i12 = i17 + 2;
                    i9 = 16;
                }
                dVar = new N6.d();
                i13 = 0;
                while (i13 < address.length) {
                    if (i13 == i10) {
                        dVar.n(58);
                        i13 += i11;
                        if (i13 == 16) {
                            dVar.n(58);
                        }
                    } else {
                        if (i13 > 0) {
                            dVar.n(58);
                        }
                        j = ((address[i13] & 255) << 8) | (address[i13 + 1] & 255);
                        if (j == 0) {
                            dVar.n(48);
                            bArr = address;
                            i16 = i10;
                        } else {
                            long j1117 = j | (j >>> 1);
                            long j1118 = j1117 | (j1117 >>> 2);
                            long j1119 = j1118 | (j1118 >>> 4);
                            long j22 = j1119 | (j1119 >>> 8);
                            long j11110 = j22 | (j22 >>> 16);
                            long j11111 = j11110 | (j11110 >>> 32);
                            long j11112 = j11111 - ((j11111 >>> 1) & 6148914691236517205L);
                            long j11113 = ((j11112 >>> 2) & 3689348814741910323L) + (j11112 & 3689348814741910323L);
                            long j11114 = ((j11113 >>> 4) + j11113) & 1085102592571150095L;
                            long j11115 = j11114 + (j11114 >>> 8);
                            long j11116 = j11115 + (j11115 >>> 16);
                            int i54 = (int) ((((j11116 & 63) + ((j11116 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
                            jVarJ = dVar.j(i54);
                            i14 = jVarJ.f4811c;
                            i15 = (i14 + i54) - 1;
                            while (i15 >= i14) {
                                jVarJ.f4809a[i15] = O6.a.f5015a[(int) (j & 15)];
                                j >>>= 4;
                                i15--;
                                address = address;
                                i10 = i10;
                            }
                            bArr = address;
                            i16 = i10;
                            jVarJ.f4811c += i54;
                            dVar.f4797b += (long) i54;
                        }
                        i13 += 2;
                        address = bArr;
                        i10 = i16;
                    }
                }
                strF = dVar.f(dVar.f4797b, C6.a.f1581a);
            } catch (UnknownHostException unused2) {
                throw new AssertionError();
            }
        }
        if (strF == null) {
            throw new IllegalArgumentException("unexpected host: ".concat(hostName));
        }
        mVar.f1015c = strF;
        int port = inetSocketAddress.getPort();
        if (port <= 0 || port > 65535) {
            throw new IllegalArgumentException(p031e1.k.d(port, "unexpected port: "));
        }
        mVar.f1014b = port;
        if (((String) mVar.f1015c) == null) {
            throw new IllegalStateException("host == null");
        }
        p008a6.a aVar = new p008a6.a(mVar);
        V0 v6 = new V0(25, false);
        I i55 = new I();
        i55.f1233a = new ArrayList(20);
        v6.f17569c = i55;
        v6.f17568b = aVar;
        v6.R("Host", aVar.f7973a + ":" + aVar.f7974b);
        v6.R("User-Agent", this.f7582c);
        if (str != null && str2 != null) {
            try {
                v6.R("Proxy-Authorization", "Basic " + N6.f.h((str + ":" + str2).getBytes("ISO-8859-1")).a());
            } catch (UnsupportedEncodingException unused3) {
                throw new AssertionError();
            }
        }
        if (((p008a6.a) v6.f17568b) != null) {
            return new P2(v6);
        }
        throw new IllegalStateException("url == null");
    }

    public final void j(int i7, l0 l0Var, EnumC0543u enumC0543u, boolean z4, Z5.a aVar, b0 b0Var) {
        synchronized (this.f7589k) {
            try {
                j jVar = (j) this.f7592n.remove(Integer.valueOf(i7));
                if (jVar != null) {
                    if (aVar != null) {
                        this.f7588i.d(i7, Z5.a.CANCEL);
                    }
                    if (l0Var != null) {
                        i iVar = jVar.f7555n;
                        if (b0Var == null) {
                            b0Var = new b0();
                        }
                        iVar.f(l0Var, enumC0543u, z4, b0Var);
                    }
                    if (!t()) {
                        v();
                        o(jVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final v[] k() {
        v[] vVarArr;
        v vVar;
        synchronized (this.f7589k) {
            vVarArr = new v[this.f7592n.size()];
            Iterator it = this.f7592n.values().iterator();
            int i7 = 0;
            while (it.hasNext()) {
                int i8 = i7 + 1;
                i iVar = ((j) it.next()).f7555n;
                synchronized (iVar.f7547w) {
                    vVar = iVar.f7543J;
                }
                vVarArr[i7] = vVar;
                i7 = i8;
            }
        }
        return vVarArr;
    }

    public final int l() {
        URI uriA = AbstractC0494d0.a(this.f7581b);
        return uriA.getPort() != -1 ? uriA.getPort() : this.f7580a.getPort();
    }

    public final m0 m() {
        synchronized (this.f7589k) {
            try {
                l0 l0Var = this.f7600v;
                if (l0Var != null) {
                    return new m0(l0Var);
                }
                return new m0(l0.f6544n.g("Connection closed"));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x000c  */
    public final boolean n(int i7) {
        boolean z4;
        synchronized (this.f7589k) {
            if (i7 < this.f7591m) {
                z4 = true;
                if ((i7 & 1) != 1) {
                    z4 = false;
                }
            } else {
                z4 = false;
            }
        }
        return z4;
    }

    public final void o(j jVar) {
        if (this.f7604z && this.f7568D.isEmpty() && this.f7592n.isEmpty()) {
            this.f7604z = false;
            C0556y0 c0556y0 = this.f7570F;
            if (c0556y0 != null) {
                synchronized (c0556y0) {
                    int i7 = c0556y0.f7401d;
                    if (i7 == 2 || i7 == 3) {
                        c0556y0.f7401d = 1;
                    }
                    if (c0556y0.f7401d == 4) {
                        c0556y0.f7401d = 5;
                    }
                }
            }
        }
        if (jVar.f7126e) {
            this.f7577M.o(jVar, false);
        }
    }

    public final void p(Exception exc) {
        s(0, Z5.a.INTERNAL_ERROR, l0.f6544n.f(exc));
    }

    public final void r() {
        synchronized (this.f7589k) {
            try {
                d dVar = this.f7588i;
                dVar.getClass();
                try {
                    dVar.f7498b.b();
                } catch (IOException e7) {
                    dVar.f7497a.p(e7);
                }
                B.v vVar = new B.v(7, (byte) 0);
                vVar.n(7, this.f7585f);
                d dVar2 = this.f7588i;
                dVar2.f7499c.J(2, vVar);
                try {
                    dVar2.f7498b.f(vVar);
                } catch (IOException e8) {
                    dVar2.f7497a.p(e8);
                }
                int i7 = this.f7585f;
                if (i7 > 65535) {
                    this.f7588i.e(0, i7 - 65535);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void s(int i7, Z5.a aVar, l0 l0Var) {
        synchronized (this.f7589k) {
            try {
                if (this.f7600v == null) {
                    this.f7600v = l0Var;
                    this.f7587h.k(l0Var);
                }
                if (aVar != null && !this.f7601w) {
                    this.f7601w = true;
                    this.f7588i.b(aVar, new byte[0]);
                }
                Iterator it = this.f7592n.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (((Integer) entry.getKey()).intValue() > i7) {
                        it.remove();
                        ((j) entry.getValue()).f7555n.f(l0Var, EnumC0543u.f7373b, false, new b0());
                        o((j) entry.getValue());
                    }
                }
                for (j jVar : this.f7568D) {
                    jVar.f7555n.f(l0Var, EnumC0543u.f7375d, true, new b0());
                    o(jVar);
                }
                this.f7568D.clear();
                v();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean t() {
        boolean z4 = false;
        while (true) {
            LinkedList linkedList = this.f7568D;
            if (linkedList.isEmpty() || this.f7592n.size() >= this.f7567C) {
                break;
            }
            u((j) linkedList.poll());
            z4 = true;
        }
        return z4;
    }

    public final String toString() {
        D3.j jVarU0 = p003a.a.u0(this);
        jVarU0.b("logId", this.f7590l.f6420c);
        jVarU0.a(this.f7580a, SentryLockReason.JsonKeys.ADDRESS);
        return jVarU0.toString();
    }

    public final void u(j jVar) {
        boolean zE;
        p113p3.f.q("StreamId already assigned", jVar.f7555n.f7544K == -1);
        this.f7592n.put(Integer.valueOf(this.f7591m), jVar);
        if (!this.f7604z) {
            this.f7604z = true;
            C0556y0 c0556y0 = this.f7570F;
            if (c0556y0 != null) {
                c0556y0.b();
            }
        }
        if (jVar.f7126e) {
            this.f7577M.o(jVar, true);
        }
        i iVar = jVar.f7555n;
        int i7 = this.f7591m;
        if (!(iVar.f7544K == -1)) {
            throw new IllegalStateException(P6.b.z("the stream has been started with id %s", Integer.valueOf(i7)));
        }
        iVar.f7544K = i7;
        p151v2.n nVar = iVar.f7539F;
        iVar.f7543J = new v(nVar, i7, nVar.f17142a, iVar);
        i iVar2 = iVar.f7545L.f7555n;
        p113p3.f.r(iVar2.j != null);
        synchronized (iVar2.f7106b) {
            p113p3.f.q("Already allocated", !iVar2.f7110f);
            iVar2.f7110f = true;
        }
        synchronized (iVar2.f7106b) {
            zE = iVar2.e();
        }
        if (zE) {
            iVar2.j.u();
        }
        h2 h2Var = iVar2.f7107c;
        h2Var.getClass();
        ((f2) h2Var.f7232b).d();
        if (iVar.f7541H) {
            d dVar = iVar.f7538E;
            boolean z4 = iVar.f7545L.f7558q;
            int i8 = iVar.f7544K;
            ArrayList arrayList = iVar.f7548x;
            dVar.getClass();
            try {
                Z5.h hVar = dVar.f7498b.f7481a;
                synchronized (hVar) {
                    if (hVar.f7916e) {
                        throw new IOException("closed");
                    }
                    hVar.b(z4, i8, arrayList);
                }
            } catch (IOException e7) {
                dVar.f7497a.p(e7);
            }
            for (AbstractC0442i abstractC0442i : iVar.f7545L.f7553l.f7182a) {
                abstractC0442i.h();
            }
            iVar.f7548x = null;
            N6.d dVar2 = iVar.f7549y;
            if (dVar2.f4797b > 0) {
                iVar.f7539F.d(iVar.f7550z, iVar.f7543J, dVar2, iVar.f7534A);
            }
            iVar.f7541H = false;
        }
        c0 c0Var = (c0) jVar.j.f3294e;
        if ((c0Var != c0.f6469a && c0Var != c0.f6470b) || jVar.f7558q) {
            this.f7588i.flush();
        }
        int i9 = this.f7591m;
        if (i9 < 2147483645) {
            this.f7591m = i9 + 2;
        } else {
            this.f7591m = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
            s(com.google.android.gms.common.api.f.API_PRIORITY_OTHER, Z5.a.NO_ERROR, l0.f6544n.g("Stream ids exhausted"));
        }
    }

    public final void v() {
        if (this.f7600v == null || !this.f7592n.isEmpty() || !this.f7568D.isEmpty() || this.f7603y) {
            return;
        }
        this.f7603y = true;
        C0556y0 c0556y0 = this.f7570F;
        if (c0556y0 != null) {
            synchronized (c0556y0) {
                try {
                    if (c0556y0.f7401d != 6) {
                        c0556y0.f7401d = 6;
                        ScheduledFuture scheduledFuture = c0556y0.f7402e;
                        if (scheduledFuture != null) {
                            scheduledFuture.cancel(false);
                        }
                        ScheduledFuture scheduledFuture2 = c0556y0.f7403f;
                        if (scheduledFuture2 != null) {
                            scheduledFuture2.cancel(false);
                            c0556y0.f7403f = null;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        C0509i0 c0509i0 = this.f7602x;
        if (c0509i0 != null) {
            m0 m0VarM = m();
            synchronized (c0509i0) {
                try {
                    if (!c0509i0.f7243d) {
                        c0509i0.f7243d = true;
                        c0509i0.f7244e = m0VarM;
                        LinkedHashMap linkedHashMap = c0509i0.f7242c;
                        c0509i0.f7242c = null;
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            try {
                                ((Executor) entry.getValue()).execute(new RunnableC0506h0((C0553x0) entry.getKey(), m0VarM));
                            } catch (Throwable th2) {
                                C0509i0.f7239g.log(Level.SEVERE, "Failed to execute PingCallback", th2);
                            }
                        }
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            this.f7602x = null;
        }
        if (!this.f7601w) {
            this.f7601w = true;
            this.f7588i.b(Z5.a.NO_ERROR, new byte[0]);
        }
        this.f7588i.close();
    }
}
