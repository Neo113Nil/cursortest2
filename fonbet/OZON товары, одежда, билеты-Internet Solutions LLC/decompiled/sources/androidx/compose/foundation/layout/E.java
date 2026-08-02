package androidx.compose.foundation.layout;

import B1.m0;
import androidx.compose.foundation.layout.C5179b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u0.C9889B;
import u0.InterfaceC9888A;

/* loaded from: classes8.dex */
public interface E extends InterfaceC9888A {

    static final class a extends AbstractC7737t implements Function1<m0.a, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int[] f39320b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f39321c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f39322d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f39323e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ m0[] f39324f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ E f39325g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f39326h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ B1.Y f39327i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f39328j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int[] f39329k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int[] iArr, int i11, int i12, int i13, m0[] m0VarArr, E e11, int i14, B1.Y y11, int i15, int[] iArr2) {
            super(1);
            this.f39320b = iArr;
            this.f39321c = i11;
            this.f39322d = i12;
            this.f39323e = i13;
            this.f39324f = m0VarArr;
            this.f39325g = e11;
            this.f39326h = i14;
            this.f39327i = y11;
            this.f39328j = i15;
            this.f39329k = iArr2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
        
            if (r4 == null) goto L17;
         */
        @Override // kotlin.jvm.functions.Function1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Unit invoke(m0.a aVar) {
            r f7;
            m0.a aVar2 = aVar;
            int[] iArr = this.f39320b;
            int i11 = iArr != null ? iArr[this.f39321c] : 0;
            int i12 = this.f39322d;
            for (int i13 = i12; i13 < this.f39323e; i13++) {
                m0 m0Var = this.f39324f[i13];
                Intrinsics.f(m0Var);
                Object m11 = m0Var.m();
                C9889B c9889b = m11 instanceof C9889B ? (C9889B) m11 : null;
                Z1.s layoutDirection = this.f39327i.getLayoutDirection();
                int i14 = this.f39326h;
                int i15 = this.f39328j;
                E e11 = this.f39325g;
                if (c9889b != null) {
                    e11.getClass();
                    f7 = c9889b.a();
                }
                f7 = e11.f();
                int b11 = i14 - e11.b(m0Var);
                if (e11.h()) {
                    layoutDirection = Z1.s.Ltr;
                }
                int a11 = f7.a(b11, layoutDirection, m0Var, i15) + i11;
                boolean h11 = this.f39325g.h();
                int[] iArr2 = this.f39329k;
                if (h11) {
                    aVar2.d(m0Var, iArr2[i13 - i12], a11, 0.0f);
                } else {
                    aVar2.d(m0Var, a11, iArr2[i13 - i12], 0.0f);
                }
            }
            return Unit.f71690a;
        }
    }

    @Override // u0.InterfaceC9888A
    default void a(int i11, @NotNull B1.Y y11, @NotNull int[] iArr, @NotNull int[] iArr2) {
        if (h()) {
            l().c(y11, i11, iArr, y11.getLayoutDirection(), iArr2);
        } else {
            g().b(i11, y11, iArr, iArr2);
        }
    }

    @Override // u0.InterfaceC9888A
    default int b(@NotNull m0 m0Var) {
        return h() ? m0Var.o0() : m0Var.r0();
    }

    @Override // u0.InterfaceC9888A
    @NotNull
    default B1.W c(@NotNull m0[] m0VarArr, @NotNull B1.Y y11, int i11, @NotNull int[] iArr, int i12, int i13, int[] iArr2, int i14, int i15, int i16) {
        int i17;
        int i18;
        B1.W z02;
        if (h()) {
            i18 = i12;
            i17 = i13;
        } else {
            i17 = i12;
            i18 = i13;
        }
        z02 = y11.z0(i18, i17, kotlin.collections.U.c(), new a(iArr2, i14, i15, i16, m0VarArr, this, i13, y11, i11, iArr));
        return z02;
    }

    @Override // u0.InterfaceC9888A
    default long d(int i11, int i12, int i13, boolean z11) {
        return h() ? X.a(i11, i12, i13, z11) : C5193p.b(i11, i12, i13, z11);
    }

    @Override // u0.InterfaceC9888A
    default int e(@NotNull m0 m0Var) {
        return h() ? m0Var.r0() : m0Var.o0();
    }

    @NotNull
    r f();

    @NotNull
    C5179b.l g();

    boolean h();

    @NotNull
    C5179b.e l();
}
