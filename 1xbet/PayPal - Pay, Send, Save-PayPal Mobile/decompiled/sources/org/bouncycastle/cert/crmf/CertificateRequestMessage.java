package org.bouncycastle.cert.crmf;

/* loaded from: classes17.dex */
public class CertificateRequestMessage implements org.bouncycastle.util.Encodable {
    public static final int popKeyAgreement = 3;
    public static final int popKeyEncipherment = 2;
    public static final int popRaVerified = 0;
    public static final int popSigningKey = 1;
    private final org.bouncycastle.asn1.crmf.CertReqMsg getHighSpeedVideoFpsRanges;
    private final org.bouncycastle.asn1.crmf.Controls getHighSpeedVideoSizes;

    public org.bouncycastle.asn1.crmf.CertReqMsg toASN1Structure() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public boolean isValidSigningKeyPOP(org.bouncycastle.operator.ContentVerifierProvider contentVerifierProvider, org.bouncycastle.cert.crmf.PKMACBuilder pKMACBuilder, char[] cArr) throws org.bouncycastle.cert.crmf.CRMFException, java.lang.IllegalStateException {
        org.bouncycastle.asn1.crmf.ProofOfPossession popo = this.getHighSpeedVideoFpsRanges.getPopo();
        if (popo.getType() != 1) {
            throw new java.lang.IllegalStateException("not Signing Key type of proof of possession");
        }
        org.bouncycastle.asn1.crmf.POPOSigningKey pOPOSigningKey = org.bouncycastle.asn1.crmf.POPOSigningKey.getInstance(popo.getObject());
        if (pOPOSigningKey.getPoposkInput() == null || pOPOSigningKey.getPoposkInput().getSender() != null) {
            throw new java.lang.IllegalStateException("no PKMAC present in proof of possession");
        }
        if (new org.bouncycastle.cert.crmf.PKMACValueVerifier(pKMACBuilder).getHighResolutionOutputSizeshNQ4ISI(pOPOSigningKey.getPoposkInput().getPublicKeyMAC(), cArr, getCertTemplate().getPublicKey())) {
            return Camera2StreamConfigurationMap(contentVerifierProvider, pOPOSigningKey);
        }
        return false;
    }

    public boolean isValidSigningKeyPOP(org.bouncycastle.operator.ContentVerifierProvider contentVerifierProvider) throws org.bouncycastle.cert.crmf.CRMFException, java.lang.IllegalStateException {
        org.bouncycastle.asn1.crmf.ProofOfPossession popo = this.getHighSpeedVideoFpsRanges.getPopo();
        if (popo.getType() != 1) {
            throw new java.lang.IllegalStateException("not Signing Key type of proof of possession");
        }
        org.bouncycastle.asn1.crmf.POPOSigningKey pOPOSigningKey = org.bouncycastle.asn1.crmf.POPOSigningKey.getInstance(popo.getObject());
        if (pOPOSigningKey.getPoposkInput() == null || pOPOSigningKey.getPoposkInput().getPublicKeyMAC() == null) {
            return Camera2StreamConfigurationMap(contentVerifierProvider, pOPOSigningKey);
        }
        throw new java.lang.IllegalStateException("verification requires password check");
    }

    public boolean hasSigningKeyProofOfPossessionWithPKMAC() {
        org.bouncycastle.asn1.crmf.ProofOfPossession popo = this.getHighSpeedVideoFpsRanges.getPopo();
        return popo.getType() == 1 && org.bouncycastle.asn1.crmf.POPOSigningKey.getInstance(popo.getObject()).getPoposkInput().getPublicKeyMAC() != null;
    }

    public boolean hasProofOfPossession() {
        return this.getHighSpeedVideoFpsRanges.getPopo() != null;
    }

    public boolean hasControls() {
        return this.getHighSpeedVideoSizes != null;
    }

    public boolean hasControl(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return getHighSpeedVideoSizes(aSN1ObjectIdentifier) != null;
    }

    public int getProofOfPossessionType() {
        return this.getHighSpeedVideoFpsRanges.getPopo().getType();
    }

    @Override // org.bouncycastle.util.Encodable
    public byte[] getEncoded() throws java.io.IOException {
        return this.getHighSpeedVideoFpsRanges.getEncoded();
    }

