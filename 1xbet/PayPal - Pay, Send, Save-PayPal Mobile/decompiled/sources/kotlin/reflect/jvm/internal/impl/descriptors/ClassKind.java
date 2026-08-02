package kotlin.reflect.jvm.internal.impl.descriptors;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class ClassKind {
    public static final kotlin.reflect.jvm.internal.impl.descriptors.ClassKind ANNOTATION_CLASS;
    public static final kotlin.reflect.jvm.internal.impl.descriptors.ClassKind CLASS;
    public static final kotlin.reflect.jvm.internal.impl.descriptors.ClassKind ENUM_CLASS;
    public static final kotlin.reflect.jvm.internal.impl.descriptors.ClassKind ENUM_ENTRY;
    public static final kotlin.reflect.jvm.internal.impl.descriptors.ClassKind INTERFACE;
    public static final kotlin.reflect.jvm.internal.impl.descriptors.ClassKind OBJECT;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.ClassKind[] getHighSpeedVideoFpsRangesFor;
    private final java.lang.String getHighSpeedVideoFpsRanges;

    private ClassKind(java.lang.String str, int i, java.lang.String str2) {
        this.getHighSpeedVideoFpsRanges = str2;
    }

    static {
        kotlin.reflect.jvm.internal.impl.descriptors.ClassKind classKind = new kotlin.reflect.jvm.internal.impl.descriptors.ClassKind("CLASS", 0, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.CLASS);
        CLASS = classKind;
        kotlin.reflect.jvm.internal.impl.descriptors.ClassKind classKind2 = new kotlin.reflect.jvm.internal.impl.descriptors.ClassKind("INTERFACE", 1, "interface");
        INTERFACE = classKind2;
        kotlin.reflect.jvm.internal.impl.descriptors.ClassKind classKind3 = new kotlin.reflect.jvm.internal.impl.descriptors.ClassKind("ENUM_CLASS", 2, "enum class");
        ENUM_CLASS = classKind3;
        kotlin.reflect.jvm.internal.impl.descriptors.ClassKind classKind4 = new kotlin.reflect.jvm.internal.impl.descriptors.ClassKind("ENUM_ENTRY", 3, null);
        ENUM_ENTRY = classKind4;
        kotlin.reflect.jvm.internal.impl.descriptors.ClassKind classKind5 = new kotlin.reflect.jvm.internal.impl.descriptors.ClassKind("ANNOTATION_CLASS", 4, "annotation class");
        ANNOTATION_CLASS = classKind5;
        kotlin.reflect.jvm.internal.impl.descriptors.ClassKind classKind6 = new kotlin.reflect.jvm.internal.impl.descriptors.ClassKind("OBJECT", 5, "object");
        OBJECT = classKind6;
        kotlin.reflect.jvm.internal.impl.descriptors.ClassKind[] classKindArr = {classKind, classKind2, classKind3, classKind4, classKind5, classKind6};
        getHighSpeedVideoFpsRangesFor = classKindArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(classKindArr);
    }

    public final boolean isSingleton() {
        return this == OBJECT || this == ENUM_ENTRY;
    }

    public static kotlin.reflect.jvm.internal.impl.descriptors.ClassKind[] values() {
        return (kotlin.reflect.jvm.internal.impl.descriptors.ClassKind[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static kotlin.reflect.jvm.internal.impl.descriptors.ClassKind valueOf(java.lang.String str) {
        return (kotlin.reflect.jvm.internal.impl.descriptors.ClassKind) java.lang.Enum.valueOf(kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.class, str);
    }
}
