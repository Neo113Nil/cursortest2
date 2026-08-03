package com.google.android.exoplayer2.extractor.avi;

/* loaded from: classes3.dex */
final class StreamFormatChunk implements com.google.android.exoplayer2.extractor.avi.AviChunk {
    private static final java.lang.String TAG = "StreamFormatChunk";
    public final com.google.android.exoplayer2.Format format;

    @Override // com.google.android.exoplayer2.extractor.avi.AviChunk
    public int getType() {
        return 1718776947;
    }

    public static com.google.android.exoplayer2.extractor.avi.AviChunk parseFrom(int i, com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray) {
        if (i == 2) {
            return parseBitmapInfoHeader(parsableByteArray);
        }
        if (i == 1) {
            return parseWaveFormatEx(parsableByteArray);
        }
        com.google.android.exoplayer2.util.Log.w(TAG, "Ignoring strf box for unsupported track type: " + com.google.android.exoplayer2.util.Util.getTrackTypeString(i));
        return null;
    }

    public StreamFormatChunk(com.google.android.exoplayer2.Format format) {
        this.format = format;
    }

    private static com.google.android.exoplayer2.extractor.avi.AviChunk parseBitmapInfoHeader(com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray) {
        parsableByteArray.skipBytes(4);
        int readLittleEndianInt = parsableByteArray.readLittleEndianInt();
        int readLittleEndianInt2 = parsableByteArray.readLittleEndianInt();
        parsableByteArray.skipBytes(4);
        int readLittleEndianInt3 = parsableByteArray.readLittleEndianInt();
        java.lang.String mimeTypeFromCompression = getMimeTypeFromCompression(readLittleEndianInt3);
        if (mimeTypeFromCompression == null) {
            com.google.android.exoplayer2.util.Log.w(TAG, "Ignoring track with unsupported compression " + readLittleEndianInt3);
            return null;
        }
        com.google.android.exoplayer2.Format.Builder builder = new com.google.android.exoplayer2.Format.Builder();
        builder.setWidth(readLittleEndianInt).setHeight(readLittleEndianInt2).setSampleMimeType(mimeTypeFromCompression);
        return new com.google.android.exoplayer2.extractor.avi.StreamFormatChunk(builder.build());
    }

    private static com.google.android.exoplayer2.extractor.avi.AviChunk parseWaveFormatEx(com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray) {
        int readLittleEndianUnsignedShort = parsableByteArray.readLittleEndianUnsignedShort();
        java.lang.String mimeTypeFromTag = getMimeTypeFromTag(readLittleEndianUnsignedShort);
        if (mimeTypeFromTag == null) {
            com.google.android.exoplayer2.util.Log.w(TAG, "Ignoring track with unsupported format tag " + readLittleEndianUnsignedShort);
            return null;
        }
        int readLittleEndianUnsignedShort2 = parsableByteArray.readLittleEndianUnsignedShort();
        int readLittleEndianInt = parsableByteArray.readLittleEndianInt();
        parsableByteArray.skipBytes(6);
        int pcmEncoding = com.google.android.exoplayer2.util.Util.getPcmEncoding(parsableByteArray.readUnsignedShort());
        int readLittleEndianUnsignedShort3 = parsableByteArray.readLittleEndianUnsignedShort();
        byte[] bArr = new byte[readLittleEndianUnsignedShort3];
        parsableByteArray.readBytes(bArr, 0, readLittleEndianUnsignedShort3);
        com.google.android.exoplayer2.Format.Builder builder = new com.google.android.exoplayer2.Format.Builder();
        builder.setSampleMimeType(mimeTypeFromTag).setChannelCount(readLittleEndianUnsignedShort2).setSampleRate(readLittleEndianInt);
        if ("audio/raw".equals(mimeTypeFromTag) && pcmEncoding != 0) {
            builder.setPcmEncoding(pcmEncoding);
        }
        if ("audio/mp4a-latm".equals(mimeTypeFromTag) && readLittleEndianUnsignedShort3 > 0) {
            builder.setInitializationData(com.google.common.collect.ImmutableList.of(bArr));
        }
        return new com.google.android.exoplayer2.extractor.avi.StreamFormatChunk(builder.build());
    }

    private static java.lang.String getMimeTypeFromTag(int i) {
        if (i == 1) {
            return "audio/raw";
        }
        if (i == 85) {
            return "audio/mpeg";
        }
        if (i == 255) {
            return "audio/mp4a-latm";
        }
        if (i == 8192) {
            return "audio/ac3";
        }
        if (i != 8193) {
            return null;
        }
        return "audio/vnd.dts";
    }

    private static java.lang.String getMimeTypeFromCompression(int i) {
        switch (i) {
            case 808802372:
            case 877677894:
            case 1145656883:
            case 1145656920:
            case 1482049860:
            case 1684633208:
            case 2021026148:
                return "video/mp4v-es";
            case 826496577:
            case 828601953:
            case 875967048:
                return "video/avc";
            case 842289229:
                return "video/mp42";
            case 859066445:
                return "video/mp43";
            case 1196444237:
            case 1735420525:
                return "video/mjpeg";
            default:
                return null;
        }
    }
}
