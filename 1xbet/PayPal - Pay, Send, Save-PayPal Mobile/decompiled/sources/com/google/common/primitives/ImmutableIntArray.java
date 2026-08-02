package com.google.common.primitives;

@com.google.errorprone.annotations.Immutable
/* loaded from: classes9.dex */
public final class ImmutableIntArray implements java.io.Serializable {
    private static final com.google.common.primitives.ImmutableIntArray EMPTY = new com.google.common.primitives.ImmutableIntArray(new int[0]);
    private final int[] array;
    private final int end;
    private final transient int start;

    public static com.google.common.primitives.ImmutableIntArray of() {
        return EMPTY;
    }

    public static com.google.common.primitives.ImmutableIntArray of(int i) {
        return new com.google.common.primitives.ImmutableIntArray(new int[]{i});
    }

    public static com.google.common.primitives.ImmutableIntArray of(int i, int i2) {
        return new com.google.common.primitives.ImmutableIntArray(new int[]{i, i2});
    }

    public static com.google.common.primitives.ImmutableIntArray of(int i, int i2, int i3) {
        return new com.google.common.primitives.ImmutableIntArray(new int[]{i, i2, i3});
    }

    public static com.google.common.primitives.ImmutableIntArray of(int i, int i2, int i3, int i4) {
        return new com.google.common.primitives.ImmutableIntArray(new int[]{i, i2, i3, i4});
    }

    public static com.google.common.primitives.ImmutableIntArray of(int i, int i2, int i3, int i4, int i5) {
        return new com.google.common.primitives.ImmutableIntArray(new int[]{i, i2, i3, i4, i5});
    }

    public static com.google.common.primitives.ImmutableIntArray of(int i, int i2, int i3, int i4, int i5, int i6) {
        return new com.google.common.primitives.ImmutableIntArray(new int[]{i, i2, i3, i4, i5, i6});
    }

    public static com.google.common.primitives.ImmutableIntArray of(int i, int... iArr) {
        com.google.common.base.Preconditions.checkArgument(iArr.length <= 2147483646, "the total number of elements must fit in an int");
        int[] iArr2 = new int[iArr.length + 1];
        iArr2[0] = i;
        java.lang.System.arraycopy(iArr, 0, iArr2, 1, iArr.length);
        return new com.google.common.primitives.ImmutableIntArray(iArr2);
    }

    public static com.google.common.primitives.ImmutableIntArray copyOf(int[] iArr) {
        return iArr.length == 0 ? EMPTY : new com.google.common.primitives.ImmutableIntArray(java.util.Arrays.copyOf(iArr, iArr.length));
    }

    public static com.google.common.primitives.ImmutableIntArray copyOf(java.util.Collection<java.lang.Integer> collection) {
        return collection.isEmpty() ? EMPTY : new com.google.common.primitives.ImmutableIntArray(com.google.common.primitives.Ints.toArray(collection));
    }

    public static com.google.common.primitives.ImmutableIntArray copyOf(java.lang.Iterable<java.lang.Integer> iterable) {
        if (iterable instanceof java.util.Collection) {
            return copyOf((java.util.Collection<java.lang.Integer>) iterable);
        }
        return builder().addAll(iterable).build();
    }

    public static com.google.common.primitives.ImmutableIntArray copyOf(java.util.stream.IntStream intStream) {
        int[] array = intStream.toArray();
        return array.length == 0 ? EMPTY : new com.google.common.primitives.ImmutableIntArray(array);
    }

    public static com.google.common.primitives.ImmutableIntArray.Builder builder(int i) {
        com.google.common.base.Preconditions.checkArgument(i >= 0, "Invalid initialCapacity: %s", i);
        return new com.google.common.primitives.ImmutableIntArray.Builder(i);
    }

    public static com.google.common.primitives.ImmutableIntArray.Builder builder() {
        return new com.google.common.primitives.ImmutableIntArray.Builder(10);
    }

    public static final class Builder {
        private int[] array;
        private int count = 0;

