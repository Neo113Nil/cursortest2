package If0;

import If0.J;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: If0.v, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3255v extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Function1<I, Unit> f12474b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ J.a f12475c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3255v(J.a aVar, Function1 function1) {
        super(0);
        this.f12474b = function1;
        this.f12475c = aVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f12474b.invoke(new W(this.f12475c.a()));
        return Unit.f71690a;
    }
}
