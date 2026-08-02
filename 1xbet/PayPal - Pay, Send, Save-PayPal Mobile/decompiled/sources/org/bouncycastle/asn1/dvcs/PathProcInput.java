package org.bouncycastle.asn1.dvcs;

/* loaded from: classes17.dex */
public class PathProcInput extends org.bouncycastle.asn1.ASN1Object {
    private boolean Camera2StreamConfigurationMap;
    private boolean getHighSpeedVideoFpsRanges;
    private org.bouncycastle.asn1.x509.PolicyInformation[] getHighSpeedVideoFpsRangesFor;
    private boolean getHighSpeedVideoSizes;

    public PathProcInput(org.bouncycastle.asn1.x509.PolicyInformation[] policyInformationArr) {
        this.getHighSpeedVideoFpsRanges = false;
        this.getHighSpeedVideoSizes = false;
        this.Camera2StreamConfigurationMap = false;
        int length = policyInformationArr.length;
        org.bouncycastle.asn1.x509.PolicyInformation[] policyInformationArr2 = new org.bouncycastle.asn1.x509.PolicyInformation[length];
        java.lang.System.arraycopy(policyInformationArr, 0, policyInformationArr2, 0, length);
        this.getHighSpeedVideoFpsRangesFor = policyInformationArr2;
    }

    public PathProcInput(org.bouncycastle.asn1.x509.PolicyInformation[] policyInformationArr, boolean z, boolean z2, boolean z3) {
        this.getHighSpeedVideoFpsRanges = false;
        this.getHighSpeedVideoSizes = false;
        this.Camera2StreamConfigurationMap = false;
        int length = policyInformationArr.length;
        org.bouncycastle.asn1.x509.PolicyInformation[] policyInformationArr2 = new org.bouncycastle.asn1.x509.PolicyInformation[length];
        java.lang.System.arraycopy(policyInformationArr, 0, policyInformationArr2, 0, length);
        this.getHighSpeedVideoFpsRangesFor = policyInformationArr2;
        this.getHighSpeedVideoFpsRanges = z;
        this.getHighSpeedVideoSizes = z2;
        this.Camera2StreamConfigurationMap = z3;
    }

    public static org.bouncycastle.asn1.dvcs.PathProcInput getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.dvcs.PathProcInput) {
            return (org.bouncycastle.asn1.dvcs.PathProcInput) obj;
        }
        if (obj == null) {
            return null;
        }
        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence = org.bouncycastle.asn1.ASN1Sequence.getInstance(obj);
        org.bouncycastle.asn1.dvcs.PathProcInput pathProcInput = new org.bouncycastle.asn1.dvcs.PathProcInput(getHighSpeedVideoFpsRangesFor(org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1Sequence.getObjectAt(0))));
        for (int i = 1; i < aSN1Sequence.size(); i++) {
            org.bouncycastle.asn1.ASN1Encodable objectAt = aSN1Sequence.getObjectAt(i);
            if (objectAt instanceof org.bouncycastle.asn1.ASN1Boolean) {
                pathProcInput.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.ASN1Boolean.getInstance(objectAt).isTrue();
            } else if (objectAt instanceof org.bouncycastle.asn1.ASN1TaggedObject) {
                org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject = org.bouncycastle.asn1.ASN1TaggedObject.getInstance(objectAt);
                int tagNo = aSN1TaggedObject.getTagNo();
                if (tagNo == 0) {
                    pathProcInput.getHighSpeedVideoSizes = org.bouncycastle.asn1.ASN1Boolean.getInstance(aSN1TaggedObject, false).isTrue();
                } else {
                    if (tagNo != 1) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Unknown tag encountered: ");
                        sb.append(aSN1TaggedObject.getTagNo());
                        throw new java.lang.IllegalArgumentException(sb.toString());
                    }
                    pathProcInput.Camera2StreamConfigurationMap = org.bouncycastle.asn1.ASN1Boolean.getInstance(aSN1TaggedObject, false).isTrue();
                }
            } else {
                continue;
            }
        }
        return pathProcInput;
    }

    public org.bouncycastle.asn1.x509.PolicyInformation[] getAcceptablePolicySet() {
        org.bouncycastle.asn1.x509.PolicyInformation[] policyInformationArr = this.getHighSpeedVideoFpsRangesFor;
        int length = policyInformationArr.length;
        org.bouncycastle.asn1.x509.PolicyInformation[] policyInformationArr2 = new org.bouncycastle.asn1.x509.PolicyInformation[length];
        java.lang.System.arraycopy(policyInformationArr, 0, policyInformationArr2, 0, length);
        return policyInformationArr2;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PathProcInput: {\nacceptablePolicySet: ");
        sb.append(java.util.Arrays.asList(this.getHighSpeedVideoFpsRangesFor));
        sb.append("\ninhibitPolicyMapping: ");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append("\nexplicitPolicyReqd: ");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append("\ninhibitAnyPolicy: ");
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append("\n}\n");
        return sb.toString();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(4);
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector2 = new org.bouncycastle.asn1.ASN1EncodableVector(this.getHighSpeedVideoFpsRangesFor.length);
        int i = 0;
        while (true) {
            org.bouncycastle.asn1.x509.PolicyInformation[] policyInformationArr = this.getHighSpeedVideoFpsRangesFor;
            if (i == policyInformationArr.length) {
                break;
            }
            aSN1EncodableVector2.add(policyInformationArr[i]);
            i++;
        }
        aSN1EncodableVector.add(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector2));
        boolean z = this.getHighSpeedVideoFpsRanges;
        if (z) {
            aSN1EncodableVector.add(org.bouncycastle.asn1.ASN1Boolean.getInstance(z));
        }
        boolean z2 = this.getHighSpeedVideoSizes;
        if (z2) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(false, 0, (org.bouncycastle.asn1.ASN1Encodable) org.bouncycastle.asn1.ASN1Boolean.getInstance(z2)));
        }
        boolean z3 = this.Camera2StreamConfigurationMap;
        if (z3) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(false, 1, (org.bouncycastle.asn1.ASN1Encodable) org.bouncycastle.asn1.ASN1Boolean.getInstance(z3)));
        }
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public boolean isInhibitPolicyMapping() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public boolean isInhibitAnyPolicy() {
        return this.Camera2StreamConfigurationMap;
    }

    public boolean isExplicitPolicyReqd() {
        return this.getHighSpeedVideoSizes;
    }

    public static org.bouncycastle.asn1.dvcs.PathProcInput getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    private static org.bouncycastle.asn1.x509.PolicyInformation[] getHighSpeedVideoFpsRangesFor(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        int size = aSN1Sequence.size();
        org.bouncycastle.asn1.x509.PolicyInformation[] policyInformationArr = new org.bouncycastle.asn1.x509.PolicyInformation[size];
        for (int i = 0; i != size; i++) {
            policyInformationArr[i] = org.bouncycastle.asn1.x509.PolicyInformation.getInstance(aSN1Sequence.getObjectAt(i));
        }
        return policyInformationArr;
    }
}
