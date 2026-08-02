package com.paypal.oslo.feature.wallet.cards.ui.scan;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/ui/scan/CameraPermissionState;", "", "<init>", "(Ljava/lang/String;I)V", "GRANTED", com.paypal.oslo.feature.debitcard.shared.domain.model.DataResultError.GraphQLError.ERROR_ISSUE_DENIED, "NOT_REQUESTED"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CameraPermissionState {
    public static final com.paypal.oslo.feature.wallet.cards.ui.scan.CameraPermissionState DENIED;
    public static final com.paypal.oslo.feature.wallet.cards.ui.scan.CameraPermissionState GRANTED;
    public static final com.paypal.oslo.feature.wallet.cards.ui.scan.CameraPermissionState NOT_REQUESTED;
    private static final /* synthetic */ com.paypal.oslo.feature.wallet.cards.ui.scan.CameraPermissionState[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;

    private CameraPermissionState(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.wallet.cards.ui.scan.CameraPermissionState cameraPermissionState = new com.paypal.oslo.feature.wallet.cards.ui.scan.CameraPermissionState("GRANTED", 0);
        GRANTED = cameraPermissionState;
        com.paypal.oslo.feature.wallet.cards.ui.scan.CameraPermissionState cameraPermissionState2 = new com.paypal.oslo.feature.wallet.cards.ui.scan.CameraPermissionState(com.paypal.oslo.feature.debitcard.shared.domain.model.DataResultError.GraphQLError.ERROR_ISSUE_DENIED, 1);
        DENIED = cameraPermissionState2;
        com.paypal.oslo.feature.wallet.cards.ui.scan.CameraPermissionState cameraPermissionState3 = new com.paypal.oslo.feature.wallet.cards.ui.scan.CameraPermissionState("NOT_REQUESTED", 2);
        NOT_REQUESTED = cameraPermissionState3;
        com.paypal.oslo.feature.wallet.cards.ui.scan.CameraPermissionState[] cameraPermissionStateArr = {cameraPermissionState, cameraPermissionState2, cameraPermissionState3};
        getHighResolutionOutputSizeshNQ4ISI = cameraPermissionStateArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(cameraPermissionStateArr);
    }

    public static com.paypal.oslo.feature.wallet.cards.ui.scan.CameraPermissionState[] values() {
        return (com.paypal.oslo.feature.wallet.cards.ui.scan.CameraPermissionState[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.wallet.cards.ui.scan.CameraPermissionState valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.wallet.cards.ui.scan.CameraPermissionState) java.lang.Enum.valueOf(com.paypal.oslo.feature.wallet.cards.ui.scan.CameraPermissionState.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.wallet.cards.ui.scan.CameraPermissionState> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
