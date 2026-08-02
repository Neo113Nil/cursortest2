package org.bouncycastle.asn1.cmp;

/* loaded from: classes17.dex */
public class CertConfirmContent extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.ASN1Sequence Camera2StreamConfigurationMap;

    public org.bouncycastle.asn1.cmp.CertStatus[] toCertStatusArray() {
        int size = this.Camera2StreamConfigurationMap.size();
        org.bouncycastle.asn1.cmp.CertStatus[] certStatusArr = new org.bouncycastle.asn1.cmp.CertStatus[size];
        for (int i = 0; i != size; i++) {
            certStatusArr[i] = org.bouncycastle.asn1.cmp.CertStatus.getInstance(this.Camera2StreamConfigurationMap.getObjectAt(i));
        }
        return certStatusArr;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return this.Camera2StreamConfigurationMap;
    }

    public static org.bouncycastle.asn1.cmp.CertConfirmContent getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.cmp.CertConfirmContent) {
            return (org.bouncycastle.asn1.cmp.CertConfirmContent) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.cmp.CertConfirmContent(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    private CertConfirmContent(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.Camera2StreamConfigurationMap = aSN1Sequence;
    }
}
