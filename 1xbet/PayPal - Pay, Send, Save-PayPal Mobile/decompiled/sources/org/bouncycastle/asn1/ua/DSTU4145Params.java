package org.bouncycastle.asn1.ua;

/* loaded from: classes17.dex */
public class DSTU4145Params extends org.bouncycastle.asn1.ASN1Object {
    private static final byte[] Camera2StreamConfigurationMap = {-87, -42, -21, 69, -15, 60, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, -126, Byte.MIN_VALUE, -60, -106, 123, 35, com.google.common.base.Ascii.US, 94, -83, -10, 88, -21, -92, com.visa.cbp.getEncExpo.startTransaction, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, 41, com.google.common.base.Ascii.GS, 56, -39, 107, com.visa.cbp.getEncExpo.onUnminimized, 37, -54, 78, com.google.common.base.Ascii.ETB, -8, -23, 114, 13, -58, com.google.common.base.Ascii.NAK, -76, 58, 40, -105, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, com.google.common.base.Ascii.VT, -63, -34, -93, 100, 56, -75, 100, -22, 44, com.google.common.base.Ascii.ETB, -97, -48, 18, 62, 109, -72, -6, -59, 121, 4};
    private org.bouncycastle.asn1.ua.DSTU4145ECBinary getHighSpeedVideoFpsRanges;
    private org.bouncycastle.asn1.ASN1ObjectIdentifier getHighSpeedVideoFpsRangesFor;
    private byte[] getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(2);
        org.bouncycastle.asn1.ASN1Encodable aSN1Encodable = this.getHighSpeedVideoFpsRangesFor;
        if (aSN1Encodable == null) {
            aSN1Encodable = this.getHighSpeedVideoFpsRanges;
        }
        aSN1EncodableVector.add(aSN1Encodable);
        if (!org.bouncycastle.util.Arrays.areEqual(this.getHighSpeedVideoSizes, Camera2StreamConfigurationMap)) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DEROctetString(this.getHighSpeedVideoSizes));
        }
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public boolean isNamedCurve() {
        return this.getHighSpeedVideoFpsRangesFor != null;
    }

    public org.bouncycastle.asn1.ASN1ObjectIdentifier getNamedCurve() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public org.bouncycastle.asn1.ua.DSTU4145ECBinary getECBinary() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public byte[] getDKE() {
        return org.bouncycastle.util.Arrays.clone(this.getHighSpeedVideoSizes);
    }

    public static org.bouncycastle.asn1.ua.DSTU4145Params getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.ua.DSTU4145Params) {
            return (org.bouncycastle.asn1.ua.DSTU4145Params) obj;
        }
        if (obj == null) {
            throw new java.lang.IllegalArgumentException("object parse error");
        }
        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence = org.bouncycastle.asn1.ASN1Sequence.getInstance(obj);
        org.bouncycastle.asn1.ua.DSTU4145Params dSTU4145Params = aSN1Sequence.getObjectAt(0) instanceof org.bouncycastle.asn1.ASN1ObjectIdentifier ? new org.bouncycastle.asn1.ua.DSTU4145Params(org.bouncycastle.asn1.ASN1ObjectIdentifier.getInstance(aSN1Sequence.getObjectAt(0))) : new org.bouncycastle.asn1.ua.DSTU4145Params(org.bouncycastle.asn1.ua.DSTU4145ECBinary.getInstance(aSN1Sequence.getObjectAt(0)));
        if (aSN1Sequence.size() == 2) {
            byte[] octets = org.bouncycastle.asn1.ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(1)).getOctets();
            dSTU4145Params.getHighSpeedVideoSizes = octets;
            if (octets.length != Camera2StreamConfigurationMap.length) {
                throw new java.lang.IllegalArgumentException("object parse error");
            }
        }
        return dSTU4145Params;
    }

    public static byte[] getDefaultDKE() {
        return org.bouncycastle.util.Arrays.clone(Camera2StreamConfigurationMap);
    }

    public DSTU4145Params(org.bouncycastle.asn1.ua.DSTU4145ECBinary dSTU4145ECBinary) {
        this.getHighSpeedVideoSizes = Camera2StreamConfigurationMap;
        this.getHighSpeedVideoFpsRanges = dSTU4145ECBinary;
    }

    public DSTU4145Params(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, byte[] bArr) {
        this.getHighSpeedVideoSizes = Camera2StreamConfigurationMap;
        this.getHighSpeedVideoFpsRangesFor = aSN1ObjectIdentifier;
        this.getHighSpeedVideoSizes = org.bouncycastle.util.Arrays.clone(bArr);
    }

    public DSTU4145Params(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.getHighSpeedVideoSizes = Camera2StreamConfigurationMap;
        this.getHighSpeedVideoFpsRangesFor = aSN1ObjectIdentifier;
    }
}
