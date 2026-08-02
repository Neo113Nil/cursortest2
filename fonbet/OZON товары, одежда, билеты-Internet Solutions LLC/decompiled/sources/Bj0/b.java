package Bj0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import xj0.InterfaceC10781a;

/* loaded from: classes3.dex */
final class b extends AbstractC7737t implements Function1<String, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ g f3889b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(g gVar) {
        super(1);
        this.f3889b = gVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String it = str;
        Intrinsics.checkNotNullParameter(it, "it");
        this.f3889b.h0(new InterfaceC10781a.b(it));
        return Unit.f71690a;
    }
}
