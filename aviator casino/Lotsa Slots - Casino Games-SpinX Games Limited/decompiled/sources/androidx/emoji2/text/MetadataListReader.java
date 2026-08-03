package androidx.emoji2.text;

/* loaded from: classes2.dex */
class MetadataListReader {
    private static final int EMJI_TAG = 1164798569;
    private static final int EMJI_TAG_DEPRECATED = 1701669481;
    private static final int META_TABLE_NAME = 1835365473;

    private interface OpenTypeReader {
        public static final int UINT16_BYTE_COUNT = 2;
        public static final int UINT32_BYTE_COUNT = 4;

        long getPosition();

        int readTag() throws java.io.IOException;

        long readUnsignedInt() throws java.io.IOException;

        int readUnsignedShort() throws java.io.IOException;

        void skip(int i) throws java.io.IOException;
    }

    static long toUnsignedInt(int i) {
        return i & 4294967295L;
    }

    static int toUnsignedShort(short s) {
        return s & kotlin.UShort.MAX_VALUE;
    }

    static androidx.emoji2.text.flatbuffer.MetadataList read(java.io.InputStream inputStream) throws java.io.IOException {
        androidx.emoji2.text.MetadataListReader.InputStreamOpenTypeReader inputStreamOpenTypeReader = new androidx.emoji2.text.MetadataListReader.InputStreamOpenTypeReader(inputStream);
        androidx.emoji2.text.MetadataListReader.OffsetInfo findOffsetInfo = findOffsetInfo(inputStreamOpenTypeReader);
        inputStreamOpenTypeReader.skip((int) (findOffsetInfo.getStartOffset() - inputStreamOpenTypeReader.getPosition()));
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate((int) findOffsetInfo.getLength());
        int read = inputStream.read(allocate.array());
        if (read != findOffsetInfo.getLength()) {
            throw new java.io.IOException("Needed " + findOffsetInfo.getLength() + " bytes, got " + read);
        }
        return androidx.emoji2.text.flatbuffer.MetadataList.getRootAsMetadataList(allocate);
    }

    static androidx.emoji2.text.flatbuffer.MetadataList read(java.nio.ByteBuffer byteBuffer) throws java.io.IOException {
        java.nio.ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.position((int) findOffsetInfo(new androidx.emoji2.text.MetadataListReader.ByteBufferReader(duplicate)).getStartOffset());
        return androidx.emoji2.text.flatbuffer.MetadataList.getRootAsMetadataList(duplicate);
    }

