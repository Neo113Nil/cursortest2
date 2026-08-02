package androidx.compose.material3.internal;

import P0.EnumC3790y1;
import Q0.InterfaceC3831c;
import S0.A1;
import S0.C0;
import S0.C3985t0;
import S0.C3991w0;
import S0.D1;
import S0.n1;
import androidx.recyclerview.widget.LinearLayoutManager;
import fd.InterfaceC6511n;
import fd.InterfaceC6512o;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m0.InterfaceC8002m;
import m0.T0;
import n0.EnumC8372M;
import org.jetbrains.annotations.NotNull;
import xe.N;

/* loaded from: classes8.dex */
public final class p<T> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function1<Float, Float> f40284a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function0<Float> f40285b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final T0 f40286c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Function1<T, Boolean> f40287d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final r f40288e = new r();

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final l f40289f = new l(this);

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final C3991w0 f40290g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final A1 f40291h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final A1 f40292i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final C3985t0 f40293j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final A1 f40294k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final C3985t0 f40295l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final C3991w0 f40296m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private final C3991w0 f40297n;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private final j f40298o;

    public p(EnumC3790y1 enumC3790y1, @NotNull Function1 function1, @NotNull Function0 function0, @NotNull T0 t02, @NotNull Function1 function12) {
        C3991w0 f7;
        C3991w0 f11;
        C3991w0 f12;
        this.f40284a = function1;
        this.f40285b = function0;
        this.f40286c = t02;
        this.f40287d = function12;
        f7 = n1.f(enumC3790y1, D1.f25195a);
        this.f40290g = f7;
        this.f40291h = n1.e(new n(this));
        this.f40292i = n1.e(new k(this));
        this.f40293j = C0.a(Float.NaN);
        this.f40294k = n1.d(n1.n(), new m(this));
        this.f40295l = C0.a(0.0f);
        f11 = n1.f(null, D1.f25195a);
        this.f40296m = f11;
        f12 = n1.f(new t(U.c()), D1.f25195a);
        this.f40297n = f12;
        this.f40298o = new j(this);
    }

    public static final Object c(p pVar) {
        return pVar.f40296m.getValue();
    }

    public static final void e(p pVar, Object obj) {
        pVar.f40296m.setValue(obj);
    }

    public static final void f(p pVar, float f7) {
        pVar.f40295l.h(f7);
    }

    public static final void g(p pVar, float f7) {
        pVar.f40293j.h(f7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object j(float f7, float f11, Object obj) {
        InterfaceC3831c<T> l11 = l();
        float e11 = l11.e(obj);
        float floatValue = this.f40285b.invoke().floatValue();
        if (e11 != f7 && !Float.isNaN(e11)) {
            Function1<Float, Float> function1 = this.f40284a;
            if (e11 < f7) {
                if (f11 >= floatValue) {
                    T a11 = l11.a(f7, true);
                    Intrinsics.f(a11);
                    return a11;
                }
                T a12 = l11.a(f7, true);
                Intrinsics.f(a12);
                if (f7 >= Math.abs(Math.abs(function1.invoke(Float.valueOf(Math.abs(l11.e(a12) - e11))).floatValue()) + e11)) {
                    return a12;
                }
            } else {
                if (f11 <= (-floatValue)) {
                    T a13 = l11.a(f7, false);
                    Intrinsics.f(a13);
                    return a13;
                }
                T a14 = l11.a(f7, false);
                Intrinsics.f(a14);
                float abs = Math.abs(e11 - Math.abs(function1.invoke(Float.valueOf(Math.abs(e11 - l11.e(a14)))).floatValue()));
                if (f7 >= 0.0f ? f7 <= abs : Math.abs(f7) >= abs) {
                    return a14;
                }
            }
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x(T t2) {
        this.f40290g.setValue(t2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(Object obj, @NotNull EnumC8372M enumC8372M, @NotNull InterfaceC6512o interfaceC6512o, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        h hVar;
        int i11;
        p<T> pVar;
        r rVar;
        i iVar;
        T b11;
        T b12;
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i12 = hVar.f40262g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                hVar.f40262g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj2 = hVar.f40260e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = hVar.f40262g;
                if (i11 != 0) {
                    Sc.s.b(obj2);
                    if (!l().c(obj)) {
                        x(obj);
                        return Unit.f71690a;
                    }
                    try {
                        rVar = this.f40288e;
                        iVar = new i(this, obj, interfaceC6512o, null);
                        hVar.f40259d = this;
                        hVar.f40262g = 1;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    try {
                        rVar.getClass();
                        if (N.d(new s(enumC8372M, rVar, iVar, null), hVar) == aVar) {
                            return aVar;
                        }
                        pVar = this;
                    } catch (Throwable th3) {
                        th = th3;
                        pVar = this;
                        pVar.f40296m.setValue(null);
                        InterfaceC3831c<T> l11 = pVar.l();
                        C3985t0 c3985t0 = pVar.f40293j;
                        b11 = l11.b(c3985t0.getFloatValue());
                        if (b11 != null) {
                            pVar.x(b11);
                        }
                        throw th;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    pVar = hVar.f40259d;
                    try {
                        Sc.s.b(obj2);
                    } catch (Throwable th4) {
                        th = th4;
                        pVar.f40296m.setValue(null);
                        InterfaceC3831c<T> l112 = pVar.l();
                        C3985t0 c3985t02 = pVar.f40293j;
                        b11 = l112.b(c3985t02.getFloatValue());
                        if (b11 != null && Math.abs(c3985t02.getFloatValue() - pVar.l().e(b11)) <= 0.5f && pVar.f40287d.invoke(b11).booleanValue()) {
                            pVar.x(b11);
                        }
                        throw th;
                    }
                }
                pVar.f40296m.setValue(null);
                InterfaceC3831c<T> l12 = pVar.l();
                C3985t0 c3985t03 = pVar.f40293j;
                b12 = l12.b(c3985t03.getFloatValue());
                if (b12 != null && Math.abs(c3985t03.getFloatValue() - pVar.l().e(b12)) <= 0.5f && pVar.f40287d.invoke(b12).booleanValue()) {
                    pVar.x(b12);
                }
                return Unit.f71690a;
            }
        }
        hVar = new h(this, cVar);
        Object obj22 = hVar.f40260e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = hVar.f40262g;
        if (i11 != 0) {
        }
        pVar.f40296m.setValue(null);
        InterfaceC3831c<T> l122 = pVar.l();
        C3985t0 c3985t032 = pVar.f40293j;
        b12 = l122.b(c3985t032.getFloatValue());
        if (b12 != null) {
            pVar.x(b12);
        }
        return Unit.f71690a;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(@NotNull EnumC8372M enumC8372M, @NotNull InterfaceC6511n interfaceC6511n, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        f fVar;
        int i11;
        p<T> pVar;
        r rVar;
        g gVar;
        T b11;
        T b12;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i12 = fVar.f40250g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                fVar.f40250g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = fVar.f40248e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = fVar.f40250g;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    try {
                        rVar = this.f40288e;
                        gVar = new g(this, interfaceC6511n, null);
                        fVar.f40247d = this;
                        fVar.f40250g = 1;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    try {
                        rVar.getClass();
                        if (N.d(new s(enumC8372M, rVar, gVar, null), fVar) == aVar) {
                            return aVar;
                        }
                        pVar = this;
                    } catch (Throwable th3) {
                        th = th3;
                        pVar = this;
                        InterfaceC3831c<T> l11 = pVar.l();
                        C3985t0 c3985t0 = pVar.f40293j;
                        b11 = l11.b(c3985t0.getFloatValue());
                        if (b11 != null) {
                            pVar.x(b11);
                        }
                        throw th;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    pVar = fVar.f40247d;
                    try {
                        Sc.s.b(obj);
                    } catch (Throwable th4) {
                        th = th4;
                        InterfaceC3831c<T> l112 = pVar.l();
                        C3985t0 c3985t02 = pVar.f40293j;
                        b11 = l112.b(c3985t02.getFloatValue());
                        if (b11 != null && Math.abs(c3985t02.getFloatValue() - pVar.l().e(b11)) <= 0.5f && pVar.f40287d.invoke(b11).booleanValue()) {
                            pVar.x(b11);
                        }
                        throw th;
                    }
                }
                InterfaceC3831c<T> l12 = pVar.l();
                C3985t0 c3985t03 = pVar.f40293j;
                b12 = l12.b(c3985t03.getFloatValue());
                if (b12 != null && Math.abs(c3985t03.getFloatValue() - pVar.l().e(b12)) <= 0.5f && pVar.f40287d.invoke(b12).booleanValue()) {
                    pVar.x(b12);
                }
                return Unit.f71690a;
            }
        }
        fVar = new f(this, cVar);
        Object obj2 = fVar.f40248e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = fVar.f40250g;
        if (i11 != 0) {
        }
        InterfaceC3831c<T> l122 = pVar.l();
        C3985t0 c3985t032 = pVar.f40293j;
        b12 = l122.b(c3985t032.getFloatValue());
        if (b12 != null) {
            pVar.x(b12);
        }
        return Unit.f71690a;
    }

    public final float k(float f7) {
        float v11 = v(f7);
        C3985t0 c3985t0 = this.f40293j;
        float floatValue = Float.isNaN(c3985t0.getFloatValue()) ? 0.0f : c3985t0.getFloatValue();
        c3985t0.h(v11);
        return v11 - floatValue;
    }

    @NotNull
    public final InterfaceC3831c<T> l() {
        return (InterfaceC3831c) this.f40297n.getValue();
    }

    @NotNull
    public final InterfaceC8002m<Float> m() {
        return this.f40286c;
    }

    public final T n() {
        return (T) this.f40292i.getValue();
    }

    @NotNull
    public final Function1<T, Boolean> o() {
        return this.f40287d;
    }

    public final T p() {
        return this.f40290g.getValue();
    }

    @NotNull
    public final l q() {
        return this.f40289f;
    }

    public final float r() {
        return this.f40295l.getFloatValue();
    }

    public final float s() {
        return this.f40293j.getFloatValue();
    }

    public final T t() {
        return (T) this.f40291h.getValue();
    }

    public final boolean u() {
        return this.f40296m.getValue() != null;
    }

    public final float v(float f7) {
        C3985t0 c3985t0 = this.f40293j;
        return kotlin.ranges.h.d((Float.isNaN(c3985t0.getFloatValue()) ? 0.0f : c3985t0.getFloatValue()) + f7, l().d(), l().f());
    }

    public final float w() {
        C3985t0 c3985t0 = this.f40293j;
        if (Float.isNaN(c3985t0.getFloatValue())) {
            throw new IllegalStateException("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
        }
        return c3985t0.getFloatValue();
    }

    public final Object y(float f7, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        T value = this.f40290g.getValue();
        Object j11 = j(w(), f7, value);
        if (((Boolean) this.f40287d.invoke(j11)).booleanValue()) {
            Object c11 = e.c(this, j11, f7, (kotlin.coroutines.jvm.internal.j) dVar);
            return c11 == Wc.a.COROUTINE_SUSPENDED ? c11 : Unit.f71690a;
        }
        Object c12 = e.c(this, value, f7, (kotlin.coroutines.jvm.internal.j) dVar);
        return c12 == Wc.a.COROUTINE_SUSPENDED ? c12 : Unit.f71690a;
    }

    public final void z(@NotNull InterfaceC3831c<T> interfaceC3831c, T t2) {
        if (Intrinsics.d(l(), interfaceC3831c)) {
            return;
        }
        this.f40297n.setValue(interfaceC3831c);
        if (this.f40288e.d(new o(this, t2))) {
            return;
        }
        this.f40296m.setValue(t2);
    }
}
