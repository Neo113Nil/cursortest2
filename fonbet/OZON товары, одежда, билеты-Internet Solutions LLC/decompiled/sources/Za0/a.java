package Za0;

import cb0.C5797a;
import eb0.C6340a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
final class a extends AbstractC7737t implements Function1<C6340a, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ e f35749b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a(e eVar) {
        super(1);
        this.f35749b = eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C6340a c6340a) {
        C6340a env = c6340a;
        Intrinsics.checkNotNullParameter(env, "env");
        this.f35749b.m0(new C5797a(env));
        return Unit.f71690a;
    }
}
