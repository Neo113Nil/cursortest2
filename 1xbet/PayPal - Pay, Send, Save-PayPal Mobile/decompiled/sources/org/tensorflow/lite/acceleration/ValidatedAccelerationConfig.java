package org.tensorflow.lite.acceleration;

/* loaded from: classes18.dex */
public interface ValidatedAccelerationConfig {
    void apply(org.tensorflow.lite.InterpreterApi.Options options);

    byte[] serialize();
}
