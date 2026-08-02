package Kd;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import td.InterfaceC9836b;
import td.p0;

/* loaded from: classes10.dex */
final class a0 implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final p0 f15878a;

    public a0(p0 p0Var) {
        this.f15878a = p0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterfaceC9836b it = (InterfaceC9836b) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        je.N type = it.f().get(this.f15878a.getIndex()).getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        return type;
    }
}
