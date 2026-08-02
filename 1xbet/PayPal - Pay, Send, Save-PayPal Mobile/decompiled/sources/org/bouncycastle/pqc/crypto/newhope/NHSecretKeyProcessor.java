package org.bouncycastle.pqc.crypto.newhope;

/* loaded from: classes17.dex */
public class NHSecretKeyProcessor {
    private final org.bouncycastle.crypto.Xof getHighSpeedVideoSizes;

    public byte[] processKey(byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        this.getHighSpeedVideoSizes.doFinal(bArr2, 0, length);
        for (int i = 0; i != bArr.length; i++) {
            bArr[i] = (byte) (bArr[i] ^ bArr2[i]);
        }
        org.bouncycastle.util.Arrays.fill(bArr2, (byte) 0);
        return bArr;
    }

    public static class PartyUBuilder {
        private byte[] getHighResolutionOutputSizeshNQ4ISI;
        private final org.bouncycastle.pqc.crypto.newhope.NHAgreement getHighSpeedVideoFpsRanges;
        private final org.bouncycastle.crypto.AsymmetricCipherKeyPair getHighSpeedVideoFpsRangesFor;
        private boolean getHighSpeedVideoSizes;

        public org.bouncycastle.pqc.crypto.newhope.NHSecretKeyProcessor.PartyUBuilder withSharedInfo(byte[] bArr) {
            this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.util.Arrays.clone(bArr);
            return this;
        }

        public byte[] getPartA() {
            return ((org.bouncycastle.pqc.crypto.newhope.NHPublicKeyParameters) this.getHighSpeedVideoFpsRangesFor.getPublic()).getPubData();
        }

        public org.bouncycastle.pqc.crypto.newhope.NHSecretKeyProcessor build(byte[] bArr) {
            if (this.getHighSpeedVideoSizes) {
                throw new java.lang.IllegalStateException("builder already used");
            }
            this.getHighSpeedVideoSizes = true;
            return new org.bouncycastle.pqc.crypto.newhope.NHSecretKeyProcessor(this.getHighSpeedVideoFpsRanges.calculateAgreement(new org.bouncycastle.pqc.crypto.newhope.NHPublicKeyParameters(bArr)), this.getHighResolutionOutputSizeshNQ4ISI, (byte) 0);
        }

        public PartyUBuilder(java.security.SecureRandom secureRandom) {
            org.bouncycastle.pqc.crypto.newhope.NHAgreement nHAgreement = new org.bouncycastle.pqc.crypto.newhope.NHAgreement();
            this.getHighSpeedVideoFpsRanges = nHAgreement;
            this.getHighResolutionOutputSizeshNQ4ISI = null;
            this.getHighSpeedVideoSizes = false;
            org.bouncycastle.pqc.crypto.newhope.NHKeyPairGenerator nHKeyPairGenerator = new org.bouncycastle.pqc.crypto.newhope.NHKeyPairGenerator();
            nHKeyPairGenerator.init(new org.bouncycastle.crypto.KeyGenerationParameters(secureRandom, 2048));
            org.bouncycastle.crypto.AsymmetricCipherKeyPair generateKeyPair = nHKeyPairGenerator.generateKeyPair();
            this.getHighSpeedVideoFpsRangesFor = generateKeyPair;
            nHAgreement.init(generateKeyPair.getPrivate());
        }
    }

    public static class PartyVBuilder {
        protected final java.security.SecureRandom random;
        private byte[] getHighSpeedVideoFpsRanges = null;
        private byte[] Camera2StreamConfigurationMap = null;
        private boolean getHighSpeedVideoSizes = false;

        public org.bouncycastle.pqc.crypto.newhope.NHSecretKeyProcessor.PartyVBuilder withSharedInfo(byte[] bArr) {
            this.getHighSpeedVideoFpsRanges = org.bouncycastle.util.Arrays.clone(bArr);
            return this;
        }

        public byte[] getPartB(byte[] bArr) {
            org.bouncycastle.pqc.crypto.ExchangePair generateExchange = new org.bouncycastle.pqc.crypto.newhope.NHExchangePairGenerator(this.random).generateExchange(new org.bouncycastle.pqc.crypto.newhope.NHPublicKeyParameters(bArr));
            this.Camera2StreamConfigurationMap = generateExchange.getSharedValue();
            return ((org.bouncycastle.pqc.crypto.newhope.NHPublicKeyParameters) generateExchange.getPublicKey()).getPubData();
        }

        public org.bouncycastle.pqc.crypto.newhope.NHSecretKeyProcessor build() {
            if (this.getHighSpeedVideoSizes) {
                throw new java.lang.IllegalStateException("builder already used");
            }
            this.getHighSpeedVideoSizes = true;
            return new org.bouncycastle.pqc.crypto.newhope.NHSecretKeyProcessor(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, (byte) 0);
        }

        public PartyVBuilder(java.security.SecureRandom secureRandom) {
            this.random = secureRandom;
        }
    }

    /* synthetic */ NHSecretKeyProcessor(byte[] bArr, byte[] bArr2, byte b) {
        this(bArr, bArr2);
    }

    private NHSecretKeyProcessor(byte[] bArr, byte[] bArr2) {
        org.bouncycastle.crypto.digests.SHAKEDigest sHAKEDigest = new org.bouncycastle.crypto.digests.SHAKEDigest(256);
        this.getHighSpeedVideoSizes = sHAKEDigest;
        sHAKEDigest.update(bArr, 0, bArr.length);
        if (bArr2 != null) {
            sHAKEDigest.update(bArr2, 0, bArr2.length);
        }
        org.bouncycastle.util.Arrays.fill(bArr, (byte) 0);
    }
}
