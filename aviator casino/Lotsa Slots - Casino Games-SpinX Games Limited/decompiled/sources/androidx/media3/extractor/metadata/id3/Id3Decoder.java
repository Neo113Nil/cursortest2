package androidx.media3.extractor.metadata.id3;

/* loaded from: classes2.dex */
public final class Id3Decoder extends androidx.media3.extractor.metadata.SimpleMetadataDecoder {
    private static final int FRAME_FLAG_V3_HAS_GROUP_IDENTIFIER = 32;
    private static final int FRAME_FLAG_V3_IS_COMPRESSED = 128;
    private static final int FRAME_FLAG_V3_IS_ENCRYPTED = 64;
    private static final int FRAME_FLAG_V4_HAS_DATA_LENGTH = 1;
    private static final int FRAME_FLAG_V4_HAS_GROUP_IDENTIFIER = 64;
    private static final int FRAME_FLAG_V4_IS_COMPRESSED = 8;
    private static final int FRAME_FLAG_V4_IS_ENCRYPTED = 4;
    private static final int FRAME_FLAG_V4_IS_UNSYNCHRONIZED = 2;
    public static final int ID3_HEADER_LENGTH = 10;
    public static final int ID3_TAG = 4801587;
    private static final int ID3_TEXT_ENCODING_ISO_8859_1 = 0;
    private static final int ID3_TEXT_ENCODING_UTF_16 = 1;
    private static final int ID3_TEXT_ENCODING_UTF_16BE = 2;
    private static final int ID3_TEXT_ENCODING_UTF_8 = 3;
    public static final androidx.media3.extractor.metadata.id3.Id3Decoder.FramePredicate NO_FRAMES_PREDICATE = new androidx.media3.extractor.metadata.id3.Id3Decoder.FramePredicate() { // from class: androidx.media3.extractor.metadata.id3.Id3Decoder$$ExternalSyntheticLambda0
        @Override // androidx.media3.extractor.metadata.id3.Id3Decoder.FramePredicate
        public final boolean evaluate(int i, int i2, int i3, int i4, int i5) {
            return androidx.media3.extractor.metadata.id3.Id3Decoder.lambda$static$0(i, i2, i3, i4, i5);
        }
    };
    private static final java.lang.String TAG = "Id3Decoder";
    private final androidx.media3.extractor.metadata.id3.Id3Decoder.FramePredicate framePredicate;

    public interface FramePredicate {
        boolean evaluate(int i, int i2, int i3, int i4, int i5);
    }

    private static int delimiterLength(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    static /* synthetic */ boolean lambda$static$0(int i, int i2, int i3, int i4, int i5) {
        return false;
    }

    public Id3Decoder() {
        this(null);
    }

    public Id3Decoder(androidx.media3.extractor.metadata.id3.Id3Decoder.FramePredicate framePredicate) {
        this.framePredicate = framePredicate;
    }

    @Override // androidx.media3.extractor.metadata.SimpleMetadataDecoder
    protected androidx.media3.common.Metadata decode(androidx.media3.extractor.metadata.MetadataInputBuffer metadataInputBuffer, java.nio.ByteBuffer byteBuffer) {
        return decode(byteBuffer.array(), byteBuffer.limit());
    }

    public androidx.media3.common.Metadata decode(byte[] bArr, int i) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        androidx.media3.common.util.ParsableByteArray parsableByteArray = new androidx.media3.common.util.ParsableByteArray(bArr, i);
        androidx.media3.extractor.metadata.id3.Id3Decoder.Id3Header decodeHeader = decodeHeader(parsableByteArray);
        if (decodeHeader == null) {
            return null;
        }
        int position = parsableByteArray.getPosition();
        int i2 = decodeHeader.majorVersion == 2 ? 6 : 10;
        int i3 = decodeHeader.framesSize;
        if (decodeHeader.isUnsynchronized) {
            i3 = removeUnsynchronization(parsableByteArray, decodeHeader.framesSize);
        }
        parsableByteArray.setLimit(position + i3);
        boolean z = false;
        if (!validateFrames(parsableByteArray, decodeHeader.majorVersion, i2, false)) {
            if (decodeHeader.majorVersion != 4 || !validateFrames(parsableByteArray, 4, i2, true)) {
                androidx.media3.common.util.Log.w(TAG, "Failed to validate ID3 tag with majorVersion=" + decodeHeader.majorVersion);
                return null;
            }
            z = true;
        }
        while (parsableByteArray.bytesLeft() >= i2) {
            androidx.media3.extractor.metadata.id3.Id3Frame decodeFrame = decodeFrame(decodeHeader.majorVersion, parsableByteArray, z, i2, this.framePredicate);
            if (decodeFrame != null) {
                arrayList.add(decodeFrame);
            }
        }
        return new androidx.media3.common.Metadata(arrayList);
    }

