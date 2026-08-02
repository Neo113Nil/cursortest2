package Cf0;

import f3.AbstractC6409a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
final class s extends AbstractC7737t implements Function1<AbstractC6409a, Mf0.O> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ J f4944b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    s(J j11) {
        super(1);
        this.f4944b = j11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Mf0.O invoke(AbstractC6409a abstractC6409a) {
        Ld0.c cVar;
        AbstractC6409a initializer = abstractC6409a;
        Intrinsics.checkNotNullParameter(initializer, "$this$initializer");
        cVar = this.f4944b.f4844a;
        return new Mf0.O((pf0.m) cVar.e(pf0.h.class));
    }
}
