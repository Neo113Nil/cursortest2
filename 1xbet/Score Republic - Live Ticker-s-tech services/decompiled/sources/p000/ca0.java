package p000;

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
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ca0 {

    /* JADX INFO: renamed from: a */
    public static final Logger f1181a = Logger.getLogger(ca0.class.getName());

    /* JADX INFO: renamed from: b */
    public static final Set f1182b = Collections.unmodifiableSet(EnumSet.of(ia1.f3506l, ia1.f3509o, ia1.f3511q, ia1.f3512r, ia1.f3515u, ia1.f3516v, ia1.f3517w, ia1.f3503A));

    /* JADX INFO: renamed from: c */
    public static final jp0 f1183c;

    /* JADX INFO: renamed from: d */
    public static final jp0 f1184d;

    /* JADX INFO: renamed from: e */
    public static final lp0 f1185e;

    /* JADX INFO: renamed from: f */
    public static final jp0 f1186f;

    /* JADX INFO: renamed from: g */
    public static final lp0 f1187g;

    /* JADX INFO: renamed from: h */
    public static final jp0 f1188h;

    /* JADX INFO: renamed from: i */
    public static final jp0 f1189i;

    /* JADX INFO: renamed from: j */
    public static final jp0 f1190j;

    /* JADX INFO: renamed from: k */
    public static final jp0 f1191k;

    /* JADX INFO: renamed from: l */
    public static final long f1192l;

    /* JADX INFO: renamed from: m */
    public static final sy0 f1193m;

    /* JADX INFO: renamed from: n */
    public static final C0059be f1194n;

    /* JADX INFO: renamed from: o */
    public static final z90 f1195o;

    /* JADX INFO: renamed from: p */
    public static final aa0 f1196p;

    /* JADX INFO: renamed from: q */
    public static final x80 f1197q;

    /* JADX INFO: renamed from: r */
    public static final u90 f1198r;

    static {
        Charset.forName("US-ASCII");
        f1183c = new jp0("grpc-timeout", new x80(2));
        x80 x80Var = np0.f5485d;
        f1184d = new jp0("grpc-encoding", x80Var);
        f1185e = oe0.m3684a("grpc-accept-encoding", new aa0(1));
        f1186f = new jp0("content-encoding", x80Var);
        f1187g = oe0.m3684a("accept-encoding", new aa0(1));
        f1188h = new jp0("content-length", x80Var);
        f1189i = new jp0("content-type", x80Var);
        f1190j = new jp0("te", x80Var);
        f1191k = new jp0("user-agent", x80Var);
        C0285hg.f3200l.getClass();
        f1192l = 20000000000L;
        f1193m = new sy0();
        f1194n = new C0059be("io.grpc.internal.CALL_OPTIONS_RPC_OWNED_BY_BALANCER", 0);
        f1195o = new z90();
        f1196p = new aa0(0);
        f1197q = new x80(1);
        f1198r = new u90(1);
    }

    /* JADX INFO: renamed from: a */
    public static URI m906a(String str) {
        String str2;
        a90.m127k(str, "authority");
        try {
            str2 = str;
            try {
                return new URI(null, str2, null, null, null);
            } catch (URISyntaxException e) {
                e = e;
                throw new IllegalArgumentException("Invalid authority: ".concat(str2), e);
            }
        } catch (URISyntaxException e2) {
            e = e2;
            str2 = str;
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m907b(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e) {
            f1181a.log(Level.WARNING, "exception caught in closeQuietly", (Throwable) e);
        }
    }

    /* JADX INFO: renamed from: c */
    public static o80[] m908c(C0095ce c0095ce, np0 np0Var, int i, boolean z) {
        List list = c0095ce.f1228d;
        int size = list.size();
        o80[] o80VarArr = new o80[size + 1];
        C0095ce c0095ce2 = C0095ce.f1224h;
        C0120d c0120d = new C0120d(c0095ce, i, z);
        for (int i2 = 0; i2 < list.size(); i2++) {
            o80VarArr[i2] = ((AbstractC0618qh) list.get(i2)).mo1894a(c0120d, np0Var);
        }
        o80VarArr[size] = f1195o;
        return o80VarArr;
    }

    /* JADX INFO: renamed from: d */
    public static String m909d(InetSocketAddress inetSocketAddress) {
        try {
            return (String) InetSocketAddress.class.getMethod("getHostString", null).invoke(inetSocketAddress, null);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return inetSocketAddress.getHostName();
        }
    }

    /* JADX INFO: renamed from: e */
    public static ad1 m910e(String str) {
        Boolean bool = Boolean.TRUE;
        String.format(Locale.ROOT, str, 0);
        return new ad1(Executors.defaultThreadFactory(), str, new AtomicLong(0L), bool);
    }

    /* JADX INFO: renamed from: f */
    public static InterfaceC0655rh m911f(ij0 ij0Var, boolean z) {
        te0 te0Var;
        AbstractC0959zp abstractC0959zp = ij0Var.f3586a;
        ja1 ja1Var = ij0Var.f3588c;
        if (abstractC0959zp == null) {
            te0Var = null;
        } else {
            xe0 xe0Var = (xe0) abstractC0959zp.mo2659h();
            te0Var = xe0Var.f8932v;
            if (te0Var == null) {
                xe0Var.f8921k.execute(new re0(xe0Var, 1));
                te0Var = null;
            }
        }
        if (te0Var != null) {
            AbstractC0618qh abstractC0618qh = ij0Var.f3587b;
            return abstractC0618qh == null ? te0Var : new C0192ez(abstractC0618qh, te0Var);
        }
        if (!ja1Var.m2838f()) {
            if (ij0Var.f3589d) {
                return new C0192ez(m913h(ja1Var), EnumC0544oh.f5733l);
            }
            if (!z) {
                return new C0192ez(m913h(ja1Var), EnumC0544oh.f5731j);
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0029  */
    /* JADX WARN: Code duplicated, block: B:25:0x0035  */
    /* JADX INFO: renamed from: g */
    public static ja1 m912g(int i) {
        ia1 ia1Var;
        if ((i >= 100 && i < 200) || i == 400) {
            ia1Var = ia1.f3519y;
        } else if (i == 401) {
            ia1Var = ia1.f3504B;
        } else if (i == 403) {
            ia1Var = ia1.f3513s;
        } else if (i == 404) {
            ia1Var = ia1.f3518x;
        } else if (i == 429) {
            ia1Var = ia1.f3520z;
        } else if (i != 431) {
            switch (i) {
                case 502:
                case 503:
                case 504:
                    ia1Var = ia1.f3520z;
                    break;
                default:
                    ia1Var = ia1.f3508n;
                    break;
            }
        } else {
            ia1Var = ia1.f3519y;
        }
        return ia1Var.m2581a().m2840h("HTTP status code " + i);
    }

    /* JADX INFO: renamed from: h */
    public static ja1 m913h(ja1 ja1Var) {
        a90.m123g(ja1Var != null);
        if (!f1182b.contains(ja1Var.f3886a)) {
            return ja1Var;
        }
        return ja1.f3882l.m2840h("Inappropriate status code from control plane: " + ja1Var.f3886a + " " + ja1Var.f3887b).m2839g(ja1Var.f3888c);
    }
}
