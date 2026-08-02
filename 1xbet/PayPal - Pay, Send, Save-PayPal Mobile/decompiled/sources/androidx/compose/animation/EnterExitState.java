package androidx.compose.animation;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Landroidx/compose/animation/EnterExitState;", "", "<init>", "(Ljava/lang/String;I)V", "PreEnter", com.paypal.oslo.feature.balance.common.BalanceConstants.StateNames.STATE_VISIBLE, "PostExit"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class EnterExitState {
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final androidx.compose.animation.EnterExitState PostExit;
    public static final androidx.compose.animation.EnterExitState PreEnter;
    public static final androidx.compose.animation.EnterExitState Visible;
    private static final /* synthetic */ androidx.compose.animation.EnterExitState[] getHighSpeedVideoFpsRangesFor;

    private EnterExitState(java.lang.String str, int i) {
    }

    static {
        androidx.compose.animation.EnterExitState enterExitState = new androidx.compose.animation.EnterExitState("PreEnter", 0);
        PreEnter = enterExitState;
        androidx.compose.animation.EnterExitState enterExitState2 = new androidx.compose.animation.EnterExitState(com.paypal.oslo.feature.balance.common.BalanceConstants.StateNames.STATE_VISIBLE, 1);
        Visible = enterExitState2;
        androidx.compose.animation.EnterExitState enterExitState3 = new androidx.compose.animation.EnterExitState("PostExit", 2);
        PostExit = enterExitState3;
        androidx.compose.animation.EnterExitState[] enterExitStateArr = {enterExitState, enterExitState2, enterExitState3};
        getHighSpeedVideoFpsRangesFor = enterExitStateArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(enterExitStateArr);
    }

    public static androidx.compose.animation.EnterExitState[] values() {
        return (androidx.compose.animation.EnterExitState[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static androidx.compose.animation.EnterExitState valueOf(java.lang.String str) {
        return (androidx.compose.animation.EnterExitState) java.lang.Enum.valueOf(androidx.compose.animation.EnterExitState.class, str);
    }

    public static kotlin.enums.EnumEntries<androidx.compose.animation.EnterExitState> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
