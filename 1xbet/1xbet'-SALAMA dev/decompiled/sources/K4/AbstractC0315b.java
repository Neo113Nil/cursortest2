package K4;

import C0.C0083b;
import C0.RunnableC0085d;
import F2.C0247p;
import U5.AbstractC0439f;
import U5.k0;
import U5.l0;
import com.google.android.gms.tasks.Task;
import com.google.protobuf.AbstractC0847a;
import java.net.ConnectException;
import java.net.UnknownHostException;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLHandshakeException;
import p155w1.C1017n0;

/* JADX INFO: renamed from: K4.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0315b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final long f3991m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final long f3992n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final long f3993o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final long f3994p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final long f3995q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C1017n0 f3996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C1017n0 f3997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f3998c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final H2.r f3999d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final L4.f f4001f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final L4.e f4002g;
    public p j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final L4.m f4005k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final y f4006l;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public x f4003h = x.f4072a;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f4004i = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final RunnableC0085d f4000e = new RunnableC0085d(this, 11);

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f3991m = timeUnit.toMillis(1L);
        TimeUnit timeUnit2 = TimeUnit.MINUTES;
        f3992n = timeUnit2.toMillis(1L);
        f3993o = timeUnit2.toMillis(1L);
        f3994p = timeUnit.toMillis(10L);
        f3995q = timeUnit.toMillis(10L);
    }

    public AbstractC0315b(r rVar, H2.r rVar2, L4.f fVar, L4.e eVar, L4.e eVar2, y yVar) {
        this.f3998c = rVar;
        this.f3999d = rVar2;
        this.f4001f = fVar;
        this.f4002g = eVar2;
        this.f4006l = yVar;
        this.f4005k = new L4.m(fVar, eVar, f3991m, f3992n);
    }

    public final void a(x xVar, l0 l0Var) {
        p113p3.f.O("Only started streams should be closed.", d(), new Object[0]);
        x xVar2 = x.f4076e;
        p113p3.f.O("Can't provide an error when not in an error state.", xVar == xVar2 || l0Var.e(), new Object[0]);
        this.f4001f.d();
        HashSet hashSet = j.f4023d;
        k0 k0Var = l0Var.f6547a;
        Throwable th = l0Var.f6549c;
        if (th instanceof SSLHandshakeException) {
            th.getMessage().contains("no ciphers available");
        }
        C1017n0 c1017n0 = this.f3997b;
        if (c1017n0 != null) {
            c1017n0.f();
            this.f3997b = null;
        }
        C1017n0 c1017n1 = this.f3996a;
        if (c1017n1 != null) {
            c1017n1.f();
            this.f3996a = null;
        }
        L4.m mVar = this.f4005k;
        C1017n0 c1017n2 = mVar.f4386h;
        if (c1017n2 != null) {
            c1017n2.f();
            mVar.f4386h = null;
        }
        this.f4004i++;
        k0 k0Var2 = k0.OK;
        k0 k0Var3 = l0Var.f6547a;
        if (k0Var3 == k0Var2) {
            mVar.f4384f = 0L;
        } else if (k0Var3 == k0.RESOURCE_EXHAUSTED) {
            Q0.a.v(1, getClass().getSimpleName(), "(%x) Using maximum backoff delay to prevent overloading the backend.", Integer.valueOf(System.identityHashCode(this)));
            mVar.f4384f = mVar.f4383e;
        } else if (k0Var3 == k0.UNAUTHENTICATED && this.f4003h != x.f4075d) {
            r rVar = this.f3998c;
            rVar.f4054b.a0();
            rVar.f4055c.Z();
        } else if (k0Var3 == k0.UNAVAILABLE && ((th instanceof UnknownHostException) || (th instanceof ConnectException))) {
            mVar.f4383e = f3995q;
        }
        if (xVar != xVar2) {
            Q0.a.v(1, getClass().getSimpleName(), "(%x) Performing stream teardown", Integer.valueOf(System.identityHashCode(this)));
            h();
        }
        if (this.j != null) {
            if (l0Var.e()) {
                Q0.a.v(1, getClass().getSimpleName(), "(%x) Closing stream client-side", Integer.valueOf(System.identityHashCode(this)));
                this.j.b();
            }
            this.j = null;
        }
        this.f4003h = xVar;
        this.f4006l.b(l0Var);
    }

    public final void b() {
        p113p3.f.O("Can only inhibit backoff after in a stopped state", !d(), new Object[0]);
        this.f4001f.d();
        this.f4003h = x.f4072a;
        this.f4005k.f4384f = 0L;
    }

    public final boolean c() {
        this.f4001f.d();
        x xVar = this.f4003h;
        return xVar == x.f4074c || xVar == x.f4075d;
    }

    public final boolean d() {
        this.f4001f.d();
        x xVar = this.f4003h;
        return xVar == x.f4073b || xVar == x.f4077f || c();
    }

    public abstract void e(AbstractC0847a abstractC0847a);

    public abstract void f(AbstractC0847a abstractC0847a);

    public void g() {
        this.f4001f.d();
        p113p3.f.O("Last call still set", this.j == null, new Object[0]);
        p113p3.f.O("Idle timer still set", this.f3997b == null, new Object[0]);
        x xVar = this.f4003h;
        x xVar2 = x.f4076e;
        if (xVar == xVar2) {
            p113p3.f.O("Should only perform backoff in an error state", xVar == xVar2, new Object[0]);
            this.f4003h = x.f4077f;
            this.f4005k.a(new RunnableC0314a(this, 0));
            return;
        }
        p113p3.f.O("Already started", xVar == x.f4072a, new Object[0]);
        B1.m mVar = new B1.m(this, new C0083b(this, this.f4004i, 5));
        AbstractC0439f[] abstractC0439fArr = {null};
        r rVar = this.f3998c;
        C0247p c0247p = rVar.f4056d;
        Task taskContinueWithTask = ((Task) c0247p.f2706a).continueWithTask(((L4.f) c0247p.f2707b).f4359a, new B1.c(12, c0247p, this.f3999d));
        taskContinueWithTask.addOnCompleteListener(rVar.f4053a.f4359a, new l(rVar, abstractC0439fArr, mVar, 1));
        this.j = new p(rVar, abstractC0439fArr, taskContinueWithTask);
        this.f4003h = x.f4073b;
    }

    public final void i(com.google.protobuf.C c3) {
        this.f4001f.d();
        Q0.a.v(1, getClass().getSimpleName(), "(%x) Stream sending: %s", Integer.valueOf(System.identityHashCode(this)), c3);
        C1017n0 c1017n0 = this.f3997b;
        if (c1017n0 != null) {
            c1017n0.f();
            this.f3997b = null;
        }
        this.j.d(c3);
    }

    public void h() {
    }
}
