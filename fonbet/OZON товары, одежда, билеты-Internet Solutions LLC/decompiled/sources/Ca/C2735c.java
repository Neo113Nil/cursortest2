package Ca;

import com.vk.id.multibranding.OAuthListWidgetAnalytics;
import com.vk.id.onetap.compose.onetap.OneTapTitleScenario;
import com.vk.id.onetap.xml.OneTap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: Ca.c, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final /* synthetic */ class C2735c implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4596a;

    public /* synthetic */ C2735c(int i11) {
        this.f4596a = i11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit onScenarioChange$lambda$8;
        Unit onOAuthTap$lambda$10;
        switch (this.f4596a) {
            case 0:
                onScenarioChange$lambda$8 = OneTap.onScenarioChange$lambda$8((OneTapTitleScenario) obj);
                return onScenarioChange$lambda$8;
            default:
                onOAuthTap$lambda$10 = OAuthListWidgetAnalytics.onOAuthTap$lambda$10((Throwable) obj);
                return onOAuthTap$lambda$10;
        }
    }
}
