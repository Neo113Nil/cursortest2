package org.bouncycastle.oer.its;

/* loaded from: classes17.dex */
public class SequenceOfCertificate extends org.bouncycastle.asn1.ASN1Object {
    private final java.util.List<org.bouncycastle.oer.its.Certificate> getHighSpeedVideoFpsRangesFor;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return org.bouncycastle.oer.its.Utils.getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRangesFor);
    }

    public static class Builder {
        java.util.List<org.bouncycastle.oer.its.Certificate> Camera2StreamConfigurationMap = new java.util.ArrayList();

        public org.bouncycastle.oer.its.SequenceOfCertificate build() {
            return new org.bouncycastle.oer.its.SequenceOfCertificate(this.Camera2StreamConfigurationMap);
        }

        public org.bouncycastle.oer.its.SequenceOfCertificate.Builder add(org.bouncycastle.oer.its.Certificate... certificateArr) {
            this.Camera2StreamConfigurationMap.addAll(java.util.Arrays.asList(certificateArr));
            return this;
        }
    }

    public java.util.List<org.bouncycastle.oer.its.Certificate> getCertificates() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public static org.bouncycastle.oer.its.SequenceOfCertificate getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.oer.its.SequenceOfCertificate) {
            return (org.bouncycastle.oer.its.SequenceOfCertificate) obj;
        }
        java.util.Iterator<org.bouncycastle.asn1.ASN1Encodable> it = org.bouncycastle.asn1.ASN1Sequence.getInstance(obj).iterator();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (it.hasNext()) {
            arrayList.add(org.bouncycastle.oer.its.Certificate.getInstance(it.next()));
        }
        return new org.bouncycastle.oer.its.SequenceOfCertificate(arrayList);
    }

    public static org.bouncycastle.oer.its.SequenceOfCertificate.Builder builder() {
        return new org.bouncycastle.oer.its.SequenceOfCertificate.Builder();
    }

    public SequenceOfCertificate(java.util.List<org.bouncycastle.oer.its.Certificate> list) {
        this.getHighSpeedVideoFpsRangesFor = java.util.Collections.unmodifiableList(list);
    }
}
