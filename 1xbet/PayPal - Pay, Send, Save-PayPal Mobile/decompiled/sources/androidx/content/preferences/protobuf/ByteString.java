package androidx.content.preferences.protobuf;

@androidx.content.preferences.protobuf.CheckReturnValue
/* loaded from: classes3.dex */
public abstract class ByteString implements java.lang.Iterable<java.lang.Byte>, java.io.Serializable {
    public static final androidx.content.preferences.protobuf.ByteString EMPTY = new androidx.datastore.preferences.protobuf.ByteString.LiteralByteString(androidx.content.preferences.protobuf.Internal.EMPTY_BYTE_ARRAY);
    private static final java.util.Comparator<androidx.content.preferences.protobuf.ByteString> getHighResolutionOutputSizeshNQ4ISI;
    private static final androidx.datastore.preferences.protobuf.ByteString.ByteArrayCopier getHighSpeedVideoFpsRangesFor;
    private static final long serialVersionUID = 1;
    private int getHighSpeedVideoSizes = 0;

    interface ByteArrayCopier {
        byte[] getHighSpeedVideoSizes(byte[] bArr, int i, int i2);
    }

    public interface ByteIterator extends java.util.Iterator<java.lang.Byte> {
        byte nextByte();
    }

    static /* synthetic */ int getHighSpeedVideoFpsRanges(byte b) {
        return b & 255;
    }

    abstract byte Camera2StreamConfigurationMap(int i);

    public abstract java.nio.ByteBuffer asReadOnlyByteBuffer();

    public abstract java.util.List<java.nio.ByteBuffer> asReadOnlyByteBufferList();

    public abstract byte byteAt(int i);

    public abstract void copyTo(java.nio.ByteBuffer byteBuffer);

    protected abstract void copyToInternal(byte[] bArr, int i, int i2, int i3);

    public abstract boolean equals(java.lang.Object obj);

    abstract void getHighResolutionOutputSizeshNQ4ISI(androidx.content.preferences.protobuf.ByteOutput byteOutput) throws java.io.IOException;

    abstract void getHighSpeedVideoSizes(androidx.content.preferences.protobuf.ByteOutput byteOutput) throws java.io.IOException;

    protected abstract int getTreeDepth();

    protected abstract boolean isBalanced();

    public abstract boolean isValidUtf8();

    public abstract androidx.content.preferences.protobuf.CodedInputStream newCodedInput();

    public abstract java.io.InputStream newInput();

    protected abstract int partialHash(int i, int i2, int i3);

    protected abstract int partialIsValidUtf8(int i, int i2, int i3);

    public abstract int size();

    public abstract androidx.content.preferences.protobuf.ByteString substring(int i, int i2);

    protected abstract java.lang.String toStringInternal(java.nio.charset.Charset charset);

    public abstract void writeTo(java.io.OutputStream outputStream) throws java.io.IOException;

    static {
        byte b = 0;
        getHighSpeedVideoFpsRangesFor = androidx.content.preferences.protobuf.Android.getHighSpeedVideoFpsRangesFor() ? new androidx.datastore.preferences.protobuf.ByteString.SystemByteArrayCopier(b) : new androidx.datastore.preferences.protobuf.ByteString.ArraysByteArrayCopier(b);
        getHighResolutionOutputSizeshNQ4ISI = new java.util.Comparator<androidx.content.preferences.protobuf.ByteString>() { // from class: androidx.datastore.preferences.protobuf.ByteString.2
            /* JADX WARN: Type inference failed for: r0v0, types: [androidx.datastore.preferences.protobuf.ByteString$ByteIterator] */
            /* JADX WARN: Type inference failed for: r1v0, types: [androidx.datastore.preferences.protobuf.ByteString$ByteIterator] */
            @Override // java.util.Comparator
            public /* synthetic */ int compare(androidx.content.preferences.protobuf.ByteString byteString, androidx.content.preferences.protobuf.ByteString byteString2) {
                androidx.content.preferences.protobuf.ByteString byteString3 = byteString;
                androidx.content.preferences.protobuf.ByteString byteString4 = byteString2;
                ?? iterator2 = byteString3.iterator2();
                ?? iterator22 = byteString4.iterator2();
                while (iterator2.hasNext() && iterator22.hasNext()) {
                    int compareTo = java.lang.Integer.valueOf(androidx.content.preferences.protobuf.ByteString.getHighSpeedVideoFpsRanges(iterator2.nextByte())).compareTo(java.lang.Integer.valueOf(androidx.content.preferences.protobuf.ByteString.getHighSpeedVideoFpsRanges(iterator22.nextByte())));
                    if (compareTo != 0) {
                        return compareTo;
                    }
                }
                return java.lang.Integer.valueOf(byteString3.size()).compareTo(java.lang.Integer.valueOf(byteString4.size()));
            }
        };
    }

    static final class SystemByteArrayCopier implements androidx.datastore.preferences.protobuf.ByteString.ByteArrayCopier {
        private SystemByteArrayCopier() {
        }

        /* synthetic */ SystemByteArrayCopier(byte b) {
            this();
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.ByteArrayCopier
        public final byte[] getHighSpeedVideoSizes(byte[] bArr, int i, int i2) {
            byte[] bArr2 = new byte[i2];
            java.lang.System.arraycopy(bArr, i, bArr2, 0, i2);
            return bArr2;
        }
    }

    static final class ArraysByteArrayCopier implements androidx.datastore.preferences.protobuf.ByteString.ByteArrayCopier {
        private ArraysByteArrayCopier() {
        }

