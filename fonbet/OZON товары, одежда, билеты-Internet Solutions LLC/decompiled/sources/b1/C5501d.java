package b1;

import S0.InterfaceC3978p0;
import S0.l1;
import S0.n1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: b1.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C5501d extends AbstractC7737t implements Function1<InterfaceC3978p0<Object>, InterfaceC3978p0<Object>> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C5517t f55423b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5501d(C5517t c5517t) {
        super(1);
        this.f55423b = c5517t;
    }

    @Override // kotlin.jvm.functions.Function1
    public final InterfaceC3978p0<Object> invoke(InterfaceC3978p0<Object> interfaceC3978p0) {
        Object obj;
        InterfaceC3978p0<Object> interfaceC3978p02 = interfaceC3978p0;
        if (!(interfaceC3978p02 instanceof c1.t)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (interfaceC3978p02.getValue() != null) {
            Object value = interfaceC3978p02.getValue();
            Intrinsics.f(value);
            obj = this.f55423b.f55473b.invoke(value);
        } else {
            obj = null;
        }
        l1 a11 = ((c1.t) interfaceC3978p02).a();
        Intrinsics.g(a11, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.saveable.RememberSaveableKt.mutableStateSaver$lambda$3?>");
        return n1.f(obj, a11);
    }
}
