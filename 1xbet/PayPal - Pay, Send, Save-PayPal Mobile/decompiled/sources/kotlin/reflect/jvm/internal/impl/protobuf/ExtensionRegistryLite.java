package kotlin.reflect.jvm.internal.impl.protobuf;

/* loaded from: classes5.dex */
public class ExtensionRegistryLite {
    private static final kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite Camera2StreamConfigurationMap = new kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite((byte) 0);
    private final java.util.Map<kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite.ObjectIntPair, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.GeneratedExtension<?, ?>> getHighSpeedVideoFpsRangesFor;

    public static kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite newInstance() {
        return new kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite();
    }

    public static kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite getEmptyRegistry() {
        return Camera2StreamConfigurationMap;
    }

    public <ContainingType extends kotlin.reflect.jvm.internal.impl.protobuf.MessageLite> kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.GeneratedExtension<ContainingType, ?> findLiteExtensionByNumber(ContainingType containingtype, int i) {
        return (kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.GeneratedExtension) this.getHighSpeedVideoFpsRangesFor.get(new kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite.ObjectIntPair(containingtype, i));
    }

    public final void add(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.GeneratedExtension<?, ?> generatedExtension) {
        this.getHighSpeedVideoFpsRangesFor.put(new kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite.ObjectIntPair(generatedExtension.getContainingTypeDefaultInstance(), generatedExtension.getNumber()), generatedExtension);
    }

    ExtensionRegistryLite() {
        this.getHighSpeedVideoFpsRangesFor = new java.util.HashMap();
    }

    private ExtensionRegistryLite(byte b) {
        this.getHighSpeedVideoFpsRangesFor = java.util.Collections.emptyMap();
    }

    static final class ObjectIntPair {
        private final java.lang.Object Camera2StreamConfigurationMap;
        private final int getHighSpeedVideoSizes;

        ObjectIntPair(java.lang.Object obj, int i) {
            this.Camera2StreamConfigurationMap = obj;
            this.getHighSpeedVideoSizes = i;
        }

        public final int hashCode() {
            return (java.lang.System.identityHashCode(this.Camera2StreamConfigurationMap) * 65535) + this.getHighSpeedVideoSizes;
        }

        public final boolean equals(java.lang.Object obj) {
            if (!(obj instanceof kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite.ObjectIntPair)) {
                return false;
            }
            kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite.ObjectIntPair objectIntPair = (kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite.ObjectIntPair) obj;
            return this.Camera2StreamConfigurationMap == objectIntPair.Camera2StreamConfigurationMap && this.getHighSpeedVideoSizes == objectIntPair.getHighSpeedVideoSizes;
        }
    }
}
