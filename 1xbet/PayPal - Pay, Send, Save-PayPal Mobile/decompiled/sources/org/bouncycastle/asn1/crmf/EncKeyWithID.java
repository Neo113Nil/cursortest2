package org.bouncycastle.asn1.crmf;

/* loaded from: classes17.dex */
public class EncKeyWithID extends org.bouncycastle.asn1.ASN1Object {
    private final org.bouncycastle.asn1.pkcs.PrivateKeyInfo Camera2StreamConfigurationMap;
    private final org.bouncycastle.asn1.ASN1Encodable getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.Camera2StreamConfigurationMap);
        org.bouncycastle.asn1.ASN1Encodable aSN1Encodable = this.getHighSpeedVideoSizes;
        if (aSN1Encodable != null) {
            aSN1EncodableVector.add(aSN1Encodable);
        }
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public boolean isIdentifierUTF8String() {
        return this.getHighSpeedVideoSizes instanceof org.bouncycastle.asn1.ASN1UTF8String;
    }

    public boolean hasIdentifier() {
        return this.getHighSpeedVideoSizes != null;
    }

    public org.bouncycastle.asn1.pkcs.PrivateKeyInfo getPrivateKey() {
        return this.Camera2StreamConfigurationMap;
    }

    public org.bouncycastle.asn1.ASN1Encodable getIdentifier() {
        return this.getHighSpeedVideoSizes;
    }

    public static org.bouncycastle.asn1.crmf.EncKeyWithID getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.crmf.EncKeyWithID) {
            return (org.bouncycastle.asn1.crmf.EncKeyWithID) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.crmf.EncKeyWithID(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public EncKeyWithID(org.bouncycastle.asn1.pkcs.PrivateKeyInfo privateKeyInfo, org.bouncycastle.asn1.x509.GeneralName generalName) {
        this.Camera2StreamConfigurationMap = privateKeyInfo;
        this.getHighSpeedVideoSizes = generalName;
    }

    public EncKeyWithID(org.bouncycastle.asn1.pkcs.PrivateKeyInfo privateKeyInfo, org.bouncycastle.asn1.ASN1UTF8String aSN1UTF8String) {
        this.Camera2StreamConfigurationMap = privateKeyInfo;
        this.getHighSpeedVideoSizes = aSN1UTF8String;
    }

    public EncKeyWithID(org.bouncycastle.asn1.pkcs.PrivateKeyInfo privateKeyInfo) {
        this.Camera2StreamConfigurationMap = privateKeyInfo;
        this.getHighSpeedVideoSizes = null;
    }

    private EncKeyWithID(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        org.bouncycastle.asn1.x509.GeneralName generalName;
        this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.pkcs.PrivateKeyInfo.getInstance(aSN1Sequence.getObjectAt(0));
        if (aSN1Sequence.size() > 1) {
            boolean z = aSN1Sequence.getObjectAt(1) instanceof org.bouncycastle.asn1.ASN1UTF8String;
            org.bouncycastle.asn1.ASN1Encodable objectAt = aSN1Sequence.getObjectAt(1);
            if (z) {
                this.getHighSpeedVideoSizes = objectAt;
                return;
            }
            generalName = org.bouncycastle.asn1.x509.GeneralName.getInstance(objectAt);
        } else {
            generalName = null;
        }
        this.getHighSpeedVideoSizes = generalName;
    }
}
