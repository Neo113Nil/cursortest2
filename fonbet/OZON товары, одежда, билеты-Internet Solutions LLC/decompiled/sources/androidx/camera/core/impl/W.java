package androidx.camera.core.impl;

import android.util.Log;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.concurrent.futures.b;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes8.dex */
public abstract class W {

    /* renamed from: k, reason: collision with root package name */
    public static final Size f38219k = new Size(0, 0);

    /* renamed from: l, reason: collision with root package name */
    private static final boolean f38220l = C.S.f("DeferrableSurface");

    /* renamed from: m, reason: collision with root package name */
    private static final AtomicInteger f38221m = new AtomicInteger(0);

    /* renamed from: n, reason: collision with root package name */
    private static final AtomicInteger f38222n = new AtomicInteger(0);

    /* renamed from: a, reason: collision with root package name */
    private final Object f38223a;

    /* renamed from: b, reason: collision with root package name */
    private int f38224b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f38225c;

    /* renamed from: d, reason: collision with root package name */
    private b.a<Void> f38226d;

    /* renamed from: e, reason: collision with root package name */
    private final com.google.common.util.concurrent.m<Void> f38227e;

    /* renamed from: f, reason: collision with root package name */
    private b.a<Void> f38228f;

    /* renamed from: g, reason: collision with root package name */
    private final com.google.common.util.concurrent.m<Void> f38229g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    private final Size f38230h;

    /* renamed from: i, reason: collision with root package name */
    private final int f38231i;

    /* renamed from: j, reason: collision with root package name */
    Class<?> f38232j;

    public static final class a extends Exception {

        /* renamed from: a, reason: collision with root package name */
        W f38233a;

        public a(@NonNull W w11, @NonNull String str) {
            super(str);
            this.f38233a = w11;
        }

        @NonNull
        public final W a() {
            return this.f38233a;
        }
    }

    public static final class b extends Exception {
    }

    public W() {
        this(f38219k, 0);
    }

    public static /* synthetic */ String a(W w11, b.a aVar) {
        synchronized (w11.f38223a) {
            w11.f38226d = aVar;
        }
        return "DeferrableSurface-termination(" + w11 + ")";
    }

    public static /* synthetic */ String b(W w11, b.a aVar) {
        synchronized (w11.f38223a) {
            w11.f38228f = aVar;
        }
        return "DeferrableSurface-close(" + w11 + ")";
    }

    public static /* synthetic */ void c(W w11, String str) {
        w11.getClass();
        try {
            w11.f38227e.get();
            w11.n(f38222n.decrementAndGet(), f38221m.get(), "Surface terminated");
        } catch (Exception e11) {
            C.S.c("DeferrableSurface", "Unexpected surface termination for " + w11 + "\nStack Trace:\n" + str);
            synchronized (w11.f38223a) {
                throw new IllegalArgumentException(String.format("DeferrableSurface %s [closed: %b, use_count: %s] terminated with unexpected exception.", w11, Boolean.valueOf(w11.f38225c), Integer.valueOf(w11.f38224b)), e11);
            }
        }
    }

    private void n(int i11, int i12, @NonNull String str) {
        if (!f38220l && C.S.f("DeferrableSurface")) {
            C.S.a("DeferrableSurface", "DeferrableSurface usage statistics may be inaccurate since debug logging was not enabled at static initialization time. App restart may be required to enable accurate usage statistics.");
        }
        C.S.a("DeferrableSurface", str + "[total_surfaces=" + i11 + ", used_surfaces=" + i12 + "](" + this + "}");
    }

    public void d() {
        b.a<Void> aVar;
        synchronized (this.f38223a) {
            try {
                if (this.f38225c) {
                    aVar = null;
                } else {
                    this.f38225c = true;
                    this.f38228f.c(null);
                    if (this.f38224b == 0) {
                        aVar = this.f38226d;
                        this.f38226d = null;
                    } else {
                        aVar = null;
                    }
                    if (C.S.f("DeferrableSurface")) {
                        C.S.a("DeferrableSurface", "surface closed,  useCount=" + this.f38224b + " closed=true " + this);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (aVar != null) {
            aVar.c(null);
        }
    }

    public final void e() {
        b.a<Void> aVar;
        synchronized (this.f38223a) {
            try {
                int i11 = this.f38224b;
                if (i11 == 0) {
                    throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
                }
                int i12 = i11 - 1;
                this.f38224b = i12;
                if (i12 == 0 && this.f38225c) {
                    aVar = this.f38226d;
                    this.f38226d = null;
                } else {
                    aVar = null;
                }
                if (C.S.f("DeferrableSurface")) {
                    C.S.a("DeferrableSurface", "use count-1,  useCount=" + this.f38224b + " closed=" + this.f38225c + " " + this);
                    if (this.f38224b == 0) {
                        n(f38222n.get(), f38221m.decrementAndGet(), "Surface no longer in use");
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (aVar != null) {
            aVar.c(null);
        }
    }

    @NonNull
    public final com.google.common.util.concurrent.m<Void> f() {
        return I.k.i(this.f38229g);
    }

    public final Class<?> g() {
        return this.f38232j;
    }

    @NonNull
    public final Size h() {
        return this.f38230h;
    }

    public final int i() {
        return this.f38231i;
    }

    @NonNull
    public final com.google.common.util.concurrent.m<Surface> j() {
        synchronized (this.f38223a) {
            try {
                if (this.f38225c) {
                    return I.k.f(new a(this, "DeferrableSurface already closed."));
                }
                return o();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NonNull
    public final com.google.common.util.concurrent.m<Void> k() {
        return I.k.i(this.f38227e);
    }

    public final void l() throws a {
        synchronized (this.f38223a) {
            try {
                int i11 = this.f38224b;
                if (i11 == 0 && this.f38225c) {
                    throw new a(this, "Cannot begin use on a closed surface.");
                }
                this.f38224b = i11 + 1;
                if (C.S.f("DeferrableSurface")) {
                    if (this.f38224b == 1) {
                        n(f38222n.get(), f38221m.incrementAndGet(), "New surface in use");
                    }
                    C.S.a("DeferrableSurface", "use count+1, useCount=" + this.f38224b + " " + this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean m() {
        boolean z11;
        synchronized (this.f38223a) {
            z11 = this.f38225c;
        }
        return z11;
    }

    @NonNull
    protected abstract com.google.common.util.concurrent.m<Surface> o();

    public final void p(@NonNull Class<?> cls) {
        this.f38232j = cls;
    }

    public W(@NonNull Size size, int i11) {
        this.f38223a = new Object();
        this.f38224b = 0;
        this.f38225c = false;
        this.f38230h = size;
        this.f38231i = i11;
        com.google.common.util.concurrent.m<Void> a11 = androidx.concurrent.futures.b.a(new AW.c(this));
        this.f38227e = a11;
        this.f38229g = androidx.concurrent.futures.b.a(new AW.d(this));
        if (C.S.f("DeferrableSurface")) {
            n(f38222n.incrementAndGet(), f38221m.get(), "Surface created");
            a11.a(new C.W(2, this, Log.getStackTraceString(new Exception())), H.c.b());
        }
    }
}
