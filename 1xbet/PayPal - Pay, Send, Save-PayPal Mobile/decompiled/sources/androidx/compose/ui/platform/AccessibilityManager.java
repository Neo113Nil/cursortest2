package androidx.compose.ui.platform;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J5\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\b\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/platform/AccessibilityManager;", "", "", "originalTimeoutMillis", "", "containsIcons", "containsText", "containsControls", "calculateRecommendedTimeoutMillis", "(JZZZ)J"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface AccessibilityManager {
    long calculateRecommendedTimeoutMillis(long originalTimeoutMillis, boolean containsIcons, boolean containsText, boolean containsControls);

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class DefaultImpls {
    }

    static /* synthetic */ long calculateRecommendedTimeoutMillis$default(androidx.compose.ui.platform.AccessibilityManager accessibilityManager, long j, boolean z, boolean z2, boolean z3, int i, java.lang.Object obj) {
        if (obj == null) {
            return accessibilityManager.calculateRecommendedTimeoutMillis(j, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? false : z3);
        }
        throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: calculateRecommendedTimeoutMillis");
    }
}
