package Ud;

import je.N;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
final class s implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final u f27611a;

    public s(u uVar) {
        this.f27611a = uVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        N n11 = (N) obj;
        Intrinsics.f(n11);
        return this.f27611a.h0(n11);
    }
}
