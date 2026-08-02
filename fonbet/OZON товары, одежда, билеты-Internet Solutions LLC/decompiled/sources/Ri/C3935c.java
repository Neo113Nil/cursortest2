package Ri;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.atoms.af.AtomAction;

/* renamed from: Ri.c, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C3935c extends AbstractC7737t implements Function1<AtomAction, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C3933a f25115b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3935c(C3933a c3933a) {
        super(1);
        this.f25115b = c3933a;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(AtomAction atomAction) {
        AtomAction it = atomAction;
        Intrinsics.checkNotNullParameter(it, "it");
        C3933a.t(this.f25115b, it, C3934b.f25114b);
        return Unit.f71690a;
    }
}
