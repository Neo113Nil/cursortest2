package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class Q0 {
    public static final com.facebook.ads.redexgen.core.C0968Pz A00 = new com.facebook.ads.redexgen.core.C1713hy() { // from class: com.facebook.ads.redexgen.X.7S
        @Override // com.facebook.ads.redexgen.core.C0968Pz
        public final int A00(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
            return accessibilityEvent.getContentChangeTypes();
        }

        @Override // com.facebook.ads.redexgen.core.C0968Pz
        public final void A01(android.view.accessibility.AccessibilityEvent accessibilityEvent, int i) {
            accessibilityEvent.setContentChangeTypes(i);
        }
    };

    public static int A00(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        return A00.A00(accessibilityEvent);
    }

    public static void A01(android.view.accessibility.AccessibilityEvent accessibilityEvent, int i) {
        A00.A01(accessibilityEvent, i);
    }
}
