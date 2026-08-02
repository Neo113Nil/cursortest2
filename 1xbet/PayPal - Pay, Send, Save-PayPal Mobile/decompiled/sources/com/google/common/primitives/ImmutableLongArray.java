package com.google.common.primitives;

@com.google.errorprone.annotations.Immutable
/* loaded from: classes9.dex */
public final class ImmutableLongArray implements java.io.Serializable {
    private static final com.google.common.primitives.ImmutableLongArray EMPTY = new com.google.common.primitives.ImmutableLongArray(new long[0]);
    private final long[] array;
    private final int end;
    private final transient int start;

    public static com.google.common.primitives.ImmutableLongArray of() {
        return EMPTY;
    }

    public static com.google.common.primitives.ImmutableLongArray of(long j) {
        return new com.google.common.primitives.ImmutableLongArray(new long[]{j});
    }

    public static com.google.common.primitives.ImmutableLongArray of(long j, long j2) {
        return new com.google.common.primitives.ImmutableLongArray(new long[]{j, j2});
    }

    public static com.google.common.primitives.ImmutableLongArray of(long j, long j2, long j3) {
        return new com.google.common.primitives.ImmutableLongArray(new long[]{j, j2, j3});
    }

    public static com.google.common.primitives.ImmutableLongArray of(long j, long j2, long j3, long j4) {
        return new com.google.common.primitives.ImmutableLongArray(new long[]{j, j2, j3, j4});
    }

    public static com.google.common.primitives.ImmutableLongArray of(long j, long j2, long j3, long j4, long j5) {
        return new com.google.common.primitives.ImmutableLongArray(new long[]{j, j2, j3, j4, j5});
    }

    public static com.google.common.primitives.ImmutableLongArray of(long j, long j2, long j3, long j4, long j5, long j6) {
        return new com.google.common.primitives.ImmutableLongArray(new long[]{j, j2, j3, j4, j5, j6});
    }

    public static com.google.common.primitives.ImmutableLongArray of(long j, long... jArr) {
        com.google.common.base.Preconditions.checkArgument(jArr.length <= 2147483646, "the total number of elements must fit in an int");
        long[] jArr2 = new long[jArr.length + 1];
        jArr2[0] = j;
        java.lang.System.arraycopy(jArr, 0, jArr2, 1, jArr.length);
        return new com.google.common.primitives.ImmutableLongArray(jArr2);
    }

    public static com.google.common.primitives.ImmutableLongArray copyOf(long[] jArr) {
        if (jArr.length == 0) {
            return EMPTY;
        }
        return new com.google.common.primitives.ImmutableLongArray(java.util.Arrays.copyOf(jArr, jArr.length));
    }

    public static com.google.common.primitives.ImmutableLongArray copyOf(java.util.Collection<java.lang.Long> collection) {
        return collection.isEmpty() ? EMPTY : new com.google.common.primitives.ImmutableLongArray(com.google.common.primitives.Longs.toArray(collection));
    }

    public static com.google.common.primitives.ImmutableLongArray copyOf(java.lang.Iterable<java.lang.Long> iterable) {
        if (iterable instanceof java.util.Collection) {
            return copyOf((java.util.Collection<java.lang.Long>) iterable);
        }
        return builder().addAll(iterable).build();
    }

    public static com.google.common.primitives.ImmutableLongArray copyOf(java.util.stream.LongStream longStream) {
        long[] array = longStream.toArray();
        return array.length == 0 ? EMPTY : new com.google.common.primitives.ImmutableLongArray(array);
    }

    public static com.google.common.primitives.ImmutableLongArray.Builder builder(int i) {
        com.google.common.base.Preconditions.checkArgument(i >= 0, "Invalid initialCapacity: %s", i);
        return new com.google.common.primitives.ImmutableLongArray.Builder(i);
    }

    public static com.google.common.primitives.ImmutableLongArray.Builder builder() {
        return new com.google.common.primitives.ImmutableLongArray.Builder(10);
    }

    public static final class Builder {
        private long[] array;
        private int count = 0;

        Builder(int i) {
            this.array = new long[i];
        }

        public final com.google.common.primitives.ImmutableLongArray.Builder add(long j) {
            ensureRoomFor(1);
            long[] jArr = this.array;
            int i = this.count;
            jArr[i] = j;
            this.count = i + 1;
            return this;
        }

        public final com.google.common.primitives.ImmutableLongArray.Builder addAll(long[] jArr) {
            ensureRoomFor(jArr.length);
            java.lang.System.arraycopy(jArr, 0, this.array, this.count, jArr.length);
            this.count += jArr.length;
            return this;
        }

