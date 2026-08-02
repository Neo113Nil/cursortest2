package org.bouncycastle.pqc.math.linearalgebra;

/* loaded from: classes17.dex */
public class PolynomialGF2mSmallM {
    public static final char RANDOM_IRREDUCIBLE_POLYNOMIAL = 'I';
    private int getHighSpeedVideoFpsRanges;
    private org.bouncycastle.pqc.math.linearalgebra.GF2mField getHighSpeedVideoFpsRangesFor;
    private int[] getHighSpeedVideoSizes;

    public PolynomialGF2mSmallM(org.bouncycastle.pqc.math.linearalgebra.GF2mField gF2mField, int i, char c, java.security.SecureRandom secureRandom) {
        this.getHighSpeedVideoFpsRangesFor = gF2mField;
        if (c != 'I') {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(" Error: type ");
            sb.append(c);
            sb.append(" is not defined for GF2smallmPolynomial");
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        int[] iArr = new int[i + 1];
        iArr[i] = 1;
        iArr[0] = gF2mField.getRandomNonZeroElement(secureRandom);
        for (int i2 = 1; i2 < i; i2++) {
            iArr[i2] = this.getHighSpeedVideoFpsRangesFor.getRandomElement(secureRandom);
        }
        while (true) {
            if (iArr[0] != 0) {
                int i3 = i;
                while (i3 >= 0 && iArr[i3] == 0) {
                    i3--;
                }
                int[] iArr2 = {0, 1};
                int[] iArr3 = {0, 1};
                int degree = this.getHighSpeedVideoFpsRangesFor.getDegree();
                for (int i4 = 0; i4 < (i3 >> 1); i4++) {
                    for (int i5 = degree - 1; i5 >= 0; i5--) {
                        iArr2 = Camera2StreamConfigurationMap(getInputFormats(iArr2, iArr2), iArr);
                    }
                    iArr2 = Camera2StreamConfigurationMap(iArr2);
                    int[] highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(getHighSpeedVideoSizes(iArr2, iArr3), iArr);
                    int length = highSpeedVideoFpsRangesFor.length - 1;
                    while (length >= 0 && highSpeedVideoFpsRangesFor[length] == 0) {
                        length--;
                    }
                    if (length == 0) {
                    }
                }
                this.getHighSpeedVideoSizes = iArr;
                Camera2StreamConfigurationMap();
                return;
            }
            int highSpeedVideoSizes = org.bouncycastle.pqc.math.linearalgebra.RandUtils.getHighSpeedVideoSizes(secureRandom, i);
            if (highSpeedVideoSizes == 0) {
                iArr[0] = this.getHighSpeedVideoFpsRangesFor.getRandomNonZeroElement(secureRandom);
            } else {
                iArr[highSpeedVideoSizes] = this.getHighSpeedVideoFpsRangesFor.getRandomElement(secureRandom);
            }
        }
    }

    private int[][] getHighSpeedVideoFpsRanges(int[] iArr, int[] iArr2) {
        int length = iArr2.length - 1;
        while (length >= 0 && iArr2[length] == 0) {
            length--;
        }
        int length2 = iArr.length - 1;
        while (length2 >= 0 && iArr[length2] == 0) {
            length2--;
        }
        if (length == -1) {
            throw new java.lang.ArithmeticException("Division by zero.");
        }
        int[][] iArr3 = {new int[1], new int[length2 + 1]};
        int length3 = iArr2.length - 1;
        while (length3 >= 0 && iArr2[length3] == 0) {
            length3--;
        }
        int inverse = this.getHighSpeedVideoFpsRangesFor.inverse(length3 == -1 ? 0 : iArr2[length3]);
        iArr3[0][0] = 0;
        int[] iArr4 = iArr3[1];
        java.lang.System.arraycopy(iArr, 0, iArr4, 0, iArr4.length);
        while (true) {
            int[] iArr5 = iArr3[1];
            int length4 = iArr5.length - 1;
            while (length4 >= 0 && iArr5[length4] == 0) {
                length4--;
            }
            if (length > length4) {
                return iArr3;
            }
            org.bouncycastle.pqc.math.linearalgebra.GF2mField gF2mField = this.getHighSpeedVideoFpsRangesFor;
            int[] iArr6 = iArr3[1];
            int length5 = iArr6.length - 1;
            while (length5 >= 0 && iArr6[length5] == 0) {
                length5--;
            }
            int[] iArr7 = {gF2mField.mult(length5 == -1 ? 0 : iArr6[length5], inverse)};
            int[] highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(iArr2, iArr7[0]);
            int[] iArr8 = iArr3[1];
            int length6 = iArr8.length - 1;
            while (length6 >= 0 && iArr8[length6] == 0) {
                length6--;
            }
            int i = length6 - length;
            int[] highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRanges, i);
            iArr3[0] = getHighSpeedVideoSizes(getHighSpeedVideoFpsRangesFor(iArr7, i), iArr3[0]);
            iArr3[1] = getHighSpeedVideoSizes(highSpeedVideoFpsRangesFor, iArr3[1]);
        }
    }

