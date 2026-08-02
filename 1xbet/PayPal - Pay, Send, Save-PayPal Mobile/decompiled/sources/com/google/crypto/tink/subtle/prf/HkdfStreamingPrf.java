package com.google.crypto.tink.subtle.prf;

@com.google.errorprone.annotations.Immutable
/* loaded from: classes9.dex */
public class HkdfStreamingPrf implements com.google.crypto.tink.subtle.prf.StreamingPrf {
    private static final com.google.crypto.tink.internal.EnumTypeProtoConverter<com.google.crypto.tink.subtle.Enums.HashType, com.google.crypto.tink.prf.HkdfPrfParameters.HashType> HASH_TYPE_CONVERTER = com.google.crypto.tink.internal.EnumTypeProtoConverter.builder().add(com.google.crypto.tink.subtle.Enums.HashType.SHA1, com.google.crypto.tink.prf.HkdfPrfParameters.HashType.SHA1).add(com.google.crypto.tink.subtle.Enums.HashType.SHA224, com.google.crypto.tink.prf.HkdfPrfParameters.HashType.SHA224).add(com.google.crypto.tink.subtle.Enums.HashType.SHA256, com.google.crypto.tink.prf.HkdfPrfParameters.HashType.SHA256).add(com.google.crypto.tink.subtle.Enums.HashType.SHA384, com.google.crypto.tink.prf.HkdfPrfParameters.HashType.SHA384).add(com.google.crypto.tink.subtle.Enums.HashType.SHA512, com.google.crypto.tink.prf.HkdfPrfParameters.HashType.SHA512).build();
    private final com.google.crypto.tink.subtle.Enums.HashType hashType;
    private final byte[] ikm;
    private final byte[] salt;

