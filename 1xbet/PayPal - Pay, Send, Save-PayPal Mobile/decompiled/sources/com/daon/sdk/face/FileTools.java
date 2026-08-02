package com.daon.sdk.face;

/* loaded from: classes7.dex */
public class FileTools {

    static class a implements java.util.concurrent.Callable {
        private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;
        private final android.content.Context getHighSpeedVideoSizes;

        public a(android.content.Context context, java.lang.String str) {
            this.getHighSpeedVideoSizes = context;
            this.getHighResolutionOutputSizeshNQ4ISI = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // java.util.concurrent.Callable
        /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
        public byte[] call() {
            android.content.Context context = this.getHighSpeedVideoSizes;
            if (context == null) {
                return com.daon.sdk.face.FileTools.getHighResolutionOutputSizeshNQ4ISI(this.getHighResolutionOutputSizeshNQ4ISI);
            }
            java.io.FileInputStream openFileInput = context.openFileInput(this.getHighResolutionOutputSizeshNQ4ISI);
            try {
                java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                while (openFileInput.available() > 0) {
                    byteArrayOutputStream.write(openFileInput.read());
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                openFileInput.close();
                return byteArray;
            } catch (java.lang.Throwable th) {
                if (openFileInput != null) {
                    try {
                        openFileInput.close();
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
    }

    static class b implements java.util.concurrent.Callable {
        private final android.content.Context getHighResolutionOutputSizeshNQ4ISI;
        private final byte[] getHighSpeedVideoFpsRanges;
        private final java.lang.String getHighSpeedVideoFpsRangesFor;

        public b(android.content.Context context, java.lang.String str, byte[] bArr) {
            this.getHighResolutionOutputSizeshNQ4ISI = context;
            this.getHighSpeedVideoFpsRangesFor = str;
            this.getHighSpeedVideoFpsRanges = bArr;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // java.util.concurrent.Callable
        /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
        public java.lang.Void call() {
            java.io.FileOutputStream openFileOutput = this.getHighResolutionOutputSizeshNQ4ISI.openFileOutput(this.getHighSpeedVideoFpsRangesFor, 0);
            try {
                openFileOutput.write(this.getHighSpeedVideoFpsRanges);
                openFileOutput.close();
                return null;
            } catch (java.lang.Throwable th) {
                if (openFileOutput != null) {
                    try {
                        openFileOutput.close();
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
    }

    public static void cleanDirectory(java.io.File file) throws java.io.IOException {
        for (java.io.File file2 : listFiles(file)) {
            forceDelete(file2);
        }
    }

    public static boolean delete(java.io.File file) {
        if (file == null) {
            return false;
        }
        try {
            if (file.isDirectory()) {
                cleanDirectory(file);
            }
        } catch (java.lang.Exception unused) {
        }
        try {
            return file.delete();
        } catch (java.lang.Exception unused2) {
            return false;
        }
    }

    public static void deleteDirectory(java.io.File file) throws java.io.IOException {
        if (file.exists()) {
            cleanDirectory(file);
            if (file.delete()) {
                return;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unable to delete directory ");
            sb.append(file);
            sb.append(".");
            throw new java.io.IOException(sb.toString());
        }
    }

    public static void forceDelete(java.io.File file) throws java.io.IOException {
        if (file.isDirectory()) {
            deleteDirectory(file);
            return;
        }
        boolean exists = file.exists();
        if (file.delete()) {
            return;
        }
        if (!exists) {
            throw new java.io.FileNotFoundException("File does not exist: ".concat(java.lang.String.valueOf(file)));
        }
        throw new java.io.IOException("Unable to delete file: ".concat(java.lang.String.valueOf(file)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:34:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] getHighResolutionOutputSizeshNQ4ISI(java.lang.String str) {
        byte[] bArr;
        java.lang.Exception e;
        java.io.DataInputStream dataInputStream;
        int length;
        java.io.DataInputStream dataInputStream2 = null;
        if (str == null) {
            return null;
        }
        try {
            java.io.File file = new java.io.File(str);
            if (file.exists()) {
                dataInputStream = new java.io.DataInputStream(new java.io.FileInputStream(file));
                try {
                    try {
                        length = (int) file.length();
                        bArr = new byte[length];
                    } catch (java.lang.Exception e2) {
                        bArr = null;
                        e = e2;
                    }
                    try {
                        if (dataInputStream.read(bArr, 0, length) < length) {
                            dataInputStream.close();
                            return null;
                        }
                        dataInputStream2 = dataInputStream;
                    } catch (java.lang.Exception e3) {
                        e = e3;
                        e.getMessage();
                        if (dataInputStream != null) {
                            dataInputStream.close();
                        }
                        return bArr;
                    }
                } catch (java.lang.Throwable th) {
                    dataInputStream2 = dataInputStream;
                    th = th;
                    if (dataInputStream2 != null) {
                        dataInputStream2.close();
                    }
                    throw th;
                }
            } else {
                bArr = null;
            }
            if (dataInputStream2 != null) {
                dataInputStream2.close();
            }
            return bArr;
        } catch (java.lang.Exception e4) {
            bArr = null;
            e = e4;
            dataInputStream = null;
        } catch (java.lang.Throwable th2) {
            th = th2;
            if (dataInputStream2 != null) {
            }
            throw th;
        }
    }

    public static java.io.File[] listFiles(java.io.File file) throws java.io.IOException {
        if (!file.exists()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(file);
            sb.append(" does not exist");
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        if (!file.isDirectory()) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(file);
            sb2.append(" is not a directory");
            throw new java.lang.IllegalArgumentException(sb2.toString());
        }
        java.io.File[] listFiles = file.listFiles();
        if (listFiles == null) {
            throw new java.io.IOException("Failed to list contents of ".concat(java.lang.String.valueOf(file)));
        }
        java.util.Arrays.sort(listFiles);
        return listFiles;
    }

    public static byte[] read(android.content.Context context, java.lang.String str) throws java.lang.Exception {
        return (byte[]) com.daon.sdk.face.util.a.b(new com.daon.sdk.face.FileTools.a(context, str));
    }

    public static void write(android.content.Context context, java.lang.String str, byte[] bArr) throws java.lang.Exception {
        com.daon.sdk.face.util.a.b(new com.daon.sdk.face.FileTools.b(context, str, bArr));
    }
}
