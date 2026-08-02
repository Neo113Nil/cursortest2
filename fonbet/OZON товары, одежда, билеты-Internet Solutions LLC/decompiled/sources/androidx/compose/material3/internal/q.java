package androidx.compose.material3.internal;

import B1.U;
import B1.W;
import B1.Y;
import B1.m0;
import D1.E;
import Q0.InterfaceC3831c;
import androidx.compose.ui.e;
import hd.C6915b;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;
import r0.EnumC9142v;

/* loaded from: classes8.dex */
final class q<T> extends e.c implements E {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private p<T> f40299a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private Function2<? super Z1.q, ? super Z1.b, ? extends Pair<? extends InterfaceC3831c<T>, ? extends T>> f40300b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private EnumC9142v f40301c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f40302d;

    static final class a extends AbstractC7737t implements Function1<m0.a, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Y f40303b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ q<T> f40304c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ m0 f40305d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Y y11, q<T> qVar, m0 m0Var) {
            super(1);
            this.f40303b = y11;
            this.f40304c = qVar;
            this.f40305d = m0Var;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(m0.a aVar) {
            m0.a aVar2 = aVar;
            boolean R02 = this.f40303b.R0();
            q<T> qVar = this.f40304c;
            float e11 = R02 ? qVar.J1().l().e(qVar.J1().t()) : qVar.J1().w();
            float f7 = qVar.I1() == EnumC9142v.Horizontal ? e11 : 0.0f;
            if (qVar.I1() != EnumC9142v.Vertical) {
                e11 = 0.0f;
            }
            aVar2.d(this.f40305d, C6915b.c(f7), C6915b.c(e11), 0.0f);
            return Unit.f71690a;
        }
    }

    public q(@NotNull p<T> pVar, @NotNull Function2<? super Z1.q, ? super Z1.b, ? extends Pair<? extends InterfaceC3831c<T>, ? extends T>> function2, @NotNull EnumC9142v enumC9142v) {
        this.f40299a = pVar;
        this.f40300b = function2;
        this.f40301c = enumC9142v;
    }

    @Override // D1.E
    @NotNull
    public final W D(@NotNull Y y11, @NotNull U u11, long j11) {
        W z02;
        m0 a02 = u11.a0(j11);
        if (!y11.R0() || !this.f40302d) {
            Pair<? extends InterfaceC3831c<T>, ? extends T> invoke = this.f40300b.invoke(Z1.q.a(Z1.r.a(a02.u0(), a02.l0())), Z1.b.a(j11));
            this.f40299a.z(invoke.e(), invoke.f());
        }
        this.f40302d = y11.R0() || this.f40302d;
        z02 = y11.z0(a02.u0(), a02.l0(), kotlin.collections.U.c(), new a(y11, this, a02));
        return z02;
    }

    @NotNull
    public final EnumC9142v I1() {
        return this.f40301c;
    }

    @NotNull
    public final p<T> J1() {
        return this.f40299a;
    }

    public final void K1(@NotNull Function2<? super Z1.q, ? super Z1.b, ? extends Pair<? extends InterfaceC3831c<T>, ? extends T>> function2) {
        this.f40300b = function2;
    }

    public final void L1(@NotNull EnumC9142v enumC9142v) {
        this.f40301c = enumC9142v;
    }

    public final void M1(@NotNull p<T> pVar) {
        this.f40299a = pVar;
    }

    @Override // androidx.compose.ui.e.c
    public final void onDetach() {
        this.f40302d = false;
    }
}
