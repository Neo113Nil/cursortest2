package androidx.emoji2.text;

/* loaded from: classes7.dex */
class MetadataListReader {

    interface OpenTypeReader {
        long Camera2StreamConfigurationMap() throws java.io.IOException;

        void Camera2StreamConfigurationMap(int i) throws java.io.IOException;

        int getHighSpeedVideoFpsRanges() throws java.io.IOException;

        long getHighSpeedVideoFpsRangesFor();

        int getHighSpeedVideoSizes() throws java.io.IOException;
    }

    static int getHighResolutionOutputSizeshNQ4ISI(short s) {
        return s & kotlin.UShort.MAX_VALUE;
    }

    static long getHighSpeedVideoFpsRanges(int i) {
        return i & 4294967295L;
    }

    static androidx.emoji2.text.flatbuffer.MetadataList getHighSpeedVideoSizes(java.io.InputStream inputStream) throws java.io.IOException {
        androidx.emoji2.text.MetadataListReader.InputStreamOpenTypeReader inputStreamOpenTypeReader = new androidx.emoji2.text.MetadataListReader.InputStreamOpenTypeReader(inputStream);
        androidx.emoji2.text.MetadataListReader.OffsetInfo highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(inputStreamOpenTypeReader);
        inputStreamOpenTypeReader.Camera2StreamConfigurationMap((int) (highResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap - inputStreamOpenTypeReader.getHighSpeedVideoFpsRangesFor()));
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate((int) highResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI);
        int read = inputStream.read(allocate.array());
        if (read != highResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Needed ");
            sb.append(highResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI);
            sb.append(" bytes, got ");
            sb.append(read);
            throw new java.io.IOException(sb.toString());
        }
        return androidx.emoji2.text.flatbuffer.MetadataList.getRootAsMetadataList(allocate);
    }

    static androidx.emoji2.text.flatbuffer.MetadataList Camera2StreamConfigurationMap(java.nio.ByteBuffer byteBuffer) throws java.io.IOException {
        java.nio.ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.position((int) getHighResolutionOutputSizeshNQ4ISI(new androidx.emoji2.text.MetadataListReader.ByteBufferReader(duplicate)).Camera2StreamConfigurationMap);
        return androidx.emoji2.text.flatbuffer.MetadataList.getRootAsMetadataList(duplicate);
    }

