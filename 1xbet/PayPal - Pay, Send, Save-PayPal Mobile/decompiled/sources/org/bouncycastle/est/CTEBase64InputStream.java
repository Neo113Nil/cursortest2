package org.bouncycastle.est;

/* loaded from: classes17.dex */
class CTEBase64InputStream extends java.io.InputStream {
    protected final java.lang.Long getHighResolutionOutputSizeshNQ4ISI;
    protected long getHighSpeedVideoFpsRangesFor;
    protected final java.io.InputStream getHighSpeedVideoSizesFor;
    protected int getInputFormats;
    protected int getOutputFormats;
    protected final byte[] Camera2StreamConfigurationMap = new byte[1024];
    protected final byte[] getHighSpeedVideoFpsRanges = new byte[com.google.android.material.internal.ViewUtils.EDGE_TO_EDGE_FLAGS];
    protected final java.io.OutputStream getHighSpeedVideoSizes = new java.io.OutputStream() { // from class: org.bouncycastle.est.CTEBase64InputStream.1
        @Override // java.io.OutputStream
        public void write(int i) throws java.io.IOException {
            byte[] bArr = org.bouncycastle.est.CTEBase64InputStream.this.getHighSpeedVideoFpsRanges;
            org.bouncycastle.est.CTEBase64InputStream cTEBase64InputStream = org.bouncycastle.est.CTEBase64InputStream.this;
            int i2 = cTEBase64InputStream.getOutputFormats;
            cTEBase64InputStream.getOutputFormats = i2 + 1;
            bArr[i2] = (byte) i;
        }
    };

    @Override // java.io.InputStream
    public int read() throws java.io.IOException {
        if (this.getInputFormats == this.getOutputFormats) {
            this.getInputFormats = 0;
            this.getOutputFormats = 0;
            int highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI();
            if (highResolutionOutputSizeshNQ4ISI == -1) {
                return highResolutionOutputSizeshNQ4ISI;
            }
        }
        byte[] bArr = this.getHighSpeedVideoFpsRanges;
        int i = this.getInputFormats;
        this.getInputFormats = i + 1;
        return bArr[i] & 255;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0052, code lost:
    
        org.bouncycastle.util.encoders.Base64.decode(r10.Camera2StreamConfigurationMap, 0, r2, r10.getHighSpeedVideoSizes);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006a, code lost:
    
        throw new java.io.IOException("Decode Base64 Content-Transfer-Encoding: ".concat(java.lang.String.valueOf(r0)));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int getHighResolutionOutputSizeshNQ4ISI() throws java.io.IOException {
        int read;
        if (this.getHighSpeedVideoFpsRangesFor >= this.getHighResolutionOutputSizeshNQ4ISI.longValue()) {
            return -1;
        }
        int i = 0;
        do {
            read = this.getHighSpeedVideoSizesFor.read();
            if (read >= 33 || read == 13 || read == 10) {
                byte[] bArr = this.Camera2StreamConfigurationMap;
                if (i >= bArr.length) {
                    throw new java.io.IOException("Content Transfer Encoding, base64 line length > 1024");
                }
                bArr[i] = (byte) read;
                this.getHighSpeedVideoFpsRangesFor++;
                i++;
            } else if (read >= 0) {
                this.getHighSpeedVideoFpsRangesFor++;
            }
            if (read < 0 || i >= this.Camera2StreamConfigurationMap.length || read == 10) {
                break;
            }
        } while (this.getHighSpeedVideoFpsRangesFor < this.getHighResolutionOutputSizeshNQ4ISI.longValue());
        if (read == -1) {
            return -1;
        }
        return this.getOutputFormats;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        this.getHighSpeedVideoSizesFor.close();
    }

    public CTEBase64InputStream(java.io.InputStream inputStream, java.lang.Long l) {
        this.getHighSpeedVideoSizesFor = inputStream;
        this.getHighResolutionOutputSizeshNQ4ISI = l;
    }
}
