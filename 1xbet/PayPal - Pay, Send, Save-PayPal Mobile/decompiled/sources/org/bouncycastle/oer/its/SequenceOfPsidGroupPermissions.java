package org.bouncycastle.oer.its;

/* loaded from: classes17.dex */
public class SequenceOfPsidGroupPermissions extends org.bouncycastle.asn1.ASN1Object {
    private final java.util.List<org.bouncycastle.oer.its.PsidGroupPermissions> getHighResolutionOutputSizeshNQ4ISI;

    public static class Builder {
        private java.util.List<org.bouncycastle.oer.its.PsidGroupPermissions> getHighResolutionOutputSizeshNQ4ISI = new java.util.ArrayList();

        public org.bouncycastle.oer.its.SequenceOfPsidGroupPermissions.Builder setGroupPermissions(java.util.List<org.bouncycastle.oer.its.PsidGroupPermissions> list) {
            this.getHighResolutionOutputSizeshNQ4ISI.addAll(list);
            return this;
        }

        public org.bouncycastle.oer.its.SequenceOfPsidGroupPermissions createSequenceOfPsidGroupPermissions() {
            return new org.bouncycastle.oer.its.SequenceOfPsidGroupPermissions(this.getHighResolutionOutputSizeshNQ4ISI);
        }

        public org.bouncycastle.oer.its.SequenceOfPsidGroupPermissions.Builder addGroupPermission(org.bouncycastle.oer.its.PsidGroupPermissions... psidGroupPermissionsArr) {
            this.getHighResolutionOutputSizeshNQ4ISI.addAll(java.util.Arrays.asList(psidGroupPermissionsArr));
            return this;
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return new org.bouncycastle.asn1.DERSequence((org.bouncycastle.asn1.ASN1Encodable[]) this.getHighResolutionOutputSizeshNQ4ISI.toArray(new org.bouncycastle.oer.its.PsidGroupPermissions[0]));
    }

    public static org.bouncycastle.oer.its.SequenceOfPsidGroupPermissions getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.oer.its.SequenceOfPsidGroupPermissions) {
            return (org.bouncycastle.oer.its.SequenceOfPsidGroupPermissions) obj;
        }
        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence = org.bouncycastle.asn1.ASN1Sequence.getInstance(obj);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Enumeration objects = aSN1Sequence.getObjects();
        while (objects.hasMoreElements()) {
            arrayList.add(org.bouncycastle.oer.its.PsidGroupPermissions.getInstance(objects.nextElement()));
        }
        return new org.bouncycastle.oer.its.SequenceOfPsidGroupPermissions.Builder().setGroupPermissions(arrayList).createSequenceOfPsidGroupPermissions();
    }

    public static org.bouncycastle.oer.its.SequenceOfPsidGroupPermissions.Builder builder() {
        return new org.bouncycastle.oer.its.SequenceOfPsidGroupPermissions.Builder();
    }

    public SequenceOfPsidGroupPermissions(java.util.List<org.bouncycastle.oer.its.PsidGroupPermissions> list) {
        this.getHighResolutionOutputSizeshNQ4ISI = java.util.Collections.unmodifiableList(list);
    }
}
