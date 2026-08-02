package com.microblink.blinkid.fragment.overlay.blinkcard.reticleui;

/* loaded from: classes10.dex */
public class BlinkCardReticleOverlayStrings implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings> CREATOR = new android.os.Parcelable.Creator<com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings>() { // from class: com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings.1
        @Override // android.os.Parcelable.Creator
        public /* synthetic */ com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings createFromParcel(android.os.Parcel parcel) {
            return new com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings[] newArray(int i) {
            return new com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings[i];
        }
    };
    public final java.lang.String backSideInstructions;
    public final java.lang.String errorCardNotFullyVisible;
    public final java.lang.String errorCardTooCloseToEdge;
    public final java.lang.String errorMoveCloser;
    public final java.lang.String errorMoveFarther;
    public final java.lang.String flashlightWarning;
    public final java.lang.String flipCardInstructions;
    public final java.lang.String frontSideInstructions;
    public final java.lang.String glareMessage;
    public final java.lang.String helpTooltip;
    public final java.lang.String introductionDialogMessage;
    public final java.lang.String introductionDialogTitle;
    public final java.lang.String introductionDoneButton;
    public final java.lang.String manualEntry;
    public final java.lang.String onboardingBackButtonText;
    public final java.lang.String onboardingDoneButtonText;
    public final java.lang.String[] onboardingMessages;
    public final java.lang.String onboardingNextButtonText;
    public final java.lang.String onboardingSkipButtonText;
    public final java.lang.String[] onboardingTitles;
    public final java.lang.String recognitionTimeoutMessage;
    public final java.lang.String recognitionTimeoutTitle;
    public final java.lang.String retryButton;

    public static class Builder extends com.microblink.blinkid.fragment.overlay.OverlayStringsBuilder<com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings.Builder, com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings.Builder.Key> implements com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.options.BlinkCardReticleOverlayStringsOptions<com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings.Builder> {
        private java.lang.String[] getHighResolutionOutputSizeshNQ4ISI;
        private java.lang.String[] getHighSpeedVideoSizes;

        public enum Key {
            RECOGNITION_TIMEOUT_TITLE,
            RECOGNITION_TIMEOUT_MESSAGE,
            RETRY_BUTTON,
            FRONT_SIDE_INSTRUCTIONS,
            FLIP_CARD_INSTRUCTIONS,
            BACK_SIDE_INSTRUCTIONS,
            ERROR_MOVE_CLOSER,
            ERROR_MOVE_FARTHER,
            ERROR_CARD_TOO_CLOSE_TO_EDGE,
            ERROR_CARD_NOT_FULLY_VISIBLE,
            FLASHLIGHT_WARNING_MESSAGE,
            DIALOG_INTRODUCTION_TITLE,
            DIALOG_INTRODUCTION_MESSAGE,
            DIALOG_INTRODUCTION_DONE_BUTTON,
            HELP_TOOLTIP,
            ONBOARDING_BTN_SKIP,
            ONBOARDING_BTN_DONE,
            ONBOARDING_BTN_NEXT,
            ONBOARDING_BTN_BACK,
            ONBOARDING_TITLES,
            ONBOARDING_MESSAGES,
            MANUAL_ENTRY,
            GLARE_MESSAGE
        }

