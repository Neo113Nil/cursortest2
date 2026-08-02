package my.com.softspace.common.util;

/* loaded from: classes17.dex */
public class AndroidUtil {
    public static byte[] readRawResource(android.content.Context context, int i) {
        try {
            java.io.InputStream openRawResource = context.getResources().openRawResource(i);
            try {
                java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                try {
                    stream(openRawResource, byteArrayOutputStream);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    if (openRawResource != null) {
                        openRawResource.close();
                    }
                    return byteArray;
                } finally {
                }
            } finally {
            }
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public static void stream(java.io.InputStream inputStream, java.io.OutputStream outputStream) throws java.io.IOException {
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read <= 0) {
                return;
            } else {
                outputStream.write(bArr, 0, read);
            }
        }
    }

    public static byte[] runCmd(java.lang.String str) {
        try {
            java.lang.Process exec = java.lang.Runtime.getRuntime().exec(str);
            byte[] highSpeedVideoSizes = getHighSpeedVideoSizes(exec.getInputStream());
            int waitFor = exec.waitFor();
            if (sspog.SimpleLogger.isVerbose()) {
                sspog.SimpleLogger.v(">>>", "runCmd %s [%d]", str, java.lang.Integer.valueOf(waitFor));
            }
            if (exec.waitFor() == 0) {
                return highSpeedVideoSizes;
            }
            return null;
        } catch (java.lang.Exception e) {
            sspog.SimpleLogger.e(">>>", e, "runCmd error: ", str);
            return null;
        }
    }

    public static java.lang.String runFailableCmd(java.lang.String... strArr) {
        for (java.lang.String str : strArr) {
            byte[] runCmd = runCmd(str);
            if (runCmd != null) {
                return new java.lang.String(runCmd);
            }
        }
        return null;
    }

    public static byte[] calculateSha256OfFile(java.io.File file) throws java.lang.Exception {
        int i;
        java.io.FileInputStream fileInputStream = new java.io.FileInputStream(file);
        try {
            java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("SHA-256");
            byte[] bArr = new byte[65536];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                if (read > 0) {
                    messageDigest.update(bArr, 0, read);
                }
            }
            byte[] digest = messageDigest.digest();
            for (byte b : digest) {
                java.lang.Byte.valueOf(b);
            }
            fileInputStream.close();
            return digest;
        } catch (java.lang.Throwable th) {
            try {
                fileInputStream.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static byte[] getHighSpeedVideoSizes(java.io.InputStream inputStream) {
        try {
            try {
                java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream(2048);
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read <= 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
                return byteArrayOutputStream.toByteArray();
            } catch (java.io.IOException e) {
                sspog.SimpleLogger.e(">>>", e, "readall error.", new java.lang.Object[0]);
                try {
                    inputStream.close();
                    return null;
                } catch (java.io.IOException unused) {
                    return null;
                }
            }
        } finally {
            try {
                inputStream.close();
            } catch (java.io.IOException unused2) {
            }
        }
    }
}
