package org.bouncycastle.oer.its;

/* loaded from: classes17.dex */
public class SequenceOfPsidSsp extends org.bouncycastle.asn1.ASN1Object {
    private final java.util.List<org.bouncycastle.oer.its.PsidSsp> getHighSpeedVideoFpsRanges;

    public static class Builder {
        private java.util.List<org.bouncycastle.oer.its.PsidSsp> getHighSpeedVideoFpsRanges = new java.util.ArrayList();

        public org.bouncycastle.oer.its.SequenceOfPsidSsp.Builder setItems(java.util.List<org.bouncycastle.oer.its.PsidSsp> list) {
            this.getHighSpeedVideoFpsRanges = list;
            return this;
        }

        public org.bouncycastle.oer.its.SequenceOfPsidSsp.Builder setItem(org.bouncycastle.oer.its.PsidSsp... psidSspArr) {
            for (int i = 0; i != psidSspArr.length; i++) {
                this.getHighSpeedVideoFpsRanges.add(psidSspArr[i]);
            }
            return this;
        }

        public org.bouncycastle.oer.its.SequenceOfPsidSsp createSequenceOfPsidSsp() {
            return new org.bouncycastle.oer.its.SequenceOfPsidSsp(this.getHighSpeedVideoFpsRanges);
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector();
        java.util.Iterator<org.bouncycastle.oer.its.PsidSsp> it = this.getHighSpeedVideoFpsRanges.iterator();
        while (it.hasNext()) {
            aSN1EncodableVector.add(it.next());
        }
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public java.util.List<org.bouncycastle.oer.its.PsidSsp> getItems() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public static org.bouncycastle.oer.its.SequenceOfPsidSsp getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.oer.its.SequenceOfPsidSsp) {
            return (org.bouncycastle.oer.its.SequenceOfPsidSsp) obj;
        }
        java.util.Enumeration objects = org.bouncycastle.asn1.ASN1Sequence.getInstance(obj).getObjects();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (objects.hasMoreElements()) {
            arrayList.add(org.bouncycastle.oer.its.PsidSsp.getInstance(objects.nextElement()));
        }
        return new org.bouncycastle.oer.its.SequenceOfPsidSsp.Builder().setItems(arrayList).createSequenceOfPsidSsp();
    }

    public static org.bouncycastle.oer.its.SequenceOfPsidSsp.Builder builder() {
        return new org.bouncycastle.oer.its.SequenceOfPsidSsp.Builder();
    }

    public SequenceOfPsidSsp(java.util.List<org.bouncycastle.oer.its.PsidSsp> list) {
        this.getHighSpeedVideoFpsRanges = java.util.Collections.unmodifiableList(list);
    }
}
