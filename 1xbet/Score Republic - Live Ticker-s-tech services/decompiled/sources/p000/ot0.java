package p000;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
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

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ot0 implements InterfaceC0215fl {

    /* JADX INFO: renamed from: P */
    public static final Map f5868P;

    /* JADX INFO: renamed from: Q */
    public static final Logger f5869Q;

    /* JADX INFO: renamed from: A */
    public final SocketFactory f5870A;

    /* JADX INFO: renamed from: B */
    public final SSLSocketFactory f5871B;

    /* JADX INFO: renamed from: C */
    public int f5872C;

    /* JADX INFO: renamed from: D */
    public final LinkedList f5873D;

    /* JADX INFO: renamed from: E */
    public final C0326il f5874E;

    /* JADX INFO: renamed from: F */
    public wg0 f5875F;

    /* JADX INFO: renamed from: G */
    public boolean f5876G;

    /* JADX INFO: renamed from: H */
    public long f5877H;

    /* JADX INFO: renamed from: I */
    public long f5878I;

    /* JADX INFO: renamed from: J */
    public final RunnableC0897y0 f5879J;

    /* JADX INFO: renamed from: K */
    public final int f5880K;

    /* JADX INFO: renamed from: L */
    public final C0312i6 f5881L;

    /* JADX INFO: renamed from: M */
    public final qe0 f5882M;

    /* JADX INFO: renamed from: N */
    public final rb0 f5883N;

    /* JADX INFO: renamed from: O */
    public final int f5884O;

    /* JADX INFO: renamed from: a */
    public final InetSocketAddress f5885a;

    /* JADX INFO: renamed from: b */
    public final String f5886b;

    /* JADX INFO: renamed from: c */
    public final String f5887c;

    /* JADX INFO: renamed from: d */
    public final Random f5888d;

    /* JADX INFO: renamed from: e */
    public final nb1 f5889e;

    /* JADX INFO: renamed from: f */
    public final int f5890f;

    /* JADX INFO: renamed from: g */
    public final ob0 f5891g;

    /* JADX INFO: renamed from: h */
    public m81 f5892h;

    /* JADX INFO: renamed from: i */
    public C0597px f5893i;

    /* JADX INFO: renamed from: j */
    public g92 f5894j;

    /* JADX INFO: renamed from: k */
    public final Object f5895k;

    /* JADX INFO: renamed from: l */
    public final me0 f5896l;

    /* JADX INFO: renamed from: m */
    public int f5897m;

    /* JADX INFO: renamed from: n */
    public final HashMap f5898n;

    /* JADX INFO: renamed from: o */
    public final Executor f5899o;

    /* JADX INFO: renamed from: p */
    public final a71 f5900p;

    /* JADX INFO: renamed from: q */
    public final ScheduledExecutorService f5901q;

    /* JADX INFO: renamed from: r */
    public final int f5902r;

    /* JADX INFO: renamed from: s */
    public int f5903s;

    /* JADX INFO: renamed from: t */
    public nt0 f5904t;

    /* JADX INFO: renamed from: u */
    public C0831w8 f5905u;

    /* JADX INFO: renamed from: v */
    public ja1 f5906v;

    /* JADX INFO: renamed from: w */
    public boolean f5907w;

    /* JADX INFO: renamed from: x */
    public qb0 f5908x;

    /* JADX INFO: renamed from: y */
    public boolean f5909y;

    /* JADX INFO: renamed from: z */
    public boolean f5910z;

    static {
        EnumMap enumMap = new EnumMap(EnumC0227fx.class);
        ja1 ja1Var = ja1.f3882l;
        enumMap.put(EnumC0227fx.f2514k, ja1Var.m2840h("No error: A GRPC status of OK should have been sent"));
        enumMap.put(EnumC0227fx.f2515l, ja1Var.m2840h("Protocol error"));
        enumMap.put(EnumC0227fx.f2516m, ja1Var.m2840h("Internal error"));
        enumMap.put(EnumC0227fx.f2517n, ja1Var.m2840h("Flow control error"));
        enumMap.put(EnumC0227fx.f2518o, ja1Var.m2840h("Stream closed"));
        enumMap.put(EnumC0227fx.f2519p, ja1Var.m2840h("Frame too large"));
        enumMap.put(EnumC0227fx.f2520q, ja1.f3883m.m2840h("Refused stream"));
        enumMap.put(EnumC0227fx.f2521r, ja1.f3876f.m2840h("Cancelled"));
        enumMap.put(EnumC0227fx.f2522s, ja1Var.m2840h("Compression error"));
        enumMap.put(EnumC0227fx.f2523t, ja1Var.m2840h("Connect error"));
        enumMap.put(EnumC0227fx.f2524u, ja1.f3880j.m2840h("Enhance your calm"));
        enumMap.put(EnumC0227fx.f2525v, ja1.f3879i.m2840h("Inadequate security"));
        f5868P = Collections.unmodifiableMap(enumMap);
        f5869Q = Logger.getLogger(ot0.class.getName());
    }

    public ot0(ht0 ht0Var, InetSocketAddress inetSocketAddress, String str, C0831w8 c0831w8, rb0 rb0Var, RunnableC0897y0 runnableC0897y0) {
        u90 u90Var = ca0.f1198r;
        ob0 ob0Var = new ob0();
        this.f5888d = new Random();
        Object obj = new Object();
        this.f5895k = obj;
        this.f5898n = new HashMap();
        this.f5872C = 0;
        this.f5873D = new LinkedList();
        this.f5882M = new qe0(this, 2);
        this.f5884O = 30000;
        a90.m127k(inetSocketAddress, "address");
        this.f5885a = inetSocketAddress;
        this.f5886b = str;
        this.f5902r = ht0Var.f3323q;
        this.f5890f = ht0Var.f3327u;
        Executor executor = ht0Var.f3317k;
        a90.m127k(executor, "executor");
        this.f5899o = executor;
        this.f5900p = new a71(ht0Var.f3317k);
        ScheduledExecutorService scheduledExecutorService = ht0Var.f3319m;
        a90.m127k(scheduledExecutorService, "scheduledExecutorService");
        this.f5901q = scheduledExecutorService;
        this.f5897m = 3;
        this.f5870A = SocketFactory.getDefault();
        this.f5871B = ht0Var.f3321o;
        C0326il c0326il = ht0Var.f3322p;
        a90.m127k(c0326il, "connectionSpec");
        this.f5874E = c0326il;
        a90.m127k(u90Var, "stopwatchFactory");
        this.f5889e = u90Var;
        this.f5891g = ob0Var;
        this.f5887c = "grpc-java-okhttp/1.62.2";
        this.f5883N = rb0Var;
        this.f5879J = runnableC0897y0;
        this.f5880K = ht0Var.f3328v;
        ht0Var.f3320n.getClass();
        this.f5881L = new C0312i6(2);
        this.f5896l = me0.m3377a(ot0.class, inetSocketAddress.toString());
        C0831w8 c0831w9 = C0831w8.f8454b;
        C0794v8 c0794v8 = AbstractC0875xf.f8942d;
        IdentityHashMap identityHashMap = new IdentityHashMap(1);
        identityHashMap.put(c0794v8, c0831w8);
        for (Map.Entry entry : c0831w9.f8455a.entrySet()) {
            if (!identityHashMap.containsKey(entry.getKey())) {
                identityHashMap.put((C0794v8) entry.getKey(), entry.getValue());
            }
        }
        this.f5905u = new C0831w8(identityHashMap);
        synchronized (obj) {
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m3767e(ot0 ot0Var, String str) {
        EnumC0227fx enumC0227fx = EnumC0227fx.f2515l;
        ot0Var.m3783r(0, enumC0227fx, m3770v(enumC0227fx).m2837b(str));
    }

    /* JADX INFO: renamed from: f */
    public static Socket m3768f(ot0 ot0Var, InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, String str, String str2) throws ka1 {
        Socket socket = null;
        try {
            InetAddress address = inetSocketAddress2.getAddress();
            SocketFactory socketFactory = ot0Var.f5870A;
            Socket socketCreateSocket = address != null ? socketFactory.createSocket(inetSocketAddress2.getAddress(), inetSocketAddress2.getPort()) : socketFactory.createSocket(inetSocketAddress2.getHostName(), inetSocketAddress2.getPort());
            try {
                socketCreateSocket.setTcpNoDelay(true);
                socketCreateSocket.setSoTimeout(ot0Var.f5884O);
                int i = wt0.f8666a;
                z81 z81Var = new z81(socketCreateSocket);
                InputStream inputStream = socketCreateSocket.getInputStream();
                inputStream.getClass();
                C0609q8 c0609q8 = new C0609q8(z81Var, new C0609q8(inputStream, z81Var));
                z81 z81Var2 = new z81(socketCreateSocket);
                OutputStream outputStream = socketCreateSocket.getOutputStream();
                outputStream.getClass();
                f01 f01Var = new f01(new C0572p8(z81Var2, new C0572p8(outputStream, z81Var2)));
                f50 f50VarM3773g = ot0Var.m3773g(inetSocketAddress, str, str2);
                nu1 nu1Var = (nu1) f50VarM3773g.f2314l;
                tb0 tb0Var = (tb0) f50VarM3773g.f2313k;
                Locale locale = Locale.US;
                f01Var.m1556l("CONNECT " + tb0Var.f7403a + ":" + tb0Var.f7404b + " HTTP/1.1");
                f01Var.m1556l("\r\n");
                String[] strArr = (String[]) nu1Var.f5551k;
                String[] strArr2 = (String[]) nu1Var.f5551k;
                int length = strArr.length / 2;
                for (int i2 = 0; i2 < length; i2++) {
                    int i3 = i2 * 2;
                    f01Var.m1556l((i3 < 0 || i3 >= strArr2.length) ? null : strArr2[i3]);
                    f01Var.m1556l(": ");
                    int i4 = i3 + 1;
                    f01Var.m1556l((i4 < 0 || i4 >= strArr2.length) ? null : strArr2[i4]);
                    f01Var.m1556l("\r\n");
                }
                f01Var.m1556l("\r\n");
                f01Var.flush();
                C0163e6 c0163e6M1365f = C0163e6.m1365f(m3769o(c0609q8));
                int i5 = c0163e6M1365f.f1964k;
                while (!m3769o(c0609q8).equals("")) {
                }
                if (i5 >= 200 && i5 < 300) {
                    socketCreateSocket.setSoTimeout(0);
                    return socketCreateSocket;
                }
                C0539oc c0539oc = new C0539oc();
                try {
                    socketCreateSocket.shutdownOutput();
                    c0609q8.mo628k(c0539oc, 1024L);
                } catch (IOException e) {
                    String str3 = "Unable to read body: " + e.toString();
                    c0539oc.m3679t(str3, str3.length());
                }
                try {
                    socketCreateSocket.close();
                } catch (IOException unused) {
                }
                Locale locale2 = Locale.US;
                throw new ka1(ja1.f3883m.m2840h("Response returned from proxy was not successful (expected 2xx, got " + i5 + " " + ((String) c0163e6M1365f.f1966m) + "). Response body:\n" + c0539oc.m3673m(c0539oc.f5698k, AbstractC0321ig.f3562a)));
            } catch (IOException e2) {
                e = e2;
                socket = socketCreateSocket;
                if (socket != null) {
                    ca0.m907b(socket);
                }
                throw new ka1(ja1.f3883m.m2840h("Failed trying to connect with proxy").m2839g(e));
            }
        } catch (IOException e3) {
            e = e3;
        }
    }

    /* JADX INFO: renamed from: o */
    public static String m3769o(C0609q8 c0609q8) throws EOFException {
        long j;
        long j2;
        f61 f61Var;
        long j3;
        long j4;
        long j5;
        long j6;
        C0539oc c0539oc = new C0539oc();
        do {
            long jMo628k = c0609q8.mo628k(c0539oc, 1L);
            j = -1;
            j2 = c0539oc.f5698k;
            if (jMo628k == -1) {
                throw new EOFException("\\n not found: " + c0539oc.m3672l(j2).mo2557c());
            }
        } while (c0539oc.m3669e(j2 - 1) != 10);
        long j7 = c0539oc.f5698k;
        long j8 = Long.MAX_VALUE > j7 ? j7 : Long.MAX_VALUE;
        long j9 = 0;
        if (0 == j8 || (f61Var = c0539oc.f5697j) == null) {
            j3 = j;
            j4 = j9;
            j6 = j3;
        } else {
            if (j7 < 0) {
                while (j7 > 0) {
                    f61Var = f61Var.f2325g;
                    f61Var.getClass();
                    j7 -= (long) (f61Var.f2321c - f61Var.f2320b);
                }
                long j10 = 0;
                while (true) {
                    if (j7 < j8) {
                        byte[] bArr = f61Var.f2319a;
                        j3 = j;
                        j4 = j9;
                        int iMin = (int) Math.min(f61Var.f2321c, (((long) f61Var.f2320b) + j8) - j7);
                        int i = (int) ((((long) f61Var.f2320b) + j10) - j7);
                        while (true) {
                            if (i >= iMin) {
                                j10 = j7 + ((long) (f61Var.f2321c - f61Var.f2320b));
                                f61Var = f61Var.f2324f;
                                f61Var.getClass();
                                j7 = j10;
                                j = j3;
                                j9 = j4;
                            } else if (bArr[i] == 10) {
                                j5 = i - f61Var.f2320b;
                            } else {
                                i++;
                            }
                        }
                    } else {
                        j3 = j;
                        j4 = j9;
                        j6 = j3;
                    }
                }
            } else {
                j3 = -1;
                j4 = 0;
                j7 = 0;
                while (true) {
                    long j11 = ((long) (f61Var.f2321c - f61Var.f2320b)) + j7;
                    if (j11 > 0) {
                        break;
                    }
                    f61Var = f61Var.f2324f;
                    f61Var.getClass();
                    j7 = j11;
                }
                long j12 = 0;
                while (true) {
                    if (j7 < j8) {
                        byte[] bArr2 = f61Var.f2319a;
                        int iMin2 = (int) Math.min(f61Var.f2321c, (((long) f61Var.f2320b) + j8) - j7);
                        int i2 = (int) ((((long) f61Var.f2320b) + j12) - j7);
                        while (true) {
                            if (i2 >= iMin2) {
                                j12 = ((long) (f61Var.f2321c - f61Var.f2320b)) + j7;
                                f61Var = f61Var.f2324f;
                                f61Var.getClass();
                                j7 = j12;
                            } else if (bArr2[i2] == 10) {
                                j5 = i2 - f61Var.f2320b;
                            } else {
                                i2++;
                            }
                        }
                    } else {
                        j6 = j3;
                    }
                }
            }
            j6 = j5 + j7;
        }
        if (j6 != j3) {
            return AbstractC0044b.m545a(c0539oc, j6);
        }
        if (Long.MAX_VALUE < c0539oc.f5698k && c0539oc.m3669e(9223372036854775806L) == 13 && c0539oc.m3669e(Long.MAX_VALUE) == 10) {
            return AbstractC0044b.m545a(c0539oc, Long.MAX_VALUE);
        }
        C0539oc c0539oc2 = new C0539oc();
        long jMin = Math.min(32L, c0539oc.f5698k);
        long j13 = 0;
        a90.m128l(c0539oc.f5698k, 0L, jMin);
        if (jMin != j4) {
            c0539oc2.f5698k += jMin;
            f61 f61Var2 = c0539oc.f5697j;
            while (true) {
                f61Var2.getClass();
                long j14 = f61Var2.f2321c - f61Var2.f2320b;
                if (j13 < j14) {
                    break;
                }
                j13 -= j14;
                f61Var2 = f61Var2.f2324f;
            }
            while (jMin > j4) {
                f61Var2.getClass();
                f61 f61VarM1644c = f61Var2.m1644c();
                int i3 = f61VarM1644c.f2320b + ((int) j13);
                f61VarM1644c.f2320b = i3;
                f61VarM1644c.f2321c = Math.min(i3 + ((int) jMin), f61VarM1644c.f2321c);
                f61 f61Var3 = c0539oc2.f5697j;
                if (f61Var3 == null) {
                    f61VarM1644c.f2325g = f61VarM1644c;
                    f61VarM1644c.f2324f = f61VarM1644c;
                    c0539oc2.f5697j = f61VarM1644c;
                } else {
                    f61 f61Var4 = f61Var3.f2325g;
                    f61Var4.getClass();
                    f61Var4.m1643b(f61VarM1644c);
                }
                jMin -= (long) (f61VarM1644c.f2321c - f61VarM1644c.f2320b);
                f61Var2 = f61Var2.f2324f;
                j13 = j4;
            }
        }
        throw new EOFException("\\n not found: limit=" + Math.min(c0539oc.f5698k, Long.MAX_VALUE) + " content=" + c0539oc2.m3672l(c0539oc2.f5698k).mo2557c() + (char) 8230);
    }

    /* JADX INFO: renamed from: v */
    public static ja1 m3770v(EnumC0227fx enumC0227fx) {
        ja1 ja1Var = (ja1) f5868P.get(enumC0227fx);
        if (ja1Var != null) {
            return ja1Var;
        }
        return ja1.f3877g.m2840h("Unknown http2 error code: " + enumC0227fx.f2527j);
    }

    @Override // p000.ul0
    /* JADX INFO: renamed from: a */
    public final void mo3771a(ja1 ja1Var) {
        synchronized (this.f5895k) {
            try {
                if (this.f5906v != null) {
                    return;
                }
                this.f5906v = ja1Var;
                this.f5892h.m3362k(ja1Var);
                m3786u();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.ul0
    /* JADX INFO: renamed from: b */
    public final Runnable mo3772b(tl0 tl0Var) {
        this.f5892h = (m81) tl0Var;
        if (this.f5876G) {
            wg0 wg0Var = new wg0(new nu1(28, this), this.f5901q, this.f5877H, this.f5878I);
            this.f5875F = wg0Var;
            synchronized (wg0Var) {
            }
        }
        C0535o8 c0535o8 = new C0535o8(this.f5900p, this);
        ob0 ob0Var = this.f5891g;
        f01 f01Var = new f01(c0535o8);
        ob0Var.getClass();
        C0461m8 c0461m8 = new C0461m8(c0535o8, new nb0(f01Var));
        synchronized (this.f5895k) {
            C0597px c0597px = new C0597px(this, c0461m8);
            this.f5893i = c0597px;
            this.f5894j = new g92(this, c0597px);
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.f5900p.execute(new RunnableC0702sr(this, countDownLatch, c0535o8, 4));
        try {
            m3781p();
            countDownLatch.countDown();
            this.f5900p.execute(new RunnableC0897y0(18, this));
            return null;
        } catch (Throwable th) {
            countDownLatch.countDown();
            throw th;
        }
    }

    @Override // p000.le0
    /* JADX INFO: renamed from: c */
    public final me0 mo1526c() {
        return this.f5896l;
    }

    @Override // p000.InterfaceC0655rh
    /* JADX INFO: renamed from: d */
    public final InterfaceC0507nh mo1527d(wp0 wp0Var, np0 np0Var, C0095ce c0095ce, o80[] o80VarArr) {
        lt0 lt0Var;
        a90.m127k(wp0Var, "method");
        a90.m127k(np0Var, "headers");
        C0831w8 c0831w8 = this.f5905u;
        ha1 ha1Var = new ha1(o80VarArr);
        for (o80 o80Var : o80VarArr) {
            o80Var.mo1309B(c0831w8, np0Var);
        }
        synchronized (this.f5895k) {
            lt0Var = new lt0(wp0Var, np0Var, this.f5893i, this, this.f5894j, this.f5895k, this.f5902r, this.f5890f, this.f5886b, this.f5887c, ha1Var, this.f5881L, c0095ce);
        }
        return lt0Var;
    }

    /* JADX WARN: Code duplicated, block: B:115:0x0291 A[LOOP:9: B:88:0x024d->B:115:0x0291, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:122:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:125:0x02b3 A[LOOP:4: B:121:0x02a5->B:125:0x02b3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:141:0x02ff A[EDGE_INSN: B:141:0x02ff->B:198:0x0476 BREAK  A[LOOP:11: B:186:0x0454->B:197:0x0473], PHI: r30
      0x02ff: PHI (r30v3 java.lang.String) = 
      (r30v1 java.lang.String)
      (r30v1 java.lang.String)
      (r30v1 java.lang.String)
      (r30v1 java.lang.String)
      (r30v1 java.lang.String)
      (r30v6 java.lang.String)
     binds: [B:227:0x02ff, B:279:0x02ff, B:192:0x0466, B:277:0x02ff, B:184:0x0451, B:140:0x02fd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:142:0x0303  */
    /* JADX WARN: Code duplicated, block: B:144:0x030c  */
    /* JADX WARN: Code duplicated, block: B:147:0x0312  */
    /* JADX WARN: Code duplicated, block: B:149:0x0315  */
    /* JADX WARN: Code duplicated, block: B:156:0x0328  */
    /* JADX WARN: Code duplicated, block: B:161:0x0337  */
    /* JADX WARN: Code duplicated, block: B:167:0x0349  */
    /* JADX WARN: Code duplicated, block: B:170:0x0362  */
    /* JADX WARN: Code duplicated, block: B:171:0x0377  */
    /* JADX WARN: Code duplicated, block: B:173:0x03f6 A[LOOP:8: B:172:0x03f4->B:173:0x03f6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:177:0x0432  */
    /* JADX WARN: Code duplicated, block: B:20:0x006e  */
    /* JADX WARN: Code duplicated, block: B:22:0x0072  */
    /* JADX WARN: Code duplicated, block: B:237:0x0136 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x007b  */
    /* JADX WARN: Code duplicated, block: B:252:0x02b9 A[EDGE_INSN: B:252:0x02b9->B:126:0x02b9 BREAK  A[LOOP:4: B:121:0x02a5->B:125:0x02b3], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:255:0x032a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x007f  */
    /* JADX WARN: Code duplicated, block: B:260:0x0347 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:261:0x0343 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:262:0x033b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:265:0x0334 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:270:0x020a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:274:0x028a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:34:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:35:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:41:0x0143  */
    /* JADX WARN: Code duplicated, block: B:43:0x0192  */
    /* JADX WARN: Code duplicated, block: B:48:0x019f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:51:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:52:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:54:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:99:0x0265  */
    /* JADX INFO: renamed from: g */
    public final f50 m3773g(InetSocketAddress inetSocketAddress, String str, String str2) throws EOFException {
        int i;
        int i2;
        long j;
        String strSubstring;
        String str3;
        String lowerCase;
        int i3;
        int i4;
        int i5;
        InetAddress byAddress;
        byte[] address;
        int i6;
        int i7;
        int i8;
        int i9;
        C0539oc c0539oc;
        long j2;
        byte[] bArr;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        char cCharAt;
        int i19;
        int i20;
        int iM4781a;
        int i21;
        int i22;
        String str4;
        char[] cArr;
        int i23;
        int i24;
        int i25 = 3;
        int i26 = 0;
        C0163e6 c0163e6 = new C0163e6(3, (byte) 0);
        int i27 = -1;
        c0163e6.f1964k = -1;
        c0163e6.f1965l = "https";
        String hostName = inetSocketAddress.getHostName();
        String str5 = "host == null";
        if (hostName == null) {
            C0270h1.m2190f("host == null");
            return null;
        }
        int length = hostName.length();
        int iCharCount = 0;
        while (true) {
            int i28 = 2;
            if (iCharCount >= length) {
                i = 2;
                i2 = 1;
                j = 4;
                strSubstring = hostName.substring(0, length);
                break;
            }
            j = 4;
            i2 = 1;
            int i29 = 37;
            if (hostName.charAt(iCharCount) == '%') {
                C0539oc c0539oc2 = new C0539oc();
                c0539oc2.m3679t(hostName, iCharCount);
                while (iCharCount < length) {
                    int i30 = i26;
                    int iCodePointAt = hostName.codePointAt(iCharCount);
                    if (iCodePointAt == i29 && (i24 = iCharCount + 2) < length) {
                        int iM4781a2 = tb0.m4781a(hostName.charAt(iCharCount + 1));
                        int iM4781a3 = tb0.m4781a(hostName.charAt(i24));
                        if (iM4781a2 != i27 && iM4781a3 != i27) {
                            c0539oc2.m3678s((iM4781a2 << 4) + iM4781a3);
                            i21 = i28;
                            iCharCount = i24;
                        } else if (iCodePointAt < 128) {
                            c0539oc2.m3678s(iCodePointAt);
                            i21 = i28;
                        } else if (iCodePointAt < 2048) {
                            f61 f61VarM3677r = c0539oc2.m3677r(i28);
                            byte[] bArr2 = f61VarM3677r.f2319a;
                            int i31 = f61VarM3677r.f2321c;
                            i21 = i28;
                            bArr2[i31] = (byte) ((iCodePointAt >> 6) | 192);
                            bArr2[i31 + 1] = (byte) (128 | (iCodePointAt & 63));
                            f61VarM3677r.f2321c = i31 + 2;
                            c0539oc2.f5698k += 2;
                        } else {
                            i21 = i28;
                            if (55296 > iCodePointAt) {
                                if (iCodePointAt < 65536) {
                                    f61 f61VarM3677r2 = c0539oc2.m3677r(i25);
                                    byte[] bArr3 = f61VarM3677r2.f2319a;
                                    int i32 = f61VarM3677r2.f2321c;
                                    bArr3[i32] = (byte) ((iCodePointAt >> 12) | 224);
                                    bArr3[i32 + 1] = (byte) (((iCodePointAt >> 6) & 63) | 128);
                                    bArr3[i32 + 2] = (byte) (128 | (iCodePointAt & 63));
                                    f61VarM3677r2.f2321c = i32 + i25;
                                    c0539oc2.f5698k += 3;
                                } else {
                                    if (iCodePointAt > 1114111) {
                                        i22 = i25;
                                        StringBuilder sb = new StringBuilder("Unexpected code point: 0x");
                                        if (iCodePointAt != 0) {
                                            char[] cArr2 = zg1.f9758d;
                                            char c = cArr2[(iCodePointAt >> 28) & 15];
                                            char c2 = cArr2[(iCodePointAt >> 24) & 15];
                                            char c3 = cArr2[(iCodePointAt >> 20) & 15];
                                            char c4 = cArr2[(iCodePointAt >> 16) & 15];
                                            char c5 = cArr2[(iCodePointAt >> 12) & 15];
                                            char c6 = cArr2[(iCodePointAt >> 8) & 15];
                                            char c7 = cArr2[(iCodePointAt >> 4) & 15];
                                            char c8 = cArr2[iCodePointAt & 15];
                                            cArr = new char[8];
                                            cArr[i30] = c;
                                            cArr[1] = c2;
                                            cArr[i21] = c3;
                                            cArr[i22] = c4;
                                            cArr[4] = c5;
                                            cArr[5] = c6;
                                            cArr[6] = c7;
                                            cArr[7] = c8;
                                            i23 = i30;
                                            while (i23 < 8) {
                                                i23++;
                                            }
                                            if (i23 < 0) {
                                                C0270h1.m2193i(AbstractC0024an.m282e(i23, "startIndex: ", ", endIndex: 8, size: 8"));
                                                return null;
                                            }
                                            if (i23 > 8) {
                                                C0270h1.m2190f(AbstractC0024an.m282e(i23, "startIndex: ", " > endIndex: 8"));
                                                return null;
                                            }
                                            str4 = new String(cArr, i23, 8 - i23);
                                        } else {
                                            str4 = "0";
                                        }
                                        sb.append(str4);
                                        throw new IllegalArgumentException(sb.toString());
                                    }
                                    f61 f61VarM3677r3 = c0539oc2.m3677r(4);
                                    byte[] bArr4 = f61VarM3677r3.f2319a;
                                    int i33 = f61VarM3677r3.f2321c;
                                    bArr4[i33] = (byte) ((iCodePointAt >> 18) | 240);
                                    bArr4[i33 + 1] = (byte) (((iCodePointAt >> 12) & 63) | 128);
                                    bArr4[i33 + 2] = (byte) ((63 & (iCodePointAt >> 6)) | 128);
                                    bArr4[i33 + 3] = (byte) (128 | (iCodePointAt & 63));
                                    f61VarM3677r3.f2321c = i33 + 4;
                                    c0539oc2.f5698k += 4;
                                }
                            } else if (iCodePointAt < 65536) {
                                f61 f61VarM3677r4 = c0539oc2.m3677r(i25);
                                byte[] bArr5 = f61VarM3677r4.f2319a;
                                int i34 = f61VarM3677r4.f2321c;
                                bArr5[i34] = (byte) ((iCodePointAt >> 12) | 224);
                                bArr5[i34 + 1] = (byte) (((iCodePointAt >> 6) & 63) | 128);
                                bArr5[i34 + 2] = (byte) (128 | (iCodePointAt & 63));
                                f61VarM3677r4.f2321c = i34 + i25;
                                c0539oc2.f5698k += 3;
                            } else {
                                if (iCodePointAt > 1114111) {
                                    i22 = i25;
                                    StringBuilder sb2 = new StringBuilder("Unexpected code point: 0x");
                                    if (iCodePointAt != 0) {
                                        char[] cArr3 = zg1.f9758d;
                                        char c9 = cArr3[(iCodePointAt >> 28) & 15];
                                        char c10 = cArr3[(iCodePointAt >> 24) & 15];
                                        char c11 = cArr3[(iCodePointAt >> 20) & 15];
                                        char c12 = cArr3[(iCodePointAt >> 16) & 15];
                                        char c13 = cArr3[(iCodePointAt >> 12) & 15];
                                        char c14 = cArr3[(iCodePointAt >> 8) & 15];
                                        char c15 = cArr3[(iCodePointAt >> 4) & 15];
                                        char c16 = cArr3[iCodePointAt & 15];
                                        cArr = new char[8];
                                        cArr[i30] = c9;
                                        cArr[1] = c10;
                                        cArr[i21] = c11;
                                        cArr[i22] = c12;
                                        cArr[4] = c13;
                                        cArr[5] = c14;
                                        cArr[6] = c15;
                                        cArr[7] = c16;
                                        i23 = i30;
                                        while (i23 < 8) {
                                            i23++;
                                        }
                                        if (i23 < 0) {
                                            C0270h1.m2193i(AbstractC0024an.m282e(i23, "startIndex: ", ", endIndex: 8, size: 8"));
                                            return null;
                                        }
                                        if (i23 > 8) {
                                            C0270h1.m2190f(AbstractC0024an.m282e(i23, "startIndex: ", " > endIndex: 8"));
                                            return null;
                                        }
                                        str4 = new String(cArr, i23, 8 - i23);
                                    } else {
                                        str4 = "0";
                                    }
                                    sb2.append(str4);
                                    throw new IllegalArgumentException(sb2.toString());
                                }
                                f61 f61VarM3677r5 = c0539oc2.m3677r(4);
                                byte[] bArr6 = f61VarM3677r5.f2319a;
                                int i35 = f61VarM3677r5.f2321c;
                                bArr6[i35] = (byte) ((iCodePointAt >> 18) | 240);
                                bArr6[i35 + 1] = (byte) (((iCodePointAt >> 12) & 63) | 128);
                                bArr6[i35 + 2] = (byte) ((63 & (iCodePointAt >> 6)) | 128);
                                bArr6[i35 + 3] = (byte) (128 | (iCodePointAt & 63));
                                f61VarM3677r5.f2321c = i35 + 4;
                                c0539oc2.f5698k += 4;
                            }
                        }
                    } else if (iCodePointAt < 128) {
                        c0539oc2.m3678s(iCodePointAt);
                        i21 = i28;
                    } else if (iCodePointAt < 2048) {
                        f61 f61VarM3677r6 = c0539oc2.m3677r(i28);
                        byte[] bArr7 = f61VarM3677r6.f2319a;
                        int i36 = f61VarM3677r6.f2321c;
                        i21 = i28;
                        bArr7[i36] = (byte) ((iCodePointAt >> 6) | 192);
                        bArr7[i36 + 1] = (byte) (128 | (iCodePointAt & 63));
                        f61VarM3677r6.f2321c = i36 + 2;
                        c0539oc2.f5698k += 2;
                    } else {
                        i21 = i28;
                        if (55296 > iCodePointAt && iCodePointAt < 57344) {
                            c0539oc2.m3678s(63);
                        } else if (iCodePointAt < 65536) {
                            f61 f61VarM3677r7 = c0539oc2.m3677r(i25);
                            byte[] bArr8 = f61VarM3677r7.f2319a;
                            int i37 = f61VarM3677r7.f2321c;
                            bArr8[i37] = (byte) ((iCodePointAt >> 12) | 224);
                            bArr8[i37 + 1] = (byte) (((iCodePointAt >> 6) & 63) | 128);
                            bArr8[i37 + 2] = (byte) (128 | (iCodePointAt & 63));
                            f61VarM3677r7.f2321c = i37 + i25;
                            c0539oc2.f5698k += 3;
                        } else {
                            if (iCodePointAt > 1114111) {
                                i22 = i25;
                                StringBuilder sb3 = new StringBuilder("Unexpected code point: 0x");
                                if (iCodePointAt != 0) {
                                    char[] cArr4 = zg1.f9758d;
                                    char c17 = cArr4[(iCodePointAt >> 28) & 15];
                                    char c18 = cArr4[(iCodePointAt >> 24) & 15];
                                    char c19 = cArr4[(iCodePointAt >> 20) & 15];
                                    char c110 = cArr4[(iCodePointAt >> 16) & 15];
                                    char c111 = cArr4[(iCodePointAt >> 12) & 15];
                                    char c112 = cArr4[(iCodePointAt >> 8) & 15];
                                    char c113 = cArr4[(iCodePointAt >> 4) & 15];
                                    char c114 = cArr4[iCodePointAt & 15];
                                    cArr = new char[8];
                                    cArr[i30] = c17;
                                    cArr[1] = c18;
                                    cArr[i21] = c19;
                                    cArr[i22] = c110;
                                    cArr[4] = c111;
                                    cArr[5] = c112;
                                    cArr[6] = c113;
                                    cArr[7] = c114;
                                    i23 = i30;
                                    while (i23 < 8 && cArr[i23] == '0') {
                                        i23++;
                                    }
                                    if (i23 < 0) {
                                        C0270h1.m2193i(AbstractC0024an.m282e(i23, "startIndex: ", ", endIndex: 8, size: 8"));
                                        return null;
                                    }
                                    if (i23 > 8) {
                                        C0270h1.m2190f(AbstractC0024an.m282e(i23, "startIndex: ", " > endIndex: 8"));
                                        return null;
                                    }
                                    str4 = new String(cArr, i23, 8 - i23);
                                } else {
                                    str4 = "0";
                                }
                                sb3.append(str4);
                                throw new IllegalArgumentException(sb3.toString());
                            }
                            f61 f61VarM3677r8 = c0539oc2.m3677r(4);
                            byte[] bArr9 = f61VarM3677r8.f2319a;
                            int i38 = f61VarM3677r8.f2321c;
                            bArr9[i38] = (byte) ((iCodePointAt >> 18) | 240);
                            bArr9[i38 + 1] = (byte) (((iCodePointAt >> 12) & 63) | 128);
                            bArr9[i38 + 2] = (byte) ((63 & (iCodePointAt >> 6)) | 128);
                            bArr9[i38 + 3] = (byte) (128 | (iCodePointAt & 63));
                            f61VarM3677r8.f2321c = i38 + 4;
                            c0539oc2.f5698k += 4;
                        }
                    }
                    iCharCount += Character.charCount(iCodePointAt);
                    i26 = i30;
                    i28 = i21;
                    i25 = i25;
                    i27 = -1;
                    i29 = 37;
                }
                i = i28;
                strSubstring = c0539oc2.m3673m(c0539oc2.f5698k, AbstractC0321ig.f3562a);
                break;
            }
            iCharCount++;
        }
        if (!strSubstring.startsWith("[") || !strSubstring.endsWith("]")) {
            str3 = "host == null";
            try {
                lowerCase = IDN.toASCII(strSubstring).toLowerCase(Locale.US);
                if (!lowerCase.isEmpty()) {
                    for (0; i3 < lowerCase.length(); i3 + 1) {
                        char cCharAt2 = lowerCase.charAt(i3);
                        i3 = (cCharAt2 > 31 && cCharAt2 < 127 && " #%/:?@[\\]".indexOf(cCharAt2) == -1) ? i3 + 1 : 0;
                    }
                }
            } catch (IllegalArgumentException unused) {
            }
            lowerCase = null;
            break;
        }
        int length2 = strSubstring.length() - 1;
        int i39 = 16;
        byte[] bArr10 = new byte[16];
        int i40 = i2;
        int i41 = 0;
        int i42 = -1;
        int i43 = -1;
        while (true) {
            try {
                if (i40 < length2) {
                    if (i41 == i39) {
                        str3 = str5;
                    } else {
                        int i44 = i40 + 2;
                        if (i44 <= length2) {
                            str3 = str5;
                            if (strSubstring.regionMatches(i40, "::", 0, i)) {
                                if (i42 == -1) {
                                    i41 += 2;
                                    i42 = i41;
                                    if (i44 == length2) {
                                        i4 = 16;
                                    } else {
                                        i43 = i44;
                                        i40 = i43;
                                        i19 = 0;
                                        while (i40 < length2) {
                                            iM4781a = tb0.m4781a(strSubstring.charAt(i40));
                                            if (iM4781a == -1) {
                                                break;
                                            }
                                            i19 = (i19 << 4) + iM4781a;
                                            i40++;
                                        }
                                        i20 = i40 - i43;
                                        if (i20 == 0 && i20 <= 4) {
                                            int i45 = i41 + 1;
                                            bArr10[i41] = (byte) ((i19 >>> 8) & 255);
                                            i41 += 2;
                                            bArr10[i45] = (byte) (i19 & 255);
                                            str5 = str3;
                                            i39 = 16;
                                            i2 = 1;
                                            i = 2;
                                        }
                                    }
                                }
                            }
                        } else {
                            str3 = str5;
                        }
                        if (i41 != 0) {
                            int i46 = i2;
                            if (strSubstring.regionMatches(i40, ":", 0, i46)) {
                                i40++;
                            } else if (strSubstring.regionMatches(i40, ".", 0, i46)) {
                                int i47 = i41 - 2;
                                int i48 = i47;
                                while (true) {
                                    if (i43 >= length2) {
                                        if (i48 == i41 + 2) {
                                            i41 += 2;
                                            i4 = 16;
                                        }
                                        if (byAddress == null) {
                                            lowerCase = null;
                                            break;
                                        }
                                        address = byAddress.getAddress();
                                        i6 = 16;
                                        if (address.length == 16) {
                                            throw new AssertionError();
                                        }
                                        i7 = i5;
                                        i8 = i7;
                                        i9 = -1;
                                        while (i7 < address.length) {
                                            i14 = i7;
                                            while (i14 < i6 && address[i14] == 0 && address[i14 + 1] == 0) {
                                                i14 += 2;
                                                i6 = 16;
                                            }
                                            i15 = i14 - i7;
                                            if (i15 > i8) {
                                                i9 = i7;
                                                i8 = i15;
                                            }
                                            i7 = i14 + 2;
                                            i6 = 16;
                                        }
                                        c0539oc = new C0539oc();
                                        while (i5 < address.length) {
                                            if (i5 == i9) {
                                                c0539oc.m3678s(58);
                                                i5 += i8;
                                                if (i5 == 16) {
                                                    c0539oc.m3678s(58);
                                                }
                                            } else {
                                                if (i5 > 0) {
                                                    c0539oc.m3678s(58);
                                                }
                                                j2 = ((address[i5] & 255) << 8) | (address[i5 + 1] & 255);
                                                if (j2 == 0) {
                                                    c0539oc.m3678s(48);
                                                    i12 = i5;
                                                    i13 = i8;
                                                } else {
                                                    long j3 = (j2 >>> 1) | j2;
                                                    long j4 = j3 | (j3 >>> 2);
                                                    long j5 = j4 | (j4 >>> 4);
                                                    long j6 = j5 | (j5 >>> 8);
                                                    long j7 = j6 | (j6 >>> 16);
                                                    long j8 = j7 | (j7 >>> 32);
                                                    long j9 = j8 - ((j8 >>> 1) & 6148914691236517205L);
                                                    long j10 = ((j9 >>> 2) & 3689348814741910323L) + (j9 & 3689348814741910323L);
                                                    long j11 = ((j10 >>> 4) + j10) & 1085102592571150095L;
                                                    long j12 = j11 + (j11 >>> 8);
                                                    long j13 = j12 + (j12 >>> 16);
                                                    int i49 = (int) ((((j13 & 63) + ((j13 >>> 32) & 63)) + 3) / j);
                                                    f61 f61VarM3677r9 = c0539oc.m3677r(i49);
                                                    bArr = f61VarM3677r9.f2319a;
                                                    i10 = f61VarM3677r9.f2321c;
                                                    i11 = (i10 + i49) - 1;
                                                    while (i11 >= i10) {
                                                        bArr[i11] = AbstractC0044b.f660a[(int) (j2 & 15)];
                                                        j2 >>>= 4;
                                                        i11--;
                                                        i8 = i8;
                                                        i5 = i5;
                                                    }
                                                    i12 = i5;
                                                    i13 = i8;
                                                    f61VarM3677r9.f2321c += i49;
                                                    c0539oc.f5698k += (long) i49;
                                                }
                                                i5 = i12 + 2;
                                                address = address;
                                                i8 = i13;
                                            }
                                        }
                                        lowerCase = c0539oc.m3673m(c0539oc.f5698k, AbstractC0321ig.f3562a);
                                    } else if (i48 != 16) {
                                        if (i48 == i47) {
                                            i16 = i43;
                                            i17 = 0;
                                            while (true) {
                                                if (i16 < length2) {
                                                    cCharAt = strSubstring.charAt(i16);
                                                    i18 = i47;
                                                    if (cCharAt < '0' && cCharAt <= '9') {
                                                        if ((i17 != 0 || i43 == i16) && (i17 = ((i17 * 10) + cCharAt) - 48) <= 255) {
                                                            i16++;
                                                            i47 = i18;
                                                        }
                                                    }
                                                } else {
                                                    i18 = i47;
                                                }
                                                if (i16 - i43 == 0) {
                                                    bArr10[i48] = (byte) i17;
                                                    i48++;
                                                    i43 = i16;
                                                    i47 = i18;
                                                }
                                            }
                                        } else if (strSubstring.charAt(i43) == '.') {
                                            i43++;
                                            i16 = i43;
                                            i17 = 0;
                                            while (true) {
                                                if (i16 < length2) {
                                                    cCharAt = strSubstring.charAt(i16);
                                                    i18 = i47;
                                                    if (cCharAt < '0') {
                                                    }
                                                } else {
                                                    i18 = i47;
                                                }
                                                if (i16 - i43 == 0) {
                                                    bArr10[i48] = (byte) i17;
                                                    i48++;
                                                    i43 = i16;
                                                    i47 = i18;
                                                }
                                                i16++;
                                                i47 = i18;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        i43 = i40;
                        i40 = i43;
                        i19 = 0;
                        while (i40 < length2) {
                            iM4781a = tb0.m4781a(strSubstring.charAt(i40));
                            if (iM4781a == -1) {
                                break;
                                break;
                            }
                            i19 = (i19 << 4) + iM4781a;
                            i40++;
                        }
                        i20 = i40 - i43;
                        if (i20 == 0) {
                        }
                    }
                    byAddress = null;
                    i5 = 0;
                    if (byAddress == null) {
                        lowerCase = null;
                        break;
                    }
                    address = byAddress.getAddress();
                    i6 = 16;
                    if (address.length == 16) {
                        throw new AssertionError();
                    }
                    i7 = i5;
                    i8 = i7;
                    i9 = -1;
                    while (i7 < address.length) {
                        i14 = i7;
                        while (i14 < i6) {
                            i14 += 2;
                            i6 = 16;
                        }
                        i15 = i14 - i7;
                        if (i15 > i8) {
                            i9 = i7;
                            i8 = i15;
                        }
                        i7 = i14 + 2;
                        i6 = 16;
                    }
                    c0539oc = new C0539oc();
                    while (i5 < address.length) {
                        if (i5 == i9) {
                            c0539oc.m3678s(58);
                            i5 += i8;
                            if (i5 == 16) {
                                c0539oc.m3678s(58);
                            }
                        } else {
                            if (i5 > 0) {
                                c0539oc.m3678s(58);
                            }
                            j2 = ((address[i5] & 255) << 8) | (address[i5 + 1] & 255);
                            if (j2 == 0) {
                                c0539oc.m3678s(48);
                                i12 = i5;
                                i13 = i8;
                            } else {
                                long j14 = (j2 >>> 1) | j2;
                                long j15 = j14 | (j14 >>> 2);
                                long j16 = j15 | (j15 >>> 4);
                                long j17 = j16 | (j16 >>> 8);
                                long j18 = j17 | (j17 >>> 16);
                                long j19 = j18 | (j18 >>> 32);
                                long j20 = j19 - ((j19 >>> 1) & 6148914691236517205L);
                                long j110 = ((j20 >>> 2) & 3689348814741910323L) + (j20 & 3689348814741910323L);
                                long j111 = ((j110 >>> 4) + j110) & 1085102592571150095L;
                                long j112 = j111 + (j111 >>> 8);
                                long j113 = j112 + (j112 >>> 16);
                                int i410 = (int) ((((j113 & 63) + ((j113 >>> 32) & 63)) + 3) / j);
                                f61 f61VarM3677r10 = c0539oc.m3677r(i410);
                                bArr = f61VarM3677r10.f2319a;
                                i10 = f61VarM3677r10.f2321c;
                                i11 = (i10 + i410) - 1;
                                while (i11 >= i10) {
                                    bArr[i11] = AbstractC0044b.f660a[(int) (j2 & 15)];
                                    j2 >>>= 4;
                                    i11--;
                                    i8 = i8;
                                    i5 = i5;
                                }
                                i12 = i5;
                                i13 = i8;
                                f61VarM3677r10.f2321c += i410;
                                c0539oc.f5698k += (long) i410;
                            }
                            i5 = i12 + 2;
                            address = address;
                            i8 = i13;
                        }
                    }
                    lowerCase = c0539oc.m3673m(c0539oc.f5698k, AbstractC0321ig.f3562a);
                } else {
                    str3 = str5;
                    i4 = i39;
                }
                if (i41 != i4) {
                    if (i42 == -1) {
                        byAddress = null;
                        i5 = 0;
                    } else {
                        int i50 = i41 - i42;
                        System.arraycopy(bArr10, i42, bArr10, 16 - i50, i50);
                        i5 = 0;
                        Arrays.fill(bArr10, i42, (16 - i41) + i42, (byte) 0);
                    }
                    if (byAddress == null) {
                        lowerCase = null;
                        break;
                    }
                    address = byAddress.getAddress();
                    i6 = 16;
                    if (address.length == 16) {
                        throw new AssertionError();
                    }
                    i7 = i5;
                    i8 = i7;
                    i9 = -1;
                    while (i7 < address.length) {
                        i14 = i7;
                        while (i14 < i6) {
                            i14 += 2;
                            i6 = 16;
                        }
                        i15 = i14 - i7;
                        if (i15 > i8) {
                            i9 = i7;
                            i8 = i15;
                        }
                        i7 = i14 + 2;
                        i6 = 16;
                    }
                    c0539oc = new C0539oc();
                    while (i5 < address.length) {
                        if (i5 == i9) {
                            c0539oc.m3678s(58);
                            i5 += i8;
                            if (i5 == 16) {
                                c0539oc.m3678s(58);
                            }
                        } else {
                            if (i5 > 0) {
                                c0539oc.m3678s(58);
                            }
                            j2 = ((address[i5] & 255) << 8) | (address[i5 + 1] & 255);
                            if (j2 == 0) {
                                c0539oc.m3678s(48);
                                i12 = i5;
                                i13 = i8;
                            } else {
                                long j114 = (j2 >>> 1) | j2;
                                long j115 = j114 | (j114 >>> 2);
                                long j116 = j115 | (j115 >>> 4);
                                long j117 = j116 | (j116 >>> 8);
                                long j118 = j117 | (j117 >>> 16);
                                long j119 = j118 | (j118 >>> 32);
                                long j21 = j119 - ((j119 >>> 1) & 6148914691236517205L);
                                long j1110 = ((j21 >>> 2) & 3689348814741910323L) + (j21 & 3689348814741910323L);
                                long j1111 = ((j1110 >>> 4) + j1110) & 1085102592571150095L;
                                long j1112 = j1111 + (j1111 >>> 8);
                                long j1113 = j1112 + (j1112 >>> 16);
                                int i411 = (int) ((((j1113 & 63) + ((j1113 >>> 32) & 63)) + 3) / j);
                                f61 f61VarM3677r11 = c0539oc.m3677r(i411);
                                bArr = f61VarM3677r11.f2319a;
                                i10 = f61VarM3677r11.f2321c;
                                i11 = (i10 + i411) - 1;
                                while (i11 >= i10) {
                                    bArr[i11] = AbstractC0044b.f660a[(int) (j2 & 15)];
                                    j2 >>>= 4;
                                    i11--;
                                    i8 = i8;
                                    i5 = i5;
                                }
                                i12 = i5;
                                i13 = i8;
                                f61VarM3677r11.f2321c += i411;
                                c0539oc.f5698k += (long) i411;
                            }
                            i5 = i12 + 2;
                            address = address;
                            i8 = i13;
                        }
                    }
                    lowerCase = c0539oc.m3673m(c0539oc.f5698k, AbstractC0321ig.f3562a);
                } else {
                    i5 = 0;
                }
                byAddress = InetAddress.getByAddress(bArr10);
                if (byAddress == null) {
                    lowerCase = null;
                    break;
                }
                address = byAddress.getAddress();
                i6 = 16;
                if (address.length == 16) {
                    throw new AssertionError();
                }
                i7 = i5;
                i8 = i7;
                i9 = -1;
                while (i7 < address.length) {
                    i14 = i7;
                    while (i14 < i6) {
                        i14 += 2;
                        i6 = 16;
                    }
                    i15 = i14 - i7;
                    if (i15 > i8) {
                        i9 = i7;
                        i8 = i15;
                    }
                    i7 = i14 + 2;
                    i6 = 16;
                }
                c0539oc = new C0539oc();
                while (i5 < address.length) {
                    if (i5 == i9) {
                        c0539oc.m3678s(58);
                        i5 += i8;
                        if (i5 == 16) {
                            c0539oc.m3678s(58);
                        }
                    } else {
                        if (i5 > 0) {
                            c0539oc.m3678s(58);
                        }
                        j2 = ((address[i5] & 255) << 8) | (address[i5 + 1] & 255);
                        if (j2 == 0) {
                            c0539oc.m3678s(48);
                            i12 = i5;
                            i13 = i8;
                        } else {
                            long j1114 = (j2 >>> 1) | j2;
                            long j1115 = j1114 | (j1114 >>> 2);
                            long j1116 = j1115 | (j1115 >>> 4);
                            long j1117 = j1116 | (j1116 >>> 8);
                            long j1118 = j1117 | (j1117 >>> 16);
                            long j1119 = j1118 | (j1118 >>> 32);
                            long j22 = j1119 - ((j1119 >>> 1) & 6148914691236517205L);
                            long j11110 = ((j22 >>> 2) & 3689348814741910323L) + (j22 & 3689348814741910323L);
                            long j11111 = ((j11110 >>> 4) + j11110) & 1085102592571150095L;
                            long j11112 = j11111 + (j11111 >>> 8);
                            long j11113 = j11112 + (j11112 >>> 16);
                            int i412 = (int) ((((j11113 & 63) + ((j11113 >>> 32) & 63)) + 3) / j);
                            f61 f61VarM3677r12 = c0539oc.m3677r(i412);
                            bArr = f61VarM3677r12.f2319a;
                            i10 = f61VarM3677r12.f2321c;
                            i11 = (i10 + i412) - 1;
                            while (i11 >= i10) {
                                bArr[i11] = AbstractC0044b.f660a[(int) (j2 & 15)];
                                j2 >>>= 4;
                                i11--;
                                i8 = i8;
                                i5 = i5;
                            }
                            i12 = i5;
                            i13 = i8;
                            f61VarM3677r12.f2321c += i412;
                            c0539oc.f5698k += (long) i412;
                        }
                        i5 = i12 + 2;
                        address = address;
                        i8 = i13;
                    }
                }
                lowerCase = c0539oc.m3673m(c0539oc.f5698k, AbstractC0321ig.f3562a);
            } catch (UnknownHostException unused2) {
                throw new AssertionError();
            }
        }
        if (lowerCase == null) {
            C0270h1.m2190f("unexpected host: ".concat(hostName));
            return null;
        }
        c0163e6.f1966m = lowerCase;
        int port = inetSocketAddress.getPort();
        if (port <= 0 || port > 65535) {
            C0270h1.m2190f(j11.m2773h("unexpected port: ", port));
            return null;
        }
        c0163e6.f1964k = port;
        if (((String) c0163e6.f1966m) == null) {
            C0270h1.m2191g(str3);
            return null;
        }
        tb0 tb0Var = new tb0(c0163e6);
        f50 f50Var = new f50(22);
        f50Var.f2314l = new C0781uw(1);
        f50Var.f2313k = tb0Var;
        f50Var.m1612O("Host", tb0Var.f7403a + ":" + tb0Var.f7404b);
        f50Var.m1612O("User-Agent", this.f5887c);
        if (str != null && str2 != null) {
            try {
                f50Var.m1612O("Proxy-Authorization", "Basic " + C0836wd.m5316f((str + ":" + str2).getBytes("ISO-8859-1")).mo2555a());
            } catch (UnsupportedEncodingException unused3) {
                throw new AssertionError();
            }
        }
        if (((tb0) f50Var.f2313k) != null) {
            return new f50(f50Var);
        }
        C0270h1.m2191g("url == null");
        return null;
    }

    @Override // p000.InterfaceC0215fl
    public final C0831w8 getAttributes() {
        return this.f5905u;
    }

    /* JADX INFO: renamed from: h */
    public final void m3774h(int i, ja1 ja1Var, EnumC0544oh enumC0544oh, boolean z, EnumC0227fx enumC0227fx, np0 np0Var) {
        synchronized (this.f5895k) {
            try {
                lt0 lt0Var = (lt0) this.f5898n.remove(Integer.valueOf(i));
                if (lt0Var != null) {
                    if (enumC0227fx != null) {
                        this.f5893i.m4003j(i, EnumC0227fx.f2521r);
                    }
                    if (ja1Var != null) {
                        kt0 kt0Var = lt0Var.f4904u;
                        if (np0Var == null) {
                            np0Var = new np0();
                        }
                        kt0Var.m3086l(ja1Var, enumC0544oh, z, np0Var);
                    }
                    if (!m3784s()) {
                        m3786u();
                        m3779m(lt0Var);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final wu0[] m3775i() {
        wu0[] wu0VarArr;
        wu0 wu0Var;
        synchronized (this.f5895k) {
            wu0VarArr = new wu0[this.f5898n.size()];
            Iterator it = this.f5898n.values().iterator();
            int i = 0;
            while (it.hasNext()) {
                int i2 = i + 1;
                kt0 kt0Var = ((lt0) it.next()).f4904u;
                synchronized (kt0Var.f4545v) {
                    wu0Var = kt0Var.f4521I;
                }
                wu0VarArr[i] = wu0Var;
                i = i2;
            }
        }
        return wu0VarArr;
    }

    /* JADX INFO: renamed from: j */
    public final int m3776j() {
        URI uriM906a = ca0.m906a(this.f5886b);
        return uriM906a.getPort() != -1 ? uriM906a.getPort() : this.f5885a.getPort();
    }

    /* JADX INFO: renamed from: k */
    public final ka1 m3777k() {
        synchronized (this.f5895k) {
            try {
                ja1 ja1Var = this.f5906v;
                if (ja1Var != null) {
                    return new ka1(ja1Var);
                }
                return new ka1(ja1.f3883m.m2840h("Connection closed"));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x000c  */
    /* JADX INFO: renamed from: l */
    public final boolean m3778l(int i) {
        boolean z;
        synchronized (this.f5895k) {
            if (i < this.f5897m) {
                z = true;
                if ((i & 1) != 1) {
                    z = false;
                }
            } else {
                z = false;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: m */
    public final void m3779m(lt0 lt0Var) {
        if (this.f5910z && this.f5873D.isEmpty() && this.f5898n.isEmpty()) {
            this.f5910z = false;
            wg0 wg0Var = this.f5875F;
            if (wg0Var != null) {
                synchronized (wg0Var) {
                    int i = wg0Var.f8541d;
                    if (i == 2 || i == 3) {
                        wg0Var.f8541d = 1;
                    }
                    if (wg0Var.f8541d == 4) {
                        wg0Var.f8541d = 5;
                    }
                }
            }
        }
        if (lt0Var.f5216l) {
            this.f5882M.m4577m(lt0Var, false);
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m3780n(Exception exc) {
        m3783r(0, EnumC0227fx.f2516m, ja1.f3883m.m2839g(exc));
    }

    /* JADX INFO: renamed from: p */
    public final void m3781p() {
        synchronized (this.f5895k) {
            try {
                C0597px c0597px = this.f5893i;
                c0597px.getClass();
                try {
                    c0597px.f6281k.m3333e();
                } catch (IOException e) {
                    c0597px.f6280j.m3780n(e);
                }
                C0678s3 c0678s3 = new C0678s3(5);
                c0678s3.m4474d(7, this.f5890f);
                C0597px c0597px2 = this.f5893i;
                c0597px2.f6282l.m1619V(2, c0678s3);
                try {
                    c0597px2.f6281k.m3337m(c0678s3);
                } catch (IOException e2) {
                    c0597px2.f6280j.m3780n(e2);
                }
                int i = this.f5890f;
                if (i > 65535) {
                    this.f5893i.m4004l(0, i - 65535);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m3782q(ja1 ja1Var) {
        mo3771a(ja1Var);
        synchronized (this.f5895k) {
            try {
                Iterator it = this.f5898n.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    it.remove();
                    ((lt0) entry.getValue()).f4904u.m3087m(ja1Var, false, new np0());
                    m3779m((lt0) entry.getValue());
                }
                for (lt0 lt0Var : this.f5873D) {
                    lt0Var.f4904u.m3086l(ja1Var, EnumC0544oh.f5734m, true, new np0());
                    m3779m(lt0Var);
                }
                this.f5873D.clear();
                m3786u();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m3783r(int i, EnumC0227fx enumC0227fx, ja1 ja1Var) {
        synchronized (this.f5895k) {
            try {
                if (this.f5906v == null) {
                    this.f5906v = ja1Var;
                    this.f5892h.m3362k(ja1Var);
                }
                if (enumC0227fx != null && !this.f5907w) {
                    this.f5907w = true;
                    this.f5893i.m4001e(enumC0227fx, new byte[0]);
                }
                Iterator it = this.f5898n.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (((Integer) entry.getKey()).intValue() > i) {
                        it.remove();
                        ((lt0) entry.getValue()).f4904u.m3086l(ja1Var, EnumC0544oh.f5732k, false, new np0());
                        m3779m((lt0) entry.getValue());
                    }
                }
                for (lt0 lt0Var : this.f5873D) {
                    lt0Var.f4904u.m3086l(ja1Var, EnumC0544oh.f5734m, true, new np0());
                    m3779m(lt0Var);
                }
                this.f5873D.clear();
                m3786u();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public final boolean m3784s() {
        boolean z = false;
        while (true) {
            LinkedList linkedList = this.f5873D;
            if (linkedList.isEmpty() || this.f5898n.size() >= this.f5872C) {
                break;
            }
            m3785t((lt0) linkedList.poll());
            z = true;
        }
        return z;
    }

    /* JADX INFO: renamed from: t */
    public final void m3785t(lt0 lt0Var) {
        boolean zM3083i;
        a90.m132p("StreamId already assigned", lt0Var.f4904u.f4522J == -1);
        this.f5898n.put(Integer.valueOf(this.f5897m), lt0Var);
        if (!this.f5910z) {
            this.f5910z = true;
            wg0 wg0Var = this.f5875F;
            if (wg0Var != null) {
                wg0Var.m5329b();
            }
        }
        if (lt0Var.f5216l) {
            this.f5882M.m4577m(lt0Var, true);
        }
        kt0 kt0Var = lt0Var.f4904u;
        int i = this.f5897m;
        if (!(kt0Var.f4522J == -1)) {
            C0270h1.m2191g(o80.m3651s("the stream has been started with id %s", Integer.valueOf(i)));
            return;
        }
        kt0Var.f4522J = i;
        g92 g92Var = kt0Var.f4517E;
        kt0Var.f4521I = new wu0(g92Var, i, g92Var.f2671j, kt0Var);
        kt0 kt0Var2 = kt0Var.f4523K.f4904u;
        a90.m133q(kt0Var2.f4533j != null);
        synchronized (kt0Var2.f4525b) {
            a90.m132p("Already allocated", !kt0Var2.f4529f);
            kt0Var2.f4529f = true;
        }
        synchronized (kt0Var2.f4525b) {
            zM3083i = kt0Var2.m3083i();
        }
        if (zM3083i) {
            kt0Var2.f4533j.mo1033d();
        }
        C0312i6 c0312i6 = kt0Var2.f4526c;
        c0312i6.getClass();
        ((nc1) c0312i6.f3447k).m3517H();
        if (kt0Var.f4519G) {
            C0597px c0597px = kt0Var.f4516D;
            boolean z = kt0Var.f4523K.f4907x;
            int i2 = kt0Var.f4522J;
            ArrayList arrayList = kt0Var.f4546w;
            c0597px.getClass();
            try {
                nb0 nb0Var = c0597px.f6281k.f4998j;
                synchronized (nb0Var) {
                    if (nb0Var.f5359n) {
                        throw new IOException("closed");
                    }
                    nb0Var.m3512e(z, i2, arrayList);
                }
            } catch (IOException e) {
                c0597px.f6280j.m3780n(e);
            }
            for (o80 o80Var : kt0Var.f4523K.f4902s.f3140a) {
                o80Var.mo1317v();
            }
            kt0Var.f4546w = null;
            C0539oc c0539oc = kt0Var.f4547x;
            if (c0539oc.f5698k > 0) {
                kt0Var.f4517E.m2005a(kt0Var.f4548y, kt0Var.f4521I, c0539oc, kt0Var.f4549z);
            }
            kt0Var.f4519G = false;
        }
        vp0 vp0Var = (vp0) lt0Var.f4900q.f8620l;
        if ((vp0Var != vp0.f8244j && vp0Var != vp0.f8245k) || lt0Var.f4907x) {
            this.f5893i.flush();
        }
        int i3 = this.f5897m;
        if (i3 < 2147483645) {
            this.f5897m = i3 + 2;
        } else {
            this.f5897m = Integer.MAX_VALUE;
            m3783r(Integer.MAX_VALUE, EnumC0227fx.f2514k, ja1.f3883m.m2840h("Stream ids exhausted"));
        }
    }

    public final String toString() {
        C0809vn c0809vnM5362k = wm1.m5362k(this);
        c0809vnM5362k.m5173d("logId", this.f5896l.f5031c);
        c0809vnM5362k.m5172c(this.f5885a, "address");
        return c0809vnM5362k.toString();
    }

    /* JADX INFO: renamed from: u */
    public final void m3786u() {
        if (this.f5906v == null || !this.f5898n.isEmpty() || !this.f5873D.isEmpty() || this.f5909y) {
            return;
        }
        this.f5909y = true;
        wg0 wg0Var = this.f5875F;
        if (wg0Var != null) {
            synchronized (wg0Var) {
                try {
                    if (wg0Var.f8541d != 6) {
                        wg0Var.f8541d = 6;
                        ScheduledFuture scheduledFuture = wg0Var.f8542e;
                        if (scheduledFuture != null) {
                            scheduledFuture.cancel(false);
                        }
                        ScheduledFuture scheduledFuture2 = wg0Var.f8543f;
                        if (scheduledFuture2 != null) {
                            scheduledFuture2.cancel(false);
                            wg0Var.f8543f = null;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        qb0 qb0Var = this.f5908x;
        if (qb0Var != null) {
            ka1 ka1VarM3777k = m3777k();
            synchronized (qb0Var) {
                try {
                    if (!qb0Var.f6454d) {
                        qb0Var.f6454d = true;
                        qb0Var.f6455e = ka1VarM3777k;
                        LinkedHashMap linkedHashMap = qb0Var.f6453c;
                        qb0Var.f6453c = null;
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            try {
                                ((Executor) entry.getValue()).execute(new pb0((vg0) entry.getKey(), ka1VarM3777k));
                            } catch (Throwable th2) {
                                qb0.f6450g.log(Level.SEVERE, "Failed to execute PingCallback", th2);
                            }
                        }
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            this.f5908x = null;
        }
        if (!this.f5907w) {
            this.f5907w = true;
            this.f5893i.m4001e(EnumC0227fx.f2514k, new byte[0]);
        }
        this.f5893i.close();
    }
}
