package org.bouncycastle.asn1.x509.qualified;

/* loaded from: classes17.dex */
public class QCStatement extends org.bouncycastle.asn1.ASN1Object implements org.bouncycastle.asn1.x509.qualified.ETSIQCObjectIdentifiers, org.bouncycastle.asn1.x509.qualified.RFC3739QCObjectIdentifiers {
    org.bouncycastle.asn1.ASN1ObjectIdentifier getHighResolutionOutputSizeshNQ4ISI;
    org.bouncycastle.asn1.ASN1Encodable getHighSpeedVideoFpsRangesFor;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.getHighResolutionOutputSizeshNQ4ISI);
        org.bouncycastle.asn1.ASN1Encodable aSN1Encodable = this.getHighSpeedVideoFpsRangesFor;
        if (aSN1Encodable != null) {
            aSN1EncodableVector.add(aSN1Encodable);
        }
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.ASN1Encodable getStatementInfo() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public org.bouncycastle.asn1.ASN1ObjectIdentifier getStatementId() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static org.bouncycastle.asn1.x509.qualified.QCStatement getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.x509.qualified.QCStatement) {
            return (org.bouncycastle.asn1.x509.qualified.QCStatement) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.x509.qualified.QCStatement(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    private QCStatement(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        java.util.Enumeration objects = aSN1Sequence.getObjects();
        this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.ASN1ObjectIdentifier.getInstance(objects.nextElement());
        if (objects.hasMoreElements()) {
            this.getHighSpeedVideoFpsRangesFor = (org.bouncycastle.asn1.ASN1Encodable) objects.nextElement();
        }
    }

    public QCStatement(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
        this.getHighResolutionOutputSizeshNQ4ISI = aSN1ObjectIdentifier;
        this.getHighSpeedVideoFpsRangesFor = aSN1Encodable;
    }

    public QCStatement(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.getHighResolutionOutputSizeshNQ4ISI = aSN1ObjectIdentifier;
        this.getHighSpeedVideoFpsRangesFor = null;
    }
}
