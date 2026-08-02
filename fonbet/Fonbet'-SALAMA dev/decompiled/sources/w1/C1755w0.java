package w1;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import d6.C0977k;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: w1.w0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1755w0 extends AbstractC1765z1 {

    /* renamed from: K, reason: collision with root package name */
    public static volatile C1755w0 f17898K;

    /* renamed from: L, reason: collision with root package name */
    public static final Object f17899L = new Object();

    /* renamed from: A, reason: collision with root package name */
    public final B4.V f17900A;

    /* renamed from: B, reason: collision with root package name */
    public final io.flutter.view.r f17901B;

    /* renamed from: C, reason: collision with root package name */
    public final O1.c f17902C;

    /* renamed from: D, reason: collision with root package name */
    public final Handler f17903D;

    /* renamed from: E, reason: collision with root package name */
    public final ConcurrentHashMap f17904E;

    /* renamed from: F, reason: collision with root package name */
    public final HashMap f17905F;

    /* renamed from: G, reason: collision with root package name */
    public volatile boolean f17906G;

    /* renamed from: H, reason: collision with root package name */
    public volatile boolean f17907H;

    /* renamed from: I, reason: collision with root package name */
    public volatile boolean f17908I;

    /* renamed from: J, reason: collision with root package name */
    public int f17909J;

    /* renamed from: z, reason: collision with root package name */
    public C0977k f17910z;

    public C1755w0() {
        super(AbstractC1753v1.a(EnumC1747t1.f17868f), false);
        this.f17904E = new ConcurrentHashMap();
        this.f17905F = new HashMap();
        this.f17906G = false;
        this.f17907H = false;
        this.f17908I = false;
        this.f17909J = 4;
        for (C1764z0 c1764z0 : C1764z0.f17940b.values()) {
            HashMap hashMap = this.f17905F;
            Boolean bool = Boolean.FALSE;
            hashMap.put(c1764z0, new Pair(bool, bool));
        }
        this.f17900A = new B4.V(28);
        io.flutter.view.r rVar = new io.flutter.view.r();
        synchronized (rVar) {
            rVar.o();
            rVar.f14352c = new HashMap();
            Iterator it = C1764z0.f17940b.values().iterator();
            while (it.hasNext()) {
                ((HashMap) rVar.f14352c).put((C1764z0) it.next(), new HashMap());
            }
        }
        this.f17901B = rVar;
        O1.c cVar = new O1.c();
        cVar.f4933a = 0L;
        cVar.f4934b = 604800000L;
        cVar.f4936d = new Object();
        Context context = AbstractC1707i1.f17743c;
        if (context != null) {
            cVar.f4933a = AbstractC1707i1.m(context);
            cVar.f4934b = AbstractC1707i1.i("refreshFetch", 604800000L);
        }
        this.f17902C = cVar;
        this.f17903D = new Handler(Looper.getMainLooper());
        d(new C1717l(this, 6));
    }

    public static synchronized C1755w0 h() {
        C1755w0 c1755w0;
        synchronized (C1755w0.class) {
            synchronized (C1755w0.class) {
                try {
                    if (f17898K == null) {
                        f17898K = new C1755w0();
                    }
                    c1755w0 = f17898K;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return c1755w0;
        }
        return c1755w0;
    }

    public static /* synthetic */ void l(C1755w0 c1755w0) {
        Object obj = f17899L;
        synchronized (obj) {
            c1755w0.f17906G = true;
            obj.notifyAll();
        }
    }

    public final void i(u1.j jVar, C1764z0 c1764z0) {
        if (jVar == null) {
            return;
        }
        synchronized (this.f17904E) {
            try {
                if (this.f17904E.containsKey(jVar)) {
                    return;
                }
                this.f17904E.put(jVar, new Pair(c1764z0, new WeakReference(null)));
                int i7 = AbstractC1752v0.f17890a[t.e.e(this.f17909J)];
                if (i7 == 2) {
                    jVar.f();
                } else if (i7 == 3) {
                    jVar.e();
                } else if (i7 == 4) {
                    jVar.d(this.f17907H);
                }
                if (this.f17905F.containsKey(c1764z0)) {
                    Pair pair = (Pair) this.f17905F.get(c1764z0);
                    if (((Boolean) pair.first).booleanValue() || ((Boolean) pair.second).booleanValue()) {
                        jVar.c(!((Boolean) pair.second).booleanValue());
                    }
                } else {
                    HashMap hashMap = this.f17905F;
                    Boolean bool = Boolean.FALSE;
                    hashMap.put(c1764z0, new Pair(bool, bool));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void j(C1764z0 c1764z0, boolean z4) {
        synchronized (this.f17904E) {
            try {
                for (Map.Entry entry : this.f17904E.entrySet()) {
                    if (c1764z0 != null && c1764z0 != ((Pair) entry.getValue()).first) {
                    }
                    u1.j jVar = (u1.j) entry.getKey();
                    Handler handler = (Handler) ((WeakReference) ((Pair) entry.getValue()).second).get();
                    com.flurry.android.marketing.core.b bVar = new com.flurry.android.marketing.core.b(jVar, z4, 1);
                    if (handler == null) {
                        this.f17903D.post(bVar);
                    } else {
                        handler.post(bVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean k(C1764z0 c1764z0) {
        boolean z4;
        if (!this.f17908I) {
            return false;
        }
        if (c1764z0 == null) {
            z4 = false;
            for (Map.Entry entry : this.f17905F.entrySet()) {
                Pair pair = (Pair) entry.getValue();
                if (!((Boolean) pair.second).booleanValue()) {
                    entry.setValue(new Pair((Boolean) pair.first, Boolean.TRUE));
                    z4 = true;
                }
            }
        } else {
            Pair pair2 = (Pair) this.f17905F.get(c1764z0);
            if (pair2 == null || !((Boolean) pair2.second).booleanValue()) {
                this.f17905F.put(c1764z0, new Pair(Boolean.valueOf(pair2 == null ? false : ((Boolean) pair2.first).booleanValue()), Boolean.TRUE));
                z4 = true;
            } else {
                z4 = false;
            }
        }
        if (z4) {
            io.flutter.view.r rVar = this.f17901B;
            synchronized (rVar) {
                ((HashMap) rVar.f14352c).keySet().toString();
                ((HashMap) rVar.f14351b).values().toString();
                io.flutter.view.r.g((HashMap) rVar.f14353d, (HashMap) rVar.f14352c, c1764z0, true);
                ((HashMap) rVar.f14352c).keySet().toString();
            }
            j(c1764z0, false);
        }
        return z4;
    }

    public final void m() {
        if (this.f17907H) {
            return;
        }
        this.f17907H = true;
        C0 c0 = new C0();
        c0.f17305a = "https://cfg.flurry.com/sdk/v1/config";
        StringBuilder sb = new StringBuilder("Flurry-Config/1.0 (Android ");
        sb.append(Build.VERSION.RELEASE);
        sb.append("/");
        C0.f17302C = e1.k.i(sb, Build.ID, ")");
        A1.x0 x0Var = new A1.x0(this, 20);
        O1.c cVar = this.f17902C;
        io.flutter.view.r rVar = this.f17901B;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new A0(c0, x0Var, cVar, rVar));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            A0 a02 = (A0) it.next();
            synchronized (a02) {
                AbstractC1706i0.o(3, "Starting Config fetch.");
                a02.d(new C1717l(a02, 5));
            }
        }
    }

    public final void n() {
        Object obj = f17899L;
        synchronized (obj) {
            if (!this.f17906G) {
                try {
                    obj.wait(3000L);
                } catch (InterruptedException e7) {
                    AbstractC1706i0.r("Interrupted Exception!", e7);
                }
            }
        }
    }

    public final String toString() {
        ArrayList arrayList;
        n();
        ArrayList arrayList2 = new ArrayList();
        io.flutter.view.r rVar = this.f17901B;
        if (rVar != null) {
            synchronized (rVar) {
                arrayList = rVar.a((HashMap) rVar.f14351b);
            }
        } else {
            arrayList = null;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return "No variants were found!";
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((B0) it.next()).toString());
        }
        return TextUtils.join(",", arrayList2);
    }
}
