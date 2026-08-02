package org.bouncycastle.pkcs;

/* loaded from: classes17.dex */
public class PKCS10CertificationRequest {
    private static org.bouncycastle.asn1.pkcs.Attribute[] getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.asn1.pkcs.Attribute[0];
    private org.bouncycastle.asn1.pkcs.CertificationRequest getHighSpeedVideoSizes;

    public org.bouncycastle.asn1.pkcs.CertificationRequest toASN1Structure() {
        return this.getHighSpeedVideoSizes;
    }

    public boolean isSignatureValid(org.bouncycastle.operator.ContentVerifierProvider contentVerifierProvider) throws org.bouncycastle.pkcs.PKCSException {
        org.bouncycastle.asn1.pkcs.CertificationRequestInfo certificationRequestInfo = this.getHighSpeedVideoSizes.getCertificationRequestInfo();
        try {
            org.bouncycastle.operator.ContentVerifier contentVerifier = contentVerifierProvider.get(this.getHighSpeedVideoSizes.getSignatureAlgorithm());
            java.io.OutputStream outputStream = contentVerifier.getOutputStream();
            outputStream.write(certificationRequestInfo.getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER));
            outputStream.close();
            return contentVerifier.verify(getSignature());
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("unable to process signature: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.pkcs.PKCSException(sb.toString(), e);
        }
    }

    public int hashCode() {
        return toASN1Structure().hashCode();
    }

    public org.bouncycastle.asn1.x509.SubjectPublicKeyInfo getSubjectPublicKeyInfo() {
        return this.getHighSpeedVideoSizes.getCertificationRequestInfo().getSubjectPublicKeyInfo();
    }

    public org.bouncycastle.asn1.x500.X500Name getSubject() {
        return org.bouncycastle.asn1.x500.X500Name.getInstance(this.getHighSpeedVideoSizes.getCertificationRequestInfo().getSubject());
    }

    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getSignatureAlgorithm() {
        return this.getHighSpeedVideoSizes.getSignatureAlgorithm();
    }

    public byte[] getSignature() {
        return this.getHighSpeedVideoSizes.getSignature().getOctets();
    }

    public org.bouncycastle.asn1.x509.Extensions getRequestedExtensions() {
        org.bouncycastle.asn1.pkcs.Attribute[] attributes = getAttributes();
        for (int i = 0; i != attributes.length; i++) {
            org.bouncycastle.asn1.pkcs.Attribute attribute = attributes[i];
            if (attribute.getAttrType() == org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.pkcs_9_at_extensionRequest) {
                org.bouncycastle.asn1.x509.ExtensionsGenerator extensionsGenerator = new org.bouncycastle.asn1.x509.ExtensionsGenerator();
                java.util.Enumeration objects = org.bouncycastle.asn1.ASN1Sequence.getInstance(attribute.getAttrValues().getObjectAt(0)).getObjects();
                while (objects.hasMoreElements()) {
                    org.bouncycastle.asn1.ASN1Sequence aSN1Sequence = org.bouncycastle.asn1.ASN1Sequence.getInstance(objects.nextElement());
                    boolean z = aSN1Sequence.size() == 3 && org.bouncycastle.asn1.ASN1Boolean.getInstance(aSN1Sequence.getObjectAt(1)).isTrue();
                    if (aSN1Sequence.size() == 2) {
                        extensionsGenerator.addExtension(org.bouncycastle.asn1.ASN1ObjectIdentifier.getInstance(aSN1Sequence.getObjectAt(0)), false, org.bouncycastle.asn1.ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(1)).getOctets());
                    } else {
                        if (aSN1Sequence.size() != 3) {
                            java.lang.StringBuilder sb = new java.lang.StringBuilder("incorrect sequence size of Extension get ");
                            sb.append(aSN1Sequence.size());
                            sb.append(" expected 2 or three");
                            throw new java.lang.IllegalArgumentException(sb.toString());
                        }
                        extensionsGenerator.addExtension(org.bouncycastle.asn1.ASN1ObjectIdentifier.getInstance(aSN1Sequence.getObjectAt(0)), z, org.bouncycastle.asn1.ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(2)).getOctets());
                    }
                }
                return extensionsGenerator.generate();
            }
        }
        return null;
    }

    public byte[] getEncoded() throws java.io.IOException {
        return this.getHighSpeedVideoSizes.getEncoded();
    }

    public org.bouncycastle.asn1.pkcs.Attribute[] getAttributes(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        org.bouncycastle.asn1.ASN1Set attributes = this.getHighSpeedVideoSizes.getCertificationRequestInfo().getAttributes();
        if (attributes == null) {
            return getHighResolutionOutputSizeshNQ4ISI;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i != attributes.size(); i++) {
            org.bouncycastle.asn1.pkcs.Attribute attribute = org.bouncycastle.asn1.pkcs.Attribute.getInstance(attributes.getObjectAt(i));
            if (attribute.getAttrType().equals((org.bouncycastle.asn1.ASN1Primitive) aSN1ObjectIdentifier)) {
                arrayList.add(attribute);
            }
        }
        return arrayList.size() == 0 ? getHighResolutionOutputSizeshNQ4ISI : (org.bouncycastle.asn1.pkcs.Attribute[]) arrayList.toArray(new org.bouncycastle.asn1.pkcs.Attribute[arrayList.size()]);
    }

    public org.bouncycastle.asn1.pkcs.Attribute[] getAttributes() {
        org.bouncycastle.asn1.ASN1Set attributes = this.getHighSpeedVideoSizes.getCertificationRequestInfo().getAttributes();
        if (attributes == null) {
            return getHighResolutionOutputSizeshNQ4ISI;
        }
        org.bouncycastle.asn1.pkcs.Attribute[] attributeArr = new org.bouncycastle.asn1.pkcs.Attribute[attributes.size()];
        for (int i = 0; i != attributes.size(); i++) {
            attributeArr[i] = org.bouncycastle.asn1.pkcs.Attribute.getInstance(attributes.getObjectAt(i));
        }
        return attributeArr;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof org.bouncycastle.pkcs.PKCS10CertificationRequest) {
            return toASN1Structure().equals(((org.bouncycastle.pkcs.PKCS10CertificationRequest) obj).toASN1Structure());
        }
        return false;
    }

    private static org.bouncycastle.asn1.pkcs.CertificationRequest Camera2StreamConfigurationMap(byte[] bArr) throws java.io.IOException {
        try {
            org.bouncycastle.asn1.pkcs.CertificationRequest certificationRequest = org.bouncycastle.asn1.pkcs.CertificationRequest.getInstance(org.bouncycastle.asn1.ASN1Primitive.fromByteArray(bArr));
            if (certificationRequest != null) {
                return certificationRequest;
            }
            throw new org.bouncycastle.pkcs.PKCSIOException("empty data passed to constructor");
        } catch (java.lang.ClassCastException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("malformed data: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.pkcs.PKCSIOException(sb.toString(), e);
        } catch (java.lang.IllegalArgumentException e2) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("malformed data: ");
            sb2.append(e2.getMessage());
            throw new org.bouncycastle.pkcs.PKCSIOException(sb2.toString(), e2);
        }
    }

    public PKCS10CertificationRequest(byte[] bArr) throws java.io.IOException {
        this(Camera2StreamConfigurationMap(bArr));
    }

    public PKCS10CertificationRequest(org.bouncycastle.asn1.pkcs.CertificationRequest certificationRequest) {
        if (certificationRequest == null) {
            throw new java.lang.NullPointerException("certificationRequest cannot be null");
        }
        this.getHighSpeedVideoSizes = certificationRequest;
    }
}
