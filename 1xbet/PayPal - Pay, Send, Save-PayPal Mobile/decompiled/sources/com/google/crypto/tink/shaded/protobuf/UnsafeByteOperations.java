package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes9.dex */
public final class UnsafeByteOperations {
    private UnsafeByteOperations() {
    }

    public static com.google.crypto.tink.shaded.protobuf.ByteString unsafeWrap(byte[] bArr) {
        return com.google.crypto.tink.shaded.protobuf.ByteString.wrap(bArr);
    }

    public static com.google.crypto.tink.shaded.protobuf.ByteString unsafeWrap(byte[] bArr, int i, int i2) {
        return com.google.crypto.tink.shaded.protobuf.ByteString.wrap(bArr, i, i2);
    }

    public static com.google.crypto.tink.shaded.protobuf.ByteString unsafeWrap(java.nio.ByteBuffer byteBuffer) {
        return com.google.crypto.tink.shaded.protobuf.ByteString.wrap(byteBuffer);
    }

    public static void unsafeWriteTo(com.google.crypto.tink.shaded.protobuf.ByteString byteString, com.google.crypto.tink.shaded.protobuf.ByteOutput byteOutput) throws java.io.IOException {
        byteString.writeTo(byteOutput);
    }
}
