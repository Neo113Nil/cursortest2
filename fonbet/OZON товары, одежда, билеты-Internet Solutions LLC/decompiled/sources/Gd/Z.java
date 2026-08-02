package Gd;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
final class Z implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final Sd.f f10002a;

    public Z(Sd.f fVar) {
        this.f10002a = fVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ce.l it = (ce.l) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        return it.b(this.f10002a, Bd.c.WHEN_GET_SUPER_MEMBERS);
    }
}
