package com.paypal.oslo.feature.verificationcapture.ui.screens.daonface;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/WarningMessage;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "stringRes", "Ljava/lang/String;", "getStringRes", "()Ljava/lang/String;", "CENTER_FACE", "MOVE_CLOSER", "MOVE_FURTHER", "REMOVE_GLASSES", "IMPROVE_LIGHTING"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class WarningMessage {
    public static final com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.WarningMessage CENTER_FACE;
    public static final com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.WarningMessage IMPROVE_LIGHTING;
    public static final com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.WarningMessage MOVE_CLOSER;
    public static final com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.WarningMessage MOVE_FURTHER;
    public static final com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.WarningMessage REMOVE_GLASSES;
    private static final /* synthetic */ com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.WarningMessage[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private final java.lang.String stringRes;

    private WarningMessage(java.lang.String str, int i, java.lang.String str2) {
        this.stringRes = str2;
    }

    public final java.lang.String getStringRes() {
        return this.stringRes;
    }

    static {
        com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.WarningMessage warningMessage = new com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.WarningMessage("CENTER_FACE", 0, "Center your face");
        CENTER_FACE = warningMessage;
        com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.WarningMessage warningMessage2 = new com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.WarningMessage("MOVE_CLOSER", 1, "Move closer");
        MOVE_CLOSER = warningMessage2;
        com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.WarningMessage warningMessage3 = new com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.WarningMessage("MOVE_FURTHER", 2, "Move back");
        MOVE_FURTHER = warningMessage3;
        com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.WarningMessage warningMessage4 = new com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.WarningMessage("REMOVE_GLASSES", 3, "Remove glasses or sunglasses");
        REMOVE_GLASSES = warningMessage4;
        com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.WarningMessage warningMessage5 = new com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.WarningMessage("IMPROVE_LIGHTING", 4, "Improve lighting");
        IMPROVE_LIGHTING = warningMessage5;
        com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.WarningMessage[] warningMessageArr = {warningMessage, warningMessage2, warningMessage3, warningMessage4, warningMessage5};
        getHighResolutionOutputSizeshNQ4ISI = warningMessageArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(warningMessageArr);
    }

    public static com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.WarningMessage[] values() {
        return (com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.WarningMessage[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.WarningMessage valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.WarningMessage) java.lang.Enum.valueOf(com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.WarningMessage.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.WarningMessage> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
