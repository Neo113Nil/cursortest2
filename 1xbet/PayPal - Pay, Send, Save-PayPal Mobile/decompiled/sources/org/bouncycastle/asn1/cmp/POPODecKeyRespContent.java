package org.bouncycastle.asn1.cmp;

/* loaded from: classes17.dex */
public class POPODecKeyRespContent extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.ASN1Sequence Camera2StreamConfigurationMap;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return this.Camera2StreamConfigurationMap;
    }

    public org.bouncycastle.asn1.ASN1Integer[] toASN1IntegerArray() {
        int size = this.Camera2StreamConfigurationMap.size();
        org.bouncycastle.asn1.ASN1Integer[] aSN1IntegerArr = new org.bouncycastle.asn1.ASN1Integer[size];
        for (int i = 0; i != size; i++) {
            aSN1IntegerArr[i] = org.bouncycastle.asn1.ASN1Integer.getInstance(this.Camera2StreamConfigurationMap.getObjectAt(i));
        }
        return aSN1IntegerArr;
    }

    public static org.bouncycastle.asn1.cmp.POPODecKeyRespContent getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.cmp.POPODecKeyRespContent) {
            return (org.bouncycastle.asn1.cmp.POPODecKeyRespContent) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.cmp.POPODecKeyRespContent(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    private POPODecKeyRespContent(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.Camera2StreamConfigurationMap = aSN1Sequence;
    }
}
