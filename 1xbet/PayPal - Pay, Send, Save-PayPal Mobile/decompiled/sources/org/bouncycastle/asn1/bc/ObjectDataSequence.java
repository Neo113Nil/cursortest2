package org.bouncycastle.asn1.bc;

/* loaded from: classes17.dex */
public class ObjectDataSequence extends org.bouncycastle.asn1.ASN1Object implements org.bouncycastle.util.Iterable<org.bouncycastle.asn1.ASN1Encodable> {
    private final org.bouncycastle.asn1.ASN1Encodable[] Camera2StreamConfigurationMap;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return new org.bouncycastle.asn1.DERSequence(this.Camera2StreamConfigurationMap);
    }

    @Override // org.bouncycastle.util.Iterable, java.lang.Iterable
    public java.util.Iterator<org.bouncycastle.asn1.ASN1Encodable> iterator() {
        return new org.bouncycastle.util.Arrays.Iterator(this.Camera2StreamConfigurationMap);
    }

    public static org.bouncycastle.asn1.bc.ObjectDataSequence getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.bc.ObjectDataSequence) {
            return (org.bouncycastle.asn1.bc.ObjectDataSequence) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.bc.ObjectDataSequence(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public ObjectDataSequence(org.bouncycastle.asn1.bc.ObjectData[] objectDataArr) {
        org.bouncycastle.asn1.ASN1Encodable[] aSN1EncodableArr = new org.bouncycastle.asn1.ASN1Encodable[objectDataArr.length];
        this.Camera2StreamConfigurationMap = aSN1EncodableArr;
        java.lang.System.arraycopy(objectDataArr, 0, aSN1EncodableArr, 0, objectDataArr.length);
    }

    private ObjectDataSequence(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.Camera2StreamConfigurationMap = new org.bouncycastle.asn1.ASN1Encodable[aSN1Sequence.size()];
        int i = 0;
        while (true) {
            org.bouncycastle.asn1.ASN1Encodable[] aSN1EncodableArr = this.Camera2StreamConfigurationMap;
            if (i == aSN1EncodableArr.length) {
                return;
            }
            aSN1EncodableArr[i] = org.bouncycastle.asn1.bc.ObjectData.getInstance(aSN1Sequence.getObjectAt(i));
            i++;
        }
    }
}
