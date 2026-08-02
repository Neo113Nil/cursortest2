package Ud;

import je.L0;
import je.N;
import je.y0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
final class q implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final u f27609a;

    public q(u uVar) {
        this.f27609a = uVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        y0 it = (y0) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.a()) {
            return "*";
        }
        N type = it.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        String h02 = this.f27609a.h0(type);
        if (it.b() == L0.INVARIANT) {
            return h02;
        }
        return it.b() + ' ' + h02;
    }
}