        /* synthetic */ ArraysByteArrayCopier(byte b) {
            this();
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.ByteArrayCopier
        public final byte[] getHighSpeedVideoSizes(byte[] bArr, int i, int i2) {
            return java.util.Arrays.copyOfRange(bArr, i, i2 + i);
        }
    }

    ByteString() {
    }

    @Override // java.lang.Iterable
    /* renamed from: iterator, reason: merged with bridge method [inline-methods] */
    public java.util.Iterator<java.lang.Byte> iterator2() {
        return new androidx.datastore.preferences.protobuf.ByteString.AbstractByteIterator() { // from class: androidx.datastore.preferences.protobuf.ByteString.1
            private final int getHighSpeedVideoFpsRanges;
            private int getHighSpeedVideoFpsRangesFor = 0;

            {
                this.getHighSpeedVideoFpsRanges = androidx.content.preferences.protobuf.ByteString.this.size();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.getHighSpeedVideoFpsRangesFor < this.getHighSpeedVideoFpsRanges;
            }

            @Override // androidx.datastore.preferences.protobuf.ByteString.ByteIterator
            public byte nextByte() {
                int i = this.getHighSpeedVideoFpsRangesFor;
                if (i >= this.getHighSpeedVideoFpsRanges) {
                    throw new java.util.NoSuchElementException();
                }
                this.getHighSpeedVideoFpsRangesFor = i + 1;
                return androidx.content.preferences.protobuf.ByteString.this.Camera2StreamConfigurationMap(i);
            }
        };
    }

    static abstract class AbstractByteIterator implements androidx.datastore.preferences.protobuf.ByteString.ByteIterator {
        AbstractByteIterator() {
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // java.util.Iterator
        public /* synthetic */ java.lang.Byte next() {
            return java.lang.Byte.valueOf(nextByte());
        }
    }

    public final boolean isEmpty() {
        return size() == 0;
    }

    public static final androidx.content.preferences.protobuf.ByteString empty() {
        return EMPTY;
    }

    private static int Camera2StreamConfigurationMap(java.lang.String str, int i) {
        char charAt = str.charAt(i);
        int i2 = (charAt < '0' || charAt > '9') ? (charAt < 'A' || charAt > 'F') ? (charAt < 'a' || charAt > 'f') ? -1 : charAt - 'W' : charAt - '7' : charAt - com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
        if (i2 != -1) {
            return i2;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid hexString ");
        sb.append(str);
        sb.append(" must only contain [0-9a-fA-F] but contained ");
        sb.append(str.charAt(i));
        sb.append(" at index ");
        sb.append(i);
        throw new java.lang.NumberFormatException(sb.toString());
    }

    public static java.util.Comparator<androidx.content.preferences.protobuf.ByteString> unsignedLexicographicalComparator() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }

    public final androidx.content.preferences.protobuf.ByteString substring(int i) {
        return substring(i, size());
    }

    public final boolean startsWith(androidx.content.preferences.protobuf.ByteString byteString) {
        return size() >= byteString.size() && substring(0, byteString.size()).equals(byteString);
    }

    public final boolean endsWith(androidx.content.preferences.protobuf.ByteString byteString) {
        return size() >= byteString.size() && substring(size() - byteString.size()).equals(byteString);
    }

    public static androidx.content.preferences.protobuf.ByteString fromHex(java.lang.String str) {
        if (str.length() % 2 != 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid hexString ");
            sb.append(str);
            sb.append(" of length ");
            sb.append(str.length());
            sb.append(" must be even.");
            throw new java.lang.NumberFormatException(sb.toString());
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) (Camera2StreamConfigurationMap(str, i2 + 1) | (Camera2StreamConfigurationMap(str, i2) << 4));
        }
        return new androidx.datastore.preferences.protobuf.ByteString.LiteralByteString(bArr);
    }

    public static androidx.content.preferences.protobuf.ByteString copyFrom(byte[] bArr, int i, int i2) {
        getHighSpeedVideoFpsRangesFor(i, i + i2, bArr.length);
        return new androidx.datastore.preferences.protobuf.ByteString.LiteralByteString(getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes(bArr, i, i2));
    }

    public static androidx.content.preferences.protobuf.ByteString copyFrom(byte[] bArr) {
        return copyFrom(bArr, 0, bArr.length);
    }

    static androidx.content.preferences.protobuf.ByteString getHighSpeedVideoFpsRanges(java.nio.ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return new androidx.datastore.preferences.protobuf.ByteString.BoundedByteString(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
        }
        return new androidx.datastore.preferences.protobuf.ByteString.NioByteString(byteBuffer);
    }

    static androidx.content.preferences.protobuf.ByteString getHighSpeedVideoSizes(byte[] bArr) {
        return new androidx.datastore.preferences.protobuf.ByteString.LiteralByteString(bArr);
    }

    static androidx.content.preferences.protobuf.ByteString getHighResolutionOutputSizeshNQ4ISI(byte[] bArr, int i, int i2) {
        return new androidx.datastore.preferences.protobuf.ByteString.BoundedByteString(bArr, i, i2);
    }

    public static androidx.content.preferences.protobuf.ByteString copyFrom(java.nio.ByteBuffer byteBuffer, int i) {
        getHighSpeedVideoFpsRangesFor(0, i, byteBuffer.remaining());
        byte[] bArr = new byte[i];
        byteBuffer.get(bArr);
        return new androidx.datastore.preferences.protobuf.ByteString.LiteralByteString(bArr);
    }

    public static androidx.content.preferences.protobuf.ByteString copyFrom(java.nio.ByteBuffer byteBuffer) {
        return copyFrom(byteBuffer, byteBuffer.remaining());
    }

