package com.google.firebase.encoders;

/* loaded from: classes4.dex */
public interface Encoder<TValue, TContext> {
    void encode(TValue tvalue, TContext tcontext) throws java.io.IOException;
}
