package androidx.appcompat.widget;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: androidx.appcompat.widget.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0658q extends View.AccessibilityDelegate {
    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setCanOpenPopup(true);
    }
}
