package com.microblink.blinkid.fragment.overlay.blinkid.reticleui;

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
public final class ReticleUiState {
    public static final com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleUiState AFTER_CARD_FLIP;
    public static final com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleUiState BLUR_DETECTED;
    public static final com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleUiState CAMERA_TOO_CLOSE;
    public static final com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleUiState CAMERA_TOO_HIGH;
    public static final com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleUiState DOCUMENT_NOT_FULLY_VISIBLE;
    public static final com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleUiState DOCUMENT_TOO_CLOSE_TO_EDGE;
    public static final com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleUiState ERROR_DIALOG;
    public static final com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleUiState FACE_PHOTO_NOT_FULLY_VISIBLE;
    public static final com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleUiState FLIP_CARD;
    public static final com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleUiState GLARE_DETECTED;
    public static final com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleUiState PROCESSING;
    public static final com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleUiState SCANNING_WRONG_SIDE;
    public static final com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleUiState SENSING;
    public static final com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleUiState SENSING_START;
    public static final com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleUiState SUCCESS;
    public static final com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleUiState SUCCESS_FIRST_SIDE;
    public static final com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleUiState TURN_PAGE;
    private static final /* synthetic */ com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleUiState[] getHighSpeedVideoFpsRanges;
    public final com.microblink.blinkid.fragment.overlay.blinkid.reticleui.CardAnimator cardAnimator;
    final com.microblink.blinkid.fragment.overlay.reticle.StatusMessageMode getHighSpeedVideoSizes;
    public final boolean isDetectionError;
    public final boolean isProcessingError;
    public final long minDurationMs;
    public final com.microblink.blinkid.fragment.overlay.reticle.ReticleView.Type reticleType;
    public final boolean shouldShowInnerReticle;
    public final boolean shouldShowProgress;

