package J0;

import S0.InterfaceC3972m0;
import android.view.View;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: J0.s0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3340s0 extends AbstractC7737t implements Function1<S0.N, S0.M> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ View f13388b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ D1.D0<B1.B> f13389c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f13390d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ InterfaceC3972m0 f13391e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3340s0(View view, D1.D0<B1.B> d02, int i11, InterfaceC3972m0 interfaceC3972m0) {
        super(1);
        this.f13388b = view;
        this.f13389c = d02;
        this.f13390d = i11;
        this.f13391e = interfaceC3972m0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final S0.M invoke(S0.N n11) {
        InterfaceC3972m0 interfaceC3972m0 = this.f13391e;
        View view = this.f13388b;
        return new C3329p0(new ViewOnAttachStateChangeListenerC3345t1(view, new C3336r0(view, this.f13389c, this.f13390d, interfaceC3972m0)));
    }
}
