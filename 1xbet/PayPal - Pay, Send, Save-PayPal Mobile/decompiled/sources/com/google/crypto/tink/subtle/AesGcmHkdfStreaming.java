package com.google.crypto.tink.subtle;

/* loaded from: classes9.dex */
public final class AesGcmHkdfStreaming extends com.google.crypto.tink.subtle.NonceBasedStreamingAead {
    private static final int NONCE_PREFIX_IN_BYTES = 7;
    private static final int NONCE_SIZE_IN_BYTES = 12;
    private static final int TAG_SIZE_IN_BYTES = 16;
    private final int ciphertextSegmentSize;
    private final int firstSegmentOffset;
    private final java.lang.String hkdfAlg;
    private final byte[] ikm;
    private final int keySizeInBytes;
    private final int plaintextSegmentSize;

    @Override // com.google.crypto.tink.subtle.NonceBasedStreamingAead
    public final int getCiphertextOverhead() {
        return 16;
    }

    @Override // com.google.crypto.tink.subtle.NonceBasedStreamingAead, com.google.crypto.tink.StreamingAead
    public final /* bridge */ /* synthetic */ java.nio.channels.ReadableByteChannel newDecryptingChannel(java.nio.channels.ReadableByteChannel readableByteChannel, byte[] bArr) throws java.security.GeneralSecurityException, java.io.IOException {
        return super.newDecryptingChannel(readableByteChannel, bArr);
    }

    @Override // com.google.crypto.tink.subtle.NonceBasedStreamingAead, com.google.crypto.tink.StreamingAead
    public final /* bridge */ /* synthetic */ java.io.InputStream newDecryptingStream(java.io.InputStream inputStream, byte[] bArr) throws java.security.GeneralSecurityException, java.io.IOException {
        return super.newDecryptingStream(inputStream, bArr);
    }

    @Override // com.google.crypto.tink.subtle.NonceBasedStreamingAead, com.google.crypto.tink.StreamingAead
    public final /* bridge */ /* synthetic */ java.nio.channels.WritableByteChannel newEncryptingChannel(java.nio.channels.WritableByteChannel writableByteChannel, byte[] bArr) throws java.security.GeneralSecurityException, java.io.IOException {
        return super.newEncryptingChannel(writableByteChannel, bArr);
    }

    @Override // com.google.crypto.tink.subtle.NonceBasedStreamingAead, com.google.crypto.tink.StreamingAead
    public final /* bridge */ /* synthetic */ java.io.OutputStream newEncryptingStream(java.io.OutputStream outputStream, byte[] bArr) throws java.security.GeneralSecurityException, java.io.IOException {
        return super.newEncryptingStream(outputStream, bArr);
    }

    @Override // com.google.crypto.tink.subtle.NonceBasedStreamingAead, com.google.crypto.tink.StreamingAead
    public final /* bridge */ /* synthetic */ java.nio.channels.SeekableByteChannel newSeekableDecryptingChannel(java.nio.channels.SeekableByteChannel seekableByteChannel, byte[] bArr) throws java.security.GeneralSecurityException, java.io.IOException {
        return super.newSeekableDecryptingChannel(seekableByteChannel, bArr);
    }

