package org.bouncycastle.asn1.cmc;

/* loaded from: classes17.dex */
public class CertificationRequest extends org.bouncycastle.asn1.ASN1Object {
    private static final org.bouncycastle.asn1.ASN1Integer getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.asn1.ASN1Integer(0);
    private final org.bouncycastle.asn1.ASN1BitString Camera2StreamConfigurationMap;
    private final org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighSpeedVideoFpsRanges;
    private final org.bouncycastle.asn1.cmc.CertificationRequest.CertificationRequestInfo getHighSpeedVideoFpsRangesFor;

    class CertificationRequestInfo extends org.bouncycastle.asn1.ASN1Object {
        private final org.bouncycastle.asn1.ASN1Integer Camera2StreamConfigurationMap;
        private final org.bouncycastle.asn1.x500.X500Name getHighResolutionOutputSizeshNQ4ISI;
        private final org.bouncycastle.asn1.ASN1Sequence getHighSpeedVideoFpsRangesFor;
        private final org.bouncycastle.asn1.ASN1Set getHighSpeedVideoSizes;

        @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
        public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
            org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(4);
            aSN1EncodableVector.add(this.Camera2StreamConfigurationMap);
            aSN1EncodableVector.add(this.getHighResolutionOutputSizeshNQ4ISI);
            aSN1EncodableVector.add(this.getHighSpeedVideoFpsRangesFor);
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(false, 0, (org.bouncycastle.asn1.ASN1Encodable) this.getHighSpeedVideoSizes));
            return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
        }

        /* synthetic */ CertificationRequestInfo(org.bouncycastle.asn1.cmc.CertificationRequest certificationRequest, org.bouncycastle.asn1.x500.X500Name x500Name, org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, org.bouncycastle.asn1.ASN1BitString aSN1BitString, org.bouncycastle.asn1.ASN1Set aSN1Set, byte b) {
            this(x500Name, algorithmIdentifier, aSN1BitString, aSN1Set);
        }

        private CertificationRequestInfo(org.bouncycastle.asn1.x500.X500Name x500Name, org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, org.bouncycastle.asn1.ASN1BitString aSN1BitString, org.bouncycastle.asn1.ASN1Set aSN1Set) {
            this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.cmc.CertificationRequest.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighResolutionOutputSizeshNQ4ISI = x500Name;
            this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.asn1.DERSequence(new org.bouncycastle.asn1.ASN1Encodable[]{algorithmIdentifier, aSN1BitString});
            this.getHighSpeedVideoSizes = aSN1Set;
        }

        /* synthetic */ CertificationRequestInfo(org.bouncycastle.asn1.cmc.CertificationRequest certificationRequest, org.bouncycastle.asn1.ASN1Sequence aSN1Sequence, byte b) {
            this(aSN1Sequence);
        }

        private CertificationRequestInfo(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
            if (aSN1Sequence.size() != 4) {
                throw new java.lang.IllegalArgumentException("incorrect sequence size for CertificationRequestInfo");
            }
            this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.ASN1Integer.getInstance(aSN1Sequence.getObjectAt(0));
            this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.x500.X500Name.getInstance(aSN1Sequence.getObjectAt(1));
            org.bouncycastle.asn1.ASN1Sequence aSN1Sequence2 = org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1Sequence.getObjectAt(2));
            this.getHighSpeedVideoFpsRangesFor = aSN1Sequence2;
            if (aSN1Sequence2.size() != 2) {
                throw new java.lang.IllegalArgumentException("incorrect subjectPublicKeyInfo size for CertificationRequestInfo");
            }
            org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject = (org.bouncycastle.asn1.ASN1TaggedObject) aSN1Sequence.getObjectAt(3);
            if (aSN1TaggedObject.getTagNo() != 0) {
                throw new java.lang.IllegalArgumentException("incorrect tag number on attributes for CertificationRequestInfo");
            }
            this.getHighSpeedVideoSizes = org.bouncycastle.asn1.ASN1Set.getInstance(aSN1TaggedObject, false);
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(3);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRangesFor);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRanges);
        aSN1EncodableVector.add(this.Camera2StreamConfigurationMap);
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.ASN1Primitive parsePublicKey() throws java.io.IOException {
        return org.bouncycastle.asn1.ASN1Primitive.fromByteArray(getSubjectPublicKey().getOctets());
    }

    public java.math.BigInteger getVersion() {
        return this.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap.getValue();
    }

    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getSubjectPublicKeyAlgorithm() {
        return org.bouncycastle.asn1.x509.AlgorithmIdentifier.getInstance(this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor.getObjectAt(0));
    }

    public org.bouncycastle.asn1.ASN1BitString getSubjectPublicKey() {
        return org.bouncycastle.asn1.DERBitString.getInstance((java.lang.Object) this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor.getObjectAt(1));
    }

    public org.bouncycastle.asn1.x500.X500Name getSubject() {
        return this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI;
    }

    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getSignatureAlgorithm() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public org.bouncycastle.asn1.ASN1BitString getSignature() {
        return this.Camera2StreamConfigurationMap;
    }

    public org.bouncycastle.asn1.ASN1Set getAttributes() {
        return this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes;
    }

    public static org.bouncycastle.asn1.cmc.CertificationRequest getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.cmc.CertificationRequest) {
            return (org.bouncycastle.asn1.cmc.CertificationRequest) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.cmc.CertificationRequest(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public CertificationRequest(org.bouncycastle.asn1.x500.X500Name x500Name, org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, org.bouncycastle.asn1.ASN1BitString aSN1BitString, org.bouncycastle.asn1.ASN1Set aSN1Set, org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier2, org.bouncycastle.asn1.ASN1BitString aSN1BitString2) {
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.asn1.cmc.CertificationRequest.CertificationRequestInfo(this, x500Name, algorithmIdentifier, aSN1BitString, aSN1Set, (byte) 0);
        this.getHighSpeedVideoFpsRanges = algorithmIdentifier2;
        this.Camera2StreamConfigurationMap = aSN1BitString2;
    }

    private CertificationRequest(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 3) {
            throw new java.lang.IllegalArgumentException("incorrect sequence size");
        }
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.asn1.cmc.CertificationRequest.CertificationRequestInfo(this, org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1Sequence.getObjectAt(0)), (byte) 0);
        this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.x509.AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(1));
        this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.DERBitString.getInstance((java.lang.Object) aSN1Sequence.getObjectAt(2));
    }
}
