package org.bouncycastle.crypto.io;

/* loaded from: classes17.dex */
public class CipherInputStream extends java.io.FilterInputStream {
    private int Camera2StreamConfigurationMap;
    private org.bouncycastle.crypto.modes.AEADBlockCipher getHighResolutionOutputSizeshNQ4ISI;
    private boolean getHighSpeedVideoFpsRanges;
    private byte[] getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.crypto.BufferedBlockCipher getHighSpeedVideoSizes;
    private byte[] getHighSpeedVideoSizesFor;
    private int getInputFormats;
    private long getInputSizeshNQ4ISI;
    private byte[] getOutputFormats;
    private int getOutputMinFrameDuration;
    private org.bouncycastle.crypto.StreamCipher getOutputMinFrameDurationlomOqCM;
    private org.bouncycastle.crypto.SkippingCipher getOutputSizes;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) throws java.io.IOException {
        if (j <= 0) {
            return 0L;
        }
        if (this.getOutputSizes == null) {
            int min = (int) java.lang.Math.min(j, available());
            this.Camera2StreamConfigurationMap += min;
            return min;
        }
        long available = available();
        if (j <= available) {
            this.Camera2StreamConfigurationMap = (int) (this.Camera2StreamConfigurationMap + j);
            return j;
        }
        this.Camera2StreamConfigurationMap = this.getInputFormats;
        long skip = this.in.skip(j - available);
        if (skip == this.getOutputSizes.skip(skip)) {
            return skip + available;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Unable to skip cipher ");
        sb.append(skip);
        sb.append(" bytes.");
        throw new java.io.IOException(sb.toString());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() throws java.io.IOException {
        if (this.getOutputSizes == null) {
            throw new java.io.IOException("cipher must implement SkippingCipher to be used with reset()");
        }
        this.in.reset();
        this.getOutputSizes.seekTo(this.getInputSizeshNQ4ISI);
        byte[] bArr = this.getOutputFormats;
        if (bArr != null) {
            this.getHighSpeedVideoFpsRangesFor = bArr;
        }
        this.Camera2StreamConfigurationMap = this.getOutputMinFrameDuration;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        if (this.Camera2StreamConfigurationMap >= this.getInputFormats && getHighSpeedVideoFpsRangesFor() < 0) {
            return -1;
        }
        int min = java.lang.Math.min(i2, available());
        java.lang.System.arraycopy(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, bArr, i, min);
        this.Camera2StreamConfigurationMap += min;
        return min;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws java.io.IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws java.io.IOException {
        if (this.Camera2StreamConfigurationMap >= this.getInputFormats && getHighSpeedVideoFpsRangesFor() < 0) {
            return -1;
        }
        byte[] bArr = this.getHighSpeedVideoFpsRangesFor;
        int i = this.Camera2StreamConfigurationMap;
        this.Camera2StreamConfigurationMap = i + 1;
        return bArr[i] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        if (this.getOutputSizes != null) {
            return this.in.markSupported();
        }
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i) {
        this.in.mark(i);
        org.bouncycastle.crypto.SkippingCipher skippingCipher = this.getOutputSizes;
        if (skippingCipher != null) {
            this.getInputSizeshNQ4ISI = skippingCipher.getPosition();
        }
        byte[] bArr = this.getHighSpeedVideoFpsRangesFor;
        if (bArr != null) {
            byte[] bArr2 = new byte[bArr.length];
            this.getOutputFormats = bArr2;
            java.lang.System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        this.getOutputMinFrameDuration = this.Camera2StreamConfigurationMap;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        try {
            this.in.close();
            this.Camera2StreamConfigurationMap = 0;
            this.getInputFormats = 0;
            this.getOutputMinFrameDuration = 0;
            this.getInputSizeshNQ4ISI = 0L;
            byte[] bArr = this.getOutputFormats;
            if (bArr != null) {
                org.bouncycastle.util.Arrays.fill(bArr, (byte) 0);
                this.getOutputFormats = null;
            }
            byte[] bArr2 = this.getHighSpeedVideoFpsRangesFor;
            if (bArr2 != null) {
                org.bouncycastle.util.Arrays.fill(bArr2, (byte) 0);
                this.getHighSpeedVideoFpsRangesFor = null;
            }
            org.bouncycastle.util.Arrays.fill(this.getHighSpeedVideoSizesFor, (byte) 0);
        } finally {
            if (!this.getHighSpeedVideoFpsRanges) {
                getHighSpeedVideoSizes();
            }
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws java.io.IOException {
        return this.getInputFormats - this.Camera2StreamConfigurationMap;
    }

    private int getHighSpeedVideoFpsRangesFor() throws java.io.IOException {
        if (this.getHighSpeedVideoFpsRanges) {
            return -1;
        }
        this.Camera2StreamConfigurationMap = 0;
        this.getInputFormats = 0;
        while (true) {
            int i = this.getInputFormats;
            if (i != 0) {
                return i;
            }
            int read = this.in.read(this.getHighSpeedVideoSizesFor);
            if (read == -1) {
                getHighSpeedVideoSizes();
                int i2 = this.getInputFormats;
                if (i2 == 0) {
                    return -1;
                }
                return i2;
            }
            try {
                getHighSpeedVideoFpsRangesFor(read, false);
                org.bouncycastle.crypto.BufferedBlockCipher bufferedBlockCipher = this.getHighSpeedVideoSizes;
                if (bufferedBlockCipher != null) {
                    read = bufferedBlockCipher.processBytes(this.getHighSpeedVideoSizesFor, 0, read, this.getHighSpeedVideoFpsRangesFor, 0);
                } else {
                    org.bouncycastle.crypto.modes.AEADBlockCipher aEADBlockCipher = this.getHighResolutionOutputSizeshNQ4ISI;
                    if (aEADBlockCipher != null) {
                        read = aEADBlockCipher.processBytes(this.getHighSpeedVideoSizesFor, 0, read, this.getHighSpeedVideoFpsRangesFor, 0);
                    } else {
                        this.getOutputMinFrameDurationlomOqCM.processBytes(this.getHighSpeedVideoSizesFor, 0, read, this.getHighSpeedVideoFpsRangesFor, 0);
                    }
                }
                this.getInputFormats = read;
            } catch (java.lang.Exception e) {
                throw new org.bouncycastle.crypto.io.CipherIOException("Error processing stream ", e);
            }
        }
    }

    private void getHighSpeedVideoSizes() throws java.io.IOException {
        int doFinal;
        try {
            this.getHighSpeedVideoFpsRanges = true;
            getHighSpeedVideoFpsRangesFor(0, true);
            org.bouncycastle.crypto.BufferedBlockCipher bufferedBlockCipher = this.getHighSpeedVideoSizes;
            if (bufferedBlockCipher != null) {
                doFinal = bufferedBlockCipher.doFinal(this.getHighSpeedVideoFpsRangesFor, 0);
            } else {
                org.bouncycastle.crypto.modes.AEADBlockCipher aEADBlockCipher = this.getHighResolutionOutputSizeshNQ4ISI;
                if (aEADBlockCipher == null) {
                    this.getInputFormats = 0;
                    return;
                }
                doFinal = aEADBlockCipher.doFinal(this.getHighSpeedVideoFpsRangesFor, 0);
            }
            this.getInputFormats = doFinal;
        } catch (org.bouncycastle.crypto.InvalidCipherTextException e) {
            throw new org.bouncycastle.crypto.io.InvalidCipherTextIOException("Error finalising cipher", e);
        } catch (java.lang.Exception e2) {
            throw new java.io.IOException("Error finalising cipher ".concat(java.lang.String.valueOf(e2)));
        }
    }

    private void getHighSpeedVideoFpsRangesFor(int i, boolean z) {
        if (z) {
            org.bouncycastle.crypto.BufferedBlockCipher bufferedBlockCipher = this.getHighSpeedVideoSizes;
            if (bufferedBlockCipher != null) {
                i = bufferedBlockCipher.getOutputSize(i);
            } else {
                org.bouncycastle.crypto.modes.AEADBlockCipher aEADBlockCipher = this.getHighResolutionOutputSizeshNQ4ISI;
                if (aEADBlockCipher != null) {
                    i = aEADBlockCipher.getOutputSize(i);
                }
            }
        } else {
            org.bouncycastle.crypto.BufferedBlockCipher bufferedBlockCipher2 = this.getHighSpeedVideoSizes;
            if (bufferedBlockCipher2 != null) {
                i = bufferedBlockCipher2.getUpdateOutputSize(i);
            } else {
                org.bouncycastle.crypto.modes.AEADBlockCipher aEADBlockCipher2 = this.getHighResolutionOutputSizeshNQ4ISI;
                if (aEADBlockCipher2 != null) {
                    i = aEADBlockCipher2.getUpdateOutputSize(i);
                }
            }
        }
        byte[] bArr = this.getHighSpeedVideoFpsRangesFor;
        if (bArr == null || bArr.length < i) {
            this.getHighSpeedVideoFpsRangesFor = new byte[i];
        }
    }

    public CipherInputStream(java.io.InputStream inputStream, org.bouncycastle.crypto.modes.AEADBlockCipher aEADBlockCipher, int i) {
        super(inputStream);
        this.getHighResolutionOutputSizeshNQ4ISI = aEADBlockCipher;
        this.getHighSpeedVideoSizesFor = new byte[i];
        this.getOutputSizes = aEADBlockCipher instanceof org.bouncycastle.crypto.SkippingCipher ? (org.bouncycastle.crypto.SkippingCipher) aEADBlockCipher : null;
    }

    public CipherInputStream(java.io.InputStream inputStream, org.bouncycastle.crypto.modes.AEADBlockCipher aEADBlockCipher) {
        this(inputStream, aEADBlockCipher, 2048);
    }

    public CipherInputStream(java.io.InputStream inputStream, org.bouncycastle.crypto.StreamCipher streamCipher, int i) {
        super(inputStream);
        this.getOutputMinFrameDurationlomOqCM = streamCipher;
        this.getHighSpeedVideoSizesFor = new byte[i];
        this.getOutputSizes = streamCipher instanceof org.bouncycastle.crypto.SkippingCipher ? (org.bouncycastle.crypto.SkippingCipher) streamCipher : null;
    }

    public CipherInputStream(java.io.InputStream inputStream, org.bouncycastle.crypto.StreamCipher streamCipher) {
        this(inputStream, streamCipher, 2048);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CipherInputStream(java.io.InputStream inputStream, org.bouncycastle.crypto.BufferedBlockCipher bufferedBlockCipher, int i) {
        super(inputStream);
        this.getHighSpeedVideoSizes = bufferedBlockCipher;
        this.getHighSpeedVideoSizesFor = new byte[i];
        this.getOutputSizes = bufferedBlockCipher instanceof org.bouncycastle.crypto.SkippingCipher ? (org.bouncycastle.crypto.SkippingCipher) bufferedBlockCipher : null;
    }

    public CipherInputStream(java.io.InputStream inputStream, org.bouncycastle.crypto.BufferedBlockCipher bufferedBlockCipher) {
        this(inputStream, bufferedBlockCipher, 2048);
    }
}
