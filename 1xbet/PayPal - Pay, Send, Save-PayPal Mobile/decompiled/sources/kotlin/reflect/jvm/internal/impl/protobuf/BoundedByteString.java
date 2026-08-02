package kotlin.reflect.jvm.internal.impl.protobuf;

/* loaded from: classes5.dex */
class BoundedByteString extends kotlin.reflect.jvm.internal.impl.protobuf.LiteralByteString {
    private final int Camera2StreamConfigurationMap;
    final int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LiteralByteString, kotlin.reflect.jvm.internal.impl.protobuf.ByteString, java.lang.Iterable
    public /* bridge */ /* synthetic */ java.util.Iterator<java.lang.Byte> iterator() {
        return iterator();
    }

    BoundedByteString(byte[] bArr, int i, int i2) {
        super(bArr);
        if (i < 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(29);
            sb.append("Offset too small: ");
            sb.append(i);
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        if (i2 < 0) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(29);
            sb2.append("Length too small: ");
            sb2.append(i);
            throw new java.lang.IllegalArgumentException(sb2.toString());
        }
        if (i + i2 > bArr.length) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder(48);
            sb3.append("Offset+Length too large: ");
            sb3.append(i);
            sb3.append("+");
            sb3.append(i2);
            throw new java.lang.IllegalArgumentException(sb3.toString());
        }
        this.getHighSpeedVideoFpsRangesFor = i;
        this.Camera2StreamConfigurationMap = i2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LiteralByteString
    public final byte getHighResolutionOutputSizeshNQ4ISI(int i) {
        if (i < 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(28);
            sb.append("Index too small: ");
            sb.append(i);
            throw new java.lang.ArrayIndexOutOfBoundsException(sb.toString());
        }
        if (i >= size()) {
            int size = size();
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(41);
            sb2.append("Index too large: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(size);
            throw new java.lang.ArrayIndexOutOfBoundsException(sb2.toString());
        }
        return this.getHighSpeedVideoSizes[this.getHighSpeedVideoFpsRangesFor + i];
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LiteralByteString, kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public int size() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LiteralByteString
    protected final int Camera2StreamConfigurationMap() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LiteralByteString, kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    protected void copyToInternal(byte[] bArr, int i, int i2, int i3) {
        java.lang.System.arraycopy(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor + i, bArr, i2, i3);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LiteralByteString, kotlin.reflect.jvm.internal.impl.protobuf.ByteString, java.lang.Iterable
    /* renamed from: iterator, reason: avoid collision after fix types in other method */
    public java.util.Iterator<java.lang.Byte> iterator2() {
        return new kotlin.reflect.jvm.internal.impl.protobuf.BoundedByteString.BoundedByteIterator(this, (byte) 0);
    }

    class BoundedByteIterator implements kotlin.reflect.jvm.internal.impl.protobuf.ByteString.ByteIterator {
        private int Camera2StreamConfigurationMap;
        private final int getHighSpeedVideoSizes;

        /* synthetic */ BoundedByteIterator(kotlin.reflect.jvm.internal.impl.protobuf.BoundedByteString boundedByteString, byte b) {
            this();
        }

        private BoundedByteIterator() {
            int i = kotlin.reflect.jvm.internal.impl.protobuf.BoundedByteString.this.getHighSpeedVideoFpsRangesFor;
            this.Camera2StreamConfigurationMap = i;
            this.getHighSpeedVideoSizes = i + kotlin.reflect.jvm.internal.impl.protobuf.BoundedByteString.this.size();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.Camera2StreamConfigurationMap < this.getHighSpeedVideoSizes;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString.ByteIterator
        public byte nextByte() {
            if (this.Camera2StreamConfigurationMap >= this.getHighSpeedVideoSizes) {
                throw new java.util.NoSuchElementException();
            }
            byte[] bArr = kotlin.reflect.jvm.internal.impl.protobuf.BoundedByteString.this.getHighSpeedVideoSizes;
            int i = this.Camera2StreamConfigurationMap;
            this.Camera2StreamConfigurationMap = i + 1;
            return bArr[i];
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