        Builder(int i) {
            this.array = new int[i];
        }

        public final com.google.common.primitives.ImmutableIntArray.Builder add(int i) {
            ensureRoomFor(1);
            int[] iArr = this.array;
            int i2 = this.count;
            iArr[i2] = i;
            this.count = i2 + 1;
            return this;
        }

        public final com.google.common.primitives.ImmutableIntArray.Builder addAll(int[] iArr) {
            ensureRoomFor(iArr.length);
            java.lang.System.arraycopy(iArr, 0, this.array, this.count, iArr.length);
            this.count += iArr.length;
            return this;
        }

        public final com.google.common.primitives.ImmutableIntArray.Builder addAll(java.lang.Iterable<java.lang.Integer> iterable) {
            if (iterable instanceof java.util.Collection) {
                return addAll((java.util.Collection<java.lang.Integer>) iterable);
            }
            java.util.Iterator<java.lang.Integer> it = iterable.iterator();
            while (it.hasNext()) {
                add(it.next().intValue());
            }
            return this;
        }

        public final com.google.common.primitives.ImmutableIntArray.Builder addAll(java.util.Collection<java.lang.Integer> collection) {
            ensureRoomFor(collection.size());
            for (java.lang.Integer num : collection) {
                int[] iArr = this.array;
                int i = this.count;
                this.count = i + 1;
                iArr[i] = num.intValue();
            }
            return this;
        }

        /* JADX WARN: Type inference failed for: r5v1, types: [java.util.Spliterator$OfInt] */
        public final com.google.common.primitives.ImmutableIntArray.Builder addAll(java.util.stream.IntStream intStream) {
            ?? spliterator = intStream.spliterator();
            long exactSizeIfKnown = spliterator.getExactSizeIfKnown();
            if (exactSizeIfKnown > 0) {
                ensureRoomFor(com.google.common.primitives.Ints.saturatedCast(exactSizeIfKnown));
            }
            spliterator.forEachRemaining(new java.util.function.IntConsumer() { // from class: com.google.common.primitives.ImmutableIntArray$Builder$$ExternalSyntheticLambda0
                @Override // java.util.function.IntConsumer
                public final void accept(int i) {
                    com.google.common.primitives.ImmutableIntArray.Builder.this.add(i);
                }
            });
            return this;
        }

        public final com.google.common.primitives.ImmutableIntArray.Builder addAll(com.google.common.primitives.ImmutableIntArray immutableIntArray) {
            ensureRoomFor(immutableIntArray.length());
            java.lang.System.arraycopy(immutableIntArray.array, immutableIntArray.start, this.array, this.count, immutableIntArray.length());
            this.count += immutableIntArray.length();
            return this;
        }

