package androidx.content.preferences.protobuf;

/* loaded from: classes7.dex */
final class RopeByteString extends androidx.content.preferences.protobuf.ByteString {
    static final int[] getHighSpeedVideoSizes = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE, 377, androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    private static final long serialVersionUID = 1;
    private final int Camera2StreamConfigurationMap;
    private final androidx.content.preferences.protobuf.ByteString getHighResolutionOutputSizeshNQ4ISI;
    private final int getHighSpeedVideoFpsRanges;
    private final androidx.content.preferences.protobuf.ByteString getHighSpeedVideoFpsRangesFor;
    private final int getOutputFormats;

    /* synthetic */ RopeByteString(androidx.content.preferences.protobuf.ByteString byteString, androidx.content.preferences.protobuf.ByteString byteString2, byte b) {
        this(byteString, byteString2);
    }

    @Override // androidx.content.preferences.protobuf.ByteString, java.lang.Iterable
    /* renamed from: iterator, reason: avoid collision after fix types in other method */
    public final /* bridge */ /* synthetic */ java.util.Iterator<java.lang.Byte> iterator2() {
        return iterator2();
    }

    private RopeByteString(androidx.content.preferences.protobuf.ByteString byteString, androidx.content.preferences.protobuf.ByteString byteString2) {
        this.getHighResolutionOutputSizeshNQ4ISI = byteString;
        this.getHighSpeedVideoFpsRangesFor = byteString2;
        int size = byteString.size();
        this.Camera2StreamConfigurationMap = size;
        this.getHighSpeedVideoFpsRanges = size + byteString2.size();
        this.getOutputFormats = java.lang.Math.max(byteString.getTreeDepth(), byteString2.getTreeDepth()) + 1;
    }

    static androidx.content.preferences.protobuf.ByteString getHighSpeedVideoSizes(androidx.content.preferences.protobuf.ByteString byteString, androidx.content.preferences.protobuf.ByteString byteString2) {
        if (byteString2.size() == 0) {
            return byteString;
        }
        if (byteString.size() == 0) {
            return byteString2;
        }
        int size = byteString.size() + byteString2.size();
        if (size < 128) {
            return Camera2StreamConfigurationMap(byteString, byteString2);
        }
        if (byteString instanceof androidx.content.preferences.protobuf.RopeByteString) {
            androidx.content.preferences.protobuf.RopeByteString ropeByteString = (androidx.content.preferences.protobuf.RopeByteString) byteString;
            if (ropeByteString.getHighSpeedVideoFpsRangesFor.size() + byteString2.size() < 128) {
                return new androidx.content.preferences.protobuf.RopeByteString(ropeByteString.getHighResolutionOutputSizeshNQ4ISI, Camera2StreamConfigurationMap(ropeByteString.getHighSpeedVideoFpsRangesFor, byteString2));
            }
            if (ropeByteString.getHighResolutionOutputSizeshNQ4ISI.getTreeDepth() > ropeByteString.getHighSpeedVideoFpsRangesFor.getTreeDepth() && ropeByteString.getTreeDepth() > byteString2.getTreeDepth()) {
                return new androidx.content.preferences.protobuf.RopeByteString(ropeByteString.getHighResolutionOutputSizeshNQ4ISI, new androidx.content.preferences.protobuf.RopeByteString(ropeByteString.getHighSpeedVideoFpsRangesFor, byteString2));
            }
        }
        int max = java.lang.Math.max(byteString.getTreeDepth(), byteString2.getTreeDepth()) + 1;
        int[] iArr = getHighSpeedVideoSizes;
        if (size >= (max >= iArr.length ? Integer.MAX_VALUE : iArr[max])) {
            return new androidx.content.preferences.protobuf.RopeByteString(byteString, byteString2);
        }
        return androidx.datastore.preferences.protobuf.RopeByteString.Balancer.Camera2StreamConfigurationMap(new androidx.datastore.preferences.protobuf.RopeByteString.Balancer((byte) 0), byteString, byteString2);
    }

