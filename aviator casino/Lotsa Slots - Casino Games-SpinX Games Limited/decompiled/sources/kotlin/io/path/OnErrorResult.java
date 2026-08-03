package kotlin.io.path;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OnErrorResult.kt */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/io/path/OnErrorResult;", "", "<init>", "(Ljava/lang/String;I)V", "SKIP_SUBTREE", "TERMINATE", "kotlin-stdlib-jdk7"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OnErrorResult {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ kotlin.io.path.OnErrorResult[] $VALUES;
    public static final kotlin.io.path.OnErrorResult SKIP_SUBTREE = new kotlin.io.path.OnErrorResult("SKIP_SUBTREE", 0);
    public static final kotlin.io.path.OnErrorResult TERMINATE = new kotlin.io.path.OnErrorResult("TERMINATE", 1);

    private static final /* synthetic */ kotlin.io.path.OnErrorResult[] $values() {
        return new kotlin.io.path.OnErrorResult[]{SKIP_SUBTREE, TERMINATE};
    }

    public static kotlin.enums.EnumEntries<kotlin.io.path.OnErrorResult> getEntries() {
        return $ENTRIES;
    }

    private OnErrorResult(java.lang.String str, int i) {
    }

    static {
        kotlin.io.path.OnErrorResult[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries($values);
    }

    public static kotlin.io.path.OnErrorResult valueOf(java.lang.String str) {
        return (kotlin.io.path.OnErrorResult) java.lang.Enum.valueOf(kotlin.io.path.OnErrorResult.class, str);
    }

    public static kotlin.io.path.OnErrorResult[] values() {
        return (kotlin.io.path.OnErrorResult[]) $VALUES.clone();
    }
}