    public static androidx.content.preferences.protobuf.ByteString copyFrom(java.lang.String str, java.lang.String str2) throws java.io.UnsupportedEncodingException {
        return new androidx.datastore.preferences.protobuf.ByteString.LiteralByteString(str.getBytes(str2));
    }

    public static androidx.content.preferences.protobuf.ByteString copyFrom(java.lang.String str, java.nio.charset.Charset charset) {
        return new androidx.datastore.preferences.protobuf.ByteString.LiteralByteString(str.getBytes(charset));
    }

    public static androidx.content.preferences.protobuf.ByteString copyFromUtf8(java.lang.String str) {
        return new androidx.datastore.preferences.protobuf.ByteString.LiteralByteString(str.getBytes(androidx.content.preferences.protobuf.Internal.getHighSpeedVideoSizes));
    }

    public static androidx.content.preferences.protobuf.ByteString readFrom(java.io.InputStream inputStream) throws java.io.IOException {
        return readFrom(inputStream, 256, 8192);
    }

    public static androidx.content.preferences.protobuf.ByteString readFrom(java.io.InputStream inputStream, int i) throws java.io.IOException {
        return readFrom(inputStream, i, i);
    }

    public static androidx.content.preferences.protobuf.ByteString readFrom(java.io.InputStream inputStream, int i, int i2) throws java.io.IOException {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (true) {
            byte[] bArr = new byte[i];
            int i3 = 0;
            while (i3 < i) {
                int read = inputStream.read(bArr, i3, i - i3);
                if (read == -1) {
                    break;
                }
                i3 += read;
            }
            androidx.content.preferences.protobuf.ByteString copyFrom = i3 == 0 ? null : copyFrom(bArr, 0, i3);
            if (copyFrom != null) {
                arrayList.add(copyFrom);
                i = java.lang.Math.min(i * 2, i2);
            } else {
                return copyFrom(arrayList);
            }
        }
    }

    public final androidx.content.preferences.protobuf.ByteString concat(androidx.content.preferences.protobuf.ByteString byteString) {
        if (Integer.MAX_VALUE - size() < byteString.size()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ByteString would be too long: ");
            sb.append(size());
            sb.append("+");
            sb.append(byteString.size());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        return androidx.content.preferences.protobuf.RopeByteString.getHighSpeedVideoSizes(this, byteString);
    }

    public static androidx.content.preferences.protobuf.ByteString copyFrom(java.lang.Iterable<androidx.content.preferences.protobuf.ByteString> iterable) {
        int size;
        if (!(iterable instanceof java.util.Collection)) {
            java.util.Iterator<androidx.content.preferences.protobuf.ByteString> it = iterable.iterator();
            size = 0;
            while (it.hasNext()) {
                it.next();
                size++;
            }
        } else {
            size = ((java.util.Collection) iterable).size();
        }
        if (size == 0) {
            return EMPTY;
        }
        return Camera2StreamConfigurationMap(iterable.iterator(), size);
    }

    private static androidx.content.preferences.protobuf.ByteString Camera2StreamConfigurationMap(java.util.Iterator<androidx.content.preferences.protobuf.ByteString> it, int i) {
        if (i <= 0) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("length (%s) must be >= 1", java.lang.Integer.valueOf(i)));
        }
        if (i == 1) {
            return it.next();
        }
        int i2 = i >>> 1;
        return Camera2StreamConfigurationMap(it, i2).concat(Camera2StreamConfigurationMap(it, i - i2));
    }

    public void copyTo(byte[] bArr, int i) {
        copyTo(bArr, 0, i, size());
    }

    @java.lang.Deprecated
    public final void copyTo(byte[] bArr, int i, int i2, int i3) {
        getHighSpeedVideoFpsRangesFor(i, i + i3, size());
        getHighSpeedVideoFpsRangesFor(i2, i2 + i3, bArr.length);
        if (i3 > 0) {
            copyToInternal(bArr, i, i2, i3);
        }
    }

    public final byte[] toByteArray() {
        int size = size();
        if (size == 0) {
            return androidx.content.preferences.protobuf.Internal.EMPTY_BYTE_ARRAY;
        }
        byte[] bArr = new byte[size];
        copyToInternal(bArr, 0, 0, size);
        return bArr;
    }

    public final java.lang.String toString(java.lang.String str) throws java.io.UnsupportedEncodingException {
        try {
            return toString(java.nio.charset.Charset.forName(str));
        } catch (java.nio.charset.UnsupportedCharsetException e) {
            java.io.UnsupportedEncodingException unsupportedEncodingException = new java.io.UnsupportedEncodingException(str);
            unsupportedEncodingException.initCause(e);
            throw unsupportedEncodingException;
        }
    }

    public final java.lang.String toString(java.nio.charset.Charset charset) {
        return size() == 0 ? "" : toStringInternal(charset);
    }

    public final java.lang.String toStringUtf8() {
        return toString(androidx.content.preferences.protobuf.Internal.getHighSpeedVideoSizes);
    }

    static abstract class LeafByteString extends androidx.content.preferences.protobuf.ByteString {
        private static final long serialVersionUID = 1;

        abstract boolean Camera2StreamConfigurationMap(androidx.content.preferences.protobuf.ByteString byteString, int i, int i2);

        @Override // androidx.content.preferences.protobuf.ByteString
        protected final int getTreeDepth() {
            return 0;
        }

        @Override // androidx.content.preferences.protobuf.ByteString
        protected final boolean isBalanced() {
            return true;
        }

