package org.bouncycastle.asn1.x509;

/* loaded from: classes17.dex */
public class TBSCertificate extends org.bouncycastle.asn1.ASN1Object {
    org.bouncycastle.asn1.ASN1BitString Camera2StreamConfigurationMap;
    org.bouncycastle.asn1.x509.Time getHighResolutionOutputSizeshNQ4ISI;
    org.bouncycastle.asn1.ASN1Sequence getHighSpeedVideoFpsRanges;
    org.bouncycastle.asn1.x500.X500Name getHighSpeedVideoFpsRangesFor;
    org.bouncycastle.asn1.x509.Extensions getHighSpeedVideoSizes;
    org.bouncycastle.asn1.x509.SubjectPublicKeyInfo getHighSpeedVideoSizesFor;
    org.bouncycastle.asn1.ASN1Integer getInputFormats;
    org.bouncycastle.asn1.x509.Time getInputSizeshNQ4ISI;
    org.bouncycastle.asn1.x509.AlgorithmIdentifier getOutputFormats;
    org.bouncycastle.asn1.x500.X500Name getOutputMinFrameDuration;
    org.bouncycastle.asn1.ASN1Integer getOutputSizeshNQ4ISI;
    org.bouncycastle.asn1.ASN1BitString getOutputStallDuration;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        if (org.bouncycastle.util.Properties.getPropertyValue("org.bouncycastle.x509.allow_non-der_tbscert") != null && !org.bouncycastle.util.Properties.isOverrideSet("org.bouncycastle.x509.allow_non-der_tbscert")) {
            org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector();
            if (!this.getOutputSizeshNQ4ISI.hasValue(0)) {
                aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(true, 0, (org.bouncycastle.asn1.ASN1Encodable) this.getOutputSizeshNQ4ISI));
            }
            aSN1EncodableVector.add(this.getInputFormats);
            aSN1EncodableVector.add(this.getOutputFormats);
            aSN1EncodableVector.add(this.getHighSpeedVideoFpsRangesFor);
            org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector2 = new org.bouncycastle.asn1.ASN1EncodableVector(2);
            aSN1EncodableVector2.add(this.getInputSizeshNQ4ISI);
            aSN1EncodableVector2.add(this.getHighResolutionOutputSizeshNQ4ISI);
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector2));
            org.bouncycastle.asn1.ASN1Encodable aSN1Encodable = this.getOutputMinFrameDuration;
            if (aSN1Encodable == null) {
                aSN1Encodable = new org.bouncycastle.asn1.DERSequence();
            }
            aSN1EncodableVector.add(aSN1Encodable);
            aSN1EncodableVector.add(this.getHighSpeedVideoSizesFor);
            org.bouncycastle.asn1.ASN1BitString aSN1BitString = this.Camera2StreamConfigurationMap;
            if (aSN1BitString != null) {
                aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(false, 1, (org.bouncycastle.asn1.ASN1Encodable) aSN1BitString));
            }
            org.bouncycastle.asn1.ASN1BitString aSN1BitString2 = this.getOutputStallDuration;
            if (aSN1BitString2 != null) {
                aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(false, 2, (org.bouncycastle.asn1.ASN1Encodable) aSN1BitString2));
            }
            org.bouncycastle.asn1.x509.Extensions extensions = this.getHighSpeedVideoSizes;
            if (extensions != null) {
                aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(true, 3, (org.bouncycastle.asn1.ASN1Encodable) extensions));
            }
            return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
        }
        return this.getHighSpeedVideoFpsRanges;
    }

    public int getVersionNumber() {
        return this.getOutputSizeshNQ4ISI.intValueExact() + 1;
    }

    public org.bouncycastle.asn1.ASN1Integer getVersion() {
        return this.getOutputSizeshNQ4ISI;
    }

    public org.bouncycastle.asn1.ASN1BitString getSubjectUniqueId() {
        return this.getOutputStallDuration;
    }

    public org.bouncycastle.asn1.x509.SubjectPublicKeyInfo getSubjectPublicKeyInfo() {
        return this.getHighSpeedVideoSizesFor;
    }

    public org.bouncycastle.asn1.x500.X500Name getSubject() {
        return this.getOutputMinFrameDuration;
    }

    public org.bouncycastle.asn1.x509.Time getStartDate() {
        return this.getInputSizeshNQ4ISI;
    }

    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getSignature() {
        return this.getOutputFormats;
    }

    public org.bouncycastle.asn1.ASN1Integer getSerialNumber() {
        return this.getInputFormats;
    }

    public org.bouncycastle.asn1.ASN1BitString getIssuerUniqueId() {
        return this.Camera2StreamConfigurationMap;
    }

    public org.bouncycastle.asn1.x500.X500Name getIssuer() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public org.bouncycastle.asn1.x509.Extensions getExtensions() {
        return this.getHighSpeedVideoSizes;
    }

    public org.bouncycastle.asn1.x509.Time getEndDate() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static org.bouncycastle.asn1.x509.TBSCertificate getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public static org.bouncycastle.asn1.x509.TBSCertificate getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.x509.TBSCertificate) {
            return (org.bouncycastle.asn1.x509.TBSCertificate) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.x509.TBSCertificate(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    private TBSCertificate(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        int i;
        boolean z;
        boolean z2;
        this.getHighSpeedVideoFpsRanges = aSN1Sequence;
        if (aSN1Sequence.getObjectAt(0) instanceof org.bouncycastle.asn1.ASN1TaggedObject) {
            this.getOutputSizeshNQ4ISI = org.bouncycastle.asn1.ASN1Integer.getInstance((org.bouncycastle.asn1.ASN1TaggedObject) aSN1Sequence.getObjectAt(0), true);
            i = 0;
        } else {
            this.getOutputSizeshNQ4ISI = new org.bouncycastle.asn1.ASN1Integer(0L);
            i = -1;
        }
        if (this.getOutputSizeshNQ4ISI.hasValue(0)) {
            z2 = false;
            z = true;
        } else if (this.getOutputSizeshNQ4ISI.hasValue(1)) {
            z = false;
            z2 = true;
        } else {
            if (!this.getOutputSizeshNQ4ISI.hasValue(2)) {
                throw new java.lang.IllegalArgumentException("version number not recognised");
            }
            z = false;
            z2 = false;
        }
        this.getInputFormats = org.bouncycastle.asn1.ASN1Integer.getInstance(aSN1Sequence.getObjectAt(i + 1));
        this.getOutputFormats = org.bouncycastle.asn1.x509.AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(i + 2));
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.x500.X500Name.getInstance(aSN1Sequence.getObjectAt(i + 3));
        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence2 = (org.bouncycastle.asn1.ASN1Sequence) aSN1Sequence.getObjectAt(i + 4);
        this.getInputSizeshNQ4ISI = org.bouncycastle.asn1.x509.Time.getInstance(aSN1Sequence2.getObjectAt(0));
        this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.x509.Time.getInstance(aSN1Sequence2.getObjectAt(1));
        this.getOutputMinFrameDuration = org.bouncycastle.asn1.x500.X500Name.getInstance(aSN1Sequence.getObjectAt(i + 5));
        int i2 = i + 6;
        this.getHighSpeedVideoSizesFor = org.bouncycastle.asn1.x509.SubjectPublicKeyInfo.getInstance(aSN1Sequence.getObjectAt(i2));
        int size = (aSN1Sequence.size() - i2) - 1;
        if (size != 0 && z) {
            throw new java.lang.IllegalArgumentException("version 1 certificate contains extra data");
        }
        while (size > 0) {
            org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject = (org.bouncycastle.asn1.ASN1TaggedObject) aSN1Sequence.getObjectAt(i2 + size);
            int tagNo = aSN1TaggedObject.getTagNo();
            if (tagNo == 1) {
                this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.DERBitString.getInstance(aSN1TaggedObject, false);
            } else if (tagNo == 2) {
                this.getOutputStallDuration = org.bouncycastle.asn1.DERBitString.getInstance(aSN1TaggedObject, false);
            } else {
                if (tagNo != 3) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Unknown tag encountered in structure: ");
                    sb.append(aSN1TaggedObject.getTagNo());
                    throw new java.lang.IllegalArgumentException(sb.toString());
                }
                if (z2) {
                    throw new java.lang.IllegalArgumentException("version 2 certificate cannot contain extensions");
                }
                this.getHighSpeedVideoSizes = org.bouncycastle.asn1.x509.Extensions.getInstance(org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1TaggedObject, true));
            }
            size--;
        }
    }
}
