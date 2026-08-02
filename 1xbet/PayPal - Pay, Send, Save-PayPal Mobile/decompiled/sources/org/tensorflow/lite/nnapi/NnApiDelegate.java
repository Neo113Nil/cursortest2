package org.tensorflow.lite.nnapi;

/* loaded from: classes18.dex */
public class NnApiDelegate implements org.tensorflow.lite.Delegate, java.lang.AutoCloseable {
    private org.tensorflow.lite.nnapi.NnApiDelegate.PrivateInterface Camera2StreamConfigurationMap;
    private boolean getHighSpeedVideoFpsRanges;
    private org.tensorflow.lite.nnapi.NnApiDelegate.Options getHighSpeedVideoSizes;

    public interface PrivateInterface extends org.tensorflow.lite.Delegate, java.lang.AutoCloseable {
        @Override // org.tensorflow.lite.Delegate, java.io.Closeable, java.lang.AutoCloseable
        void close();

        int getNnapiErrno();
    }

    public static final class Options {
        public static final int EXECUTION_PREFERENCE_FAST_SINGLE_ANSWER = 1;
        public static final int EXECUTION_PREFERENCE_LOW_POWER = 0;
        public static final int EXECUTION_PREFERENCE_SUSTAINED_SPEED = 2;
        public static final int EXECUTION_PREFERENCE_UNDEFINED = -1;
        private int Camera2StreamConfigurationMap = -1;
        private java.lang.String getHighSpeedVideoSizes = null;
        private java.lang.String getHighResolutionOutputSizeshNQ4ISI = null;
        private java.lang.String getOutputFormats = null;
        private java.lang.Integer getHighSpeedVideoFpsRangesFor = null;
        private java.lang.Boolean getOutputMinFrameDuration = null;
        private java.lang.Boolean getHighSpeedVideoFpsRanges = null;
        private long getInputSizeshNQ4ISI = 0;

        public final org.tensorflow.lite.nnapi.NnApiDelegate.Options setExecutionPreference(int i) {
            this.Camera2StreamConfigurationMap = i;
            return this;
        }

        public final org.tensorflow.lite.nnapi.NnApiDelegate.Options setAcceleratorName(java.lang.String str) {
            this.getHighSpeedVideoSizes = str;
            return this;
        }

        public final org.tensorflow.lite.nnapi.NnApiDelegate.Options setCacheDir(java.lang.String str) {
            this.getHighResolutionOutputSizeshNQ4ISI = str;
            return this;
        }

        public final org.tensorflow.lite.nnapi.NnApiDelegate.Options setModelToken(java.lang.String str) {
            this.getOutputFormats = str;
            return this;
        }

        public final org.tensorflow.lite.nnapi.NnApiDelegate.Options setMaxNumberOfDelegatedPartitions(int i) {
            this.getHighSpeedVideoFpsRangesFor = java.lang.Integer.valueOf(i);
            return this;
        }

        public final org.tensorflow.lite.nnapi.NnApiDelegate.Options setUseNnapiCpu(boolean z) {
            this.getOutputMinFrameDuration = java.lang.Boolean.valueOf(z);
            return this;
        }

        public final org.tensorflow.lite.nnapi.NnApiDelegate.Options setAllowFp16(boolean z) {
            this.getHighSpeedVideoFpsRanges = java.lang.Boolean.valueOf(z);
            return this;
        }

        public final org.tensorflow.lite.nnapi.NnApiDelegate.Options setNnApiSupportLibraryHandle(long j) {
            this.getInputSizeshNQ4ISI = j;
            return this;
        }

        public final int getExecutionPreference() {
            return this.Camera2StreamConfigurationMap;
        }

        public final java.lang.String getAcceleratorName() {
            return this.getHighSpeedVideoSizes;
        }

        public final java.lang.String getCacheDir() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        public final java.lang.String getModelToken() {
            return this.getOutputFormats;
        }

        public final int getMaxNumberOfDelegatedPartitions() {
            java.lang.Integer num = this.getHighSpeedVideoFpsRangesFor;
            if (num == null) {
                return -1;
            }
            return num.intValue();
        }

        public final java.lang.Boolean getUseNnapiCpu() {
            return this.getOutputMinFrameDuration;
        }

        public final boolean getAllowFp16() {
            java.lang.Boolean bool = this.getHighSpeedVideoFpsRanges;
            return bool != null && bool.booleanValue();
        }

        public final long getNnApiSupportLibraryHandle() {
            return this.getInputSizeshNQ4ISI;
        }
    }

    public NnApiDelegate(org.tensorflow.lite.nnapi.NnApiDelegate.Options options) {
        org.tensorflow.lite.TensorFlowLite.init();
        this.getHighSpeedVideoSizes = options;
    }

    public NnApiDelegate() {
        this(new org.tensorflow.lite.nnapi.NnApiDelegate.Options());
    }

    public void initWithInterpreterFactoryApi(org.tensorflow.lite.InterpreterFactoryApi interpreterFactoryApi) {
        this.Camera2StreamConfigurationMap = interpreterFactoryApi.createNnApiDelegateImpl(this.getHighSpeedVideoSizes);
        this.getHighSpeedVideoFpsRanges = true;
    }

    @Override // org.tensorflow.lite.Delegate
    public long getNativeHandle() {
        getHighResolutionOutputSizeshNQ4ISI();
        return this.Camera2StreamConfigurationMap.getNativeHandle();
    }

    @Override // org.tensorflow.lite.Delegate, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        org.tensorflow.lite.nnapi.NnApiDelegate.PrivateInterface privateInterface = this.Camera2StreamConfigurationMap;
        if (privateInterface != null) {
            privateInterface.close();
            this.Camera2StreamConfigurationMap = null;
        }
    }

    public int getNnapiErrno() {
        if (!this.getHighSpeedVideoFpsRanges) {
            return 0;
        }
        getHighResolutionOutputSizeshNQ4ISI();
        return this.Camera2StreamConfigurationMap.getNnapiErrno();
    }

    public boolean hasErrors() {
        return getNnapiErrno() != 0;
    }

    private void getHighResolutionOutputSizeshNQ4ISI() {
        java.lang.String str;
        if (this.Camera2StreamConfigurationMap == null) {
            if (this.getHighSpeedVideoFpsRanges) {
                str = "Should not access delegate after delegate has been closed.";
            } else {
                str = "Should not access delegate before interpreter has been constructed.";
            }
            throw new java.lang.IllegalStateException(str);
        }
    }
}
