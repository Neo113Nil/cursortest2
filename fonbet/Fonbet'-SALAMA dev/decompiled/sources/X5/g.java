package X5;

import A1.x0;
import G4.A;
import U5.AbstractC0454v;
import U5.S;
import U5.r0;
import W5.AbstractC0494d0;
import W5.C0556y0;
import W5.R0;
import W5.f2;
import W5.h2;
import java.util.EnumSet;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import javax.net.ssl.SSLSocketFactory;
import w1.C1761y0;

/* loaded from: classes2.dex */
public final class g extends AbstractC0454v {

    /* renamed from: m, reason: collision with root package name */
    public static final Y5.b f7520m;

    /* renamed from: n, reason: collision with root package name */
    public static final long f7521n;

    /* renamed from: o, reason: collision with root package name */
    public static final C1761y0 f7522o;

    /* renamed from: a, reason: collision with root package name */
    public final R0 f7523a;

    /* renamed from: e, reason: collision with root package name */
    public SSLSocketFactory f7527e;

    /* renamed from: b, reason: collision with root package name */
    public final f2 f7524b = h2.f7230d;

    /* renamed from: c, reason: collision with root package name */
    public final C1761y0 f7525c = f7522o;

    /* renamed from: d, reason: collision with root package name */
    public final C1761y0 f7526d = new C1761y0(AbstractC0494d0.f7178q, 11);

    /* renamed from: f, reason: collision with root package name */
    public final Y5.b f7528f = f7520m;

    /* renamed from: g, reason: collision with root package name */
    public int f7529g = 1;

    /* renamed from: h, reason: collision with root package name */
    public long f7530h = Long.MAX_VALUE;

    /* renamed from: i, reason: collision with root package name */
    public final long f7531i = AbstractC0494d0.f7173l;
    public final int j = 65535;

    /* renamed from: k, reason: collision with root package name */
    public final int f7532k = 4194304;

    /* renamed from: l, reason: collision with root package name */
    public final int f7533l = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;

    static {
        Logger.getLogger(g.class.getName());
        A a2 = new A(Y5.b.f7771e);
        a2.c(Y5.a.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, Y5.a.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, Y5.a.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, Y5.a.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, Y5.a.f7757E, Y5.a.f7756D);
        a2.f(Y5.l.TLS_1_2);
        if (!a2.f2871a) {
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }
        a2.f2872b = true;
        f7520m = new Y5.b(a2);
        f7521n = TimeUnit.DAYS.toNanos(1000L);
        f7522o = new C1761y0(new M4.e(), 11);
        EnumSet.of(r0.f6582a, r0.f6583b);
    }

    public g(String str) {
        this.f7523a = new R0(str, new x0(this, 11), new R4.c(this, 11));
    }

    @Override // U5.S
    public final void b(TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(30L);
        this.f7530h = nanos;
        long max = Math.max(nanos, C0556y0.f7397k);
        this.f7530h = max;
        if (max >= f7521n) {
            this.f7530h = Long.MAX_VALUE;
        }
    }

    @Override // U5.S
    public final void c() {
        this.f7529g = 2;
    }

    @Override // U5.AbstractC0454v
    public final S d() {
        return this.f7523a;
    }
}
