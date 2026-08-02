package org.bouncycastle.asn1.pkcs;

/* loaded from: classes17.dex */
public class CertificationRequestInfo extends org.bouncycastle.asn1.ASN1Object {
    org.bouncycastle.asn1.x500.X500Name Camera2StreamConfigurationMap;
    org.bouncycastle.asn1.ASN1Integer getHighResolutionOutputSizeshNQ4ISI;
    org.bouncycastle.asn1.x509.SubjectPublicKeyInfo getHighSpeedVideoFpsRanges;
    org.bouncycastle.asn1.ASN1Set getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(4);
        aSN1EncodableVector.add(this.getHighResolutionOutputSizeshNQ4ISI);
        aSN1EncodableVector.add(this.Camera2StreamConfigurationMap);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRanges);
        org.bouncycastle.asn1.ASN1Set aSN1Set = this.getHighSpeedVideoSizes;
        if (aSN1Set != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(false, 0, (org.bouncycastle.asn1.ASN1Encodable) aSN1Set));
        }
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.ASN1Integer getVersion() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public org.bouncycastle.asn1.x509.SubjectPublicKeyInfo getSubjectPublicKeyInfo() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public org.bouncycastle.asn1.x500.X500Name getSubject() {
        return this.Camera2StreamConfigurationMap;
    }

    public org.bouncycastle.asn1.ASN1Set getAttributes() {
        return this.getHighSpeedVideoSizes;
    }

    private static void getHighSpeedVideoSizes(org.bouncycastle.asn1.ASN1Set aSN1Set) {
        if (aSN1Set != null) {
            java.util.Enumeration objects = aSN1Set.getObjects();
            while (objects.hasMoreElements()) {
                org.bouncycastle.asn1.pkcs.Attribute attribute = org.bouncycastle.asn1.pkcs.Attribute.getInstance(objects.nextElement());
                if (attribute.getAttrType().equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.pkcs_9_at_challengePassword) && attribute.getAttrValues().size() != 1) {
                    throw new java.lang.IllegalArgumentException("challengePassword attribute must have one value");
                }
            }
        }
    }

    public static org.bouncycastle.asn1.pkcs.CertificationRequestInfo getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.pkcs.CertificationRequestInfo) {
            return (org.bouncycastle.asn1.pkcs.CertificationRequestInfo) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.pkcs.CertificationRequestInfo(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public CertificationRequestInfo(org.bouncycastle.asn1.x509.X509Name x509Name, org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo, org.bouncycastle.asn1.ASN1Set aSN1Set) {
        this(org.bouncycastle.asn1.x500.X500Name.getInstance(x509Name.toASN1Primitive()), subjectPublicKeyInfo, aSN1Set);
    }

    public CertificationRequestInfo(org.bouncycastle.asn1.x500.X500Name x500Name, org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo, org.bouncycastle.asn1.ASN1Set aSN1Set) {
        this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.asn1.ASN1Integer(0L);
        this.getHighSpeedVideoSizes = null;
        if (x500Name == null || subjectPublicKeyInfo == null) {
            throw new java.lang.IllegalArgumentException("Not all mandatory fields set in CertificationRequestInfo generator.");
        }
        getHighSpeedVideoSizes(aSN1Set);
        this.Camera2StreamConfigurationMap = x500Name;
        this.getHighSpeedVideoFpsRanges = subjectPublicKeyInfo;
        this.getHighSpeedVideoSizes = aSN1Set;
    }

    private CertificationRequestInfo(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.asn1.ASN1Integer(0L);
        this.getHighSpeedVideoSizes = null;
        this.getHighResolutionOutputSizeshNQ4ISI = (org.bouncycastle.asn1.ASN1Integer) aSN1Sequence.getObjectAt(0);
        this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.x500.X500Name.getInstance(aSN1Sequence.getObjectAt(1));
        this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.x509.SubjectPublicKeyInfo.getInstance(aSN1Sequence.getObjectAt(2));
        if (aSN1Sequence.size() > 3) {
            this.getHighSpeedVideoSizes = org.bouncycastle.asn1.ASN1Set.getInstance((org.bouncycastle.asn1.ASN1TaggedObject) aSN1Sequence.getObjectAt(3), false);
        }
        getHighSpeedVideoSizes(this.getHighSpeedVideoSizes);
        if (this.Camera2StreamConfigurationMap == null || this.getHighResolutionOutputSizeshNQ4ISI == null || this.getHighSpeedVideoFpsRanges == null) {
            throw new java.lang.IllegalArgumentException("Not all mandatory fields set in CertificationRequestInfo generator.");
        }
    }
}
