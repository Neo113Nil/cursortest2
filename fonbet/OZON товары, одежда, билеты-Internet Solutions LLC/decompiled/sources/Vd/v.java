package Vd;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
final class v implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final te.i f28565a;

    public v(te.i iVar) {
        this.f28565a = iVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Intrinsics.f(obj);
        this.f28565a.add(obj);
        return Unit.f71690a;
    }
}
