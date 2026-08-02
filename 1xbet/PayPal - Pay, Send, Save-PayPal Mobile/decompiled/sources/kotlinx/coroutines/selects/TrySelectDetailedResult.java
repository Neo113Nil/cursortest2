package kotlinx.coroutines.selects;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lkotlinx/coroutines/selects/TrySelectDetailedResult;", "", "<init>", "(Ljava/lang/String;I)V", "SUCCESSFUL", "REREGISTER", com.paypal.oslo.downloads.impl.DownloadStateValue.CANCELLED, "ALREADY_SELECTED"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TrySelectDetailedResult {
    public static final kotlinx.coroutines.selects.TrySelectDetailedResult ALREADY_SELECTED;
    public static final kotlinx.coroutines.selects.TrySelectDetailedResult CANCELLED;
    public static final kotlinx.coroutines.selects.TrySelectDetailedResult REREGISTER;
    public static final kotlinx.coroutines.selects.TrySelectDetailedResult SUCCESSFUL;
    private static final /* synthetic */ kotlinx.coroutines.selects.TrySelectDetailedResult[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;

    private TrySelectDetailedResult(java.lang.String str, int i) {
    }

    static {
        kotlinx.coroutines.selects.TrySelectDetailedResult trySelectDetailedResult = new kotlinx.coroutines.selects.TrySelectDetailedResult("SUCCESSFUL", 0);
        SUCCESSFUL = trySelectDetailedResult;
        kotlinx.coroutines.selects.TrySelectDetailedResult trySelectDetailedResult2 = new kotlinx.coroutines.selects.TrySelectDetailedResult("REREGISTER", 1);
        REREGISTER = trySelectDetailedResult2;
        kotlinx.coroutines.selects.TrySelectDetailedResult trySelectDetailedResult3 = new kotlinx.coroutines.selects.TrySelectDetailedResult(com.paypal.oslo.downloads.impl.DownloadStateValue.CANCELLED, 2);
        CANCELLED = trySelectDetailedResult3;
        kotlinx.coroutines.selects.TrySelectDetailedResult trySelectDetailedResult4 = new kotlinx.coroutines.selects.TrySelectDetailedResult("ALREADY_SELECTED", 3);
        ALREADY_SELECTED = trySelectDetailedResult4;
        kotlinx.coroutines.selects.TrySelectDetailedResult[] trySelectDetailedResultArr = {trySelectDetailedResult, trySelectDetailedResult2, trySelectDetailedResult3, trySelectDetailedResult4};
        getHighResolutionOutputSizeshNQ4ISI = trySelectDetailedResultArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(trySelectDetailedResultArr);
    }

    public static kotlinx.coroutines.selects.TrySelectDetailedResult valueOf(java.lang.String str) {
        return (kotlinx.coroutines.selects.TrySelectDetailedResult) java.lang.Enum.valueOf(kotlinx.coroutines.selects.TrySelectDetailedResult.class, str);
    }

    public static kotlinx.coroutines.selects.TrySelectDetailedResult[] values() {
        return (kotlinx.coroutines.selects.TrySelectDetailedResult[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static kotlin.enums.EnumEntries<kotlinx.coroutines.selects.TrySelectDetailedResult> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
