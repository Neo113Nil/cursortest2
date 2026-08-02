package org.bouncycastle.tsp;

/* loaded from: classes17.dex */
public class TimeStampResponseGenerator {
    private java.util.Set Camera2StreamConfigurationMap;
    private java.util.Set getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    org.bouncycastle.asn1.ASN1EncodableVector getHighSpeedVideoSizes;
    private java.util.Set getHighSpeedVideoSizesFor;
    private org.bouncycastle.tsp.TimeStampTokenGenerator getOutputMinFrameDuration;

    public org.bouncycastle.tsp.TimeStampResponse generateFailResponse(int i, int i2, java.lang.String str) throws org.bouncycastle.tsp.TSPException {
        this.getHighSpeedVideoFpsRangesFor = i;
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector();
        this.getHighSpeedVideoSizes = aSN1EncodableVector;
        this.getHighSpeedVideoFpsRanges = i2 | this.getHighSpeedVideoFpsRanges;
        if (str != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERUTF8String(str));
        }
        try {
            return new org.bouncycastle.tsp.TimeStampResponse(new org.bouncycastle.asn1.tsp.TimeStampResp(Camera2StreamConfigurationMap(), null));
        } catch (java.io.IOException unused) {
            throw new org.bouncycastle.tsp.TSPException("created badly formatted response!");
        }
    }

    public org.bouncycastle.tsp.TimeStampResponse generateGrantedResponse(org.bouncycastle.tsp.TimeStampRequest timeStampRequest, java.math.BigInteger bigInteger, java.util.Date date, java.lang.String str, org.bouncycastle.asn1.x509.Extensions extensions) throws org.bouncycastle.tsp.TSPException {
        if (date == null) {
            throw new org.bouncycastle.tsp.TSPValidationException("The time source is not available.", 512);
        }
        timeStampRequest.validate(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizesFor, this.getHighResolutionOutputSizeshNQ4ISI);
        this.getHighSpeedVideoFpsRangesFor = 0;
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector();
        this.getHighSpeedVideoSizes = aSN1EncodableVector;
        if (str != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERUTF8String(str));
        }
        try {
            try {
                return new org.bouncycastle.tsp.TimeStampResponse(new org.bouncycastle.asn1.DLSequence(new org.bouncycastle.asn1.ASN1Encodable[]{Camera2StreamConfigurationMap().toASN1Primitive(), this.getOutputMinFrameDuration.generate(timeStampRequest, bigInteger, date, extensions).toCMSSignedData().toASN1Structure().toASN1Primitive()}));
            } catch (java.io.IOException unused) {
                throw new org.bouncycastle.tsp.TSPException("created badly formatted response!");
            }
        } catch (org.bouncycastle.tsp.TSPException e) {
            throw e;
        } catch (java.lang.Exception e2) {
            throw new org.bouncycastle.tsp.TSPException("Timestamp token received cannot be converted to ContentInfo", e2);
        }
    }

    public org.bouncycastle.tsp.TimeStampResponse generateRejectedResponse(java.lang.Exception exc) throws org.bouncycastle.tsp.TSPException {
        return generateFailResponse(2, exc instanceof org.bouncycastle.tsp.TSPValidationException ? ((org.bouncycastle.tsp.TSPValidationException) exc).getFailureCode() : 1073741824, exc.getMessage());
    }

    public org.bouncycastle.tsp.TimeStampResponse generateGrantedResponse(org.bouncycastle.tsp.TimeStampRequest timeStampRequest, java.math.BigInteger bigInteger, java.util.Date date, java.lang.String str) throws org.bouncycastle.tsp.TSPException {
        return generateGrantedResponse(timeStampRequest, bigInteger, date, str, null);
    }

    public org.bouncycastle.tsp.TimeStampResponse generateGrantedResponse(org.bouncycastle.tsp.TimeStampRequest timeStampRequest, java.math.BigInteger bigInteger, java.util.Date date) throws org.bouncycastle.tsp.TSPException {
        return generateGrantedResponse(timeStampRequest, bigInteger, date, null);
    }

    public org.bouncycastle.tsp.TimeStampResponse generate(org.bouncycastle.tsp.TimeStampRequest timeStampRequest, java.math.BigInteger bigInteger, java.util.Date date) throws org.bouncycastle.tsp.TSPException {
        try {
            return generateGrantedResponse(timeStampRequest, bigInteger, date, "Operation Okay");
        } catch (java.lang.Exception e) {
            return generateRejectedResponse(e);
        }
    }

    private org.bouncycastle.asn1.cmp.PKIStatusInfo Camera2StreamConfigurationMap() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector();
        aSN1EncodableVector.add(new org.bouncycastle.asn1.ASN1Integer(this.getHighSpeedVideoFpsRangesFor));
        if (this.getHighSpeedVideoSizes.size() > 0) {
            aSN1EncodableVector.add(org.bouncycastle.asn1.cmp.PKIFreeText.getInstance(new org.bouncycastle.asn1.DERSequence(this.getHighSpeedVideoSizes)));
        }
        if (this.getHighSpeedVideoFpsRanges != 0) {
            aSN1EncodableVector.add(new org.bouncycastle.tsp.TimeStampResponseGenerator.FailInfo(this.getHighSpeedVideoFpsRanges));
        }
        return org.bouncycastle.asn1.cmp.PKIStatusInfo.getInstance(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector));
    }

    private static java.util.Set Camera2StreamConfigurationMap(java.util.Set set) {
        if (set == null) {
            return set;
        }
        java.util.HashSet hashSet = new java.util.HashSet(set.size());
        for (java.lang.Object obj : set) {
            if (obj instanceof java.lang.String) {
                hashSet.add(new org.bouncycastle.asn1.ASN1ObjectIdentifier((java.lang.String) obj));
            } else {
                hashSet.add(obj);
            }
        }
        return hashSet;
    }

    public TimeStampResponseGenerator(org.bouncycastle.tsp.TimeStampTokenGenerator timeStampTokenGenerator, java.util.Set set, java.util.Set set2, java.util.Set set3) {
        this.getOutputMinFrameDuration = timeStampTokenGenerator;
        this.Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(set);
        this.getHighSpeedVideoSizesFor = Camera2StreamConfigurationMap(set2);
        this.getHighResolutionOutputSizeshNQ4ISI = Camera2StreamConfigurationMap(set3);
        this.getHighSpeedVideoSizes = new org.bouncycastle.asn1.ASN1EncodableVector();
    }

    class FailInfo extends org.bouncycastle.asn1.DERBitString {
        FailInfo(int i) {
            super(getBytes(i), getPadBits(i));
        }
    }

    public TimeStampResponseGenerator(org.bouncycastle.tsp.TimeStampTokenGenerator timeStampTokenGenerator, java.util.Set set, java.util.Set set2) {
        this(timeStampTokenGenerator, set, set2, null);
    }

    public TimeStampResponseGenerator(org.bouncycastle.tsp.TimeStampTokenGenerator timeStampTokenGenerator, java.util.Set set) {
        this(timeStampTokenGenerator, set, null, null);
    }
}
