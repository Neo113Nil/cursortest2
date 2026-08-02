package androidx.media3.muxer;

/* loaded from: classes7.dex */
final class Av1ConfigUtil {
    public static byte[] getHighSpeedVideoFpsRangesFor(java.nio.ByteBuffer byteBuffer) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<androidx.media3.container.ObuParser.Obu> it = androidx.media3.container.ObuParser.split(byteBuffer).iterator();
        java.nio.ByteBuffer byteBuffer2 = null;
        java.nio.ByteBuffer byteBuffer3 = null;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            androidx.media3.container.ObuParser.Obu next = it.next();
            if (next.type == 5) {
                arrayList.add(getHighSpeedVideoFpsRanges(next));
            } else if (next.type == 1 && byteBuffer2 == null) {
                byteBuffer2 = getHighSpeedVideoFpsRanges(next);
                java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(4);
                allocate.put((byte) -127);
                androidx.media3.container.ObuParser.SequenceHeader parse = androidx.media3.container.ObuParser.SequenceHeader.parse(next);
                com.google.common.base.Preconditions.checkNotNull(parse, "No sequence header available.");
                allocate.put((byte) ((parse.seqProfile << 5) | parse.seqLevelIdx0));
                allocate.put((byte) ((parse.subsamplingY ? 4 : 0) | (parse.seqTier0 > 0 ? 128 : 0) | (parse.highBitdepth ? 64 : 0) | (parse.twelveBit ? 32 : 0) | (parse.monochrome ? 16 : 0) | (parse.subsamplingX ? 8 : 0) | parse.chromaSamplePosition));
                allocate.put((byte) ((parse.initialDisplayDelayPresentFlag ? 16 : 0) | (parse.initialDisplayDelayPresentFlag ? parse.initialDisplayDelayMinus1 & 15 : 0)));
                allocate.flip();
                byteBuffer3 = allocate;
            }
        }
        com.google.common.base.Preconditions.checkNotNull(byteBuffer2, "No sequence header available.");
        java.nio.ByteBuffer highSpeedVideoSizes = androidx.media3.muxer.BoxUtils.getHighSpeedVideoSizes((java.nio.ByteBuffer[]) arrayList.toArray(new java.nio.ByteBuffer[0]));
        if (highSpeedVideoSizes != null) {
            byteBuffer2 = androidx.media3.muxer.BoxUtils.getHighSpeedVideoSizes(byteBuffer2, highSpeedVideoSizes);
        }
        return androidx.media3.muxer.BoxUtils.getHighSpeedVideoSizes((java.nio.ByteBuffer) com.google.common.base.Preconditions.checkNotNull(byteBuffer3, "csdHeader is null."), byteBuffer2).array();
    }

    private static java.nio.ByteBuffer getHighSpeedVideoFpsRanges(androidx.media3.container.ObuParser.Obu obu) {
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(obu.payload.remaining() + 9);
        allocate.put((byte) ((obu.type << 3) | 2));
        allocate.put(getHighResolutionOutputSizeshNQ4ISI(obu.payload.remaining()));
        allocate.put(obu.payload.duplicate());
        allocate.flip();
        return allocate;
    }

    private static java.nio.ByteBuffer getHighResolutionOutputSizeshNQ4ISI(int i) {
        com.google.common.base.Preconditions.checkArgument(i > 0);
        int i2 = i;
        int i3 = 0;
        do {
            i3++;
            i2 >>= 7;
        } while (i2 != 0);
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(i3);
        com.google.common.base.Preconditions.checkState(i3 < 8);
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = (byte) (i & 127);
            i >>= 7;
            if (i != 0) {
                i5 |= 128;
            }
            allocate.put((byte) i5);
        }
        allocate.flip();
        return allocate;
    }

    private Av1ConfigUtil() {
    }
}
