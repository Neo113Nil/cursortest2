package com.google.crypto.tink;

/* loaded from: classes4.dex */
public interface KmsClient {
    boolean doesSupport(java.lang.String str);

    com.google.crypto.tink.Aead getAead(java.lang.String str) throws java.security.GeneralSecurityException;

    com.google.crypto.tink.KmsClient withCredentials(java.lang.String str) throws java.security.GeneralSecurityException;

    com.google.crypto.tink.KmsClient withDefaultCredentials() throws java.security.GeneralSecurityException;
}
