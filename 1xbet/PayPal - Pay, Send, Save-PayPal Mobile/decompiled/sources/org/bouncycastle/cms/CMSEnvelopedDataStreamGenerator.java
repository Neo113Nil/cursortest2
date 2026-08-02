package org.bouncycastle.cms;

/* loaded from: classes17.dex */
public class CMSEnvelopedDataStreamGenerator extends org.bouncycastle.cms.CMSEnvelopedGenerator {
    private int getHighSpeedVideoFpsRanges;
    private boolean getHighSpeedVideoSizes;

    public void setBufferSize(int i) {
        this.getHighSpeedVideoFpsRanges = i;
    }

    public void setBEREncodeRecipients(boolean z) {
        this.getHighSpeedVideoSizes = z;
    }

    public java.io.OutputStream open(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, java.io.OutputStream outputStream, org.bouncycastle.operator.OutputEncryptor outputEncryptor) throws org.bouncycastle.cms.CMSException, java.io.IOException {
        return getHighSpeedVideoFpsRangesFor(aSN1ObjectIdentifier, outputStream, outputEncryptor);
    }

    class CmsEnvelopedDataOutputStream extends java.io.OutputStream {
        private final org.bouncycastle.operator.OutputEncryptor Camera2StreamConfigurationMap;
        private org.bouncycastle.asn1.BERSequenceGenerator getHighResolutionOutputSizeshNQ4ISI;
        private org.bouncycastle.asn1.BERSequenceGenerator getHighSpeedVideoFpsRanges;
        private final java.io.OutputStream getHighSpeedVideoFpsRangesFor;
        private java.io.OutputStream getInputFormats;
        private org.bouncycastle.asn1.BERSequenceGenerator getInputSizeshNQ4ISI;

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) throws java.io.IOException {
            this.getHighSpeedVideoFpsRangesFor.write(bArr, i, i2);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) throws java.io.IOException {
            this.getHighSpeedVideoFpsRangesFor.write(bArr);
        }

        @Override // java.io.OutputStream
        public void write(int i) throws java.io.IOException {
            this.getHighSpeedVideoFpsRangesFor.write(i);
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws java.io.IOException {
            this.getHighSpeedVideoFpsRangesFor.close();
            org.bouncycastle.operator.OutputEncryptor outputEncryptor = this.Camera2StreamConfigurationMap;
            if (outputEncryptor instanceof org.bouncycastle.operator.OutputAEADEncryptor) {
                this.getInputFormats.write(((org.bouncycastle.operator.OutputAEADEncryptor) outputEncryptor).getMAC());
                this.getInputFormats.close();
            }
            this.getHighResolutionOutputSizeshNQ4ISI.close();
            if (org.bouncycastle.cms.CMSEnvelopedDataStreamGenerator.this.unprotectedAttributeGenerator != null) {
                this.getInputSizeshNQ4ISI.addObject((org.bouncycastle.asn1.ASN1Primitive) new org.bouncycastle.asn1.DERTaggedObject(false, 1, (org.bouncycastle.asn1.ASN1Encodable) new org.bouncycastle.asn1.BERSet(org.bouncycastle.cms.CMSEnvelopedDataStreamGenerator.this.unprotectedAttributeGenerator.getAttributes(java.util.Collections.EMPTY_MAP).toASN1EncodableVector())));
            }
            this.getInputSizeshNQ4ISI.close();
            this.getHighSpeedVideoFpsRanges.close();
        }

        public CmsEnvelopedDataOutputStream(org.bouncycastle.operator.OutputEncryptor outputEncryptor, java.io.OutputStream outputStream, org.bouncycastle.asn1.BERSequenceGenerator bERSequenceGenerator, org.bouncycastle.asn1.BERSequenceGenerator bERSequenceGenerator2, org.bouncycastle.asn1.BERSequenceGenerator bERSequenceGenerator3) {
            this.Camera2StreamConfigurationMap = outputEncryptor;
            this.getInputFormats = outputStream;
            this.getHighSpeedVideoFpsRangesFor = outputEncryptor.getOutputStream(outputStream);
            this.getHighSpeedVideoFpsRanges = bERSequenceGenerator;
            this.getInputSizeshNQ4ISI = bERSequenceGenerator2;
            this.getHighResolutionOutputSizeshNQ4ISI = bERSequenceGenerator3;
        }
    }