    private static androidx.content.preferences.protobuf.ByteString Camera2StreamConfigurationMap(androidx.content.preferences.protobuf.ByteString byteString, androidx.content.preferences.protobuf.ByteString byteString2) {
        int size = byteString.size();
        int size2 = byteString2.size();
        byte[] bArr = new byte[size + size2];
        byteString.copyTo(bArr, 0, 0, size);
        byteString2.copyTo(bArr, 0, size, size2);
        return new androidx.datastore.preferences.protobuf.ByteString.LiteralByteString(bArr);
    }

    static int getHighSpeedVideoFpsRangesFor(int i) {
        int[] iArr = getHighSpeedVideoSizes;
        if (i >= iArr.length) {
            return Integer.MAX_VALUE;
        }
        return iArr[i];
    }

    @Override // androidx.content.preferences.protobuf.ByteString
    public final byte byteAt(int i) {
        Camera2StreamConfigurationMap(i, this.getHighSpeedVideoFpsRanges);
        int i2 = this.Camera2StreamConfigurationMap;
        if (i < i2) {
            return this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap(i);
        }
        return this.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap(i - i2);
    }

    @Override // androidx.content.preferences.protobuf.ByteString
    final byte Camera2StreamConfigurationMap(int i) {
        int i2 = this.Camera2StreamConfigurationMap;
        if (i < i2) {
            return this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap(i);
        }
        return this.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap(i - i2);
    }

