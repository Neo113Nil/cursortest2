package kotlin.io.path;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lkotlin/io/path/PathWalkOption;", "", "<init>", "(Ljava/lang/String;I)V", "INCLUDE_DIRECTORIES", "BREADTH_FIRST", "FOLLOW_LINKS"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PathWalkOption {
    public static final kotlin.io.path.PathWalkOption BREADTH_FIRST;
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final kotlin.io.path.PathWalkOption FOLLOW_LINKS;
    public static final kotlin.io.path.PathWalkOption INCLUDE_DIRECTORIES;
    private static final /* synthetic */ kotlin.io.path.PathWalkOption[] getHighResolutionOutputSizeshNQ4ISI;

    private PathWalkOption(java.lang.String str, int i) {
    }

    static {
        kotlin.io.path.PathWalkOption pathWalkOption = new kotlin.io.path.PathWalkOption("INCLUDE_DIRECTORIES", 0);
        INCLUDE_DIRECTORIES = pathWalkOption;
        kotlin.io.path.PathWalkOption pathWalkOption2 = new kotlin.io.path.PathWalkOption("BREADTH_FIRST", 1);
        BREADTH_FIRST = pathWalkOption2;
        kotlin.io.path.PathWalkOption pathWalkOption3 = new kotlin.io.path.PathWalkOption("FOLLOW_LINKS", 2);
        FOLLOW_LINKS = pathWalkOption3;
        kotlin.io.path.PathWalkOption[] pathWalkOptionArr = {pathWalkOption, pathWalkOption2, pathWalkOption3};
        getHighResolutionOutputSizeshNQ4ISI = pathWalkOptionArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(pathWalkOptionArr);
    }

    public static kotlin.io.path.PathWalkOption[] values() {
        return (kotlin.io.path.PathWalkOption[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static kotlin.io.path.PathWalkOption valueOf(java.lang.String str) {
        return (kotlin.io.path.PathWalkOption) java.lang.Enum.valueOf(kotlin.io.path.PathWalkOption.class, str);
    }

    public static kotlin.enums.EnumEntries<kotlin.io.path.PathWalkOption> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