        private void ensureRoomFor(int i) {
            int i2 = this.count + i;
            int[] iArr = this.array;
            if (i2 > iArr.length) {
                this.array = java.util.Arrays.copyOf(iArr, expandedCapacity(iArr.length, i2));
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

        public final com.google.common.primitives.ImmutableIntArray build() {
            if (this.count == 0) {
                return com.google.common.primitives.ImmutableIntArray.EMPTY;
            }
            return new com.google.common.primitives.ImmutableIntArray(this.array, 0, this.count);
        }
    }

    private ImmutableIntArray(int[] iArr) {
        this(iArr, 0, iArr.length);
    }

    private ImmutableIntArray(int[] iArr, int i, int i2) {
        this.array = iArr;
        this.start = i;
        this.end = i2;
    }

    public final int length() {
        return this.end - this.start;
    }

    public final boolean isEmpty() {
        return this.end == this.start;
    }

    public final int get(int i) {
        com.google.common.base.Preconditions.checkElementIndex(i, length());
        return this.array[this.start + i];
    }

    public final int indexOf(int i) {
        for (int i2 = this.start; i2 < this.end; i2++) {
            if (this.array[i2] == i) {
                return i2 - this.start;
            }
        }
        return -1;
    }

    public final int lastIndexOf(int i) {
        int i2;
        int i3 = this.end;
        do {
            i3--;
            i2 = this.start;
            if (i3 < i2) {
                return -1;
            }
        } while (this.array[i3] != i);
        return i3 - i2;
    }

    public final boolean contains(int i) {
        return indexOf(i) >= 0;
    }

    public final void forEach(java.util.function.IntConsumer intConsumer) {
        com.google.common.base.Preconditions.checkNotNull(intConsumer);
        for (int i = this.start; i < this.end; i++) {
            intConsumer.accept(this.array[i]);
        }
    }

    public final java.util.stream.IntStream stream() {
        return java.util.Arrays.stream(this.array, this.start, this.end);
    }

    public final int[] toArray() {
        return java.util.Arrays.copyOfRange(this.array, this.start, this.end);
    }

    public final com.google.common.primitives.ImmutableIntArray subArray(int i, int i2) {
        com.google.common.base.Preconditions.checkPositionIndexes(i, i2, length());
        if (i == i2) {
            return EMPTY;
        }
        int[] iArr = this.array;
        int i3 = this.start;
        return new com.google.common.primitives.ImmutableIntArray(iArr, i + i3, i3 + i2);
    }

    final java.util.Spliterator.OfInt spliterator() {
        return java.util.Spliterators.spliterator(this.array, this.start, this.end, org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_WATERMARK);
    }

    public final java.util.List<java.lang.Integer> asList() {
        return new com.google.common.primitives.ImmutableIntArray.AsList();
    }

    static final class AsList extends java.util.AbstractList<java.lang.Integer> implements java.util.RandomAccess, java.io.Serializable {
        private final com.google.common.primitives.ImmutableIntArray parent;

        private AsList(com.google.common.primitives.ImmutableIntArray immutableIntArray) {
            this.parent = immutableIntArray;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.parent.length();
        }

        @Override // java.util.AbstractList, java.util.List
        public final java.lang.Integer get(int i) {
            return java.lang.Integer.valueOf(this.parent.get(i));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean contains(java.lang.Object obj) {
            return indexOf(obj) >= 0;
        }

        @Override // java.util.AbstractList, java.util.List
        public final int indexOf(java.lang.Object obj) {
            if (obj instanceof java.lang.Integer) {
                return this.parent.indexOf(((java.lang.Integer) obj).intValue());
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public final int lastIndexOf(java.lang.Object obj) {
            if (obj instanceof java.lang.Integer) {
                return this.parent.lastIndexOf(((java.lang.Integer) obj).intValue());
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public final java.util.List<java.lang.Integer> subList(int i, int i2) {
            return this.parent.subArray(i, i2).asList();
        }

        @Override // java.util.Collection, java.lang.Iterable, java.util.List
        public final java.util.Spliterator<java.lang.Integer> spliterator() {
            return this.parent.spliterator();
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final boolean equals(java.lang.Object obj) {
            if (obj instanceof com.google.common.primitives.ImmutableIntArray.AsList) {
                return this.parent.equals(((com.google.common.primitives.ImmutableIntArray.AsList) obj).parent);
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
                if (!(obj2 instanceof java.lang.Integer) || this.parent.array[i] != ((java.lang.Integer) obj2).intValue()) {
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
        if (!(obj instanceof com.google.common.primitives.ImmutableIntArray)) {
            return false;
        }
        com.google.common.primitives.ImmutableIntArray immutableIntArray = (com.google.common.primitives.ImmutableIntArray) obj;
        if (length() != immutableIntArray.length()) {
            return false;
        }
        for (int i = 0; i < length(); i++) {
            if (get(i) != immutableIntArray.get(i)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = this.start; i2 < this.end; i2++) {
            i = (i * 31) + java.lang.Integer.hashCode(this.array[i2]);
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

    public final com.google.common.primitives.ImmutableIntArray trimmed() {
        return isPartialView() ? new com.google.common.primitives.ImmutableIntArray(toArray()) : this;
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
