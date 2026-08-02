package F80;

import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.pikazon.callback.PikazonPerformanceAvailabilityChecker;
import ru.ozon.app.android.pikazon.logging.error.PikazonErrorsLogger;

/* loaded from: classes3.dex */
public final class b implements PikazonPerformanceAvailabilityChecker {
    @Override // ru.ozon.app.android.pikazon.callback.PikazonPerformanceAvailabilityChecker
    public final boolean isImageErrorsAnalyticsEnabled(PikazonErrorsLogger.AnalyticsPlatform analyticsPlatform) {
        Intrinsics.checkNotNullParameter(analyticsPlatform, "analyticsPlatform");
        return false;
    }

    @Override // ru.ozon.app.android.pikazon.callback.PikazonPerformanceAvailabilityChecker
    public final boolean isImagePlaceholderAnalyticsEnabled() {
        return false;
    }

    @Override // ru.ozon.app.android.pikazon.callback.PikazonPerformanceAvailabilityChecker
    public final boolean isLoadCancellingAnalyticsEnabled() {
        return false;
    }

    @Override // ru.ozon.app.android.pikazon.callback.PikazonPerformanceAvailabilityChecker
    public final boolean isPerformanceAnalyticsEnabled() {
        return false;
    }
}
