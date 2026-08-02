package org.bouncycastle.pqc.crypto.xmss;

/* loaded from: classes17.dex */
public class XMSSUtil {
    public static int calculateTau(int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            if (((i >> i3) & 1) == 0) {
                return i3;
            }
        }
        return 0;
    }

    public static int getLeafIndex(long j, int i) {
        return (int) (j & ((1 << i) - 1));
    }

    public static long getTreeIndex(long j, int i) {
        return j >> i;
    }

    public static int log2(int i) {
        int i2 = 0;
        while (true) {
            i >>= 1;
            if (i == 0) {
                return i2;
            }
            i2++;
        }
    }

    public static byte[] toBytesBigEndian(long j, int i) {
        byte[] bArr = new byte[i];
        while (true) {
            i--;
            if (i < 0) {
                return bArr;
            }
            bArr[i] = (byte) j;
            j >>>= 8;
        }
    }

    public static byte[] serialize(java.lang.Object obj) throws java.io.IOException {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        java.io.ObjectOutputStream objectOutputStream = new java.io.ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(obj);
        objectOutputStream.flush();
        return byteArrayOutputStream.toByteArray();
    }

    public static void longToBigEndian(long j, byte[] bArr, int i) {
        if (bArr == null) {
            throw new java.lang.NullPointerException("in == null");
        }
        if (bArr.length - i < 8) {
            throw new java.lang.IllegalArgumentException("not enough space in array");
        }
        bArr[i] = (byte) ((j >> 56) & 255);
        bArr[i + 1] = (byte) ((j >> 48) & 255);
        bArr[i + 2] = (byte) ((j >> 40) & 255);
        bArr[i + 3] = (byte) ((j >> 32) & 255);
        bArr[i + 4] = (byte) ((j >> 24) & 255);
        bArr[i + 5] = (byte) ((j >> 16) & 255);
        bArr[i + 6] = (byte) ((j >> 8) & 255);
        bArr[i + 7] = (byte) (j & 255);
    }

    public static boolean isNewBDSInitNeeded(long j, int i, int i2) {
        return j != 0 && j % ((long) java.lang.Math.pow((double) (1 << i), (double) (i2 + 1))) == 0;
    }

    public static boolean isNewAuthenticationPathNeeded(long j, int i, int i2) {
        return j != 0 && (j + 1) % ((long) java.lang.Math.pow((double) (1 << i), (double) i2)) == 0;
    }

    public static boolean isIndexValid(int i, long j) {
        if (j >= 0) {
            return j < (1 << i);
        }
        throw new java.lang.IllegalStateException("index must not be negative");
    }

    public static boolean hasNullPointer(byte[][] bArr) {
        if (bArr == null) {
            return true;
        }
        for (byte[] bArr2 : bArr) {
            if (bArr2 == null) {
                return true;
            }
        }
        return false;
    }

    public static int getDigestSize(org.bouncycastle.crypto.Digest digest) {
        if (digest == null) {
            throw new java.lang.NullPointerException("digest == null");
        }
        java.lang.String algorithmName = digest.getAlgorithmName();
        if (algorithmName.equals("SHAKE128")) {
            return 32;
        }
        if (algorithmName.equals("SHAKE256")) {
            return 64;
        }
        return digest.getDigestSize();
    }

    public static byte[] extractBytesAtOffset(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new java.lang.NullPointerException("src == null");
        }
        if (i < 0) {
            throw new java.lang.IllegalArgumentException("offset hast to be >= 0");
        }
        if (i2 < 0) {
            throw new java.lang.IllegalArgumentException("length hast to be >= 0");
        }
        if (i + i2 > bArr.length) {
            throw new java.lang.IllegalArgumentException("offset + length must not be greater then size of source array");
        }
        byte[] bArr2 = new byte[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            bArr2[i3] = bArr[i + i3];
        }
        return bArr2;
    }

    public static void dumpByteArray(byte[][] bArr) {
        if (hasNullPointer(bArr)) {
            throw new java.lang.NullPointerException("x has null pointers");
        }
        for (byte[] bArr2 : bArr) {
            java.lang.System.out.println(org.bouncycastle.util.encoders.Hex.toHexString(bArr2));
        }
    }

    public static java.lang.Object deserialize(byte[] bArr, java.lang.Class cls) throws java.io.IOException, java.lang.ClassNotFoundException {
        org.bouncycastle.pqc.crypto.xmss.XMSSUtil.CheckingStream checkingStream = new org.bouncycastle.pqc.crypto.xmss.XMSSUtil.CheckingStream(cls, new java.io.ByteArrayInputStream(bArr));
        java.lang.Object readObject = checkingStream.readObject();
        if (checkingStream.available() != 0) {
            throw new java.io.IOException("unexpected data found at end of ObjectInputStream");
        }
        if (cls.isInstance(readObject)) {
            return readObject;
        }
        throw new java.io.IOException("unexpected class found in ObjectInputStream");
    }

    public static void copyBytesAtOffset(byte[] bArr, byte[] bArr2, int i) {
        if (bArr == null) {
            throw new java.lang.NullPointerException("dst == null");
        }
        if (bArr2 == null) {
            throw new java.lang.NullPointerException("src == null");
        }
        if (i < 0) {
            throw new java.lang.IllegalArgumentException("offset hast to be >= 0");
        }
        if (bArr2.length + i > bArr.length) {
            throw new java.lang.IllegalArgumentException("src length + offset must not be greater than size of destination");
        }
        for (int i2 = 0; i2 < bArr2.length; i2++) {
            bArr[i + i2] = bArr2[i2];
        }
    }

    public static byte[][] cloneArray(byte[][] bArr) {
        if (hasNullPointer(bArr)) {
            throw new java.lang.NullPointerException("in has null pointers");
        }
        byte[][] bArr2 = new byte[bArr.length][];
        for (int i = 0; i < bArr.length; i++) {
            byte[] bArr3 = new byte[bArr[i].length];
            bArr2[i] = bArr3;
            byte[] bArr4 = bArr[i];
            java.lang.System.arraycopy(bArr4, 0, bArr3, 0, bArr4.length);
        }
        return bArr2;
    }

    public static byte[] cloneArray(byte[] bArr) {
        if (bArr == null) {
            throw new java.lang.NullPointerException("in == null");
        }
        byte[] bArr2 = new byte[bArr.length];
        java.lang.System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    static class CheckingStream extends java.io.ObjectInputStream {
        private static final java.util.Set getHighSpeedVideoSizes;
        private boolean Camera2StreamConfigurationMap;
        private final java.lang.Class getHighSpeedVideoFpsRanges;

        @Override // java.io.ObjectInputStream
        protected java.lang.Class<?> resolveClass(java.io.ObjectStreamClass objectStreamClass) throws java.io.IOException, java.lang.ClassNotFoundException {
            if (this.Camera2StreamConfigurationMap) {
                if (!getHighSpeedVideoSizes.contains(objectStreamClass.getName())) {
                    throw new java.io.InvalidClassException("unexpected class: ", objectStreamClass.getName());
                }
            } else {
                if (!objectStreamClass.getName().equals(this.getHighSpeedVideoFpsRanges.getName())) {
                    throw new java.io.InvalidClassException("unexpected class: ", objectStreamClass.getName());
                }
                this.Camera2StreamConfigurationMap = true;
            }
            return super.resolveClass(objectStreamClass);
        }

        CheckingStream(java.lang.Class cls, java.io.InputStream inputStream) throws java.io.IOException {
            super(inputStream);
            this.Camera2StreamConfigurationMap = false;
            this.getHighSpeedVideoFpsRanges = cls;
        }

        static {
            java.util.HashSet hashSet = new java.util.HashSet();
            getHighSpeedVideoSizes = hashSet;
            hashSet.add("java.util.TreeMap");
            hashSet.add("java.lang.Integer");
            hashSet.add("java.lang.Number");
            hashSet.add("org.bouncycastle.pqc.crypto.xmss.BDS");
            hashSet.add("java.util.ArrayList");
            hashSet.add("org.bouncycastle.pqc.crypto.xmss.XMSSNode");
            hashSet.add("[B");
            hashSet.add("java.util.LinkedList");
            hashSet.add("java.util.Stack");
            hashSet.add("java.util.Vector");
            hashSet.add("[Ljava.lang.Object;");
            hashSet.add("org.bouncycastle.pqc.crypto.xmss.BDSTreeHash");
        }
    }

    public static long bytesToXBigEndian(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new java.lang.NullPointerException("in == null");
        }
        long j = 0;
        for (int i3 = i; i3 < i + i2; i3++) {
            j = (j << 8) | (bArr[i3] & 255);
        }
        return j;
    }

    public static boolean areEqual(byte[][] bArr, byte[][] bArr2) {
        if (hasNullPointer(bArr) || hasNullPointer(bArr2)) {
            throw new java.lang.NullPointerException("a or b == null");
        }
        for (int i = 0; i < bArr.length; i++) {
            if (!org.bouncycastle.util.Arrays.areEqual(bArr[i], bArr2[i])) {
                return false;
            }
        }
        return true;
    }
}
