package com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupsna/ui/mvi/NavigateBackReason;", "", "<init>", "(Ljava/lang/String;I)V", "NetworkCallFailed", "ValidationFailed"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class NavigateBackReason {
    public static final com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.NavigateBackReason NetworkCallFailed;
    public static final com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.NavigateBackReason ValidationFailed;
    private static final /* synthetic */ com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.NavigateBackReason[] getHighSpeedVideoFpsRangesFor;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private NavigateBackReason(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.NavigateBackReason navigateBackReason = new com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.NavigateBackReason("NetworkCallFailed", 0);
        NetworkCallFailed = navigateBackReason;
        com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.NavigateBackReason navigateBackReason2 = new com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.NavigateBackReason("ValidationFailed", 1);
        ValidationFailed = navigateBackReason2;
        com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.NavigateBackReason[] navigateBackReasonArr = {navigateBackReason, navigateBackReason2};
        getHighSpeedVideoFpsRangesFor = navigateBackReasonArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(navigateBackReasonArr);
    }

    public static com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.NavigateBackReason[] values() {
        return (com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.NavigateBackReason[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.NavigateBackReason valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.NavigateBackReason) java.lang.Enum.valueOf(com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.NavigateBackReason.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.NavigateBackReason> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
