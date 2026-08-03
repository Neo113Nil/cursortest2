package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class PI extends android.view.View.AccessibilityDelegate {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1718i4 A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.PL A01;

    public PI(com.facebook.ads.redexgen.core.C1718i4 c1718i4, com.facebook.ads.redexgen.core.PL pl) {
        this.A00 = c1718i4;
        this.A01 = pl;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean dispatchPopulateAccessibilityEvent(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        return this.A01.A05(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final android.view.accessibility.AccessibilityNodeProvider getAccessibilityNodeProvider(android.view.View view) {
        com.facebook.ads.redexgen.core.Q8 provider = this.A01.A01(view);
        if (provider != null) {
            return (android.view.accessibility.AccessibilityNodeProvider) provider.A02();
        }
        return null;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        this.A01.A07(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(android.view.View view, android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        this.A01.A08(view, com.facebook.ads.redexgen.core.Q6.A01(accessibilityNodeInfo));
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onPopulateAccessibilityEvent(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        this.A01.A03(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean onRequestSendAccessibilityEvent(android.view.ViewGroup viewGroup, android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        return this.A01.A06(viewGroup, view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(android.view.View view, int i, android.os.Bundle bundle) {
        return this.A01.A09(view, i, bundle);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEvent(android.view.View view, int i) {
        this.A01.A02(view, i);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEventUnchecked(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        this.A01.A04(view, accessibilityEvent);
    }
}
