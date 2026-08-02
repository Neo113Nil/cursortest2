package org.bouncycastle.crypto.util;

/* loaded from: classes17.dex */
public class PBKDF2Config extends org.bouncycastle.crypto.util.PBKDFConfig {
    private static final java.util.Map Camera2StreamConfigurationMap;
    private final org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighResolutionOutputSizeshNQ4ISI;
    private final int getHighSpeedVideoFpsRangesFor;
    private final int getHighSpeedVideoSizes;
    public static final org.bouncycastle.asn1.x509.AlgorithmIdentifier PRF_SHA1 = new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_hmacWithSHA1, org.bouncycastle.asn1.DERNull.INSTANCE);
    public static final org.bouncycastle.asn1.x509.AlgorithmIdentifier PRF_SHA256 = new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_hmacWithSHA256, org.bouncycastle.asn1.DERNull.INSTANCE);
    public static final org.bouncycastle.asn1.x509.AlgorithmIdentifier PRF_SHA512 = new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_hmacWithSHA512, org.bouncycastle.asn1.DERNull.INSTANCE);
    public static final org.bouncycastle.asn1.x509.AlgorithmIdentifier PRF_SHA3_256 = new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_hmacWithSHA3_256, org.bouncycastle.asn1.DERNull.INSTANCE);
    public static final org.bouncycastle.asn1.x509.AlgorithmIdentifier PRF_SHA3_512 = new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_hmacWithSHA3_512, org.bouncycastle.asn1.DERNull.INSTANCE);

    private PBKDF2Config(org.bouncycastle.crypto.util.PBKDF2Config.Builder builder) {
        super(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_PBKDF2);
        int i;
        this.getHighSpeedVideoFpsRangesFor = builder.Camera2StreamConfigurationMap;
        org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier = builder.getHighSpeedVideoFpsRangesFor;
        this.getHighResolutionOutputSizeshNQ4ISI = algorithmIdentifier;
        if (builder.getHighSpeedVideoSizes < 0) {
            org.bouncycastle.asn1.ASN1ObjectIdentifier algorithm = algorithmIdentifier.getAlgorithm();
            java.util.Map map = Camera2StreamConfigurationMap;
            if (!map.containsKey(algorithm)) {
                throw new java.lang.IllegalStateException("no salt size for algorithm: ".concat(java.lang.String.valueOf(algorithm)));
            }
            i = ((java.lang.Integer) map.get(algorithm)).intValue();
        } else {
            i = builder.getHighSpeedVideoSizes;
        }
        this.getHighSpeedVideoSizes = i;
    }

    public static class Builder {
        private int Camera2StreamConfigurationMap = 1024;
        private int getHighSpeedVideoSizes = -1;
        private org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighSpeedVideoFpsRangesFor = org.bouncycastle.crypto.util.PBKDF2Config.PRF_SHA1;

        public org.bouncycastle.crypto.util.PBKDF2Config.Builder withSaltLength(int i) {
            this.getHighSpeedVideoSizes = i;
            return this;
        }

        public org.bouncycastle.crypto.util.PBKDF2Config.Builder withPRF(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier) {
            this.getHighSpeedVideoFpsRangesFor = algorithmIdentifier;
            return this;
        }

        public org.bouncycastle.crypto.util.PBKDF2Config.Builder withIterationCount(int i) {
            this.Camera2StreamConfigurationMap = i;
            return this;
        }

        public org.bouncycastle.crypto.util.PBKDF2Config build() {
            return new org.bouncycastle.crypto.util.PBKDF2Config(this, (byte) 0);
        }
    }

    public int getSaltLength() {
        return this.getHighSpeedVideoSizes;
    }

    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getPRF() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public int getIterationCount() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    /* synthetic */ PBKDF2Config(org.bouncycastle.crypto.util.PBKDF2Config.Builder builder, byte b) {
        this(builder);
    }

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        Camera2StreamConfigurationMap = hashMap;
        hashMap.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_hmacWithSHA1, org.bouncycastle.util.Integers.valueOf(20));
        hashMap.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_hmacWithSHA256, org.bouncycastle.util.Integers.valueOf(32));
        hashMap.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_hmacWithSHA512, org.bouncycastle.util.Integers.valueOf(64));
        hashMap.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_hmacWithSHA224, org.bouncycastle.util.Integers.valueOf(28));
        hashMap.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_hmacWithSHA384, org.bouncycastle.util.Integers.valueOf(48));
        hashMap.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_hmacWithSHA3_224, org.bouncycastle.util.Integers.valueOf(28));
        hashMap.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_hmacWithSHA3_256, org.bouncycastle.util.Integers.valueOf(32));
        hashMap.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_hmacWithSHA3_384, org.bouncycastle.util.Integers.valueOf(48));
        hashMap.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_hmacWithSHA3_512, org.bouncycastle.util.Integers.valueOf(64));
        hashMap.put(org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR3411Hmac, org.bouncycastle.util.Integers.valueOf(32));
        hashMap.put(org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers.id_tc26_hmac_gost_3411_12_256, org.bouncycastle.util.Integers.valueOf(32));
        hashMap.put(org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers.id_tc26_hmac_gost_3411_12_512, org.bouncycastle.util.Integers.valueOf(64));
        hashMap.put(org.bouncycastle.asn1.gm.GMObjectIdentifiers.hmac_sm3, org.bouncycastle.util.Integers.valueOf(32));
    }
}
