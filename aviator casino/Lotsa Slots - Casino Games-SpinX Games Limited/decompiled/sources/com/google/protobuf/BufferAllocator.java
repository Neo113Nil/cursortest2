package com.google.protobuf;

@com.google.protobuf.CheckReturnValue
/* loaded from: classes4.dex */
abstract class BufferAllocator {
    private static final com.google.protobuf.BufferAllocator UNPOOLED = new com.google.protobuf.BufferAllocator() { // from class: com.google.protobuf.BufferAllocator.1
        @Override // com.google.protobuf.BufferAllocator
        public com.google.protobuf.AllocatedBuffer allocateHeapBuffer(int capacity) {
            return com.google.protobuf.AllocatedBuffer.wrap(new byte[capacity]);
        }

        @Override // com.google.protobuf.BufferAllocator
        public com.google.protobuf.AllocatedBuffer allocateDirectBuffer(int capacity) {
            return com.google.protobuf.AllocatedBuffer.wrap(java.nio.ByteBuffer.allocateDirect(capacity));
        }
    };

    public abstract com.google.protobuf.AllocatedBuffer allocateDirectBuffer(int capacity);

    public abstract com.google.protobuf.AllocatedBuffer allocateHeapBuffer(int capacity);

    BufferAllocator() {
    }

    public static com.google.protobuf.BufferAllocator unpooled() {
        return UNPOOLED;
    }
}
