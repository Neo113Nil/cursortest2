package com.microblink.blinkid.fragment.overlay.blinkid.reticleui;

/* loaded from: classes10.dex */
public class ReticleOverlayStrings implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings> CREATOR = new android.os.Parcelable.Creator<com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings>() { // from class: com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.1
        @Override // android.os.Parcelable.Creator
        public /* synthetic */ com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings createFromParcel(android.os.Parcel parcel) {
            return new com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings[] newArray(int i) {
            return new com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings[i];
        }
    };
    public final java.lang.String backSideBarcodeInstructions;
    public final java.lang.String backSideInstructions;
    public final java.lang.String dataMismatchMessage;
    public final java.lang.String dataMismatchTitle;
    public final java.lang.String errorBlurDetected;
    public final java.lang.String errorDocumentNotFullyVisible;
    public final java.lang.String errorDocumentTooCloseToEdge;
    public final java.lang.String errorFacePhotoNotFullyVisible;
    public final java.lang.String errorGlareDetected;
    public final java.lang.String errorMoveCloser;
    public final java.lang.String errorMoveFarther;
    public final java.lang.String errorScanningWrongPageLeft;
    public final java.lang.String errorScanningWrongPageRight;
    public final java.lang.String errorScanningWrongPageTop;
    public final java.lang.String errorScanningWrongSide;
    public final java.lang.String firstSideInstructions;
    public final java.lang.String flashlightWarning;
    public final java.lang.String flipInstructions;
    public final java.lang.String helpTooltip;
    public final java.lang.String introductionDialogMessage;
    public final java.lang.String introductionDialogTitle;
    public final java.lang.String introductionDoneButton;
    public final java.lang.String leftPageInstructions;
    public final java.lang.String onboardingBackButtonText;
    public final java.lang.String onboardingDoneButtonText;
    public final java.lang.String[] onboardingMessages;
    public final java.lang.String onboardingNextButtonText;
    public final java.lang.String onboardingSkipButtonText;
    public final java.lang.String[] onboardingTitles;
    public final java.lang.String recognitionTimeoutMessage;
    public final java.lang.String recognitionTimeoutTitle;
    public final java.lang.String retryButton;
    public final java.lang.String rightPageInstructions;
    public final java.lang.String sidesNotMatchingMessage;
    public final java.lang.String sidesNotMatchingTitle;
    public final java.lang.String topPageInstructions;
    public final java.lang.String turnLeftPageInstructions;
    public final java.lang.String turnRightPageInstructions;
    public final java.lang.String turnTopPageInstructions;
    public final java.lang.String unsupportedDocumentMessage;
    public final java.lang.String unsupportedDocumentTitle;

    public static class Builder extends com.microblink.blinkid.fragment.overlay.OverlayStringsBuilder<com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder, com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder.Key> implements com.microblink.blinkid.fragment.overlay.blinkid.reticleui.strings.options.ReticleOverlayStringsOptions<com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder> {
        private java.lang.String[] Camera2StreamConfigurationMap;
        private java.lang.String[] getHighSpeedVideoFpsRangesFor;

        public enum Key {
            NOT_MATCHING_SIDES_TITLE,
            NOT_MATCHING_SIDES_MESSAGE,
            DATA_MISMATCH_TITLE,
            DATA_MISMATCH_MESSAGE,
            UNSUPPORTED_DOC_TITLE,
            UNSUPPORTED_DOC_MESSAGE,
            RECOGNITION_TIMEOUT_TITLE,
            RECOGNITION_TIMEOUT_MESSAGE,
            RETRY_BUTTON,
            FIRST_SIDE_INSTRUCTIONS,
            FLIP_INSTRUCTIONS,
            TURN_TOP_PAGE_INSTRUCTIONS,
            TURN_LEFT_PAGE_INSTRUCTIONS,
            TURN_RIGHT_PAGE_INSTRUCTIONS,
            BACK_SIDE_INSTRUCTIONS,
            TOP_PAGE_INSTRUCTIONS,
            LEFT_PAGE_INSTRUCTIONS,
            RIGHT_PAGE_INSTRUCTIONS,
            BACK_SIDE_BARCODE_INSTRUCTIONS,
            ERROR_MOVE_CLOSER,
            ERROR_MOVE_FARTHER,
            ERROR_DOCUMENT_TOO_CLOSE_TO_EDGE,
            ERROR_DOCUMENT_NOT_FULLY_VISIBLE,
            ERROR_BLUR_DETECTED,
            ERROR_GLARE_DETECTED,
            ERROR_SCANNING_WRONG_SIDE,
            ERROR_SCANNING_WRONG_PAGE_TOP,
            ERROR_SCANNING_WRONG_PAGE_LEFT,
            ERROR_SCANNING_WRONG_PAGE_RIGHT,
            ERROR_FACE_PHOTO_NOT_FULLY_VISIBLE,
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
            ONBOARDING_MESSAGES
        }

