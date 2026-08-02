package Cf0;

import f3.AbstractC6409a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
final class u extends AbstractC7737t implements Function1<AbstractC6409a, Gf0.M> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ J f4946b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    u(J j11) {
        super(1);
        this.f4946b = j11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Gf0.M invoke(AbstractC6409a abstractC6409a) {
        AbstractC6409a initializer = abstractC6409a;
        Intrinsics.checkNotNullParameter(initializer, "$this$initializer");
        return new Gf0.M(this.f4946b.h().h());
    }
}
