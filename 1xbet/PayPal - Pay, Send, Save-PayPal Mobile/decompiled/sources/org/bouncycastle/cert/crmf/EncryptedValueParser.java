package org.bouncycastle.cert.crmf;

/* loaded from: classes17.dex */
public class EncryptedValueParser {
    private org.bouncycastle.cert.crmf.EncryptedValuePadder getHighSpeedVideoFpsRanges;
    private org.bouncycastle.asn1.crmf.EncryptedValue getHighSpeedVideoSizes;

    public org.bouncycastle.asn1.pkcs.PrivateKeyInfo readPrivateKeyInfo(org.bouncycastle.cert.crmf.ValueDecryptorGenerator valueDecryptorGenerator) throws org.bouncycastle.cert.crmf.CRMFException {
        return org.bouncycastle.asn1.pkcs.PrivateKeyInfo.getInstance(getHighSpeedVideoFpsRangesFor(valueDecryptorGenerator));
    }

    public char[] readPassphrase(org.bouncycastle.cert.crmf.ValueDecryptorGenerator valueDecryptorGenerator) throws org.bouncycastle.cert.crmf.CRMFException {
        return org.bouncycastle.util.Strings.fromUTF8ByteArray(getHighSpeedVideoFpsRangesFor(valueDecryptorGenerator)).toCharArray();
    }

    public org.bouncycastle.cert.X509CertificateHolder readCertificateHolder(org.bouncycastle.cert.crmf.ValueDecryptorGenerator valueDecryptorGenerator) throws org.bouncycastle.cert.crmf.CRMFException {
        return new org.bouncycastle.cert.X509CertificateHolder(org.bouncycastle.asn1.x509.Certificate.getInstance(getHighSpeedVideoFpsRangesFor(valueDecryptorGenerator)));
    }

    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getIntendedAlg() {
        return this.getHighSpeedVideoSizes.getIntendedAlg();
    }

    private byte[] getHighSpeedVideoFpsRangesFor(org.bouncycastle.cert.crmf.ValueDecryptorGenerator valueDecryptorGenerator) throws org.bouncycastle.cert.crmf.CRMFException {
        if (this.getHighSpeedVideoSizes.getValueHint() != null) {
            throw new java.lang.UnsupportedOperationException();
        }
        try {
            byte[] readAll = org.bouncycastle.util.io.Streams.readAll(valueDecryptorGenerator.getValueDecryptor(this.getHighSpeedVideoSizes.getKeyAlg(), this.getHighSpeedVideoSizes.getSymmAlg(), this.getHighSpeedVideoSizes.getEncSymmKey().getBytes()).getInputStream(new java.io.ByteArrayInputStream(this.getHighSpeedVideoSizes.getEncValue().getBytes())));
            org.bouncycastle.cert.crmf.EncryptedValuePadder encryptedValuePadder = this.getHighSpeedVideoFpsRanges;
            return encryptedValuePadder != null ? encryptedValuePadder.getUnpaddedData(readAll) : readAll;
        } catch (java.io.IOException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot parse decrypted data: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.cert.crmf.CRMFException(sb.toString(), e);
        }
    }

    public EncryptedValueParser(org.bouncycastle.asn1.crmf.EncryptedValue encryptedValue, org.bouncycastle.cert.crmf.EncryptedValuePadder encryptedValuePadder) {
        this.getHighSpeedVideoSizes = encryptedValue;
        this.getHighSpeedVideoFpsRanges = encryptedValuePadder;
    }

    public EncryptedValueParser(org.bouncycastle.asn1.crmf.EncryptedValue encryptedValue) {
        this.getHighSpeedVideoSizes = encryptedValue;
    }
}
