package androidx.compose.ui.focus;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Landroidx/compose/ui/focus/CustomDestinationResult;", "", "<init>", "(Ljava/lang/String;I)V", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Name.NONE, "Cancelled", "Redirected", "RedirectCancelled"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CustomDestinationResult {
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    private static final /* synthetic */ androidx.compose.ui.focus.CustomDestinationResult[] getHighSpeedVideoFpsRangesFor;
    public static final androidx.compose.ui.focus.CustomDestinationResult None = new androidx.compose.ui.focus.CustomDestinationResult(com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Name.NONE, 0);
    public static final androidx.compose.ui.focus.CustomDestinationResult Cancelled = new androidx.compose.ui.focus.CustomDestinationResult("Cancelled", 1);
    public static final androidx.compose.ui.focus.CustomDestinationResult Redirected = new androidx.compose.ui.focus.CustomDestinationResult("Redirected", 2);
    public static final androidx.compose.ui.focus.CustomDestinationResult RedirectCancelled = new androidx.compose.ui.focus.CustomDestinationResult("RedirectCancelled", 3);

    private CustomDestinationResult(java.lang.String str, int i) {
    }

    static {
        androidx.compose.ui.focus.CustomDestinationResult[] Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap();
        getHighSpeedVideoFpsRangesFor = Camera2StreamConfigurationMap2;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(Camera2StreamConfigurationMap2);
    }

    public static androidx.compose.ui.focus.CustomDestinationResult[] values() {
        return (androidx.compose.ui.focus.CustomDestinationResult[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static androidx.compose.ui.focus.CustomDestinationResult valueOf(java.lang.String str) {
        return (androidx.compose.ui.focus.CustomDestinationResult) java.lang.Enum.valueOf(androidx.compose.ui.focus.CustomDestinationResult.class, str);
    }

    public static kotlin.enums.EnumEntries<androidx.compose.ui.focus.CustomDestinationResult> getEntries() {
        return Camera2StreamConfigurationMap;
    }

    private static final /* synthetic */ androidx.compose.ui.focus.CustomDestinationResult[] Camera2StreamConfigurationMap() {
        return new androidx.compose.ui.focus.CustomDestinationResult[]{None, Cancelled, Redirected, RedirectCancelled};
    }
}
