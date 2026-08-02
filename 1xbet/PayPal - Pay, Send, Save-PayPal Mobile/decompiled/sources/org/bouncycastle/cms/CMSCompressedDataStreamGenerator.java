package org.bouncycastle.cms;

/* loaded from: classes17.dex */
public class CMSCompressedDataStreamGenerator {
    public static final java.lang.String ZLIB = "1.2.840.113549.1.9.16.3.8";
    private int getHighSpeedVideoSizes;

    class CmsCompressedOutputStream extends java.io.OutputStream {
        private org.bouncycastle.asn1.BERSequenceGenerator Camera2StreamConfigurationMap;
        private java.io.OutputStream getHighResolutionOutputSizeshNQ4ISI;
        private org.bouncycastle.asn1.BERSequenceGenerator getHighSpeedVideoFpsRanges;
        private org.bouncycastle.asn1.BERSequenceGenerator getHighSpeedVideoSizes;

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) throws java.io.IOException {
            this.getHighResolutionOutputSizeshNQ4ISI.write(bArr, i, i2);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) throws java.io.IOException {
            this.getHighResolutionOutputSizeshNQ4ISI.write(bArr);
        }

        @Override // java.io.OutputStream
        public void write(int i) throws java.io.IOException {
            this.getHighResolutionOutputSizeshNQ4ISI.write(i);
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws java.io.IOException {
            this.getHighResolutionOutputSizeshNQ4ISI.close();
            this.Camera2StreamConfigurationMap.close();
            this.getHighSpeedVideoSizes.close();
            this.getHighSpeedVideoFpsRanges.close();
        }

        CmsCompressedOutputStream(java.io.OutputStream outputStream, org.bouncycastle.asn1.BERSequenceGenerator bERSequenceGenerator, org.bouncycastle.asn1.BERSequenceGenerator bERSequenceGenerator2, org.bouncycastle.asn1.BERSequenceGenerator bERSequenceGenerator3) {
            this.getHighResolutionOutputSizeshNQ4ISI = outputStream;
            this.getHighSpeedVideoFpsRanges = bERSequenceGenerator;
            this.getHighSpeedVideoSizes = bERSequenceGenerator2;
            this.Camera2StreamConfigurationMap = bERSequenceGenerator3;
        }
    }

    public void setBufferSize(int i) {
        this.getHighSpeedVideoSizes = i;
    }

    public java.io.OutputStream open(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, java.io.OutputStream outputStream, org.bouncycastle.operator.OutputCompressor outputCompressor) throws java.io.IOException {
        org.bouncycastle.asn1.BERSequenceGenerator bERSequenceGenerator = new org.bouncycastle.asn1.BERSequenceGenerator(outputStream);
        bERSequenceGenerator.addObject((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.cms.CMSObjectIdentifiers.compressedData);
        org.bouncycastle.asn1.BERSequenceGenerator bERSequenceGenerator2 = new org.bouncycastle.asn1.BERSequenceGenerator(bERSequenceGenerator.getRawOutputStream(), 0, true);
        bERSequenceGenerator2.addObject((org.bouncycastle.asn1.ASN1Primitive) new org.bouncycastle.asn1.ASN1Integer(0L));
        bERSequenceGenerator2.addObject(outputCompressor.getAlgorithmIdentifier());
        org.bouncycastle.asn1.BERSequenceGenerator bERSequenceGenerator3 = new org.bouncycastle.asn1.BERSequenceGenerator(bERSequenceGenerator2.getRawOutputStream());
        bERSequenceGenerator3.addObject((org.bouncycastle.asn1.ASN1Primitive) aSN1ObjectIdentifier);
        return new org.bouncycastle.cms.CMSCompressedDataStreamGenerator.CmsCompressedOutputStream(outputCompressor.getOutputStream(org.bouncycastle.cms.CMSUtils.getHighResolutionOutputSizeshNQ4ISI(bERSequenceGenerator3.getRawOutputStream(), true, this.getHighSpeedVideoSizes)), bERSequenceGenerator, bERSequenceGenerator2, bERSequenceGenerator3);
    }

    public java.io.OutputStream open(java.io.OutputStream outputStream, org.bouncycastle.operator.OutputCompressor outputCompressor) throws java.io.IOException {
        return open(org.bouncycastle.asn1.cms.CMSObjectIdentifiers.data, outputStream, outputCompressor);
    }
}
