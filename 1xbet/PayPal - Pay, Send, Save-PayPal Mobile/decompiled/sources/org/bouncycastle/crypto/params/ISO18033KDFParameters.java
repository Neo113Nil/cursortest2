package org.bouncycastle.crypto.params;

/* loaded from: classes17.dex */
public class ISO18033KDFParameters implements org.bouncycastle.crypto.DerivationParameters {
    byte[] getHighSpeedVideoFpsRanges;

    public byte[] getSeed() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public ISO18033KDFParameters(byte[] bArr) {
        this.getHighSpeedVideoFpsRanges = bArr;
    }
}
