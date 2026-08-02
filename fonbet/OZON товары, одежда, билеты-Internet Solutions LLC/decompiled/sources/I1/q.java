package I1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class q extends AbstractC7737t implements Function1<D, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f11730b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    q(String str) {
        super(1);
        this.f11730b = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(D d11) {
        z.i(d11, this.f11730b);
        return Unit.f71690a;
    }
}