    public org.bouncycastle.cert.crmf.Control getControl(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        org.bouncycastle.asn1.crmf.AttributeTypeAndValue highSpeedVideoSizes = getHighSpeedVideoSizes(aSN1ObjectIdentifier);
        if (highSpeedVideoSizes == null) {
            return null;
        }
        if (highSpeedVideoSizes.getType().equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.crmf.CRMFObjectIdentifiers.id_regCtrl_pkiArchiveOptions)) {
            return new org.bouncycastle.cert.crmf.PKIArchiveControl(org.bouncycastle.asn1.crmf.PKIArchiveOptions.getInstance(highSpeedVideoSizes.getValue()));
        }
        if (highSpeedVideoSizes.getType().equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.crmf.CRMFObjectIdentifiers.id_regCtrl_regToken)) {
            return new org.bouncycastle.cert.crmf.RegTokenControl(org.bouncycastle.asn1.ASN1UTF8String.getInstance(highSpeedVideoSizes.getValue()));
        }
        if (highSpeedVideoSizes.getType().equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.crmf.CRMFObjectIdentifiers.id_regCtrl_authenticator)) {
            return new org.bouncycastle.cert.crmf.AuthenticatorControl(org.bouncycastle.asn1.ASN1UTF8String.getInstance(highSpeedVideoSizes.getValue()));
        }
        return null;
    }

    public org.bouncycastle.asn1.crmf.CertTemplate getCertTemplate() {
        return this.getHighSpeedVideoFpsRanges.getCertReq().getCertTemplate();
    }

    private boolean Camera2StreamConfigurationMap(org.bouncycastle.operator.ContentVerifierProvider contentVerifierProvider, org.bouncycastle.asn1.crmf.POPOSigningKey pOPOSigningKey) throws org.bouncycastle.cert.crmf.CRMFException {
        try {
            org.bouncycastle.operator.ContentVerifier contentVerifier = contentVerifierProvider.get(pOPOSigningKey.getAlgorithmIdentifier());
            org.bouncycastle.cert.crmf.CRMFUtil.Camera2StreamConfigurationMap(pOPOSigningKey.getPoposkInput() != null ? pOPOSigningKey.getPoposkInput() : this.getHighSpeedVideoFpsRanges.getCertReq(), contentVerifier.getOutputStream());
            return contentVerifier.verify(pOPOSigningKey.getSignature().getOctets());
        } catch (org.bouncycastle.operator.OperatorCreationException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("unable to create verifier: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.cert.crmf.CRMFException(sb.toString(), e);
        }
    }

    private static org.bouncycastle.asn1.crmf.CertReqMsg Camera2StreamConfigurationMap(byte[] bArr) throws java.io.IOException {
        try {
            return org.bouncycastle.asn1.crmf.CertReqMsg.getInstance(org.bouncycastle.asn1.ASN1Primitive.fromByteArray(bArr));
        } catch (java.lang.ClassCastException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("malformed data: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.cert.CertIOException(sb.toString(), e);
        } catch (java.lang.IllegalArgumentException e2) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("malformed data: ");
            sb2.append(e2.getMessage());
            throw new org.bouncycastle.cert.CertIOException(sb2.toString(), e2);
        }
    }

    private org.bouncycastle.asn1.crmf.AttributeTypeAndValue getHighSpeedVideoSizes(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        org.bouncycastle.asn1.crmf.Controls controls = this.getHighSpeedVideoSizes;
        if (controls == null) {
            return null;
        }
        org.bouncycastle.asn1.crmf.AttributeTypeAndValue[] attributeTypeAndValueArray = controls.toAttributeTypeAndValueArray();
        for (int i = 0; i != attributeTypeAndValueArray.length; i++) {
            if (attributeTypeAndValueArray[i].getType().equals((org.bouncycastle.asn1.ASN1Primitive) aSN1ObjectIdentifier)) {
                return attributeTypeAndValueArray[i];
            }
        }
        return null;
    }

    public CertificateRequestMessage(byte[] bArr) throws java.io.IOException {
        this(Camera2StreamConfigurationMap(bArr));
    }

    public CertificateRequestMessage(org.bouncycastle.asn1.crmf.CertReqMsg certReqMsg) {
        this.getHighSpeedVideoFpsRanges = certReqMsg;
        this.getHighSpeedVideoSizes = certReqMsg.getCertReq().getControls();
    }
}
