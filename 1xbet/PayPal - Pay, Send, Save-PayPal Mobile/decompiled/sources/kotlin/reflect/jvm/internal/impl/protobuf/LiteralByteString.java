package kotlin.reflect.jvm.internal.impl.protobuf;

/* loaded from: classes5.dex */
class LiteralByteString extends kotlin.reflect.jvm.internal.impl.protobuf.ByteString {
    private int getHighResolutionOutputSizeshNQ4ISI = 0;
    protected final byte[] getHighSpeedVideoSizes;

    protected int Camera2StreamConfigurationMap() {
        return 0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    protected int getTreeDepth() {
        return 0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    protected boolean isBalanced() {
        return true;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString, java.lang.Iterable
    public /* bridge */ /* synthetic */ java.util.Iterator<java.lang.Byte> iterator() {
        return iterator();
    }

    LiteralByteString(byte[] bArr) {
        this.getHighSpeedVideoSizes = bArr;
    }

    public byte getHighResolutionOutputSizeshNQ4ISI(int i) {
        return this.getHighSpeedVideoSizes[i];
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public int size() {
        return this.getHighSpeedVideoSizes.length;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    protected void copyToInternal(byte[] bArr, int i, int i2, int i3) {
        java.lang.System.arraycopy(this.getHighSpeedVideoSizes, i, bArr, i2, i3);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    final void getHighSpeedVideoFpsRangesFor(java.io.OutputStream outputStream, int i, int i2) throws java.io.IOException {
        outputStream.write(this.getHighSpeedVideoSizes, Camera2StreamConfigurationMap() + i, i2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public java.lang.String toString(java.lang.String str) throws java.io.UnsupportedEncodingException {
        return new java.lang.String(this.getHighSpeedVideoSizes, Camera2StreamConfigurationMap(), size(), str);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public boolean isValidUtf8() {
        int Camera2StreamConfigurationMap = Camera2StreamConfigurationMap();
        return kotlin.reflect.jvm.internal.impl.protobuf.Utf8.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoSizes, Camera2StreamConfigurationMap, size() + Camera2StreamConfigurationMap);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    protected int partialIsValidUtf8(int i, int i2, int i3) {
        int Camera2StreamConfigurationMap = Camera2StreamConfigurationMap() + i2;
        return kotlin.reflect.jvm.internal.impl.protobuf.Utf8.Camera2StreamConfigurationMap(i, this.getHighSpeedVideoSizes, Camera2StreamConfigurationMap, i3 + Camera2StreamConfigurationMap);
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kotlin.reflect.jvm.internal.impl.protobuf.ByteString) || size() != ((kotlin.reflect.jvm.internal.impl.protobuf.ByteString) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof kotlin.reflect.jvm.internal.impl.protobuf.LiteralByteString) {
            return getHighSpeedVideoFpsRanges((kotlin.reflect.jvm.internal.impl.protobuf.LiteralByteString) obj, 0, size());
        }
        if (obj instanceof kotlin.reflect.jvm.internal.impl.protobuf.RopeByteString) {
            return obj.equals(this);
        }
        java.lang.String valueOf = java.lang.String.valueOf(java.lang.String.valueOf(obj.getClass()));
        java.lang.StringBuilder sb = new java.lang.StringBuilder(valueOf.length() + 49);
        sb.append("Has a new type of ByteString been created? Found ");
        sb.append(valueOf);
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    final boolean getHighSpeedVideoFpsRanges(kotlin.reflect.jvm.internal.impl.protobuf.LiteralByteString literalByteString, int i, int i2) {
        if (i2 > literalByteString.size()) {
            int size = size();
            java.lang.StringBuilder sb = new java.lang.StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i2);
            sb.append(size);
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        if (i + i2 > literalByteString.size()) {
            int size2 = literalByteString.size();
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(59);
            sb2.append("Ran off end of other: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            sb2.append(", ");
            sb2.append(size2);
            throw new java.lang.IllegalArgumentException(sb2.toString());
        }
        byte[] bArr = this.getHighSpeedVideoSizes;
        byte[] bArr2 = literalByteString.getHighSpeedVideoSizes;
        int Camera2StreamConfigurationMap = Camera2StreamConfigurationMap();
        int Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap();
        int Camera2StreamConfigurationMap3 = literalByteString.Camera2StreamConfigurationMap() + i;
        while (Camera2StreamConfigurationMap2 < Camera2StreamConfigurationMap + i2) {
            if (bArr[Camera2StreamConfigurationMap2] != bArr2[Camera2StreamConfigurationMap3]) {
                return false;
            }
            Camera2StreamConfigurationMap2++;
            Camera2StreamConfigurationMap3++;
        }
        return true;
    }

    public int hashCode() {
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            int size = size();
            i = partialHash(size, 0, size);
            if (i == 0) {
                i = 1;
            }
            this.getHighResolutionOutputSizeshNQ4ISI = i;
        }
        return i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    protected int peekCachedHashCode() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    protected int partialHash(int i, int i2, int i3) {
        byte[] bArr = this.getHighSpeedVideoSizes;
        int Camera2StreamConfigurationMap = Camera2StreamConfigurationMap() + i2;
        for (int i4 = Camera2StreamConfigurationMap; i4 < Camera2StreamConfigurationMap + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream newCodedInput() {
        return kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream.Camera2StreamConfigurationMap(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString, java.lang.Iterable
    public java.util.Iterator<java.lang.Byte> iterator() {
        return new kotlin.reflect.jvm.internal.impl.protobuf.LiteralByteString.LiteralByteIterator(this, (byte) 0);
    }

    class LiteralByteIterator implements kotlin.reflect.jvm.internal.impl.protobuf.ByteString.ByteIterator {
        private int Camera2StreamConfigurationMap;
        private final int getHighSpeedVideoFpsRanges;

        /* synthetic */ LiteralByteIterator(kotlin.reflect.jvm.internal.impl.protobuf.LiteralByteString literalByteString, byte b) {
            this();
        }

        private LiteralByteIterator() {
            this.Camera2StreamConfigurationMap = 0;
            this.getHighSpeedVideoFpsRanges = kotlin.reflect.jvm.internal.impl.protobuf.LiteralByteString.this.size();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.Camera2StreamConfigurationMap < this.getHighSpeedVideoFpsRanges;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString.ByteIterator
        public byte nextByte() {
            try {
                byte[] bArr = kotlin.reflect.jvm.internal.impl.protobuf.LiteralByteString.this.getHighSpeedVideoSizes;
                int i = this.Camera2StreamConfigurationMap;
                this.Camera2StreamConfigurationMap = i + 1;
                return bArr[i];
            } catch (java.lang.ArrayIndexOutOfBoundsException e) {
                throw new java.util.NoSuchElementException(e.getMessage());
            }
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
}
