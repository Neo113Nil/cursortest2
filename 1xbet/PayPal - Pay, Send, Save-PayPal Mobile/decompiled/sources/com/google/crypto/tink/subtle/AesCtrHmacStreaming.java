package com.google.crypto.tink.subtle;

/* loaded from: classes9.dex */
public final class AesCtrHmacStreaming extends com.google.crypto.tink.subtle.NonceBasedStreamingAead {
    public static final com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility FIPS = com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_NOT_FIPS;
    private static final int HMAC_KEY_SIZE_IN_BYTES = 32;
    private static final int NONCE_PREFIX_IN_BYTES = 7;
    private static final int NONCE_SIZE_IN_BYTES = 16;
    private final int ciphertextSegmentSize;
    private final int firstSegmentOffset;
    private final java.lang.String hkdfAlgo;
    private final byte[] ikm;
    private final int keySizeInBytes;
    private final int plaintextSegmentSize;
    private final java.lang.String tagAlgo;
    private final int tagSizeInBytes;

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

    public AesCtrHmacStreaming(byte[] bArr, java.lang.String str, int i, java.lang.String str2, int i2, int i3, int i4) throws java.security.GeneralSecurityException {
        if (!FIPS.isCompatible()) {
            throw new java.security.GeneralSecurityException("Can not use AES-CTR-HMAC streaming in FIPS-mode.");
        }
        validateParameters(bArr.length, i, str2, i2, i3, i4);
        this.ikm = java.util.Arrays.copyOf(bArr, bArr.length);
        this.hkdfAlgo = str;
        this.keySizeInBytes = i;
        this.tagAlgo = str2;
        this.tagSizeInBytes = i2;
        this.ciphertextSegmentSize = i3;
        this.firstSegmentOffset = i4;
        this.plaintextSegmentSize = i3 - i2;
    }

    private AesCtrHmacStreaming(com.google.crypto.tink.streamingaead.AesCtrHmacStreamingKey aesCtrHmacStreamingKey) throws java.security.GeneralSecurityException {
        java.lang.String str;
        if (!FIPS.isCompatible()) {
            throw new java.security.GeneralSecurityException("Can not use AES-CTR-HMAC streaming in FIPS-mode.");
        }
        this.ikm = aesCtrHmacStreamingKey.getInitialKeyMaterial().toByteArray(com.google.crypto.tink.InsecureSecretKeyAccess.get());
        java.lang.String str2 = "";
        if (aesCtrHmacStreamingKey.getParameters().getHkdfHashType().equals(com.google.crypto.tink.streamingaead.AesCtrHmacStreamingParameters.HashType.SHA1)) {
            str = "HmacSha1";
        } else if (aesCtrHmacStreamingKey.getParameters().getHkdfHashType().equals(com.google.crypto.tink.streamingaead.AesCtrHmacStreamingParameters.HashType.SHA256)) {
            str = "HmacSha256";
        } else {
            str = aesCtrHmacStreamingKey.getParameters().getHkdfHashType().equals(com.google.crypto.tink.streamingaead.AesCtrHmacStreamingParameters.HashType.SHA512) ? "HmacSha512" : "";
        }
        this.hkdfAlgo = str;
        this.keySizeInBytes = aesCtrHmacStreamingKey.getParameters().getDerivedKeySizeBytes();
        if (aesCtrHmacStreamingKey.getParameters().getHmacHashType().equals(com.google.crypto.tink.streamingaead.AesCtrHmacStreamingParameters.HashType.SHA1)) {
            str2 = "HmacSha1";
        } else if (aesCtrHmacStreamingKey.getParameters().getHmacHashType().equals(com.google.crypto.tink.streamingaead.AesCtrHmacStreamingParameters.HashType.SHA256)) {
            str2 = "HmacSha256";
        } else if (aesCtrHmacStreamingKey.getParameters().getHmacHashType().equals(com.google.crypto.tink.streamingaead.AesCtrHmacStreamingParameters.HashType.SHA512)) {
            str2 = "HmacSha512";
        }
        this.tagAlgo = str2;
        int hmacTagSizeBytes = aesCtrHmacStreamingKey.getParameters().getHmacTagSizeBytes();
        this.tagSizeInBytes = hmacTagSizeBytes;
        int ciphertextSegmentSizeBytes = aesCtrHmacStreamingKey.getParameters().getCiphertextSegmentSizeBytes();
        this.ciphertextSegmentSize = ciphertextSegmentSizeBytes;
        this.firstSegmentOffset = 0;
        this.plaintextSegmentSize = ciphertextSegmentSizeBytes - hmacTagSizeBytes;
    }

