package com.google.crypto.tink.internal;

/* loaded from: classes4.dex */
public final class KeyManagerRegistry {
    private java.util.concurrent.ConcurrentMap<java.lang.String, com.google.crypto.tink.KeyManager<?>> keyManagerMap;
    private java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Boolean> newKeyAllowedMap;
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(com.google.crypto.tink.internal.KeyManagerRegistry.class.getName());
    private static final com.google.crypto.tink.internal.KeyManagerRegistry GLOBAL_INSTANCE = new com.google.crypto.tink.internal.KeyManagerRegistry();

    public static com.google.crypto.tink.internal.KeyManagerRegistry globalInstance() {
        return GLOBAL_INSTANCE;
    }

    public static void resetGlobalInstanceTestOnly() {
        com.google.crypto.tink.internal.KeyManagerRegistry keyManagerRegistry = GLOBAL_INSTANCE;
        keyManagerRegistry.keyManagerMap = new java.util.concurrent.ConcurrentHashMap();
        keyManagerRegistry.newKeyAllowedMap = new java.util.concurrent.ConcurrentHashMap();
    }

    public KeyManagerRegistry(com.google.crypto.tink.internal.KeyManagerRegistry keyManagerRegistry) {
        this.keyManagerMap = new java.util.concurrent.ConcurrentHashMap(keyManagerRegistry.keyManagerMap);
        this.newKeyAllowedMap = new java.util.concurrent.ConcurrentHashMap(keyManagerRegistry.newKeyAllowedMap);
    }

    public KeyManagerRegistry() {
        this.keyManagerMap = new java.util.concurrent.ConcurrentHashMap();
        this.newKeyAllowedMap = new java.util.concurrent.ConcurrentHashMap();
    }

    private com.google.crypto.tink.KeyManager<?> getKeyManagerOrThrow(java.lang.String str) throws java.security.GeneralSecurityException {
        com.google.crypto.tink.KeyManager<?> keyManager;
        synchronized (this) {
            if (!this.keyManagerMap.containsKey(str)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("No key manager found for key type ");
                sb.append(str);
                sb.append(", see https://developers.google.com/tink/faq/registration_errors");
                throw new java.security.GeneralSecurityException(sb.toString());
            }
            keyManager = this.keyManagerMap.get(str);
        }
        return keyManager;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0080, code lost:
    
        r4.keyManagerMap.putIfAbsent(r0, r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void insertKeyManager(com.google.crypto.tink.KeyManager<?> keyManager, boolean z, boolean z2) throws java.security.GeneralSecurityException {
        synchronized (this) {
            java.lang.String keyType = keyManager.getKeyType();
            if (z2 && this.newKeyAllowedMap.containsKey(keyType) && !this.newKeyAllowedMap.get(keyType).booleanValue()) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("New keys are already disallowed for key type ");
                sb.append(keyType);
                throw new java.security.GeneralSecurityException(sb.toString());
            }
            com.google.crypto.tink.KeyManager<?> keyManager2 = this.keyManagerMap.get(keyType);
            if (keyManager2 != null && !keyManager2.getClass().equals(keyManager.getClass())) {
                java.util.logging.Logger logger2 = logger;
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Attempted overwrite of a registered key manager for key type ");
                sb2.append(keyType);
                logger2.warning(sb2.toString());
                throw new java.security.GeneralSecurityException(java.lang.String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", keyType, keyManager2.getClass().getName(), keyManager.getClass().getName()));
            }
            this.keyManagerMap.put(keyType, keyManager);
            this.newKeyAllowedMap.put(keyType, java.lang.Boolean.valueOf(z2));
        }
    }

    public final <P> void registerKeyManager(com.google.crypto.tink.KeyManager<P> keyManager, boolean z) throws java.security.GeneralSecurityException {
        synchronized (this) {
            registerKeyManagerWithFipsCompatibility(keyManager, com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_NOT_FIPS, z);
        }
    }

    public final <P> void registerKeyManagerWithFipsCompatibility(com.google.crypto.tink.KeyManager<P> keyManager, com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility algorithmFipsCompatibility, boolean z) throws java.security.GeneralSecurityException {
        synchronized (this) {
            if (!algorithmFipsCompatibility.isCompatible()) {
                throw new java.security.GeneralSecurityException("Cannot register key manager: FIPS compatibility insufficient");
            }
            insertKeyManager(keyManager, false, z);
        }
    }

    public final boolean typeUrlExists(java.lang.String str) {
        return this.keyManagerMap.containsKey(str);
    }

    public final <P> com.google.crypto.tink.KeyManager<P> getKeyManager(java.lang.String str, java.lang.Class<P> cls) throws java.security.GeneralSecurityException {
        com.google.crypto.tink.KeyManager<P> keyManager = (com.google.crypto.tink.KeyManager<P>) getKeyManagerOrThrow(str);
        if (keyManager.getPrimitiveClass().equals(cls)) {
            return keyManager;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Primitive type ");
        sb.append(cls.getName());
        sb.append(" not supported by key manager of type ");
        sb.append(keyManager.getClass());
        sb.append(", which only supports: ");
        sb.append(keyManager.getPrimitiveClass());
        throw new java.security.GeneralSecurityException(sb.toString());
    }

    public final com.google.crypto.tink.KeyManager<?> getUntypedKeyManager(java.lang.String str) throws java.security.GeneralSecurityException {
        return getKeyManagerOrThrow(str);
    }

    public final boolean isNewKeyAllowed(java.lang.String str) {
        return this.newKeyAllowedMap.get(str).booleanValue();
    }

    public final boolean isEmpty() {
        return this.keyManagerMap.isEmpty();
    }

    public final void restrictToFipsIfEmptyAndGlobalInstance() throws java.security.GeneralSecurityException {
        synchronized (this) {
            if (this != globalInstance()) {
                throw new java.security.GeneralSecurityException("Only the global instance can be restricted to FIPS.");
            }
            if (com.google.crypto.tink.config.internal.TinkFipsUtil.useOnlyFips()) {
                return;
            }
            if (!isEmpty()) {
                throw new java.security.GeneralSecurityException("Could not enable FIPS mode as Registry is not empty.");
            }
            com.google.crypto.tink.config.internal.TinkFipsUtil.setFipsRestricted();
        }
    }
}
