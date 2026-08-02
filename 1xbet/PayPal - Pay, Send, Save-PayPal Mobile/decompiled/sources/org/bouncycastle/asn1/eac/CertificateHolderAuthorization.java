package org.bouncycastle.asn1.eac;

/* loaded from: classes17.dex */
public class CertificateHolderAuthorization extends org.bouncycastle.asn1.ASN1Object {
    public static final int CVCA = 192;
    public static final int DV_DOMESTIC = 128;
    public static final int DV_FOREIGN = 64;
    public static final int IS = 0;
    public static final int RADG3 = 1;
    public static final int RADG4 = 2;
    org.bouncycastle.asn1.ASN1ApplicationSpecific Camera2StreamConfigurationMap;
    org.bouncycastle.asn1.ASN1ObjectIdentifier getHighResolutionOutputSizeshNQ4ISI;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier id_role_EAC = org.bouncycastle.asn1.eac.EACObjectIdentifiers.bsi_de.branch("3.1.2.1");
    static java.util.Hashtable getHighSpeedVideoFpsRangesFor = new java.util.Hashtable();
    static org.bouncycastle.asn1.eac.BidirectionalMap getHighSpeedVideoFpsRanges = new org.bouncycastle.asn1.eac.BidirectionalMap();
    static java.util.Hashtable getHighSpeedVideoSizes = new java.util.Hashtable();

    public CertificateHolderAuthorization(org.bouncycastle.asn1.ASN1ApplicationSpecific aSN1ApplicationSpecific) throws java.io.IOException {
        if (aSN1ApplicationSpecific.getApplicationTag() == 76) {
            org.bouncycastle.asn1.ASN1InputStream aSN1InputStream = new org.bouncycastle.asn1.ASN1InputStream(aSN1ApplicationSpecific.getContents());
            org.bouncycastle.asn1.ASN1Primitive readObject = aSN1InputStream.readObject();
            if (!(readObject instanceof org.bouncycastle.asn1.ASN1ObjectIdentifier)) {
                throw new java.lang.IllegalArgumentException("no Oid in CerticateHolderAuthorization");
            }
            this.getHighResolutionOutputSizeshNQ4ISI = (org.bouncycastle.asn1.ASN1ObjectIdentifier) readObject;
            org.bouncycastle.asn1.ASN1Primitive readObject2 = aSN1InputStream.readObject();
            if (!(readObject2 instanceof org.bouncycastle.asn1.ASN1ApplicationSpecific)) {
                throw new java.lang.IllegalArgumentException("No access rights in CerticateHolderAuthorization");
            }
            this.Camera2StreamConfigurationMap = (org.bouncycastle.asn1.ASN1ApplicationSpecific) readObject2;
        }
    }

    public CertificateHolderAuthorization(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, int i) throws java.io.IOException {
        this.getHighResolutionOutputSizeshNQ4ISI = aSN1ObjectIdentifier;
        this.Camera2StreamConfigurationMap = new org.bouncycastle.asn1.DERApplicationSpecific(19, new byte[]{(byte) i});
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.getHighResolutionOutputSizeshNQ4ISI);
        aSN1EncodableVector.add(this.Camera2StreamConfigurationMap);
        return new org.bouncycastle.asn1.DERApplicationSpecific(76, aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.ASN1ObjectIdentifier getOid() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public int getAccessRights() {
        return this.Camera2StreamConfigurationMap.getContents()[0] & 255;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static java.lang.String getRoleDescription(int i) {
        return (java.lang.String) getHighSpeedVideoFpsRanges.get(org.bouncycastle.util.Integers.valueOf(i));
    }

    public static int getFlag(java.lang.String str) {
        java.lang.Integer num = (java.lang.Integer) getHighSpeedVideoFpsRanges.getReverse(str);
        if (num != null) {
            return num.intValue();
        }
        throw new java.lang.IllegalArgumentException("Unknown value ".concat(java.lang.String.valueOf(str)));
    }

    static {
        getHighSpeedVideoFpsRangesFor.put(org.bouncycastle.util.Integers.valueOf(2), "RADG4");
        getHighSpeedVideoFpsRangesFor.put(org.bouncycastle.util.Integers.valueOf(1), "RADG3");
        getHighSpeedVideoFpsRanges.put(org.bouncycastle.util.Integers.valueOf(192), "CVCA");
        getHighSpeedVideoFpsRanges.put(org.bouncycastle.util.Integers.valueOf(128), "DV_DOMESTIC");
        getHighSpeedVideoFpsRanges.put(org.bouncycastle.util.Integers.valueOf(64), "DV_FOREIGN");
        getHighSpeedVideoFpsRanges.put(org.bouncycastle.util.Integers.valueOf(0), "IS");
    }
}
