package com.google.crypto.tink.internal;

/* loaded from: classes4.dex */
public interface PrimitiveWrapper<B, P> {

    public interface PrimitiveFactory<B> {
        B create(com.google.crypto.tink.internal.KeysetHandleInterface.Entry entry) throws java.security.GeneralSecurityException;
    }

    java.lang.Class<B> getInputPrimitiveClass();

    java.lang.Class<P> getPrimitiveClass();

    P wrap(com.google.crypto.tink.internal.KeysetHandleInterface keysetHandleInterface, com.google.crypto.tink.internal.MonitoringAnnotations monitoringAnnotations, com.google.crypto.tink.internal.PrimitiveWrapper.PrimitiveFactory<B> primitiveFactory) throws java.security.GeneralSecurityException;
}
