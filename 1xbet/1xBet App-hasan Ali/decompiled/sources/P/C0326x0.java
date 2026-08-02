package P;

import r.C2315A;
import r.C2321G;

/* renamed from: P.x0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0326x0 {

    /* renamed from: a, reason: collision with root package name */
    public C0327y f4575a;

    /* renamed from: b, reason: collision with root package name */
    public int f4576b;

    /* renamed from: c, reason: collision with root package name */
    public C0280a f4577c;

    /* renamed from: d, reason: collision with root package name */
    public i4.e f4578d;

    /* renamed from: e, reason: collision with root package name */
    public int f4579e;
    public C2315A f;

    /* renamed from: g, reason: collision with root package name */
    public C2321G f4580g;

    public C0326x0(C0327y c0327y) {
        this.f4575a = c0327y;
    }

    public static boolean a(H h3, C2321G c2321g) {
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>", h3);
        U0 u02 = h3.f4317m;
        if (u02 == null) {
            u02 = Z.f4434p;
        }
        return !u02.a(h3.i().f, c2321g.g(h3));
    }

    public final boolean b() {
        if (this.f4575a != null) {
            C0280a c0280a = this.f4577c;
            if (c0280a != null ? c0280a.a() : false) {
                return true;
            }
        }
        return false;
    }

    public final T c(Object obj) {
        T r5;
        C0327y c0327y = this.f4575a;
        return (c0327y == null || (r5 = c0327y.r(this, obj)) == null) ? T.f4396k : r5;
    }

    public final void d() {
        C0327y c0327y = this.f4575a;
        if (c0327y != null) {
            c0327y.f4600y = true;
            c0327y.f4582B.d();
        }
        this.f4575a = null;
        this.f = null;
        this.f4580g = null;
        this.f4578d = null;
    }

    public final void e(boolean z3) {
        int i = this.f4576b;
        this.f4576b = z3 ? i | 32 : i & (-33);
    }
}
