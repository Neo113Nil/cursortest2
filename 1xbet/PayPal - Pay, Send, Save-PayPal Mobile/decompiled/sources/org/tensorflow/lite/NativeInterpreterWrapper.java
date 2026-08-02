package org.tensorflow.lite;

/* loaded from: classes18.dex */
class NativeInterpreterWrapper implements java.lang.AutoCloseable {
    private static final org.tensorflow.lite.RuntimeFlavor getInputFormats = org.tensorflow.lite.RuntimeFlavor.APPLICATION;
    long getHighResolutionOutputSizeshNQ4ISI;
    java.util.Map<java.lang.String, java.lang.Integer> getHighSpeedVideoFpsRanges;
    org.tensorflow.lite.TensorImpl[] getHighSpeedVideoFpsRangesFor;
    long getHighSpeedVideoSizesFor;
    org.tensorflow.lite.TensorImpl[] getOutputFormats;
    java.util.Map<java.lang.String, java.lang.Integer> getOutputMinFrameDuration;
    private java.nio.ByteBuffer getOutputMinFrameDurationlomOqCM;
    private long getOutputSizeshNQ4ISI;
    private java.util.Map<java.lang.String, org.tensorflow.lite.NativeSignatureRunnerWrapper> unwrapAs;
    long Camera2StreamConfigurationMap = 0;
    long getHighSpeedVideoSizes = -1;
    private boolean getOutputSizes = false;
    private boolean getOutputStallDuration = false;
    private final java.util.List<org.tensorflow.lite.Delegate> getInputSizeshNQ4ISI = new java.util.ArrayList();
    private final java.util.List<org.tensorflow.lite.Delegate> getOutputStallDurationlomOqCM = new java.util.ArrayList();

    private static native long allocateTensors(long j, long j2);

    private static native void allowBufferHandleOutput(long j, boolean z);

    private static native void allowFp16PrecisionForFp32(long j, boolean z);

    private static native long createCancellationFlag(long j);

    private static native long createErrorReporter(int i);

    private static native long createInterpreter(long j, long j2, int i, boolean z, java.util.List<java.lang.Long> list);

    private static native long createModel(java.lang.String str, long j);

    private static native long createModelWithBuffer(java.nio.ByteBuffer byteBuffer, long j);

    private static native void delete(long j, long j2, long j3);

    private static native long deleteCancellationFlag(long j);

    private static native int getExecutionPlanLength(long j);

    private static native int getInputCount(long j);

    static native java.lang.String[] getInputNames(long j);

    private static native int getInputTensorIndex(long j, int i);

    private static native int getOutputCount(long j);

    static native java.lang.String[] getOutputNames(long j);

    private static native int getOutputTensorIndex(long j, int i);

    static native java.lang.String[] getSignatureKeys(long j);

    private static native boolean hasUnresolvedFlexOp(long j);

    private static native boolean resizeInput(long j, long j2, int i, int[] iArr, boolean z);

    private static native void run(long j, long j2);

    static native void setCancelled(long j, long j2, boolean z);

    NativeInterpreterWrapper(java.lang.String str, org.tensorflow.lite.InterpreterImpl.Options options) {
        org.tensorflow.lite.TensorFlowLite.init();
        long createErrorReporter = createErrorReporter(512);
        getHighSpeedVideoFpsRanges(createErrorReporter, createModel(str, createErrorReporter), options);
    }

    NativeInterpreterWrapper(java.nio.ByteBuffer byteBuffer, org.tensorflow.lite.InterpreterImpl.Options options) {
        org.tensorflow.lite.TensorFlowLite.init();
        if (byteBuffer == null || (!(byteBuffer instanceof java.nio.MappedByteBuffer) && (!byteBuffer.isDirect() || byteBuffer.order() != java.nio.ByteOrder.nativeOrder()))) {
            throw new java.lang.IllegalArgumentException("Model ByteBuffer should be either a MappedByteBuffer of the model file, or a direct ByteBuffer using ByteOrder.nativeOrder() which contains bytes of model content.");
        }
        this.getOutputMinFrameDurationlomOqCM = byteBuffer;
        long createErrorReporter = createErrorReporter(512);
        getHighSpeedVideoFpsRanges(createErrorReporter, createModelWithBuffer(this.getOutputMinFrameDurationlomOqCM, createErrorReporter), options);
    }

