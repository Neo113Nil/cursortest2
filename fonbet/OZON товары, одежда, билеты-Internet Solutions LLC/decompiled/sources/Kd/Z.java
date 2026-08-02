package Kd;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import td.InterfaceC9834Z;
import td.InterfaceC9836b;

/* loaded from: classes10.dex */
final class Z implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final Z f15875a = new Z();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterfaceC9836b it = (InterfaceC9836b) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        InterfaceC9834Z d02 = it.d0();
        Intrinsics.f(d02);
        je.N type = d02.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        return type;
    }
}
