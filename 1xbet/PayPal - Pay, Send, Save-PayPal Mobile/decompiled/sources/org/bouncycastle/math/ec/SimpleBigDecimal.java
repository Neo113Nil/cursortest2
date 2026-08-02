package org.bouncycastle.math.ec;

/* loaded from: classes17.dex */
class SimpleBigDecimal {
    final int getHighResolutionOutputSizeshNQ4ISI;
    final java.math.BigInteger getHighSpeedVideoSizes;

    public final org.bouncycastle.math.ec.SimpleBigDecimal Camera2StreamConfigurationMap(org.bouncycastle.math.ec.SimpleBigDecimal simpleBigDecimal) {
        if (this.getHighResolutionOutputSizeshNQ4ISI == simpleBigDecimal.getHighResolutionOutputSizeshNQ4ISI) {
            return new org.bouncycastle.math.ec.SimpleBigDecimal(this.getHighSpeedVideoSizes.add(simpleBigDecimal.getHighSpeedVideoSizes), this.getHighResolutionOutputSizeshNQ4ISI);
        }
        throw new java.lang.IllegalArgumentException("Only SimpleBigDecimal of same scale allowed in arithmetic operations");
    }

    public final java.math.BigInteger Camera2StreamConfigurationMap() {
        org.bouncycastle.math.ec.SimpleBigDecimal simpleBigDecimal = new org.bouncycastle.math.ec.SimpleBigDecimal(org.bouncycastle.math.ec.ECConstants.ONE, 1);
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i < 0) {
            throw new java.lang.IllegalArgumentException("scale may not be negative");
        }
        int i2 = simpleBigDecimal.getHighResolutionOutputSizeshNQ4ISI;
        if (i != i2) {
            simpleBigDecimal = new org.bouncycastle.math.ec.SimpleBigDecimal(simpleBigDecimal.getHighSpeedVideoSizes.shiftLeft(i - i2), i);
        }
        org.bouncycastle.math.ec.SimpleBigDecimal Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(simpleBigDecimal);
        return Camera2StreamConfigurationMap.getHighSpeedVideoSizes.shiftRight(Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI);
    }

    public java.lang.String toString() {
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            return this.getHighSpeedVideoSizes.toString();
        }
        java.math.BigInteger shiftRight = this.getHighSpeedVideoSizes.shiftRight(i);
        java.math.BigInteger subtract = this.getHighSpeedVideoSizes.subtract(shiftRight.shiftLeft(this.getHighResolutionOutputSizeshNQ4ISI));
        if (this.getHighSpeedVideoSizes.signum() == -1) {
            subtract = org.bouncycastle.math.ec.ECConstants.ONE.shiftLeft(this.getHighResolutionOutputSizeshNQ4ISI).subtract(subtract);
        }
        if (shiftRight.signum() == -1 && !subtract.equals(org.bouncycastle.math.ec.ECConstants.ZERO)) {
            shiftRight = shiftRight.add(org.bouncycastle.math.ec.ECConstants.ONE);
        }
        java.lang.String obj = shiftRight.toString();
        char[] cArr = new char[this.getHighResolutionOutputSizeshNQ4ISI];
        java.lang.String bigInteger = subtract.toString(2);
        int length = bigInteger.length();
        int i2 = this.getHighResolutionOutputSizeshNQ4ISI - length;
        for (int i3 = 0; i3 < i2; i3++) {
            cArr[i3] = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
        }
        for (int i4 = 0; i4 < length; i4++) {
            cArr[i2 + i4] = bigInteger.charAt(i4);
        }
        java.lang.String str = new java.lang.String(cArr);
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer(obj);
        stringBuffer.append(".");
        stringBuffer.append(str);
        return stringBuffer.toString();
    }

    public int hashCode() {
        return this.getHighSpeedVideoSizes.hashCode() ^ this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof org.bouncycastle.math.ec.SimpleBigDecimal)) {
            return false;
        }
        org.bouncycastle.math.ec.SimpleBigDecimal simpleBigDecimal = (org.bouncycastle.math.ec.SimpleBigDecimal) obj;
        return this.getHighSpeedVideoSizes.equals(simpleBigDecimal.getHighSpeedVideoSizes) && this.getHighResolutionOutputSizeshNQ4ISI == simpleBigDecimal.getHighResolutionOutputSizeshNQ4ISI;
    }

    public SimpleBigDecimal(java.math.BigInteger bigInteger, int i) {
        if (i < 0) {
            throw new java.lang.IllegalArgumentException("scale may not be negative");
        }
        this.getHighSpeedVideoSizes = bigInteger;
        this.getHighResolutionOutputSizeshNQ4ISI = i;
    }
}