        public Builder(android.content.Context context) {
            super(context);
            llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder.Key.NOT_MATCHING_SIDES_TITLE, llIIlIlIIl(com.microblink.blinkid.library.R.string.mb_data_not_match_title));
            llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder.Key.NOT_MATCHING_SIDES_MESSAGE, llIIlIlIIl(com.microblink.blinkid.library.R.string.mb_data_not_match_msg));
            llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder.Key.DATA_MISMATCH_TITLE, llIIlIlIIl(com.microblink.blinkid.library.R.string.mb_something_went_wrong));
            llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder.Key.DATA_MISMATCH_MESSAGE, llIIlIlIIl(com.microblink.blinkid.library.R.string.mb_try_scanning_again));
            llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder.Key.RETRY_BUTTON, llIIlIlIIl(com.microblink.blinkid.library.R.string.mb_data_not_match_retry_button));
            llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder.Key.FIRST_SIDE_INSTRUCTIONS, llIIlIlIIl(com.microblink.blinkid.library.R.string.mb_blinkid_front_instructions));
            llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder.Key.FLIP_INSTRUCTIONS, llIIlIlIIl(com.microblink.blinkid.library.R.string.mb_blinkid_camera_flip_document));
            llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder.Key.TURN_TOP_PAGE_INSTRUCTIONS, llIIlIlIIl(com.microblink.blinkid.library.R.string.mb_blinkid_instructions_turn_page_top));
            llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder.Key.TURN_LEFT_PAGE_INSTRUCTIONS, llIIlIlIIl(com.microblink.blinkid.library.R.string.mb_blinkid_instructions_turn_page_left));
            llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder.Key.TURN_RIGHT_PAGE_INSTRUCTIONS, llIIlIlIIl(com.microblink.blinkid.library.R.string.mb_blinkid_instructions_turn_page_right));
            llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder.Key.BACK_SIDE_INSTRUCTIONS, llIIlIlIIl(com.microblink.blinkid.library.R.string.mb_blinkid_back_instructions));
            llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder.Key.TOP_PAGE_INSTRUCTIONS, llIIlIlIIl(com.microblink.blinkid.library.R.string.mb_blinkid_top_page_instructions));
            llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder.Key.LEFT_PAGE_INSTRUCTIONS, llIIlIlIIl(com.microblink.blinkid.library.R.string.mb_blinkid_left_page_instructions));
            llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder.Key.RIGHT_PAGE_INSTRUCTIONS, llIIlIlIIl(com.microblink.blinkid.library.R.string.mb_blinkid_right_page_instructions));
            llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder.Key.BACK_SIDE_BARCODE_INSTRUCTIONS, llIIlIlIIl(com.microblink.blinkid.library.R.string.mb_blinkid_back_instructions_barcode));
            llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder.Key.ERROR_MOVE_CLOSER, llIIlIlIIl(com.microblink.blinkid.library.R.string.mb_error_camera_high));
            llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder.Key.ERROR_MOVE_FARTHER, llIIlIlIIl(com.microblink.blinkid.library.R.string.mb_error_camera_near));
            llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder.Key.ERROR_DOCUMENT_TOO_CLOSE_TO_EDGE, llIIlIlIIl(com.microblink.blinkid.library.R.string.mb_blinkid_document_too_close_to_edge));
            llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder.Key.ERROR_DOCUMENT_NOT_FULLY_VISIBLE, llIIlIlIIl(com.microblink.blinkid.library.R.string.mb_blinkid_document_not_fully_visible));
            llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder.Key.ERROR_BLUR_DETECTED, llIIlIlIIl(com.microblink.blinkid.library.R.string.mb_blinkid_blur_detected));
            llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder.Key.ERROR_GLARE_DETECTED, llIIlIlIIl(com.microblink.blinkid.library.R.string.mb_blinkid_glare_detected));
            llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder.Key.ERROR_SCANNING_WRONG_SIDE, llIIlIlIIl(com.microblink.blinkid.library.R.string.mb_blinkid_scanning_wrong_side));
            llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder.Key.ERROR_SCANNING_WRONG_PAGE_TOP, llIIlIlIIl(com.microblink.blinkid.library.R.string.mb_blinkid_scanning_wrong_page_top));
            llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder.Key.ERROR_SCANNING_WRONG_PAGE_LEFT, llIIlIlIIl(com.microblink.blinkid.library.R.string.mb_blinkid_scanning_wrong_page_left));
            llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder.Key.ERROR_SCANNING_WRONG_PAGE_RIGHT, llIIlIlIIl(com.microblink.blinkid.library.R.string.mb_blinkid_scanning_wrong_page_right));
            llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder.Key.ERROR_FACE_PHOTO_NOT_FULLY_VISIBLE, llIIlIlIIl(com.microblink.blinkid.library.R.string.mb_blinkid_face_photo_not_fully_visible));
            llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder.Key.UNSUPPORTED_DOC_TITLE, llIIlIlIIl(com.microblink.blinkid.library.R.string.mb_unsupported_document_title));
            llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder.Key.UNSUPPORTED_DOC_MESSAGE, llIIlIlIIl(com.microblink.blinkid.library.R.string.mb_unsupported_document_message));
            llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder.Key.RECOGNITION_TIMEOUT_TITLE, llIIlIlIIl(com.microblink.blinkid.library.R.string.mb_recognition_timeout_dialog_title));
            llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder.Key.RECOGNITION_TIMEOUT_MESSAGE, llIIlIlIIl(com.microblink.blinkid.library.R.string.mb_recognition_timeout_dialog_message));
            llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder.Key.FLASHLIGHT_WARNING_MESSAGE, llIIlIlIIl(com.microblink.blinkid.library.R.string.mb_flashlight_warning_message));
            llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder.Key.HELP_TOOLTIP, llIIlIlIIl(com.microblink.blinkid.library.R.string.mb_onboarding_tooltip));
            llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder.Key.DIALOG_INTRODUCTION_TITLE, llIIlIlIIl(com.microblink.blinkid.library.R.string.mb_blinkid_introduction_dialog_title));
            llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder.Key.DIALOG_INTRODUCTION_MESSAGE, llIIlIlIIl(com.microblink.blinkid.library.R.string.mb_blinkid_introduction_dialog_message));
            llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder.Key.DIALOG_INTRODUCTION_DONE_BUTTON, llIIlIlIIl(com.microblink.blinkid.library.R.string.mb_btn_done));
            llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder.Key.ONBOARDING_BTN_SKIP, llIIlIlIIl(com.microblink.blinkid.library.R.string.mb_btn_skip));
            llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder.Key.ONBOARDING_BTN_NEXT, llIIlIlIIl(com.microblink.blinkid.library.R.string.mb_btn_next));
            llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder.Key.ONBOARDING_BTN_BACK, llIIlIlIIl(com.microblink.blinkid.library.R.string.mb_btn_back));
            llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder.Key.ONBOARDING_BTN_DONE, llIIlIlIIl(com.microblink.blinkid.library.R.string.mb_btn_done));
            this.getHighSpeedVideoFpsRangesFor = new java.lang.String[]{llIIlIlIIl(com.microblink.blinkid.library.R.string.mb_blinkid_onboarding_title1), llIIlIlIIl(com.microblink.blinkid.library.R.string.mb_blinkid_onboarding_title2), llIIlIlIIl(com.microblink.blinkid.library.R.string.mb_blinkid_onboarding_title3)};
            this.Camera2StreamConfigurationMap = new java.lang.String[]{llIIlIlIIl(com.microblink.blinkid.library.R.string.mb_blinkid_onboarding_msg1), llIIlIlIIl(com.microblink.blinkid.library.R.string.mb_blinkid_onboarding_msg2), llIIlIlIIl(com.microblink.blinkid.library.R.string.mb_blinkid_onboarding_msg3)};
        }

        public com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings build() {
            return new com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings(llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder.Key.NOT_MATCHING_SIDES_TITLE), llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder.Key.NOT_MATCHING_SIDES_MESSAGE), llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder.Key.DATA_MISMATCH_TITLE), llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder.Key.DATA_MISMATCH_MESSAGE), llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder.Key.UNSUPPORTED_DOC_TITLE), llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder.Key.UNSUPPORTED_DOC_MESSAGE), llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder.Key.RECOGNITION_TIMEOUT_TITLE), llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder.Key.RECOGNITION_TIMEOUT_MESSAGE), llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder.Key.RETRY_BUTTON), llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder.Key.FIRST_SIDE_INSTRUCTIONS), llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder.Key.FLIP_INSTRUCTIONS), llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder.Key.TURN_TOP_PAGE_INSTRUCTIONS), llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder.Key.TURN_LEFT_PAGE_INSTRUCTIONS), llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder.Key.TURN_RIGHT_PAGE_INSTRUCTIONS), llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder.Key.BACK_SIDE_INSTRUCTIONS), llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder.Key.TOP_PAGE_INSTRUCTIONS), llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder.Key.LEFT_PAGE_INSTRUCTIONS), llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder.Key.RIGHT_PAGE_INSTRUCTIONS), llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder.Key.BACK_SIDE_BARCODE_INSTRUCTIONS), llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder.Key.ERROR_MOVE_CLOSER), llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder.Key.ERROR_MOVE_FARTHER), llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder.Key.ERROR_DOCUMENT_TOO_CLOSE_TO_EDGE), llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder.Key.ERROR_DOCUMENT_NOT_FULLY_VISIBLE), llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder.Key.ERROR_BLUR_DETECTED), llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder.Key.ERROR_GLARE_DETECTED), llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder.Key.ERROR_SCANNING_WRONG_SIDE), llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder.Key.ERROR_SCANNING_WRONG_PAGE_TOP), llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder.Key.ERROR_SCANNING_WRONG_PAGE_LEFT), llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder.Key.ERROR_SCANNING_WRONG_PAGE_RIGHT), llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder.Key.ERROR_FACE_PHOTO_NOT_FULLY_VISIBLE), llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder.Key.FLASHLIGHT_WARNING_MESSAGE), llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder.Key.DIALOG_INTRODUCTION_TITLE), llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder.Key.DIALOG_INTRODUCTION_MESSAGE), llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder.Key.DIALOG_INTRODUCTION_DONE_BUTTON), llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder.Key.HELP_TOOLTIP), llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder.Key.ONBOARDING_BTN_SKIP), llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder.Key.ONBOARDING_BTN_BACK), llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder.Key.ONBOARDING_BTN_NEXT), llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder.Key.ONBOARDING_BTN_DONE), this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap);
        }

        @Override // com.microblink.blinkid.fragment.overlay.OverlayStringsBuilder
        public final java.lang.Object llIIlIlIIl() {
            return this;
        }

        public com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder setDataMismatchMessage(java.lang.String str) {
            return (com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder) llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder.Key.DATA_MISMATCH_MESSAGE, str);
        }

        public com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder setDataMismatchTitle(java.lang.String str) {
            return (com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder) llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder.Key.DATA_MISMATCH_TITLE, str);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.microblink.blinkid.fragment.overlay.blinkid.reticleui.strings.options.ReticleOverlayStringsOptions
        public com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder setBackSideBarcodeInstructions(java.lang.String str) {
            return (com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder) llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder.Key.BACK_SIDE_BARCODE_INSTRUCTIONS, str);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.microblink.blinkid.fragment.overlay.blinkid.reticleui.strings.options.ReticleOverlayStringsOptions
        public com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder setBackSideInstructions(java.lang.String str) {
            return (com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder) llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder.Key.BACK_SIDE_INSTRUCTIONS, str);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.microblink.blinkid.fragment.overlay.blinkid.reticleui.strings.options.ReticleOverlayStringsOptions
        public com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder setErrorBlurDetected(java.lang.String str) {
            return (com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder) llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder.Key.ERROR_BLUR_DETECTED, str);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.microblink.blinkid.fragment.overlay.blinkid.reticleui.strings.options.ReticleOverlayStringsOptions
        public com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder setErrorDocumentNotFullyVisible(java.lang.String str) {
            return (com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder) llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder.Key.ERROR_DOCUMENT_NOT_FULLY_VISIBLE, str);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.microblink.blinkid.fragment.overlay.blinkid.reticleui.strings.options.ReticleOverlayStringsOptions
        public com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder setErrorDocumentTooCloseToEdge(java.lang.String str) {
            return (com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder) llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder.Key.ERROR_DOCUMENT_TOO_CLOSE_TO_EDGE, str);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.microblink.blinkid.fragment.overlay.blinkid.reticleui.strings.options.ReticleOverlayStringsOptions
        public com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder setErrorFacePhotoNotFullyVisible(java.lang.String str) {
            return (com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder) llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder.Key.ERROR_FACE_PHOTO_NOT_FULLY_VISIBLE, str);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.microblink.blinkid.fragment.overlay.blinkid.reticleui.strings.options.ReticleOverlayStringsOptions
        public com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder setErrorGlareDetected(java.lang.String str) {
            return (com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder) llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder.Key.ERROR_GLARE_DETECTED, str);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.microblink.blinkid.fragment.overlay.blinkid.reticleui.strings.options.ReticleOverlayStringsOptions
        public com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder setErrorMoveCloser(java.lang.String str) {
            return (com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder) llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder.Key.ERROR_MOVE_CLOSER, str);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.microblink.blinkid.fragment.overlay.blinkid.reticleui.strings.options.ReticleOverlayStringsOptions
        public com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder setErrorMoveFarther(java.lang.String str) {
            return (com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder) llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder.Key.ERROR_MOVE_FARTHER, str);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.microblink.blinkid.fragment.overlay.blinkid.reticleui.strings.options.ReticleOverlayStringsOptions
        public com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder setErrorScanningWrongPageLeft(java.lang.String str) {
            return (com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder) llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder.Key.ERROR_SCANNING_WRONG_PAGE_LEFT, str);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.microblink.blinkid.fragment.overlay.blinkid.reticleui.strings.options.ReticleOverlayStringsOptions
        public com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder setErrorScanningWrongPageRight(java.lang.String str) {
            return (com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder) llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder.Key.ERROR_SCANNING_WRONG_PAGE_RIGHT, str);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.microblink.blinkid.fragment.overlay.blinkid.reticleui.strings.options.ReticleOverlayStringsOptions
        public com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder setErrorScanningWrongPageTop(java.lang.String str) {
            return (com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder) llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder.Key.ERROR_SCANNING_WRONG_PAGE_TOP, str);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.microblink.blinkid.fragment.overlay.blinkid.reticleui.strings.options.ReticleOverlayStringsOptions
        public com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder setErrorScanningWrongSide(java.lang.String str) {
            return (com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder) llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder.Key.ERROR_SCANNING_WRONG_SIDE, str);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.microblink.blinkid.fragment.overlay.blinkid.reticleui.strings.options.ReticleOverlayStringsOptions
        public com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder setFirstSideInstructionsText(java.lang.String str) {
            return (com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder) llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder.Key.FIRST_SIDE_INSTRUCTIONS, str);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.microblink.blinkid.fragment.overlay.blinkid.reticleui.strings.options.ReticleOverlayStringsOptions
        public com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder setFlashlightWarningMessage(java.lang.String str) {
            return (com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder) llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder.Key.FLASHLIGHT_WARNING_MESSAGE, str);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.microblink.blinkid.fragment.overlay.blinkid.reticleui.strings.options.ReticleOverlayStringsOptions
        public com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder setFlipInstructions(java.lang.String str) {
            return (com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder) llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder.Key.FLIP_INSTRUCTIONS, str);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.microblink.blinkid.fragment.overlay.blinkid.reticleui.strings.options.ReticleOverlayStringsOptions
        public com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder setHelpTooltip(java.lang.String str) {
            return (com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder) llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder.Key.HELP_TOOLTIP, str);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.microblink.blinkid.fragment.overlay.blinkid.reticleui.strings.options.ReticleOverlayStringsOptions
        public com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder setIntroductionDialogDoneButtonText(java.lang.String str) {
            return (com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder) llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder.Key.DIALOG_INTRODUCTION_DONE_BUTTON, str);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.microblink.blinkid.fragment.overlay.blinkid.reticleui.strings.options.ReticleOverlayStringsOptions
        public com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder setIntroductionDialogMessage(java.lang.String str) {
            return (com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder) llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder.Key.DIALOG_INTRODUCTION_MESSAGE, str);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.microblink.blinkid.fragment.overlay.blinkid.reticleui.strings.options.ReticleOverlayStringsOptions
        public com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder setIntroductionDialogTitle(java.lang.String str) {
            return (com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder) llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder.Key.DIALOG_INTRODUCTION_TITLE, str);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.microblink.blinkid.fragment.overlay.blinkid.reticleui.strings.options.ReticleOverlayStringsOptions
        public com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder setLeftPageInstructions(java.lang.String str) {
            return (com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder) llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder.Key.LEFT_PAGE_INSTRUCTIONS, str);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.microblink.blinkid.fragment.overlay.blinkid.reticleui.strings.options.ReticleOverlayStringsOptions
        public com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder setOnboardingBackButtonText(java.lang.String str) {
            return (com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder) llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder.Key.ONBOARDING_BTN_BACK, str);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.microblink.blinkid.fragment.overlay.blinkid.reticleui.strings.options.ReticleOverlayStringsOptions
        public com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder setOnboardingDoneButtonText(java.lang.String str) {
            return (com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder) llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder.Key.ONBOARDING_BTN_DONE, str);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.microblink.blinkid.fragment.overlay.blinkid.reticleui.strings.options.ReticleOverlayStringsOptions
        public com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder setOnboardingMessages(java.lang.String[] strArr) {
            this.Camera2StreamConfigurationMap = strArr;
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.microblink.blinkid.fragment.overlay.blinkid.reticleui.strings.options.ReticleOverlayStringsOptions
        public com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder setOnboardingNextButtonText(java.lang.String str) {
            return (com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder) llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder.Key.ONBOARDING_BTN_NEXT, str);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.microblink.blinkid.fragment.overlay.blinkid.reticleui.strings.options.ReticleOverlayStringsOptions
        public com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder setOnboardingSkipButtonText(java.lang.String str) {
            return (com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder) llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder.Key.ONBOARDING_BTN_SKIP, str);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.microblink.blinkid.fragment.overlay.blinkid.reticleui.strings.options.ReticleOverlayStringsOptions
        public com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder setOnboardingTitles(java.lang.String[] strArr) {
            this.getHighSpeedVideoFpsRangesFor = strArr;
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.microblink.blinkid.fragment.overlay.blinkid.reticleui.strings.options.ReticleOverlayStringsOptions
        public com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder setRecognitionTimeoutMessage(java.lang.String str) {
            return (com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder) llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder.Key.RECOGNITION_TIMEOUT_MESSAGE, str);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.microblink.blinkid.fragment.overlay.blinkid.reticleui.strings.options.ReticleOverlayStringsOptions
        public com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder setRecognitionTimeoutTitle(java.lang.String str) {
            return (com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder) llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder.Key.RECOGNITION_TIMEOUT_TITLE, str);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.microblink.blinkid.fragment.overlay.blinkid.reticleui.strings.options.ReticleOverlayStringsOptions
        public com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder setRetryButtonText(java.lang.String str) {
            return (com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder) llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder.Key.RETRY_BUTTON, str);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.microblink.blinkid.fragment.overlay.blinkid.reticleui.strings.options.ReticleOverlayStringsOptions
        public com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder setRightPageInstructions(java.lang.String str) {
            return (com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder) llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder.Key.RIGHT_PAGE_INSTRUCTIONS, str);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.microblink.blinkid.fragment.overlay.blinkid.reticleui.strings.options.ReticleOverlayStringsOptions
        public com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder setSidesNotMatchingMessage(java.lang.String str) {
            return (com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder) llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder.Key.NOT_MATCHING_SIDES_MESSAGE, str);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.microblink.blinkid.fragment.overlay.blinkid.reticleui.strings.options.ReticleOverlayStringsOptions
        public com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder setSidesNotMatchingTitle(java.lang.String str) {
            return (com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder) llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder.Key.NOT_MATCHING_SIDES_TITLE, str);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.microblink.blinkid.fragment.overlay.blinkid.reticleui.strings.options.ReticleOverlayStringsOptions
        public com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder setTopPageInstructions(java.lang.String str) {
            return (com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder) llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder.Key.TOP_PAGE_INSTRUCTIONS, str);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.microblink.blinkid.fragment.overlay.blinkid.reticleui.strings.options.ReticleOverlayStringsOptions
        public com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder setTurnLeftPageInstructions(java.lang.String str) {
            return (com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder) llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder.Key.TURN_LEFT_PAGE_INSTRUCTIONS, str);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.microblink.blinkid.fragment.overlay.blinkid.reticleui.strings.options.ReticleOverlayStringsOptions
        public com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder setTurnRightPageInstructions(java.lang.String str) {
            return (com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder) llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder.Key.TURN_RIGHT_PAGE_INSTRUCTIONS, str);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.microblink.blinkid.fragment.overlay.blinkid.reticleui.strings.options.ReticleOverlayStringsOptions
        public com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder setTurnTopPageInstructions(java.lang.String str) {
            return (com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder) llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder.Key.TURN_TOP_PAGE_INSTRUCTIONS, str);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.microblink.blinkid.fragment.overlay.blinkid.reticleui.strings.options.ReticleOverlayStringsOptions
        public com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder setUnsupportedDocumentMessage(java.lang.String str) {
            return (com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder) llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder.Key.UNSUPPORTED_DOC_MESSAGE, str);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.microblink.blinkid.fragment.overlay.blinkid.reticleui.strings.options.ReticleOverlayStringsOptions
        public com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder setUnsupportedDocumentTitle(java.lang.String str) {
            return (com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder) llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder.Key.UNSUPPORTED_DOC_TITLE, str);
        }
    }

    ReticleOverlayStrings(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, java.lang.String str11, java.lang.String str12, java.lang.String str13, java.lang.String str14, java.lang.String str15, java.lang.String str16, java.lang.String str17, java.lang.String str18, java.lang.String str19, java.lang.String str20, java.lang.String str21, java.lang.String str22, java.lang.String str23, java.lang.String str24, java.lang.String str25, java.lang.String str26, java.lang.String str27, java.lang.String str28, java.lang.String str29, java.lang.String str30, java.lang.String str31, java.lang.String str32, java.lang.String str33, java.lang.String str34, java.lang.String str35, java.lang.String str36, java.lang.String str37, java.lang.String str38, java.lang.String str39, java.lang.String[] strArr, java.lang.String[] strArr2) {
        this.sidesNotMatchingTitle = str;
        this.sidesNotMatchingMessage = str2;
        this.dataMismatchTitle = str3;
        this.dataMismatchMessage = str4;
        this.unsupportedDocumentTitle = str5;
        this.unsupportedDocumentMessage = str6;
        this.recognitionTimeoutTitle = str7;
        this.recognitionTimeoutMessage = str8;
        this.retryButton = str9;
        this.firstSideInstructions = str10;
        this.flipInstructions = str11;
        this.turnTopPageInstructions = str12;
        this.turnLeftPageInstructions = str13;
        this.turnRightPageInstructions = str14;
        this.backSideInstructions = str15;
        this.topPageInstructions = str16;
        this.leftPageInstructions = str17;
        this.rightPageInstructions = str18;
        this.backSideBarcodeInstructions = str19;
        this.errorMoveCloser = str20;
        this.errorMoveFarther = str21;
        this.errorDocumentTooCloseToEdge = str22;
        this.errorDocumentNotFullyVisible = str23;
        this.errorBlurDetected = str24;
        this.errorGlareDetected = str25;
        this.errorScanningWrongSide = str26;
        this.errorScanningWrongPageTop = str27;
        this.errorScanningWrongPageLeft = str28;
        this.errorScanningWrongPageRight = str29;
        this.errorFacePhotoNotFullyVisible = str30;
        this.flashlightWarning = str31;
        this.introductionDialogTitle = str32;
        this.introductionDialogMessage = str33;
        this.introductionDoneButton = str34;
        this.helpTooltip = str35;
        this.onboardingSkipButtonText = str36;
        this.onboardingBackButtonText = str37;
        this.onboardingNextButtonText = str38;
        this.onboardingDoneButtonText = str39;
        this.onboardingTitles = strArr;
        this.onboardingMessages = strArr2;
    }

    static com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings getHighSpeedVideoFpsRanges(android.app.Activity activity) {
        return new com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder(activity).build();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.sidesNotMatchingTitle);
        parcel.writeString(this.sidesNotMatchingMessage);
        parcel.writeString(this.dataMismatchTitle);
        parcel.writeString(this.dataMismatchMessage);
        parcel.writeString(this.retryButton);
        parcel.writeString(this.firstSideInstructions);
        parcel.writeString(this.flipInstructions);
        parcel.writeString(this.turnTopPageInstructions);
        parcel.writeString(this.turnLeftPageInstructions);
        parcel.writeString(this.turnRightPageInstructions);
        parcel.writeString(this.backSideInstructions);
        parcel.writeString(this.topPageInstructions);
        parcel.writeString(this.leftPageInstructions);
        parcel.writeString(this.rightPageInstructions);
        parcel.writeString(this.backSideBarcodeInstructions);
        parcel.writeString(this.errorMoveCloser);
        parcel.writeString(this.errorMoveFarther);
        parcel.writeString(this.errorDocumentTooCloseToEdge);
        parcel.writeString(this.unsupportedDocumentTitle);
        parcel.writeString(this.unsupportedDocumentMessage);
        parcel.writeString(this.recognitionTimeoutTitle);
        parcel.writeString(this.recognitionTimeoutMessage);
        parcel.writeString(this.flashlightWarning);
        parcel.writeString(this.errorDocumentNotFullyVisible);
        parcel.writeString(this.errorBlurDetected);
        parcel.writeString(this.errorGlareDetected);
        parcel.writeString(this.errorScanningWrongSide);
        parcel.writeString(this.errorScanningWrongPageTop);
        parcel.writeString(this.errorScanningWrongPageLeft);
        parcel.writeString(this.errorScanningWrongPageRight);
        parcel.writeString(this.errorFacePhotoNotFullyVisible);
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
    }

    ReticleOverlayStrings(android.os.Parcel parcel) {
        this.sidesNotMatchingTitle = parcel.readString();
        this.sidesNotMatchingMessage = parcel.readString();
        this.dataMismatchTitle = parcel.readString();
        this.dataMismatchMessage = parcel.readString();
        this.retryButton = parcel.readString();
        this.firstSideInstructions = parcel.readString();
        this.flipInstructions = parcel.readString();
        this.turnTopPageInstructions = parcel.readString();
        this.turnLeftPageInstructions = parcel.readString();
        this.turnRightPageInstructions = parcel.readString();
        this.backSideInstructions = parcel.readString();
        this.topPageInstructions = parcel.readString();
        this.leftPageInstructions = parcel.readString();
        this.rightPageInstructions = parcel.readString();
        this.backSideBarcodeInstructions = parcel.readString();
        this.errorMoveCloser = parcel.readString();
        this.errorMoveFarther = parcel.readString();
        this.errorDocumentTooCloseToEdge = parcel.readString();
        this.unsupportedDocumentTitle = parcel.readString();
        this.unsupportedDocumentMessage = parcel.readString();
        this.recognitionTimeoutTitle = parcel.readString();
        this.recognitionTimeoutMessage = parcel.readString();
        this.flashlightWarning = parcel.readString();
        this.errorDocumentNotFullyVisible = parcel.readString();
        this.errorBlurDetected = parcel.readString();
        this.errorGlareDetected = parcel.readString();
        this.errorScanningWrongSide = parcel.readString();
        this.errorScanningWrongPageTop = parcel.readString();
        this.errorScanningWrongPageLeft = parcel.readString();
        this.errorScanningWrongPageRight = parcel.readString();
        this.errorFacePhotoNotFullyVisible = parcel.readString();
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
    }
}