    private static androidx.media3.extractor.metadata.id3.Id3Decoder.Id3Header decodeHeader(androidx.media3.common.util.ParsableByteArray parsableByteArray) {
        if (parsableByteArray.bytesLeft() < 10) {
            androidx.media3.common.util.Log.w(TAG, "Data too short to be an ID3 tag");
            return null;
        }
        int readUnsignedInt24 = parsableByteArray.readUnsignedInt24();
        boolean z = false;
        if (readUnsignedInt24 != 4801587) {
            androidx.media3.common.util.Log.w(TAG, "Unexpected first three bytes of ID3 tag header: 0x" + java.lang.String.format("%06X", java.lang.Integer.valueOf(readUnsignedInt24)));
            return null;
        }
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        parsableByteArray.skipBytes(1);
        int readUnsignedByte2 = parsableByteArray.readUnsignedByte();
        int readSynchSafeInt = parsableByteArray.readSynchSafeInt();
        if (readUnsignedByte == 2) {
            if ((readUnsignedByte2 & 64) != 0) {
                androidx.media3.common.util.Log.w(TAG, "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                return null;
            }
        } else if (readUnsignedByte == 3) {
            if ((readUnsignedByte2 & 64) != 0) {
                int readInt = parsableByteArray.readInt();
                parsableByteArray.skipBytes(readInt);
                readSynchSafeInt -= readInt + 4;
            }
        } else {
            if (readUnsignedByte != 4) {
                androidx.media3.common.util.Log.w(TAG, "Skipped ID3 tag with unsupported majorVersion=" + readUnsignedByte);
                return null;
            }
            if ((readUnsignedByte2 & 64) != 0) {
                int readSynchSafeInt2 = parsableByteArray.readSynchSafeInt();
                parsableByteArray.skipBytes(readSynchSafeInt2 - 4);
                readSynchSafeInt -= readSynchSafeInt2;
            }
            if ((readUnsignedByte2 & 16) != 0) {
                readSynchSafeInt -= 10;
            }
        }
        if (readUnsignedByte < 4 && (readUnsignedByte2 & 128) != 0) {
            z = true;
        }
        return new androidx.media3.extractor.metadata.id3.Id3Decoder.Id3Header(readUnsignedByte, z, readSynchSafeInt);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0076, code lost:
    
        if ((r10 & 1) != 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0084, code lost:
    
        if ((r10 & 128) != 0) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean validateFrames(androidx.media3.common.util.ParsableByteArray parsableByteArray, int i, int i2, boolean z) {
        int readUnsignedInt24;
        long readUnsignedInt242;
        int i3;
        int i4;
        int position = parsableByteArray.getPosition();
        while (true) {
            try {
                boolean z2 = true;
                if (parsableByteArray.bytesLeft() < i2) {
                    return true;
                }
                if (i >= 3) {
                    readUnsignedInt24 = parsableByteArray.readInt();
                    readUnsignedInt242 = parsableByteArray.readUnsignedInt();
                    i3 = parsableByteArray.readUnsignedShort();
                } else {
                    readUnsignedInt24 = parsableByteArray.readUnsignedInt24();
                    readUnsignedInt242 = parsableByteArray.readUnsignedInt24();
                    i3 = 0;
                }
                if (readUnsignedInt24 == 0 && readUnsignedInt242 == 0 && i3 == 0) {
                    return true;
                }
                if (i == 4 && !z) {
                    if ((8421504 & readUnsignedInt242) != 0) {
                        return false;
                    }
                    readUnsignedInt242 = (((readUnsignedInt242 >> 24) & 255) << 21) | (readUnsignedInt242 & 255) | (((readUnsignedInt242 >> 8) & 255) << 7) | (((readUnsignedInt242 >> 16) & 255) << 14);
                }
                if (i == 4) {
                    i4 = (i3 & 64) != 0 ? 1 : 0;
                } else {
                    if (i == 3) {
                        i4 = (i3 & 32) != 0 ? 1 : 0;
                    } else {
                        i4 = 0;
                    }
                    z2 = false;
                    if (z2) {
                        i4 += 4;
                    }
                    if (readUnsignedInt242 < i4) {
                        return false;
                    }
                    if (parsableByteArray.bytesLeft() < readUnsignedInt242) {
                        return false;
                    }
                    parsableByteArray.skipBytes((int) readUnsignedInt242);
                }
            } finally {
                parsableByteArray.setPosition(position);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:0x0194, code lost:
    
        if (r13 == 67) goto L136;
     */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0209  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static androidx.media3.extractor.metadata.id3.Id3Frame decodeFrame(int i, androidx.media3.common.util.ParsableByteArray parsableByteArray, boolean z, int i2, androidx.media3.extractor.metadata.id3.Id3Decoder.FramePredicate framePredicate) {
        int readUnsignedInt24;
        java.lang.String str;
        int i3;
        int i4;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        androidx.media3.extractor.metadata.id3.Id3Frame decodeBinaryFrame;
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        int readUnsignedByte2 = parsableByteArray.readUnsignedByte();
        int readUnsignedByte3 = parsableByteArray.readUnsignedByte();
        int readUnsignedByte4 = i >= 3 ? parsableByteArray.readUnsignedByte() : 0;
        if (i == 4) {
            readUnsignedInt24 = parsableByteArray.readUnsignedIntToInt();
            if (!z) {
                readUnsignedInt24 = (((readUnsignedInt24 >> 24) & 255) << 21) | (readUnsignedInt24 & 255) | (((readUnsignedInt24 >> 8) & 255) << 7) | (((readUnsignedInt24 >> 16) & 255) << 14);
            }
        } else if (i == 3) {
            readUnsignedInt24 = parsableByteArray.readUnsignedIntToInt();
        } else {
            readUnsignedInt24 = parsableByteArray.readUnsignedInt24();
        }
        int i5 = readUnsignedInt24;
        int readUnsignedShort = i >= 3 ? parsableByteArray.readUnsignedShort() : 0;
        androidx.media3.extractor.metadata.id3.Id3Frame id3Frame = null;
        if (readUnsignedByte == 0 && readUnsignedByte2 == 0 && readUnsignedByte3 == 0 && readUnsignedByte4 == 0 && i5 == 0 && readUnsignedShort == 0) {
            parsableByteArray.setPosition(parsableByteArray.limit());
            return null;
        }
        int position = parsableByteArray.getPosition() + i5;
        if (position > parsableByteArray.limit()) {
            androidx.media3.common.util.Log.w(TAG, "Frame size exceeds remaining tag data");
            parsableByteArray.setPosition(parsableByteArray.limit());
            return null;
        }
        if (framePredicate != null) {
            str = TAG;
            i3 = position;
            i4 = readUnsignedShort;
            if (!framePredicate.evaluate(i, readUnsignedByte, readUnsignedByte2, readUnsignedByte3, readUnsignedByte4)) {
                parsableByteArray.setPosition(i3);
                return null;
            }
        } else {
            str = TAG;
            i3 = position;
            i4 = readUnsignedShort;
        }
        if (i == 3) {
            boolean z7 = (i4 & 128) != 0;
            z6 = (i4 & 64) != 0;
            z5 = false;
            z4 = z7;
            z3 = (i4 & 32) != 0;
            z2 = z4;
        } else if (i == 4) {
            z3 = (i4 & 64) != 0;
            boolean z8 = (i4 & 8) != 0;
            boolean z9 = (i4 & 4) != 0;
            z5 = (i4 & 2) != 0;
            z6 = z9;
            boolean z10 = z8;
            z4 = (i4 & 1) != 0;
            z2 = z10;
        } else {
            z2 = false;
            z3 = false;
            z4 = false;
            z5 = false;
            z6 = false;
        }
        if (z2 || z6) {
            androidx.media3.common.util.Log.w(str, "Skipping unsupported compressed or encrypted frame");
            parsableByteArray.setPosition(i3);
            return null;
        }
        if (z3) {
            i5--;
            parsableByteArray.skipBytes(1);
        }
        if (z4) {
            i5 -= 4;
            parsableByteArray.skipBytes(4);
        }
        if (z5) {
            i5 = removeUnsynchronization(parsableByteArray, i5);
        }
        try {
            if (readUnsignedByte == 84 && readUnsignedByte2 == 88 && readUnsignedByte3 == 88 && (i == 2 || readUnsignedByte4 == 88)) {
                decodeBinaryFrame = decodeTxxxFrame(parsableByteArray, i5);
            } else if (readUnsignedByte == 84) {
                decodeBinaryFrame = decodeTextInformationFrame(parsableByteArray, i5, getFrameId(i, readUnsignedByte, readUnsignedByte2, readUnsignedByte3, readUnsignedByte4));
            } else if (readUnsignedByte == 87 && readUnsignedByte2 == 88 && readUnsignedByte3 == 88 && (i == 2 || readUnsignedByte4 == 88)) {
                decodeBinaryFrame = decodeWxxxFrame(parsableByteArray, i5);
            } else if (readUnsignedByte == 87) {
                decodeBinaryFrame = decodeUrlLinkFrame(parsableByteArray, i5, getFrameId(i, readUnsignedByte, readUnsignedByte2, readUnsignedByte3, readUnsignedByte4));
            } else if (readUnsignedByte == 80 && readUnsignedByte2 == 82 && readUnsignedByte3 == 73 && readUnsignedByte4 == 86) {
                decodeBinaryFrame = decodePrivFrame(parsableByteArray, i5);
            } else if (readUnsignedByte == 71 && readUnsignedByte2 == 69 && readUnsignedByte3 == 79 && (readUnsignedByte4 == 66 || i == 2)) {
                decodeBinaryFrame = decodeGeobFrame(parsableByteArray, i5);
            } else if (i == 2) {
                if (readUnsignedByte == 80 && readUnsignedByte2 == 73 && readUnsignedByte3 == 67) {
                    decodeBinaryFrame = decodeApicFrame(parsableByteArray, i5, i);
                }
                if (readUnsignedByte != 67 && readUnsignedByte2 == 79 && readUnsignedByte3 == 77 && (readUnsignedByte4 == 77 || i == 2)) {
                    decodeBinaryFrame = decodeCommentFrame(parsableByteArray, i5);
                } else if (readUnsignedByte != 67 && readUnsignedByte2 == 72 && readUnsignedByte3 == 65 && readUnsignedByte4 == 80) {
                    decodeBinaryFrame = decodeChapterFrame(parsableByteArray, i5, i, z, i2, framePredicate);
                } else if (readUnsignedByte != 67 && readUnsignedByte2 == 84 && readUnsignedByte3 == 79 && readUnsignedByte4 == 67) {
                    decodeBinaryFrame = decodeChapterTOCFrame(parsableByteArray, i5, i, z, i2, framePredicate);
                } else if (readUnsignedByte != 77 && readUnsignedByte2 == 76 && readUnsignedByte3 == 76 && readUnsignedByte4 == 84) {
                    decodeBinaryFrame = decodeMlltFrame(parsableByteArray, i5);
                } else {
                    decodeBinaryFrame = decodeBinaryFrame(parsableByteArray, i5, getFrameId(i, readUnsignedByte, readUnsignedByte2, readUnsignedByte3, readUnsignedByte4));
                }
            } else {
                if (readUnsignedByte == 65) {
                    if (readUnsignedByte2 == 80) {
                        if (readUnsignedByte3 == 73) {
                        }
                    }
                }
                if (readUnsignedByte != 67) {
                }
                if (readUnsignedByte != 67) {
                }
                if (readUnsignedByte != 67) {
                }
                if (readUnsignedByte != 77) {
                }
                decodeBinaryFrame = decodeBinaryFrame(parsableByteArray, i5, getFrameId(i, readUnsignedByte, readUnsignedByte2, readUnsignedByte3, readUnsignedByte4));
            }
            parsableByteArray.setPosition(i3);
            id3Frame = decodeBinaryFrame;
            e = null;
        } catch (java.lang.Exception e) {
            e = e;
            parsableByteArray.setPosition(i3);
            if (id3Frame == null) {
            }
            return id3Frame;
        } catch (java.lang.OutOfMemoryError e2) {
            e = e2;
            parsableByteArray.setPosition(i3);
            if (id3Frame == null) {
            }
            return id3Frame;
        } catch (java.lang.Throwable th) {
            parsableByteArray.setPosition(i3);
            throw th;
        }
        if (id3Frame == null) {
            androidx.media3.common.util.Log.w(str, "Failed to decode frame: id=" + getFrameId(i, readUnsignedByte, readUnsignedByte2, readUnsignedByte3, readUnsignedByte4) + ", frameSize=" + i5, e);
        }
        return id3Frame;
    }

    private static androidx.media3.extractor.metadata.id3.TextInformationFrame decodeTxxxFrame(androidx.media3.common.util.ParsableByteArray parsableByteArray, int i) {
        if (i < 1) {
            return null;
        }
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        parsableByteArray.readBytes(bArr, 0, i2);
        int indexOfTerminator = indexOfTerminator(bArr, 0, readUnsignedByte);
        return new androidx.media3.extractor.metadata.id3.TextInformationFrame("TXXX", new java.lang.String(bArr, 0, indexOfTerminator, getCharset(readUnsignedByte)), decodeTextInformationFrameValues(bArr, readUnsignedByte, indexOfTerminator + delimiterLength(readUnsignedByte)));
    }

    private static androidx.media3.extractor.metadata.id3.TextInformationFrame decodeTextInformationFrame(androidx.media3.common.util.ParsableByteArray parsableByteArray, int i, java.lang.String str) {
        if (i < 1) {
            return null;
        }
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        parsableByteArray.readBytes(bArr, 0, i2);
        return new androidx.media3.extractor.metadata.id3.TextInformationFrame(str, (java.lang.String) null, decodeTextInformationFrameValues(bArr, readUnsignedByte, 0));
    }

    private static com.google.common.collect.ImmutableList<java.lang.String> decodeTextInformationFrameValues(byte[] bArr, int i, int i2) {
        if (i2 >= bArr.length) {
            return com.google.common.collect.ImmutableList.of("");
        }
        com.google.common.collect.ImmutableList.Builder builder = com.google.common.collect.ImmutableList.builder();
        int indexOfTerminator = indexOfTerminator(bArr, i2, i);
        while (i2 < indexOfTerminator) {
            builder.add((com.google.common.collect.ImmutableList.Builder) new java.lang.String(bArr, i2, indexOfTerminator - i2, getCharset(i)));
            i2 = delimiterLength(i) + indexOfTerminator;
            indexOfTerminator = indexOfTerminator(bArr, i2, i);
        }
        com.google.common.collect.ImmutableList<java.lang.String> build = builder.build();
        return build.isEmpty() ? com.google.common.collect.ImmutableList.of("") : build;
    }

    private static androidx.media3.extractor.metadata.id3.UrlLinkFrame decodeWxxxFrame(androidx.media3.common.util.ParsableByteArray parsableByteArray, int i) {
        if (i < 1) {
            return null;
        }
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        parsableByteArray.readBytes(bArr, 0, i2);
        int indexOfTerminator = indexOfTerminator(bArr, 0, readUnsignedByte);
        java.lang.String str = new java.lang.String(bArr, 0, indexOfTerminator, getCharset(readUnsignedByte));
        int delimiterLength = indexOfTerminator + delimiterLength(readUnsignedByte);
        return new androidx.media3.extractor.metadata.id3.UrlLinkFrame("WXXX", str, decodeStringIfValid(bArr, delimiterLength, indexOfZeroByte(bArr, delimiterLength), com.google.common.base.Charsets.ISO_8859_1));
    }

    private static androidx.media3.extractor.metadata.id3.UrlLinkFrame decodeUrlLinkFrame(androidx.media3.common.util.ParsableByteArray parsableByteArray, int i, java.lang.String str) {
        byte[] bArr = new byte[i];
        parsableByteArray.readBytes(bArr, 0, i);
        return new androidx.media3.extractor.metadata.id3.UrlLinkFrame(str, null, new java.lang.String(bArr, 0, indexOfZeroByte(bArr, 0), com.google.common.base.Charsets.ISO_8859_1));
    }

    private static androidx.media3.extractor.metadata.id3.PrivFrame decodePrivFrame(androidx.media3.common.util.ParsableByteArray parsableByteArray, int i) {
        byte[] bArr = new byte[i];
        parsableByteArray.readBytes(bArr, 0, i);
        int indexOfZeroByte = indexOfZeroByte(bArr, 0);
        return new androidx.media3.extractor.metadata.id3.PrivFrame(new java.lang.String(bArr, 0, indexOfZeroByte, com.google.common.base.Charsets.ISO_8859_1), copyOfRangeIfValid(bArr, indexOfZeroByte + 1, i));
    }

    private static androidx.media3.extractor.metadata.id3.GeobFrame decodeGeobFrame(androidx.media3.common.util.ParsableByteArray parsableByteArray, int i) {
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        java.nio.charset.Charset charset = getCharset(readUnsignedByte);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        parsableByteArray.readBytes(bArr, 0, i2);
        int indexOfZeroByte = indexOfZeroByte(bArr, 0);
        java.lang.String normalizeMimeType = androidx.media3.common.MimeTypes.normalizeMimeType(new java.lang.String(bArr, 0, indexOfZeroByte, com.google.common.base.Charsets.ISO_8859_1));
        int i3 = indexOfZeroByte + 1;
        int indexOfTerminator = indexOfTerminator(bArr, i3, readUnsignedByte);
        java.lang.String decodeStringIfValid = decodeStringIfValid(bArr, i3, indexOfTerminator, charset);
        int delimiterLength = indexOfTerminator + delimiterLength(readUnsignedByte);
        int indexOfTerminator2 = indexOfTerminator(bArr, delimiterLength, readUnsignedByte);
        return new androidx.media3.extractor.metadata.id3.GeobFrame(normalizeMimeType, decodeStringIfValid, decodeStringIfValid(bArr, delimiterLength, indexOfTerminator2, charset), copyOfRangeIfValid(bArr, indexOfTerminator2 + delimiterLength(readUnsignedByte), i2));
    }

    private static androidx.media3.extractor.metadata.id3.ApicFrame decodeApicFrame(androidx.media3.common.util.ParsableByteArray parsableByteArray, int i, int i2) {
        int indexOfZeroByte;
        java.lang.String str;
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        java.nio.charset.Charset charset = getCharset(readUnsignedByte);
        int i3 = i - 1;
        byte[] bArr = new byte[i3];
        parsableByteArray.readBytes(bArr, 0, i3);
        if (i2 == 2) {
            str = "image/" + com.google.common.base.Ascii.toLowerCase(new java.lang.String(bArr, 0, 3, com.google.common.base.Charsets.ISO_8859_1));
            if ("image/jpg".equals(str)) {
                str = "image/jpeg";
            }
            indexOfZeroByte = 2;
        } else {
            indexOfZeroByte = indexOfZeroByte(bArr, 0);
            java.lang.String lowerCase = com.google.common.base.Ascii.toLowerCase(new java.lang.String(bArr, 0, indexOfZeroByte, com.google.common.base.Charsets.ISO_8859_1));
            if (lowerCase.indexOf(47) == -1) {
                str = "image/" + lowerCase;
            } else {
                str = lowerCase;
            }
        }
        int i4 = bArr[indexOfZeroByte + 1] & 255;
        int i5 = indexOfZeroByte + 2;
        int indexOfTerminator = indexOfTerminator(bArr, i5, readUnsignedByte);
        return new androidx.media3.extractor.metadata.id3.ApicFrame(str, new java.lang.String(bArr, i5, indexOfTerminator - i5, charset), i4, copyOfRangeIfValid(bArr, indexOfTerminator + delimiterLength(readUnsignedByte), i3));
    }

    private static androidx.media3.extractor.metadata.id3.CommentFrame decodeCommentFrame(androidx.media3.common.util.ParsableByteArray parsableByteArray, int i) {
        if (i < 4) {
            return null;
        }
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        java.nio.charset.Charset charset = getCharset(readUnsignedByte);
        byte[] bArr = new byte[3];
        parsableByteArray.readBytes(bArr, 0, 3);
        java.lang.String str = new java.lang.String(bArr, 0, 3);
        int i2 = i - 4;
        byte[] bArr2 = new byte[i2];
        parsableByteArray.readBytes(bArr2, 0, i2);
        int indexOfTerminator = indexOfTerminator(bArr2, 0, readUnsignedByte);
        java.lang.String str2 = new java.lang.String(bArr2, 0, indexOfTerminator, charset);
        int delimiterLength = indexOfTerminator + delimiterLength(readUnsignedByte);
        return new androidx.media3.extractor.metadata.id3.CommentFrame(str, str2, decodeStringIfValid(bArr2, delimiterLength, indexOfTerminator(bArr2, delimiterLength, readUnsignedByte), charset));
    }

    private static androidx.media3.extractor.metadata.id3.ChapterFrame decodeChapterFrame(androidx.media3.common.util.ParsableByteArray parsableByteArray, int i, int i2, boolean z, int i3, androidx.media3.extractor.metadata.id3.Id3Decoder.FramePredicate framePredicate) {
        int position = parsableByteArray.getPosition();
        int indexOfZeroByte = indexOfZeroByte(parsableByteArray.getData(), position);
        java.lang.String str = new java.lang.String(parsableByteArray.getData(), position, indexOfZeroByte - position, com.google.common.base.Charsets.ISO_8859_1);
        parsableByteArray.setPosition(indexOfZeroByte + 1);
        int readInt = parsableByteArray.readInt();
        int readInt2 = parsableByteArray.readInt();
        long readUnsignedInt = parsableByteArray.readUnsignedInt();
        long j = readUnsignedInt == 4294967295L ? -1L : readUnsignedInt;
        long readUnsignedInt2 = parsableByteArray.readUnsignedInt();
        long j2 = readUnsignedInt2 == 4294967295L ? -1L : readUnsignedInt2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i4 = position + i;
        while (parsableByteArray.getPosition() < i4) {
            androidx.media3.extractor.metadata.id3.Id3Frame decodeFrame = decodeFrame(i2, parsableByteArray, z, i3, framePredicate);
            if (decodeFrame != null) {
                arrayList.add(decodeFrame);
            }
        }
        return new androidx.media3.extractor.metadata.id3.ChapterFrame(str, readInt, readInt2, j, j2, (androidx.media3.extractor.metadata.id3.Id3Frame[]) arrayList.toArray(new androidx.media3.extractor.metadata.id3.Id3Frame[0]));
    }

    private static androidx.media3.extractor.metadata.id3.ChapterTocFrame decodeChapterTOCFrame(androidx.media3.common.util.ParsableByteArray parsableByteArray, int i, int i2, boolean z, int i3, androidx.media3.extractor.metadata.id3.Id3Decoder.FramePredicate framePredicate) {
        int position = parsableByteArray.getPosition();
        int indexOfZeroByte = indexOfZeroByte(parsableByteArray.getData(), position);
        java.lang.String str = new java.lang.String(parsableByteArray.getData(), position, indexOfZeroByte - position, com.google.common.base.Charsets.ISO_8859_1);
        parsableByteArray.setPosition(indexOfZeroByte + 1);
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        boolean z2 = (readUnsignedByte & 2) != 0;
        boolean z3 = (readUnsignedByte & 1) != 0;
        int readUnsignedByte2 = parsableByteArray.readUnsignedByte();
        java.lang.String[] strArr = new java.lang.String[readUnsignedByte2];
        for (int i4 = 0; i4 < readUnsignedByte2; i4++) {
            int position2 = parsableByteArray.getPosition();
            int indexOfZeroByte2 = indexOfZeroByte(parsableByteArray.getData(), position2);
            strArr[i4] = new java.lang.String(parsableByteArray.getData(), position2, indexOfZeroByte2 - position2, com.google.common.base.Charsets.ISO_8859_1);
            parsableByteArray.setPosition(indexOfZeroByte2 + 1);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i5 = position + i;
        while (parsableByteArray.getPosition() < i5) {
            androidx.media3.extractor.metadata.id3.Id3Frame decodeFrame = decodeFrame(i2, parsableByteArray, z, i3, framePredicate);
            if (decodeFrame != null) {
                arrayList.add(decodeFrame);
            }
        }
        return new androidx.media3.extractor.metadata.id3.ChapterTocFrame(str, z2, z3, strArr, (androidx.media3.extractor.metadata.id3.Id3Frame[]) arrayList.toArray(new androidx.media3.extractor.metadata.id3.Id3Frame[0]));
    }

    private static androidx.media3.extractor.metadata.id3.MlltFrame decodeMlltFrame(androidx.media3.common.util.ParsableByteArray parsableByteArray, int i) {
        int readUnsignedShort = parsableByteArray.readUnsignedShort();
        int readUnsignedInt24 = parsableByteArray.readUnsignedInt24();
        int readUnsignedInt242 = parsableByteArray.readUnsignedInt24();
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        int readUnsignedByte2 = parsableByteArray.readUnsignedByte();
        androidx.media3.common.util.ParsableBitArray parsableBitArray = new androidx.media3.common.util.ParsableBitArray();
        parsableBitArray.reset(parsableByteArray);
        int i2 = ((i - 10) * 8) / (readUnsignedByte + readUnsignedByte2);
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int readBits = parsableBitArray.readBits(readUnsignedByte);
            int readBits2 = parsableBitArray.readBits(readUnsignedByte2);
            iArr[i3] = readBits;
            iArr2[i3] = readBits2;
        }
        return new androidx.media3.extractor.metadata.id3.MlltFrame(readUnsignedShort, readUnsignedInt24, readUnsignedInt242, iArr, iArr2);
    }

    private static androidx.media3.extractor.metadata.id3.BinaryFrame decodeBinaryFrame(androidx.media3.common.util.ParsableByteArray parsableByteArray, int i, java.lang.String str) {
        byte[] bArr = new byte[i];
        parsableByteArray.readBytes(bArr, 0, i);
        return new androidx.media3.extractor.metadata.id3.BinaryFrame(str, bArr);
    }

    private static int removeUnsynchronization(androidx.media3.common.util.ParsableByteArray parsableByteArray, int i) {
        byte[] data = parsableByteArray.getData();
        int position = parsableByteArray.getPosition();
        int i2 = position;
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= position + i) {
                return i;
            }
            if ((data[i2] & 255) == 255 && data[i3] == 0) {
                java.lang.System.arraycopy(data, i2 + 2, data, i3, (i - (i2 - position)) - 2);
                i--;
            }
            i2 = i3;
        }
    }

    private static java.nio.charset.Charset getCharset(int i) {
        if (i == 1) {
            return com.google.common.base.Charsets.UTF_16;
        }
        if (i == 2) {
            return com.google.common.base.Charsets.UTF_16BE;
        }
        if (i == 3) {
            return com.google.common.base.Charsets.UTF_8;
        }
        return com.google.common.base.Charsets.ISO_8859_1;
    }

    private static java.lang.String getFrameId(int i, int i2, int i3, int i4, int i5) {
        return i == 2 ? java.lang.String.format(java.util.Locale.US, "%c%c%c", java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(i4)) : java.lang.String.format(java.util.Locale.US, "%c%c%c%c", java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(i4), java.lang.Integer.valueOf(i5));
    }

    private static int indexOfTerminator(byte[] bArr, int i, int i2) {
        int indexOfZeroByte = indexOfZeroByte(bArr, i);
        if (i2 == 0 || i2 == 3) {
            return indexOfZeroByte;
        }
        while (indexOfZeroByte < bArr.length - 1) {
            if ((indexOfZeroByte - i) % 2 == 0 && bArr[indexOfZeroByte + 1] == 0) {
                return indexOfZeroByte;
            }
            indexOfZeroByte = indexOfZeroByte(bArr, indexOfZeroByte + 1);
        }
        return bArr.length;
    }

    private static int indexOfZeroByte(byte[] bArr, int i) {
        while (i < bArr.length) {
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }

    private static byte[] copyOfRangeIfValid(byte[] bArr, int i, int i2) {
        if (i2 <= i) {
            return androidx.media3.common.util.Util.EMPTY_BYTE_ARRAY;
        }
        return java.util.Arrays.copyOfRange(bArr, i, i2);
    }

    private static java.lang.String decodeStringIfValid(byte[] bArr, int i, int i2, java.nio.charset.Charset charset) {
        if (i2 <= i || i2 > bArr.length) {
            return "";
        }
        return new java.lang.String(bArr, i, i2 - i, charset);
    }

    private static final class Id3Header {
        private final int framesSize;
        private final boolean isUnsynchronized;
        private final int majorVersion;

        public Id3Header(int i, boolean z, int i2) {
            this.majorVersion = i;
            this.isUnsynchronized = z;
            this.framesSize = i2;
        }
    }
}
