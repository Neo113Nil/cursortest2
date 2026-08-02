package org.bouncycastle.cert.crmf.bc;

/* loaded from: classes17.dex */
class CRMFHelper {
    static org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, org.bouncycastle.crypto.params.KeyParameter keyParameter, java.security.SecureRandom secureRandom) throws org.bouncycastle.cert.crmf.CRMFException {
        try {
            return org.bouncycastle.crypto.util.AlgorithmIdentifierFactory.generateEncryptionAlgID(aSN1ObjectIdentifier, keyParameter.getKey().length * 8, secureRandom);
        } catch (java.lang.IllegalArgumentException e) {
            throw new org.bouncycastle.cert.crmf.CRMFException(e.getMessage(), e);
        }
    }

    static org.bouncycastle.crypto.CipherKeyGenerator getHighSpeedVideoSizes(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, java.security.SecureRandom secureRandom) throws org.bouncycastle.cert.crmf.CRMFException {
        try {
            return org.bouncycastle.crypto.util.CipherKeyGeneratorFactory.createKeyGenerator(aSN1ObjectIdentifier, secureRandom);
        } catch (java.lang.IllegalArgumentException e) {
            throw new org.bouncycastle.cert.crmf.CRMFException(e.getMessage(), e);
        }
    }

    static java.lang.Object getHighSpeedVideoFpsRangesFor(org.bouncycastle.crypto.CipherParameters cipherParameters, org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier) throws org.bouncycastle.cert.crmf.CRMFException {
        try {
            return org.bouncycastle.crypto.util.CipherFactory.createContentCipher(true, cipherParameters, algorithmIdentifier);
        } catch (java.lang.IllegalArgumentException e) {
            throw new org.bouncycastle.cert.crmf.CRMFException(e.getMessage(), e);
        }
    }

    CRMFHelper() {
    }
}
