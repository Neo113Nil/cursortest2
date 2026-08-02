package org.bouncycastle.pkix.jcajce;

/* loaded from: classes17.dex */
class ReasonsMask {
    static final org.bouncycastle.pkix.jcajce.ReasonsMask getHighSpeedVideoFpsRangesFor = new org.bouncycastle.pkix.jcajce.ReasonsMask(33023);
    int getHighSpeedVideoSizes;

    ReasonsMask(org.bouncycastle.asn1.x509.ReasonFlags reasonFlags) {
        this.getHighSpeedVideoSizes = reasonFlags.intValue();
    }

    ReasonsMask(int i) {
        this.getHighSpeedVideoSizes = i;
    }

    ReasonsMask() {
        this(0);
    }
}
