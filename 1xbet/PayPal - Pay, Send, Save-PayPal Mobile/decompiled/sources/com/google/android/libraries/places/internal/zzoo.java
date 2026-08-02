package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzoo extends android.view.View.AccessibilityDelegate {
    zzoo() {
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(android.view.View view, android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accessibilityNodeInfo, "");
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(android.widget.Button.class.getName());
    }
}
