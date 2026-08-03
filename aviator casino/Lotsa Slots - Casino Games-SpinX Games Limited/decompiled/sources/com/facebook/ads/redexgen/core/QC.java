package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class QC extends android.view.accessibility.AccessibilityNodeProvider {
    public final /* synthetic */ com.facebook.ads.redexgen.core.QD A00;

    public QC(com.facebook.ads.redexgen.core.QD qd) {
        this.A00 = qd;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final android.view.accessibility.AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        return (android.view.accessibility.AccessibilityNodeInfo) this.A00.A5G(i);
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final java.util.List<android.view.accessibility.AccessibilityNodeInfo> findAccessibilityNodeInfosByText(java.lang.String str, int i) {
        return this.A00.A6Y(str, i);
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final android.view.accessibility.AccessibilityNodeInfo findFocus(int i) {
        return (android.view.accessibility.AccessibilityNodeInfo) this.A00.A6Z(i);
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i, int i2, android.os.Bundle bundle) {
        return this.A00.AGv(i, i2, bundle);
    }
}
