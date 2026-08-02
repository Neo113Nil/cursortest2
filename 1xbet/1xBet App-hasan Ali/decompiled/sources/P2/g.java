package P2;

import A0.J0;
import P.W;
import Q2.C0379q;
import Q2.r;
import T2.L;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Looper;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.A7;
import com.google.android.gms.internal.ads.AbstractC0613Id;
import com.google.android.gms.internal.ads.AbstractC1400ot;
import com.google.android.gms.internal.ads.B5;
import com.google.android.gms.internal.ads.C0819bt;
import com.google.android.gms.internal.ads.C1591t4;
import com.google.android.gms.internal.ads.C1636u4;
import com.google.android.gms.internal.ads.C1771x4;
import com.google.android.gms.internal.ads.C1816y4;
import com.google.android.gms.internal.ads.C1894zt;
import com.google.android.gms.internal.ads.D4;
import com.google.android.gms.internal.ads.D7;
import com.google.android.gms.internal.ads.F7;
import com.google.android.gms.internal.ads.L4;
import com.google.android.gms.internal.ads.N4;
import com.google.android.gms.internal.ads.O4;
import com.google.android.gms.internal.ads.RunnableFutureC0823bx;
import com.google.android.gms.internal.ads.U3;
import com.google.android.gms.internal.ads.V3;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class g implements Runnable, N4 {

    /* renamed from: n, reason: collision with root package name */
    public boolean f4730n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f4731o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f4732p;

    /* renamed from: q, reason: collision with root package name */
    public final ExecutorService f4733q;

    /* renamed from: r, reason: collision with root package name */
    public final W f4734r;

    /* renamed from: s, reason: collision with root package name */
    public Context f4735s;

    /* renamed from: t, reason: collision with root package name */
    public final Context f4736t;

    /* renamed from: u, reason: collision with root package name */
    public U2.a f4737u;

    /* renamed from: v, reason: collision with root package name */
    public final U2.a f4738v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f4739w;

    /* renamed from: y, reason: collision with root package name */
    public int f4741y;

    /* renamed from: k, reason: collision with root package name */
    public final Vector f4727k = new Vector();

    /* renamed from: l, reason: collision with root package name */
    public final AtomicReference f4728l = new AtomicReference();

    /* renamed from: m, reason: collision with root package name */
    public final AtomicReference f4729m = new AtomicReference();

    /* renamed from: x, reason: collision with root package name */
    public final CountDownLatch f4740x = new CountDownLatch(1);

    public g(Context context, U2.a aVar) {
        this.f4735s = context;
        this.f4736t = context;
        this.f4737u = aVar;
        this.f4738v = aVar;
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        this.f4733q = newCachedThreadPool;
        A7 a7 = F7.f8880p2;
        r rVar = r.f5053d;
        boolean booleanValue = ((Boolean) rVar.f5056c.a(a7)).booleanValue();
        this.f4739w = booleanValue;
        this.f4734r = W.f(context, newCachedThreadPool, booleanValue);
        A7 a72 = F7.f8862m2;
        D7 d7 = rVar.f5056c;
        this.f4731o = ((Boolean) d7.a(a72)).booleanValue();
        this.f4732p = ((Boolean) d7.a(F7.f8886q2)).booleanValue();
        if (((Boolean) d7.a(F7.f8874o2)).booleanValue()) {
            this.f4741y = 2;
        } else {
            this.f4741y = 1;
        }
        if (!((Boolean) d7.a(F7.f8892r3)).booleanValue()) {
            this.f4730n = k();
        }
        if (((Boolean) d7.a(F7.f8857l3)).booleanValue()) {
            AbstractC0613Id.f9539a.execute(this);
            return;
        }
        U2.e eVar = C0379q.f.f5048a;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            AbstractC0613Id.f9539a.execute(this);
        } else {
            run();
        }
    }

    public static final L4 p(Context context, U2.a aVar, boolean z3, boolean z5) {
        L4 m5;
        U3 w5 = V3.w();
        w5.e();
        V3.A((V3) w5.f10141l, z3);
        String str = aVar.f5852k;
        w5.e();
        V3.B((V3) w5.f10141l, str);
        V3 v32 = (V3) w5.b();
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        synchronized (L4.class) {
            C0819bt c0819bt = new C0819bt();
            c0819bt.f12920b = false;
            byte b3 = (byte) (c0819bt.f | 1);
            c0819bt.f12921c = true;
            c0819bt.f12922d = 100L;
            c0819bt.f12923e = 300L;
            c0819bt.f = (byte) (((byte) (((byte) (((byte) (((byte) (b3 | 2)) | 4)) | 8)) | 16)) | 32);
            String z6 = v32.z();
            if (z6 == null) {
                throw new NullPointerException("Null clientVersion");
            }
            c0819bt.f12919a = z6;
            c0819bt.f12920b = v32.C();
            c0819bt.f = (byte) (c0819bt.f | 1);
            m5 = L4.m(context, Executors.newCachedThreadPool(), c0819bt.a(), z5);
        }
        return m5;
    }

    @Override // com.google.android.gms.internal.ads.N4
    public final void a(MotionEvent motionEvent) {
        N4 m5 = m();
        if (m5 == null) {
            this.f4727k.add(new Object[]{motionEvent});
        } else {
            n();
            m5.a(motionEvent);
        }
    }

    @Override // com.google.android.gms.internal.ads.N4
    public final void b(View view) {
        N4 m5 = m();
        if (m5 != null) {
            m5.b(view);
        }
    }

    @Override // com.google.android.gms.internal.ads.N4
    public final String c(Context context) {
        return j(context);
    }

    @Override // com.google.android.gms.internal.ads.N4
    public final void d(StackTraceElement[] stackTraceElementArr) {
        N4 m5;
        N4 m6;
        if (((Boolean) r.f5053d.f5056c.a(F7.f8718L2)).booleanValue()) {
            if (this.f4740x.getCount() != 0 || (m6 = m()) == null) {
                return;
            }
            m6.d(stackTraceElementArr);
            return;
        }
        if (!l() || (m5 = m()) == null) {
            return;
        }
        m5.d(stackTraceElementArr);
    }

    @Override // com.google.android.gms.internal.ads.N4
    public final String e(Context context, View view, Activity activity) {
        A7 a7 = F7.ja;
        r rVar = r.f5053d;
        boolean booleanValue = ((Boolean) rVar.f5056c.a(a7)).booleanValue();
        D7 d7 = rVar.f5056c;
        if (!booleanValue) {
            N4 m5 = m();
            if (((Boolean) d7.a(F7.ka)).booleanValue()) {
                L l5 = o.f4767B.f4771c;
                L.i(view, 2);
            }
            return m5 != null ? m5.e(context, view, activity) : "";
        }
        if (!l()) {
            return "";
        }
        N4 m6 = m();
        if (((Boolean) d7.a(F7.ka)).booleanValue()) {
            L l6 = o.f4767B.f4771c;
            L.i(view, 2);
        }
        return m6 != null ? m6.e(context, view, activity) : "";
    }

    @Override // com.google.android.gms.internal.ads.N4
    public final String f(Context context) {
        RunnableFutureC0823bx runnableFutureC0823bx = new RunnableFutureC0823bx(new e(0, this, context));
        this.f4733q.execute(runnableFutureC0823bx);
        try {
            return (String) runnableFutureC0823bx.get(((Integer) r.f5053d.f5056c.a(F7.f8691G2)).intValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException unused) {
            return Integer.toString(17);
        } catch (TimeoutException unused2) {
            String str = this.f4738v.f5852k;
            try {
                C1591t4 w5 = C1636u4.w();
                w5.e();
                C1636u4.y((C1636u4) w5.f10141l, str);
                w5.e();
                C1636u4.x((C1636u4) w5.f10141l);
                String packageName = context.getPackageName();
                w5.e();
                C1636u4.z((C1636u4) w5.f10141l, packageName);
                long currentTimeMillis = System.currentTimeMillis() / 1000;
                w5.e();
                C1636u4.A((C1636u4) w5.f10141l, currentTimeMillis);
                try {
                    long j5 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
                    w5.e();
                    C1636u4.B((C1636u4) w5.f10141l, j5);
                } catch (PackageManager.NameNotFoundException unused3) {
                    w5.e();
                    C1636u4.B((C1636u4) w5.f10141l, -1L);
                }
                C1771x4 a5 = D4.a(null, ((C1636u4) w5.b()).d());
                a5.e();
                C1816y4.A((C1816y4) a5.f10141l);
                a5.e();
                C1816y4.z((C1816y4) a5.f10141l, 2);
                return Base64.encodeToString(((C1816y4) a5.b()).d(), 11);
            } catch (UnsupportedEncodingException | GeneralSecurityException unused4) {
                return Integer.toString(7);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.N4
    public final String g(Context context, String str, View view) {
        return h(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.N4
    public final String h(Context context, String str, View view, Activity activity) {
        if (!l()) {
            return "";
        }
        N4 m5 = m();
        if (((Boolean) r.f5053d.f5056c.a(F7.ka)).booleanValue()) {
            L l5 = o.f4767B.f4771c;
            L.i(view, 4);
        }
        if (m5 == null) {
            return "";
        }
        n();
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return m5.h(context, str, view, activity);
    }

    @Override // com.google.android.gms.internal.ads.N4
    public final void i(int i, int i5, int i6) {
        N4 m5 = m();
        if (m5 == null) {
            this.f4727k.add(new Object[]{Integer.valueOf(i), Integer.valueOf(i5), Integer.valueOf(i6)});
        } else {
            n();
            m5.i(i, i5, i6);
        }
    }

    public final String j(Context context) {
        N4 m5;
        if (!l() || (m5 = m()) == null) {
            return "";
        }
        n();
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return m5.c(context);
    }

    public final boolean k() {
        Context context = this.f4735s;
        J0 j02 = new J0(this);
        C1894zt c1894zt = new C1894zt(context, AbstractC1400ot.u(context, this.f4734r), j02, ((Boolean) r.f5053d.f5056c.a(F7.f8868n2)).booleanValue());
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (C1894zt.f16781p) {
            try {
                B5 g5 = c1894zt.g(1);
                if (g5 == null) {
                    c1894zt.f(4025, currentTimeMillis);
                    return false;
                }
                File d5 = c1894zt.d(g5.E());
                if (!new File(d5, "pcam.jar").exists()) {
                    c1894zt.f(4026, currentTimeMillis);
                    return false;
                }
                if (new File(d5, "pcbc").exists()) {
                    c1894zt.f(5019, currentTimeMillis);
                    return true;
                }
                c1894zt.f(4027, currentTimeMillis);
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean l() {
        try {
            this.f4740x.await();
            return true;
        } catch (InterruptedException e3) {
            U2.j.j("Interrupted during GADSignals creation.", e3);
            return false;
        }
    }

    public final N4 m() {
        return ((!this.f4731o || this.f4730n) ? this.f4741y : 1) == 2 ? (N4) this.f4729m.get() : (N4) this.f4728l.get();
    }

    public final void n() {
        Vector vector = this.f4727k;
        N4 m5 = m();
        if (vector.isEmpty() || m5 == null) {
            return;
        }
        Iterator it = vector.iterator();
        while (it.hasNext()) {
            Object[] objArr = (Object[]) it.next();
            int length = objArr.length;
            if (length == 1) {
                m5.a((MotionEvent) objArr[0]);
            } else if (length == 3) {
                m5.i(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue());
            }
        }
        vector.clear();
    }

    public final void o(boolean z3) {
        String str = this.f4737u.f5852k;
        Context context = this.f4735s;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        U3 w5 = V3.w();
        w5.e();
        V3.A((V3) w5.f10141l, z3);
        w5.e();
        V3.B((V3) w5.f10141l, str);
        this.f4728l.set(O4.v(context, new D3.l((V3) w5.b())));
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z3;
        try {
            A7 a7 = F7.f8892r3;
            r rVar = r.f5053d;
            if (((Boolean) rVar.f5056c.a(a7)).booleanValue()) {
                this.f4730n = k();
            }
            boolean z5 = this.f4737u.f5855n;
            boolean z6 = false;
            if (!((Boolean) rVar.f5056c.a(F7.f8777W0)).booleanValue() && z5) {
                z6 = true;
            }
            if (((!this.f4731o || this.f4730n) ? this.f4741y : 1) == 1) {
                o(z6);
                if (this.f4741y == 2) {
                    this.f4733q.execute(new f(0, this, z6));
                }
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                try {
                    L4 p5 = p(this.f4735s, this.f4737u, z6, this.f4739w);
                    this.f4729m.set(p5);
                    if (this.f4732p) {
                        synchronized (p5) {
                            z3 = p5.f10322z;
                        }
                        if (!z3) {
                            this.f4741y = 1;
                            o(z6);
                        }
                    }
                } catch (NullPointerException e3) {
                    this.f4741y = 1;
                    o(z6);
                    this.f4734r.g(2031, System.currentTimeMillis() - currentTimeMillis, e3);
                }
            }
            this.f4740x.countDown();
            this.f4735s = null;
            this.f4737u = null;
        } catch (Throwable th) {
            this.f4740x.countDown();
            this.f4735s = null;
            this.f4737u = null;
            throw th;
        }
    }
}
