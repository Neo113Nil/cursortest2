package W5;

import U5.AbstractC0440g;
import U5.AbstractC0442i;
import U5.AbstractC0457y;
import U5.C0437d;
import U5.C0441h;
import U5.C0443j;
import d6.C0984r;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: W5.d0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0494d0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f7163a = Logger.getLogger(AbstractC0494d0.class.getName());

    /* renamed from: b, reason: collision with root package name */
    public static final Set f7164b = Collections.unmodifiableSet(EnumSet.of(U5.k0.OK, U5.k0.INVALID_ARGUMENT, U5.k0.NOT_FOUND, U5.k0.ALREADY_EXISTS, U5.k0.FAILED_PRECONDITION, U5.k0.ABORTED, U5.k0.OUT_OF_RANGE, U5.k0.DATA_LOSS));

    /* renamed from: c, reason: collision with root package name */
    public static final U5.W f7165c;

    /* renamed from: d, reason: collision with root package name */
    public static final U5.W f7166d;

    /* renamed from: e, reason: collision with root package name */
    public static final U5.Z f7167e;

    /* renamed from: f, reason: collision with root package name */
    public static final U5.W f7168f;

    /* renamed from: g, reason: collision with root package name */
    public static final U5.Z f7169g;

    /* renamed from: h, reason: collision with root package name */
    public static final U5.W f7170h;

    /* renamed from: i, reason: collision with root package name */
    public static final U5.W f7171i;
    public static final U5.W j;

    /* renamed from: k, reason: collision with root package name */
    public static final U5.W f7172k;

    /* renamed from: l, reason: collision with root package name */
    public static final long f7173l;

    /* renamed from: m, reason: collision with root package name */
    public static final C0542t1 f7174m;

    /* renamed from: n, reason: collision with root package name */
    public static final J0.a f7175n;

    /* renamed from: o, reason: collision with root package name */
    public static final C0488b0 f7176o;

    /* renamed from: p, reason: collision with root package name */
    public static final f2 f7177p;

    /* renamed from: q, reason: collision with root package name */
    public static final f2 f7178q;

    /* renamed from: r, reason: collision with root package name */
    public static final f2 f7179r;

    static {
        Charset.forName("US-ASCII");
        f7165c = new U5.W("grpc-timeout", new f2(12));
        C0443j c0443j = U5.b0.f6457d;
        f7166d = new U5.W("grpc-encoding", c0443j);
        f7167e = U5.G.a("grpc-accept-encoding", new f2(11));
        f7168f = new U5.W("content-encoding", c0443j);
        f7169g = U5.G.a("accept-encoding", new f2(11));
        f7170h = new U5.W("content-length", c0443j);
        f7171i = new U5.W("content-type", c0443j);
        j = new U5.W("te", c0443j);
        f7172k = new U5.W("user-agent", c0443j);
        D3.e.f1716c.getClass();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f7173l = timeUnit.toNanos(20L);
        TimeUnit.HOURS.toNanos(2L);
        timeUnit.toNanos(20L);
        f7174m = new C0542t1();
        f7175n = new J0.a("io.grpc.internal.CALL_OPTIONS_RPC_OWNED_BY_BALANCER", 1);
        f7176o = new C0488b0();
        f7177p = new f2(8);
        f7178q = new f2(9);
        f7179r = new f2(10);
    }

    public static URI a(String str) {
        p3.f.k(str, "authority");
        try {
            return new URI(null, str, null, null, null);
        } catch (URISyntaxException e7) {
            throw new IllegalArgumentException("Invalid authority: ".concat(str), e7);
        }
    }

    public static void b(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e7) {
            f7163a.log(Level.WARNING, "exception caught in closeQuietly", (Throwable) e7);
        }
    }

    public static AbstractC0442i[] c(C0437d c0437d, U5.b0 b0Var, int i7, boolean z4) {
        List list = c0437d.f6478e;
        int size = list.size();
        AbstractC0442i[] abstractC0442iArr = new AbstractC0442i[size + 1];
        C0437d c0437d2 = C0437d.f6473i;
        C0441h c0441h = new C0441h(c0437d, i7, z4);
        for (int i8 = 0; i8 < list.size(); i8++) {
            abstractC0442iArr[i8] = ((AbstractC0440g) list.get(i8)).a(c0441h, b0Var);
        }
        abstractC0442iArr[size] = f7176o;
        return abstractC0442iArr;
    }

    public static String d(InetSocketAddress inetSocketAddress) {
        try {
            return (String) InetSocketAddress.class.getMethod("getHostString", null).invoke(inetSocketAddress, null);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return inetSocketAddress.getHostName();
        }
    }

    public static I3.c e(String str) {
        Boolean bool = Boolean.TRUE;
        String.format(Locale.ROOT, str, 0);
        return new I3.c(Executors.defaultThreadFactory(), str, new AtomicLong(0L), bool);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static InterfaceC0549w f(U5.J j3, boolean z4) {
        C0527o0 c0527o0;
        AbstractC0457y abstractC0457y = j3.f6426a;
        if (abstractC0457y != null) {
            C0538s0 c0538s0 = (C0538s0) abstractC0457y.e();
            c0527o0 = c0538s0.f7360v;
            if (c0527o0 == null) {
                c0538s0.f7349k.execute(new RunnableC0515k0(c0538s0, 1));
            }
            if (c0527o0 == null) {
                C0984r c0984r = j3.f6427b;
                return c0984r == null ? c0527o0 : new X(c0984r, c0527o0);
            }
            U5.l0 l0Var = j3.f6428c;
            if (!l0Var.e()) {
                if (j3.f6429d) {
                    return new X(h(l0Var), EnumC0543u.f7374c);
                }
                if (!z4) {
                    return new X(h(l0Var), EnumC0543u.f7372a);
                }
            }
            return null;
        }
        c0527o0 = null;
        if (c0527o0 == null) {
        }
    }

    public static U5.l0 g(int i7) {
        U5.k0 k0Var;
        if (i7 < 100 || i7 >= 200) {
            if (i7 != 400) {
                if (i7 == 401) {
                    k0Var = U5.k0.UNAUTHENTICATED;
                } else if (i7 == 403) {
                    k0Var = U5.k0.PERMISSION_DENIED;
                } else if (i7 != 404) {
                    if (i7 != 429) {
                        if (i7 != 431) {
                            switch (i7) {
                                case 502:
                                case 503:
                                case 504:
                                    break;
                                default:
                                    k0Var = U5.k0.UNKNOWN;
                                    break;
                            }
                        }
                    }
                    k0Var = U5.k0.UNAVAILABLE;
                } else {
                    k0Var = U5.k0.UNIMPLEMENTED;
                }
            }
            k0Var = U5.k0.INTERNAL;
        } else {
            k0Var = U5.k0.INTERNAL;
        }
        return k0Var.a().g("HTTP status code " + i7);
    }

    public static U5.l0 h(U5.l0 l0Var) {
        p3.f.e(l0Var != null);
        if (!f7164b.contains(l0Var.f6547a)) {
            return l0Var;
        }
        return U5.l0.f6543m.g("Inappropriate status code from control plane: " + l0Var.f6547a + " " + l0Var.f6548b).f(l0Var.f6549c);
    }
}
