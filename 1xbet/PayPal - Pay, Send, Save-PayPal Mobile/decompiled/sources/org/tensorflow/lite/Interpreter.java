package org.tensorflow.lite;

/* loaded from: classes18.dex */
public final class Interpreter extends org.tensorflow.lite.InterpreterImpl implements org.tensorflow.lite.InterpreterApi {
    private final org.tensorflow.lite.NativeInterpreterWrapperExperimental getHighSpeedVideoFpsRanges;

    @Override // org.tensorflow.lite.InterpreterImpl, org.tensorflow.lite.InterpreterApi
    public final /* bridge */ /* synthetic */ void allocateTensors() {
        super.allocateTensors();
    }

    @Override // org.tensorflow.lite.InterpreterImpl, org.tensorflow.lite.InterpreterApi, java.lang.AutoCloseable
    public final /* bridge */ /* synthetic */ void close() {
        super.close();
    }

    @Override // org.tensorflow.lite.InterpreterImpl, org.tensorflow.lite.InterpreterApi
    public final /* bridge */ /* synthetic */ int getInputIndex(java.lang.String str) {
        return super.getInputIndex(str);
    }

    @Override // org.tensorflow.lite.InterpreterImpl, org.tensorflow.lite.InterpreterApi
    public final /* bridge */ /* synthetic */ org.tensorflow.lite.Tensor getInputTensor(int i) {
        return super.getInputTensor(i);
    }

    @Override // org.tensorflow.lite.InterpreterImpl, org.tensorflow.lite.InterpreterApi
    public final /* bridge */ /* synthetic */ int getInputTensorCount() {
        return super.getInputTensorCount();
    }

    @Override // org.tensorflow.lite.InterpreterImpl, org.tensorflow.lite.InterpreterApi
    public final /* bridge */ /* synthetic */ org.tensorflow.lite.Tensor getInputTensorFromSignature(java.lang.String str, java.lang.String str2) {
        return super.getInputTensorFromSignature(str, str2);
    }

    @Override // org.tensorflow.lite.InterpreterImpl, org.tensorflow.lite.InterpreterApi
    public final /* bridge */ /* synthetic */ java.lang.Long getLastNativeInferenceDurationNanoseconds() {
        return super.getLastNativeInferenceDurationNanoseconds();
    }

    @Override // org.tensorflow.lite.InterpreterImpl, org.tensorflow.lite.InterpreterApi
    public final /* bridge */ /* synthetic */ int getOutputIndex(java.lang.String str) {
        return super.getOutputIndex(str);
    }

    @Override // org.tensorflow.lite.InterpreterImpl, org.tensorflow.lite.InterpreterApi
    public final /* bridge */ /* synthetic */ org.tensorflow.lite.Tensor getOutputTensor(int i) {
        return super.getOutputTensor(i);
    }

    @Override // org.tensorflow.lite.InterpreterImpl, org.tensorflow.lite.InterpreterApi
    public final /* bridge */ /* synthetic */ int getOutputTensorCount() {
        return super.getOutputTensorCount();
    }

    @Override // org.tensorflow.lite.InterpreterImpl, org.tensorflow.lite.InterpreterApi
    public final /* bridge */ /* synthetic */ org.tensorflow.lite.Tensor getOutputTensorFromSignature(java.lang.String str, java.lang.String str2) {
        return super.getOutputTensorFromSignature(str, str2);
    }

    @Override // org.tensorflow.lite.InterpreterImpl, org.tensorflow.lite.InterpreterApi
    public final /* bridge */ /* synthetic */ java.lang.String[] getSignatureInputs(java.lang.String str) {
        return super.getSignatureInputs(str);
    }

    @Override // org.tensorflow.lite.InterpreterImpl, org.tensorflow.lite.InterpreterApi
    public final /* bridge */ /* synthetic */ java.lang.String[] getSignatureKeys() {
        return super.getSignatureKeys();
    }

    @Override // org.tensorflow.lite.InterpreterImpl, org.tensorflow.lite.InterpreterApi
    public final /* bridge */ /* synthetic */ java.lang.String[] getSignatureOutputs(java.lang.String str) {
        return super.getSignatureOutputs(str);
    }

    @Override // org.tensorflow.lite.InterpreterImpl, org.tensorflow.lite.InterpreterApi
    public final /* bridge */ /* synthetic */ void resizeInput(int i, int[] iArr) {
        super.resizeInput(i, iArr);
    }

    @Override // org.tensorflow.lite.InterpreterImpl, org.tensorflow.lite.InterpreterApi
    public final /* bridge */ /* synthetic */ void resizeInput(int i, int[] iArr, boolean z) {
        super.resizeInput(i, iArr, z);
    }

    @Override // org.tensorflow.lite.InterpreterImpl, org.tensorflow.lite.InterpreterApi
    public final /* bridge */ /* synthetic */ void run(java.lang.Object obj, java.lang.Object obj2) {
        super.run(obj, obj2);
    }

    @Override // org.tensorflow.lite.InterpreterImpl, org.tensorflow.lite.InterpreterApi
    public final /* bridge */ /* synthetic */ void runForMultipleInputsOutputs(java.lang.Object[] objArr, java.util.Map map) {
        super.runForMultipleInputsOutputs(objArr, map);
    }

