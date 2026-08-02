package org.bouncycastle.asn1.crmf;

/* loaded from: classes17.dex */
public class PKMACValue extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.ASN1BitString Camera2StreamConfigurationMap;
    private org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighSpeedVideoFpsRanges;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRanges);
        aSN1EncodableVector.add(this.Camera2StreamConfigurationMap);
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.ASN1BitString getValue() {
        return this.Camera2StreamConfigurationMap;
    }

    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getAlgId() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public static org.bouncycastle.asn1.crmf.PKMACValue getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public static org.bouncycastle.asn1.crmf.PKMACValue getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.crmf.PKMACValue) {
            return (org.bouncycastle.asn1.crmf.PKMACValue) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.crmf.PKMACValue(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public PKMACValue(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, org.bouncycastle.asn1.DERBitString dERBitString) {
        this.getHighSpeedVideoFpsRanges = algorithmIdentifier;
        this.Camera2StreamConfigurationMap = dERBitString;
    }

    public PKMACValue(org.bouncycastle.asn1.cmp.PBMParameter pBMParameter, org.bouncycastle.asn1.DERBitString dERBitString) {
        this(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.cmp.CMPObjectIdentifiers.passwordBasedMac, pBMParameter), dERBitString);
    }

    private PKMACValue(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.x509.AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
        this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.ASN1BitString.getInstance(aSN1Sequence.getObjectAt(1));
    }
}
