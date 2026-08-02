package com.thalesgroup.gemalto.securelog;

/* loaded from: classes5.dex */
public final class SecureLogConfig {
    private final java.lang.ref.WeakReference<android.content.Context> Camera2StreamConfigurationMap;
    private java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    private byte[] getHighSpeedVideoFpsRanges;
    private int getHighSpeedVideoFpsRangesFor;
    private int getHighSpeedVideoSizes;
    private java.io.File getHighSpeedVideoSizesFor;
    private byte[] getInputFormats;
    private com.thalesgroup.gemalto.securelog.SecureLogLevel getInputSizeshNQ4ISI;

    /* synthetic */ SecureLogConfig(android.content.Context context, byte b) {
        this(context);
    }

    public static java.lang.String getVersion() {
        return com.thalesgroup.gemalto.securelog.api.BuildConfig.SLOG_LIBRARY_VERSION;
    }

    /* loaded from: classes16.dex */
    public static class Builder {
        private byte[] Camera2StreamConfigurationMap;
        private final android.content.Context getHighResolutionOutputSizeshNQ4ISI;
        private java.io.File getHighSpeedVideoSizesFor;
        private byte[] getInputSizeshNQ4ISI;
        private java.lang.String getHighSpeedVideoFpsRanges = "d5a1";
        private int getHighSpeedVideoSizes = 8;
        private int getHighSpeedVideoFpsRangesFor = 1024;
        private com.thalesgroup.gemalto.securelog.SecureLogLevel getInputFormats = com.thalesgroup.gemalto.securelog.SecureLogLevel.WARN;

        public Builder(android.content.Context context) {
            com.thalesgroup.gemalto.securelog.internal.Utils.verifyParam(context);
            android.content.Context applicationContext = context.getApplicationContext();
            this.getHighResolutionOutputSizeshNQ4ISI = applicationContext;
            java.io.File file = new java.io.File(applicationContext.getFilesDir(), "slog-v2");
            this.getHighSpeedVideoSizesFor = file;
            if (file.exists()) {
                return;
            }
            this.getHighSpeedVideoSizesFor.mkdir();
        }

        public com.thalesgroup.gemalto.securelog.SecureLogConfig.Builder fileID(java.lang.String str) {
            com.thalesgroup.gemalto.securelog.internal.Utils.verifyParam(str);
            if (str.length() > 10) {
                throw new java.lang.IllegalArgumentException("Length is limited to 10!");
            }
            this.getHighSpeedVideoFpsRanges = str;
            return this;
        }

        public com.thalesgroup.gemalto.securelog.SecureLogConfig.Builder publicKey(byte[] bArr, byte[] bArr2) {
            this.getInputSizeshNQ4ISI = bArr;
            this.Camera2StreamConfigurationMap = bArr2;
            return this;
        }

        public com.thalesgroup.gemalto.securelog.SecureLogConfig.Builder rollingFileMaxCount(int i) {
            if (i <= 0 || i >= 100) {
                throw new java.lang.IllegalArgumentException("Invalid value. Valid values are in [1..99]");
            }
            this.getHighSpeedVideoSizes = i;
            return this;
        }

        public com.thalesgroup.gemalto.securelog.SecureLogConfig.Builder rollingFileMaxSizeInKB(int i) {
            if (i <= 0) {
                throw new java.lang.IllegalArgumentException("Invalid max file size!");
            }
            this.getHighSpeedVideoFpsRangesFor = i;
            return this;
        }

        public com.thalesgroup.gemalto.securelog.SecureLogConfig.Builder directory(java.io.File file) {
            com.thalesgroup.gemalto.securelog.internal.Utils.verifyParam(file);
            if (!file.getName().endsWith("-v2")) {
                java.lang.String parent = file.getParent();
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(file.getName());
                sb.append("-v2");
                file = new java.io.File(parent, sb.toString());
            }
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(".");
            sb2.append(java.lang.System.currentTimeMillis());
            java.io.File file2 = new java.io.File(file, sb2.toString());
            if (!file2.mkdirs()) {
                throw new java.lang.IllegalArgumentException("Could not write to the folder: ".concat(java.lang.String.valueOf(file)));
            }
            file2.delete();
            this.getHighSpeedVideoSizesFor = file;
            return this;
        }

        public com.thalesgroup.gemalto.securelog.SecureLogConfig.Builder level(com.thalesgroup.gemalto.securelog.SecureLogLevel secureLogLevel) {
            com.thalesgroup.gemalto.securelog.internal.Utils.verifyParam(secureLogLevel);
            this.getInputFormats = secureLogLevel;
            return this;
        }

        public com.thalesgroup.gemalto.securelog.SecureLogConfig build() {
            com.thalesgroup.gemalto.securelog.SecureLogConfig secureLogConfig = new com.thalesgroup.gemalto.securelog.SecureLogConfig(this.getHighResolutionOutputSizeshNQ4ISI, (byte) 0);
            secureLogConfig.getHighResolutionOutputSizeshNQ4ISI = this.getHighSpeedVideoFpsRanges;
            byte[] bArr = this.getInputSizeshNQ4ISI;
            if (bArr != null && this.Camera2StreamConfigurationMap != null) {
                secureLogConfig.getInputFormats = bArr;
                secureLogConfig.getHighSpeedVideoFpsRanges = this.Camera2StreamConfigurationMap;
            }
            secureLogConfig.getHighSpeedVideoSizes = this.getHighSpeedVideoSizes;
            secureLogConfig.getHighSpeedVideoFpsRangesFor = this.getHighSpeedVideoFpsRangesFor;
            secureLogConfig.getHighSpeedVideoSizesFor = this.getHighSpeedVideoSizesFor;
            secureLogConfig.getInputSizeshNQ4ISI = this.getInputFormats;
            return secureLogConfig;
        }
    }

    private SecureLogConfig(android.content.Context context) {
        this.getHighSpeedVideoSizes = -1;
        this.getHighSpeedVideoFpsRangesFor = -1;
        this.Camera2StreamConfigurationMap = new java.lang.ref.WeakReference<>(context.getApplicationContext());
    }

    public final android.content.Context getContext() {
        java.lang.ref.WeakReference<android.content.Context> weakReference = this.Camera2StreamConfigurationMap;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public final java.lang.String getFileID() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final byte[] getModulus() {
        return this.getInputFormats;
    }

    public final byte[] getExponents() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final int getRollingFileMaxCount() {
        return this.getHighSpeedVideoSizes;
    }

    public final int getRollingFileMaxSize() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final java.io.File getLogDir() {
        return this.getHighSpeedVideoSizesFor;
    }

    public final com.thalesgroup.gemalto.securelog.SecureLogLevel getLogLevel() {
        return this.getInputSizeshNQ4ISI;
    }
}
