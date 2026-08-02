package Xd;

import je.Y;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import td.InterfaceC9815F;

/* loaded from: classes10.dex */
final class h implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final qd.p f34401a;

    public h(qd.p pVar) {
        this.f34401a = pVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterfaceC9815F it = (InterfaceC9815F) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        Y H11 = it.n().H(this.f34401a);
        Intrinsics.checkNotNullExpressionValue(H11, "getPrimitiveArrayKotlinType(...)");
        return H11;
    }
}
