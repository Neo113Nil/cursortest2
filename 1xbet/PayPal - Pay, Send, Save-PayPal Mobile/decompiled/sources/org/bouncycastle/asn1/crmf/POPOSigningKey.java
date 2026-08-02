package org.bouncycastle.asn1.crmf;

/* loaded from: classes17.dex */
public class POPOSigningKey extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.crmf.POPOSigningKeyInput Camera2StreamConfigurationMap;
    private org.bouncycastle.asn1.ASN1BitString getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighSpeedVideoFpsRanges;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(3);
        org.bouncycastle.asn1.crmf.POPOSigningKeyInput pOPOSigningKeyInput = this.Camera2StreamConfigurationMap;
        if (pOPOSigningKeyInput != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(false, 0, (org.bouncycastle.asn1.ASN1Encodable) pOPOSigningKeyInput));
        }
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRanges);
        aSN1EncodableVector.add(this.getHighResolutionOutputSizeshNQ4ISI);
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.ASN1BitString getSignature() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public org.bouncycastle.asn1.crmf.POPOSigningKeyInput getPoposkInput() {
        return this.Camera2StreamConfigurationMap;
    }

    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getAlgorithmIdentifier() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public static org.bouncycastle.asn1.crmf.POPOSigningKey getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public static org.bouncycastle.asn1.crmf.POPOSigningKey getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.crmf.POPOSigningKey) {
            return (org.bouncycastle.asn1.crmf.POPOSigningKey) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.crmf.POPOSigningKey(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public POPOSigningKey(org.bouncycastle.asn1.crmf.POPOSigningKeyInput pOPOSigningKeyInput, org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, org.bouncycastle.asn1.ASN1BitString aSN1BitString) {
        this.Camera2StreamConfigurationMap = pOPOSigningKeyInput;
        this.getHighSpeedVideoFpsRanges = algorithmIdentifier;
        this.getHighResolutionOutputSizeshNQ4ISI = aSN1BitString;
    }

    private POPOSigningKey(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        int i = 0;
        if (aSN1Sequence.getObjectAt(0) instanceof org.bouncycastle.asn1.ASN1TaggedObject) {
            org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject = (org.bouncycastle.asn1.ASN1TaggedObject) aSN1Sequence.getObjectAt(0);
            if (aSN1TaggedObject.getTagNo() != 0) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Unknown POPOSigningKeyInput tag: ");
                sb.append(aSN1TaggedObject.getTagNo());
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
            this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.crmf.POPOSigningKeyInput.getInstance(aSN1TaggedObject.getObject());
            i = 1;
        }
        this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.x509.AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(i));
        this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.ASN1BitString.getInstance(aSN1Sequence.getObjectAt(i + 1));
    }
}
