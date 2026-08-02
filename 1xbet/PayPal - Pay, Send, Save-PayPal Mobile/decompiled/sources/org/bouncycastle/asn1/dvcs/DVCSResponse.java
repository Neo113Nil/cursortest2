package org.bouncycastle.asn1.dvcs;

/* loaded from: classes17.dex */
public class DVCSResponse extends org.bouncycastle.asn1.ASN1Object implements org.bouncycastle.asn1.ASN1Choice {
    private org.bouncycastle.asn1.dvcs.DVCSErrorNotice Camera2StreamConfigurationMap;
    private org.bouncycastle.asn1.dvcs.DVCSCertInfo getHighSpeedVideoSizes;

    public java.lang.String toString() {
        java.lang.StringBuilder sb;
        java.lang.Object obj;
        if (this.getHighSpeedVideoSizes != null) {
            sb = new java.lang.StringBuilder("DVCSResponse {\ndvCertInfo: ");
            obj = this.getHighSpeedVideoSizes;
        } else {
            sb = new java.lang.StringBuilder("DVCSResponse {\ndvErrorNote: ");
            obj = this.Camera2StreamConfigurationMap;
        }
        sb.append(obj.toString());
        sb.append("}\n");
        return sb.toString();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.dvcs.DVCSCertInfo dVCSCertInfo = this.getHighSpeedVideoSizes;
        return dVCSCertInfo != null ? dVCSCertInfo.toASN1Primitive() : new org.bouncycastle.asn1.DERTaggedObject(false, 0, (org.bouncycastle.asn1.ASN1Encodable) this.Camera2StreamConfigurationMap);
    }

    public org.bouncycastle.asn1.dvcs.DVCSErrorNotice getErrorNotice() {
        return this.Camera2StreamConfigurationMap;
    }

    public org.bouncycastle.asn1.dvcs.DVCSCertInfo getCertInfo() {
        return this.getHighSpeedVideoSizes;
    }

    public static org.bouncycastle.asn1.dvcs.DVCSResponse getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public static org.bouncycastle.asn1.dvcs.DVCSResponse getInstance(java.lang.Object obj) {
        if (obj == null || (obj instanceof org.bouncycastle.asn1.dvcs.DVCSResponse)) {
            return (org.bouncycastle.asn1.dvcs.DVCSResponse) obj;
        }
        if (obj instanceof byte[]) {
            try {
                return getInstance(org.bouncycastle.asn1.ASN1Primitive.fromByteArray((byte[]) obj));
            } catch (java.io.IOException e) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("failed to construct sequence from byte[]: ");
                sb.append(e.getMessage());
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
        }
        if (obj instanceof org.bouncycastle.asn1.ASN1Sequence) {
            return new org.bouncycastle.asn1.dvcs.DVCSResponse(org.bouncycastle.asn1.dvcs.DVCSCertInfo.getInstance(obj));
        }
        if (obj instanceof org.bouncycastle.asn1.ASN1TaggedObject) {
            return new org.bouncycastle.asn1.dvcs.DVCSResponse(org.bouncycastle.asn1.dvcs.DVCSErrorNotice.getInstance(org.bouncycastle.asn1.ASN1TaggedObject.getInstance(obj), false));
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Couldn't convert from object to DVCSResponse: ");
        sb2.append(obj.getClass().getName());
        throw new java.lang.IllegalArgumentException(sb2.toString());
    }

    public DVCSResponse(org.bouncycastle.asn1.dvcs.DVCSErrorNotice dVCSErrorNotice) {
        this.Camera2StreamConfigurationMap = dVCSErrorNotice;
    }

    public DVCSResponse(org.bouncycastle.asn1.dvcs.DVCSCertInfo dVCSCertInfo) {
        this.getHighSpeedVideoSizes = dVCSCertInfo;
    }
}
