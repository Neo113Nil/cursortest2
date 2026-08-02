package Mf0;

import S0.InterfaceC3978p0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
final class u extends AbstractC7737t implements Function1<String, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0<String> f18056b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    u(InterfaceC3978p0<String> interfaceC3978p0) {
        super(1);
        this.f18056b = interfaceC3978p0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String it = str;
        Intrinsics.checkNotNullParameter(it, "it");
        this.f18056b.setValue(it);
        return Unit.f71690a;
    }
}
