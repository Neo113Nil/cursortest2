package org.bouncycastle.asn1.bc;

/* loaded from: classes17.dex */
public class ObjectStoreIntegrityCheck extends org.bouncycastle.asn1.ASN1Object implements org.bouncycastle.asn1.ASN1Choice {
    public static final int PBKD_MAC_CHECK = 0;
    public static final int SIG_CHECK = 1;
    private final int getHighSpeedVideoFpsRangesFor;
    private final org.bouncycastle.asn1.ASN1Object getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1Object aSN1Object = this.getHighSpeedVideoSizes;
        return aSN1Object instanceof org.bouncycastle.asn1.bc.SignatureCheck ? new org.bouncycastle.asn1.DERTaggedObject(0, aSN1Object) : aSN1Object.toASN1Primitive();
    }

    public int getType() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public org.bouncycastle.asn1.ASN1Object getIntegrityCheck() {
        return this.getHighSpeedVideoSizes;
    }

    public static org.bouncycastle.asn1.bc.ObjectStoreIntegrityCheck getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.bc.ObjectStoreIntegrityCheck) {
            return (org.bouncycastle.asn1.bc.ObjectStoreIntegrityCheck) obj;
        }
        if (obj instanceof byte[]) {
            try {
                return new org.bouncycastle.asn1.bc.ObjectStoreIntegrityCheck(org.bouncycastle.asn1.ASN1Primitive.fromByteArray((byte[]) obj));
            } catch (java.io.IOException unused) {
                throw new java.lang.IllegalArgumentException("Unable to parse integrity check details.");
            }
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.bc.ObjectStoreIntegrityCheck((org.bouncycastle.asn1.ASN1Encodable) obj);
        }
        return null;
    }

    public ObjectStoreIntegrityCheck(org.bouncycastle.asn1.bc.SignatureCheck signatureCheck) {
        this(new org.bouncycastle.asn1.DERTaggedObject(0, signatureCheck));
    }

    public ObjectStoreIntegrityCheck(org.bouncycastle.asn1.bc.PbkdMacIntegrityCheck pbkdMacIntegrityCheck) {
        this((org.bouncycastle.asn1.ASN1Encodable) pbkdMacIntegrityCheck);
    }

    private ObjectStoreIntegrityCheck(org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
        org.bouncycastle.asn1.ASN1Object pbkdMacIntegrityCheck;
        if ((aSN1Encodable instanceof org.bouncycastle.asn1.ASN1Sequence) || (aSN1Encodable instanceof org.bouncycastle.asn1.bc.PbkdMacIntegrityCheck)) {
            this.getHighSpeedVideoFpsRangesFor = 0;
            pbkdMacIntegrityCheck = org.bouncycastle.asn1.bc.PbkdMacIntegrityCheck.getInstance(aSN1Encodable);
        } else {
            if (!(aSN1Encodable instanceof org.bouncycastle.asn1.ASN1TaggedObject)) {
                throw new java.lang.IllegalArgumentException("Unknown check object in integrity check.");
            }
            this.getHighSpeedVideoFpsRangesFor = 1;
            pbkdMacIntegrityCheck = org.bouncycastle.asn1.bc.SignatureCheck.getInstance(((org.bouncycastle.asn1.ASN1TaggedObject) aSN1Encodable).getObject());
        }
        this.getHighSpeedVideoSizes = pbkdMacIntegrityCheck;
    }
}
