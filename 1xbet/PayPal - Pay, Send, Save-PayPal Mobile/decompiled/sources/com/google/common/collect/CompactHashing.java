package com.google.common.collect;

/* loaded from: classes9.dex */
final class CompactHashing {
    private static final int BYTE_MASK = 255;
    private static final int BYTE_MAX_SIZE = 256;
    static final int DEFAULT_SIZE = 3;
    static final int HASH_TABLE_BITS_MASK = 31;
    private static final int HASH_TABLE_BITS_MAX_BITS = 5;
    static final int MAX_SIZE = 1073741823;
    private static final int MIN_HASH_TABLE_SIZE = 4;
    static final int MODIFICATION_COUNT_INCREMENT = 32;
    private static final int SHORT_MASK = 65535;
    private static final int SHORT_MAX_SIZE = 65536;
    static final byte UNSET = 0;

    static int getHashPrefix(int i, int i2) {
        return i & (~i2);
    }

    static int getNext(int i, int i2) {
        return i & i2;
    }

    static int maskCombine(int i, int i2, int i3) {
        return (i & (~i3)) | (i2 & i3);
    }

    static int newCapacity(int i) {
        return (i < 32 ? 4 : 2) * (i + 1);
    }

    private CompactHashing() {
    }

    static int tableSize(int i) {
        return java.lang.Math.max(4, com.google.common.collect.Hashing.closedTableSize(i + 1, 1.0d));
    }

    static java.lang.Object createTable(int i) {
        if (i < 2 || i > 1073741824 || java.lang.Integer.highestOneBit(i) != i) {
            throw new java.lang.IllegalArgumentException("must be power of 2 between 2^1 and 2^30: ".concat(java.lang.String.valueOf(i)));
        }
        if (i <= 256) {
            return new byte[i];
        }
        if (i <= 65536) {
            return new short[i];
        }
        return new int[i];
    }

    static void tableClear(java.lang.Object obj) {
        if (obj instanceof byte[]) {
            java.util.Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            java.util.Arrays.fill((short[]) obj, (short) 0);
        } else {
            java.util.Arrays.fill((int[]) obj, 0);
        }
    }

    static int tableGet(java.lang.Object obj, int i) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i] & 255;
        }
        if (obj instanceof short[]) {
            return ((short[]) obj)[i] & kotlin.UShort.MAX_VALUE;
        }
        return ((int[]) obj)[i];
    }

    static void tableSet(java.lang.Object obj, int i, int i2) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i2;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i2;
        } else {
            ((int[]) obj)[i] = i2;
        }
    }

    static int remove(java.lang.Object obj, java.lang.Object obj2, int i, java.lang.Object obj3, int[] iArr, java.lang.Object[] objArr, java.lang.Object[] objArr2) {
        int i2;
        int i3;
        int smearedHash = com.google.common.collect.Hashing.smearedHash(obj);
        int i4 = smearedHash & i;
        int tableGet = tableGet(obj3, i4);
        if (tableGet == 0) {
            return -1;
        }
        int hashPrefix = getHashPrefix(smearedHash, i);
        int i5 = -1;
        while (true) {
            i2 = tableGet - 1;
            i3 = iArr[i2];
            if (getHashPrefix(i3, i) != hashPrefix || !java.util.Objects.equals(obj, objArr[i2]) || (objArr2 != null && !java.util.Objects.equals(obj2, objArr2[i2]))) {
                int next = getNext(i3, i);
                if (next == 0) {
                    return -1;
                }
                i5 = i2;
                tableGet = next;
            }
        }
        int next2 = getNext(i3, i);
        if (i5 == -1) {
            tableSet(obj3, i4, next2);
            return i2;
        }
        iArr[i5] = maskCombine(iArr[i5], next2, i);
        return i2;
    }
}
