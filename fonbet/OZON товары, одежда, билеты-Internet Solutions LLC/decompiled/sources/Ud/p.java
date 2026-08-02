package Ud;

import je.C7385i0;
import je.N;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
final class p implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final p f27608a = new p();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        N it = (N) obj;
        int i11 = u.f27613f;
        Intrinsics.checkNotNullParameter(it, "it");
        return it instanceof C7385i0 ? ((C7385i0) it).Q0() : it;
    }
}
