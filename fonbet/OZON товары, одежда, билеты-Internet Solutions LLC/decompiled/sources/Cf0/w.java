package Cf0;

import f3.AbstractC6409a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
final class w extends AbstractC7737t implements Function1<AbstractC6409a, Nf0.j> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ J f4948b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    w(J j11) {
        super(1);
        this.f4948b = j11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Nf0.j invoke(AbstractC6409a abstractC6409a) {
        AbstractC6409a initializer = abstractC6409a;
        Intrinsics.checkNotNullParameter(initializer, "$this$initializer");
        this.f4948b.o().getClass();
        return new Nf0.j();
    }
}
