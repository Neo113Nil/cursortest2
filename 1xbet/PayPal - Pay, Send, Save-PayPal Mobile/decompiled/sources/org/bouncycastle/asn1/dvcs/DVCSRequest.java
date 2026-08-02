package org.bouncycastle.asn1.dvcs;

/* loaded from: classes17.dex */
public class DVCSRequest extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.dvcs.Data Camera2StreamConfigurationMap;
    private org.bouncycastle.asn1.x509.GeneralName getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.asn1.dvcs.DVCSRequestInformation getHighSpeedVideoSizes;

    public java.lang.String toString() {
        java.lang.String str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DVCSRequest {\nrequestInformation: ");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append("\ndata: ");
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
        if (this.getHighResolutionOutputSizeshNQ4ISI != null) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("transactionIdentifier: ");
            sb2.append(this.getHighResolutionOutputSizeshNQ4ISI);
            sb2.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
            str = sb2.toString();
        } else {
            str = "";
        }
        sb.append(str);
        sb.append("}\n");
        return sb.toString();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(3);
        aSN1EncodableVector.add(this.getHighSpeedVideoSizes);
        aSN1EncodableVector.add(this.Camera2StreamConfigurationMap);
        org.bouncycastle.asn1.x509.GeneralName generalName = this.getHighResolutionOutputSizeshNQ4ISI;
        if (generalName != null) {
            aSN1EncodableVector.add(generalName);
        }
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.x509.GeneralName getTransactionIdentifier() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public org.bouncycastle.asn1.dvcs.DVCSRequestInformation getRequestInformation() {
        return this.getHighSpeedVideoSizes;
    }

    public org.bouncycastle.asn1.dvcs.Data getData() {
        return this.Camera2StreamConfigurationMap;
    }

    public static org.bouncycastle.asn1.dvcs.DVCSRequest getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public static org.bouncycastle.asn1.dvcs.DVCSRequest getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.dvcs.DVCSRequest) {
            return (org.bouncycastle.asn1.dvcs.DVCSRequest) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.dvcs.DVCSRequest(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public DVCSRequest(org.bouncycastle.asn1.dvcs.DVCSRequestInformation dVCSRequestInformation, org.bouncycastle.asn1.dvcs.Data data, org.bouncycastle.asn1.x509.GeneralName generalName) {
        this.getHighSpeedVideoSizes = dVCSRequestInformation;
        this.Camera2StreamConfigurationMap = data;
        this.getHighResolutionOutputSizeshNQ4ISI = generalName;
    }

    public DVCSRequest(org.bouncycastle.asn1.dvcs.DVCSRequestInformation dVCSRequestInformation, org.bouncycastle.asn1.dvcs.Data data) {
        this(dVCSRequestInformation, data, null);
    }

    private DVCSRequest(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getHighSpeedVideoSizes = org.bouncycastle.asn1.dvcs.DVCSRequestInformation.getInstance(aSN1Sequence.getObjectAt(0));
        this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.dvcs.Data.getInstance(aSN1Sequence.getObjectAt(1));
        if (aSN1Sequence.size() > 2) {
            this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.x509.GeneralName.getInstance(aSN1Sequence.getObjectAt(2));
        }
    }
}
