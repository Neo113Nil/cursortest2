package com.google.crypto.tink;

/* loaded from: classes9.dex */
public interface StreamingAead {
    java.nio.channels.ReadableByteChannel newDecryptingChannel(java.nio.channels.ReadableByteChannel readableByteChannel, byte[] bArr) throws java.security.GeneralSecurityException, java.io.IOException;

    java.io.InputStream newDecryptingStream(java.io.InputStream inputStream, byte[] bArr) throws java.security.GeneralSecurityException, java.io.IOException;

    java.nio.channels.WritableByteChannel newEncryptingChannel(java.nio.channels.WritableByteChannel writableByteChannel, byte[] bArr) throws java.security.GeneralSecurityException, java.io.IOException;

    java.io.OutputStream newEncryptingStream(java.io.OutputStream outputStream, byte[] bArr) throws java.security.GeneralSecurityException, java.io.IOException;

    java.nio.channels.SeekableByteChannel newSeekableDecryptingChannel(java.nio.channels.SeekableByteChannel seekableByteChannel, byte[] bArr) throws java.security.GeneralSecurityException, java.io.IOException;
}
