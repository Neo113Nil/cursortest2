package org.bouncycastle.asn1.x9;

/* loaded from: classes17.dex */
public class KeySpecificInfo extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.ASN1ObjectIdentifier Camera2StreamConfigurationMap;
    private org.bouncycastle.asn1.ASN1OctetString getHighResolutionOutputSizeshNQ4ISI;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.Camera2StreamConfigurationMap);
        aSN1EncodableVector.add(this.getHighResolutionOutputSizeshNQ4ISI);
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.ASN1OctetString getCounter() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public org.bouncycastle.asn1.ASN1ObjectIdentifier getAlgorithm() {
        return this.Camera2StreamConfigurationMap;
    }

    public static org.bouncycastle.asn1.x9.KeySpecificInfo getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.x9.KeySpecificInfo) {
            return (org.bouncycastle.asn1.x9.KeySpecificInfo) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.x9.KeySpecificInfo(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    private KeySpecificInfo(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        java.util.Enumeration objects = aSN1Sequence.getObjects();
        this.Camera2StreamConfigurationMap = (org.bouncycastle.asn1.ASN1ObjectIdentifier) objects.nextElement();
        this.getHighResolutionOutputSizeshNQ4ISI = (org.bouncycastle.asn1.ASN1OctetString) objects.nextElement();
    }

    public KeySpecificInfo(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, org.bouncycastle.asn1.ASN1OctetString aSN1OctetString) {
        this.Camera2StreamConfigurationMap = aSN1ObjectIdentifier;
        this.getHighResolutionOutputSizeshNQ4ISI = aSN1OctetString;
    }
}
