package org.bouncycastle.jcajce.io;

/* loaded from: classes17.dex */
public class CipherInputStream extends java.io.FilterInputStream {
    private final javax.crypto.Cipher Camera2StreamConfigurationMap;
    private boolean getHighResolutionOutputSizeshNQ4ISI;
    private int getHighSpeedVideoFpsRanges;
    private final byte[] getHighSpeedVideoFpsRangesFor;
    private byte[] getHighSpeedVideoSizes;
    private int getInputSizeshNQ4ISI;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i) {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() throws java.io.IOException {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) throws java.io.IOException {
        if (j <= 0) {
            return 0L;
        }
        int min = (int) java.lang.Math.min(j, available());
        this.getHighSpeedVideoFpsRanges += min;
        return min;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        if (this.getHighSpeedVideoFpsRanges >= this.getInputSizeshNQ4ISI && Camera2StreamConfigurationMap() < 0) {
            return -1;
        }
        int min = java.lang.Math.min(i2, available());
        java.lang.System.arraycopy(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, bArr, i, min);
        this.getHighSpeedVideoFpsRanges += min;
        return min;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws java.io.IOException {
        if (this.getHighSpeedVideoFpsRanges >= this.getInputSizeshNQ4ISI && Camera2StreamConfigurationMap() < 0) {
            return -1;
        }
        byte[] bArr = this.getHighSpeedVideoSizes;
        int i = this.getHighSpeedVideoFpsRanges;
        this.getHighSpeedVideoFpsRanges = i + 1;
        return bArr[i] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        try {
            this.in.close();
            this.getHighSpeedVideoFpsRanges = 0;
            this.getInputSizeshNQ4ISI = 0;
        } finally {
            if (!this.getHighResolutionOutputSizeshNQ4ISI) {
                getHighSpeedVideoSizes();
            }
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws java.io.IOException {
        return this.getInputSizeshNQ4ISI - this.getHighSpeedVideoFpsRanges;
    }

    private int Camera2StreamConfigurationMap() throws java.io.IOException {
        if (this.getHighResolutionOutputSizeshNQ4ISI) {
            return -1;
        }
        this.getHighSpeedVideoFpsRanges = 0;
        this.getInputSizeshNQ4ISI = 0;
        while (true) {
            int i = this.getInputSizeshNQ4ISI;
            if (i != 0) {
                return i;
            }
            int read = this.in.read(this.getHighSpeedVideoFpsRangesFor);
            if (read == -1) {
                byte[] highSpeedVideoSizes = getHighSpeedVideoSizes();
                this.getHighSpeedVideoSizes = highSpeedVideoSizes;
                if (highSpeedVideoSizes == null || highSpeedVideoSizes.length == 0) {
                    return -1;
                }
                int length = highSpeedVideoSizes.length;
                this.getInputSizeshNQ4ISI = length;
                return length;
            }
            byte[] update = this.Camera2StreamConfigurationMap.update(this.getHighSpeedVideoFpsRangesFor, 0, read);
            this.getHighSpeedVideoSizes = update;
            if (update != null) {
                this.getInputSizeshNQ4ISI = update.length;
            }
        }
    }

    private byte[] getHighSpeedVideoSizes() throws org.bouncycastle.crypto.io.InvalidCipherTextIOException {
        try {
            if (this.getHighResolutionOutputSizeshNQ4ISI) {
                return null;
            }
            this.getHighResolutionOutputSizeshNQ4ISI = true;
            return this.Camera2StreamConfigurationMap.doFinal();
        } catch (java.security.GeneralSecurityException e) {
            throw new org.bouncycastle.crypto.io.InvalidCipherTextIOException("Error finalising cipher", e);
        }
    }

    public CipherInputStream(java.io.InputStream inputStream, javax.crypto.Cipher cipher) {
        super(inputStream);
        this.getHighSpeedVideoFpsRangesFor = new byte[512];
        this.getHighResolutionOutputSizeshNQ4ISI = false;
        this.Camera2StreamConfigurationMap = cipher;
    }
}
