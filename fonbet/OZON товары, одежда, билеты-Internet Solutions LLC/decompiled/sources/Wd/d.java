package Wd;

import je.N;
import je.y0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
final class d implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final y0 f33512a;

    public d(y0 y0Var) {
        this.f33512a = y0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        N type = this.f33512a.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        return type;
    }
}
