package androidx.compose.material;

import B1.m0;
import J0.EnumC3337r1;
import androidx.compose.ui.e;
import hd.C6915b;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;
import r0.EnumC9142v;

/* renamed from: androidx.compose.material.s, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C5220s<T> extends e.c implements D1.E {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private C5210h<T> f40122a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private Function2<? super Z1.q, ? super Z1.b, ? extends Pair<? extends J0.M<T>, ? extends T>> f40123b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private EnumC9142v f40124c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f40125d;

    /* renamed from: androidx.compose.material.s$a */
    static final class a extends AbstractC7737t implements Function1<m0.a, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ B1.Y f40126b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C5220s<T> f40127c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ m0 f40128d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(B1.Y y11, C5220s<T> c5220s, m0 m0Var) {
            super(1);
            this.f40126b = y11;
            this.f40127c = c5220s;
            this.f40128d = m0Var;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(m0.a aVar) {
            m0.a aVar2 = aVar;
            boolean R02 = this.f40126b.R0();
            C5220s<T> c5220s = this.f40127c;
            float e11 = R02 ? c5220s.J1().l().e(c5220s.J1().t()) : c5220s.J1().w();
            float f7 = c5220s.I1() == EnumC9142v.Horizontal ? e11 : 0.0f;
            if (c5220s.I1() != EnumC9142v.Vertical) {
                e11 = 0.0f;
            }
            aVar2.d(this.f40128d, C6915b.c(f7), C6915b.c(e11), 0.0f);
            return Unit.f71690a;
        }
    }

    public C5220s(@NotNull C5210h<T> c5210h, @NotNull Function2<? super Z1.q, ? super Z1.b, ? extends Pair<? extends J0.M<T>, ? extends T>> function2, @NotNull EnumC9142v enumC9142v) {
        this.f40122a = c5210h;
        this.f40123b = function2;
        this.f40124c = enumC9142v;
    }

    @Override // D1.E
    @NotNull
    public final B1.W D(@NotNull B1.Y y11, @NotNull B1.U u11, long j11) {
        B1.W z02;
        m0 a02 = u11.a0(j11);
        if (!y11.R0() || !this.f40125d) {
            Pair<? extends J0.M<EnumC3337r1>, ? extends EnumC3337r1> invoke = ((K) this.f40123b).invoke(Z1.q.a(Z1.r.a(a02.u0(), a02.l0())), Z1.b.a(j11));
            this.f40122a.z(invoke.e(), invoke.f());
        }
        this.f40125d = y11.R0() || this.f40125d;
        z02 = y11.z0(a02.u0(), a02.l0(), kotlin.collections.U.c(), new a(y11, this, a02));
        return z02;
    }

    @NotNull
    public final EnumC9142v I1() {
        return this.f40124c;
    }

    @NotNull
    public final C5210h<T> J1() {
        return this.f40122a;
    }

    public final void K1(@NotNull Function2<? super Z1.q, ? super Z1.b, ? extends Pair<? extends J0.M<T>, ? extends T>> function2) {
        this.f40123b = function2;
    }

    public final void L1(@NotNull EnumC9142v enumC9142v) {
        this.f40124c = enumC9142v;
    }

    public final void M1(@NotNull C5210h<T> c5210h) {
        this.f40122a = c5210h;
    }

    @Override // androidx.compose.ui.e.c
    public final void onDetach() {
        this.f40125d = false;
    }
}
