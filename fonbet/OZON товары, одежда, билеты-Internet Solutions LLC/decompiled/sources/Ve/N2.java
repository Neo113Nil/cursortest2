package Ve;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.api.SPaymentTool;
import spay.sdk.domain.model.PayStrategy;

/* loaded from: classes10.dex */
public final class N2 extends AbstractC7737t implements Function0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Vm f29516b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C4261g5 f29517c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N2(Vm vm, C4261g5 c4261g5) {
        super(0);
        this.f29516b = vm;
        this.f29517c = c4261g5;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        C4654tn c4654tn = (C4654tn) this.f29516b;
        return Boolean.valueOf((Intrinsics.d(c4654tn.f32129F.getValue(), PayStrategy.PayWithBonuses.INSTANCE) && Lf.a.u0(this.f29517c.f31081f, Qk.f29796d)) || ((PayStrategy) c4654tn.f32129F.getValue()).getToolType() == SPaymentTool.PAYMENT_ACCOUNTS);
    }
}
