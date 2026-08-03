package com.google.protobuf;

/* loaded from: classes4.dex */
final class RopeByteString extends com.google.protobuf.ByteString {
    static final int[] minLengthByDepth = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    private static final long serialVersionUID = 1;
    private final com.google.protobuf.ByteString left;
    private final int leftLength;
    private final com.google.protobuf.ByteString right;
    private final int totalLength;
    private final int treeDepth;

    private RopeByteString(com.google.protobuf.ByteString left, com.google.protobuf.ByteString right) {
        this.left = left;
        this.right = right;
        int size = left.size();
        this.leftLength = size;
        this.totalLength = size + right.size();
        this.treeDepth = java.lang.Math.max(left.getTreeDepth(), right.getTreeDepth()) + 1;
    }

    static com.google.protobuf.ByteString concatenate(com.google.protobuf.ByteString left, com.google.protobuf.ByteString right) {
        if (right.size() == 0) {
            return left;
        }
        if (left.size() == 0) {
            return right;
        }
        int size = left.size() + right.size();
        if (size < 128) {
            return concatenateBytes(left, right);
        }
        if (left instanceof com.google.protobuf.RopeByteString) {
            com.google.protobuf.RopeByteString ropeByteString = (com.google.protobuf.RopeByteString) left;
            if (ropeByteString.right.size() + right.size() < 128) {
                return new com.google.protobuf.RopeByteString(ropeByteString.left, concatenateBytes(ropeByteString.right, right));
            }
            if (ropeByteString.left.getTreeDepth() > ropeByteString.right.getTreeDepth() && ropeByteString.getTreeDepth() > right.getTreeDepth()) {
                return new com.google.protobuf.RopeByteString(ropeByteString.left, new com.google.protobuf.RopeByteString(ropeByteString.right, right));
            }
        }
        if (size >= minLength(java.lang.Math.max(left.getTreeDepth(), right.getTreeDepth()) + 1)) {
            return new com.google.protobuf.RopeByteString(left, right);
        }
        return new com.google.protobuf.RopeByteString.Balancer().balance(left, right);
    }

    private static com.google.protobuf.ByteString concatenateBytes(com.google.protobuf.ByteString left, com.google.protobuf.ByteString right) {
        int size = left.size();
        int size2 = right.size();
        byte[] bArr = new byte[size + size2];
        left.copyTo(bArr, 0, 0, size);
        right.copyTo(bArr, 0, size, size2);
        return com.google.protobuf.ByteString.wrap(bArr);
    }

    static com.google.protobuf.RopeByteString newInstanceForTest(com.google.protobuf.ByteString left, com.google.protobuf.ByteString right) {
        return new com.google.protobuf.RopeByteString(left, right);
    }

    static int minLength(int depth) {
        int[] iArr = minLengthByDepth;
        if (depth >= iArr.length) {
            return Integer.MAX_VALUE;
        }
        return iArr[depth];
    }

    @Override // com.google.protobuf.ByteString
    public byte byteAt(int index) {
        checkIndex(index, this.totalLength);
        return internalByteAt(index);
    }

    @Override // com.google.protobuf.ByteString
    byte internalByteAt(int index) {
        int i = this.leftLength;
        if (index < i) {
            return this.left.internalByteAt(index);
        }
        return this.right.internalByteAt(index - i);
    }

    @Override // com.google.protobuf.ByteString
    public int size() {
        return this.totalLength;
    }

