package org.bouncycastle.asn1.cmc;

/* loaded from: classes17.dex */
public class CMCStatusInfo extends org.bouncycastle.asn1.ASN1Object {
    private final org.bouncycastle.asn1.cmc.CMCStatusInfo.OtherInfo Camera2StreamConfigurationMap;
    private final org.bouncycastle.asn1.cmc.CMCStatus getHighResolutionOutputSizeshNQ4ISI;
    private final org.bouncycastle.asn1.ASN1UTF8String getHighSpeedVideoFpsRanges;
    private final org.bouncycastle.asn1.ASN1Sequence getHighSpeedVideoFpsRangesFor;

    public static class OtherInfo extends org.bouncycastle.asn1.ASN1Object implements org.bouncycastle.asn1.ASN1Choice {
        private final org.bouncycastle.asn1.cmc.PendInfo getHighSpeedVideoFpsRangesFor;
        private final org.bouncycastle.asn1.cmc.CMCFailInfo getHighSpeedVideoSizes;

        static /* synthetic */ org.bouncycastle.asn1.cmc.CMCStatusInfo.OtherInfo getHighResolutionOutputSizeshNQ4ISI(java.lang.Object obj) {
            if (obj instanceof org.bouncycastle.asn1.cmc.CMCStatusInfo.OtherInfo) {
                return (org.bouncycastle.asn1.cmc.CMCStatusInfo.OtherInfo) obj;
            }
            if (obj instanceof org.bouncycastle.asn1.ASN1Encodable) {
                org.bouncycastle.asn1.ASN1Primitive aSN1Primitive = ((org.bouncycastle.asn1.ASN1Encodable) obj).toASN1Primitive();
                if (aSN1Primitive instanceof org.bouncycastle.asn1.ASN1Integer) {
                    return new org.bouncycastle.asn1.cmc.CMCStatusInfo.OtherInfo(org.bouncycastle.asn1.cmc.CMCFailInfo.getInstance(aSN1Primitive));
                }
                if (aSN1Primitive instanceof org.bouncycastle.asn1.ASN1Sequence) {
                    return new org.bouncycastle.asn1.cmc.CMCStatusInfo.OtherInfo(org.bouncycastle.asn1.cmc.PendInfo.getInstance(aSN1Primitive));
                }
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("unknown object in getInstance(): ");
            sb.append(obj.getClass().getName());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }

        @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
        public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
            org.bouncycastle.asn1.cmc.PendInfo pendInfo = this.getHighSpeedVideoFpsRangesFor;
            return pendInfo != null ? pendInfo.toASN1Primitive() : this.getHighSpeedVideoSizes.toASN1Primitive();
        }

        public boolean isFailInfo() {
            return this.getHighSpeedVideoSizes != null;
        }

        OtherInfo(org.bouncycastle.asn1.cmc.PendInfo pendInfo) {
            this(null, pendInfo);
        }

        private OtherInfo(org.bouncycastle.asn1.cmc.CMCFailInfo cMCFailInfo, org.bouncycastle.asn1.cmc.PendInfo pendInfo) {
            this.getHighSpeedVideoSizes = cMCFailInfo;
            this.getHighSpeedVideoFpsRangesFor = pendInfo;
        }

        OtherInfo(org.bouncycastle.asn1.cmc.CMCFailInfo cMCFailInfo) {
            this(cMCFailInfo, null);
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(4);
        aSN1EncodableVector.add(this.getHighResolutionOutputSizeshNQ4ISI);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRangesFor);
        org.bouncycastle.asn1.ASN1UTF8String aSN1UTF8String = this.getHighSpeedVideoFpsRanges;
        if (aSN1UTF8String != null) {
            aSN1EncodableVector.add(aSN1UTF8String);
        }
        org.bouncycastle.asn1.cmc.CMCStatusInfo.OtherInfo otherInfo = this.Camera2StreamConfigurationMap;
        if (otherInfo != null) {
            aSN1EncodableVector.add(otherInfo);
        }
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public boolean hasOtherInfo() {
        return this.Camera2StreamConfigurationMap != null;
    }

    public org.bouncycastle.asn1.ASN1UTF8String getStatusStringUTF8() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public org.bouncycastle.asn1.DERUTF8String getStatusString() {
        org.bouncycastle.asn1.ASN1UTF8String aSN1UTF8String = this.getHighSpeedVideoFpsRanges;
        return (aSN1UTF8String == null || (aSN1UTF8String instanceof org.bouncycastle.asn1.DERUTF8String)) ? (org.bouncycastle.asn1.DERUTF8String) aSN1UTF8String : new org.bouncycastle.asn1.DERUTF8String(this.getHighSpeedVideoFpsRanges.getString());
    }

    public org.bouncycastle.asn1.cmc.CMCStatusInfo.OtherInfo getOtherInfo() {
        return this.Camera2StreamConfigurationMap;
    }

    public org.bouncycastle.asn1.cmc.CMCStatus getCMCStatus() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public org.bouncycastle.asn1.cmc.BodyPartID[] getBodyList() {
        return org.bouncycastle.asn1.cmc.Utils.getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRangesFor);
    }

    public static org.bouncycastle.asn1.cmc.CMCStatusInfo getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.cmc.CMCStatusInfo) {
            return (org.bouncycastle.asn1.cmc.CMCStatusInfo) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.cmc.CMCStatusInfo(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    CMCStatusInfo(org.bouncycastle.asn1.cmc.CMCStatus cMCStatus, org.bouncycastle.asn1.ASN1Sequence aSN1Sequence, org.bouncycastle.asn1.ASN1UTF8String aSN1UTF8String, org.bouncycastle.asn1.cmc.CMCStatusInfo.OtherInfo otherInfo) {
        this.getHighResolutionOutputSizeshNQ4ISI = cMCStatus;
        this.getHighSpeedVideoFpsRangesFor = aSN1Sequence;
        this.getHighSpeedVideoFpsRanges = aSN1UTF8String;
        this.Camera2StreamConfigurationMap = otherInfo;
    }

    private CMCStatusInfo(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() < 2 || aSN1Sequence.size() > 4) {
            throw new java.lang.IllegalArgumentException("incorrect sequence size");
        }
        this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.cmc.CMCStatus.getInstance(aSN1Sequence.getObjectAt(0));
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1Sequence.getObjectAt(1));
        if (aSN1Sequence.size() > 3) {
            this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.ASN1UTF8String.getInstance(aSN1Sequence.getObjectAt(2));
            this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.cmc.CMCStatusInfo.OtherInfo.getHighResolutionOutputSizeshNQ4ISI(aSN1Sequence.getObjectAt(3));
        } else if (aSN1Sequence.size() <= 2) {
            this.getHighSpeedVideoFpsRanges = null;
            this.Camera2StreamConfigurationMap = null;
        } else if (aSN1Sequence.getObjectAt(2) instanceof org.bouncycastle.asn1.ASN1UTF8String) {
            this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.ASN1UTF8String.getInstance(aSN1Sequence.getObjectAt(2));
            this.Camera2StreamConfigurationMap = null;
        } else {
            this.getHighSpeedVideoFpsRanges = null;
            this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.cmc.CMCStatusInfo.OtherInfo.getHighResolutionOutputSizeshNQ4ISI(aSN1Sequence.getObjectAt(2));
        }
    }
}
