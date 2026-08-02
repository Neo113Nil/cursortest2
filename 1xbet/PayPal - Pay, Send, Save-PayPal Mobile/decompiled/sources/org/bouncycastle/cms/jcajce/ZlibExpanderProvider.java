package org.bouncycastle.cms.jcajce;

/* loaded from: classes17.dex */
public class ZlibExpanderProvider implements org.bouncycastle.operator.InputExpanderProvider {
    private final long getHighSpeedVideoFpsRangesFor;

    static class LimitedInputStream extends java.io.FilterInputStream {
        private long getHighResolutionOutputSizeshNQ4ISI;

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws java.io.IOException {
            if (i2 <= 0) {
                return super.read(bArr, i, i2);
            }
            long j = this.getHighResolutionOutputSizeshNQ4ISI;
            if (j < 1) {
                read();
                return -1;
            }
            if (j <= i2) {
                i2 = (int) j;
            }
            int read = ((java.io.FilterInputStream) this).in.read(bArr, i, i2);
            if (read > 0) {
                this.getHighResolutionOutputSizeshNQ4ISI -= read;
            }
            return read;
        }

        /* JADX WARN: Code restructure failed: missing block: B:6:0x0019, code lost:
        
            if (r4 >= 0) goto L8;
         */
        @Override // java.io.FilterInputStream, java.io.InputStream
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public int read() throws java.io.IOException {
            if (this.getHighResolutionOutputSizeshNQ4ISI >= 0) {
                int read = ((java.io.FilterInputStream) this).in.read();
                if (read >= 0) {
                    long j = this.getHighResolutionOutputSizeshNQ4ISI - 1;
                    this.getHighResolutionOutputSizeshNQ4ISI = j;
                }
                return read;
            }
            throw new org.bouncycastle.util.io.StreamOverflowException("expanded byte limit exceeded");
        }

        public LimitedInputStream(java.io.InputStream inputStream, long j) {
            super(inputStream);
            this.getHighResolutionOutputSizeshNQ4ISI = j;
        }
    }

    @Override // org.bouncycastle.operator.InputExpanderProvider
    public org.bouncycastle.operator.InputExpander get(final org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier) {
        return new org.bouncycastle.operator.InputExpander() { // from class: org.bouncycastle.cms.jcajce.ZlibExpanderProvider.1
            @Override // org.bouncycastle.operator.InputExpander
            public java.io.InputStream getInputStream(java.io.InputStream inputStream) {
                java.util.zip.InflaterInputStream inflaterInputStream = new java.util.zip.InflaterInputStream(inputStream);
                return org.bouncycastle.cms.jcajce.ZlibExpanderProvider.this.getHighSpeedVideoFpsRangesFor >= 0 ? new org.bouncycastle.cms.jcajce.ZlibExpanderProvider.LimitedInputStream(inflaterInputStream, org.bouncycastle.cms.jcajce.ZlibExpanderProvider.this.getHighSpeedVideoFpsRangesFor) : inflaterInputStream;
            }

            @Override // org.bouncycastle.operator.InputExpander
            public org.bouncycastle.asn1.x509.AlgorithmIdentifier getAlgorithmIdentifier() {
                return algorithmIdentifier;
            }
        };
    }

    public ZlibExpanderProvider(long j) {
        this.getHighSpeedVideoFpsRangesFor = j;
    }

    public ZlibExpanderProvider() {
        this.getHighSpeedVideoFpsRangesFor = -1L;
    }
}
