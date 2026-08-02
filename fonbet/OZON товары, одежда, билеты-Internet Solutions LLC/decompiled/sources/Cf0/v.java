package Cf0;

import f3.AbstractC6409a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
final class v extends AbstractC7737t implements Function1<AbstractC6409a, Pf0.a> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Qf0.a f4947b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    v(Qf0.a aVar) {
        super(1);
        this.f4947b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Pf0.a invoke(AbstractC6409a abstractC6409a) {
        AbstractC6409a initializer = abstractC6409a;
        Intrinsics.checkNotNullParameter(initializer, "$this$initializer");
        return this.f4947b.d();
    }
}