    @Override // com.google.protobuf.ByteString, java.lang.Iterable
    /* renamed from: iterator */
    public java.util.Iterator<java.lang.Byte> iterator2() {
        return new com.google.protobuf.ByteString.AbstractByteIterator() { // from class: com.google.protobuf.RopeByteString.1
            com.google.protobuf.ByteString.ByteIterator current = nextPiece();
            final com.google.protobuf.RopeByteString.PieceIterator pieces;

            {
                this.pieces = new com.google.protobuf.RopeByteString.PieceIterator(com.google.protobuf.RopeByteString.this);
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [com.google.protobuf.ByteString$ByteIterator] */
            private com.google.protobuf.ByteString.ByteIterator nextPiece() {
                if (this.pieces.hasNext()) {
                    return this.pieces.next().iterator();
                }
                return null;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.current != null;
            }

            @Override // com.google.protobuf.ByteString.ByteIterator
            public byte nextByte() {
                com.google.protobuf.ByteString.ByteIterator byteIterator = this.current;
                if (byteIterator == null) {
                    throw new java.util.NoSuchElementException();
                }
                byte nextByte = byteIterator.nextByte();
                if (!this.current.hasNext()) {
                    this.current = nextPiece();
                }
                return nextByte;
            }
        };
    }

    @Override // com.google.protobuf.ByteString
    protected int getTreeDepth() {
        return this.treeDepth;
    }

    @Override // com.google.protobuf.ByteString
    protected boolean isBalanced() {
        return this.totalLength >= minLength(this.treeDepth);
    }

    @Override // com.google.protobuf.ByteString
    public com.google.protobuf.ByteString substring(int beginIndex, int endIndex) {
        int checkRange = checkRange(beginIndex, endIndex, this.totalLength);
        if (checkRange == 0) {
            return com.google.protobuf.ByteString.EMPTY;
        }
        if (checkRange == this.totalLength) {
            return this;
        }
        int i = this.leftLength;
        if (endIndex <= i) {
            return this.left.substring(beginIndex, endIndex);
        }
        if (beginIndex >= i) {
            return this.right.substring(beginIndex - i, endIndex - i);
        }
        return new com.google.protobuf.RopeByteString(this.left.substring(beginIndex), this.right.substring(0, endIndex - this.leftLength));
    }

    @Override // com.google.protobuf.ByteString
    protected void copyToInternal(byte[] target, int sourceOffset, int targetOffset, int numberToCopy) {
        int i = sourceOffset + numberToCopy;
        int i2 = this.leftLength;
        if (i <= i2) {
            this.left.copyToInternal(target, sourceOffset, targetOffset, numberToCopy);
        } else {
            if (sourceOffset >= i2) {
                this.right.copyToInternal(target, sourceOffset - i2, targetOffset, numberToCopy);
                return;
            }
            int i3 = i2 - sourceOffset;
            this.left.copyToInternal(target, sourceOffset, targetOffset, i3);
            this.right.copyToInternal(target, 0, targetOffset + i3, numberToCopy - i3);
        }
    }

    @Override // com.google.protobuf.ByteString
    public void copyTo(java.nio.ByteBuffer target) {
        this.left.copyTo(target);
        this.right.copyTo(target);
    }

    @Override // com.google.protobuf.ByteString
    public java.nio.ByteBuffer asReadOnlyByteBuffer() {
        return java.nio.ByteBuffer.wrap(toByteArray()).asReadOnlyBuffer();
    }

    @Override // com.google.protobuf.ByteString
    public java.util.List<java.nio.ByteBuffer> asReadOnlyByteBufferList() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.google.protobuf.RopeByteString.PieceIterator pieceIterator = new com.google.protobuf.RopeByteString.PieceIterator(this);
        while (pieceIterator.hasNext()) {
            arrayList.add(pieceIterator.next().asReadOnlyByteBuffer());
        }
        return arrayList;
    }

    @Override // com.google.protobuf.ByteString
    public void writeTo(java.io.OutputStream outputStream) throws java.io.IOException {
        this.left.writeTo(outputStream);
        this.right.writeTo(outputStream);
    }

    @Override // com.google.protobuf.ByteString
    void writeToInternal(java.io.OutputStream out, int sourceOffset, int numberToWrite) throws java.io.IOException {
        int i = sourceOffset + numberToWrite;
        int i2 = this.leftLength;
        if (i <= i2) {
            this.left.writeToInternal(out, sourceOffset, numberToWrite);
        } else {
            if (sourceOffset >= i2) {
                this.right.writeToInternal(out, sourceOffset - i2, numberToWrite);
                return;
            }
            int i3 = i2 - sourceOffset;
            this.left.writeToInternal(out, sourceOffset, i3);
            this.right.writeToInternal(out, 0, numberToWrite - i3);
        }
    }

    @Override // com.google.protobuf.ByteString
    void writeTo(com.google.protobuf.ByteOutput output) throws java.io.IOException {
        this.left.writeTo(output);
        this.right.writeTo(output);
    }

    @Override // com.google.protobuf.ByteString
    void writeToReverse(com.google.protobuf.ByteOutput output) throws java.io.IOException {
        this.right.writeToReverse(output);
        this.left.writeToReverse(output);
    }