    @Override // androidx.content.preferences.protobuf.ByteString
    public final int size() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // androidx.content.preferences.protobuf.ByteString, java.lang.Iterable
    /* renamed from: iterator */
    public final java.util.Iterator<java.lang.Byte> iterator2() {
        return new androidx.datastore.preferences.protobuf.ByteString.AbstractByteIterator() { // from class: androidx.datastore.preferences.protobuf.RopeByteString.1
            androidx.datastore.preferences.protobuf.ByteString.ByteIterator getHighResolutionOutputSizeshNQ4ISI;
            final androidx.datastore.preferences.protobuf.RopeByteString.PieceIterator getHighSpeedVideoFpsRanges;

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r3v6, types: [androidx.datastore.preferences.protobuf.ByteString$ByteIterator] */
            {
                androidx.datastore.preferences.protobuf.ByteString.ByteIterator byteIterator;
                androidx.datastore.preferences.protobuf.RopeByteString.PieceIterator pieceIterator = new androidx.datastore.preferences.protobuf.RopeByteString.PieceIterator(androidx.content.preferences.protobuf.RopeByteString.this, (byte) 0);
                this.getHighSpeedVideoFpsRanges = pieceIterator;
                if (pieceIterator.hasNext()) {
                    androidx.datastore.preferences.protobuf.ByteString.LeafByteString leafByteString = pieceIterator.getHighSpeedVideoSizes;
                    if (leafByteString == null) {
                        throw new java.util.NoSuchElementException();
                    }
                    pieceIterator.getHighSpeedVideoSizes = pieceIterator.getHighSpeedVideoSizes();
                    byteIterator = leafByteString.iterator2();
                } else {
                    byteIterator = null;
                }
                this.getHighResolutionOutputSizeshNQ4ISI = byteIterator;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.getHighResolutionOutputSizeshNQ4ISI != null;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v7, types: [androidx.datastore.preferences.protobuf.ByteString$ByteIterator] */
            @Override // androidx.datastore.preferences.protobuf.ByteString.ByteIterator
            public byte nextByte() {
                androidx.datastore.preferences.protobuf.ByteString.ByteIterator byteIterator;
                androidx.datastore.preferences.protobuf.ByteString.ByteIterator byteIterator2 = this.getHighResolutionOutputSizeshNQ4ISI;
                if (byteIterator2 == null) {
                    throw new java.util.NoSuchElementException();
                }
                byte nextByte = byteIterator2.nextByte();
                if (!this.getHighResolutionOutputSizeshNQ4ISI.hasNext()) {
                    if (this.getHighSpeedVideoFpsRanges.hasNext()) {
                        androidx.datastore.preferences.protobuf.RopeByteString.PieceIterator pieceIterator = this.getHighSpeedVideoFpsRanges;
                        androidx.datastore.preferences.protobuf.ByteString.LeafByteString leafByteString = pieceIterator.getHighSpeedVideoSizes;
                        if (leafByteString == null) {
                            throw new java.util.NoSuchElementException();
                        }
                        pieceIterator.getHighSpeedVideoSizes = pieceIterator.getHighSpeedVideoSizes();
                        byteIterator = leafByteString.iterator2();
                    } else {
                        byteIterator = null;
                    }
                    this.getHighResolutionOutputSizeshNQ4ISI = byteIterator;
                }
                return nextByte;
            }
        };
    }

    @Override // androidx.content.preferences.protobuf.ByteString
    protected final int getTreeDepth() {
        return this.getOutputFormats;
    }

    @Override // androidx.content.preferences.protobuf.ByteString
    protected final boolean isBalanced() {
        int i = this.getHighSpeedVideoFpsRanges;
        int i2 = this.getOutputFormats;
        int[] iArr = getHighSpeedVideoSizes;
        return i >= (i2 >= iArr.length ? Integer.MAX_VALUE : iArr[i2]);
    }

    @Override // androidx.content.preferences.protobuf.ByteString
    public final androidx.content.preferences.protobuf.ByteString substring(int i, int i2) {
        int highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(i, i2, this.getHighSpeedVideoFpsRanges);
        if (highSpeedVideoFpsRangesFor == 0) {
            return androidx.content.preferences.protobuf.ByteString.EMPTY;
        }
        if (highSpeedVideoFpsRangesFor == this.getHighSpeedVideoFpsRanges) {
            return this;
        }
        int i3 = this.Camera2StreamConfigurationMap;
        if (i2 <= i3) {
            return this.getHighResolutionOutputSizeshNQ4ISI.substring(i, i2);
        }
        if (i >= i3) {
            return this.getHighSpeedVideoFpsRangesFor.substring(i - i3, i2 - i3);
        }
        return new androidx.content.preferences.protobuf.RopeByteString(this.getHighResolutionOutputSizeshNQ4ISI.substring(i), this.getHighSpeedVideoFpsRangesFor.substring(0, i2 - this.Camera2StreamConfigurationMap));
    }

    @Override // androidx.content.preferences.protobuf.ByteString
    protected final void copyToInternal(byte[] bArr, int i, int i2, int i3) {
        int i4 = this.Camera2StreamConfigurationMap;
        if (i + i3 <= i4) {
            this.getHighResolutionOutputSizeshNQ4ISI.copyToInternal(bArr, i, i2, i3);
        } else {
            if (i >= i4) {
                this.getHighSpeedVideoFpsRangesFor.copyToInternal(bArr, i - i4, i2, i3);
                return;
            }
            int i5 = i4 - i;
            this.getHighResolutionOutputSizeshNQ4ISI.copyToInternal(bArr, i, i2, i5);
            this.getHighSpeedVideoFpsRangesFor.copyToInternal(bArr, 0, i2 + i5, i3 - i5);
        }
    }

    @Override // androidx.content.preferences.protobuf.ByteString
    public final void copyTo(java.nio.ByteBuffer byteBuffer) {
        this.getHighResolutionOutputSizeshNQ4ISI.copyTo(byteBuffer);
        this.getHighSpeedVideoFpsRangesFor.copyTo(byteBuffer);
    }

    @Override // androidx.content.preferences.protobuf.ByteString
    public final java.nio.ByteBuffer asReadOnlyByteBuffer() {
        return java.nio.ByteBuffer.wrap(toByteArray()).asReadOnlyBuffer();
    }

    @Override // androidx.content.preferences.protobuf.ByteString
    public final java.util.List<java.nio.ByteBuffer> asReadOnlyByteBufferList() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        androidx.datastore.preferences.protobuf.RopeByteString.PieceIterator pieceIterator = new androidx.datastore.preferences.protobuf.RopeByteString.PieceIterator(this, (byte) 0);
        while (pieceIterator.hasNext()) {
            androidx.datastore.preferences.protobuf.ByteString.LeafByteString leafByteString = pieceIterator.getHighSpeedVideoSizes;
            if (leafByteString == null) {
                throw new java.util.NoSuchElementException();
            }
            pieceIterator.getHighSpeedVideoSizes = pieceIterator.getHighSpeedVideoSizes();
            arrayList.add(leafByteString.asReadOnlyByteBuffer());
        }
        return arrayList;
    }

