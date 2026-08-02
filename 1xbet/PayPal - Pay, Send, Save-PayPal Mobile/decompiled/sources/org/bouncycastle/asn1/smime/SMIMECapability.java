package org.bouncycastle.asn1.smime;

/* loaded from: classes17.dex */
public class SMIMECapability extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.ASN1ObjectIdentifier Camera2StreamConfigurationMap;
    private org.bouncycastle.asn1.ASN1Encodable getHighSpeedVideoFpsRangesFor;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier preferSignedData = org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.preferSignedData;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier canNotDecryptAny = org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.canNotDecryptAny;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier sMIMECapabilitiesVersions = org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.sMIMECapabilitiesVersions;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier dES_CBC = new org.bouncycastle.asn1.ASN1ObjectIdentifier("1.3.14.3.2.7");
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier dES_EDE3_CBC = org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.des_EDE3_CBC;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier rC2_CBC = org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.RC2_CBC;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier aES128_CBC = org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes128_CBC;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier aES192_CBC = org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes192_CBC;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier aES256_CBC = org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes256_CBC;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.Camera2StreamConfigurationMap);
        org.bouncycastle.asn1.ASN1Encodable aSN1Encodable = this.getHighSpeedVideoFpsRangesFor;
        if (aSN1Encodable != null) {
            aSN1EncodableVector.add(aSN1Encodable);
        }
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.ASN1Encodable getParameters() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public org.bouncycastle.asn1.ASN1ObjectIdentifier getCapabilityID() {
        return this.Camera2StreamConfigurationMap;
    }

    public static org.bouncycastle.asn1.smime.SMIMECapability getInstance(java.lang.Object obj) {
        if (obj == null || (obj instanceof org.bouncycastle.asn1.smime.SMIMECapability)) {
            return (org.bouncycastle.asn1.smime.SMIMECapability) obj;
        }
        if (obj instanceof org.bouncycastle.asn1.ASN1Sequence) {
            return new org.bouncycastle.asn1.smime.SMIMECapability((org.bouncycastle.asn1.ASN1Sequence) obj);
        }
        throw new java.lang.IllegalArgumentException("Invalid SMIMECapability");
    }

    public SMIMECapability(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.Camera2StreamConfigurationMap = (org.bouncycastle.asn1.ASN1ObjectIdentifier) aSN1Sequence.getObjectAt(0);
        if (aSN1Sequence.size() > 1) {
            this.getHighSpeedVideoFpsRangesFor = (org.bouncycastle.asn1.ASN1Primitive) aSN1Sequence.getObjectAt(1);
        }
    }

    public SMIMECapability(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
        this.Camera2StreamConfigurationMap = aSN1ObjectIdentifier;
        this.getHighSpeedVideoFpsRangesFor = aSN1Encodable;
    }
}
