package org.bouncycastle.cms;

/* loaded from: classes17.dex */
public class CMSAuthenticatedDataStreamGenerator extends org.bouncycastle.cms.CMSAuthenticatedGenerator {
    private boolean getHighResolutionOutputSizeshNQ4ISI;
    private int getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.operator.MacCalculator getHighSpeedVideoSizes;

    public void setBufferSize(int i) {
        this.getHighSpeedVideoFpsRangesFor = i;
    }

    class CmsAuthenticatedDataOutputStream extends java.io.OutputStream {
        private org.bouncycastle.asn1.ASN1ObjectIdentifier Camera2StreamConfigurationMap;
        private org.bouncycastle.asn1.BERSequenceGenerator getHighResolutionOutputSizeshNQ4ISI;
        private java.io.OutputStream getHighSpeedVideoFpsRanges;
        private org.bouncycastle.operator.DigestCalculator getHighSpeedVideoSizes;
        private org.bouncycastle.asn1.BERSequenceGenerator getInputFormats;
        private org.bouncycastle.asn1.BERSequenceGenerator getInputSizeshNQ4ISI;
        private org.bouncycastle.operator.MacCalculator getOutputMinFrameDuration;

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) throws java.io.IOException {
            this.getHighSpeedVideoFpsRanges.write(bArr, i, i2);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) throws java.io.IOException {
            this.getHighSpeedVideoFpsRanges.write(bArr);
        }

        @Override // java.io.OutputStream
        public void write(int i) throws java.io.IOException {
            this.getHighSpeedVideoFpsRanges.write(i);
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws java.io.IOException {
            java.util.Map map;
            this.getHighSpeedVideoFpsRanges.close();
            this.getInputSizeshNQ4ISI.close();
            org.bouncycastle.operator.DigestCalculator digestCalculator = this.getHighSpeedVideoSizes;
            if (digestCalculator != null) {
                map = java.util.Collections.unmodifiableMap(org.bouncycastle.cms.CMSAuthenticatedDataStreamGenerator.this.getBaseParameters(this.Camera2StreamConfigurationMap, digestCalculator.getAlgorithmIdentifier(), this.getOutputMinFrameDuration.getAlgorithmIdentifier(), this.getHighSpeedVideoSizes.getDigest()));
                if (org.bouncycastle.cms.CMSAuthenticatedDataStreamGenerator.this.authGen == null) {
                    org.bouncycastle.cms.CMSAuthenticatedDataStreamGenerator.this.authGen = new org.bouncycastle.cms.DefaultAuthenticatedAttributeTableGenerator();
                }
                org.bouncycastle.asn1.DERSet dERSet = new org.bouncycastle.asn1.DERSet(org.bouncycastle.cms.CMSAuthenticatedDataStreamGenerator.this.authGen.getAttributes(map).toASN1EncodableVector());
                java.io.OutputStream outputStream = this.getOutputMinFrameDuration.getOutputStream();
                outputStream.write(dERSet.getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER));
                outputStream.close();
                this.getInputFormats.addObject((org.bouncycastle.asn1.ASN1Primitive) new org.bouncycastle.asn1.DERTaggedObject(false, 2, (org.bouncycastle.asn1.ASN1Encodable) dERSet));
            } else {
                map = java.util.Collections.EMPTY_MAP;
            }
            this.getInputFormats.addObject((org.bouncycastle.asn1.ASN1Primitive) new org.bouncycastle.asn1.DEROctetString(this.getOutputMinFrameDuration.getMac()));
            if (org.bouncycastle.cms.CMSAuthenticatedDataStreamGenerator.this.unauthGen != null) {
                this.getInputFormats.addObject((org.bouncycastle.asn1.ASN1Primitive) new org.bouncycastle.asn1.DERTaggedObject(false, 3, (org.bouncycastle.asn1.ASN1Encodable) new org.bouncycastle.asn1.BERSet(org.bouncycastle.cms.CMSAuthenticatedDataStreamGenerator.this.unauthGen.getAttributes(map).toASN1EncodableVector())));
            }
            this.getInputFormats.close();
            this.getHighResolutionOutputSizeshNQ4ISI.close();
        }

