package com.nimbusds.jose.jca;

/* loaded from: classes4.dex */
public class JCAContext {
    private java.security.Provider provider;
    private java.security.SecureRandom randomGen;

    public JCAContext() {
        this(null, null);
    }

    public JCAContext(java.security.Provider provider, java.security.SecureRandom secureRandom) {
        this.provider = provider;
        this.randomGen = secureRandom;
    }

    public java.security.Provider getProvider() {
        return this.provider;
    }

    public void setProvider(java.security.Provider provider) {
        this.provider = provider;
    }

    public java.security.SecureRandom getSecureRandom() {
        java.security.SecureRandom secureRandom = this.randomGen;
        return secureRandom != null ? secureRandom : new java.security.SecureRandom();
    }

    public void setSecureRandom(java.security.SecureRandom secureRandom) {
        this.randomGen = secureRandom;
    }
}
