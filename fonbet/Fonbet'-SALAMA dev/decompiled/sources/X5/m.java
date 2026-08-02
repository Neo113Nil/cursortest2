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
import a.AbstractC0603a;
import a6.C0623a;
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
import w1.P2;
import w1.V0;

/* loaded from: classes2.dex */
public final class m implements A {

    /* renamed from: P, reason: collision with root package name */
    public static final Map f7563P;

    /* renamed from: Q, reason: collision with root package name */
    public static final Logger f7564Q;

    /* renamed from: A, reason: collision with root package name */
    public final SocketFactory f7565A;

    /* renamed from: B, reason: collision with root package name */
    public final SSLSocketFactory f7566B;

    /* renamed from: C, reason: collision with root package name */
    public int f7567C;

    /* renamed from: D, reason: collision with root package name */
    public final LinkedList f7568D;

    /* renamed from: E, reason: collision with root package name */
    public final Y5.b f7569E;

    /* renamed from: F, reason: collision with root package name */
    public C0556y0 f7570F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f7571G;

    /* renamed from: H, reason: collision with root package name */
    public long f7572H;

    /* renamed from: I, reason: collision with root package name */
    public long f7573I;

    /* renamed from: J, reason: collision with root package name */
    public final RunnableC0085d f7574J;

    /* renamed from: K, reason: collision with root package name */
    public final int f7575K;

    /* renamed from: L, reason: collision with root package name */
    public final h2 f7576L;

    /* renamed from: M, reason: collision with root package name */
    public final C0512j0 f7577M;

    /* renamed from: N, reason: collision with root package name */
    public final C0458z f7578N;

    /* renamed from: O, reason: collision with root package name */
    public final int f7579O;

    /* renamed from: a, reason: collision with root package name */
    public final InetSocketAddress f7580a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7581b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7582c;

    /* renamed from: d, reason: collision with root package name */
    public final Random f7583d;

    /* renamed from: e, reason: collision with root package name */
    public final f2 f7584e;

    /* renamed from: f, reason: collision with root package name */
    public final int f7585f;

    /* renamed from: g, reason: collision with root package name */
    public final Z5.i f7586g;

    /* renamed from: h, reason: collision with root package name */
    public C0011c f7587h;

    /* renamed from: i, reason: collision with root package name */
    public d f7588i;
    public v2.n j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f7589k;

    /* renamed from: l, reason: collision with root package name */
    public final F f7590l;

    /* renamed from: m, reason: collision with root package name */
    public int f7591m;

    /* renamed from: n, reason: collision with root package name */
    public final HashMap f7592n;

    /* renamed from: o, reason: collision with root package name */
    public final Executor f7593o;

    /* renamed from: p, reason: collision with root package name */
    public final W1 f7594p;

    /* renamed from: q, reason: collision with root package name */
    public final ScheduledExecutorService f7595q;

    /* renamed from: r, reason: collision with root package name */
    public final int f7596r;

    /* renamed from: s, reason: collision with root package name */
    public int f7597s;

    /* renamed from: t, reason: collision with root package name */
    public l f7598t;

    /* renamed from: u, reason: collision with root package name */
    public C0435b f7599u;

    /* renamed from: v, reason: collision with root package name */
    public l0 f7600v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f7601w;

    /* renamed from: x, reason: collision with root package name */
    public C0509i0 f7602x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f7603y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f7604z;

