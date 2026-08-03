package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Qr, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0985Qr extends android.database.Observable<com.facebook.ads.redexgen.core.AbstractC0986Qs> {
    public final void A00() {
        for (int size = this.mObservers.size() - 1; size >= 0; size--) {
            ((com.facebook.ads.redexgen.core.AbstractC0986Qs) this.mObservers.get(size)).A00();
        }
    }
}
