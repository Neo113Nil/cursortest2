package Vd;

import kotlin.jvm.functions.Function1;
import td.C9852r;
import td.InterfaceC9836b;
import td.InterfaceC9839e;

/* loaded from: classes10.dex */
final class r implements Function1<InterfaceC9836b, Boolean> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC9839e f28558a;

    r(InterfaceC9839e interfaceC9839e) {
        this.f28558a = interfaceC9839e;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(InterfaceC9836b interfaceC9836b) {
        InterfaceC9836b interfaceC9836b2 = interfaceC9836b;
        return Boolean.valueOf(!C9852r.g(interfaceC9836b2.getVisibility()) && C9852r.h(interfaceC9836b2, this.f28558a));
    }
}
