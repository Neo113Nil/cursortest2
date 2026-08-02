package kotlin.reflect.jvm.internal.impl.km;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class KmVersionRequirementLevel {
    private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementLevel[] Camera2StreamConfigurationMap;
    public static final kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementLevel ERROR;
    public static final kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementLevel HIDDEN;
    public static final kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementLevel WARNING;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;

    private KmVersionRequirementLevel(java.lang.String str, int i) {
    }

    static {
        kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementLevel kmVersionRequirementLevel = new kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementLevel("WARNING", 0);
        WARNING = kmVersionRequirementLevel;
        kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementLevel kmVersionRequirementLevel2 = new kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementLevel("ERROR", 1);
        ERROR = kmVersionRequirementLevel2;
        kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementLevel kmVersionRequirementLevel3 = new kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementLevel("HIDDEN", 2);
        HIDDEN = kmVersionRequirementLevel3;
        kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementLevel[] kmVersionRequirementLevelArr = {kmVersionRequirementLevel, kmVersionRequirementLevel2, kmVersionRequirementLevel3};
        Camera2StreamConfigurationMap = kmVersionRequirementLevelArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(kmVersionRequirementLevelArr);
    }

    public static kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementLevel[] values() {
        return (kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementLevel[]) Camera2StreamConfigurationMap.clone();
    }

    public static kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementLevel valueOf(java.lang.String str) {
        return (kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementLevel) java.lang.Enum.valueOf(kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementLevel.class, str);
    }
}
