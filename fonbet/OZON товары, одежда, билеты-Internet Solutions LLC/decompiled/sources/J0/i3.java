package J0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class i3 extends AbstractC7737t implements Function1<I1.D, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f13240b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i3(String str) {
        super(1);
        this.f13240b = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(I1.D d11) {
        int i11 = I1.z.f11793b;
        d11.b(I1.u.f(), this.f13240b);
        return Unit.f71690a;
    }
}