    static {
        EnumMap enumMap = new EnumMap(Z5.a.class);
        Z5.a aVar = Z5.a.NO_ERROR;
        l0 l0Var = l0.f6543m;
        enumMap.put((EnumMap) aVar, (Z5.a) l0Var.g("No error: A GRPC status of OK should have been sent"));
        enumMap.put((EnumMap) Z5.a.PROTOCOL_ERROR, (Z5.a) l0Var.g("Protocol error"));
        enumMap.put((EnumMap) Z5.a.INTERNAL_ERROR, (Z5.a) l0Var.g("Internal error"));
        enumMap.put((EnumMap) Z5.a.FLOW_CONTROL_ERROR, (Z5.a) l0Var.g("Flow control error"));
        enumMap.put((EnumMap) Z5.a.STREAM_CLOSED, (Z5.a) l0Var.g("Stream closed"));
        enumMap.put((EnumMap) Z5.a.FRAME_TOO_LARGE, (Z5.a) l0Var.g("Frame too large"));
        enumMap.put((EnumMap) Z5.a.REFUSED_STREAM, (Z5.a) l0.f6544n.g("Refused stream"));
        enumMap.put((EnumMap) Z5.a.CANCEL, (Z5.a) l0.f6537f.g("Cancelled"));
        enumMap.put((EnumMap) Z5.a.COMPRESSION_ERROR, (Z5.a) l0Var.g("Compression error"));
        enumMap.put((EnumMap) Z5.a.CONNECT_ERROR, (Z5.a) l0Var.g("Connect error"));
        enumMap.put((EnumMap) Z5.a.ENHANCE_YOUR_CALM, (Z5.a) l0.f6541k.g("Enhance your calm"));
        enumMap.put((EnumMap) Z5.a.INADEQUATE_SECURITY, (Z5.a) l0.f6540i.g("Inadequate security"));
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
        p3.f.k(inetSocketAddress, SentryLockReason.JsonKeys.ADDRESS);
        this.f7580a = inetSocketAddress;
        this.f7581b = str;
        this.f7596r = fVar.f7518y;
        this.f7585f = fVar.f7508C;
        Executor executor = fVar.f7512b;
        p3.f.k(executor, "executor");
        this.f7593o = executor;
        this.f7594p = new W1(fVar.f7512b);
        ScheduledExecutorService scheduledExecutorService = fVar.f7514d;
        p3.f.k(scheduledExecutorService, "scheduledExecutorService");
        this.f7595q = scheduledExecutorService;
        this.f7591m = 3;
        this.f7565A = SocketFactory.getDefault();
        this.f7566B = fVar.f7516f;
        Y5.b bVar = fVar.f7517x;
        p3.f.k(bVar, "connectionSpec");
        this.f7569E = bVar;
        p3.f.k(f2Var, "stopwatchFactory");
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

    public static Socket h(m mVar, InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, String str, String str2) {
        Socket createSocket;
        String str3;
        int i7;
        String str4;
        mVar.getClass();
        Socket socket = null;
        try {
            InetAddress address = inetSocketAddress2.getAddress();
            SocketFactory socketFactory = mVar.f7565A;
            createSocket = address != null ? socketFactory.createSocket(inetSocketAddress2.getAddress(), inetSocketAddress2.getPort()) : socketFactory.createSocket(inetSocketAddress2.getHostName(), inetSocketAddress2.getPort());
        } catch (IOException e7) {
            e = e7;
        }
        try {
            createSocket.setTcpNoDelay(true);
            createSocket.setSoTimeout(mVar.f7579O);
            N6.c Y6 = Q0.a.Y(createSocket);
            N6.h hVar = new N6.h(Q0.a.W(createSocket));
            P2 i8 = mVar.i(inetSocketAddress, str, str2);
            u1.c cVar = (u1.c) i8.f17509c;
            C0623a c0623a = (C0623a) i8.f17508b;
            Locale locale = Locale.US;
            hVar.e("CONNECT " + c0623a.f7973a + ":" + c0623a.f7974b + " HTTP/1.1");
            hVar.e("\r\n");
            int length = ((String[]) cVar.f16591b).length / 2;
            for (int i9 = 0; i9 < length; i9++) {
                int i10 = i9 * 2;
                String[] strArr = (String[]) cVar.f16591b;
                if (i10 >= 0 && i10 < strArr.length) {
                    str3 = strArr[i10];
                    hVar.e(str3);
                    hVar.e(": ");
                    i7 = i10 + 1;
                    if (i7 >= 0 && i7 < strArr.length) {
                        str4 = strArr[i7];
                        hVar.e(str4);
                        hVar.e("\r\n");
                    }
                    str4 = null;
                    hVar.e(str4);
                    hVar.e("\r\n");
                }
                str3 = null;
                hVar.e(str3);
                hVar.e(": ");
                i7 = i10 + 1;
                if (i7 >= 0) {
                    str4 = strArr[i7];
                    hVar.e(str4);
                    hVar.e("\r\n");
                }
                str4 = null;
                hVar.e(str4);
                hVar.e("\r\n");
            }
            hVar.e("\r\n");
            hVar.flush();
            B1.m n2 = B1.m.n(q(Y6));
            while (!q(Y6).equals("")) {
            }
            int i11 = n2.f1014b;
            if (i11 >= 200 && i11 < 300) {
                createSocket.setSoTimeout(0);
                return createSocket;
            }
            N6.d dVar = new N6.d();
            try {
                createSocket.shutdownOutput();
                Y6.t(dVar, 1024L);
            } catch (IOException e8) {
                dVar.p("Unable to read body: " + e8.toString());
            }
            try {
                createSocket.close();
            } catch (IOException unused) {
            }
            Locale locale2 = Locale.US;
            throw new m0(l0.f6544n.g("Response returned from proxy was not successful (expected 2xx, got " + i11 + " " + ((String) n2.f1016d) + "). Response body:\n" + dVar.f(dVar.f4797b, C6.a.f1581a)));
        } catch (IOException e9) {
            e = e9;
            socket = createSocket;
            if (socket != null) {
                AbstractC0494d0.b(socket);
            }
            throw new m0(l0.f6544n.g("Failed trying to connect with proxy").f(e));
        }
    }

    public static String q(N6.c cVar) {
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
                        j8 -= jVar.f4811c - jVar.f4810b;
                    }
                    long j10 = 0;
                    loop4: while (j8 < j9) {
                        int min = (int) Math.min(jVar.f4811c, (jVar.f4810b + j9) - j8);
                        for (int i7 = (int) ((jVar.f4810b + j10) - j8); i7 < min; i7++) {
                            if (jVar.f4809a[i7] == 10) {
                                j = i7 - jVar.f4810b;
                                j7 = j + j8;
                                j3 = -1;
                                break loop4;
                            }
                        }
                        j10 = j8 + (jVar.f4811c - jVar.f4810b);
                        jVar = jVar.f4814f;
                        t6.h.b(jVar);
                        j8 = j10;
                    }
                    j3 = -1;
                    j7 = -1;
                } else {
                    j8 = 0;
                    while (true) {
                        long j11 = (jVar.f4811c - jVar.f4810b) + j8;
                        if (j11 > 0) {
                            break;
                        }
                        jVar = jVar.f4814f;
                        t6.h.b(jVar);
                        j8 = j11;
                    }
                    long j12 = 0;
                    loop7: while (j8 < j9) {
                        int min2 = (int) Math.min(jVar.f4811c, (jVar.f4810b + j9) - j8);
                        for (int i8 = (int) ((jVar.f4810b + j12) - j8); i8 < min2; i8++) {
                            if (jVar.f4809a[i8] == 10) {
                                j = i8 - jVar.f4810b;
                                j7 = j + j8;
                                j3 = -1;
                                break loop4;
                            }
                        }
                        j12 = (jVar.f4811c - jVar.f4810b) + j8;
                        jVar = jVar.f4814f;
                        t6.h.b(jVar);
                        j8 = j12;
                    }
                    j3 = -1;
                    j7 = -1;
                }
                if (j7 != j3) {
                    return O6.a.a(dVar, j7);
                }
                if (Long.MAX_VALUE < dVar.f4797b && dVar.b(9223372036854775806L) == 13 && dVar.b(Long.MAX_VALUE) == 10) {
                    return O6.a.a(dVar, Long.MAX_VALUE);
                }
                N6.d dVar2 = new N6.d();
                long min3 = Math.min(32, dVar.f4797b);
                long j13 = 0;
                p3.f.m(dVar.f4797b, 0L, min3);
                if (min3 != 0) {
                    dVar2.f4797b += min3;
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
                    while (min3 > 0) {
                        t6.h.b(jVar2);
                        N6.j c3 = jVar2.c();
                        int i9 = c3.f4810b + ((int) j13);
                        c3.f4810b = i9;
                        c3.f4811c = Math.min(i9 + ((int) min3), c3.f4811c);
                        N6.j jVar3 = dVar2.f4796a;
                        if (jVar3 == null) {
                            c3.f4815g = c3;
                            c3.f4814f = c3;
                            dVar2.f4796a = c3;
                        } else {
                            N6.j jVar4 = jVar3.f4815g;
                            t6.h.b(jVar4);
                            jVar4.b(c3);
                        }
                        min3 -= c3.f4811c - c3.f4810b;
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
    public final InterfaceC0540t a(H2.r rVar, b0 b0Var, C0437d c0437d, AbstractC0442i[] abstractC0442iArr) {
        p3.f.k(rVar, Request.JsonKeys.METHOD);
        p3.f.k(b0Var, "headers");
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
    public final Runnable b(X0 x02) {
        this.f7587h = (C0011c) x02;
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
            v2.n nVar = new v2.n();
            nVar.f17137b = this;
            nVar.f17138c = dVar;
            nVar.f17136a = 65535;
            nVar.f17139d = new v(nVar, 0, 65535, null);
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

    /* JADX WARN: Removed duplicated region for block: B:125:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final P2 i(InetSocketAddress inetSocketAddress, String str, String str2) {
        String substring;
        String str3;
        int i7;
        InetAddress byAddress;
        int i8;
        byte[] bArr;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        String str4;
        int i16;
        int i17 = -1;
        int i18 = 4;
        int i19 = 2;
        B1.m mVar = new B1.m(9, (char) 0);
        mVar.f1014b = -1;
        mVar.f1016d = "https";
        String hostName = inetSocketAddress.getHostName();
        if (hostName == null) {
            throw new IllegalArgumentException("host == null");
        }
        int length = hostName.length();
        int i20 = 0;
        while (true) {
            if (i20 >= length) {
                substring = hostName.substring(0, length);
                break;
            }
            int i21 = 37;
            if (hostName.charAt(i20) != '%') {
                i20++;
            } else {
                N6.d dVar = new N6.d();
                dVar.o(i20, hostName);
                while (i20 < length) {
                    int codePointAt = hostName.codePointAt(i20);
                    if (codePointAt == i21 && (i16 = i20 + 2) < length) {
                        int a2 = C0623a.a(hostName.charAt(i20 + 1));
                        int a4 = C0623a.a(hostName.charAt(i16));
                        if (a2 != i17 && a4 != i17) {
                            dVar.n((a2 << i18) + a4);
                            i20 = i16;
                            i20 += Character.charCount(codePointAt);
                            i21 = 37;
                            i17 = -1;
                            i18 = 4;
                            i19 = 2;
                        }
                    }
                    if (codePointAt < 128) {
                        dVar.n(codePointAt);
                    } else if (codePointAt < 2048) {
                        N6.j j = dVar.j(i19);
                        int i22 = j.f4811c;
                        byte[] bArr2 = j.f4809a;
                        bArr2[i22] = (byte) ((codePointAt >> 6) | 192);
                        bArr2[i22 + 1] = (byte) (128 | (codePointAt & 63));
                        j.f4811c = i22 + i19;
                        dVar.f4797b += 2;
                    } else {
                        if (55296 <= codePointAt && codePointAt < 57344) {
                            dVar.n(63);
                        } else if (codePointAt < 65536) {
                            N6.j j3 = dVar.j(3);
                            int i23 = j3.f4811c;
                            byte[] bArr3 = j3.f4809a;
                            bArr3[i23] = (byte) ((codePointAt >> 12) | 224);
                            bArr3[i23 + 1] = (byte) (((codePointAt >> 6) & 63) | 128);
                            bArr3[i23 + 2] = (byte) (128 | (codePointAt & 63));
                            j3.f4811c = i23 + 3;
                            dVar.f4797b += 3;
                        } else {
                            if (codePointAt > 1114111) {
                                StringBuilder sb = new StringBuilder("Unexpected code point: 0x");
                                if (codePointAt != 0) {
                                    char[] cArr = O6.b.f5016a;
                                    char[] cArr2 = {cArr[(codePointAt >> 28) & 15], cArr[(codePointAt >> 24) & 15], cArr[(codePointAt >> 20) & 15], cArr[(codePointAt >> 16) & 15], cArr[(codePointAt >> 12) & 15], cArr[(codePointAt >> 8) & 15], cArr[(codePointAt >> 4) & 15], cArr[codePointAt & 15]};
                                    int i24 = 0;
                                    while (i24 < 8 && cArr2[i24] == '0') {
                                        i24++;
                                    }
                                    if (i24 < 0) {
                                        throw new IndexOutOfBoundsException(AbstractC0486a1.f(i24, "startIndex: ", ", endIndex: 8, size: 8"));
                                    }
                                    if (i24 > 8) {
                                        throw new IllegalArgumentException(AbstractC0486a1.f(i24, "startIndex: ", " > endIndex: 8"));
                                    }
                                    str4 = new String(cArr2, i24, 8 - i24);
                                } else {
                                    str4 = "0";
                                }
                                sb.append(str4);
                                throw new IllegalArgumentException(sb.toString());
                            }
                            N6.j j7 = dVar.j(4);
                            int i25 = j7.f4811c;
                            byte[] bArr4 = j7.f4809a;
                            bArr4[i25] = (byte) ((codePointAt >> 18) | 240);
                            bArr4[i25 + 1] = (byte) (((codePointAt >> 12) & 63) | 128);
                            bArr4[i25 + 2] = (byte) (((codePointAt >> 6) & 63) | 128);
                            bArr4[i25 + 3] = (byte) (128 | (codePointAt & 63));
                            j7.f4811c = i25 + 4;
                            dVar.f4797b += 4;
                        }
                        i20 += Character.charCount(codePointAt);
                        i21 = 37;
                        i17 = -1;
                        i18 = 4;
                        i19 = 2;
                    }
                    i20 += Character.charCount(codePointAt);
                    i21 = 37;
                    i17 = -1;
                    i18 = 4;
                    i19 = 2;
                }
                substring = dVar.f(dVar.f4797b, C6.a.f1581a);
            }
        }
        if (!substring.startsWith("[") || !substring.endsWith("]")) {
            try {
                String lowerCase = IDN.toASCII(substring).toLowerCase(Locale.US);
                if (!lowerCase.isEmpty()) {
                    for (int i26 = 0; i26 < lowerCase.length(); i26++) {
                        char charAt = lowerCase.charAt(i26);
                        if (charAt > 31 && charAt < 127 && " #%/:?@[\\]".indexOf(charAt) == -1) {
                        }
                    }
                    str3 = lowerCase;
                }
            } catch (IllegalArgumentException unused) {
            }
            str3 = null;
            break;
        }
        int length2 = substring.length() - 1;
        int i27 = 16;
        byte[] bArr5 = new byte[16];
        int i28 = 0;
        int i29 = -1;
        int i30 = -1;
        int i31 = 1;
        while (i31 < length2) {
            if (i28 == i27) {
                break;
            }
            int i32 = i31 + 2;
            if (i32 <= length2) {
                i10 = i30;
                i11 = 0;
                if (substring.regionMatches(i31, "::", 0, 2)) {
                    if (i29 != -1) {
                        break;
                    }
                    i28 += 2;
                    i29 = i28;
                    if (i32 == length2) {
                        i7 = 16;
                        break;
                    }
                    i30 = i32;
                    i31 = i30;
                    i14 = 0;
                    while (i31 < length2) {
                        int a7 = C0623a.a(substring.charAt(i31));
                        if (a7 == -1) {
                            break;
                        }
                        i14 = (i14 << 4) + a7;
                        i31++;
                    }
                    i15 = i31 - i30;
                    if (i15 != 0 || i15 > 4) {
                        break;
                        break;
                    }
                    int i33 = i28 + 1;
                    bArr5[i28] = (byte) ((i14 >>> 8) & 255);
                    i28 += 2;
                    bArr5[i33] = (byte) (i14 & 255);
                    length2 = length2;
                    i27 = 16;
                }
            } else {
                i10 = i30;
                i11 = 0;
            }
            if (i28 != 0) {
                if (substring.regionMatches(i31, ":", i11, 1)) {
                    i31++;
                } else if (substring.regionMatches(i31, ".", i11, 1)) {
                    int i34 = i28 - 2;
                    int i35 = i34;
                    int i36 = i10;
                    loop9: while (true) {
                        if (i36 >= length2) {
                            int i37 = i29;
                            if (i35 == i28 + 2) {
                                i28 += 2;
                                i29 = i37;
                            }
                        } else {
                            if (i35 == 16) {
                                break;
                            }
                            if (i35 != i34) {
                                if (substring.charAt(i36) != '.') {
                                    break;
                                }
                                i36++;
                            }
                            int i38 = i36;
                            int i39 = 0;
                            while (true) {
                                i12 = i34;
                                if (i38 >= length2) {
                                    i13 = i29;
                                    break;
                                }
                                char charAt2 = substring.charAt(i38);
                                i13 = i29;
                                if (charAt2 < '0' || charAt2 > '9') {
                                    break;
                                }
                                if ((i39 == 0 && i36 != i38) || (i39 = ((i39 * 10) + charAt2) - 48) > 255) {
                                    break loop9;
                                }
                                i38++;
                                i34 = i12;
                                i29 = i13;
                            }
                            if (i38 - i36 == 0) {
                                break;
                            }
                            bArr5[i35] = (byte) i39;
                            i35++;
                            i36 = i38;
                            i34 = i12;
                            i29 = i13;
                        }
                    }
                }
            }
            i30 = i31;
            i31 = i30;
            i14 = 0;
            while (i31 < length2) {
            }
            i15 = i31 - i30;
            if (i15 != 0) {
                break;
            }
            int i332 = i28 + 1;
            bArr5[i28] = (byte) ((i14 >>> 8) & 255);
            i28 += 2;
            bArr5[i332] = (byte) (i14 & 255);
            length2 = length2;
            i27 = 16;
        }
        i7 = i27;
        try {
            if (i28 != i7) {
                if (i29 != -1) {
                    int i40 = i28 - i29;
                    System.arraycopy(bArr5, i29, bArr5, 16 - i40, i40);
                    Arrays.fill(bArr5, i29, (16 - i28) + i29, (byte) 0);
                }
                byAddress = null;
                if (byAddress != null) {
                    byte[] address = byAddress.getAddress();
                    int i41 = 16;
                    if (address.length != 16) {
                        throw new AssertionError();
                    }
                    int i42 = -1;
                    int i43 = 0;
                    int i44 = 0;
                    while (i44 < address.length) {
                        int i45 = i44;
                        while (i45 < i41 && address[i45] == 0 && address[i45 + 1] == 0) {
                            i45 += 2;
                            i41 = 16;
                        }
                        int i46 = i45 - i44;
                        if (i46 > i43) {
                            i42 = i44;
                            i43 = i46;
                        }
                        i44 = i45 + 2;
                        i41 = 16;
                    }
                    N6.d dVar2 = new N6.d();
                    int i47 = 0;
                    while (i47 < address.length) {
                        if (i47 == i42) {
                            dVar2.n(58);
                            i47 += i43;
                            if (i47 == 16) {
                                dVar2.n(58);
                            }
                        } else {
                            if (i47 > 0) {
                                dVar2.n(58);
                            }
                            long j8 = ((address[i47] & 255) << 8) | (address[i47 + 1] & 255);
                            if (j8 == 0) {
                                dVar2.n(48);
                                bArr = address;
                                i9 = i42;
                                i8 = i47;
                            } else {
                                long j9 = j8 | (j8 >>> 1);
                                long j10 = j9 | (j9 >>> 2);
                                long j11 = j10 | (j10 >>> 4);
                                long j12 = j11 | (j11 >>> 8);
                                long j13 = j12 | (j12 >>> 16);
                                long j14 = j13 | (j13 >>> 32);
                                long j15 = j14 - ((j14 >>> 1) & 6148914691236517205L);
                                long j16 = ((j15 >>> 2) & 3689348814741910323L) + (j15 & 3689348814741910323L);
                                long j17 = ((j16 >>> 4) + j16) & 1085102592571150095L;
                                long j18 = j17 + (j17 >>> 8);
                                long j19 = j18 + (j18 >>> 16);
                                i8 = i47;
                                int i48 = (int) ((((j19 & 63) + ((j19 >>> 32) & 63)) + 3) / 4);
                                N6.j j20 = dVar2.j(i48);
                                int i49 = j20.f4811c;
                                int i50 = (i49 + i48) - 1;
                                while (i50 >= i49) {
                                    j20.f4809a[i50] = O6.a.f5015a[(int) (j8 & 15)];
                                    j8 >>>= 4;
                                    i50--;
                                    address = address;
                                    i42 = i42;
                                }
                                bArr = address;
                                i9 = i42;
                                j20.f4811c += i48;
                                dVar2.f4797b += i48;
                            }
                            i47 = i8 + 2;
                            address = bArr;
                            i42 = i9;
                        }
                    }
                    str3 = dVar2.f(dVar2.f4797b, C6.a.f1581a);
                }
                str3 = null;
                break;
            }
            byAddress = InetAddress.getByAddress(bArr5);
            if (byAddress != null) {
            }
            str3 = null;
            break;
        } catch (UnknownHostException unused2) {
            throw new AssertionError();
        }
        if (str3 == null) {
            throw new IllegalArgumentException("unexpected host: ".concat(hostName));
        }
        mVar.f1015c = str3;
        int port = inetSocketAddress.getPort();
        if (port <= 0 || port > 65535) {
            throw new IllegalArgumentException(e1.k.d(port, "unexpected port: "));
        }
        mVar.f1014b = port;
        if (((String) mVar.f1015c) == null) {
            throw new IllegalStateException("host == null");
        }
        C0623a c0623a = new C0623a(mVar);
        V0 v02 = new V0(25, false);
        I i51 = new I();
        i51.f1233a = new ArrayList(20);
        v02.f17563c = i51;
        v02.f17562b = c0623a;
        v02.R("Host", c0623a.f7973a + ":" + c0623a.f7974b);
        v02.R("User-Agent", this.f7582c);
        if (str != null && str2 != null) {
            try {
                v02.R("Proxy-Authorization", "Basic " + N6.f.h((str + ":" + str2).getBytes("ISO-8859-1")).a());
            } catch (UnsupportedEncodingException unused3) {
                throw new AssertionError();
            }
        }
        if (((C0623a) v02.f17562b) != null) {
            return new P2(v02);
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
        URI a2 = AbstractC0494d0.a(this.f7581b);
        return a2.getPort() != -1 ? a2.getPort() : this.f7580a.getPort();
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

    public final boolean n(int i7) {
        boolean z4;
        synchronized (this.f7589k) {
            if (i7 < this.f7591m) {
                z4 = true;
                if ((i7 & 1) == 1) {
                }
            }
            z4 = false;
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
                if (this.f7585f > 65535) {
                    this.f7588i.e(0, r1 - 65535);
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
        D3.j u02 = AbstractC0603a.u0(this);
        u02.b("logId", this.f7590l.f6420c);
        u02.a(this.f7580a, SentryLockReason.JsonKeys.ADDRESS);
        return u02.toString();
    }

    public final void u(j jVar) {
        boolean e7;
        p3.f.q("StreamId already assigned", jVar.f7555n.f7544K == -1);
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
        v2.n nVar = iVar.f7539F;
        iVar.f7543J = new v(nVar, i7, nVar.f17136a, iVar);
        i iVar2 = iVar.f7545L.f7555n;
        p3.f.r(iVar2.j != null);
        synchronized (iVar2.f7106b) {
            p3.f.q("Already allocated", !iVar2.f7110f);
            iVar2.f7110f = true;
        }
        synchronized (iVar2.f7106b) {
            e7 = iVar2.e();
        }
        if (e7) {
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
            } catch (IOException e8) {
                dVar.f7497a.p(e8);
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
                } finally {
                }
            }
        }
        C0509i0 c0509i0 = this.f7602x;
        if (c0509i0 != null) {
            m0 m7 = m();
            synchronized (c0509i0) {
                try {
                    if (!c0509i0.f7243d) {
                        c0509i0.f7243d = true;
                        c0509i0.f7244e = m7;
                        LinkedHashMap linkedHashMap = c0509i0.f7242c;
                        c0509i0.f7242c = null;
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            try {
                                ((Executor) entry.getValue()).execute(new RunnableC0506h0((C0553x0) entry.getKey(), m7));
                            } catch (Throwable th) {
                                C0509i0.f7239g.log(Level.SEVERE, "Failed to execute PingCallback", th);
                            }
                        }
                    }
                } finally {
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