    protected java.io.OutputStream open(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, java.io.OutputStream outputStream, org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector, org.bouncycastle.operator.OutputEncryptor outputEncryptor) throws java.io.IOException {
        org.bouncycastle.asn1.BERSequenceGenerator bERSequenceGenerator = new org.bouncycastle.asn1.BERSequenceGenerator(outputStream);
        bERSequenceGenerator.addObject((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.cms.CMSObjectIdentifiers.envelopedData);
        org.bouncycastle.asn1.BERSequenceGenerator bERSequenceGenerator2 = new org.bouncycastle.asn1.BERSequenceGenerator(bERSequenceGenerator.getRawOutputStream(), 0, true);
        bERSequenceGenerator2.addObject((org.bouncycastle.asn1.ASN1Primitive) Camera2StreamConfigurationMap(aSN1EncodableVector));
        if (this.originatorInfo != null) {
            bERSequenceGenerator2.addObject((org.bouncycastle.asn1.ASN1Primitive) new org.bouncycastle.asn1.DERTaggedObject(false, 0, (org.bouncycastle.asn1.ASN1Encodable) this.originatorInfo));
        }
        if (this.getHighSpeedVideoSizes) {
            bERSequenceGenerator2.getRawOutputStream().write(new org.bouncycastle.asn1.BERSet(aSN1EncodableVector).getEncoded());
        } else {
            bERSequenceGenerator2.getRawOutputStream().write(new org.bouncycastle.asn1.DERSet(aSN1EncodableVector).getEncoded());
        }
        org.bouncycastle.asn1.BERSequenceGenerator bERSequenceGenerator3 = new org.bouncycastle.asn1.BERSequenceGenerator(bERSequenceGenerator2.getRawOutputStream());
        bERSequenceGenerator3.addObject((org.bouncycastle.asn1.ASN1Primitive) aSN1ObjectIdentifier);
        bERSequenceGenerator3.getRawOutputStream().write(outputEncryptor.getAlgorithmIdentifier().getEncoded());
        return new org.bouncycastle.cms.CMSEnvelopedDataStreamGenerator.CmsEnvelopedDataOutputStream(outputEncryptor, org.bouncycastle.cms.CMSUtils.getHighResolutionOutputSizeshNQ4ISI(bERSequenceGenerator3.getRawOutputStream(), false, this.getHighSpeedVideoFpsRanges), bERSequenceGenerator, bERSequenceGenerator2, bERSequenceGenerator3);
    }

    public java.io.OutputStream open(java.io.OutputStream outputStream, org.bouncycastle.operator.OutputEncryptor outputEncryptor) throws org.bouncycastle.cms.CMSException, java.io.IOException {
        return getHighSpeedVideoFpsRangesFor(new org.bouncycastle.asn1.ASN1ObjectIdentifier(org.bouncycastle.asn1.cms.CMSObjectIdentifiers.data.getId()), outputStream, outputEncryptor);
    }

    protected java.io.OutputStream open(java.io.OutputStream outputStream, org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector, org.bouncycastle.operator.OutputEncryptor outputEncryptor) throws org.bouncycastle.cms.CMSException {
        try {
            org.bouncycastle.asn1.BERSequenceGenerator bERSequenceGenerator = new org.bouncycastle.asn1.BERSequenceGenerator(outputStream);
            bERSequenceGenerator.addObject((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.cms.CMSObjectIdentifiers.envelopedData);
            org.bouncycastle.asn1.BERSequenceGenerator bERSequenceGenerator2 = new org.bouncycastle.asn1.BERSequenceGenerator(bERSequenceGenerator.getRawOutputStream(), 0, true);
            org.bouncycastle.util.Encodable bERSet = this.getHighSpeedVideoSizes ? new org.bouncycastle.asn1.BERSet(aSN1EncodableVector) : new org.bouncycastle.asn1.DERSet(aSN1EncodableVector);
            bERSequenceGenerator2.addObject((org.bouncycastle.asn1.ASN1Primitive) Camera2StreamConfigurationMap(aSN1EncodableVector));
            if (this.originatorInfo != null) {
                bERSequenceGenerator2.addObject((org.bouncycastle.asn1.ASN1Primitive) new org.bouncycastle.asn1.DERTaggedObject(false, 0, (org.bouncycastle.asn1.ASN1Encodable) this.originatorInfo));
            }
            bERSequenceGenerator2.getRawOutputStream().write(bERSet.getEncoded());
            org.bouncycastle.asn1.BERSequenceGenerator bERSequenceGenerator3 = new org.bouncycastle.asn1.BERSequenceGenerator(bERSequenceGenerator2.getRawOutputStream());
            bERSequenceGenerator3.addObject((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.cms.CMSObjectIdentifiers.data);
            bERSequenceGenerator3.getRawOutputStream().write(outputEncryptor.getAlgorithmIdentifier().getEncoded());
            return new org.bouncycastle.cms.CMSEnvelopedDataStreamGenerator.CmsEnvelopedDataOutputStream(outputEncryptor, org.bouncycastle.cms.CMSUtils.getHighResolutionOutputSizeshNQ4ISI(bERSequenceGenerator3.getRawOutputStream(), false, this.getHighSpeedVideoFpsRanges), bERSequenceGenerator, bERSequenceGenerator2, bERSequenceGenerator3);
        } catch (java.io.IOException e) {
            throw new org.bouncycastle.cms.CMSException("exception decoding algorithm parameters.", e);
        }
    }

    private org.bouncycastle.asn1.ASN1Integer Camera2StreamConfigurationMap(org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector) {
        return this.unprotectedAttributeGenerator != null ? new org.bouncycastle.asn1.ASN1Integer(org.bouncycastle.asn1.cms.EnvelopedData.calculateVersion(this.originatorInfo, new org.bouncycastle.asn1.DLSet(aSN1EncodableVector), new org.bouncycastle.asn1.DLSet())) : new org.bouncycastle.asn1.ASN1Integer(org.bouncycastle.asn1.cms.EnvelopedData.calculateVersion(this.originatorInfo, new org.bouncycastle.asn1.DLSet(aSN1EncodableVector), null));
    }

    private java.io.OutputStream getHighSpeedVideoFpsRangesFor(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, java.io.OutputStream outputStream, org.bouncycastle.operator.OutputEncryptor outputEncryptor) throws java.io.IOException, org.bouncycastle.cms.CMSException {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector();
        org.bouncycastle.operator.GenericKey key = outputEncryptor.getKey();
        java.util.Iterator it = this.Camera2StreamConfigurationMap.iterator();
        while (it.hasNext()) {
            aSN1EncodableVector.add(((org.bouncycastle.cms.RecipientInfoGenerator) it.next()).generate(key));
        }
        return open(aSN1ObjectIdentifier, outputStream, aSN1EncodableVector, outputEncryptor);
    }
}
