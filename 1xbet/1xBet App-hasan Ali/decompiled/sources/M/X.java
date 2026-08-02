package M;

import k4.AbstractC2036a;
import z.C2681E;

/* loaded from: classes.dex */
public final class X extends kotlin.jvm.internal.m implements i4.c {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f3262l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f3263m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ x0.Z f3264n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ x0.Z f3265o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ x0.Z f3266p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ x0.Z f3267q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ x0.Z f3268r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ x0.Z f3269s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ x0.Z f3270t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ x0.Z f3271u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ x0.Z f3272v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Y f3273w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ x0.Q f3274x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(int i, int i5, x0.Z z3, x0.Z z5, x0.Z z6, x0.Z z7, x0.Z z8, x0.Z z9, x0.Z z10, x0.Z z11, x0.Z z12, Y y5, x0.Q q5) {
        super(1);
        this.f3262l = i;
        this.f3263m = i5;
        this.f3264n = z3;
        this.f3265o = z5;
        this.f3266p = z6;
        this.f3267q = z7;
        this.f3268r = z8;
        this.f3269s = z9;
        this.f3270t = z10;
        this.f3271u = z11;
        this.f3272v = z12;
        this.f3273w = y5;
        this.f3274x = q5;
    }

    @Override // i4.c
    public final Object c(Object obj) {
        float f;
        int i;
        x0.Y y5 = (x0.Y) obj;
        Y y6 = this.f3273w;
        float f5 = y6.f3277c;
        x0.Q q5 = this.f3274x;
        float c5 = q5.c();
        W0.m layoutDirection = q5.getLayoutDirection();
        float f6 = V.f3256a;
        x0.Y.h(y5, this.f3271u, 0L);
        float f7 = N.n.f3709b;
        x0.Z z3 = this.f3272v;
        int i5 = this.f3262l - (z3 != null ? z3.f20974l : 0);
        C2681E c2681e = y6.f3278d;
        int U4 = AbstractC2036a.U(c2681e.f21475b * c5);
        int U5 = AbstractC2036a.U(androidx.compose.foundation.layout.b.c(c2681e, layoutDirection) * c5);
        float f8 = N.n.f3710c * c5;
        x0.Z z5 = this.f3264n;
        if (z5 != null) {
            x0.Y.j(y5, z5, 0, Math.round((1 + 0.0f) * ((i5 - z5.f20974l) / 2.0f)));
        }
        boolean z6 = y6.f3276b;
        x0.Z z7 = this.f3269s;
        if (z7 != null) {
            if (z6) {
                f = 2.0f;
                i = Math.round((1 + 0.0f) * ((i5 - z7.f20974l) / 2.0f));
            } else {
                f = 2.0f;
                i = U4;
            }
            x0.Y.j(y5, z7, AbstractC2036a.U(z5 == null ? 0.0f : (1 - f5) * (z5.f20973k - f8)) + U5, G4.d.G(f5, i, -(z7.f20974l / 2)));
        } else {
            f = 2.0f;
        }
        x0.Z z8 = this.f3266p;
        if (z8 != null) {
            x0.Y.j(y5, z8, z5 != null ? z5.f20973k : 0, V.e(z6, i5, U4, z7, z8));
        }
        int i6 = (z5 != null ? z5.f20973k : 0) + (z8 != null ? z8.f20973k : 0);
        x0.Z z9 = this.f3268r;
        x0.Y.j(y5, z9, i6, V.e(z6, i5, U4, z7, z9));
        x0.Z z10 = this.f3270t;
        if (z10 != null) {
            x0.Y.j(y5, z10, i6, V.e(z6, i5, U4, z7, z10));
        }
        int i7 = this.f3263m;
        x0.Z z11 = this.f3265o;
        x0.Z z12 = this.f3267q;
        if (z12 != null) {
            x0.Y.j(y5, z12, (i7 - (z11 != null ? z11.f20973k : 0)) - z12.f20973k, V.e(z6, i5, U4, z7, z12));
        }
        if (z11 != null) {
            x0.Y.j(y5, z11, i7 - z11.f20973k, Math.round((1 + 0.0f) * ((i5 - z11.f20974l) / f)));
        }
        if (z3 != null) {
            x0.Y.j(y5, z3, 0, i5);
        }
        return W3.o.f6046a;
    }
}
