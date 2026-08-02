package Gf0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Gf0.v, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3118v extends AbstractC7737t implements Function1<qf0.b, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Function1<C, Unit> f10223b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    C3118v(Function1<? super C, Unit> function1) {
        super(1);
        this.f10223b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(qf0.b bVar) {
        qf0.b it = bVar;
        Intrinsics.checkNotNullParameter(it, "it");
        this.f10223b.invoke(new S(it));
        return Unit.f71690a;
    }
}
