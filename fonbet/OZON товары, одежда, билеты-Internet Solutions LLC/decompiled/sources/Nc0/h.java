package Nc0;

import Ae.InterfaceC2395h;
import Ae.O0;
import Ae.x0;
import Nc0.g;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class h implements g {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final x0<g.a> f18994a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC2395h<g.a> f18995b;

    /* renamed from: c, reason: collision with root package name */
    private Function1<? super Function1<? super Boolean, Unit>, Unit> f18996c;

    /* renamed from: d, reason: collision with root package name */
    private Function1<? super Function1<? super Boolean, Unit>, Unit> f18997d;

    public h() {
        x0<g.a> a11 = O0.a(null);
        this.f18994a = a11;
        this.f18995b = a11;
    }

    @Override // Nc0.g
    public final void f(Function1<? super Function1<? super Boolean, Unit>, Unit> function1) {
        this.f18997d = function1;
    }

    @Override // Nc0.g
    public final Function0<Boolean> l() {
        return null;
    }

    @Override // Nc0.g
    public final Function1<Function1<? super Boolean, Unit>, Unit> n() {
        return this.f18996c;
    }

    @Override // Nc0.g
    public final void o(Function1<? super Function1<? super Boolean, Unit>, Unit> function1) {
        this.f18996c = function1;
    }

    @Override // Nc0.g
    public final void r(g.a aVar) {
        this.f18994a.setValue(aVar);
    }

    @Override // Nc0.g
    @NotNull
    public final InterfaceC2395h<g.a> s() {
        return this.f18995b;
    }

    @Override // Nc0.g
    public final Function1<Function1<? super Boolean, Unit>, Unit> w() {
        return this.f18997d;
    }

    @Override // Nc0.g
    public final Function0<Boolean> x() {
        return null;
    }
}
