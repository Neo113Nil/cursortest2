package org.bouncycastle.pqc.crypto.newhope;

/* loaded from: classes17.dex */
public class NHOtherInfoGenerator {
    protected final org.bouncycastle.crypto.util.DEROtherInfo.Builder otherInfoBuilder;
    protected final java.security.SecureRandom random;
    protected boolean used = false;

    public static class PartyU extends org.bouncycastle.pqc.crypto.newhope.NHOtherInfoGenerator {
        private org.bouncycastle.crypto.AsymmetricCipherKeyPair Camera2StreamConfigurationMap;
        private org.bouncycastle.pqc.crypto.newhope.NHAgreement getHighSpeedVideoFpsRangesFor;

        public org.bouncycastle.crypto.util.DEROtherInfo generate(byte[] bArr) {
            if (this.used) {
                throw new java.lang.IllegalStateException("builder already used");
            }
            this.used = true;
            this.otherInfoBuilder.withSuppPrivInfo(this.getHighSpeedVideoFpsRangesFor.calculateAgreement(new org.bouncycastle.pqc.crypto.newhope.NHPublicKeyParameters(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo.getInstance(bArr).getPublicKeyData().getOctets())));
            return this.otherInfoBuilder.build();
        }

        public org.bouncycastle.pqc.crypto.newhope.NHOtherInfoGenerator withSuppPubInfo(byte[] bArr) {
            this.otherInfoBuilder.withSuppPubInfo(bArr);
            return this;
        }

        public byte[] getSuppPrivInfoPartA() {
            return org.bouncycastle.pqc.crypto.newhope.NHOtherInfoGenerator.Camera2StreamConfigurationMap((org.bouncycastle.pqc.crypto.newhope.NHPublicKeyParameters) this.Camera2StreamConfigurationMap.getPublic());
        }

        public PartyU(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, byte[] bArr, byte[] bArr2, java.security.SecureRandom secureRandom) {
            super(algorithmIdentifier, bArr, bArr2, secureRandom);
            this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.pqc.crypto.newhope.NHAgreement();
            org.bouncycastle.pqc.crypto.newhope.NHKeyPairGenerator nHKeyPairGenerator = new org.bouncycastle.pqc.crypto.newhope.NHKeyPairGenerator();
            nHKeyPairGenerator.init(new org.bouncycastle.crypto.KeyGenerationParameters(secureRandom, 2048));
            org.bouncycastle.crypto.AsymmetricCipherKeyPair generateKeyPair = nHKeyPairGenerator.generateKeyPair();
            this.Camera2StreamConfigurationMap = generateKeyPair;
            this.getHighSpeedVideoFpsRangesFor.init(generateKeyPair.getPrivate());
        }
    }

    public static class PartyV extends org.bouncycastle.pqc.crypto.newhope.NHOtherInfoGenerator {
        public byte[] getSuppPrivInfoPartB(byte[] bArr) {
            org.bouncycastle.pqc.crypto.ExchangePair generateExchange = new org.bouncycastle.pqc.crypto.newhope.NHExchangePairGenerator(this.random).generateExchange(new org.bouncycastle.pqc.crypto.newhope.NHPublicKeyParameters(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo.getInstance(bArr).getPublicKeyData().getOctets()));
            this.otherInfoBuilder.withSuppPrivInfo(generateExchange.getSharedValue());
            return org.bouncycastle.pqc.crypto.newhope.NHOtherInfoGenerator.Camera2StreamConfigurationMap((org.bouncycastle.pqc.crypto.newhope.NHPublicKeyParameters) generateExchange.getPublicKey());
        }

        public org.bouncycastle.pqc.crypto.newhope.NHOtherInfoGenerator withSuppPubInfo(byte[] bArr) {
            this.otherInfoBuilder.withSuppPubInfo(bArr);
            return this;
        }

        public org.bouncycastle.crypto.util.DEROtherInfo generate() {
            if (this.used) {
                throw new java.lang.IllegalStateException("builder already used");
            }
            this.used = true;
            return this.otherInfoBuilder.build();
        }

        public PartyV(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, byte[] bArr, byte[] bArr2, java.security.SecureRandom secureRandom) {
            super(algorithmIdentifier, bArr, bArr2, secureRandom);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] Camera2StreamConfigurationMap(org.bouncycastle.pqc.crypto.newhope.NHPublicKeyParameters nHPublicKeyParameters) {
        try {
            return new org.bouncycastle.asn1.x509.SubjectPublicKeyInfo(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.pqc.asn1.PQCObjectIdentifiers.newHope), nHPublicKeyParameters.getPubData()).getEncoded();
        } catch (java.io.IOException unused) {
            return null;
        }
    }

    public NHOtherInfoGenerator(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, byte[] bArr, byte[] bArr2, java.security.SecureRandom secureRandom) {
        this.otherInfoBuilder = new org.bouncycastle.crypto.util.DEROtherInfo.Builder(algorithmIdentifier, bArr, bArr2);
        this.random = secureRandom;
    }
}
