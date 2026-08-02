package kotlin.reflect.jvm.internal.impl.protobuf;

/* loaded from: classes5.dex */
class RopeByteString extends kotlin.reflect.jvm.internal.impl.protobuf.ByteString {
    private static final int[] getHighSpeedVideoFpsRangesFor;
    private int Camera2StreamConfigurationMap;
    private final int getHighResolutionOutputSizeshNQ4ISI;
    private final kotlin.reflect.jvm.internal.impl.protobuf.ByteString getHighSpeedVideoFpsRanges;
    private final kotlin.reflect.jvm.internal.impl.protobuf.ByteString getHighSpeedVideoSizes;
    private final int getOutputFormats;
    private final int getOutputMinFrameDuration;

    /* synthetic */ RopeByteString(kotlin.reflect.jvm.internal.impl.protobuf.ByteString byteString, kotlin.reflect.jvm.internal.impl.protobuf.ByteString byteString2, byte b) {
        this(byteString, byteString2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString, java.lang.Iterable
    public /* bridge */ /* synthetic */ java.util.Iterator<java.lang.Byte> iterator() {
        return iterator();
    }

    static {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i = 1;
        int i2 = 1;
        while (i2 > 0) {
            arrayList.add(java.lang.Integer.valueOf(i2));
            int i3 = i2;
            i2 = i + i2;
            i = i3;
        }
        arrayList.add(Integer.MAX_VALUE);
        getHighSpeedVideoFpsRangesFor = new int[arrayList.size()];
        int i4 = 0;
        while (true) {
            int[] iArr = getHighSpeedVideoFpsRangesFor;
            if (i4 >= iArr.length) {
                return;
            }
            iArr[i4] = ((java.lang.Integer) arrayList.get(i4)).intValue();
            i4++;
        }
    }

    private RopeByteString(kotlin.reflect.jvm.internal.impl.protobuf.ByteString byteString, kotlin.reflect.jvm.internal.impl.protobuf.ByteString byteString2) {
        this.Camera2StreamConfigurationMap = 0;
        this.getHighSpeedVideoSizes = byteString;
        this.getHighSpeedVideoFpsRanges = byteString2;
        int size = byteString.size();
        this.getHighResolutionOutputSizeshNQ4ISI = size;
        this.getOutputFormats = size + byteString2.size();
        this.getOutputMinFrameDuration = java.lang.Math.max(byteString.getTreeDepth(), byteString2.getTreeDepth()) + 1;
    }

    static kotlin.reflect.jvm.internal.impl.protobuf.ByteString getHighResolutionOutputSizeshNQ4ISI(kotlin.reflect.jvm.internal.impl.protobuf.ByteString byteString, kotlin.reflect.jvm.internal.impl.protobuf.ByteString byteString2) {
        kotlin.reflect.jvm.internal.impl.protobuf.RopeByteString ropeByteString = byteString instanceof kotlin.reflect.jvm.internal.impl.protobuf.RopeByteString ? (kotlin.reflect.jvm.internal.impl.protobuf.RopeByteString) byteString : null;
        if (byteString2.size() == 0) {
            return byteString;
        }
        if (byteString.size() == 0) {
            return byteString2;
        }
        int size = byteString.size() + byteString2.size();
        if (size < 128) {
            return getHighSpeedVideoSizes(byteString, byteString2);
        }
        if (ropeByteString != null && ropeByteString.getHighSpeedVideoFpsRanges.size() + byteString2.size() < 128) {
            return new kotlin.reflect.jvm.internal.impl.protobuf.RopeByteString(ropeByteString.getHighSpeedVideoSizes, getHighSpeedVideoSizes(ropeByteString.getHighSpeedVideoFpsRanges, byteString2));
        }
        if (ropeByteString != null && ropeByteString.getHighSpeedVideoSizes.getTreeDepth() > ropeByteString.getHighSpeedVideoFpsRanges.getTreeDepth() && ropeByteString.getTreeDepth() > byteString2.getTreeDepth()) {
            return new kotlin.reflect.jvm.internal.impl.protobuf.RopeByteString(ropeByteString.getHighSpeedVideoSizes, new kotlin.reflect.jvm.internal.impl.protobuf.RopeByteString(ropeByteString.getHighSpeedVideoFpsRanges, byteString2));
        }
        if (size >= getHighSpeedVideoFpsRangesFor[java.lang.Math.max(byteString.getTreeDepth(), byteString2.getTreeDepth()) + 1]) {
            return new kotlin.reflect.jvm.internal.impl.protobuf.RopeByteString(byteString, byteString2);
        }
        return kotlin.reflect.jvm.internal.impl.protobuf.RopeByteString.Balancer.getHighSpeedVideoFpsRanges(new kotlin.reflect.jvm.internal.impl.protobuf.RopeByteString.Balancer((byte) 0), byteString, byteString2);
    }

    private static kotlin.reflect.jvm.internal.impl.protobuf.LiteralByteString getHighSpeedVideoSizes(kotlin.reflect.jvm.internal.impl.protobuf.ByteString byteString, kotlin.reflect.jvm.internal.impl.protobuf.ByteString byteString2) {
        int size = byteString.size();
        int size2 = byteString2.size();
        byte[] bArr = new byte[size + size2];
        byteString.copyTo(bArr, 0, 0, size);
        byteString2.copyTo(bArr, 0, size, size2);
        return new kotlin.reflect.jvm.internal.impl.protobuf.LiteralByteString(bArr);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public int size() {
        return this.getOutputFormats;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    protected int getTreeDepth() {
        return this.getOutputMinFrameDuration;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    protected boolean isBalanced() {
        return this.getOutputFormats >= getHighSpeedVideoFpsRangesFor[this.getOutputMinFrameDuration];
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    protected void copyToInternal(byte[] bArr, int i, int i2, int i3) {
        int i4 = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i + i3 <= i4) {
            this.getHighSpeedVideoSizes.copyToInternal(bArr, i, i2, i3);
        } else {
            if (i >= i4) {
                this.getHighSpeedVideoFpsRanges.copyToInternal(bArr, i - i4, i2, i3);
                return;
            }
            int i5 = i4 - i;
            this.getHighSpeedVideoSizes.copyToInternal(bArr, i, i2, i5);
            this.getHighSpeedVideoFpsRanges.copyToInternal(bArr, 0, i2 + i5, i3 - i5);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    final void getHighSpeedVideoFpsRangesFor(java.io.OutputStream outputStream, int i, int i2) throws java.io.IOException {
        int i3 = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i + i2 <= i3) {
            this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor(outputStream, i, i2);
        } else {
            if (i >= i3) {
                this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor(outputStream, i - i3, i2);
                return;
            }
            int i4 = i3 - i;
            this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor(outputStream, i, i4);
            this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor(outputStream, 0, i2 - i4);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public java.lang.String toString(java.lang.String str) throws java.io.UnsupportedEncodingException {
        return new java.lang.String(toByteArray(), str);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public boolean isValidUtf8() {
        int partialIsValidUtf8 = this.getHighSpeedVideoSizes.partialIsValidUtf8(0, 0, this.getHighResolutionOutputSizeshNQ4ISI);
        kotlin.reflect.jvm.internal.impl.protobuf.ByteString byteString = this.getHighSpeedVideoFpsRanges;
        return byteString.partialIsValidUtf8(partialIsValidUtf8, 0, byteString.size()) == 0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    protected int partialIsValidUtf8(int i, int i2, int i3) {
        int i4 = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i2 + i3 <= i4) {
            return this.getHighSpeedVideoSizes.partialIsValidUtf8(i, i2, i3);
        }
        if (i2 >= i4) {
            return this.getHighSpeedVideoFpsRanges.partialIsValidUtf8(i, i2 - i4, i3);
        }
        int i5 = i4 - i2;
        return this.getHighSpeedVideoFpsRanges.partialIsValidUtf8(this.getHighSpeedVideoSizes.partialIsValidUtf8(i, i2, i5), 0, i3 - i5);
    }

    public boolean equals(java.lang.Object obj) {
        int peekCachedHashCode;
        if (obj == this) {
            return true;
        }
        byte b = 0;
        if (!(obj instanceof kotlin.reflect.jvm.internal.impl.protobuf.ByteString)) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.protobuf.ByteString byteString = (kotlin.reflect.jvm.internal.impl.protobuf.ByteString) obj;
        if (this.getOutputFormats != byteString.size()) {
            return false;
        }
        if (this.getOutputFormats == 0) {
            return true;
        }
        if (this.Camera2StreamConfigurationMap != 0 && (peekCachedHashCode = byteString.peekCachedHashCode()) != 0 && this.Camera2StreamConfigurationMap != peekCachedHashCode) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.protobuf.RopeByteString.PieceIterator pieceIterator = new kotlin.reflect.jvm.internal.impl.protobuf.RopeByteString.PieceIterator(this, b);
        kotlin.reflect.jvm.internal.impl.protobuf.LiteralByteString next = pieceIterator.next();
        kotlin.reflect.jvm.internal.impl.protobuf.RopeByteString.PieceIterator pieceIterator2 = new kotlin.reflect.jvm.internal.impl.protobuf.RopeByteString.PieceIterator(byteString, b);
        kotlin.reflect.jvm.internal.impl.protobuf.LiteralByteString next2 = pieceIterator2.next();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int size = next.size() - i;
            int size2 = next2.size() - i2;
            int min = java.lang.Math.min(size, size2);
            if (!(i == 0 ? next.getHighSpeedVideoFpsRanges(next2, i2, min) : next2.getHighSpeedVideoFpsRanges(next, i, min))) {
                return false;
            }
            i3 += min;
            int i4 = this.getOutputFormats;
            if (i3 >= i4) {
                if (i3 == i4) {
                    return true;
                }
                throw new java.lang.IllegalStateException();
            }
            if (min == size) {
                next = pieceIterator.next();
                i = 0;
            } else {
                i += min;
            }
            if (min == size2) {
                next2 = pieceIterator2.next();
                i2 = 0;
            } else {
                i2 += min;
            }
        }
    }

    public int hashCode() {
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            int i2 = this.getOutputFormats;
            i = partialHash(i2, 0, i2);
            if (i == 0) {
                i = 1;
            }
            this.Camera2StreamConfigurationMap = i;
        }
        return i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    protected int peekCachedHashCode() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    protected int partialHash(int i, int i2, int i3) {
        int i4 = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i2 + i3 <= i4) {
            return this.getHighSpeedVideoSizes.partialHash(i, i2, i3);
        }
        if (i2 >= i4) {
            return this.getHighSpeedVideoFpsRanges.partialHash(i, i2 - i4, i3);
        }
        int i5 = i4 - i2;
        return this.getHighSpeedVideoFpsRanges.partialHash(this.getHighSpeedVideoSizes.partialHash(i, i2, i5), 0, i3 - i5);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream newCodedInput() {
        return kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream.newInstance(new kotlin.reflect.jvm.internal.impl.protobuf.RopeByteString.RopeInputStream());
    }

    static class Balancer {
        private final java.util.Stack<kotlin.reflect.jvm.internal.impl.protobuf.ByteString> getHighSpeedVideoFpsRanges;

        private Balancer() {
            this.getHighSpeedVideoFpsRanges = new java.util.Stack<>();
        }

        /* synthetic */ Balancer(byte b) {
            this();
        }

        private void getHighSpeedVideoSizes(kotlin.reflect.jvm.internal.impl.protobuf.ByteString byteString) {
            while (!byteString.isBalanced()) {
                if (byteString instanceof kotlin.reflect.jvm.internal.impl.protobuf.RopeByteString) {
                    kotlin.reflect.jvm.internal.impl.protobuf.RopeByteString ropeByteString = (kotlin.reflect.jvm.internal.impl.protobuf.RopeByteString) byteString;
                    getHighSpeedVideoSizes(ropeByteString.getHighSpeedVideoSizes);
                    byteString = ropeByteString.getHighSpeedVideoFpsRanges;
                } else {
                    java.lang.String valueOf = java.lang.String.valueOf(java.lang.String.valueOf(byteString.getClass()));
                    java.lang.StringBuilder sb = new java.lang.StringBuilder(valueOf.length() + 49);
                    sb.append("Has a new type of ByteString been created? Found ");
                    sb.append(valueOf);
                    throw new java.lang.IllegalArgumentException(sb.toString());
                }
            }
            getHighSpeedVideoFpsRangesFor(byteString);
        }

        private void getHighSpeedVideoFpsRangesFor(kotlin.reflect.jvm.internal.impl.protobuf.ByteString byteString) {
            byte b;
            int binarySearch = java.util.Arrays.binarySearch(kotlin.reflect.jvm.internal.impl.protobuf.RopeByteString.getHighSpeedVideoFpsRangesFor, byteString.size());
            if (binarySearch < 0) {
                binarySearch = (-(binarySearch + 1)) - 1;
            }
            int i = kotlin.reflect.jvm.internal.impl.protobuf.RopeByteString.getHighSpeedVideoFpsRangesFor[binarySearch + 1];
            if (!this.getHighSpeedVideoFpsRanges.isEmpty() && this.getHighSpeedVideoFpsRanges.peek().size() < i) {
                int i2 = kotlin.reflect.jvm.internal.impl.protobuf.RopeByteString.getHighSpeedVideoFpsRangesFor[binarySearch];
                kotlin.reflect.jvm.internal.impl.protobuf.ByteString pop = this.getHighSpeedVideoFpsRanges.pop();
                while (true) {
                    b = 0;
                    if (this.getHighSpeedVideoFpsRanges.isEmpty() || this.getHighSpeedVideoFpsRanges.peek().size() >= i2) {
                        break;
                    } else {
                        pop = new kotlin.reflect.jvm.internal.impl.protobuf.RopeByteString(this.getHighSpeedVideoFpsRanges.pop(), pop, b);
                    }
                }
                kotlin.reflect.jvm.internal.impl.protobuf.RopeByteString ropeByteString = new kotlin.reflect.jvm.internal.impl.protobuf.RopeByteString(pop, byteString, b);
                while (!this.getHighSpeedVideoFpsRanges.isEmpty()) {
                    int binarySearch2 = java.util.Arrays.binarySearch(kotlin.reflect.jvm.internal.impl.protobuf.RopeByteString.getHighSpeedVideoFpsRangesFor, ropeByteString.size());
                    if (binarySearch2 < 0) {
                        binarySearch2 = (-(binarySearch2 + 1)) - 1;
                    }
                    if (this.getHighSpeedVideoFpsRanges.peek().size() >= kotlin.reflect.jvm.internal.impl.protobuf.RopeByteString.getHighSpeedVideoFpsRangesFor[binarySearch2 + 1]) {
                        break;
                    } else {
                        ropeByteString = new kotlin.reflect.jvm.internal.impl.protobuf.RopeByteString(this.getHighSpeedVideoFpsRanges.pop(), ropeByteString, b);
                    }
                }
                this.getHighSpeedVideoFpsRanges.push(ropeByteString);
                return;
            }
            this.getHighSpeedVideoFpsRanges.push(byteString);
        }

        static /* synthetic */ kotlin.reflect.jvm.internal.impl.protobuf.ByteString getHighSpeedVideoFpsRanges(kotlin.reflect.jvm.internal.impl.protobuf.RopeByteString.Balancer balancer, kotlin.reflect.jvm.internal.impl.protobuf.ByteString byteString, kotlin.reflect.jvm.internal.impl.protobuf.ByteString byteString2) {
            balancer.getHighSpeedVideoSizes(byteString);
            balancer.getHighSpeedVideoSizes(byteString2);
            kotlin.reflect.jvm.internal.impl.protobuf.ByteString pop = balancer.getHighSpeedVideoFpsRanges.pop();
            while (!balancer.getHighSpeedVideoFpsRanges.isEmpty()) {
                pop = new kotlin.reflect.jvm.internal.impl.protobuf.RopeByteString(balancer.getHighSpeedVideoFpsRanges.pop(), pop, (byte) 0);
            }
            return pop;
        }
    }

    static class PieceIterator implements java.util.Iterator<kotlin.reflect.jvm.internal.impl.protobuf.LiteralByteString> {
        kotlin.reflect.jvm.internal.impl.protobuf.LiteralByteString Camera2StreamConfigurationMap;
        private final java.util.Stack<kotlin.reflect.jvm.internal.impl.protobuf.RopeByteString> getHighSpeedVideoFpsRanges;

        /* synthetic */ PieceIterator(kotlin.reflect.jvm.internal.impl.protobuf.ByteString byteString, byte b) {
            this(byteString);
        }

        private PieceIterator(kotlin.reflect.jvm.internal.impl.protobuf.ByteString byteString) {
            this.getHighSpeedVideoFpsRanges = new java.util.Stack<>();
            this.Camera2StreamConfigurationMap = getHighSpeedVideoFpsRangesFor(byteString);
        }

        private kotlin.reflect.jvm.internal.impl.protobuf.LiteralByteString getHighSpeedVideoFpsRangesFor(kotlin.reflect.jvm.internal.impl.protobuf.ByteString byteString) {
            while (byteString instanceof kotlin.reflect.jvm.internal.impl.protobuf.RopeByteString) {
                kotlin.reflect.jvm.internal.impl.protobuf.RopeByteString ropeByteString = (kotlin.reflect.jvm.internal.impl.protobuf.RopeByteString) byteString;
                this.getHighSpeedVideoFpsRanges.push(ropeByteString);
                byteString = ropeByteString.getHighSpeedVideoSizes;
            }
            return (kotlin.reflect.jvm.internal.impl.protobuf.LiteralByteString) byteString;
        }

        final kotlin.reflect.jvm.internal.impl.protobuf.LiteralByteString Camera2StreamConfigurationMap() {
            while (!this.getHighSpeedVideoFpsRanges.isEmpty()) {
                kotlin.reflect.jvm.internal.impl.protobuf.LiteralByteString highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRanges.pop().getHighSpeedVideoFpsRanges);
                if (!highSpeedVideoFpsRangesFor.isEmpty()) {
                    return highSpeedVideoFpsRangesFor;
                }
            }
            return null;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.Camera2StreamConfigurationMap != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // java.util.Iterator
        public /* synthetic */ kotlin.reflect.jvm.internal.impl.protobuf.LiteralByteString next() {
            kotlin.reflect.jvm.internal.impl.protobuf.LiteralByteString literalByteString = this.Camera2StreamConfigurationMap;
            if (literalByteString == null) {
                throw new java.util.NoSuchElementException();
            }
            this.Camera2StreamConfigurationMap = Camera2StreamConfigurationMap();
            return literalByteString;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString, java.lang.Iterable
    /* renamed from: iterator, reason: avoid collision after fix types in other method */
    public java.util.Iterator<java.lang.Byte> iterator2() {
        return new kotlin.reflect.jvm.internal.impl.protobuf.RopeByteString.RopeByteIterator(this, (byte) 0);
    }

    class RopeByteIterator implements kotlin.reflect.jvm.internal.impl.protobuf.ByteString.ByteIterator {
        int getHighSpeedVideoFpsRanges;
        private kotlin.reflect.jvm.internal.impl.protobuf.ByteString.ByteIterator getHighSpeedVideoFpsRangesFor;
        private final kotlin.reflect.jvm.internal.impl.protobuf.RopeByteString.PieceIterator getHighSpeedVideoSizes;

        /* synthetic */ RopeByteIterator(kotlin.reflect.jvm.internal.impl.protobuf.RopeByteString ropeByteString, byte b) {
            this();
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.reflect.jvm.internal.impl.protobuf.ByteString$ByteIterator] */
        private RopeByteIterator() {
            kotlin.reflect.jvm.internal.impl.protobuf.RopeByteString.PieceIterator pieceIterator = new kotlin.reflect.jvm.internal.impl.protobuf.RopeByteString.PieceIterator(kotlin.reflect.jvm.internal.impl.protobuf.RopeByteString.this, (byte) 0);
            this.getHighSpeedVideoSizes = pieceIterator;
            kotlin.reflect.jvm.internal.impl.protobuf.LiteralByteString literalByteString = pieceIterator.Camera2StreamConfigurationMap;
            if (literalByteString == null) {
                throw new java.util.NoSuchElementException();
            }
            pieceIterator.Camera2StreamConfigurationMap = pieceIterator.Camera2StreamConfigurationMap();
            this.getHighSpeedVideoFpsRangesFor = literalByteString.iterator();
            this.getHighSpeedVideoFpsRanges = kotlin.reflect.jvm.internal.impl.protobuf.RopeByteString.this.size();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.getHighSpeedVideoFpsRanges > 0;
        }

        /* JADX WARN: Type inference failed for: r0v8, types: [kotlin.reflect.jvm.internal.impl.protobuf.ByteString$ByteIterator] */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString.ByteIterator
        public byte nextByte() {
            if (!this.getHighSpeedVideoFpsRangesFor.hasNext()) {
                kotlin.reflect.jvm.internal.impl.protobuf.RopeByteString.PieceIterator pieceIterator = this.getHighSpeedVideoSizes;
                kotlin.reflect.jvm.internal.impl.protobuf.LiteralByteString literalByteString = pieceIterator.Camera2StreamConfigurationMap;
                if (literalByteString == null) {
                    throw new java.util.NoSuchElementException();
                }
                pieceIterator.Camera2StreamConfigurationMap = pieceIterator.Camera2StreamConfigurationMap();
                this.getHighSpeedVideoFpsRangesFor = literalByteString.iterator();
            }
            this.getHighSpeedVideoFpsRanges--;
            return this.getHighSpeedVideoFpsRangesFor.nextByte();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // java.util.Iterator
        public /* synthetic */ java.lang.Byte next() {
            return java.lang.Byte.valueOf(nextByte());
        }
    }

    class RopeInputStream extends java.io.InputStream {
        private kotlin.reflect.jvm.internal.impl.protobuf.LiteralByteString Camera2StreamConfigurationMap;
        private int getHighSpeedVideoFpsRanges;
        private int getHighSpeedVideoFpsRangesFor;
        private int getHighSpeedVideoSizes;
        private int getHighSpeedVideoSizesFor;
        private kotlin.reflect.jvm.internal.impl.protobuf.RopeByteString.PieceIterator getOutputMinFrameDuration;

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        public RopeInputStream() {
            getHighResolutionOutputSizeshNQ4ISI();
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
                throw new java.lang.IndexOutOfBoundsException();
            }
            return getHighSpeedVideoFpsRangesFor(bArr, i, i2);
        }

        @Override // java.io.InputStream
        public long skip(long j) {
            if (j < 0) {
                throw new java.lang.IndexOutOfBoundsException();
            }
            if (j > androidx.collection.SieveCacheKt.NodeLinkMask) {
                j = 2147483647L;
            }
            return getHighSpeedVideoFpsRangesFor(null, 0, (int) j);
        }

        private int getHighSpeedVideoFpsRangesFor(byte[] bArr, int i, int i2) {
            int i3 = i2;
            while (true) {
                if (i3 <= 0) {
                    break;
                }
                Camera2StreamConfigurationMap();
                if (this.Camera2StreamConfigurationMap != null) {
                    int min = java.lang.Math.min(this.getHighSpeedVideoFpsRangesFor - this.getHighSpeedVideoFpsRanges, i3);
                    if (bArr != null) {
                        this.Camera2StreamConfigurationMap.copyTo(bArr, this.getHighSpeedVideoFpsRanges, i, min);
                        i += min;
                    }
                    this.getHighSpeedVideoFpsRanges += min;
                    i3 -= min;
                } else if (i3 == i2) {
                    return -1;
                }
            }
            return i2 - i3;
        }

        @Override // java.io.InputStream
        public int read() throws java.io.IOException {
            Camera2StreamConfigurationMap();
            kotlin.reflect.jvm.internal.impl.protobuf.LiteralByteString literalByteString = this.Camera2StreamConfigurationMap;
            if (literalByteString == null) {
                return -1;
            }
            int i = this.getHighSpeedVideoFpsRanges;
            this.getHighSpeedVideoFpsRanges = i + 1;
            return literalByteString.getHighResolutionOutputSizeshNQ4ISI(i) & 255;
        }

        @Override // java.io.InputStream
        public int available() throws java.io.IOException {
            return kotlin.reflect.jvm.internal.impl.protobuf.RopeByteString.this.size() - (this.getHighSpeedVideoSizes + this.getHighSpeedVideoFpsRanges);
        }

        @Override // java.io.InputStream
        public void mark(int i) {
            this.getHighSpeedVideoSizesFor = this.getHighSpeedVideoSizes + this.getHighSpeedVideoFpsRanges;
        }

        @Override // java.io.InputStream
        public void reset() {
            synchronized (this) {
                getHighResolutionOutputSizeshNQ4ISI();
                getHighSpeedVideoFpsRangesFor(null, 0, this.getHighSpeedVideoSizesFor);
            }
        }

        private void getHighResolutionOutputSizeshNQ4ISI() {
            kotlin.reflect.jvm.internal.impl.protobuf.RopeByteString.PieceIterator pieceIterator = new kotlin.reflect.jvm.internal.impl.protobuf.RopeByteString.PieceIterator(kotlin.reflect.jvm.internal.impl.protobuf.RopeByteString.this, (byte) 0);
            this.getOutputMinFrameDuration = pieceIterator;
            kotlin.reflect.jvm.internal.impl.protobuf.LiteralByteString literalByteString = pieceIterator.Camera2StreamConfigurationMap;
            if (literalByteString == null) {
                throw new java.util.NoSuchElementException();
            }
            pieceIterator.Camera2StreamConfigurationMap = pieceIterator.Camera2StreamConfigurationMap();
            this.Camera2StreamConfigurationMap = literalByteString;
            this.getHighSpeedVideoFpsRangesFor = literalByteString.size();
            this.getHighSpeedVideoFpsRanges = 0;
            this.getHighSpeedVideoSizes = 0;
        }

        private void Camera2StreamConfigurationMap() {
            if (this.Camera2StreamConfigurationMap != null) {
                int i = this.getHighSpeedVideoFpsRanges;
                int i2 = this.getHighSpeedVideoFpsRangesFor;
                if (i == i2) {
                    this.getHighSpeedVideoSizes += i2;
                    this.getHighSpeedVideoFpsRanges = 0;
                    if (this.getOutputMinFrameDuration.hasNext()) {
                        kotlin.reflect.jvm.internal.impl.protobuf.RopeByteString.PieceIterator pieceIterator = this.getOutputMinFrameDuration;
                        kotlin.reflect.jvm.internal.impl.protobuf.LiteralByteString literalByteString = pieceIterator.Camera2StreamConfigurationMap;
                        if (literalByteString == null) {
                            throw new java.util.NoSuchElementException();
                        }
                        pieceIterator.Camera2StreamConfigurationMap = pieceIterator.Camera2StreamConfigurationMap();
                        this.Camera2StreamConfigurationMap = literalByteString;
                        this.getHighSpeedVideoFpsRangesFor = literalByteString.size();
                        return;
                    }
                    this.Camera2StreamConfigurationMap = null;
                    this.getHighSpeedVideoFpsRangesFor = 0;
                }
            }
        }
    }
}
