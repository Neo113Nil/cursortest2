package m0;

import I1.AbstractActivityC0027d;
import Y1.C0081e;
import a0.C0087a;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.android.billingclient.BuildConfig;
import com.android.billingclient.api.ProxyBillingActivity;
import com.google.android.gms.internal.play_billing.AbstractC0181d1;
import com.google.android.gms.internal.play_billing.AbstractC0213o0;
import com.google.android.gms.internal.play_billing.AbstractC0215p;
import com.google.android.gms.internal.play_billing.C0173b;
import com.google.android.gms.internal.play_billing.C0244z;
import com.google.android.gms.internal.play_billing.InterfaceC0179d;
import com.google.android.gms.internal.play_billing.InterfaceExecutorServiceC0245z0;
import com.google.android.gms.internal.play_billing.N0;
import com.google.android.gms.internal.play_billing.O0;
import com.google.android.gms.internal.play_billing.P1;
import com.google.android.gms.internal.play_billing.Q1;
import com.google.android.gms.internal.play_billing.R1;
import com.google.android.gms.internal.play_billing.S1;
import com.google.android.gms.internal.play_billing.T1;
import com.google.android.gms.internal.play_billing.U1;
import com.google.android.gms.internal.play_billing.Z1;
import com.google.android.gms.internal.play_billing.a2;
import com.google.android.gms.internal.play_billing.c2;
import com.google.android.gms.internal.play_billing.e2;
import com.google.android.gms.internal.play_billing.n2;
import com.google.android.gms.internal.play_billing.o2;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.Function;
import java.util.function.Predicate;
import m0.C1118f;
import m0.C1126n;

