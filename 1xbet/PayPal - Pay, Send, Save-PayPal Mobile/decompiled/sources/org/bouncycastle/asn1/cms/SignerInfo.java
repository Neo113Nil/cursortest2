package org.bouncycastle.asn1.cms;

/* loaded from: classes17.dex */
public class SignerInfo extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.ASN1OctetString Camera2StreamConfigurationMap;
    private org.bouncycastle.asn1.ASN1Set getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.asn1.cms.SignerIdentifier getHighSpeedVideoFpsRanges;
    private org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighSpeedVideoSizes;
    private org.bouncycastle.asn1.ASN1Integer getHighSpeedVideoSizesFor;
    private org.bouncycastle.asn1.ASN1Set getOutputFormats;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(7);
        aSN1EncodableVector.add(this.getHighSpeedVideoSizesFor);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRanges);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRangesFor);
        org.bouncycastle.asn1.ASN1Set aSN1Set = this.getHighResolutionOutputSizeshNQ4ISI;
        if (aSN1Set != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(false, 0, (org.bouncycastle.asn1.ASN1Encodable) aSN1Set));
        }
        aSN1EncodableVector.add(this.getHighSpeedVideoSizes);
        aSN1EncodableVector.add(this.Camera2StreamConfigurationMap);
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

    public org.bouncycastle.asn1.cms.SignerIdentifier getSID() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public org.bouncycastle.asn1.ASN1OctetString getEncryptedDigest() {
        return this.Camera2StreamConfigurationMap;
    }

    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getDigestEncryptionAlgorithm() {
        return this.getHighSpeedVideoSizes;
    }

    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getDigestAlgorithm() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public org.bouncycastle.asn1.ASN1Set getAuthenticatedAttributes() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static org.bouncycastle.asn1.cms.SignerInfo getInstance(java.lang.Object obj) throws java.lang.IllegalArgumentException {
        if (obj instanceof org.bouncycastle.asn1.cms.SignerInfo) {
            return (org.bouncycastle.asn1.cms.SignerInfo) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.cms.SignerInfo(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public SignerInfo(org.bouncycastle.asn1.cms.SignerIdentifier signerIdentifier, org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, org.bouncycastle.asn1.cms.Attributes attributes, org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier2, org.bouncycastle.asn1.ASN1OctetString aSN1OctetString, org.bouncycastle.asn1.cms.Attributes attributes2) {
        this.getHighSpeedVideoSizesFor = signerIdentifier.isTagged() ? new org.bouncycastle.asn1.ASN1Integer(3L) : new org.bouncycastle.asn1.ASN1Integer(1L);
        this.getHighSpeedVideoFpsRanges = signerIdentifier;
        this.getHighSpeedVideoFpsRangesFor = algorithmIdentifier;
        this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.ASN1Set.getInstance(attributes);
        this.getHighSpeedVideoSizes = algorithmIdentifier2;
        this.Camera2StreamConfigurationMap = aSN1OctetString;
        this.getOutputFormats = org.bouncycastle.asn1.ASN1Set.getInstance(attributes2);
    }

    public SignerInfo(org.bouncycastle.asn1.cms.SignerIdentifier signerIdentifier, org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, org.bouncycastle.asn1.ASN1Set aSN1Set, org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier2, org.bouncycastle.asn1.ASN1OctetString aSN1OctetString, org.bouncycastle.asn1.ASN1Set aSN1Set2) {
        this.getHighSpeedVideoSizesFor = signerIdentifier.isTagged() ? new org.bouncycastle.asn1.ASN1Integer(3L) : new org.bouncycastle.asn1.ASN1Integer(1L);
        this.getHighSpeedVideoFpsRanges = signerIdentifier;
        this.getHighSpeedVideoFpsRangesFor = algorithmIdentifier;
        this.getHighResolutionOutputSizeshNQ4ISI = aSN1Set;
        this.getHighSpeedVideoSizes = algorithmIdentifier2;
        this.Camera2StreamConfigurationMap = aSN1OctetString;
        this.getOutputFormats = aSN1Set2;
    }

    private SignerInfo(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        java.util.Enumeration objects = aSN1Sequence.getObjects();
        this.getHighSpeedVideoSizesFor = (org.bouncycastle.asn1.ASN1Integer) objects.nextElement();
        this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.cms.SignerIdentifier.getInstance(objects.nextElement());
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.x509.AlgorithmIdentifier.getInstance(objects.nextElement());
        java.lang.Object nextElement = objects.nextElement();
        if (nextElement instanceof org.bouncycastle.asn1.ASN1TaggedObject) {
            this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.ASN1Set.getInstance((org.bouncycastle.asn1.ASN1TaggedObject) nextElement, false);
            nextElement = objects.nextElement();
        } else {
            this.getHighResolutionOutputSizeshNQ4ISI = null;
        }
        this.getHighSpeedVideoSizes = org.bouncycastle.asn1.x509.AlgorithmIdentifier.getInstance(nextElement);
        this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.DEROctetString.getInstance(objects.nextElement());
        if (objects.hasMoreElements()) {
            this.getOutputFormats = org.bouncycastle.asn1.ASN1Set.getInstance((org.bouncycastle.asn1.ASN1TaggedObject) objects.nextElement(), false);
        } else {
            this.getOutputFormats = null;
        }
    }
}
