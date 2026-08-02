package org.bouncycastle.asn1.cmc;

/* loaded from: classes17.dex */
public class BodyPartReference extends org.bouncycastle.asn1.ASN1Object implements org.bouncycastle.asn1.ASN1Choice {
    private final org.bouncycastle.asn1.cmc.BodyPartID getHighResolutionOutputSizeshNQ4ISI;
    private final org.bouncycastle.asn1.cmc.BodyPartPath getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.cmc.BodyPartID bodyPartID = this.getHighResolutionOutputSizeshNQ4ISI;
        return bodyPartID != null ? bodyPartID.toASN1Primitive() : this.getHighSpeedVideoSizes.toASN1Primitive();
    }

    public boolean isBodyPartID() {
        return this.getHighResolutionOutputSizeshNQ4ISI != null;
    }

    public org.bouncycastle.asn1.cmc.BodyPartPath getBodyPartPath() {
        return this.getHighSpeedVideoSizes;
    }

    public org.bouncycastle.asn1.cmc.BodyPartID getBodyPartID() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static org.bouncycastle.asn1.cmc.BodyPartReference getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.cmc.BodyPartReference) {
            return (org.bouncycastle.asn1.cmc.BodyPartReference) obj;
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof org.bouncycastle.asn1.ASN1Encodable) {
            org.bouncycastle.asn1.ASN1Primitive aSN1Primitive = ((org.bouncycastle.asn1.ASN1Encodable) obj).toASN1Primitive();
            if (aSN1Primitive instanceof org.bouncycastle.asn1.ASN1Integer) {
                return new org.bouncycastle.asn1.cmc.BodyPartReference(org.bouncycastle.asn1.cmc.BodyPartID.getInstance(aSN1Primitive));
            }
            if (aSN1Primitive instanceof org.bouncycastle.asn1.ASN1Sequence) {
                return new org.bouncycastle.asn1.cmc.BodyPartReference(org.bouncycastle.asn1.cmc.BodyPartPath.getInstance(aSN1Primitive));
            }
        }
        if (obj instanceof byte[]) {
            try {
                return getInstance(org.bouncycastle.asn1.ASN1Primitive.fromByteArray((byte[]) obj));
            } catch (java.io.IOException unused) {
                throw new java.lang.IllegalArgumentException("unknown encoding in getInstance()");
            }
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("unknown object in getInstance(): ");
        sb.append(obj.getClass().getName());
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public BodyPartReference(org.bouncycastle.asn1.cmc.BodyPartPath bodyPartPath) {
        this.getHighResolutionOutputSizeshNQ4ISI = null;
        this.getHighSpeedVideoSizes = bodyPartPath;
    }

    public BodyPartReference(org.bouncycastle.asn1.cmc.BodyPartID bodyPartID) {
        this.getHighResolutionOutputSizeshNQ4ISI = bodyPartID;
        this.getHighSpeedVideoSizes = null;
    }
}
