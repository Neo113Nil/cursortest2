package com.google.crypto.tink;

/* loaded from: classes4.dex */
public final class KeyTemplates {
    public static com.google.crypto.tink.KeyTemplate get(java.lang.String str) throws java.security.GeneralSecurityException {
        return com.google.crypto.tink.KeyTemplate.createFrom(com.google.crypto.tink.internal.MutableParametersRegistry.globalInstance().get(str));
    }

    private KeyTemplates() {
    }
}
