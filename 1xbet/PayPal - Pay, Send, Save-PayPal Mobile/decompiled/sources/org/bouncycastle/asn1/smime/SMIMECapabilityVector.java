package org.bouncycastle.asn1.smime;

/* loaded from: classes17.dex */
public class SMIMECapabilityVector {
    private org.bouncycastle.asn1.ASN1EncodableVector getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.asn1.ASN1EncodableVector();

    public org.bouncycastle.asn1.ASN1EncodableVector toASN1EncodableVector() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public void addCapability(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(2);
        aSN1EncodableVector.add(aSN1ObjectIdentifier);
        aSN1EncodableVector.add(aSN1Encodable);
        this.getHighResolutionOutputSizeshNQ4ISI.add(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector));
    }

    public void addCapability(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, int i) {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(2);
        aSN1EncodableVector.add(aSN1ObjectIdentifier);
        aSN1EncodableVector.add(new org.bouncycastle.asn1.ASN1Integer(i));
        this.getHighResolutionOutputSizeshNQ4ISI.add(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector));
    }

    public void addCapability(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.getHighResolutionOutputSizeshNQ4ISI.add(new org.bouncycastle.asn1.DERSequence(aSN1ObjectIdentifier));
    }
}
