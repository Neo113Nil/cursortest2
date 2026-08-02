package org.bouncycastle.util.io.pem;

/* loaded from: classes17.dex */
public class PemObject implements org.bouncycastle.util.io.pem.PemObjectGenerator {
    private static final java.util.List getHighSpeedVideoSizes = java.util.Collections.unmodifiableList(new java.util.ArrayList());
    private java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    private byte[] getHighSpeedVideoFpsRanges;
    private java.util.List getHighSpeedVideoFpsRangesFor;

    @Override // org.bouncycastle.util.io.pem.PemObjectGenerator
    public org.bouncycastle.util.io.pem.PemObject generate() throws org.bouncycastle.util.io.pem.PemGenerationException {
        return this;
    }

    public java.lang.String getType() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public java.util.List getHeaders() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public byte[] getContent() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public PemObject(java.lang.String str, byte[] bArr) {
        this(str, getHighSpeedVideoSizes, bArr);
    }

    public PemObject(java.lang.String str, java.util.List list, byte[] bArr) {
        this.getHighResolutionOutputSizeshNQ4ISI = str;
        this.getHighSpeedVideoFpsRangesFor = java.util.Collections.unmodifiableList(list);
        this.getHighSpeedVideoFpsRanges = bArr;
    }
}
