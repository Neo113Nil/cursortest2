package Gf0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Gf0.x, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3120x extends AbstractC7737t implements Function1<Lf0.d, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Function1<C, Unit> f10225b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    C3120x(Function1<? super C, Unit> function1) {
        super(1);
        this.f10225b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Lf0.d dVar) {
        Lf0.d it = dVar;
        Intrinsics.checkNotNullParameter(it, "it");
        this.f10225b.invoke(new U(it));
        return Unit.f71690a;
    }
}
