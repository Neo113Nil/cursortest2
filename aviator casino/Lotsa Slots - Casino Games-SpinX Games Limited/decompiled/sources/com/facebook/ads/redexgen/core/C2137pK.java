package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.pK, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2137pK implements com.facebook.ads.redexgen.core.C4W {
    public android.os.Message A00;
    public com.facebook.ads.redexgen.core.C2136pJ A01;

    public C2137pK() {
    }

    private void A00() {
        this.A00 = null;
        this.A01 = null;
        com.facebook.ads.redexgen.core.C2136pJ.A01(this);
    }

    public final com.facebook.ads.redexgen.core.C2137pK A01(android.os.Message message, com.facebook.ads.redexgen.core.C2136pJ c2136pJ) {
        this.A00 = message;
        this.A01 = c2136pJ;
        return this;
    }

    public final void A02() {
        ((android.os.Message) com.facebook.ads.redexgen.core.AbstractC04203y.A01(this.A00)).sendToTarget();
        A00();
    }

    public final boolean A03(android.os.Handler handler) {
        boolean success = handler.sendMessageAtFrontOfQueue((android.os.Message) com.facebook.ads.redexgen.core.AbstractC04203y.A01(this.A00));
        A00();
        return success;
    }
}
