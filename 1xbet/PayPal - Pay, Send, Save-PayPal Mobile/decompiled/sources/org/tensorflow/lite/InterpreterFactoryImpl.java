package org.tensorflow.lite;

/* loaded from: classes18.dex */
class InterpreterFactoryImpl implements org.tensorflow.lite.InterpreterFactoryApi {
    private static native java.lang.String nativeRuntimeVersion();

    private static native java.lang.String nativeSchemaVersion();

    @Override // org.tensorflow.lite.InterpreterFactoryApi
    public org.tensorflow.lite.InterpreterApi create(java.io.File file, org.tensorflow.lite.InterpreterApi.Options options) {
        return new org.tensorflow.lite.InterpreterImpl(file, options == null ? null : new org.tensorflow.lite.InterpreterImpl.Options(options));
    }

    @Override // org.tensorflow.lite.InterpreterFactoryApi
    public org.tensorflow.lite.InterpreterApi create(java.nio.ByteBuffer byteBuffer, org.tensorflow.lite.InterpreterApi.Options options) {
        return new org.tensorflow.lite.InterpreterImpl(byteBuffer, options == null ? null : new org.tensorflow.lite.InterpreterImpl.Options(options));
    }

    @Override // org.tensorflow.lite.InterpreterFactoryApi
    public java.lang.String runtimeVersion() {
        org.tensorflow.lite.TensorFlowLite.init();
        return nativeRuntimeVersion();
    }

    @Override // org.tensorflow.lite.InterpreterFactoryApi
    public java.lang.String schemaVersion() {
        org.tensorflow.lite.TensorFlowLite.init();
        return nativeSchemaVersion();
    }

    @Override // org.tensorflow.lite.InterpreterFactoryApi
    public org.tensorflow.lite.nnapi.NnApiDelegate.PrivateInterface createNnApiDelegateImpl(org.tensorflow.lite.nnapi.NnApiDelegate.Options options) {
        return new org.tensorflow.lite.nnapi.NnApiDelegateImpl(options);
    }
}
