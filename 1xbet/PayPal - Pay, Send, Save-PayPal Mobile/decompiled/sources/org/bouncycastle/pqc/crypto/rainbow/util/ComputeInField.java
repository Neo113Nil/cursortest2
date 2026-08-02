package org.bouncycastle.pqc.crypto.rainbow.util;

/* loaded from: classes17.dex */
public class ComputeInField {
    short[] getHighResolutionOutputSizeshNQ4ISI;
    private short[][] getHighSpeedVideoSizes;

    public short[][] inverse(short[][] sArr) {
        short[][] sArr2;
        try {
            this.getHighSpeedVideoSizes = (short[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Short.TYPE, sArr.length, sArr.length * 2);
            int i = 0;
            if (sArr.length != sArr[0].length) {
                throw new java.lang.RuntimeException("The matrix is not invertible. Please choose another one!");
            }
            for (int i2 = 0; i2 < sArr.length; i2++) {
                for (int i3 = 0; i3 < sArr.length; i3++) {
                    this.getHighSpeedVideoSizes[i2][i3] = sArr[i2][i3];
                }
                for (int length = sArr.length; length < sArr.length * 2; length++) {
                    this.getHighSpeedVideoSizes[i2][length] = 0;
                }
                short[][] sArr3 = this.getHighSpeedVideoSizes;
                sArr3[i2][sArr3.length + i2] = 1;
            }
            getHighResolutionOutputSizeshNQ4ISI(true);
            int i4 = 0;
            while (true) {
                sArr2 = this.getHighSpeedVideoSizes;
                if (i4 >= sArr2.length) {
                    break;
                }
                short invElem = org.bouncycastle.pqc.crypto.rainbow.util.GF2Field.invElem(sArr2[i4][i4]);
                int i5 = i4;
                while (true) {
                    short[][] sArr4 = this.getHighSpeedVideoSizes;
                    if (i5 < sArr4.length * 2) {
                        short[] sArr5 = sArr4[i4];
                        sArr5[i5] = org.bouncycastle.pqc.crypto.rainbow.util.GF2Field.multElem(sArr5[i5], invElem);
                        i5++;
                    }
                }
                i4++;
            }
            for (int length2 = sArr2.length - 1; length2 > 0; length2--) {
                for (int i6 = length2 - 1; i6 >= 0; i6--) {
                    short[][] sArr6 = this.getHighSpeedVideoSizes;
                    short s = sArr6[i6][length2];
                    short invElem2 = org.bouncycastle.pqc.crypto.rainbow.util.GF2Field.invElem(sArr6[length2][length2]);
                    if (invElem2 == 0) {
                        throw new java.lang.RuntimeException("The matrix is not invertible");
                    }
                    int i7 = length2;
                    while (true) {
                        short[][] sArr7 = this.getHighSpeedVideoSizes;
                        if (i7 < sArr7.length * 2) {
                            short multElem = org.bouncycastle.pqc.crypto.rainbow.util.GF2Field.multElem(s, org.bouncycastle.pqc.crypto.rainbow.util.GF2Field.multElem(sArr7[length2][i7], invElem2));
                            short[] sArr8 = this.getHighSpeedVideoSizes[i6];
                            sArr8[i7] = org.bouncycastle.pqc.crypto.rainbow.util.GF2Field.addElem(sArr8[i7], multElem);
                            i7++;
                        }
                    }
                }
            }
            short[][] sArr9 = this.getHighSpeedVideoSizes;
            short[][] sArr10 = (short[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Short.TYPE, sArr9.length, sArr9.length);
            while (true) {
                short[][] sArr11 = this.getHighSpeedVideoSizes;
                if (i >= sArr11.length) {
                    return sArr10;
                }
                int length3 = sArr11.length;
                while (true) {
                    short[][] sArr12 = this.getHighSpeedVideoSizes;
                    if (length3 < sArr12.length * 2) {
                        sArr10[i][length3 - sArr12.length] = sArr12[i][length3];
                        length3++;
                    }
                }
                i++;
            }
        } catch (java.lang.RuntimeException unused) {
            return null;
        }
    }

    public short[] solveEquation(short[][] sArr, short[] sArr2) {
        if (sArr.length != sArr2.length) {
            return null;
        }
        try {
            this.getHighSpeedVideoSizes = (short[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Short.TYPE, sArr.length, sArr.length + 1);
            this.getHighResolutionOutputSizeshNQ4ISI = new short[sArr.length];
            for (int i = 0; i < sArr.length; i++) {
                for (int i2 = 0; i2 < sArr[0].length; i2++) {
                    this.getHighSpeedVideoSizes[i][i2] = sArr[i][i2];
                }
            }
            for (int i3 = 0; i3 < sArr2.length; i3++) {
                short[] sArr3 = this.getHighSpeedVideoSizes[i3];
                sArr3[sArr2.length] = org.bouncycastle.pqc.crypto.rainbow.util.GF2Field.addElem(sArr2[i3], sArr3[sArr2.length]);
            }
            getHighResolutionOutputSizeshNQ4ISI(false);
            short invElem = org.bouncycastle.pqc.crypto.rainbow.util.GF2Field.invElem(this.getHighSpeedVideoSizes[r7.length - 1][r7.length - 1]);
            if (invElem == 0) {
                throw new java.lang.IllegalStateException("The equation system is not solvable");
            }
            short[] sArr4 = this.getHighResolutionOutputSizeshNQ4ISI;
            short[][] sArr5 = this.getHighSpeedVideoSizes;
            sArr4[sArr5.length - 1] = org.bouncycastle.pqc.crypto.rainbow.util.GF2Field.multElem(sArr5[sArr5.length - 1][sArr5.length], invElem);
            for (int length = this.getHighSpeedVideoSizes.length - 2; length >= 0; length--) {
                short[][] sArr6 = this.getHighSpeedVideoSizes;
                short s = sArr6[length][sArr6.length];
                for (int length2 = sArr6.length - 1; length2 > length; length2--) {
                    s = org.bouncycastle.pqc.crypto.rainbow.util.GF2Field.addElem(s, org.bouncycastle.pqc.crypto.rainbow.util.GF2Field.multElem(this.getHighSpeedVideoSizes[length][length2], this.getHighResolutionOutputSizeshNQ4ISI[length2]));
                }
                short invElem2 = org.bouncycastle.pqc.crypto.rainbow.util.GF2Field.invElem(this.getHighSpeedVideoSizes[length][length]);
                if (invElem2 == 0) {
                    throw new java.lang.IllegalStateException("Not solvable equation system");
                }
                this.getHighResolutionOutputSizeshNQ4ISI[length] = org.bouncycastle.pqc.crypto.rainbow.util.GF2Field.multElem(s, invElem2);
            }
            return this.getHighResolutionOutputSizeshNQ4ISI;
        } catch (java.lang.RuntimeException unused) {
            return null;
        }
    }

    public short[][] multiplyMatrix(short[][] sArr, short[][] sArr2) throws java.lang.RuntimeException {
        if (sArr[0].length != sArr2.length) {
            throw new java.lang.RuntimeException("Multiplication is not possible!");
        }
        this.getHighSpeedVideoSizes = (short[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Short.TYPE, sArr.length, sArr2[0].length);
        for (int i = 0; i < sArr.length; i++) {
            for (int i2 = 0; i2 < sArr2.length; i2++) {
                for (int i3 = 0; i3 < sArr2[0].length; i3++) {
                    short multElem = org.bouncycastle.pqc.crypto.rainbow.util.GF2Field.multElem(sArr[i][i2], sArr2[i2][i3]);
                    short[] sArr3 = this.getHighSpeedVideoSizes[i];
                    sArr3[i3] = org.bouncycastle.pqc.crypto.rainbow.util.GF2Field.addElem(sArr3[i3], multElem);
                }
            }
        }
        return this.getHighSpeedVideoSizes;
    }

    public short[] multiplyMatrix(short[][] sArr, short[] sArr2) throws java.lang.RuntimeException {
        if (sArr[0].length != sArr2.length) {
            throw new java.lang.RuntimeException("Multiplication is not possible!");
        }
        short[] sArr3 = new short[sArr.length];
        for (int i = 0; i < sArr.length; i++) {
            for (int i2 = 0; i2 < sArr2.length; i2++) {
                sArr3[i] = org.bouncycastle.pqc.crypto.rainbow.util.GF2Field.addElem(sArr3[i], org.bouncycastle.pqc.crypto.rainbow.util.GF2Field.multElem(sArr[i][i2], sArr2[i2]));
            }
        }
        return sArr3;
    }

    public short[][] multVects(short[] sArr, short[] sArr2) {
        if (sArr.length != sArr2.length) {
            throw new java.lang.RuntimeException("Multiplication is not possible!");
        }
        short[][] sArr3 = (short[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Short.TYPE, sArr.length, sArr2.length);
        for (int i = 0; i < sArr.length; i++) {
            for (int i2 = 0; i2 < sArr2.length; i2++) {
                sArr3[i][i2] = org.bouncycastle.pqc.crypto.rainbow.util.GF2Field.multElem(sArr[i], sArr2[i2]);
            }
        }
        return sArr3;
    }

    public short[] multVect(short s, short[] sArr) {
        int length = sArr.length;
        short[] sArr2 = new short[length];
        for (int i = 0; i < length; i++) {
            sArr2[i] = org.bouncycastle.pqc.crypto.rainbow.util.GF2Field.multElem(s, sArr[i]);
        }
        return sArr2;
    }

    public short[][] multMatrix(short s, short[][] sArr) {
        short[][] sArr2 = (short[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Short.TYPE, sArr.length, sArr[0].length);
        for (int i = 0; i < sArr.length; i++) {
            for (int i2 = 0; i2 < sArr[0].length; i2++) {
                sArr2[i][i2] = org.bouncycastle.pqc.crypto.rainbow.util.GF2Field.multElem(s, sArr[i][i2]);
            }
        }
        return sArr2;
    }

    public short[] addVect(short[] sArr, short[] sArr2) {
        if (sArr.length != sArr2.length) {
            throw new java.lang.RuntimeException("Multiplication is not possible!");
        }
        int length = sArr.length;
        short[] sArr3 = new short[length];
        for (int i = 0; i < length; i++) {
            sArr3[i] = org.bouncycastle.pqc.crypto.rainbow.util.GF2Field.addElem(sArr[i], sArr2[i]);
        }
        return sArr3;
    }

    public short[][] addSquareMatrix(short[][] sArr, short[][] sArr2) {
        if (sArr.length != sArr2.length || sArr[0].length != sArr2[0].length) {
            throw new java.lang.RuntimeException("Addition is not possible!");
        }
        short[][] sArr3 = (short[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Short.TYPE, sArr.length, sArr.length);
        for (int i = 0; i < sArr.length; i++) {
            for (int i2 = 0; i2 < sArr2.length; i2++) {
                sArr3[i][i2] = org.bouncycastle.pqc.crypto.rainbow.util.GF2Field.addElem(sArr[i][i2], sArr2[i][i2]);
            }
        }
        return sArr3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
    
        r0 = r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void getHighResolutionOutputSizeshNQ4ISI(boolean z) throws java.lang.RuntimeException {
        int length = z ? this.getHighSpeedVideoSizes.length * 2 : this.getHighSpeedVideoSizes.length + 1;
        int i = 0;
        while (i < this.getHighSpeedVideoSizes.length - 1) {
            int i2 = i + 1;
            int i3 = i2;
            while (true) {
                short[][] sArr = this.getHighSpeedVideoSizes;
                if (i3 < sArr.length) {
                    short s = sArr[i3][i];
                    short invElem = org.bouncycastle.pqc.crypto.rainbow.util.GF2Field.invElem(sArr[i][i]);
                    if (invElem == 0) {
                        throw new java.lang.IllegalStateException("Matrix not invertible! We have to choose another one!");
                    }
                    for (int i4 = i; i4 < length; i4++) {
                        short multElem = org.bouncycastle.pqc.crypto.rainbow.util.GF2Field.multElem(s, org.bouncycastle.pqc.crypto.rainbow.util.GF2Field.multElem(this.getHighSpeedVideoSizes[i][i4], invElem));
                        short[] sArr2 = this.getHighSpeedVideoSizes[i3];
                        sArr2[i4] = org.bouncycastle.pqc.crypto.rainbow.util.GF2Field.addElem(sArr2[i4], multElem);
                    }
                    i3++;
                }
            }
        }
    }
}
