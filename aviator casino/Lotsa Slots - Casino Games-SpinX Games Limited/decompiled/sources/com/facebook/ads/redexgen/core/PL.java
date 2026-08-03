package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class PL {
    public final android.view.View.AccessibilityDelegate A00 = A02.A00(this);
    public static final com.facebook.ads.redexgen.core.PK A02 = new com.facebook.ads.redexgen.core.C1718i4();
    public static final android.view.View.AccessibilityDelegate A01 = new android.view.View.AccessibilityDelegate();

    public final android.view.View.AccessibilityDelegate A00() {
        return this.A00;
    }

    public final com.facebook.ads.redexgen.core.Q8 A01(android.view.View view) {
        return A02.A01(A01, view);
    }

    public final void A02(android.view.View view, int i) {
        A01.sendAccessibilityEvent(view, i);
    }

    public final void A03(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        A01.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public final void A04(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        A01.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public final boolean A05(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        return A01.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public final boolean A06(android.view.ViewGroup viewGroup, android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        return A01.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public void A07(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        A01.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void A08(android.view.View view, com.facebook.ads.redexgen.core.Q6 q6) {
        A01.onInitializeAccessibilityNodeInfo(view, q6.A0M());
    }

    public boolean A09(android.view.View view, int i, android.os.Bundle bundle) {
        return A02.A02(A01, view, i, bundle);
    }
}
