package org.bouncycastle.asn1.dvcs;

/* loaded from: classes17.dex */
public class DVCSRequestInformationBuilder {
    private org.bouncycastle.asn1.x509.GeneralNames Camera2StreamConfigurationMap;
    private java.math.BigInteger getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.asn1.x509.GeneralNames getHighSpeedVideoFpsRanges;
    private org.bouncycastle.asn1.dvcs.DVCSRequestInformation getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.asn1.x509.Extensions getHighSpeedVideoSizes;
    private int getHighSpeedVideoSizesFor;
    private final org.bouncycastle.asn1.dvcs.ServiceType getInputFormats;
    private org.bouncycastle.asn1.x509.PolicyInformation getInputSizeshNQ4ISI;
    private org.bouncycastle.asn1.dvcs.DVCSTime getOutputFormats;
    private org.bouncycastle.asn1.x509.GeneralNames getOutputMinFrameDuration;

    public void setVersion(int i) {
        if (this.getHighSpeedVideoFpsRangesFor != null) {
            throw new java.lang.IllegalStateException("cannot change version in existing DVCSRequestInformation");
        }
        this.getHighSpeedVideoSizesFor = i;
    }

    public void setRequester(org.bouncycastle.asn1.x509.GeneralNames generalNames) {
        this.getOutputMinFrameDuration = generalNames;
    }

    public void setRequester(org.bouncycastle.asn1.x509.GeneralName generalName) {
        setRequester(new org.bouncycastle.asn1.x509.GeneralNames(generalName));
    }

    public void setRequestTime(org.bouncycastle.asn1.dvcs.DVCSTime dVCSTime) {
        if (this.getHighSpeedVideoFpsRangesFor != null) {
            throw new java.lang.IllegalStateException("cannot change request time in existing DVCSRequestInformation");
        }
        this.getOutputFormats = dVCSTime;
    }

    public void setRequestPolicy(org.bouncycastle.asn1.x509.PolicyInformation policyInformation) {
        if (this.getHighSpeedVideoFpsRangesFor != null) {
            throw new java.lang.IllegalStateException("cannot change request policy in existing DVCSRequestInformation");
        }
        this.getInputSizeshNQ4ISI = policyInformation;
    }

    public void setNonce(java.math.BigInteger bigInteger) {
        org.bouncycastle.asn1.dvcs.DVCSRequestInformation dVCSRequestInformation = this.getHighSpeedVideoFpsRangesFor;
        if (dVCSRequestInformation != null) {
            if (dVCSRequestInformation.getNonce() == null) {
                this.getHighResolutionOutputSizeshNQ4ISI = bigInteger;
            } else {
                byte[] byteArray = this.getHighSpeedVideoFpsRangesFor.getNonce().toByteArray();
                byte[] asUnsignedByteArray = org.bouncycastle.util.BigIntegers.asUnsignedByteArray(bigInteger);
                byte[] bArr = new byte[byteArray.length + asUnsignedByteArray.length];
                java.lang.System.arraycopy(byteArray, 0, bArr, 0, byteArray.length);
                java.lang.System.arraycopy(asUnsignedByteArray, 0, bArr, byteArray.length, asUnsignedByteArray.length);
                this.getHighResolutionOutputSizeshNQ4ISI = new java.math.BigInteger(bArr);
            }
        }
        this.getHighResolutionOutputSizeshNQ4ISI = bigInteger;
    }

    public void setExtensions(org.bouncycastle.asn1.x509.Extensions extensions) {
        if (this.getHighSpeedVideoFpsRangesFor != null) {
            throw new java.lang.IllegalStateException("cannot change extensions in existing DVCSRequestInformation");
        }
        this.getHighSpeedVideoSizes = extensions;
    }

    public void setDataLocations(org.bouncycastle.asn1.x509.GeneralNames generalNames) {
        this.Camera2StreamConfigurationMap = generalNames;
    }

    public void setDataLocations(org.bouncycastle.asn1.x509.GeneralName generalName) {
        setDataLocations(new org.bouncycastle.asn1.x509.GeneralNames(generalName));
    }

    public void setDVCS(org.bouncycastle.asn1.x509.GeneralNames generalNames) {
        this.getHighSpeedVideoFpsRanges = generalNames;
    }

    public void setDVCS(org.bouncycastle.asn1.x509.GeneralName generalName) {
        setDVCS(new org.bouncycastle.asn1.x509.GeneralNames(generalName));
    }

    public org.bouncycastle.asn1.dvcs.DVCSRequestInformation build() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(9);
        if (this.getHighSpeedVideoSizesFor != 1) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.ASN1Integer(this.getHighSpeedVideoSizesFor));
        }
        aSN1EncodableVector.add(this.getInputFormats);
        if (this.getHighResolutionOutputSizeshNQ4ISI != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.ASN1Integer(this.getHighResolutionOutputSizeshNQ4ISI));
        }
        org.bouncycastle.asn1.dvcs.DVCSTime dVCSTime = this.getOutputFormats;
        if (dVCSTime != null) {
            aSN1EncodableVector.add(dVCSTime);
        }
        int[] iArr = {0, 1, 2, 3, 4};
        org.bouncycastle.asn1.ASN1Encodable[] aSN1EncodableArr = {this.getOutputMinFrameDuration, this.getInputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes};
        for (int i = 0; i < 5; i++) {
            int i2 = iArr[i];
            org.bouncycastle.asn1.ASN1Encodable aSN1Encodable = aSN1EncodableArr[i];
            if (aSN1Encodable != null) {
                aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(false, i2, aSN1Encodable));
            }
        }
        return org.bouncycastle.asn1.dvcs.DVCSRequestInformation.getInstance(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector));
    }

    public DVCSRequestInformationBuilder(org.bouncycastle.asn1.dvcs.ServiceType serviceType) {
        this.getHighSpeedVideoSizesFor = 1;
        this.getInputFormats = serviceType;
    }

    public DVCSRequestInformationBuilder(org.bouncycastle.asn1.dvcs.DVCSRequestInformation dVCSRequestInformation) {
        this.getHighSpeedVideoSizesFor = 1;
        this.getHighSpeedVideoFpsRangesFor = dVCSRequestInformation;
        this.getInputFormats = dVCSRequestInformation.getService();
        this.getHighSpeedVideoSizesFor = dVCSRequestInformation.getVersion();
        this.getHighResolutionOutputSizeshNQ4ISI = dVCSRequestInformation.getNonce();
        this.getOutputFormats = dVCSRequestInformation.getRequestTime();
        this.getInputSizeshNQ4ISI = dVCSRequestInformation.getRequestPolicy();
        this.getHighSpeedVideoFpsRanges = dVCSRequestInformation.getDVCS();
        this.Camera2StreamConfigurationMap = dVCSRequestInformation.getDataLocations();
    }
}
