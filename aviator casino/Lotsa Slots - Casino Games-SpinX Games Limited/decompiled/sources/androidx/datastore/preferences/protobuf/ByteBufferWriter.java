package androidx.datastore.preferences.protobuf;

/* loaded from: classes2.dex */
final class ByteBufferWriter {
    private static final java.lang.ThreadLocal<java.lang.ref.SoftReference<byte[]>> BUFFER = new java.lang.ThreadLocal<>();
    private static final float BUFFER_REALLOCATION_THRESHOLD = 0.5f;
    private static final long CHANNEL_FIELD_OFFSET;
    private static final java.lang.Class<?> FILE_OUTPUT_STREAM_CLASS;
    private static final int MAX_CACHED_BUFFER_SIZE = 16384;
    private static final int MIN_CACHED_BUFFER_SIZE = 1024;

    private static boolean needToReallocate(int requestedSize, int bufferLength) {
        return bufferLength < requestedSize && ((float) bufferLength) < ((float) requestedSize) * 0.5f;
    }

    private ByteBufferWriter() {
    }

    static {
        java.lang.Class<?> safeGetClass = safeGetClass("java.io.FileOutputStream");
        FILE_OUTPUT_STREAM_CLASS = safeGetClass;
        CHANNEL_FIELD_OFFSET = getChannelFieldOffset(safeGetClass);
    }

    static void clearCachedBuffer() {
        BUFFER.set(null);
    }

    static void write(java.nio.ByteBuffer buffer, java.io.OutputStream output) throws java.io.IOException {
        int position = buffer.position();
        try {
            if (buffer.hasArray()) {
                output.write(buffer.array(), buffer.arrayOffset() + buffer.position(), buffer.remaining());
            } else if (!writeToChannel(buffer, output)) {
                byte[] orCreateBuffer = getOrCreateBuffer(buffer.remaining());
                while (buffer.hasRemaining()) {
                    int min = java.lang.Math.min(buffer.remaining(), orCreateBuffer.length);
                    buffer.get(orCreateBuffer, 0, min);
                    output.write(orCreateBuffer, 0, min);
                }
            }
        } finally {
            androidx.datastore.preferences.protobuf.Java8Compatibility.position(buffer, position);
        }
    }

    private static byte[] getOrCreateBuffer(int requestedSize) {
        int max = java.lang.Math.max(requestedSize, 1024);
        byte[] buffer = getBuffer();
        if (buffer == null || needToReallocate(max, buffer.length)) {
            buffer = new byte[max];
            if (max <= 16384) {
                setBuffer(buffer);
            }
        }
        return buffer;
    }

    private static byte[] getBuffer() {
        java.lang.ref.SoftReference<byte[]> softReference = BUFFER.get();
        if (softReference == null) {
            return null;
        }
        return softReference.get();
    }

    private static void setBuffer(byte[] value) {
        BUFFER.set(new java.lang.ref.SoftReference<>(value));
    }

    private static boolean writeToChannel(java.nio.ByteBuffer buffer, java.io.OutputStream output) throws java.io.IOException {
        java.nio.channels.WritableByteChannel writableByteChannel;
        long j = CHANNEL_FIELD_OFFSET;
        if (j < 0 || !FILE_OUTPUT_STREAM_CLASS.isInstance(output)) {
            return false;
        }
        try {
            writableByteChannel = (java.nio.channels.WritableByteChannel) androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(output, j);
        } catch (java.lang.ClassCastException unused) {
            writableByteChannel = null;
        }
        if (writableByteChannel == null) {
            return false;
        }
        writableByteChannel.write(buffer);
        return true;
    }

    private static java.lang.Class<?> safeGetClass(java.lang.String className) {
        try {
            return java.lang.Class.forName(className);
        } catch (java.lang.ClassNotFoundException unused) {
            return null;
        }
    }

    private static long getChannelFieldOffset(java.lang.Class<?> clazz) {
        if (clazz == null) {
            return -1L;
        }
        try {
            if (androidx.datastore.preferences.protobuf.UnsafeUtil.hasUnsafeArrayOperations()) {
                return androidx.datastore.preferences.protobuf.UnsafeUtil.objectFieldOffset(clazz.getDeclaredField("channel"));
            }
            return -1L;
        } catch (java.lang.Throwable unused) {
            return -1L;
        }
    }
}
