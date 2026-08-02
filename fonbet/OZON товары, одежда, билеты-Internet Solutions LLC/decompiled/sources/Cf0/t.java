package Cf0;

import f3.AbstractC6409a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
final class t extends AbstractC7737t implements Function1<AbstractC6409a, If0.K> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ J f4945b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    t(J j11) {
        super(1);
        this.f4945b = j11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final If0.K invoke(AbstractC6409a abstractC6409a) {
        AbstractC6409a initializer = abstractC6409a;
        Intrinsics.checkNotNullParameter(initializer, "$this$initializer");
        Kf0.a h11 = this.f4945b.h();
        return new If0.K(h11.h(), h11.g());
    }
}
