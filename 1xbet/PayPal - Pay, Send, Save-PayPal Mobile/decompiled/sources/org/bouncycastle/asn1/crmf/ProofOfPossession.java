package org.bouncycastle.asn1.crmf;

/* loaded from: classes17.dex */
public class ProofOfPossession extends org.bouncycastle.asn1.ASN1Object implements org.bouncycastle.asn1.ASN1Choice {
    public static final int TYPE_KEY_AGREEMENT = 3;
    public static final int TYPE_KEY_ENCIPHERMENT = 2;
    public static final int TYPE_RA_VERIFIED = 0;
    public static final int TYPE_SIGNING_KEY = 1;
    private org.bouncycastle.asn1.ASN1Encodable getHighResolutionOutputSizeshNQ4ISI;
    private int getHighSpeedVideoFpsRangesFor;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return new org.bouncycastle.asn1.DERTaggedObject(false, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public int getType() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public org.bouncycastle.asn1.ASN1Encodable getObject() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static org.bouncycastle.asn1.crmf.ProofOfPossession getInstance(java.lang.Object obj) {
        if (obj == null || (obj instanceof org.bouncycastle.asn1.crmf.ProofOfPossession)) {
            return (org.bouncycastle.asn1.crmf.ProofOfPossession) obj;
        }
        if (obj instanceof org.bouncycastle.asn1.ASN1TaggedObject) {
            return new org.bouncycastle.asn1.crmf.ProofOfPossession((org.bouncycastle.asn1.ASN1TaggedObject) obj);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid object: ");
        sb.append(obj.getClass().getName());
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public ProofOfPossession(org.bouncycastle.asn1.crmf.POPOSigningKey pOPOSigningKey) {
        this.getHighSpeedVideoFpsRangesFor = 1;
        this.getHighResolutionOutputSizeshNQ4ISI = pOPOSigningKey;
    }

    private ProofOfPossession(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject) {
        org.bouncycastle.asn1.ASN1Encodable aSN1Encodable;
        int tagNo = aSN1TaggedObject.getTagNo();
        this.getHighSpeedVideoFpsRangesFor = tagNo;
        if (tagNo == 0) {
            aSN1Encodable = org.bouncycastle.asn1.DERNull.INSTANCE;
        } else if (tagNo == 1) {
            aSN1Encodable = org.bouncycastle.asn1.crmf.POPOSigningKey.getInstance(aSN1TaggedObject, false);
        } else {
            if (tagNo != 2 && tagNo != 3) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("unknown tag: ");
                sb.append(this.getHighSpeedVideoFpsRangesFor);
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
            aSN1Encodable = org.bouncycastle.asn1.crmf.POPOPrivKey.getInstance(aSN1TaggedObject, true);
        }
        this.getHighResolutionOutputSizeshNQ4ISI = aSN1Encodable;
    }

    public ProofOfPossession(int i, org.bouncycastle.asn1.crmf.POPOPrivKey pOPOPrivKey) {
        this.getHighSpeedVideoFpsRangesFor = i;
        this.getHighResolutionOutputSizeshNQ4ISI = pOPOPrivKey;
    }

    public ProofOfPossession() {
        this.getHighSpeedVideoFpsRangesFor = 0;
        this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.DERNull.INSTANCE;
    }
}