        public final com.google.common.primitives.ImmutableLongArray.Builder addAll(java.lang.Iterable<java.lang.Long> iterable) {
            if (iterable instanceof java.util.Collection) {
                return addAll((java.util.Collection<java.lang.Long>) iterable);
            }
            java.util.Iterator<java.lang.Long> it = iterable.iterator();
            while (it.hasNext()) {
                add(it.next().longValue());
            }
            return this;
        }

        public final com.google.common.primitives.ImmutableLongArray.Builder addAll(java.util.Collection<java.lang.Long> collection) {
            ensureRoomFor(collection.size());
            for (java.lang.Long l : collection) {
                long[] jArr = this.array;
                int i = this.count;
                this.count = i + 1;
                jArr[i] = l.longValue();
            }
            return this;
        }

        /* JADX WARN: Type inference failed for: r5v1, types: [java.util.Spliterator$OfLong] */
        public final com.google.common.primitives.ImmutableLongArray.Builder addAll(java.util.stream.LongStream longStream) {
            ?? spliterator = longStream.spliterator();
            long exactSizeIfKnown = spliterator.getExactSizeIfKnown();
            if (exactSizeIfKnown > 0) {
                ensureRoomFor(com.google.common.primitives.Ints.saturatedCast(exactSizeIfKnown));
            }
            spliterator.forEachRemaining(new java.util.function.LongConsumer() { // from class: com.google.common.primitives.ImmutableLongArray$Builder$$ExternalSyntheticLambda0
                @Override // java.util.function.LongConsumer
                public final void accept(long j) {
                    com.google.common.primitives.ImmutableLongArray.Builder.this.add(j);
                }
            });
            return this;
        }

        public final com.google.common.primitives.ImmutableLongArray.Builder addAll(com.google.common.primitives.ImmutableLongArray immutableLongArray) {
            ensureRoomFor(immutableLongArray.length());
            java.lang.System.arraycopy(immutableLongArray.array, immutableLongArray.start, this.array, this.count, immutableLongArray.length());
            this.count += immutableLongArray.length();
            return this;
        }

        private void ensureRoomFor(int i) {
            int i2 = this.count + i;
            long[] jArr = this.array;
            if (i2 > jArr.length) {
                this.array = java.util.Arrays.copyOf(jArr, expandedCapacity(jArr.length, i2));
            }
        }

        private static int expandedCapacity(int i, int i2) {
            if (i2 < 0) {
                throw new java.lang.AssertionError("cannot store more than MAX_VALUE elements");
            }
            int i3 = i + (i >> 1) + 1;
            if (i3 < i2) {
                i3 = java.lang.Integer.highestOneBit(i2 - 1) << 1;
            }
            if (i3 < 0) {
                return Integer.MAX_VALUE;
            }
            return i3;
        }

        public final com.google.common.primitives.ImmutableLongArray build() {
            if (this.count == 0) {
                return com.google.common.primitives.ImmutableLongArray.EMPTY;
            }
            return new com.google.common.primitives.ImmutableLongArray(this.array, 0, this.count);
        }
    }

    private ImmutableLongArray(long[] jArr) {
        this(jArr, 0, jArr.length);
    }

    private ImmutableLongArray(long[] jArr, int i, int i2) {
        this.array = jArr;
        this.start = i;
        this.end = i2;
    }

    public final int length() {
        return this.end - this.start;
    }

    public final boolean isEmpty() {
        return this.end == this.start;
    }

    public final long get(int i) {
        com.google.common.base.Preconditions.checkElementIndex(i, length());
        return this.array[this.start + i];
    }

    public final int indexOf(long j) {
        for (int i = this.start; i < this.end; i++) {
            if (this.array[i] == j) {
                return i - this.start;
            }
        }
        return -1;
    }

    public final int lastIndexOf(long j) {
        int i;
        int i2 = this.end;
        do {
            i2--;
            i = this.start;
            if (i2 < i) {
                return -1;
            }
        } while (this.array[i2] != j);
        return i2 - i;
    }

    public final boolean contains(long j) {
        return indexOf(j) >= 0;
    }

    public final void forEach(java.util.function.LongConsumer longConsumer) {
        com.google.common.base.Preconditions.checkNotNull(longConsumer);
        for (int i = this.start; i < this.end; i++) {
            longConsumer.accept(this.array[i]);
        }
    }

