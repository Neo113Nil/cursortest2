package M;

import P.C0315s;
import z.C2681E;

/* renamed from: M.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0232c {

    /* renamed from: a, reason: collision with root package name */
    public static final C2681E f3301a;

    /* renamed from: b, reason: collision with root package name */
    public static final float f3302b;

    /* renamed from: c, reason: collision with root package name */
    public static final float f3303c;

    static {
        float f = 24;
        float f5 = 8;
        f3301a = new C2681E(f, f5, f, f5);
        float f6 = 16;
        androidx.compose.foundation.layout.b.b(f6, f5, f, f5);
        float f7 = 12;
        androidx.compose.foundation.layout.b.b(f7, f5, f7, f5);
        androidx.compose.foundation.layout.b.b(f7, f5, f6, f5);
        f3302b = 58;
        f3303c = 40;
        float f8 = O.e.f3858a;
    }

    public static C0231b a(long j5, long j6, C0315s c0315s) {
        C0231b c0231b;
        long j7 = i0.p.f17293g;
        C0249u c0249u = (C0249u) c0315s.j(AbstractC0251w.f3578a);
        C0231b c0231b2 = c0249u.K;
        if (c0231b2 == null) {
            float f = O.e.f3858a;
            C0231b c0231b3 = new C0231b(AbstractC0251w.c(c0249u, 26), AbstractC0251w.c(c0249u, O.e.f3863g), i0.p.b(0.12f, AbstractC0251w.c(c0249u, O.e.f3859b)), i0.p.b(0.38f, AbstractC0251w.c(c0249u, O.e.f3861d)));
            c0249u.K = c0231b3;
            c0231b = c0231b3;
        } else {
            c0231b = c0231b2;
        }
        return c0231b.a(j5, j6, j7, j7);
    }
}
