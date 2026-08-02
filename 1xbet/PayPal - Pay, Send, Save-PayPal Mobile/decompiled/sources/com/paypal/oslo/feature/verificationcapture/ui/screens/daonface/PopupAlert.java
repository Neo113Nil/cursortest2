package com.paypal.oslo.feature.verificationcapture.ui.screens.daonface;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/PopupAlert;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "stringRes", "Ljava/lang/String;", "getStringRes", "()Ljava/lang/String;", "FACE_TUTORIAL", "BLINK_START", "TRY_BLINK"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PopupAlert {
    public static final com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.PopupAlert BLINK_START;
    public static final com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.PopupAlert FACE_TUTORIAL;
    public static final com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.PopupAlert TRY_BLINK;
    private static final /* synthetic */ com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.PopupAlert[] getHighSpeedVideoFpsRangesFor;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;
    private final java.lang.String stringRes;

    private PopupAlert(java.lang.String str, int i, java.lang.String str2) {
        this.stringRes = str2;
    }

    public final java.lang.String getStringRes() {
        return this.stringRes;
    }

    static {
        com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.PopupAlert popupAlert = new com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.PopupAlert("FACE_TUTORIAL", 0, "Position your face in the frame");
        FACE_TUTORIAL = popupAlert;
        com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.PopupAlert popupAlert2 = new com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.PopupAlert("BLINK_START", 1, "Now blink");
        BLINK_START = popupAlert2;
        com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.PopupAlert popupAlert3 = new com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.PopupAlert("TRY_BLINK", 2, "Try blinking");
        TRY_BLINK = popupAlert3;
        com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.PopupAlert[] popupAlertArr = {popupAlert, popupAlert2, popupAlert3};
        getHighSpeedVideoFpsRangesFor = popupAlertArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(popupAlertArr);
    }

    public static com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.PopupAlert[] values() {
        return (com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.PopupAlert[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.PopupAlert valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.PopupAlert) java.lang.Enum.valueOf(com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.PopupAlert.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.PopupAlert> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
