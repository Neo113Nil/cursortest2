package Mf0;

import S0.InterfaceC3978p0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: Mf0.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3633o extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ O f18045b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0<String> f18046c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3633o(O o11, InterfaceC3978p0<String> interfaceC3978p0) {
        super(0);
        this.f18045b = o11;
        this.f18046c = interfaceC3978p0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f18045b.i0("x-o3-meshversion");
        this.f18046c.setValue(null);
        return Unit.f71690a;
    }
}
