package org.bouncycastle.oer.its;

/* loaded from: classes17.dex */
public class ContributedExtensionBlock extends org.bouncycastle.asn1.ASN1Object {
    private final org.bouncycastle.oer.its.HeaderInfoContributorId Camera2StreamConfigurationMap;
    private final java.util.List<org.bouncycastle.oer.its.EtsiOriginatingHeaderInfoExtension> getHighResolutionOutputSizeshNQ4ISI;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return org.bouncycastle.oer.its.Utils.getHighSpeedVideoSizes(this.Camera2StreamConfigurationMap, org.bouncycastle.oer.its.Utils.getHighSpeedVideoSizes(this.getHighResolutionOutputSizeshNQ4ISI));
    }

    public java.util.List<org.bouncycastle.oer.its.EtsiOriginatingHeaderInfoExtension> getExtns() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public org.bouncycastle.oer.its.HeaderInfoContributorId getContributorId() {
        return this.Camera2StreamConfigurationMap;
    }

    public static org.bouncycastle.oer.its.ContributedExtensionBlock getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.oer.its.ContributedExtensionBlock) {
            return (org.bouncycastle.oer.its.ContributedExtensionBlock) obj;
        }
        java.util.Iterator<org.bouncycastle.asn1.ASN1Encodable> it = org.bouncycastle.asn1.ASN1Sequence.getInstance(obj).iterator();
        org.bouncycastle.oer.its.HeaderInfoContributorId headerInfoContributorId = org.bouncycastle.oer.its.HeaderInfoContributorId.getInstance((java.lang.Object) it.next());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (it.hasNext()) {
            arrayList.add(org.bouncycastle.oer.its.EtsiOriginatingHeaderInfoExtension.getInstance(it.next()));
        }
        return new org.bouncycastle.oer.its.ContributedExtensionBlock(headerInfoContributorId, arrayList);
    }

    public ContributedExtensionBlock(org.bouncycastle.oer.its.HeaderInfoContributorId headerInfoContributorId, java.util.List<org.bouncycastle.oer.its.EtsiOriginatingHeaderInfoExtension> list) {
        this.Camera2StreamConfigurationMap = headerInfoContributorId;
        this.getHighResolutionOutputSizeshNQ4ISI = list;
    }
}
