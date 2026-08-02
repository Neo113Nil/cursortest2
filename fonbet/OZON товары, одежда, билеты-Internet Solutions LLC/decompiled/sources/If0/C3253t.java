package If0;

import If0.J;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: If0.t, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3253t extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ J.a f12471b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Function1<I, Unit> f12472c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    C3253t(J.a aVar, Function1<? super I, Unit> function1) {
        super(0);
        this.f12471b = aVar;
        this.f12472c = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        J.a aVar = this.f12471b;
        this.f12472c.invoke(aVar.c() ? new a0(aVar.a()) : new e0(aVar.a()));
        return Unit.f71690a;
    }
}
