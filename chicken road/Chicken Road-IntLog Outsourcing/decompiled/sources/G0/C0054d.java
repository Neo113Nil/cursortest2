package G0;

import G0.C0056f;
import M2.C0097a;
import M2.C0104h;
import M2.C0105i;
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
import com.google.android.gms.internal.play_billing.AbstractC0325d1;
import com.google.android.gms.internal.play_billing.AbstractC0357o0;
import com.google.android.gms.internal.play_billing.AbstractC0359p;
import com.google.android.gms.internal.play_billing.C0317b;
import com.google.android.gms.internal.play_billing.C0388z;
import com.google.android.gms.internal.play_billing.InterfaceC0323d;
import com.google.android.gms.internal.play_billing.InterfaceExecutorServiceC0389z0;
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
import com.onesignal.debug.internal.crash.AnrConstants;
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
import n2.AbstractC1341c;
import w2.AbstractActivityC1515c;

/* renamed from: G0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0054d extends AbstractC0053c {

    /* renamed from: A, reason: collision with root package name */
    public final C0062l f819A;

    /* renamed from: B, reason: collision with root package name */
    public final boolean f820B;

    /* renamed from: C, reason: collision with root package name */
    public ExecutorService f821C;

    /* renamed from: D, reason: collision with root package name */
    public volatile InterfaceExecutorServiceC0389z0 f822D;

    /* renamed from: E, reason: collision with root package name */
    public final Long f823E;

    /* renamed from: a, reason: collision with root package name */
    public final Object f824a;

    /* renamed from: b, reason: collision with root package name */
    public volatile int f825b;

    /* renamed from: c, reason: collision with root package name */
    public final String f826c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f827d;

    /* renamed from: e, reason: collision with root package name */
    public volatile S f828e;

    /* renamed from: f, reason: collision with root package name */
    public final Context f829f;

    /* renamed from: g, reason: collision with root package name */
    public final B0.l f830g;

    /* renamed from: h, reason: collision with root package name */
    public volatile InterfaceC0323d f831h;

    /* renamed from: i, reason: collision with root package name */
    public volatile B f832i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f833j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f834k;

    /* renamed from: l, reason: collision with root package name */
    public int f835l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f836m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f837n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f838o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f839p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f840q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f841r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f842s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f843t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f844u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f845v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f846w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f847x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f848y;
    public boolean z;

    public C0054d(C0062l c0062l, Context context) {
        this.f824a = new Object();
        this.f825b = 0;
        this.f827d = new Handler(Looper.getMainLooper());
        this.f835l = 0;
        long nextLong = new Random().nextLong();
        this.f823E = Long.valueOf(nextLong);
        this.f826c = p();
        this.f829f = context.getApplicationContext();
        Z1 r5 = a2.r();
        String p5 = p();
        r5.d();
        a2.q((a2) r5.f5183b, p5);
        String packageName = this.f829f.getPackageName();
        r5.d();
        a2.p((a2) r5.f5183b, packageName);
        r5.d();
        a2.o((a2) r5.f5183b, nextLong);
        this.f830g = new B0.l(this.f829f, (a2) r5.b());
        AbstractC0357o0.g("BillingClient", "Billing client should have a valid listener but the provided is null.");
        this.f828e = new S(this.f829f, null, null, this.f830g);
        this.f819A = c0062l;
        this.f829f.getPackageName();
    }

    public static Future m(Callable callable, long j2, Runnable runnable, Handler handler, ExecutorService executorService) {
        try {
            Future submit = executorService.submit(callable);
            handler.postDelayed(new A0.a(submit, runnable, 9, false), (long) (j2 * 0.95d));
            return submit;
        } catch (Exception e3) {
            AbstractC0357o0.h("BillingClient", "Async task throws exception!", e3);
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

    public final void A(D3.g gVar, C0060j c0060j, int i2, Exception exc) {
        I(i2, 14, c0060j, M.a(exc));
        ((C0104h) gVar.f448b).a(AbstractC1341c.j(c0060j));
    }

    public final void B(D3.g gVar, C0060j c0060j, int i2, String str, Exception exc) {
        AbstractC0357o0.h("BillingClient", str, exc);
        I(i2, 4, c0060j, M.a(exc));
        ((C0105i) gVar.f448b).a(AbstractC1341c.j(c0060j));
    }

    public final void C(D3.g gVar, C0060j c0060j, int i2, Exception exc) {
        I(i2, 15, c0060j, M.a(exc));
        gVar.g(c0060j);
    }

    public final Handler D() {
        return Looper.myLooper() == null ? this.f827d : new Handler(Looper.myLooper());
    }

    public final C0060j E() {
        AbstractC0357o0.f("BillingClient", "Service connection is valid. No need to re-initialize.");
        R1 q5 = S1.q();
        q5.d();
        S1.p((S1) q5.f5183b, 6);
        n2 o2 = o2.o();
        o2.d();
        o2.n((o2) o2.f5183b);
        q5.d();
        S1.o((S1) q5.f5183b, (o2) o2.b());
        s((S1) q5.b());
        return O.f780j;
    }

    public final void F(D3.g gVar, C0060j c0060j, int i2, Exception exc) {
        AbstractC0357o0.h("BillingClient", "getBillingConfig got an exception.", exc);
        I(i2, 13, c0060j, M.a(exc));
        gVar.h(c0060j);
    }

    public final void G(D3.g gVar, C0060j c0060j, int i2, Exception exc) {
        I(i2, 16, c0060j, M.a(exc));
        ((C0105i) gVar.f448b).a(AbstractC1341c.j(c0060j));
    }

    public final void H(int i2, int i3, C0060j c0060j) {
        try {
            r(M.b(i2, i3, c0060j));
        } catch (Throwable th) {
            AbstractC0357o0.h("BillingClient", "Unable to log.", th);
        }
    }

    public final void I(int i2, int i3, C0060j c0060j, String str) {
        try {
            r(M.c(i2, i3, c0060j, str));
        } catch (Throwable th) {
            AbstractC0357o0.h("BillingClient", "Unable to log.", th);
        }
    }

    public final void J(int i2) {
        try {
            s(M.d(i2));
        } catch (Throwable th) {
            AbstractC0357o0.h("BillingClient", "Unable to log.", th);
        }
    }

    public final void K(C0060j c0060j) {
        if (Thread.interrupted()) {
            return;
        }
        this.f827d.post(new A0.a(this, c0060j, 13, false));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0038 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // G0.AbstractC0053c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a() {
        J(12);
        synchronized (this.f824a) {
            try {
                try {
                    if (this.f828e != null) {
                        S s2 = this.f828e;
                        Q q5 = s2.f805e;
                        Context context = s2.f801a;
                        q5.b(context);
                        s2.f806f.b(context);
                    }
                } finally {
                    AbstractC0357o0.f("BillingClient", "Unbinding from service.");
                    u();
                    synchronized (this) {
                    }
                }
                synchronized (this) {
                    ExecutorService executorService = this.f821C;
                    if (executorService != null) {
                        executorService.shutdownNow();
                        this.f821C = null;
                        this.f822D = null;
                    }
                }
            } finally {
                try {
                } finally {
                }
            }
            try {
                AbstractC0357o0.f("BillingClient", "Unbinding from service.");
                u();
            } catch (Throwable th) {
                AbstractC0357o0.h("BillingClient", "There was an exception while unbinding from the service while ending connection!", th);
            }
        }
    }

    @Override // G0.AbstractC0053c
    public final boolean b() {
        boolean z;
        synchronized (this.f824a) {
            try {
                z = false;
                if (this.f825b == 2 && this.f831h != null && this.f832i != null) {
                    z = true;
                }
            } finally {
            }
        }
        return z;
    }

    @Override // G0.AbstractC0053c
    public void c(B1.g gVar, InterfaceC0067q interfaceC0067q) {
        if (!b()) {
            C0060j c0060j = O.f781k;
            H(2, 7, c0060j);
            interfaceC0067q.onProductDetailsResponse(c0060j, new ArrayList());
        } else {
            if (!this.f843t) {
                AbstractC0357o0.g("BillingClient", "Querying product details is not supported.");
                C0060j c0060j2 = O.f790t;
                H(20, 7, c0060j2);
                interfaceC0067q.onProductDetailsResponse(c0060j2, new ArrayList());
                return;
            }
            if (m(new w(this, gVar, interfaceC0067q, 1), 30000L, new A0.a(this, interfaceC0067q, 12, false), D(), q()) == null) {
                C0060j n6 = n();
                H(25, 7, n6);
                interfaceC0067q.onProductDetailsResponse(n6, new ArrayList());
            }
        }
    }

    @Override // G0.AbstractC0053c
    public final void d(C0061k c0061k, InterfaceC0068s interfaceC0068s) {
        int i2 = 2;
        if (!b()) {
            C0060j c0060j = O.f781k;
            H(2, 9, c0060j);
            C0388z c0388z = com.google.android.gms.internal.play_billing.C.f5030b;
            interfaceC0068s.onQueryPurchasesResponse(c0060j, com.google.android.gms.internal.play_billing.S.f5100e);
            return;
        }
        String str = c0061k.f864a;
        if (TextUtils.isEmpty(str)) {
            AbstractC0357o0.g("BillingClient", "Please provide a valid product type.");
            C0060j c0060j2 = O.f776f;
            H(50, 9, c0060j2);
            C0388z c0388z2 = com.google.android.gms.internal.play_billing.C.f5030b;
            interfaceC0068s.onQueryPurchasesResponse(c0060j2, com.google.android.gms.internal.play_billing.S.f5100e);
            return;
        }
        if (m(new w(this, str, interfaceC0068s, i2), 30000L, new A0.a(this, interfaceC0068s, 7, false), D(), q()) == null) {
            C0060j n6 = n();
            H(25, 9, n6);
            C0388z c0388z3 = com.google.android.gms.internal.play_billing.C.f5030b;
            interfaceC0068s.onQueryPurchasesResponse(n6, com.google.android.gms.internal.play_billing.S.f5100e);
        }
    }

    public void e(C0051a c0051a, D3.g gVar) {
        if (!b()) {
            C0060j c0060j = O.f781k;
            H(2, 3, c0060j);
            gVar.f(c0060j);
            return;
        }
        if (TextUtils.isEmpty(c0051a.f813b)) {
            AbstractC0357o0.g("BillingClient", "Please provide a valid purchase token.");
            C0060j c0060j2 = O.f778h;
            H(26, 3, c0060j2);
            gVar.f(c0060j2);
            return;
        }
        if (!this.f838o) {
            C0060j c0060j3 = O.f772b;
            H(27, 3, c0060j3);
            gVar.f(c0060j3);
        } else if (m(new w(this, gVar, c0051a, 5), 30000L, new A0.a(this, gVar, 15, false), D(), q()) == null) {
            C0060j n6 = n();
            H(25, 3, n6);
            gVar.f(n6);
        }
    }

    public void f(D3.g gVar, C0061k c0061k) {
        boolean b6 = b();
        C0105i c0105i = (C0105i) gVar.f448b;
        if (!b6) {
            C0060j c0060j = O.f781k;
            H(2, 4, c0060j);
            c0105i.a(AbstractC1341c.j(c0060j));
        } else if (m(new w(this, c0061k, gVar, 0), 30000L, new A0.a(this, gVar, c0061k), D(), q()) == null) {
            C0060j n6 = n();
            H(25, 4, n6);
            c0105i.a(AbstractC1341c.j(n6));
        }
    }

    public final void g(D3.g gVar) {
        if (!b()) {
            C(gVar, O.f781k, 2, null);
            return;
        }
        if (!this.f847x) {
            AbstractC0357o0.g("BillingClient", "Current client doesn't support alternative billing only.");
            C(gVar, O.f768C, 66, null);
        } else if (m(new B2.c(this, gVar, 3), 30000L, new A0.a(this, gVar, 17, false), D(), q()) == null) {
            C(gVar, n(), 25, null);
        }
    }

    public final void h(D3.g gVar) {
        if (!b()) {
            AbstractC0357o0.g("BillingClient", "Service disconnected.");
            C0060j c0060j = O.f781k;
            H(2, 13, c0060j);
            gVar.h(c0060j);
            return;
        }
        if (!this.f844u) {
            AbstractC0357o0.g("BillingClient", "Current client doesn't support get billing config.");
            C0060j c0060j2 = O.f795y;
            H(32, 13, c0060j2);
            gVar.h(c0060j2);
            return;
        }
        if (m(new B2.c(this, gVar, 2), 30000L, new A0.a(this, gVar, 16, false), D(), q()) == null) {
            C0060j n6 = n();
            H(25, 13, n6);
            gVar.h(n6);
        }
    }

    public final void i(D3.g gVar) {
        if (!b()) {
            A(gVar, O.f781k, 2, null);
            return;
        }
        if (!this.f847x) {
            AbstractC0357o0.g("BillingClient", "Current client doesn't support alternative billing only.");
            A(gVar, O.f768C, 66, null);
        } else if (m(new B2.c(this, gVar, 1), 30000L, new A0.a(this, gVar, 8, false), D(), q()) == null) {
            A(gVar, n(), 25, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x009f, code lost:
    
        if (r28.f856a == false) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0627  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x062d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0553  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0556  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0060j j(AbstractActivityC1515c abstractActivityC1515c, final C0059i c0059i) {
        String str;
        String str2;
        String str3;
        C0060j a6;
        String str4;
        String str5;
        Future m6;
        Object obj;
        int o2;
        int i2;
        boolean z;
        String str6;
        String str7;
        C0056f c0056f;
        boolean z5;
        String str8;
        int i3;
        final int i6;
        C0054d c0054d = this;
        String str9 = "BUY_INTENT";
        if (c0054d.f828e == null || c0054d.f828e.f802b == null) {
            C0060j c0060j = O.f769D;
            c0054d.H(12, 2, c0060j);
            return c0060j;
        }
        if (!b()) {
            C0060j c0060j2 = O.f781k;
            c0054d.H(2, 2, c0060j2);
            c0054d.K(c0060j2);
            return c0060j2;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(c0059i.f861f);
        com.google.android.gms.internal.play_billing.C c2 = c0059i.f860e;
        Iterator it = arrayList.iterator();
        if ((it.hasNext() ? it.next() : null) != null) {
            throw new ClassCastException();
        }
        C0388z c0388z = (C0388z) c2.iterator();
        C0056f c0056f2 = (C0056f) (c0388z.hasNext() ? c0388z.next() : null);
        C0066p c0066p = c0056f2.f849a;
        String str10 = c0066p.f886c;
        String str11 = c0066p.f887d;
        if (str11.equals("subs") && !c0054d.f833j) {
            AbstractC0357o0.g("BillingClient", "Current client doesn't support subscriptions.");
            C0060j c0060j3 = O.f783m;
            c0054d.H(9, 2, c0060j3);
            c0054d.K(c0060j3);
            return c0060j3;
        }
        if (c0059i.f857b == null && c0059i.f858c == null) {
            C0058h c0058h = c0059i.f859d;
            c0058h.getClass();
            if (c0058h.f854a == 0) {
                if (!c0059i.f860e.stream().anyMatch(new K())) {
                }
            }
        }
        if (!c0054d.f836m) {
            AbstractC0357o0.g("BillingClient", "Current client doesn't support extra params for buy intent.");
            C0060j c0060j4 = O.f777g;
            c0054d.H(18, 2, c0060j4);
            c0054d.K(c0060j4);
            return c0060j4;
        }
        if (arrayList.size() > 1 && !c0054d.f842s) {
            AbstractC0357o0.g("BillingClient", "Current client doesn't support multi-item purchases.");
            C0060j c0060j5 = O.f788r;
            c0054d.H(19, 2, c0060j5);
            c0054d.K(c0060j5);
            return c0060j5;
        }
        if (!c2.isEmpty() && !c0054d.f843t) {
            AbstractC0357o0.g("BillingClient", "Current client doesn't support purchases with ProductDetails.");
            C0060j c0060j6 = O.f790t;
            c0054d.H(20, 2, c0060j6);
            c0054d.K(c0060j6);
            return c0060j6;
        }
        if (c0059i.f860e.isEmpty()) {
            a6 = O.f780j;
            str2 = str11;
            str3 = str10;
            str = "BUY_INTENT";
        } else {
            C0056f c0056f3 = (C0056f) c0059i.f860e.get(0);
            int i7 = 1;
            while (true) {
                if (i7 < c0059i.f860e.size()) {
                    C0056f c0056f4 = (C0056f) c0059i.f860e.get(i7);
                    str = str9;
                    if (!c0056f4.a().c().equals(c0056f3.a().c()) && !c0056f4.a().c().equals("play_pass_subs")) {
                        a6 = O.a(5, "All products should have same ProductType.");
                        str2 = str11;
                        str3 = str10;
                        break;
                    }
                    i7++;
                    str9 = str;
                } else {
                    str = str9;
                    String d6 = c0056f3.a().d();
                    HashSet hashSet = new HashSet();
                    HashSet hashSet2 = new HashSet();
                    com.google.android.gms.internal.play_billing.C c6 = c0059i.f860e;
                    int size = c6.size();
                    str2 = str11;
                    str3 = str10;
                    int i8 = 0;
                    while (true) {
                        if (i8 < size) {
                            C0056f c0056f5 = (C0056f) c6.get(i8);
                            int i9 = size;
                            com.google.android.gms.internal.play_billing.C c7 = c6;
                            c0056f5.a().c().equals("subs");
                            if (!hashSet.contains(c0056f5.a().b())) {
                                hashSet.add(c0056f5.a().b());
                                if (!c0056f3.a().c().equals("play_pass_subs") && !c0056f5.a().c().equals("play_pass_subs") && !d6.equals(c0056f5.a().d())) {
                                    a6 = O.a(5, "All products must have the same package name.");
                                    break;
                                }
                                i8++;
                                c6 = c7;
                                size = i9;
                            } else {
                                a6 = O.a(5, "ProductId can not be duplicated. Invalid product id: " + c0056f5.a().b() + ".");
                                break;
                            }
                        } else {
                            Iterator it2 = hashSet2.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    String str12 = (String) it2.next();
                                    if (hashSet.contains(str12)) {
                                        a6 = O.a(5, "OldProductId must not be one of the products to be purchased. Invalid old product id: " + str12 + ".");
                                        break;
                                    }
                                } else {
                                    C0063m a7 = c0056f3.a().a();
                                    a6 = (a7 == null || a7.f871f == null) ? O.f780j : O.a(5, "Both autoPayDetails and autoPayBalanceThreshold is required for constructing ProductDetailsParams for autopay.");
                                }
                            }
                        }
                    }
                }
            }
        }
        if (a6 != O.f780j) {
            c0054d.H(120, 2, a6);
            c0054d.K(a6);
            return a6;
        }
        if (c0054d.f836m) {
            boolean z6 = c0054d.f838o;
            boolean z7 = c0054d.f845v;
            c0054d.f819A.getClass();
            boolean z8 = c0054d.f819A.f865a;
            boolean z9 = c0054d.f820B;
            String str13 = c0054d.f826c;
            long longValue = c0054d.f823E.longValue();
            final String packageName = c0054d.f829f.getPackageName();
            final Bundle bundle = new Bundle();
            AbstractC0357o0.b(bundle, str13, longValue);
            int i10 = c0059i.f859d.f854a;
            if (i10 != 0) {
                bundle.putInt("prorationMode", i10);
            }
            if (!TextUtils.isEmpty(c0059i.f857b)) {
                bundle.putString("accountId", c0059i.f857b);
            }
            if (!TextUtils.isEmpty(c0059i.f858c)) {
                bundle.putString("obfuscatedProfileId", c0059i.f858c);
            }
            if (!TextUtils.isEmpty(null)) {
                bundle.putStringArrayList("skusToReplace", new ArrayList<>(Arrays.asList(null)));
            }
            if (!TextUtils.isEmpty(c0059i.f859d.f855b)) {
                bundle.putString("oldSkuPurchaseToken", c0059i.f859d.f855b);
            }
            if (!TextUtils.isEmpty(null)) {
                bundle.putString("oldSkuPurchaseId", null);
            }
            c0059i.f859d.getClass();
            if (!TextUtils.isEmpty(null)) {
                c0059i.f859d.getClass();
                bundle.putString("originalExternalTransactionId", null);
            }
            if (!TextUtils.isEmpty(null)) {
                bundle.putString("paymentsPurchaseParams", null);
            }
            if (z6) {
                z = true;
                bundle.putBoolean("enablePendingPurchases", true);
            } else {
                z = true;
            }
            if (z7 && z8) {
                bundle.putBoolean("enablePendingPurchaseForSubscriptions", z);
            }
            if (z9) {
                bundle.putBoolean("enableAlternativeBilling", z);
            }
            final int i11 = 0;
            if (c0059i.f860e.stream().anyMatch(new Predicate() { // from class: com.google.android.gms.internal.play_billing.a
                @Override // java.util.function.Predicate
                public final boolean test(Object obj2) {
                    switch (i11) {
                        case 0:
                            int i12 = AbstractC0357o0.f5220a;
                            break;
                        default:
                            int i13 = AbstractC0357o0.f5220a;
                            break;
                    }
                    return false;
                }
            })) {
                N0 n6 = O0.n();
                final int i12 = 1;
                Iterable iterable = (Iterable) c0059i.f860e.stream().filter(new Predicate() { // from class: com.google.android.gms.internal.play_billing.a
                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj2) {
                        switch (i12) {
                            case 0:
                                int i122 = AbstractC0357o0.f5220a;
                                break;
                            default:
                                int i13 = AbstractC0357o0.f5220a;
                                break;
                        }
                        return false;
                    }
                }).map(new Function() { // from class: com.google.android.gms.internal.play_billing.s
                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        int i13 = AbstractC0357o0.f5220a;
                        String str14 = ((C0056f) obj2).f849a.f886c;
                        L0 n7 = M0.n();
                        P0 n8 = Q0.n();
                        String str15 = "subs:" + packageName + StringUtils.PROCESS_POSTFIX_DELIMITER + str14;
                        n8.d();
                        Q0.o((Q0) n8.f5183b, str15);
                        n7.d();
                        M0.o((M0) n7.f5183b, (Q0) n8.b());
                        Q0.n();
                        throw null;
                    }
                }).collect(AbstractC0359p.f5232a);
                n6.d();
                O0.o((O0) n6.f5183b, iterable);
                bundle.putByteArray("subscriptionProductReplacementParamsList", ((O0) n6.b()).b());
            }
            if (arrayList.isEmpty()) {
                ArrayList<String> arrayList2 = new ArrayList<>(c2.size() - 1);
                ArrayList<String> arrayList3 = new ArrayList<>(c2.size() - 1);
                ArrayList<String> arrayList4 = new ArrayList<>();
                ArrayList<String> arrayList5 = new ArrayList<>();
                ArrayList<String> arrayList6 = new ArrayList<>();
                ArrayList<Integer> arrayList7 = new ArrayList<>();
                str6 = "proxyPackageVersion";
                str7 = "BillingClient";
                int i13 = 0;
                while (i13 < c2.size()) {
                    C0056f c0056f6 = (C0056f) c2.get(i13);
                    C0056f c0056f7 = c0056f2;
                    C0066p c0066p2 = c0056f6.f849a;
                    if (!c0066p2.f891h.isEmpty()) {
                        arrayList4.add(c0066p2.f891h);
                    }
                    arrayList5.add(c0056f6.f850b);
                    String str14 = c0066p2.f892i;
                    ArrayList arrayList8 = c0066p2.f894k;
                    if (arrayList8 != null && !arrayList8.isEmpty()) {
                        Iterator it3 = c0066p2.f894k.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                break;
                            }
                            C0063m c0063m = (C0063m) it3.next();
                            Iterator it4 = it3;
                            if (!TextUtils.isEmpty(c0063m.f870e)) {
                                str14 = c0063m.f870e;
                                break;
                            }
                            it3 = it4;
                        }
                    }
                    if (!TextUtils.isEmpty(str14)) {
                        arrayList6.add(str14);
                    }
                    if (i13 > 0) {
                        arrayList2.add(((C0056f) c2.get(i13)).f849a.f886c);
                        arrayList3.add(((C0056f) c2.get(i13)).f849a.f887d);
                    }
                    i13++;
                    c0056f2 = c0056f7;
                }
                c0056f = c0056f2;
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
                Iterator it5 = arrayList.iterator();
                if (it5.hasNext()) {
                    it5.next().getClass();
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
                str6 = "proxyPackageVersion";
                c0056f = c0056f2;
                str7 = "BillingClient";
            }
            c0054d = this;
            if (bundle.containsKey("SKU_OFFER_ID_TOKEN_LIST") && !c0054d.f840q) {
                C0060j c0060j7 = O.f789s;
                c0054d.H(21, 2, c0060j7);
                c0054d.K(c0060j7);
                return c0060j7;
            }
            C0056f c0056f8 = c0056f;
            if (TextUtils.isEmpty(c0056f8.f849a.d())) {
                str5 = null;
                z5 = false;
            } else {
                bundle.putString("skuPackageName", c0056f8.f849a.d());
                str5 = null;
                z5 = true;
            }
            if (!TextUtils.isEmpty(str5)) {
                bundle.putString("accountName", str5);
            }
            Intent intent = abstractActivityC1515c.getIntent();
            if (intent == null) {
                str4 = str7;
                AbstractC0357o0.g(str4, "Activity's intent is null.");
            } else {
                str4 = str7;
                if (!TextUtils.isEmpty(intent.getStringExtra("PROXY_PACKAGE"))) {
                    String stringExtra = intent.getStringExtra("PROXY_PACKAGE");
                    bundle.putString("proxyPackage", stringExtra);
                    try {
                        str8 = str6;
                        try {
                            bundle.putString(str8, c0054d.f829f.getPackageManager().getPackageInfo(stringExtra, 0).versionName);
                        } catch (PackageManager.NameNotFoundException unused) {
                            bundle.putString(str8, "package not found");
                            if (!c0054d.f843t) {
                            }
                            if (!c0054d.f841r) {
                            }
                            if (c0054d.f838o) {
                            }
                        }
                    } catch (PackageManager.NameNotFoundException unused2) {
                        str8 = str6;
                    }
                }
            }
            if (!c0054d.f843t && !c2.isEmpty()) {
                i3 = 17;
            } else if (!c0054d.f841r && z5) {
                i3 = 15;
            } else if (c0054d.f838o) {
                i3 = 6;
            } else {
                i6 = 9;
                final String str15 = str3;
                final String str16 = str2;
                m6 = m(new Callable(i6, str15, str16, c0059i, bundle) { // from class: G0.x

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ int f905b;

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ String f906c;

                    /* renamed from: d, reason: collision with root package name */
                    public final /* synthetic */ String f907d;

                    /* renamed from: e, reason: collision with root package name */
                    public final /* synthetic */ Bundle f908e;

                    {
                        this.f908e = bundle;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        Bundle i14;
                        InterfaceC0323d interfaceC0323d;
                        C0054d c0054d2 = C0054d.this;
                        int i15 = this.f905b;
                        String str17 = this.f906c;
                        String str18 = this.f907d;
                        Bundle bundle2 = this.f908e;
                        c0054d2.getClass();
                        try {
                            synchronized (c0054d2.f824a) {
                                interfaceC0323d = c0054d2.f831h;
                            }
                            if (interfaceC0323d == null) {
                                return AbstractC0357o0.i(O.f781k, 119);
                            }
                            return ((C0317b) interfaceC0323d).k(i15, c0054d2.f829f.getPackageName(), str17, str18, bundle2);
                        } catch (DeadObjectException e3) {
                            C0060j c0060j8 = O.f781k;
                            String a8 = M.a(e3);
                            i14 = AbstractC0357o0.i(c0060j8, 5);
                            if (a8 != null) {
                                i14.putString("ADDITIONAL_LOG_DETAILS", a8);
                            }
                            return i14;
                        } catch (Exception e6) {
                            C0060j c0060j9 = O.f779i;
                            String a9 = M.a(e6);
                            i14 = AbstractC0357o0.i(c0060j9, 5);
                            if (a9 != null) {
                                i14.putString("ADDITIONAL_LOG_DETAILS", a9);
                            }
                            return i14;
                        }
                    }
                }, AnrConstants.DEFAULT_ANR_THRESHOLD_MS, null, c0054d.f827d, q());
            }
            i6 = i3;
            final String str152 = str3;
            final String str162 = str2;
            m6 = m(new Callable(i6, str152, str162, c0059i, bundle) { // from class: G0.x

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ int f905b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ String f906c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ String f907d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ Bundle f908e;

                {
                    this.f908e = bundle;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Bundle i14;
                    InterfaceC0323d interfaceC0323d;
                    C0054d c0054d2 = C0054d.this;
                    int i15 = this.f905b;
                    String str17 = this.f906c;
                    String str18 = this.f907d;
                    Bundle bundle2 = this.f908e;
                    c0054d2.getClass();
                    try {
                        synchronized (c0054d2.f824a) {
                            interfaceC0323d = c0054d2.f831h;
                        }
                        if (interfaceC0323d == null) {
                            return AbstractC0357o0.i(O.f781k, 119);
                        }
                        return ((C0317b) interfaceC0323d).k(i15, c0054d2.f829f.getPackageName(), str17, str18, bundle2);
                    } catch (DeadObjectException e3) {
                        C0060j c0060j8 = O.f781k;
                        String a8 = M.a(e3);
                        i14 = AbstractC0357o0.i(c0060j8, 5);
                        if (a8 != null) {
                            i14.putString("ADDITIONAL_LOG_DETAILS", a8);
                        }
                        return i14;
                    } catch (Exception e6) {
                        C0060j c0060j9 = O.f779i;
                        String a9 = M.a(e6);
                        i14 = AbstractC0357o0.i(c0060j9, 5);
                        if (a9 != null) {
                            i14.putString("ADDITIONAL_LOG_DETAILS", a9);
                        }
                        return i14;
                    }
                }
            }, AnrConstants.DEFAULT_ANR_THRESHOLD_MS, null, c0054d.f827d, q());
        } else {
            str4 = "BillingClient";
            str5 = null;
            m6 = m(new w(c0054d, str3, str2, 4), AnrConstants.DEFAULT_ANR_THRESHOLD_MS, null, c0054d.f827d, q());
        }
        try {
            if (m6 == null) {
                C0060j c0060j8 = O.f774d;
                c0054d.H(25, 2, c0060j8);
                c0054d.K(c0060j8);
                return c0060j8;
            }
            Bundle bundle2 = (Bundle) m6.get(AnrConstants.DEFAULT_ANR_THRESHOLD_MS, TimeUnit.MILLISECONDS);
            int a8 = AbstractC0357o0.a(bundle2, str4);
            String e3 = AbstractC0357o0.e(bundle2, str4);
            if (a8 == 0) {
                Intent intent2 = new Intent(abstractActivityC1515c, (Class<?>) ProxyBillingActivity.class);
                String str17 = str;
                intent2.putExtra(str17, (PendingIntent) bundle2.getParcelable(str17));
                abstractActivityC1515c.startActivity(intent2);
                return O.f780j;
            }
            AbstractC0357o0.g(str4, "Unable to buy item, Error response code: " + a8);
            C0060j a9 = O.a(a8, e3);
            if (bundle2 != null) {
                try {
                    obj = bundle2.get("LOG_REASON");
                } catch (Throwable th) {
                    AbstractC0357o0.g(str4, "Failed to get log reason from bundle: ".concat(String.valueOf(th.getMessage())));
                }
                if (obj != null) {
                    if (obj instanceof Integer) {
                        o2 = AbstractC0325d1.o(((Integer) obj).intValue());
                        i2 = 1;
                        if (o2 == i2) {
                            o2 = 23;
                        }
                        if (bundle2 != null) {
                            try {
                                str5 = bundle2.getString("ADDITIONAL_LOG_DETAILS");
                            } catch (Throwable th2) {
                                AbstractC0357o0.g(str4, "Failed to get additional log details from bundle: ".concat(String.valueOf(th2.getMessage())));
                            }
                        }
                        c0054d.I(o2, 2, a9, str5);
                        c0054d.K(a9);
                        return a9;
                    }
                    AbstractC0357o0.g(str4, "Unexpected type for bundle log reason: " + obj.getClass().getName());
                }
            }
            i2 = 1;
            o2 = 1;
            if (o2 == i2) {
            }
            if (bundle2 != null) {
            }
            c0054d.I(o2, 2, a9, str5);
            c0054d.K(a9);
            return a9;
        } catch (CancellationException e6) {
            e = e6;
            AbstractC0357o0.h(str4, "Time out while launching billing flow. Try to reconnect", e);
            C0060j c0060j9 = O.f782l;
            c0054d.I(4, 2, c0060j9, M.a(e));
            c0054d.K(c0060j9);
            return c0060j9;
        } catch (TimeoutException e7) {
            e = e7;
            AbstractC0357o0.h(str4, "Time out while launching billing flow. Try to reconnect", e);
            C0060j c0060j92 = O.f782l;
            c0054d.I(4, 2, c0060j92, M.a(e));
            c0054d.K(c0060j92);
            return c0060j92;
        } catch (Exception e8) {
            AbstractC0357o0.h(str4, "Exception while launching billing flow. Try to reconnect", e8);
            C0060j c0060j10 = O.f781k;
            c0054d.I(5, 2, c0060j10, M.a(e8));
            c0054d.K(c0060j10);
            return c0060j10;
        }
    }

    public final C0060j k(final AbstractActivityC1515c abstractActivityC1515c, final D3.g gVar) {
        if (abstractActivityC1515c == null) {
            throw new IllegalArgumentException("Please provide a valid activity.");
        }
        if (!b()) {
            C0060j c0060j = O.f781k;
            H(2, 16, c0060j);
            return c0060j;
        }
        if (!this.f847x) {
            AbstractC0357o0.g("BillingClient", "Current Play Store version doesn't support alternative billing only.");
            C0060j c0060j2 = O.f768C;
            H(66, 16, c0060j2);
            return c0060j2;
        }
        Handler handler = this.f827d;
        final z zVar = new z(this, handler, gVar);
        if (m(new Callable() { // from class: G0.T
            @Override // java.util.concurrent.Callable
            public final Object call() {
                InterfaceC0323d interfaceC0323d;
                C0054d c0054d = C0054d.this;
                D3.g gVar2 = gVar;
                AbstractActivityC1515c abstractActivityC1515c2 = abstractActivityC1515c;
                z zVar2 = zVar;
                c0054d.getClass();
                try {
                    synchronized (c0054d.f824a) {
                        interfaceC0323d = c0054d.f831h;
                    }
                    if (interfaceC0323d == null) {
                        c0054d.G(gVar2, O.f781k, 119, null);
                    } else {
                        String packageName = c0054d.f829f.getPackageName();
                        String str = c0054d.f826c;
                        long longValue = c0054d.f823E.longValue();
                        int i2 = AbstractC0357o0.f5220a;
                        Bundle bundle = new Bundle();
                        AbstractC0357o0.b(bundle, str, longValue);
                        ((C0317b) interfaceC0323d).q(packageName, bundle, new D(new WeakReference(abstractActivityC1515c2), zVar2));
                    }
                } catch (DeadObjectException e3) {
                    c0054d.G(gVar2, O.f781k, 74, e3);
                } catch (Exception e6) {
                    c0054d.G(gVar2, O.f779i, 74, e6);
                }
                return null;
            }
        }, 30000L, new A0.a(this, gVar, 14, false), handler, q()) != null) {
            return O.f780j;
        }
        C0060j n6 = n();
        H(25, 16, n6);
        return n6;
    }

    public void l(InterfaceC0055e interfaceC0055e) {
        C0060j c0060j;
        synchronized (this.f824a) {
            try {
                if (b()) {
                    c0060j = E();
                } else if (this.f825b == 1) {
                    AbstractC0357o0.g("BillingClient", "Client is already in the process of connecting to billing service.");
                    c0060j = O.f775e;
                    H(37, 6, c0060j);
                } else if (this.f825b == 3) {
                    AbstractC0357o0.g("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
                    c0060j = O.f781k;
                    H(38, 6, c0060j);
                } else {
                    t(1);
                    u();
                    AbstractC0357o0.f("BillingClient", "Starting in-app billing setup.");
                    this.f832i = new B(this, interfaceC0055e);
                    Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
                    intent.setPackage("com.android.vending");
                    List<ResolveInfo> queryIntentServices = this.f829f.getPackageManager().queryIntentServices(intent, 0);
                    int i2 = 41;
                    if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                        ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
                        i2 = 40;
                        if (serviceInfo != null) {
                            String str = serviceInfo.packageName;
                            String str2 = serviceInfo.name;
                            if (!Objects.equals(str, "com.android.vending") || str2 == null) {
                                AbstractC0357o0.g("BillingClient", "The device doesn't have valid Play Store.");
                            } else {
                                ComponentName componentName = new ComponentName(str, str2);
                                Intent intent2 = new Intent(intent);
                                intent2.setComponent(componentName);
                                intent2.putExtra("playBillingLibraryVersion", this.f826c);
                                synchronized (this.f824a) {
                                    try {
                                        if (this.f825b == 2) {
                                            c0060j = E();
                                        } else if (this.f825b != 1) {
                                            AbstractC0357o0.g("BillingClient", "Client state no longer CONNECTING, returning service disconnected.");
                                            c0060j = O.f781k;
                                            H(117, 6, c0060j);
                                        } else {
                                            B b6 = this.f832i;
                                            if (this.f829f.bindService(intent2, b6, 1)) {
                                                AbstractC0357o0.f("BillingClient", "Service was bonded successfully.");
                                                c0060j = null;
                                            } else {
                                                AbstractC0357o0.g("BillingClient", "Connection to Billing service is blocked.");
                                                i2 = 39;
                                            }
                                        }
                                    } finally {
                                    }
                                }
                            }
                        } else {
                            AbstractC0357o0.g("BillingClient", "The device doesn't have valid Play Store.");
                        }
                    }
                    t(0);
                    AbstractC0357o0.f("BillingClient", "Billing service unavailable on device.");
                    c0060j = O.f773c;
                    H(i2, 6, c0060j);
                }
            } finally {
            }
        }
        if (c0060j != null) {
            interfaceC0055e.onBillingSetupFinished(c0060j);
        }
    }

    public final C0060j n() {
        C0060j c0060j;
        int i2 = 0;
        int[] iArr = {0, 3};
        synchronized (this.f824a) {
            while (true) {
                if (i2 >= 2) {
                    c0060j = O.f779i;
                    break;
                }
                if (this.f825b == iArr[i2]) {
                    c0060j = O.f781k;
                    break;
                }
                i2++;
            }
        }
        return c0060j;
    }

    public final void o() {
        if (TextUtils.isEmpty(null)) {
            this.f829f.getPackageName();
        }
    }

    public final synchronized ExecutorService q() {
        try {
            if (this.f821C == null) {
                this.f821C = Executors.newFixedThreadPool(AbstractC0357o0.f5220a, new y());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f821C;
    }

    public final void r(Q1 q12) {
        try {
            this.f830g.j(q12, this.f835l);
        } catch (Throwable th) {
            AbstractC0357o0.h("BillingClient", "Unable to log.", th);
        }
    }

    public final void s(S1 s12) {
        try {
            B0.l lVar = this.f830g;
            int i2 = this.f835l;
            lVar.getClass();
            try {
                Z1 z12 = (Z1) ((a2) lVar.f163b).g();
                z12.d();
                a2.n((a2) z12.f5183b, i2);
                lVar.f163b = (a2) z12.b();
                lVar.k(s12);
            } catch (Throwable th) {
                AbstractC0357o0.h("BillingLogger", "Unable to log.", th);
            }
        } catch (Throwable th2) {
            AbstractC0357o0.h("BillingClient", "Unable to log.", th2);
        }
    }

    public final void t(int i2) {
        synchronized (this.f824a) {
            try {
                if (this.f825b == 3) {
                    return;
                }
                int i3 = this.f825b;
                AbstractC0357o0.f("BillingClient", "Setting clientState from " + (i3 != 0 ? i3 != 1 ? i3 != 2 ? "CLOSED" : "CONNECTED" : "CONNECTING" : "DISCONNECTED") + " to " + (i2 != 0 ? i2 != 1 ? i2 != 2 ? "CLOSED" : "CONNECTED" : "CONNECTING" : "DISCONNECTED"));
                this.f825b = i2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void u() {
        synchronized (this.f824a) {
            if (this.f832i != null) {
                try {
                    this.f829f.unbindService(this.f832i);
                } catch (Throwable th) {
                    try {
                        AbstractC0357o0.h("BillingClient", "There was an exception while unbinding service!", th);
                        this.f831h = null;
                        this.f832i = null;
                    } finally {
                        this.f831h = null;
                        this.f832i = null;
                    }
                }
            }
        }
    }

    public final B3.d v(C0060j c0060j, int i2, String str, Exception exc) {
        AbstractC0357o0.h("BillingClient", str, exc);
        I(i2, 7, c0060j, M.a(exc));
        return new B3.d(c0060j.f862a, c0060j.f863b, new ArrayList());
    }

    public final B0.e w(C0060j c0060j, int i2, String str, Exception exc) {
        AbstractC0357o0.h("BillingClient", str, exc);
        I(i2, 11, c0060j, M.a(exc));
        return new B0.e(c0060j, null);
    }

    public final B0.t x(C0060j c0060j, int i2, String str, Exception exc) {
        I(i2, 9, c0060j, M.a(exc));
        AbstractC0357o0.h("BillingClient", str, exc);
        return new B0.t(c0060j, 2, null);
    }

    public final void y(int i2, int i3, C0060j c0060j) {
        S1 s12 = null;
        Q1 q12 = null;
        if (c0060j.f862a == 0) {
            int i6 = M.f765a;
            try {
                R1 q5 = S1.q();
                q5.d();
                S1.p((S1) q5.f5183b, 5);
                c2 o2 = e2.o();
                o2.d();
                e2.n((e2) o2.f5183b, i3);
                e2 e2Var = (e2) o2.b();
                q5.d();
                S1.n((S1) q5.f5183b, e2Var);
                s12 = (S1) q5.b();
            } catch (Exception e3) {
                AbstractC0357o0.h("BillingLogger", "Unable to create logging payload", e3);
            }
            s(s12);
            return;
        }
        int i7 = M.f765a;
        try {
            P1 r5 = Q1.r();
            T1 r6 = U1.r();
            r6.e(c0060j.f862a);
            String str = c0060j.f863b;
            r6.d();
            U1.o((U1) r6.f5183b, str);
            r6.f(i2);
            r5.e(r6);
            r5.f(5);
            c2 o5 = e2.o();
            o5.d();
            e2.n((e2) o5.f5183b, i3);
            e2 e2Var2 = (e2) o5.b();
            r5.d();
            Q1.p((Q1) r5.f5183b, e2Var2);
            q12 = (Q1) r5.b();
        } catch (Exception e6) {
            AbstractC0357o0.h("BillingLogger", "Unable to create logging payload", e6);
        }
        r(q12);
    }

    public final void z(D3.g gVar, C0060j c0060j, int i2, Exception exc) {
        AbstractC0357o0.h("BillingClient", "Error in acknowledge purchase!", exc);
        I(i2, 3, c0060j, M.a(exc));
        gVar.f(c0060j);
    }

    public C0054d(Context context) {
        this.f824a = new Object();
        this.f825b = 0;
        this.f827d = new Handler(Looper.getMainLooper());
        this.f835l = 0;
        long nextLong = new Random().nextLong();
        this.f823E = Long.valueOf(nextLong);
        String p5 = p();
        this.f826c = p5;
        this.f829f = context.getApplicationContext();
        Z1 r5 = a2.r();
        r5.d();
        a2.q((a2) r5.f5183b, p5);
        String packageName = this.f829f.getPackageName();
        r5.d();
        a2.p((a2) r5.f5183b, packageName);
        r5.d();
        a2.o((a2) r5.f5183b, nextLong);
        this.f830g = new B0.l(this.f829f, (a2) r5.b());
        this.f829f.getPackageName();
    }

    public C0054d(C0062l c0062l, Context context, InterfaceC0069t interfaceC0069t) {
        String p5 = p();
        this.f824a = new Object();
        this.f825b = 0;
        this.f827d = new Handler(Looper.getMainLooper());
        this.f835l = 0;
        long nextLong = new Random().nextLong();
        this.f823E = Long.valueOf(nextLong);
        this.f826c = p5;
        this.f829f = context.getApplicationContext();
        Z1 r5 = a2.r();
        r5.d();
        a2.q((a2) r5.f5183b, p5);
        String packageName = this.f829f.getPackageName();
        r5.d();
        a2.p((a2) r5.f5183b, packageName);
        r5.d();
        a2.o((a2) r5.f5183b, nextLong);
        this.f830g = new B0.l(this.f829f, (a2) r5.b());
        if (interfaceC0069t == null) {
            AbstractC0357o0.g("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.f828e = new S(this.f829f, interfaceC0069t, null, this.f830g);
        this.f819A = c0062l;
        this.f820B = false;
        this.f829f.getPackageName();
    }

    public C0054d(C0062l c0062l, Context context, InterfaceC0069t interfaceC0069t, C0097a c0097a) {
        String p5 = p();
        this.f824a = new Object();
        this.f825b = 0;
        this.f827d = new Handler(Looper.getMainLooper());
        this.f835l = 0;
        long nextLong = new Random().nextLong();
        this.f823E = Long.valueOf(nextLong);
        this.f826c = p5;
        this.f829f = context.getApplicationContext();
        Z1 r5 = a2.r();
        r5.d();
        a2.q((a2) r5.f5183b, p5);
        String packageName = this.f829f.getPackageName();
        r5.d();
        a2.p((a2) r5.f5183b, packageName);
        r5.d();
        a2.o((a2) r5.f5183b, nextLong);
        this.f830g = new B0.l(this.f829f, (a2) r5.b());
        if (interfaceC0069t == null) {
            AbstractC0357o0.g("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.f828e = new S(this.f829f, interfaceC0069t, c0097a, this.f830g);
        this.f819A = c0062l;
        this.f820B = c0097a != null;
    }
}
