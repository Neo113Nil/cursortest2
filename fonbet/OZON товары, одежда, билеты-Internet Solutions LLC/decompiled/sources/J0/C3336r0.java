package J0;

import S0.InterfaceC3972m0;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: J0.r0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3336r0 extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ View f13369b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ D1.D0<B1.B> f13370c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f13371d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ InterfaceC3972m0 f13372e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3336r0(View view, D1.D0<B1.B> d02, int i11, InterfaceC3972m0 interfaceC3972m0) {
        super(0);
        this.f13369b = view;
        this.f13370c = d02;
        this.f13371d = i11;
        this.f13372e = interfaceC3972m0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C3364y0.b(this.f13369b.getRootView(), this.f13370c.a(), this.f13371d, new C3333q0(this.f13372e));
        return Unit.f71690a;
    }
}
