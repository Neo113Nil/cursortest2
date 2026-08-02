package org.bouncycastle.asn1.est;

/* loaded from: classes17.dex */
public class CsrAttrs extends org.bouncycastle.asn1.ASN1Object {
    private final org.bouncycastle.asn1.est.AttrOrOID[] getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return new org.bouncycastle.asn1.DERSequence(this.getHighSpeedVideoSizes);
    }

    public int size() {
        return this.getHighSpeedVideoSizes.length;
    }

    public org.bouncycastle.asn1.est.AttrOrOID[] getAttrOrOIDs() {
        return org.bouncycastle.asn1.est.Utils.getHighSpeedVideoSizes(this.getHighSpeedVideoSizes);
    }

    public static org.bouncycastle.asn1.est.CsrAttrs getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public static org.bouncycastle.asn1.est.CsrAttrs getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.est.CsrAttrs) {
            return (org.bouncycastle.asn1.est.CsrAttrs) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.est.CsrAttrs(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public CsrAttrs(org.bouncycastle.asn1.est.AttrOrOID[] attrOrOIDArr) {
        this.getHighSpeedVideoSizes = org.bouncycastle.asn1.est.Utils.getHighSpeedVideoSizes(attrOrOIDArr);
    }

    public CsrAttrs(org.bouncycastle.asn1.est.AttrOrOID attrOrOID) {
        this.getHighSpeedVideoSizes = new org.bouncycastle.asn1.est.AttrOrOID[]{attrOrOID};
    }

    private CsrAttrs(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getHighSpeedVideoSizes = new org.bouncycastle.asn1.est.AttrOrOID[aSN1Sequence.size()];
        for (int i = 0; i != aSN1Sequence.size(); i++) {
            this.getHighSpeedVideoSizes[i] = org.bouncycastle.asn1.est.AttrOrOID.getInstance(aSN1Sequence.getObjectAt(i));
        }
    }
}