    @Override // androidx.content.preferences.protobuf.ByteString
    public final void writeTo(java.io.OutputStream outputStream) throws java.io.IOException {
        this.getHighResolutionOutputSizeshNQ4ISI.writeTo(outputStream);
        this.getHighSpeedVideoFpsRangesFor.writeTo(outputStream);
    }

    @Override // androidx.content.preferences.protobuf.ByteString
    final void getHighResolutionOutputSizeshNQ4ISI(androidx.content.preferences.protobuf.ByteOutput byteOutput) throws java.io.IOException {
        this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI(byteOutput);
        this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI(byteOutput);
    }

    @Override // androidx.content.preferences.protobuf.ByteString
    final void getHighSpeedVideoSizes(androidx.content.preferences.protobuf.ByteOutput byteOutput) throws java.io.IOException {
        this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes(byteOutput);
        this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes(byteOutput);
    }

    @Override // androidx.content.preferences.protobuf.ByteString
    protected final java.lang.String toStringInternal(java.nio.charset.Charset charset) {
        return new java.lang.String(toByteArray(), charset);
    }

    @Override // androidx.content.preferences.protobuf.ByteString
    public final boolean isValidUtf8() {
        int partialIsValidUtf8 = this.getHighResolutionOutputSizeshNQ4ISI.partialIsValidUtf8(0, 0, this.Camera2StreamConfigurationMap);
        androidx.content.preferences.protobuf.ByteString byteString = this.getHighSpeedVideoFpsRangesFor;
        return byteString.partialIsValidUtf8(partialIsValidUtf8, 0, byteString.size()) == 0;
    }

    @Override // androidx.content.preferences.protobuf.ByteString
    protected final int partialIsValidUtf8(int i, int i2, int i3) {
        int i4 = this.Camera2StreamConfigurationMap;
        if (i2 + i3 <= i4) {
            return this.getHighResolutionOutputSizeshNQ4ISI.partialIsValidUtf8(i, i2, i3);
        }
        if (i2 >= i4) {
            return this.getHighSpeedVideoFpsRangesFor.partialIsValidUtf8(i, i2 - i4, i3);
        }
        int i5 = i4 - i2;
        return this.getHighSpeedVideoFpsRangesFor.partialIsValidUtf8(this.getHighResolutionOutputSizeshNQ4ISI.partialIsValidUtf8(i, i2, i5), 0, i3 - i5);
    }

