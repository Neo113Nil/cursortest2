package org.tensorflow.lite;

/* loaded from: classes18.dex */
class InterpreterImpl implements org.tensorflow.lite.InterpreterApi {
    private final java.lang.String[] getHighResolutionOutputSizeshNQ4ISI = getSignatureKeys();
    org.tensorflow.lite.NativeInterpreterWrapper getHighSpeedVideoSizes;

    static class Options extends org.tensorflow.lite.InterpreterApi.Options {
        java.lang.Boolean getInputSizeshNQ4ISI;
        java.lang.Boolean getOutputFormats;

        public Options() {
        }

        public Options(org.tensorflow.lite.InterpreterApi.Options options) {
            super(options);
        }

        public Options(org.tensorflow.lite.InterpreterImpl.Options options) {
            super(options);
            this.getInputSizeshNQ4ISI = options.getInputSizeshNQ4ISI;
            this.getOutputFormats = options.getOutputFormats;
        }
    }

    InterpreterImpl(java.io.File file, org.tensorflow.lite.InterpreterImpl.Options options) {
        this.getHighSpeedVideoSizes = new org.tensorflow.lite.NativeInterpreterWrapper(file.getAbsolutePath(), options);
    }

    InterpreterImpl(java.nio.ByteBuffer byteBuffer, org.tensorflow.lite.InterpreterImpl.Options options) {
        this.getHighSpeedVideoSizes = new org.tensorflow.lite.NativeInterpreterWrapper(byteBuffer, options);
    }

    InterpreterImpl(org.tensorflow.lite.NativeInterpreterWrapper nativeInterpreterWrapper) {
        this.getHighSpeedVideoSizes = nativeInterpreterWrapper;
    }

