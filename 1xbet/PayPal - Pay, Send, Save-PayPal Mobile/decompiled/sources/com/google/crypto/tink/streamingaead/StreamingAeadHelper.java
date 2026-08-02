package com.google.crypto.tink.streamingaead;

/* loaded from: classes9.dex */
final class StreamingAeadHelper implements com.google.crypto.tink.StreamingAead {
    private final java.util.List<com.google.crypto.tink.StreamingAead> allPrimitives;
    private final com.google.crypto.tink.StreamingAead primary;

    public StreamingAeadHelper(java.util.List<com.google.crypto.tink.StreamingAead> list, com.google.crypto.tink.StreamingAead streamingAead) throws java.security.GeneralSecurityException {
        this.allPrimitives = list;
        this.primary = streamingAead;
    }

    @Override // com.google.crypto.tink.StreamingAead
    public final java.nio.channels.WritableByteChannel newEncryptingChannel(java.nio.channels.WritableByteChannel writableByteChannel, byte[] bArr) throws java.security.GeneralSecurityException, java.io.IOException {
        return this.primary.newEncryptingChannel(writableByteChannel, bArr);
    }

    @Override // com.google.crypto.tink.StreamingAead
    public final java.nio.channels.ReadableByteChannel newDecryptingChannel(java.nio.channels.ReadableByteChannel readableByteChannel, byte[] bArr) throws java.security.GeneralSecurityException, java.io.IOException {
        return new com.google.crypto.tink.streamingaead.ReadableByteChannelDecrypter(this.allPrimitives, readableByteChannel, bArr);
    }

    @Override // com.google.crypto.tink.StreamingAead
    public final java.nio.channels.SeekableByteChannel newSeekableDecryptingChannel(java.nio.channels.SeekableByteChannel seekableByteChannel, byte[] bArr) throws java.security.GeneralSecurityException, java.io.IOException {
        return new com.google.crypto.tink.streamingaead.SeekableByteChannelDecrypter(this.allPrimitives, seekableByteChannel, bArr);
    }

    @Override // com.google.crypto.tink.StreamingAead
    public final java.io.InputStream newDecryptingStream(java.io.InputStream inputStream, byte[] bArr) throws java.security.GeneralSecurityException, java.io.IOException {
        return new com.google.crypto.tink.streamingaead.InputStreamDecrypter(this.allPrimitives, inputStream, bArr);
    }

    @Override // com.google.crypto.tink.StreamingAead
    public final java.io.OutputStream newEncryptingStream(java.io.OutputStream outputStream, byte[] bArr) throws java.security.GeneralSecurityException, java.io.IOException {
        return this.primary.newEncryptingStream(outputStream, bArr);
    }
}
