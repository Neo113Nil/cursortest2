package org.bouncycastle.pkcs;

/* loaded from: classes17.dex */
public class PKCS12PfxPduBuilder {
    private org.bouncycastle.asn1.ASN1EncodableVector Camera2StreamConfigurationMap = new org.bouncycastle.asn1.ASN1EncodableVector();

    public org.bouncycastle.pkcs.PKCS12PfxPdu build(org.bouncycastle.pkcs.PKCS12MacCalculatorBuilder pKCS12MacCalculatorBuilder, char[] cArr) throws org.bouncycastle.pkcs.PKCSException {
        try {
            byte[] encoded = org.bouncycastle.asn1.pkcs.AuthenticatedSafe.getInstance(new org.bouncycastle.asn1.DLSequence(this.Camera2StreamConfigurationMap)).getEncoded();
            return new org.bouncycastle.pkcs.PKCS12PfxPdu(new org.bouncycastle.asn1.pkcs.Pfx(new org.bouncycastle.asn1.pkcs.ContentInfo(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.data, new org.bouncycastle.asn1.DEROctetString(encoded)), pKCS12MacCalculatorBuilder != null ? new org.bouncycastle.pkcs.MacDataGenerator(pKCS12MacCalculatorBuilder).getHighSpeedVideoSizes(cArr, encoded) : null));
        } catch (java.io.IOException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("unable to encode AuthenticatedSafe: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.pkcs.PKCSException(sb.toString(), e);
        }
    }

    public org.bouncycastle.pkcs.PKCS12PfxPduBuilder addEncryptedData(org.bouncycastle.operator.OutputEncryptor outputEncryptor, org.bouncycastle.pkcs.PKCS12SafeBag[] pKCS12SafeBagArr) throws java.io.IOException {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector();
        for (int i = 0; i != pKCS12SafeBagArr.length; i++) {
            aSN1EncodableVector.add(pKCS12SafeBagArr[i].toASN1Structure());
        }
        return getHighResolutionOutputSizeshNQ4ISI(outputEncryptor, new org.bouncycastle.asn1.DLSequence(aSN1EncodableVector));
    }

    public org.bouncycastle.pkcs.PKCS12PfxPduBuilder addEncryptedData(org.bouncycastle.operator.OutputEncryptor outputEncryptor, org.bouncycastle.pkcs.PKCS12SafeBag pKCS12SafeBag) throws java.io.IOException {
        return getHighResolutionOutputSizeshNQ4ISI(outputEncryptor, new org.bouncycastle.asn1.DERSequence(pKCS12SafeBag.toASN1Structure()));
    }

    public org.bouncycastle.pkcs.PKCS12PfxPduBuilder addData(org.bouncycastle.pkcs.PKCS12SafeBag pKCS12SafeBag) throws java.io.IOException {
        this.Camera2StreamConfigurationMap.add(new org.bouncycastle.asn1.pkcs.ContentInfo(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.data, new org.bouncycastle.asn1.DEROctetString(new org.bouncycastle.asn1.DLSequence(pKCS12SafeBag.toASN1Structure()).getEncoded())));
        return this;
    }

    private org.bouncycastle.pkcs.PKCS12PfxPduBuilder getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.operator.OutputEncryptor outputEncryptor, org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) throws java.io.IOException {
        try {
            this.Camera2StreamConfigurationMap.add(new org.bouncycastle.cms.CMSEncryptedDataGenerator().generate(new org.bouncycastle.cms.CMSProcessableByteArray(aSN1Sequence.getEncoded()), outputEncryptor).toASN1Structure());
            return this;
        } catch (org.bouncycastle.cms.CMSException e) {
            throw new org.bouncycastle.pkcs.PKCSIOException(e.getMessage(), e.getCause());
        }
    }
}
