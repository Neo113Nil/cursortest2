package Nc0;

import Ae.InterfaceC2395h;
import Ae.M0;
import Nc0.g;
import Nc0.n;
import android.content.Intent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class f implements k, i, d, m, g, a, c {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ k f18985a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ i f18986b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ d f18987c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ m f18988d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ g f18989e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ a f18990f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ c f18991g;

    public f(@NotNull k screenStateHolder, @NotNull i reloadEventHolder, @NotNull d errorNotificationHolder, @NotNull m titleHolder, @NotNull g navigationButtonsHolder, @NotNull a activityIntentHolder, @NotNull c backStackSizeProvider) {
        Intrinsics.checkNotNullParameter(screenStateHolder, "screenStateHolder");
        Intrinsics.checkNotNullParameter(reloadEventHolder, "reloadEventHolder");
        Intrinsics.checkNotNullParameter(errorNotificationHolder, "errorNotificationHolder");
        Intrinsics.checkNotNullParameter(titleHolder, "titleHolder");
        Intrinsics.checkNotNullParameter(navigationButtonsHolder, "navigationButtonsHolder");
        Intrinsics.checkNotNullParameter(activityIntentHolder, "activityIntentHolder");
        Intrinsics.checkNotNullParameter(backStackSizeProvider, "backStackSizeProvider");
        this.f18985a = screenStateHolder;
        this.f18986b = reloadEventHolder;
        this.f18987c = errorNotificationHolder;
        this.f18988d = titleHolder;
        this.f18989e = navigationButtonsHolder;
        this.f18990f = activityIntentHolder;
        this.f18991g = backStackSizeProvider;
    }

    @Override // Nc0.a
    public final Object a(@NotNull Intent intent, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        return this.f18990f.a(intent, dVar);
    }

    @Override // Nc0.i
    public final void b(@NotNull Function0<Unit> onReloadListener) {
        Intrinsics.checkNotNullParameter(onReloadListener, "onReloadListener");
        this.f18986b.b(onReloadListener);
    }

    @Override // Nc0.m
    @NotNull
    public final InterfaceC2395h<n.a> c() {
        return this.f18988d.c();
    }

    @Override // Nc0.i
    public final void d(@NotNull Function0<Unit> onReloadListener) {
        Intrinsics.checkNotNullParameter(onReloadListener, "onReloadListener");
        this.f18986b.d(onReloadListener);
    }

    @Override // Nc0.a
    @NotNull
    public final InterfaceC2395h<Intent> e() {
        return this.f18990f.e();
    }

    @Override // Nc0.g
    public final void f(Function1<? super Function1<? super Boolean, Unit>, Unit> function1) {
        this.f18989e.f(function1);
    }

    @Override // Nc0.k
    public final void g() {
        this.f18985a.g();
    }

    @Override // Nc0.m
    public final void h() {
        this.f18988d.h();
    }

    @Override // Nc0.k
    public final void hideLoader() {
        this.f18985a.hideLoader();
    }

    @Override // Nc0.c
    @NotNull
    public final M0<Integer> i() {
        return this.f18991g.i();
    }

    @Override // Nc0.k
    public final void j() {
        this.f18985a.j();
    }

    @Override // Nc0.k
    @NotNull
    public final InterfaceC2395h<Boolean> k() {
        return this.f18985a.k();
    }

    @Override // Nc0.g
    public final Function0<Boolean> l() {
        return this.f18989e.l();
    }

    @Override // Nc0.i
    public final void m() {
        this.f18986b.m();
    }

    @Override // Nc0.g
    public final Function1<Function1<? super Boolean, Unit>, Unit> n() {
        return this.f18989e.n();
    }

    @Override // Nc0.g
    public final void o(Function1<? super Function1<? super Boolean, Unit>, Unit> function1) {
        this.f18989e.o(function1);
    }

    @Override // Nc0.k
    public final void p() {
        this.f18985a.p();
    }

    @Override // Nc0.m
    public final void q(String str) {
        this.f18988d.q(str);
    }

    @Override // Nc0.g
    public final void r(g.a aVar) {
        this.f18989e.r(aVar);
    }

    @Override // Nc0.g
    @NotNull
    public final InterfaceC2395h<g.a> s() {
        return this.f18989e.s();
    }

    @Override // Nc0.d
    @NotNull
    public final InterfaceC2395h<String> t() {
        return this.f18987c.t();
    }

    @Override // Nc0.k
    @NotNull
    public final InterfaceC2395h<ru.ozon.id.nativeauth.main.b> u() {
        return this.f18985a.u();
    }

    @Override // Nc0.k
    public final void v(@NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        this.f18985a.v(throwable);
    }

    @Override // Nc0.g
    public final Function1<Function1<? super Boolean, Unit>, Unit> w() {
        return this.f18989e.w();
    }

    @Override // Nc0.g
    public final Function0<Boolean> x() {
        return this.f18989e.x();
    }

    @Override // Nc0.d
    public final void y(String str) {
        this.f18987c.y(str);
    }
}
