package Vd;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import td.InterfaceC9836b;

/* loaded from: classes10.dex */
final class t implements Function1<InterfaceC9836b, Unit> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ m f28559a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC9836b f28560b;

    t(m mVar, InterfaceC9836b interfaceC9836b) {
        this.f28559a = mVar;
        this.f28560b = interfaceC9836b;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC9836b interfaceC9836b) {
        InterfaceC9836b second = interfaceC9836b;
        m mVar = this.f28559a;
        InterfaceC9836b first = this.f28560b;
        Intrinsics.checkNotNullParameter(first, "first");
        Intrinsics.checkNotNullParameter(second, "second");
        mVar.b(first, second);
        return Unit.f71690a;
    }
}
