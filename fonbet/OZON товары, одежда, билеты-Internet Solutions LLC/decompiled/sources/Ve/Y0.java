package Ve;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class Y0 extends AbstractC7737t implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4344j2 f30424b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y0(C4344j2 c4344j2) {
        super(1);
        this.f30424b = c4344j2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C4608s6 it = (C4608s6) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        ((C4261g5) this.f30424b.u()).e0(new Lm(it));
        return Unit.f71690a;
    }
}
