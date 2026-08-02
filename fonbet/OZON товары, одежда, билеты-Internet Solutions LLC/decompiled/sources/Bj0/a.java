package Bj0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import xj0.InterfaceC10781a;

/* loaded from: classes3.dex */
final class a extends AbstractC7737t implements Function1<String, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ g f3888b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a(g gVar) {
        super(1);
        this.f3888b = gVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String it = str;
        Intrinsics.checkNotNullParameter(it, "it");
        this.f3888b.h0(new InterfaceC10781a.C2284a(it));
        return Unit.f71690a;
    }
}
