package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.bC, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1296bC {
    public static void A00(android.view.View view, boolean z, android.view.View.OnClickListener onClickListener) {
        if (!z) {
            view.setOnClickListener(onClickListener);
        } else {
            if (!z) {
                return;
            }
            com.facebook.ads.redexgen.core.ViewOnClickListenerC1295bB viewOnClickListenerC1295bB = new com.facebook.ads.redexgen.core.ViewOnClickListenerC1295bB(onClickListener);
            view.setOnClickListener(viewOnClickListenerC1295bB);
            view.setOnTouchListener(new com.facebook.ads.redexgen.core.ViewOnTouchListenerC1294bA(viewOnClickListenerC1295bB));
        }
    }
}
