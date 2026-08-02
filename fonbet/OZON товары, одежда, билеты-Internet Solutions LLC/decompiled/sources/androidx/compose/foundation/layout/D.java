package androidx.compose.foundation.layout;

import B0.C2454a;
import B1.InterfaceC2552v;
import B1.m0;
import androidx.collection.C5141j;
import androidx.compose.foundation.layout.C;
import androidx.compose.foundation.layout.C5196t;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u0.C9913w;
import u0.EnumC9910t;

/* loaded from: classes8.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C.a f39308a;

    /* renamed from: b, reason: collision with root package name */
    private B1.U f39309b;

    /* renamed from: c, reason: collision with root package name */
    private m0 f39310c;

    /* renamed from: d, reason: collision with root package name */
    private B1.U f39311d;

    /* renamed from: e, reason: collision with root package name */
    private m0 f39312e;

    /* renamed from: f, reason: collision with root package name */
    private C5141j f39313f;

    /* renamed from: g, reason: collision with root package name */
    private C5141j f39314g;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f39315a;

        static {
            int[] iArr = new int[C.a.values().length];
            try {
                iArr[C.a.Visible.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C.a.Clip.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[C.a.ExpandIndicator.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[C.a.ExpandOrCollapseIndicator.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f39315a = iArr;
        }
    }

    static final class b extends AbstractC7737t implements Function1<m0, Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ E f39317c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(E e11) {
            super(1);
            this.f39317c = e11;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(m0 m0Var) {
            int i11;
            int i12;
            m0 m0Var2 = m0Var;
            if (m0Var2 != null) {
                E e11 = this.f39317c;
                i11 = e11.e(m0Var2);
                i12 = e11.b(m0Var2);
            } else {
                i11 = 0;
                i12 = 0;
            }
            C5141j a11 = C5141j.a(C5141j.b(i11, i12));
            D d11 = D.this;
            d11.f39313f = a11;
            d11.f39310c = m0Var2;
            return Unit.f71690a;
        }
    }

    static final class c extends AbstractC7737t implements Function1<m0, Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ E f39319c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(E e11) {
            super(1);
            this.f39319c = e11;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(m0 m0Var) {
            int i11;
            int i12;
            m0 m0Var2 = m0Var;
            if (m0Var2 != null) {
                E e11 = this.f39319c;
                i11 = e11.e(m0Var2);
                i12 = e11.b(m0Var2);
            } else {
                i11 = 0;
                i12 = 0;
            }
            C5141j a11 = C5141j.a(C5141j.b(i11, i12));
            D d11 = D.this;
            d11.f39314g = a11;
            d11.f39312e = m0Var2;
            return Unit.f71690a;
        }
    }

    public D(@NotNull C.a aVar) {
        this.f39308a = aVar;
    }

    public final C5196t.a e(int i11, int i12, boolean z11) {
        B1.U u11;
        C5141j c5141j;
        m0 m0Var;
        int i13 = a.f39315a[this.f39308a.ordinal()];
        if (i13 != 1 && i13 != 2) {
            if (i13 != 3 && i13 != 4) {
                throw new Sc.o();
            }
            if (z11) {
                u11 = this.f39309b;
                c5141j = this.f39313f;
                m0Var = this.f39310c;
            } else {
                u11 = (i11 < -1 || i12 < 0) ? null : this.f39311d;
                c5141j = this.f39314g;
                m0Var = this.f39312e;
            }
            if (u11 != null) {
                Intrinsics.f(c5141j);
                return new C5196t.a(u11, m0Var, c5141j.f38713a);
            }
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof D) {
            return this.f39308a == ((D) obj).f39308a;
        }
        return false;
    }

    public final C5141j f(int i11, int i12, boolean z11) {
        int i13 = a.f39315a[this.f39308a.ordinal()];
        if (i13 == 1 || i13 == 2) {
            return null;
        }
        if (i13 == 3) {
            if (z11) {
                return this.f39313f;
            }
            return null;
        }
        if (i13 != 4) {
            throw new Sc.o();
        }
        if (z11) {
            return this.f39313f;
        }
        if (i11 + 1 < 0 || i12 < 0) {
            return null;
        }
        return this.f39314g;
    }

    @NotNull
    public final C.a g() {
        return this.f39308a;
    }

    public final void h(InterfaceC2552v interfaceC2552v, InterfaceC2552v interfaceC2552v2, long j11) {
        long a11 = C9913w.a(j11, EnumC9910t.Horizontal);
        if (interfaceC2552v != null) {
            int j12 = Z1.b.j(a11);
            int i11 = B.f39302b;
            int T11 = interfaceC2552v.T(j12);
            this.f39313f = C5141j.a(C5141j.b(T11, interfaceC2552v.O(T11)));
            this.f39309b = interfaceC2552v instanceof B1.U ? (B1.U) interfaceC2552v : null;
            this.f39310c = null;
        }
        if (interfaceC2552v2 != null) {
            int j13 = Z1.b.j(a11);
            int i12 = B.f39302b;
            int T12 = interfaceC2552v2.T(j13);
            this.f39314g = C5141j.a(C5141j.b(T12, interfaceC2552v2.O(T12)));
            this.f39311d = interfaceC2552v2 instanceof B1.U ? (B1.U) interfaceC2552v2 : null;
            this.f39312e = null;
        }
    }

    public final int hashCode() {
        return Integer.hashCode(0) + C2454a.a(0, this.f39308a.hashCode() * 31, 31);
    }

    public final void i(@NotNull E e11, B1.U u11, B1.U u12, long j11) {
        EnumC9910t enumC9910t = EnumC9910t.Horizontal;
        long c11 = C9913w.c(C9913w.b(10, C9913w.a(j11, enumC9910t)), enumC9910t);
        if (u11 != null) {
            B.f(u11, e11, c11, new b(e11));
            this.f39309b = u11;
        }
        if (u12 != null) {
            B.f(u12, e11, c11, new c(e11));
            this.f39311d = u12;
        }
    }

    @NotNull
    public final String toString() {
        return "FlowLayoutOverflowState(type=" + this.f39308a + ", minLinesToShowCollapse=0, minCrossAxisSizeToShowCollapse=0)";
    }
}
