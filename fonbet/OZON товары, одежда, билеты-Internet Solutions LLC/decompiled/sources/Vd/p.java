package Vd;

import kotlin.jvm.functions.Function1;
import td.InterfaceC9836b;
import td.InterfaceC9845k;

/* loaded from: classes10.dex */
final class p implements Function1<InterfaceC9836b, Boolean> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC9845k f28557a;

    p(InterfaceC9845k interfaceC9845k) {
        this.f28557a = interfaceC9845k;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(InterfaceC9836b interfaceC9836b) {
        return Boolean.valueOf(interfaceC9836b.d() == this.f28557a);
    }
}
