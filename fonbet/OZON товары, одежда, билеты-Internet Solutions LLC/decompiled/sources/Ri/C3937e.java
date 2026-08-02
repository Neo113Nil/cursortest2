package Ri;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.atoms.af.AtomAction;

/* renamed from: Ri.e, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C3937e extends AbstractC7737t implements Function1<AtomAction, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C3933a f25117b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3937e(C3933a c3933a) {
        super(1);
        this.f25117b = c3933a;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(AtomAction atomAction) {
        AtomAction it = atomAction;
        Intrinsics.checkNotNullParameter(it, "it");
        C3933a.t(this.f25117b, it, C3936d.f25116b);
        return Unit.f71690a;
    }
}
