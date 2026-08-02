package org.bouncycastle.pqc.math.linearalgebra;

/* loaded from: classes17.dex */
public class GF2mField {
    private int getHighResolutionOutputSizeshNQ4ISI;
    private int getHighSpeedVideoFpsRanges;

    public int add(int i, int i2) {
        return i ^ i2;
    }

    public java.lang.String toString() {
        java.lang.String str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Finite Field GF(2^");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append(") = GF(2)[X]/<");
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            str = "0";
        } else {
            java.lang.String str2 = ((byte) (i & 1)) == 1 ? "1" : "";
            int i2 = i >>> 1;
            int i3 = 1;
            while (i2 != 0) {
                if (((byte) (i2 & 1)) == 1) {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                    sb2.append(str2);
                    sb2.append("+x^");
                    sb2.append(i3);
                    str2 = sb2.toString();
                }
                i2 >>>= 1;
                i3++;
            }
            str = str2;
        }
        sb.append(str);
        sb.append("> ");
        return sb.toString();
    }

    public int sqRoot(int i) {
        for (int i2 = 1; i2 < this.getHighResolutionOutputSizeshNQ4ISI; i2++) {
            i = mult(i, i);
        }
        return i;
    }

    public int mult(int i, int i2) {
        return org.bouncycastle.pqc.math.linearalgebra.PolynomialRingGF2.modMultiply(i, i2, this.getHighSpeedVideoFpsRanges);
    }

    public boolean isElementOfThisField(int i) {
        int i2 = this.getHighResolutionOutputSizeshNQ4ISI;
        return i2 == 31 ? i >= 0 : i >= 0 && i < (1 << i2);
    }

    public int inverse(int i) {
        return exp(i, (1 << this.getHighResolutionOutputSizeshNQ4ISI) - 2);
    }

    public int hashCode() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public int getRandomNonZeroElement(java.security.SecureRandom secureRandom) {
        int highSpeedVideoSizes = org.bouncycastle.pqc.math.linearalgebra.RandUtils.getHighSpeedVideoSizes(secureRandom, 1 << this.getHighResolutionOutputSizeshNQ4ISI);
        int i = 0;
        while (highSpeedVideoSizes == 0 && i < 1048576) {
            highSpeedVideoSizes = org.bouncycastle.pqc.math.linearalgebra.RandUtils.getHighSpeedVideoSizes(secureRandom, 1 << this.getHighResolutionOutputSizeshNQ4ISI);
            i++;
        }
        if (i == 1048576) {
            return 1;
        }
        return highSpeedVideoSizes;
    }

    public int getRandomNonZeroElement() {
        return getRandomNonZeroElement(org.bouncycastle.crypto.CryptoServicesRegistrar.getSecureRandom());
    }

    public int getRandomElement(java.security.SecureRandom secureRandom) {
        return org.bouncycastle.pqc.math.linearalgebra.RandUtils.getHighSpeedVideoSizes(secureRandom, 1 << this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public int getPolynomial() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public byte[] getEncoded() {
        return org.bouncycastle.pqc.math.linearalgebra.LittleEndianConversions.I2OSP(this.getHighSpeedVideoFpsRanges);
    }

    public int getDegree() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public int exp(int i, int i2) {
        if (i2 == 0) {
            return 1;
        }
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 1;
        }
        if (i2 < 0) {
            i = inverse(i);
            i2 = -i2;
        }
        int i3 = 1;
        while (i2 != 0) {
            if ((i2 & 1) == 1) {
                i3 = mult(i3, i);
            }
            i = mult(i, i);
            i2 >>>= 1;
        }
        return i3;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == null || !(obj instanceof org.bouncycastle.pqc.math.linearalgebra.GF2mField)) {
            return false;
        }
        org.bouncycastle.pqc.math.linearalgebra.GF2mField gF2mField = (org.bouncycastle.pqc.math.linearalgebra.GF2mField) obj;
        return this.getHighResolutionOutputSizeshNQ4ISI == gF2mField.getHighResolutionOutputSizeshNQ4ISI && this.getHighSpeedVideoFpsRanges == gF2mField.getHighSpeedVideoFpsRanges;
    }

    public java.lang.String elementToStr(int i) {
        java.lang.String str = "";
        for (int i2 = 0; i2 < this.getHighResolutionOutputSizeshNQ4ISI; i2++) {
            java.lang.StringBuilder sb = (((byte) i) & 1) == 0 ? new java.lang.StringBuilder("0") : new java.lang.StringBuilder("1");
            sb.append(str);
            str = sb.toString();
            i >>>= 1;
        }
        return str;
    }

    public GF2mField(byte[] bArr) {
        this.getHighResolutionOutputSizeshNQ4ISI = 0;
        if (bArr.length != 4) {
            throw new java.lang.IllegalArgumentException("byte array is not an encoded finite field");
        }
        int OS2IP = org.bouncycastle.pqc.math.linearalgebra.LittleEndianConversions.OS2IP(bArr);
        this.getHighSpeedVideoFpsRanges = OS2IP;
        if (!org.bouncycastle.pqc.math.linearalgebra.PolynomialRingGF2.isIrreducible(OS2IP)) {
            throw new java.lang.IllegalArgumentException("byte array is not an encoded finite field");
        }
        this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.pqc.math.linearalgebra.PolynomialRingGF2.degree(this.getHighSpeedVideoFpsRanges);
    }

    public GF2mField(org.bouncycastle.pqc.math.linearalgebra.GF2mField gF2mField) {
        this.getHighResolutionOutputSizeshNQ4ISI = 0;
        this.getHighResolutionOutputSizeshNQ4ISI = gF2mField.getHighResolutionOutputSizeshNQ4ISI;
        this.getHighSpeedVideoFpsRanges = gF2mField.getHighSpeedVideoFpsRanges;
    }

    public GF2mField(int i, int i2) {
        this.getHighResolutionOutputSizeshNQ4ISI = 0;
        if (i != org.bouncycastle.pqc.math.linearalgebra.PolynomialRingGF2.degree(i2)) {
            throw new java.lang.IllegalArgumentException(" Error: the degree is not correct");
        }
        if (!org.bouncycastle.pqc.math.linearalgebra.PolynomialRingGF2.isIrreducible(i2)) {
            throw new java.lang.IllegalArgumentException(" Error: given polynomial is reducible");
        }
        this.getHighResolutionOutputSizeshNQ4ISI = i;
        this.getHighSpeedVideoFpsRanges = i2;
    }

    public GF2mField(int i) {
        this.getHighResolutionOutputSizeshNQ4ISI = 0;
        if (i >= 32) {
            throw new java.lang.IllegalArgumentException(" Error: the degree of field is too large ");
        }
        if (i <= 0) {
            throw new java.lang.IllegalArgumentException(" Error: the degree of field is non-positive ");
        }
        this.getHighResolutionOutputSizeshNQ4ISI = i;
        this.getHighSpeedVideoFpsRanges = org.bouncycastle.pqc.math.linearalgebra.PolynomialRingGF2.getIrreduciblePolynomial(i);
    }
}
