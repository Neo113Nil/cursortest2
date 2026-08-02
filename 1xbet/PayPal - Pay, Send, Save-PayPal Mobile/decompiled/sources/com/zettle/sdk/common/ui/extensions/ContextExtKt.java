package com.zettle.sdk.common.ui.extensions;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/content/Context;", "", "isScreenReaderOn", "(Landroid/content/Context;)Z"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ContextExtKt {
    public static final boolean isScreenReaderOn(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        java.lang.Object systemService = context.getSystemService("accessibility");
        kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "");
        android.view.accessibility.AccessibilityManager accessibilityManager = (android.view.accessibility.AccessibilityManager) systemService;
        if (!accessibilityManager.isEnabled()) {
            return false;
        }
        java.util.List<android.accessibilityservice.AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(enabledAccessibilityServiceList, "");
        return !enabledAccessibilityServiceList.isEmpty();
    }
}
