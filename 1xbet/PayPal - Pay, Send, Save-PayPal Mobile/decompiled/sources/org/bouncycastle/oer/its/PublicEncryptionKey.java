package org.bouncycastle.oer.its;

/* loaded from: classes17.dex */
public class PublicEncryptionKey extends org.bouncycastle.asn1.ASN1Object {
    private final org.bouncycastle.oer.its.BasePublicEncryptionKey Camera2StreamConfigurationMap;
    private final org.bouncycastle.oer.its.SymmAlgorithm getHighResolutionOutputSizeshNQ4ISI;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return org.bouncycastle.oer.its.Utils.getHighSpeedVideoSizes(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap);
    }

    public org.bouncycastle.oer.its.SymmAlgorithm getSupportedSymmAlg() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public org.bouncycastle.oer.its.BasePublicEncryptionKey getBasePublicEncryptionKey() {
        return this.Camera2StreamConfigurationMap;
    }

    public static org.bouncycastle.oer.its.PublicEncryptionKey getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.oer.its.PublicEncryptionKey) {
            return (org.bouncycastle.oer.its.PublicEncryptionKey) obj;
        }
        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence = org.bouncycastle.asn1.ASN1Sequence.getInstance(obj);
        return new org.bouncycastle.oer.its.PublicEncryptionKey(org.bouncycastle.oer.its.SymmAlgorithm.getInstance((java.lang.Object) aSN1Sequence.getObjectAt(0)), org.bouncycastle.oer.its.BasePublicEncryptionKey.getInstance(aSN1Sequence.getObjectAt(1)));
    }

    public PublicEncryptionKey(org.bouncycastle.oer.its.SymmAlgorithm symmAlgorithm, org.bouncycastle.oer.its.BasePublicEncryptionKey basePublicEncryptionKey) {
        this.getHighResolutionOutputSizeshNQ4ISI = symmAlgorithm;
        this.Camera2StreamConfigurationMap = basePublicEncryptionKey;
    }
}
