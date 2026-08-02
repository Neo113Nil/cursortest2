package kotlin.reflect.jvm.internal.impl.protobuf;

/* loaded from: classes5.dex */
public abstract class ByteString implements java.lang.Iterable<java.lang.Byte> {
    public static final kotlin.reflect.jvm.internal.impl.protobuf.ByteString EMPTY = new kotlin.reflect.jvm.internal.impl.protobuf.LiteralByteString(new byte[0]);

    public interface ByteIterator extends java.util.Iterator<java.lang.Byte> {
        byte nextByte();
    }

    protected abstract void copyToInternal(byte[] bArr, int i, int i2, int i3);

    abstract void getHighSpeedVideoFpsRangesFor(java.io.OutputStream outputStream, int i, int i2) throws java.io.IOException;

    protected abstract int getTreeDepth();

    protected abstract boolean isBalanced();

    public abstract boolean isValidUtf8();

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.lang.Iterable
    public abstract java.util.Iterator<java.lang.Byte> iterator();

    public abstract kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream newCodedInput();

    protected abstract int partialHash(int i, int i2, int i3);

    protected abstract int partialIsValidUtf8(int i, int i2, int i3);

    protected abstract int peekCachedHashCode();

    public abstract int size();

    public abstract java.lang.String toString(java.lang.String str) throws java.io.UnsupportedEncodingException;

