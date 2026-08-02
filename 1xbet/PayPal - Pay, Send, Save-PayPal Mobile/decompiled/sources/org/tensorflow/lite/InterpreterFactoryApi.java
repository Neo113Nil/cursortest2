package org.tensorflow.lite;

/* loaded from: classes18.dex */
public interface InterpreterFactoryApi {
    org.tensorflow.lite.InterpreterApi create(java.io.File file, org.tensorflow.lite.InterpreterApi.Options options);

    org.tensorflow.lite.InterpreterApi create(java.nio.ByteBuffer byteBuffer, org.tensorflow.lite.InterpreterApi.Options options);

    org.tensorflow.lite.nnapi.NnApiDelegate.PrivateInterface createNnApiDelegateImpl(org.tensorflow.lite.nnapi.NnApiDelegate.Options options);

    java.lang.String runtimeVersion();

    java.lang.String schemaVersion();
}
