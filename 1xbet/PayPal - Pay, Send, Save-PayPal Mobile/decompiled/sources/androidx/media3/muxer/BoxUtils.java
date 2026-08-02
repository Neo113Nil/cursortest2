package androidx.media3.muxer;

/* loaded from: classes7.dex */
final class BoxUtils {
    private BoxUtils() {
    }

    public static java.nio.ByteBuffer getHighSpeedVideoFpsRangesFor(java.lang.String str, java.nio.ByteBuffer byteBuffer) {
        return Camera2StreamConfigurationMap(str.getBytes(java.nio.charset.StandardCharsets.UTF_8), byteBuffer);
    }

    public static java.nio.ByteBuffer Camera2StreamConfigurationMap(byte[] bArr, java.nio.ByteBuffer byteBuffer) {
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(byteBuffer.remaining() + 8);
        allocate.putInt(byteBuffer.remaining() + 8);
        allocate.put(bArr, 0, 4);
        allocate.put(byteBuffer);
        allocate.flip();
        return allocate;
    }

    public static java.nio.ByteBuffer getHighSpeedVideoFpsRanges(java.lang.String str, java.util.List<java.nio.ByteBuffer> list) {
        int i = 8;
        for (int i2 = 0; i2 < list.size(); i2++) {
            i += list.get(i2).remaining();
        }
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(i);
        allocate.putInt(i);
        allocate.put(str.getBytes(java.nio.charset.StandardCharsets.UTF_8), 0, 4);
        for (int i3 = 0; i3 < list.size(); i3++) {
            allocate.put(list.get(i3));
        }
        allocate.flip();
        return allocate;
    }

    public static java.nio.ByteBuffer getHighSpeedVideoSizes(java.nio.ByteBuffer... byteBufferArr) {
        int i = 0;
        for (java.nio.ByteBuffer byteBuffer : byteBufferArr) {
            i += byteBuffer.remaining();
        }
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(i);
        for (java.nio.ByteBuffer byteBuffer2 : byteBufferArr) {
            allocate.put(byteBuffer2);
        }
        allocate.flip();
        return allocate;
    }
}
