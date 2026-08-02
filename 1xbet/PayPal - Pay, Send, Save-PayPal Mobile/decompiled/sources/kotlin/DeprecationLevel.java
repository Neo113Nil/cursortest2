package kotlin;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lkotlin/DeprecationLevel;", "", "<init>", "(Ljava/lang/String;I)V", "WARNING", "ERROR", "HIDDEN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DeprecationLevel {
    public static final kotlin.DeprecationLevel ERROR;
    public static final kotlin.DeprecationLevel HIDDEN;
    public static final kotlin.DeprecationLevel WARNING;
    private static final /* synthetic */ kotlin.DeprecationLevel[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;

    private DeprecationLevel(java.lang.String str, int i) {
    }

    static {
        kotlin.DeprecationLevel deprecationLevel = new kotlin.DeprecationLevel("WARNING", 0);
        WARNING = deprecationLevel;
        kotlin.DeprecationLevel deprecationLevel2 = new kotlin.DeprecationLevel("ERROR", 1);
        ERROR = deprecationLevel2;
        kotlin.DeprecationLevel deprecationLevel3 = new kotlin.DeprecationLevel("HIDDEN", 2);
        HIDDEN = deprecationLevel3;
        kotlin.DeprecationLevel[] deprecationLevelArr = {deprecationLevel, deprecationLevel2, deprecationLevel3};
        getHighResolutionOutputSizeshNQ4ISI = deprecationLevelArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(deprecationLevelArr);
    }

    public static kotlin.DeprecationLevel[] values() {
        return (kotlin.DeprecationLevel[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static kotlin.DeprecationLevel valueOf(java.lang.String str) {
        return (kotlin.DeprecationLevel) java.lang.Enum.valueOf(kotlin.DeprecationLevel.class, str);
    }

    public static kotlin.enums.EnumEntries<kotlin.DeprecationLevel> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
