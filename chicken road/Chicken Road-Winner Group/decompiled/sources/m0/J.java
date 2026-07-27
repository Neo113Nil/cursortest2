package m0;

import I1.AbstractActivityC0027d;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import com.google.android.gms.internal.play_billing.A0;
import com.google.android.gms.internal.play_billing.AbstractC0181d1;
import com.google.android.gms.internal.play_billing.AbstractC0213o0;
import com.google.android.gms.internal.play_billing.B0;
import com.google.android.gms.internal.play_billing.C0217p1;
import com.google.android.gms.internal.play_billing.C0230u0;
import com.google.android.gms.internal.play_billing.E0;
import com.google.android.gms.internal.play_billing.EnumC0221r0;
import com.google.android.gms.internal.play_billing.F0;
import com.google.android.gms.internal.play_billing.H0;
import com.google.android.gms.internal.play_billing.InterfaceC0191h;
import com.google.android.gms.internal.play_billing.InterfaceExecutorServiceC0245z0;
import com.google.android.gms.internal.play_billing.InterfaceFutureC0242y0;
import com.google.android.gms.internal.play_billing.Q1;
import com.google.android.gms.internal.play_billing.RunnableC0227t0;
import com.google.android.gms.internal.play_billing.S1;
import com.google.android.gms.internal.play_billing.r2;
import com.google.android.gms.internal.play_billing.s2;
import com.google.android.gms.internal.play_billing.t2;
import com.google.android.gms.internal.play_billing.u2;
import com.google.android.gms.internal.play_billing.v2;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.Consumer;

/* loaded from: classes.dex */
public final class J extends C1116d {

    /* renamed from: F, reason: collision with root package name */
    public final Context f9956F;

    /* renamed from: G, reason: collision with root package name */
    public volatile int f9957G;

    /* renamed from: H, reason: collision with root package name */
    public volatile InterfaceC0191h f9958H;

    /* renamed from: I, reason: collision with root package name */
    public volatile I f9959I;

    /* renamed from: J, reason: collision with root package name */
    public volatile A0 f9960J;

    public J(Context context) {
        super(context);
        this.f9957G = 0;
        this.f9956F = context;
    }

    public final /* synthetic */ void L(B2.v vVar, F1.b bVar) {
        super.e(vVar, bVar);
    }

    public final /* synthetic */ void M(F1.b bVar, C1121i c1121i) {
        super.f(bVar, c1121i);
    }

    public final /* synthetic */ void N(b0.j jVar, InterfaceC1127o interfaceC1127o) {
        super.c(jVar, interfaceC1127o);
    }

    public final synchronized boolean O() {
        if (this.f9957G == 2 && this.f9958H != null) {
            if (this.f9959I != null) {
                return true;
            }
        }
        return false;
    }

    public final InterfaceFutureC0242y0 P(int i3) {
        if (!O()) {
            AbstractC0213o0.g("BillingClientTesting", "Billing Override Service is not ready.");
            Q(106, 28, O.a(-1, "Billing Override Service connection is disconnected."));
            return new C0230u0();
        }
        E e3 = new E(i3, this);
        s2 s2Var = new s2();
        s2Var.f2819c = new v2();
        u2 u2Var = new u2(s2Var);
        s2Var.f2818b = u2Var;
        s2Var.f2817a = E.class;
        try {
            e3.a(s2Var);
            s2Var.f2817a = "billingOverrideService.getBillingOverride";
            return u2Var;
        } catch (Exception e4) {
            C0217p1 c0217p1 = new C0217p1(e4);
            AbstractC0181d1 abstractC0181d1 = r2.f;
            t2 t2Var = u2Var.f2833b;
            if (abstractC0181d1.v(t2Var, null, c0217p1)) {
                r2.c(t2Var);
            }
            return u2Var;
        }
    }

