package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.i1, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1715i1 extends com.facebook.ads.redexgen.core.PL {
    public static java.lang.String[] A01 = {"gP5iRBNUcEm4", "hagqDV25a6ynaoYCoJf0l9z0sKG8jhWl", "ooYhQl9ZMyV9UByvd6u2ZbJwINTXZRCk", "quE", "9rQMt62DD9QRN345Nnq0LTFFdDUm2qAK", "qEkkF74LDRYf2iXVehyp9KJG4XjlQH4Q", "6Z5psXCaQYJ6H", "E0d3lf1uFrHxpWzWCxHKFqknJeusaBoL"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.Pv A00;

    public C1715i1(com.facebook.ads.redexgen.core.Pv pv) {
        this.A00 = pv;
    }

    private boolean A00() {
        return this.A00.A01 != null && this.A00.A01.A01() > 1;
    }

    @Override // com.facebook.ads.redexgen.core.PL
    public final void A07(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.A07(view, accessibilityEvent);
        accessibilityEvent.setClassName(com.facebook.ads.redexgen.core.Pv.class.getName());
        accessibilityEvent.setScrollable(A00());
        if (accessibilityEvent.getEventType() == 4096 && this.A00.A01 != null) {
            accessibilityEvent.setItemCount(this.A00.A01.A01());
            accessibilityEvent.setFromIndex(this.A00.A00);
            accessibilityEvent.setToIndex(this.A00.A00);
        }
    }

    @Override // com.facebook.ads.redexgen.core.PL
    public final void A08(android.view.View view, com.facebook.ads.redexgen.core.Q6 q6) {
        super.A08(view, q6);
        q6.A0O(com.facebook.ads.redexgen.core.Pv.class.getName());
        q6.A0R(A00());
        if (this.A00.canScrollHorizontally(1)) {
            if (A01[3].length() != 3) {
                throw new java.lang.RuntimeException();
            }
            A01[1] = "jglgbim5NCizxs0Sda1mccX23gBCKHWl";
            q6.A0N(4096);
        }
        if (this.A00.canScrollHorizontally(-1)) {
            q6.A0N(8192);
        }
    }

    @Override // com.facebook.ads.redexgen.core.PL
    public final boolean A09(android.view.View view, int i, android.os.Bundle bundle) {
        if (super.A09(view, i, bundle)) {
            return true;
        }
        switch (i) {
            case 4096:
                if (!this.A00.canScrollHorizontally(1)) {
                    return false;
                }
                this.A00.setCurrentItem(this.A00.A00 + 1);
                return true;
            case 8192:
                if (!this.A00.canScrollHorizontally(-1)) {
                    return false;
                }
                this.A00.setCurrentItem(this.A00.A00 - 1);
                return true;
            default:
                return false;
        }
    }
}
