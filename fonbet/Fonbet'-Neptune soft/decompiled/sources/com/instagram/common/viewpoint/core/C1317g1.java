package com.instagram.common.viewpoint.core;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: com.facebook.ads.redexgen.X.g1, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1317g1 extends AbstractC0649Oh {
    public final AbstractC0649Oh A00 = new C1318g2(this);
    public final C02006g A01;

    public C1317g1(C02006g c02006g) {
        this.A01 = c02006g;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0649Oh
    public final void A07(View view, AccessibilityEvent accessibilityEvent) {
        super.A07(view, accessibilityEvent);
        accessibilityEvent.setClassName(C02006g.class.getName());
        if ((view instanceof C02006g) && !A0B()) {
            C02006g c02006g = (C02006g) view;
            if (c02006g.getLayoutManager() != null) {
                c02006g.getLayoutManager().A1v(accessibilityEvent);
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0649Oh
    public final void A08(View view, PS ps) {
        super.A08(view, ps);
        ps.A0O(C02006g.class.getName());
        if (!A0B() && this.A01.getLayoutManager() != null) {
            this.A01.getLayoutManager().A1H(ps);
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0649Oh
    public final boolean A09(View view, int i, Bundle bundle) {
        if (super.A09(view, i, bundle)) {
            return true;
        }
        if (!A0B() && this.A01.getLayoutManager() != null) {
            return this.A01.getLayoutManager().A1X(i, bundle);
        }
        return false;
    }

    public final AbstractC0649Oh A0A() {
        return this.A00;
    }

    public final boolean A0B() {
        return this.A01.A1r();
    }
}