    public final void Q(int i3, int i4, C1120h c1120h) {
        Q1 b3 = M.b(i3, i4, c1120h);
        Objects.requireNonNull(b3, "ApiFailure should not be null");
        this.f10022g.v(b3);
    }

    public final void R(int i3, Consumer consumer, Runnable runnable) {
        A0 a02;
        InterfaceExecutorServiceC0245z0 interfaceExecutorServiceC0245z0;
        InterfaceExecutorServiceC0245z0 e02;
        InterfaceFutureC0242y0 P2 = P(i3);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        synchronized (this) {
            try {
                if (this.f9960J == null) {
                    ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
                    this.f9960J = newSingleThreadScheduledExecutor instanceof A0 ? (A0) newSingleThreadScheduledExecutor : new E0(newSingleThreadScheduledExecutor);
                }
                a02 = this.f9960J;
            } finally {
            }
        }
        if (!P2.isDone()) {
            H0 h02 = new H0();
            h02.f2629h = P2;
            F0 f0 = new F0();
            f0.f2623a = h02;
            h02.f2630i = ((E0) a02).schedule(f0, 28500L, timeUnit);
            P2.a(f0, EnumC0221r0.f2804a);
            P2 = h02;
        }
        F f = new F(this, i3, consumer, runnable);
        synchronized (this) {
            try {
                if (this.f10015D == null) {
                    ExecutorService q3 = q();
                    if (q3 instanceof InterfaceExecutorServiceC0245z0) {
                        e02 = (InterfaceExecutorServiceC0245z0) q3;
                    } else {
                        e02 = q3 instanceof ScheduledExecutorService ? new E0((ScheduledExecutorService) q3) : new B0(q3);
                    }
                    this.f10015D = e02;
                }
                interfaceExecutorServiceC0245z0 = this.f10015D;
            } finally {
            }
        }
        P2.a(new RunnableC0227t0(P2, f), interfaceExecutorServiceC0245z0);
    }

    @Override // m0.C1116d, m0.AbstractC1115c
    public final void a() {
        synchronized (this) {
            S1 d3 = M.d(27);
            Objects.requireNonNull(d3, "ApiSuccess should not be null");
            this.f10022g.x(d3);
            try {
                try {
                    if (this.f9959I != null && this.f9958H != null) {
                        AbstractC0213o0.f("BillingClientTesting", "Unbinding from Billing Override Service.");
                        this.f9956F.unbindService(this.f9959I);
                        this.f9959I = new I(this);
                    }
                    this.f9958H = null;
                    if (this.f9960J != null) {
                        ((B0) this.f9960J).shutdownNow();
                        this.f9960J = null;
                    }
                } catch (RuntimeException e3) {
                    AbstractC0213o0.h("BillingClientTesting", "There was an exception while ending Billing Override Service connection!", e3);
                }
                this.f9957G = 3;
            } catch (Throwable th) {
                this.f9957G = 3;
                throw th;
            }
        }
        super.a();
    }

    @Override // m0.C1116d, m0.AbstractC1115c
    public final void c(b0.j jVar, InterfaceC1127o interfaceC1127o) {
        R(7, new D(0, interfaceC1127o), new A.m(this, jVar, interfaceC1127o, 1));
    }

    @Override // m0.C1116d
    public final void e(B2.v vVar, F1.b bVar) {
        R(3, new D(2, bVar), new A.m(this, vVar, bVar, 3));
    }

    @Override // m0.C1116d
    public final void f(F1.b bVar, C1121i c1121i) {
        R(4, new D(bVar, c1121i), new A.m(this, c1121i, bVar, 2));
    }

