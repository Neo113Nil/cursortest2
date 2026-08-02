package I0;

import B0.InterfaceC2477h1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import x1.C10639n;

/* renamed from: I0.j0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3190j0 extends AbstractC7737t implements Function1<x1.x, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC2477h1 f11549b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3190j0(InterfaceC2477h1 interfaceC2477h1) {
        super(1);
        this.f11549b = interfaceC2477h1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(x1.x xVar) {
        x1.x xVar2 = xVar;
        this.f11549b.b(C10639n.f(xVar2));
        xVar2.a();
        return Unit.f71690a;
    }
}
