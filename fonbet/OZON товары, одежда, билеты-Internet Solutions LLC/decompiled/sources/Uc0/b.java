package Uc0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
final class b extends AbstractC7737t implements Function1<String, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ c f27529b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(c cVar) {
        super(1);
        this.f27529b = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        Function1 function1;
        String sms = str;
        Intrinsics.checkNotNullParameter(sms, "sms");
        function1 = this.f27529b.f27531a;
        function1.invoke(sms);
        return Unit.f71690a;
    }
}
