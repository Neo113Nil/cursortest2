package com.google.crypto.tink;

/* loaded from: classes9.dex */
public final class Config {
    public static com.google.crypto.tink.proto.KeyTypeEntry getTinkKeyTypeEntry(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, boolean z) {
        return com.google.crypto.tink.proto.KeyTypeEntry.newBuilder().setPrimitiveName(str2).setTypeUrl("type.googleapis.com/google.crypto.tink.".concat(java.lang.String.valueOf(str3))).setKeyManagerVersion(i).setNewKeyAllowed(z).setCatalogueName(str).build();
    }

    public static void register(com.google.crypto.tink.proto.RegistryConfig registryConfig) throws java.security.GeneralSecurityException {
        java.util.Iterator<com.google.crypto.tink.proto.KeyTypeEntry> it = registryConfig.getEntryList().iterator();
        while (it.hasNext()) {
            registerKeyType(it.next());
        }
    }

    public static void registerKeyType(com.google.crypto.tink.proto.KeyTypeEntry keyTypeEntry) throws java.security.GeneralSecurityException {
        validate(keyTypeEntry);
        if (keyTypeEntry.getCatalogueName().equals("TinkAead") || keyTypeEntry.getCatalogueName().equals("TinkMac") || keyTypeEntry.getCatalogueName().equals("TinkHybridDecrypt") || keyTypeEntry.getCatalogueName().equals("TinkHybridEncrypt") || keyTypeEntry.getCatalogueName().equals("TinkPublicKeySign") || keyTypeEntry.getCatalogueName().equals("TinkPublicKeyVerify") || keyTypeEntry.getCatalogueName().equals("TinkStreamingAead") || keyTypeEntry.getCatalogueName().equals("TinkDeterministicAead")) {
            return;
        }
        com.google.crypto.tink.Catalogue<?> catalogue = com.google.crypto.tink.Registry.getCatalogue(keyTypeEntry.getCatalogueName());
        com.google.crypto.tink.internal.MutablePrimitiveRegistry.globalInstance().registerPrimitiveWrapper(catalogue.getPrimitiveWrapper());
        com.google.crypto.tink.Registry.registerKeyManager(catalogue.getKeyManager(keyTypeEntry.getTypeUrl(), keyTypeEntry.getPrimitiveName(), keyTypeEntry.getKeyManagerVersion()), keyTypeEntry.getNewKeyAllowed());
    }

    private static void validate(com.google.crypto.tink.proto.KeyTypeEntry keyTypeEntry) throws java.security.GeneralSecurityException {
        if (keyTypeEntry.getTypeUrl().isEmpty()) {
            throw new java.security.GeneralSecurityException("Missing type_url.");
        }
        if (keyTypeEntry.getPrimitiveName().isEmpty()) {
            throw new java.security.GeneralSecurityException("Missing primitive_name.");
        }
        if (keyTypeEntry.getCatalogueName().isEmpty()) {
            throw new java.security.GeneralSecurityException("Missing catalogue_name.");
        }
    }

    private Config() {
    }
}
