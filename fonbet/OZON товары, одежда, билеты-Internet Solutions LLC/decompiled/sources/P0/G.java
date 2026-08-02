package P0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class G extends AbstractC7737t implements Function1<I1.D, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f20634b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    G(String str) {
        super(1);
        this.f20634b = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(I1.D d11) {
        I1.D d12 = d11;
        I1.z.i(d12, this.f20634b);
        I1.z.q(d12, 5);
        return Unit.f71690a;
    }
}
