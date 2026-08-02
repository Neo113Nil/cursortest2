package org.bouncycastle.oer.its;

/* loaded from: classes17.dex */
public class PsidSsp extends org.bouncycastle.asn1.ASN1Object {
    private final org.bouncycastle.oer.its.ServiceSpecificPermissions Camera2StreamConfigurationMap;
    private final org.bouncycastle.oer.its.Psid getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return org.bouncycastle.oer.its.Utils.getHighSpeedVideoSizes(this.getHighSpeedVideoSizes, org.bouncycastle.oer.OEROptional.getInstance(this.Camera2StreamConfigurationMap));
    }

    public static class Builder {
        private org.bouncycastle.oer.its.Psid getHighResolutionOutputSizeshNQ4ISI;
        private org.bouncycastle.oer.its.ServiceSpecificPermissions getHighSpeedVideoFpsRangesFor;

        public org.bouncycastle.oer.its.PsidSsp.Builder setSsp(org.bouncycastle.oer.its.ServiceSpecificPermissions serviceSpecificPermissions) {
            this.getHighSpeedVideoFpsRangesFor = serviceSpecificPermissions;
            return this;
        }

        public org.bouncycastle.oer.its.PsidSsp.Builder setPsid(org.bouncycastle.oer.its.Psid psid) {
            this.getHighResolutionOutputSizeshNQ4ISI = psid;
            return this;
        }

        public org.bouncycastle.oer.its.PsidSsp createPsidSsp() {
            return new org.bouncycastle.oer.its.PsidSsp(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor);
        }
    }

    public org.bouncycastle.oer.its.ServiceSpecificPermissions getSsp() {
        return this.Camera2StreamConfigurationMap;
    }

    public org.bouncycastle.oer.its.Psid getPsid() {
        return this.getHighSpeedVideoSizes;
    }

    public static org.bouncycastle.oer.its.PsidSsp getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.oer.its.PsidSsp) {
            return (org.bouncycastle.oer.its.PsidSsp) obj;
        }
        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence = org.bouncycastle.asn1.ASN1Sequence.getInstance(obj);
        return new org.bouncycastle.oer.its.PsidSsp(org.bouncycastle.oer.its.Psid.getInstance((java.lang.Object) aSN1Sequence.getObjectAt(0)), (org.bouncycastle.oer.its.ServiceSpecificPermissions) org.bouncycastle.oer.OEROptional.getValue(org.bouncycastle.oer.its.ServiceSpecificPermissions.class, aSN1Sequence.getObjectAt(1)));
    }

    public static org.bouncycastle.oer.its.PsidSsp.Builder builder() {
        return new org.bouncycastle.oer.its.PsidSsp.Builder();
    }

    public PsidSsp(org.bouncycastle.oer.its.Psid psid, org.bouncycastle.oer.its.ServiceSpecificPermissions serviceSpecificPermissions) {
        this.getHighSpeedVideoSizes = psid;
        this.Camera2StreamConfigurationMap = serviceSpecificPermissions;
    }
}
