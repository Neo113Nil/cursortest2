package com.google.protobuf;

/* loaded from: classes4.dex */
public final class UnsafeByteOperations {
    private UnsafeByteOperations() {
    }

    public static com.google.protobuf.ByteString unsafeWrap(byte[] buffer) {
        return com.google.protobuf.ByteString.wrap(buffer);
    }

    public static com.google.protobuf.ByteString unsafeWrap(byte[] buffer, int offset, int length) {
        return com.google.protobuf.ByteString.wrap(buffer, offset, length);
    }

    public static com.google.protobuf.ByteString unsafeWrap(java.nio.ByteBuffer buffer) {
        return com.google.protobuf.ByteString.wrap(buffer);
    }

    public static void unsafeWriteTo(com.google.protobuf.ByteString bytes, com.google.protobuf.ByteOutput output) throws java.io.IOException {
        bytes.writeTo(output);
    }
}
