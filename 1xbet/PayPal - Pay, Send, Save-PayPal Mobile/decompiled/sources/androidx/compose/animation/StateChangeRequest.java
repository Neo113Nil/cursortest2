package androidx.compose.animation;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Landroidx/compose/animation/StateChangeRequest;", "", "<init>", "(Ljava/lang/String;I)V", "NoRequest", "MatchFound", "VisibleContentAbsentDuringTransition", "NoMatchFound"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StateChangeRequest {
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final androidx.compose.animation.StateChangeRequest MatchFound;
    public static final androidx.compose.animation.StateChangeRequest NoMatchFound;
    public static final androidx.compose.animation.StateChangeRequest NoRequest;
    public static final androidx.compose.animation.StateChangeRequest VisibleContentAbsentDuringTransition;
    private static final /* synthetic */ androidx.compose.animation.StateChangeRequest[] getHighResolutionOutputSizeshNQ4ISI;

    private StateChangeRequest(java.lang.String str, int i) {
    }

    static {
        androidx.compose.animation.StateChangeRequest stateChangeRequest = new androidx.compose.animation.StateChangeRequest("NoRequest", 0);
        NoRequest = stateChangeRequest;
        androidx.compose.animation.StateChangeRequest stateChangeRequest2 = new androidx.compose.animation.StateChangeRequest("MatchFound", 1);
        MatchFound = stateChangeRequest2;
        androidx.compose.animation.StateChangeRequest stateChangeRequest3 = new androidx.compose.animation.StateChangeRequest("VisibleContentAbsentDuringTransition", 2);
        VisibleContentAbsentDuringTransition = stateChangeRequest3;
        androidx.compose.animation.StateChangeRequest stateChangeRequest4 = new androidx.compose.animation.StateChangeRequest("NoMatchFound", 3);
        NoMatchFound = stateChangeRequest4;
        androidx.compose.animation.StateChangeRequest[] stateChangeRequestArr = {stateChangeRequest, stateChangeRequest2, stateChangeRequest3, stateChangeRequest4};
        getHighResolutionOutputSizeshNQ4ISI = stateChangeRequestArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(stateChangeRequestArr);
    }

    public static androidx.compose.animation.StateChangeRequest[] values() {
        return (androidx.compose.animation.StateChangeRequest[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static androidx.compose.animation.StateChangeRequest valueOf(java.lang.String str) {
        return (androidx.compose.animation.StateChangeRequest) java.lang.Enum.valueOf(androidx.compose.animation.StateChangeRequest.class, str);
    }

    public static kotlin.enums.EnumEntries<androidx.compose.animation.StateChangeRequest> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
