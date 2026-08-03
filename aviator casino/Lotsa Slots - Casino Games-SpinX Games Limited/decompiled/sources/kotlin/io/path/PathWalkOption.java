package kotlin.io.path;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PathWalkOption.kt */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/io/path/PathWalkOption;", "", "<init>", "(Ljava/lang/String;I)V", "INCLUDE_DIRECTORIES", "BREADTH_FIRST", "FOLLOW_LINKS", "kotlin-stdlib-jdk7"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PathWalkOption {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ kotlin.io.path.PathWalkOption[] $VALUES;
    public static final kotlin.io.path.PathWalkOption INCLUDE_DIRECTORIES = new kotlin.io.path.PathWalkOption("INCLUDE_DIRECTORIES", 0);
    public static final kotlin.io.path.PathWalkOption BREADTH_FIRST = new kotlin.io.path.PathWalkOption("BREADTH_FIRST", 1);
    public static final kotlin.io.path.PathWalkOption FOLLOW_LINKS = new kotlin.io.path.PathWalkOption("FOLLOW_LINKS", 2);

    private static final /* synthetic */ kotlin.io.path.PathWalkOption[] $values() {
        return new kotlin.io.path.PathWalkOption[]{INCLUDE_DIRECTORIES, BREADTH_FIRST, FOLLOW_LINKS};
    }

    public static kotlin.enums.EnumEntries<kotlin.io.path.PathWalkOption> getEntries() {
        return $ENTRIES;
    }

    private PathWalkOption(java.lang.String str, int i) {
    }

    static {
        kotlin.io.path.PathWalkOption[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries($values);
    }

    public static kotlin.io.path.PathWalkOption valueOf(java.lang.String str) {
        return (kotlin.io.path.PathWalkOption) java.lang.Enum.valueOf(kotlin.io.path.PathWalkOption.class, str);
    }

    public static kotlin.io.path.PathWalkOption[] values() {
        return (kotlin.io.path.PathWalkOption[]) $VALUES.clone();
    }
}
