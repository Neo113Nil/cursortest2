package org.tensorflow.lite;

/* loaded from: classes18.dex */
final class NativeInterpreterWrapperExperimental extends org.tensorflow.lite.NativeInterpreterWrapper {
    static native void resetVariableTensors(long j, long j2);

    NativeInterpreterWrapperExperimental(java.lang.String str, org.tensorflow.lite.InterpreterImpl.Options options) {
        super(str, options);
    }

    NativeInterpreterWrapperExperimental(java.nio.ByteBuffer byteBuffer, org.tensorflow.lite.InterpreterImpl.Options options) {
        super(byteBuffer, options);
    }
}
