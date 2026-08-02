package org.tensorflow.lite;

/* loaded from: classes18.dex */
public interface InterpreterApi extends java.lang.AutoCloseable {
    void allocateTensors();

    @Override // java.lang.AutoCloseable
    void close();

    int getInputIndex(java.lang.String str);

    org.tensorflow.lite.Tensor getInputTensor(int i);

    int getInputTensorCount();

    org.tensorflow.lite.Tensor getInputTensorFromSignature(java.lang.String str, java.lang.String str2);

    java.lang.Long getLastNativeInferenceDurationNanoseconds();

    int getOutputIndex(java.lang.String str);

    org.tensorflow.lite.Tensor getOutputTensor(int i);

    int getOutputTensorCount();

    org.tensorflow.lite.Tensor getOutputTensorFromSignature(java.lang.String str, java.lang.String str2);

    java.lang.String[] getSignatureInputs(java.lang.String str);

    java.lang.String[] getSignatureKeys();

    java.lang.String[] getSignatureOutputs(java.lang.String str);

    void resizeInput(int i, int[] iArr);

    void resizeInput(int i, int[] iArr, boolean z);

    void run(java.lang.Object obj, java.lang.Object obj2);

    void runForMultipleInputsOutputs(java.lang.Object[] objArr, java.util.Map<java.lang.Integer, java.lang.Object> map);

    void runSignature(java.util.Map<java.lang.String, java.lang.Object> map, java.util.Map<java.lang.String, java.lang.Object> map2);

    void runSignature(java.util.Map<java.lang.String, java.lang.Object> map, java.util.Map<java.lang.String, java.lang.Object> map2, java.lang.String str);

    public static class Options {
        final java.util.List<org.tensorflow.lite.Delegate> Camera2StreamConfigurationMap;
        org.tensorflow.lite.InterpreterApi.Options.TfLiteRuntime getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Boolean getHighSpeedVideoFpsRanges;
        java.lang.Boolean getHighSpeedVideoFpsRangesFor;
        int getHighSpeedVideoSizes;
        java.lang.Boolean getHighSpeedVideoSizesFor;
        org.tensorflow.lite.acceleration.ValidatedAccelerationConfig getInputFormats;
        private final java.util.List<org.tensorflow.lite.DelegateFactory> getOutputMinFrameDuration;

        public enum TfLiteRuntime {
            FROM_APPLICATION_ONLY,
            FROM_SYSTEM_ONLY,
            PREFER_SYSTEM_OVER_APPLICATION
        }

        public Options() {
            this.getHighResolutionOutputSizeshNQ4ISI = org.tensorflow.lite.InterpreterApi.Options.TfLiteRuntime.FROM_APPLICATION_ONLY;
            this.getHighSpeedVideoSizes = -1;
            this.Camera2StreamConfigurationMap = new java.util.ArrayList();
            this.getOutputMinFrameDuration = new java.util.ArrayList();
        }

        public Options(org.tensorflow.lite.InterpreterApi.Options options) {
            this.getHighResolutionOutputSizeshNQ4ISI = org.tensorflow.lite.InterpreterApi.Options.TfLiteRuntime.FROM_APPLICATION_ONLY;
            this.getHighSpeedVideoSizes = -1;
            this.getHighSpeedVideoSizes = options.getHighSpeedVideoSizes;
            this.getHighSpeedVideoFpsRanges = options.getHighSpeedVideoFpsRanges;
            this.getHighSpeedVideoFpsRangesFor = options.getHighSpeedVideoFpsRangesFor;
            this.Camera2StreamConfigurationMap = new java.util.ArrayList(options.Camera2StreamConfigurationMap);
            this.getOutputMinFrameDuration = new java.util.ArrayList(options.getOutputMinFrameDuration);
            this.getHighResolutionOutputSizeshNQ4ISI = options.getHighResolutionOutputSizeshNQ4ISI;
            this.getInputFormats = options.getInputFormats;
            this.getHighSpeedVideoSizesFor = options.getHighSpeedVideoSizesFor;
        }

        public org.tensorflow.lite.InterpreterApi.Options setNumThreads(int i) {
            this.getHighSpeedVideoSizes = i;
            return this;
        }

        public int getNumThreads() {
            return this.getHighSpeedVideoSizes;
        }

        public org.tensorflow.lite.InterpreterApi.Options setUseNNAPI(boolean z) {
            this.getHighSpeedVideoFpsRanges = java.lang.Boolean.valueOf(z);
            return this;
        }

        public boolean getUseNNAPI() {
            java.lang.Boolean bool = this.getHighSpeedVideoFpsRanges;
            return bool != null && bool.booleanValue();
        }

        public org.tensorflow.lite.InterpreterApi.Options setCancellable(boolean z) {
            this.getHighSpeedVideoFpsRangesFor = java.lang.Boolean.valueOf(z);
            return this;
        }

        public boolean isCancellable() {
            java.lang.Boolean bool = this.getHighSpeedVideoFpsRangesFor;
            return bool != null && bool.booleanValue();
        }

        public org.tensorflow.lite.InterpreterApi.Options addDelegate(org.tensorflow.lite.Delegate delegate) {
            this.Camera2StreamConfigurationMap.add(delegate);
            return this;
        }

        public java.util.List<org.tensorflow.lite.Delegate> getDelegates() {
            return java.util.Collections.unmodifiableList(this.Camera2StreamConfigurationMap);
        }

        public org.tensorflow.lite.InterpreterApi.Options addDelegateFactory(org.tensorflow.lite.DelegateFactory delegateFactory) {
            this.getOutputMinFrameDuration.add(delegateFactory);
            return this;
        }

        public java.util.List<org.tensorflow.lite.DelegateFactory> getDelegateFactories() {
            return java.util.Collections.unmodifiableList(this.getOutputMinFrameDuration);
        }

        public org.tensorflow.lite.InterpreterApi.Options setRuntime(org.tensorflow.lite.InterpreterApi.Options.TfLiteRuntime tfLiteRuntime) {
            this.getHighResolutionOutputSizeshNQ4ISI = tfLiteRuntime;
            return this;
        }

        public org.tensorflow.lite.InterpreterApi.Options.TfLiteRuntime getRuntime() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        public org.tensorflow.lite.InterpreterApi.Options setAccelerationConfig(org.tensorflow.lite.acceleration.ValidatedAccelerationConfig validatedAccelerationConfig) {
            this.getInputFormats = validatedAccelerationConfig;
            return this;
        }

        public org.tensorflow.lite.acceleration.ValidatedAccelerationConfig getAccelerationConfig() {
            return this.getInputFormats;
        }

        public org.tensorflow.lite.InterpreterApi.Options setUseXNNPACK(boolean z) {
            this.getHighSpeedVideoSizesFor = java.lang.Boolean.valueOf(z);
            return this;
        }

        public boolean getUseXNNPACK() {
            java.lang.Boolean bool = this.getHighSpeedVideoSizesFor;
            return bool == null || bool.booleanValue();
        }
    }

    static org.tensorflow.lite.InterpreterApi create(java.io.File file, org.tensorflow.lite.InterpreterApi.Options options) {
        return org.tensorflow.lite.TensorFlowLite.getHighResolutionOutputSizeshNQ4ISI(options == null ? null : options.getRuntime()).create(file, options);
    }

    static org.tensorflow.lite.InterpreterApi create(java.nio.ByteBuffer byteBuffer, org.tensorflow.lite.InterpreterApi.Options options) {
        return org.tensorflow.lite.TensorFlowLite.getHighResolutionOutputSizeshNQ4ISI(options == null ? null : options.getRuntime()).create(byteBuffer, options);
    }
}
