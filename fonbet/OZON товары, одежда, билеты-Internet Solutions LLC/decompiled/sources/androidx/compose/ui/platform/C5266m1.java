package androidx.compose.ui.platform;

import android.graphics.Outline;
import android.os.Build;
import k1.C7455a;
import k1.C7456b;
import k1.C7459e;
import k1.C7460f;
import k1.C7462h;
import k1.C7463i;
import k1.C7464j;
import k1.C7465k;
import kotlin.jvm.internal.Intrinsics;
import l1.AbstractC7839p0;
import l1.C7786D;
import l1.C7790H;
import l1.InterfaceC7802U;
import l1.s0;
import org.jetbrains.annotations.NotNull;

/* renamed from: androidx.compose.ui.platform.m1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5266m1 {

    /* renamed from: a, reason: collision with root package name */
    private boolean f40925a = true;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Outline f40926b;

    /* renamed from: c, reason: collision with root package name */
    private AbstractC7839p0 f40927c;

    /* renamed from: d, reason: collision with root package name */
    private C7786D f40928d;

    /* renamed from: e, reason: collision with root package name */
    private l1.s0 f40929e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f40930f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f40931g;

    /* renamed from: h, reason: collision with root package name */
    private l1.s0 f40932h;

    /* renamed from: i, reason: collision with root package name */
    private C7462h f40933i;

    /* renamed from: j, reason: collision with root package name */
    private float f40934j;

    /* renamed from: k, reason: collision with root package name */
    private long f40935k;

    /* renamed from: l, reason: collision with root package name */
    private long f40936l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f40937m;

    public C5266m1() {
        Outline outline = new Outline();
        outline.setAlpha(1.0f);
        this.f40926b = outline;
        this.f40935k = 0L;
        this.f40936l = 0L;
    }

    private final void h() {
        if (this.f40930f) {
            this.f40935k = 0L;
            this.f40934j = 0.0f;
            this.f40929e = null;
            this.f40930f = false;
            this.f40931g = false;
            AbstractC7839p0 abstractC7839p0 = this.f40927c;
            Outline outline = this.f40926b;
            if (abstractC7839p0 == null || !this.f40937m || C7464j.f(this.f40936l) <= 0.0f || C7464j.d(this.f40936l) <= 0.0f) {
                outline.setEmpty();
                return;
            }
            this.f40925a = true;
            if (abstractC7839p0 instanceof AbstractC7839p0.b) {
                C7460f b11 = ((AbstractC7839p0.b) abstractC7839p0).b();
                this.f40935k = P9.a.a(b11.n(), b11.q());
                this.f40936l = C7465k.a(b11.u(), b11.m());
                outline.setRect(Math.round(b11.n()), Math.round(b11.q()), Math.round(b11.o()), Math.round(b11.h()));
                return;
            }
            if (!(abstractC7839p0 instanceof AbstractC7839p0.c)) {
                if (abstractC7839p0 instanceof AbstractC7839p0.a) {
                    i(((AbstractC7839p0.a) abstractC7839p0).b());
                    return;
                }
                return;
            }
            C7462h b12 = ((AbstractC7839p0.c) abstractC7839p0).b();
            float d11 = C7455a.d(b12.h());
            this.f40935k = P9.a.a(b12.e(), b12.g());
            this.f40936l = C7465k.a(b12.j(), b12.d());
            if (C7463i.b(b12)) {
                this.f40926b.setRoundRect(Math.round(b12.e()), Math.round(b12.g()), Math.round(b12.f()), Math.round(b12.a()), d11);
                this.f40934j = d11;
                return;
            }
            C7786D c7786d = this.f40928d;
            if (c7786d == null) {
                c7786d = C7790H.a();
                this.f40928d = c7786d;
            }
            c7786d.reset();
            c7786d.s(b12, s0.a.CounterClockwise);
            i(c7786d);
        }
    }

    private final void i(l1.s0 s0Var) {
        int i11 = Build.VERSION.SDK_INT;
        Outline outline = this.f40926b;
        if (i11 <= 28 && !s0Var.o()) {
            this.f40925a = false;
            outline.setEmpty();
            this.f40931g = true;
        } else {
            if (!(s0Var instanceof C7786D)) {
                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
            outline.setConvexPath(((C7786D) s0Var).x());
            this.f40931g = !outline.canClip();
        }
        this.f40929e = s0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006d, code lost:
    
        if (k1.C7455a.d(r4.h()) == r2) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(@NotNull InterfaceC7802U interfaceC7802U) {
        h();
        l1.s0 s0Var = this.f40929e;
        if (s0Var != null) {
            interfaceC7802U.u(s0Var);
            return;
        }
        float f7 = this.f40934j;
        if (f7 <= 0.0f) {
            interfaceC7802U.e(C7459e.g(this.f40935k), C7459e.h(this.f40935k), C7459e.g(this.f40935k) + C7464j.f(this.f40936l), C7459e.h(this.f40935k) + C7464j.d(this.f40936l), 1);
            return;
        }
        l1.s0 s0Var2 = this.f40932h;
        C7462h c7462h = this.f40933i;
        if (s0Var2 != null) {
            long j11 = this.f40935k;
            long j12 = this.f40936l;
            if (c7462h != null && C7463i.b(c7462h) && c7462h.e() == C7459e.g(j11) && c7462h.g() == C7459e.h(j11)) {
                if (c7462h.f() == C7464j.f(j12) + C7459e.g(j11)) {
                    if (c7462h.a() == C7464j.d(j12) + C7459e.h(j11)) {
                    }
                }
            }
        }
        float g10 = C7459e.g(this.f40935k);
        float h11 = C7459e.h(this.f40935k);
        float f11 = C7464j.f(this.f40936l) + C7459e.g(this.f40935k);
        float d11 = C7464j.d(this.f40936l) + C7459e.h(this.f40935k);
        float f12 = this.f40934j;
        long a11 = C7456b.a(f12, f12);
        long a12 = C7456b.a(C7455a.d(a11), C7455a.e(a11));
        C7462h c7462h2 = new C7462h(g10, h11, f11, d11, a12, a12, a12, a12);
        if (s0Var2 == null) {
            s0Var2 = C7790H.a();
        } else {
            s0Var2.reset();
        }
        s0Var2.s(c7462h2, s0.a.CounterClockwise);
        this.f40933i = c7462h2;
        this.f40932h = s0Var2;
        interfaceC7802U.u(s0Var2);
    }

    public final Outline b() {
        h();
        if (this.f40937m && this.f40925a) {
            return this.f40926b;
        }
        return null;
    }

    public final boolean c() {
        return this.f40930f;
    }

    public final l1.s0 d() {
        h();
        return this.f40929e;
    }

    public final boolean e() {
        return !this.f40931g;
    }

    public final boolean f(long j11) {
        AbstractC7839p0 abstractC7839p0;
        if (this.f40937m && (abstractC7839p0 = this.f40927c) != null) {
            return O1.a(abstractC7839p0, C7459e.g(j11), C7459e.h(j11));
        }
        return true;
    }

    public final boolean g(AbstractC7839p0 abstractC7839p0, float f7, boolean z11, float f11, long j11) {
        this.f40926b.setAlpha(f7);
        boolean d11 = Intrinsics.d(this.f40927c, abstractC7839p0);
        boolean z12 = !d11;
        if (!d11) {
            this.f40927c = abstractC7839p0;
            this.f40930f = true;
        }
        this.f40936l = j11;
        boolean z13 = abstractC7839p0 != null && (z11 || f11 > 0.0f);
        if (this.f40937m != z13) {
            this.f40937m = z13;
            this.f40930f = true;
        }
        return z12;
    }
}