    public static com.google.crypto.tink.StreamingAead create(com.google.crypto.tink.streamingaead.AesCtrHmacStreamingKey aesCtrHmacStreamingKey) throws java.security.GeneralSecurityException {
        return new com.google.crypto.tink.subtle.AesCtrHmacStreaming(aesCtrHmacStreamingKey);
    }

    private static void validateParameters(int i, int i2, java.lang.String str, int i3, int i4, int i5) throws java.security.InvalidAlgorithmParameterException {
        if (i < 16 || i < i2) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ikm too short, must be >= ");
            sb.append(java.lang.Math.max(16, i2));
            throw new java.security.InvalidAlgorithmParameterException(sb.toString());
        }
        if (i5 < 0) {
            throw new java.security.InvalidAlgorithmParameterException("firstSegmentOffset must not be negative");
        }
        com.google.crypto.tink.subtle.Validators.validateAesKeySize(i2);
        if (i3 < 10) {
            throw new java.security.InvalidAlgorithmParameterException("tag size too small ".concat(java.lang.String.valueOf(i3)));
        }
        if ((str.equals("HmacSha1") && i3 > 20) || ((str.equals("HmacSha256") && i3 > 32) || (str.equals("HmacSha512") && i3 > 64))) {
            throw new java.security.InvalidAlgorithmParameterException("tag size too big");
        }
        if ((((i4 - i5) - i3) - i2) - 8 <= 0) {
            throw new java.security.InvalidAlgorithmParameterException("ciphertextSegmentSize too small");
        }
    }

    @Override // com.google.crypto.tink.subtle.NonceBasedStreamingAead
    public final com.google.crypto.tink.subtle.AesCtrHmacStreaming.AesCtrHmacStreamEncrypter newStreamSegmentEncrypter(byte[] bArr) throws java.security.GeneralSecurityException {
        return new com.google.crypto.tink.subtle.AesCtrHmacStreaming.AesCtrHmacStreamEncrypter(bArr);
    }

    @Override // com.google.crypto.tink.subtle.NonceBasedStreamingAead
    public final com.google.crypto.tink.subtle.AesCtrHmacStreaming.AesCtrHmacStreamDecrypter newStreamSegmentDecrypter() throws java.security.GeneralSecurityException {
        return new com.google.crypto.tink.subtle.AesCtrHmacStreaming.AesCtrHmacStreamDecrypter();
    }

    @Override // com.google.crypto.tink.subtle.NonceBasedStreamingAead
    public final int getCiphertextSegmentSize() {
        return this.ciphertextSegmentSize;
    }

    @Override // com.google.crypto.tink.subtle.NonceBasedStreamingAead
    public final int getPlaintextSegmentSize() {
        return this.plaintextSegmentSize;
    }

    @Override // com.google.crypto.tink.subtle.NonceBasedStreamingAead
    public final int getHeaderLength() {
        return this.keySizeInBytes + 8;
    }

    @Override // com.google.crypto.tink.subtle.NonceBasedStreamingAead
    public final int getCiphertextOffset() {
        return getHeaderLength() + this.firstSegmentOffset;
    }

    @Override // com.google.crypto.tink.subtle.NonceBasedStreamingAead
    public final int getCiphertextOverhead() {
        return this.tagSizeInBytes;
    }

    public final int getFirstSegmentOffset() {
        return this.firstSegmentOffset;
    }

    public final long expectedCiphertextSize(long j) {
        long ciphertextOffset = j + getCiphertextOffset();
        long j2 = this.plaintextSegmentSize;
        long j3 = (ciphertextOffset / j2) * this.ciphertextSegmentSize;
        long j4 = ciphertextOffset % j2;
        return j4 > 0 ? j3 + j4 + this.tagSizeInBytes : j3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static javax.crypto.Cipher cipherInstance() throws java.security.GeneralSecurityException {
        return com.google.crypto.tink.subtle.EngineFactory.CIPHER.getInstance("AES/CTR/NoPadding");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public javax.crypto.Mac macInstance() throws java.security.GeneralSecurityException {
        return com.google.crypto.tink.subtle.EngineFactory.MAC.getInstance(this.tagAlgo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public byte[] randomSalt() {
        return com.google.crypto.tink.subtle.Random.randBytes(this.keySizeInBytes);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public byte[] nonceForSegment(byte[] bArr, long j, boolean z) throws java.security.GeneralSecurityException {
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(16);
        allocate.order(java.nio.ByteOrder.BIG_ENDIAN);
        allocate.put(bArr);
        com.google.crypto.tink.subtle.SubtleUtil.putAsUnsigedInt(allocate, j);
        allocate.put(z ? (byte) 1 : (byte) 0);
        allocate.putInt(0);
        return allocate.array();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public byte[] randomNonce() {
        return com.google.crypto.tink.subtle.Random.randBytes(7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public byte[] deriveKeyMaterial(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        return com.google.crypto.tink.subtle.Hkdf.computeHkdf(this.hkdfAlgo, this.ikm, bArr, bArr2, this.keySizeInBytes + 32);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public javax.crypto.spec.SecretKeySpec deriveKeySpec(byte[] bArr) throws java.security.GeneralSecurityException {
        return new javax.crypto.spec.SecretKeySpec(bArr, 0, this.keySizeInBytes, org.jose4j.keys.AesKey.ALGORITHM);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public javax.crypto.spec.SecretKeySpec deriveHmacKeySpec(byte[] bArr) throws java.security.GeneralSecurityException {
        return new javax.crypto.spec.SecretKeySpec(bArr, this.keySizeInBytes, 32, this.tagAlgo);
    }

    class AesCtrHmacStreamEncrypter implements com.google.crypto.tink.subtle.StreamSegmentEncrypter {
        private final javax.crypto.Cipher cipher = com.google.crypto.tink.subtle.AesCtrHmacStreaming.cipherInstance();
        private long encryptedSegments;
        private java.nio.ByteBuffer header;
        private final javax.crypto.spec.SecretKeySpec hmacKeySpec;
        private final javax.crypto.spec.SecretKeySpec keySpec;
        private final javax.crypto.Mac mac;
        private final byte[] noncePrefix;

        public AesCtrHmacStreamEncrypter(byte[] bArr) throws java.security.GeneralSecurityException {
            this.encryptedSegments = 0L;
            this.mac = com.google.crypto.tink.subtle.AesCtrHmacStreaming.this.macInstance();
            this.encryptedSegments = 0L;
            byte[] randomSalt = com.google.crypto.tink.subtle.AesCtrHmacStreaming.this.randomSalt();
            byte[] randomNonce = com.google.crypto.tink.subtle.AesCtrHmacStreaming.this.randomNonce();
            this.noncePrefix = randomNonce;
            java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(com.google.crypto.tink.subtle.AesCtrHmacStreaming.this.getHeaderLength());
            this.header = allocate;
            allocate.put((byte) com.google.crypto.tink.subtle.AesCtrHmacStreaming.this.getHeaderLength());
            this.header.put(randomSalt);
            this.header.put(randomNonce);
            this.header.flip();
            byte[] deriveKeyMaterial = com.google.crypto.tink.subtle.AesCtrHmacStreaming.this.deriveKeyMaterial(randomSalt, bArr);
            this.keySpec = com.google.crypto.tink.subtle.AesCtrHmacStreaming.this.deriveKeySpec(deriveKeyMaterial);
            this.hmacKeySpec = com.google.crypto.tink.subtle.AesCtrHmacStreaming.this.deriveHmacKeySpec(deriveKeyMaterial);
        }

        @Override // com.google.crypto.tink.subtle.StreamSegmentEncrypter
        public java.nio.ByteBuffer getHeader() {
            return this.header.asReadOnlyBuffer();
        }

        @Override // com.google.crypto.tink.subtle.StreamSegmentEncrypter
        public void encryptSegment(java.nio.ByteBuffer byteBuffer, boolean z, java.nio.ByteBuffer byteBuffer2) throws java.security.GeneralSecurityException {
            synchronized (this) {
                int position = byteBuffer2.position();
                byte[] nonceForSegment = com.google.crypto.tink.subtle.AesCtrHmacStreaming.this.nonceForSegment(this.noncePrefix, this.encryptedSegments, z);
                this.cipher.init(1, this.keySpec, new javax.crypto.spec.IvParameterSpec(nonceForSegment));
                this.encryptedSegments++;
                this.cipher.doFinal(byteBuffer, byteBuffer2);
                java.nio.ByteBuffer duplicate = byteBuffer2.duplicate();
                duplicate.flip();
                duplicate.position(position);
                this.mac.init(this.hmacKeySpec);
                this.mac.update(nonceForSegment);
                this.mac.update(duplicate);
                byteBuffer2.put(this.mac.doFinal(), 0, com.google.crypto.tink.subtle.AesCtrHmacStreaming.this.tagSizeInBytes);
            }
        }

        @Override // com.google.crypto.tink.subtle.StreamSegmentEncrypter
        public void encryptSegment(java.nio.ByteBuffer byteBuffer, java.nio.ByteBuffer byteBuffer2, boolean z, java.nio.ByteBuffer byteBuffer3) throws java.security.GeneralSecurityException {
            synchronized (this) {
                int position = byteBuffer3.position();
                byte[] nonceForSegment = com.google.crypto.tink.subtle.AesCtrHmacStreaming.this.nonceForSegment(this.noncePrefix, this.encryptedSegments, z);
                this.cipher.init(1, this.keySpec, new javax.crypto.spec.IvParameterSpec(nonceForSegment));
                this.encryptedSegments++;
                this.cipher.update(byteBuffer, byteBuffer3);
                this.cipher.doFinal(byteBuffer2, byteBuffer3);
                java.nio.ByteBuffer duplicate = byteBuffer3.duplicate();
                duplicate.flip();
                duplicate.position(position);
                this.mac.init(this.hmacKeySpec);
                this.mac.update(nonceForSegment);
                this.mac.update(duplicate);
                byteBuffer3.put(this.mac.doFinal(), 0, com.google.crypto.tink.subtle.AesCtrHmacStreaming.this.tagSizeInBytes);
            }
        }
    }

    class AesCtrHmacStreamDecrypter implements com.google.crypto.tink.subtle.StreamSegmentDecrypter {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private javax.crypto.Cipher cipher;
        private javax.crypto.spec.SecretKeySpec hmacKeySpec;
        private javax.crypto.spec.SecretKeySpec keySpec;
        private javax.crypto.Mac mac;
        private byte[] noncePrefix;

        AesCtrHmacStreamDecrypter() {
        }

        @Override // com.google.crypto.tink.subtle.StreamSegmentDecrypter
        public void init(java.nio.ByteBuffer byteBuffer, byte[] bArr) throws java.security.GeneralSecurityException {
            synchronized (this) {
                if (byteBuffer.remaining() != com.google.crypto.tink.subtle.AesCtrHmacStreaming.this.getHeaderLength()) {
                    throw new java.security.InvalidAlgorithmParameterException("Invalid header length");
                }
                if (byteBuffer.get() != com.google.crypto.tink.subtle.AesCtrHmacStreaming.this.getHeaderLength()) {
                    throw new java.security.GeneralSecurityException("Invalid ciphertext");
                }
                this.noncePrefix = new byte[7];
                byte[] bArr2 = new byte[com.google.crypto.tink.subtle.AesCtrHmacStreaming.this.keySizeInBytes];
                byteBuffer.get(bArr2);
                byteBuffer.get(this.noncePrefix);
                byte[] deriveKeyMaterial = com.google.crypto.tink.subtle.AesCtrHmacStreaming.this.deriveKeyMaterial(bArr2, bArr);
                this.keySpec = com.google.crypto.tink.subtle.AesCtrHmacStreaming.this.deriveKeySpec(deriveKeyMaterial);
                this.hmacKeySpec = com.google.crypto.tink.subtle.AesCtrHmacStreaming.this.deriveHmacKeySpec(deriveKeyMaterial);
                this.cipher = com.google.crypto.tink.subtle.AesCtrHmacStreaming.cipherInstance();
                this.mac = com.google.crypto.tink.subtle.AesCtrHmacStreaming.this.macInstance();
            }
        }

        @Override // com.google.crypto.tink.subtle.StreamSegmentDecrypter
        public void decryptSegment(java.nio.ByteBuffer byteBuffer, int i, boolean z, java.nio.ByteBuffer byteBuffer2) throws java.security.GeneralSecurityException {
            synchronized (this) {
                int position = byteBuffer.position();
                byte[] nonceForSegment = com.google.crypto.tink.subtle.AesCtrHmacStreaming.this.nonceForSegment(this.noncePrefix, i, z);
                int remaining = byteBuffer.remaining();
                if (remaining >= com.google.crypto.tink.subtle.AesCtrHmacStreaming.this.tagSizeInBytes) {
                    int i2 = position + (remaining - com.google.crypto.tink.subtle.AesCtrHmacStreaming.this.tagSizeInBytes);
                    java.nio.ByteBuffer duplicate = byteBuffer.duplicate();
                    duplicate.limit(i2);
                    java.nio.ByteBuffer duplicate2 = byteBuffer.duplicate();
                    duplicate2.position(i2);
                    this.mac.init(this.hmacKeySpec);
                    this.mac.update(nonceForSegment);
                    this.mac.update(duplicate);
                    byte[] copyOf = java.util.Arrays.copyOf(this.mac.doFinal(), com.google.crypto.tink.subtle.AesCtrHmacStreaming.this.tagSizeInBytes);
                    byte[] bArr = new byte[com.google.crypto.tink.subtle.AesCtrHmacStreaming.this.tagSizeInBytes];
                    duplicate2.get(bArr);
                    if (!com.google.crypto.tink.subtle.Bytes.equal(bArr, copyOf)) {
                        throw new java.security.GeneralSecurityException("Tag mismatch");
                    }
                    byteBuffer.limit(i2);
                    this.cipher.init(1, this.keySpec, new javax.crypto.spec.IvParameterSpec(nonceForSegment));
                    this.cipher.doFinal(byteBuffer, byteBuffer2);
                } else {
                    throw new java.security.GeneralSecurityException("Ciphertext too short");
                }
            }
        }
    }
}
