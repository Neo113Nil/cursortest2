package Kd;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import td.InterfaceC9836b;

/* loaded from: classes10.dex */
final class b0 implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final b0 f15881a = new b0();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterfaceC9836b it = (InterfaceC9836b) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        je.N returnType = it.getReturnType();
        Intrinsics.f(returnType);
        return returnType;
    }
}
