package androidx.compose.ui.platform;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Landroidx/compose/ui/platform/AndroidAccessibilityManager;", "Landroidx/compose/ui/platform/AccessibilityManager;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "originalTimeoutMillis", "", "containsIcons", "containsText", "containsControls", "calculateRecommendedTimeoutMillis", "(JZZZ)J", "Landroid/view/accessibility/AccessibilityManager;", "getHighSpeedVideoSizes", "Landroid/view/accessibility/AccessibilityManager;", "getHighSpeedVideoFpsRanges", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidAccessibilityManager implements androidx.compose.ui.platform.AccessibilityManager {

    @java.lang.Deprecated
    public static final int FlagContentControls = 4;

    @java.lang.Deprecated
    public static final int FlagContentIcons = 1;

    @java.lang.Deprecated
    public static final int FlagContentText = 2;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final android.view.accessibility.AccessibilityManager getHighSpeedVideoFpsRanges;
    private static final androidx.compose.ui.platform.AndroidAccessibilityManager.Companion Companion = new androidx.compose.ui.platform.AndroidAccessibilityManager.Companion(null);
    public static final int $stable = 8;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\b\u0010\u0006"}, d2 = {"Landroidx/compose/ui/platform/AndroidAccessibilityManager$Companion;", "", "<init>", "()V", "", "FlagContentIcons", com.visa.cbp.getEncExpo.warmup, "FlagContentText", "FlagContentControls"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public AndroidAccessibilityManager(android.content.Context context) {
        java.lang.Object systemService = context.getSystemService("accessibility");
        kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "");
        this.getHighSpeedVideoFpsRanges = (android.view.accessibility.AccessibilityManager) systemService;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.platform.AccessibilityManager
    public final long calculateRecommendedTimeoutMillis(long originalTimeoutMillis, boolean containsIcons, boolean containsText, boolean containsControls) {
        int i = containsIcons;
        if (originalTimeoutMillis < androidx.collection.SieveCacheKt.NodeLinkMask) {
            if (containsText) {
                i = (containsIcons ? 1 : 0) | 2;
            }
            if (containsControls) {
                i = (i == true ? 1 : 0) | 4;
            }
            if (android.os.Build.VERSION.SDK_INT >= 29) {
                int recommendedTimeoutMillis = androidx.compose.ui.platform.Api29Impl.INSTANCE.getRecommendedTimeoutMillis(this.getHighSpeedVideoFpsRanges, (int) originalTimeoutMillis, i);
                if (recommendedTimeoutMillis == Integer.MAX_VALUE) {
                    return Long.MAX_VALUE;
                }
                return recommendedTimeoutMillis;
            }
            if (containsControls && this.getHighSpeedVideoFpsRanges.isTouchExplorationEnabled()) {
                return Long.MAX_VALUE;
            }
        }
        return originalTimeoutMillis;
    }
}
