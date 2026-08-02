package androidx.media3.common.util;

/* loaded from: classes7.dex */
public final class AtomicFile {
    private final java.io.File Camera2StreamConfigurationMap;
    private final java.io.File getHighSpeedVideoFpsRangesFor;

    public AtomicFile(java.io.File file) {
        this.getHighSpeedVideoFpsRangesFor = file;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(file.getPath());
        sb.append(".bak");
        this.Camera2StreamConfigurationMap = new java.io.File(sb.toString());
    }

    public final boolean exists() {
        return this.getHighSpeedVideoFpsRangesFor.exists() || this.Camera2StreamConfigurationMap.exists();
    }

    public final void delete() {
        this.getHighSpeedVideoFpsRangesFor.delete();
        this.Camera2StreamConfigurationMap.delete();
    }

    public final java.io.OutputStream startWrite() throws java.io.IOException {
        if (this.getHighSpeedVideoFpsRangesFor.exists()) {
            if (!this.Camera2StreamConfigurationMap.exists()) {
                if (!this.getHighSpeedVideoFpsRangesFor.renameTo(this.Camera2StreamConfigurationMap)) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Couldn't rename file ");
                    sb.append(this.getHighSpeedVideoFpsRangesFor);
                    sb.append(" to backup file ");
                    sb.append(this.Camera2StreamConfigurationMap);
                    androidx.media3.common.util.Log.w("AtomicFile", sb.toString());
                }
            } else {
                this.getHighSpeedVideoFpsRangesFor.delete();
            }
        }
        try {
            return new androidx.media3.common.util.AtomicFile.AtomicFileOutputStream(this.getHighSpeedVideoFpsRangesFor);
        } catch (java.io.FileNotFoundException e) {
            java.io.File parentFile = this.getHighSpeedVideoFpsRangesFor.getParentFile();
            if (parentFile == null || !parentFile.mkdirs()) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Couldn't create ");
                sb2.append(this.getHighSpeedVideoFpsRangesFor);
                throw new java.io.IOException(sb2.toString(), e);
            }
            try {
                return new androidx.media3.common.util.AtomicFile.AtomicFileOutputStream(this.getHighSpeedVideoFpsRangesFor);
            } catch (java.io.FileNotFoundException e2) {
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Couldn't create ");
                sb3.append(this.getHighSpeedVideoFpsRangesFor);
                throw new java.io.IOException(sb3.toString(), e2);
            }
        }
    }

    public final void endWrite(java.io.OutputStream outputStream) throws java.io.IOException {
        outputStream.close();
        this.Camera2StreamConfigurationMap.delete();
    }

    static final class AtomicFileOutputStream extends java.io.OutputStream {
        private boolean getHighResolutionOutputSizeshNQ4ISI = false;
        private final java.io.FileOutputStream getHighSpeedVideoFpsRanges;

        public AtomicFileOutputStream(java.io.File file) throws java.io.FileNotFoundException {
            this.getHighSpeedVideoFpsRanges = new java.io.FileOutputStream(file);
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws java.io.IOException {
            if (this.getHighResolutionOutputSizeshNQ4ISI) {
                return;
            }
            this.getHighResolutionOutputSizeshNQ4ISI = true;
            flush();
            try {
                this.getHighSpeedVideoFpsRanges.getFD().sync();
            } catch (java.io.IOException e) {
                androidx.media3.common.util.Log.w("AtomicFile", "Failed to sync file descriptor:", e);
            }
            this.getHighSpeedVideoFpsRanges.close();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public final void flush() throws java.io.IOException {
            this.getHighSpeedVideoFpsRanges.flush();
        }

        @Override // java.io.OutputStream
        public final void write(int i) throws java.io.IOException {
            this.getHighSpeedVideoFpsRanges.write(i);
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr) throws java.io.IOException {
            this.getHighSpeedVideoFpsRanges.write(bArr);
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr, int i, int i2) throws java.io.IOException {
            this.getHighSpeedVideoFpsRanges.write(bArr, i, i2);
        }
    }

    public final java.io.InputStream openRead() throws java.io.FileNotFoundException {
        if (this.Camera2StreamConfigurationMap.exists()) {
            this.getHighSpeedVideoFpsRangesFor.delete();
            this.Camera2StreamConfigurationMap.renameTo(this.getHighSpeedVideoFpsRangesFor);
        }
        return new java.io.FileInputStream(this.getHighSpeedVideoFpsRangesFor);
    }
}
