package org.bouncycastle.est;

/* loaded from: classes17.dex */
public class ESTException extends java.io.IOException {
    private java.lang.Throwable Camera2StreamConfigurationMap;
    private int getHighSpeedVideoFpsRanges;
    private java.io.InputStream getHighSpeedVideoFpsRangesFor;

    public int getStatusCode() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // java.lang.Throwable
    public java.lang.String getMessage() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(super.getMessage());
        sb.append(" HTTP Status Code: ");
        sb.append(this.getHighSpeedVideoFpsRanges);
        return sb.toString();
    }

    @Override // java.lang.Throwable
    public java.lang.Throwable getCause() {
        return this.Camera2StreamConfigurationMap;
    }

    public java.io.InputStream getBody() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public ESTException(java.lang.String str, java.lang.Throwable th, int i, java.io.InputStream inputStream) {
        super(str);
        this.Camera2StreamConfigurationMap = th;
        this.getHighSpeedVideoFpsRanges = i;
        if (inputStream == null) {
            this.getHighSpeedVideoFpsRangesFor = null;
            return;
        }
        byte[] bArr = new byte[8192];
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read < 0) {
                    break;
                }
                if (byteArrayOutputStream.size() + read > 8192) {
                    byteArrayOutputStream.write(bArr, 0, 8192 - byteArrayOutputStream.size());
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            } catch (java.lang.Exception unused) {
                return;
            }
        }
        byteArrayOutputStream.flush();
        byteArrayOutputStream.close();
        this.getHighSpeedVideoFpsRangesFor = new java.io.ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        inputStream.close();
    }

    public ESTException(java.lang.String str, java.lang.Throwable th) {
        super(str);
        this.Camera2StreamConfigurationMap = th;
        this.getHighSpeedVideoFpsRangesFor = null;
        this.getHighSpeedVideoFpsRanges = 0;
    }

    public ESTException(java.lang.String str) {
        this(str, null);
    }
}
