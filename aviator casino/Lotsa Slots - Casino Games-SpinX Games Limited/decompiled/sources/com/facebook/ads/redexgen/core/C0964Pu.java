package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Pu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0964Pu implements java.util.Comparator<android.view.View> {
    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.Comparator
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compare(android.view.View view, android.view.View view2) {
        com.facebook.ads.redexgen.core.C0958Po c0958Po = (com.facebook.ads.redexgen.core.C0958Po) view.getLayoutParams();
        com.facebook.ads.redexgen.core.C0958Po c0958Po2 = (com.facebook.ads.redexgen.core.C0958Po) view2.getLayoutParams();
        if (c0958Po.A05 != c0958Po2.A05) {
            return c0958Po.A05 ? 1 : -1;
        }
        return c0958Po.A02 - c0958Po2.A02;
    }
}
