package androidx.compose.foundation.text;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Landroidx/compose/foundation/text/HandleState;", "", "<init>", "(Ljava/lang/String;I)V", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Name.NONE, "Selection", "Cursor"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HandleState {
    private static final /* synthetic */ androidx.compose.foundation.text.HandleState[] Camera2StreamConfigurationMap;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    public static final androidx.compose.foundation.text.HandleState None = new androidx.compose.foundation.text.HandleState(com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Name.NONE, 0);
    public static final androidx.compose.foundation.text.HandleState Selection = new androidx.compose.foundation.text.HandleState("Selection", 1);
    public static final androidx.compose.foundation.text.HandleState Cursor = new androidx.compose.foundation.text.HandleState("Cursor", 2);

    private HandleState(java.lang.String str, int i) {
    }

    static {
        androidx.compose.foundation.text.HandleState[] highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI();
        Camera2StreamConfigurationMap = highResolutionOutputSizeshNQ4ISI;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(highResolutionOutputSizeshNQ4ISI);
    }

    public static androidx.compose.foundation.text.HandleState[] values() {
        return (androidx.compose.foundation.text.HandleState[]) Camera2StreamConfigurationMap.clone();
    }

    public static androidx.compose.foundation.text.HandleState valueOf(java.lang.String str) {
        return (androidx.compose.foundation.text.HandleState) java.lang.Enum.valueOf(androidx.compose.foundation.text.HandleState.class, str);
    }

    public static kotlin.enums.EnumEntries<androidx.compose.foundation.text.HandleState> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }

    private static final /* synthetic */ androidx.compose.foundation.text.HandleState[] getHighResolutionOutputSizeshNQ4ISI() {
        return new androidx.compose.foundation.text.HandleState[]{None, Selection, Cursor};
    }
}