        /* synthetic */ LeafByteString(byte b) {
            this();
        }

        @Override // androidx.content.preferences.protobuf.ByteString, java.lang.Iterable
        public /* bridge */ /* synthetic */ java.util.Iterator<java.lang.Byte> iterator() {
            return super.iterator2();
        }

        @Override // androidx.content.preferences.protobuf.ByteString
        final void getHighSpeedVideoSizes(androidx.content.preferences.protobuf.ByteOutput byteOutput) throws java.io.IOException {
            getHighResolutionOutputSizeshNQ4ISI(byteOutput);
        }

        private LeafByteString() {
        }
    }

    public final int hashCode() {
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            int size = size();
            i = partialHash(size, 0, size);
            if (i == 0) {
                i = 1;
            }
            this.getHighSpeedVideoSizes = i;
        }
        return i;
    }

    public static androidx.datastore.preferences.protobuf.ByteString.Output newOutput(int i) {
        return new androidx.datastore.preferences.protobuf.ByteString.Output(i);
    }

    public static androidx.datastore.preferences.protobuf.ByteString.Output newOutput() {
        return new androidx.datastore.preferences.protobuf.ByteString.Output(128);
    }

    /* loaded from: classes7.dex */
    public static final class Output extends java.io.OutputStream {
        private static final byte[] Camera2StreamConfigurationMap = new byte[0];
        private final java.util.ArrayList<androidx.content.preferences.protobuf.ByteString> getHighResolutionOutputSizeshNQ4ISI;
        private byte[] getHighSpeedVideoFpsRanges;
        private int getHighSpeedVideoFpsRangesFor;
        private int getHighSpeedVideoSizes;
        private final int getInputFormats;

        Output(int i) {
            if (i < 0) {
                throw new java.lang.IllegalArgumentException("Buffer size < 0");
            }
            this.getInputFormats = i;
            this.getHighResolutionOutputSizeshNQ4ISI = new java.util.ArrayList<>();
            this.getHighSpeedVideoFpsRanges = new byte[i];
        }

        @Override // java.io.OutputStream
        public final void write(int i) {
            synchronized (this) {
                if (this.getHighSpeedVideoFpsRangesFor == this.getHighSpeedVideoFpsRanges.length) {
                    Camera2StreamConfigurationMap(1);
                }
                byte[] bArr = this.getHighSpeedVideoFpsRanges;
                int i2 = this.getHighSpeedVideoFpsRangesFor;
                this.getHighSpeedVideoFpsRangesFor = i2 + 1;
                bArr[i2] = (byte) i;
            }
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr, int i, int i2) {
            synchronized (this) {
                byte[] bArr2 = this.getHighSpeedVideoFpsRanges;
                int length = bArr2.length;
                int i3 = this.getHighSpeedVideoFpsRangesFor;
                if (i2 <= length - i3) {
                    java.lang.System.arraycopy(bArr, i, bArr2, i3, i2);
                    this.getHighSpeedVideoFpsRangesFor += i2;
                } else {
                    int length2 = bArr2.length - i3;
                    java.lang.System.arraycopy(bArr, i, bArr2, i3, length2);
                    int i4 = i2 - length2;
                    Camera2StreamConfigurationMap(i4);
                    java.lang.System.arraycopy(bArr, i + length2, this.getHighSpeedVideoFpsRanges, 0, i4);
                    this.getHighSpeedVideoFpsRangesFor = i4;
                }
            }
        }

        public final void writeTo(java.io.OutputStream outputStream) throws java.io.IOException {
            int i;
            androidx.content.preferences.protobuf.ByteString[] byteStringArr;
            byte[] bArr;
            int i2;
            synchronized (this) {
                byteStringArr = (androidx.content.preferences.protobuf.ByteString[]) this.getHighResolutionOutputSizeshNQ4ISI.toArray(new androidx.content.preferences.protobuf.ByteString[0]);
                bArr = this.getHighSpeedVideoFpsRanges;
                i2 = this.getHighSpeedVideoFpsRangesFor;
            }
            for (androidx.content.preferences.protobuf.ByteString byteString : byteStringArr) {
                byteString.writeTo(outputStream);
            }
            outputStream.write(java.util.Arrays.copyOf(bArr, i2));
        }

        public final int size() {
            int i;
            int i2;
            synchronized (this) {
                i = this.getHighSpeedVideoSizes;
                i2 = this.getHighSpeedVideoFpsRangesFor;
            }
            return i + i2;
        }

        public final void reset() {
            synchronized (this) {
                this.getHighResolutionOutputSizeshNQ4ISI.clear();
                this.getHighSpeedVideoSizes = 0;
                this.getHighSpeedVideoFpsRangesFor = 0;
            }
        }

