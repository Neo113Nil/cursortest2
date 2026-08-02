package Ve;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class Q9 extends AbstractC7737t implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4699va f29763b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q9(C4699va c4699va) {
        super(1);
        this.f29763b = c4699va;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Zb it = (Zb) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        ((C4318i4) this.f29763b.u()).f0(new C4210ec(it));
        return Unit.f71690a;
    }
}
