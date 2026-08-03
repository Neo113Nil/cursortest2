package com.google.firebase.encoders;

/* loaded from: classes3.dex */
public interface DataEncoder {
    java.lang.String encode(java.lang.Object obj);

    void encode(java.lang.Object obj, java.io.Writer writer) throws java.io.IOException;
}
