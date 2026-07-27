package com.instagram.common.viewpoint.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.bC, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2590bC {
    public static void A00(View view, boolean z, View.OnClickListener onClickListener) {
        if (!z) {
            view.setOnClickListener(onClickListener);
        } else {
            if (!z) {
                return;
            }
            ViewOnClickListenerC2589bB viewOnClickListenerC2589bB = new ViewOnClickListenerC2589bB(onClickListener);
            view.setOnClickListener(viewOnClickListenerC2589bB);
            view.setOnTouchListener(new ViewOnTouchListenerC2588bA(viewOnClickListenerC2589bB));
        }
    }
}
