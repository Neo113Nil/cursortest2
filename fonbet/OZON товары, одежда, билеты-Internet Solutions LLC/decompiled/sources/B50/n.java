package B50;

import androidx.lifecycle.z0;
import com.vk.id.group.subscription.compose.analytics.GroupSubscriptionAnalytics;
import com.vk.id.internal.di.VKIDDepsProd;
import com.vk.id.tracking.core.PerformanceTracker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ru.ozon.fintech.features.camera.domain.scanner.bankcard.BankCardAnalyzer;
import ru.ozon.fintech.features.camera.presentation.camera.CameraViewModel;
import ru.ozon.fintech.features.cbottomstories.presentation.StoryFragment;
import ru.ozon.fintech.preferences.presentation.theme.FintechThemeFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class n implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2945a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2946b;

    public /* synthetic */ n(Object obj, int i11) {
        this.f2945a = i11;
        this.f2946b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        z0.b factory;
        Unit ErrorShown$lambda$4$lambda$3;
        PerformanceTracker performanceTracker_delegate$lambda$3;
        BankCardAnalyzer bankCardAnalyzer_delegate$lambda$3;
        switch (this.f2945a) {
            case 0:
                factory = ((StoryFragment) this.f2946b).getFactory();
                return factory;
            case 1:
                return ((FintechThemeFragment) this.f2946b).getFactory();
            case 2:
                ErrorShown$lambda$4$lambda$3 = GroupSubscriptionAnalytics.ErrorShown$lambda$4$lambda$3((String) this.f2946b);
                return ErrorShown$lambda$4$lambda$3;
            case 3:
                performanceTracker_delegate$lambda$3 = VKIDDepsProd.performanceTracker_delegate$lambda$3((VKIDDepsProd) this.f2946b);
                return performanceTracker_delegate$lambda$3;
            default:
                bankCardAnalyzer_delegate$lambda$3 = CameraViewModel.bankCardAnalyzer_delegate$lambda$3((CameraViewModel) this.f2946b);
                return bankCardAnalyzer_delegate$lambda$3;
        }
    }
}
