package org.bouncycastle.crypto.prng;

/* loaded from: classes17.dex */
public class SP800SecureRandomBuilder {
    private int Camera2StreamConfigurationMap;
    private final org.bouncycastle.crypto.prng.EntropySourceProvider getHighResolutionOutputSizeshNQ4ISI;
    private final java.security.SecureRandom getHighSpeedVideoFpsRanges;
    private int getHighSpeedVideoFpsRangesFor;
    private byte[] getHighSpeedVideoSizes;

    static /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.crypto.Digest digest) {
        java.lang.String algorithmName = digest.getAlgorithmName();
        int indexOf = algorithmName.indexOf(45);
        if (indexOf <= 0 || algorithmName.startsWith("SHA3")) {
            return algorithmName;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(algorithmName.substring(0, indexOf));
        sb.append(algorithmName.substring(indexOf + 1));
        return sb.toString();
    }

    public org.bouncycastle.crypto.prng.SP800SecureRandomBuilder setSecurityStrength(int i) {
        this.Camera2StreamConfigurationMap = i;
        return this;
    }

    public org.bouncycastle.crypto.prng.SP800SecureRandomBuilder setPersonalizationString(byte[] bArr) {
        this.getHighSpeedVideoSizes = org.bouncycastle.util.Arrays.clone(bArr);
        return this;
    }

    public org.bouncycastle.crypto.prng.SP800SecureRandomBuilder setEntropyBitsRequired(int i) {
        this.getHighSpeedVideoFpsRangesFor = i;
        return this;
    }

    public org.bouncycastle.crypto.prng.SP800SecureRandom buildHash(org.bouncycastle.crypto.Digest digest, byte[] bArr, boolean z) {
        return new org.bouncycastle.crypto.prng.SP800SecureRandom(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI.get(this.getHighSpeedVideoFpsRangesFor), new org.bouncycastle.crypto.prng.SP800SecureRandomBuilder.HashDRBGProvider(digest, bArr, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap), z);
    }

    public org.bouncycastle.crypto.prng.SP800SecureRandom buildHMAC(org.bouncycastle.crypto.Mac mac, byte[] bArr, boolean z) {
        return new org.bouncycastle.crypto.prng.SP800SecureRandom(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI.get(this.getHighSpeedVideoFpsRangesFor), new org.bouncycastle.crypto.prng.SP800SecureRandomBuilder.HMacDRBGProvider(mac, bArr, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap), z);
    }

    static class CTRDRBGProvider implements org.bouncycastle.crypto.prng.DRBGProvider {
        private final byte[] Camera2StreamConfigurationMap;
        private final int getHighResolutionOutputSizeshNQ4ISI;
        private final org.bouncycastle.crypto.BlockCipher getHighSpeedVideoFpsRanges;
        private final byte[] getHighSpeedVideoFpsRangesFor;
        private final int getHighSpeedVideoSizes;

        @Override // org.bouncycastle.crypto.prng.DRBGProvider
        public final java.lang.String Camera2StreamConfigurationMap() {
            if (this.getHighSpeedVideoFpsRanges instanceof org.bouncycastle.crypto.engines.DESedeEngine) {
                return "CTR-DRBG-3KEY-TDES";
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CTR-DRBG-");
            sb.append(this.getHighSpeedVideoFpsRanges.getAlgorithmName());
            sb.append(this.getHighSpeedVideoSizes);
            return sb.toString();
        }

        @Override // org.bouncycastle.crypto.prng.DRBGProvider
        public final org.bouncycastle.crypto.prng.drbg.SP80090DRBG getHighSpeedVideoSizes(org.bouncycastle.crypto.prng.EntropySource entropySource) {
            return new org.bouncycastle.crypto.prng.drbg.CTRSP800DRBG(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, entropySource, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap);
        }

        public CTRDRBGProvider(org.bouncycastle.crypto.BlockCipher blockCipher, int i, byte[] bArr, byte[] bArr2, int i2) {
            this.getHighSpeedVideoFpsRanges = blockCipher;
            this.getHighSpeedVideoSizes = i;
            this.Camera2StreamConfigurationMap = bArr;
            this.getHighSpeedVideoFpsRangesFor = bArr2;
            this.getHighResolutionOutputSizeshNQ4ISI = i2;
        }
    }

    static class HMacDRBGProvider implements org.bouncycastle.crypto.prng.DRBGProvider {
        private final org.bouncycastle.crypto.Mac Camera2StreamConfigurationMap;
        private final byte[] getHighResolutionOutputSizeshNQ4ISI;
        private final int getHighSpeedVideoFpsRanges;
        private final byte[] getHighSpeedVideoFpsRangesFor;

        @Override // org.bouncycastle.crypto.prng.DRBGProvider
        public final java.lang.String Camera2StreamConfigurationMap() {
            java.lang.StringBuilder sb;
            java.lang.String algorithmName;
            if (this.Camera2StreamConfigurationMap instanceof org.bouncycastle.crypto.macs.HMac) {
                sb = new java.lang.StringBuilder("HMAC-DRBG-");
                algorithmName = org.bouncycastle.crypto.prng.SP800SecureRandomBuilder.getHighResolutionOutputSizeshNQ4ISI(((org.bouncycastle.crypto.macs.HMac) this.Camera2StreamConfigurationMap).getUnderlyingDigest());
            } else {
                sb = new java.lang.StringBuilder("HMAC-DRBG-");
                algorithmName = this.Camera2StreamConfigurationMap.getAlgorithmName();
            }
            sb.append(algorithmName);
            return sb.toString();
        }

        @Override // org.bouncycastle.crypto.prng.DRBGProvider
        public final org.bouncycastle.crypto.prng.drbg.SP80090DRBG getHighSpeedVideoSizes(org.bouncycastle.crypto.prng.EntropySource entropySource) {
            return new org.bouncycastle.crypto.prng.drbg.HMacSP800DRBG(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, entropySource, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor);
        }

        public HMacDRBGProvider(org.bouncycastle.crypto.Mac mac, byte[] bArr, byte[] bArr2, int i) {
            this.Camera2StreamConfigurationMap = mac;
            this.getHighSpeedVideoFpsRangesFor = bArr;
            this.getHighResolutionOutputSizeshNQ4ISI = bArr2;
            this.getHighSpeedVideoFpsRanges = i;
        }
    }

    static class HashDRBGProvider implements org.bouncycastle.crypto.prng.DRBGProvider {
        private final byte[] Camera2StreamConfigurationMap;
        private final int getHighResolutionOutputSizeshNQ4ISI;
        private final byte[] getHighSpeedVideoFpsRanges;
        private final org.bouncycastle.crypto.Digest getHighSpeedVideoSizes;

        @Override // org.bouncycastle.crypto.prng.DRBGProvider
        public final java.lang.String Camera2StreamConfigurationMap() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("HASH-DRBG-");
            sb.append(org.bouncycastle.crypto.prng.SP800SecureRandomBuilder.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoSizes));
            return sb.toString();
        }

        @Override // org.bouncycastle.crypto.prng.DRBGProvider
        public final org.bouncycastle.crypto.prng.drbg.SP80090DRBG getHighSpeedVideoSizes(org.bouncycastle.crypto.prng.EntropySource entropySource) {
            return new org.bouncycastle.crypto.prng.drbg.HashSP800DRBG(this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, entropySource, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap);
        }

        public HashDRBGProvider(org.bouncycastle.crypto.Digest digest, byte[] bArr, byte[] bArr2, int i) {
            this.getHighSpeedVideoSizes = digest;
            this.Camera2StreamConfigurationMap = bArr;
            this.getHighSpeedVideoFpsRanges = bArr2;
            this.getHighResolutionOutputSizeshNQ4ISI = i;
        }
    }

    public org.bouncycastle.crypto.prng.SP800SecureRandom buildCTR(org.bouncycastle.crypto.BlockCipher blockCipher, int i, byte[] bArr, boolean z) {
        return new org.bouncycastle.crypto.prng.SP800SecureRandom(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI.get(this.getHighSpeedVideoFpsRangesFor), new org.bouncycastle.crypto.prng.SP800SecureRandomBuilder.CTRDRBGProvider(blockCipher, i, bArr, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap), z);
    }

    public SP800SecureRandomBuilder(org.bouncycastle.crypto.prng.EntropySourceProvider entropySourceProvider) {
        this.Camera2StreamConfigurationMap = 256;
        this.getHighSpeedVideoFpsRangesFor = 256;
        this.getHighSpeedVideoFpsRanges = null;
        this.getHighResolutionOutputSizeshNQ4ISI = entropySourceProvider;
    }

    public SP800SecureRandomBuilder(java.security.SecureRandom secureRandom, boolean z) {
        this.Camera2StreamConfigurationMap = 256;
        this.getHighSpeedVideoFpsRangesFor = 256;
        this.getHighSpeedVideoFpsRanges = secureRandom;
        this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.crypto.prng.BasicEntropySourceProvider(secureRandom, z);
    }

    public SP800SecureRandomBuilder() {
        this(org.bouncycastle.crypto.CryptoServicesRegistrar.getSecureRandom(), false);
    }
}
