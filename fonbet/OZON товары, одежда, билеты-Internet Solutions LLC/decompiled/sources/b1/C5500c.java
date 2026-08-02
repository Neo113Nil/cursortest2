package b1;

import S0.InterfaceC3978p0;
import S0.l1;
import S0.n1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: b1.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C5500c extends AbstractC7737t implements Function2<InterfaceC5518u, InterfaceC3978p0<Object>, InterfaceC3978p0<Object>> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C5517t f55422b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5500c(C5517t c5517t) {
        super(2);
        this.f55422b = c5517t;
    }

    @Override // kotlin.jvm.functions.Function2
    public final InterfaceC3978p0<Object> invoke(InterfaceC5518u interfaceC5518u, InterfaceC3978p0<Object> interfaceC3978p0) {
        InterfaceC5518u interfaceC5518u2 = interfaceC5518u;
        InterfaceC3978p0<Object> interfaceC3978p02 = interfaceC3978p0;
        if (!(interfaceC3978p02 instanceof c1.t)) {
            throw new IllegalArgumentException("If you use a custom MutableState implementation you have to write a custom Saver and pass it as a saver param to rememberSaveable()");
        }
        Object invoke = this.f55422b.f55472a.invoke(interfaceC5518u2, interfaceC3978p02.getValue());
        if (invoke == null) {
            return null;
        }
        l1 a11 = ((c1.t) interfaceC3978p02).a();
        Intrinsics.g(a11, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<kotlin.Any?>");
        return n1.f(invoke, a11);
    }
}
