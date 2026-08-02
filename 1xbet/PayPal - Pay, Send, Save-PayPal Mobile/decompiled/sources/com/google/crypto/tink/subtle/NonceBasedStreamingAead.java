package com.google.crypto.tink.subtle;

/* loaded from: classes9.dex */
abstract class NonceBasedStreamingAead implements com.google.crypto.tink.StreamingAead {
    public abstract int getCiphertextOffset();

    public abstract int getCiphertextOverhead();

    public abstract int getCiphertextSegmentSize();

    public abstract int getHeaderLength();

    public abstract int getPlaintextSegmentSize();

    public abstract com.google.crypto.tink.subtle.StreamSegmentDecrypter newStreamSegmentDecrypter() throws java.security.GeneralSecurityException;

    public abstract com.google.crypto.tink.subtle.StreamSegmentEncrypter newStreamSegmentEncrypter(byte[] bArr) throws java.security.GeneralSecurityException;

    NonceBasedStreamingAead() {
    }

    @Override // com.google.crypto.tink.StreamingAead
    public java.nio.channels.WritableByteChannel newEncryptingChannel(java.nio.channels.WritableByteChannel writableByteChannel, byte[] bArr) throws java.security.GeneralSecurityException, java.io.IOException {
        return new com.google.crypto.tink.subtle.StreamingAeadEncryptingChannel(this, writableByteChannel, bArr);
    }

    @Override // com.google.crypto.tink.StreamingAead
    public java.nio.channels.ReadableByteChannel newDecryptingChannel(java.nio.channels.ReadableByteChannel readableByteChannel, byte[] bArr) throws java.security.GeneralSecurityException, java.io.IOException {
        return new com.google.crypto.tink.subtle.StreamingAeadDecryptingChannel(this, readableByteChannel, bArr);
    }

    @Override // com.google.crypto.tink.StreamingAead
    public java.nio.channels.SeekableByteChannel newSeekableDecryptingChannel(java.nio.channels.SeekableByteChannel seekableByteChannel, byte[] bArr) throws java.security.GeneralSecurityException, java.io.IOException {
        return new com.google.crypto.tink.subtle.StreamingAeadSeekableDecryptingChannel(this, seekableByteChannel, bArr);
    }

    @Override // com.google.crypto.tink.StreamingAead
    public java.io.OutputStream newEncryptingStream(java.io.OutputStream outputStream, byte[] bArr) throws java.security.GeneralSecurityException, java.io.IOException {
        return new com.google.crypto.tink.subtle.StreamingAeadEncryptingStream(this, outputStream, bArr);
    }

    @Override // com.google.crypto.tink.StreamingAead
    public java.io.InputStream newDecryptingStream(java.io.InputStream inputStream, byte[] bArr) throws java.security.GeneralSecurityException, java.io.IOException {
        return new com.google.crypto.tink.subtle.StreamingAeadDecryptingStream(this, inputStream, bArr);
    }
}
