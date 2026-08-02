package org.bouncycastle.cert.cmp;

/* loaded from: classes17.dex */
public class ProtectedPKIMessageBuilder {
    private org.bouncycastle.asn1.cmp.PKIBody getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.asn1.cmp.PKIHeaderBuilder getHighSpeedVideoFpsRanges;
    private java.util.List getHighSpeedVideoFpsRangesFor;
    private java.util.List getHighSpeedVideoSizes;

    public org.bouncycastle.cert.cmp.ProtectedPKIMessage build(org.bouncycastle.operator.ContentSigner contentSigner) throws org.bouncycastle.cert.cmp.CMPException {
        if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
            throw new java.lang.IllegalStateException("body must be set before building");
        }
        getHighSpeedVideoFpsRanges(contentSigner.getAlgorithmIdentifier());
        org.bouncycastle.asn1.cmp.PKIHeader build = this.getHighSpeedVideoFpsRanges.build();
        try {
            org.bouncycastle.asn1.cmp.PKIBody pKIBody = this.getHighResolutionOutputSizeshNQ4ISI;
            org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector();
            aSN1EncodableVector.add(build);
            aSN1EncodableVector.add(pKIBody);
            java.io.OutputStream outputStream = contentSigner.getOutputStream();
            outputStream.write(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector).getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER));
            outputStream.close();
            return getHighResolutionOutputSizeshNQ4ISI(build, new org.bouncycastle.asn1.DERBitString(contentSigner.getSignature()));
        } catch (java.io.IOException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("unable to encode signature input: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.cert.cmp.CMPException(sb.toString(), e);
        }
    }

    public org.bouncycastle.cert.cmp.ProtectedPKIMessage build(org.bouncycastle.operator.MacCalculator macCalculator) throws org.bouncycastle.cert.cmp.CMPException {
        if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
            throw new java.lang.IllegalStateException("body must be set before building");
        }
        getHighSpeedVideoFpsRanges(macCalculator.getAlgorithmIdentifier());
        org.bouncycastle.asn1.cmp.PKIHeader build = this.getHighSpeedVideoFpsRanges.build();
        try {
            org.bouncycastle.asn1.cmp.PKIBody pKIBody = this.getHighResolutionOutputSizeshNQ4ISI;
            org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector();
            aSN1EncodableVector.add(build);
            aSN1EncodableVector.add(pKIBody);
            java.io.OutputStream outputStream = macCalculator.getOutputStream();
            outputStream.write(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector).getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER));
            outputStream.close();
            return getHighResolutionOutputSizeshNQ4ISI(build, new org.bouncycastle.asn1.DERBitString(macCalculator.getMac()));
        } catch (java.io.IOException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("unable to encode MAC input: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.cert.cmp.CMPException(sb.toString(), e);
        }
    }

    public org.bouncycastle.cert.cmp.ProtectedPKIMessageBuilder setTransactionID(byte[] bArr) {
        this.getHighSpeedVideoFpsRanges.setTransactionID(bArr);
        return this;
    }

    public org.bouncycastle.cert.cmp.ProtectedPKIMessageBuilder setSenderNonce(byte[] bArr) {
        this.getHighSpeedVideoFpsRanges.setSenderNonce(bArr);
        return this;
    }

    public org.bouncycastle.cert.cmp.ProtectedPKIMessageBuilder setSenderKID(byte[] bArr) {
        this.getHighSpeedVideoFpsRanges.setSenderKID(bArr);
        return this;
    }

    public org.bouncycastle.cert.cmp.ProtectedPKIMessageBuilder setRecipNonce(byte[] bArr) {
        this.getHighSpeedVideoFpsRanges.setRecipNonce(bArr);
        return this;
    }

    public org.bouncycastle.cert.cmp.ProtectedPKIMessageBuilder setRecipKID(byte[] bArr) {
        this.getHighSpeedVideoFpsRanges.setRecipKID(bArr);
        return this;
    }

    public org.bouncycastle.cert.cmp.ProtectedPKIMessageBuilder setMessageTime(java.util.Date date) {
        this.getHighSpeedVideoFpsRanges.setMessageTime(new org.bouncycastle.asn1.ASN1GeneralizedTime(date));
        return this;
    }

    public org.bouncycastle.cert.cmp.ProtectedPKIMessageBuilder setFreeText(org.bouncycastle.asn1.cmp.PKIFreeText pKIFreeText) {
        this.getHighSpeedVideoFpsRanges.setFreeText(pKIFreeText);
        return this;
    }

    public org.bouncycastle.cert.cmp.ProtectedPKIMessageBuilder setBody(org.bouncycastle.asn1.cmp.PKIBody pKIBody) {
        this.getHighResolutionOutputSizeshNQ4ISI = pKIBody;
        return this;
    }

    public org.bouncycastle.cert.cmp.ProtectedPKIMessageBuilder addGeneralInfo(org.bouncycastle.asn1.cmp.InfoTypeAndValue infoTypeAndValue) {
        this.getHighSpeedVideoFpsRangesFor.add(infoTypeAndValue);
        return this;
    }

    public org.bouncycastle.cert.cmp.ProtectedPKIMessageBuilder addCMPCertificate(org.bouncycastle.cert.X509CertificateHolder x509CertificateHolder) {
        this.getHighSpeedVideoSizes.add(x509CertificateHolder);
        return this;
    }

    private org.bouncycastle.cert.cmp.ProtectedPKIMessage getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.asn1.cmp.PKIHeader pKIHeader, org.bouncycastle.asn1.DERBitString dERBitString) {
        if (this.getHighSpeedVideoSizes.isEmpty()) {
            return new org.bouncycastle.cert.cmp.ProtectedPKIMessage(new org.bouncycastle.asn1.cmp.PKIMessage(pKIHeader, this.getHighResolutionOutputSizeshNQ4ISI, dERBitString));
        }
        int size = this.getHighSpeedVideoSizes.size();
        org.bouncycastle.asn1.cmp.CMPCertificate[] cMPCertificateArr = new org.bouncycastle.asn1.cmp.CMPCertificate[size];
        for (int i = 0; i != size; i++) {
            cMPCertificateArr[i] = new org.bouncycastle.asn1.cmp.CMPCertificate(((org.bouncycastle.cert.X509CertificateHolder) this.getHighSpeedVideoSizes.get(i)).toASN1Structure());
        }
        return new org.bouncycastle.cert.cmp.ProtectedPKIMessage(new org.bouncycastle.asn1.cmp.PKIMessage(pKIHeader, this.getHighResolutionOutputSizeshNQ4ISI, dERBitString, cMPCertificateArr));
    }

    private void getHighSpeedVideoFpsRanges(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier) {
        this.getHighSpeedVideoFpsRanges.setProtectionAlg(algorithmIdentifier);
        if (this.getHighSpeedVideoFpsRangesFor.isEmpty()) {
            return;
        }
        this.getHighSpeedVideoFpsRanges.setGeneralInfo((org.bouncycastle.asn1.cmp.InfoTypeAndValue[]) this.getHighSpeedVideoFpsRangesFor.toArray(new org.bouncycastle.asn1.cmp.InfoTypeAndValue[this.getHighSpeedVideoFpsRangesFor.size()]));
    }

    public ProtectedPKIMessageBuilder(org.bouncycastle.asn1.x509.GeneralName generalName, org.bouncycastle.asn1.x509.GeneralName generalName2) {
        this(2, generalName, generalName2);
    }

    public ProtectedPKIMessageBuilder(int i, org.bouncycastle.asn1.x509.GeneralName generalName, org.bouncycastle.asn1.x509.GeneralName generalName2) {
        this.getHighSpeedVideoFpsRangesFor = new java.util.ArrayList();
        this.getHighSpeedVideoSizes = new java.util.ArrayList();
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.asn1.cmp.PKIHeaderBuilder(i, generalName, generalName2);
    }
}
