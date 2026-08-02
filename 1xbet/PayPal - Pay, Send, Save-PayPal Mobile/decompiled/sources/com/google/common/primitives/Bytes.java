package com.google.common.primitives;

/* loaded from: classes9.dex */
public final class Bytes {
    public static int hashCode(byte b) {
        return b;
    }

    private Bytes() {
    }

    public static boolean contains(byte[] bArr, byte b) {
        for (byte b2 : bArr) {
            if (b2 == b) {
                return true;
            }
        }
        return false;
    }

    public static int indexOf(byte[] bArr, byte b) {
        return indexOf(bArr, b, 0, bArr.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int indexOf(byte[] bArr, byte b, int i, int i2) {
        while (i < i2) {
            if (bArr[i] == b) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0023, code lost:
    
        r0 = r0 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int indexOf(byte[] bArr, byte[] bArr2) {
        com.google.common.base.Preconditions.checkNotNull(bArr, "array");
        com.google.common.base.Preconditions.checkNotNull(bArr2, androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_TARGET);
        if (bArr2.length == 0) {
            return 0;
        }
        int i = 0;
        while (i < (bArr.length - bArr2.length) + 1) {
            for (int i2 = 0; i2 < bArr2.length; i2++) {
                if (bArr[i + i2] != bArr2[i2]) {
                    break;
                }
            }
            return i;
        }
        return -1;
    }

    public static int lastIndexOf(byte[] bArr, byte b) {
        return lastIndexOf(bArr, b, 0, bArr.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int lastIndexOf(byte[] bArr, byte b, int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            if (bArr[i3] == b) {
                return i3;
            }
        }
        return -1;
    }

    public static byte[] concat(byte[]... bArr) {
        long j = 0;
        for (byte[] bArr2 : bArr) {
            j += bArr2.length;
        }
        byte[] bArr3 = new byte[checkNoOverflow(j)];
        int i = 0;
        for (byte[] bArr4 : bArr) {
            java.lang.System.arraycopy(bArr4, 0, bArr3, i, bArr4.length);
            i += bArr4.length;
        }
        return bArr3;
    }

    private static int checkNoOverflow(long j) {
        int i = (int) j;
        com.google.common.base.Preconditions.checkArgument(j == ((long) i), "the total number of elements (%s) in the arrays must fit in an int", j);
        return i;
    }

    public static byte[] ensureCapacity(byte[] bArr, int i, int i2) {
        com.google.common.base.Preconditions.checkArgument(i >= 0, "Invalid minLength: %s", i);
        com.google.common.base.Preconditions.checkArgument(i2 >= 0, "Invalid padding: %s", i2);
        return bArr.length < i ? java.util.Arrays.copyOf(bArr, i + i2) : bArr;
    }

    public static byte[] toArray(java.util.Collection<? extends java.lang.Number> collection) {
        if (collection instanceof com.google.common.primitives.Bytes.ByteArrayAsList) {
            return ((com.google.common.primitives.Bytes.ByteArrayAsList) collection).toByteArray();
        }
        java.lang.Object[] array = collection.toArray();
        int length = array.length;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr[i] = ((java.lang.Number) com.google.common.base.Preconditions.checkNotNull(array[i])).byteValue();
        }
        return bArr;
    }

    public static java.util.List<java.lang.Byte> asList(byte... bArr) {
        if (bArr.length == 0) {
            return java.util.Collections.emptyList();
        }
        return new com.google.common.primitives.Bytes.ByteArrayAsList(bArr);
    }

    static final class ByteArrayAsList extends java.util.AbstractList<java.lang.Byte> implements java.util.RandomAccess, java.io.Serializable {
        private static final long serialVersionUID = 0;
        final byte[] array;
        final int end;
        final int start;

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean isEmpty() {
            return false;
        }

        ByteArrayAsList(byte[] bArr) {
            this(bArr, 0, bArr.length);
        }

        ByteArrayAsList(byte[] bArr, int i, int i2) {
            this.array = bArr;
            this.start = i;
            this.end = i2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.end - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public final java.lang.Byte get(int i) {
            com.google.common.base.Preconditions.checkElementIndex(i, size());
            return java.lang.Byte.valueOf(this.array[this.start + i]);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean contains(java.lang.Object obj) {
            return (obj instanceof java.lang.Byte) && com.google.common.primitives.Bytes.indexOf(this.array, ((java.lang.Byte) obj).byteValue(), this.start, this.end) != -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public final int indexOf(java.lang.Object obj) {
            int indexOf;
            if (!(obj instanceof java.lang.Byte) || (indexOf = com.google.common.primitives.Bytes.indexOf(this.array, ((java.lang.Byte) obj).byteValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return indexOf - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public final int lastIndexOf(java.lang.Object obj) {
            int lastIndexOf;
            if (!(obj instanceof java.lang.Byte) || (lastIndexOf = com.google.common.primitives.Bytes.lastIndexOf(this.array, ((java.lang.Byte) obj).byteValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return lastIndexOf - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public final java.lang.Byte set(int i, java.lang.Byte b) {
            com.google.common.base.Preconditions.checkElementIndex(i, size());
            byte[] bArr = this.array;
            int i2 = this.start + i;
            byte b2 = bArr[i2];
            bArr[i2] = ((java.lang.Byte) com.google.common.base.Preconditions.checkNotNull(b)).byteValue();
            return java.lang.Byte.valueOf(b2);
        }

        @Override // java.util.AbstractList, java.util.List
        public final java.util.List<java.lang.Byte> subList(int i, int i2) {
            com.google.common.base.Preconditions.checkPositionIndexes(i, i2, size());
            if (i == i2) {
                return java.util.Collections.emptyList();
            }
            byte[] bArr = this.array;
            int i3 = this.start;
            return new com.google.common.primitives.Bytes.ByteArrayAsList(bArr, i + i3, i3 + i2);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final boolean equals(java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof com.google.common.primitives.Bytes.ByteArrayAsList) {
                com.google.common.primitives.Bytes.ByteArrayAsList byteArrayAsList = (com.google.common.primitives.Bytes.ByteArrayAsList) obj;
                int size = size();
                if (byteArrayAsList.size() != size) {
                    return false;
                }
                for (int i = 0; i < size; i++) {
                    if (this.array[this.start + i] != byteArrayAsList.array[byteArrayAsList.start + i]) {
                        return false;
                    }
                }
                return true;
            }
            return super.equals(obj);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final int hashCode() {
            int i = 1;
            for (int i2 = this.start; i2 < this.end; i2++) {
                i = (i * 31) + java.lang.Byte.hashCode(this.array[i2]);
            }
            return i;
        }

        @Override // java.util.AbstractCollection
        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(size() * 5);
            sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_LIST);
            sb.append((int) this.array[this.start]);
            int i = this.start;
            while (true) {
                i++;
                if (i < this.end) {
                    sb.append(", ");
                    sb.append((int) this.array[i]);
                } else {
                    sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
                    return sb.toString();
                }
            }
        }

        final byte[] toByteArray() {
            return java.util.Arrays.copyOfRange(this.array, this.start, this.end);
        }
    }

    public static void reverse(byte[] bArr) {
        com.google.common.base.Preconditions.checkNotNull(bArr);
        reverse(bArr, 0, bArr.length);
    }

    public static void reverse(byte[] bArr, int i, int i2) {
        com.google.common.base.Preconditions.checkNotNull(bArr);
        com.google.common.base.Preconditions.checkPositionIndexes(i, i2, bArr.length);
        while (true) {
            i2--;
            if (i >= i2) {
                return;
            }
            byte b = bArr[i];
            bArr[i] = bArr[i2];
            bArr[i2] = b;
            i++;
        }
    }

    public static void rotate(byte[] bArr, int i) {
        rotate(bArr, i, 0, bArr.length);
    }

    public static void rotate(byte[] bArr, int i, int i2, int i3) {
        com.google.common.base.Preconditions.checkNotNull(bArr);
        com.google.common.base.Preconditions.checkPositionIndexes(i2, i3, bArr.length);
        if (bArr.length > 1) {
            int i4 = i3 - i2;
            int i5 = (-i) % i4;
            if (i5 < 0) {
                i5 += i4;
            }
            int i6 = i5 + i2;
            if (i6 == i2) {
                return;
            }
            reverse(bArr, i2, i6);
            reverse(bArr, i6, i3);
            reverse(bArr, i2, i3);
        }
    }
}
