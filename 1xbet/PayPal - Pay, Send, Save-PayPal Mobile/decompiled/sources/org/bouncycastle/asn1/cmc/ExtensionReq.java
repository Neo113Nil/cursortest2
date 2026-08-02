package org.bouncycastle.asn1.cmc;

/* loaded from: classes17.dex */
public class ExtensionReq extends org.bouncycastle.asn1.ASN1Object {
    private final org.bouncycastle.asn1.x509.Extension[] getHighSpeedVideoFpsRangesFor;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return new org.bouncycastle.asn1.DERSequence(this.getHighSpeedVideoFpsRangesFor);
    }

    public org.bouncycastle.asn1.x509.Extension[] getExtensions() {
        return org.bouncycastle.asn1.cmc.Utils.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRangesFor);
    }

    public static org.bouncycastle.asn1.cmc.ExtensionReq getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public static org.bouncycastle.asn1.cmc.ExtensionReq getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.cmc.ExtensionReq) {
            return (org.bouncycastle.asn1.cmc.ExtensionReq) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.cmc.ExtensionReq(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public ExtensionReq(org.bouncycastle.asn1.x509.Extension[] extensionArr) {
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.cmc.Utils.getHighSpeedVideoFpsRangesFor(extensionArr);
    }

    public ExtensionReq(org.bouncycastle.asn1.x509.Extension extension) {
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.asn1.x509.Extension[]{extension};
    }

    private ExtensionReq(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.asn1.x509.Extension[aSN1Sequence.size()];
        for (int i = 0; i != aSN1Sequence.size(); i++) {
            this.getHighSpeedVideoFpsRangesFor[i] = org.bouncycastle.asn1.x509.Extension.getInstance(aSN1Sequence.getObjectAt(i));
        }
    }
}
