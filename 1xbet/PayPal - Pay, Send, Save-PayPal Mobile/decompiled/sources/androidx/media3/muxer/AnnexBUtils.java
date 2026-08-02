package androidx.media3.muxer;

/* loaded from: classes7.dex */
final class AnnexBUtils {
    private AnnexBUtils() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0058, code lost:
    
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0071, code lost:
    
        if (r5 == 1) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static com.google.common.collect.ImmutableList<java.nio.ByteBuffer> getHighSpeedVideoFpsRangesFor(java.nio.ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() == 0) {
            return com.google.common.collect.ImmutableList.of();
        }
        java.nio.ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        int highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(asReadOnlyBuffer, asReadOnlyBuffer.position()) + 3;
        com.google.common.collect.ImmutableList.Builder builder = new com.google.common.collect.ImmutableList.Builder();
        int i = highSpeedVideoFpsRangesFor;
        boolean z = true;
        while (highSpeedVideoFpsRangesFor < asReadOnlyBuffer.limit()) {
            if (!z) {
                int highSpeedVideoFpsRangesFor2 = getHighSpeedVideoFpsRangesFor(asReadOnlyBuffer, highSpeedVideoFpsRangesFor);
                if (highSpeedVideoFpsRangesFor2 == asReadOnlyBuffer.limit()) {
                    break;
                }
                i = highSpeedVideoFpsRangesFor2 + 3;
                z = true;
                highSpeedVideoFpsRangesFor = i;
            } else {
                while (true) {
                    if (highSpeedVideoFpsRangesFor <= asReadOnlyBuffer.limit() - 4) {
                        int i2 = asReadOnlyBuffer.getInt(highSpeedVideoFpsRangesFor);
                        int i3 = i2 & (-256);
                        if (i3 == 0 || i3 == 256) {
                            break;
                        }
                        int i4 = 16777215 & i2;
                        if (i4 == 0 || i4 == 1) {
                            break;
                        }
                        highSpeedVideoFpsRangesFor = (65535 & i2) == 0 ? highSpeedVideoFpsRangesFor + 2 : (i2 & 255) == 0 ? highSpeedVideoFpsRangesFor + 3 : highSpeedVideoFpsRangesFor + 4;
                    } else {
                        if (highSpeedVideoFpsRangesFor == asReadOnlyBuffer.limit() - 3) {
                            short s = asReadOnlyBuffer.getShort(highSpeedVideoFpsRangesFor);
                            byte b = asReadOnlyBuffer.get(highSpeedVideoFpsRangesFor + 2);
                            if (s == 0) {
                                if (b != 0) {
                                }
                            }
                        }
                        highSpeedVideoFpsRangesFor = asReadOnlyBuffer.limit();
                    }
                }
                java.nio.ByteBuffer duplicate = asReadOnlyBuffer.duplicate();
                duplicate.position(i);
                duplicate.limit((highSpeedVideoFpsRangesFor - i) + i);
                builder.add((com.google.common.collect.ImmutableList.Builder) duplicate.slice());
                z = false;
            }
        }
        return builder.build();
    }

    public static java.nio.ByteBuffer getHighSpeedVideoFpsRanges(java.nio.ByteBuffer byteBuffer) {
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(byteBuffer.limit());
        int i = 0;
        for (int i2 = 0; i2 < byteBuffer.limit(); i2++) {
            if (byteBuffer.get(i2) != 3 || i < 2) {
                allocate.put(byteBuffer.get(i2));
            }
            i = byteBuffer.get(i2) == 0 ? i + 1 : 0;
        }
        allocate.flip();
        return allocate;
    }

    public static boolean getHighSpeedVideoSizes(androidx.media3.common.Format format) {
        java.lang.String str = format.sampleMimeType;
        com.google.common.base.Preconditions.checkNotNull(str);
        return str.equals(androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION) ? ((java.lang.Integer) ((android.util.Pair) com.google.common.base.Preconditions.checkNotNull(androidx.media3.muxer.Boxes.getHighSpeedVideoFpsRangesFor(format))).first).intValue() != 10 : str.equals("video/avc") || str.equals(androidx.media3.common.MimeTypes.VIDEO_H265);
    }

    private static int getHighSpeedVideoFpsRangesFor(java.nio.ByteBuffer byteBuffer, int i) {
        while (true) {
            if (i <= byteBuffer.limit() - 4) {
                int i2 = byteBuffer.getInt(i);
                int i3 = i2 & (-256);
                if (i3 == 256) {
                    break;
                }
                com.google.common.base.Preconditions.checkState(i3 == 0, "Invalid Nal units");
                int i4 = i2 & 255;
                if (i4 == 1) {
                    return i + 1;
                }
                if (i4 == 0) {
                    r1 = true;
                }
                com.google.common.base.Preconditions.checkState(r1, "Invalid Nal units");
                i++;
            } else {
                if (i <= byteBuffer.limit() - 3) {
                    com.google.common.base.Preconditions.checkState(byteBuffer.getShort(i) == 0, "Invalid NAL units");
                    byte b = byteBuffer.get(i + 2);
                    if (b != 1) {
                        com.google.common.base.Preconditions.checkState(b == 0, "Invalid NAL units");
                    }
                } else {
                    while (i < byteBuffer.limit()) {
                        com.google.common.base.Preconditions.checkState(byteBuffer.get(i) == 0, "Invalid NAL units");
                        i++;
                    }
                }
                return byteBuffer.limit();
            }
        }
        return i;
    }
}
