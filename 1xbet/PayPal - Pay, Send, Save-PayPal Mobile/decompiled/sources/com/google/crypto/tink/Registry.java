package com.google.crypto.tink;

/* loaded from: classes9.dex */
public final class Registry {
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(com.google.crypto.tink.Registry.class.getName());
    private static final java.util.concurrent.ConcurrentMap<java.lang.String, com.google.crypto.tink.Catalogue<?>> catalogueMap = new java.util.concurrent.ConcurrentHashMap();
    private static final java.util.Set<java.lang.Class<?>> ALLOWED_PRIMITIVES = java.util.Collections.unmodifiableSet(createAllowedPrimitives());

    static void reset() {
        synchronized (com.google.crypto.tink.Registry.class) {
            com.google.crypto.tink.internal.KeyManagerRegistry.resetGlobalInstanceTestOnly();
            com.google.crypto.tink.internal.MutablePrimitiveRegistry.resetGlobalInstanceTestOnly();
            catalogueMap.clear();
        }
    }

    @java.lang.Deprecated
    public static void addCatalogue(java.lang.String str, com.google.crypto.tink.Catalogue<?> catalogue) throws java.security.GeneralSecurityException {
        synchronized (com.google.crypto.tink.Registry.class) {
            if (str == null) {
                throw new java.lang.IllegalArgumentException("catalogueName must be non-null.");
            }
            if (catalogue == null) {
                throw new java.lang.IllegalArgumentException("catalogue must be non-null.");
            }
            java.util.concurrent.ConcurrentMap<java.lang.String, com.google.crypto.tink.Catalogue<?>> concurrentMap = catalogueMap;
            if (concurrentMap.containsKey(str.toLowerCase(java.util.Locale.US))) {
                if (!catalogue.getClass().getName().equals(concurrentMap.get(str.toLowerCase(java.util.Locale.US)).getClass().getName())) {
                    java.util.logging.Logger logger2 = logger;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Attempted overwrite of a catalogueName catalogue for name ");
                    sb.append(str);
                    logger2.warning(sb.toString());
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("catalogue for name ");
                    sb2.append(str);
                    sb2.append(" has been already registered");
                    throw new java.security.GeneralSecurityException(sb2.toString());
                }
            }
            concurrentMap.put(str.toLowerCase(java.util.Locale.US), catalogue);
        }
    }

