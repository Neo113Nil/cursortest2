package androidx.core.util;

/* loaded from: classes7.dex */
public class AtomicFile {
    private final java.io.File Camera2StreamConfigurationMap;
    private final java.io.File getHighResolutionOutputSizeshNQ4ISI;
    private final java.io.File getHighSpeedVideoFpsRangesFor;

    public AtomicFile(java.io.File file) {
        this.getHighSpeedVideoFpsRangesFor = file;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(file.getPath());
        sb.append(".new");
        this.getHighResolutionOutputSizeshNQ4ISI = new java.io.File(sb.toString());
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(file.getPath());
        sb2.append(".bak");
        this.Camera2StreamConfigurationMap = new java.io.File(sb2.toString());
    }

    public java.io.File getBaseFile() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public void delete() {
        this.getHighSpeedVideoFpsRangesFor.delete();
        this.getHighResolutionOutputSizeshNQ4ISI.delete();
        this.Camera2StreamConfigurationMap.delete();
    }

    public java.io.FileOutputStream startWrite() throws java.io.IOException {
        if (this.Camera2StreamConfigurationMap.exists()) {
            java.io.File file = this.Camera2StreamConfigurationMap;
            java.io.File file2 = this.getHighSpeedVideoFpsRangesFor;
            if (file2.isDirectory()) {
                file2.delete();
            }
            file.renameTo(file2);
        }
        try {
            return new java.io.FileOutputStream(this.getHighResolutionOutputSizeshNQ4ISI);
        } catch (java.io.FileNotFoundException unused) {
            if (!this.getHighResolutionOutputSizeshNQ4ISI.getParentFile().mkdirs()) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed to create directory for ");
                sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
                throw new java.io.IOException(sb.toString());
            }
            try {
                return new java.io.FileOutputStream(this.getHighResolutionOutputSizeshNQ4ISI);
            } catch (java.io.FileNotFoundException e) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Failed to create new file ");
                sb2.append(this.getHighResolutionOutputSizeshNQ4ISI);
                throw new java.io.IOException(sb2.toString(), e);
            }
        }
    }

    public void finishWrite(java.io.FileOutputStream fileOutputStream) {
        if (fileOutputStream == null) {
            return;
        }
        Camera2StreamConfigurationMap(fileOutputStream);
        try {
            fileOutputStream.close();
        } catch (java.io.IOException unused) {
        }
        java.io.File file = this.getHighResolutionOutputSizeshNQ4ISI;
        java.io.File file2 = this.getHighSpeedVideoFpsRangesFor;
        if (file2.isDirectory()) {
            file2.delete();
        }
        file.renameTo(file2);
    }

    public void failWrite(java.io.FileOutputStream fileOutputStream) {
        if (fileOutputStream != null) {
            Camera2StreamConfigurationMap(fileOutputStream);
            try {
                fileOutputStream.close();
            } catch (java.io.IOException unused) {
            }
            this.getHighResolutionOutputSizeshNQ4ISI.delete();
        }
    }

    public java.io.FileInputStream openRead() throws java.io.FileNotFoundException {
        if (this.Camera2StreamConfigurationMap.exists()) {
            java.io.File file = this.Camera2StreamConfigurationMap;
            java.io.File file2 = this.getHighSpeedVideoFpsRangesFor;
            if (file2.isDirectory()) {
                file2.delete();
            }
            file.renameTo(file2);
        }
        if (this.getHighResolutionOutputSizeshNQ4ISI.exists() && this.getHighSpeedVideoFpsRangesFor.exists()) {
            this.getHighResolutionOutputSizeshNQ4ISI.delete();
        }
        return new java.io.FileInputStream(this.getHighSpeedVideoFpsRangesFor);
    }

    public byte[] readFully() throws java.io.IOException {
        java.io.FileInputStream openRead = openRead();
        try {
            byte[] bArr = new byte[openRead.available()];
            int i = 0;
            while (true) {
                int read = openRead.read(bArr, i, bArr.length - i);
                if (read <= 0) {
                    return bArr;
                }
                i += read;
                int available = openRead.available();
                if (available > bArr.length - i) {
                    byte[] bArr2 = new byte[available + i];
                    java.lang.System.arraycopy(bArr, 0, bArr2, 0, i);
                    bArr = bArr2;
                }
            }
        } finally {
            openRead.close();
        }
    }

    private static boolean Camera2StreamConfigurationMap(java.io.FileOutputStream fileOutputStream) {
        try {
            fileOutputStream.getFD().sync();
            return true;
        } catch (java.io.IOException unused) {
            return false;
        }
    }
}
