package org.bouncycastle.math.ec;

/* loaded from: classes17.dex */
public abstract class ECFieldElement implements org.bouncycastle.math.ec.ECConstants {

    public static abstract class AbstractFp extends org.bouncycastle.math.ec.ECFieldElement {
    }

    public abstract org.bouncycastle.math.ec.ECFieldElement add(org.bouncycastle.math.ec.ECFieldElement eCFieldElement);

    public abstract org.bouncycastle.math.ec.ECFieldElement addOne();

    public abstract org.bouncycastle.math.ec.ECFieldElement divide(org.bouncycastle.math.ec.ECFieldElement eCFieldElement);

    public abstract java.lang.String getFieldName();

    public abstract int getFieldSize();

    public abstract org.bouncycastle.math.ec.ECFieldElement invert();

    public abstract org.bouncycastle.math.ec.ECFieldElement multiply(org.bouncycastle.math.ec.ECFieldElement eCFieldElement);

    public abstract org.bouncycastle.math.ec.ECFieldElement negate();

    public abstract org.bouncycastle.math.ec.ECFieldElement sqrt();

    public abstract org.bouncycastle.math.ec.ECFieldElement square();

    public abstract org.bouncycastle.math.ec.ECFieldElement subtract(org.bouncycastle.math.ec.ECFieldElement eCFieldElement);

    public abstract java.math.BigInteger toBigInteger();

