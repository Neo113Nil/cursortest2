package Zb0;

import bc0.C5643b;
import f3.AbstractC6409a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
final class b extends AbstractC7737t implements Function1<AbstractC6409a, C5643b> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ a f35812b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(a aVar) {
        super(1);
        this.f35812b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C5643b invoke(AbstractC6409a abstractC6409a) {
        AbstractC6409a initializer = abstractC6409a;
        Intrinsics.checkNotNullParameter(initializer, "$this$initializer");
        a aVar = this.f35812b;
        return new C5643b(aVar.f35805a.W().h(), aVar.d(), aVar.f35805a.K());
    }
}
