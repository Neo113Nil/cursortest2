package org.bouncycastle.asn1.dvcs;

/* loaded from: classes17.dex */
public class TargetEtcChain extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.ASN1Sequence getHighSpeedVideoFpsRanges;
    private org.bouncycastle.asn1.dvcs.PathProcInput getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.asn1.dvcs.CertEtcToken getHighSpeedVideoSizes;

    public java.lang.String toString() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("TargetEtcChain {\n");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("target: ");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
        stringBuffer.append(sb.toString());
        if (this.getHighSpeedVideoFpsRanges != null) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("chain: ");
            sb2.append(this.getHighSpeedVideoFpsRanges);
            sb2.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
            stringBuffer.append(sb2.toString());
        }
        if (this.getHighSpeedVideoFpsRangesFor != null) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("pathProcInput: ");
            sb3.append(this.getHighSpeedVideoFpsRangesFor);
            sb3.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
            stringBuffer.append(sb3.toString());
        }
        stringBuffer.append("}\n");
        return stringBuffer.toString();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(3);
        aSN1EncodableVector.add(this.getHighSpeedVideoSizes);
        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence = this.getHighSpeedVideoFpsRanges;
        if (aSN1Sequence != null) {
            aSN1EncodableVector.add(aSN1Sequence);
        }
        org.bouncycastle.asn1.dvcs.PathProcInput pathProcInput = this.getHighSpeedVideoFpsRangesFor;
        if (pathProcInput != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(false, 0, (org.bouncycastle.asn1.ASN1Encodable) pathProcInput));
        }
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.dvcs.CertEtcToken getTarget() {
        return this.getHighSpeedVideoSizes;
    }

    public org.bouncycastle.asn1.dvcs.PathProcInput getPathProcInput() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public org.bouncycastle.asn1.dvcs.CertEtcToken[] getChain() {
        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence = this.getHighSpeedVideoFpsRanges;
        if (aSN1Sequence != null) {
            return org.bouncycastle.asn1.dvcs.CertEtcToken.arrayFromSequence(aSN1Sequence);
        }
        return null;
    }

    public static org.bouncycastle.asn1.dvcs.TargetEtcChain getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public static org.bouncycastle.asn1.dvcs.TargetEtcChain getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.dvcs.TargetEtcChain) {
            return (org.bouncycastle.asn1.dvcs.TargetEtcChain) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.dvcs.TargetEtcChain(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    private void getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
        org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject = org.bouncycastle.asn1.ASN1TaggedObject.getInstance(aSN1Encodable);
        if (aSN1TaggedObject.getTagNo() == 0) {
            this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.dvcs.PathProcInput.getInstance(aSN1TaggedObject, false);
        } else {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unknown tag encountered: ");
            sb.append(aSN1TaggedObject.getTagNo());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
    }

    public static org.bouncycastle.asn1.dvcs.TargetEtcChain[] arrayFromSequence(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        int size = aSN1Sequence.size();
        org.bouncycastle.asn1.dvcs.TargetEtcChain[] targetEtcChainArr = new org.bouncycastle.asn1.dvcs.TargetEtcChain[size];
        for (int i = 0; i != size; i++) {
            targetEtcChainArr[i] = getInstance(aSN1Sequence.getObjectAt(i));
        }
        return targetEtcChainArr;
    }

    public TargetEtcChain(org.bouncycastle.asn1.dvcs.CertEtcToken certEtcToken, org.bouncycastle.asn1.dvcs.CertEtcToken[] certEtcTokenArr, org.bouncycastle.asn1.dvcs.PathProcInput pathProcInput) {
        this.getHighSpeedVideoSizes = certEtcToken;
        if (certEtcTokenArr != null) {
            this.getHighSpeedVideoFpsRanges = new org.bouncycastle.asn1.DERSequence(certEtcTokenArr);
        }
        this.getHighSpeedVideoFpsRangesFor = pathProcInput;
    }

    public TargetEtcChain(org.bouncycastle.asn1.dvcs.CertEtcToken certEtcToken, org.bouncycastle.asn1.dvcs.CertEtcToken[] certEtcTokenArr) {
        this(certEtcToken, certEtcTokenArr, null);
    }

    public TargetEtcChain(org.bouncycastle.asn1.dvcs.CertEtcToken certEtcToken, org.bouncycastle.asn1.dvcs.PathProcInput pathProcInput) {
        this(certEtcToken, null, pathProcInput);
    }

    public TargetEtcChain(org.bouncycastle.asn1.dvcs.CertEtcToken certEtcToken) {
        this(certEtcToken, null, null);
    }

    private TargetEtcChain(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getHighSpeedVideoSizes = org.bouncycastle.asn1.dvcs.CertEtcToken.getInstance(aSN1Sequence.getObjectAt(0));
        if (aSN1Sequence.size() > 1) {
            org.bouncycastle.asn1.ASN1Encodable objectAt = aSN1Sequence.getObjectAt(1);
            if (objectAt instanceof org.bouncycastle.asn1.ASN1TaggedObject) {
                getHighResolutionOutputSizeshNQ4ISI(objectAt);
                return;
            }
            this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.ASN1Sequence.getInstance(objectAt);
            if (aSN1Sequence.size() > 2) {
                getHighResolutionOutputSizeshNQ4ISI(aSN1Sequence.getObjectAt(2));
            }
        }
    }
}
