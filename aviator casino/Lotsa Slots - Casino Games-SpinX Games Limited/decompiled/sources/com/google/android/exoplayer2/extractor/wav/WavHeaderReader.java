package com.google.android.exoplayer2.extractor.wav;

/* loaded from: classes3.dex */
final class WavHeaderReader {
    private static final java.lang.String TAG = "WavHeaderReader";

    public static boolean checkFileType(com.google.android.exoplayer2.extractor.ExtractorInput extractorInput) throws java.io.IOException {
        com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray = new com.google.android.exoplayer2.util.ParsableByteArray(8);
        com.google.android.exoplayer2.extractor.wav.WavHeaderReader.ChunkHeader peek = com.google.android.exoplayer2.extractor.wav.WavHeaderReader.ChunkHeader.peek(extractorInput, parsableByteArray);
        if (peek.id != 1380533830 && peek.id != 1380333108) {
            return false;
        }
        extractorInput.peekFully(parsableByteArray.getData(), 0, 4);
        parsableByteArray.setPosition(0);
        int readInt = parsableByteArray.readInt();
        if (readInt == 1463899717) {
            return true;
        }
        com.google.android.exoplayer2.util.Log.e(TAG, "Unsupported form type: " + readInt);
        return false;
    }

    public static long readRf64SampleDataSize(com.google.android.exoplayer2.extractor.ExtractorInput extractorInput) throws java.io.IOException {
        com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray = new com.google.android.exoplayer2.util.ParsableByteArray(8);
        com.google.android.exoplayer2.extractor.wav.WavHeaderReader.ChunkHeader peek = com.google.android.exoplayer2.extractor.wav.WavHeaderReader.ChunkHeader.peek(extractorInput, parsableByteArray);
        if (peek.id != 1685272116) {
            extractorInput.resetPeekPosition();
            return -1L;
        }
        extractorInput.advancePeekPosition(8);
        parsableByteArray.setPosition(0);
        extractorInput.peekFully(parsableByteArray.getData(), 0, 8);
        long readLittleEndianLong = parsableByteArray.readLittleEndianLong();
        extractorInput.skipFully(((int) peek.size) + 8);
        return readLittleEndianLong;
    }

    public static com.google.android.exoplayer2.extractor.wav.WavFormat readFormat(com.google.android.exoplayer2.extractor.ExtractorInput extractorInput) throws java.io.IOException {
        byte[] bArr;
        com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray = new com.google.android.exoplayer2.util.ParsableByteArray(16);
        com.google.android.exoplayer2.extractor.wav.WavHeaderReader.ChunkHeader skipToChunk = skipToChunk(1718449184, extractorInput, parsableByteArray);
        com.google.android.exoplayer2.util.Assertions.checkState(skipToChunk.size >= 16);
        extractorInput.peekFully(parsableByteArray.getData(), 0, 16);
        parsableByteArray.setPosition(0);
        int readLittleEndianUnsignedShort = parsableByteArray.readLittleEndianUnsignedShort();
        int readLittleEndianUnsignedShort2 = parsableByteArray.readLittleEndianUnsignedShort();
        int readLittleEndianUnsignedIntToInt = parsableByteArray.readLittleEndianUnsignedIntToInt();
        int readLittleEndianUnsignedIntToInt2 = parsableByteArray.readLittleEndianUnsignedIntToInt();
        int readLittleEndianUnsignedShort3 = parsableByteArray.readLittleEndianUnsignedShort();
        int readLittleEndianUnsignedShort4 = parsableByteArray.readLittleEndianUnsignedShort();
        int i = ((int) skipToChunk.size) - 16;
        if (i > 0) {
            byte[] bArr2 = new byte[i];
            extractorInput.peekFully(bArr2, 0, i);
            bArr = bArr2;
        } else {
            bArr = com.google.android.exoplayer2.util.Util.EMPTY_BYTE_ARRAY;
        }
        extractorInput.skipFully((int) (extractorInput.getPeekPosition() - extractorInput.getPosition()));
        return new com.google.android.exoplayer2.extractor.wav.WavFormat(readLittleEndianUnsignedShort, readLittleEndianUnsignedShort2, readLittleEndianUnsignedIntToInt, readLittleEndianUnsignedIntToInt2, readLittleEndianUnsignedShort3, readLittleEndianUnsignedShort4, bArr);
    }

    public static android.util.Pair<java.lang.Long, java.lang.Long> skipToSampleData(com.google.android.exoplayer2.extractor.ExtractorInput extractorInput) throws java.io.IOException {
        extractorInput.resetPeekPosition();
        com.google.android.exoplayer2.extractor.wav.WavHeaderReader.ChunkHeader skipToChunk = skipToChunk(1684108385, extractorInput, new com.google.android.exoplayer2.util.ParsableByteArray(8));
        extractorInput.skipFully(8);
        return android.util.Pair.create(java.lang.Long.valueOf(extractorInput.getPosition()), java.lang.Long.valueOf(skipToChunk.size));
    }

    private static com.google.android.exoplayer2.extractor.wav.WavHeaderReader.ChunkHeader skipToChunk(int i, com.google.android.exoplayer2.extractor.ExtractorInput extractorInput, com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray) throws java.io.IOException {
        com.google.android.exoplayer2.extractor.wav.WavHeaderReader.ChunkHeader peek = com.google.android.exoplayer2.extractor.wav.WavHeaderReader.ChunkHeader.peek(extractorInput, parsableByteArray);
        while (peek.id != i) {
            com.google.android.exoplayer2.util.Log.w(TAG, "Ignoring unknown WAV chunk: " + peek.id);
            long j = peek.size + 8;
            if (j > 2147483647L) {
                throw com.google.android.exoplayer2.ParserException.createForUnsupportedContainerFeature("Chunk is too large (~2GB+) to skip; id: " + peek.id);
            }
            extractorInput.skipFully((int) j);
            peek = com.google.android.exoplayer2.extractor.wav.WavHeaderReader.ChunkHeader.peek(extractorInput, parsableByteArray);
        }
        return peek;
    }

    private WavHeaderReader() {
    }

    private static final class ChunkHeader {
        public static final int SIZE_IN_BYTES = 8;
        public final int id;
        public final long size;

        private ChunkHeader(int i, long j) {
            this.id = i;
            this.size = j;
        }

        public static com.google.android.exoplayer2.extractor.wav.WavHeaderReader.ChunkHeader peek(com.google.android.exoplayer2.extractor.ExtractorInput extractorInput, com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray) throws java.io.IOException {
            extractorInput.peekFully(parsableByteArray.getData(), 0, 8);
            parsableByteArray.setPosition(0);
            return new com.google.android.exoplayer2.extractor.wav.WavHeaderReader.ChunkHeader(parsableByteArray.readInt(), parsableByteArray.readLittleEndianUnsignedInt());
        }
    }
}
