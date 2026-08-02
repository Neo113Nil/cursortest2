package org.bouncycastle.pqc.crypto.mceliece;

/* loaded from: classes17.dex */
public class McElieceCCA2Parameters extends org.bouncycastle.pqc.crypto.mceliece.McElieceParameters {
    private final java.lang.String getHighSpeedVideoFpsRangesFor;

    public java.lang.String getDigest() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public McElieceCCA2Parameters(java.lang.String str) {
        this(11, 50, str);
    }

    public McElieceCCA2Parameters(int i, java.lang.String str) {
        super(i);
        this.getHighSpeedVideoFpsRangesFor = str;
    }

    public McElieceCCA2Parameters(int i, int i2, java.lang.String str) {
        super(i, i2);
        this.getHighSpeedVideoFpsRangesFor = str;
    }

    public McElieceCCA2Parameters(int i, int i2, int i3, java.lang.String str) {
        super(i, i2, i3);
        this.getHighSpeedVideoFpsRangesFor = str;
    }

    public McElieceCCA2Parameters(int i, int i2, int i3) {
        this(i, i2, i3, "SHA-256");
    }

    public McElieceCCA2Parameters(int i, int i2) {
        this(i, i2, "SHA-256");
    }

    public McElieceCCA2Parameters(int i) {
        this(i, "SHA-256");
    }

    public McElieceCCA2Parameters() {
        this(11, 50, "SHA-256");
    }
}