    @Override // org.tensorflow.lite.InterpreterImpl, org.tensorflow.lite.InterpreterApi
    public final /* bridge */ /* synthetic */ void runSignature(java.util.Map map, java.util.Map map2) {
        super.runSignature(map, map2);
    }

    @Override // org.tensorflow.lite.InterpreterImpl, org.tensorflow.lite.InterpreterApi
    public final /* bridge */ /* synthetic */ void runSignature(java.util.Map map, java.util.Map map2, java.lang.String str) {
        super.runSignature(map, map2, str);
    }

    public static class Options extends org.tensorflow.lite.InterpreterImpl.Options {
        public Options() {
        }

        public Options(org.tensorflow.lite.InterpreterApi.Options options) {
            super(options);
        }

        @Override // org.tensorflow.lite.InterpreterApi.Options
        public org.tensorflow.lite.Interpreter.Options setUseXNNPACK(boolean z) {
            super.setUseXNNPACK(z);
            return this;
        }

        @Override // org.tensorflow.lite.InterpreterApi.Options
        public org.tensorflow.lite.Interpreter.Options setNumThreads(int i) {
            super.setNumThreads(i);
            return this;
        }

        @Override // org.tensorflow.lite.InterpreterApi.Options
        public org.tensorflow.lite.Interpreter.Options setUseNNAPI(boolean z) {
            super.setUseNNAPI(z);
            return this;
        }

        @java.lang.Deprecated
        public org.tensorflow.lite.Interpreter.Options setAllowFp16PrecisionForFp32(boolean z) {
            this.getInputSizeshNQ4ISI = java.lang.Boolean.valueOf(z);
            return this;
        }

        @Override // org.tensorflow.lite.InterpreterApi.Options
        public org.tensorflow.lite.Interpreter.Options addDelegate(org.tensorflow.lite.Delegate delegate) {
            super.addDelegate(delegate);
            return this;
        }

        @Override // org.tensorflow.lite.InterpreterApi.Options
        public org.tensorflow.lite.Interpreter.Options addDelegateFactory(org.tensorflow.lite.DelegateFactory delegateFactory) {
            super.addDelegateFactory(delegateFactory);
            return this;
        }

        public org.tensorflow.lite.Interpreter.Options setAllowBufferHandleOutput(boolean z) {
            this.getOutputFormats = java.lang.Boolean.valueOf(z);
            return this;
        }

        @Override // org.tensorflow.lite.InterpreterApi.Options
        public org.tensorflow.lite.Interpreter.Options setCancellable(boolean z) {
            super.setCancellable(z);
            return this;
        }

        @Override // org.tensorflow.lite.InterpreterApi.Options
        public org.tensorflow.lite.Interpreter.Options setRuntime(org.tensorflow.lite.InterpreterApi.Options.TfLiteRuntime tfLiteRuntime) {
            super.setRuntime(tfLiteRuntime);
            return this;
        }
    }

    public Interpreter(java.io.File file) {
        this(file, (org.tensorflow.lite.Interpreter.Options) null);
    }

    public Interpreter(java.io.File file, org.tensorflow.lite.Interpreter.Options options) {
        this(new org.tensorflow.lite.NativeInterpreterWrapperExperimental(file.getAbsolutePath(), options));
    }

    public Interpreter(java.nio.ByteBuffer byteBuffer) {
        this(byteBuffer, (org.tensorflow.lite.Interpreter.Options) null);
    }

    public Interpreter(java.nio.ByteBuffer byteBuffer, org.tensorflow.lite.Interpreter.Options options) {
        this(new org.tensorflow.lite.NativeInterpreterWrapperExperimental(byteBuffer, options));
    }

    private Interpreter(org.tensorflow.lite.NativeInterpreterWrapperExperimental nativeInterpreterWrapperExperimental) {
        super(nativeInterpreterWrapperExperimental);
        this.getHighSpeedVideoFpsRanges = nativeInterpreterWrapperExperimental;
    }

    public final void setCancelled(boolean z) {
        org.tensorflow.lite.NativeInterpreterWrapper nativeInterpreterWrapper = this.getHighSpeedVideoSizes;
        long j = nativeInterpreterWrapper.Camera2StreamConfigurationMap;
        if (j == 0) {
            throw new java.lang.IllegalStateException("Cannot cancel the inference. Have you called InterpreterApi.Options.setCancellable?");
        }
        org.tensorflow.lite.NativeInterpreterWrapper.setCancelled(nativeInterpreterWrapper.getHighSpeedVideoSizesFor, j, z);
    }

    public final void resetVariableTensors() {
        if (this.getHighSpeedVideoSizes != null) {
            org.tensorflow.lite.NativeInterpreterWrapperExperimental nativeInterpreterWrapperExperimental = this.getHighSpeedVideoFpsRanges;
            org.tensorflow.lite.NativeInterpreterWrapperExperimental.resetVariableTensors(nativeInterpreterWrapperExperimental.getHighSpeedVideoSizesFor, nativeInterpreterWrapperExperimental.getHighResolutionOutputSizeshNQ4ISI);
            return;
        }
        throw new java.lang.IllegalStateException("Internal error: The Interpreter has already been closed.");
    }
}
