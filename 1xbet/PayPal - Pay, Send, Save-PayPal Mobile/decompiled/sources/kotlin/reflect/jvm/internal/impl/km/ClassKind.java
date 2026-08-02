package kotlin.reflect.jvm.internal.impl.km;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class ClassKind {
    public static final kotlin.reflect.jvm.internal.impl.km.ClassKind ANNOTATION_CLASS;
    public static final kotlin.reflect.jvm.internal.impl.km.ClassKind CLASS;
    public static final kotlin.reflect.jvm.internal.impl.km.ClassKind COMPANION_OBJECT;
    public static final kotlin.reflect.jvm.internal.impl.km.ClassKind ENUM_CLASS;
    public static final kotlin.reflect.jvm.internal.impl.km.ClassKind ENUM_ENTRY;
    public static final kotlin.reflect.jvm.internal.impl.km.ClassKind INTERFACE;
    public static final kotlin.reflect.jvm.internal.impl.km.ClassKind OBJECT;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.km.ClassKind[] getHighSpeedVideoSizes;
    private final kotlin.reflect.jvm.internal.impl.km.internal.FlagImpl getHighSpeedVideoFpsRanges;

    private ClassKind(java.lang.String str, int i, int i2) {
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Kind> flagField = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.CLASS_KIND;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(flagField, "");
        this.getHighSpeedVideoFpsRanges = new kotlin.reflect.jvm.internal.impl.km.internal.FlagImpl(flagField, i2);
    }

    static {
        kotlin.reflect.jvm.internal.impl.km.ClassKind classKind = new kotlin.reflect.jvm.internal.impl.km.ClassKind("CLASS", 0, 0);
        CLASS = classKind;
        kotlin.reflect.jvm.internal.impl.km.ClassKind classKind2 = new kotlin.reflect.jvm.internal.impl.km.ClassKind("INTERFACE", 1, 1);
        INTERFACE = classKind2;
        kotlin.reflect.jvm.internal.impl.km.ClassKind classKind3 = new kotlin.reflect.jvm.internal.impl.km.ClassKind("ENUM_CLASS", 2, 2);
        ENUM_CLASS = classKind3;
        kotlin.reflect.jvm.internal.impl.km.ClassKind classKind4 = new kotlin.reflect.jvm.internal.impl.km.ClassKind("ENUM_ENTRY", 3, 3);
        ENUM_ENTRY = classKind4;
        kotlin.reflect.jvm.internal.impl.km.ClassKind classKind5 = new kotlin.reflect.jvm.internal.impl.km.ClassKind("ANNOTATION_CLASS", 4, 4);
        ANNOTATION_CLASS = classKind5;
        kotlin.reflect.jvm.internal.impl.km.ClassKind classKind6 = new kotlin.reflect.jvm.internal.impl.km.ClassKind("OBJECT", 5, 5);
        OBJECT = classKind6;
        kotlin.reflect.jvm.internal.impl.km.ClassKind classKind7 = new kotlin.reflect.jvm.internal.impl.km.ClassKind("COMPANION_OBJECT", 6, 6);
        COMPANION_OBJECT = classKind7;
        kotlin.reflect.jvm.internal.impl.km.ClassKind[] classKindArr = {classKind, classKind2, classKind3, classKind4, classKind5, classKind6, classKind7};
        getHighSpeedVideoSizes = classKindArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(classKindArr);
    }

    public final kotlin.reflect.jvm.internal.impl.km.internal.FlagImpl getFlag$kotlin_metadata() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public static kotlin.reflect.jvm.internal.impl.km.ClassKind[] values() {
        return (kotlin.reflect.jvm.internal.impl.km.ClassKind[]) getHighSpeedVideoSizes.clone();
    }

    public static kotlin.reflect.jvm.internal.impl.km.ClassKind valueOf(java.lang.String str) {
        return (kotlin.reflect.jvm.internal.impl.km.ClassKind) java.lang.Enum.valueOf(kotlin.reflect.jvm.internal.impl.km.ClassKind.class, str);
    }

    public static kotlin.enums.EnumEntries<kotlin.reflect.jvm.internal.impl.km.ClassKind> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
