package org.bouncycastle.crypto.io;

/* loaded from: classes17.dex */
public class CipherOutputStream extends java.io.FilterOutputStream {
    private org.bouncycastle.crypto.StreamCipher Camera2StreamConfigurationMap;
    private org.bouncycastle.crypto.BufferedBlockCipher getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.crypto.modes.AEADBlockCipher getHighSpeedVideoFpsRanges;
    private final byte[] getHighSpeedVideoFpsRangesFor;
    private byte[] getHighSpeedVideoSizes;

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws java.io.IOException {
        getHighSpeedVideoSizes(i2, false);
        org.bouncycastle.crypto.BufferedBlockCipher bufferedBlockCipher = this.getHighResolutionOutputSizeshNQ4ISI;
        if (bufferedBlockCipher != null) {
            int processBytes = bufferedBlockCipher.processBytes(bArr, i, i2, this.getHighSpeedVideoSizes, 0);
            if (processBytes != 0) {
                this.out.write(this.getHighSpeedVideoSizes, 0, processBytes);
                return;
            }
            return;
        }
        org.bouncycastle.crypto.modes.AEADBlockCipher aEADBlockCipher = this.getHighSpeedVideoFpsRanges;
        if (aEADBlockCipher == null) {
            this.Camera2StreamConfigurationMap.processBytes(bArr, i, i2, this.getHighSpeedVideoSizes, 0);
            this.out.write(this.getHighSpeedVideoSizes, 0, i2);
        } else {
            int processBytes2 = aEADBlockCipher.processBytes(bArr, i, i2, this.getHighSpeedVideoSizes, 0);
            if (processBytes2 != 0) {
                this.out.write(this.getHighSpeedVideoSizes, 0, processBytes2);
            }
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) throws java.io.IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i) throws java.io.IOException {
        byte[] bArr = this.getHighSpeedVideoFpsRangesFor;
        byte b = (byte) i;
        bArr[0] = b;
        if (this.Camera2StreamConfigurationMap != null) {
            this.out.write(this.Camera2StreamConfigurationMap.returnByte(b));
        } else {
            write(bArr, 0, 1);
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public void flush() throws java.io.IOException {
        this.out.flush();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:0|1|(4:2|3|(2:5|(1:7))(2:19|(2:21|(1:23))(2:24|(1:26)))|8)|9|10|(1:12)(1:14)) */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0051, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
    
        if (r0 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0054, code lost:
    
        r0 = r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0057 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0058  */
    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void close() throws java.io.IOException {
        java.io.IOException cipherIOException;
        java.io.IOException iOException;
        getHighSpeedVideoSizes(0, true);
        try {
            org.bouncycastle.crypto.BufferedBlockCipher bufferedBlockCipher = this.getHighResolutionOutputSizeshNQ4ISI;
            if (bufferedBlockCipher != null) {
                int doFinal = bufferedBlockCipher.doFinal(this.getHighSpeedVideoSizes, 0);
                if (doFinal != 0) {
                    this.out.write(this.getHighSpeedVideoSizes, 0, doFinal);
                }
            } else {
                org.bouncycastle.crypto.modes.AEADBlockCipher aEADBlockCipher = this.getHighSpeedVideoFpsRanges;
                if (aEADBlockCipher != null) {
                    int doFinal2 = aEADBlockCipher.doFinal(this.getHighSpeedVideoSizes, 0);
                    if (doFinal2 != 0) {
                        this.out.write(this.getHighSpeedVideoSizes, 0, doFinal2);
                    }
                } else {
                    org.bouncycastle.crypto.StreamCipher streamCipher = this.Camera2StreamConfigurationMap;
                    if (streamCipher != null) {
                        streamCipher.reset();
                    }
                }
            }
            iOException = null;
        } catch (org.bouncycastle.crypto.InvalidCipherTextException e) {
            cipherIOException = new org.bouncycastle.crypto.io.InvalidCipherTextIOException("Error finalising cipher data", e);
            iOException = cipherIOException;
            flush();
            this.out.close();
            if (iOException != null) {
            }
        } catch (java.lang.Exception e2) {
            cipherIOException = new org.bouncycastle.crypto.io.CipherIOException("Error closing stream: ", e2);
            iOException = cipherIOException;
            flush();
            this.out.close();
            if (iOException != null) {
            }
        }
        flush();
        this.out.close();
        if (iOException != null) {
            throw iOException;
        }
    }

    private void getHighSpeedVideoSizes(int i, boolean z) {
        if (z) {
            org.bouncycastle.crypto.BufferedBlockCipher bufferedBlockCipher = this.getHighResolutionOutputSizeshNQ4ISI;
            if (bufferedBlockCipher != null) {
                i = bufferedBlockCipher.getOutputSize(i);
            } else {
                org.bouncycastle.crypto.modes.AEADBlockCipher aEADBlockCipher = this.getHighSpeedVideoFpsRanges;
                if (aEADBlockCipher != null) {
                    i = aEADBlockCipher.getOutputSize(i);
                }
            }
        } else {
            org.bouncycastle.crypto.BufferedBlockCipher bufferedBlockCipher2 = this.getHighResolutionOutputSizeshNQ4ISI;
            if (bufferedBlockCipher2 != null) {
                i = bufferedBlockCipher2.getUpdateOutputSize(i);
            } else {
                org.bouncycastle.crypto.modes.AEADBlockCipher aEADBlockCipher2 = this.getHighSpeedVideoFpsRanges;
                if (aEADBlockCipher2 != null) {
                    i = aEADBlockCipher2.getUpdateOutputSize(i);
                }
            }
        }
        byte[] bArr = this.getHighSpeedVideoSizes;
        if (bArr == null || bArr.length < i) {
            this.getHighSpeedVideoSizes = new byte[i];
        }
    }

    public CipherOutputStream(java.io.OutputStream outputStream, org.bouncycastle.crypto.modes.AEADBlockCipher aEADBlockCipher) {
        super(outputStream);
        this.getHighSpeedVideoFpsRangesFor = new byte[1];
        this.getHighSpeedVideoFpsRanges = aEADBlockCipher;
    }

    public CipherOutputStream(java.io.OutputStream outputStream, org.bouncycastle.crypto.StreamCipher streamCipher) {
        super(outputStream);
        this.getHighSpeedVideoFpsRangesFor = new byte[1];
        this.Camera2StreamConfigurationMap = streamCipher;
    }

    public CipherOutputStream(java.io.OutputStream outputStream, org.bouncycastle.crypto.BufferedBlockCipher bufferedBlockCipher) {
        super(outputStream);
        this.getHighSpeedVideoFpsRangesFor = new byte[1];
        this.getHighResolutionOutputSizeshNQ4ISI = bufferedBlockCipher;
    }
}
