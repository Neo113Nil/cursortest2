package com.google.firebase.encoders;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public interface Encoder<TValue, TContext> {
    void encode(TValue tvalue, TContext tcontext) throws java.io.IOException;
}
