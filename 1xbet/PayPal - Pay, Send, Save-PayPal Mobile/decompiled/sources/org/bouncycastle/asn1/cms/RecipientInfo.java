package org.bouncycastle.asn1.cms;

/* loaded from: classes17.dex */
public class RecipientInfo extends org.bouncycastle.asn1.ASN1Object implements org.bouncycastle.asn1.ASN1Choice {
    org.bouncycastle.asn1.ASN1Encodable Camera2StreamConfigurationMap;

    public org.bouncycastle.asn1.ASN1Encodable getInfo() {
        org.bouncycastle.asn1.ASN1Encodable aSN1Encodable = this.Camera2StreamConfigurationMap;
        if (!(aSN1Encodable instanceof org.bouncycastle.asn1.ASN1TaggedObject)) {
            return org.bouncycastle.asn1.cms.KeyTransRecipientInfo.getInstance(aSN1Encodable);
        }
        org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject = (org.bouncycastle.asn1.ASN1TaggedObject) aSN1Encodable;
        int tagNo = aSN1TaggedObject.getTagNo();
        if (tagNo == 1) {
            return org.bouncycastle.asn1.cms.KeyAgreeRecipientInfo.getInstance(aSN1TaggedObject, false);
        }
        if (tagNo == 2) {
            return org.bouncycastle.asn1.cms.KEKRecipientInfo.getInstance(aSN1TaggedObject, aSN1TaggedObject.isExplicit());
        }
        if (tagNo == 3) {
            return org.bouncycastle.asn1.cms.PasswordRecipientInfo.getInstance(aSN1TaggedObject, false);
        }
        if (tagNo == 4) {
            return org.bouncycastle.asn1.cms.OtherRecipientInfo.getInstance(aSN1TaggedObject, false);
        }
        throw new java.lang.IllegalStateException("unknown tag");
    }

    public org.bouncycastle.asn1.ASN1Integer getVersion() {
        org.bouncycastle.asn1.ASN1Encodable aSN1Encodable = this.Camera2StreamConfigurationMap;
        if (!(aSN1Encodable instanceof org.bouncycastle.asn1.ASN1TaggedObject)) {
            return org.bouncycastle.asn1.cms.KeyTransRecipientInfo.getInstance(aSN1Encodable).getVersion();
        }
        org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject = (org.bouncycastle.asn1.ASN1TaggedObject) aSN1Encodable;
        int tagNo = aSN1TaggedObject.getTagNo();
        if (tagNo == 1) {
            return org.bouncycastle.asn1.cms.KeyAgreeRecipientInfo.getInstance(aSN1TaggedObject, false).getVersion();
        }
        if (tagNo == 2) {
            return org.bouncycastle.asn1.cms.KEKRecipientInfo.getInstance(aSN1TaggedObject, aSN1TaggedObject.isExplicit()).getVersion();
        }
        if (tagNo == 3) {
            return org.bouncycastle.asn1.cms.PasswordRecipientInfo.getInstance(aSN1TaggedObject, false).getVersion();
        }
        if (tagNo == 4) {
            return new org.bouncycastle.asn1.ASN1Integer(0L);
        }
        throw new java.lang.IllegalStateException("unknown tag");
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return this.Camera2StreamConfigurationMap.toASN1Primitive();
    }

    public boolean isTagged() {
        return this.Camera2StreamConfigurationMap instanceof org.bouncycastle.asn1.ASN1TaggedObject;
    }

    public static org.bouncycastle.asn1.cms.RecipientInfo getInstance(java.lang.Object obj) {
        if (obj == null || (obj instanceof org.bouncycastle.asn1.cms.RecipientInfo)) {
            return (org.bouncycastle.asn1.cms.RecipientInfo) obj;
        }
        if (obj instanceof org.bouncycastle.asn1.ASN1Sequence) {
            return new org.bouncycastle.asn1.cms.RecipientInfo((org.bouncycastle.asn1.ASN1Sequence) obj);
        }
        if (obj instanceof org.bouncycastle.asn1.ASN1TaggedObject) {
            return new org.bouncycastle.asn1.cms.RecipientInfo((org.bouncycastle.asn1.ASN1TaggedObject) obj);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("unknown object in factory: ");
        sb.append(obj.getClass().getName());
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public RecipientInfo(org.bouncycastle.asn1.cms.PasswordRecipientInfo passwordRecipientInfo) {
        this.Camera2StreamConfigurationMap = new org.bouncycastle.asn1.DERTaggedObject(false, 3, (org.bouncycastle.asn1.ASN1Encodable) passwordRecipientInfo);
    }

    public RecipientInfo(org.bouncycastle.asn1.cms.OtherRecipientInfo otherRecipientInfo) {
        this.Camera2StreamConfigurationMap = new org.bouncycastle.asn1.DERTaggedObject(false, 4, (org.bouncycastle.asn1.ASN1Encodable) otherRecipientInfo);
    }

    public RecipientInfo(org.bouncycastle.asn1.cms.KeyTransRecipientInfo keyTransRecipientInfo) {
        this.Camera2StreamConfigurationMap = keyTransRecipientInfo;
    }

    public RecipientInfo(org.bouncycastle.asn1.cms.KeyAgreeRecipientInfo keyAgreeRecipientInfo) {
        this.Camera2StreamConfigurationMap = new org.bouncycastle.asn1.DERTaggedObject(false, 1, (org.bouncycastle.asn1.ASN1Encodable) keyAgreeRecipientInfo);
    }

    public RecipientInfo(org.bouncycastle.asn1.cms.KEKRecipientInfo kEKRecipientInfo) {
        this.Camera2StreamConfigurationMap = new org.bouncycastle.asn1.DERTaggedObject(false, 2, (org.bouncycastle.asn1.ASN1Encodable) kEKRecipientInfo);
    }

    public RecipientInfo(org.bouncycastle.asn1.ASN1Primitive aSN1Primitive) {
        this.Camera2StreamConfigurationMap = aSN1Primitive;
    }
}
