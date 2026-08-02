package kotlin.reflect.jvm.internal.impl.resolve.deprecation;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class DeprecationLevelValue {
    public static final kotlin.reflect.jvm.internal.impl.resolve.deprecation.DeprecationLevelValue ERROR;
    public static final kotlin.reflect.jvm.internal.impl.resolve.deprecation.DeprecationLevelValue HIDDEN;
    public static final kotlin.reflect.jvm.internal.impl.resolve.deprecation.DeprecationLevelValue WARNING;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.resolve.deprecation.DeprecationLevelValue[] getHighSpeedVideoSizes;

    private DeprecationLevelValue(java.lang.String str, int i) {
    }

    static {
        kotlin.reflect.jvm.internal.impl.resolve.deprecation.DeprecationLevelValue deprecationLevelValue = new kotlin.reflect.jvm.internal.impl.resolve.deprecation.DeprecationLevelValue("WARNING", 0);
        WARNING = deprecationLevelValue;
        kotlin.reflect.jvm.internal.impl.resolve.deprecation.DeprecationLevelValue deprecationLevelValue2 = new kotlin.reflect.jvm.internal.impl.resolve.deprecation.DeprecationLevelValue("ERROR", 1);
        ERROR = deprecationLevelValue2;
        kotlin.reflect.jvm.internal.impl.resolve.deprecation.DeprecationLevelValue deprecationLevelValue3 = new kotlin.reflect.jvm.internal.impl.resolve.deprecation.DeprecationLevelValue("HIDDEN", 2);
        HIDDEN = deprecationLevelValue3;
        kotlin.reflect.jvm.internal.impl.resolve.deprecation.DeprecationLevelValue[] deprecationLevelValueArr = {deprecationLevelValue, deprecationLevelValue2, deprecationLevelValue3};
        getHighSpeedVideoSizes = deprecationLevelValueArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(deprecationLevelValueArr);
    }

    public static kotlin.reflect.jvm.internal.impl.resolve.deprecation.DeprecationLevelValue[] values() {
        return (kotlin.reflect.jvm.internal.impl.resolve.deprecation.DeprecationLevelValue[]) getHighSpeedVideoSizes.clone();
    }

    public static kotlin.reflect.jvm.internal.impl.resolve.deprecation.DeprecationLevelValue valueOf(java.lang.String str) {
        return (kotlin.reflect.jvm.internal.impl.resolve.deprecation.DeprecationLevelValue) java.lang.Enum.valueOf(kotlin.reflect.jvm.internal.impl.resolve.deprecation.DeprecationLevelValue.class, str);
    }
}
