package com.miteksystems.misnap.workflow.util;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/miteksystems/misnap/workflow/util/AccessibilityUtil;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "isScreenReaderEnabled", "(Landroid/content/Context;)Z", "Landroid/widget/TextView;", "textView", "", "adjustScalingForAccessibility$workflow_release", "(Landroid/widget/TextView;)V", "", "text", "Landroid/view/View;", "view", "announceStateOnScreenReader$workflow_release", "(Ljava/lang/String;Landroid/view/View;)V"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes10.dex */
public final class AccessibilityUtil {
    public static final com.miteksystems.misnap.workflow.util.AccessibilityUtil INSTANCE = new com.miteksystems.misnap.workflow.util.AccessibilityUtil();

    public final /* synthetic */ boolean isScreenReaderEnabled(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        java.lang.Object systemService = context.getSystemService("accessibility");
        android.view.accessibility.AccessibilityManager accessibilityManager = systemService instanceof android.view.accessibility.AccessibilityManager ? (android.view.accessibility.AccessibilityManager) systemService : null;
        return accessibilityManager != null && accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled();
    }

    public final /* synthetic */ void announceStateOnScreenReader$workflow_release(java.lang.String text, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            view.setStateDescription(text);
        } else {
            view.announceForAccessibility(text);
        }
    }

    public final /* synthetic */ void adjustScalingForAccessibility$workflow_release(android.widget.TextView textView) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(textView, "");
        float f = textView.getContext().getResources().getConfiguration().fontScale;
        if (f <= 1.0f) {
            return;
        }
        com.miteksystems.misnap.workflow.a.b.f4152a.a(textView, f);
    }

    private AccessibilityUtil() {
    }
}