    @Override // org.tensorflow.lite.InterpreterApi
    public void run(java.lang.Object obj, java.lang.Object obj2) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(0, obj2);
        runForMultipleInputsOutputs(new java.lang.Object[]{obj}, hashMap);
    }

    @Override // org.tensorflow.lite.InterpreterApi, java.lang.AutoCloseable
    public void close() {
        org.tensorflow.lite.NativeInterpreterWrapper nativeInterpreterWrapper = this.getHighSpeedVideoSizes;
        if (nativeInterpreterWrapper != null) {
            nativeInterpreterWrapper.close();
            this.getHighSpeedVideoSizes = null;
        }
    }

    protected void finalize() throws java.lang.Throwable {
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    @Override // org.tensorflow.lite.InterpreterApi
    public void allocateTensors() {
        org.tensorflow.lite.NativeInterpreterWrapper nativeInterpreterWrapper = this.getHighSpeedVideoSizes;
        if (nativeInterpreterWrapper == null) {
            throw new java.lang.IllegalStateException("Internal error: The Interpreter has already been closed.");
        }
        nativeInterpreterWrapper.getHighResolutionOutputSizeshNQ4ISI();
    }

    @Override // org.tensorflow.lite.InterpreterApi
    public int getInputIndex(java.lang.String str) {
        org.tensorflow.lite.NativeInterpreterWrapper nativeInterpreterWrapper = this.getHighSpeedVideoSizes;
        if (nativeInterpreterWrapper == null) {
            throw new java.lang.IllegalStateException("Internal error: The Interpreter has already been closed.");
        }
        if (nativeInterpreterWrapper.getHighSpeedVideoFpsRanges == null) {
            java.lang.String[] inputNames = org.tensorflow.lite.NativeInterpreterWrapper.getInputNames(nativeInterpreterWrapper.getHighSpeedVideoSizesFor);
            nativeInterpreterWrapper.getHighSpeedVideoFpsRanges = new java.util.HashMap();
            if (inputNames != null) {
                for (int i = 0; i < inputNames.length; i++) {
                    nativeInterpreterWrapper.getHighSpeedVideoFpsRanges.put(inputNames[i], java.lang.Integer.valueOf(i));
                }
            }
        }
        if (nativeInterpreterWrapper.getHighSpeedVideoFpsRanges.containsKey(str)) {
            return nativeInterpreterWrapper.getHighSpeedVideoFpsRanges.get(str).intValue();
        }
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Input error: '%s' is not a valid name for any input. Names of inputs and their indexes are %s", str, nativeInterpreterWrapper.getHighSpeedVideoFpsRanges));
    }

    @Override // org.tensorflow.lite.InterpreterApi
    public org.tensorflow.lite.Tensor getInputTensor(int i) {
        org.tensorflow.lite.NativeInterpreterWrapper nativeInterpreterWrapper = this.getHighSpeedVideoSizes;
        if (nativeInterpreterWrapper != null) {
            return nativeInterpreterWrapper.Camera2StreamConfigurationMap(i);
        }
        throw new java.lang.IllegalStateException("Internal error: The Interpreter has already been closed.");
    }

    @Override // org.tensorflow.lite.InterpreterApi
    public int getInputTensorCount() {
        org.tensorflow.lite.NativeInterpreterWrapper nativeInterpreterWrapper = this.getHighSpeedVideoSizes;
        if (nativeInterpreterWrapper == null) {
            throw new java.lang.IllegalStateException("Internal error: The Interpreter has already been closed.");
        }
        return nativeInterpreterWrapper.getHighSpeedVideoFpsRangesFor.length;
    }

    @Override // org.tensorflow.lite.InterpreterApi
    public org.tensorflow.lite.Tensor getInputTensorFromSignature(java.lang.String str, java.lang.String str2) {
        org.tensorflow.lite.NativeInterpreterWrapper nativeInterpreterWrapper = this.getHighSpeedVideoSizes;
        if (nativeInterpreterWrapper == null) {
            throw new java.lang.IllegalStateException("Internal error: The Interpreter has already been closed.");
        }
        if (str2 == null) {
            java.lang.String[] strArr = this.getHighResolutionOutputSizeshNQ4ISI;
            if (strArr.length == 1) {
                str2 = strArr[0];
            }
        }
        if (str2 == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Input error: SignatureDef signatureKey should not be null. null is only allowed if the model has a single Signature. Available Signatures: ");
            sb.append(java.util.Arrays.toString(this.getHighResolutionOutputSizeshNQ4ISI));
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        return nativeInterpreterWrapper.getHighSpeedVideoSizes(str, str2);
    }

    @Override // org.tensorflow.lite.InterpreterApi
    public java.lang.Long getLastNativeInferenceDurationNanoseconds() {
        org.tensorflow.lite.NativeInterpreterWrapper nativeInterpreterWrapper = this.getHighSpeedVideoSizes;
        if (nativeInterpreterWrapper == null) {
            throw new java.lang.IllegalStateException("Internal error: The Interpreter has already been closed.");
        }
        long j = nativeInterpreterWrapper.getHighSpeedVideoSizes;
        if (j < 0) {
            return null;
        }
        return java.lang.Long.valueOf(j);
    }

    @Override // org.tensorflow.lite.InterpreterApi
    public int getOutputIndex(java.lang.String str) {
        org.tensorflow.lite.NativeInterpreterWrapper nativeInterpreterWrapper = this.getHighSpeedVideoSizes;
        if (nativeInterpreterWrapper == null) {
            throw new java.lang.IllegalStateException("Internal error: The Interpreter has already been closed.");
        }
        if (nativeInterpreterWrapper.getOutputMinFrameDuration == null) {
            java.lang.String[] outputNames = org.tensorflow.lite.NativeInterpreterWrapper.getOutputNames(nativeInterpreterWrapper.getHighSpeedVideoSizesFor);
            nativeInterpreterWrapper.getOutputMinFrameDuration = new java.util.HashMap();
            if (outputNames != null) {
                for (int i = 0; i < outputNames.length; i++) {
                    nativeInterpreterWrapper.getOutputMinFrameDuration.put(outputNames[i], java.lang.Integer.valueOf(i));
                }
            }
        }
        if (nativeInterpreterWrapper.getOutputMinFrameDuration.containsKey(str)) {
            return nativeInterpreterWrapper.getOutputMinFrameDuration.get(str).intValue();
        }
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Input error: '%s' is not a valid name for any output. Names of outputs and their indexes are %s", str, nativeInterpreterWrapper.getOutputMinFrameDuration));
    }

    @Override // org.tensorflow.lite.InterpreterApi
    public org.tensorflow.lite.Tensor getOutputTensor(int i) {
        org.tensorflow.lite.NativeInterpreterWrapper nativeInterpreterWrapper = this.getHighSpeedVideoSizes;
        if (nativeInterpreterWrapper != null) {
            return nativeInterpreterWrapper.getHighSpeedVideoFpsRanges(i);
        }
        throw new java.lang.IllegalStateException("Internal error: The Interpreter has already been closed.");
    }

    @Override // org.tensorflow.lite.InterpreterApi
    public int getOutputTensorCount() {
        org.tensorflow.lite.NativeInterpreterWrapper nativeInterpreterWrapper = this.getHighSpeedVideoSizes;
        if (nativeInterpreterWrapper == null) {
            throw new java.lang.IllegalStateException("Internal error: The Interpreter has already been closed.");
        }
        return nativeInterpreterWrapper.getOutputFormats.length;
    }

    @Override // org.tensorflow.lite.InterpreterApi
    public org.tensorflow.lite.Tensor getOutputTensorFromSignature(java.lang.String str, java.lang.String str2) {
        org.tensorflow.lite.NativeInterpreterWrapper nativeInterpreterWrapper = this.getHighSpeedVideoSizes;
        if (nativeInterpreterWrapper == null) {
            throw new java.lang.IllegalStateException("Internal error: The Interpreter has already been closed.");
        }
        if (str2 == null) {
            java.lang.String[] strArr = this.getHighResolutionOutputSizeshNQ4ISI;
            if (strArr.length == 1) {
                str2 = strArr[0];
            }
        }
        if (str2 == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Input error: SignatureDef signatureKey should not be null. null is only allowed if the model has a single Signature. Available Signatures: ");
            sb.append(java.util.Arrays.toString(this.getHighResolutionOutputSizeshNQ4ISI));
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        if (str == null) {
            throw new java.lang.IllegalArgumentException("Invalid output tensor name provided (null)");
        }
        org.tensorflow.lite.NativeSignatureRunnerWrapper highSpeedVideoFpsRanges = nativeInterpreterWrapper.getHighSpeedVideoFpsRanges(str2);
        if (org.tensorflow.lite.NativeSignatureRunnerWrapper.nativeGetSubgraphIndex(highSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges) == 0) {
            return nativeInterpreterWrapper.getHighSpeedVideoFpsRanges(highSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI(str));
        }
        return org.tensorflow.lite.TensorImpl.getHighSpeedVideoFpsRanges(highSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges, str);
    }

    @Override // org.tensorflow.lite.InterpreterApi
    public java.lang.String[] getSignatureInputs(java.lang.String str) {
        org.tensorflow.lite.NativeInterpreterWrapper nativeInterpreterWrapper = this.getHighSpeedVideoSizes;
        if (nativeInterpreterWrapper == null) {
            throw new java.lang.IllegalStateException("Internal error: The Interpreter has already been closed.");
        }
        return org.tensorflow.lite.NativeSignatureRunnerWrapper.nativeInputNames(nativeInterpreterWrapper.getHighSpeedVideoFpsRanges(str).getHighSpeedVideoFpsRanges);
    }

    @Override // org.tensorflow.lite.InterpreterApi
    public java.lang.String[] getSignatureKeys() {
        org.tensorflow.lite.NativeInterpreterWrapper nativeInterpreterWrapper = this.getHighSpeedVideoSizes;
        if (nativeInterpreterWrapper == null) {
            throw new java.lang.IllegalStateException("Internal error: The Interpreter has already been closed.");
        }
        return org.tensorflow.lite.NativeInterpreterWrapper.getSignatureKeys(nativeInterpreterWrapper.getHighSpeedVideoSizesFor);
    }

    @Override // org.tensorflow.lite.InterpreterApi
    public java.lang.String[] getSignatureOutputs(java.lang.String str) {
        org.tensorflow.lite.NativeInterpreterWrapper nativeInterpreterWrapper = this.getHighSpeedVideoSizes;
        if (nativeInterpreterWrapper == null) {
            throw new java.lang.IllegalStateException("Internal error: The Interpreter has already been closed.");
        }
        return org.tensorflow.lite.NativeSignatureRunnerWrapper.nativeOutputNames(nativeInterpreterWrapper.getHighSpeedVideoFpsRanges(str).getHighSpeedVideoFpsRanges);
    }

    @Override // org.tensorflow.lite.InterpreterApi
    public void resizeInput(int i, int[] iArr) {
        org.tensorflow.lite.NativeInterpreterWrapper nativeInterpreterWrapper = this.getHighSpeedVideoSizes;
        if (nativeInterpreterWrapper != null) {
            nativeInterpreterWrapper.Camera2StreamConfigurationMap(i, iArr, false);
            return;
        }
        throw new java.lang.IllegalStateException("Internal error: The Interpreter has already been closed.");
    }

    @Override // org.tensorflow.lite.InterpreterApi
    public void resizeInput(int i, int[] iArr, boolean z) {
        org.tensorflow.lite.NativeInterpreterWrapper nativeInterpreterWrapper = this.getHighSpeedVideoSizes;
        if (nativeInterpreterWrapper != null) {
            nativeInterpreterWrapper.Camera2StreamConfigurationMap(i, iArr, z);
            return;
        }
        throw new java.lang.IllegalStateException("Internal error: The Interpreter has already been closed.");
    }

    @Override // org.tensorflow.lite.InterpreterApi
    public void runForMultipleInputsOutputs(java.lang.Object[] objArr, java.util.Map<java.lang.Integer, java.lang.Object> map) {
        org.tensorflow.lite.NativeInterpreterWrapper nativeInterpreterWrapper = this.getHighSpeedVideoSizes;
        if (nativeInterpreterWrapper != null) {
            nativeInterpreterWrapper.getHighSpeedVideoSizes(objArr, map);
            return;
        }
        throw new java.lang.IllegalStateException("Internal error: The Interpreter has already been closed.");
    }

    @Override // org.tensorflow.lite.InterpreterApi
    public void runSignature(java.util.Map<java.lang.String, java.lang.Object> map, java.util.Map<java.lang.String, java.lang.Object> map2) {
        if (this.getHighSpeedVideoSizes != null) {
            runSignature(map, map2, null);
            return;
        }
        throw new java.lang.IllegalStateException("Internal error: The Interpreter has already been closed.");
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0016  */
    @Override // org.tensorflow.lite.InterpreterApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void runSignature(java.util.Map<java.lang.String, java.lang.Object> map, java.util.Map<java.lang.String, java.lang.Object> map2, java.lang.String str) {
        java.lang.String str2;
        org.tensorflow.lite.NativeInterpreterWrapper nativeInterpreterWrapper = this.getHighSpeedVideoSizes;
        if (nativeInterpreterWrapper == null) {
            throw new java.lang.IllegalStateException("Internal error: The Interpreter has already been closed.");
        }
        if (str == null) {
            java.lang.String[] strArr = this.getHighResolutionOutputSizeshNQ4ISI;
            if (strArr.length == 1) {
                str2 = strArr[0];
                if (str2 != null) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Input error: SignatureDef signatureKey should not be null. null is only allowed if the model has a single Signature. Available Signatures: ");
                    sb.append(java.util.Arrays.toString(this.getHighResolutionOutputSizeshNQ4ISI));
                    throw new java.lang.IllegalArgumentException(sb.toString());
                }
                nativeInterpreterWrapper.getHighSpeedVideoSizes = -1L;
                if (map == null || map.isEmpty()) {
                    throw new java.lang.IllegalArgumentException("Input error: Inputs should not be null or empty.");
                }
                if (map2 == null) {
                    throw new java.lang.IllegalArgumentException("Input error: Outputs should not be null.");
                }
                org.tensorflow.lite.NativeSignatureRunnerWrapper highSpeedVideoFpsRanges = nativeInterpreterWrapper.getHighSpeedVideoFpsRanges(str2);
                if (org.tensorflow.lite.NativeSignatureRunnerWrapper.nativeGetSubgraphIndex(highSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges) == 0) {
                    java.lang.Object[] objArr = new java.lang.Object[map.size()];
                    for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry : map.entrySet()) {
                        objArr[highSpeedVideoFpsRanges.Camera2StreamConfigurationMap(entry.getKey())] = entry.getValue();
                    }
                    java.util.TreeMap treeMap = new java.util.TreeMap();
                    for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry2 : map2.entrySet()) {
                        int highResolutionOutputSizeshNQ4ISI = highSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI(entry2.getKey());
                        treeMap.put(java.lang.Integer.valueOf(highResolutionOutputSizeshNQ4ISI), entry2.getValue());
                    }
                    nativeInterpreterWrapper.getHighSpeedVideoSizes(objArr, treeMap);
                    return;
                }
                for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry3 : map.entrySet()) {
                    int[] highSpeedVideoSizes = nativeInterpreterWrapper.getHighSpeedVideoSizes(entry3.getKey(), str2).getHighSpeedVideoSizes(entry3.getValue());
                    if (highSpeedVideoSizes != null) {
                        try {
                            java.lang.String key = entry3.getKey();
                            highSpeedVideoFpsRanges.Camera2StreamConfigurationMap = false;
                            org.tensorflow.lite.NativeSignatureRunnerWrapper.nativeResizeInput(highSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges, highSpeedVideoFpsRanges.getHighSpeedVideoSizes, key, highSpeedVideoSizes);
                        } catch (java.lang.IllegalArgumentException e) {
                            throw ((java.lang.IllegalArgumentException) new java.lang.IllegalArgumentException(java.lang.String.format("Tensor passed for input '%s' of signature '%s' has different shape than expected", entry3.getKey(), str2)).initCause(e));
                        }
                    }
                }
                if (!highSpeedVideoFpsRanges.Camera2StreamConfigurationMap) {
                    org.tensorflow.lite.NativeSignatureRunnerWrapper.nativeAllocateTensors(highSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges, highSpeedVideoFpsRanges.getHighSpeedVideoSizes);
                    highSpeedVideoFpsRanges.Camera2StreamConfigurationMap = true;
                }
                for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry4 : map.entrySet()) {
                    org.tensorflow.lite.TensorImpl.getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges, entry4.getKey()).Camera2StreamConfigurationMap(entry4.getValue());
                }
                long nanoTime = java.lang.System.nanoTime();
                org.tensorflow.lite.NativeSignatureRunnerWrapper.nativeInvoke(highSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges, highSpeedVideoFpsRanges.getHighSpeedVideoSizes);
                long nanoTime2 = java.lang.System.nanoTime();
                for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry5 : map2.entrySet()) {
                    if (entry5.getValue() != null) {
                        org.tensorflow.lite.TensorImpl.getHighSpeedVideoFpsRanges(highSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges, entry5.getKey()).getHighSpeedVideoFpsRanges(entry5.getValue());
                    }
                }
                nativeInterpreterWrapper.getHighSpeedVideoSizes = nanoTime2 - nanoTime;
                return;
            }
        }
        str2 = str;
        if (str2 != null) {
        }
    }
}
