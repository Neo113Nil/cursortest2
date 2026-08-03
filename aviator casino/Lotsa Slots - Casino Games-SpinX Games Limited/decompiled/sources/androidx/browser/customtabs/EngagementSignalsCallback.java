package androidx.browser.customtabs;

/* loaded from: classes.dex */
public interface EngagementSignalsCallback {

    /* renamed from: androidx.browser.customtabs.EngagementSignalsCallback$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$onGreatestScrollPercentageIncreased(androidx.browser.customtabs.EngagementSignalsCallback _this, int i, android.os.Bundle bundle) {
        }

        public static void $default$onSessionEnded(androidx.browser.customtabs.EngagementSignalsCallback _this, boolean z, android.os.Bundle bundle) {
        }

        public static void $default$onVerticalScrollEvent(androidx.browser.customtabs.EngagementSignalsCallback _this, boolean z, android.os.Bundle bundle) {
        }
    }

    void onGreatestScrollPercentageIncreased(int i, android.os.Bundle bundle);

    void onSessionEnded(boolean z, android.os.Bundle bundle);

    void onVerticalScrollEvent(boolean z, android.os.Bundle bundle);
}
