package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class DeserializedContainerAbiStability {
    public static final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerAbiStability STABLE;
    public static final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerAbiStability UNSTABLE;
    private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerAbiStability[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private DeserializedContainerAbiStability(java.lang.String str, int i) {
    }

    static {
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerAbiStability deserializedContainerAbiStability = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerAbiStability("STABLE", 0);
        STABLE = deserializedContainerAbiStability;
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerAbiStability deserializedContainerAbiStability2 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerAbiStability("UNSTABLE", 1);
        UNSTABLE = deserializedContainerAbiStability2;
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerAbiStability[] deserializedContainerAbiStabilityArr = {deserializedContainerAbiStability, deserializedContainerAbiStability2};
        getHighResolutionOutputSizeshNQ4ISI = deserializedContainerAbiStabilityArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(deserializedContainerAbiStabilityArr);
    }

    public static kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerAbiStability[] values() {
        return (kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerAbiStability[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerAbiStability valueOf(java.lang.String str) {
        return (kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerAbiStability) java.lang.Enum.valueOf(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerAbiStability.class, str);
    }
}
