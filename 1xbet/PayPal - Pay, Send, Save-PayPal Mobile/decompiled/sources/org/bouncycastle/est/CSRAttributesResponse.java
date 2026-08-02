package org.bouncycastle.est;

/* loaded from: classes17.dex */
public class CSRAttributesResponse implements org.bouncycastle.util.Encodable {
    private final org.bouncycastle.asn1.est.CsrAttrs Camera2StreamConfigurationMap;
    private final java.util.HashMap<org.bouncycastle.asn1.ASN1ObjectIdentifier, org.bouncycastle.asn1.est.AttrOrOID> getHighSpeedVideoSizes;

    public boolean isEmpty() {
        return this.Camera2StreamConfigurationMap.size() == 0;
    }

    public boolean isAttribute(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        if (this.getHighSpeedVideoSizes.containsKey(aSN1ObjectIdentifier)) {
            return !this.getHighSpeedVideoSizes.get(aSN1ObjectIdentifier).isOid();
        }
        return false;
    }

    public boolean hasRequirement(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return this.getHighSpeedVideoSizes.containsKey(aSN1ObjectIdentifier);
    }

    public java.util.Collection<org.bouncycastle.asn1.ASN1ObjectIdentifier> getRequirements() {
        return this.getHighSpeedVideoSizes.keySet();
    }

    @Override // org.bouncycastle.util.Encodable
    public byte[] getEncoded() throws java.io.IOException {
        return this.Camera2StreamConfigurationMap.getEncoded();
    }

    private static org.bouncycastle.asn1.est.CsrAttrs getHighSpeedVideoFpsRangesFor(byte[] bArr) throws org.bouncycastle.est.ESTException {
        try {
            return org.bouncycastle.asn1.est.CsrAttrs.getInstance(org.bouncycastle.asn1.ASN1Primitive.fromByteArray(bArr));
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("malformed data: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.est.ESTException(sb.toString(), e);
        }
    }

    public CSRAttributesResponse(byte[] bArr) throws org.bouncycastle.est.ESTException {
        this(getHighSpeedVideoFpsRangesFor(bArr));
    }

    public CSRAttributesResponse(org.bouncycastle.asn1.est.CsrAttrs csrAttrs) throws org.bouncycastle.est.ESTException {
        java.util.HashMap<org.bouncycastle.asn1.ASN1ObjectIdentifier, org.bouncycastle.asn1.est.AttrOrOID> hashMap;
        org.bouncycastle.asn1.ASN1ObjectIdentifier attrType;
        this.Camera2StreamConfigurationMap = csrAttrs;
        this.getHighSpeedVideoSizes = new java.util.HashMap<>(csrAttrs.size());
        org.bouncycastle.asn1.est.AttrOrOID[] attrOrOIDs = csrAttrs.getAttrOrOIDs();
        for (int i = 0; i != attrOrOIDs.length; i++) {
            org.bouncycastle.asn1.est.AttrOrOID attrOrOID = attrOrOIDs[i];
            if (attrOrOID.isOid()) {
                hashMap = this.getHighSpeedVideoSizes;
                attrType = attrOrOID.getOid();
            } else {
                hashMap = this.getHighSpeedVideoSizes;
                attrType = attrOrOID.getAttribute().getAttrType();
            }
            hashMap.put(attrType, attrOrOID);
        }
    }
}
