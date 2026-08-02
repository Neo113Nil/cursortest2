package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes4.dex */
public class ExtensionRegistryLite {
    static final com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite EMPTY_REGISTRY_LITE = new com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite(true);
    static final java.lang.String EXTENSION_CLASS_NAME = "com.google.crypto.tink.shaded.protobuf.Extension";
    private static volatile boolean eagerlyParseMessageSets = false;
    private static volatile com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite emptyRegistry;
    private final java.util.Map<com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.ObjectIntPair, com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.GeneratedExtension<?, ?>> extensionsByNumber;

    /* loaded from: classes9.dex */
    static class ExtensionClassHolder {
        static final java.lang.Class<?> INSTANCE = resolveExtensionClass();

        private ExtensionClassHolder() {
        }

        static java.lang.Class<?> resolveExtensionClass() {
            try {
                return java.lang.Class.forName(com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.EXTENSION_CLASS_NAME);
            } catch (java.lang.ClassNotFoundException unused) {
                return null;
            }
        }
    }

    public static boolean isEagerlyParseMessageSets() {
        return eagerlyParseMessageSets;
    }

    public static void setEagerlyParseMessageSets(boolean z) {
        eagerlyParseMessageSets = z;
    }

    public static com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite newInstance() {
        if (com.google.crypto.tink.shaded.protobuf.Protobuf.assumeLiteRuntime) {
            return new com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite();
        }
        return com.google.crypto.tink.shaded.protobuf.ExtensionRegistryFactory.create();
    }

    public static com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite getEmptyRegistry() {
        com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite;
        if (com.google.crypto.tink.shaded.protobuf.Protobuf.assumeLiteRuntime) {
            return EMPTY_REGISTRY_LITE;
        }
        com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite2 = emptyRegistry;
        if (extensionRegistryLite2 != null) {
            return extensionRegistryLite2;
        }
        synchronized (com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.class) {
            extensionRegistryLite = emptyRegistry;
            if (extensionRegistryLite == null) {
                extensionRegistryLite = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryFactory.createEmpty();
                emptyRegistry = extensionRegistryLite;
            }
        }
        return extensionRegistryLite;
    }

    public com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite getUnmodifiable() {
        return new com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite(this);
    }

    public <ContainingType extends com.google.crypto.tink.shaded.protobuf.MessageLite> com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.GeneratedExtension<ContainingType, ?> findLiteExtensionByNumber(ContainingType containingtype, int i) {
        return (com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.GeneratedExtension) this.extensionsByNumber.get(new com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.ObjectIntPair(containingtype, i));
    }

    public final void add(com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.GeneratedExtension<?, ?> generatedExtension) {
        this.extensionsByNumber.put(new com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.ObjectIntPair(generatedExtension.getContainingTypeDefaultInstance(), generatedExtension.getNumber()), generatedExtension);
    }

    public final void add(com.google.crypto.tink.shaded.protobuf.ExtensionLite<?, ?> extensionLite) {
        if (com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.GeneratedExtension.class.isAssignableFrom(extensionLite.getClass())) {
            add((com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.GeneratedExtension<?, ?>) extensionLite);
        }
        if (com.google.crypto.tink.shaded.protobuf.Protobuf.assumeLiteRuntime || !com.google.crypto.tink.shaded.protobuf.ExtensionRegistryFactory.isFullRegistry(this)) {
            return;
        }
        try {
            getClass().getMethod(com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.ADD, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.ExtensionClassHolder.INSTANCE).invoke(this, extensionLite);
        } catch (java.lang.Exception e) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Could not invoke ExtensionRegistry#add for %s", extensionLite), e);
        }
    }

    ExtensionRegistryLite() {
        this.extensionsByNumber = new java.util.HashMap();
    }

    ExtensionRegistryLite(com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        if (extensionRegistryLite == EMPTY_REGISTRY_LITE) {
            this.extensionsByNumber = java.util.Collections.emptyMap();
        } else {
            this.extensionsByNumber = java.util.Collections.unmodifiableMap(extensionRegistryLite.extensionsByNumber);
        }
    }

    ExtensionRegistryLite(boolean z) {
        this.extensionsByNumber = java.util.Collections.emptyMap();
    }

    static final class ObjectIntPair {
        private final int number;
        private final java.lang.Object object;

        ObjectIntPair(java.lang.Object obj, int i) {
            this.object = obj;
            this.number = i;
        }

        public final int hashCode() {
            return (java.lang.System.identityHashCode(this.object) * 65535) + this.number;
        }

        public final boolean equals(java.lang.Object obj) {
            if (!(obj instanceof com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.ObjectIntPair)) {
                return false;
            }
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.ObjectIntPair objectIntPair = (com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.ObjectIntPair) obj;
            return this.object == objectIntPair.object && this.number == objectIntPair.number;
        }
    }
}
