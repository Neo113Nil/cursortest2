package p155w1;

import A1.x0;
import B4.V;
import O1.c;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import com.flurry.android.marketing.core.b;
import io.flutter.view.r;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p028d6.k;
import p136t.e;
import p145u1.j;

/* JADX INFO: renamed from: w1.w0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1046w0 extends AbstractC1056z1 {

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static volatile C1046w0 f17904K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final Object f17905L = new Object();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final V f17906A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final r f17907B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final c f17908C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final Handler f17909D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final ConcurrentHashMap f17910E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final HashMap f17911F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public volatile boolean f17912G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public volatile boolean f17913H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public volatile boolean f17914I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public int f17915J;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public k f17916z;

    public C1046w0() {
        super(AbstractC1044v1.a(EnumC1038t1.f17874f), false);
        this.f17910E = new ConcurrentHashMap();
        this.f17911F = new HashMap();
        this.f17912G = false;
        this.f17913H = false;
        this.f17914I = false;
        this.f17915J = 4;
        for (C1055z0 c1055z0 : C1055z0.f17946b.values()) {
            HashMap map = this.f17911F;
            Boolean bool = Boolean.FALSE;
            map.put(c1055z0, new Pair(bool, bool));
        }
        this.f17906A = new V(28);
        r rVar = new r();
        synchronized (rVar) {
            rVar.o();
            rVar.f14358c = new HashMap();
            Iterator it = C1055z0.f17946b.values().iterator();
            while (it.hasNext()) {
                ((HashMap) rVar.f14358c).put((C1055z0) it.next(), new HashMap());
            }
        }
        this.f17907B = rVar;
        c cVar = new c();
        cVar.f4933a = 0L;
        cVar.f4934b = 604800000L;
        cVar.f4936d = new Object();
        Context context = AbstractC0998i1.f17749c;
        if (context != null) {
            cVar.f4933a = AbstractC0998i1.m(context);
            cVar.f4934b = AbstractC0998i1.i("refreshFetch", 604800000L);
        }
        this.f17908C = cVar;
        this.f17909D = new Handler(Looper.getMainLooper());
        d(new C1008l(this, 6));
    }

    public static synchronized C1046w0 h() {
        C1046w0 c1046w0;
        synchronized (C1046w0.class) {
            try {
                if (f17904K == null) {
                    f17904K = new C1046w0();
                }
                c1046w0 = f17904K;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1046w0;
        return c1046w0;
    }

    public static /* synthetic */ void l(C1046w0 c1046w0) {
        Object obj = f17905L;
        synchronized (obj) {
            c1046w0.f17912G = true;
            obj.notifyAll();
        }
    }

    public final void i(j jVar, C1055z0 c1055z0) {
        if (jVar == null) {
            return;
        }
        synchronized (this.f17910E) {
            try {
                if (this.f17910E.containsKey(jVar)) {
                    return;
                }
                this.f17910E.put(jVar, new Pair(c1055z0, new WeakReference(null)));
                int i7 = AbstractC1043v0.f17896a[e.e(this.f17915J)];
                if (i7 == 2) {
                    jVar.f();
                } else if (i7 == 3) {
                    jVar.e();
                } else if (i7 == 4) {
                    jVar.d(this.f17913H);
                }
                if (this.f17911F.containsKey(c1055z0)) {
                    Pair pair = (Pair) this.f17911F.get(c1055z0);
                    if (((Boolean) pair.first).booleanValue() || ((Boolean) pair.second).booleanValue()) {
                        jVar.c(!((Boolean) pair.second).booleanValue());
                    }
                } else {
                    HashMap map = this.f17911F;
                    Boolean bool = Boolean.FALSE;
                    map.put(c1055z0, new Pair(bool, bool));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void j(C1055z0 c1055z0, boolean z4) {
        synchronized (this.f17910E) {
            try {
                for (Map.Entry entry : this.f17910E.entrySet()) {
                    if (c1055z0 == null || c1055z0 == ((Pair) entry.getValue()).first) {
                        j jVar = (j) entry.getKey();
                        Handler handler = (Handler) ((WeakReference) ((Pair) entry.getValue()).second).get();
                        b bVar = new b(jVar, z4, 1);
                        if (handler == null) {
                            this.f17909D.post(bVar);
                        } else {
                            handler.post(bVar);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean k(C1055z0 c1055z0) {
        boolean z4;
        if (!this.f17914I) {
            return false;
        }
        if (c1055z0 == null) {
            z4 = false;
            for (Map.Entry entry : this.f17911F.entrySet()) {
                Pair pair = (Pair) entry.getValue();
                if (!((Boolean) pair.second).booleanValue()) {
                    entry.setValue(new Pair((Boolean) pair.first, Boolean.TRUE));
                    z4 = true;
                }
            }
        } else {
            Pair pair2 = (Pair) this.f17911F.get(c1055z0);
            if (pair2 == null || !((Boolean) pair2.second).booleanValue()) {
                this.f17911F.put(c1055z0, new Pair(Boolean.valueOf(pair2 == null ? false : ((Boolean) pair2.first).booleanValue()), Boolean.TRUE));
                z4 = true;
            } else {
                z4 = false;
            }
        }
        if (z4) {
            r rVar = this.f17907B;
            synchronized (rVar) {
                ((HashMap) rVar.f14358c).keySet().toString();
                ((HashMap) rVar.f14357b).values().toString();
                r.g((HashMap) rVar.f14359d, (HashMap) rVar.f14358c, c1055z0, true);
                ((HashMap) rVar.f14358c).keySet().toString();
            }
            j(c1055z0, false);
        }
        return z4;
    }

    public final void m() {
        if (this.f17913H) {
            return;
        }
        this.f17913H = true;
        C0 c0 = new C0();
        c0.f17311a = "https://cfg.flurry.com/sdk/v1/config";
        StringBuilder sb = new StringBuilder("Flurry-Config/1.0 (Android ");
        sb.append(Build.VERSION.RELEASE);
        sb.append("/");
        C0.f17308C = p031e1.k.i(sb, Build.ID, ")");
        x0 x0Var = new x0(this, 20);
        c cVar = this.f17908C;
        r rVar = this.f17907B;
        ArrayList<A0> arrayList = new ArrayList();
        arrayList.add(new A0(c0, x0Var, cVar, rVar));
        for (A0 a2 : arrayList) {
            synchronized (a2) {
                AbstractC0997i0.o(3, "Starting Config fetch.");
                a2.d(new C1008l(a2, 5));
            }
        }
    }

    public final void n() {
        Object obj = f17905L;
        synchronized (obj) {
            if (!this.f17912G) {
                try {
                    obj.wait(3000L);
                } catch (InterruptedException e7) {
                    AbstractC0997i0.r("Interrupted Exception!", e7);
                }
            }
        }
    }

    public final String toString() {
        ArrayList arrayListA;
        n();
        ArrayList arrayList = new ArrayList();
        r rVar = this.f17907B;
        if (rVar != null) {
            synchronized (rVar) {
                arrayListA = rVar.a((HashMap) rVar.f14357b);
            }
        } else {
            arrayListA = null;
        }
        if (arrayListA == null || arrayListA.isEmpty()) {
            return "No variants were found!";
        }
        Iterator it = arrayListA.iterator();
        while (it.hasNext()) {
            arrayList.add(((B0) it.next()).toString());
        }
        return TextUtils.join(",", arrayList);
    }
}
