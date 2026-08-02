package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes4.dex */
final class ExtensionRegistryFactory {
    static final java.lang.Class<?> EXTENSION_REGISTRY_CLASS = reflectExtensionRegistry();
    static final java.lang.String FULL_REGISTRY_CLASS_NAME = "com.google.crypto.tink.shaded.protobuf.ExtensionRegistry";

    ExtensionRegistryFactory() {
    }

    static java.lang.Class<?> reflectExtensionRegistry() {
        try {
            return java.lang.Class.forName(FULL_REGISTRY_CLASS_NAME);
        } catch (java.lang.ClassNotFoundException unused) {
            return null;
        }
    }

    public static com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite create() {
        com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite invokeSubclassFactory = invokeSubclassFactory("newInstance");
        return invokeSubclassFactory != null ? invokeSubclassFactory : new com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite();
    }

    public static com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite createEmpty() {
        com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite invokeSubclassFactory = invokeSubclassFactory("getEmptyRegistry");
        return invokeSubclassFactory != null ? invokeSubclassFactory : com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.EMPTY_REGISTRY_LITE;
    }

    static boolean isFullRegistry(com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        java.lang.Class<?> cls;
        return (com.google.crypto.tink.shaded.protobuf.Protobuf.assumeLiteRuntime || (cls = EXTENSION_REGISTRY_CLASS) == null || !cls.isAssignableFrom(extensionRegistryLite.getClass())) ? false : true;
    }

    private static final com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite invokeSubclassFactory(java.lang.String str) {
        java.lang.Class<?> cls = EXTENSION_REGISTRY_CLASS;
        if (cls == null) {
            return null;
        }
        try {
            return (com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite) cls.getDeclaredMethod(str, new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }
}
