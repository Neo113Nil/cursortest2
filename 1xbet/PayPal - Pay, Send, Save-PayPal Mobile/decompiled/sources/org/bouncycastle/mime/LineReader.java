package org.bouncycastle.mime;

/* loaded from: classes17.dex */
class LineReader {
    private final java.io.InputStream Camera2StreamConfigurationMap;
    private int getHighResolutionOutputSizeshNQ4ISI = -1;

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0028, code lost:
    
        r2 = r4.Camera2StreamConfigurationMap.read();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002e, code lost:
    
        if (r2 == 10) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0030, code lost:
    
        if (r2 < 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0032, code lost:
    
        r4.getHighResolutionOutputSizeshNQ4ISI = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x001a, code lost:
    
        r1 = r4.Camera2StreamConfigurationMap.read();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final java.lang.String Camera2StreamConfigurationMap() throws java.io.IOException {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i != -1) {
            if (i == 13) {
                return "";
            }
            this.getHighResolutionOutputSizeshNQ4ISI = -1;
            while (i >= 0 && i != 13 && i != 10) {
                byteArrayOutputStream.write(i);
            }
            if (i < 0) {
                return null;
            }
            return org.bouncycastle.util.Strings.fromUTF8ByteArray(byteArrayOutputStream.toByteArray());
        }
        i = this.Camera2StreamConfigurationMap.read();
    }

    LineReader(java.io.InputStream inputStream) {
        this.Camera2StreamConfigurationMap = inputStream;
    }
}
