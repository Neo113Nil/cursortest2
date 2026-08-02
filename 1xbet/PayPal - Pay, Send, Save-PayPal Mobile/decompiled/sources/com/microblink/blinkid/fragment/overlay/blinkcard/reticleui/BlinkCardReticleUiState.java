package com.microblink.blinkid.fragment.overlay.blinkcard.reticleui;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'SENSING' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes10.dex */
public final class BlinkCardReticleUiState {
    public static final com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleUiState AFTER_CARD_FLIP;
    public static final com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleUiState CAMERA_TOO_CLOSE;
    public static final com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleUiState CAMERA_TOO_HIGH;
    public static final com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleUiState DOCUMENT_NOT_FULLY_VISIBLE;
    public static final com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleUiState DOCUMENT_NOT_IN_HAND;
    public static final com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleUiState DOCUMENT_TOO_CLOSE_TO_EDGE;
    public static final com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleUiState ERROR_DIALOG;
    public static final com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleUiState FLIP_CARD;
    public static final com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleUiState PROCESSING;
    public static final com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleUiState SENSING;
    public static final com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleUiState SUCCESS;
    private static final /* synthetic */ com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleUiState[] getHighSpeedVideoFpsRanges;
    final com.microblink.blinkid.fragment.overlay.reticle.StatusMessageMode Camera2StreamConfigurationMap;
    public final com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.CardAnimator cardAnimator;
    public final boolean isDetectionError;
    public final boolean isProcessingError;
    public final long minDurationMs;
    public final com.microblink.blinkid.fragment.overlay.reticle.ReticleView.Type reticleType;
    public final boolean shouldShowInnerReticle;
    public final boolean shouldShowProgress;

    static {
        com.microblink.blinkid.fragment.overlay.reticle.ReticleView.Type type = com.microblink.blinkid.fragment.overlay.reticle.ReticleView.Type.DEFAULT;
        com.microblink.blinkid.fragment.overlay.reticle.StatusMessageMode statusMessageMode = com.microblink.blinkid.fragment.overlay.reticle.StatusMessageMode.DELAYED;
        com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.CardAnimator cardAnimator = com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.CardAnimator.EMPTY;
        com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleUiState blinkCardReticleUiState = new com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleUiState("SENSING", 0, type, true, false, false, false, statusMessageMode, cardAnimator, 0L);
        SENSING = blinkCardReticleUiState;
        com.microblink.blinkid.fragment.overlay.reticle.StatusMessageMode statusMessageMode2 = com.microblink.blinkid.fragment.overlay.reticle.StatusMessageMode.IMMEDIATE;
        com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleUiState blinkCardReticleUiState2 = new com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleUiState("PROCESSING", 1, type, false, true, false, false, statusMessageMode2, cardAnimator, 400L);
        PROCESSING = blinkCardReticleUiState2;
        com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleUiState blinkCardReticleUiState3 = new com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleUiState("SUCCESS", 2, com.microblink.blinkid.fragment.overlay.reticle.ReticleView.Type.SUCCESS, false, false, false, false, statusMessageMode2, cardAnimator, 750L);
        SUCCESS = blinkCardReticleUiState3;
        com.microblink.blinkid.fragment.overlay.reticle.ReticleView.Type type2 = com.microblink.blinkid.fragment.overlay.reticle.ReticleView.Type.HIDDEN;
        com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleUiState blinkCardReticleUiState4 = new com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleUiState("FLIP_CARD", 3, type2, false, false, false, false, statusMessageMode2, new com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.CardFlipAnimator(), 2000L);
        FLIP_CARD = blinkCardReticleUiState4;
        com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleUiState blinkCardReticleUiState5 = new com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleUiState("AFTER_CARD_FLIP", 4, type, true, false, false, false, statusMessageMode2, cardAnimator, 0L);
        AFTER_CARD_FLIP = blinkCardReticleUiState5;
        com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleUiState blinkCardReticleUiState6 = new com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleUiState("ERROR_DIALOG", 5, type2, false, false, false, false, statusMessageMode2, cardAnimator, 0L);
        ERROR_DIALOG = blinkCardReticleUiState6;
        com.microblink.blinkid.fragment.overlay.reticle.ReticleView.Type type3 = com.microblink.blinkid.fragment.overlay.reticle.ReticleView.Type.ERROR;
        com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleUiState blinkCardReticleUiState7 = new com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleUiState("CAMERA_TOO_HIGH", 6, type3, false, false, true, false, statusMessageMode2, cardAnimator, 1000L);
        CAMERA_TOO_HIGH = blinkCardReticleUiState7;
        com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleUiState blinkCardReticleUiState8 = new com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleUiState("CAMERA_TOO_CLOSE", 7, type3, false, false, true, false, statusMessageMode2, cardAnimator, 1000L);
        CAMERA_TOO_CLOSE = blinkCardReticleUiState8;
        com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleUiState blinkCardReticleUiState9 = new com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleUiState("DOCUMENT_TOO_CLOSE_TO_EDGE", 8, type3, false, false, true, false, statusMessageMode2, cardAnimator, 1000L);
        DOCUMENT_TOO_CLOSE_TO_EDGE = blinkCardReticleUiState9;
        com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleUiState blinkCardReticleUiState10 = new com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleUiState("DOCUMENT_NOT_FULLY_VISIBLE", 9, type3, false, false, false, true, statusMessageMode2, cardAnimator, 1000L);
        DOCUMENT_NOT_FULLY_VISIBLE = blinkCardReticleUiState10;
        com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleUiState blinkCardReticleUiState11 = new com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleUiState("DOCUMENT_NOT_IN_HAND", 10, type3, false, false, true, false, statusMessageMode2, cardAnimator, 1000L);
        DOCUMENT_NOT_IN_HAND = blinkCardReticleUiState11;
        getHighSpeedVideoFpsRanges = new com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleUiState[]{blinkCardReticleUiState, blinkCardReticleUiState2, blinkCardReticleUiState3, blinkCardReticleUiState4, blinkCardReticleUiState5, blinkCardReticleUiState6, blinkCardReticleUiState7, blinkCardReticleUiState8, blinkCardReticleUiState9, blinkCardReticleUiState10, blinkCardReticleUiState11};
    }

    private BlinkCardReticleUiState(java.lang.String str, int i, com.microblink.blinkid.fragment.overlay.reticle.ReticleView.Type type, boolean z, boolean z2, boolean z3, boolean z4, com.microblink.blinkid.fragment.overlay.reticle.StatusMessageMode statusMessageMode, com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.CardAnimator cardAnimator, long j) {
        this.reticleType = type;
        this.shouldShowInnerReticle = z;
        this.shouldShowProgress = z2;
        this.isDetectionError = z3;
        this.isProcessingError = z4;
        this.Camera2StreamConfigurationMap = statusMessageMode;
        this.cardAnimator = cardAnimator;
        this.minDurationMs = j;
    }

    public static com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleUiState valueOf(java.lang.String str) {
        return (com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleUiState) java.lang.Enum.valueOf(com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleUiState.class, str);
    }

    public static com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleUiState[] values() {
        return (com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleUiState[]) getHighSpeedVideoFpsRanges.clone();
    }
}
