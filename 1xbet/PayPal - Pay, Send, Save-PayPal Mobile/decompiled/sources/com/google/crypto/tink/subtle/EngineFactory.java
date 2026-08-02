package com.google.crypto.tink.subtle;

/* loaded from: classes4.dex */
public final class EngineFactory<T_WRAPPER extends com.google.crypto.tink.subtle.EngineWrapper<JcePrimitiveT>, JcePrimitiveT> {
    private final com.google.crypto.tink.subtle.EngineFactory.Policy<JcePrimitiveT> policy;
    public static final com.google.crypto.tink.subtle.EngineFactory<com.google.crypto.tink.subtle.EngineWrapper.TCipher, javax.crypto.Cipher> CIPHER = new com.google.crypto.tink.subtle.EngineFactory<>(new com.google.crypto.tink.subtle.EngineWrapper.TCipher());
    public static final com.google.crypto.tink.subtle.EngineFactory<com.google.crypto.tink.subtle.EngineWrapper.TMac, javax.crypto.Mac> MAC = new com.google.crypto.tink.subtle.EngineFactory<>(new com.google.crypto.tink.subtle.EngineWrapper.TMac());
    public static final com.google.crypto.tink.subtle.EngineFactory<com.google.crypto.tink.subtle.EngineWrapper.TSignature, java.security.Signature> SIGNATURE = new com.google.crypto.tink.subtle.EngineFactory<>(new com.google.crypto.tink.subtle.EngineWrapper.TSignature());
    public static final com.google.crypto.tink.subtle.EngineFactory<com.google.crypto.tink.subtle.EngineWrapper.TMessageDigest, java.security.MessageDigest> MESSAGE_DIGEST = new com.google.crypto.tink.subtle.EngineFactory<>(new com.google.crypto.tink.subtle.EngineWrapper.TMessageDigest());
    public static final com.google.crypto.tink.subtle.EngineFactory<com.google.crypto.tink.subtle.EngineWrapper.TKeyAgreement, javax.crypto.KeyAgreement> KEY_AGREEMENT = new com.google.crypto.tink.subtle.EngineFactory<>(new com.google.crypto.tink.subtle.EngineWrapper.TKeyAgreement());
    public static final com.google.crypto.tink.subtle.EngineFactory<com.google.crypto.tink.subtle.EngineWrapper.TKeyPairGenerator, java.security.KeyPairGenerator> KEY_PAIR_GENERATOR = new com.google.crypto.tink.subtle.EngineFactory<>(new com.google.crypto.tink.subtle.EngineWrapper.TKeyPairGenerator());
    public static final com.google.crypto.tink.subtle.EngineFactory<com.google.crypto.tink.subtle.EngineWrapper.TKeyFactory, java.security.KeyFactory> KEY_FACTORY = new com.google.crypto.tink.subtle.EngineFactory<>(new com.google.crypto.tink.subtle.EngineWrapper.TKeyFactory());

    interface Policy<JcePrimitiveT> {
        JcePrimitiveT getInstance(java.lang.String str) throws java.security.GeneralSecurityException;

        JcePrimitiveT getInstance(java.lang.String str, java.util.List<java.security.Provider> list) throws java.security.GeneralSecurityException;
    }

    static class DefaultPolicy<JcePrimitiveT> implements com.google.crypto.tink.subtle.EngineFactory.Policy<JcePrimitiveT> {
        private final com.google.crypto.tink.subtle.EngineWrapper<JcePrimitiveT> jceFactory;

        private DefaultPolicy(com.google.crypto.tink.subtle.EngineWrapper<JcePrimitiveT> engineWrapper) {
            this.jceFactory = engineWrapper;
        }

        @Override // com.google.crypto.tink.subtle.EngineFactory.Policy
        public JcePrimitiveT getInstance(java.lang.String str) throws java.security.GeneralSecurityException {
            return this.jceFactory.getInstance(str, null);
        }

        @Override // com.google.crypto.tink.subtle.EngineFactory.Policy
        public JcePrimitiveT getInstance(java.lang.String str, java.util.List<java.security.Provider> list) throws java.security.GeneralSecurityException {
            java.util.Iterator<java.security.Provider> it = list.iterator();
            while (it.hasNext()) {
                try {
                    return this.jceFactory.getInstance(str, it.next());
                } catch (java.lang.Exception unused) {
                }
            }
            return getInstance(str);
        }
    }

