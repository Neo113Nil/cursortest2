package org.bouncycastle.crypto.params;

/* loaded from: classes17.dex */
public class DHPublicKeyParameters extends org.bouncycastle.crypto.params.DHKeyParameters {
    private java.math.BigInteger getHighResolutionOutputSizeshNQ4ISI;
    private static final java.math.BigInteger getHighSpeedVideoFpsRangesFor = java.math.BigInteger.valueOf(1);
    private static final java.math.BigInteger Camera2StreamConfigurationMap = java.math.BigInteger.valueOf(2);

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0076, code lost:
    
        if (1 == (1 - (r4 & 2))) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x009a, code lost:
    
        if (org.bouncycastle.crypto.params.DHPublicKeyParameters.getHighSpeedVideoFpsRangesFor.equals(r10.modPow(r11, r1)) != false) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DHPublicKeyParameters(java.math.BigInteger bigInteger, org.bouncycastle.crypto.params.DHParameters dHParameters) {
        super(false, dHParameters);
        if (bigInteger == null) {
            throw new java.lang.NullPointerException("y value cannot be null");
        }
        java.math.BigInteger p = dHParameters.getP();
        java.math.BigInteger bigInteger2 = Camera2StreamConfigurationMap;
        if (bigInteger.compareTo(bigInteger2) < 0 || bigInteger.compareTo(p.subtract(bigInteger2)) > 0) {
            throw new java.lang.IllegalArgumentException("invalid DH public key");
        }
        java.math.BigInteger q = dHParameters.getQ();
        if (q != null) {
            if (p.testBit(0) && p.bitLength() - 1 == q.bitLength() && p.shiftRight(1).equals(q)) {
                int bitLength = p.bitLength();
                int[] fromBigInteger = org.bouncycastle.math.raw.Nat.fromBigInteger(bitLength, bigInteger);
                int[] fromBigInteger2 = org.bouncycastle.math.raw.Nat.fromBigInteger(bitLength, p);
                int length = fromBigInteger2.length;
                int i = 0;
                while (true) {
                    int i2 = fromBigInteger[0];
                    if (i2 == 0) {
                        org.bouncycastle.math.raw.Nat.shiftDownWord(length, fromBigInteger, 0);
                    } else {
                        int numberOfTrailingZeros = org.bouncycastle.util.Integers.numberOfTrailingZeros(i2);
                        if (numberOfTrailingZeros > 0) {
                            org.bouncycastle.math.raw.Nat.shiftDownBits(length, fromBigInteger, numberOfTrailingZeros, 0);
                            int i3 = fromBigInteger2[0];
                            i ^= (numberOfTrailingZeros << 1) & (i3 ^ (i3 >>> 1));
                        }
                        int compare = org.bouncycastle.math.raw.Nat.compare(length, fromBigInteger, fromBigInteger2);
                        if (compare == 0) {
                            break;
                        }
                        if (compare < 0) {
                            i ^= fromBigInteger[0] & fromBigInteger2[0];
                            int[] iArr = fromBigInteger;
                            fromBigInteger = fromBigInteger2;
                            fromBigInteger2 = iArr;
                        }
                        while (true) {
                            int i4 = length - 1;
                            if (fromBigInteger[i4] != 0) {
                                break;
                            } else {
                                length = i4;
                            }
                        }
                        org.bouncycastle.math.raw.Nat.sub(length, fromBigInteger, fromBigInteger2, fromBigInteger);
                    }
                }
                if (org.bouncycastle.math.raw.Nat.isOne(length, fromBigInteger2)) {
                }
                throw new java.lang.IllegalArgumentException("Y value does not appear to be in correct group");
            }
        }
        this.getHighResolutionOutputSizeshNQ4ISI = bigInteger;
    }

    @Override // org.bouncycastle.crypto.params.DHKeyParameters
    public int hashCode() {
        return this.getHighResolutionOutputSizeshNQ4ISI.hashCode() ^ super.hashCode();
    }

    public java.math.BigInteger getY() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // org.bouncycastle.crypto.params.DHKeyParameters
    public boolean equals(java.lang.Object obj) {
        return (obj instanceof org.bouncycastle.crypto.params.DHPublicKeyParameters) && ((org.bouncycastle.crypto.params.DHPublicKeyParameters) obj).getY().equals(this.getHighResolutionOutputSizeshNQ4ISI) && super.equals(obj);
    }
}