    @Override // m0.C1116d
    public final C1120h j(AbstractActivityC0027d abstractActivityC0027d, R0.n nVar) {
        int i3 = 0;
        try {
            i3 = ((Integer) P(2).get(28500L, TimeUnit.MILLISECONDS)).intValue();
        } catch (TimeoutException e3) {
            Q(114, 28, O.f9967E);
            AbstractC0213o0.h("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", e3);
        } catch (Exception e4) {
            if (e4 instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            Q(107, 28, O.f9967E);
            AbstractC0213o0.h("BillingClientTesting", "An error occurred while retrieving billing override.", e4);
        }
        if (i3 > 0) {
            C1120h a3 = O.a(i3, "Billing override value was set by a license tester.");
            Q(105, 2, a3);
            K(a3);
            return a3;
        }
        try {
            return super.j(abstractActivityC0027d, nVar);
        } catch (Exception e5) {
            C1120h c1120h = O.f9975i;
            Q(115, 2, c1120h);
            AbstractC0213o0.h("BillingClientTesting", "An internal error occurred.", e5);
            return c1120h;
        }
    }

    @Override // m0.C1116d
    public final void l(InterfaceC1117e interfaceC1117e) {
        synchronized (this) {
            if (O()) {
                AbstractC0213o0.f("BillingClientTesting", "Billing Override Service connection is valid. No need to re-initialize.");
                S1 d3 = M.d(26);
                Objects.requireNonNull(d3, "ApiSuccess should not be null");
                this.f10022g.x(d3);
            } else {
                int i3 = 1;
                if (this.f9957G == 1) {
                    AbstractC0213o0.g("BillingClientTesting", "Client is already in the process of connecting to Billing Override Service.");
                } else if (this.f9957G == 3) {
                    AbstractC0213o0.g("BillingClientTesting", "Billing Override Service Client was already closed and can't be reused. Please create another instance.");
                    Q(38, 26, O.a(-1, "Billing Override Service connection is disconnected."));
                } else {
                    this.f9957G = 1;
                    AbstractC0213o0.f("BillingClientTesting", "Starting Billing Override Service setup.");
                    this.f9959I = new I(this);
                    Intent intent = new Intent("com.google.android.apps.play.billingtestcompanion.BillingOverrideService.BIND");
                    intent.setPackage("com.google.android.apps.play.billingtestcompanion");
                    List<ResolveInfo> queryIntentServices = this.f9956F.getPackageManager().queryIntentServices(intent, 0);
                    if (queryIntentServices == null || queryIntentServices.isEmpty()) {
                        i3 = 41;
                    } else {
                        ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
                        if (serviceInfo != null) {
                            String str = serviceInfo.packageName;
                            String str2 = serviceInfo.name;
                            if (!Objects.equals(str, "com.google.android.apps.play.billingtestcompanion") || str2 == null) {
                                AbstractC0213o0.g("BillingClientTesting", "The device doesn't have valid Play Billing Lab.");
                            } else {
                                ComponentName componentName = new ComponentName(str, str2);
                                Intent intent2 = new Intent(intent);
                                intent2.setComponent(componentName);
                                if (this.f9956F.bindService(intent2, this.f9959I, 1)) {
                                    AbstractC0213o0.f("BillingClientTesting", "Billing Override Service was bonded successfully.");
                                } else {
                                    AbstractC0213o0.g("BillingClientTesting", "Connection to Billing Override Service is blocked.");
                                }
                            }
                            i3 = 39;
                        }
                    }
                    this.f9957G = 0;
                    AbstractC0213o0.f("BillingClientTesting", "Billing Override Service unavailable on device.");
                    Q(i3, 26, O.a(2, "Billing Override Service unavailable on device."));
                }
            }
        }
        super.l(interfaceC1117e);
    }

    public J(C1122j c1122j, Context context) {
        super(c1122j, context);
        this.f9957G = 0;
        this.f9956F = context;
    }

    public J(C1122j c1122j, Context context, r rVar) {
        super(c1122j, context, rVar);
        this.f9957G = 0;
        this.f9956F = context;
    }

    public J(C1122j c1122j, Context context, r rVar, G0.j jVar) {
        super(c1122j, context, rVar, jVar);
        this.f9957G = 0;
        this.f9956F = context;
    }
}
