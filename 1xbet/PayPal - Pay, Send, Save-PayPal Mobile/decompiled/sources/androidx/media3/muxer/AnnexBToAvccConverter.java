package androidx.media3.muxer;

/* loaded from: classes7.dex */
public interface AnnexBToAvccConverter {
    public static final androidx.media3.muxer.AnnexBToAvccConverter DEFAULT = new androidx.media3.muxer.AnnexBToAvccConverter() { // from class: androidx.media3.muxer.AnnexBToAvccConverter.1
        @Override // androidx.media3.muxer.AnnexBToAvccConverter
        public java.nio.ByteBuffer process(java.nio.ByteBuffer byteBuffer) {
            return process(byteBuffer, androidx.media3.muxer.ByteBufferAllocator.DEFAULT);
        }

        @Override // androidx.media3.muxer.AnnexBToAvccConverter
        public java.nio.ByteBuffer process(java.nio.ByteBuffer byteBuffer, androidx.media3.muxer.ByteBufferAllocator byteBufferAllocator) {
            if (!byteBuffer.hasRemaining()) {
                return byteBuffer;
            }
            com.google.common.collect.ImmutableList<java.nio.ByteBuffer> highSpeedVideoFpsRangesFor = androidx.media3.muxer.AnnexBUtils.getHighSpeedVideoFpsRangesFor(byteBuffer);
            int i = 0;
            for (int i2 = 0; i2 < highSpeedVideoFpsRangesFor.size(); i2++) {
                i += highSpeedVideoFpsRangesFor.get(i2).remaining() + 4;
            }
            java.nio.ByteBuffer allocate = byteBufferAllocator.allocate(i);
            for (int i3 = 0; i3 < highSpeedVideoFpsRangesFor.size(); i3++) {
                java.nio.ByteBuffer byteBuffer2 = highSpeedVideoFpsRangesFor.get(i3);
                allocate.putInt(byteBuffer2.remaining());
                allocate.put(byteBuffer2);
            }
            allocate.rewind();
            byteBuffer.position(byteBuffer.limit());
            return allocate;
        }
    };

    java.nio.ByteBuffer process(java.nio.ByteBuffer byteBuffer);

    default java.nio.ByteBuffer process(java.nio.ByteBuffer byteBuffer, androidx.media3.muxer.ByteBufferAllocator byteBufferAllocator) {
        return process(byteBuffer);
    }
}
