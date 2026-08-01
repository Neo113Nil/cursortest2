package com.instagram.common.viewpoint.core;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: com.facebook.ads.redexgen.X.0n, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public class C0n extends C0q {
    @Override // com.instagram.common.viewpoint.core.C2246Pg
    public final C2261Py A07(View view, C2261Py c2261Py) {
        WindowInsets result = (WindowInsets) C2261Py.A01(c2261Py);
        WindowInsets unwrapped = view.dispatchApplyWindowInsets(result);
        if (unwrapped != result) {
            result = new WindowInsets(unwrapped);
        }
        return C2261Py.A00(result);
    }

    @Override // com.instagram.common.viewpoint.core.C2246Pg
    public final C2261Py A08(View view, C2261Py c2261Py) {
        WindowInsets result = (WindowInsets) C2261Py.A01(c2261Py);
        WindowInsets unwrapped = view.onApplyWindowInsets(result);
        if (unwrapped != result) {
            result = new WindowInsets(unwrapped);
        }
        return C2261Py.A00(result);
    }

    @Override // com.instagram.common.viewpoint.core.C2246Pg
    public final void A0A(View view) {
        view.stopNestedScroll();
    }

    @Override // com.instagram.common.viewpoint.core.C2246Pg
    public final void A0E(View view, PR pr) {
        if (pr == null) {
            view.setOnApplyWindowInsetsListener(null);
        } else {
            view.setOnApplyWindowInsetsListener(new ViewOnApplyWindowInsetsListenerC2245Pf(this, pr));
        }
    }
}