        public Builder(android.content.Context context) {
            super(context);
            llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings.Builder.Key.RETRY_BUTTON, llIIlIlIIl(com.microblink.blinkid.library.R.string.mb_blinkcard_recognition_timeout_dialog_retry_button));
            llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings.Builder.Key.FRONT_SIDE_INSTRUCTIONS, llIIlIlIIl(com.microblink.blinkid.library.R.string.mb_instructions_scan_front_side));
            llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings.Builder.Key.FLIP_CARD_INSTRUCTIONS, llIIlIlIIl(com.microblink.blinkid.library.R.string.mb_instructions_flip_card));
            llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings.Builder.Key.BACK_SIDE_INSTRUCTIONS, llIIlIlIIl(com.microblink.blinkid.library.R.string.mb_blinkcard_back_instructions));
            llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings.Builder.Key.ERROR_MOVE_CLOSER, llIIlIlIIl(com.microblink.blinkid.library.R.string.mb_error_camera_high));
            llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings.Builder.Key.ERROR_MOVE_FARTHER, llIIlIlIIl(com.microblink.blinkid.library.R.string.mb_error_camera_near));
            llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings.Builder.Key.ERROR_CARD_TOO_CLOSE_TO_EDGE, llIIlIlIIl(com.microblink.blinkid.library.R.string.mb_blinkcard_card_too_close_to_edge));
            llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings.Builder.Key.ERROR_CARD_NOT_FULLY_VISIBLE, llIIlIlIIl(com.microblink.blinkid.library.R.string.mb_blinkcard_card_not_fully_visible));
            llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings.Builder.Key.RECOGNITION_TIMEOUT_TITLE, llIIlIlIIl(com.microblink.blinkid.library.R.string.mb_blinkcard_recognition_timeout_dialog_title));
            llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings.Builder.Key.RECOGNITION_TIMEOUT_MESSAGE, llIIlIlIIl(com.microblink.blinkid.library.R.string.mb_blinkcard_recognition_timeout_dialog_message));
            llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings.Builder.Key.FLASHLIGHT_WARNING_MESSAGE, llIIlIlIIl(com.microblink.blinkid.library.R.string.mb_blinkcard_flashlight_warning_message));
            llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings.Builder.Key.HELP_TOOLTIP, llIIlIlIIl(com.microblink.blinkid.library.R.string.mb_onboarding_tooltip));
            llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings.Builder.Key.DIALOG_INTRODUCTION_TITLE, llIIlIlIIl(com.microblink.blinkid.library.R.string.mb_blinkcard_introduction_dialog_title));
            llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings.Builder.Key.DIALOG_INTRODUCTION_MESSAGE, llIIlIlIIl(com.microblink.blinkid.library.R.string.mb_blinkcard_introduction_dialog_message));
            llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings.Builder.Key.DIALOG_INTRODUCTION_DONE_BUTTON, llIIlIlIIl(com.microblink.blinkid.library.R.string.mb_btn_done));
            llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings.Builder.Key.ONBOARDING_BTN_SKIP, llIIlIlIIl(com.microblink.blinkid.library.R.string.mb_btn_skip));
            llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings.Builder.Key.ONBOARDING_BTN_NEXT, llIIlIlIIl(com.microblink.blinkid.library.R.string.mb_btn_next));
            llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings.Builder.Key.ONBOARDING_BTN_BACK, llIIlIlIIl(com.microblink.blinkid.library.R.string.mb_btn_back));
            llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings.Builder.Key.ONBOARDING_BTN_DONE, llIIlIlIIl(com.microblink.blinkid.library.R.string.mb_btn_done));
            this.getHighResolutionOutputSizeshNQ4ISI = new java.lang.String[]{llIIlIlIIl(com.microblink.blinkid.library.R.string.mb_blinkcard_onboarding_title1), llIIlIlIIl(com.microblink.blinkid.library.R.string.mb_blinkcard_onboarding_title2), llIIlIlIIl(com.microblink.blinkid.library.R.string.mb_blinkcard_onboarding_title3), llIIlIlIIl(com.microblink.blinkid.library.R.string.mb_blinkcard_onboarding_title4)};
            this.getHighSpeedVideoSizes = new java.lang.String[]{llIIlIlIIl(com.microblink.blinkid.library.R.string.mb_blinkcard_onboarding_msg1), llIIlIlIIl(com.microblink.blinkid.library.R.string.mb_blinkcard_onboarding_msg2), llIIlIlIIl(com.microblink.blinkid.library.R.string.mb_blinkcard_onboarding_msg3), llIIlIlIIl(com.microblink.blinkid.library.R.string.mb_blinkcard_onboarding_msg4)};
            llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings.Builder.Key.MANUAL_ENTRY, llIIlIlIIl(com.microblink.blinkid.library.R.string.mb_manual_entry));
            llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings.Builder.Key.GLARE_MESSAGE, llIIlIlIIl(com.microblink.blinkid.library.R.string.mb_blink_card_glare));
        }

        public com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings build() {
            return new com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings(llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings.Builder.Key.RECOGNITION_TIMEOUT_TITLE), llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings.Builder.Key.RECOGNITION_TIMEOUT_MESSAGE), llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings.Builder.Key.RETRY_BUTTON), llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings.Builder.Key.FRONT_SIDE_INSTRUCTIONS), llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings.Builder.Key.FLIP_CARD_INSTRUCTIONS), llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings.Builder.Key.BACK_SIDE_INSTRUCTIONS), llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings.Builder.Key.ERROR_MOVE_CLOSER), llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings.Builder.Key.ERROR_MOVE_FARTHER), llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings.Builder.Key.ERROR_CARD_TOO_CLOSE_TO_EDGE), llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings.Builder.Key.ERROR_CARD_NOT_FULLY_VISIBLE), llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings.Builder.Key.FLASHLIGHT_WARNING_MESSAGE), llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings.Builder.Key.DIALOG_INTRODUCTION_TITLE), llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings.Builder.Key.DIALOG_INTRODUCTION_MESSAGE), llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings.Builder.Key.DIALOG_INTRODUCTION_DONE_BUTTON), llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings.Builder.Key.HELP_TOOLTIP), llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings.Builder.Key.ONBOARDING_BTN_SKIP), llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings.Builder.Key.ONBOARDING_BTN_BACK), llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings.Builder.Key.ONBOARDING_BTN_NEXT), llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings.Builder.Key.ONBOARDING_BTN_DONE), this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings.Builder.Key.MANUAL_ENTRY), llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings.Builder.Key.GLARE_MESSAGE));
        }

        @Override // com.microblink.blinkid.fragment.overlay.OverlayStringsBuilder
        public final java.lang.Object llIIlIlIIl() {
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.options.BlinkCardReticleOverlayStringsOptions
        public com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings.Builder setBackSideInstructions(java.lang.String str) {
            return (com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings.Builder) llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings.Builder.Key.BACK_SIDE_INSTRUCTIONS, str);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.options.BlinkCardReticleOverlayStringsOptions
        public com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings.Builder setErrorCardNotFullyVisible(java.lang.String str) {
            return (com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings.Builder) llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings.Builder.Key.ERROR_CARD_NOT_FULLY_VISIBLE, str);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.options.BlinkCardReticleOverlayStringsOptions
        public com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings.Builder setErrorCardTooCloseToEdge(java.lang.String str) {
            return (com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings.Builder) llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings.Builder.Key.ERROR_CARD_TOO_CLOSE_TO_EDGE, str);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.options.BlinkCardReticleOverlayStringsOptions
        public com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings.Builder setErrorMoveCloser(java.lang.String str) {
            return (com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings.Builder) llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings.Builder.Key.ERROR_MOVE_CLOSER, str);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.options.BlinkCardReticleOverlayStringsOptions
        public com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings.Builder setErrorMoveFarther(java.lang.String str) {
            return (com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings.Builder) llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings.Builder.Key.ERROR_MOVE_FARTHER, str);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.options.BlinkCardReticleOverlayStringsOptions
        public com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings.Builder setFlashlightWarningMessage(java.lang.String str) {
            return (com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings.Builder) llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings.Builder.Key.FLASHLIGHT_WARNING_MESSAGE, str);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.options.BlinkCardReticleOverlayStringsOptions
        public com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings.Builder setFlipCardInstructions(java.lang.String str) {
            return (com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings.Builder) llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings.Builder.Key.FLIP_CARD_INSTRUCTIONS, str);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.options.BlinkCardReticleOverlayStringsOptions
        public com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings.Builder setFrontSideInstructionsText(java.lang.String str) {
            return (com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings.Builder) llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings.Builder.Key.FRONT_SIDE_INSTRUCTIONS, str);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.options.BlinkCardReticleOverlayStringsOptions
        public com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings.Builder setGlareMessage(java.lang.String str) {
            return (com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings.Builder) llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings.Builder.Key.GLARE_MESSAGE, str);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.options.BlinkCardReticleOverlayStringsOptions
        public com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings.Builder setHelpTooltip(java.lang.String str) {
            return (com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings.Builder) llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings.Builder.Key.HELP_TOOLTIP, str);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.options.BlinkCardReticleOverlayStringsOptions
        public com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings.Builder setIntroductionDialogDoneButtonText(java.lang.String str) {
            return (com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings.Builder) llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings.Builder.Key.DIALOG_INTRODUCTION_DONE_BUTTON, str);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.options.BlinkCardReticleOverlayStringsOptions
        public com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings.Builder setIntroductionDialogMessage(java.lang.String str) {
            return (com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings.Builder) llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings.Builder.Key.DIALOG_INTRODUCTION_MESSAGE, str);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.options.BlinkCardReticleOverlayStringsOptions
        public com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings.Builder setIntroductionDialogTitle(java.lang.String str) {
            return (com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings.Builder) llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings.Builder.Key.DIALOG_INTRODUCTION_TITLE, str);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.options.BlinkCardReticleOverlayStringsOptions
        public com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings.Builder setManualEntry(java.lang.String str) {
            return (com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings.Builder) llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings.Builder.Key.MANUAL_ENTRY, str);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.options.BlinkCardReticleOverlayStringsOptions
        public com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings.Builder setOnboardingBackButtonText(java.lang.String str) {
            return (com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings.Builder) llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings.Builder.Key.ONBOARDING_BTN_BACK, str);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.options.BlinkCardReticleOverlayStringsOptions
        public com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings.Builder setOnboardingDoneButtonText(java.lang.String str) {
            return (com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings.Builder) llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings.Builder.Key.ONBOARDING_BTN_DONE, str);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.options.BlinkCardReticleOverlayStringsOptions
        public com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings.Builder setOnboardingMessages(java.lang.String[] strArr) {
            this.getHighSpeedVideoSizes = strArr;
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.options.BlinkCardReticleOverlayStringsOptions
        public com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings.Builder setOnboardingNextButtonText(java.lang.String str) {
            return (com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings.Builder) llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings.Builder.Key.ONBOARDING_BTN_NEXT, str);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.options.BlinkCardReticleOverlayStringsOptions
        public com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings.Builder setOnboardingSkipButtonText(java.lang.String str) {
            return (com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings.Builder) llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings.Builder.Key.ONBOARDING_BTN_SKIP, str);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.options.BlinkCardReticleOverlayStringsOptions
        public com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings.Builder setOnboardingTitles(java.lang.String[] strArr) {
            this.getHighResolutionOutputSizeshNQ4ISI = strArr;
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.options.BlinkCardReticleOverlayStringsOptions
        public com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings.Builder setRecognitionTimeoutMessage(java.lang.String str) {
            return (com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings.Builder) llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings.Builder.Key.RECOGNITION_TIMEOUT_MESSAGE, str);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.options.BlinkCardReticleOverlayStringsOptions
        public com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings.Builder setRecognitionTimeoutTitle(java.lang.String str) {
            return (com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings.Builder) llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings.Builder.Key.RECOGNITION_TIMEOUT_TITLE, str);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.options.BlinkCardReticleOverlayStringsOptions
        public com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings.Builder setRetryButtonText(java.lang.String str) {
            return (com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings.Builder) llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings.Builder.Key.RETRY_BUTTON, str);
        }
    }

    BlinkCardReticleOverlayStrings(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, java.lang.String str11, java.lang.String str12, java.lang.String str13, java.lang.String str14, java.lang.String str15, java.lang.String str16, java.lang.String str17, java.lang.String str18, java.lang.String str19, java.lang.String[] strArr, java.lang.String[] strArr2, java.lang.String str20, java.lang.String str21) {
        this.recognitionTimeoutTitle = str;
        this.recognitionTimeoutMessage = str2;
        this.retryButton = str3;
        this.frontSideInstructions = str4;
        this.flipCardInstructions = str5;
        this.backSideInstructions = str6;
        this.errorMoveCloser = str7;
        this.errorMoveFarther = str8;
        this.errorCardTooCloseToEdge = str9;
        this.errorCardNotFullyVisible = str10;
        this.flashlightWarning = str11;
        this.introductionDialogTitle = str12;
        this.introductionDialogMessage = str13;
        this.introductionDoneButton = str14;
        this.helpTooltip = str15;
        this.onboardingSkipButtonText = str16;
        this.onboardingBackButtonText = str17;
        this.onboardingNextButtonText = str18;
        this.onboardingDoneButtonText = str19;
        this.onboardingTitles = strArr;
        this.onboardingMessages = strArr2;
        this.manualEntry = str20;
        this.glareMessage = str21;
    }

    static com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings getHighSpeedVideoFpsRangesFor(android.app.Activity activity) {
        return new com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings.Builder(activity).build();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.retryButton);
        parcel.writeString(this.frontSideInstructions);
        parcel.writeString(this.flipCardInstructions);
        parcel.writeString(this.backSideInstructions);
        parcel.writeString(this.errorMoveCloser);
        parcel.writeString(this.errorMoveFarther);
        parcel.writeString(this.errorCardTooCloseToEdge);
        parcel.writeString(this.recognitionTimeoutTitle);
        parcel.writeString(this.recognitionTimeoutMessage);
        parcel.writeString(this.flashlightWarning);
        parcel.writeString(this.errorCardNotFullyVisible);
        parcel.writeString(this.introductionDialogTitle);
        parcel.writeString(this.introductionDialogMessage);
        parcel.writeString(this.introductionDoneButton);
        parcel.writeString(this.helpTooltip);
        parcel.writeString(this.onboardingSkipButtonText);
        parcel.writeString(this.onboardingBackButtonText);
        parcel.writeString(this.onboardingNextButtonText);
        parcel.writeString(this.onboardingDoneButtonText);
        parcel.writeInt(this.onboardingTitles.length);
        parcel.writeStringArray(this.onboardingTitles);
        parcel.writeInt(this.onboardingMessages.length);
        parcel.writeStringArray(this.onboardingMessages);
        parcel.writeString(this.manualEntry);
        parcel.writeString(this.glareMessage);
    }

    BlinkCardReticleOverlayStrings(android.os.Parcel parcel) {
        this.retryButton = parcel.readString();
        this.frontSideInstructions = parcel.readString();
        this.flipCardInstructions = parcel.readString();
        this.backSideInstructions = parcel.readString();
        this.errorMoveCloser = parcel.readString();
        this.errorMoveFarther = parcel.readString();
        this.errorCardTooCloseToEdge = parcel.readString();
        this.recognitionTimeoutTitle = parcel.readString();
        this.recognitionTimeoutMessage = parcel.readString();
        this.flashlightWarning = parcel.readString();
        this.errorCardNotFullyVisible = parcel.readString();
        this.introductionDialogTitle = parcel.readString();
        this.introductionDialogMessage = parcel.readString();
        this.introductionDoneButton = parcel.readString();
        this.helpTooltip = parcel.readString();
        this.onboardingSkipButtonText = parcel.readString();
        this.onboardingBackButtonText = parcel.readString();
        this.onboardingNextButtonText = parcel.readString();
        this.onboardingDoneButtonText = parcel.readString();
        java.lang.String[] strArr = new java.lang.String[parcel.readInt()];
        this.onboardingTitles = strArr;
        parcel.readStringArray(strArr);
        java.lang.String[] strArr2 = new java.lang.String[parcel.readInt()];
        this.onboardingMessages = strArr2;
        parcel.readStringArray(strArr2);
        this.manualEntry = parcel.readString();
        this.glareMessage = parcel.readString();
    }
}
