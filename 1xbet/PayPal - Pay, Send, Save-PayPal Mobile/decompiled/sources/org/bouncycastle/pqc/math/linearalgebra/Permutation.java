package org.bouncycastle.pqc.math.linearalgebra;

/* loaded from: classes17.dex */
public class Permutation {
    private int[] Camera2StreamConfigurationMap;

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("[");
        sb.append(this.Camera2StreamConfigurationMap[0]);
        java.lang.String obj = sb.toString();
        for (int i = 1; i < this.Camera2StreamConfigurationMap.length; i++) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(obj);
            sb2.append(", ");
            sb2.append(this.Camera2StreamConfigurationMap[i]);
            obj = sb2.toString();
        }
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
        sb3.append(obj);
        sb3.append("]");
        return sb3.toString();
    }

    public org.bouncycastle.pqc.math.linearalgebra.Permutation rightMultiply(org.bouncycastle.pqc.math.linearalgebra.Permutation permutation) {
        int length = permutation.Camera2StreamConfigurationMap.length;
        int[] iArr = this.Camera2StreamConfigurationMap;
        if (length != iArr.length) {
            throw new java.lang.IllegalArgumentException("length mismatch");
        }
        org.bouncycastle.pqc.math.linearalgebra.Permutation permutation2 = new org.bouncycastle.pqc.math.linearalgebra.Permutation(iArr.length);
        for (int length2 = this.Camera2StreamConfigurationMap.length - 1; length2 >= 0; length2--) {
            permutation2.Camera2StreamConfigurationMap[length2] = this.Camera2StreamConfigurationMap[permutation.Camera2StreamConfigurationMap[length2]];
        }
        return permutation2;
    }

    public int hashCode() {
        return org.bouncycastle.util.Arrays.hashCode(this.Camera2StreamConfigurationMap);
    }

    public int[] getVector() {
        return org.bouncycastle.pqc.math.linearalgebra.IntUtils.clone(this.Camera2StreamConfigurationMap);
    }

    public byte[] getEncoded() {
        int length = this.Camera2StreamConfigurationMap.length;
        int ceilLog256 = org.bouncycastle.pqc.math.linearalgebra.IntegerFunctions.ceilLog256(length - 1);
        byte[] bArr = new byte[(length * ceilLog256) + 4];
        org.bouncycastle.pqc.math.linearalgebra.LittleEndianConversions.I2OSP(length, bArr, 0);
        for (int i = 0; i < length; i++) {
            org.bouncycastle.pqc.math.linearalgebra.LittleEndianConversions.I2OSP(this.Camera2StreamConfigurationMap[i], bArr, (i * ceilLog256) + 4, ceilLog256);
        }
        return bArr;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.pqc.math.linearalgebra.Permutation) {
            return org.bouncycastle.pqc.math.linearalgebra.IntUtils.equals(this.Camera2StreamConfigurationMap, ((org.bouncycastle.pqc.math.linearalgebra.Permutation) obj).Camera2StreamConfigurationMap);
        }
        return false;
    }

    public org.bouncycastle.pqc.math.linearalgebra.Permutation computeInverse() {
        org.bouncycastle.pqc.math.linearalgebra.Permutation permutation = new org.bouncycastle.pqc.math.linearalgebra.Permutation(this.Camera2StreamConfigurationMap.length);
        for (int length = this.Camera2StreamConfigurationMap.length - 1; length >= 0; length--) {
            permutation.Camera2StreamConfigurationMap[this.Camera2StreamConfigurationMap[length]] = length;
        }
        return permutation;
    }

    private static boolean getHighSpeedVideoSizes(int[] iArr) {
        int length = iArr.length;
        boolean[] zArr = new boolean[length];
        for (int i : iArr) {
            if (i < 0 || i >= length || zArr[i]) {
                return false;
            }
            zArr[i] = true;
        }
        return true;
    }

    public Permutation(int[] iArr) {
        if (!getHighSpeedVideoSizes(iArr)) {
            throw new java.lang.IllegalArgumentException("array is not a permutation vector");
        }
        this.Camera2StreamConfigurationMap = org.bouncycastle.pqc.math.linearalgebra.IntUtils.clone(iArr);
    }

    public Permutation(byte[] bArr) {
        if (bArr.length <= 4) {
            throw new java.lang.IllegalArgumentException("invalid encoding");
        }
        int OS2IP = org.bouncycastle.pqc.math.linearalgebra.LittleEndianConversions.OS2IP(bArr, 0);
        int ceilLog256 = org.bouncycastle.pqc.math.linearalgebra.IntegerFunctions.ceilLog256(OS2IP - 1);
        if (bArr.length != (OS2IP * ceilLog256) + 4) {
            throw new java.lang.IllegalArgumentException("invalid encoding");
        }
        this.Camera2StreamConfigurationMap = new int[OS2IP];
        for (int i = 0; i < OS2IP; i++) {
            this.Camera2StreamConfigurationMap[i] = org.bouncycastle.pqc.math.linearalgebra.LittleEndianConversions.OS2IP(bArr, (i * ceilLog256) + 4, ceilLog256);
        }
        if (!getHighSpeedVideoSizes(this.Camera2StreamConfigurationMap)) {
            throw new java.lang.IllegalArgumentException("invalid encoding");
        }
    }

    public Permutation(int i, java.security.SecureRandom secureRandom) {
        if (i <= 0) {
            throw new java.lang.IllegalArgumentException("invalid length");
        }
        this.Camera2StreamConfigurationMap = new int[i];
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = i2;
        }
        int i3 = i;
        for (int i4 = 0; i4 < i; i4++) {
            int highSpeedVideoSizes = org.bouncycastle.pqc.math.linearalgebra.RandUtils.getHighSpeedVideoSizes(secureRandom, i3);
            i3--;
            this.Camera2StreamConfigurationMap[i4] = iArr[highSpeedVideoSizes];
            iArr[highSpeedVideoSizes] = iArr[i3];
        }
    }

    public Permutation(int i) {
        if (i <= 0) {
            throw new java.lang.IllegalArgumentException("invalid length");
        }
        this.Camera2StreamConfigurationMap = new int[i];
        while (true) {
            i--;
            if (i < 0) {
                return;
            } else {
                this.Camera2StreamConfigurationMap[i] = i;
            }
        }
    }
}
