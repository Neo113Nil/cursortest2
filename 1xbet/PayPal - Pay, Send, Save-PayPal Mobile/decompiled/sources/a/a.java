package a;

/* loaded from: classes5.dex */
public class a {
    private boolean Camera2StreamConfigurationMap;
    private boolean getHighResolutionOutputSizeshNQ4ISI;
    private java.io.File getHighSpeedVideoFpsRangesFor;

    public boolean a(java.lang.String str) {
        return new java.io.File(this.getHighSpeedVideoFpsRangesFor, str).delete();
    }

    public void a(java.lang.String str, byte[] bArr) throws java.io.IOException {
        java.lang.Throwable th;
        if (!this.getHighResolutionOutputSizeshNQ4ISI || !this.Camera2StreamConfigurationMap) {
            return;
        }
        java.io.FileOutputStream fileOutputStream = null;
        try {
            if (this.getHighSpeedVideoFpsRangesFor.mkdirs() || this.getHighSpeedVideoFpsRangesFor.isDirectory()) {
                java.io.FileOutputStream fileOutputStream2 = new java.io.FileOutputStream(new java.io.File(this.getHighSpeedVideoFpsRangesFor, str));
                try {
                    fileOutputStream2.write(bArr);
                    fileOutputStream = fileOutputStream2;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    fileOutputStream = fileOutputStream2;
                    lib.android.paypal.com.magnessdk.f.a(getClass(), fileOutputStream);
                    throw th;
                }
            }
            lib.android.paypal.com.magnessdk.f.a(getClass(), fileOutputStream);
        } catch (java.lang.Throwable th3) {
            th = th3;
        }
    }

    public a() {
        this.getHighResolutionOutputSizeshNQ4ISI = false;
        this.Camera2StreamConfigurationMap = false;
        java.lang.String externalStorageState = android.os.Environment.getExternalStorageState();
        externalStorageState.hashCode();
        if (externalStorageState.equals("mounted")) {
            this.Camera2StreamConfigurationMap = true;
            this.getHighResolutionOutputSizeshNQ4ISI = true;
        } else if (externalStorageState.equals("mounted_ro")) {
            this.getHighResolutionOutputSizeshNQ4ISI = true;
            this.Camera2StreamConfigurationMap = false;
        } else {
            this.Camera2StreamConfigurationMap = false;
            this.getHighResolutionOutputSizeshNQ4ISI = false;
        }
        this.getHighSpeedVideoFpsRangesFor = android.os.Environment.getExternalStorageDirectory();
    }

    public void c(java.lang.String str) {
        this.getHighSpeedVideoFpsRangesFor = new java.io.File(str);
    }

    public java.lang.String b(java.lang.String str) throws java.io.IOException {
        java.lang.Throwable th;
        java.io.FileInputStream fileInputStream;
        byte[] bArr = new byte[1024];
        java.io.FileInputStream fileInputStream2 = null;
        if (!this.Camera2StreamConfigurationMap) {
            return null;
        }
        try {
            fileInputStream = new java.io.FileInputStream(new java.io.File(this.getHighSpeedVideoFpsRangesFor, str));
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
        try {
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            for (int read = fileInputStream.read(bArr, 0, 1024); read != -1; read = fileInputStream.read(bArr, 0, 1024)) {
                byteArrayOutputStream.write(bArr, 0, read);
            }
            java.lang.String str2 = new java.lang.String(byteArrayOutputStream.toByteArray(), "UTF-8");
            lib.android.paypal.com.magnessdk.f.a(getClass(), fileInputStream);
            return str2;
        } catch (java.lang.Throwable th3) {
            th = th3;
            fileInputStream2 = fileInputStream;
            lib.android.paypal.com.magnessdk.f.a(getClass(), fileInputStream2);
            throw th;
        }
    }
}
