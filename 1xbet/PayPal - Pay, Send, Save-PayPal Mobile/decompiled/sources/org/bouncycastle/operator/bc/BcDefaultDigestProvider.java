package org.bouncycastle.operator.bc;

/* loaded from: classes17.dex */
public class BcDefaultDigestProvider implements org.bouncycastle.operator.bc.BcDigestProvider {
    private static final java.util.Map Camera2StreamConfigurationMap;
    public static final org.bouncycastle.operator.bc.BcDigestProvider INSTANCE;

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(org.bouncycastle.asn1.oiw.OIWObjectIdentifiers.idSHA1, new org.bouncycastle.operator.bc.BcDigestProvider() { // from class: org.bouncycastle.operator.bc.BcDefaultDigestProvider.1
            @Override // org.bouncycastle.operator.bc.BcDigestProvider
            public final org.bouncycastle.crypto.ExtendedDigest get(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier) {
                return new org.bouncycastle.crypto.digests.SHA1Digest();
            }
        });
        hashMap.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha224, new org.bouncycastle.operator.bc.BcDigestProvider() { // from class: org.bouncycastle.operator.bc.BcDefaultDigestProvider.2
            @Override // org.bouncycastle.operator.bc.BcDigestProvider
            public final org.bouncycastle.crypto.ExtendedDigest get(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier) {
                return new org.bouncycastle.crypto.digests.SHA224Digest();
            }
        });
        hashMap.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha256, new org.bouncycastle.operator.bc.BcDigestProvider() { // from class: org.bouncycastle.operator.bc.BcDefaultDigestProvider.3
            @Override // org.bouncycastle.operator.bc.BcDigestProvider
            public final org.bouncycastle.crypto.ExtendedDigest get(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier) {
                return new org.bouncycastle.crypto.digests.SHA256Digest();
            }
        });
        hashMap.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha384, new org.bouncycastle.operator.bc.BcDigestProvider() { // from class: org.bouncycastle.operator.bc.BcDefaultDigestProvider.4
            @Override // org.bouncycastle.operator.bc.BcDigestProvider
            public final org.bouncycastle.crypto.ExtendedDigest get(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier) {
                return new org.bouncycastle.crypto.digests.SHA384Digest();
            }
        });
        hashMap.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha512, new org.bouncycastle.operator.bc.BcDigestProvider() { // from class: org.bouncycastle.operator.bc.BcDefaultDigestProvider.5
            @Override // org.bouncycastle.operator.bc.BcDigestProvider
            public final org.bouncycastle.crypto.ExtendedDigest get(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier) {
                return new org.bouncycastle.crypto.digests.SHA512Digest();
            }
        });
        hashMap.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha3_224, new org.bouncycastle.operator.bc.BcDigestProvider() { // from class: org.bouncycastle.operator.bc.BcDefaultDigestProvider.6
            @Override // org.bouncycastle.operator.bc.BcDigestProvider
            public final org.bouncycastle.crypto.ExtendedDigest get(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier) {
                return new org.bouncycastle.crypto.digests.SHA3Digest(224);
            }
        });
        hashMap.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha3_256, new org.bouncycastle.operator.bc.BcDigestProvider() { // from class: org.bouncycastle.operator.bc.BcDefaultDigestProvider.7
            @Override // org.bouncycastle.operator.bc.BcDigestProvider
            public final org.bouncycastle.crypto.ExtendedDigest get(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier) {
                return new org.bouncycastle.crypto.digests.SHA3Digest(256);
            }
        });
        hashMap.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha3_384, new org.bouncycastle.operator.bc.BcDigestProvider() { // from class: org.bouncycastle.operator.bc.BcDefaultDigestProvider.8
            @Override // org.bouncycastle.operator.bc.BcDigestProvider
            public final org.bouncycastle.crypto.ExtendedDigest get(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier) {
                return new org.bouncycastle.crypto.digests.SHA3Digest(384);
            }
        });
        hashMap.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha3_512, new org.bouncycastle.operator.bc.BcDigestProvider() { // from class: org.bouncycastle.operator.bc.BcDefaultDigestProvider.9
            @Override // org.bouncycastle.operator.bc.BcDigestProvider
            public final org.bouncycastle.crypto.ExtendedDigest get(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier) {
                return new org.bouncycastle.crypto.digests.SHA3Digest(512);
            }
        });
        hashMap.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_shake128, new org.bouncycastle.operator.bc.BcDigestProvider() { // from class: org.bouncycastle.operator.bc.BcDefaultDigestProvider.10
            @Override // org.bouncycastle.operator.bc.BcDigestProvider
            public final org.bouncycastle.crypto.ExtendedDigest get(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier) {
                return new org.bouncycastle.crypto.digests.SHAKEDigest(128);
            }
        });
        hashMap.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_shake256, new org.bouncycastle.operator.bc.BcDigestProvider() { // from class: org.bouncycastle.operator.bc.BcDefaultDigestProvider.11
            @Override // org.bouncycastle.operator.bc.BcDigestProvider
            public final org.bouncycastle.crypto.ExtendedDigest get(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier) {
                return new org.bouncycastle.crypto.digests.SHAKEDigest(256);
            }
        });
        hashMap.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_shake128_len, new org.bouncycastle.operator.bc.BcDigestProvider() { // from class: org.bouncycastle.operator.bc.BcDefaultDigestProvider.12
            @Override // org.bouncycastle.operator.bc.BcDigestProvider
            public final org.bouncycastle.crypto.ExtendedDigest get(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier) {
                return new org.bouncycastle.operator.bc.BcDefaultDigestProvider.AdjustedXof(new org.bouncycastle.crypto.digests.SHAKEDigest(128), org.bouncycastle.asn1.ASN1Integer.getInstance(algorithmIdentifier.getParameters()).intValueExact());
            }
        });
        hashMap.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_shake256_len, new org.bouncycastle.operator.bc.BcDigestProvider() { // from class: org.bouncycastle.operator.bc.BcDefaultDigestProvider.13
            @Override // org.bouncycastle.operator.bc.BcDigestProvider
            public final org.bouncycastle.crypto.ExtendedDigest get(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier) {
                return new org.bouncycastle.operator.bc.BcDefaultDigestProvider.AdjustedXof(new org.bouncycastle.crypto.digests.SHAKEDigest(256), org.bouncycastle.asn1.ASN1Integer.getInstance(algorithmIdentifier.getParameters()).intValueExact());
            }
        });
        hashMap.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.md5, new org.bouncycastle.operator.bc.BcDigestProvider() { // from class: org.bouncycastle.operator.bc.BcDefaultDigestProvider.14
            @Override // org.bouncycastle.operator.bc.BcDigestProvider
            public final org.bouncycastle.crypto.ExtendedDigest get(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier) {
                return new org.bouncycastle.crypto.digests.MD5Digest();
            }
        });
        hashMap.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.md4, new org.bouncycastle.operator.bc.BcDigestProvider() { // from class: org.bouncycastle.operator.bc.BcDefaultDigestProvider.15
            @Override // org.bouncycastle.operator.bc.BcDigestProvider
            public final org.bouncycastle.crypto.ExtendedDigest get(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier) {
                return new org.bouncycastle.crypto.digests.MD4Digest();
            }
        });
        hashMap.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.md2, new org.bouncycastle.operator.bc.BcDigestProvider() { // from class: org.bouncycastle.operator.bc.BcDefaultDigestProvider.16
            @Override // org.bouncycastle.operator.bc.BcDigestProvider
            public final org.bouncycastle.crypto.ExtendedDigest get(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier) {
                return new org.bouncycastle.crypto.digests.MD2Digest();
            }
        });
        hashMap.put(org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR3411, new org.bouncycastle.operator.bc.BcDigestProvider() { // from class: org.bouncycastle.operator.bc.BcDefaultDigestProvider.17
            @Override // org.bouncycastle.operator.bc.BcDigestProvider
            public final org.bouncycastle.crypto.ExtendedDigest get(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier) {
                return new org.bouncycastle.crypto.digests.GOST3411Digest();
            }
        });
        hashMap.put(org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers.id_tc26_gost_3411_12_256, new org.bouncycastle.operator.bc.BcDigestProvider() { // from class: org.bouncycastle.operator.bc.BcDefaultDigestProvider.18
            @Override // org.bouncycastle.operator.bc.BcDigestProvider
            public final org.bouncycastle.crypto.ExtendedDigest get(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier) {
                return new org.bouncycastle.crypto.digests.GOST3411_2012_256Digest();
            }
        });
        hashMap.put(org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers.id_tc26_gost_3411_12_512, new org.bouncycastle.operator.bc.BcDigestProvider() { // from class: org.bouncycastle.operator.bc.BcDefaultDigestProvider.19
            @Override // org.bouncycastle.operator.bc.BcDigestProvider
            public final org.bouncycastle.crypto.ExtendedDigest get(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier) {
                return new org.bouncycastle.crypto.digests.GOST3411_2012_512Digest();
            }
        });
        hashMap.put(org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers.ripemd128, new org.bouncycastle.operator.bc.BcDigestProvider() { // from class: org.bouncycastle.operator.bc.BcDefaultDigestProvider.20
            @Override // org.bouncycastle.operator.bc.BcDigestProvider
            public final org.bouncycastle.crypto.ExtendedDigest get(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier) {
                return new org.bouncycastle.crypto.digests.RIPEMD128Digest();
            }
        });
        hashMap.put(org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers.ripemd160, new org.bouncycastle.operator.bc.BcDigestProvider() { // from class: org.bouncycastle.operator.bc.BcDefaultDigestProvider.21
            @Override // org.bouncycastle.operator.bc.BcDigestProvider
            public final org.bouncycastle.crypto.ExtendedDigest get(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier) {
                return new org.bouncycastle.crypto.digests.RIPEMD160Digest();
            }
        });
        hashMap.put(org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers.ripemd256, new org.bouncycastle.operator.bc.BcDigestProvider() { // from class: org.bouncycastle.operator.bc.BcDefaultDigestProvider.22
            @Override // org.bouncycastle.operator.bc.BcDigestProvider
            public final org.bouncycastle.crypto.ExtendedDigest get(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier) {
                return new org.bouncycastle.crypto.digests.RIPEMD256Digest();
            }
        });
        hashMap.put(org.bouncycastle.asn1.gm.GMObjectIdentifiers.sm3, new org.bouncycastle.operator.bc.BcDigestProvider() { // from class: org.bouncycastle.operator.bc.BcDefaultDigestProvider.23
            @Override // org.bouncycastle.operator.bc.BcDigestProvider
            public final org.bouncycastle.crypto.ExtendedDigest get(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier) {
                return new org.bouncycastle.crypto.digests.SM3Digest();
            }
        });
        Camera2StreamConfigurationMap = java.util.Collections.unmodifiableMap(hashMap);
        INSTANCE = new org.bouncycastle.operator.bc.BcDefaultDigestProvider();
    }

    static class AdjustedXof implements org.bouncycastle.crypto.Xof {
        private final int Camera2StreamConfigurationMap;
        private final org.bouncycastle.crypto.Xof getHighSpeedVideoFpsRangesFor;

        @Override // org.bouncycastle.crypto.Digest
        public void update(byte[] bArr, int i, int i2) {
            this.getHighSpeedVideoFpsRangesFor.update(bArr, i, i2);
        }

        @Override // org.bouncycastle.crypto.Digest
        public void update(byte b) {
            this.getHighSpeedVideoFpsRangesFor.update(b);
        }

        @Override // org.bouncycastle.crypto.Digest
        public void reset() {
            this.getHighSpeedVideoFpsRangesFor.reset();
        }

        @Override // org.bouncycastle.crypto.Digest
        public int getDigestSize() {
            return (this.Camera2StreamConfigurationMap + 7) / 8;
        }

        @Override // org.bouncycastle.crypto.ExtendedDigest
        public int getByteLength() {
            return this.getHighSpeedVideoFpsRangesFor.getByteLength();
        }

        @Override // org.bouncycastle.crypto.Digest
        public java.lang.String getAlgorithmName() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(this.getHighSpeedVideoFpsRangesFor.getAlgorithmName());
            sb.append("-");
            sb.append(this.Camera2StreamConfigurationMap);
            return sb.toString();
        }

        @Override // org.bouncycastle.crypto.Xof
        public int doOutput(byte[] bArr, int i, int i2) {
            return this.getHighSpeedVideoFpsRangesFor.doOutput(bArr, i, i2);
        }

        @Override // org.bouncycastle.crypto.Xof
        public int doFinal(byte[] bArr, int i, int i2) {
            return this.getHighSpeedVideoFpsRangesFor.doFinal(bArr, i, i2);
        }

        @Override // org.bouncycastle.crypto.Digest
        public int doFinal(byte[] bArr, int i) {
            return doFinal(bArr, i, getDigestSize());
        }

        AdjustedXof(org.bouncycastle.crypto.Xof xof, int i) {
            this.getHighSpeedVideoFpsRangesFor = xof;
            this.Camera2StreamConfigurationMap = i;
        }
    }

    @Override // org.bouncycastle.operator.bc.BcDigestProvider
    public org.bouncycastle.crypto.ExtendedDigest get(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier) throws org.bouncycastle.operator.OperatorCreationException {
        org.bouncycastle.operator.bc.BcDigestProvider bcDigestProvider = (org.bouncycastle.operator.bc.BcDigestProvider) Camera2StreamConfigurationMap.get(algorithmIdentifier.getAlgorithm());
        if (bcDigestProvider != null) {
            return bcDigestProvider.get(algorithmIdentifier);
        }
        throw new org.bouncycastle.operator.OperatorCreationException("cannot recognise digest");
    }

    private BcDefaultDigestProvider() {
    }
}
