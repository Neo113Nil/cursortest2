package org.bouncycastle.cms;

/* loaded from: classes17.dex */
public interface PasswordRecipient extends org.bouncycastle.cms.Recipient {
    public static final int PKCS5_SCHEME2 = 0;
    public static final int PKCS5_SCHEME2_UTF8 = 1;

    byte[] calculateDerivedKey(int i, org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, int i2) throws org.bouncycastle.cms.CMSException;

    char[] getPassword();

    int getPasswordConversionScheme();

    org.bouncycastle.cms.RecipientOperator getRecipientOperator(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier2, byte[] bArr, byte[] bArr2) throws org.bouncycastle.cms.CMSException;

    public static final class PRF {
        public static final org.bouncycastle.cms.PasswordRecipient.PRF HMacSHA1 = new org.bouncycastle.cms.PasswordRecipient.PRF("HMacSHA1", new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_hmacWithSHA1, org.bouncycastle.asn1.DERNull.INSTANCE));
        public static final org.bouncycastle.cms.PasswordRecipient.PRF HMacSHA224 = new org.bouncycastle.cms.PasswordRecipient.PRF("HMacSHA224", new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_hmacWithSHA224, org.bouncycastle.asn1.DERNull.INSTANCE));
        public static final org.bouncycastle.cms.PasswordRecipient.PRF HMacSHA256 = new org.bouncycastle.cms.PasswordRecipient.PRF("HMacSHA256", new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_hmacWithSHA256, org.bouncycastle.asn1.DERNull.INSTANCE));
        public static final org.bouncycastle.cms.PasswordRecipient.PRF HMacSHA384 = new org.bouncycastle.cms.PasswordRecipient.PRF("HMacSHA384", new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_hmacWithSHA384, org.bouncycastle.asn1.DERNull.INSTANCE));
        public static final org.bouncycastle.cms.PasswordRecipient.PRF HMacSHA512 = new org.bouncycastle.cms.PasswordRecipient.PRF("HMacSHA512", new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_hmacWithSHA512, org.bouncycastle.asn1.DERNull.INSTANCE));
        private final java.lang.String Camera2StreamConfigurationMap;
        final org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighSpeedVideoFpsRanges;

        public final java.lang.String getName() {
            return this.Camera2StreamConfigurationMap;
        }

        public final org.bouncycastle.asn1.x509.AlgorithmIdentifier getAlgorithmID() {
            return this.getHighSpeedVideoFpsRanges;
        }

        private PRF(java.lang.String str, org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier) {
            this.Camera2StreamConfigurationMap = str;
            this.getHighSpeedVideoFpsRanges = algorithmIdentifier;
        }
    }
}
