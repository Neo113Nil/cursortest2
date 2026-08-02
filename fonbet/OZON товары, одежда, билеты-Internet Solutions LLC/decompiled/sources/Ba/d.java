package Ba;

import B1.m0;
import com.vk.id.onetap.compose.util.MeasureUnconstrainedViewWidthKt;
import com.vk.id.onetap.xml.OneTap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes9.dex */
public final /* synthetic */ class d implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3343a;

    public /* synthetic */ d(int i11) {
        this.f3343a = i11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit MeasureUnconstrainedViewWidth$lambda$3$lambda$2$lambda$1;
        Unit onSignInToAnotherAccountEnabledChange$lambda$1;
        switch (this.f3343a) {
            case 0:
                MeasureUnconstrainedViewWidth$lambda$3$lambda$2$lambda$1 = MeasureUnconstrainedViewWidthKt.MeasureUnconstrainedViewWidth$lambda$3$lambda$2$lambda$1((m0.a) obj);
                return MeasureUnconstrainedViewWidth$lambda$3$lambda$2$lambda$1;
            default:
                onSignInToAnotherAccountEnabledChange$lambda$1 = OneTap.onSignInToAnotherAccountEnabledChange$lambda$1(((Boolean) obj).booleanValue());
                return onSignInToAnotherAccountEnabledChange$lambda$1;
        }
    }
}
