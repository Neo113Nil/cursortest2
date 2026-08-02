package kotlin.io.path;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lkotlin/io/path/CopyActionResult;", "", "<init>", "(Ljava/lang/String;I)V", "CONTINUE", "SKIP_SUBTREE", "TERMINATE"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class CopyActionResult {
    public static final kotlin.io.path.CopyActionResult CONTINUE;
    public static final kotlin.io.path.CopyActionResult SKIP_SUBTREE;
    public static final kotlin.io.path.CopyActionResult TERMINATE;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.io.path.CopyActionResult[] getHighSpeedVideoFpsRangesFor;

    private CopyActionResult(java.lang.String str, int i) {
    }

    static {
        kotlin.io.path.CopyActionResult copyActionResult = new kotlin.io.path.CopyActionResult("CONTINUE", 0);
        CONTINUE = copyActionResult;
        kotlin.io.path.CopyActionResult copyActionResult2 = new kotlin.io.path.CopyActionResult("SKIP_SUBTREE", 1);
        SKIP_SUBTREE = copyActionResult2;
        kotlin.io.path.CopyActionResult copyActionResult3 = new kotlin.io.path.CopyActionResult("TERMINATE", 2);
        TERMINATE = copyActionResult3;
        kotlin.io.path.CopyActionResult[] copyActionResultArr = {copyActionResult, copyActionResult2, copyActionResult3};
        getHighSpeedVideoFpsRangesFor = copyActionResultArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(copyActionResultArr);
    }

    public static kotlin.io.path.CopyActionResult[] values() {
        return (kotlin.io.path.CopyActionResult[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static kotlin.io.path.CopyActionResult valueOf(java.lang.String str) {
        return (kotlin.io.path.CopyActionResult) java.lang.Enum.valueOf(kotlin.io.path.CopyActionResult.class, str);
    }

    public static kotlin.enums.EnumEntries<kotlin.io.path.CopyActionResult> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
