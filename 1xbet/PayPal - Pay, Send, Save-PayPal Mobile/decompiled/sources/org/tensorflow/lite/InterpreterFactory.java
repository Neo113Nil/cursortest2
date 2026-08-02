package org.tensorflow.lite;

@java.lang.Deprecated
/* loaded from: classes18.dex */
public class InterpreterFactory {
    public org.tensorflow.lite.InterpreterApi create(java.io.File file, org.tensorflow.lite.InterpreterApi.Options options) {
        return org.tensorflow.lite.InterpreterApi.create(file, options);
    }

    public org.tensorflow.lite.InterpreterApi create(java.nio.ByteBuffer byteBuffer, org.tensorflow.lite.InterpreterApi.Options options) {
        return org.tensorflow.lite.InterpreterApi.create(byteBuffer, options);
    }
}
