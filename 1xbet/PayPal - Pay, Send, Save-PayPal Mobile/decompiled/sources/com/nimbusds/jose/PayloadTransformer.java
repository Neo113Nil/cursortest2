package com.nimbusds.jose;

/* loaded from: classes10.dex */
public interface PayloadTransformer<T> {
    T transform(com.nimbusds.jose.Payload payload);
}
