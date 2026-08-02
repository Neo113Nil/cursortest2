package org.bouncycastle.cert.crmf;

/* loaded from: classes17.dex */
public class EncryptedValueBuilder {
    private org.bouncycastle.cert.crmf.EncryptedValuePadder getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.operator.KeyWrapper getHighSpeedVideoFpsRanges;
    private org.bouncycastle.operator.OutputEncryptor getHighSpeedVideoSizes;

    public org.bouncycastle.asn1.crmf.EncryptedValue build(org.bouncycastle.cert.X509CertificateHolder x509CertificateHolder) throws org.bouncycastle.cert.crmf.CRMFException {
        try {
            byte[] encoded = x509CertificateHolder.getEncoded();
            org.bouncycastle.cert.crmf.EncryptedValuePadder encryptedValuePadder = this.getHighResolutionOutputSizeshNQ4ISI;
            if (encryptedValuePadder != null) {
                encoded = encryptedValuePadder.getPaddedData(encoded);
            }
            return getHighResolutionOutputSizeshNQ4ISI(encoded);
        } catch (java.io.IOException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("cannot encode certificate: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.cert.crmf.CRMFException(sb.toString(), e);
        }
    }

    public org.bouncycastle.asn1.crmf.EncryptedValue build(char[] cArr) throws org.bouncycastle.cert.crmf.CRMFException {
        byte[] uTF8ByteArray = org.bouncycastle.util.Strings.toUTF8ByteArray(cArr);
        org.bouncycastle.cert.crmf.EncryptedValuePadder encryptedValuePadder = this.getHighResolutionOutputSizeshNQ4ISI;
        if (encryptedValuePadder != null) {
            uTF8ByteArray = encryptedValuePadder.getPaddedData(uTF8ByteArray);
        }
        return getHighResolutionOutputSizeshNQ4ISI(uTF8ByteArray);
    }

    public org.bouncycastle.asn1.crmf.EncryptedValue build(org.bouncycastle.asn1.pkcs.PrivateKeyInfo privateKeyInfo) throws org.bouncycastle.cert.crmf.CRMFException {
        org.bouncycastle.pkcs.PKCS8EncryptedPrivateKeyInfoBuilder pKCS8EncryptedPrivateKeyInfoBuilder = new org.bouncycastle.pkcs.PKCS8EncryptedPrivateKeyInfoBuilder(privateKeyInfo);
        try {
            return new org.bouncycastle.asn1.crmf.EncryptedValue(privateKeyInfo.getPrivateKeyAlgorithm(), this.getHighSpeedVideoSizes.getAlgorithmIdentifier(), new org.bouncycastle.asn1.DERBitString(this.getHighSpeedVideoFpsRanges.generateWrappedKey(this.getHighSpeedVideoSizes.getKey())), this.getHighSpeedVideoFpsRanges.getAlgorithmIdentifier(), null, new org.bouncycastle.asn1.DERBitString(pKCS8EncryptedPrivateKeyInfoBuilder.build(this.getHighSpeedVideoSizes).getEncryptedData()));
        } catch (java.lang.IllegalStateException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("cannot encode key: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.cert.crmf.CRMFException(sb.toString(), e);
        } catch (org.bouncycastle.operator.OperatorException e2) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("cannot wrap key: ");
            sb2.append(e2.getMessage());
            throw new org.bouncycastle.cert.crmf.CRMFException(sb2.toString(), e2);
        }
    }

    private org.bouncycastle.asn1.crmf.EncryptedValue getHighResolutionOutputSizeshNQ4ISI(byte[] bArr) throws org.bouncycastle.cert.crmf.CRMFException {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        java.io.OutputStream outputStream = this.getHighSpeedVideoSizes.getOutputStream(byteArrayOutputStream);
        try {
            outputStream.write(bArr);
            outputStream.close();
            org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier = this.getHighSpeedVideoSizes.getAlgorithmIdentifier();
            try {
                this.getHighSpeedVideoFpsRanges.generateWrappedKey(this.getHighSpeedVideoSizes.getKey());
                return new org.bouncycastle.asn1.crmf.EncryptedValue(null, algorithmIdentifier, new org.bouncycastle.asn1.DERBitString(this.getHighSpeedVideoFpsRanges.generateWrappedKey(this.getHighSpeedVideoSizes.getKey())), this.getHighSpeedVideoFpsRanges.getAlgorithmIdentifier(), null, new org.bouncycastle.asn1.DERBitString(byteArrayOutputStream.toByteArray()));
            } catch (org.bouncycastle.operator.OperatorException e) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("cannot wrap key: ");
                sb.append(e.getMessage());
                throw new org.bouncycastle.cert.crmf.CRMFException(sb.toString(), e);
            }
        } catch (java.io.IOException e2) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("cannot process data: ");
            sb2.append(e2.getMessage());
            throw new org.bouncycastle.cert.crmf.CRMFException(sb2.toString(), e2);
        }
    }

    public EncryptedValueBuilder(org.bouncycastle.operator.KeyWrapper keyWrapper, org.bouncycastle.operator.OutputEncryptor outputEncryptor, org.bouncycastle.cert.crmf.EncryptedValuePadder encryptedValuePadder) {
        this.getHighSpeedVideoFpsRanges = keyWrapper;
        this.getHighSpeedVideoSizes = outputEncryptor;
        this.getHighResolutionOutputSizeshNQ4ISI = encryptedValuePadder;
    }

    public EncryptedValueBuilder(org.bouncycastle.operator.KeyWrapper keyWrapper, org.bouncycastle.operator.OutputEncryptor outputEncryptor) {
        this(keyWrapper, outputEncryptor, null);
    }
}
