package org.bouncycastle.asn1.pkcs;

/* loaded from: classes17.dex */
public class RSAESOAEPparams extends org.bouncycastle.asn1.ASN1Object {
    public static final org.bouncycastle.asn1.x509.AlgorithmIdentifier DEFAULT_HASH_ALGORITHM;
    public static final org.bouncycastle.asn1.x509.AlgorithmIdentifier DEFAULT_MASK_GEN_FUNCTION;
    public static final org.bouncycastle.asn1.x509.AlgorithmIdentifier DEFAULT_P_SOURCE_ALGORITHM;
    private org.bouncycastle.asn1.x509.AlgorithmIdentifier Camera2StreamConfigurationMap;
    private org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighSpeedVideoFpsRanges;
    private org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighSpeedVideoFpsRangesFor;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(3);
        if (!this.Camera2StreamConfigurationMap.equals(DEFAULT_HASH_ALGORITHM)) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(true, 0, (org.bouncycastle.asn1.ASN1Encodable) this.Camera2StreamConfigurationMap));
        }
        if (!this.getHighSpeedVideoFpsRangesFor.equals(DEFAULT_MASK_GEN_FUNCTION)) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(true, 1, (org.bouncycastle.asn1.ASN1Encodable) this.getHighSpeedVideoFpsRangesFor));
        }
        if (!this.getHighSpeedVideoFpsRanges.equals(DEFAULT_P_SOURCE_ALGORITHM)) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(true, 2, (org.bouncycastle.asn1.ASN1Encodable) this.getHighSpeedVideoFpsRanges));
        }
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getPSourceAlgorithm() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getMaskGenAlgorithm() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getHashAlgorithm() {
        return this.Camera2StreamConfigurationMap;
    }

    public static org.bouncycastle.asn1.pkcs.RSAESOAEPparams getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.pkcs.RSAESOAEPparams) {
            return (org.bouncycastle.asn1.pkcs.RSAESOAEPparams) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.pkcs.RSAESOAEPparams(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public RSAESOAEPparams(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier2, org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier3) {
        this.Camera2StreamConfigurationMap = algorithmIdentifier;
        this.getHighSpeedVideoFpsRangesFor = algorithmIdentifier2;
        this.getHighSpeedVideoFpsRanges = algorithmIdentifier3;
    }

    private RSAESOAEPparams(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.Camera2StreamConfigurationMap = DEFAULT_HASH_ALGORITHM;
        this.getHighSpeedVideoFpsRangesFor = DEFAULT_MASK_GEN_FUNCTION;
        this.getHighSpeedVideoFpsRanges = DEFAULT_P_SOURCE_ALGORITHM;
        for (int i = 0; i != aSN1Sequence.size(); i++) {
            org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject = (org.bouncycastle.asn1.ASN1TaggedObject) aSN1Sequence.getObjectAt(i);
            int tagNo = aSN1TaggedObject.getTagNo();
            if (tagNo == 0) {
                this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.x509.AlgorithmIdentifier.getInstance(aSN1TaggedObject, true);
            } else if (tagNo == 1) {
                this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.x509.AlgorithmIdentifier.getInstance(aSN1TaggedObject, true);
            } else {
                if (tagNo != 2) {
                    throw new java.lang.IllegalArgumentException("unknown tag");
                }
                this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.x509.AlgorithmIdentifier.getInstance(aSN1TaggedObject, true);
            }
        }
    }

    public RSAESOAEPparams() {
        this.Camera2StreamConfigurationMap = DEFAULT_HASH_ALGORITHM;
        this.getHighSpeedVideoFpsRangesFor = DEFAULT_MASK_GEN_FUNCTION;
        this.getHighSpeedVideoFpsRanges = DEFAULT_P_SOURCE_ALGORITHM;
    }

    static {
        org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier = new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.oiw.OIWObjectIdentifiers.idSHA1, org.bouncycastle.asn1.DERNull.INSTANCE);
        DEFAULT_HASH_ALGORITHM = algorithmIdentifier;
        DEFAULT_MASK_GEN_FUNCTION = new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_mgf1, algorithmIdentifier);
        DEFAULT_P_SOURCE_ALGORITHM = new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_pSpecified, new org.bouncycastle.asn1.DEROctetString(new byte[0]));
    }
}
