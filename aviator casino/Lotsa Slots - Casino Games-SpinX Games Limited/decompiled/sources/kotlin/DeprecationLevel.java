package kotlin;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Annotations.kt */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/DeprecationLevel;", "", "<init>", "(Ljava/lang/String;I)V", "WARNING", "ERROR", "HIDDEN", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DeprecationLevel {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ kotlin.DeprecationLevel[] $VALUES;
    public static final kotlin.DeprecationLevel WARNING = new kotlin.DeprecationLevel("WARNING", 0);
    public static final kotlin.DeprecationLevel ERROR = new kotlin.DeprecationLevel("ERROR", 1);
    public static final kotlin.DeprecationLevel HIDDEN = new kotlin.DeprecationLevel("HIDDEN", 2);

    private static final /* synthetic */ kotlin.DeprecationLevel[] $values() {
        return new kotlin.DeprecationLevel[]{WARNING, ERROR, HIDDEN};
    }

    public static kotlin.enums.EnumEntries<kotlin.DeprecationLevel> getEntries() {
        return $ENTRIES;
    }

    private DeprecationLevel(java.lang.String str, int i) {
    }

    static {
        kotlin.DeprecationLevel[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries($values);
    }

    public static kotlin.DeprecationLevel valueOf(java.lang.String str) {
        return (kotlin.DeprecationLevel) java.lang.Enum.valueOf(kotlin.DeprecationLevel.class, str);
    }

    public static kotlin.DeprecationLevel[] values() {
        return (kotlin.DeprecationLevel[]) $VALUES.clone();
    }
}
