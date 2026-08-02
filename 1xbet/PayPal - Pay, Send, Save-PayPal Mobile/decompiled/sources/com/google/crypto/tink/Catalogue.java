package com.google.crypto.tink;

@java.lang.Deprecated
/* loaded from: classes9.dex */
public interface Catalogue<P> {
    com.google.crypto.tink.KeyManager<P> getKeyManager(java.lang.String str, java.lang.String str2, int i) throws java.security.GeneralSecurityException;

    com.google.crypto.tink.internal.PrimitiveWrapper<?, P> getPrimitiveWrapper() throws java.security.GeneralSecurityException;
}
