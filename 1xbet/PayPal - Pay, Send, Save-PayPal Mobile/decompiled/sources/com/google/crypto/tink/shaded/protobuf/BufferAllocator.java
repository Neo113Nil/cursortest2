package com.google.crypto.tink.shaded.protobuf;

@com.google.crypto.tink.shaded.protobuf.CheckReturnValue
/* loaded from: classes9.dex */
abstract class BufferAllocator {
    private static final com.google.crypto.tink.shaded.protobuf.BufferAllocator UNPOOLED = new com.google.crypto.tink.shaded.protobuf.BufferAllocator() { // from class: com.google.crypto.tink.shaded.protobuf.BufferAllocator.1
        @Override // com.google.crypto.tink.shaded.protobuf.BufferAllocator
        public com.google.crypto.tink.shaded.protobuf.AllocatedBuffer allocateHeapBuffer(int i) {
            return com.google.crypto.tink.shaded.protobuf.AllocatedBuffer.wrap(new byte[i]);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BufferAllocator
        public com.google.crypto.tink.shaded.protobuf.AllocatedBuffer allocateDirectBuffer(int i) {
            return com.google.crypto.tink.shaded.protobuf.AllocatedBuffer.wrap(java.nio.ByteBuffer.allocateDirect(i));
        }
    };

    public abstract com.google.crypto.tink.shaded.protobuf.AllocatedBuffer allocateDirectBuffer(int i);

    public abstract com.google.crypto.tink.shaded.protobuf.AllocatedBuffer allocateHeapBuffer(int i);

    BufferAllocator() {
    }

    public static com.google.crypto.tink.shaded.protobuf.BufferAllocator unpooled() {
        return UNPOOLED;
    }
}
