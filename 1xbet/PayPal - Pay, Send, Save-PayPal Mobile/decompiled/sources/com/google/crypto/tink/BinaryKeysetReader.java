package com.google.crypto.tink;

/* loaded from: classes4.dex */
public final class BinaryKeysetReader implements com.google.crypto.tink.KeysetReader {
    private final java.io.InputStream inputStream;

    public static com.google.crypto.tink.KeysetReader withInputStream(java.io.InputStream inputStream) {
        return new com.google.crypto.tink.BinaryKeysetReader(inputStream);
    }

    public static com.google.crypto.tink.KeysetReader withBytes(byte[] bArr) {
        return new com.google.crypto.tink.BinaryKeysetReader(new java.io.ByteArrayInputStream(bArr));
    }

    @java.lang.Deprecated
    public static com.google.crypto.tink.KeysetReader withFile(java.io.File file) throws java.io.IOException {
        return withInputStream(new java.io.FileInputStream(file));
    }

    private BinaryKeysetReader(java.io.InputStream inputStream) {
        this.inputStream = inputStream;
    }

    @Override // com.google.crypto.tink.KeysetReader
    public final com.google.crypto.tink.proto.Keyset read() throws java.io.IOException {
        try {
            return com.google.crypto.tink.proto.Keyset.parseFrom(this.inputStream, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry());
        } finally {
            this.inputStream.close();
        }
    }

    @Override // com.google.crypto.tink.KeysetReader
    public final com.google.crypto.tink.proto.EncryptedKeyset readEncrypted() throws java.io.IOException {
        try {
            return com.google.crypto.tink.proto.EncryptedKeyset.parseFrom(this.inputStream, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry());
        } finally {
            this.inputStream.close();
        }
    }
}