    private int[] getHighSpeedVideoFpsRangesFor(int[] iArr, int[] iArr2) {
        int length = iArr.length - 1;
        while (length >= 0 && iArr[length] == 0) {
            length--;
        }
        if (length == -1) {
            return iArr2;
        }
        while (true) {
            int length2 = iArr2.length - 1;
            while (length2 >= 0 && iArr2[length2] == 0) {
                length2--;
            }
            if (length2 == -1) {
                break;
            }
            int[] Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(iArr, iArr2);
            int length3 = iArr2.length;
            int[] iArr3 = new int[length3];
            java.lang.System.arraycopy(iArr2, 0, iArr3, 0, length3);
            int length4 = Camera2StreamConfigurationMap.length;
            int[] iArr4 = new int[length4];
            java.lang.System.arraycopy(Camera2StreamConfigurationMap, 0, iArr4, 0, length4);
            iArr2 = iArr4;
            iArr = iArr3;
        }
        org.bouncycastle.pqc.math.linearalgebra.GF2mField gF2mField = this.getHighSpeedVideoFpsRangesFor;
        int length5 = iArr.length - 1;
        while (length5 >= 0 && iArr[length5] == 0) {
            length5--;
        }
        return getHighSpeedVideoFpsRanges(iArr, gF2mField.inverse(length5 != -1 ? iArr[length5] : 0));
    }

    private static int getHighResolutionOutputSizeshNQ4ISI(int[] iArr) {
        int length = iArr.length - 1;
        while (length >= 0 && iArr[length] == 0) {
            length--;
        }
        if (length == -1) {
            return 0;
        }
        return iArr[length];
    }

