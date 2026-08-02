package org.bouncycastle.asn1.pkcs;

/* loaded from: classes17.dex */
public class RSASSAPSSparams extends org.bouncycastle.asn1.ASN1Object {
    public static final org.bouncycastle.asn1.x509.AlgorithmIdentifier DEFAULT_HASH_ALGORITHM;
    public static final org.bouncycastle.asn1.x509.AlgorithmIdentifier DEFAULT_MASK_GEN_FUNCTION;
    public static final org.bouncycastle.asn1.ASN1Integer DEFAULT_SALT_LENGTH;
    public static final org.bouncycastle.asn1.ASN1Integer DEFAULT_TRAILER_FIELD;
    private org.bouncycastle.asn1.ASN1Integer getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighSpeedVideoFpsRanges;
    private org.bouncycastle.asn1.ASN1Integer getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(4);
        if (!this.getHighSpeedVideoSizes.equals(DEFAULT_HASH_ALGORITHM)) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(true, 0, (org.bouncycastle.asn1.ASN1Encodable) this.getHighSpeedVideoSizes));
        }
        if (!this.getHighSpeedVideoFpsRanges.equals(DEFAULT_MASK_GEN_FUNCTION)) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(true, 1, (org.bouncycastle.asn1.ASN1Encodable) this.getHighSpeedVideoFpsRanges));
        }
        if (!this.getHighResolutionOutputSizeshNQ4ISI.equals((org.bouncycastle.asn1.ASN1Primitive) DEFAULT_SALT_LENGTH)) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(true, 2, (org.bouncycastle.asn1.ASN1Encodable) this.getHighResolutionOutputSizeshNQ4ISI));
        }
        if (!this.getHighSpeedVideoFpsRangesFor.equals((org.bouncycastle.asn1.ASN1Primitive) DEFAULT_TRAILER_FIELD)) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(true, 3, (org.bouncycastle.asn1.ASN1Encodable) this.getHighSpeedVideoFpsRangesFor));
        }
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public java.math.BigInteger getTrailerField() {
        return this.getHighSpeedVideoFpsRangesFor.getValue();
    }

    public java.math.BigInteger getSaltLength() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getValue();
    }

    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getMaskGenAlgorithm() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getHashAlgorithm() {
        return this.getHighSpeedVideoSizes;
    }

    public static org.bouncycastle.asn1.pkcs.RSASSAPSSparams getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.pkcs.RSASSAPSSparams) {
            return (org.bouncycastle.asn1.pkcs.RSASSAPSSparams) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.pkcs.RSASSAPSSparams(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public RSASSAPSSparams(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier2, org.bouncycastle.asn1.ASN1Integer aSN1Integer, org.bouncycastle.asn1.ASN1Integer aSN1Integer2) {
        this.getHighSpeedVideoSizes = algorithmIdentifier;
        this.getHighSpeedVideoFpsRanges = algorithmIdentifier2;
        this.getHighResolutionOutputSizeshNQ4ISI = aSN1Integer;
        this.getHighSpeedVideoFpsRangesFor = aSN1Integer2;
    }

    private RSASSAPSSparams(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getHighSpeedVideoSizes = DEFAULT_HASH_ALGORITHM;
        this.getHighSpeedVideoFpsRanges = DEFAULT_MASK_GEN_FUNCTION;
        this.getHighResolutionOutputSizeshNQ4ISI = DEFAULT_SALT_LENGTH;
        this.getHighSpeedVideoFpsRangesFor = DEFAULT_TRAILER_FIELD;
        for (int i = 0; i != aSN1Sequence.size(); i++) {
            org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject = (org.bouncycastle.asn1.ASN1TaggedObject) aSN1Sequence.getObjectAt(i);
            int tagNo = aSN1TaggedObject.getTagNo();
            if (tagNo == 0) {
                this.getHighSpeedVideoSizes = org.bouncycastle.asn1.x509.AlgorithmIdentifier.getInstance(aSN1TaggedObject, true);
            } else if (tagNo == 1) {
                this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.x509.AlgorithmIdentifier.getInstance(aSN1TaggedObject, true);
            } else if (tagNo == 2) {
                this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.ASN1Integer.getInstance(aSN1TaggedObject, true);
            } else {
                if (tagNo != 3) {
                    throw new java.lang.IllegalArgumentException("unknown tag");
                }
                this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.ASN1Integer.getInstance(aSN1TaggedObject, true);
            }
        }
    }

    public RSASSAPSSparams() {
        this.getHighSpeedVideoSizes = DEFAULT_HASH_ALGORITHM;
        this.getHighSpeedVideoFpsRanges = DEFAULT_MASK_GEN_FUNCTION;
        this.getHighResolutionOutputSizeshNQ4ISI = DEFAULT_SALT_LENGTH;
        this.getHighSpeedVideoFpsRangesFor = DEFAULT_TRAILER_FIELD;
    }

    static {
        org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier = new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.oiw.OIWObjectIdentifiers.idSHA1, org.bouncycastle.asn1.DERNull.INSTANCE);
        DEFAULT_HASH_ALGORITHM = algorithmIdentifier;
        DEFAULT_MASK_GEN_FUNCTION = new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_mgf1, algorithmIdentifier);
        DEFAULT_SALT_LENGTH = new org.bouncycastle.asn1.ASN1Integer(20L);
        DEFAULT_TRAILER_FIELD = new org.bouncycastle.asn1.ASN1Integer(1L);
    }
}
