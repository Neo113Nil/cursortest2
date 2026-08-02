package org.bouncycastle.asn1.pkcs;

/* loaded from: classes17.dex */
public class Pfx extends org.bouncycastle.asn1.ASN1Object implements org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers {
    private org.bouncycastle.asn1.pkcs.ContentInfo Camera2StreamConfigurationMap;
    private org.bouncycastle.asn1.pkcs.MacData getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(3);
        aSN1EncodableVector.add(new org.bouncycastle.asn1.ASN1Integer(3L));
        aSN1EncodableVector.add(this.Camera2StreamConfigurationMap);
        org.bouncycastle.asn1.pkcs.MacData macData = this.getHighSpeedVideoSizes;
        if (macData != null) {
            aSN1EncodableVector.add(macData);
        }
        return new org.bouncycastle.asn1.BERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.pkcs.MacData getMacData() {
        return this.getHighSpeedVideoSizes;
    }

    public org.bouncycastle.asn1.pkcs.ContentInfo getAuthSafe() {
        return this.Camera2StreamConfigurationMap;
    }

    public static org.bouncycastle.asn1.pkcs.Pfx getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.pkcs.Pfx) {
            return (org.bouncycastle.asn1.pkcs.Pfx) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.pkcs.Pfx(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public Pfx(org.bouncycastle.asn1.pkcs.ContentInfo contentInfo, org.bouncycastle.asn1.pkcs.MacData macData) {
        this.Camera2StreamConfigurationMap = contentInfo;
        this.getHighSpeedVideoSizes = macData;
    }

    private Pfx(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getHighSpeedVideoSizes = null;
        if (!org.bouncycastle.asn1.ASN1Integer.getInstance(aSN1Sequence.getObjectAt(0)).hasValue(3)) {
            throw new java.lang.IllegalArgumentException("wrong version for PFX PDU");
        }
        this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.pkcs.ContentInfo.getInstance(aSN1Sequence.getObjectAt(1));
        if (aSN1Sequence.size() == 3) {
            this.getHighSpeedVideoSizes = org.bouncycastle.asn1.pkcs.MacData.getInstance(aSN1Sequence.getObjectAt(2));
        }
    }
}
