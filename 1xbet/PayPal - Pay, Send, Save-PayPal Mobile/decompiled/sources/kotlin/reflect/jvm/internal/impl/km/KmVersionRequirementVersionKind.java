package kotlin.reflect.jvm.internal.impl.km;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class KmVersionRequirementVersionKind {
    public static final kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementVersionKind API_VERSION;
    public static final kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementVersionKind COMPILER_VERSION;
    private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementVersionKind[] Camera2StreamConfigurationMap;
    public static final kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementVersionKind LANGUAGE_VERSION;
    public static final kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementVersionKind UNKNOWN;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;

    private KmVersionRequirementVersionKind(java.lang.String str, int i) {
    }

    static {
        kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementVersionKind kmVersionRequirementVersionKind = new kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementVersionKind("LANGUAGE_VERSION", 0);
        LANGUAGE_VERSION = kmVersionRequirementVersionKind;
        kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementVersionKind kmVersionRequirementVersionKind2 = new kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementVersionKind("COMPILER_VERSION", 1);
        COMPILER_VERSION = kmVersionRequirementVersionKind2;
        kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementVersionKind kmVersionRequirementVersionKind3 = new kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementVersionKind("API_VERSION", 2);
        API_VERSION = kmVersionRequirementVersionKind3;
        kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementVersionKind kmVersionRequirementVersionKind4 = new kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementVersionKind("UNKNOWN", 3);
        UNKNOWN = kmVersionRequirementVersionKind4;
        kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementVersionKind[] kmVersionRequirementVersionKindArr = {kmVersionRequirementVersionKind, kmVersionRequirementVersionKind2, kmVersionRequirementVersionKind3, kmVersionRequirementVersionKind4};
        Camera2StreamConfigurationMap = kmVersionRequirementVersionKindArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(kmVersionRequirementVersionKindArr);
    }

    public static kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementVersionKind[] values() {
        return (kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementVersionKind[]) Camera2StreamConfigurationMap.clone();
    }

    public static kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementVersionKind valueOf(java.lang.String str) {
        return (kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementVersionKind) java.lang.Enum.valueOf(kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementVersionKind.class, str);
    }
}
