package com.paypal.oslo.feature.verificationcapture.ui.screens.daonface;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/ProcessingState;", "", "<init>", "(Ljava/lang/String;I)V", "IDLE", "WAITING_FOR_FACE", "FACE_DETECTED", "LIVENESS_TIMER_STARTED", "CAPTURING", "SUCCESS", "ERROR"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ProcessingState {
    public static final com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.ProcessingState CAPTURING;
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.ProcessingState ERROR;
    public static final com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.ProcessingState FACE_DETECTED;
    public static final com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.ProcessingState IDLE;
    public static final com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.ProcessingState LIVENESS_TIMER_STARTED;
    public static final com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.ProcessingState SUCCESS;
    public static final com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.ProcessingState WAITING_FOR_FACE;
    private static final /* synthetic */ com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.ProcessingState[] getHighSpeedVideoSizes;

    private ProcessingState(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.ProcessingState processingState = new com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.ProcessingState("IDLE", 0);
        IDLE = processingState;
        com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.ProcessingState processingState2 = new com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.ProcessingState("WAITING_FOR_FACE", 1);
        WAITING_FOR_FACE = processingState2;
        com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.ProcessingState processingState3 = new com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.ProcessingState("FACE_DETECTED", 2);
        FACE_DETECTED = processingState3;
        com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.ProcessingState processingState4 = new com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.ProcessingState("LIVENESS_TIMER_STARTED", 3);
        LIVENESS_TIMER_STARTED = processingState4;
        com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.ProcessingState processingState5 = new com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.ProcessingState("CAPTURING", 4);
        CAPTURING = processingState5;
        com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.ProcessingState processingState6 = new com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.ProcessingState("SUCCESS", 5);
        SUCCESS = processingState6;
        com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.ProcessingState processingState7 = new com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.ProcessingState("ERROR", 6);
        ERROR = processingState7;
        com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.ProcessingState[] processingStateArr = {processingState, processingState2, processingState3, processingState4, processingState5, processingState6, processingState7};
        getHighSpeedVideoSizes = processingStateArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(processingStateArr);
    }

    public static com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.ProcessingState[] values() {
        return (com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.ProcessingState[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.ProcessingState valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.ProcessingState) java.lang.Enum.valueOf(com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.ProcessingState.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.ProcessingState> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
