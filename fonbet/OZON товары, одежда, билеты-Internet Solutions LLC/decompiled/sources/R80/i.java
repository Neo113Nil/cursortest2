package R80;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
final /* synthetic */ class i extends C7735q implements Function1<d, b> {
    i(g gVar) {
        super(1, gVar, g.class, "handlePhoneCallAction", "handlePhoneCallAction(Lru/ozon/fintech/nav/domain/deeplink/DeeplinkValidatorParams;)Lru/ozon/fintech/nav/domain/deeplink/DeepResult;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final b invoke(d dVar) {
        d p02 = dVar;
        Intrinsics.checkNotNullParameter(p02, "p0");
        return g.m((g) this.receiver, p02);
    }
}
