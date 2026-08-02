package androidx.content.preferences.protobuf;

@androidx.content.preferences.protobuf.CheckReturnValue
/* loaded from: classes7.dex */
abstract class BufferAllocator {
    private static final androidx.content.preferences.protobuf.BufferAllocator getHighResolutionOutputSizeshNQ4ISI = new androidx.content.preferences.protobuf.BufferAllocator() { // from class: androidx.datastore.preferences.protobuf.BufferAllocator.1
        @Override // androidx.content.preferences.protobuf.BufferAllocator
        public final androidx.content.preferences.protobuf.AllocatedBuffer getHighSpeedVideoFpsRanges(int i) {
            return androidx.content.preferences.protobuf.AllocatedBuffer.getHighResolutionOutputSizeshNQ4ISI(new byte[i]);
        }

        @Override // androidx.content.preferences.protobuf.BufferAllocator
        public final androidx.content.preferences.protobuf.AllocatedBuffer getHighSpeedVideoFpsRangesFor(int i) {
            return androidx.content.preferences.protobuf.AllocatedBuffer.getHighSpeedVideoFpsRanges(java.nio.ByteBuffer.allocateDirect(i));
        }
    };

    public abstract androidx.content.preferences.protobuf.AllocatedBuffer getHighSpeedVideoFpsRanges(int i);

    public abstract androidx.content.preferences.protobuf.AllocatedBuffer getHighSpeedVideoFpsRangesFor(int i);

    BufferAllocator() {
    }
}
