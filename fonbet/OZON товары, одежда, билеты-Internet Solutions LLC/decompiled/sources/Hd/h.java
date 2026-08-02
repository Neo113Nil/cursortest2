package Hd;

import je.Y;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import td.InterfaceC9839e;

/* loaded from: classes10.dex */
final class h implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC9839e f10851a;

    public h(InterfaceC9839e interfaceC9839e, i iVar, Y y11, a aVar) {
        this.f10851a = interfaceC9839e;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ke.h kotlinTypeRefiner = (ke.h) obj;
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        Sd.b f7 = Zd.e.f(this.f10851a);
        if (f7 == null) {
            return null;
        }
        kotlinTypeRefiner.b(f7);
        return null;
    }
}
