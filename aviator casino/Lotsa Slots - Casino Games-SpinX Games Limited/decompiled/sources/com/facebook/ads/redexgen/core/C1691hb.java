package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.hb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1691hb extends com.facebook.ads.redexgen.core.PL {
    public final com.facebook.ads.redexgen.core.PL A00 = new com.facebook.ads.redexgen.core.C1694he(this);
    public final com.facebook.ads.redexgen.core.C7M A01;

    public C1691hb(com.facebook.ads.redexgen.core.C7M c7m) {
        this.A01 = c7m;
    }

    @Override // com.facebook.ads.redexgen.core.PL
    public final void A07(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.A07(view, accessibilityEvent);
        accessibilityEvent.setClassName(com.facebook.ads.redexgen.core.C7M.class.getName());
        if ((view instanceof com.facebook.ads.redexgen.core.C7M) && !A0B()) {
            com.facebook.ads.redexgen.core.C7M c7m = (com.facebook.ads.redexgen.core.C7M) view;
            if (c7m.getLayoutManager() != null) {
                c7m.getLayoutManager().A1v(accessibilityEvent);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.PL
    public final void A08(android.view.View view, com.facebook.ads.redexgen.core.Q6 q6) {
        super.A08(view, q6);
        q6.A0O(com.facebook.ads.redexgen.core.C7M.class.getName());
        if (!A0B() && this.A01.getLayoutManager() != null) {
            this.A01.getLayoutManager().A1H(q6);
        }
    }

    @Override // com.facebook.ads.redexgen.core.PL
    public final boolean A09(android.view.View view, int i, android.os.Bundle bundle) {
        if (super.A09(view, i, bundle)) {
            return true;
        }
        if (!A0B() && this.A01.getLayoutManager() != null) {
            return this.A01.getLayoutManager().A1X(i, bundle);
        }
        return false;
    }

    public final com.facebook.ads.redexgen.core.PL A0A() {
        return this.A00;
    }

    public final boolean A0B() {
        return this.A01.A1r();
    }
}