/* renamed from: m0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1116d extends AbstractC1115c {

    /* renamed from: A, reason: collision with root package name */
    public final C1122j f10012A;

    /* renamed from: B, reason: collision with root package name */
    public final boolean f10013B;

    /* renamed from: C, reason: collision with root package name */
    public ExecutorService f10014C;

    /* renamed from: D, reason: collision with root package name */
    public volatile InterfaceExecutorServiceC0245z0 f10015D;

    /* renamed from: E, reason: collision with root package name */
    public final Long f10016E;

    /* renamed from: a, reason: collision with root package name */
    public final Object f10017a;

    /* renamed from: b, reason: collision with root package name */
    public volatile int f10018b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10019c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f10020d;

    /* renamed from: e, reason: collision with root package name */
    public volatile Q f10021e;
    public final Context f;

    /* renamed from: g, reason: collision with root package name */
    public final V1.b f10022g;

    /* renamed from: h, reason: collision with root package name */
    public volatile InterfaceC0179d f10023h;

    /* renamed from: i, reason: collision with root package name */
    public volatile z f10024i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f10025j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f10026k;

    /* renamed from: l, reason: collision with root package name */
    public int f10027l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f10028m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f10029n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f10030o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f10031p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f10032q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f10033r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f10034s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f10035t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f10036u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f10037v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f10038w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f10039x;
    public boolean y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f10040z;

    public C1116d(Context context) {
        this.f10017a = new Object();
        this.f10018b = 0;
        this.f10020d = new Handler(Looper.getMainLooper());
        this.f10027l = 0;
        long nextLong = new Random().nextLong();
        this.f10016E = Long.valueOf(nextLong);
        String p3 = p();
        this.f10019c = p3;
        this.f = context.getApplicationContext();
        Z1 r3 = a2.r();
        r3.d();
        a2.q((a2) r3.f2752b, p3);
        String packageName = this.f.getPackageName();
        r3.d();
        a2.p((a2) r3.f2752b, packageName);
        r3.d();
        a2.o((a2) r3.f2752b, nextLong);
        this.f10022g = new V1.b(this.f, (a2) r3.b());
        this.f.getPackageName();
    }

    public static Future m(Callable callable, long j3, Runnable runnable, Handler handler, ExecutorService executorService) {
        try {
            Future submit = executorService.submit(callable);
            handler.postDelayed(new A.a(submit, 13, runnable), (long) (j3 * 0.95d));
            return submit;
        } catch (Exception e3) {
            AbstractC0213o0.h("BillingClient", "Async task throws exception!", e3);
            return null;
        }
    }

    public static String p() {
        try {
            return (String) Class.forName("com.android.billingclient.ktx.BuildConfig").getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            return BuildConfig.VERSION_NAME;
        }
    }

    public final void A(F1.b bVar, C1120h c1120h, int i3, Exception exc) {
        I(i3, 14, c1120h, M.a(exc));
        ((C0081e) bVar.f378b).a(F2.b.s(c1120h));
    }

    public final void B(F1.b bVar, C1120h c1120h, int i3, String str, Exception exc) {
        AbstractC0213o0.h("BillingClient", str, exc);
        I(i3, 4, c1120h, M.a(exc));
        ((C0081e) bVar.f378b).a(F2.b.s(c1120h));
    }

    public final void C(F1.b bVar, C1120h c1120h, int i3, Exception exc) {
        I(i3, 15, c1120h, M.a(exc));
        bVar.d(c1120h);
    }

    public final Handler D() {
        return Looper.myLooper() == null ? this.f10020d : new Handler(Looper.myLooper());
    }

    public final C1120h E() {
        AbstractC0213o0.f("BillingClient", "Service connection is valid. No need to re-initialize.");
        R1 q3 = S1.q();
        q3.d();
        S1.p((S1) q3.f2752b, 6);
        n2 o3 = o2.o();
        o3.d();
        o2.n((o2) o3.f2752b);
        q3.d();
        S1.o((S1) q3.f2752b, (o2) o3.b());
        s((S1) q3.b());
        return O.f9976j;
    }

    public final void F(F1.b bVar, C1120h c1120h, int i3, Exception exc) {
        AbstractC0213o0.h("BillingClient", "getBillingConfig got an exception.", exc);
        I(i3, 13, c1120h, M.a(exc));
        bVar.f(c1120h);
    }

    public final void G(F1.b bVar, C1120h c1120h, int i3, Exception exc) {
        I(i3, 16, c1120h, M.a(exc));
        ((C0081e) bVar.f378b).a(F2.b.s(c1120h));
    }

    public final void H(int i3, int i4, C1120h c1120h) {
        try {
            r(M.b(i3, i4, c1120h));
        } catch (Throwable th) {
            AbstractC0213o0.h("BillingClient", "Unable to log.", th);
        }
    }

    public final void I(int i3, int i4, C1120h c1120h, String str) {
        try {
            r(M.c(i3, i4, c1120h, str));
        } catch (Throwable th) {
            AbstractC0213o0.h("BillingClient", "Unable to log.", th);
        }
    }

    public final void J(int i3) {
        try {
            s(M.d(i3));
        } catch (Throwable th) {
            AbstractC0213o0.h("BillingClient", "Unable to log.", th);
        }
    }

    public final void K(C1120h c1120h) {
        if (Thread.interrupted()) {
            return;
        }
        this.f10020d.post(new A.a(this, 17, c1120h));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0038 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // m0.AbstractC1115c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a() {
        J(12);
        synchronized (this.f10017a) {
            try {
                try {
                    if (this.f10021e != null) {
                        Q q3 = this.f10021e;
                        P p3 = q3.f9999e;
                        Context context = q3.f9995a;
                        p3.b(context);
                        q3.f.b(context);
                    }
                } finally {
                    AbstractC0213o0.f("BillingClient", "Unbinding from service.");
                    u();
                    synchronized (this) {
                    }
                }
                synchronized (this) {
                    ExecutorService executorService = this.f10014C;
                    if (executorService != null) {
                        executorService.shutdownNow();
                        this.f10014C = null;
                        this.f10015D = null;
                    }
                }
            } finally {
                try {
                } finally {
                }
            }
            try {
                AbstractC0213o0.f("BillingClient", "Unbinding from service.");
                u();
            } catch (Throwable th) {
                AbstractC0213o0.h("BillingClient", "There was an exception while unbinding from the service while ending connection!", th);
            }
        }
    }

    @Override // m0.AbstractC1115c
    public final boolean b() {
        boolean z3;
        synchronized (this.f10017a) {
            try {
                z3 = false;
                if (this.f10018b == 2 && this.f10023h != null && this.f10024i != null) {
                    z3 = true;
                }
            } finally {
            }
        }
        return z3;
    }

    @Override // m0.AbstractC1115c
    public void c(b0.j jVar, InterfaceC1127o interfaceC1127o) {
        if (!b()) {
            C1120h c1120h = O.f9977k;
            H(2, 7, c1120h);
            interfaceC1127o.onProductDetailsResponse(c1120h, new ArrayList());
        } else {
            if (!this.f10035t) {
                AbstractC0213o0.g("BillingClient", "Querying product details is not supported.");
                C1120h c1120h2 = O.f9986t;
                H(20, 7, c1120h2);
                interfaceC1127o.onProductDetailsResponse(c1120h2, new ArrayList());
                return;
            }
            if (m(new u(this, jVar, interfaceC1127o, 1), 30000L, new A.a(this, 16, interfaceC1127o), D(), q()) == null) {
                C1120h n3 = n();
                H(25, 7, n3);
                interfaceC1127o.onProductDetailsResponse(n3, new ArrayList());
            }
        }
    }

    @Override // m0.AbstractC1115c
    public final void d(C1121i c1121i, InterfaceC1129q interfaceC1129q) {
        int i3 = 2;
        if (!b()) {
            C1120h c1120h = O.f9977k;
            H(2, 9, c1120h);
            C0244z c0244z = com.google.android.gms.internal.play_billing.C.f2606b;
            interfaceC1129q.onQueryPurchasesResponse(c1120h, com.google.android.gms.internal.play_billing.Q.f2666e);
            return;
        }
        String str = c1121i.f10048a;
        if (TextUtils.isEmpty(str)) {
            AbstractC0213o0.g("BillingClient", "Please provide a valid product type.");
            C1120h c1120h2 = O.f;
            H(50, 9, c1120h2);
            C0244z c0244z2 = com.google.android.gms.internal.play_billing.C.f2606b;
            interfaceC1129q.onQueryPurchasesResponse(c1120h2, com.google.android.gms.internal.play_billing.Q.f2666e);
            return;
        }
        if (m(new u(this, str, interfaceC1129q, i3), 30000L, new A.a(this, 11, interfaceC1129q), D(), q()) == null) {
            C1120h n3 = n();
            H(25, 9, n3);
            C0244z c0244z3 = com.google.android.gms.internal.play_billing.C.f2606b;
            interfaceC1129q.onQueryPurchasesResponse(n3, com.google.android.gms.internal.play_billing.Q.f2666e);
        }
    }

    public void e(B2.v vVar, F1.b bVar) {
        if (!b()) {
            C1120h c1120h = O.f9977k;
            H(2, 3, c1120h);
            bVar.c(c1120h);
            return;
        }
        if (TextUtils.isEmpty(vVar.f184b)) {
            AbstractC0213o0.g("BillingClient", "Please provide a valid purchase token.");
            C1120h c1120h2 = O.f9974h;
            H(26, 3, c1120h2);
            bVar.c(c1120h2);
            return;
        }
        if (!this.f10030o) {
            C1120h c1120h3 = O.f9969b;
            H(27, 3, c1120h3);
            bVar.c(c1120h3);
        } else if (m(new u(this, bVar, vVar, 5), 30000L, new A.a(this, 19, bVar), D(), q()) == null) {
            C1120h n3 = n();
            H(25, 3, n3);
            bVar.c(n3);
        }
    }

    public void f(F1.b bVar, C1121i c1121i) {
        boolean b3 = b();
        C0081e c0081e = (C0081e) bVar.f378b;
        if (!b3) {
            C1120h c1120h = O.f9977k;
            H(2, 4, c1120h);
            c0081e.a(F2.b.s(c1120h));
        } else if (m(new u(this, c1121i, bVar, 0), 30000L, new A.a(this, bVar, c1121i), D(), q()) == null) {
            C1120h n3 = n();
            H(25, 4, n3);
            c0081e.a(F2.b.s(n3));
        }
    }

    public final void g(F1.b bVar) {
        if (!b()) {
            C(bVar, O.f9977k, 2, null);
            return;
        }
        if (!this.f10039x) {
            AbstractC0213o0.g("BillingClient", "Current client doesn't support alternative billing only.");
            C(bVar, O.f9965C, 66, null);
        } else if (m(new N1.b(this, bVar, 3), 30000L, new A.a(this, 21, bVar), D(), q()) == null) {
            C(bVar, n(), 25, null);
        }
    }

    public final void h(F1.b bVar) {
        if (!b()) {
            AbstractC0213o0.g("BillingClient", "Service disconnected.");
            C1120h c1120h = O.f9977k;
            H(2, 13, c1120h);
            bVar.f(c1120h);
            return;
        }
        if (!this.f10036u) {
            AbstractC0213o0.g("BillingClient", "Current client doesn't support get billing config.");
            C1120h c1120h2 = O.y;
            H(32, 13, c1120h2);
            bVar.f(c1120h2);
            return;
        }
        if (m(new N1.b(this, bVar, 2), 30000L, new A.a(this, 20, bVar), D(), q()) == null) {
            C1120h n3 = n();
            H(25, 13, n3);
            bVar.f(n3);
        }
    }

    public final void i(F1.b bVar) {
        if (!b()) {
            A(bVar, O.f9977k, 2, null);
            return;
        }
        if (!this.f10039x) {
            AbstractC0213o0.g("BillingClient", "Current client doesn't support alternative billing only.");
            A(bVar, O.f9965C, 66, null);
        } else if (m(new N1.b(this, bVar, 1), 30000L, new A.a(this, 12, bVar), D(), q()) == null) {
            A(bVar, n(), 25, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a9, code lost:
    
        if (r29.f1222a == false) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0634  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x063b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0566  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0569  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1120h j(AbstractActivityC0027d abstractActivityC0027d, final R0.n nVar) {
        String str;
        String str2;
        String str3;
        String str4;
        C1120h a3;
        String str5;
        String str6;
        Future m3;
        Object obj;
        int m4;
        int i3;
        String string;
        String str7;
        boolean z3;
        String str8;
        String str9;
        C1118f c1118f;
        String str10;
        boolean z4;
        String str11;
        int i4;
        final int i5;
        final C1116d c1116d = this;
        if (c1116d.f10021e == null || c1116d.f10021e.f9996b == null) {
            C1120h c1120h = O.f9966D;
            c1116d.H(12, 2, c1120h);
            return c1120h;
        }
        if (!c1116d.b()) {
            C1120h c1120h2 = O.f9977k;
            c1116d.H(2, 2, c1120h2);
            c1116d.K(c1120h2);
            return c1120h2;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll((ArrayList) nVar.f);
        com.google.android.gms.internal.play_billing.C c3 = (com.google.android.gms.internal.play_billing.C) nVar.f1226e;
        Iterator it = arrayList.iterator();
        if ((it.hasNext() ? it.next() : null) != null) {
            throw new ClassCastException();
        }
        C0244z c0244z = (C0244z) c3.iterator();
        C1118f c1118f2 = (C1118f) (c0244z.hasNext() ? c0244z.next() : null);
        C1126n c1126n = c1118f2.f10041a;
        String str12 = c1126n.f10067c;
        String str13 = c1126n.f10068d;
        if (str13.equals("subs") && !c1116d.f10025j) {
            AbstractC0213o0.g("BillingClient", "Current client doesn't support subscriptions.");
            C1120h c1120h3 = O.f9979m;
            c1116d.H(9, 2, c1120h3);
            c1116d.K(c1120h3);
            return c1120h3;
        }
        if (((String) nVar.f1223b) == null && ((String) nVar.f1224c) == null) {
            C0087a c0087a = (C0087a) nVar.f1225d;
            c0087a.getClass();
            if (c0087a.f1781b == 0) {
                if (!((com.google.android.gms.internal.play_billing.C) nVar.f1226e).stream().anyMatch(new K())) {
                }
            }
        }
        if (!c1116d.f10028m) {
            AbstractC0213o0.g("BillingClient", "Current client doesn't support extra params for buy intent.");
            C1120h c1120h4 = O.f9973g;
            c1116d.H(18, 2, c1120h4);
            c1116d.K(c1120h4);
            return c1120h4;
        }
        if (arrayList.size() > 1 && !c1116d.f10034s) {
            AbstractC0213o0.g("BillingClient", "Current client doesn't support multi-item purchases.");
            C1120h c1120h5 = O.f9984r;
            c1116d.H(19, 2, c1120h5);
            c1116d.K(c1120h5);
            return c1120h5;
        }
        if (!c3.isEmpty() && !c1116d.f10035t) {
            AbstractC0213o0.g("BillingClient", "Current client doesn't support purchases with ProductDetails.");
            C1120h c1120h6 = O.f9986t;
            c1116d.H(20, 2, c1120h6);
            c1116d.K(c1120h6);
            return c1120h6;
        }
        if (((com.google.android.gms.internal.play_billing.C) nVar.f1226e).isEmpty()) {
            a3 = O.f9976j;
            str2 = str13;
            str4 = "BUY_INTENT";
            str3 = str12;
            str = null;
        } else {
            C1118f c1118f3 = (C1118f) ((com.google.android.gms.internal.play_billing.C) nVar.f1226e).get(0);
            int i6 = 1;
            while (true) {
                str = null;
                if (i6 < ((com.google.android.gms.internal.play_billing.C) nVar.f1226e).size()) {
                    C1118f c1118f4 = (C1118f) ((com.google.android.gms.internal.play_billing.C) nVar.f1226e).get(i6);
                    str2 = str13;
                    if (!c1118f4.f10041a.f10068d.equals(c1118f3.f10041a.f10068d) && !c1118f4.f10041a.f10068d.equals("play_pass_subs")) {
                        a3 = O.a(5, "All products should have same ProductType.");
                        str4 = "BUY_INTENT";
                        str3 = str12;
                        break;
                    }
                    i6++;
                    str13 = str2;
                } else {
                    str2 = str13;
                    String optString = c1118f3.f10041a.f10066b.optString("packageName");
                    HashSet hashSet = new HashSet();
                    HashSet hashSet2 = new HashSet();
                    str3 = str12;
                    com.google.android.gms.internal.play_billing.C c4 = (com.google.android.gms.internal.play_billing.C) nVar.f1226e;
                    int size = c4.size();
                    str4 = "BUY_INTENT";
                    int i7 = 0;
                    while (true) {
                        C1126n c1126n2 = c1118f3.f10041a;
                        C1118f c1118f5 = c1118f3;
                        if (i7 < size) {
                            int i8 = i7;
                            C1118f c1118f6 = (C1118f) c4.get(i7);
                            com.google.android.gms.internal.play_billing.C c5 = c4;
                            int i9 = size;
                            c1118f6.f10041a.f10068d.equals("subs");
                            C1126n c1126n3 = c1118f6.f10041a;
                            String str14 = c1126n3.f10067c;
                            if (!hashSet.contains(str14)) {
                                hashSet.add(str14);
                                if (!c1126n2.f10068d.equals("play_pass_subs") && !c1126n3.f10068d.equals("play_pass_subs") && !optString.equals(c1126n3.f10066b.optString("packageName"))) {
                                    a3 = O.a(5, "All products must have the same package name.");
                                    break;
                                }
                                i7 = i8 + 1;
                                c1118f3 = c1118f5;
                                c4 = c5;
                                size = i9;
                            } else {
                                a3 = O.a(5, "ProductId can not be duplicated. Invalid product id: " + str14 + ".");
                                break;
                            }
                        } else {
                            Iterator it2 = hashSet2.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    String str15 = (String) it2.next();
                                    if (hashSet.contains(str15)) {
                                        a3 = O.a(5, "OldProductId must not be one of the products to be purchased. Invalid old product id: " + str15 + ".");
                                        break;
                                    }
                                } else {
                                    C1123k a4 = c1126n2.a();
                                    a3 = (a4 == null || a4.f == null) ? O.f9976j : O.a(5, "Both autoPayDetails and autoPayBalanceThreshold is required for constructing ProductDetailsParams for autopay.");
                                }
                            }
                        }
                    }
                }
            }
        }
        if (a3 != O.f9976j) {
            c1116d.H(120, 2, a3);
            c1116d.K(a3);
            return a3;
        }
        if (c1116d.f10028m) {
            boolean z5 = c1116d.f10030o;
            boolean z6 = c1116d.f10037v;
            c1116d.f10012A.getClass();
            boolean z7 = c1116d.f10012A.f10049a;
            boolean z8 = c1116d.f10013B;
            String str16 = c1116d.f10019c;
            long longValue = c1116d.f10016E.longValue();
            final String packageName = c1116d.f.getPackageName();
            final Bundle bundle = new Bundle();
            AbstractC0213o0.b(bundle, str16, longValue);
            int i10 = ((C0087a) nVar.f1225d).f1781b;
            if (i10 != 0) {
                bundle.putInt("prorationMode", i10);
            }
            if (!TextUtils.isEmpty((String) nVar.f1223b)) {
                bundle.putString("accountId", (String) nVar.f1223b);
            }
            if (!TextUtils.isEmpty((String) nVar.f1224c)) {
                bundle.putString("obfuscatedProfileId", (String) nVar.f1224c);
            }
            if (!TextUtils.isEmpty(str)) {
                bundle.putStringArrayList("skusToReplace", new ArrayList<>(Arrays.asList(str)));
            }
            if (!TextUtils.isEmpty(((C0087a) nVar.f1225d).f1780a)) {
                bundle.putString("oldSkuPurchaseToken", ((C0087a) nVar.f1225d).f1780a);
            }
            if (TextUtils.isEmpty(str)) {
                str7 = str;
            } else {
                str7 = str;
                bundle.putString("oldSkuPurchaseId", str7);
            }
            ((C0087a) nVar.f1225d).getClass();
            if (!TextUtils.isEmpty(str7)) {
                ((C0087a) nVar.f1225d).getClass();
                bundle.putString("originalExternalTransactionId", str7);
            }
            if (!TextUtils.isEmpty(str7)) {
                bundle.putString("paymentsPurchaseParams", str7);
            }
            if (z5) {
                z3 = true;
                bundle.putBoolean("enablePendingPurchases", true);
            } else {
                z3 = true;
            }
            if (z6 && z7) {
                bundle.putBoolean("enablePendingPurchaseForSubscriptions", z3);
            }
            if (z8) {
                bundle.putBoolean("enableAlternativeBilling", z3);
            }
            final int i11 = 0;
            if (((com.google.android.gms.internal.play_billing.C) nVar.f1226e).stream().anyMatch(new Predicate() { // from class: com.google.android.gms.internal.play_billing.a
                @Override // java.util.function.Predicate
                public final boolean test(Object obj2) {
                    switch (i11) {
                        case 0:
                            int i12 = AbstractC0213o0.f2786a;
                            break;
                        default:
                            int i13 = AbstractC0213o0.f2786a;
                            break;
                    }
                    return false;
                }
            })) {
                N0 n3 = O0.n();
                final int i12 = 1;
                Iterable iterable = (Iterable) ((com.google.android.gms.internal.play_billing.C) nVar.f1226e).stream().filter(new Predicate() { // from class: com.google.android.gms.internal.play_billing.a
                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj2) {
                        switch (i12) {
                            case 0:
                                int i122 = AbstractC0213o0.f2786a;
                                break;
                            default:
                                int i13 = AbstractC0213o0.f2786a;
                                break;
                        }
                        return false;
                    }
                }).map(new Function() { // from class: com.google.android.gms.internal.play_billing.s
                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        int i13 = AbstractC0213o0.f2786a;
                        C1126n c1126n4 = ((C1118f) obj2).f10041a;
                        L0 n4 = M0.n();
                        P0 n5 = Q0.n();
                        String str17 = "subs:" + packageName + StringUtils.PROCESS_POSTFIX_DELIMITER + c1126n4.f10067c;
                        n5.d();
                        Q0.o((Q0) n5.f2752b, str17);
                        n4.d();
                        M0.o((M0) n4.f2752b, (Q0) n5.b());
                        Q0.n();
                        throw null;
                    }
                }).collect(AbstractC0215p.f2797a);
                n3.d();
                O0.o((O0) n3.f2752b, iterable);
                bundle.putByteArray("subscriptionProductReplacementParamsList", ((O0) n3.b()).b());
            }
            if (arrayList.isEmpty()) {
                ArrayList<String> arrayList2 = new ArrayList<>(c3.size() - 1);
                ArrayList<String> arrayList3 = new ArrayList<>(c3.size() - 1);
                ArrayList<String> arrayList4 = new ArrayList<>();
                ArrayList<String> arrayList5 = new ArrayList<>();
                ArrayList<String> arrayList6 = new ArrayList<>();
                ArrayList<Integer> arrayList7 = new ArrayList<>();
                str8 = "proxyPackageVersion";
                str9 = "BillingClient";
                int i13 = 0;
                while (i13 < c3.size()) {
                    C1118f c1118f7 = (C1118f) c3.get(i13);
                    C1118f c1118f8 = c1118f2;
                    C1126n c1126n4 = c1118f7.f10041a;
                    if (!c1126n4.f10071h.isEmpty()) {
                        arrayList4.add(c1126n4.f10071h);
                    }
                    arrayList5.add(c1118f7.f10042b);
                    String str17 = c1126n4.f10072i;
                    ArrayList arrayList8 = c1126n4.f10074k;
                    if (arrayList8 != null && !arrayList8.isEmpty()) {
                        Iterator it3 = c1126n4.f10074k.iterator();
                        while (it3.hasNext()) {
                            C1123k c1123k = (C1123k) it3.next();
                            String str18 = str17;
                            if (!TextUtils.isEmpty(c1123k.f10054e)) {
                                str10 = c1123k.f10054e;
                                break;
                            }
                            str17 = str18;
                        }
                    }
                    str10 = str17;
                    if (!TextUtils.isEmpty(str10)) {
                        arrayList6.add(str10);
                    }
                    if (i13 > 0) {
                        arrayList2.add(((C1118f) c3.get(i13)).f10041a.f10067c);
                        arrayList3.add(((C1118f) c3.get(i13)).f10041a.f10068d);
                    }
                    i13++;
                    c1118f2 = c1118f8;
                }
                c1118f = c1118f2;
                bundle.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList5);
                bundle.putIntegerArrayList("AUTO_PAY_BALANCE_THRESHOLD_LIST", arrayList7);
                if (!arrayList4.isEmpty()) {
                    bundle.putStringArrayList("skuDetailsTokens", arrayList4);
                }
                if (!arrayList6.isEmpty()) {
                    bundle.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList6);
                }
                if (!arrayList2.isEmpty()) {
                    bundle.putStringArrayList("additionalSkus", arrayList2);
                    bundle.putStringArrayList("additionalSkuTypes", arrayList3);
                }
            } else {
                ArrayList<String> arrayList9 = new ArrayList<>();
                new ArrayList();
                new ArrayList();
                new ArrayList();
                new ArrayList();
                Iterator it4 = arrayList.iterator();
                if (it4.hasNext()) {
                    it4.next().getClass();
                    throw new ClassCastException();
                }
                if (!arrayList9.isEmpty()) {
                    bundle.putStringArrayList("skuDetailsTokens", arrayList9);
                }
                if (arrayList.size() > 1) {
                    ArrayList<String> arrayList10 = new ArrayList<>(arrayList.size() - 1);
                    ArrayList<String> arrayList11 = new ArrayList<>(arrayList.size() - 1);
                    if (1 < arrayList.size()) {
                        arrayList.get(1).getClass();
                        throw new ClassCastException();
                    }
                    bundle.putStringArrayList("additionalSkus", arrayList10);
                    bundle.putStringArrayList("additionalSkuTypes", arrayList11);
                }
                str8 = "proxyPackageVersion";
                c1118f = c1118f2;
                str9 = "BillingClient";
            }
            c1116d = this;
            if (bundle.containsKey("SKU_OFFER_ID_TOKEN_LIST") && !c1116d.f10032q) {
                C1120h c1120h7 = O.f9985s;
                c1116d.H(21, 2, c1120h7);
                c1116d.K(c1120h7);
                return c1120h7;
            }
            C1118f c1118f9 = c1118f;
            if (TextUtils.isEmpty(c1118f9.f10041a.f10066b.optString("packageName"))) {
                z4 = false;
            } else {
                bundle.putString("skuPackageName", c1118f9.f10041a.f10066b.optString("packageName"));
                z4 = true;
            }
            str6 = null;
            if (!TextUtils.isEmpty(null)) {
                bundle.putString("accountName", null);
            }
            Intent intent = abstractActivityC0027d.getIntent();
            if (intent == null) {
                str5 = str9;
                AbstractC0213o0.g(str5, "Activity's intent is null.");
            } else {
                str5 = str9;
                if (!TextUtils.isEmpty(intent.getStringExtra("PROXY_PACKAGE"))) {
                    String stringExtra = intent.getStringExtra("PROXY_PACKAGE");
                    bundle.putString("proxyPackage", stringExtra);
                    try {
                        str11 = str8;
                        try {
                            bundle.putString(str11, c1116d.f.getPackageManager().getPackageInfo(stringExtra, 0).versionName);
                        } catch (PackageManager.NameNotFoundException unused) {
                            bundle.putString(str11, "package not found");
                            if (!c1116d.f10035t) {
                            }
                            if (!c1116d.f10033r) {
                            }
                            if (c1116d.f10030o) {
                            }
                        }
                    } catch (PackageManager.NameNotFoundException unused2) {
                        str11 = str8;
                    }
                }
            }
            if (!c1116d.f10035t && !c3.isEmpty()) {
                i4 = 17;
            } else if (!c1116d.f10033r && z4) {
                i4 = 15;
            } else if (c1116d.f10030o) {
                i4 = 6;
            } else {
                i5 = 9;
                final String str19 = str2;
                final String str20 = str3;
                m3 = m(new Callable(i5, str20, str19, nVar, bundle) { // from class: m0.v

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ int f10085b;

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ String f10086c;

                    /* renamed from: d, reason: collision with root package name */
                    public final /* synthetic */ String f10087d;

                    /* renamed from: e, reason: collision with root package name */
                    public final /* synthetic */ Bundle f10088e;

                    {
                        this.f10088e = bundle;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        Bundle i14;
                        InterfaceC0179d interfaceC0179d;
                        C1116d c1116d2 = C1116d.this;
                        int i15 = this.f10085b;
                        String str21 = this.f10086c;
                        String str22 = this.f10087d;
                        Bundle bundle2 = this.f10088e;
                        try {
                            synchronized (c1116d2.f10017a) {
                                interfaceC0179d = c1116d2.f10023h;
                            }
                            if (interfaceC0179d == null) {
                                return AbstractC0213o0.i(O.f9977k, 119);
                            }
                            return ((C0173b) interfaceC0179d).h(i15, c1116d2.f.getPackageName(), str21, str22, bundle2);
                        } catch (DeadObjectException e3) {
                            C1120h c1120h8 = O.f9977k;
                            String a5 = M.a(e3);
                            i14 = AbstractC0213o0.i(c1120h8, 5);
                            if (a5 != null) {
                                i14.putString("ADDITIONAL_LOG_DETAILS", a5);
                            }
                            return i14;
                        } catch (Exception e4) {
                            C1120h c1120h9 = O.f9975i;
                            String a6 = M.a(e4);
                            i14 = AbstractC0213o0.i(c1120h9, 5);
                            if (a6 != null) {
                                i14.putString("ADDITIONAL_LOG_DETAILS", a6);
                            }
                            return i14;
                        }
                    }
                }, 5000L, null, c1116d.f10020d, c1116d.q());
            }
            i5 = i4;
            final String str192 = str2;
            final String str202 = str3;
            m3 = m(new Callable(i5, str202, str192, nVar, bundle) { // from class: m0.v

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ int f10085b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ String f10086c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ String f10087d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ Bundle f10088e;

                {
                    this.f10088e = bundle;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Bundle i14;
                    InterfaceC0179d interfaceC0179d;
                    C1116d c1116d2 = C1116d.this;
                    int i15 = this.f10085b;
                    String str21 = this.f10086c;
                    String str22 = this.f10087d;
                    Bundle bundle2 = this.f10088e;
                    try {
                        synchronized (c1116d2.f10017a) {
                            interfaceC0179d = c1116d2.f10023h;
                        }
                        if (interfaceC0179d == null) {
                            return AbstractC0213o0.i(O.f9977k, 119);
                        }
                        return ((C0173b) interfaceC0179d).h(i15, c1116d2.f.getPackageName(), str21, str22, bundle2);
                    } catch (DeadObjectException e3) {
                        C1120h c1120h8 = O.f9977k;
                        String a5 = M.a(e3);
                        i14 = AbstractC0213o0.i(c1120h8, 5);
                        if (a5 != null) {
                            i14.putString("ADDITIONAL_LOG_DETAILS", a5);
                        }
                        return i14;
                    } catch (Exception e4) {
                        C1120h c1120h9 = O.f9975i;
                        String a6 = M.a(e4);
                        i14 = AbstractC0213o0.i(c1120h9, 5);
                        if (a6 != null) {
                            i14.putString("ADDITIONAL_LOG_DETAILS", a6);
                        }
                        return i14;
                    }
                }
            }, 5000L, null, c1116d.f10020d, c1116d.q());
        } else {
            str5 = "BillingClient";
            str6 = str;
            m3 = m(new u(c1116d, str3, str2, 4), 5000L, null, c1116d.f10020d, c1116d.q());
        }
        try {
            if (m3 == null) {
                C1120h c1120h8 = O.f9971d;
                c1116d.H(25, 2, c1120h8);
                c1116d.K(c1120h8);
                return c1120h8;
            }
            Bundle bundle2 = (Bundle) m3.get(5000L, TimeUnit.MILLISECONDS);
            int a5 = AbstractC0213o0.a(bundle2, str5);
            String e3 = AbstractC0213o0.e(bundle2, str5);
            if (a5 == 0) {
                Intent intent2 = new Intent(abstractActivityC0027d, (Class<?>) ProxyBillingActivity.class);
                String str21 = str4;
                intent2.putExtra(str21, (PendingIntent) bundle2.getParcelable(str21));
                abstractActivityC0027d.startActivity(intent2);
                return O.f9976j;
            }
            AbstractC0213o0.g(str5, "Unable to buy item, Error response code: " + a5);
            C1120h a6 = O.a(a5, e3);
            if (bundle2 != null) {
                try {
                    obj = bundle2.get("LOG_REASON");
                } catch (Throwable th) {
                    AbstractC0213o0.g(str5, "Failed to get log reason from bundle: ".concat(String.valueOf(th.getMessage())));
                }
                if (obj != null) {
                    if (obj instanceof Integer) {
                        m4 = AbstractC0181d1.m(((Integer) obj).intValue());
                        i3 = 1;
                        if (m4 == i3) {
                            m4 = 23;
                        }
                        if (bundle2 != null) {
                            try {
                                string = bundle2.getString("ADDITIONAL_LOG_DETAILS");
                            } catch (Throwable th2) {
                                AbstractC0213o0.g(str5, "Failed to get additional log details from bundle: ".concat(String.valueOf(th2.getMessage())));
                            }
                            c1116d.I(m4, 2, a6, string);
                            c1116d.K(a6);
                            return a6;
                        }
                        string = str6;
                        c1116d.I(m4, 2, a6, string);
                        c1116d.K(a6);
                        return a6;
                    }
                    AbstractC0213o0.g(str5, "Unexpected type for bundle log reason: " + obj.getClass().getName());
                }
            }
            i3 = 1;
            m4 = 1;
            if (m4 == i3) {
            }
            if (bundle2 != null) {
            }
            string = str6;
            c1116d.I(m4, 2, a6, string);
            c1116d.K(a6);
            return a6;
        } catch (CancellationException e4) {
            e = e4;
            AbstractC0213o0.h(str5, "Time out while launching billing flow. Try to reconnect", e);
            C1120h c1120h9 = O.f9978l;
            c1116d.I(4, 2, c1120h9, M.a(e));
            c1116d.K(c1120h9);
            return c1120h9;
        } catch (TimeoutException e5) {
            e = e5;
            AbstractC0213o0.h(str5, "Time out while launching billing flow. Try to reconnect", e);
            C1120h c1120h92 = O.f9978l;
            c1116d.I(4, 2, c1120h92, M.a(e));
            c1116d.K(c1120h92);
            return c1120h92;
        } catch (Exception e6) {
            AbstractC0213o0.h(str5, "Exception while launching billing flow. Try to reconnect", e6);
            C1120h c1120h10 = O.f9977k;
            c1116d.I(5, 2, c1120h10, M.a(e6));
            c1116d.K(c1120h10);
            return c1120h10;
        }
    }

    public final C1120h k(final AbstractActivityC0027d abstractActivityC0027d, final F1.b bVar) {
        if (abstractActivityC0027d == null) {
            throw new IllegalArgumentException("Please provide a valid activity.");
        }
        if (!b()) {
            C1120h c1120h = O.f9977k;
            H(2, 16, c1120h);
            return c1120h;
        }
        if (!this.f10039x) {
            AbstractC0213o0.g("BillingClient", "Current Play Store version doesn't support alternative billing only.");
            C1120h c1120h2 = O.f9965C;
            H(66, 16, c1120h2);
            return c1120h2;
        }
        Handler handler = this.f10020d;
        final x xVar = new x(this, handler, bVar);
        if (m(new Callable() { // from class: m0.S
            @Override // java.util.concurrent.Callable
            public final Object call() {
                InterfaceC0179d interfaceC0179d;
                C1116d c1116d = C1116d.this;
                F1.b bVar2 = bVar;
                AbstractActivityC0027d abstractActivityC0027d2 = abstractActivityC0027d;
                x xVar2 = xVar;
                c1116d.getClass();
                try {
                    synchronized (c1116d.f10017a) {
                        interfaceC0179d = c1116d.f10023h;
                    }
                    if (interfaceC0179d == null) {
                        c1116d.G(bVar2, O.f9977k, 119, null);
                        return null;
                    }
                    String packageName = c1116d.f.getPackageName();
                    String str = c1116d.f10019c;
                    long longValue = c1116d.f10016E.longValue();
                    int i3 = AbstractC0213o0.f2786a;
                    Bundle bundle = new Bundle();
                    AbstractC0213o0.b(bundle, str, longValue);
                    ((C0173b) interfaceC0179d).n(packageName, bundle, new BinderC1111B(new WeakReference(abstractActivityC0027d2), xVar2));
                    return null;
                } catch (DeadObjectException e3) {
                    c1116d.G(bVar2, O.f9977k, 74, e3);
                    return null;
                } catch (Exception e4) {
                    c1116d.G(bVar2, O.f9975i, 74, e4);
                    return null;
                }
            }
        }, 30000L, new A.a(this, 18, bVar), handler, q()) != null) {
            return O.f9976j;
        }
        C1120h n3 = n();
        H(25, 16, n3);
        return n3;
    }

    public void l(InterfaceC1117e interfaceC1117e) {
        C1120h c1120h;
        synchronized (this.f10017a) {
            try {
                if (b()) {
                    c1120h = E();
                } else if (this.f10018b == 1) {
                    AbstractC0213o0.g("BillingClient", "Client is already in the process of connecting to billing service.");
                    c1120h = O.f9972e;
                    H(37, 6, c1120h);
                } else if (this.f10018b == 3) {
                    AbstractC0213o0.g("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
                    c1120h = O.f9977k;
                    H(38, 6, c1120h);
                } else {
                    t(1);
                    u();
                    AbstractC0213o0.f("BillingClient", "Starting in-app billing setup.");
                    this.f10024i = new z(this, interfaceC1117e);
                    Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
                    intent.setPackage("com.android.vending");
                    List<ResolveInfo> queryIntentServices = this.f.getPackageManager().queryIntentServices(intent, 0);
                    int i3 = 41;
                    if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                        ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
                        i3 = 40;
                        if (serviceInfo != null) {
                            String str = serviceInfo.packageName;
                            String str2 = serviceInfo.name;
                            if (!Objects.equals(str, "com.android.vending") || str2 == null) {
                                AbstractC0213o0.g("BillingClient", "The device doesn't have valid Play Store.");
                            } else {
                                ComponentName componentName = new ComponentName(str, str2);
                                Intent intent2 = new Intent(intent);
                                intent2.setComponent(componentName);
                                intent2.putExtra("playBillingLibraryVersion", this.f10019c);
                                synchronized (this.f10017a) {
                                    try {
                                        if (this.f10018b == 2) {
                                            c1120h = E();
                                        } else if (this.f10018b != 1) {
                                            AbstractC0213o0.g("BillingClient", "Client state no longer CONNECTING, returning service disconnected.");
                                            c1120h = O.f9977k;
                                            H(117, 6, c1120h);
                                        } else {
                                            z zVar = this.f10024i;
                                            if (this.f.bindService(intent2, zVar, 1)) {
                                                AbstractC0213o0.f("BillingClient", "Service was bonded successfully.");
                                                c1120h = null;
                                            } else {
                                                AbstractC0213o0.g("BillingClient", "Connection to Billing service is blocked.");
                                                i3 = 39;
                                            }
                                        }
                                    } finally {
                                    }
                                }
                            }
                        } else {
                            AbstractC0213o0.g("BillingClient", "The device doesn't have valid Play Store.");
                        }
                    }
                    t(0);
                    AbstractC0213o0.f("BillingClient", "Billing service unavailable on device.");
                    c1120h = O.f9970c;
                    H(i3, 6, c1120h);
                }
            } finally {
            }
        }
        if (c1120h != null) {
            interfaceC1117e.onBillingSetupFinished(c1120h);
        }
    }

    public final C1120h n() {
        int[] iArr = {0, 3};
        synchronized (this.f10017a) {
            for (int i3 = 0; i3 < 2; i3++) {
                if (this.f10018b == iArr[i3]) {
                    return O.f9977k;
                }
            }
            return O.f9975i;
        }
    }

    public final void o() {
        if (TextUtils.isEmpty(null)) {
            this.f.getPackageName();
        }
    }

    public final synchronized ExecutorService q() {
        try {
            if (this.f10014C == null) {
                this.f10014C = Executors.newFixedThreadPool(AbstractC0213o0.f2786a, new w());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f10014C;
    }

    public final void r(Q1 q12) {
        try {
            this.f10022g.w(q12, this.f10027l);
        } catch (Throwable th) {
            AbstractC0213o0.h("BillingClient", "Unable to log.", th);
        }
    }

    public final void s(S1 s12) {
        try {
            V1.b bVar = this.f10022g;
            int i3 = this.f10027l;
            bVar.getClass();
            try {
                Z1 z12 = (Z1) ((a2) bVar.f1614b).g();
                z12.d();
                a2.n((a2) z12.f2752b, i3);
                bVar.f1614b = (a2) z12.b();
                bVar.x(s12);
            } catch (Throwable th) {
                AbstractC0213o0.h("BillingLogger", "Unable to log.", th);
            }
        } catch (Throwable th2) {
            AbstractC0213o0.h("BillingClient", "Unable to log.", th2);
        }
    }

    public final void t(int i3) {
        synchronized (this.f10017a) {
            try {
                if (this.f10018b == 3) {
                    return;
                }
                int i4 = this.f10018b;
                AbstractC0213o0.f("BillingClient", "Setting clientState from " + (i4 != 0 ? i4 != 1 ? i4 != 2 ? "CLOSED" : "CONNECTED" : "CONNECTING" : "DISCONNECTED") + " to " + (i3 != 0 ? i3 != 1 ? i3 != 2 ? "CLOSED" : "CONNECTED" : "CONNECTING" : "DISCONNECTED"));
                this.f10018b = i3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void u() {
        synchronized (this.f10017a) {
            if (this.f10024i != null) {
                try {
                    this.f.unbindService(this.f10024i);
                } catch (Throwable th) {
                    try {
                        AbstractC0213o0.h("BillingClient", "There was an exception while unbinding service!", th);
                        this.f10023h = null;
                        this.f10024i = null;
                    } finally {
                        this.f10023h = null;
                        this.f10024i = null;
                    }
                }
            }
        }
    }

    public final X1.a v(C1120h c1120h, int i3, String str, Exception exc) {
        AbstractC0213o0.h("BillingClient", str, exc);
        I(i3, 7, c1120h, M.a(exc));
        return new X1.a(c1120h.f10046a, c1120h.f10047b, new ArrayList());
    }

    public final C1112C w(C1120h c1120h, int i3, String str, Exception exc) {
        AbstractC0213o0.h("BillingClient", str, exc);
        I(i3, 11, c1120h, M.a(exc));
        return new C1112C(c1120h, null);
    }

    public final C1112C x(C1120h c1120h, int i3, String str, Exception exc) {
        I(i3, 9, c1120h, M.a(exc));
        AbstractC0213o0.h("BillingClient", str, exc);
        return new C1112C(c1120h, null);
    }

    public final void y(int i3, int i4, C1120h c1120h) {
        S1 s12 = null;
        Q1 q12 = null;
        if (c1120h.f10046a == 0) {
            int i5 = M.f9961a;
            try {
                R1 q3 = S1.q();
                q3.d();
                S1.p((S1) q3.f2752b, 5);
                c2 o3 = e2.o();
                o3.d();
                e2.n((e2) o3.f2752b, i4);
                e2 e2Var = (e2) o3.b();
                q3.d();
                S1.n((S1) q3.f2752b, e2Var);
                s12 = (S1) q3.b();
            } catch (Exception e3) {
                AbstractC0213o0.h("BillingLogger", "Unable to create logging payload", e3);
            }
            s(s12);
            return;
        }
        int i6 = M.f9961a;
        try {
            P1 r3 = Q1.r();
            T1 r4 = U1.r();
            r4.e(c1120h.f10046a);
            String str = c1120h.f10047b;
            r4.d();
            U1.o((U1) r4.f2752b, str);
            r4.f(i3);
            r3.e(r4);
            r3.f(5);
            c2 o4 = e2.o();
            o4.d();
            e2.n((e2) o4.f2752b, i4);
            e2 e2Var2 = (e2) o4.b();
            r3.d();
            Q1.p((Q1) r3.f2752b, e2Var2);
            q12 = (Q1) r3.b();
        } catch (Exception e4) {
            AbstractC0213o0.h("BillingLogger", "Unable to create logging payload", e4);
        }
        r(q12);
    }

    public final void z(F1.b bVar, C1120h c1120h, int i3, Exception exc) {
        AbstractC0213o0.h("BillingClient", "Error in acknowledge purchase!", exc);
        I(i3, 3, c1120h, M.a(exc));
        bVar.c(c1120h);
    }

    public C1116d(C1122j c1122j, Context context) {
        this.f10017a = new Object();
        this.f10018b = 0;
        this.f10020d = new Handler(Looper.getMainLooper());
        this.f10027l = 0;
        long nextLong = new Random().nextLong();
        this.f10016E = Long.valueOf(nextLong);
        this.f10019c = p();
        this.f = context.getApplicationContext();
        Z1 r3 = a2.r();
        String p3 = p();
        r3.d();
        a2.q((a2) r3.f2752b, p3);
        String packageName = this.f.getPackageName();
        r3.d();
        a2.p((a2) r3.f2752b, packageName);
        r3.d();
        a2.o((a2) r3.f2752b, nextLong);
        this.f10022g = new V1.b(this.f, (a2) r3.b());
        AbstractC0213o0.g("BillingClient", "Billing client should have a valid listener but the provided is null.");
        this.f10021e = new Q(this.f, null, null, this.f10022g);
        this.f10012A = c1122j;
        this.f.getPackageName();
    }

    public C1116d(C1122j c1122j, Context context, r rVar) {
        String p3 = p();
        this.f10017a = new Object();
        this.f10018b = 0;
        this.f10020d = new Handler(Looper.getMainLooper());
        this.f10027l = 0;
        long nextLong = new Random().nextLong();
        this.f10016E = Long.valueOf(nextLong);
        this.f10019c = p3;
        this.f = context.getApplicationContext();
        Z1 r3 = a2.r();
        r3.d();
        a2.q((a2) r3.f2752b, p3);
        String packageName = this.f.getPackageName();
        r3.d();
        a2.p((a2) r3.f2752b, packageName);
        r3.d();
        a2.o((a2) r3.f2752b, nextLong);
        this.f10022g = new V1.b(this.f, (a2) r3.b());
        if (rVar == null) {
            AbstractC0213o0.g("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.f10021e = new Q(this.f, rVar, null, this.f10022g);
        this.f10012A = c1122j;
        this.f10013B = false;
        this.f.getPackageName();
    }

    public C1116d(C1122j c1122j, Context context, r rVar, G0.j jVar) {
        String p3 = p();
        this.f10017a = new Object();
        this.f10018b = 0;
        this.f10020d = new Handler(Looper.getMainLooper());
        this.f10027l = 0;
        long nextLong = new Random().nextLong();
        this.f10016E = Long.valueOf(nextLong);
        this.f10019c = p3;
        this.f = context.getApplicationContext();
        Z1 r3 = a2.r();
        r3.d();
        a2.q((a2) r3.f2752b, p3);
        String packageName = this.f.getPackageName();
        r3.d();
        a2.p((a2) r3.f2752b, packageName);
        r3.d();
        a2.o((a2) r3.f2752b, nextLong);
        this.f10022g = new V1.b(this.f, (a2) r3.b());
        if (rVar == null) {
            AbstractC0213o0.g("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.f10021e = new Q(this.f, rVar, jVar, this.f10022g);
        this.f10012A = c1122j;
        this.f10013B = jVar != null;
    }
}