        public CmsAuthenticatedDataOutputStream(org.bouncycastle.operator.MacCalculator macCalculator, org.bouncycastle.operator.DigestCalculator digestCalculator, org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, java.io.OutputStream outputStream, org.bouncycastle.asn1.BERSequenceGenerator bERSequenceGenerator, org.bouncycastle.asn1.BERSequenceGenerator bERSequenceGenerator2, org.bouncycastle.asn1.BERSequenceGenerator bERSequenceGenerator3) {
            this.getOutputMinFrameDuration = macCalculator;
            this.getHighSpeedVideoSizes = digestCalculator;
            this.Camera2StreamConfigurationMap = aSN1ObjectIdentifier;
            this.getHighSpeedVideoFpsRanges = outputStream;
            this.getHighResolutionOutputSizeshNQ4ISI = bERSequenceGenerator;
            this.getInputFormats = bERSequenceGenerator2;
            this.getInputSizeshNQ4ISI = bERSequenceGenerator3;
        }
    }

    public void setBEREncodeRecipients(boolean z) {
        this.getHighResolutionOutputSizeshNQ4ISI = z;
    }

    public java.io.OutputStream open(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, java.io.OutputStream outputStream, org.bouncycastle.operator.MacCalculator macCalculator, org.bouncycastle.operator.DigestCalculator digestCalculator) throws org.bouncycastle.cms.CMSException {
        this.getHighSpeedVideoSizes = macCalculator;
        try {
            org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector();
            java.util.Iterator it = this.Camera2StreamConfigurationMap.iterator();
            while (it.hasNext()) {
                aSN1EncodableVector.add(((org.bouncycastle.cms.RecipientInfoGenerator) it.next()).generate(macCalculator.getKey()));
            }
            org.bouncycastle.asn1.BERSequenceGenerator bERSequenceGenerator = new org.bouncycastle.asn1.BERSequenceGenerator(outputStream);
            bERSequenceGenerator.addObject((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.cms.CMSObjectIdentifiers.authenticatedData);
            org.bouncycastle.asn1.BERSequenceGenerator bERSequenceGenerator2 = new org.bouncycastle.asn1.BERSequenceGenerator(bERSequenceGenerator.getRawOutputStream(), 0, true);
            bERSequenceGenerator2.addObject((org.bouncycastle.asn1.ASN1Primitive) new org.bouncycastle.asn1.ASN1Integer(org.bouncycastle.asn1.cms.AuthenticatedData.calculateVersion(this.originatorInfo)));
            if (this.originatorInfo != null) {
                bERSequenceGenerator2.addObject((org.bouncycastle.asn1.ASN1Primitive) new org.bouncycastle.asn1.DERTaggedObject(false, 0, (org.bouncycastle.asn1.ASN1Encodable) this.originatorInfo));
            }
            if (this.getHighResolutionOutputSizeshNQ4ISI) {
                bERSequenceGenerator2.getRawOutputStream().write(new org.bouncycastle.asn1.BERSet(aSN1EncodableVector).getEncoded());
            } else {
                bERSequenceGenerator2.getRawOutputStream().write(new org.bouncycastle.asn1.DERSet(aSN1EncodableVector).getEncoded());
            }
            bERSequenceGenerator2.getRawOutputStream().write(macCalculator.getAlgorithmIdentifier().getEncoded());
            if (digestCalculator != null) {
                bERSequenceGenerator2.addObject((org.bouncycastle.asn1.ASN1Primitive) new org.bouncycastle.asn1.DERTaggedObject(false, 1, (org.bouncycastle.asn1.ASN1Encodable) digestCalculator.getAlgorithmIdentifier()));
            }
            org.bouncycastle.asn1.BERSequenceGenerator bERSequenceGenerator3 = new org.bouncycastle.asn1.BERSequenceGenerator(bERSequenceGenerator2.getRawOutputStream());
            bERSequenceGenerator3.addObject((org.bouncycastle.asn1.ASN1Primitive) aSN1ObjectIdentifier);
            java.io.OutputStream highResolutionOutputSizeshNQ4ISI = org.bouncycastle.cms.CMSUtils.getHighResolutionOutputSizeshNQ4ISI(bERSequenceGenerator3.getRawOutputStream(), true, this.getHighSpeedVideoFpsRangesFor);
            return new org.bouncycastle.cms.CMSAuthenticatedDataStreamGenerator.CmsAuthenticatedDataOutputStream(macCalculator, digestCalculator, aSN1ObjectIdentifier, digestCalculator != null ? new org.bouncycastle.util.io.TeeOutputStream(highResolutionOutputSizeshNQ4ISI, digestCalculator.getOutputStream()) : new org.bouncycastle.util.io.TeeOutputStream(highResolutionOutputSizeshNQ4ISI, macCalculator.getOutputStream()), bERSequenceGenerator, bERSequenceGenerator2, bERSequenceGenerator3);
        } catch (java.io.IOException e) {
            throw new org.bouncycastle.cms.CMSException("exception decoding algorithm parameters.", e);
        }
    }

    public java.io.OutputStream open(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, java.io.OutputStream outputStream, org.bouncycastle.operator.MacCalculator macCalculator) throws org.bouncycastle.cms.CMSException {
        return open(aSN1ObjectIdentifier, outputStream, macCalculator, null);
    }

    public java.io.OutputStream open(java.io.OutputStream outputStream, org.bouncycastle.operator.MacCalculator macCalculator, org.bouncycastle.operator.DigestCalculator digestCalculator) throws org.bouncycastle.cms.CMSException {
        return open(org.bouncycastle.asn1.cms.CMSObjectIdentifiers.data, outputStream, macCalculator, digestCalculator);
    }

    public java.io.OutputStream open(java.io.OutputStream outputStream, org.bouncycastle.operator.MacCalculator macCalculator) throws org.bouncycastle.cms.CMSException {
        return open(org.bouncycastle.asn1.cms.CMSObjectIdentifiers.data, outputStream, macCalculator);
    }
}
