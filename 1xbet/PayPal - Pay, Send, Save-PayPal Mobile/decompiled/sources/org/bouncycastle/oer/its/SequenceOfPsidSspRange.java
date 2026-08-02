package org.bouncycastle.oer.its;

/* loaded from: classes17.dex */
public class SequenceOfPsidSspRange extends org.bouncycastle.asn1.ASN1Object {
    private final java.util.List<org.bouncycastle.oer.its.PsidSspRange> Camera2StreamConfigurationMap;

    public static class Builder {
        private java.util.ArrayList<org.bouncycastle.oer.its.PsidSspRange> Camera2StreamConfigurationMap = new java.util.ArrayList<>();

        public org.bouncycastle.oer.its.SequenceOfPsidSspRange build() {
            return new org.bouncycastle.oer.its.SequenceOfPsidSspRange(this.Camera2StreamConfigurationMap);
        }

        public org.bouncycastle.oer.its.SequenceOfPsidSspRange.Builder add(org.bouncycastle.oer.its.PsidSspRange... psidSspRangeArr) {
            this.Camera2StreamConfigurationMap.addAll(java.util.Arrays.asList(psidSspRangeArr));
            return this;
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector();
        java.util.Iterator<org.bouncycastle.oer.its.PsidSspRange> it = this.Camera2StreamConfigurationMap.iterator();
        while (it.hasNext()) {
            aSN1EncodableVector.add(it.next());
        }
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public static org.bouncycastle.oer.its.SequenceOfPsidSspRange getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.oer.its.SequenceOfPsidSspRange) {
            return (org.bouncycastle.oer.its.SequenceOfPsidSspRange) obj;
        }
        java.util.Enumeration objects = org.bouncycastle.asn1.ASN1Sequence.getInstance(obj).getObjects();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (objects.hasMoreElements()) {
            arrayList.add(org.bouncycastle.oer.its.PsidSspRange.getInstance(objects.nextElement()));
        }
        return new org.bouncycastle.oer.its.SequenceOfPsidSspRange(arrayList);
    }

    public static org.bouncycastle.oer.its.SequenceOfPsidSspRange.Builder builder() {
        return new org.bouncycastle.oer.its.SequenceOfPsidSspRange.Builder();
    }

    public SequenceOfPsidSspRange(java.util.List<org.bouncycastle.oer.its.PsidSspRange> list) {
        this.Camera2StreamConfigurationMap = java.util.Collections.unmodifiableList(list);
    }
}