    static androidx.emoji2.text.flatbuffer.MetadataList Camera2StreamConfigurationMap(android.content.res.AssetManager assetManager, java.lang.String str) throws java.io.IOException {
        java.io.InputStream open = assetManager.open(str);
        try {
            androidx.emoji2.text.flatbuffer.MetadataList highSpeedVideoSizes = getHighSpeedVideoSizes(open);
            if (open != null) {
                open.close();
            }
            return highSpeedVideoSizes;
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

    private static androidx.emoji2.text.MetadataListReader.OffsetInfo getHighResolutionOutputSizeshNQ4ISI(androidx.emoji2.text.MetadataListReader.OpenTypeReader openTypeReader) throws java.io.IOException {
        long j;
        openTypeReader.Camera2StreamConfigurationMap(4);
        int highSpeedVideoSizes = openTypeReader.getHighSpeedVideoSizes();
        if (highSpeedVideoSizes > 100) {
            throw new java.io.IOException("Cannot read metadata.");
        }
        openTypeReader.Camera2StreamConfigurationMap(6);
        int i = 0;
        while (true) {
            if (i >= highSpeedVideoSizes) {
                j = -1;
                break;
            }
            int highSpeedVideoFpsRanges = openTypeReader.getHighSpeedVideoFpsRanges();
            openTypeReader.Camera2StreamConfigurationMap(4);
            j = openTypeReader.Camera2StreamConfigurationMap();
            openTypeReader.Camera2StreamConfigurationMap(4);
            if (1835365473 == highSpeedVideoFpsRanges) {
                break;
            }
            i++;
        }
        if (j != -1) {
            openTypeReader.Camera2StreamConfigurationMap((int) (j - openTypeReader.getHighSpeedVideoFpsRangesFor()));
            openTypeReader.Camera2StreamConfigurationMap(12);
            long Camera2StreamConfigurationMap = openTypeReader.Camera2StreamConfigurationMap();
            for (int i2 = 0; i2 < Camera2StreamConfigurationMap; i2++) {
                int highSpeedVideoFpsRanges2 = openTypeReader.getHighSpeedVideoFpsRanges();
                long Camera2StreamConfigurationMap2 = openTypeReader.Camera2StreamConfigurationMap();
                long Camera2StreamConfigurationMap3 = openTypeReader.Camera2StreamConfigurationMap();
                if (1164798569 == highSpeedVideoFpsRanges2 || 1701669481 == highSpeedVideoFpsRanges2) {
                    return new androidx.emoji2.text.MetadataListReader.OffsetInfo(Camera2StreamConfigurationMap2 + j, Camera2StreamConfigurationMap3);
                }
            }
        }
        throw new java.io.IOException("Cannot read metadata.");
    }

    static class OffsetInfo {
        final long Camera2StreamConfigurationMap;
        final long getHighResolutionOutputSizeshNQ4ISI;

        OffsetInfo(long j, long j2) {
            this.Camera2StreamConfigurationMap = j;
            this.getHighResolutionOutputSizeshNQ4ISI = j2;
        }
    }

    static class InputStreamOpenTypeReader implements androidx.emoji2.text.MetadataListReader.OpenTypeReader {
        private long Camera2StreamConfigurationMap = 0;
        private final java.nio.ByteBuffer getHighResolutionOutputSizeshNQ4ISI;
        private final byte[] getHighSpeedVideoFpsRangesFor;
        private final java.io.InputStream getHighSpeedVideoSizes;

        InputStreamOpenTypeReader(java.io.InputStream inputStream) {
            this.getHighSpeedVideoSizes = inputStream;
            byte[] bArr = new byte[4];
            this.getHighSpeedVideoFpsRangesFor = bArr;
            java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(bArr);
            this.getHighResolutionOutputSizeshNQ4ISI = wrap;
            wrap.order(java.nio.ByteOrder.BIG_ENDIAN);
        }

        @Override // androidx.emoji2.text.MetadataListReader.OpenTypeReader
        public final int getHighSpeedVideoSizes() throws java.io.IOException {
            this.getHighResolutionOutputSizeshNQ4ISI.position(0);
            getHighResolutionOutputSizeshNQ4ISI(2);
            return androidx.emoji2.text.MetadataListReader.getHighResolutionOutputSizeshNQ4ISI(this.getHighResolutionOutputSizeshNQ4ISI.getShort());
        }

        @Override // androidx.emoji2.text.MetadataListReader.OpenTypeReader
        public final long Camera2StreamConfigurationMap() throws java.io.IOException {
            this.getHighResolutionOutputSizeshNQ4ISI.position(0);
            getHighResolutionOutputSizeshNQ4ISI(4);
            return androidx.emoji2.text.MetadataListReader.getHighSpeedVideoFpsRanges(this.getHighResolutionOutputSizeshNQ4ISI.getInt());
        }

        @Override // androidx.emoji2.text.MetadataListReader.OpenTypeReader
        public final int getHighSpeedVideoFpsRanges() throws java.io.IOException {
            this.getHighResolutionOutputSizeshNQ4ISI.position(0);
            getHighResolutionOutputSizeshNQ4ISI(4);
            return this.getHighResolutionOutputSizeshNQ4ISI.getInt();
        }

        @Override // androidx.emoji2.text.MetadataListReader.OpenTypeReader
        public final void Camera2StreamConfigurationMap(int i) throws java.io.IOException {
            while (i > 0) {
                int skip = (int) this.getHighSpeedVideoSizes.skip(i);
                if (skip <= 0) {
                    throw new java.io.IOException("Skip didn't move at least 1 byte forward");
                }
                i -= skip;
                this.Camera2StreamConfigurationMap += skip;
            }
        }

        @Override // androidx.emoji2.text.MetadataListReader.OpenTypeReader
        public final long getHighSpeedVideoFpsRangesFor() {
            return this.Camera2StreamConfigurationMap;
        }

        private void getHighResolutionOutputSizeshNQ4ISI(int i) throws java.io.IOException {
            if (this.getHighSpeedVideoSizes.read(this.getHighSpeedVideoFpsRangesFor, 0, i) != i) {
                throw new java.io.IOException("read failed");
            }
            this.Camera2StreamConfigurationMap += i;
        }
    }

    static class ByteBufferReader implements androidx.emoji2.text.MetadataListReader.OpenTypeReader {
        private final java.nio.ByteBuffer getHighSpeedVideoFpsRangesFor;

        ByteBufferReader(java.nio.ByteBuffer byteBuffer) {
            this.getHighSpeedVideoFpsRangesFor = byteBuffer;
            byteBuffer.order(java.nio.ByteOrder.BIG_ENDIAN);
        }

        @Override // androidx.emoji2.text.MetadataListReader.OpenTypeReader
        public final int getHighSpeedVideoSizes() throws java.io.IOException {
            return androidx.emoji2.text.MetadataListReader.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRangesFor.getShort());
        }

        @Override // androidx.emoji2.text.MetadataListReader.OpenTypeReader
        public final long Camera2StreamConfigurationMap() throws java.io.IOException {
            return androidx.emoji2.text.MetadataListReader.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoFpsRangesFor.getInt());
        }

        @Override // androidx.emoji2.text.MetadataListReader.OpenTypeReader
        public final int getHighSpeedVideoFpsRanges() throws java.io.IOException {
            return this.getHighSpeedVideoFpsRangesFor.getInt();
        }

        @Override // androidx.emoji2.text.MetadataListReader.OpenTypeReader
        public final void Camera2StreamConfigurationMap(int i) throws java.io.IOException {
            java.nio.ByteBuffer byteBuffer = this.getHighSpeedVideoFpsRangesFor;
            byteBuffer.position(byteBuffer.position() + i);
        }

        @Override // androidx.emoji2.text.MetadataListReader.OpenTypeReader
        public final long getHighSpeedVideoFpsRangesFor() {
            return this.getHighSpeedVideoFpsRangesFor.position();
        }
    }

    private MetadataListReader() {
    }
}
