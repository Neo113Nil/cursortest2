package org.bouncycastle.jcajce.io;

/* loaded from: classes17.dex */
public class CipherOutputStream extends java.io.FilterOutputStream {
    private final javax.crypto.Cipher Camera2StreamConfigurationMap;
    private final byte[] getHighResolutionOutputSizeshNQ4ISI;

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws java.io.IOException {
        byte[] update = this.Camera2StreamConfigurationMap.update(bArr, i, i2);
        if (update != null) {
            this.out.write(update);
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i) throws java.io.IOException {
        byte[] bArr = this.getHighResolutionOutputSizeshNQ4ISI;
        bArr[0] = (byte) i;
        write(bArr, 0, 1);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public void flush() throws java.io.IOException {
        this.out.flush();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(5:0|(4:1|2|(1:4)|6)|7|8|(1:10)(1:12)) */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
    
        if (r0 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0035, code lost:
    
        r0 = r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0038 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0039  */
    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void close() throws java.io.IOException {
        java.io.IOException iOException;
        java.io.IOException iOException2;
        try {
            byte[] doFinal = this.Camera2StreamConfigurationMap.doFinal();
            if (doFinal != null) {
                this.out.write(doFinal);
            }
            iOException2 = null;
        } catch (java.security.GeneralSecurityException e) {
            iOException = new org.bouncycastle.crypto.io.InvalidCipherTextIOException("Error during cipher finalisation", e);
            iOException2 = iOException;
            flush();
            this.out.close();
            if (iOException2 != null) {
            }
        } catch (java.lang.Exception e2) {
            iOException = new java.io.IOException("Error closing stream: ".concat(java.lang.String.valueOf(e2)));
            iOException2 = iOException;
            flush();
            this.out.close();
            if (iOException2 != null) {
            }
        }
        flush();
        this.out.close();
        if (iOException2 != null) {
            throw iOException2;
        }
    }

    public CipherOutputStream(java.io.OutputStream outputStream, javax.crypto.Cipher cipher) {
        super(outputStream);
        this.getHighResolutionOutputSizeshNQ4ISI = new byte[1];
        this.Camera2StreamConfigurationMap = cipher;
    }
}
