package kotlin.io.path;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lkotlin/io/path/OnErrorResult;", "", "<init>", "(Ljava/lang/String;I)V", "SKIP_SUBTREE", "TERMINATE"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class OnErrorResult {
    public static final kotlin.io.path.OnErrorResult SKIP_SUBTREE;
    public static final kotlin.io.path.OnErrorResult TERMINATE;
    private static final /* synthetic */ kotlin.io.path.OnErrorResult[] getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;

    private OnErrorResult(java.lang.String str, int i) {
    }

    static {
        kotlin.io.path.OnErrorResult onErrorResult = new kotlin.io.path.OnErrorResult("SKIP_SUBTREE", 0);
        SKIP_SUBTREE = onErrorResult;
        kotlin.io.path.OnErrorResult onErrorResult2 = new kotlin.io.path.OnErrorResult("TERMINATE", 1);
        TERMINATE = onErrorResult2;
        kotlin.io.path.OnErrorResult[] onErrorResultArr = {onErrorResult, onErrorResult2};
        getHighSpeedVideoFpsRanges = onErrorResultArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(onErrorResultArr);
    }

    public static kotlin.io.path.OnErrorResult[] values() {
        return (kotlin.io.path.OnErrorResult[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static kotlin.io.path.OnErrorResult valueOf(java.lang.String str) {
        return (kotlin.io.path.OnErrorResult) java.lang.Enum.valueOf(kotlin.io.path.OnErrorResult.class, str);
    }

    public static kotlin.enums.EnumEntries<kotlin.io.path.OnErrorResult> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
