package org.bouncycastle.oer.its;

/* loaded from: classes17.dex */
public class EtsiOriginatingHeaderInfoExtension extends org.bouncycastle.asn1.ASN1Object {
    private final org.bouncycastle.asn1.ASN1OctetString Camera2StreamConfigurationMap;
    private final org.bouncycastle.oer.its.HeaderInfoContributorId getHighSpeedVideoFpsRangesFor;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return org.bouncycastle.oer.its.Utils.getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap);
    }

    public org.bouncycastle.asn1.ASN1OctetString getExtension() {
        return this.Camera2StreamConfigurationMap;
    }

    public org.bouncycastle.oer.its.HeaderInfoContributorId getEtsiHeaderInfoContributorId() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public static org.bouncycastle.oer.its.EtsiOriginatingHeaderInfoExtension getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.oer.its.EtsiOriginatingHeaderInfoExtension) {
            return (org.bouncycastle.oer.its.EtsiOriginatingHeaderInfoExtension) obj;
        }
        java.util.Iterator<org.bouncycastle.asn1.ASN1Encodable> it = org.bouncycastle.asn1.ASN1Sequence.getInstance(obj).iterator();
        org.bouncycastle.oer.its.HeaderInfoContributorId headerInfoContributorId = org.bouncycastle.oer.its.HeaderInfoContributorId.getInstance((java.lang.Object) it.next());
        return it.hasNext() ? new org.bouncycastle.oer.its.EtsiOriginatingHeaderInfoExtension(headerInfoContributorId, org.bouncycastle.asn1.ASN1OctetString.getInstance(it.next())) : new org.bouncycastle.oer.its.EtsiOriginatingHeaderInfoExtension(headerInfoContributorId, null);
    }

    public EtsiOriginatingHeaderInfoExtension(org.bouncycastle.oer.its.HeaderInfoContributorId headerInfoContributorId, org.bouncycastle.asn1.ASN1OctetString aSN1OctetString) {
        this.getHighSpeedVideoFpsRangesFor = headerInfoContributorId;
        this.Camera2StreamConfigurationMap = aSN1OctetString;
    }
}
