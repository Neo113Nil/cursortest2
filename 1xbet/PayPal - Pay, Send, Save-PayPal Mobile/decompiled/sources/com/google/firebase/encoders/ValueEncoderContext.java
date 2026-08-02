package com.google.firebase.encoders;

/* loaded from: classes4.dex */
public interface ValueEncoderContext {
    com.google.firebase.encoders.ValueEncoderContext add(double d) throws java.io.IOException;

    com.google.firebase.encoders.ValueEncoderContext add(float f) throws java.io.IOException;

    com.google.firebase.encoders.ValueEncoderContext add(int i) throws java.io.IOException;

    com.google.firebase.encoders.ValueEncoderContext add(long j) throws java.io.IOException;

    com.google.firebase.encoders.ValueEncoderContext add(java.lang.String str) throws java.io.IOException;

    com.google.firebase.encoders.ValueEncoderContext add(boolean z) throws java.io.IOException;

    com.google.firebase.encoders.ValueEncoderContext add(byte[] bArr) throws java.io.IOException;
}
