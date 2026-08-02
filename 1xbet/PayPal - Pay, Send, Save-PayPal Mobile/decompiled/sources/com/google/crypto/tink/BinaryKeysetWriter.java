package com.google.crypto.tink;

/* loaded from: classes9.dex */
public final class BinaryKeysetWriter implements com.google.crypto.tink.KeysetWriter {
    private final java.io.OutputStream outputStream;

    private BinaryKeysetWriter(java.io.OutputStream outputStream) {
        this.outputStream = outputStream;
    }

    public static com.google.crypto.tink.KeysetWriter withOutputStream(java.io.OutputStream outputStream) {
        return new com.google.crypto.tink.BinaryKeysetWriter(outputStream);
    }

    @java.lang.Deprecated
    public static com.google.crypto.tink.KeysetWriter withFile(java.io.File file) throws java.io.IOException {
        return withOutputStream(new java.io.FileOutputStream(file));
    }

    @Override // com.google.crypto.tink.KeysetWriter
    public final void write(com.google.crypto.tink.proto.Keyset keyset) throws java.io.IOException {
        try {
            keyset.writeTo(this.outputStream);
        } finally {
            this.outputStream.close();
        }
    }

    @Override // com.google.crypto.tink.KeysetWriter
    public final void write(com.google.crypto.tink.proto.EncryptedKeyset encryptedKeyset) throws java.io.IOException {
        try {
            encryptedKeyset.toBuilder().clearKeysetInfo().build().writeTo(this.outputStream);
        } finally {
            this.outputStream.close();
        }
    }
}
