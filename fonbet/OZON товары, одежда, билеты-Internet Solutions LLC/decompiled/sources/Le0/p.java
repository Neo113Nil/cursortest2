package Le0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes3.dex */
final class p extends AbstractC7737t implements Function0<we0.x> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ o f17024b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    p(o oVar) {
        super(0);
        this.f17024b = oVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final we0.x invoke() {
        o oVar = this.f17024b;
        return new we0.x(oVar.getContentView().getWidth(), oVar.getContentView().getHeight());
    }
}
