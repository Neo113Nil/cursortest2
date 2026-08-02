package org.bouncycastle.asn1.x509;

/* loaded from: classes17.dex */
public class V2TBSCertListGenerator {
    private static final org.bouncycastle.asn1.ASN1Sequence[] getHighSpeedVideoSizes = {Camera2StreamConfigurationMap(0), Camera2StreamConfigurationMap(1), Camera2StreamConfigurationMap(2), Camera2StreamConfigurationMap(3), Camera2StreamConfigurationMap(4), Camera2StreamConfigurationMap(5), Camera2StreamConfigurationMap(6), Camera2StreamConfigurationMap(7), Camera2StreamConfigurationMap(8), Camera2StreamConfigurationMap(9), Camera2StreamConfigurationMap(10)};
    private org.bouncycastle.asn1.x500.X500Name getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.asn1.x509.AlgorithmIdentifier getOutputFormats;
    private org.bouncycastle.asn1.x509.Time getOutputMinFrameDuration;
    private org.bouncycastle.asn1.ASN1Integer getInputFormats = new org.bouncycastle.asn1.ASN1Integer(1);
    private org.bouncycastle.asn1.x509.Time Camera2StreamConfigurationMap = null;
    private org.bouncycastle.asn1.x509.Extensions getHighSpeedVideoFpsRanges = null;
    private org.bouncycastle.asn1.ASN1EncodableVector getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.asn1.ASN1EncodableVector();

    public void setThisUpdate(org.bouncycastle.asn1.x509.Time time) {
        this.getOutputMinFrameDuration = time;
    }

    public void setThisUpdate(org.bouncycastle.asn1.ASN1UTCTime aSN1UTCTime) {
        this.getOutputMinFrameDuration = new org.bouncycastle.asn1.x509.Time(aSN1UTCTime);
    }

    public void setSignature(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier) {
        this.getOutputFormats = algorithmIdentifier;
    }

    public void setNextUpdate(org.bouncycastle.asn1.x509.Time time) {
        this.Camera2StreamConfigurationMap = time;
    }

    public void setNextUpdate(org.bouncycastle.asn1.ASN1UTCTime aSN1UTCTime) {
        this.Camera2StreamConfigurationMap = new org.bouncycastle.asn1.x509.Time(aSN1UTCTime);
    }

    public void setIssuer(org.bouncycastle.asn1.x509.X509Name x509Name) {
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.x500.X500Name.getInstance(x509Name.toASN1Primitive());
    }

    public void setIssuer(org.bouncycastle.asn1.x500.X500Name x500Name) {
        this.getHighSpeedVideoFpsRangesFor = x500Name;
    }

    public void setExtensions(org.bouncycastle.asn1.x509.X509Extensions x509Extensions) {
        setExtensions(org.bouncycastle.asn1.x509.Extensions.getInstance(x509Extensions));
    }

    public void setExtensions(org.bouncycastle.asn1.x509.Extensions extensions) {
        this.getHighSpeedVideoFpsRanges = extensions;
    }