    private static boolean getHighResolutionOutputSizeshNQ4ISI(int[] iArr, int[] iArr2) {
        int length = iArr.length - 1;
        while (length >= 0 && iArr[length] == 0) {
            length--;
        }
        int length2 = iArr2.length - 1;
        while (length2 >= 0 && iArr2[length2] == 0) {
            length2--;
        }
        if (length != length2) {
            return false;
        }
        for (int i = 0; i <= length; i++) {
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }

    private int[] Camera2StreamConfigurationMap(int[] iArr, int[] iArr2) {
        int length = iArr2.length - 1;
        while (length >= 0 && iArr2[length] == 0) {
            length--;
        }
        if (length == -1) {
            throw new java.lang.ArithmeticException("Division by zero");
        }
        int length2 = iArr.length;
        int[] iArr3 = new int[length2];
        int inverse = this.getHighSpeedVideoFpsRangesFor.inverse(getHighResolutionOutputSizeshNQ4ISI(iArr2));
        java.lang.System.arraycopy(iArr, 0, iArr3, 0, length2);
        while (true) {
            int length3 = iArr3.length - 1;
            while (length3 >= 0 && iArr3[length3] == 0) {
                length3--;
            }
            if (length > length3) {
                return iArr3;
            }
            int mult = this.getHighSpeedVideoFpsRangesFor.mult(getHighResolutionOutputSizeshNQ4ISI(iArr3), inverse);
            int length4 = iArr3.length - 1;
            while (length4 >= 0 && iArr3[length4] == 0) {
                length4--;
            }
            iArr3 = getHighSpeedVideoSizes(getHighSpeedVideoFpsRanges(getHighSpeedVideoFpsRangesFor(iArr2, length4 - length), mult), iArr3);
        }
    }

    private int[] getHighResolutionOutputSizeshNQ4ISI(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(iArr3);
        int[] Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(iArr2, iArr3);
        int[] iArr4 = {0};
        int[] Camera2StreamConfigurationMap3 = Camera2StreamConfigurationMap(iArr, iArr3);
        while (true) {
            int length = Camera2StreamConfigurationMap2.length - 1;
            while (length >= 0 && Camera2StreamConfigurationMap2[length] == 0) {
                length--;
            }
            if (length == -1) {
                return getHighSpeedVideoFpsRanges(iArr4, this.getHighSpeedVideoFpsRangesFor.inverse(getHighResolutionOutputSizeshNQ4ISI(Camera2StreamConfigurationMap)));
            }
            int[][] highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(Camera2StreamConfigurationMap, Camera2StreamConfigurationMap2);
            int[] Camera2StreamConfigurationMap4 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap2);
            int[] Camera2StreamConfigurationMap5 = Camera2StreamConfigurationMap(highSpeedVideoFpsRanges[1]);
            int[] highSpeedVideoSizes = getHighSpeedVideoSizes(iArr4, Camera2StreamConfigurationMap(getInputFormats(highSpeedVideoFpsRanges[0], Camera2StreamConfigurationMap3), iArr3));
            iArr4 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap3);
            Camera2StreamConfigurationMap3 = Camera2StreamConfigurationMap(highSpeedVideoSizes);
            Camera2StreamConfigurationMap = Camera2StreamConfigurationMap4;
            Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap5;
        }
    }

    private int[] getHighSpeedVideoFpsRanges(int[] iArr, int i) {
        int length = iArr.length - 1;
        while (length >= 0 && iArr[length] == 0) {
            length--;
        }
        if (length == -1 || i == 0) {
            return new int[1];
        }
        if (i == 1) {
            return org.bouncycastle.pqc.math.linearalgebra.IntUtils.clone(iArr);
        }
        int[] iArr2 = new int[length + 1];
        while (length >= 0) {
            iArr2[length] = this.getHighSpeedVideoFpsRangesFor.mult(iArr[length], i);
            length--;
        }
        return iArr2;
    }

    private static int[] getHighSpeedVideoFpsRangesFor(int[] iArr, int i) {
        int length = iArr.length - 1;
        while (length >= 0 && iArr[length] == 0) {
            length--;
        }
        if (length == -1) {
            return new int[1];
        }
        int[] iArr2 = new int[length + i + 1];
        java.lang.System.arraycopy(iArr, 0, iArr2, i, length + 1);
        return iArr2;
    }

    private int[] getInputFormats(int[] iArr, int[] iArr2) {
        int length = iArr.length - 1;
        while (length >= 0 && iArr[length] == 0) {
            length--;
        }
        int length2 = iArr2.length - 1;
        while (length2 >= 0 && iArr2[length2] == 0) {
            length2--;
        }
        if (length < length2) {
            iArr2 = iArr;
            iArr = iArr2;
        }
        int[] Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(iArr);
        int[] Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(iArr2);
        if (Camera2StreamConfigurationMap2.length == 1) {
            return getHighSpeedVideoFpsRanges(Camera2StreamConfigurationMap, Camera2StreamConfigurationMap2[0]);
        }
        int length3 = Camera2StreamConfigurationMap.length;
        int length4 = Camera2StreamConfigurationMap2.length;
        int[] iArr3 = new int[(length3 + length4) - 1];
        if (length4 != length3) {
            int[] iArr4 = new int[length4];
            int i = length3 - length4;
            int[] iArr5 = new int[i];
            java.lang.System.arraycopy(Camera2StreamConfigurationMap, 0, iArr4, 0, length4);
            java.lang.System.arraycopy(Camera2StreamConfigurationMap, length4, iArr5, 0, i);
            return getHighSpeedVideoSizes(getInputFormats(iArr4, Camera2StreamConfigurationMap2), getHighSpeedVideoFpsRangesFor(getInputFormats(iArr5, Camera2StreamConfigurationMap2), length4));
        }
        int i2 = (length3 + 1) >>> 1;
        int i3 = length3 - i2;
        int[] iArr6 = new int[i2];
        int[] iArr7 = new int[i2];
        int[] iArr8 = new int[i3];
        int[] iArr9 = new int[i3];
        java.lang.System.arraycopy(Camera2StreamConfigurationMap, 0, iArr6, 0, i2);
        java.lang.System.arraycopy(Camera2StreamConfigurationMap, i2, iArr8, 0, i3);
        java.lang.System.arraycopy(Camera2StreamConfigurationMap2, 0, iArr7, 0, i2);
        java.lang.System.arraycopy(Camera2StreamConfigurationMap2, i2, iArr9, 0, i3);
        int[] highSpeedVideoSizes = getHighSpeedVideoSizes(iArr6, iArr8);
        int[] highSpeedVideoSizes2 = getHighSpeedVideoSizes(iArr7, iArr9);
        int[] inputFormats = getInputFormats(iArr6, iArr7);
        int[] inputFormats2 = getInputFormats(highSpeedVideoSizes, highSpeedVideoSizes2);
        int[] inputFormats3 = getInputFormats(iArr8, iArr9);
        return getHighSpeedVideoSizes(getHighSpeedVideoFpsRangesFor(getHighSpeedVideoSizes(getHighSpeedVideoSizes(getHighSpeedVideoSizes(inputFormats2, inputFormats), inputFormats3), getHighSpeedVideoFpsRangesFor(inputFormats3, i2)), i2), inputFormats);
    }

    private static int[] Camera2StreamConfigurationMap(int[] iArr) {
        int length = iArr.length - 1;
        while (length >= 0 && iArr[length] == 0) {
            length--;
        }
        if (length == -1) {
            return new int[1];
        }
        int i = length + 1;
        if (iArr.length == i) {
            return org.bouncycastle.pqc.math.linearalgebra.IntUtils.clone(iArr);
        }
        int[] iArr2 = new int[i];
        java.lang.System.arraycopy(iArr, 0, iArr2, 0, i);
        return iArr2;
    }

    public org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM modMultiply(org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM polynomialGF2mSmallM, org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM polynomialGF2mSmallM2) {
        int[] iArr = this.getHighSpeedVideoSizes;
        int[] iArr2 = polynomialGF2mSmallM.getHighSpeedVideoSizes;
        return new org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM(this.getHighSpeedVideoFpsRangesFor, Camera2StreamConfigurationMap(getInputFormats(iArr, iArr2), polynomialGF2mSmallM2.getHighSpeedVideoSizes));
    }

    public org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM[] modPolynomialToFracton(org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM polynomialGF2mSmallM) {
        int i = polynomialGF2mSmallM.getHighSpeedVideoFpsRanges;
        int[] Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(polynomialGF2mSmallM.getHighSpeedVideoSizes);
        int[] Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(this.getHighSpeedVideoSizes, polynomialGF2mSmallM.getHighSpeedVideoSizes);
        int[] iArr = {0};
        int[] iArr2 = {1};
        while (true) {
            int length = Camera2StreamConfigurationMap2.length - 1;
            while (length >= 0 && Camera2StreamConfigurationMap2[length] == 0) {
                length--;
            }
            if (length <= (i >> 1)) {
                return new org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM[]{new org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM(this.getHighSpeedVideoFpsRangesFor, Camera2StreamConfigurationMap2), new org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM(this.getHighSpeedVideoFpsRangesFor, iArr2)};
            }
            int[][] highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(Camera2StreamConfigurationMap, Camera2StreamConfigurationMap2);
            int[] iArr3 = highSpeedVideoFpsRanges[1];
            int[] highSpeedVideoSizes = getHighSpeedVideoSizes(iArr, Camera2StreamConfigurationMap(getInputFormats(highSpeedVideoFpsRanges[0], iArr2), polynomialGF2mSmallM.getHighSpeedVideoSizes));
            iArr = iArr2;
            iArr2 = highSpeedVideoSizes;
            Camera2StreamConfigurationMap = Camera2StreamConfigurationMap2;
            Camera2StreamConfigurationMap2 = iArr3;
        }
    }

    public org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM modSquareRoot(org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM polynomialGF2mSmallM) {
        int[] clone = org.bouncycastle.pqc.math.linearalgebra.IntUtils.clone(this.getHighSpeedVideoSizes);
        int[] Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(getInputFormats(clone, clone), polynomialGF2mSmallM.getHighSpeedVideoSizes);
        while (!getHighResolutionOutputSizeshNQ4ISI(Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes)) {
            clone = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap);
            Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(getInputFormats(clone, clone), polynomialGF2mSmallM.getHighSpeedVideoSizes);
        }
        return new org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM(this.getHighSpeedVideoFpsRangesFor, clone);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(" Polynomial over ");
        sb.append(this.getHighSpeedVideoFpsRangesFor.toString());
        sb.append(": \n");
        java.lang.String obj = sb.toString();
        for (int i = 0; i < this.getHighSpeedVideoSizes.length; i++) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(obj);
            sb2.append(this.getHighSpeedVideoFpsRangesFor.elementToStr(this.getHighSpeedVideoSizes[i]));
            sb2.append("Y^");
            sb2.append(i);
            sb2.append("+");
            obj = sb2.toString();
        }
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
        sb3.append(obj);
        sb3.append(";");
        return sb3.toString();
    }

    public org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM multiply(org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM polynomialGF2mSmallM) {
        return new org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM(this.getHighSpeedVideoFpsRangesFor, getInputFormats(this.getHighSpeedVideoSizes, polynomialGF2mSmallM.getHighSpeedVideoSizes));
    }

    public org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM multWithMonomial(int i) {
        return new org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM(this.getHighSpeedVideoFpsRangesFor, getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoSizes, i));
    }

    public org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM multWithElement(int i) {
        if (!this.getHighSpeedVideoFpsRangesFor.isElementOfThisField(i)) {
            throw new java.lang.ArithmeticException("Not an element of the finite field this polynomial is defined over.");
        }
        return new org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM(this.getHighSpeedVideoFpsRangesFor, getHighSpeedVideoFpsRanges(this.getHighSpeedVideoSizes, i));
    }

    public void multThisWithElement(int i) {
        if (!this.getHighSpeedVideoFpsRangesFor.isElementOfThisField(i)) {
            throw new java.lang.ArithmeticException("Not an element of the finite field this polynomial is defined over.");
        }
        this.getHighSpeedVideoSizes = getHighSpeedVideoFpsRanges(this.getHighSpeedVideoSizes, i);
        Camera2StreamConfigurationMap();
    }

    public org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM modSquareRootMatrix(org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM[] polynomialGF2mSmallMArr) {
        int length = polynomialGF2mSmallMArr.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            for (int i2 = 0; i2 < length; i2++) {
                int[] iArr2 = polynomialGF2mSmallMArr[i2].getHighSpeedVideoSizes;
                if (i < iArr2.length) {
                    int[] iArr3 = this.getHighSpeedVideoSizes;
                    if (i2 < iArr3.length) {
                        iArr[i] = this.getHighSpeedVideoFpsRangesFor.add(iArr[i], this.getHighSpeedVideoFpsRangesFor.mult(iArr2[i], iArr3[i2]));
                    }
                }
            }
        }
        for (int i3 = 0; i3 < length; i3++) {
            iArr[i3] = this.getHighSpeedVideoFpsRangesFor.sqRoot(iArr[i3]);
        }
        return new org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM(this.getHighSpeedVideoFpsRangesFor, iArr);
    }

    public org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM modSquareMatrix(org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM[] polynomialGF2mSmallMArr) {
        int length = polynomialGF2mSmallMArr.length;
        int[] iArr = new int[length];
        int[] iArr2 = new int[length];
        int i = 0;
        while (true) {
            int[] iArr3 = this.getHighSpeedVideoSizes;
            if (i >= iArr3.length) {
                break;
            }
            org.bouncycastle.pqc.math.linearalgebra.GF2mField gF2mField = this.getHighSpeedVideoFpsRangesFor;
            int i2 = iArr3[i];
            iArr2[i] = gF2mField.mult(i2, i2);
            i++;
        }
        for (int i3 = 0; i3 < length; i3++) {
            for (int i4 = 0; i4 < length; i4++) {
                int[] iArr4 = polynomialGF2mSmallMArr[i4].getHighSpeedVideoSizes;
                if (i3 < iArr4.length) {
                    iArr[i3] = this.getHighSpeedVideoFpsRangesFor.add(iArr[i3], this.getHighSpeedVideoFpsRangesFor.mult(iArr4[i3], iArr2[i4]));
                }
            }
        }
        return new org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM(this.getHighSpeedVideoFpsRangesFor, iArr);
    }

    public org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM modInverse(org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM polynomialGF2mSmallM) {
        return new org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM(this.getHighSpeedVideoFpsRangesFor, getHighResolutionOutputSizeshNQ4ISI(new int[]{1}, this.getHighSpeedVideoSizes, polynomialGF2mSmallM.getHighSpeedVideoSizes));
    }

    public org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM modDiv(org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM polynomialGF2mSmallM, org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM polynomialGF2mSmallM2) {
        return new org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM(this.getHighSpeedVideoFpsRangesFor, getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoSizes, polynomialGF2mSmallM.getHighSpeedVideoSizes, polynomialGF2mSmallM2.getHighSpeedVideoSizes));
    }

    public org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM mod(org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM polynomialGF2mSmallM) {
        return new org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM(this.getHighSpeedVideoFpsRangesFor, Camera2StreamConfigurationMap(this.getHighSpeedVideoSizes, polynomialGF2mSmallM.getHighSpeedVideoSizes));
    }

    public int hashCode() {
        int hashCode = this.getHighSpeedVideoFpsRangesFor.hashCode();
        int i = 0;
        while (true) {
            int[] iArr = this.getHighSpeedVideoSizes;
            if (i >= iArr.length) {
                return hashCode;
            }
            hashCode = (hashCode * 31) + iArr[i];
            i++;
        }
    }

    public int getHeadCoefficient() {
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == -1) {
            return 0;
        }
        return this.getHighSpeedVideoSizes[i];
    }

    public byte[] getEncoded() {
        int i = 8;
        int i2 = 1;
        while (this.getHighSpeedVideoFpsRangesFor.getDegree() > i) {
            i2++;
            i += 8;
        }
        byte[] bArr = new byte[this.getHighSpeedVideoSizes.length * i2];
        int i3 = 0;
        for (int i4 = 0; i4 < this.getHighSpeedVideoSizes.length; i4++) {
            int i5 = 0;
            while (i5 < i) {
                bArr[i3] = (byte) (this.getHighSpeedVideoSizes[i4] >>> i5);
                i5 += 8;
                i3++;
            }
        }
        return bArr;
    }

    public int getDegree() {
        int[] iArr = this.getHighSpeedVideoSizes;
        int length = iArr.length - 1;
        if (iArr[length] == 0) {
            return -1;
        }
        return length;
    }

    public int getCoefficient(int i) {
        if (i < 0 || i > this.getHighSpeedVideoFpsRanges) {
            return 0;
        }
        return this.getHighSpeedVideoSizes[i];
    }

    public org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM gcd(org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM polynomialGF2mSmallM) {
        return new org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM(this.getHighSpeedVideoFpsRangesFor, getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoSizes, polynomialGF2mSmallM.getHighSpeedVideoSizes));
    }

    public int evaluateAt(int i) {
        int[] iArr = this.getHighSpeedVideoSizes;
        int i2 = this.getHighSpeedVideoFpsRanges;
        int i3 = iArr[i2];
        while (true) {
            i2--;
            if (i2 < 0) {
                return i3;
            }
            i3 = this.getHighSpeedVideoFpsRangesFor.mult(i3, i) ^ this.getHighSpeedVideoSizes[i2];
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == null || !(obj instanceof org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM)) {
            return false;
        }
        org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM polynomialGF2mSmallM = (org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM) obj;
        return this.getHighSpeedVideoFpsRangesFor.equals(polynomialGF2mSmallM.getHighSpeedVideoFpsRangesFor) && this.getHighSpeedVideoFpsRanges == polynomialGF2mSmallM.getHighSpeedVideoFpsRanges && getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoSizes, polynomialGF2mSmallM.getHighSpeedVideoSizes);
    }

    public org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM[] div(org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM polynomialGF2mSmallM) {
        int[][] highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(this.getHighSpeedVideoSizes, polynomialGF2mSmallM.getHighSpeedVideoSizes);
        return new org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM[]{new org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM(this.getHighSpeedVideoFpsRangesFor, highSpeedVideoFpsRanges[0]), new org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM(this.getHighSpeedVideoFpsRangesFor, highSpeedVideoFpsRanges[1])};
    }

    public void addToThis(org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM polynomialGF2mSmallM) {
        this.getHighSpeedVideoSizes = getHighSpeedVideoSizes(this.getHighSpeedVideoSizes, polynomialGF2mSmallM.getHighSpeedVideoSizes);
        Camera2StreamConfigurationMap();
    }

    public org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM addMonomial(int i) {
        int[] iArr = new int[i + 1];
        iArr[i] = 1;
        return new org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM(this.getHighSpeedVideoFpsRangesFor, getHighSpeedVideoSizes(this.getHighSpeedVideoSizes, iArr));
    }

    public org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM add(org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM polynomialGF2mSmallM) {
        return new org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM(this.getHighSpeedVideoFpsRangesFor, getHighSpeedVideoSizes(this.getHighSpeedVideoSizes, polynomialGF2mSmallM.getHighSpeedVideoSizes));
    }

    private void Camera2StreamConfigurationMap() {
        int length = this.getHighSpeedVideoSizes.length;
        do {
            length--;
            this.getHighSpeedVideoFpsRanges = length;
            if (length < 0) {
                return;
            }
        } while (this.getHighSpeedVideoSizes[length] == 0);
    }

    private int[] getHighSpeedVideoSizes(int[] iArr, int[] iArr2) {
        int[] iArr3;
        if (iArr.length < iArr2.length) {
            iArr3 = new int[iArr2.length];
            java.lang.System.arraycopy(iArr2, 0, iArr3, 0, iArr2.length);
        } else {
            iArr3 = new int[iArr.length];
            java.lang.System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            iArr = iArr2;
        }
        for (int length = iArr.length - 1; length >= 0; length--) {
            iArr3[length] = this.getHighSpeedVideoFpsRangesFor.add(iArr3[length], iArr[length]);
        }
        return iArr3;
    }

    public PolynomialGF2mSmallM(org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM polynomialGF2mSmallM) {
        this.getHighSpeedVideoFpsRangesFor = polynomialGF2mSmallM.getHighSpeedVideoFpsRangesFor;
        this.getHighSpeedVideoFpsRanges = polynomialGF2mSmallM.getHighSpeedVideoFpsRanges;
        this.getHighSpeedVideoSizes = org.bouncycastle.pqc.math.linearalgebra.IntUtils.clone(polynomialGF2mSmallM.getHighSpeedVideoSizes);
    }

    public PolynomialGF2mSmallM(org.bouncycastle.pqc.math.linearalgebra.GF2mVector gF2mVector) {
        this(gF2mVector.getField(), gF2mVector.getIntArrayForm());
    }

    public PolynomialGF2mSmallM(org.bouncycastle.pqc.math.linearalgebra.GF2mField gF2mField, int[] iArr) {
        this.getHighSpeedVideoFpsRangesFor = gF2mField;
        this.getHighSpeedVideoSizes = Camera2StreamConfigurationMap(iArr);
        Camera2StreamConfigurationMap();
    }

    public PolynomialGF2mSmallM(org.bouncycastle.pqc.math.linearalgebra.GF2mField gF2mField, byte[] bArr) {
        this.getHighSpeedVideoFpsRangesFor = gF2mField;
        int i = 8;
        int i2 = 1;
        while (gF2mField.getDegree() > i) {
            i2++;
            i += 8;
        }
        if (bArr.length % i2 != 0) {
            throw new java.lang.IllegalArgumentException(" Error: byte array is not encoded polynomial over given finite field GF2m");
        }
        this.getHighSpeedVideoSizes = new int[bArr.length / i2];
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int[] iArr = this.getHighSpeedVideoSizes;
            if (i3 >= iArr.length) {
                if (iArr.length != 1 && iArr[iArr.length - 1] == 0) {
                    throw new java.lang.IllegalArgumentException(" Error: byte array is not encoded polynomial over given finite field GF2m");
                }
                Camera2StreamConfigurationMap();
                return;
            }
            int i5 = 0;
            while (i5 < i) {
                int[] iArr2 = this.getHighSpeedVideoSizes;
                iArr2[i3] = iArr2[i3] ^ ((bArr[i4] & 255) << i5);
                i5 += 8;
                i4++;
            }
            if (!this.getHighSpeedVideoFpsRangesFor.isElementOfThisField(this.getHighSpeedVideoSizes[i3])) {
                throw new java.lang.IllegalArgumentException(" Error: byte array is not encoded polynomial over given finite field GF2m");
            }
            i3++;
        }
    }

    public PolynomialGF2mSmallM(org.bouncycastle.pqc.math.linearalgebra.GF2mField gF2mField, int i) {
        this.getHighSpeedVideoFpsRangesFor = gF2mField;
        this.getHighSpeedVideoFpsRanges = i;
        int[] iArr = new int[i + 1];
        this.getHighSpeedVideoSizes = iArr;
        iArr[i] = 1;
    }

    public PolynomialGF2mSmallM(org.bouncycastle.pqc.math.linearalgebra.GF2mField gF2mField) {
        this.getHighSpeedVideoFpsRangesFor = gF2mField;
        this.getHighSpeedVideoFpsRanges = -1;
        this.getHighSpeedVideoSizes = new int[1];
    }
}