    static class FipsPolicy<JcePrimitiveT> implements com.google.crypto.tink.subtle.EngineFactory.Policy<JcePrimitiveT> {
        private final com.google.crypto.tink.subtle.EngineWrapper<JcePrimitiveT> jceFactory;

        private FipsPolicy(com.google.crypto.tink.subtle.EngineWrapper<JcePrimitiveT> engineWrapper) {
            this.jceFactory = engineWrapper;
        }

        @Override // com.google.crypto.tink.subtle.EngineFactory.Policy
        public JcePrimitiveT getInstance(java.lang.String str) throws java.security.GeneralSecurityException {
            java.util.Iterator<java.security.Provider> it = com.google.crypto.tink.subtle.EngineFactory.toProviderList(com.google.android.gms.security.ProviderInstaller.PROVIDER_NAME, "AndroidOpenSSL", "Conscrypt").iterator();
            java.lang.Exception exc = null;
            while (it.hasNext()) {
                try {
                    return this.jceFactory.getInstance(str, it.next());
                } catch (java.lang.Exception e) {
                    if (exc == null) {
                        exc = e;
                    }
                }
            }
            throw new java.security.GeneralSecurityException("No good Provider found.", exc);
        }

        @Override // com.google.crypto.tink.subtle.EngineFactory.Policy
        public JcePrimitiveT getInstance(java.lang.String str, java.util.List<java.security.Provider> list) throws java.security.GeneralSecurityException {
            return getInstance(str);
        }
    }

    static class AndroidPolicy<JcePrimitiveT> implements com.google.crypto.tink.subtle.EngineFactory.Policy<JcePrimitiveT> {
        private final com.google.crypto.tink.subtle.EngineWrapper<JcePrimitiveT> jceFactory;

        private AndroidPolicy(com.google.crypto.tink.subtle.EngineWrapper<JcePrimitiveT> engineWrapper) {
            this.jceFactory = engineWrapper;
        }

        @Override // com.google.crypto.tink.subtle.EngineFactory.Policy
        public JcePrimitiveT getInstance(java.lang.String str) throws java.security.GeneralSecurityException {
            java.util.Iterator<java.security.Provider> it = com.google.crypto.tink.subtle.EngineFactory.toProviderList(com.google.android.gms.security.ProviderInstaller.PROVIDER_NAME, "AndroidOpenSSL").iterator();
            java.lang.Exception exc = null;
            while (it.hasNext()) {
                try {
                    return this.jceFactory.getInstance(str, it.next());
                } catch (java.lang.Exception e) {
                    if (exc == null) {
                        exc = e;
                    }
                }
            }
            return this.jceFactory.getInstance(str, null);
        }

        @Override // com.google.crypto.tink.subtle.EngineFactory.Policy
        public JcePrimitiveT getInstance(java.lang.String str, java.util.List<java.security.Provider> list) throws java.security.GeneralSecurityException {
            return getInstance(str);
        }
    }

    public static java.util.List<java.security.Provider> toProviderList(java.lang.String... strArr) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str : strArr) {
            java.security.Provider provider = java.security.Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        return arrayList;
    }

    public EngineFactory(T_WRAPPER t_wrapper) {
        if (com.google.crypto.tink.config.internal.TinkFipsUtil.useOnlyFips()) {
            this.policy = new com.google.crypto.tink.subtle.EngineFactory.FipsPolicy(t_wrapper);
        } else if (com.google.crypto.tink.subtle.SubtleUtil.isAndroid()) {
            this.policy = new com.google.crypto.tink.subtle.EngineFactory.AndroidPolicy(t_wrapper);
        } else {
            this.policy = new com.google.crypto.tink.subtle.EngineFactory.DefaultPolicy(t_wrapper);
        }
    }

    public final JcePrimitiveT getInstance(java.lang.String str) throws java.security.GeneralSecurityException {
        return this.policy.getInstance(str);
    }

    final JcePrimitiveT getInstance(java.lang.String str, java.util.List<java.security.Provider> list) throws java.security.GeneralSecurityException {
        return this.policy.getInstance(str, list);
    }
}
