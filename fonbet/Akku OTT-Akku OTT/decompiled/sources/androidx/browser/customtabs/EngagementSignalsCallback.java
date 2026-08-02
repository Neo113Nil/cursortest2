package androidx.browser.customtabs;

import android.os.Bundle;
import androidx.annotation.IntRange;

/* loaded from: classes.dex */
public interface EngagementSignalsCallback {
    default void onGreatestScrollPercentageIncreased(@IntRange(from = 1, to = 100) int i, Bundle bundle) {
    }

    default void onSessionEnded(boolean z, Bundle bundle) {
    }

    default void onVerticalScrollEvent(boolean z, Bundle bundle) {
    }
}
