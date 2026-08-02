package androidx.compose.foundation.layout;

import B1.InterfaceC2552v;
import B1.InterfaceC2553w;
import B1.m0;
import androidx.compose.foundation.layout.C5179b;
import e1.InterfaceC6250b;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u0.C9889B;
import u0.InterfaceC9888A;

/* renamed from: androidx.compose.foundation.layout.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5194q implements B1.V, InterfaceC9888A {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C5179b.l f39528a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC6250b.InterfaceC0966b f39529b;

    /* renamed from: androidx.compose.foundation.layout.q$a */
    static final class a extends AbstractC7737t implements Function1<m0.a, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ m0[] f39530b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C5194q f39531c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f39532d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f39533e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ B1.Y f39534f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int[] f39535g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(m0[] m0VarArr, C5194q c5194q, int i11, int i12, B1.Y y11, int[] iArr) {
            super(1);
            this.f39530b = m0VarArr;
            this.f39531c = c5194q;
            this.f39532d = i11;
            this.f39533e = i12;
            this.f39534f = y11;
            this.f39535g = iArr;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(m0.a aVar) {
            m0.a aVar2 = aVar;
            m0[] m0VarArr = this.f39530b;
            int length = m0VarArr.length;
            int i11 = 0;
            int i12 = 0;
            while (i11 < length) {
                m0 m0Var = m0VarArr[i11];
                int i13 = i12 + 1;
                Intrinsics.f(m0Var);
                Object m11 = m0Var.m();
                aVar2.d(m0Var, C5194q.n(this.f39531c, m0Var, m11 instanceof C9889B ? (C9889B) m11 : null, this.f39532d, this.f39533e, this.f39534f.getLayoutDirection()), this.f39535g[i12], 0.0f);
                i11++;
                i12 = i13;
            }
            return Unit.f71690a;
        }
    }

    public C5194q(@NotNull C5179b.l lVar, @NotNull InterfaceC6250b.InterfaceC0966b interfaceC0966b) {
        this.f39528a = lVar;
        this.f39529b = interfaceC0966b;
    }

    public static final int n(C5194q c5194q, m0 m0Var, C9889B c9889b, int i11, int i12, Z1.s sVar) {
        c5194q.getClass();
        r a11 = c9889b != null ? c9889b.a() : null;
        if (a11 != null) {
            return a11.a(i11 - m0Var.u0(), sVar, m0Var, i12);
        }
        return c5194q.f39529b.a(0, i11 - m0Var.u0(), sVar);
    }

    @Override // u0.InterfaceC9888A
    public final void a(int i11, @NotNull B1.Y y11, @NotNull int[] iArr, @NotNull int[] iArr2) {
        this.f39528a.b(i11, y11, iArr, iArr2);
    }

    @Override // u0.InterfaceC9888A
    public final int b(@NotNull m0 m0Var) {
        return m0Var.u0();
    }

    @Override // u0.InterfaceC9888A
    @NotNull
    public final B1.W c(@NotNull m0[] m0VarArr, @NotNull B1.Y y11, int i11, @NotNull int[] iArr, int i12, int i13, int[] iArr2, int i14, int i15, int i16) {
        B1.W z02;
        z02 = y11.z0(i13, i12, kotlin.collections.U.c(), new a(m0VarArr, this, i13, i11, y11, iArr));
        return z02;
    }

    @Override // u0.InterfaceC9888A
    public final long d(int i11, int i12, int i13, boolean z11) {
        return C5193p.b(i11, i12, i13, z11);
    }

    @Override // u0.InterfaceC9888A
    public final int e(@NotNull m0 m0Var) {
        return m0Var.l0();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5194q)) {
            return false;
        }
        C5194q c5194q = (C5194q) obj;
        return Intrinsics.d(this.f39528a, c5194q.f39528a) && Intrinsics.d(this.f39529b, c5194q.f39529b);
    }

    public final int hashCode() {
        return this.f39529b.hashCode() + (this.f39528a.hashCode() * 31);
    }

    @Override // B1.V
    public final int maxIntrinsicHeight(@NotNull InterfaceC2553w interfaceC2553w, @NotNull List<? extends InterfaceC2552v> list, int i11) {
        int Y02 = interfaceC2553w.Y0(this.f39528a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i12 = 0;
        int i13 = 0;
        float f7 = 0.0f;
        for (int i14 = 0; i14 < size; i14++) {
            InterfaceC2552v interfaceC2552v = list.get(i14);
            float b11 = u0.z.b(u0.z.a(interfaceC2552v));
            int D11 = interfaceC2552v.D(i11);
            if (b11 == 0.0f) {
                i13 += D11;
            } else if (b11 > 0.0f) {
                f7 += b11;
                i12 = Math.max(i12, Math.round(D11 / b11));
            }
        }
        return ((list.size() - 1) * Y02) + Math.round(i12 * f7) + i13;
    }

    @Override // B1.V
    public final int maxIntrinsicWidth(@NotNull InterfaceC2553w interfaceC2553w, @NotNull List<? extends InterfaceC2552v> list, int i11) {
        int Y02 = interfaceC2553w.Y0(this.f39528a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int min = Math.min((list.size() - 1) * Y02, i11);
        int size = list.size();
        int i12 = 0;
        float f7 = 0.0f;
        for (int i13 = 0; i13 < size; i13++) {
            InterfaceC2552v interfaceC2552v = list.get(i13);
            float b11 = u0.z.b(u0.z.a(interfaceC2552v));
            if (b11 == 0.0f) {
                int min2 = Math.min(interfaceC2552v.D(Integer.MAX_VALUE), i11 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i11 - min);
                min += min2;
                i12 = Math.max(i12, interfaceC2552v.Y(min2));
            } else if (b11 > 0.0f) {
                f7 += b11;
            }
        }
        int round = f7 == 0.0f ? 0 : i11 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i11 - min, 0) / f7);
        int size2 = list.size();
        for (int i14 = 0; i14 < size2; i14++) {
            InterfaceC2552v interfaceC2552v2 = list.get(i14);
            float b12 = u0.z.b(u0.z.a(interfaceC2552v2));
            if (b12 > 0.0f) {
                i12 = Math.max(i12, interfaceC2552v2.Y(round != Integer.MAX_VALUE ? Math.round(round * b12) : Integer.MAX_VALUE));
            }
        }
        return i12;
    }

    @Override // B1.V
    @NotNull
    /* renamed from: measure-3p2s80s */
    public final B1.W mo2measure3p2s80s(@NotNull B1.Y y11, @NotNull List<? extends B1.U> list, long j11) {
        return W.a(this, Z1.b.l(j11), Z1.b.m(j11), Z1.b.j(j11), Z1.b.k(j11), y11.Y0(this.f39528a.a()), y11, list, new m0[list.size()], 0, list.size(), null, 0);
    }

    @Override // B1.V
    public final int minIntrinsicHeight(@NotNull InterfaceC2553w interfaceC2553w, @NotNull List<? extends InterfaceC2552v> list, int i11) {
        int Y02 = interfaceC2553w.Y0(this.f39528a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i12 = 0;
        int i13 = 0;
        float f7 = 0.0f;
        for (int i14 = 0; i14 < size; i14++) {
            InterfaceC2552v interfaceC2552v = list.get(i14);
            float b11 = u0.z.b(u0.z.a(interfaceC2552v));
            int O11 = interfaceC2552v.O(i11);
            if (b11 == 0.0f) {
                i13 += O11;
            } else if (b11 > 0.0f) {
                f7 += b11;
                i12 = Math.max(i12, Math.round(O11 / b11));
            }
        }
        return ((list.size() - 1) * Y02) + Math.round(i12 * f7) + i13;
    }

    @Override // B1.V
    public final int minIntrinsicWidth(@NotNull InterfaceC2553w interfaceC2553w, @NotNull List<? extends InterfaceC2552v> list, int i11) {
        int Y02 = interfaceC2553w.Y0(this.f39528a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int min = Math.min((list.size() - 1) * Y02, i11);
        int size = list.size();
        int i12 = 0;
        float f7 = 0.0f;
        for (int i13 = 0; i13 < size; i13++) {
            InterfaceC2552v interfaceC2552v = list.get(i13);
            float b11 = u0.z.b(u0.z.a(interfaceC2552v));
            if (b11 == 0.0f) {
                int min2 = Math.min(interfaceC2552v.D(Integer.MAX_VALUE), i11 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i11 - min);
                min += min2;
                i12 = Math.max(i12, interfaceC2552v.T(min2));
            } else if (b11 > 0.0f) {
                f7 += b11;
            }
        }
        int round = f7 == 0.0f ? 0 : i11 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i11 - min, 0) / f7);
        int size2 = list.size();
        for (int i14 = 0; i14 < size2; i14++) {
            InterfaceC2552v interfaceC2552v2 = list.get(i14);
            float b12 = u0.z.b(u0.z.a(interfaceC2552v2));
            if (b12 > 0.0f) {
                i12 = Math.max(i12, interfaceC2552v2.T(round != Integer.MAX_VALUE ? Math.round(round * b12) : Integer.MAX_VALUE));
            }
        }
        return i12;
    }

    @NotNull
    public final String toString() {
        return "ColumnMeasurePolicy(verticalArrangement=" + this.f39528a + ", horizontalAlignment=" + this.f39529b + ')';
    }
}