    static {
        com.microblink.blinkid.fragment.overlay.reticle.ReticleView.Type type = com.microblink.blinkid.fragment.overlay.reticle.ReticleView.Type.DEFAULT;
        com.microblink.blinkid.fragment.overlay.reticle.StatusMessageMode statusMessageMode = com.microblink.blinkid.fragment.overlay.reticle.StatusMessageMode.DELAYED;
        com.microblink.blinkid.fragment.overlay.blinkid.reticleui.CardAnimator cardAnimator = com.microblink.blinkid.fragment.overlay.blinkid.reticleui.CardAnimator.getHighSpeedVideoFpsRanges;
        com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleUiState reticleUiState = new com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleUiState("SENSING", 0, type, true, false, false, false, statusMessageMode, cardAnimator, 0L);
        SENSING = reticleUiState;
        com.microblink.blinkid.fragment.overlay.reticle.StatusMessageMode statusMessageMode2 = com.microblink.blinkid.fragment.overlay.reticle.StatusMessageMode.IMMEDIATE;
        com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleUiState reticleUiState2 = new com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleUiState("SENSING_START", 1, type, true, false, false, false, statusMessageMode2, cardAnimator, 0L);
        SENSING_START = reticleUiState2;
        com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleUiState reticleUiState3 = new com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleUiState("PROCESSING", 2, type, false, true, false, false, statusMessageMode2, cardAnimator, 400L);
        PROCESSING = reticleUiState3;
        com.microblink.blinkid.fragment.overlay.reticle.ReticleView.Type type2 = com.microblink.blinkid.fragment.overlay.reticle.ReticleView.Type.SUCCESS;
        com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleUiState reticleUiState4 = new com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleUiState("SUCCESS", 3, type2, false, false, false, false, statusMessageMode2, cardAnimator, 750L);
        SUCCESS = reticleUiState4;
        com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleUiState reticleUiState5 = new com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleUiState("SUCCESS_FIRST_SIDE", 4, type2, false, false, false, false, statusMessageMode2, cardAnimator, 850L);
        SUCCESS_FIRST_SIDE = reticleUiState5;
        com.microblink.blinkid.fragment.overlay.reticle.ReticleView.Type type3 = com.microblink.blinkid.fragment.overlay.reticle.ReticleView.Type.HIDDEN;
        com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleUiState reticleUiState6 = new com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleUiState("FLIP_CARD", 5, type3, false, false, false, false, statusMessageMode2, new com.microblink.blinkid.fragment.overlay.blinkid.reticleui.CardFlipAnimator(), 2000L);
        FLIP_CARD = reticleUiState6;
        com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleUiState reticleUiState7 = new com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleUiState("TURN_PAGE", 6, type3, false, false, false, false, statusMessageMode2, new com.microblink.blinkid.fragment.overlay.blinkid.reticleui.CardAnimator() { // from class: com.microblink.blinkid.fragment.overlay.blinkid.reticleui.TurnPageAnimator
            private android.animation.AnimatorSet getHighSpeedVideoSizes;

            /* renamed from: com.microblink.blinkid.fragment.overlay.blinkid.reticleui.TurnPageAnimator$1, reason: invalid class name */
            public static /* synthetic */ class AnonymousClass1 {
                static final /* synthetic */ int[] getHighSpeedVideoFpsRangesFor;

                static {
                    int[] iArr = new int[com.microblink.blinkid.fragment.overlay.blinkid.reticleui.CardAnimator.DocumentRotation.values().length];
                    getHighSpeedVideoFpsRangesFor = iArr;
                    try {
                        iArr[com.microblink.blinkid.fragment.overlay.blinkid.reticleui.CardAnimator.DocumentRotation.ZERO.ordinal()] = 1;
                    } catch (java.lang.NoSuchFieldError unused) {
                    }
                    try {
                        getHighSpeedVideoFpsRangesFor[com.microblink.blinkid.fragment.overlay.blinkid.reticleui.CardAnimator.DocumentRotation.UPSIDE_DOWN.ordinal()] = 2;
                    } catch (java.lang.NoSuchFieldError unused2) {
                    }
                    try {
                        getHighSpeedVideoFpsRangesFor[com.microblink.blinkid.fragment.overlay.blinkid.reticleui.CardAnimator.DocumentRotation.CLOCKWISE_90.ordinal()] = 3;
                    } catch (java.lang.NoSuchFieldError unused3) {
                    }
                    try {
                        getHighSpeedVideoFpsRangesFor[com.microblink.blinkid.fragment.overlay.blinkid.reticleui.CardAnimator.DocumentRotation.COUNTER_CLOCKWISE_90.ordinal()] = 4;
                    } catch (java.lang.NoSuchFieldError unused4) {
                    }
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x0060  */
            /* JADX WARN: Removed duplicated region for block: B:15:0x0066  */
            @Override // com.microblink.blinkid.fragment.overlay.blinkid.reticleui.CardAnimator
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void getHighResolutionOutputSizeshNQ4ISI(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.CardAnimator.DocumentRotation documentRotation, android.widget.FrameLayout frameLayout, com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayResources reticleOverlayResources) {
                int i;
                android.content.Context context = frameLayout.getContext();
                frameLayout.removeAllViews();
                int i2 = com.microblink.blinkid.fragment.overlay.blinkid.reticleui.TurnPageAnimator.AnonymousClass1.getHighSpeedVideoFpsRangesFor[documentRotation.ordinal()];
                if (i2 != 1 && i2 != 2) {
                    if (i2 == 3) {
                        i = 90;
                    } else if (i2 == 4) {
                        i = 270;
                    }
                    frameLayout.setRotation(i);
                    android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.microblink.blinkid.resources.Layouts.lIlllIlIlI, frameLayout);
                    android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.microblink.blinkid.library.R.id.ivPassportTop);
                    android.widget.ImageView imageView2 = (android.widget.ImageView) inflate.findViewById(com.microblink.blinkid.library.R.id.ivPassportBottom);
                    android.widget.ImageView imageView3 = (android.widget.ImageView) inflate.findViewById(com.microblink.blinkid.library.R.id.ivPassportHighlight);
                    imageView.setImageDrawable(reticleOverlayResources.d);
                    imageView2.setImageDrawable(reticleOverlayResources.getOutputStallDuration);
                    imageView3.setImageDrawable(reticleOverlayResources.unwrapAs);
                    frameLayout.setVisibility(0);
                    android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(imageView3, "translationY", reticleOverlayResources.d == null ? r8.getIntrinsicHeight() : 0.0f, 0.0f);
                    ofFloat.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
                    ofFloat.setDuration(800L);
                    android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(imageView, "alpha", 0.4f, 1.0f);
                    ofFloat2.setDuration(800L);
                    android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(imageView2, "alpha", 1.0f, 0.4f);
                    ofFloat3.setDuration(800L);
                    android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
                    this.getHighSpeedVideoSizes = animatorSet;
                    animatorSet.play(ofFloat).with(ofFloat2).with(ofFloat3);
                    this.getHighSpeedVideoSizes.start();
                }
                i = 0;
                frameLayout.setRotation(i);
                android.view.View inflate2 = android.view.LayoutInflater.from(context).inflate(com.microblink.blinkid.resources.Layouts.lIlllIlIlI, frameLayout);
                android.widget.ImageView imageView4 = (android.widget.ImageView) inflate2.findViewById(com.microblink.blinkid.library.R.id.ivPassportTop);
                android.widget.ImageView imageView22 = (android.widget.ImageView) inflate2.findViewById(com.microblink.blinkid.library.R.id.ivPassportBottom);
                android.widget.ImageView imageView32 = (android.widget.ImageView) inflate2.findViewById(com.microblink.blinkid.library.R.id.ivPassportHighlight);
                imageView4.setImageDrawable(reticleOverlayResources.d);
                imageView22.setImageDrawable(reticleOverlayResources.getOutputStallDuration);
                imageView32.setImageDrawable(reticleOverlayResources.unwrapAs);
                frameLayout.setVisibility(0);
                android.animation.ObjectAnimator ofFloat4 = android.animation.ObjectAnimator.ofFloat(imageView32, "translationY", reticleOverlayResources.d == null ? r8.getIntrinsicHeight() : 0.0f, 0.0f);
                ofFloat4.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
                ofFloat4.setDuration(800L);
                android.animation.ObjectAnimator ofFloat22 = android.animation.ObjectAnimator.ofFloat(imageView4, "alpha", 0.4f, 1.0f);
                ofFloat22.setDuration(800L);
                android.animation.ObjectAnimator ofFloat32 = android.animation.ObjectAnimator.ofFloat(imageView22, "alpha", 1.0f, 0.4f);
                ofFloat32.setDuration(800L);
                android.animation.AnimatorSet animatorSet2 = new android.animation.AnimatorSet();
                this.getHighSpeedVideoSizes = animatorSet2;
                animatorSet2.play(ofFloat4).with(ofFloat22).with(ofFloat32);
                this.getHighSpeedVideoSizes.start();
            }

            @Override // com.microblink.blinkid.fragment.overlay.blinkid.reticleui.CardAnimator
            public final void getHighSpeedVideoSizes() {
                android.animation.AnimatorSet animatorSet = this.getHighSpeedVideoSizes;
                if (animatorSet != null) {
                    animatorSet.end();
                    this.getHighSpeedVideoSizes.cancel();
                }
            }
        }, 2000L);
        TURN_PAGE = reticleUiState7;
        com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleUiState reticleUiState8 = new com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleUiState("AFTER_CARD_FLIP", 7, type, true, false, false, false, statusMessageMode2, cardAnimator, 0L);
        AFTER_CARD_FLIP = reticleUiState8;
        com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleUiState reticleUiState9 = new com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleUiState("ERROR_DIALOG", 8, type3, false, false, false, false, statusMessageMode2, cardAnimator, 0L);
        ERROR_DIALOG = reticleUiState9;
        com.microblink.blinkid.fragment.overlay.reticle.ReticleView.Type type4 = com.microblink.blinkid.fragment.overlay.reticle.ReticleView.Type.ERROR;
        com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleUiState reticleUiState10 = new com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleUiState("CAMERA_TOO_HIGH", 9, type4, false, false, true, false, statusMessageMode2, cardAnimator, 1000L);
        CAMERA_TOO_HIGH = reticleUiState10;
        com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleUiState reticleUiState11 = new com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleUiState("CAMERA_TOO_CLOSE", 10, type4, false, false, true, false, statusMessageMode2, cardAnimator, 1000L);
        CAMERA_TOO_CLOSE = reticleUiState11;
        com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleUiState reticleUiState12 = new com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleUiState("DOCUMENT_TOO_CLOSE_TO_EDGE", 11, type4, false, false, true, false, statusMessageMode2, cardAnimator, 1000L);
        DOCUMENT_TOO_CLOSE_TO_EDGE = reticleUiState12;
        com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleUiState reticleUiState13 = new com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleUiState("DOCUMENT_NOT_FULLY_VISIBLE", 12, type4, false, false, false, true, statusMessageMode2, cardAnimator, 3000L);
        DOCUMENT_NOT_FULLY_VISIBLE = reticleUiState13;
        com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleUiState reticleUiState14 = new com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleUiState("BLUR_DETECTED", 13, type4, false, false, false, true, statusMessageMode2, cardAnimator, 1000L);
        BLUR_DETECTED = reticleUiState14;
        com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleUiState reticleUiState15 = new com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleUiState("GLARE_DETECTED", 14, type4, false, false, false, true, statusMessageMode2, cardAnimator, 1000L);
        GLARE_DETECTED = reticleUiState15;
        com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleUiState reticleUiState16 = new com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleUiState("SCANNING_WRONG_SIDE", 15, type4, false, false, false, true, statusMessageMode2, cardAnimator, 1500L);
        SCANNING_WRONG_SIDE = reticleUiState16;
        com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleUiState reticleUiState17 = new com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleUiState("FACE_PHOTO_NOT_FULLY_VISIBLE", 16, type4, false, false, false, true, statusMessageMode2, cardAnimator, 1500L);
        FACE_PHOTO_NOT_FULLY_VISIBLE = reticleUiState17;
        getHighSpeedVideoFpsRanges = new com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleUiState[]{reticleUiState, reticleUiState2, reticleUiState3, reticleUiState4, reticleUiState5, reticleUiState6, reticleUiState7, reticleUiState8, reticleUiState9, reticleUiState10, reticleUiState11, reticleUiState12, reticleUiState13, reticleUiState14, reticleUiState15, reticleUiState16, reticleUiState17};
    }

    private ReticleUiState(java.lang.String str, int i, com.microblink.blinkid.fragment.overlay.reticle.ReticleView.Type type, boolean z, boolean z2, boolean z3, boolean z4, com.microblink.blinkid.fragment.overlay.reticle.StatusMessageMode statusMessageMode, com.microblink.blinkid.fragment.overlay.blinkid.reticleui.CardAnimator cardAnimator, long j) {
        this.reticleType = type;
        this.shouldShowInnerReticle = z;
        this.shouldShowProgress = z2;
        this.isDetectionError = z3;
        this.isProcessingError = z4;
        this.getHighSpeedVideoSizes = statusMessageMode;
        this.cardAnimator = cardAnimator;
        this.minDurationMs = j;
    }

    public static com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleUiState valueOf(java.lang.String str) {
        return (com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleUiState) java.lang.Enum.valueOf(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleUiState.class, str);
    }

    public static com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleUiState[] values() {
        return (com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleUiState[]) getHighSpeedVideoFpsRanges.clone();
    }
}
