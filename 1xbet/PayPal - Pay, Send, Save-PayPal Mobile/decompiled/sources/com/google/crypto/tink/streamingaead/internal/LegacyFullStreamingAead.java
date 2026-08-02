package com.google.crypto.tink.streamingaead.internal;

/* loaded from: classes9.dex */
public class LegacyFullStreamingAead implements com.google.crypto.tink.StreamingAead {
    private final com.google.crypto.tink.StreamingAead rawStreamingAead;

    public static com.google.crypto.tink.StreamingAead create(com.google.crypto.tink.internal.LegacyProtoKey legacyProtoKey) throws java.security.GeneralSecurityException {
        com.google.crypto.tink.internal.ProtoKeySerialization serialization = legacyProtoKey.getSerialization(com.google.crypto.tink.InsecureSecretKeyAccess.get());
        return (com.google.crypto.tink.StreamingAead) com.google.crypto.tink.internal.KeyManagerRegistry.globalInstance().getKeyManager(serialization.getTypeUrl(), com.google.crypto.tink.StreamingAead.class).getPrimitive(serialization.getValue());
    }

    private LegacyFullStreamingAead(com.google.crypto.tink.StreamingAead streamingAead) {
        this.rawStreamingAead = streamingAead;
    }

    @Override // com.google.crypto.tink.StreamingAead
    public java.nio.channels.WritableByteChannel newEncryptingChannel(java.nio.channels.WritableByteChannel writableByteChannel, byte[] bArr) throws java.security.GeneralSecurityException, java.io.IOException {
        return this.rawStreamingAead.newEncryptingChannel(writableByteChannel, bArr);
    }

    @Override // com.google.crypto.tink.StreamingAead
    public java.nio.channels.SeekableByteChannel newSeekableDecryptingChannel(java.nio.channels.SeekableByteChannel seekableByteChannel, byte[] bArr) throws java.security.GeneralSecurityException, java.io.IOException {
        return this.rawStreamingAead.newSeekableDecryptingChannel(seekableByteChannel, bArr);
    }

    @Override // com.google.crypto.tink.StreamingAead
    public java.nio.channels.ReadableByteChannel newDecryptingChannel(java.nio.channels.ReadableByteChannel readableByteChannel, byte[] bArr) throws java.security.GeneralSecurityException, java.io.IOException {
        return this.rawStreamingAead.newDecryptingChannel(readableByteChannel, bArr);
    }

    @Override // com.google.crypto.tink.StreamingAead
    public java.io.OutputStream newEncryptingStream(java.io.OutputStream outputStream, byte[] bArr) throws java.security.GeneralSecurityException, java.io.IOException {
        return this.rawStreamingAead.newEncryptingStream(outputStream, bArr);
    }

    @Override // com.google.crypto.tink.StreamingAead
    public java.io.InputStream newDecryptingStream(java.io.InputStream inputStream, byte[] bArr) throws java.security.GeneralSecurityException, java.io.IOException {
        return this.rawStreamingAead.newDecryptingStream(inputStream, bArr);
    }
}