    public final java.util.stream.LongStream stream() {
        return java.util.Arrays.stream(this.array, this.start, this.end);
    }

    public final long[] toArray() {
        return java.util.Arrays.copyOfRange(this.array, this.start, this.end);
    }

    public final com.google.common.primitives.ImmutableLongArray subArray(int i, int i2) {
        com.google.common.base.Preconditions.checkPositionIndexes(i, i2, length());
        if (i == i2) {
            return EMPTY;
        }
        long[] jArr = this.array;
        int i3 = this.start;
        return new com.google.common.primitives.ImmutableLongArray(jArr, i + i3, i3 + i2);
    }

    final java.util.Spliterator.OfLong spliterator() {
        return java.util.Spliterators.spliterator(this.array, this.start, this.end, org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_WATERMARK);
    }

    public final java.util.List<java.lang.Long> asList() {
        return new com.google.common.primitives.ImmutableLongArray.AsList();
    }

    static final class AsList extends java.util.AbstractList<java.lang.Long> implements java.util.RandomAccess, java.io.Serializable {
        private final com.google.common.primitives.ImmutableLongArray parent;

        private AsList(com.google.common.primitives.ImmutableLongArray immutableLongArray) {
            this.parent = immutableLongArray;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.parent.length();
        }

        @Override // java.util.AbstractList, java.util.List
        public final java.lang.Long get(int i) {
            return java.lang.Long.valueOf(this.parent.get(i));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean contains(java.lang.Object obj) {
            return indexOf(obj) >= 0;
        }

        @Override // java.util.AbstractList, java.util.List
        public final int indexOf(java.lang.Object obj) {
            if (obj instanceof java.lang.Long) {
                return this.parent.indexOf(((java.lang.Long) obj).longValue());
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public final int lastIndexOf(java.lang.Object obj) {
            if (obj instanceof java.lang.Long) {
                return this.parent.lastIndexOf(((java.lang.Long) obj).longValue());
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public final java.util.List<java.lang.Long> subList(int i, int i2) {
            return this.parent.subArray(i, i2).asList();
        }

        @Override // java.util.Collection, java.lang.Iterable, java.util.List
        public final java.util.Spliterator<java.lang.Long> spliterator() {
            return this.parent.spliterator();
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final boolean equals(java.lang.Object obj) {
            if (obj instanceof com.google.common.primitives.ImmutableLongArray.AsList) {
                return this.parent.equals(((com.google.common.primitives.ImmutableLongArray.AsList) obj).parent);
            }
            if (!(obj instanceof java.util.List)) {
                return false;
            }
            java.util.List list = (java.util.List) obj;
            if (size() != list.size()) {
                return false;
            }
            int i = this.parent.start;
            for (java.lang.Object obj2 : list) {
                if (!(obj2 instanceof java.lang.Long) || this.parent.array[i] != ((java.lang.Long) obj2).longValue()) {
                    return false;
                }
                i++;
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final int hashCode() {
            return this.parent.hashCode();
        }

        @Override // java.util.AbstractCollection
        public final java.lang.String toString() {
            return this.parent.toString();
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.common.primitives.ImmutableLongArray)) {
            return false;
        }
        com.google.common.primitives.ImmutableLongArray immutableLongArray = (com.google.common.primitives.ImmutableLongArray) obj;
        if (length() != immutableLongArray.length()) {
            return false;
        }
        for (int i = 0; i < length(); i++) {
            if (get(i) != immutableLongArray.get(i)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = this.start; i2 < this.end; i2++) {
            i = (i * 31) + java.lang.Long.hashCode(this.array[i2]);
        }
        return i;
    }

    public final java.lang.String toString() {
        if (isEmpty()) {
            return okhttp3.internal.url._UrlKt.PATH_SEGMENT_ENCODE_SET_URI;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length() * 5);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_LIST);
        sb.append(this.array[this.start]);
        int i = this.start;
        while (true) {
            i++;
            if (i < this.end) {
                sb.append(", ");
                sb.append(this.array[i]);
            } else {
                sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
                return sb.toString();
            }
        }
    }

    public final com.google.common.primitives.ImmutableLongArray trimmed() {
        return isPartialView() ? new com.google.common.primitives.ImmutableLongArray(toArray()) : this;
    }

    private boolean isPartialView() {
        return this.start > 0 || this.end < this.array.length;
    }

    final java.lang.Object writeReplace() {
        return trimmed();
    }

    final java.lang.Object readResolve() {
        return isEmpty() ? EMPTY : this;
    }
}
