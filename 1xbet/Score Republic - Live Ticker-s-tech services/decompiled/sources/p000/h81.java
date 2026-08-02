package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class h81 implements h11 {

    /* JADX INFO: renamed from: C */
    public static final boolean f3097C = Log.isLoggable("GlideRequest", 2);

    /* JADX INFO: renamed from: A */
    public final RuntimeException f3098A;

    /* JADX INFO: renamed from: B */
    public int f3099B;

    /* JADX INFO: renamed from: a */
    public final String f3100a;

    /* JADX INFO: renamed from: b */
    public final ga1 f3101b;

    /* JADX INFO: renamed from: c */
    public final Object f3102c;

    /* JADX INFO: renamed from: d */
    public final k11 f3103d;

    /* JADX INFO: renamed from: e */
    public final Context f3104e;

    /* JADX INFO: renamed from: f */
    public final q80 f3105f;

    /* JADX INFO: renamed from: g */
    public final Object f3106g;

    /* JADX INFO: renamed from: h */
    public final Class f3107h;

    /* JADX INFO: renamed from: i */
    public final AbstractC0649rb f3108i;

    /* JADX INFO: renamed from: j */
    public final int f3109j;

    /* JADX INFO: renamed from: k */
    public final int f3110k;

    /* JADX INFO: renamed from: l */
    public final ex0 f3111l;

    /* JADX INFO: renamed from: m */
    public final AbstractC0846wn f3112m;

    /* JADX INFO: renamed from: n */
    public final List f3113n;

    /* JADX INFO: renamed from: o */
    public final x80 f3114o;

    /* JADX INFO: renamed from: p */
    public final iw1 f3115p;

    /* JADX INFO: renamed from: q */
    public v11 f3116q;

    /* JADX INFO: renamed from: r */
    public qd0 f3117r;

    /* JADX INFO: renamed from: s */
    public long f3118s;

    /* JADX INFO: renamed from: t */
    public volatile C0892xw f3119t;

    /* JADX INFO: renamed from: u */
    public Drawable f3120u;

    /* JADX INFO: renamed from: v */
    public Drawable f3121v;

    /* JADX INFO: renamed from: w */
    public Drawable f3122w;

    /* JADX INFO: renamed from: x */
    public int f3123x;

    /* JADX INFO: renamed from: y */
    public int f3124y;

    /* JADX INFO: renamed from: z */
    public boolean f3125z;

    public h81(Context context, q80 q80Var, Object obj, Object obj2, Class cls, AbstractC0649rb abstractC0649rb, int i, int i2, ex0 ex0Var, AbstractC0846wn abstractC0846wn, ArrayList arrayList, k11 k11Var, C0892xw c0892xw, x80 x80Var) {
        iw1 iw1Var = wm1.f8586a;
        this.f3100a = f3097C ? String.valueOf(hashCode()) : null;
        this.f3101b = new ga1();
        this.f3102c = obj;
        this.f3104e = context;
        this.f3105f = q80Var;
        this.f3106g = obj2;
        this.f3107h = cls;
        this.f3108i = abstractC0649rb;
        this.f3109j = i;
        this.f3110k = i2;
        this.f3111l = ex0Var;
        this.f3112m = abstractC0846wn;
        this.f3113n = arrayList;
        this.f3103d = k11Var;
        this.f3119t = c0892xw;
        this.f3114o = x80Var;
        this.f3115p = iw1Var;
        this.f3099B = 1;
        if (this.f3098A == null && ((Map) q80Var.f6411g.f793k).containsKey(n80.class)) {
            this.f3098A = new RuntimeException("Glide request origin trace");
        }
    }

    @Override // p000.h11
    /* JADX INFO: renamed from: a */
    public final boolean mo2194a() {
        boolean z;
        synchronized (this.f3102c) {
            z = this.f3099B == 4;
        }
        return z;
    }

    @Override // p000.h11
    /* JADX INFO: renamed from: b */
    public final boolean mo2195b(h11 h11Var) {
        int i;
        int i2;
        Object obj;
        Class cls;
        AbstractC0649rb abstractC0649rb;
        ex0 ex0Var;
        int size;
        int i3;
        int i4;
        Object obj2;
        Class cls2;
        AbstractC0649rb abstractC0649rb2;
        ex0 ex0Var2;
        int size2;
        boolean zEquals;
        boolean zM4289e;
        if (!(h11Var instanceof h81)) {
            return false;
        }
        synchronized (this.f3102c) {
            try {
                i = this.f3109j;
                i2 = this.f3110k;
                obj = this.f3106g;
                cls = this.f3107h;
                abstractC0649rb = this.f3108i;
                ex0Var = this.f3111l;
                List list = this.f3113n;
                size = list != null ? list.size() : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        h81 h81Var = (h81) h11Var;
        synchronized (h81Var.f3102c) {
            try {
                i3 = h81Var.f3109j;
                i4 = h81Var.f3110k;
                obj2 = h81Var.f3106g;
                cls2 = h81Var.f3107h;
                abstractC0649rb2 = h81Var.f3108i;
                ex0Var2 = h81Var.f3111l;
                List list2 = h81Var.f3113n;
                size2 = list2 != null ? list2.size() : 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (i == i3 && i2 == i4) {
            if (obj == null) {
                zEquals = obj2 == null;
            } else {
                zEquals = obj.equals(obj2);
            }
            if (zEquals && cls.equals(cls2)) {
                if (abstractC0649rb == null) {
                    zM4289e = abstractC0649rb2 == null;
                } else {
                    zM4289e = abstractC0649rb.m4289e(abstractC0649rb2);
                }
                if (zM4289e && ex0Var == ex0Var2 && size == size2) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final void m2229c() {
        if (this.f3125z) {
            C0270h1.m2191g("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
            return;
        }
        this.f3101b.m2011a();
        this.f3112m.getClass();
        qd0 qd0Var = this.f3117r;
        if (qd0Var != null) {
            synchronized (((C0892xw) qd0Var.f6473m)) {
                ((C0078bx) qd0Var.f6471k).m795g((h81) qd0Var.f6472l);
            }
            this.f3117r = null;
        }
    }

    @Override // p000.h11
    public final void clear() {
        synchronized (this.f3102c) {
            try {
                if (this.f3125z) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.f3101b.m2011a();
                if (this.f3099B == 6) {
                    return;
                }
                m2229c();
                v11 v11Var = this.f3116q;
                if (v11Var != null) {
                    this.f3116q = null;
                } else {
                    v11Var = null;
                }
                k11 k11Var = this.f3103d;
                if (k11Var == null || k11Var.mo2341c(this)) {
                    this.f3112m.mo551d(m2230d());
                }
                this.f3099B = 6;
                if (v11Var != null) {
                    this.f3119t.getClass();
                    C0892xw.m5692f(v11Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final Drawable m2230d() {
        if (this.f3121v == null) {
            AbstractC0649rb abstractC0649rb = this.f3108i;
            abstractC0649rb.getClass();
            this.f3121v = null;
            int i = abstractC0649rb.f6781m;
            if (i > 0) {
                abstractC0649rb.getClass();
                Context context = this.f3104e;
                this.f3121v = yd0.m5768g(context, context, i, context.getTheme());
            }
        }
        return this.f3121v;
    }

    /* JADX INFO: renamed from: e */
    public final void m2231e(String str) {
        Log.v("GlideRequest", str + " this: " + this.f3100a);
    }

    /* JADX INFO: renamed from: f */
    public final void m2232f(t80 t80Var, int i) {
        Drawable drawableM2230d;
        this.f3101b.m2011a();
        synchronized (this.f3102c) {
            try {
                t80Var.getClass();
                int i2 = this.f3105f.f6412h;
                if (i2 <= i) {
                    Log.w("Glide", "Load failed for [" + this.f3106g + "] with dimensions [" + this.f3123x + "x" + this.f3124y + "]", t80Var);
                    if (i2 <= 4) {
                        t80Var.m4762d();
                    }
                }
                this.f3117r = null;
                this.f3099B = 5;
                k11 k11Var = this.f3103d;
                if (k11Var != null) {
                    k11Var.mo2343e(this);
                }
                boolean z = true;
                this.f3125z = true;
                try {
                    List<r80> list = this.f3113n;
                    if (list != null) {
                        for (r80 r80Var : list) {
                            k11 k11Var2 = this.f3103d;
                            if (k11Var2 != null) {
                                k11Var2.getRoot().mo2194a();
                            }
                            r80Var.m4275a(t80Var);
                        }
                    }
                    k11 k11Var3 = this.f3103d;
                    if (k11Var3 != null && !k11Var3.mo2342d(this)) {
                        z = false;
                    }
                    if (z) {
                        if (this.f3106g == null) {
                            if (this.f3122w == null) {
                                this.f3108i.getClass();
                                this.f3122w = null;
                            }
                            drawableM2230d = this.f3122w;
                        } else {
                            drawableM2230d = null;
                        }
                        if (drawableM2230d == null) {
                            if (this.f3120u == null) {
                                this.f3108i.getClass();
                                this.f3120u = null;
                            }
                            drawableM2230d = this.f3120u;
                        }
                        if (drawableM2230d == null) {
                            drawableM2230d = m2230d();
                        }
                        this.f3112m.mo552e(drawableM2230d);
                    }
                    this.f3125z = false;
                } catch (Throwable th) {
                    this.f3125z = false;
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m2233g(v11 v11Var, int i) {
        this.f3101b.m2011a();
        v11 v11Var2 = null;
        try {
            synchronized (this.f3102c) {
                try {
                    this.f3117r = null;
                    if (v11Var == null) {
                        m2232f(new t80("Expected to receive a Resource<R> with an object of " + this.f3107h + " inside, but instead got null."), 5);
                        return;
                    }
                    Object obj = v11Var.get();
                    try {
                        if (obj == null || !this.f3107h.isAssignableFrom(obj.getClass())) {
                            this.f3116q = null;
                            StringBuilder sb = new StringBuilder("Expected to receive an object of ");
                            sb.append(this.f3107h);
                            sb.append(" but instead got ");
                            sb.append(obj != null ? obj.getClass() : "");
                            sb.append("{");
                            sb.append(obj);
                            sb.append("} inside Resource{");
                            sb.append(v11Var);
                            sb.append("}.");
                            sb.append(obj != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                            m2232f(new t80(sb.toString()), 5);
                        } else {
                            k11 k11Var = this.f3103d;
                            if (k11Var == null || k11Var.mo2344f(this)) {
                                m2234l(v11Var, obj, i);
                                return;
                            } else {
                                this.f3116q = null;
                                this.f3099B = 4;
                            }
                        }
                        this.f3119t.getClass();
                        C0892xw.m5692f(v11Var);
                    } catch (Throwable th) {
                        v11Var2 = v11Var;
                        th = th;
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable th3) {
            if (v11Var2 != null) {
                this.f3119t.getClass();
                C0892xw.m5692f(v11Var2);
            }
            throw th3;
        }
    }

    @Override // p000.h11
    /* JADX INFO: renamed from: h */
    public final boolean mo2196h() {
        boolean z;
        synchronized (this.f3102c) {
            z = this.f3099B == 6;
        }
        return z;
    }

    @Override // p000.h11
    /* JADX INFO: renamed from: i */
    public final void mo2197i() {
        synchronized (this.f3102c) {
            try {
                if (isRunning()) {
                    clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.h11
    public final boolean isRunning() {
        boolean z;
        synchronized (this.f3102c) {
            int i = this.f3099B;
            z = i == 2 || i == 3;
        }
        return z;
    }

    @Override // p000.h11
    /* JADX INFO: renamed from: j */
    public final void mo2198j() {
        synchronized (this.f3102c) {
            try {
                if (this.f3125z) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.f3101b.m2011a();
                int i = hk0.f3252b;
                this.f3118s = SystemClock.elapsedRealtimeNanos();
                if (this.f3106g == null) {
                    if (zg1.m5903n(this.f3109j, this.f3110k)) {
                        this.f3123x = this.f3109j;
                        this.f3124y = this.f3110k;
                    }
                    if (this.f3122w == null) {
                        this.f3108i.getClass();
                        this.f3122w = null;
                    }
                    m2232f(new t80("Received null model"), this.f3122w == null ? 5 : 3);
                    return;
                }
                int i2 = this.f3099B;
                if (i2 == 2) {
                    throw new IllegalArgumentException("Cannot restart a running request");
                }
                if (i2 == 4) {
                    m2233g(this.f3116q, 5);
                    return;
                }
                List<r80> list = this.f3113n;
                if (list != null) {
                    for (r80 r80Var : list) {
                    }
                }
                this.f3099B = 3;
                if (zg1.m5903n(this.f3109j, this.f3110k)) {
                    m2235m(this.f3109j, this.f3110k);
                } else {
                    AbstractC0846wn abstractC0846wn = this.f3112m;
                    m2235m(abstractC0846wn.f8589j, abstractC0846wn.f8590k);
                }
                int i3 = this.f3099B;
                if (i3 == 2 || i3 == 3) {
                    k11 k11Var = this.f3103d;
                    if (k11Var == null || k11Var.mo2342d(this)) {
                        AbstractC0846wn abstractC0846wn2 = this.f3112m;
                        m2230d();
                        abstractC0846wn2.getClass();
                    }
                }
                if (f3097C) {
                    m2231e("finished run method in " + hk0.m2289a(this.f3118s));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.h11
    /* JADX INFO: renamed from: k */
    public final boolean mo2199k() {
        boolean z;
        synchronized (this.f3102c) {
            z = this.f3099B == 4;
        }
        return z;
    }

    /* JADX INFO: renamed from: l */
    public final void m2234l(v11 v11Var, Object obj, int i) {
        k11 k11Var = this.f3103d;
        if (k11Var != null) {
            k11Var.getRoot().mo2194a();
        }
        this.f3099B = 4;
        this.f3116q = v11Var;
        if (this.f3105f.f6412h <= 3) {
            Log.d("Glide", "Finished loading " + obj.getClass().getSimpleName() + " from " + AbstractC0024an.m293p(i) + " for " + this.f3106g + " with size [" + this.f3123x + "x" + this.f3124y + "] in " + hk0.m2289a(this.f3118s) + " ms");
        }
        if (k11Var != null) {
            k11Var.mo2345g(this);
        }
        this.f3125z = true;
        try {
            List list = this.f3113n;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((r80) it.next()).getClass();
                    m80.m3343j("Image Downloading  Success : " + ((Drawable) obj));
                }
            }
            this.f3114o.getClass();
            this.f3112m.mo553f(obj);
        } finally {
            this.f3125z = false;
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m2235m(int i, int i2) throws Throwable {
        Object obj;
        int iRound = i;
        this.f3101b.m2011a();
        Object obj2 = this.f3102c;
        synchronized (obj2) {
            try {
                try {
                    boolean z = f3097C;
                    if (z) {
                        m2231e("Got onSizeReady in " + hk0.m2289a(this.f3118s));
                    }
                    if (this.f3099B != 3) {
                        return;
                    }
                    this.f3099B = 2;
                    this.f3108i.getClass();
                    if (iRound != Integer.MIN_VALUE) {
                        iRound = Math.round(iRound * 1.0f);
                    }
                    this.f3123x = iRound;
                    this.f3124y = i2 == Integer.MIN_VALUE ? i2 : Math.round(1.0f * i2);
                    if (z) {
                        m2231e("finished setup for calling load in " + hk0.m2289a(this.f3118s));
                    }
                    C0892xw c0892xw = this.f3119t;
                    q80 q80Var = this.f3105f;
                    Object obj3 = this.f3106g;
                    AbstractC0649rb abstractC0649rb = this.f3108i;
                    try {
                        try {
                            try {
                                try {
                                    this.f3117r = c0892xw.m5693a(q80Var, obj3, abstractC0649rb.f6785q, this.f3123x, this.f3124y, abstractC0649rb.f6789u, this.f3107h, this.f3111l, abstractC0649rb.f6779k, abstractC0649rb.f6788t, abstractC0649rb.f6786r, abstractC0649rb.f6792x, abstractC0649rb.f6787s, abstractC0649rb.f6782n, abstractC0649rb.f6793y, this, this.f3115p);
                                    if (this.f3099B != 2) {
                                        this.f3117r = null;
                                    }
                                    if (z) {
                                        m2231e("finished onSizeReady in " + hk0.m2289a(this.f3118s));
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    obj = obj2;
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                obj = obj2;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            obj = obj2;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        obj = obj2;
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            } catch (Throwable th6) {
                th = th6;
                obj = obj2;
            }
        }
    }

    public final String toString() {
        Object obj;
        Class cls;
        synchronized (this.f3102c) {
            obj = this.f3106g;
            cls = this.f3107h;
        }
        return super.toString() + "[model=" + obj + ", transcodeClass=" + cls + "]";
    }
}
