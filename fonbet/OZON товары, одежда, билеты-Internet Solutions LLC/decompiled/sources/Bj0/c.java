package Bj0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import xj0.InterfaceC10781a;

/* loaded from: classes3.dex */
final class c extends AbstractC7737t implements Function1<String, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ g f3890b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(g gVar) {
        super(1);
        this.f3890b = gVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String it = str;
        Intrinsics.checkNotNullParameter(it, "it");
        this.f3890b.h0(new InterfaceC10781a.c(it));
        return Unit.f71690a;
    }
}
