package J0;

import S0.InterfaceC3972m0;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: J0.m0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3317m0 extends AbstractC7737t implements Function1<B1.B, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ D1.D0<B1.B> f13289b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ View f13290c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f13291d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ InterfaceC3972m0 f13292e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ InterfaceC3972m0 f13293f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3317m0(D1.D0<B1.B> d02, View view, int i11, InterfaceC3972m0 interfaceC3972m0, InterfaceC3972m0 interfaceC3972m02) {
        super(1);
        this.f13289b = d02;
        this.f13290c = view;
        this.f13291d = i11;
        this.f13292e = interfaceC3972m0;
        this.f13293f = interfaceC3972m02;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(B1.B b11) {
        B1.B b12 = b11;
        this.f13292e.d((int) (b12.a() >> 32));
        D1.D0<B1.B> d02 = this.f13289b;
        d02.b(b12);
        C3364y0.b(this.f13290c.getRootView(), d02.a(), this.f13291d, new C3313l0(this.f13293f));
        return Unit.f71690a;
    }
}
