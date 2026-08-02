package I0;

import k1.C7459e;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class e1 extends AbstractC7737t implements Function1<Z1.d, C7459e> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Function0<C7459e> f11488b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e1(Function0<C7459e> function0) {
        super(1);
        this.f11488b = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C7459e invoke(Z1.d dVar) {
        return C7459e.a(this.f11488b.invoke().n());
    }
}
