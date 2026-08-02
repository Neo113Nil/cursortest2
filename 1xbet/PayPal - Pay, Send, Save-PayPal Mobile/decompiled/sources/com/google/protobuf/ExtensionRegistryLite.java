package com.google.protobuf;

/* loaded from: classes9.dex */
public class ExtensionRegistryLite {
    static final com.google.protobuf.ExtensionRegistryLite EMPTY_REGISTRY_LITE = new com.google.protobuf.ExtensionRegistryLite(true);
    static final java.lang.String EXTENSION_CLASS_NAME = "com.google.protobuf.Extension";
    private static boolean doFullRuntimeInheritanceCheck = true;
    private static volatile boolean eagerlyParseMessageSets = false;
    private static volatile com.google.protobuf.ExtensionRegistryLite emptyRegistry;
    private final java.util.Map<com.google.protobuf.ExtensionRegistryLite.ObjectIntPair, com.google.protobuf.GeneratedMessageLite.GeneratedExtension<?, ?>> extensionsByNumber;

    static class ExtensionClassHolder {
        static final java.lang.Class<?> INSTANCE = resolveExtensionClass();

        private ExtensionClassHolder() {
        }

        static java.lang.Class<?> resolveExtensionClass() {
            try {
                return java.lang.Class.forName(com.google.protobuf.ExtensionRegistryLite.EXTENSION_CLASS_NAME);
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

    public static com.google.protobuf.ExtensionRegistryLite newInstance() {
        if (doFullRuntimeInheritanceCheck) {
            return com.google.protobuf.ExtensionRegistryFactory.create();
        }
        return new com.google.protobuf.ExtensionRegistryLite();
    }

    public static com.google.protobuf.ExtensionRegistryLite getEmptyRegistry() {
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite;
        if (!doFullRuntimeInheritanceCheck) {
            return EMPTY_REGISTRY_LITE;
        }
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite2 = emptyRegistry;
        if (extensionRegistryLite2 != null) {
            return extensionRegistryLite2;
        }
        synchronized (com.google.protobuf.ExtensionRegistryLite.class) {
            extensionRegistryLite = emptyRegistry;
            if (extensionRegistryLite == null) {
                extensionRegistryLite = com.google.protobuf.ExtensionRegistryFactory.createEmpty();
                emptyRegistry = extensionRegistryLite;
            }
        }
        return extensionRegistryLite;
    }

    public com.google.protobuf.ExtensionRegistryLite getUnmodifiable() {
        return new com.google.protobuf.ExtensionRegistryLite(this);
    }

    public <ContainingType extends com.google.protobuf.MessageLite> com.google.protobuf.GeneratedMessageLite.GeneratedExtension<ContainingType, ?> findLiteExtensionByNumber(ContainingType containingtype, int i) {
        return (com.google.protobuf.GeneratedMessageLite.GeneratedExtension) this.extensionsByNumber.get(new com.google.protobuf.ExtensionRegistryLite.ObjectIntPair(containingtype, i));
    }

    public final void add(com.google.protobuf.GeneratedMessageLite.GeneratedExtension<?, ?> generatedExtension) {
        this.extensionsByNumber.put(new com.google.protobuf.ExtensionRegistryLite.ObjectIntPair(generatedExtension.getContainingTypeDefaultInstance(), generatedExtension.getNumber()), generatedExtension);
    }

    public final void add(com.google.protobuf.ExtensionLite<?, ?> extensionLite) {
        if (com.google.protobuf.GeneratedMessageLite.GeneratedExtension.class.isAssignableFrom(extensionLite.getClass())) {
            add((com.google.protobuf.GeneratedMessageLite.GeneratedExtension<?, ?>) extensionLite);
        }
        if (doFullRuntimeInheritanceCheck && com.google.protobuf.ExtensionRegistryFactory.isFullRegistry(this)) {
            try {
                getClass().getMethod(com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.ADD, com.google.protobuf.ExtensionRegistryLite.ExtensionClassHolder.INSTANCE).invoke(this, extensionLite);
            } catch (java.lang.Exception e) {
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Could not invoke ExtensionRegistry#add for %s", extensionLite), e);
            }
        }
    }

    ExtensionRegistryLite() {
        this.extensionsByNumber = new java.util.HashMap();
    }

    ExtensionRegistryLite(com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
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
            if (!(obj instanceof com.google.protobuf.ExtensionRegistryLite.ObjectIntPair)) {
                return false;
            }
            com.google.protobuf.ExtensionRegistryLite.ObjectIntPair objectIntPair = (com.google.protobuf.ExtensionRegistryLite.ObjectIntPair) obj;
            return this.object == objectIntPair.object && this.number == objectIntPair.number;
        }
    }
}
