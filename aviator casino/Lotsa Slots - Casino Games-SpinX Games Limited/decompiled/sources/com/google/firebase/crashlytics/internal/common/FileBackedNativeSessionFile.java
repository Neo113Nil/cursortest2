package com.google.firebase.crashlytics.internal.common;

/* loaded from: classes3.dex */
class FileBackedNativeSessionFile implements com.google.firebase.crashlytics.internal.common.NativeSessionFile {
    private final java.lang.String dataTransportFilename;
    private final java.io.File file;
    private final java.lang.String reportsEndpointFilename;

    FileBackedNativeSessionFile(java.lang.String str, java.lang.String str2, java.io.File file) {
        this.dataTransportFilename = str;
        this.reportsEndpointFilename = str2;
        this.file = file;
    }

    @Override // com.google.firebase.crashlytics.internal.common.NativeSessionFile
    public java.lang.String getReportsEndpointFilename() {
        return this.reportsEndpointFilename;
    }

    @Override // com.google.firebase.crashlytics.internal.common.NativeSessionFile
    public java.io.InputStream getStream() {
        if (this.file.exists() && this.file.isFile()) {
            try {
                return new java.io.FileInputStream(this.file);
            } catch (java.io.FileNotFoundException unused) {
            }
        }
        return null;
    }

    @Override // com.google.firebase.crashlytics.internal.common.NativeSessionFile
    public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File asFilePayload() {
        byte[] asGzippedBytes = asGzippedBytes();
        if (asGzippedBytes != null) {
            return com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File.builder().setContents(asGzippedBytes).setFilename(this.dataTransportFilename).build();
        }
        return null;
    }

    private byte[] asGzippedBytes() {
        byte[] bArr = new byte[8192];
        try {
            java.io.InputStream stream = getStream();
            try {
                java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                try {
                    java.util.zip.GZIPOutputStream gZIPOutputStream = new java.util.zip.GZIPOutputStream(byteArrayOutputStream);
                    if (stream != null) {
                        while (true) {
                            try {
                                int read = stream.read(bArr);
                                if (read <= 0) {
                                    break;
                                }
                                gZIPOutputStream.write(bArr, 0, read);
                            } finally {
                            }
                        }
                        gZIPOutputStream.finish();
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        gZIPOutputStream.close();
                        byteArrayOutputStream.close();
                        if (stream != null) {
                            stream.close();
                        }
                        return byteArray;
                    }
                    gZIPOutputStream.close();
                    byteArrayOutputStream.close();
                    if (stream != null) {
                        stream.close();
                    }
                    return null;
                } finally {
                }
            } finally {
            }
        } catch (java.io.IOException unused) {
            return null;
        }
    }
}
