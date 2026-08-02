package Q0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import m0.D0;

/* loaded from: classes8.dex */
final class q extends AbstractC7737t implements Function0<Boolean> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ D0.d f22780b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    q(D0.d dVar) {
        super(0);
        this.f22780b = dVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(((Number) this.f22780b.getValue()).floatValue() > 0.0f);
    }
}