    private void getHighSpeedVideoFpsRanges(long j, long j2, org.tensorflow.lite.InterpreterImpl.Options options) {
        if (options == null) {
            options = new org.tensorflow.lite.InterpreterImpl.Options();
        }
        if (options.getAccelerationConfig() != null) {
            options.getAccelerationConfig().apply(options);
        }
        this.getHighResolutionOutputSizeshNQ4ISI = j;
        this.getOutputSizeshNQ4ISI = j2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        long createInterpreter = createInterpreter(j2, j, options.getNumThreads(), options.getUseXNNPACK(), arrayList);
        this.getHighSpeedVideoSizesFor = createInterpreter;
        this.getOutputStallDuration = hasUnresolvedFlexOp(createInterpreter);
        getHighSpeedVideoFpsRangesFor(options);
        getHighSpeedVideoFpsRangesFor();
        arrayList.ensureCapacity(this.getInputSizeshNQ4ISI.size());
        java.util.Iterator<org.tensorflow.lite.Delegate> it = this.getInputSizeshNQ4ISI.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Long.valueOf(it.next().getNativeHandle()));
        }
        if (!arrayList.isEmpty()) {
            delete(0L, 0L, this.getHighSpeedVideoSizesFor);
            this.getHighSpeedVideoSizesFor = createInterpreter(j2, j, options.getNumThreads(), options.getUseXNNPACK(), arrayList);
        }
        if (options.getInputSizeshNQ4ISI != null) {
            allowFp16PrecisionForFp32(this.getHighSpeedVideoSizesFor, options.getInputSizeshNQ4ISI.booleanValue());
        }
        if (options.getOutputFormats != null) {
            allowBufferHandleOutput(this.getHighSpeedVideoSizesFor, options.getOutputFormats.booleanValue());
        }
        if (options.isCancellable()) {
            this.Camera2StreamConfigurationMap = createCancellationFlag(this.getHighSpeedVideoSizesFor);
        }
        this.getHighSpeedVideoFpsRangesFor = new org.tensorflow.lite.TensorImpl[getInputCount(this.getHighSpeedVideoSizesFor)];
        this.getOutputFormats = new org.tensorflow.lite.TensorImpl[getOutputCount(this.getHighSpeedVideoSizesFor)];
        if (options.getInputSizeshNQ4ISI != null) {
            allowFp16PrecisionForFp32(this.getHighSpeedVideoSizesFor, options.getInputSizeshNQ4ISI.booleanValue());
        }
        if (options.getOutputFormats != null) {
            allowBufferHandleOutput(this.getHighSpeedVideoSizesFor, options.getOutputFormats.booleanValue());
        }
        allocateTensors(this.getHighSpeedVideoSizesFor, j);
        this.getOutputSizes = true;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        int i = 0;
        while (true) {
            org.tensorflow.lite.TensorImpl[] tensorImplArr = this.getHighSpeedVideoFpsRangesFor;
            if (i >= tensorImplArr.length) {
                break;
            }
            org.tensorflow.lite.TensorImpl tensorImpl = tensorImplArr[i];
            if (tensorImpl != null) {
                org.tensorflow.lite.TensorImpl.delete(tensorImpl.Camera2StreamConfigurationMap);
                tensorImpl.Camera2StreamConfigurationMap = 0L;
                this.getHighSpeedVideoFpsRangesFor[i] = null;
            }
            i++;
        }
        int i2 = 0;
        while (true) {
            org.tensorflow.lite.TensorImpl[] tensorImplArr2 = this.getOutputFormats;
            if (i2 >= tensorImplArr2.length) {
                break;
            }
            org.tensorflow.lite.TensorImpl tensorImpl2 = tensorImplArr2[i2];
            if (tensorImpl2 != null) {
                org.tensorflow.lite.TensorImpl.delete(tensorImpl2.Camera2StreamConfigurationMap);
                tensorImpl2.Camera2StreamConfigurationMap = 0L;
                this.getOutputFormats[i2] = null;
            }
            i2++;
        }
        this.getInputSizeshNQ4ISI.clear();
        java.util.Iterator<org.tensorflow.lite.Delegate> it = this.getOutputStallDurationlomOqCM.iterator();
        while (it.hasNext()) {
            it.next().close();
        }
        this.getOutputStallDurationlomOqCM.clear();
        delete(this.getHighResolutionOutputSizeshNQ4ISI, this.getOutputSizeshNQ4ISI, this.getHighSpeedVideoSizesFor);
        deleteCancellationFlag(this.Camera2StreamConfigurationMap);
        this.getHighResolutionOutputSizeshNQ4ISI = 0L;
        this.getOutputSizeshNQ4ISI = 0L;
        this.getHighSpeedVideoSizesFor = 0L;
        this.Camera2StreamConfigurationMap = 0L;
        this.getOutputMinFrameDurationlomOqCM = null;
        this.getHighSpeedVideoFpsRanges = null;
        this.getOutputMinFrameDuration = null;
        this.getOutputSizes = false;
    }

    final void getHighSpeedVideoSizes(java.lang.Object[] objArr, java.util.Map<java.lang.Integer, java.lang.Object> map) {
        this.getHighSpeedVideoSizes = -1L;
        if (objArr == null || objArr.length == 0) {
            throw new java.lang.IllegalArgumentException("Input error: Inputs should not be null or empty.");
        }
        if (map == null) {
            throw new java.lang.IllegalArgumentException("Input error: Outputs should not be null.");
        }
        for (int i = 0; i < objArr.length; i++) {
            int[] highSpeedVideoSizes = Camera2StreamConfigurationMap(i).getHighSpeedVideoSizes(objArr[i]);
            if (highSpeedVideoSizes != null) {
                Camera2StreamConfigurationMap(i, highSpeedVideoSizes, false);
            }
        }
        boolean highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI();
        for (int i2 = 0; i2 < objArr.length; i2++) {
            Camera2StreamConfigurationMap(i2).Camera2StreamConfigurationMap(objArr[i2]);
        }
        long nanoTime = java.lang.System.nanoTime();
        run(this.getHighSpeedVideoSizesFor, this.getHighResolutionOutputSizeshNQ4ISI);
        long nanoTime2 = java.lang.System.nanoTime();
        if (highResolutionOutputSizeshNQ4ISI) {
            for (org.tensorflow.lite.TensorImpl tensorImpl : this.getOutputFormats) {
                if (tensorImpl != null) {
                    tensorImpl.getHighSpeedVideoSizes = org.tensorflow.lite.TensorImpl.shape(tensorImpl.Camera2StreamConfigurationMap);
                }
            }
        }
        for (java.util.Map.Entry<java.lang.Integer, java.lang.Object> entry : map.entrySet()) {
            if (entry.getValue() != null) {
                getHighSpeedVideoFpsRanges(entry.getKey().intValue()).getHighSpeedVideoFpsRanges(entry.getValue());
            }
        }
        this.getHighSpeedVideoSizes = nanoTime2 - nanoTime;
    }

    final void Camera2StreamConfigurationMap(int i, int[] iArr, boolean z) {
        if (resizeInput(this.getHighSpeedVideoSizesFor, this.getHighResolutionOutputSizeshNQ4ISI, i, iArr, z)) {
            this.getOutputSizes = false;
            org.tensorflow.lite.TensorImpl tensorImpl = this.getHighSpeedVideoFpsRangesFor[i];
            if (tensorImpl != null) {
                tensorImpl.getHighSpeedVideoSizes = org.tensorflow.lite.TensorImpl.shape(tensorImpl.Camera2StreamConfigurationMap);
            }
        }
    }

    final boolean getHighResolutionOutputSizeshNQ4ISI() {
        if (this.getOutputSizes) {
            return false;
        }
        this.getOutputSizes = true;
        allocateTensors(this.getHighSpeedVideoSizesFor, this.getHighResolutionOutputSizeshNQ4ISI);
        for (org.tensorflow.lite.TensorImpl tensorImpl : this.getOutputFormats) {
            if (tensorImpl != null) {
                tensorImpl.getHighSpeedVideoSizes = org.tensorflow.lite.TensorImpl.shape(tensorImpl.Camera2StreamConfigurationMap);
            }
        }
        return true;
    }

    final org.tensorflow.lite.TensorImpl Camera2StreamConfigurationMap(int i) {
        if (i >= 0) {
            org.tensorflow.lite.TensorImpl[] tensorImplArr = this.getHighSpeedVideoFpsRangesFor;
            if (i < tensorImplArr.length) {
                org.tensorflow.lite.TensorImpl tensorImpl = tensorImplArr[i];
                if (tensorImpl != null) {
                    return tensorImpl;
                }
                long j = this.getHighSpeedVideoSizesFor;
                org.tensorflow.lite.TensorImpl highSpeedVideoSizes = org.tensorflow.lite.TensorImpl.getHighSpeedVideoSizes(j, getInputTensorIndex(j, i));
                tensorImplArr[i] = highSpeedVideoSizes;
                return highSpeedVideoSizes;
            }
        }
        throw new java.lang.IllegalArgumentException("Invalid input Tensor index: ".concat(java.lang.String.valueOf(i)));
    }

    final org.tensorflow.lite.TensorImpl getHighSpeedVideoSizes(java.lang.String str, java.lang.String str2) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("Invalid input tensor name provided (null)");
        }
        org.tensorflow.lite.NativeSignatureRunnerWrapper highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(str2);
        if (org.tensorflow.lite.NativeSignatureRunnerWrapper.nativeGetSubgraphIndex(highSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges) == 0) {
            return Camera2StreamConfigurationMap(highSpeedVideoFpsRanges.Camera2StreamConfigurationMap(str));
        }
        return org.tensorflow.lite.TensorImpl.getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges, str);
    }

    final org.tensorflow.lite.TensorImpl getHighSpeedVideoFpsRanges(int i) {
        if (i >= 0) {
            org.tensorflow.lite.TensorImpl[] tensorImplArr = this.getOutputFormats;
            if (i < tensorImplArr.length) {
                org.tensorflow.lite.TensorImpl tensorImpl = tensorImplArr[i];
                if (tensorImpl != null) {
                    return tensorImpl;
                }
                long j = this.getHighSpeedVideoSizesFor;
                org.tensorflow.lite.TensorImpl highSpeedVideoSizes = org.tensorflow.lite.TensorImpl.getHighSpeedVideoSizes(j, getOutputTensorIndex(j, i));
                tensorImplArr[i] = highSpeedVideoSizes;
                return highSpeedVideoSizes;
            }
        }
        throw new java.lang.IllegalArgumentException("Invalid output Tensor index: ".concat(java.lang.String.valueOf(i)));
    }

    private void getHighSpeedVideoFpsRangesFor(org.tensorflow.lite.InterpreterImpl.Options options) {
        org.tensorflow.lite.Delegate highResolutionOutputSizeshNQ4ISI;
        if (this.getOutputStallDuration && (highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(options.getDelegates())) != null) {
            this.getOutputStallDurationlomOqCM.add(highResolutionOutputSizeshNQ4ISI);
            this.getInputSizeshNQ4ISI.add(highResolutionOutputSizeshNQ4ISI);
        }
        for (org.tensorflow.lite.Delegate delegate : options.getDelegates()) {
            if (options.getRuntime() != org.tensorflow.lite.InterpreterApi.Options.TfLiteRuntime.FROM_APPLICATION_ONLY && !(delegate instanceof org.tensorflow.lite.nnapi.NnApiDelegate)) {
                throw new java.lang.IllegalArgumentException("Instantiated delegates (other than NnApiDelegate) are not allowed when using TF Lite from Google Play Services. Please use InterpreterApi.Options.addDelegateFactory() with an appropriate DelegateFactory instead.");
            }
            this.getInputSizeshNQ4ISI.add(delegate);
        }
        java.util.Iterator<org.tensorflow.lite.DelegateFactory> it = options.getDelegateFactories().iterator();
        while (it.hasNext()) {
            org.tensorflow.lite.Delegate create = it.next().create(getInputFormats);
            this.getOutputStallDurationlomOqCM.add(create);
            this.getInputSizeshNQ4ISI.add(create);
        }
        if (options.getUseNNAPI()) {
            org.tensorflow.lite.nnapi.NnApiDelegate nnApiDelegate = new org.tensorflow.lite.nnapi.NnApiDelegate();
            this.getOutputStallDurationlomOqCM.add(nnApiDelegate);
            this.getInputSizeshNQ4ISI.add(nnApiDelegate);
        }
    }

    private void getHighSpeedVideoFpsRangesFor() {
        org.tensorflow.lite.InterpreterFactoryImpl interpreterFactoryImpl = new org.tensorflow.lite.InterpreterFactoryImpl();
        for (org.tensorflow.lite.Delegate delegate : this.getInputSizeshNQ4ISI) {
            if (delegate instanceof org.tensorflow.lite.nnapi.NnApiDelegate) {
                ((org.tensorflow.lite.nnapi.NnApiDelegate) delegate).initWithInterpreterFactoryApi(interpreterFactoryImpl);
            }
        }
    }

    final org.tensorflow.lite.NativeSignatureRunnerWrapper getHighSpeedVideoFpsRanges(java.lang.String str) {
        if (this.unwrapAs == null) {
            this.unwrapAs = new java.util.HashMap();
        }
        if (!this.unwrapAs.containsKey(str)) {
            this.unwrapAs.put(str, new org.tensorflow.lite.NativeSignatureRunnerWrapper(this.getHighSpeedVideoSizesFor, this.getHighResolutionOutputSizeshNQ4ISI, str));
        }
        return this.unwrapAs.get(str);
    }

    private static org.tensorflow.lite.Delegate getHighResolutionOutputSizeshNQ4ISI(java.util.List<org.tensorflow.lite.Delegate> list) {
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("org.tensorflow.lite.flex.FlexDelegate");
            java.util.Iterator<org.tensorflow.lite.Delegate> it = list.iterator();
            while (it.hasNext()) {
                if (cls.isInstance(it.next())) {
                    return null;
                }
            }
            return (org.tensorflow.lite.Delegate) cls.getConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
        } catch (java.lang.ClassNotFoundException | java.lang.IllegalAccessException | java.lang.IllegalArgumentException | java.lang.InstantiationException | java.lang.NoSuchMethodException | java.lang.SecurityException | java.lang.reflect.InvocationTargetException unused) {
            return null;
        }
    }
}