        public final java.lang.String toString() {
            return java.lang.String.format("<ByteString.Output@%s size=%d>", java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)), java.lang.Integer.valueOf(size()));
        }

        private void Camera2StreamConfigurationMap(int i) {
            this.getHighResolutionOutputSizeshNQ4ISI.add(new androidx.datastore.preferences.protobuf.ByteString.LiteralByteString(this.getHighSpeedVideoFpsRanges));
            int length = this.getHighSpeedVideoSizes + this.getHighSpeedVideoFpsRanges.length;
            this.getHighSpeedVideoSizes = length;
            this.getHighSpeedVideoFpsRanges = new byte[java.lang.Math.max(this.getInputFormats, java.lang.Math.max(i, length >>> 1))];
            this.getHighSpeedVideoFpsRangesFor = 0;
        }

        public final androidx.content.preferences.protobuf.ByteString toByteString() {
            androidx.content.preferences.protobuf.ByteString copyFrom;
            synchronized (this) {
                int i = this.getHighSpeedVideoFpsRangesFor;
                byte[] bArr = this.getHighSpeedVideoFpsRanges;
                if (i >= bArr.length) {
                    this.getHighResolutionOutputSizeshNQ4ISI.add(new androidx.datastore.preferences.protobuf.ByteString.LiteralByteString(this.getHighSpeedVideoFpsRanges));
                    this.getHighSpeedVideoFpsRanges = Camera2StreamConfigurationMap;
                } else if (i > 0) {
                    this.getHighResolutionOutputSizeshNQ4ISI.add(new androidx.datastore.preferences.protobuf.ByteString.LiteralByteString(java.util.Arrays.copyOf(bArr, i)));
                }
                this.getHighSpeedVideoSizes += this.getHighSpeedVideoFpsRangesFor;
                this.getHighSpeedVideoFpsRangesFor = 0;
                copyFrom = androidx.content.preferences.protobuf.ByteString.copyFrom(this.getHighResolutionOutputSizeshNQ4ISI);
            }
            return copyFrom;
        }
    }

    static androidx.datastore.preferences.protobuf.ByteString.CodedBuilder getHighSpeedVideoFpsRanges(int i) {
        return new androidx.datastore.preferences.protobuf.ByteString.CodedBuilder(i, (byte) 0);
    }

    static final class CodedBuilder {
        final byte[] Camera2StreamConfigurationMap;
        final androidx.content.preferences.protobuf.CodedOutputStream getHighSpeedVideoFpsRanges;

        /* synthetic */ CodedBuilder(int i, byte b) {
            this(i);
        }

        private CodedBuilder(int i) {
            byte[] bArr = new byte[i];
            this.Camera2StreamConfigurationMap = bArr;
            this.getHighSpeedVideoFpsRanges = androidx.content.preferences.protobuf.CodedOutputStream.newInstance(bArr);
        }
    }

    protected final int peekCachedHashCode() {
        return this.getHighSpeedVideoSizes;
    }

    static void Camera2StreamConfigurationMap(int i, int i2) {
        if (((i2 - (i + 1)) | i) < 0) {
            if (i < 0) {
                throw new java.lang.ArrayIndexOutOfBoundsException("Index < 0: ".concat(java.lang.String.valueOf(i)));
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Index > length: ");
            sb.append(i);
            sb.append(", ");
            sb.append(i2);
            throw new java.lang.ArrayIndexOutOfBoundsException(sb.toString());
        }
    }

    static int getHighSpeedVideoFpsRangesFor(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Beginning index: ");
            sb.append(i);
            sb.append(" < 0");
            throw new java.lang.IndexOutOfBoundsException(sb.toString());
        }
        if (i2 < i) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Beginning index larger than ending index: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            throw new java.lang.IndexOutOfBoundsException(sb2.toString());
        }
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("End index: ");
        sb3.append(i2);
        sb3.append(" >= ");
        sb3.append(i3);
        throw new java.lang.IndexOutOfBoundsException(sb3.toString());
    }

    public final java.lang.String toString() {
        java.lang.String obj;
        java.util.Locale locale = java.util.Locale.ROOT;
        java.lang.String hexString = java.lang.Integer.toHexString(java.lang.System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            obj = androidx.content.preferences.protobuf.TextFormatEscaper.Camera2StreamConfigurationMap(this);
        } else {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(androidx.content.preferences.protobuf.TextFormatEscaper.Camera2StreamConfigurationMap(substring(0, 47)));
            sb.append("...");
            obj = sb.toString();
        }
        return java.lang.String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", hexString, java.lang.Integer.valueOf(size), obj);
    }

    static class LiteralByteString extends androidx.datastore.preferences.protobuf.ByteString.LeafByteString {
        private static final long serialVersionUID = 1;
        protected final byte[] getHighSpeedVideoFpsRanges;

        protected int getHighSpeedVideoFpsRangesFor() {
            return 0;
        }

        LiteralByteString(byte[] bArr) {
            super((byte) 0);
            this.getHighSpeedVideoFpsRanges = bArr;
        }

        @Override // androidx.content.preferences.protobuf.ByteString
        public byte byteAt(int i) {
            return this.getHighSpeedVideoFpsRanges[i];
        }

        @Override // androidx.content.preferences.protobuf.ByteString
        byte Camera2StreamConfigurationMap(int i) {
            return this.getHighSpeedVideoFpsRanges[i];
        }

        @Override // androidx.content.preferences.protobuf.ByteString
        public int size() {
            return this.getHighSpeedVideoFpsRanges.length;
        }

        @Override // androidx.content.preferences.protobuf.ByteString
        public final androidx.content.preferences.protobuf.ByteString substring(int i, int i2) {
            int highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(i, i2, size());
            if (highSpeedVideoFpsRangesFor == 0) {
                return androidx.content.preferences.protobuf.ByteString.EMPTY;
            }
            return new androidx.datastore.preferences.protobuf.ByteString.BoundedByteString(this.getHighSpeedVideoFpsRanges, getHighSpeedVideoFpsRangesFor() + i, highSpeedVideoFpsRangesFor);
        }

        @Override // androidx.content.preferences.protobuf.ByteString
        protected void copyToInternal(byte[] bArr, int i, int i2, int i3) {
            java.lang.System.arraycopy(this.getHighSpeedVideoFpsRanges, i, bArr, i2, i3);
        }

        @Override // androidx.content.preferences.protobuf.ByteString
        public final void copyTo(java.nio.ByteBuffer byteBuffer) {
            byteBuffer.put(this.getHighSpeedVideoFpsRanges, getHighSpeedVideoFpsRangesFor(), size());
        }

        @Override // androidx.content.preferences.protobuf.ByteString
        public final java.nio.ByteBuffer asReadOnlyByteBuffer() {
            return java.nio.ByteBuffer.wrap(this.getHighSpeedVideoFpsRanges, getHighSpeedVideoFpsRangesFor(), size()).asReadOnlyBuffer();
        }

        @Override // androidx.content.preferences.protobuf.ByteString
        public final java.util.List<java.nio.ByteBuffer> asReadOnlyByteBufferList() {
            return java.util.Collections.singletonList(asReadOnlyByteBuffer());
        }

        @Override // androidx.content.preferences.protobuf.ByteString
        public final void writeTo(java.io.OutputStream outputStream) throws java.io.IOException {
            outputStream.write(toByteArray());
        }

        @Override // androidx.content.preferences.protobuf.ByteString
        final void getHighResolutionOutputSizeshNQ4ISI(androidx.content.preferences.protobuf.ByteOutput byteOutput) throws java.io.IOException {
            byteOutput.writeLazy(this.getHighSpeedVideoFpsRanges, getHighSpeedVideoFpsRangesFor(), size());
        }

        @Override // androidx.content.preferences.protobuf.ByteString
        protected final java.lang.String toStringInternal(java.nio.charset.Charset charset) {
            return new java.lang.String(this.getHighSpeedVideoFpsRanges, getHighSpeedVideoFpsRangesFor(), size(), charset);
        }

        @Override // androidx.content.preferences.protobuf.ByteString
        public final boolean isValidUtf8() {
            int highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor();
            return androidx.content.preferences.protobuf.Utf8.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRanges, highSpeedVideoFpsRangesFor, size() + highSpeedVideoFpsRangesFor);
        }

        @Override // androidx.content.preferences.protobuf.ByteString
        protected final int partialIsValidUtf8(int i, int i2, int i3) {
            int highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor() + i2;
            return androidx.content.preferences.protobuf.Utf8.Camera2StreamConfigurationMap(i, this.getHighSpeedVideoFpsRanges, highSpeedVideoFpsRangesFor, i3 + highSpeedVideoFpsRangesFor);
        }

        @Override // androidx.content.preferences.protobuf.ByteString
        public final boolean equals(java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof androidx.content.preferences.protobuf.ByteString) || size() != ((androidx.content.preferences.protobuf.ByteString) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (obj instanceof androidx.datastore.preferences.protobuf.ByteString.LiteralByteString) {
                androidx.datastore.preferences.protobuf.ByteString.LiteralByteString literalByteString = (androidx.datastore.preferences.protobuf.ByteString.LiteralByteString) obj;
                int peekCachedHashCode = peekCachedHashCode();
                int peekCachedHashCode2 = literalByteString.peekCachedHashCode();
                if (peekCachedHashCode == 0 || peekCachedHashCode2 == 0 || peekCachedHashCode == peekCachedHashCode2) {
                    return Camera2StreamConfigurationMap(literalByteString, 0, size());
                }
                return false;
            }
            return obj.equals(this);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.LeafByteString
        final boolean Camera2StreamConfigurationMap(androidx.content.preferences.protobuf.ByteString byteString, int i, int i2) {
            if (i2 > byteString.size()) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Length too large: ");
                sb.append(i2);
                sb.append(size());
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
            int i3 = i + i2;
            if (i3 > byteString.size()) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Ran off end of other: ");
                sb2.append(i);
                sb2.append(", ");
                sb2.append(i2);
                sb2.append(", ");
                sb2.append(byteString.size());
                throw new java.lang.IllegalArgumentException(sb2.toString());
            }
            if (byteString instanceof androidx.datastore.preferences.protobuf.ByteString.LiteralByteString) {
                androidx.datastore.preferences.protobuf.ByteString.LiteralByteString literalByteString = (androidx.datastore.preferences.protobuf.ByteString.LiteralByteString) byteString;
                byte[] bArr = this.getHighSpeedVideoFpsRanges;
                byte[] bArr2 = literalByteString.getHighSpeedVideoFpsRanges;
                int highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor();
                int highSpeedVideoFpsRangesFor2 = getHighSpeedVideoFpsRangesFor();
                int highSpeedVideoFpsRangesFor3 = literalByteString.getHighSpeedVideoFpsRangesFor() + i;
                while (highSpeedVideoFpsRangesFor2 < highSpeedVideoFpsRangesFor + i2) {
                    if (bArr[highSpeedVideoFpsRangesFor2] != bArr2[highSpeedVideoFpsRangesFor3]) {
                        return false;
                    }
                    highSpeedVideoFpsRangesFor2++;
                    highSpeedVideoFpsRangesFor3++;
                }
                return true;
            }
            return byteString.substring(i, i3).equals(substring(0, i2));
        }

        @Override // androidx.content.preferences.protobuf.ByteString
        protected final int partialHash(int i, int i2, int i3) {
            return androidx.content.preferences.protobuf.Internal.getHighResolutionOutputSizeshNQ4ISI(i, this.getHighSpeedVideoFpsRanges, getHighSpeedVideoFpsRangesFor() + i2, i3);
        }

        @Override // androidx.content.preferences.protobuf.ByteString
        public final java.io.InputStream newInput() {
            return new java.io.ByteArrayInputStream(this.getHighSpeedVideoFpsRanges, getHighSpeedVideoFpsRangesFor(), size());
        }

        @Override // androidx.content.preferences.protobuf.ByteString
        public final androidx.content.preferences.protobuf.CodedInputStream newCodedInput() {
            return androidx.content.preferences.protobuf.CodedInputStream.Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRanges, getHighSpeedVideoFpsRangesFor(), size(), true);
        }
    }

    static final class BoundedByteString extends androidx.datastore.preferences.protobuf.ByteString.LiteralByteString {
        private static final long serialVersionUID = 1;
        private final int Camera2StreamConfigurationMap;
        private final int getHighSpeedVideoSizes;

        BoundedByteString(byte[] bArr, int i, int i2) {
            super(bArr);
            getHighSpeedVideoFpsRangesFor(i, i + i2, bArr.length);
            this.getHighSpeedVideoSizes = i;
            this.Camera2StreamConfigurationMap = i2;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.LiteralByteString, androidx.content.preferences.protobuf.ByteString
        public final byte byteAt(int i) {
            Camera2StreamConfigurationMap(i, size());
            return this.getHighSpeedVideoFpsRanges[this.getHighSpeedVideoSizes + i];
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.LiteralByteString, androidx.content.preferences.protobuf.ByteString
        final byte Camera2StreamConfigurationMap(int i) {
            return this.getHighSpeedVideoFpsRanges[this.getHighSpeedVideoSizes + i];
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.LiteralByteString, androidx.content.preferences.protobuf.ByteString
        public final int size() {
            return this.Camera2StreamConfigurationMap;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.LiteralByteString
        protected final int getHighSpeedVideoFpsRangesFor() {
            return this.getHighSpeedVideoSizes;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.LiteralByteString, androidx.content.preferences.protobuf.ByteString
        protected final void copyToInternal(byte[] bArr, int i, int i2, int i3) {
            java.lang.System.arraycopy(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes + i, bArr, i2, i3);
        }

        final java.lang.Object writeReplace() {
            return new androidx.datastore.preferences.protobuf.ByteString.LiteralByteString(toByteArray());
        }

        private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.IOException {
            throw new java.io.InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
        }
    }

    /* loaded from: classes7.dex */
    static final class NioByteString extends androidx.datastore.preferences.protobuf.ByteString.LeafByteString {
        private final java.nio.ByteBuffer getHighSpeedVideoSizes;

        NioByteString(java.nio.ByteBuffer byteBuffer) {
            super((byte) 0);
            androidx.content.preferences.protobuf.Internal.getHighSpeedVideoSizes(byteBuffer, "buffer");
            this.getHighSpeedVideoSizes = byteBuffer.slice().order(java.nio.ByteOrder.nativeOrder());
        }

        private java.lang.Object writeReplace() {
            return androidx.content.preferences.protobuf.ByteString.copyFrom(this.getHighSpeedVideoSizes.slice());
        }

        private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.IOException {
            throw new java.io.InvalidObjectException("NioByteString instances are not to be serialized directly");
        }

        @Override // androidx.content.preferences.protobuf.ByteString
        public final byte byteAt(int i) {
            try {
                return this.getHighSpeedVideoSizes.get(i);
            } catch (java.lang.ArrayIndexOutOfBoundsException e) {
                throw e;
            } catch (java.lang.IndexOutOfBoundsException e2) {
                throw new java.lang.ArrayIndexOutOfBoundsException(e2.getMessage());
            }
        }

        @Override // androidx.content.preferences.protobuf.ByteString
        public final byte Camera2StreamConfigurationMap(int i) {
            return byteAt(i);
        }

        @Override // androidx.content.preferences.protobuf.ByteString
        public final int size() {
            return this.getHighSpeedVideoSizes.remaining();
        }

        @Override // androidx.content.preferences.protobuf.ByteString
        protected final void copyToInternal(byte[] bArr, int i, int i2, int i3) {
            java.nio.ByteBuffer slice = this.getHighSpeedVideoSizes.slice();
            androidx.content.preferences.protobuf.Java8Compatibility.getHighSpeedVideoFpsRanges(slice, i);
            slice.get(bArr, i2, i3);
        }

        @Override // androidx.content.preferences.protobuf.ByteString
        public final void copyTo(java.nio.ByteBuffer byteBuffer) {
            byteBuffer.put(this.getHighSpeedVideoSizes.slice());
        }

        @Override // androidx.content.preferences.protobuf.ByteString
        public final void writeTo(java.io.OutputStream outputStream) throws java.io.IOException {
            outputStream.write(toByteArray());
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.LeafByteString
        final boolean Camera2StreamConfigurationMap(androidx.content.preferences.protobuf.ByteString byteString, int i, int i2) {
            return substring(0, i2).equals(byteString.substring(i, i2 + i));
        }

        @Override // androidx.content.preferences.protobuf.ByteString
        final void getHighResolutionOutputSizeshNQ4ISI(androidx.content.preferences.protobuf.ByteOutput byteOutput) throws java.io.IOException {
            byteOutput.writeLazy(this.getHighSpeedVideoSizes.slice());
        }

        @Override // androidx.content.preferences.protobuf.ByteString
        public final java.nio.ByteBuffer asReadOnlyByteBuffer() {
            return this.getHighSpeedVideoSizes.asReadOnlyBuffer();
        }

        @Override // androidx.content.preferences.protobuf.ByteString
        public final java.util.List<java.nio.ByteBuffer> asReadOnlyByteBufferList() {
            return java.util.Collections.singletonList(asReadOnlyByteBuffer());
        }

        @Override // androidx.content.preferences.protobuf.ByteString
        protected final java.lang.String toStringInternal(java.nio.charset.Charset charset) {
            byte[] byteArray;
            int length;
            int i;
            if (this.getHighSpeedVideoSizes.hasArray()) {
                byteArray = this.getHighSpeedVideoSizes.array();
                i = this.getHighSpeedVideoSizes.arrayOffset() + this.getHighSpeedVideoSizes.position();
                length = this.getHighSpeedVideoSizes.remaining();
            } else {
                byteArray = toByteArray();
                length = byteArray.length;
                i = 0;
            }
            return new java.lang.String(byteArray, i, length, charset);
        }

        @Override // androidx.content.preferences.protobuf.ByteString
        public final boolean isValidUtf8() {
            return androidx.content.preferences.protobuf.Utf8.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoSizes);
        }

        @Override // androidx.content.preferences.protobuf.ByteString
        protected final int partialIsValidUtf8(int i, int i2, int i3) {
            return androidx.content.preferences.protobuf.Utf8.getHighSpeedVideoFpsRanges(i, this.getHighSpeedVideoSizes, i2, i3 + i2);
        }

        @Override // androidx.content.preferences.protobuf.ByteString
        public final boolean equals(java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof androidx.content.preferences.protobuf.ByteString)) {
                return false;
            }
            androidx.content.preferences.protobuf.ByteString byteString = (androidx.content.preferences.protobuf.ByteString) obj;
            if (size() != byteString.size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (obj instanceof androidx.datastore.preferences.protobuf.ByteString.NioByteString) {
                return this.getHighSpeedVideoSizes.equals(((androidx.datastore.preferences.protobuf.ByteString.NioByteString) obj).getHighSpeedVideoSizes);
            }
            if (obj instanceof androidx.content.preferences.protobuf.RopeByteString) {
                return obj.equals(this);
            }
            return this.getHighSpeedVideoSizes.equals(byteString.asReadOnlyByteBuffer());
        }

        @Override // androidx.content.preferences.protobuf.ByteString
        protected final int partialHash(int i, int i2, int i3) {
            for (int i4 = i2; i4 < i2 + i3; i4++) {
                i = (i * 31) + this.getHighSpeedVideoSizes.get(i4);
            }
            return i;
        }

        @Override // androidx.content.preferences.protobuf.ByteString
        public final java.io.InputStream newInput() {
            return new java.io.InputStream() { // from class: androidx.datastore.preferences.protobuf.ByteString.NioByteString.1
                private final java.nio.ByteBuffer getHighSpeedVideoFpsRangesFor;

                @Override // java.io.InputStream
                public boolean markSupported() {
                    return true;
                }

                {
                    this.getHighSpeedVideoFpsRangesFor = androidx.datastore.preferences.protobuf.ByteString.NioByteString.this.getHighSpeedVideoSizes.slice();
                }

                @Override // java.io.InputStream
                public void mark(int i) {
                    androidx.content.preferences.protobuf.Java8Compatibility.Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRangesFor);
                }

                @Override // java.io.InputStream
                public void reset() throws java.io.IOException {
                    try {
                        androidx.content.preferences.protobuf.Java8Compatibility.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRangesFor);
                    } catch (java.nio.InvalidMarkException e) {
                        throw new java.io.IOException(e);
                    }
                }

                @Override // java.io.InputStream
                public int available() throws java.io.IOException {
                    return this.getHighSpeedVideoFpsRangesFor.remaining();
                }

                @Override // java.io.InputStream
                public int read() throws java.io.IOException {
                    if (this.getHighSpeedVideoFpsRangesFor.hasRemaining()) {
                        return this.getHighSpeedVideoFpsRangesFor.get() & 255;
                    }
                    return -1;
                }

                @Override // java.io.InputStream
                public int read(byte[] bArr, int i, int i2) throws java.io.IOException {
                    if (!this.getHighSpeedVideoFpsRangesFor.hasRemaining()) {
                        return -1;
                    }
                    int min = java.lang.Math.min(i2, this.getHighSpeedVideoFpsRangesFor.remaining());
                    this.getHighSpeedVideoFpsRangesFor.get(bArr, i, min);
                    return min;
                }
            };
        }

        @Override // androidx.content.preferences.protobuf.ByteString
        public final androidx.content.preferences.protobuf.CodedInputStream newCodedInput() {
            return androidx.content.preferences.protobuf.CodedInputStream.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoSizes, true);
        }

        @Override // androidx.content.preferences.protobuf.ByteString
        public final androidx.content.preferences.protobuf.ByteString substring(int i, int i2) {
            try {
                if (i < this.getHighSpeedVideoSizes.position() || i2 > this.getHighSpeedVideoSizes.limit() || i > i2) {
                    throw new java.lang.IllegalArgumentException(java.lang.String.format("Invalid indices [%d, %d]", java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2)));
                }
                java.nio.ByteBuffer slice = this.getHighSpeedVideoSizes.slice();
                androidx.content.preferences.protobuf.Java8Compatibility.getHighSpeedVideoFpsRanges(slice, i - this.getHighSpeedVideoSizes.position());
                androidx.content.preferences.protobuf.Java8Compatibility.getHighSpeedVideoSizes(slice, i2 - this.getHighSpeedVideoSizes.position());
                return new androidx.datastore.preferences.protobuf.ByteString.NioByteString(slice);
            } catch (java.lang.ArrayIndexOutOfBoundsException e) {
                throw e;
            } catch (java.lang.IndexOutOfBoundsException e2) {
                throw new java.lang.ArrayIndexOutOfBoundsException(e2.getMessage());
            }
        }
    }
}
