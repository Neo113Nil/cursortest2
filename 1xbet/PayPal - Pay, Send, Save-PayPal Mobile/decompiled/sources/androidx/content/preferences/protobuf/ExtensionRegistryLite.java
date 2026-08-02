package androidx.content.preferences.protobuf;

/* loaded from: classes3.dex */
public class ExtensionRegistryLite {
    private static volatile androidx.content.preferences.protobuf.ExtensionRegistryLite getHighResolutionOutputSizeshNQ4ISI = null;
    private static volatile boolean getHighSpeedVideoFpsRanges = false;
    static final androidx.content.preferences.protobuf.ExtensionRegistryLite getHighSpeedVideoFpsRangesFor = new androidx.content.preferences.protobuf.ExtensionRegistryLite((byte) 0);
    private final java.util.Map<androidx.datastore.preferences.protobuf.ExtensionRegistryLite.ObjectIntPair, androidx.datastore.preferences.protobuf.GeneratedMessageLite.GeneratedExtension<?, ?>> Camera2StreamConfigurationMap;

    /* loaded from: classes7.dex */
    static class ExtensionClassHolder {
        static final java.lang.Class<?> Camera2StreamConfigurationMap = getHighSpeedVideoFpsRangesFor();

        private ExtensionClassHolder() {
        }

        private static java.lang.Class<?> getHighSpeedVideoFpsRangesFor() {
            try {
                return java.lang.Class.forName("androidx.datastore.preferences.protobuf.Extension");
            } catch (java.lang.ClassNotFoundException unused) {
                return null;
            }
        }
    }

    public static boolean isEagerlyParseMessageSets() {
        return getHighSpeedVideoFpsRanges;
    }

    public static void setEagerlyParseMessageSets(boolean z) {
        getHighSpeedVideoFpsRanges = z;
    }

    public static androidx.content.preferences.protobuf.ExtensionRegistryLite newInstance() {
        if (androidx.content.preferences.protobuf.Protobuf.getHighSpeedVideoFpsRanges) {
            return new androidx.content.preferences.protobuf.ExtensionRegistryLite();
        }
        return androidx.content.preferences.protobuf.ExtensionRegistryFactory.getHighResolutionOutputSizeshNQ4ISI();
    }

    public static androidx.content.preferences.protobuf.ExtensionRegistryLite getEmptyRegistry() {
        androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite;
        if (androidx.content.preferences.protobuf.Protobuf.getHighSpeedVideoFpsRanges) {
            return getHighSpeedVideoFpsRangesFor;
        }
        androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite2 = getHighResolutionOutputSizeshNQ4ISI;
        if (extensionRegistryLite2 != null) {
            return extensionRegistryLite2;
        }
        synchronized (androidx.content.preferences.protobuf.ExtensionRegistryLite.class) {
            extensionRegistryLite = getHighResolutionOutputSizeshNQ4ISI;
            if (extensionRegistryLite == null) {
                extensionRegistryLite = androidx.content.preferences.protobuf.ExtensionRegistryFactory.getHighSpeedVideoSizes();
                getHighResolutionOutputSizeshNQ4ISI = extensionRegistryLite;
            }
        }
        return extensionRegistryLite;
    }

    public androidx.content.preferences.protobuf.ExtensionRegistryLite getUnmodifiable() {
        return new androidx.content.preferences.protobuf.ExtensionRegistryLite(this);
    }

    public <ContainingType extends androidx.content.preferences.protobuf.MessageLite> androidx.datastore.preferences.protobuf.GeneratedMessageLite.GeneratedExtension<ContainingType, ?> findLiteExtensionByNumber(ContainingType containingtype, int i) {
        return (androidx.datastore.preferences.protobuf.GeneratedMessageLite.GeneratedExtension) this.Camera2StreamConfigurationMap.get(new androidx.datastore.preferences.protobuf.ExtensionRegistryLite.ObjectIntPair(containingtype, i));
    }

    public final void add(androidx.datastore.preferences.protobuf.GeneratedMessageLite.GeneratedExtension<?, ?> generatedExtension) {
        this.Camera2StreamConfigurationMap.put(new androidx.datastore.preferences.protobuf.ExtensionRegistryLite.ObjectIntPair(generatedExtension.getContainingTypeDefaultInstance(), generatedExtension.getNumber()), generatedExtension);
    }

    public final void add(androidx.content.preferences.protobuf.ExtensionLite<?, ?> extensionLite) {
        if (androidx.datastore.preferences.protobuf.GeneratedMessageLite.GeneratedExtension.class.isAssignableFrom(extensionLite.getClass())) {
            add((androidx.datastore.preferences.protobuf.GeneratedMessageLite.GeneratedExtension<?, ?>) extensionLite);
        }
        if (androidx.content.preferences.protobuf.Protobuf.getHighSpeedVideoFpsRanges || !androidx.content.preferences.protobuf.ExtensionRegistryFactory.getHighSpeedVideoFpsRanges(this)) {
            return;
        }
        try {
            getClass().getMethod(com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.ADD, androidx.datastore.preferences.protobuf.ExtensionRegistryLite.ExtensionClassHolder.Camera2StreamConfigurationMap).invoke(this, extensionLite);
        } catch (java.lang.Exception e) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Could not invoke ExtensionRegistry#add for %s", extensionLite), e);
        }
    }

    ExtensionRegistryLite() {
        this.Camera2StreamConfigurationMap = new java.util.HashMap();
    }

    private ExtensionRegistryLite(androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        if (extensionRegistryLite == getHighSpeedVideoFpsRangesFor) {
            this.Camera2StreamConfigurationMap = java.util.Collections.emptyMap();
        } else {
            this.Camera2StreamConfigurationMap = java.util.Collections.unmodifiableMap(extensionRegistryLite.Camera2StreamConfigurationMap);
        }
    }

    private ExtensionRegistryLite(byte b) {
        this.Camera2StreamConfigurationMap = java.util.Collections.emptyMap();
    }

    static final class ObjectIntPair {
        private final int getHighResolutionOutputSizeshNQ4ISI;
        private final java.lang.Object getHighSpeedVideoFpsRangesFor;

        ObjectIntPair(java.lang.Object obj, int i) {
            this.getHighSpeedVideoFpsRangesFor = obj;
            this.getHighResolutionOutputSizeshNQ4ISI = i;
        }

        public final int hashCode() {
            return (java.lang.System.identityHashCode(this.getHighSpeedVideoFpsRangesFor) * 65535) + this.getHighResolutionOutputSizeshNQ4ISI;
        }

        public final boolean equals(java.lang.Object obj) {
            if (!(obj instanceof androidx.datastore.preferences.protobuf.ExtensionRegistryLite.ObjectIntPair)) {
                return false;
            }
            androidx.datastore.preferences.protobuf.ExtensionRegistryLite.ObjectIntPair objectIntPair = (androidx.datastore.preferences.protobuf.ExtensionRegistryLite.ObjectIntPair) obj;
            return this.getHighSpeedVideoFpsRangesFor == objectIntPair.getHighSpeedVideoFpsRangesFor && this.getHighResolutionOutputSizeshNQ4ISI == objectIntPair.getHighResolutionOutputSizeshNQ4ISI;
        }
    }
}
