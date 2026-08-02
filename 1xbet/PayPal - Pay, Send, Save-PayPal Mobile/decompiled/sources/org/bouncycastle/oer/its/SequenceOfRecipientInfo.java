package org.bouncycastle.oer.its;

/* loaded from: classes17.dex */
public class SequenceOfRecipientInfo extends org.bouncycastle.asn1.ASN1Object {
    private final java.util.List<org.bouncycastle.oer.its.RecipientInfo> getHighSpeedVideoFpsRangesFor;

    public static class Builder {
        private java.util.List<org.bouncycastle.oer.its.RecipientInfo> getHighSpeedVideoFpsRangesFor;

        public org.bouncycastle.oer.its.SequenceOfRecipientInfo.Builder setRecipientInfos(java.util.List<org.bouncycastle.oer.its.RecipientInfo> list) {
            this.getHighSpeedVideoFpsRangesFor = list;
            return this;
        }

        public org.bouncycastle.oer.its.SequenceOfRecipientInfo createSequenceOfRecipientInfo() {
            return new org.bouncycastle.oer.its.SequenceOfRecipientInfo(this.getHighSpeedVideoFpsRangesFor);
        }

        public org.bouncycastle.oer.its.SequenceOfRecipientInfo.Builder addRecipients(org.bouncycastle.oer.its.RecipientInfo... recipientInfoArr) {
            if (this.getHighSpeedVideoFpsRangesFor == null) {
                this.getHighSpeedVideoFpsRangesFor = new java.util.ArrayList();
            }
            this.getHighSpeedVideoFpsRangesFor.addAll(java.util.Arrays.asList(recipientInfoArr));
            return this;
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return new org.bouncycastle.asn1.DERSequence(new org.bouncycastle.asn1.ASN1EncodableVector());
    }

    public java.util.List<org.bouncycastle.oer.its.RecipientInfo> getRecipientInfos() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public static org.bouncycastle.oer.its.SequenceOfRecipientInfo getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.oer.its.SequenceOfRecipientInfo) {
            return (org.bouncycastle.oer.its.SequenceOfRecipientInfo) obj;
        }
        java.util.Enumeration objects = org.bouncycastle.asn1.ASN1Sequence.getInstance(obj).getObjects();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (objects.hasMoreElements()) {
            arrayList.add(org.bouncycastle.oer.its.RecipientInfo.getInstance(objects.nextElement()));
        }
        return new org.bouncycastle.oer.its.SequenceOfRecipientInfo.Builder().setRecipientInfos(arrayList).createSequenceOfRecipientInfo();
    }

    public SequenceOfRecipientInfo(java.util.List<org.bouncycastle.oer.its.RecipientInfo> list) {
        this.getHighSpeedVideoFpsRangesFor = java.util.Collections.unmodifiableList(list);
    }
}
