package androidx.media3.extractor.mp4;

/* loaded from: classes2.dex */
final class Sniffer {
    public static final int BRAND_HEIC = 1751476579;
    public static final int BRAND_QUICKTIME = 1903435808;
    private static final int[] COMPATIBLE_BRANDS = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};
    private static final int SEARCH_LENGTH = 4096;

    public static androidx.media3.extractor.SniffFailure sniffFragmented(androidx.media3.extractor.ExtractorInput extractorInput) throws java.io.IOException {
        return sniffInternal(extractorInput, true, false);
    }

    public static androidx.media3.extractor.SniffFailure sniffUnfragmented(androidx.media3.extractor.ExtractorInput extractorInput, boolean z) throws java.io.IOException {
        return sniffInternal(extractorInput, false, z);
    }

    private static androidx.media3.extractor.SniffFailure sniffInternal(androidx.media3.extractor.ExtractorInput extractorInput, boolean z, boolean z2) throws java.io.IOException {
        boolean z3;
        long j;
        int i;
        boolean z4;
        int[] iArr;
        long length = extractorInput.getLength();
        long j2 = android.support.v4.media.session.PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
        long j3 = -1;
        if (length != -1 && length <= android.support.v4.media.session.PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) {
            j2 = length;
        }
        int i2 = (int) j2;
        androidx.media3.common.util.ParsableByteArray parsableByteArray = new androidx.media3.common.util.ParsableByteArray(64);
        int i3 = 0;
        int i4 = 0;
        boolean z5 = false;
        while (i4 < i2) {
            parsableByteArray.reset(8);
            if (!extractorInput.peekFully(parsableByteArray.getData(), i3, 8, true)) {
                break;
            }
            long readUnsignedInt = parsableByteArray.readUnsignedInt();
            int readInt = parsableByteArray.readInt();
            if (readUnsignedInt == 1) {
                extractorInput.peekFully(parsableByteArray.getData(), 8, 8);
                i = 16;
                parsableByteArray.setLimit(16);
                j = parsableByteArray.readLong();
            } else {
                if (readUnsignedInt == 0) {
                    long length2 = extractorInput.getLength();
                    if (length2 != j3) {
                        readUnsignedInt = (length2 - extractorInput.getPeekPosition()) + 8;
                    }
                }
                j = readUnsignedInt;
                i = 8;
            }
            long j4 = i;
            if (j < j4) {
                return new androidx.media3.extractor.mp4.AtomSizeTooSmallSniffFailure(readInt, j, i);
            }
            i4 += i;
            if (readInt == 1836019574) {
                i2 += (int) j;
                if (length != -1 && i2 > length) {
                    i2 = (int) length;
                }
                j3 = -1;
            } else {
                if (readInt == 1836019558 || readInt == 1836475768) {
                    z3 = true;
                    break;
                }
                long j5 = length;
                if (readInt == 1835295092) {
                    z5 = true;
                }
                if ((i4 + j) - j4 >= i2) {
                    break;
                }
                int i5 = (int) (j - j4);
                i4 += i5;
                if (readInt == 1718909296) {
                    if (i5 < 8) {
                        return new androidx.media3.extractor.mp4.AtomSizeTooSmallSniffFailure(readInt, i5, 8);
                    }
                    parsableByteArray.reset(i5);
                    extractorInput.peekFully(parsableByteArray.getData(), 0, i5);
                    int readInt2 = parsableByteArray.readInt();
                    if (isCompatibleBrand(readInt2, z2)) {
                        z5 = true;
                    }
                    parsableByteArray.skipBytes(4);
                    int bytesLeft = parsableByteArray.bytesLeft() / 4;
                    if (!z5 && bytesLeft > 0) {
                        iArr = new int[bytesLeft];
                        int i6 = 0;
                        while (true) {
                            if (i6 >= bytesLeft) {
                                z4 = z5;
                                break;
                            }
                            int readInt3 = parsableByteArray.readInt();
                            iArr[i6] = readInt3;
                            if (isCompatibleBrand(readInt3, z2)) {
                                z4 = true;
                                break;
                            }
                            i6++;
                        }
                    } else {
                        z4 = z5;
                        iArr = null;
                    }
                    if (!z4) {
                        return new androidx.media3.extractor.mp4.UnsupportedBrandsSniffFailure(readInt2, iArr);
                    }
                    z5 = z4;
                } else if (i5 != 0) {
                    extractorInput.advancePeekPosition(i5);
                }
                length = j5;
                j3 = -1;
                i3 = 0;
            }
        }
        z3 = false;
        if (!z5) {
            return androidx.media3.extractor.mp4.NoDeclaredBrandSniffFailure.INSTANCE;
        }
        if (z == z3) {
            return null;
        }
        if (z3) {
            return androidx.media3.extractor.mp4.IncorrectFragmentationSniffFailure.FILE_FRAGMENTED;
        }
        return androidx.media3.extractor.mp4.IncorrectFragmentationSniffFailure.FILE_NOT_FRAGMENTED;
    }

    private static boolean isCompatibleBrand(int i, boolean z) {
        if ((i >>> 8) == 3368816) {
            return true;
        }
        if (i == 1751476579 && z) {
            return true;
        }
        for (int i2 : COMPATIBLE_BRANDS) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    private Sniffer() {
    }
}
