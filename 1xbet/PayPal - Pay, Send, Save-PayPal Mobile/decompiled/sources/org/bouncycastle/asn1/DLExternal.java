package org.bouncycastle.asn1;

/* loaded from: classes17.dex */
public class DLExternal extends org.bouncycastle.asn1.ASN1External {
    @Override // org.bouncycastle.asn1.ASN1External, org.bouncycastle.asn1.ASN1Primitive
    final org.bouncycastle.asn1.ASN1Primitive Camera2StreamConfigurationMap() {
        return this;
    }

    @Override // org.bouncycastle.asn1.ASN1External
    final org.bouncycastle.asn1.ASN1Sequence getHighSpeedVideoSizes() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(4);
        if (this.Camera2StreamConfigurationMap != null) {
            aSN1EncodableVector.add(this.Camera2StreamConfigurationMap);
        }
        if (this.getOutputMinFrameDuration != null) {
            aSN1EncodableVector.add(this.getOutputMinFrameDuration);
        }
        if (this.getHighSpeedVideoFpsRangesFor != null) {
            aSN1EncodableVector.add(this.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap());
        }
        aSN1EncodableVector.add(new org.bouncycastle.asn1.DLTaggedObject(this.getHighResolutionOutputSizeshNQ4ISI == 0, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes));
        return new org.bouncycastle.asn1.DLSequence(aSN1EncodableVector);
    }

    public DLExternal(org.bouncycastle.asn1.DLSequence dLSequence) {
        super(dLSequence);
    }

    public DLExternal(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, org.bouncycastle.asn1.ASN1Integer aSN1Integer, org.bouncycastle.asn1.ASN1Primitive aSN1Primitive, org.bouncycastle.asn1.DERTaggedObject dERTaggedObject) {
        super(aSN1ObjectIdentifier, aSN1Integer, aSN1Primitive, dERTaggedObject);
    }

    public DLExternal(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, org.bouncycastle.asn1.ASN1Integer aSN1Integer, org.bouncycastle.asn1.ASN1Primitive aSN1Primitive, int i, org.bouncycastle.asn1.ASN1Primitive aSN1Primitive2) {
        super(aSN1ObjectIdentifier, aSN1Integer, aSN1Primitive, i, aSN1Primitive2);
    }

    public DLExternal(org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector) {
        this(org.bouncycastle.asn1.DLFactory.getHighResolutionOutputSizeshNQ4ISI(aSN1EncodableVector));
    }
}