    public org.bouncycastle.asn1.x509.TBSCertList generateTBSCertList() {
        if (this.getOutputFormats == null || this.getHighSpeedVideoFpsRangesFor == null || this.getOutputMinFrameDuration == null) {
            throw new java.lang.IllegalStateException("Not all mandatory fields set in V2 TBSCertList generator.");
        }
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(7);
        aSN1EncodableVector.add(this.getInputFormats);
        aSN1EncodableVector.add(this.getOutputFormats);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRangesFor);
        aSN1EncodableVector.add(this.getOutputMinFrameDuration);
        org.bouncycastle.asn1.x509.Time time = this.Camera2StreamConfigurationMap;
        if (time != null) {
            aSN1EncodableVector.add(time);
        }
        if (this.getHighResolutionOutputSizeshNQ4ISI.size() != 0) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERSequence(this.getHighResolutionOutputSizeshNQ4ISI));
        }
        org.bouncycastle.asn1.x509.Extensions extensions = this.getHighSpeedVideoFpsRanges;
        if (extensions != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(0, extensions));
        }
        return new org.bouncycastle.asn1.x509.TBSCertList(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector));
    }

    public void addCRLEntry(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getHighResolutionOutputSizeshNQ4ISI.add(aSN1Sequence);
    }

    public void addCRLEntry(org.bouncycastle.asn1.ASN1Integer aSN1Integer, org.bouncycastle.asn1.x509.Time time, org.bouncycastle.asn1.x509.Extensions extensions) {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(3);
        aSN1EncodableVector.add(aSN1Integer);
        aSN1EncodableVector.add(time);
        if (extensions != null) {
            aSN1EncodableVector.add(extensions);
        }
        addCRLEntry(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector));
    }

    public void addCRLEntry(org.bouncycastle.asn1.ASN1Integer aSN1Integer, org.bouncycastle.asn1.x509.Time time, int i, org.bouncycastle.asn1.ASN1GeneralizedTime aSN1GeneralizedTime) {
        org.bouncycastle.asn1.ASN1Sequence Camera2StreamConfigurationMap;
        if (i == 0) {
            if (aSN1GeneralizedTime != null) {
                getHighSpeedVideoSizes(aSN1Integer, time, new org.bouncycastle.asn1.DERSequence(getHighSpeedVideoFpsRanges(aSN1GeneralizedTime)));
                return;
            } else {
                addCRLEntry(aSN1Integer, time, (org.bouncycastle.asn1.x509.Extensions) null);
                return;
            }
        }
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(2);
        org.bouncycastle.asn1.ASN1Sequence[] aSN1SequenceArr = getHighSpeedVideoSizes;
        if (i >= aSN1SequenceArr.length) {
            Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(i);
        } else {
            if (i < 0) {
                throw new java.lang.IllegalArgumentException("invalid reason value: ".concat(java.lang.String.valueOf(i)));
            }
            Camera2StreamConfigurationMap = aSN1SequenceArr[i];
        }
        aSN1EncodableVector.add(Camera2StreamConfigurationMap);
        if (aSN1GeneralizedTime != null) {
            aSN1EncodableVector.add(getHighSpeedVideoFpsRanges(aSN1GeneralizedTime));
        }
        getHighSpeedVideoSizes(aSN1Integer, time, new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector));
    }

    public void addCRLEntry(org.bouncycastle.asn1.ASN1Integer aSN1Integer, org.bouncycastle.asn1.x509.Time time, int i) {
        addCRLEntry(aSN1Integer, time, i, null);
    }

    public void addCRLEntry(org.bouncycastle.asn1.ASN1Integer aSN1Integer, org.bouncycastle.asn1.ASN1UTCTime aSN1UTCTime, int i) {
        addCRLEntry(aSN1Integer, new org.bouncycastle.asn1.x509.Time(aSN1UTCTime), i);
    }

    private void getHighSpeedVideoSizes(org.bouncycastle.asn1.ASN1Integer aSN1Integer, org.bouncycastle.asn1.x509.Time time, org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(3);
        aSN1EncodableVector.add(aSN1Integer);
        aSN1EncodableVector.add(time);
        aSN1EncodableVector.add(aSN1Sequence);
        addCRLEntry(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector));
    }

    private static org.bouncycastle.asn1.ASN1Sequence Camera2StreamConfigurationMap(int i) {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(2);
        org.bouncycastle.asn1.x509.CRLReason lookup = org.bouncycastle.asn1.x509.CRLReason.lookup(i);
        try {
            aSN1EncodableVector.add(org.bouncycastle.asn1.x509.Extension.reasonCode);
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DEROctetString(lookup.getEncoded()));
            return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
        } catch (java.io.IOException e) {
            throw new java.lang.IllegalArgumentException("error encoding reason: ".concat(java.lang.String.valueOf(e)));
        }
    }

    private static org.bouncycastle.asn1.ASN1Sequence getHighSpeedVideoFpsRanges(org.bouncycastle.asn1.ASN1GeneralizedTime aSN1GeneralizedTime) {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(2);
        try {
            aSN1EncodableVector.add(org.bouncycastle.asn1.x509.Extension.invalidityDate);
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DEROctetString(aSN1GeneralizedTime.getEncoded()));
            return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
        } catch (java.io.IOException e) {
            throw new java.lang.IllegalArgumentException("error encoding reason: ".concat(java.lang.String.valueOf(e)));
        }
    }
}
