package W20;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l1.AbstractC7799Q;
import n1.InterfaceC8410c;
import n1.InterfaceC8412e;

/* loaded from: classes3.dex */
final class b extends AbstractC7737t implements Function1<InterfaceC8410c, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AbstractC7799Q f33218b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(AbstractC7799Q abstractC7799Q) {
        super(1);
        this.f33218b = abstractC7799Q;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC8410c interfaceC8410c) {
        InterfaceC8410c onDrawWithContent = interfaceC8410c;
        Intrinsics.checkNotNullParameter(onDrawWithContent, "$this$onDrawWithContent");
        onDrawWithContent.F0();
        AbstractC7799Q abstractC7799Q = this.f33218b;
        Intrinsics.f(abstractC7799Q);
        InterfaceC8412e.k0(onDrawWithContent, abstractC7799Q, 0L, 0L, 0.0f, null, 9, 62);
        return Unit.f71690a;
    }
}
