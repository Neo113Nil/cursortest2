package p000;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ht0 implements InterfaceC0729th {

    /* JADX INFO: renamed from: j */
    public final jg0 f3316j;

    /* JADX INFO: renamed from: k */
    public final Executor f3317k;

    /* JADX INFO: renamed from: l */
    public final jg0 f3318l;

    /* JADX INFO: renamed from: m */
    public final ScheduledExecutorService f3319m;

    /* JADX INFO: renamed from: n */
    public final u90 f3320n;

    /* JADX INFO: renamed from: o */
    public final SSLSocketFactory f3321o;

    /* JADX INFO: renamed from: p */
    public final C0326il f3322p;

    /* JADX INFO: renamed from: q */
    public final int f3323q;

    /* JADX INFO: renamed from: r */
    public final boolean f3324r;

    /* JADX INFO: renamed from: s */
    public final C0720t8 f3325s;

    /* JADX INFO: renamed from: t */
    public final long f3326t;

    /* JADX INFO: renamed from: u */
    public final int f3327u;

    /* JADX INFO: renamed from: v */
    public final int f3328v;

    /* JADX INFO: renamed from: w */
    public boolean f3329w;

    public ht0(jg0 jg0Var, jg0 jg0Var2, SSLSocketFactory sSLSocketFactory, C0326il c0326il, int i, boolean z, long j, long j2, int i2, int i3, u90 u90Var) {
        this.f3316j = jg0Var;
        this.f3317k = (Executor) r71.m4273a((q71) jg0Var.f3922k);
        this.f3318l = jg0Var2;
        this.f3319m = (ScheduledExecutorService) r71.m4273a((q71) jg0Var2.f3922k);
        this.f3321o = sSLSocketFactory;
        this.f3322p = c0326il;
        this.f3323q = i;
        this.f3324r = z;
        this.f3325s = new C0720t8(j);
        this.f3326t = j2;
        this.f3327u = i2;
        this.f3328v = i3;
        a90.m127k(u90Var, "transportTracerFactory");
        this.f3320n = u90Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f3329w) {
            return;
        }
        this.f3329w = true;
        r71.m4274b((q71) this.f3316j.f3922k, this.f3317k);
        r71.m4274b((q71) this.f3318l.f3922k, this.f3319m);
    }

    @Override // p000.InterfaceC0729th
    /* JADX INFO: renamed from: n */
    public final InterfaceC0215fl mo179n(SocketAddress socketAddress, C0692sh c0692sh, we0 we0Var) {
        if (this.f3329w) {
            C0270h1.m2191g("The transport factory is closed.");
            return null;
        }
        C0720t8 c0720t8 = this.f3325s;
        long j = c0720t8.f7342b.get();
        ot0 ot0Var = new ot0(this, (InetSocketAddress) socketAddress, c0692sh.f7116a, c0692sh.f7117b, c0692sh.f7118c, new RunnableC0897y0(17, new C0683s8(c0720t8, j)));
        if (this.f3324r) {
            ot0Var.f5876G = true;
            ot0Var.f5877H = j;
            ot0Var.f5878I = this.f3326t;
        }
        return ot0Var;
    }
}
