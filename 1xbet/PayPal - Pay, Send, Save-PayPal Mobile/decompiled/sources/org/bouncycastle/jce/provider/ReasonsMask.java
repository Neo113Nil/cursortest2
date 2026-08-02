package org.bouncycastle.jce.provider;

/* loaded from: classes17.dex */
class ReasonsMask {
    static final org.bouncycastle.jce.provider.ReasonsMask getHighSpeedVideoFpsRanges = new org.bouncycastle.jce.provider.ReasonsMask(33023);
    int getHighResolutionOutputSizeshNQ4ISI;

    ReasonsMask(org.bouncycastle.asn1.x509.ReasonFlags reasonFlags) {
        this.getHighResolutionOutputSizeshNQ4ISI = reasonFlags.intValue();
    }

    ReasonsMask(int i) {
        this.getHighResolutionOutputSizeshNQ4ISI = i;
    }

    ReasonsMask() {
        this(0);
    }
}
