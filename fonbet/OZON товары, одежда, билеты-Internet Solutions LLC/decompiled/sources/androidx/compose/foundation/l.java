package androidx.compose.foundation;

import k1.C7459e;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes.dex */
final class l extends AbstractC7737t implements Function1<C7459e, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ m f39296b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l(m mVar) {
        super(1);
        this.f39296b = mVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C7459e c7459e) {
        c7459e.n();
        m mVar = this.f39296b;
        if (mVar.V1()) {
            mVar.W1().invoke();
        }
        return Unit.f71690a;
    }
}