    ByteString() {
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public static kotlin.reflect.jvm.internal.impl.protobuf.ByteString copyFrom(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        java.lang.System.arraycopy(bArr, i, bArr2, 0, i2);
        return new kotlin.reflect.jvm.internal.impl.protobuf.LiteralByteString(bArr2);
    }

    public static kotlin.reflect.jvm.internal.impl.protobuf.ByteString copyFrom(byte[] bArr) {
        return copyFrom(bArr, 0, bArr.length);
    }

    public static kotlin.reflect.jvm.internal.impl.protobuf.ByteString copyFromUtf8(java.lang.String str) {
        try {
            return new kotlin.reflect.jvm.internal.impl.protobuf.LiteralByteString(str.getBytes("UTF-8"));
        } catch (java.io.UnsupportedEncodingException e) {
            throw new java.lang.RuntimeException("UTF-8 not supported?", e);
        }
    }

    public kotlin.reflect.jvm.internal.impl.protobuf.ByteString concat(kotlin.reflect.jvm.internal.impl.protobuf.ByteString byteString) {
        int size = size();
        int size2 = byteString.size();
        if (size + size2 >= androidx.collection.SieveCacheKt.NodeLinkMask) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(53);
            sb.append("ByteString would be too long: ");
            sb.append(size);
            sb.append("+");
            sb.append(size2);
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        return kotlin.reflect.jvm.internal.impl.protobuf.RopeByteString.getHighResolutionOutputSizeshNQ4ISI(this, byteString);
    }

    public static kotlin.reflect.jvm.internal.impl.protobuf.ByteString copyFrom(java.lang.Iterable<kotlin.reflect.jvm.internal.impl.protobuf.ByteString> iterable) {
        java.util.Collection collection;
        if (!(iterable instanceof java.util.Collection)) {
            collection = new java.util.ArrayList();
            java.util.Iterator<kotlin.reflect.jvm.internal.impl.protobuf.ByteString> it = iterable.iterator();
            while (it.hasNext()) {
                collection.add(it.next());
            }
        } else {
            collection = (java.util.Collection) iterable;
        }
        if (collection.isEmpty()) {
            return EMPTY;
        }
        return Camera2StreamConfigurationMap(collection.iterator(), collection.size());
    }

    private static kotlin.reflect.jvm.internal.impl.protobuf.ByteString Camera2StreamConfigurationMap(java.util.Iterator<kotlin.reflect.jvm.internal.impl.protobuf.ByteString> it, int i) {
        if (i == 1) {
            return it.next();
        }
        int i2 = i >>> 1;
        return Camera2StreamConfigurationMap(it, i2).concat(Camera2StreamConfigurationMap(it, i - i2));
    }

    public void copyTo(byte[] bArr, int i, int i2, int i3) {
        if (i < 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(30);
            sb.append("Source offset < 0: ");
            sb.append(i);
            throw new java.lang.IndexOutOfBoundsException(sb.toString());
        }
        if (i2 < 0) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(30);
            sb2.append("Target offset < 0: ");
            sb2.append(i2);
            throw new java.lang.IndexOutOfBoundsException(sb2.toString());
        }
        if (i3 < 0) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder(23);
            sb3.append("Length < 0: ");
            sb3.append(i3);
            throw new java.lang.IndexOutOfBoundsException(sb3.toString());
        }
        int i4 = i + i3;
        if (i4 > size()) {
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder(34);
            sb4.append("Source end offset < 0: ");
            sb4.append(i4);
            throw new java.lang.IndexOutOfBoundsException(sb4.toString());
        }
        int i5 = i2 + i3;
        if (i5 <= bArr.length) {
            if (i3 > 0) {
                copyToInternal(bArr, i, i2, i3);
            }
        } else {
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder(34);
            sb5.append("Target end offset < 0: ");
            sb5.append(i5);
            throw new java.lang.IndexOutOfBoundsException(sb5.toString());
        }
    }

    public byte[] toByteArray() {
        int size = size();
        if (size == 0) {
            return kotlin.reflect.jvm.internal.impl.protobuf.Internal.EMPTY_BYTE_ARRAY;
        }
        byte[] bArr = new byte[size];
        copyToInternal(bArr, 0, 0, size);
        return bArr;
    }

    public java.lang.String toStringUtf8() {
        try {
            return toString("UTF-8");
        } catch (java.io.UnsupportedEncodingException e) {
            throw new java.lang.RuntimeException("UTF-8 not supported?", e);
        }
    }

    public static kotlin.reflect.jvm.internal.impl.protobuf.ByteString.Output newOutput() {
        return new kotlin.reflect.jvm.internal.impl.protobuf.ByteString.Output();
    }

    public static final class Output extends java.io.OutputStream {
        private static final byte[] getHighResolutionOutputSizeshNQ4ISI = new byte[0];
        private int Camera2StreamConfigurationMap;
        private int getHighSpeedVideoFpsRanges;
        private final int getInputSizeshNQ4ISI = 128;
        private final java.util.ArrayList<kotlin.reflect.jvm.internal.impl.protobuf.ByteString> getHighSpeedVideoFpsRangesFor = new java.util.ArrayList<>();
        private byte[] getHighSpeedVideoSizes = new byte[128];

        Output() {
        }

        @Override // java.io.OutputStream
        public final void write(int i) {
            synchronized (this) {
                if (this.Camera2StreamConfigurationMap == this.getHighSpeedVideoSizes.length) {
                    getHighSpeedVideoFpsRangesFor(1);
                }
                byte[] bArr = this.getHighSpeedVideoSizes;
                int i2 = this.Camera2StreamConfigurationMap;
                this.Camera2StreamConfigurationMap = i2 + 1;
                bArr[i2] = (byte) i;
            }
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr, int i, int i2) {
            synchronized (this) {
                byte[] bArr2 = this.getHighSpeedVideoSizes;
                int length = bArr2.length;
                int i3 = this.Camera2StreamConfigurationMap;
                if (i2 <= length - i3) {
                    java.lang.System.arraycopy(bArr, i, bArr2, i3, i2);
                    this.Camera2StreamConfigurationMap += i2;
                } else {
                    int length2 = bArr2.length - i3;
                    java.lang.System.arraycopy(bArr, i, bArr2, i3, length2);
                    int i4 = i2 - length2;
                    getHighSpeedVideoFpsRangesFor(i4);
                    java.lang.System.arraycopy(bArr, i + length2, this.getHighSpeedVideoSizes, 0, i4);
                    this.Camera2StreamConfigurationMap = i4;
                }
            }
        }

        public final int size() {
            int i;
            int i2;
            synchronized (this) {
                i = this.getHighSpeedVideoFpsRanges;
                i2 = this.Camera2StreamConfigurationMap;
            }
            return i + i2;
        }

        public final java.lang.String toString() {
            return java.lang.String.format("<ByteString.Output@%s size=%d>", java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)), java.lang.Integer.valueOf(size()));
        }

        private void getHighSpeedVideoFpsRangesFor(int i) {
            this.getHighSpeedVideoFpsRangesFor.add(new kotlin.reflect.jvm.internal.impl.protobuf.LiteralByteString(this.getHighSpeedVideoSizes));
            int length = this.getHighSpeedVideoFpsRanges + this.getHighSpeedVideoSizes.length;
            this.getHighSpeedVideoFpsRanges = length;
            this.getHighSpeedVideoSizes = new byte[java.lang.Math.max(this.getInputSizeshNQ4ISI, java.lang.Math.max(i, length >>> 1))];
            this.Camera2StreamConfigurationMap = 0;
        }

        public final kotlin.reflect.jvm.internal.impl.protobuf.ByteString toByteString() {
            kotlin.reflect.jvm.internal.impl.protobuf.ByteString copyFrom;
            synchronized (this) {
                int i = this.Camera2StreamConfigurationMap;
                byte[] bArr = this.getHighSpeedVideoSizes;
                if (i >= bArr.length) {
                    this.getHighSpeedVideoFpsRangesFor.add(new kotlin.reflect.jvm.internal.impl.protobuf.LiteralByteString(this.getHighSpeedVideoSizes));
                    this.getHighSpeedVideoSizes = getHighResolutionOutputSizeshNQ4ISI;
                } else if (i > 0) {
                    byte[] bArr2 = new byte[i];
                    java.lang.System.arraycopy(bArr, 0, bArr2, 0, java.lang.Math.min(bArr.length, i));
                    this.getHighSpeedVideoFpsRangesFor.add(new kotlin.reflect.jvm.internal.impl.protobuf.LiteralByteString(bArr2));
                }
                this.getHighSpeedVideoFpsRanges += this.Camera2StreamConfigurationMap;
                this.Camera2StreamConfigurationMap = 0;
                copyFrom = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.copyFrom(this.getHighSpeedVideoFpsRangesFor);
            }
            return copyFrom;
        }
    }

    public java.lang.String toString() {
        return java.lang.String.format("<ByteString@%s size=%d>", java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)), java.lang.Integer.valueOf(size()));
    }
}
