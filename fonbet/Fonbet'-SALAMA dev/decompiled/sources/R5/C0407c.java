package R5;

import A1.K0;
import W5.AbstractC0486a1;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import e3.C1023h;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.WeakHashMap;

/* renamed from: R5.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0407c {

    /* renamed from: a, reason: collision with root package name */
    public final C1023h f6135a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakHashMap f6136b = new WeakHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f6137c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f6138d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final ReferenceQueue f6139e = new ReferenceQueue();

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f6140f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final Handler f6141g;

    /* renamed from: h, reason: collision with root package name */
    public final K0 f6142h;

    /* renamed from: i, reason: collision with root package name */
    public long f6143i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public final long f6144k;

    public C0407c(C1023h c1023h) {
        this.f6135a = c1023h;
        Handler handler = new Handler(Looper.getMainLooper());
        this.f6141g = handler;
        K0 k02 = new K0(this, 14);
        this.f6142h = k02;
        this.f6143i = 65536L;
        this.f6144k = 3000L;
        handler.postDelayed(k02, 3000L);
    }

    public final void a(long j, Object obj) {
        t6.h.e(obj, "instance");
        f();
        c(j, obj);
    }

    public final long b(Object obj) {
        t6.h.e(obj, "instance");
        f();
        if (!d(obj)) {
            long j = this.f6143i;
            this.f6143i = 1 + j;
            c(j, obj);
            return j;
        }
        throw new IllegalArgumentException(("Instance of " + obj.getClass() + " has already been added.").toString());
    }

    public final void c(long j, Object obj) {
        if (j < 0) {
            throw new IllegalArgumentException(AbstractC0486a1.g("Identifier must be >= 0: ", j).toString());
        }
        HashMap hashMap = this.f6137c;
        if (hashMap.containsKey(Long.valueOf(j))) {
            throw new IllegalArgumentException(AbstractC0486a1.g("Identifier has already been added: ", j).toString());
        }
        WeakReference weakReference = new WeakReference(obj, this.f6139e);
        this.f6136b.put(obj, Long.valueOf(j));
        hashMap.put(Long.valueOf(j), weakReference);
        this.f6140f.put(weakReference, Long.valueOf(j));
        this.f6138d.put(Long.valueOf(j), obj);
    }

    public final boolean d(Object obj) {
        f();
        return this.f6136b.containsKey(obj);
    }

    public final Object e(long j) {
        f();
        WeakReference weakReference = (WeakReference) this.f6137c.get(Long.valueOf(j));
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public final void f() {
        if (this.j) {
            Log.w("PigeonInstanceManager", "The manager was used after calls to the PigeonFinalizationListener has been stopped.");
        }
    }
}
