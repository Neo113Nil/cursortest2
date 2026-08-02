package org.bouncycastle.asn1.crmf;

/* loaded from: classes17.dex */
public class POPOPrivKey extends org.bouncycastle.asn1.ASN1Object implements org.bouncycastle.asn1.ASN1Choice {
    public static final int agreeMAC = 3;
    public static final int dhMAC = 2;
    public static final int encryptedKey = 4;
    public static final int subsequentMessage = 1;
    public static final int thisMessage = 0;
    private int getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.asn1.ASN1Encodable getHighSpeedVideoFpsRangesFor;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return new org.bouncycastle.asn1.DERTaggedObject(false, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor);
    }

    public org.bouncycastle.asn1.ASN1Encodable getValue() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public int getType() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static org.bouncycastle.asn1.crmf.POPOPrivKey getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(org.bouncycastle.asn1.ASN1TaggedObject.getInstance(aSN1TaggedObject, true));
    }

    public static org.bouncycastle.asn1.crmf.POPOPrivKey getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.crmf.POPOPrivKey) {
            return (org.bouncycastle.asn1.crmf.POPOPrivKey) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.crmf.POPOPrivKey(org.bouncycastle.asn1.ASN1TaggedObject.getInstance(obj));
        }
        return null;
    }

    public POPOPrivKey(org.bouncycastle.asn1.crmf.SubsequentMessage subsequentMessage2) {
        this.getHighResolutionOutputSizeshNQ4ISI = 1;
        this.getHighSpeedVideoFpsRangesFor = subsequentMessage2;
    }

    public POPOPrivKey(org.bouncycastle.asn1.crmf.PKMACValue pKMACValue) {
        this.getHighResolutionOutputSizeshNQ4ISI = 3;
        this.getHighSpeedVideoFpsRangesFor = pKMACValue;
    }

    private POPOPrivKey(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject) {
        org.bouncycastle.asn1.ASN1Encodable dERBitString;
        int tagNo = aSN1TaggedObject.getTagNo();
        this.getHighResolutionOutputSizeshNQ4ISI = tagNo;
        if (tagNo != 0) {
            if (tagNo == 1) {
                dERBitString = org.bouncycastle.asn1.crmf.SubsequentMessage.valueOf(org.bouncycastle.asn1.ASN1Integer.getInstance(aSN1TaggedObject, false).intValueExact());
            } else if (tagNo != 2) {
                if (tagNo == 3) {
                    dERBitString = org.bouncycastle.asn1.crmf.PKMACValue.getInstance(aSN1TaggedObject, false);
                } else {
                    if (tagNo != 4) {
                        throw new java.lang.IllegalArgumentException("unknown tag in POPOPrivKey");
                    }
                    dERBitString = org.bouncycastle.asn1.cms.EnvelopedData.getInstance(aSN1TaggedObject, false);
                }
            }
            this.getHighSpeedVideoFpsRangesFor = dERBitString;
        }
        dERBitString = org.bouncycastle.asn1.DERBitString.getInstance(aSN1TaggedObject, false);
        this.getHighSpeedVideoFpsRangesFor = dERBitString;
    }
}
