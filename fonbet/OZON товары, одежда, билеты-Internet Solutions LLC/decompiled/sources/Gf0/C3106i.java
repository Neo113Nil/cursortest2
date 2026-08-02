package Gf0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Gf0.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3106i extends AbstractC7737t implements Function1<String, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Function1<C, Unit> f10194b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    C3106i(Function1<? super C, Unit> function1) {
        super(1);
        this.f10194b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String it = str;
        Intrinsics.checkNotNullParameter(it, "it");
        this.f10194b.invoke(new Q(it));
        return Unit.f71690a;
    }
}