    static androidx.emoji2.text.flatbuffer.MetadataList read(android.content.res.AssetManager assetManager, java.lang.String str) throws java.io.IOException {
        java.io.InputStream open = assetManager.open(str);
        try {
            androidx.emoji2.text.flatbuffer.MetadataList read = read(open);
            if (open != null) {
                open.close();
            }
            return read;
        } catch (java.lang.Throwable th) {
            if (open != null) {
                try {
                    open.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    private static androidx.emoji2.text.MetadataListReader.OffsetInfo findOffsetInfo(androidx.emoji2.text.MetadataListReader.OpenTypeReader openTypeReader) throws java.io.IOException {
        long j;
        openTypeReader.skip(4);
        int readUnsignedShort = openTypeReader.readUnsignedShort();
        if (readUnsignedShort > 100) {
            throw new java.io.IOException("Cannot read metadata.");
        }
        openTypeReader.skip(6);
        int i = 0;
        while (true) {
            if (i >= readUnsignedShort) {
                j = -1;
                break;
            }
            int readTag = openTypeReader.readTag();
            openTypeReader.skip(4);
            j = openTypeReader.readUnsignedInt();
            openTypeReader.skip(4);
            if (1835365473 == readTag) {
                break;
            }
            i++;
        }
        if (j != -1) {
            openTypeReader.skip((int) (j - openTypeReader.getPosition()));
            openTypeReader.skip(12);
            long readUnsignedInt = openTypeReader.readUnsignedInt();
            for (int i2 = 0; i2 < readUnsignedInt; i2++) {
                int readTag2 = openTypeReader.readTag();
                long readUnsignedInt2 = openTypeReader.readUnsignedInt();
                long readUnsignedInt3 = openTypeReader.readUnsignedInt();
                if (EMJI_TAG == readTag2 || EMJI_TAG_DEPRECATED == readTag2) {
                    return new androidx.emoji2.text.MetadataListReader.OffsetInfo(readUnsignedInt2 + j, readUnsignedInt3);
                }
            }
        }
        throw new java.io.IOException("Cannot read metadata.");
    }

    private static class OffsetInfo {
        private final long mLength;
        private final long mStartOffset;

        OffsetInfo(long j, long j2) {
            this.mStartOffset = j;
            this.mLength = j2;
        }

        long getStartOffset() {
            return this.mStartOffset;
        }

        long getLength() {
            return this.mLength;
        }
    }

    private static class InputStreamOpenTypeReader implements androidx.emoji2.text.MetadataListReader.OpenTypeReader {
        private final byte[] mByteArray;
        private final java.nio.ByteBuffer mByteBuffer;
        private final java.io.InputStream mInputStream;
        private long mPosition = 0;

        InputStreamOpenTypeReader(java.io.InputStream inputStream) {
            this.mInputStream = inputStream;
            byte[] bArr = new byte[4];
            this.mByteArray = bArr;
            java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(bArr);
            this.mByteBuffer = wrap;
            wrap.order(java.nio.ByteOrder.BIG_ENDIAN);
        }

        @Override // androidx.emoji2.text.MetadataListReader.OpenTypeReader
        public int readUnsignedShort() throws java.io.IOException {
            this.mByteBuffer.position(0);
            read(2);
            return androidx.emoji2.text.MetadataListReader.toUnsignedShort(this.mByteBuffer.getShort());
        }

        @Override // androidx.emoji2.text.MetadataListReader.OpenTypeReader
        public long readUnsignedInt() throws java.io.IOException {
            this.mByteBuffer.position(0);
            read(4);
            return androidx.emoji2.text.MetadataListReader.toUnsignedInt(this.mByteBuffer.getInt());
        }

        @Override // androidx.emoji2.text.MetadataListReader.OpenTypeReader
        public int readTag() throws java.io.IOException {
            this.mByteBuffer.position(0);
            read(4);
            return this.mByteBuffer.getInt();
        }

        @Override // androidx.emoji2.text.MetadataListReader.OpenTypeReader
        public void skip(int i) throws java.io.IOException {
            while (i > 0) {
                int skip = (int) this.mInputStream.skip(i);
                if (skip < 1) {
                    throw new java.io.IOException("Skip didn't move at least 1 byte forward");
                }
                i -= skip;
                this.mPosition += skip;
            }
        }

        @Override // androidx.emoji2.text.MetadataListReader.OpenTypeReader
        public long getPosition() {
            return this.mPosition;
        }

        private void read(int i) throws java.io.IOException {
            if (this.mInputStream.read(this.mByteArray, 0, i) != i) {
                throw new java.io.IOException("read failed");
            }
            this.mPosition += i;
        }
    }

    private static class ByteBufferReader implements androidx.emoji2.text.MetadataListReader.OpenTypeReader {
        private final java.nio.ByteBuffer mByteBuffer;

        ByteBufferReader(java.nio.ByteBuffer byteBuffer) {
            this.mByteBuffer = byteBuffer;
            byteBuffer.order(java.nio.ByteOrder.BIG_ENDIAN);
        }

        @Override // androidx.emoji2.text.MetadataListReader.OpenTypeReader
        public int readUnsignedShort() throws java.io.IOException {
            return androidx.emoji2.text.MetadataListReader.toUnsignedShort(this.mByteBuffer.getShort());
        }

        @Override // androidx.emoji2.text.MetadataListReader.OpenTypeReader
        public long readUnsignedInt() throws java.io.IOException {
            return androidx.emoji2.text.MetadataListReader.toUnsignedInt(this.mByteBuffer.getInt());
        }

        @Override // androidx.emoji2.text.MetadataListReader.OpenTypeReader
        public int readTag() throws java.io.IOException {
            return this.mByteBuffer.getInt();
        }

        @Override // androidx.emoji2.text.MetadataListReader.OpenTypeReader
        public void skip(int i) throws java.io.IOException {
            java.nio.ByteBuffer byteBuffer = this.mByteBuffer;
            byteBuffer.position(byteBuffer.position() + i);
        }

        @Override // androidx.emoji2.text.MetadataListReader.OpenTypeReader
        public long getPosition() {
            return this.mByteBuffer.position();
        }
    }

    private MetadataListReader() {
    }
}
