package com.google.common.collect;

@com.google.common.collect.ElementTypesAreNonnullByDefault
/* loaded from: classes3.dex */
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

    static int getHashPrefix(int value, int mask) {
        return value & (~mask);
    }

    static int getNext(int entry, int mask) {
        return entry & mask;
    }

    static int maskCombine(int prefix, int suffix, int mask) {
        return (prefix & (~mask)) | (suffix & mask);
    }

    static int newCapacity(int mask) {
        return (mask < 32 ? 4 : 2) * (mask + 1);
    }

    private CompactHashing() {
    }

    static int tableSize(int expectedSize) {
        return java.lang.Math.max(4, com.google.common.collect.Hashing.closedTableSize(expectedSize + 1, 1.0d));
    }

    static java.lang.Object createTable(int buckets) {
        if (buckets < 2 || buckets > 1073741824 || java.lang.Integer.highestOneBit(buckets) != buckets) {
            throw new java.lang.IllegalArgumentException("must be power of 2 between 2^1 and 2^30: " + buckets);
        }
        if (buckets <= 256) {
            return new byte[buckets];
        }
        if (buckets <= 65536) {
            return new short[buckets];
        }
        return new int[buckets];
    }

    static void tableClear(java.lang.Object table) {
        if (table instanceof byte[]) {
            java.util.Arrays.fill((byte[]) table, (byte) 0);
        } else if (table instanceof short[]) {
            java.util.Arrays.fill((short[]) table, (short) 0);
        } else {
            java.util.Arrays.fill((int[]) table, 0);
        }
    }

    static int tableGet(java.lang.Object table, int index) {
        if (table instanceof byte[]) {
            return ((byte[]) table)[index] & 255;
        }
        if (table instanceof short[]) {
            return ((short[]) table)[index] & kotlin.UShort.MAX_VALUE;
        }
        return ((int[]) table)[index];
    }

    static void tableSet(java.lang.Object table, int index, int entry) {
        if (table instanceof byte[]) {
            ((byte[]) table)[index] = (byte) entry;
        } else if (table instanceof short[]) {
            ((short[]) table)[index] = (short) entry;
        } else {
            ((int[]) table)[index] = entry;
        }
    }

    static int remove(@javax.annotation.CheckForNull java.lang.Object key, @javax.annotation.CheckForNull java.lang.Object value, int mask, java.lang.Object table, int[] entries, java.lang.Object[] keys, @javax.annotation.CheckForNull java.lang.Object[] values) {
        int i;
        int i2;
        int smearedHash = com.google.common.collect.Hashing.smearedHash(key);
        int i3 = smearedHash & mask;
        int tableGet = tableGet(table, i3);
        if (tableGet == 0) {
            return -1;
        }
        int hashPrefix = getHashPrefix(smearedHash, mask);
        int i4 = -1;
        while (true) {
            i = tableGet - 1;
            i2 = entries[i];
            if (getHashPrefix(i2, mask) != hashPrefix || !com.google.common.base.Objects.equal(key, keys[i]) || (values != null && !com.google.common.base.Objects.equal(value, values[i]))) {
                int next = getNext(i2, mask);
                if (next == 0) {
                    return -1;
                }
                i4 = i;
                tableGet = next;
            }
        }
        int next2 = getNext(i2, mask);
        if (i4 == -1) {
            tableSet(table, i3, next2);
        } else {
            entries[i4] = maskCombine(entries[i4], next2, mask);
        }
        return i;
    }
}