    @Override // androidx.content.preferences.protobuf.ByteString
    public final boolean equals(java.lang.Object obj) {
        boolean Camera2StreamConfigurationMap;
        if (obj == this) {
            return true;
        }
        byte b = 0;
        if (!(obj instanceof androidx.content.preferences.protobuf.ByteString)) {
            return false;
        }
        androidx.content.preferences.protobuf.ByteString byteString = (androidx.content.preferences.protobuf.ByteString) obj;
        if (this.getHighSpeedVideoFpsRanges != byteString.size()) {
            return false;
        }
        if (this.getHighSpeedVideoFpsRanges == 0) {
            return true;
        }
        int peekCachedHashCode = peekCachedHashCode();
        int peekCachedHashCode2 = byteString.peekCachedHashCode();
        if (peekCachedHashCode != 0 && peekCachedHashCode2 != 0 && peekCachedHashCode != peekCachedHashCode2) {
            return false;
        }
        androidx.datastore.preferences.protobuf.RopeByteString.PieceIterator pieceIterator = new androidx.datastore.preferences.protobuf.RopeByteString.PieceIterator(this, b);
        androidx.datastore.preferences.protobuf.ByteString.LeafByteString next = pieceIterator.next();
        androidx.datastore.preferences.protobuf.RopeByteString.PieceIterator pieceIterator2 = new androidx.datastore.preferences.protobuf.RopeByteString.PieceIterator(byteString, b);
        androidx.datastore.preferences.protobuf.ByteString.LeafByteString next2 = pieceIterator2.next();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int size = next.size() - i;
            int size2 = next2.size() - i2;
            int min = java.lang.Math.min(size, size2);
            if (i == 0) {
                Camera2StreamConfigurationMap = next.Camera2StreamConfigurationMap(next2, i2, min);
            } else {
                Camera2StreamConfigurationMap = next2.Camera2StreamConfigurationMap(next, i, min);
            }
            if (!Camera2StreamConfigurationMap) {
                return false;
            }
            i3 += min;
            int i4 = this.getHighSpeedVideoFpsRanges;
            if (i3 >= i4) {
                if (i3 == i4) {
                    return true;
                }
                throw new java.lang.IllegalStateException();
            }
            if (min == size) {
                i = 0;
                next = pieceIterator.next();
            } else {
                i += min;
                next = next;
            }
            if (min == size2) {
                next2 = pieceIterator2.next();
                i2 = 0;
            } else {
                i2 += min;
            }
        }
    }

    @Override // androidx.content.preferences.protobuf.ByteString
    protected final int partialHash(int i, int i2, int i3) {
        int i4 = this.Camera2StreamConfigurationMap;
        if (i2 + i3 <= i4) {
            return this.getHighResolutionOutputSizeshNQ4ISI.partialHash(i, i2, i3);
        }
        if (i2 >= i4) {
            return this.getHighSpeedVideoFpsRangesFor.partialHash(i, i2 - i4, i3);
        }
        int i5 = i4 - i2;
        return this.getHighSpeedVideoFpsRangesFor.partialHash(this.getHighResolutionOutputSizeshNQ4ISI.partialHash(i, i2, i5), 0, i3 - i5);
    }

    @Override // androidx.content.preferences.protobuf.ByteString
    public final androidx.content.preferences.protobuf.CodedInputStream newCodedInput() {
        return androidx.content.preferences.protobuf.CodedInputStream.getHighSpeedVideoFpsRanges((java.lang.Iterable<java.nio.ByteBuffer>) asReadOnlyByteBufferList(), true);
    }

    @Override // androidx.content.preferences.protobuf.ByteString
    public final java.io.InputStream newInput() {
        return new androidx.datastore.preferences.protobuf.RopeByteString.RopeInputStream();
    }

    static class Balancer {
        private final java.util.ArrayDeque<androidx.content.preferences.protobuf.ByteString> Camera2StreamConfigurationMap;

        private Balancer() {
            this.Camera2StreamConfigurationMap = new java.util.ArrayDeque<>();
        }

        /* synthetic */ Balancer(byte b) {
            this();
        }

        private void getHighSpeedVideoSizes(androidx.content.preferences.protobuf.ByteString byteString) {
            while (!byteString.isBalanced()) {
                if (byteString instanceof androidx.content.preferences.protobuf.RopeByteString) {
                    androidx.content.preferences.protobuf.RopeByteString ropeByteString = (androidx.content.preferences.protobuf.RopeByteString) byteString;
                    getHighSpeedVideoSizes(ropeByteString.getHighResolutionOutputSizeshNQ4ISI);
                    byteString = ropeByteString.getHighSpeedVideoFpsRangesFor;
                } else {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Has a new type of ByteString been created? Found ");
                    sb.append(byteString.getClass());
                    throw new java.lang.IllegalArgumentException(sb.toString());
                }
            }
            getHighSpeedVideoFpsRanges(byteString);
        }

        private void getHighSpeedVideoFpsRanges(androidx.content.preferences.protobuf.ByteString byteString) {
            byte b;
            int binarySearch = java.util.Arrays.binarySearch(androidx.content.preferences.protobuf.RopeByteString.getHighSpeedVideoSizes, byteString.size());
            if (binarySearch < 0) {
                binarySearch = (-(binarySearch + 1)) - 1;
            }
            int highSpeedVideoFpsRangesFor = androidx.content.preferences.protobuf.RopeByteString.getHighSpeedVideoFpsRangesFor(binarySearch + 1);
            if (this.Camera2StreamConfigurationMap.isEmpty() || this.Camera2StreamConfigurationMap.peek().size() >= highSpeedVideoFpsRangesFor) {
                this.Camera2StreamConfigurationMap.push(byteString);
                return;
            }
            int highSpeedVideoFpsRangesFor2 = androidx.content.preferences.protobuf.RopeByteString.getHighSpeedVideoFpsRangesFor(binarySearch);
            androidx.content.preferences.protobuf.ByteString pop = this.Camera2StreamConfigurationMap.pop();
            while (true) {
                b = 0;
                if (this.Camera2StreamConfigurationMap.isEmpty() || this.Camera2StreamConfigurationMap.peek().size() >= highSpeedVideoFpsRangesFor2) {
                    break;
                } else {
                    pop = new androidx.content.preferences.protobuf.RopeByteString(this.Camera2StreamConfigurationMap.pop(), pop, b);
                }
            }
            androidx.content.preferences.protobuf.RopeByteString ropeByteString = new androidx.content.preferences.protobuf.RopeByteString(pop, byteString, b);
            while (!this.Camera2StreamConfigurationMap.isEmpty()) {
                int binarySearch2 = java.util.Arrays.binarySearch(androidx.content.preferences.protobuf.RopeByteString.getHighSpeedVideoSizes, ropeByteString.size());
                if (binarySearch2 < 0) {
                    binarySearch2 = (-(binarySearch2 + 1)) - 1;
                }
                if (this.Camera2StreamConfigurationMap.peek().size() >= androidx.content.preferences.protobuf.RopeByteString.getHighSpeedVideoFpsRangesFor(binarySearch2 + 1)) {
                    break;
                } else {
                    ropeByteString = new androidx.content.preferences.protobuf.RopeByteString(this.Camera2StreamConfigurationMap.pop(), ropeByteString, b);
                }
            }
            this.Camera2StreamConfigurationMap.push(ropeByteString);
        }

        static /* synthetic */ androidx.content.preferences.protobuf.ByteString Camera2StreamConfigurationMap(androidx.datastore.preferences.protobuf.RopeByteString.Balancer balancer, androidx.content.preferences.protobuf.ByteString byteString, androidx.content.preferences.protobuf.ByteString byteString2) {
            balancer.getHighSpeedVideoSizes(byteString);
            balancer.getHighSpeedVideoSizes(byteString2);
            androidx.content.preferences.protobuf.ByteString pop = balancer.Camera2StreamConfigurationMap.pop();
            while (!balancer.Camera2StreamConfigurationMap.isEmpty()) {
                pop = new androidx.content.preferences.protobuf.RopeByteString(balancer.Camera2StreamConfigurationMap.pop(), pop, (byte) 0);
            }
            return pop;
        }
    }

    static final class PieceIterator implements java.util.Iterator<androidx.datastore.preferences.protobuf.ByteString.LeafByteString> {
        private final java.util.ArrayDeque<androidx.content.preferences.protobuf.RopeByteString> Camera2StreamConfigurationMap;
        androidx.datastore.preferences.protobuf.ByteString.LeafByteString getHighSpeedVideoSizes;

        /* synthetic */ PieceIterator(androidx.content.preferences.protobuf.ByteString byteString, byte b) {
            this(byteString);
        }

        private PieceIterator(androidx.content.preferences.protobuf.ByteString byteString) {
            if (byteString instanceof androidx.content.preferences.protobuf.RopeByteString) {
                androidx.content.preferences.protobuf.RopeByteString ropeByteString = (androidx.content.preferences.protobuf.RopeByteString) byteString;
                java.util.ArrayDeque<androidx.content.preferences.protobuf.RopeByteString> arrayDeque = new java.util.ArrayDeque<>(ropeByteString.getTreeDepth());
                this.Camera2StreamConfigurationMap = arrayDeque;
                arrayDeque.push(ropeByteString);
                this.getHighSpeedVideoSizes = getHighSpeedVideoSizes(ropeByteString.getHighResolutionOutputSizeshNQ4ISI);
                return;
            }
            this.Camera2StreamConfigurationMap = null;
            this.getHighSpeedVideoSizes = (androidx.datastore.preferences.protobuf.ByteString.LeafByteString) byteString;
        }

        private androidx.datastore.preferences.protobuf.ByteString.LeafByteString getHighSpeedVideoSizes(androidx.content.preferences.protobuf.ByteString byteString) {
            while (byteString instanceof androidx.content.preferences.protobuf.RopeByteString) {
                androidx.content.preferences.protobuf.RopeByteString ropeByteString = (androidx.content.preferences.protobuf.RopeByteString) byteString;
                this.Camera2StreamConfigurationMap.push(ropeByteString);
                byteString = ropeByteString.getHighResolutionOutputSizeshNQ4ISI;
            }
            return (androidx.datastore.preferences.protobuf.ByteString.LeafByteString) byteString;
        }

        final androidx.datastore.preferences.protobuf.ByteString.LeafByteString getHighSpeedVideoSizes() {
            androidx.datastore.preferences.protobuf.ByteString.LeafByteString highSpeedVideoSizes;
            do {
                java.util.ArrayDeque<androidx.content.preferences.protobuf.RopeByteString> arrayDeque = this.Camera2StreamConfigurationMap;
                if (arrayDeque == null || arrayDeque.isEmpty()) {
                    return null;
                }
                highSpeedVideoSizes = getHighSpeedVideoSizes(this.Camera2StreamConfigurationMap.pop().getHighSpeedVideoFpsRangesFor);
            } while (highSpeedVideoSizes.isEmpty());
            return highSpeedVideoSizes;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.getHighSpeedVideoSizes != null;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // java.util.Iterator
        public final /* synthetic */ androidx.datastore.preferences.protobuf.ByteString.LeafByteString next() {
            androidx.datastore.preferences.protobuf.ByteString.LeafByteString leafByteString = this.getHighSpeedVideoSizes;
            if (leafByteString == null) {
                throw new java.util.NoSuchElementException();
            }
            this.getHighSpeedVideoSizes = getHighSpeedVideoSizes();
            return leafByteString;
        }
    }

    final java.lang.Object writeReplace() {
        return new androidx.datastore.preferences.protobuf.ByteString.LiteralByteString(toByteArray());
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.IOException {
        throw new java.io.InvalidObjectException("RopeByteStream instances are not to be serialized directly");
    }

    class RopeInputStream extends java.io.InputStream {
        private int getHighResolutionOutputSizeshNQ4ISI;
        private int getHighSpeedVideoFpsRanges;
        private androidx.datastore.preferences.protobuf.ByteString.LeafByteString getHighSpeedVideoFpsRangesFor;
        private int getHighSpeedVideoSizes;
        private int getInputSizeshNQ4ISI;
        private androidx.datastore.preferences.protobuf.RopeByteString.PieceIterator getOutputFormats;

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        public RopeInputStream() {
            Camera2StreamConfigurationMap();
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
                throw new java.lang.IndexOutOfBoundsException();
            }
            int highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(bArr, i, i2);
            if (highSpeedVideoFpsRangesFor != 0) {
                return highSpeedVideoFpsRangesFor;
            }
            if (i2 <= 0) {
                if (androidx.content.preferences.protobuf.RopeByteString.this.size() - (this.getHighSpeedVideoSizes + this.getHighResolutionOutputSizeshNQ4ISI) != 0) {
                    return highSpeedVideoFpsRangesFor;
                }
            }
            return -1;
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
            while (i3 > 0) {
                getHighSpeedVideoFpsRangesFor();
                if (this.getHighSpeedVideoFpsRangesFor == null) {
                    break;
                }
                int min = java.lang.Math.min(this.getHighSpeedVideoFpsRanges - this.getHighResolutionOutputSizeshNQ4ISI, i3);
                if (bArr != null) {
                    this.getHighSpeedVideoFpsRangesFor.copyTo(bArr, this.getHighResolutionOutputSizeshNQ4ISI, i, min);
                    i += min;
                }
                this.getHighResolutionOutputSizeshNQ4ISI += min;
                i3 -= min;
            }
            return i2 - i3;
        }

        @Override // java.io.InputStream
        public int read() throws java.io.IOException {
            getHighSpeedVideoFpsRangesFor();
            androidx.datastore.preferences.protobuf.ByteString.LeafByteString leafByteString = this.getHighSpeedVideoFpsRangesFor;
            if (leafByteString == null) {
                return -1;
            }
            int i = this.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighResolutionOutputSizeshNQ4ISI = i + 1;
            return leafByteString.byteAt(i) & 255;
        }

        @Override // java.io.InputStream
        public void mark(int i) {
            this.getInputSizeshNQ4ISI = this.getHighSpeedVideoSizes + this.getHighResolutionOutputSizeshNQ4ISI;
        }

        @Override // java.io.InputStream
        public void reset() {
            synchronized (this) {
                Camera2StreamConfigurationMap();
                getHighSpeedVideoFpsRangesFor(null, 0, this.getInputSizeshNQ4ISI);
            }
        }

        private void Camera2StreamConfigurationMap() {
            androidx.datastore.preferences.protobuf.RopeByteString.PieceIterator pieceIterator = new androidx.datastore.preferences.protobuf.RopeByteString.PieceIterator(androidx.content.preferences.protobuf.RopeByteString.this, (byte) 0);
            this.getOutputFormats = pieceIterator;
            androidx.datastore.preferences.protobuf.ByteString.LeafByteString leafByteString = pieceIterator.getHighSpeedVideoSizes;
            if (leafByteString == null) {
                throw new java.util.NoSuchElementException();
            }
            pieceIterator.getHighSpeedVideoSizes = pieceIterator.getHighSpeedVideoSizes();
            this.getHighSpeedVideoFpsRangesFor = leafByteString;
            this.getHighSpeedVideoFpsRanges = leafByteString.size();
            this.getHighResolutionOutputSizeshNQ4ISI = 0;
            this.getHighSpeedVideoSizes = 0;
        }

        private void getHighSpeedVideoFpsRangesFor() {
            if (this.getHighSpeedVideoFpsRangesFor != null) {
                int i = this.getHighResolutionOutputSizeshNQ4ISI;
                int i2 = this.getHighSpeedVideoFpsRanges;
                if (i == i2) {
                    this.getHighSpeedVideoSizes += i2;
                    this.getHighResolutionOutputSizeshNQ4ISI = 0;
                    if (this.getOutputFormats.hasNext()) {
                        androidx.datastore.preferences.protobuf.RopeByteString.PieceIterator pieceIterator = this.getOutputFormats;
                        androidx.datastore.preferences.protobuf.ByteString.LeafByteString leafByteString = pieceIterator.getHighSpeedVideoSizes;
                        if (leafByteString == null) {
                            throw new java.util.NoSuchElementException();
                        }
                        pieceIterator.getHighSpeedVideoSizes = pieceIterator.getHighSpeedVideoSizes();
                        this.getHighSpeedVideoFpsRangesFor = leafByteString;
                        this.getHighSpeedVideoFpsRanges = leafByteString.size();
                        return;
                    }
                    this.getHighSpeedVideoFpsRangesFor = null;
                    this.getHighSpeedVideoFpsRanges = 0;
                }
            }
        }

        @Override // java.io.InputStream
        public int available() throws java.io.IOException {
            return androidx.content.preferences.protobuf.RopeByteString.this.size() - (this.getHighSpeedVideoSizes + this.getHighResolutionOutputSizeshNQ4ISI);
        }
    }
}
