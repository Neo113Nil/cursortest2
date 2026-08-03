package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.0n, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public class C0n extends com.facebook.ads.redexgen.core.C0q {
    @Override // com.facebook.ads.redexgen.core.C0952Pg
    public final com.facebook.ads.redexgen.core.C0967Py A07(android.view.View view, com.facebook.ads.redexgen.core.C0967Py c0967Py) {
        android.view.WindowInsets result = (android.view.WindowInsets) com.facebook.ads.redexgen.core.C0967Py.A01(c0967Py);
        android.view.WindowInsets unwrapped = view.dispatchApplyWindowInsets(result);
        if (unwrapped != result) {
            result = new android.view.WindowInsets(unwrapped);
        }
        return com.facebook.ads.redexgen.core.C0967Py.A00(result);
    }

    @Override // com.facebook.ads.redexgen.core.C0952Pg
    public final com.facebook.ads.redexgen.core.C0967Py A08(android.view.View view, com.facebook.ads.redexgen.core.C0967Py c0967Py) {
        android.view.WindowInsets result = (android.view.WindowInsets) com.facebook.ads.redexgen.core.C0967Py.A01(c0967Py);
        android.view.WindowInsets unwrapped = view.onApplyWindowInsets(result);
        if (unwrapped != result) {
            result = new android.view.WindowInsets(unwrapped);
        }
        return com.facebook.ads.redexgen.core.C0967Py.A00(result);
    }

    @Override // com.facebook.ads.redexgen.core.C0952Pg
    public final void A0A(android.view.View view) {
        view.stopNestedScroll();
    }

    @Override // com.facebook.ads.redexgen.core.C0952Pg
    public final void A0E(android.view.View view, com.facebook.ads.redexgen.core.PR pr) {
        if (pr == null) {
            view.setOnApplyWindowInsetsListener(null);
        } else {
            view.setOnApplyWindowInsetsListener(new com.facebook.ads.redexgen.core.ViewOnApplyWindowInsetsListenerC0951Pf(this, pr));
        }
    }
}
