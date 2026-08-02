package org.bouncycastle.cert.cmp;

/* loaded from: classes17.dex */
public class ProtectedPKIMessage {
    private org.bouncycastle.asn1.cmp.PKIMessage getHighResolutionOutputSizeshNQ4ISI;

    public boolean verify(org.bouncycastle.operator.ContentVerifierProvider contentVerifierProvider) throws org.bouncycastle.cert.cmp.CMPException {
        try {
            org.bouncycastle.operator.ContentVerifier contentVerifier = contentVerifierProvider.get(this.getHighResolutionOutputSizeshNQ4ISI.getHeader().getProtectionAlg());
            byte[] bytes = this.getHighResolutionOutputSizeshNQ4ISI.getProtection().getBytes();
            org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector();
            aSN1EncodableVector.add(this.getHighResolutionOutputSizeshNQ4ISI.getHeader());
            aSN1EncodableVector.add(this.getHighResolutionOutputSizeshNQ4ISI.getBody());
            java.io.OutputStream outputStream = contentVerifier.getOutputStream();
            outputStream.write(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector).getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER));
            outputStream.close();
            return contentVerifier.verify(bytes);
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("unable to verify signature: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.cert.cmp.CMPException(sb.toString(), e);
        }
    }

    public boolean verify(org.bouncycastle.cert.crmf.PKMACBuilder pKMACBuilder, char[] cArr) throws org.bouncycastle.cert.cmp.CMPException {
        if (!org.bouncycastle.asn1.cmp.CMPObjectIdentifiers.passwordBasedMac.equals((org.bouncycastle.asn1.ASN1Primitive) this.getHighResolutionOutputSizeshNQ4ISI.getHeader().getProtectionAlg().getAlgorithm())) {
            throw new org.bouncycastle.cert.cmp.CMPException("protection algorithm not mac based");
        }
        try {
            pKMACBuilder.setParameters(org.bouncycastle.asn1.cmp.PBMParameter.getInstance(this.getHighResolutionOutputSizeshNQ4ISI.getHeader().getProtectionAlg().getParameters()));
            org.bouncycastle.operator.MacCalculator build = pKMACBuilder.build(cArr);
            java.io.OutputStream outputStream = build.getOutputStream();
            org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector();
            aSN1EncodableVector.add(this.getHighResolutionOutputSizeshNQ4ISI.getHeader());
            aSN1EncodableVector.add(this.getHighResolutionOutputSizeshNQ4ISI.getBody());
            outputStream.write(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector).getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER));
            outputStream.close();
            return org.bouncycastle.util.Arrays.areEqual(build.getMac(), this.getHighResolutionOutputSizeshNQ4ISI.getProtection().getBytes());
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("unable to verify MAC: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.cert.cmp.CMPException(sb.toString(), e);
        }
    }

    public org.bouncycastle.asn1.cmp.PKIMessage toASN1Structure() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public boolean hasPasswordBasedMacProtection() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getHeader().getProtectionAlg().getAlgorithm().equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.cmp.CMPObjectIdentifiers.passwordBasedMac);
    }

    public org.bouncycastle.asn1.cmp.PKIHeader getHeader() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getHeader();
    }

    public org.bouncycastle.cert.X509CertificateHolder[] getCertificates() {
        org.bouncycastle.asn1.cmp.CMPCertificate[] extraCerts = this.getHighResolutionOutputSizeshNQ4ISI.getExtraCerts();
        if (extraCerts == null) {
            return new org.bouncycastle.cert.X509CertificateHolder[0];
        }
        org.bouncycastle.cert.X509CertificateHolder[] x509CertificateHolderArr = new org.bouncycastle.cert.X509CertificateHolder[extraCerts.length];
        for (int i = 0; i != extraCerts.length; i++) {
            x509CertificateHolderArr[i] = new org.bouncycastle.cert.X509CertificateHolder(extraCerts[i].getX509v3PKCert());
        }
        return x509CertificateHolderArr;
    }

    public org.bouncycastle.asn1.cmp.PKIBody getBody() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getBody();
    }

    public ProtectedPKIMessage(org.bouncycastle.cert.cmp.GeneralPKIMessage generalPKIMessage) {
        if (!generalPKIMessage.hasProtection()) {
            throw new java.lang.IllegalArgumentException("PKIMessage not protected");
        }
        this.getHighResolutionOutputSizeshNQ4ISI = generalPKIMessage.toASN1Structure();
    }

    ProtectedPKIMessage(org.bouncycastle.asn1.cmp.PKIMessage pKIMessage) {
        if (pKIMessage.getHeader().getProtectionAlg() == null) {
            throw new java.lang.IllegalArgumentException("PKIMessage not protected");
        }
        this.getHighResolutionOutputSizeshNQ4ISI = pKIMessage;
    }
}
