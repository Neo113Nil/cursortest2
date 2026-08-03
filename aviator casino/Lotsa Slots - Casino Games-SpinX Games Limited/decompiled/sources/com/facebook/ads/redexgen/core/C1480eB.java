package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.eB, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1480eB implements com.facebook.ads.redexgen.core.WS {
    @Override // com.facebook.ads.redexgen.core.WS
    public final void AIZ(java.lang.Throwable th, java.lang.Object obj) {
        if (obj instanceof com.facebook.ads.redexgen.core.T4) {
            com.facebook.ads.redexgen.core.C1636gi adContext = ((com.facebook.ads.redexgen.core.T4) obj).A6m();
            if (adContext != null) {
                adContext.A0Q(th);
                return;
            }
            return;
        }
        if (!(obj instanceof android.view.View)) {
            return;
        }
        android.content.Context context = ((android.view.View) obj).getContext();
        if (!(context instanceof com.facebook.ads.redexgen.core.C1636gi)) {
            return;
        }
        ((com.facebook.ads.redexgen.core.C1636gi) context).A0Q(th);
    }
}