    /* renamed from: com.google.crypto.tink.subtle.prf.HkdfStreamingPrf$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$subtle$Enums$HashType;

        static {
            int[] iArr = new int[com.google.crypto.tink.subtle.Enums.HashType.values().length];
            $SwitchMap$com$google$crypto$tink$subtle$Enums$HashType = iArr;
            try {
                iArr[com.google.crypto.tink.subtle.Enums.HashType.SHA1.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$subtle$Enums$HashType[com.google.crypto.tink.subtle.Enums.HashType.SHA256.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$subtle$Enums$HashType[com.google.crypto.tink.subtle.Enums.HashType.SHA384.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$subtle$Enums$HashType[com.google.crypto.tink.subtle.Enums.HashType.SHA512.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.String getJavaxHmacName(com.google.crypto.tink.subtle.Enums.HashType hashType) throws java.security.GeneralSecurityException {
        int i = com.google.crypto.tink.subtle.prf.HkdfStreamingPrf.AnonymousClass1.$SwitchMap$com$google$crypto$tink$subtle$Enums$HashType[hashType.ordinal()];
        if (i == 1) {
            return "HmacSha1";
        }
        if (i == 2) {
            return "HmacSha256";
        }
        if (i == 3) {
            return "HmacSha384";
        }
        if (i == 4) {
            return "HmacSha512";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("No getJavaxHmacName for given hash ");
        sb.append(hashType);
        sb.append(" known");
        throw new java.security.GeneralSecurityException(sb.toString());
    }

    public HkdfStreamingPrf(com.google.crypto.tink.subtle.Enums.HashType hashType, byte[] bArr, byte[] bArr2) {
        this.hashType = hashType;
        this.ikm = java.util.Arrays.copyOf(bArr, bArr.length);
        this.salt = java.util.Arrays.copyOf(bArr2, bArr2.length);
    }

    public static com.google.crypto.tink.subtle.prf.StreamingPrf create(com.google.crypto.tink.prf.HkdfPrfKey hkdfPrfKey) throws java.security.GeneralSecurityException {
        com.google.crypto.tink.util.Bytes salt = hkdfPrfKey.getParameters().getSalt();
        return new com.google.crypto.tink.subtle.prf.HkdfStreamingPrf(HASH_TYPE_CONVERTER.toProtoEnum(hkdfPrfKey.getParameters().getHashType()), hkdfPrfKey.getKeyBytes().toByteArray(com.google.crypto.tink.InsecureSecretKeyAccess.get()), salt == null ? new byte[0] : salt.toByteArray());
    }

    class HkdfInputStream extends java.io.InputStream {
        private java.nio.ByteBuffer buffer;
        private int ctr = -1;
        private final byte[] input;
        private javax.crypto.Mac mac;
        private byte[] prk;

        public HkdfInputStream(byte[] bArr) {
            this.input = java.util.Arrays.copyOf(bArr, bArr.length);
        }

        private void initialize() throws java.security.GeneralSecurityException, java.io.IOException {
            try {
                this.mac = com.google.crypto.tink.subtle.EngineFactory.MAC.getInstance(com.google.crypto.tink.subtle.prf.HkdfStreamingPrf.getJavaxHmacName(com.google.crypto.tink.subtle.prf.HkdfStreamingPrf.this.hashType));
                if (com.google.crypto.tink.subtle.prf.HkdfStreamingPrf.this.salt == null || com.google.crypto.tink.subtle.prf.HkdfStreamingPrf.this.salt.length == 0) {
                    this.mac.init(new javax.crypto.spec.SecretKeySpec(new byte[this.mac.getMacLength()], com.google.crypto.tink.subtle.prf.HkdfStreamingPrf.getJavaxHmacName(com.google.crypto.tink.subtle.prf.HkdfStreamingPrf.this.hashType)));
                } else {
                    this.mac.init(new javax.crypto.spec.SecretKeySpec(com.google.crypto.tink.subtle.prf.HkdfStreamingPrf.this.salt, com.google.crypto.tink.subtle.prf.HkdfStreamingPrf.getJavaxHmacName(com.google.crypto.tink.subtle.prf.HkdfStreamingPrf.this.hashType)));
                }
                this.mac.update(com.google.crypto.tink.subtle.prf.HkdfStreamingPrf.this.ikm);
                this.prk = this.mac.doFinal();
                java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(0);
                this.buffer = allocate;
                allocate.mark();
                this.ctr = 0;
            } catch (java.security.GeneralSecurityException e) {
                throw new java.io.IOException("Creating HMac failed", e);
            }
        }

        private void updateBuffer() throws java.security.GeneralSecurityException, java.io.IOException {
            this.mac.init(new javax.crypto.spec.SecretKeySpec(this.prk, com.google.crypto.tink.subtle.prf.HkdfStreamingPrf.getJavaxHmacName(com.google.crypto.tink.subtle.prf.HkdfStreamingPrf.this.hashType)));
            this.buffer.reset();
            this.mac.update(this.buffer);
            this.mac.update(this.input);
            int i = this.ctr + 1;
            this.ctr = i;
            this.mac.update((byte) i);
            java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(this.mac.doFinal());
            this.buffer = wrap;
            wrap.mark();
        }

        @Override // java.io.InputStream
        public int read() throws java.io.IOException {
            byte[] bArr = new byte[1];
            int read = read(bArr, 0, 1);
            if (read == 1) {
                return bArr[0] & 255;
            }
            if (read == -1) {
                return read;
            }
            throw new java.io.IOException("Reading failed");
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr) throws java.io.IOException {
            return read(bArr, 0, bArr.length);
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws java.io.IOException {
            try {
                if (this.ctr == -1) {
                    initialize();
                }
                int i3 = 0;
                while (i3 < i2) {
                    if (!this.buffer.hasRemaining()) {
                        if (this.ctr == 255) {
                            break;
                        }
                        updateBuffer();
                    }
                    int min = java.lang.Math.min(i2 - i3, this.buffer.remaining());
                    this.buffer.get(bArr, i, min);
                    i += min;
                    i3 += min;
                }
                return i3;
            } catch (java.security.GeneralSecurityException e) {
                this.mac = null;
                throw new java.io.IOException("HkdfInputStream failed", e);
            }
        }
    }

    @Override // com.google.crypto.tink.subtle.prf.StreamingPrf
    public java.io.InputStream computePrf(byte[] bArr) {
        return new com.google.crypto.tink.subtle.prf.HkdfStreamingPrf.HkdfInputStream(bArr);
    }
}
