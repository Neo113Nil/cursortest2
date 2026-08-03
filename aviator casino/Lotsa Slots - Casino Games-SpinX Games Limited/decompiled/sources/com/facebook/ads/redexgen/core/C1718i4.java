package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.i4, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1718i4 extends com.facebook.ads.redexgen.core.PK {
    @Override // com.facebook.ads.redexgen.core.PK
    public final android.view.View.AccessibilityDelegate A00(com.facebook.ads.redexgen.core.PL pl) {
        return new com.facebook.ads.redexgen.core.PI(this, pl);
    }

    @Override // com.facebook.ads.redexgen.core.PK
    public final com.facebook.ads.redexgen.core.Q8 A01(android.view.View.AccessibilityDelegate accessibilityDelegate, android.view.View view) {
        android.view.accessibility.AccessibilityNodeProvider accessibilityNodeProvider = accessibilityDelegate.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new com.facebook.ads.redexgen.core.Q8(accessibilityNodeProvider);
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.core.PK
    public final boolean A02(android.view.View.AccessibilityDelegate accessibilityDelegate, android.view.View view, int i, android.os.Bundle bundle) {
        return accessibilityDelegate.performAccessibilityAction(view, i, bundle);
    }
}