    public static class F2m extends org.bouncycastle.math.ec.ECFieldElement.AbstractF2m {
        public static final int GNB = 1;
        public static final int PPB = 3;
        public static final int TPB = 2;
        private int Camera2StreamConfigurationMap;
        private int[] getHighSpeedVideoFpsRanges;
        private int getHighSpeedVideoFpsRangesFor;
        org.bouncycastle.math.ec.LongArray getHighSpeedVideoSizes;

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public org.bouncycastle.math.ec.ECFieldElement negate() {
            return this;
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public org.bouncycastle.math.ec.ECFieldElement addOne() {
            org.bouncycastle.math.ec.LongArray longArray;
            int i = this.getHighSpeedVideoFpsRangesFor;
            int[] iArr = this.getHighSpeedVideoFpsRanges;
            org.bouncycastle.math.ec.LongArray longArray2 = this.getHighSpeedVideoSizes;
            if (longArray2.getHighResolutionOutputSizeshNQ4ISI.length == 0) {
                longArray = new org.bouncycastle.math.ec.LongArray(new long[]{1});
            } else {
                int max = java.lang.Math.max(1, longArray2.getHighResolutionOutputSizeshNQ4ISI(longArray2.getHighResolutionOutputSizeshNQ4ISI.length));
                long[] jArr = new long[max];
                long[] jArr2 = longArray2.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.System.arraycopy(jArr2, 0, jArr, 0, java.lang.Math.min(jArr2.length, max));
                jArr[0] = jArr[0] ^ 1;
                longArray = new org.bouncycastle.math.ec.LongArray(jArr);
            }
            return new org.bouncycastle.math.ec.ECFieldElement.F2m(i, iArr, longArray);
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public boolean isZero() {
            for (long j : this.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI) {
                if (j != 0) {
                    return false;
                }
            }
            return true;
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public org.bouncycastle.math.ec.ECFieldElement sqrt() {
            long[] jArr = this.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI;
            int i = 0;
            while (true) {
                if (i >= jArr.length) {
                    break;
                }
                if (jArr[i] == 0) {
                    i++;
                } else if (!this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges()) {
                    return squarePow(this.getHighSpeedVideoFpsRangesFor - 1);
                }
            }
            return this;
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public org.bouncycastle.math.ec.ECFieldElement squarePlusProduct(org.bouncycastle.math.ec.ECFieldElement eCFieldElement, org.bouncycastle.math.ec.ECFieldElement eCFieldElement2) {
            org.bouncycastle.math.ec.LongArray longArray;
            org.bouncycastle.math.ec.LongArray longArray2 = this.getHighSpeedVideoSizes;
            org.bouncycastle.math.ec.LongArray longArray3 = ((org.bouncycastle.math.ec.ECFieldElement.F2m) eCFieldElement).getHighSpeedVideoSizes;
            org.bouncycastle.math.ec.LongArray longArray4 = ((org.bouncycastle.math.ec.ECFieldElement.F2m) eCFieldElement2).getHighSpeedVideoSizes;
            int highResolutionOutputSizeshNQ4ISI = longArray2.getHighResolutionOutputSizeshNQ4ISI(longArray2.getHighResolutionOutputSizeshNQ4ISI.length);
            if (highResolutionOutputSizeshNQ4ISI == 0) {
                longArray = longArray2;
            } else {
                int i = highResolutionOutputSizeshNQ4ISI << 1;
                long[] jArr = new long[i];
                for (int i2 = 0; i2 < i; i2 += 2) {
                    long j = longArray2.getHighResolutionOutputSizeshNQ4ISI[i2 >>> 1];
                    jArr[i2] = org.bouncycastle.math.ec.LongArray.getHighSpeedVideoSizes((int) j);
                    jArr[i2 + 1] = org.bouncycastle.math.ec.LongArray.getHighSpeedVideoSizes((int) (j >>> 32));
                }
                longArray = new org.bouncycastle.math.ec.LongArray(jArr, 0, i);
            }
            org.bouncycastle.math.ec.LongArray highSpeedVideoFpsRangesFor = longArray3.getHighSpeedVideoFpsRangesFor(longArray4);
            if (longArray == longArray2) {
                longArray = (org.bouncycastle.math.ec.LongArray) longArray.clone();
            }
            longArray.getHighSpeedVideoSizes(highSpeedVideoFpsRangesFor);
            longArray.getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges);
            return new org.bouncycastle.math.ec.ECFieldElement.F2m(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, longArray);
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public boolean testBitZero() {
            long[] jArr = this.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI;
            return jArr.length > 0 && (jArr[0] & 1) != 0;
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public java.math.BigInteger toBigInteger() {
            return this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap();
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public org.bouncycastle.math.ec.ECFieldElement subtract(org.bouncycastle.math.ec.ECFieldElement eCFieldElement) {
            return add(eCFieldElement);
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public org.bouncycastle.math.ec.ECFieldElement squarePow(int i) {
            if (i <= 0) {
                return this;
            }
            int i2 = this.getHighSpeedVideoFpsRangesFor;
            int[] iArr = this.getHighSpeedVideoFpsRanges;
            return new org.bouncycastle.math.ec.ECFieldElement.F2m(i2, iArr, this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap(i, i2, iArr));
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public org.bouncycastle.math.ec.ECFieldElement squareMinusProduct(org.bouncycastle.math.ec.ECFieldElement eCFieldElement, org.bouncycastle.math.ec.ECFieldElement eCFieldElement2) {
            return squarePlusProduct(eCFieldElement, eCFieldElement2);
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public org.bouncycastle.math.ec.ECFieldElement square() {
            int i = this.getHighSpeedVideoFpsRangesFor;
            int[] iArr = this.getHighSpeedVideoFpsRanges;
            return new org.bouncycastle.math.ec.ECFieldElement.F2m(i, iArr, this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap(i, iArr));
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public org.bouncycastle.math.ec.ECFieldElement multiplyPlusProduct(org.bouncycastle.math.ec.ECFieldElement eCFieldElement, org.bouncycastle.math.ec.ECFieldElement eCFieldElement2, org.bouncycastle.math.ec.ECFieldElement eCFieldElement3) {
            org.bouncycastle.math.ec.LongArray longArray = this.getHighSpeedVideoSizes;
            org.bouncycastle.math.ec.LongArray longArray2 = ((org.bouncycastle.math.ec.ECFieldElement.F2m) eCFieldElement).getHighSpeedVideoSizes;
            org.bouncycastle.math.ec.LongArray longArray3 = ((org.bouncycastle.math.ec.ECFieldElement.F2m) eCFieldElement2).getHighSpeedVideoSizes;
            org.bouncycastle.math.ec.LongArray longArray4 = ((org.bouncycastle.math.ec.ECFieldElement.F2m) eCFieldElement3).getHighSpeedVideoSizes;
            org.bouncycastle.math.ec.LongArray highSpeedVideoFpsRangesFor = longArray.getHighSpeedVideoFpsRangesFor(longArray2);
            org.bouncycastle.math.ec.LongArray highSpeedVideoFpsRangesFor2 = longArray3.getHighSpeedVideoFpsRangesFor(longArray4);
            if (highSpeedVideoFpsRangesFor == longArray || highSpeedVideoFpsRangesFor == longArray2) {
                highSpeedVideoFpsRangesFor = (org.bouncycastle.math.ec.LongArray) highSpeedVideoFpsRangesFor.clone();
            }
            highSpeedVideoFpsRangesFor.getHighSpeedVideoSizes(highSpeedVideoFpsRangesFor2);
            highSpeedVideoFpsRangesFor.getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges);
            return new org.bouncycastle.math.ec.ECFieldElement.F2m(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, highSpeedVideoFpsRangesFor);
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public org.bouncycastle.math.ec.ECFieldElement multiplyMinusProduct(org.bouncycastle.math.ec.ECFieldElement eCFieldElement, org.bouncycastle.math.ec.ECFieldElement eCFieldElement2, org.bouncycastle.math.ec.ECFieldElement eCFieldElement3) {
            return multiplyPlusProduct(eCFieldElement, eCFieldElement2, eCFieldElement3);
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public org.bouncycastle.math.ec.ECFieldElement multiply(org.bouncycastle.math.ec.ECFieldElement eCFieldElement) {
            int i = this.getHighSpeedVideoFpsRangesFor;
            int[] iArr = this.getHighSpeedVideoFpsRanges;
            return new org.bouncycastle.math.ec.ECFieldElement.F2m(i, iArr, this.getHighSpeedVideoSizes.getHighSpeedVideoSizes(((org.bouncycastle.math.ec.ECFieldElement.F2m) eCFieldElement).getHighSpeedVideoSizes, i, iArr));
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public boolean isOne() {
            return this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges();
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public org.bouncycastle.math.ec.ECFieldElement invert() {
            int i = this.getHighSpeedVideoFpsRangesFor;
            int[] iArr = this.getHighSpeedVideoFpsRanges;
            return new org.bouncycastle.math.ec.ECFieldElement.F2m(i, iArr, this.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI(i, iArr));
        }

        public int hashCode() {
            return (this.getHighSpeedVideoSizes.hashCode() ^ this.getHighSpeedVideoFpsRangesFor) ^ org.bouncycastle.util.Arrays.hashCode(this.getHighSpeedVideoFpsRanges);
        }

        public int getRepresentation() {
            return this.Camera2StreamConfigurationMap;
        }

        public int getM() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        public int getK3() {
            int[] iArr = this.getHighSpeedVideoFpsRanges;
            if (iArr.length >= 3) {
                return iArr[2];
            }
            return 0;
        }

        public int getK2() {
            int[] iArr = this.getHighSpeedVideoFpsRanges;
            if (iArr.length >= 2) {
                return iArr[1];
            }
            return 0;
        }

        public int getK1() {
            return this.getHighSpeedVideoFpsRanges[0];
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public int getFieldSize() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public java.lang.String getFieldName() {
            return "F2m";
        }

        public boolean equals(java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof org.bouncycastle.math.ec.ECFieldElement.F2m)) {
                return false;
            }
            org.bouncycastle.math.ec.ECFieldElement.F2m f2m = (org.bouncycastle.math.ec.ECFieldElement.F2m) obj;
            return this.getHighSpeedVideoFpsRangesFor == f2m.getHighSpeedVideoFpsRangesFor && this.Camera2StreamConfigurationMap == f2m.Camera2StreamConfigurationMap && org.bouncycastle.util.Arrays.areEqual(this.getHighSpeedVideoFpsRanges, f2m.getHighSpeedVideoFpsRanges) && this.getHighSpeedVideoSizes.equals(f2m.getHighSpeedVideoSizes);
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public org.bouncycastle.math.ec.ECFieldElement divide(org.bouncycastle.math.ec.ECFieldElement eCFieldElement) {
            return multiply(eCFieldElement.invert());
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public int bitLength() {
            return this.getHighSpeedVideoSizes.getHighSpeedVideoSizes();
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public org.bouncycastle.math.ec.ECFieldElement add(org.bouncycastle.math.ec.ECFieldElement eCFieldElement) {
            org.bouncycastle.math.ec.LongArray longArray = (org.bouncycastle.math.ec.LongArray) this.getHighSpeedVideoSizes.clone();
            longArray.getHighSpeedVideoSizes(((org.bouncycastle.math.ec.ECFieldElement.F2m) eCFieldElement).getHighSpeedVideoSizes);
            return new org.bouncycastle.math.ec.ECFieldElement.F2m(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, longArray);
        }

        F2m(int i, int[] iArr, org.bouncycastle.math.ec.LongArray longArray) {
            this.getHighSpeedVideoFpsRangesFor = i;
            this.Camera2StreamConfigurationMap = iArr.length == 1 ? 2 : 3;
            this.getHighSpeedVideoFpsRanges = iArr;
            this.getHighSpeedVideoSizes = longArray;
        }

        F2m(int i, int i2, int i3, int i4, java.math.BigInteger bigInteger) {
            if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > i) {
                throw new java.lang.IllegalArgumentException("x value invalid in F2m field element");
            }
            if (i3 == 0 && i4 == 0) {
                this.Camera2StreamConfigurationMap = 2;
                this.getHighSpeedVideoFpsRanges = new int[]{i2};
            } else {
                if (i3 >= i4) {
                    throw new java.lang.IllegalArgumentException("k2 must be smaller than k3");
                }
                if (i3 <= 0) {
                    throw new java.lang.IllegalArgumentException("k2 must be larger than 0");
                }
                this.Camera2StreamConfigurationMap = 3;
                this.getHighSpeedVideoFpsRanges = new int[]{i2, i3, i4};
            }
            this.getHighSpeedVideoFpsRangesFor = i;
            this.getHighSpeedVideoSizes = new org.bouncycastle.math.ec.LongArray(bigInteger);
        }
    }

    public static class Fp extends org.bouncycastle.math.ec.ECFieldElement.AbstractFp {
        java.math.BigInteger getHighResolutionOutputSizeshNQ4ISI;
        java.math.BigInteger getHighSpeedVideoFpsRangesFor;
        java.math.BigInteger getHighSpeedVideoSizes;

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public org.bouncycastle.math.ec.ECFieldElement sqrt() {
            java.math.BigInteger bigInteger;
            if (isZero() || isOne()) {
                return this;
            }
            if (!this.getHighResolutionOutputSizeshNQ4ISI.testBit(0)) {
                throw new java.lang.RuntimeException("not done yet");
            }
            if (this.getHighResolutionOutputSizeshNQ4ISI.testBit(1)) {
                java.math.BigInteger add = this.getHighResolutionOutputSizeshNQ4ISI.shiftRight(2).add(org.bouncycastle.math.ec.ECConstants.ONE);
                java.math.BigInteger bigInteger2 = this.getHighResolutionOutputSizeshNQ4ISI;
                org.bouncycastle.math.ec.ECFieldElement.Fp fp = new org.bouncycastle.math.ec.ECFieldElement.Fp(bigInteger2, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor.modPow(add, bigInteger2));
                if (fp.square().equals(this)) {
                    return fp;
                }
                return null;
            }
            if (this.getHighResolutionOutputSizeshNQ4ISI.testBit(2)) {
                java.math.BigInteger modPow = this.getHighSpeedVideoFpsRangesFor.modPow(this.getHighResolutionOutputSizeshNQ4ISI.shiftRight(3), this.getHighResolutionOutputSizeshNQ4ISI);
                java.math.BigInteger modMult = modMult(modPow, this.getHighSpeedVideoFpsRangesFor);
                if (modMult(modMult, modPow).equals(org.bouncycastle.math.ec.ECConstants.ONE)) {
                    org.bouncycastle.math.ec.ECFieldElement.Fp fp2 = new org.bouncycastle.math.ec.ECFieldElement.Fp(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, modMult);
                    if (fp2.square().equals(this)) {
                        return fp2;
                    }
                    return null;
                }
                org.bouncycastle.math.ec.ECFieldElement.Fp fp3 = new org.bouncycastle.math.ec.ECFieldElement.Fp(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, modMult(modMult, org.bouncycastle.math.ec.ECConstants.TWO.modPow(this.getHighResolutionOutputSizeshNQ4ISI.shiftRight(2), this.getHighResolutionOutputSizeshNQ4ISI)));
                if (fp3.square().equals(this)) {
                    return fp3;
                }
                return null;
            }
            java.math.BigInteger shiftRight = this.getHighResolutionOutputSizeshNQ4ISI.shiftRight(1);
            if (!this.getHighSpeedVideoFpsRangesFor.modPow(shiftRight, this.getHighResolutionOutputSizeshNQ4ISI).equals(org.bouncycastle.math.ec.ECConstants.ONE)) {
                return null;
            }
            java.math.BigInteger bigInteger3 = this.getHighSpeedVideoFpsRangesFor;
            java.math.BigInteger modDouble = modDouble(modDouble(bigInteger3));
            java.math.BigInteger add2 = shiftRight.add(org.bouncycastle.math.ec.ECConstants.ONE);
            java.math.BigInteger subtract = this.getHighResolutionOutputSizeshNQ4ISI.subtract(org.bouncycastle.math.ec.ECConstants.ONE);
            java.util.Random random = new java.util.Random();
            while (true) {
                java.math.BigInteger bigInteger4 = new java.math.BigInteger(this.getHighResolutionOutputSizeshNQ4ISI.bitLength(), random);
                if (bigInteger4.compareTo(this.getHighResolutionOutputSizeshNQ4ISI) < 0 && modReduce(bigInteger4.multiply(bigInteger4).subtract(modDouble)).modPow(shiftRight, this.getHighResolutionOutputSizeshNQ4ISI).equals(subtract)) {
                    int bitLength = add2.bitLength();
                    int lowestSetBit = add2.getLowestSetBit();
                    java.math.BigInteger bigInteger5 = org.bouncycastle.math.ec.ECConstants.ONE;
                    java.math.BigInteger bigInteger6 = org.bouncycastle.math.ec.ECConstants.TWO;
                    java.math.BigInteger bigInteger7 = org.bouncycastle.math.ec.ECConstants.ONE;
                    int i = bitLength - 1;
                    java.math.BigInteger bigInteger8 = bigInteger4;
                    java.math.BigInteger bigInteger9 = org.bouncycastle.math.ec.ECConstants.ONE;
                    while (i >= lowestSetBit + 1) {
                        bigInteger7 = modMult(bigInteger7, bigInteger9);
                        if (add2.testBit(i)) {
                            java.math.BigInteger modMult2 = modMult(bigInteger7, bigInteger3);
                            java.math.BigInteger modMult3 = modMult(bigInteger5, bigInteger8);
                            java.math.BigInteger modReduce = modReduce(bigInteger8.multiply(bigInteger6).subtract(bigInteger4.multiply(bigInteger7)));
                            bigInteger = shiftRight;
                            bigInteger8 = modReduce(bigInteger8.multiply(bigInteger8).subtract(modMult2.shiftLeft(1)));
                            bigInteger6 = modReduce;
                            bigInteger5 = modMult3;
                            bigInteger9 = modMult2;
                        } else {
                            bigInteger = shiftRight;
                            java.math.BigInteger modReduce2 = modReduce(bigInteger5.multiply(bigInteger6).subtract(bigInteger7));
                            bigInteger8 = modReduce(bigInteger8.multiply(bigInteger6).subtract(bigInteger4.multiply(bigInteger7)));
                            bigInteger5 = modReduce2;
                            bigInteger6 = modReduce(bigInteger6.multiply(bigInteger6).subtract(bigInteger7.shiftLeft(1)));
                            bigInteger9 = bigInteger7;
                        }
                        i--;
                        shiftRight = bigInteger;
                    }
                    java.math.BigInteger bigInteger10 = shiftRight;
                    java.math.BigInteger modMult4 = modMult(bigInteger7, bigInteger9);
                    java.math.BigInteger modMult5 = modMult(modMult4, bigInteger3);
                    java.math.BigInteger modReduce3 = modReduce(bigInteger5.multiply(bigInteger6).subtract(modMult4));
                    java.math.BigInteger modReduce4 = modReduce(bigInteger8.multiply(bigInteger6).subtract(bigInteger4.multiply(modMult4)));
                    java.math.BigInteger modMult6 = modMult(modMult4, modMult5);
                    for (int i2 = 1; i2 <= lowestSetBit; i2++) {
                        modReduce3 = modMult(modReduce3, modReduce4);
                        modReduce4 = modReduce(modReduce4.multiply(modReduce4).subtract(modMult6.shiftLeft(1)));
                        modMult6 = modMult(modMult6, modMult6);
                    }
                    java.math.BigInteger[] bigIntegerArr = {modReduce3, modReduce4};
                    java.math.BigInteger bigInteger11 = bigIntegerArr[0];
                    java.math.BigInteger bigInteger12 = bigIntegerArr[1];
                    if (modMult(bigInteger12, bigInteger12).equals(modDouble)) {
                        return new org.bouncycastle.math.ec.ECFieldElement.Fp(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, modHalfAbs(bigInteger12));
                    }
                    if (!bigInteger11.equals(org.bouncycastle.math.ec.ECConstants.ONE) && !bigInteger11.equals(subtract)) {
                        return null;
                    }
                    shiftRight = bigInteger10;
                }
            }
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public java.math.BigInteger toBigInteger() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public org.bouncycastle.math.ec.ECFieldElement subtract(org.bouncycastle.math.ec.ECFieldElement eCFieldElement) {
            return new org.bouncycastle.math.ec.ECFieldElement.Fp(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, modSubtract(this.getHighSpeedVideoFpsRangesFor, eCFieldElement.toBigInteger()));
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public org.bouncycastle.math.ec.ECFieldElement squarePlusProduct(org.bouncycastle.math.ec.ECFieldElement eCFieldElement, org.bouncycastle.math.ec.ECFieldElement eCFieldElement2) {
            java.math.BigInteger bigInteger = this.getHighSpeedVideoFpsRangesFor;
            java.math.BigInteger bigInteger2 = eCFieldElement.toBigInteger();
            java.math.BigInteger bigInteger3 = eCFieldElement2.toBigInteger();
            return new org.bouncycastle.math.ec.ECFieldElement.Fp(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, modReduce(bigInteger.multiply(bigInteger).add(bigInteger2.multiply(bigInteger3))));
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public org.bouncycastle.math.ec.ECFieldElement squareMinusProduct(org.bouncycastle.math.ec.ECFieldElement eCFieldElement, org.bouncycastle.math.ec.ECFieldElement eCFieldElement2) {
            java.math.BigInteger bigInteger = this.getHighSpeedVideoFpsRangesFor;
            java.math.BigInteger bigInteger2 = eCFieldElement.toBigInteger();
            java.math.BigInteger bigInteger3 = eCFieldElement2.toBigInteger();
            return new org.bouncycastle.math.ec.ECFieldElement.Fp(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, modReduce(bigInteger.multiply(bigInteger).subtract(bigInteger2.multiply(bigInteger3))));
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public org.bouncycastle.math.ec.ECFieldElement square() {
            java.math.BigInteger bigInteger = this.getHighResolutionOutputSizeshNQ4ISI;
            java.math.BigInteger bigInteger2 = this.getHighSpeedVideoSizes;
            java.math.BigInteger bigInteger3 = this.getHighSpeedVideoFpsRangesFor;
            return new org.bouncycastle.math.ec.ECFieldElement.Fp(bigInteger, bigInteger2, modMult(bigInteger3, bigInteger3));
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public org.bouncycastle.math.ec.ECFieldElement negate() {
            if (this.getHighSpeedVideoFpsRangesFor.signum() == 0) {
                return this;
            }
            java.math.BigInteger bigInteger = this.getHighResolutionOutputSizeshNQ4ISI;
            return new org.bouncycastle.math.ec.ECFieldElement.Fp(bigInteger, this.getHighSpeedVideoSizes, bigInteger.subtract(this.getHighSpeedVideoFpsRangesFor));
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public org.bouncycastle.math.ec.ECFieldElement multiplyPlusProduct(org.bouncycastle.math.ec.ECFieldElement eCFieldElement, org.bouncycastle.math.ec.ECFieldElement eCFieldElement2, org.bouncycastle.math.ec.ECFieldElement eCFieldElement3) {
            java.math.BigInteger bigInteger = this.getHighSpeedVideoFpsRangesFor;
            java.math.BigInteger bigInteger2 = eCFieldElement.toBigInteger();
            java.math.BigInteger bigInteger3 = eCFieldElement2.toBigInteger();
            java.math.BigInteger bigInteger4 = eCFieldElement3.toBigInteger();
            return new org.bouncycastle.math.ec.ECFieldElement.Fp(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, modReduce(bigInteger.multiply(bigInteger2).add(bigInteger3.multiply(bigInteger4))));
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public org.bouncycastle.math.ec.ECFieldElement multiplyMinusProduct(org.bouncycastle.math.ec.ECFieldElement eCFieldElement, org.bouncycastle.math.ec.ECFieldElement eCFieldElement2, org.bouncycastle.math.ec.ECFieldElement eCFieldElement3) {
            java.math.BigInteger bigInteger = this.getHighSpeedVideoFpsRangesFor;
            java.math.BigInteger bigInteger2 = eCFieldElement.toBigInteger();
            java.math.BigInteger bigInteger3 = eCFieldElement2.toBigInteger();
            java.math.BigInteger bigInteger4 = eCFieldElement3.toBigInteger();
            return new org.bouncycastle.math.ec.ECFieldElement.Fp(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, modReduce(bigInteger.multiply(bigInteger2).subtract(bigInteger3.multiply(bigInteger4))));
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public org.bouncycastle.math.ec.ECFieldElement multiply(org.bouncycastle.math.ec.ECFieldElement eCFieldElement) {
            return new org.bouncycastle.math.ec.ECFieldElement.Fp(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, modMult(this.getHighSpeedVideoFpsRangesFor, eCFieldElement.toBigInteger()));
        }

        protected java.math.BigInteger modSubtract(java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2) {
            java.math.BigInteger subtract = bigInteger.subtract(bigInteger2);
            return subtract.signum() < 0 ? subtract.add(this.getHighResolutionOutputSizeshNQ4ISI) : subtract;
        }

        protected java.math.BigInteger modReduce(java.math.BigInteger bigInteger) {
            if (this.getHighSpeedVideoSizes == null) {
                return bigInteger.mod(this.getHighResolutionOutputSizeshNQ4ISI);
            }
            boolean z = bigInteger.signum() < 0;
            if (z) {
                bigInteger = bigInteger.abs();
            }
            int bitLength = this.getHighResolutionOutputSizeshNQ4ISI.bitLength();
            boolean equals = this.getHighSpeedVideoSizes.equals(org.bouncycastle.math.ec.ECConstants.ONE);
            while (bigInteger.bitLength() > bitLength + 1) {
                java.math.BigInteger shiftRight = bigInteger.shiftRight(bitLength);
                java.math.BigInteger subtract = bigInteger.subtract(shiftRight.shiftLeft(bitLength));
                if (!equals) {
                    shiftRight = shiftRight.multiply(this.getHighSpeedVideoSizes);
                }
                bigInteger = shiftRight.add(subtract);
            }
            while (bigInteger.compareTo(this.getHighResolutionOutputSizeshNQ4ISI) >= 0) {
                bigInteger = bigInteger.subtract(this.getHighResolutionOutputSizeshNQ4ISI);
            }
            return (!z || bigInteger.signum() == 0) ? bigInteger : this.getHighResolutionOutputSizeshNQ4ISI.subtract(bigInteger);
        }

        protected java.math.BigInteger modMult(java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2) {
            return modReduce(bigInteger.multiply(bigInteger2));
        }

        protected java.math.BigInteger modInverse(java.math.BigInteger bigInteger) {
            return org.bouncycastle.util.BigIntegers.modOddInverse(this.getHighResolutionOutputSizeshNQ4ISI, bigInteger);
        }

        protected java.math.BigInteger modHalfAbs(java.math.BigInteger bigInteger) {
            if (bigInteger.testBit(0)) {
                bigInteger = this.getHighResolutionOutputSizeshNQ4ISI.subtract(bigInteger);
            }
            return bigInteger.shiftRight(1);
        }

        protected java.math.BigInteger modHalf(java.math.BigInteger bigInteger) {
            if (bigInteger.testBit(0)) {
                bigInteger = this.getHighResolutionOutputSizeshNQ4ISI.add(bigInteger);
            }
            return bigInteger.shiftRight(1);
        }

        protected java.math.BigInteger modDouble(java.math.BigInteger bigInteger) {
            java.math.BigInteger shiftLeft = bigInteger.shiftLeft(1);
            return shiftLeft.compareTo(this.getHighResolutionOutputSizeshNQ4ISI) >= 0 ? shiftLeft.subtract(this.getHighResolutionOutputSizeshNQ4ISI) : shiftLeft;
        }

        protected java.math.BigInteger modAdd(java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2) {
            java.math.BigInteger add = bigInteger.add(bigInteger2);
            return add.compareTo(this.getHighResolutionOutputSizeshNQ4ISI) >= 0 ? add.subtract(this.getHighResolutionOutputSizeshNQ4ISI) : add;
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public org.bouncycastle.math.ec.ECFieldElement invert() {
            return new org.bouncycastle.math.ec.ECFieldElement.Fp(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, modInverse(this.getHighSpeedVideoFpsRangesFor));
        }

        public int hashCode() {
            return this.getHighResolutionOutputSizeshNQ4ISI.hashCode() ^ this.getHighSpeedVideoFpsRangesFor.hashCode();
        }

        public java.math.BigInteger getQ() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public int getFieldSize() {
            return this.getHighResolutionOutputSizeshNQ4ISI.bitLength();
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public java.lang.String getFieldName() {
            return "Fp";
        }

        public boolean equals(java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof org.bouncycastle.math.ec.ECFieldElement.Fp)) {
                return false;
            }
            org.bouncycastle.math.ec.ECFieldElement.Fp fp = (org.bouncycastle.math.ec.ECFieldElement.Fp) obj;
            return this.getHighResolutionOutputSizeshNQ4ISI.equals(fp.getHighResolutionOutputSizeshNQ4ISI) && this.getHighSpeedVideoFpsRangesFor.equals(fp.getHighSpeedVideoFpsRangesFor);
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public org.bouncycastle.math.ec.ECFieldElement divide(org.bouncycastle.math.ec.ECFieldElement eCFieldElement) {
            return new org.bouncycastle.math.ec.ECFieldElement.Fp(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, modMult(this.getHighSpeedVideoFpsRangesFor, modInverse(eCFieldElement.toBigInteger())));
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public org.bouncycastle.math.ec.ECFieldElement addOne() {
            java.math.BigInteger add = this.getHighSpeedVideoFpsRangesFor.add(org.bouncycastle.math.ec.ECConstants.ONE);
            if (add.compareTo(this.getHighResolutionOutputSizeshNQ4ISI) == 0) {
                add = org.bouncycastle.math.ec.ECConstants.ZERO;
            }
            return new org.bouncycastle.math.ec.ECFieldElement.Fp(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, add);
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public org.bouncycastle.math.ec.ECFieldElement add(org.bouncycastle.math.ec.ECFieldElement eCFieldElement) {
            return new org.bouncycastle.math.ec.ECFieldElement.Fp(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, modAdd(this.getHighSpeedVideoFpsRangesFor, eCFieldElement.toBigInteger()));
        }

        static java.math.BigInteger getHighSpeedVideoFpsRangesFor(java.math.BigInteger bigInteger) {
            int bitLength = bigInteger.bitLength();
            if (bitLength < 96 || bigInteger.shiftRight(bitLength - 64).longValue() != -1) {
                return null;
            }
            return ONE.shiftLeft(bitLength).subtract(bigInteger);
        }

        Fp(java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2, java.math.BigInteger bigInteger3) {
            if (bigInteger3 == null || bigInteger3.signum() < 0 || bigInteger3.compareTo(bigInteger) >= 0) {
                throw new java.lang.IllegalArgumentException("x value invalid in Fp field element");
            }
            this.getHighResolutionOutputSizeshNQ4ISI = bigInteger;
            this.getHighSpeedVideoSizes = bigInteger2;
            this.getHighSpeedVideoFpsRangesFor = bigInteger3;
        }
    }

    public java.lang.String toString() {
        return toBigInteger().toString(16);
    }

    public boolean testBitZero() {
        return toBigInteger().testBit(0);
    }

    public org.bouncycastle.math.ec.ECFieldElement squarePow(int i) {
        org.bouncycastle.math.ec.ECFieldElement eCFieldElement = this;
        for (int i2 = 0; i2 < i; i2++) {
            eCFieldElement = eCFieldElement.square();
        }
        return eCFieldElement;
    }

    public org.bouncycastle.math.ec.ECFieldElement squarePlusProduct(org.bouncycastle.math.ec.ECFieldElement eCFieldElement, org.bouncycastle.math.ec.ECFieldElement eCFieldElement2) {
        return square().add(eCFieldElement.multiply(eCFieldElement2));
    }

    public org.bouncycastle.math.ec.ECFieldElement squareMinusProduct(org.bouncycastle.math.ec.ECFieldElement eCFieldElement, org.bouncycastle.math.ec.ECFieldElement eCFieldElement2) {
        return square().subtract(eCFieldElement.multiply(eCFieldElement2));
    }

    public org.bouncycastle.math.ec.ECFieldElement multiplyPlusProduct(org.bouncycastle.math.ec.ECFieldElement eCFieldElement, org.bouncycastle.math.ec.ECFieldElement eCFieldElement2, org.bouncycastle.math.ec.ECFieldElement eCFieldElement3) {
        return multiply(eCFieldElement).add(eCFieldElement2.multiply(eCFieldElement3));
    }

    public org.bouncycastle.math.ec.ECFieldElement multiplyMinusProduct(org.bouncycastle.math.ec.ECFieldElement eCFieldElement, org.bouncycastle.math.ec.ECFieldElement eCFieldElement2, org.bouncycastle.math.ec.ECFieldElement eCFieldElement3) {
        return multiply(eCFieldElement).subtract(eCFieldElement2.multiply(eCFieldElement3));
    }

    public static abstract class AbstractF2m extends org.bouncycastle.math.ec.ECFieldElement {
        public boolean hasFastTrace() {
            return false;
        }

        public int trace() {
            int fieldSize = getFieldSize();
            int numberOfLeadingZeros = 31 - org.bouncycastle.util.Integers.numberOfLeadingZeros(fieldSize);
            org.bouncycastle.math.ec.ECFieldElement eCFieldElement = this;
            int i = 1;
            while (numberOfLeadingZeros > 0) {
                eCFieldElement = eCFieldElement.squarePow(i).add(eCFieldElement);
                numberOfLeadingZeros--;
                i = fieldSize >>> numberOfLeadingZeros;
                if ((i & 1) != 0) {
                    eCFieldElement = eCFieldElement.square().add(this);
                }
            }
            if (eCFieldElement.isZero()) {
                return 0;
            }
            if (eCFieldElement.isOne()) {
                return 1;
            }
            throw new java.lang.IllegalStateException("Internal error in trace calculation");
        }

        public org.bouncycastle.math.ec.ECFieldElement halfTrace() {
            int fieldSize = getFieldSize();
            if ((fieldSize & 1) == 0) {
                throw new java.lang.IllegalStateException("Half-trace only defined for odd m");
            }
            int i = (fieldSize + 1) >>> 1;
            int numberOfLeadingZeros = 31 - org.bouncycastle.util.Integers.numberOfLeadingZeros(i);
            org.bouncycastle.math.ec.ECFieldElement eCFieldElement = this;
            int i2 = 1;
            while (numberOfLeadingZeros > 0) {
                eCFieldElement = eCFieldElement.squarePow(i2 << 1).add(eCFieldElement);
                numberOfLeadingZeros--;
                i2 = i >>> numberOfLeadingZeros;
                if ((i2 & 1) != 0) {
                    eCFieldElement = eCFieldElement.squarePow(2).add(this);
                }
            }
            return eCFieldElement;
        }
    }

    public boolean isZero() {
        return toBigInteger().signum() == 0;
    }

    public boolean isOne() {
        return bitLength() == 1;
    }

    public byte[] getEncoded() {
        return org.bouncycastle.util.BigIntegers.asUnsignedByteArray((getFieldSize() + 7) / 8, toBigInteger());
    }

    public int bitLength() {
        return toBigInteger().bitLength();
    }
}