    @Override // com.google.protobuf.ByteString
    protected java.lang.String toStringInternal(java.nio.charset.Charset charset) {
        return new java.lang.String(toByteArray(), charset);
    }

    @Override // com.google.protobuf.ByteString
    public boolean isValidUtf8() {
        int partialIsValidUtf8 = this.left.partialIsValidUtf8(0, 0, this.leftLength);
        com.google.protobuf.ByteString byteString = this.right;
        return byteString.partialIsValidUtf8(partialIsValidUtf8, 0, byteString.size()) == 0;
    }

    @Override // com.google.protobuf.ByteString
    protected int partialIsValidUtf8(int state, int offset, int length) {
        int i = offset + length;
        int i2 = this.leftLength;
        if (i <= i2) {
            return this.left.partialIsValidUtf8(state, offset, length);
        }
        if (offset >= i2) {
            return this.right.partialIsValidUtf8(state, offset - i2, length);
        }
        int i3 = i2 - offset;
        return this.right.partialIsValidUtf8(this.left.partialIsValidUtf8(state, offset, i3), 0, length - i3);
    }

    @Override // com.google.protobuf.ByteString
    public boolean equals(java.lang.Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof com.google.protobuf.ByteString)) {
            return false;
        }
        com.google.protobuf.ByteString byteString = (com.google.protobuf.ByteString) other;
        if (this.totalLength != byteString.size()) {
            return false;
        }
        if (this.totalLength == 0) {
            return true;
        }
        int peekCachedHashCode = peekCachedHashCode();
        int peekCachedHashCode2 = byteString.peekCachedHashCode();
        if (peekCachedHashCode == 0 || peekCachedHashCode2 == 0 || peekCachedHashCode == peekCachedHashCode2) {
            return equalsFragments(byteString);
        }
        return false;
    }

    private boolean equalsFragments(com.google.protobuf.ByteString byteString) {
        boolean equalsRange;
        com.google.protobuf.RopeByteString.PieceIterator pieceIterator = new com.google.protobuf.RopeByteString.PieceIterator(this);
        com.google.protobuf.ByteString.LeafByteString next = pieceIterator.next();
        com.google.protobuf.RopeByteString.PieceIterator pieceIterator2 = new com.google.protobuf.RopeByteString.PieceIterator(byteString);
        com.google.protobuf.ByteString.LeafByteString next2 = pieceIterator2.next();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int size = next.size() - i;
            int size2 = next2.size() - i2;
            int min = java.lang.Math.min(size, size2);
            if (i == 0) {
                equalsRange = next.equalsRange(next2, i2, min);
            } else {
                equalsRange = next2.equalsRange(next, i, min);
            }
            if (!equalsRange) {
                return false;
            }
            i3 += min;
            int i4 = this.totalLength;
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

    @Override // com.google.protobuf.ByteString
    protected int partialHash(int h, int offset, int length) {
        int i = offset + length;
        int i2 = this.leftLength;
        if (i <= i2) {
            return this.left.partialHash(h, offset, length);
        }
        if (offset >= i2) {
            return this.right.partialHash(h, offset - i2, length);
        }
        int i3 = i2 - offset;
        return this.right.partialHash(this.left.partialHash(h, offset, i3), 0, length - i3);
    }

    @Override // com.google.protobuf.ByteString
    public com.google.protobuf.CodedInputStream newCodedInput() {
        return com.google.protobuf.CodedInputStream.newInstance((java.lang.Iterable<java.nio.ByteBuffer>) asReadOnlyByteBufferList(), true);
    }

    @Override // com.google.protobuf.ByteString
    public java.io.InputStream newInput() {
        return new com.google.protobuf.RopeByteString.RopeInputStream();
    }

    private static class Balancer {
        private final java.util.ArrayDeque<com.google.protobuf.ByteString> prefixesStack;

        private Balancer() {
            this.prefixesStack = new java.util.ArrayDeque<>();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public com.google.protobuf.ByteString balance(com.google.protobuf.ByteString left, com.google.protobuf.ByteString right) {
            doBalance(left);
            doBalance(right);
            com.google.protobuf.ByteString pop = this.prefixesStack.pop();
            while (!this.prefixesStack.isEmpty()) {
                pop = new com.google.protobuf.RopeByteString(this.prefixesStack.pop(), pop);
            }
            return pop;
        }

        private void doBalance(com.google.protobuf.ByteString root) {
            if (root.isBalanced()) {
                insert(root);
                return;
            }
            if (root instanceof com.google.protobuf.RopeByteString) {
                com.google.protobuf.RopeByteString ropeByteString = (com.google.protobuf.RopeByteString) root;
                doBalance(ropeByteString.left);
                doBalance(ropeByteString.right);
            } else {
                throw new java.lang.IllegalArgumentException("Has a new type of ByteString been created? Found " + root.getClass());
            }
        }

        private void insert(com.google.protobuf.ByteString byteString) {
            int depthBinForLength = getDepthBinForLength(byteString.size());
            int minLength = com.google.protobuf.RopeByteString.minLength(depthBinForLength + 1);
            if (this.prefixesStack.isEmpty() || this.prefixesStack.peek().size() >= minLength) {
                this.prefixesStack.push(byteString);
                return;
            }
            int minLength2 = com.google.protobuf.RopeByteString.minLength(depthBinForLength);
            com.google.protobuf.ByteString pop = this.prefixesStack.pop();
            while (true) {
                if (this.prefixesStack.isEmpty() || this.prefixesStack.peek().size() >= minLength2) {
                    break;
                } else {
                    pop = new com.google.protobuf.RopeByteString(this.prefixesStack.pop(), pop);
                }
            }
            com.google.protobuf.RopeByteString ropeByteString = new com.google.protobuf.RopeByteString(pop, byteString);
            while (!this.prefixesStack.isEmpty()) {
                if (this.prefixesStack.peek().size() >= com.google.protobuf.RopeByteString.minLength(getDepthBinForLength(ropeByteString.size()) + 1)) {
                    break;
                } else {
                    ropeByteString = new com.google.protobuf.RopeByteString(this.prefixesStack.pop(), ropeByteString);
                }
            }
            this.prefixesStack.push(ropeByteString);
        }

        private int getDepthBinForLength(int length) {
            int binarySearch = java.util.Arrays.binarySearch(com.google.protobuf.RopeByteString.minLengthByDepth, length);
            return binarySearch < 0 ? (-(binarySearch + 1)) - 1 : binarySearch;
        }
    }

    private static final class PieceIterator implements java.util.Iterator<com.google.protobuf.ByteString.LeafByteString> {
        private final java.util.ArrayDeque<com.google.protobuf.RopeByteString> breadCrumbs;
        private com.google.protobuf.ByteString.LeafByteString next;

        private PieceIterator(com.google.protobuf.ByteString root) {
            if (root instanceof com.google.protobuf.RopeByteString) {
                com.google.protobuf.RopeByteString ropeByteString = (com.google.protobuf.RopeByteString) root;
                java.util.ArrayDeque<com.google.protobuf.RopeByteString> arrayDeque = new java.util.ArrayDeque<>(ropeByteString.getTreeDepth());
                this.breadCrumbs = arrayDeque;
                arrayDeque.push(ropeByteString);
                this.next = getLeafByLeft(ropeByteString.left);
                return;
            }
            this.breadCrumbs = null;
            this.next = (com.google.protobuf.ByteString.LeafByteString) root;
        }

        private com.google.protobuf.ByteString.LeafByteString getLeafByLeft(com.google.protobuf.ByteString root) {
            while (root instanceof com.google.protobuf.RopeByteString) {
                com.google.protobuf.RopeByteString ropeByteString = (com.google.protobuf.RopeByteString) root;
                this.breadCrumbs.push(ropeByteString);
                root = ropeByteString.left;
            }
            return (com.google.protobuf.ByteString.LeafByteString) root;
        }

        private com.google.protobuf.ByteString.LeafByteString getNextNonEmptyLeaf() {
            com.google.protobuf.ByteString.LeafByteString leafByLeft;
            do {
                java.util.ArrayDeque<com.google.protobuf.RopeByteString> arrayDeque = this.breadCrumbs;
                if (arrayDeque == null || arrayDeque.isEmpty()) {
                    return null;
                }
                leafByLeft = getLeafByLeft(this.breadCrumbs.pop().right);
            } while (leafByLeft.isEmpty());
            return leafByLeft;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.next != null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Iterator
        public com.google.protobuf.ByteString.LeafByteString next() {
            com.google.protobuf.ByteString.LeafByteString leafByteString = this.next;
            if (leafByteString == null) {
                throw new java.util.NoSuchElementException();
            }
            this.next = getNextNonEmptyLeaf();
            return leafByteString;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    java.lang.Object writeReplace() {
        return com.google.protobuf.ByteString.wrap(toByteArray());
    }

    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException {
        throw new java.io.InvalidObjectException("RopeByteStream instances are not to be serialized directly");
    }

    private class RopeInputStream extends java.io.InputStream {
        private com.google.protobuf.ByteString.LeafByteString currentPiece;
        private int currentPieceIndex;
        private int currentPieceOffsetInRope;
        private int currentPieceSize;
        private int mark;
        private com.google.protobuf.RopeByteString.PieceIterator pieceIterator;

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        public RopeInputStream() {
            initialize();
        }

        @Override // java.io.InputStream
        public int read(byte[] b, int offset, int length) {
            b.getClass();
            if (offset < 0 || length < 0 || length > b.length - offset) {
                throw new java.lang.IndexOutOfBoundsException();
            }
            int readSkipInternal = readSkipInternal(b, offset, length);
            if (readSkipInternal != 0) {
                return readSkipInternal;
            }
            if (length > 0 || availableInternal() == 0) {
                return -1;
            }
            return readSkipInternal;
        }

        @Override // java.io.InputStream
        public long skip(long length) {
            if (length < 0) {
                throw new java.lang.IndexOutOfBoundsException();
            }
            if (length > 2147483647L) {
                length = 2147483647L;
            }
            return readSkipInternal(null, 0, (int) length);
        }

        private int readSkipInternal(byte[] b, int offset, int length) {
            int i = length;
            while (i > 0) {
                advanceIfCurrentPieceFullyRead();
                if (this.currentPiece == null) {
                    break;
                }
                int min = java.lang.Math.min(this.currentPieceSize - this.currentPieceIndex, i);
                if (b != null) {
                    this.currentPiece.copyTo(b, this.currentPieceIndex, offset, min);
                    offset += min;
                }
                this.currentPieceIndex += min;
                i -= min;
            }
            return length - i;
        }

        @Override // java.io.InputStream
        public int read() throws java.io.IOException {
            advanceIfCurrentPieceFullyRead();
            com.google.protobuf.ByteString.LeafByteString leafByteString = this.currentPiece;
            if (leafByteString == null) {
                return -1;
            }
            int i = this.currentPieceIndex;
            this.currentPieceIndex = i + 1;
            return leafByteString.byteAt(i) & 255;
        }

        @Override // java.io.InputStream
        public int available() throws java.io.IOException {
            return availableInternal();
        }

        @Override // java.io.InputStream
        public void mark(int readAheadLimit) {
            this.mark = this.currentPieceOffsetInRope + this.currentPieceIndex;
        }

        @Override // java.io.InputStream
        public synchronized void reset() {
            initialize();
            readSkipInternal(null, 0, this.mark);
        }

        private void initialize() {
            com.google.protobuf.RopeByteString.PieceIterator pieceIterator = new com.google.protobuf.RopeByteString.PieceIterator(com.google.protobuf.RopeByteString.this);
            this.pieceIterator = pieceIterator;
            com.google.protobuf.ByteString.LeafByteString next = pieceIterator.next();
            this.currentPiece = next;
            this.currentPieceSize = next.size();
            this.currentPieceIndex = 0;
            this.currentPieceOffsetInRope = 0;
        }

        private void advanceIfCurrentPieceFullyRead() {
            if (this.currentPiece != null) {
                int i = this.currentPieceIndex;
                int i2 = this.currentPieceSize;
                if (i == i2) {
                    this.currentPieceOffsetInRope += i2;
                    this.currentPieceIndex = 0;
                    if (this.pieceIterator.hasNext()) {
                        com.google.protobuf.ByteString.LeafByteString next = this.pieceIterator.next();
                        this.currentPiece = next;
                        this.currentPieceSize = next.size();
                    } else {
                        this.currentPiece = null;
                        this.currentPieceSize = 0;
                    }
                }
            }
        }

        private int availableInternal() {
            return com.google.protobuf.RopeByteString.this.size() - (this.currentPieceOffsetInRope + this.currentPieceIndex);
        }
    }
}
