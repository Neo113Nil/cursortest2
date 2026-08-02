package org.bouncycastle.asn1.crmf;

/* loaded from: classes17.dex */
public class PKIArchiveOptions extends org.bouncycastle.asn1.ASN1Object implements org.bouncycastle.asn1.ASN1Choice {
    public static final int archiveRemGenPrivKey = 2;
    public static final int encryptedPrivKey = 0;
    public static final int keyGenParameters = 1;
    private org.bouncycastle.asn1.ASN1Encodable getHighSpeedVideoFpsRangesFor;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1Encodable aSN1Encodable = this.getHighSpeedVideoFpsRangesFor;
        return aSN1Encodable instanceof org.bouncycastle.asn1.crmf.EncryptedKey ? new org.bouncycastle.asn1.DERTaggedObject(true, 0, aSN1Encodable) : aSN1Encodable instanceof org.bouncycastle.asn1.ASN1OctetString ? new org.bouncycastle.asn1.DERTaggedObject(false, 1, aSN1Encodable) : new org.bouncycastle.asn1.DERTaggedObject(false, 2, aSN1Encodable);
    }

    public org.bouncycastle.asn1.ASN1Encodable getValue() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public int getType() {
        org.bouncycastle.asn1.ASN1Encodable aSN1Encodable = this.getHighSpeedVideoFpsRangesFor;
        if (aSN1Encodable instanceof org.bouncycastle.asn1.crmf.EncryptedKey) {
            return 0;
        }
        return aSN1Encodable instanceof org.bouncycastle.asn1.ASN1OctetString ? 1 : 2;
    }

    public static org.bouncycastle.asn1.crmf.PKIArchiveOptions getInstance(java.lang.Object obj) {
        if (obj == null || (obj instanceof org.bouncycastle.asn1.crmf.PKIArchiveOptions)) {
            return (org.bouncycastle.asn1.crmf.PKIArchiveOptions) obj;
        }
        if (obj instanceof org.bouncycastle.asn1.ASN1TaggedObject) {
            return new org.bouncycastle.asn1.crmf.PKIArchiveOptions((org.bouncycastle.asn1.ASN1TaggedObject) obj);
        }
        throw new java.lang.IllegalArgumentException("unknown object: ".concat(java.lang.String.valueOf(obj)));
    }

    public PKIArchiveOptions(boolean z) {
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.ASN1Boolean.getInstance(z);
    }

    public PKIArchiveOptions(org.bouncycastle.asn1.crmf.EncryptedKey encryptedKey) {
        this.getHighSpeedVideoFpsRangesFor = encryptedKey;
    }

    private PKIArchiveOptions(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject) {
        org.bouncycastle.asn1.ASN1Encodable encryptedKey;
        int tagNo = aSN1TaggedObject.getTagNo();
        if (tagNo == 0) {
            encryptedKey = org.bouncycastle.asn1.crmf.EncryptedKey.getInstance(aSN1TaggedObject.getObject());
        } else if (tagNo == 1) {
            encryptedKey = org.bouncycastle.asn1.ASN1OctetString.getInstance(aSN1TaggedObject, false);
        } else {
            if (tagNo != 2) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("unknown tag number: ");
                sb.append(aSN1TaggedObject.getTagNo());
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
            encryptedKey = org.bouncycastle.asn1.ASN1Boolean.getInstance(aSN1TaggedObject, false);
        }
        this.getHighSpeedVideoFpsRangesFor = encryptedKey;
    }

    public PKIArchiveOptions(org.bouncycastle.asn1.ASN1OctetString aSN1OctetString) {
        this.getHighSpeedVideoFpsRangesFor = aSN1OctetString;
    }
}
