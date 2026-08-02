package org.bouncycastle.asn1.pkcs;

/* loaded from: classes17.dex */
public class SignerInfo extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.ASN1Set Camera2StreamConfigurationMap;
    private org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighSpeedVideoFpsRanges;
    private org.bouncycastle.asn1.pkcs.IssuerAndSerialNumber getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.asn1.ASN1OctetString getHighSpeedVideoSizes;
    private org.bouncycastle.asn1.ASN1Integer getHighSpeedVideoSizesFor;
    private org.bouncycastle.asn1.ASN1Set getOutputFormats;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(7);
        aSN1EncodableVector.add(this.getHighSpeedVideoSizesFor);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRangesFor);
        aSN1EncodableVector.add(this.getHighResolutionOutputSizeshNQ4ISI);
        org.bouncycastle.asn1.ASN1Set aSN1Set = this.Camera2StreamConfigurationMap;
        if (aSN1Set != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(false, 0, (org.bouncycastle.asn1.ASN1Encodable) aSN1Set));
        }
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRanges);
        aSN1EncodableVector.add(this.getHighSpeedVideoSizes);
        org.bouncycastle.asn1.ASN1Set aSN1Set2 = this.getOutputFormats;
        if (aSN1Set2 != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(false, 1, (org.bouncycastle.asn1.ASN1Encodable) aSN1Set2));
        }
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.ASN1Integer getVersion() {
        return this.getHighSpeedVideoSizesFor;
    }

    public org.bouncycastle.asn1.ASN1Set getUnauthenticatedAttributes() {
        return this.getOutputFormats;
    }

    public org.bouncycastle.asn1.pkcs.IssuerAndSerialNumber getIssuerAndSerialNumber() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public org.bouncycastle.asn1.ASN1OctetString getEncryptedDigest() {
        return this.getHighSpeedVideoSizes;
    }

    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getDigestEncryptionAlgorithm() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getDigestAlgorithm() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public org.bouncycastle.asn1.ASN1Set getAuthenticatedAttributes() {
        return this.Camera2StreamConfigurationMap;
    }

    public static org.bouncycastle.asn1.pkcs.SignerInfo getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.pkcs.SignerInfo) {
            return (org.bouncycastle.asn1.pkcs.SignerInfo) obj;
        }
        if (obj instanceof org.bouncycastle.asn1.ASN1Sequence) {
            return new org.bouncycastle.asn1.pkcs.SignerInfo((org.bouncycastle.asn1.ASN1Sequence) obj);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("unknown object in factory: ");
        sb.append(obj.getClass().getName());
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public SignerInfo(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        java.util.Enumeration objects = aSN1Sequence.getObjects();
        this.getHighSpeedVideoSizesFor = (org.bouncycastle.asn1.ASN1Integer) objects.nextElement();
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.pkcs.IssuerAndSerialNumber.getInstance(objects.nextElement());
        this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.x509.AlgorithmIdentifier.getInstance(objects.nextElement());
        java.lang.Object nextElement = objects.nextElement();
        if (nextElement instanceof org.bouncycastle.asn1.ASN1TaggedObject) {
            this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.ASN1Set.getInstance((org.bouncycastle.asn1.ASN1TaggedObject) nextElement, false);
            nextElement = objects.nextElement();
        } else {
            this.Camera2StreamConfigurationMap = null;
        }
        this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.x509.AlgorithmIdentifier.getInstance(nextElement);
        this.getHighSpeedVideoSizes = org.bouncycastle.asn1.DEROctetString.getInstance(objects.nextElement());
        if (objects.hasMoreElements()) {
            this.getOutputFormats = org.bouncycastle.asn1.ASN1Set.getInstance((org.bouncycastle.asn1.ASN1TaggedObject) objects.nextElement(), false);
        } else {
            this.getOutputFormats = null;
        }
    }

    public SignerInfo(org.bouncycastle.asn1.ASN1Integer aSN1Integer, org.bouncycastle.asn1.pkcs.IssuerAndSerialNumber issuerAndSerialNumber, org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, org.bouncycastle.asn1.ASN1Set aSN1Set, org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier2, org.bouncycastle.asn1.ASN1OctetString aSN1OctetString, org.bouncycastle.asn1.ASN1Set aSN1Set2) {
        this.getHighSpeedVideoSizesFor = aSN1Integer;
        this.getHighSpeedVideoFpsRangesFor = issuerAndSerialNumber;
        this.getHighResolutionOutputSizeshNQ4ISI = algorithmIdentifier;
        this.Camera2StreamConfigurationMap = aSN1Set;
        this.getHighSpeedVideoFpsRanges = algorithmIdentifier2;
        this.getHighSpeedVideoSizes = aSN1OctetString;
        this.getOutputFormats = aSN1Set2;
    }
}
