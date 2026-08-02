package org.bouncycastle.asn1;

/* loaded from: classes17.dex */
class LazyEncodedSequence extends org.bouncycastle.asn1.ASN1Sequence {
    private byte[] getHighResolutionOutputSizeshNQ4ISI;

    @Override // org.bouncycastle.asn1.ASN1Sequence, org.bouncycastle.asn1.ASN1Primitive
    final org.bouncycastle.asn1.ASN1Primitive Camera2StreamConfigurationMap() {
        getOutputStallDurationlomOqCM();
        return super.Camera2StreamConfigurationMap();
    }

    @Override // org.bouncycastle.asn1.ASN1Sequence, org.bouncycastle.asn1.ASN1Primitive
    final org.bouncycastle.asn1.ASN1Primitive getHighSpeedVideoFpsRangesFor() {
        getOutputStallDurationlomOqCM();
        return super.getHighSpeedVideoFpsRangesFor();
    }

    @Override // org.bouncycastle.asn1.ASN1Sequence
    final org.bouncycastle.asn1.ASN1Encodable[] getOutputMinFrameDuration() {
        getOutputStallDurationlomOqCM();
        return super.getOutputMinFrameDuration();
    }

    @Override // org.bouncycastle.asn1.ASN1Sequence
    public org.bouncycastle.asn1.ASN1Encodable[] toArray() {
        getOutputStallDurationlomOqCM();
        return super.toArray();
    }

    @Override // org.bouncycastle.asn1.ASN1Sequence
    final org.bouncycastle.asn1.ASN1Set getInputSizeshNQ4ISI() {
        return ((org.bouncycastle.asn1.ASN1Sequence) Camera2StreamConfigurationMap()).getInputSizeshNQ4ISI();
    }

    @Override // org.bouncycastle.asn1.ASN1Sequence
    final org.bouncycastle.asn1.ASN1OctetString getOutputFormats() {
        return ((org.bouncycastle.asn1.ASN1Sequence) Camera2StreamConfigurationMap()).getOutputFormats();
    }

    @Override // org.bouncycastle.asn1.ASN1Sequence
    final org.bouncycastle.asn1.ASN1External getInputFormats() {
        return ((org.bouncycastle.asn1.ASN1Sequence) Camera2StreamConfigurationMap()).getInputFormats();
    }

    @Override // org.bouncycastle.asn1.ASN1Sequence
    final org.bouncycastle.asn1.ASN1BitString getHighSpeedVideoSizesFor() {
        return ((org.bouncycastle.asn1.ASN1Sequence) Camera2StreamConfigurationMap()).getHighSpeedVideoSizesFor();
    }

    @Override // org.bouncycastle.asn1.ASN1Sequence
    public int size() {
        getOutputStallDurationlomOqCM();
        return super.size();
    }

    @Override // org.bouncycastle.asn1.ASN1Sequence, org.bouncycastle.util.Iterable, java.lang.Iterable
    public java.util.Iterator<org.bouncycastle.asn1.ASN1Encodable> iterator() {
        getOutputStallDurationlomOqCM();
        return super.iterator();
    }

    @Override // org.bouncycastle.asn1.ASN1Sequence, org.bouncycastle.asn1.ASN1Primitive, org.bouncycastle.asn1.ASN1Object
    public int hashCode() {
        getOutputStallDurationlomOqCM();
        return super.hashCode();
    }

    @Override // org.bouncycastle.asn1.ASN1Sequence
    public java.util.Enumeration getObjects() {
        byte[] outputSizeshNQ4ISI = getOutputSizeshNQ4ISI();
        return outputSizeshNQ4ISI != null ? new org.bouncycastle.asn1.LazyConstructionEnumeration(outputSizeshNQ4ISI) : super.getObjects();
    }

    @Override // org.bouncycastle.asn1.ASN1Sequence
    public org.bouncycastle.asn1.ASN1Encodable getObjectAt(int i) {
        getOutputStallDurationlomOqCM();
        return super.getObjectAt(i);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    final int getHighSpeedVideoSizes(boolean z) throws java.io.IOException {
        byte[] outputSizeshNQ4ISI = getOutputSizeshNQ4ISI();
        return outputSizeshNQ4ISI != null ? org.bouncycastle.asn1.ASN1OutputStream.getHighSpeedVideoFpsRanges(z, outputSizeshNQ4ISI.length) : super.Camera2StreamConfigurationMap().getHighSpeedVideoSizes(z);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    final void getHighSpeedVideoSizes(org.bouncycastle.asn1.ASN1OutputStream aSN1OutputStream, boolean z) throws java.io.IOException {
        byte[] outputSizeshNQ4ISI = getOutputSizeshNQ4ISI();
        if (outputSizeshNQ4ISI != null) {
            aSN1OutputStream.getHighResolutionOutputSizeshNQ4ISI(z, 48, outputSizeshNQ4ISI);
        } else {
            super.Camera2StreamConfigurationMap().getHighSpeedVideoSizes(aSN1OutputStream, z);
        }
    }

    private byte[] getOutputSizeshNQ4ISI() {
        byte[] bArr;
        synchronized (this) {
            bArr = this.getHighResolutionOutputSizeshNQ4ISI;
        }
        return bArr;
    }

    private void getOutputStallDurationlomOqCM() {
        synchronized (this) {
            if (this.getHighResolutionOutputSizeshNQ4ISI != null) {
                org.bouncycastle.asn1.ASN1InputStream aSN1InputStream = new org.bouncycastle.asn1.ASN1InputStream(this.getHighResolutionOutputSizeshNQ4ISI, true);
                try {
                    org.bouncycastle.asn1.ASN1EncodableVector Camera2StreamConfigurationMap = aSN1InputStream.Camera2StreamConfigurationMap();
                    aSN1InputStream.close();
                    this.Camera2StreamConfigurationMap = Camera2StreamConfigurationMap.getHighSpeedVideoSizes();
                    this.getHighResolutionOutputSizeshNQ4ISI = null;
                } catch (java.io.IOException e) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("malformed ASN.1: ");
                    sb.append(e);
                    throw new org.bouncycastle.asn1.ASN1ParsingException(sb.toString(), e);
                }
            }
        }
    }

    LazyEncodedSequence(byte[] bArr) throws java.io.IOException {
        if (bArr == null) {
            throw new java.lang.NullPointerException("'encoded' cannot be null");
        }
        this.getHighResolutionOutputSizeshNQ4ISI = bArr;
    }
}
