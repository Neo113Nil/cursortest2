package androidx.compose.ui.platform;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Landroidx/compose/ui/platform/Api29Impl;", "", "<init>", "()V", "Landroid/view/accessibility/AccessibilityManager;", "accessibilityManager", "", "originalTimeout", "uiContentFlags", "getRecommendedTimeoutMillis", "(Landroid/view/accessibility/AccessibilityManager;II)I"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Api29Impl {
    public static final int $stable = 0;
    public static final androidx.compose.ui.platform.Api29Impl INSTANCE = new androidx.compose.ui.platform.Api29Impl();

    private Api29Impl() {
    }

    public final int getRecommendedTimeoutMillis(android.view.accessibility.AccessibilityManager accessibilityManager, int originalTimeout, int uiContentFlags) {
        return accessibilityManager.getRecommendedTimeoutMillis(originalTimeout, uiContentFlags);
    }
}