    @java.lang.Deprecated
    public static com.google.crypto.tink.Catalogue<?> getCatalogue(java.lang.String str) throws java.security.GeneralSecurityException {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("catalogueName must be non-null.");
        }
        com.google.crypto.tink.Catalogue<?> catalogue = catalogueMap.get(str.toLowerCase(java.util.Locale.US));
        if (catalogue != null) {
            return catalogue;
        }
        java.lang.String format = java.lang.String.format("no catalogue found for %s. ", str);
        if (str.toLowerCase(java.util.Locale.US).startsWith("tinkaead")) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(format);
            sb.append("Maybe call AeadConfig.register().");
            format = sb.toString();
        }
        if (str.toLowerCase(java.util.Locale.US).startsWith("tinkdeterministicaead")) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(format);
            sb2.append("Maybe call DeterministicAeadConfig.register().");
            format = sb2.toString();
        } else if (str.toLowerCase(java.util.Locale.US).startsWith("tinkstreamingaead")) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            sb3.append(format);
            sb3.append("Maybe call StreamingAeadConfig.register().");
            format = sb3.toString();
        } else if (str.toLowerCase(java.util.Locale.US).startsWith("tinkhybriddecrypt") || str.toLowerCase(java.util.Locale.US).startsWith("tinkhybridencrypt")) {
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
            sb4.append(format);
            sb4.append("Maybe call HybridConfig.register().");
            format = sb4.toString();
        } else if (str.toLowerCase(java.util.Locale.US).startsWith("tinkmac")) {
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
            sb5.append(format);
            sb5.append("Maybe call MacConfig.register().");
            format = sb5.toString();
        } else if (str.toLowerCase(java.util.Locale.US).startsWith("tinkpublickeysign") || str.toLowerCase(java.util.Locale.US).startsWith("tinkpublickeyverify")) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(format);
            sb6.append("Maybe call SignatureConfig.register().");
            format = sb6.toString();
        } else if (str.toLowerCase(java.util.Locale.US).startsWith("tink")) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(format);
            sb7.append("Maybe call TinkConfig.register().");
            format = sb7.toString();
        }
        throw new java.security.GeneralSecurityException(format);
    }

    public static <P> void registerKeyManager(com.google.crypto.tink.KeyManager<P> keyManager) throws java.security.GeneralSecurityException {
        synchronized (com.google.crypto.tink.Registry.class) {
            registerKeyManager((com.google.crypto.tink.KeyManager) keyManager, true);
        }
    }

    private static java.util.Set<java.lang.Class<?>> createAllowedPrimitives() {
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.add(com.google.crypto.tink.Aead.class);
        hashSet.add(com.google.crypto.tink.DeterministicAead.class);
        hashSet.add(com.google.crypto.tink.StreamingAead.class);
        hashSet.add(com.google.crypto.tink.HybridEncrypt.class);
        hashSet.add(com.google.crypto.tink.HybridDecrypt.class);
        hashSet.add(com.google.crypto.tink.Mac.class);
        hashSet.add(com.google.crypto.tink.prf.Prf.class);
        hashSet.add(com.google.crypto.tink.PublicKeySign.class);
        hashSet.add(com.google.crypto.tink.PublicKeyVerify.class);
        return hashSet;
    }

    public static <P> void registerKeyManager(com.google.crypto.tink.KeyManager<P> keyManager, boolean z) throws java.security.GeneralSecurityException {
        synchronized (com.google.crypto.tink.Registry.class) {
            if (keyManager == null) {
                throw new java.lang.IllegalArgumentException("key manager must be non-null.");
            }
            if (!ALLOWED_PRIMITIVES.contains(keyManager.getPrimitiveClass())) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Registration of key managers for class ");
                sb.append(keyManager.getPrimitiveClass());
                sb.append(" has been disabled. Please file an issue on https://github.com/tink-crypto/tink-java");
                throw new java.security.GeneralSecurityException(sb.toString());
            }
            if (!com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_NOT_FIPS.isCompatible()) {
                throw new java.security.GeneralSecurityException("Registering key managers is not supported in FIPS mode");
            }
            com.google.crypto.tink.internal.KeyManagerRegistry.globalInstance().registerKeyManager(keyManager, z);
        }
    }

    @java.lang.Deprecated
    public static <P> void registerKeyManager(java.lang.String str, com.google.crypto.tink.KeyManager<P> keyManager) throws java.security.GeneralSecurityException {
        synchronized (com.google.crypto.tink.Registry.class) {
            registerKeyManager(str, keyManager, true);
        }
    }

    @java.lang.Deprecated
    public static <P> void registerKeyManager(java.lang.String str, com.google.crypto.tink.KeyManager<P> keyManager, boolean z) throws java.security.GeneralSecurityException {
        synchronized (com.google.crypto.tink.Registry.class) {
            if (keyManager == null) {
                throw new java.lang.IllegalArgumentException("key manager must be non-null.");
            }
            if (!str.equals(keyManager.getKeyType())) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Manager does not support key type ");
                sb.append(str);
                sb.append(".");
                throw new java.security.GeneralSecurityException(sb.toString());
            }
            registerKeyManager(keyManager, z);
        }
    }

    @java.lang.Deprecated
    public static <P> com.google.crypto.tink.KeyManager<P> getKeyManager(java.lang.String str, java.lang.Class<P> cls) throws java.security.GeneralSecurityException {
        return com.google.crypto.tink.internal.KeyManagerRegistry.globalInstance().getKeyManager(str, cls);
    }

    @java.lang.Deprecated
    public static com.google.crypto.tink.KeyManager<?> getUntypedKeyManager(java.lang.String str) throws java.security.GeneralSecurityException {
        return com.google.crypto.tink.internal.KeyManagerRegistry.globalInstance().getUntypedKeyManager(str);
    }

    @java.lang.Deprecated
    public static com.google.crypto.tink.proto.KeyData newKeyData(com.google.crypto.tink.proto.KeyTemplate keyTemplate) throws java.security.GeneralSecurityException {
        com.google.crypto.tink.proto.KeyData newKeyData;
        synchronized (com.google.crypto.tink.Registry.class) {
            com.google.crypto.tink.KeyManager<?> untypedKeyManager = com.google.crypto.tink.internal.KeyManagerRegistry.globalInstance().getUntypedKeyManager(keyTemplate.getTypeUrl());
            if (com.google.crypto.tink.internal.KeyManagerRegistry.globalInstance().isNewKeyAllowed(keyTemplate.getTypeUrl())) {
                newKeyData = untypedKeyManager.newKeyData(keyTemplate.getValue());
            } else {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("newKey-operation not permitted for key type ");
                sb.append(keyTemplate.getTypeUrl());
                throw new java.security.GeneralSecurityException(sb.toString());
            }
        }
        return newKeyData;
    }

    @java.lang.Deprecated
    public static com.google.crypto.tink.proto.KeyData newKeyData(com.google.crypto.tink.KeyTemplate keyTemplate) throws java.security.GeneralSecurityException {
        com.google.crypto.tink.proto.KeyData newKeyData;
        synchronized (com.google.crypto.tink.Registry.class) {
            try {
                newKeyData = newKeyData(com.google.crypto.tink.proto.KeyTemplate.parseFrom(com.google.crypto.tink.TinkProtoParametersFormat.serialize(keyTemplate.toParameters()), com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()));
            } catch (com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException e) {
                throw new java.security.GeneralSecurityException("Failed to parse serialized parameters", e);
            }
        }
        return newKeyData;
    }

    @java.lang.Deprecated
    public static com.google.crypto.tink.shaded.protobuf.MessageLite newKey(com.google.crypto.tink.proto.KeyTemplate keyTemplate) throws java.security.GeneralSecurityException {
        com.google.crypto.tink.shaded.protobuf.MessageLite newKey;
        synchronized (com.google.crypto.tink.Registry.class) {
            com.google.crypto.tink.KeyManager<?> untypedKeyManager = getUntypedKeyManager(keyTemplate.getTypeUrl());
            if (com.google.crypto.tink.internal.KeyManagerRegistry.globalInstance().isNewKeyAllowed(keyTemplate.getTypeUrl())) {
                newKey = untypedKeyManager.newKey(keyTemplate.getValue());
            } else {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("newKey-operation not permitted for key type ");
                sb.append(keyTemplate.getTypeUrl());
                throw new java.security.GeneralSecurityException(sb.toString());
            }
        }
        return newKey;
    }

    @java.lang.Deprecated
    public static com.google.crypto.tink.shaded.protobuf.MessageLite newKey(java.lang.String str, com.google.crypto.tink.shaded.protobuf.MessageLite messageLite) throws java.security.GeneralSecurityException {
        com.google.crypto.tink.shaded.protobuf.MessageLite newKey;
        synchronized (com.google.crypto.tink.Registry.class) {
            com.google.crypto.tink.KeyManager<?> untypedKeyManager = getUntypedKeyManager(str);
            if (com.google.crypto.tink.internal.KeyManagerRegistry.globalInstance().isNewKeyAllowed(str)) {
                newKey = untypedKeyManager.newKey(messageLite);
            } else {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("newKey-operation not permitted for key type ");
                sb.append(str);
                throw new java.security.GeneralSecurityException(sb.toString());
            }
        }
        return newKey;
    }

    @java.lang.Deprecated
    public static com.google.crypto.tink.proto.KeyData getPublicKeyData(java.lang.String str, com.google.crypto.tink.shaded.protobuf.ByteString byteString) throws java.security.GeneralSecurityException {
        com.google.crypto.tink.KeyManager<?> untypedKeyManager = getUntypedKeyManager(str);
        if (!(untypedKeyManager instanceof com.google.crypto.tink.PrivateKeyManager)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("manager for key type ");
            sb.append(str);
            sb.append(" is not a PrivateKeyManager");
            throw new java.security.GeneralSecurityException(sb.toString());
        }
        return ((com.google.crypto.tink.PrivateKeyManager) untypedKeyManager).getPublicKeyData(byteString);
    }

    @java.lang.Deprecated
    public static <P> P getPrimitive(java.lang.String str, com.google.crypto.tink.shaded.protobuf.MessageLite messageLite, java.lang.Class<P> cls) throws java.security.GeneralSecurityException {
        return com.google.crypto.tink.internal.KeyManagerRegistry.globalInstance().getKeyManager(str, cls).getPrimitive(messageLite.toByteString());
    }

    @java.lang.Deprecated
    public static <P> P getPrimitive(java.lang.String str, com.google.crypto.tink.shaded.protobuf.ByteString byteString, java.lang.Class<P> cls) throws java.security.GeneralSecurityException {
        return com.google.crypto.tink.internal.KeyManagerRegistry.globalInstance().getKeyManager(str, cls).getPrimitive(byteString);
    }

    @java.lang.Deprecated
    public static <P> P getPrimitive(java.lang.String str, byte[] bArr, java.lang.Class<P> cls) throws java.security.GeneralSecurityException {
        return (P) getPrimitive(str, com.google.crypto.tink.shaded.protobuf.ByteString.copyFrom(bArr), cls);
    }

    @java.lang.Deprecated
    public static <P> P getPrimitive(com.google.crypto.tink.proto.KeyData keyData, java.lang.Class<P> cls) throws java.security.GeneralSecurityException {
        return (P) getPrimitive(keyData.getTypeUrl(), keyData.getValue(), cls);
    }

    static <KeyT extends com.google.crypto.tink.Key, P> P getFullPrimitive(KeyT keyt, java.lang.Class<P> cls) throws java.security.GeneralSecurityException {
        return (P) com.google.crypto.tink.internal.MutablePrimitiveRegistry.globalInstance().getPrimitive(keyt, cls);
    }

    public static java.util.List<java.lang.String> keyTemplates() {
        java.util.List<java.lang.String> names;
        synchronized (com.google.crypto.tink.Registry.class) {
            names = com.google.crypto.tink.internal.MutableParametersRegistry.globalInstance().getNames();
        }
        return names;
    }

    public static void restrictToFipsIfEmpty() throws java.security.GeneralSecurityException {
        synchronized (com.google.crypto.tink.Registry.class) {
            com.google.crypto.tink.internal.KeyManagerRegistry.globalInstance().restrictToFipsIfEmptyAndGlobalInstance();
        }
    }

    private Registry() {
    }
}
