package androidx.compose.foundation.lazy.layout;

import D1.C2809k;
import D1.E0;
import I1.C3222a;
import I1.D;
import I1.z;
import androidx.compose.ui.e;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r0.EnumC9142v;
import x0.InterfaceC10585N;
import x0.InterfaceC10620y;
import xe.C10727i;

/* loaded from: classes.dex */
final class q extends e.c implements E0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private kotlin.reflect.n f39669a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private InterfaceC10585N f39670b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private EnumC9142v f39671c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f39672d;

    /* renamed from: e, reason: collision with root package name */
    private I1.j f39673e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final Function1<Object, Integer> f39674f = new r(this);

    /* renamed from: g, reason: collision with root package name */
    private Function1<? super Integer, Boolean> f39675g;

    static final class a extends AbstractC7737t implements Function0<Float> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Float invoke() {
            q qVar = q.this;
            return Float.valueOf(qVar.f39670b.f() - qVar.f39670b.a());
        }
    }

    static final class b extends AbstractC7737t implements Function0<Float> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Float invoke() {
            return Float.valueOf(q.this.f39670b.c());
        }
    }

    static final class c extends AbstractC7737t implements Function0<Float> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Float invoke() {
            return Float.valueOf(q.this.f39670b.d());
        }
    }

    static final class d extends AbstractC7737t implements Function1<Integer, Boolean> {
        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Integer num) {
            int intValue = num.intValue();
            q qVar = q.this;
            InterfaceC10620y interfaceC10620y = (InterfaceC10620y) qVar.f39669a.invoke();
            if (intValue >= 0 && intValue < interfaceC10620y.getItemCount()) {
                C10727i.c(qVar.getCoroutineScope(), null, null, new s(qVar, intValue, null), 3);
                return Boolean.TRUE;
            }
            StringBuilder f7 = P4.f.f(intValue, "Can't scroll to index ", ", it is out of bounds [0, ");
            f7.append(interfaceC10620y.getItemCount());
            f7.append(')');
            throw new IllegalArgumentException(f7.toString().toString());
        }
    }

    public q(@NotNull kotlin.reflect.n nVar, @NotNull InterfaceC10585N interfaceC10585N, @NotNull EnumC9142v enumC9142v, boolean z11) {
        this.f39669a = nVar;
        this.f39670b = interfaceC10585N;
        this.f39671c = enumC9142v;
        this.f39672d = z11;
        L1();
    }

    private final void L1() {
        this.f39673e = new I1.j(new b(), new c(), false);
        this.f39675g = this.f39672d ? new d() : null;
    }

    public final void K1(@NotNull kotlin.reflect.n nVar, @NotNull InterfaceC10585N interfaceC10585N, @NotNull EnumC9142v enumC9142v, boolean z11) {
        this.f39669a = nVar;
        this.f39670b = interfaceC10585N;
        if (this.f39671c != enumC9142v) {
            this.f39671c = enumC9142v;
            C2809k.f(this).x0();
        }
        if (this.f39672d == z11) {
            return;
        }
        this.f39672d = z11;
        L1();
        C2809k.f(this).x0();
    }

    @Override // D1.E0
    public final void applySemantics(@NotNull D d11) {
        z.x(d11);
        Function1<Object, Integer> function1 = this.f39674f;
        int i11 = I1.u.f11751H;
        d11.b(I1.u.k(), function1);
        if (this.f39671c == EnumC9142v.Vertical) {
            I1.j jVar = this.f39673e;
            if (jVar == null) {
                Intrinsics.n("scrollAxisRange");
                throw null;
            }
            z.z(d11, jVar);
        } else {
            I1.j jVar2 = this.f39673e;
            if (jVar2 == null) {
                Intrinsics.n("scrollAxisRange");
                throw null;
            }
            z.m(d11, jVar2);
        }
        Function1<? super Integer, Boolean> function12 = this.f39675g;
        if (function12 != null) {
            d11.b(I1.k.v(), new C3222a(null, function12));
        }
        z.c(d11, new a());
        z.g(d11, this.f39670b.e());
    }

    @Override // androidx.compose.ui.e.c
    public final boolean getShouldAutoInvalidate() {
        return false;
    }
}
