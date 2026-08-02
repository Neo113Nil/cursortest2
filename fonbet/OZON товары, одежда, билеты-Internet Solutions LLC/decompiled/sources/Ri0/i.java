package Ri0;

import gf0.C6730b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import mf0.C8143e;
import mf0.InterfaceC8142d;

/* loaded from: classes3.dex */
final class i extends AbstractC7737t implements Function1<Hi0.a, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC8142d f25145b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(InterfaceC8142d interfaceC8142d) {
        super(1);
        this.f25145b = interfaceC8142d;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Hi0.a aVar) {
        Hi0.a item = aVar;
        Intrinsics.checkNotNullParameter(item, "item");
        C6730b c6730b = new C6730b(item.b());
        c6730b.a();
        this.f25145b.c(c6730b, C8143e.f74843b);
        return Unit.f71690a;
    }
}
