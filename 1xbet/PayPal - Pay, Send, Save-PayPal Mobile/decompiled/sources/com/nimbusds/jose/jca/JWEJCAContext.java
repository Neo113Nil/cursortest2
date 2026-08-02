package com.nimbusds.jose.jca;

/* loaded from: classes10.dex */
public final class JWEJCAContext extends com.nimbusds.jose.jca.JCAContext {
    private java.security.Provider ceProvider;
    private java.security.Provider keProvider;
    private java.security.Provider macProvider;

    public JWEJCAContext() {
        this(null, null, null, null, null);
    }

    public JWEJCAContext(java.security.Provider provider, java.security.Provider provider2, java.security.Provider provider3, java.security.Provider provider4, java.security.SecureRandom secureRandom) {
        super(provider, secureRandom);
        this.keProvider = provider2;
        this.ceProvider = provider3;
        this.macProvider = provider4;
    }

    public final void setKeyEncryptionProvider(java.security.Provider provider) {
        this.keProvider = provider;
    }

    public final java.security.Provider getKeyEncryptionProvider() {
        java.security.Provider provider = this.keProvider;
        return provider != null ? provider : getProvider();
    }

    public final void setContentEncryptionProvider(java.security.Provider provider) {
        this.ceProvider = provider;
    }

    public final java.security.Provider getContentEncryptionProvider() {
        java.security.Provider provider = this.ceProvider;
        return provider != null ? provider : getProvider();
    }

    public final void setMACProvider(java.security.Provider provider) {
        this.macProvider = provider;
    }

    public final java.security.Provider getMACProvider() {
        java.security.Provider provider = this.macProvider;
        return provider != null ? provider : getProvider();
    }
}
