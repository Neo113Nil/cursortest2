package org.bouncycastle.asn1.x509;

/* loaded from: classes17.dex */
public class Target extends org.bouncycastle.asn1.ASN1Object implements org.bouncycastle.asn1.ASN1Choice {
    public static final int targetGroup = 1;
    public static final int targetName = 0;
    private org.bouncycastle.asn1.x509.GeneralName Camera2StreamConfigurationMap;
    private org.bouncycastle.asn1.x509.GeneralName getHighResolutionOutputSizeshNQ4ISI;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.x509.GeneralName generalName = this.Camera2StreamConfigurationMap;
        return generalName != null ? new org.bouncycastle.asn1.DERTaggedObject(true, 0, (org.bouncycastle.asn1.ASN1Encodable) generalName) : new org.bouncycastle.asn1.DERTaggedObject(true, 1, (org.bouncycastle.asn1.ASN1Encodable) this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public org.bouncycastle.asn1.x509.GeneralName getTargetName() {
        return this.Camera2StreamConfigurationMap;
    }

    public org.bouncycastle.asn1.x509.GeneralName getTargetGroup() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static org.bouncycastle.asn1.x509.Target getInstance(java.lang.Object obj) {
        if (obj == null || (obj instanceof org.bouncycastle.asn1.x509.Target)) {
            return (org.bouncycastle.asn1.x509.Target) obj;
        }
        if (obj instanceof org.bouncycastle.asn1.ASN1TaggedObject) {
            return new org.bouncycastle.asn1.x509.Target((org.bouncycastle.asn1.ASN1TaggedObject) obj);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("unknown object in factory: ");
        sb.append(obj.getClass());
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    private Target(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject) {
        int tagNo = aSN1TaggedObject.getTagNo();
        if (tagNo == 0) {
            this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.x509.GeneralName.getInstance(aSN1TaggedObject, true);
        } else if (tagNo == 1) {
            this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.x509.GeneralName.getInstance(aSN1TaggedObject, true);
        } else {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("unknown tag: ");
            sb.append(aSN1TaggedObject.getTagNo());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
    }

    public Target(int i, org.bouncycastle.asn1.x509.GeneralName generalName) {
        this(new org.bouncycastle.asn1.DERTaggedObject(i, generalName));
    }
}
