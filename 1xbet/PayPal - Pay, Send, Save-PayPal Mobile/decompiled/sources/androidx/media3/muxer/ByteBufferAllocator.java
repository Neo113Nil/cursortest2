package androidx.media3.muxer;

/* loaded from: classes7.dex */
public interface ByteBufferAllocator {
    public static final androidx.media3.muxer.ByteBufferAllocator DEFAULT = new androidx.media3.muxer.ByteBufferAllocator() { // from class: androidx.media3.muxer.ByteBufferAllocator$$ExternalSyntheticLambda0
        @Override // androidx.media3.muxer.ByteBufferAllocator
        public final java.nio.ByteBuffer allocate(int i) {
            java.nio.ByteBuffer allocateDirect;
            allocateDirect = java.nio.ByteBuffer.allocateDirect(i);
            return allocateDirect;
        }
    };

    java.nio.ByteBuffer allocate(int i);
}