    public AesGcmHkdfStreaming(byte[] bArr, java.lang.String str, int i, int i2, int i3) throws java.security.InvalidAlgorithmParameterException {
        if (bArr.length < 16 || bArr.length < i) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ikm too short, must be >= ");
            sb.append(java.lang.Math.max(16, i));
            throw new java.security.InvalidAlgorithmParameterException(sb.toString());
        }
        com.google.crypto.tink.subtle.Validators.validateAesKeySize(i);
        if (i2 <= getHeaderLength() + i3 + 16) {
            throw new java.security.InvalidAlgorithmParameterException("ciphertextSegmentSize too small");
        }
        this.ikm = java.util.Arrays.copyOf(bArr, bArr.length);
        this.hkdfAlg = str;
        this.keySizeInBytes = i;
        this.ciphertextSegmentSize = i2;
        this.firstSegmentOffset = i3;
        this.plaintextSegmentSize = i2 - 16;
    }

    private AesGcmHkdfStreaming(com.google.crypto.tink.streamingaead.AesGcmHkdfStreamingKey aesGcmHkdfStreamingKey) throws java.security.GeneralSecurityException {
        java.lang.String str;
        this.ikm = aesGcmHkdfStreamingKey.getInitialKeyMaterial().toByteArray(com.google.crypto.tink.InsecureSecretKeyAccess.get());
        if (aesGcmHkdfStreamingKey.getParameters().getHkdfHashType().equals(com.google.crypto.tink.streamingaead.AesGcmHkdfStreamingParameters.HashType.SHA1)) {
            str = "HmacSha1";
        } else if (aesGcmHkdfStreamingKey.getParameters().getHkdfHashType().equals(com.google.crypto.tink.streamingaead.AesGcmHkdfStreamingParameters.HashType.SHA256)) {
            str = "HmacSha256";
        } else if (aesGcmHkdfStreamingKey.getParameters().getHkdfHashType().equals(com.google.crypto.tink.streamingaead.AesGcmHkdfStreamingParameters.HashType.SHA512)) {
            str = "HmacSha512";
        } else {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unknown HKDF algorithm ");
            sb.append(aesGcmHkdfStreamingKey.getParameters().getHkdfHashType());
            throw new java.security.GeneralSecurityException(sb.toString());
        }
        this.hkdfAlg = str;
        this.keySizeInBytes = aesGcmHkdfStreamingKey.getParameters().getDerivedAesGcmKeySizeBytes();
        int ciphertextSegmentSizeBytes = aesGcmHkdfStreamingKey.getParameters().getCiphertextSegmentSizeBytes();
        this.ciphertextSegmentSize = ciphertextSegmentSizeBytes;
        this.firstSegmentOffset = 0;
        this.plaintextSegmentSize = ciphertextSegmentSizeBytes - 16;
    }

    public static com.google.crypto.tink.StreamingAead create(com.google.crypto.tink.streamingaead.AesGcmHkdfStreamingKey aesGcmHkdfStreamingKey) throws java.security.GeneralSecurityException {
        return new com.google.crypto.tink.subtle.AesGcmHkdfStreaming(aesGcmHkdfStreamingKey);
    }

    @Override // com.google.crypto.tink.subtle.NonceBasedStreamingAead
    public final com.google.crypto.tink.subtle.AesGcmHkdfStreaming.AesGcmHkdfStreamEncrypter newStreamSegmentEncrypter(byte[] bArr) throws java.security.GeneralSecurityException {
        return new com.google.crypto.tink.subtle.AesGcmHkdfStreaming.AesGcmHkdfStreamEncrypter(bArr);
    }

    @Override // com.google.crypto.tink.subtle.NonceBasedStreamingAead
    public final com.google.crypto.tink.subtle.AesGcmHkdfStreaming.AesGcmHkdfStreamDecrypter newStreamSegmentDecrypter() throws java.security.GeneralSecurityException {
        return new com.google.crypto.tink.subtle.AesGcmHkdfStreaming.AesGcmHkdfStreamDecrypter();
    }

    @Override // com.google.crypto.tink.subtle.NonceBasedStreamingAead
    public final int getPlaintextSegmentSize() {
        return this.plaintextSegmentSize;
    }

    @Override // com.google.crypto.tink.subtle.NonceBasedStreamingAead
    public final int getCiphertextSegmentSize() {
        return this.ciphertextSegmentSize;
    }

    @Override // com.google.crypto.tink.subtle.NonceBasedStreamingAead
    public final int getHeaderLength() {
        return this.keySizeInBytes + 8;
    }

    @Override // com.google.crypto.tink.subtle.NonceBasedStreamingAead
    public final int getCiphertextOffset() {
        return getHeaderLength() + this.firstSegmentOffset;
    }

    public final int getFirstSegmentOffset() {
        return this.firstSegmentOffset;
    }

    public final long expectedCiphertextSize(long j) {
        long ciphertextOffset = j + getCiphertextOffset();
        long j2 = this.plaintextSegmentSize;
        long j3 = (ciphertextOffset / j2) * this.ciphertextSegmentSize;
        long j4 = ciphertextOffset % j2;
        return j4 > 0 ? j3 + j4 + 16 : j3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static javax.crypto.Cipher cipherInstance() throws java.security.GeneralSecurityException {
        return com.google.crypto.tink.subtle.EngineFactory.CIPHER.getInstance(org.jose4j.jwe.SimpleAeadCipher.GCM_TRANSFORMATION_NAME);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public byte[] randomSalt() {
        return com.google.crypto.tink.subtle.Random.randBytes(this.keySizeInBytes);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static javax.crypto.spec.GCMParameterSpec paramsForSegment(byte[] bArr, long j, boolean z) throws java.security.GeneralSecurityException {
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(12);
        allocate.order(java.nio.ByteOrder.BIG_ENDIAN);
        allocate.put(bArr);
        com.google.crypto.tink.subtle.SubtleUtil.putAsUnsigedInt(allocate, j);
        allocate.put(z ? (byte) 1 : (byte) 0);
        return new javax.crypto.spec.GCMParameterSpec(128, allocate.array());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] randomNonce() {
        return com.google.crypto.tink.subtle.Random.randBytes(7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public javax.crypto.spec.SecretKeySpec deriveKeySpec(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        return new javax.crypto.spec.SecretKeySpec(com.google.crypto.tink.subtle.Hkdf.computeHkdf(this.hkdfAlg, this.ikm, bArr, bArr2, this.keySizeInBytes), org.jose4j.keys.AesKey.ALGORITHM);
    }

    class AesGcmHkdfStreamEncrypter implements com.google.crypto.tink.subtle.StreamSegmentEncrypter {
        private final javax.crypto.Cipher cipher = com.google.crypto.tink.subtle.AesGcmHkdfStreaming.cipherInstance();
        private long encryptedSegments;
        private final java.nio.ByteBuffer header;
        private final javax.crypto.spec.SecretKeySpec keySpec;
        private final byte[] noncePrefix;

        public AesGcmHkdfStreamEncrypter(byte[] bArr) throws java.security.GeneralSecurityException {
            this.encryptedSegments = 0L;
            this.encryptedSegments = 0L;
            byte[] randomSalt = com.google.crypto.tink.subtle.AesGcmHkdfStreaming.this.randomSalt();
            byte[] randomNonce = com.google.crypto.tink.subtle.AesGcmHkdfStreaming.randomNonce();
            this.noncePrefix = randomNonce;
            java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(com.google.crypto.tink.subtle.AesGcmHkdfStreaming.this.getHeaderLength());
            this.header = allocate;
            allocate.put((byte) com.google.crypto.tink.subtle.AesGcmHkdfStreaming.this.getHeaderLength());
            allocate.put(randomSalt);
            allocate.put(randomNonce);
            allocate.flip();
            this.keySpec = com.google.crypto.tink.subtle.AesGcmHkdfStreaming.this.deriveKeySpec(randomSalt, bArr);
        }

        @Override // com.google.crypto.tink.subtle.StreamSegmentEncrypter
        public java.nio.ByteBuffer getHeader() {
            return this.header.asReadOnlyBuffer();
        }

        @Override // com.google.crypto.tink.subtle.StreamSegmentEncrypter
        public void encryptSegment(java.nio.ByteBuffer byteBuffer, boolean z, java.nio.ByteBuffer byteBuffer2) throws java.security.GeneralSecurityException {
            synchronized (this) {
                this.cipher.init(1, this.keySpec, com.google.crypto.tink.subtle.AesGcmHkdfStreaming.paramsForSegment(this.noncePrefix, this.encryptedSegments, z));
                this.encryptedSegments++;
                this.cipher.doFinal(byteBuffer, byteBuffer2);
            }
        }

        @Override // com.google.crypto.tink.subtle.StreamSegmentEncrypter
        public void encryptSegment(java.nio.ByteBuffer byteBuffer, java.nio.ByteBuffer byteBuffer2, boolean z, java.nio.ByteBuffer byteBuffer3) throws java.security.GeneralSecurityException {
            synchronized (this) {
                this.cipher.init(1, this.keySpec, com.google.crypto.tink.subtle.AesGcmHkdfStreaming.paramsForSegment(this.noncePrefix, this.encryptedSegments, z));
                this.encryptedSegments++;
                if (byteBuffer2.hasRemaining()) {
                    this.cipher.update(byteBuffer, byteBuffer3);
                    this.cipher.doFinal(byteBuffer2, byteBuffer3);
                } else {
                    this.cipher.doFinal(byteBuffer, byteBuffer3);
                }
            }
        }
    }

    class AesGcmHkdfStreamDecrypter implements com.google.crypto.tink.subtle.StreamSegmentDecrypter {
        private javax.crypto.Cipher cipher;
        private javax.crypto.spec.SecretKeySpec keySpec;
        private byte[] noncePrefix;

        AesGcmHkdfStreamDecrypter() {
        }

        @Override // com.google.crypto.tink.subtle.StreamSegmentDecrypter
        public void init(java.nio.ByteBuffer byteBuffer, byte[] bArr) throws java.security.GeneralSecurityException {
            synchronized (this) {
                if (byteBuffer.remaining() != com.google.crypto.tink.subtle.AesGcmHkdfStreaming.this.getHeaderLength()) {
                    throw new java.security.InvalidAlgorithmParameterException("Invalid header length");
                }
                if (byteBuffer.get() != com.google.crypto.tink.subtle.AesGcmHkdfStreaming.this.getHeaderLength()) {
                    throw new java.security.GeneralSecurityException("Invalid ciphertext");
                }
                this.noncePrefix = new byte[7];
                byte[] bArr2 = new byte[com.google.crypto.tink.subtle.AesGcmHkdfStreaming.this.keySizeInBytes];
                byteBuffer.get(bArr2);
                byteBuffer.get(this.noncePrefix);
                this.keySpec = com.google.crypto.tink.subtle.AesGcmHkdfStreaming.this.deriveKeySpec(bArr2, bArr);
                this.cipher = com.google.crypto.tink.subtle.AesGcmHkdfStreaming.cipherInstance();
            }
        }

        @Override // com.google.crypto.tink.subtle.StreamSegmentDecrypter
        public void decryptSegment(java.nio.ByteBuffer byteBuffer, int i, boolean z, java.nio.ByteBuffer byteBuffer2) throws java.security.GeneralSecurityException {
            synchronized (this) {
                this.cipher.init(2, this.keySpec, com.google.crypto.tink.subtle.AesGcmHkdfStreaming.paramsForSegment(this.noncePrefix, i, z));
                this.cipher.doFinal(byteBuffer, byteBuffer2);
            }
        }
    }
}
