package org.bouncycastle.pkcs;

/* loaded from: classes17.dex */
public class PKCS10CertificationRequestBuilder {
    private org.bouncycastle.asn1.x509.SubjectPublicKeyInfo Camera2StreamConfigurationMap;
    private org.bouncycastle.asn1.x500.X500Name getHighResolutionOutputSizeshNQ4ISI;
    private java.util.List getHighSpeedVideoFpsRangesFor;
    private boolean getHighSpeedVideoSizes;

    public org.bouncycastle.pkcs.PKCS10CertificationRequestBuilder setLeaveOffEmptyAttributes(boolean z) {
        this.getHighSpeedVideoSizes = z;
        return this;
    }

    public org.bouncycastle.pkcs.PKCS10CertificationRequestBuilder setAttribute(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, org.bouncycastle.asn1.ASN1Encodable[] aSN1EncodableArr) {
        java.util.Iterator it = this.getHighSpeedVideoFpsRangesFor.iterator();
        while (it.hasNext()) {
            if (((org.bouncycastle.asn1.pkcs.Attribute) it.next()).getAttrType().equals((org.bouncycastle.asn1.ASN1Primitive) aSN1ObjectIdentifier)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Attribute ");
                sb.append(aSN1ObjectIdentifier.toString());
                sb.append(" is already set");
                throw new java.lang.IllegalStateException(sb.toString());
            }
        }
        addAttribute(aSN1ObjectIdentifier, aSN1EncodableArr);
        return this;
    }

    public org.bouncycastle.pkcs.PKCS10CertificationRequestBuilder setAttribute(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
        java.util.Iterator it = this.getHighSpeedVideoFpsRangesFor.iterator();
        while (it.hasNext()) {
            if (((org.bouncycastle.asn1.pkcs.Attribute) it.next()).getAttrType().equals((org.bouncycastle.asn1.ASN1Primitive) aSN1ObjectIdentifier)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Attribute ");
                sb.append(aSN1ObjectIdentifier.toString());
                sb.append(" is already set");
                throw new java.lang.IllegalStateException(sb.toString());
            }
        }
        addAttribute(aSN1ObjectIdentifier, aSN1Encodable);
        return this;
    }

    public org.bouncycastle.pkcs.PKCS10CertificationRequest build(org.bouncycastle.operator.ContentSigner contentSigner) {
        org.bouncycastle.asn1.pkcs.CertificationRequestInfo certificationRequestInfo;
        if (this.getHighSpeedVideoFpsRangesFor.isEmpty()) {
            certificationRequestInfo = this.getHighSpeedVideoSizes ? new org.bouncycastle.asn1.pkcs.CertificationRequestInfo(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, (org.bouncycastle.asn1.ASN1Set) null) : new org.bouncycastle.asn1.pkcs.CertificationRequestInfo(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, new org.bouncycastle.asn1.DERSet());
        } else {
            org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector();
            java.util.Iterator it = this.getHighSpeedVideoFpsRangesFor.iterator();
            while (it.hasNext()) {
                aSN1EncodableVector.add(org.bouncycastle.asn1.pkcs.Attribute.getInstance(it.next()));
            }
            certificationRequestInfo = new org.bouncycastle.asn1.pkcs.CertificationRequestInfo(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, new org.bouncycastle.asn1.DERSet(aSN1EncodableVector));
        }
        try {
            java.io.OutputStream outputStream = contentSigner.getOutputStream();
            outputStream.write(certificationRequestInfo.getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER));
            outputStream.close();
            return new org.bouncycastle.pkcs.PKCS10CertificationRequest(new org.bouncycastle.asn1.pkcs.CertificationRequest(certificationRequestInfo, contentSigner.getAlgorithmIdentifier(), new org.bouncycastle.asn1.DERBitString(contentSigner.getSignature())));
        } catch (java.io.IOException unused) {
            throw new java.lang.IllegalStateException("cannot produce certification request signature");
        }
    }

    public org.bouncycastle.pkcs.PKCS10CertificationRequestBuilder addAttribute(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, org.bouncycastle.asn1.ASN1Encodable[] aSN1EncodableArr) {
        this.getHighSpeedVideoFpsRangesFor.add(new org.bouncycastle.asn1.pkcs.Attribute(aSN1ObjectIdentifier, new org.bouncycastle.asn1.DERSet(aSN1EncodableArr)));
        return this;
    }

    public org.bouncycastle.pkcs.PKCS10CertificationRequestBuilder addAttribute(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
        this.getHighSpeedVideoFpsRangesFor.add(new org.bouncycastle.asn1.pkcs.Attribute(aSN1ObjectIdentifier, new org.bouncycastle.asn1.DERSet(aSN1Encodable)));
        return this;
    }

    public PKCS10CertificationRequestBuilder(org.bouncycastle.pkcs.PKCS10CertificationRequestBuilder pKCS10CertificationRequestBuilder) {
        this.getHighSpeedVideoFpsRangesFor = new java.util.ArrayList();
        this.getHighSpeedVideoSizes = false;
        this.Camera2StreamConfigurationMap = pKCS10CertificationRequestBuilder.Camera2StreamConfigurationMap;
        this.getHighResolutionOutputSizeshNQ4ISI = pKCS10CertificationRequestBuilder.getHighResolutionOutputSizeshNQ4ISI;
        this.getHighSpeedVideoSizes = pKCS10CertificationRequestBuilder.getHighSpeedVideoSizes;
        this.getHighSpeedVideoFpsRangesFor = new java.util.ArrayList(pKCS10CertificationRequestBuilder.getHighSpeedVideoFpsRangesFor);
    }

    public PKCS10CertificationRequestBuilder(org.bouncycastle.asn1.x500.X500Name x500Name, org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo) {
        this.getHighSpeedVideoFpsRangesFor = new java.util.ArrayList();
        this.getHighSpeedVideoSizes = false;
        this.getHighResolutionOutputSizeshNQ4ISI = x500Name;
        this.Camera2StreamConfigurationMap = subjectPublicKeyInfo;
    }
}
