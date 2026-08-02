package A;

import java.util.List;
import x0.Y;
import x0.Z;
import x0.a0;
import x0.b0;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final int f119a;

    /* renamed from: b, reason: collision with root package name */
    public final List f120b;

    /* renamed from: c, reason: collision with root package name */
    public final b0.f f121c;

    /* renamed from: d, reason: collision with root package name */
    public final W0.m f122d;

    /* renamed from: e, reason: collision with root package name */
    public final int f123e;
    public final long f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f124g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f125h;
    public final androidx.compose.foundation.lazy.layout.a i;

    /* renamed from: j, reason: collision with root package name */
    public int f126j;

    /* renamed from: k, reason: collision with root package name */
    public final int f127k;

    /* renamed from: l, reason: collision with root package name */
    public final int f128l;

    /* renamed from: m, reason: collision with root package name */
    public final int f129m;

    /* renamed from: n, reason: collision with root package name */
    public int f130n = Integer.MIN_VALUE;

    /* renamed from: o, reason: collision with root package name */
    public final int[] f131o;

    public u(int i, List list, b0.f fVar, W0.m mVar, int i5, int i6, int i7, long j5, Object obj, Object obj2, androidx.compose.foundation.lazy.layout.a aVar, long j6) {
        this.f119a = i;
        this.f120b = list;
        this.f121c = fVar;
        this.f122d = mVar;
        this.f123e = i7;
        this.f = j5;
        this.f124g = obj;
        this.f125h = obj2;
        this.i = aVar;
        int size = list.size();
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            Z z3 = (Z) list.get(i10);
            i8 += z3.f20974l;
            i9 = Math.max(i9, z3.f20973k);
        }
        this.f127k = i8;
        int i11 = i8 + this.f123e;
        this.f128l = i11 >= 0 ? i11 : 0;
        this.f129m = i9;
        this.f131o = new int[this.f120b.size() * 2];
    }

    public final long a(int i) {
        int i5 = i * 2;
        int[] iArr = this.f131o;
        return G4.l.a(iArr[i5], iArr[i5 + 1]);
    }

    public final void b(Y y5) {
        if (this.f130n == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("position() should be called first");
        }
        List list = this.f120b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Z z3 = (Z) list.get(i);
            int i5 = z3.f20974l;
            long a5 = a(i);
            L1.a.t(this.i.f6878a.g(this.f124g));
            long c5 = W0.j.c(a5, this.f);
            a0 a0Var = a0.f20979m;
            int i6 = b0.f20984b;
            y5.getClass();
            Y.a(y5, z3);
            z3.Z(W0.j.c(c5, z3.f20977o), 0.0f, a0Var);
        }
    }

    public final void c(int i, int i5, int i6) {
        this.f126j = i;
        this.f130n = i6;
        List list = this.f120b;
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            Z z3 = (Z) list.get(i7);
            int i8 = i7 * 2;
            b0.f fVar = this.f121c;
            if (fVar == null) {
                throw new IllegalArgumentException("null horizontalAlignment when isVertical == true");
            }
            int a5 = fVar.a(z3.f20973k, i5, this.f122d);
            int[] iArr = this.f131o;
            iArr[i8] = a5;
            iArr[i8 + 1] = i;
            i += z3.f20974l;
        }
    }
}
