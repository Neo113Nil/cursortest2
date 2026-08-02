package p000;

import java.net.InetSocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class jl0 extends vk0 implements le0 {

    /* JADX INFO: renamed from: c0 */
    public static final Logger f3965c0 = Logger.getLogger(jl0.class.getName());

    /* JADX INFO: renamed from: d0 */
    public static final Pattern f3966d0 = Pattern.compile("[a-zA-Z][a-zA-Z0-9+.-]*:/.*");

    /* JADX INFO: renamed from: e0 */
    public static final ja1 f3967e0;

    /* JADX INFO: renamed from: f0 */
    public static final ja1 f3968f0;

    /* JADX INFO: renamed from: g0 */
    public static final sl0 f3969g0;

    /* JADX INFO: renamed from: h0 */
    public static final wk0 f3970h0;

    /* JADX INFO: renamed from: i0 */
    public static final C0776ur f3971i0;

    /* JADX INFO: renamed from: A */
    public final HashSet f3972A;

    /* JADX INFO: renamed from: B */
    public LinkedHashSet f3973B;

    /* JADX INFO: renamed from: C */
    public final Object f3974C;

    /* JADX INFO: renamed from: D */
    public final HashSet f3975D;

    /* JADX INFO: renamed from: E */
    public final C0961zr f3976E;

    /* JADX INFO: renamed from: F */
    public final f71 f3977F;

    /* JADX INFO: renamed from: G */
    public final AtomicBoolean f3978G;

    /* JADX INFO: renamed from: H */
    public boolean f3979H;

    /* JADX INFO: renamed from: I */
    public volatile boolean f3980I;

    /* JADX INFO: renamed from: J */
    public final CountDownLatch f3981J;

    /* JADX INFO: renamed from: K */
    public final u90 f3982K;

    /* JADX INFO: renamed from: L */
    public final f71 f3983L;

    /* JADX INFO: renamed from: M */
    public final C0137dg f3984M;

    /* JADX INFO: renamed from: N */
    public final C0912yf f3985N;

    /* JADX INFO: renamed from: O */
    public final je0 f3986O;

    /* JADX INFO: renamed from: P */
    public final gl0 f3987P;

    /* JADX INFO: renamed from: Q */
    public sl0 f3988Q;

    /* JADX INFO: renamed from: R */
    public boolean f3989R;

    /* JADX INFO: renamed from: S */
    public final boolean f3990S;

    /* JADX INFO: renamed from: T */
    public final an0 f3991T;

    /* JADX INFO: renamed from: U */
    public final long f3992U;

    /* JADX INFO: renamed from: V */
    public final long f3993V;

    /* JADX INFO: renamed from: W */
    public final boolean f3994W;

    /* JADX INFO: renamed from: X */
    public final nc1 f3995X;

    /* JADX INFO: renamed from: Y */
    public final qe0 f3996Y;

    /* JADX INFO: renamed from: Z */
    public final p90 f3997Z;

    /* JADX INFO: renamed from: a */
    public final me0 f3998a;

    /* JADX INFO: renamed from: a0 */
    public final r11 f3999a0;

    /* JADX INFO: renamed from: b */
    public final String f4000b;

    /* JADX INFO: renamed from: b0 */
    public int f4001b0;

    /* JADX INFO: renamed from: c */
    public final gr0 f4002c;

    /* JADX INFO: renamed from: d */
    public final cr0 f4003d;

    /* JADX INFO: renamed from: e */
    public final C0312i6 f4004e;

    /* JADX INFO: renamed from: f */
    public final C0015ae f4005f;

    /* JADX INFO: renamed from: g */
    public final hl0 f4006g;

    /* JADX INFO: renamed from: h */
    public final Executor f4007h;

    /* JADX INFO: renamed from: i */
    public final jg0 f4008i;

    /* JADX INFO: renamed from: j */
    public final bl0 f4009j;

    /* JADX INFO: renamed from: k */
    public final bl0 f4010k;

    /* JADX INFO: renamed from: l */
    public final nc1 f4011l;

    /* JADX INFO: renamed from: m */
    public final gc1 f4012m;

    /* JADX INFO: renamed from: n */
    public final C0258gq f4013n;

    /* JADX INFO: renamed from: o */
    public final C0806vk f4014o;

    /* JADX INFO: renamed from: p */
    public final nb1 f4015p;

    /* JADX INFO: renamed from: q */
    public final long f4016q;

    /* JADX INFO: renamed from: r */
    public final p90 f4017r;

    /* JADX INFO: renamed from: s */
    public final o31 f4018s;

    /* JADX INFO: renamed from: t */
    public final AbstractC0727tf f4019t;

    /* JADX INFO: renamed from: u */
    public final ArrayList f4020u;

    /* JADX INFO: renamed from: v */
    public n31 f4021v;

    /* JADX INFO: renamed from: w */
    public boolean f4022w;

    /* JADX INFO: renamed from: x */
    public cl0 f4023x;

    /* JADX INFO: renamed from: y */
    public volatile kj0 f4024y;

    /* JADX INFO: renamed from: z */
    public boolean f4025z;

    static {
        ja1 ja1Var = ja1.f3883m;
        ja1Var.m2840h("Channel shutdownNow invoked");
        f3967e0 = ja1Var.m2840h("Channel shutdown invoked");
        f3968f0 = ja1Var.m2840h("Subchannel shutdown invoked");
        f3969g0 = new sl0(null, new HashMap(), new HashMap(), null, null, null);
        f3970h0 = new wk0();
        f3971i0 = new C0776ur(1);
    }

    public jl0(kl0 kl0Var, ht0 ht0Var, o31 o31Var, jg0 jg0Var, nb1 nb1Var, ArrayList arrayList) {
        int i;
        nc1 nc1Var = nc1.f5376o;
        gc1 gc1Var = new gc1(new yk0(this));
        this.f4012m = gc1Var;
        p90 p90Var = new p90();
        p90Var.f6027j = new ArrayList();
        p90Var.f6028k = EnumC0474ml.f5074m;
        this.f4017r = p90Var;
        this.f3972A = new HashSet(16, 0.75f);
        this.f3974C = new Object();
        this.f3975D = new HashSet(1, 0.75f);
        this.f3977F = new f71(this);
        this.f3978G = new AtomicBoolean(false);
        this.f3981J = new CountDownLatch(1);
        this.f4001b0 = 1;
        this.f3988Q = f3969g0;
        this.f3989R = false;
        this.f3991T = new an0(7);
        this.f3995X = C0885xp.f9012m;
        nu1 nu1Var = new nu1(29, this);
        this.f3996Y = new qe0(this, 1);
        this.f3997Z = new p90(this);
        String str = kl0Var.f4426l;
        a90.m127k(str, "target");
        this.f4000b = str;
        me0 me0Var = new me0(me0.f5028d.incrementAndGet(), "Channel", str);
        this.f3998a = me0Var;
        this.f4011l = nc1Var;
        jg0 jg0Var2 = kl0Var.f4421g;
        a90.m127k(jg0Var2, "executorPool");
        this.f4008i = jg0Var2;
        Executor executor = (Executor) r71.m4273a((q71) jg0Var2.f3922k);
        a90.m127k(executor, "executor");
        this.f4007h = executor;
        jg0 jg0Var3 = kl0Var.f4422h;
        a90.m127k(jg0Var3, "offloadExecutorPool");
        bl0 bl0Var = new bl0(jg0Var3);
        this.f4010k = bl0Var;
        C0015ae c0015ae = new C0015ae(ht0Var, bl0Var);
        this.f4005f = c0015ae;
        hl0 hl0Var = new hl0(ht0Var.f3319m);
        this.f4006g = hl0Var;
        C0137dg c0137dg = new C0137dg(me0Var, nc1Var.m3517H(), AbstractC0024an.m284g("Channel for '", str, "'"));
        this.f3984M = c0137dg;
        C0912yf c0912yf = new C0912yf(c0137dg, nc1Var);
        this.f3985N = c0912yf;
        sy0 sy0Var = ca0.f1193m;
        boolean z = kl0Var.f4435u;
        this.f3994W = z;
        C0312i6 c0312i6 = new C0312i6(kl0Var.f4427m);
        this.f4004e = c0312i6;
        gr0 gr0Var = kl0Var.f4424j;
        this.f4002c = gr0Var;
        z41 z41Var = new z41(z, kl0Var.f4431q, kl0Var.f4432r, c0312i6);
        int i2 = ((it0) kl0Var.f4420D.f3922k).f3652m;
        int iM292o = AbstractC0024an.m292o(i2);
        if (iM292o == 0) {
            i = 443;
        } else {
            if (iM292o != 1) {
                throw new AssertionError(AbstractC0024an.m297t(i2).concat(" not handled"));
            }
            i = 80;
        }
        Integer numValueOf = Integer.valueOf(i);
        sy0Var.getClass();
        cr0 cr0Var = new cr0(numValueOf, sy0Var, gc1Var, z41Var, hl0Var, c0912yf, bl0Var);
        this.f4003d = cr0Var;
        c0015ae.f157j.getClass();
        this.f4021v = m2921i(str, gr0Var, cr0Var, Collections.singleton(InetSocketAddress.class));
        this.f4009j = new bl0(jg0Var);
        C0961zr c0961zr = new C0961zr(executor, gc1Var);
        this.f3976E = c0961zr;
        c0961zr.mo3772b(nu1Var);
        this.f4018s = o31Var;
        boolean z2 = kl0Var.f4437w;
        this.f3990S = z2;
        gl0 gl0Var = new gl0(this, this.f4021v.mo3090d());
        this.f3987P = gl0Var;
        int size = arrayList.size();
        int i3 = 0;
        AbstractC0727tf c0359jh = gl0Var;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            c0359jh = new C0359jh(c0359jh, (up0) obj);
        }
        this.f4019t = c0359jh;
        this.f4020u = new ArrayList(kl0Var.f4425k);
        a90.m127k(nb1Var, "stopwatchSupplier");
        this.f4015p = nb1Var;
        long j = kl0Var.f4430p;
        if (j == -1) {
            this.f4016q = j;
        } else {
            a90.m120d(j, "invalid idleTimeoutMillis %s", j >= kl0.f4412G);
            this.f4016q = kl0Var.f4430p;
        }
        this.f3999a0 = new r11(new RunnableC0897y0(13, this), gc1Var, c0015ae.f157j.f3319m, (na1) nb1Var.get());
        C0258gq c0258gq = kl0Var.f4428n;
        a90.m127k(c0258gq, "decompressorRegistry");
        this.f4013n = c0258gq;
        C0806vk c0806vk = kl0Var.f4429o;
        a90.m127k(c0806vk, "compressorRegistry");
        this.f4014o = c0806vk;
        this.f3993V = kl0Var.f4433s;
        this.f3992U = kl0Var.f4434t;
        this.f3982K = new u90(6);
        this.f3983L = new f71(4);
        je0 je0Var = kl0Var.f4436v;
        je0Var.getClass();
        this.f3986O = je0Var;
        if (z2) {
            return;
        }
        this.f3989R = true;
    }

    /* JADX INFO: renamed from: g */
    public static void m2920g(jl0 jl0Var) {
        if (!jl0Var.f3980I && jl0Var.f3978G.get() && jl0Var.f3972A.isEmpty() && jl0Var.f3975D.isEmpty()) {
            jl0Var.f3985N.mo5321i("Terminated", 2);
            jg0 jg0Var = jl0Var.f4008i;
            r71.m4274b((q71) jg0Var.f3922k, jl0Var.f4007h);
            bl0 bl0Var = jl0Var.f4009j;
            synchronized (bl0Var) {
                Executor executor = bl0Var.f902k;
                if (executor != null) {
                    r71.m4274b((q71) ((jg0) bl0Var.f903l).f3922k, executor);
                    bl0Var.f902k = null;
                }
            }
            bl0 bl0Var2 = jl0Var.f4010k;
            synchronized (bl0Var2) {
                Executor executor2 = bl0Var2.f902k;
                if (executor2 != null) {
                    r71.m4274b((q71) ((jg0) bl0Var2.f903l).f3922k, executor2);
                    bl0Var2.f902k = null;
                }
            }
            jl0Var.f4005f.close();
            jl0Var.f3980I = true;
            jl0Var.f3981J.countDown();
        }
    }

    /* JADX INFO: renamed from: i */
    public static n31 m2921i(String str, gr0 gr0Var, cr0 cr0Var, Collection collection) {
        URI uri;
        fr0 fr0Var;
        cr0 cr0Var2;
        C0409ku c0409ku;
        String str2;
        String str3;
        String str4;
        v01 v01Var;
        v01 v01Var2;
        StringBuilder sb = new StringBuilder();
        try {
            uri = new URI(str);
        } catch (URISyntaxException e) {
            sb.append(e.getMessage());
            uri = null;
        }
        if (uri == null) {
            fr0Var = null;
        } else {
            String scheme = uri.getScheme();
            if (scheme == null) {
                gr0Var.getClass();
                fr0Var = null;
            } else {
                synchronized (gr0Var) {
                    v01Var2 = gr0Var.f2862c;
                }
                fr0Var = (fr0) v01Var2.get(scheme.toLowerCase(Locale.US));
            }
        }
        if (fr0Var == null && !f3966d0.matcher(str).matches()) {
            try {
                synchronized (gr0Var) {
                    str4 = gr0Var.f2860a;
                }
                uri = new URI(str4, "", "/" + str, null);
                String scheme2 = uri.getScheme();
                if (scheme2 == null) {
                    fr0Var = null;
                } else {
                    synchronized (gr0Var) {
                        v01Var = gr0Var.f2862c;
                    }
                    fr0Var = (fr0) v01Var.get(scheme2.toLowerCase(Locale.US));
                }
            } catch (URISyntaxException e2) {
                throw new IllegalArgumentException(e2);
            }
        }
        if (fr0Var == null) {
            if (sb.length() > 0) {
                str3 = " (" + ((Object) sb) + ")";
            } else {
                str3 = "";
            }
            throw new IllegalArgumentException(AbstractC0024an.m284g("Could not find a NameResolverProvider for ", str, str3));
        }
        if (collection != null && !collection.containsAll(Collections.singleton(InetSocketAddress.class))) {
            throw new IllegalArgumentException("Address types of NameResolver '" + uri.getScheme() + "' for '" + str + "' not supported by transport");
        }
        if ("dns".equals(uri.getScheme())) {
            String path = uri.getPath();
            a90.m127k(path, "targetPath");
            if (!path.startsWith("/")) {
                C0270h1.m2190f(o80.m3651s("the path component (%s) of the target (%s) must start with '/'", path, uri));
                return null;
            }
            String strSubstring = path.substring(1);
            uri.getAuthority();
            cr0Var2 = cr0Var;
            c0409ku = new C0409ku(strSubstring, cr0Var2, ca0.f1196p, new na1(), C0446lu.f4909a);
        } else {
            cr0Var2 = cr0Var;
            c0409ku = null;
        }
        if (c0409ku != null) {
            o31 o31Var = new o31(23);
            hl0 hl0Var = cr0Var2.f1438e;
            if (hl0Var != null) {
                gc1 gc1Var = cr0Var2.f1436c;
                return new n31(c0409ku, new C0012ab(o31Var, hl0Var, gc1Var), gc1Var);
            }
            C0270h1.m2191g("ScheduledExecutorService not set in Builder");
            return null;
        }
        if (sb.length() > 0) {
            str2 = " (" + ((Object) sb) + ")";
        } else {
            str2 = "";
        }
        throw new IllegalArgumentException(AbstractC0024an.m284g("cannot create a NameResolver for ", str, str2));
    }

    @Override // p000.le0
    /* JADX INFO: renamed from: c */
    public final me0 mo1526c() {
        return this.f3998a;
    }

    @Override // p000.AbstractC0727tf
    /* JADX INFO: renamed from: e */
    public final String mo1438e() {
        return this.f4019t.mo1438e();
    }

    @Override // p000.AbstractC0727tf
    /* JADX INFO: renamed from: f */
    public final xe1 mo1439f(wp0 wp0Var, C0095ce c0095ce) {
        return this.f4019t.mo1439f(wp0Var, c0095ce);
    }

    /* JADX INFO: renamed from: h */
    public final void m2922h() {
        this.f4012m.m2028d();
        if (this.f3978G.get() || this.f4025z) {
            return;
        }
        if (((Set) this.f3996Y.f7192j).isEmpty()) {
            m2923j();
        } else {
            this.f3999a0.f6662f = false;
        }
        if (this.f4023x != null) {
            return;
        }
        this.f3985N.mo5321i("Exiting idle mode", 2);
        cl0 cl0Var = new cl0(this);
        C0312i6 c0312i6 = this.f4004e;
        c0312i6.getClass();
        cl0Var.f1285h = new f71(c0312i6, cl0Var);
        this.f4023x = cl0Var;
        this.f4021v.mo3093l(new dl0(this, cl0Var, this.f4021v));
        this.f4022w = true;
    }

    /* JADX INFO: renamed from: j */
    public final void m2923j() {
        long j = this.f4016q;
        if (j == -1) {
            return;
        }
        r11 r11Var = this.f3999a0;
        r11Var.getClass();
        long nanos = TimeUnit.MILLISECONDS.toNanos(j);
        long jM3509a = r11Var.f6660d.m3509a() + nanos;
        r11Var.f6662f = true;
        if (jM3509a - r11Var.f6661e < 0 || r11Var.f6663g == null) {
            ScheduledFuture scheduledFuture = r11Var.f6663g;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            r11Var.f6663g = r11Var.f6657a.schedule(new q11(r11Var, 1), nanos, TimeUnit.NANOSECONDS);
        }
        r11Var.f6661e = jM3509a;
    }

    /* JADX INFO: renamed from: k */
    public final void m2924k(boolean z) {
        this.f4012m.m2028d();
        if (z) {
            a90.m132p("nameResolver is not started", this.f4022w);
            a90.m132p("lbHelper is null", this.f4023x != null);
        }
        n31 n31Var = this.f4021v;
        if (n31Var != null) {
            n31Var.mo3092k();
            this.f4022w = false;
            if (z) {
                String str = this.f4000b;
                gr0 gr0Var = this.f4002c;
                cr0 cr0Var = this.f4003d;
                this.f4005f.f157j.getClass();
                this.f4021v = m2921i(str, gr0Var, cr0Var, Collections.singleton(InetSocketAddress.class));
            } else {
                this.f4021v = null;
            }
        }
        cl0 cl0Var = this.f4023x;
        if (cl0Var != null) {
            f71 f71Var = cl0Var.f1285h;
            ((mj0) f71Var.f2335l).mo1390f();
            f71Var.f2335l = null;
            this.f4023x = null;
        }
        this.f4024y = null;
    }

    public final String toString() {
        C0809vn c0809vnM5362k = wm1.m5362k(this);
        c0809vnM5362k.m5173d("logId", this.f3998a.f5031c);
        c0809vnM5362k.m5172c(this.f4000b, "target");
        return c0809vnM5362k.toString();
    }
}
