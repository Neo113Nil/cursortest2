package org.bouncycastle.crypto.engines;

/* loaded from: classes17.dex */
public class CramerShoupCiphertext {
    java.math.BigInteger Camera2StreamConfigurationMap;
    java.math.BigInteger getHighResolutionOutputSizeshNQ4ISI;
    java.math.BigInteger getHighSpeedVideoFpsRanges;
    java.math.BigInteger getHighSpeedVideoFpsRangesFor;

    public java.lang.String toString() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("u1: ");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI.toString());
        stringBuffer.append(sb.toString());
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("\nu2: ");
        sb2.append(this.getHighSpeedVideoFpsRangesFor.toString());
        stringBuffer.append(sb2.toString());
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("\ne: ");
        sb3.append(this.getHighSpeedVideoFpsRanges.toString());
        stringBuffer.append(sb3.toString());
        java.lang.StringBuilder sb4 = new java.lang.StringBuilder("\nv: ");
        sb4.append(this.Camera2StreamConfigurationMap.toString());
        stringBuffer.append(sb4.toString());
        return stringBuffer.toString();
    }

    public byte[] toByteArray() {
        byte[] byteArray = this.getHighResolutionOutputSizeshNQ4ISI.toByteArray();
        int length = byteArray.length;
        byte[] byteArray2 = this.getHighSpeedVideoFpsRangesFor.toByteArray();
        int length2 = byteArray2.length;
        byte[] byteArray3 = this.getHighSpeedVideoFpsRanges.toByteArray();
        int length3 = byteArray3.length;
        byte[] byteArray4 = this.Camera2StreamConfigurationMap.toByteArray();
        int length4 = byteArray4.length;
        byte[] bArr = new byte[length + length2 + length3 + length4 + 16];
        org.bouncycastle.util.Pack.intToBigEndian(length, bArr, 0);
        java.lang.System.arraycopy(byteArray, 0, bArr, 4, length);
        org.bouncycastle.util.Pack.intToBigEndian(length2, bArr, length + 4);
        int i = length + 8;
        java.lang.System.arraycopy(byteArray2, 0, bArr, i, length2);
        int i2 = i + length2;
        org.bouncycastle.util.Pack.intToBigEndian(length3, bArr, i2);
        int i3 = i2 + 4;
        java.lang.System.arraycopy(byteArray3, 0, bArr, i3, length3);
        int i4 = i3 + length3;
        org.bouncycastle.util.Pack.intToBigEndian(length4, bArr, i4);
        java.lang.System.arraycopy(byteArray4, 0, bArr, i4 + 4, length4);
        return bArr;
    }

    public void setV(java.math.BigInteger bigInteger) {
        this.Camera2StreamConfigurationMap = bigInteger;
    }

    public void setU2(java.math.BigInteger bigInteger) {
        this.getHighSpeedVideoFpsRangesFor = bigInteger;
    }

    public void setU1(java.math.BigInteger bigInteger) {
        this.getHighResolutionOutputSizeshNQ4ISI = bigInteger;
    }

    public void setE(java.math.BigInteger bigInteger) {
        this.getHighSpeedVideoFpsRanges = bigInteger;
    }

    public java.math.BigInteger getV() {
        return this.Camera2StreamConfigurationMap;
    }

    public java.math.BigInteger getU2() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public java.math.BigInteger getU1() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public java.math.BigInteger getE() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public CramerShoupCiphertext(byte[] bArr) {
        int bigEndianToInt = org.bouncycastle.util.Pack.bigEndianToInt(bArr, 0);
        int i = bigEndianToInt + 4;
        this.getHighResolutionOutputSizeshNQ4ISI = new java.math.BigInteger(org.bouncycastle.util.Arrays.copyOfRange(bArr, 4, i));
        int i2 = bigEndianToInt + 8;
        int bigEndianToInt2 = org.bouncycastle.util.Pack.bigEndianToInt(bArr, i) + i2;
        this.getHighSpeedVideoFpsRangesFor = new java.math.BigInteger(org.bouncycastle.util.Arrays.copyOfRange(bArr, i2, bigEndianToInt2));
        int bigEndianToInt3 = org.bouncycastle.util.Pack.bigEndianToInt(bArr, bigEndianToInt2);
        int i3 = bigEndianToInt2 + 4;
        int i4 = bigEndianToInt3 + i3;
        this.getHighSpeedVideoFpsRanges = new java.math.BigInteger(org.bouncycastle.util.Arrays.copyOfRange(bArr, i3, i4));
        int bigEndianToInt4 = org.bouncycastle.util.Pack.bigEndianToInt(bArr, i4);
        int i5 = i4 + 4;
        this.Camera2StreamConfigurationMap = new java.math.BigInteger(org.bouncycastle.util.Arrays.copyOfRange(bArr, i5, bigEndianToInt4 + i5));
    }

    public CramerShoupCiphertext(java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2, java.math.BigInteger bigInteger3, java.math.BigInteger bigInteger4) {
        this.getHighResolutionOutputSizeshNQ4ISI = bigInteger;
        this.getHighSpeedVideoFpsRangesFor = bigInteger2;
        this.getHighSpeedVideoFpsRanges = bigInteger3;
        this.Camera2StreamConfigurationMap = bigInteger4;
    }

    public CramerShoupCiphertext() {
    }
}
