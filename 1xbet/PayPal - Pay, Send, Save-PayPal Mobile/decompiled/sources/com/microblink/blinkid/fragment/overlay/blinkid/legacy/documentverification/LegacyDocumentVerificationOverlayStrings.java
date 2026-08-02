package com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification;

@java.lang.Deprecated
/* loaded from: classes10.dex */
public class LegacyDocumentVerificationOverlayStrings implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification.LegacyDocumentVerificationOverlayStrings> CREATOR = new android.os.Parcelable.Creator<com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification.LegacyDocumentVerificationOverlayStrings>() { // from class: com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification.LegacyDocumentVerificationOverlayStrings.1
        @Override // android.os.Parcelable.Creator
        public /* synthetic */ com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification.LegacyDocumentVerificationOverlayStrings createFromParcel(android.os.Parcel parcel) {
            return new com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification.LegacyDocumentVerificationOverlayStrings(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification.LegacyDocumentVerificationOverlayStrings[] newArray(int i) {
            return new com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification.LegacyDocumentVerificationOverlayStrings[i];
        }
    };
    final java.lang.String Camera2StreamConfigurationMap;
    final java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    final java.lang.String getHighSpeedVideoFpsRanges;
    final java.lang.String getHighSpeedVideoFpsRangesFor;
    final java.lang.String getHighSpeedVideoSizes;
    final java.lang.String getHighSpeedVideoSizesFor;
    final java.lang.String getInputFormats;
    final java.lang.String getInputSizeshNQ4ISI;
    final java.lang.String getOutputFormats;
    final java.lang.String getOutputMinFrameDuration;
    final java.lang.String getOutputMinFrameDurationlomOqCM;
    final java.lang.String getOutputSizes;
    final java.lang.String getOutputSizeshNQ4ISI;
    final java.lang.String getOutputStallDuration;

    public static class Builder extends com.microblink.blinkid.fragment.overlay.OverlayStringsBuilder<com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification.LegacyDocumentVerificationOverlayStrings.Builder, com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification.LegacyDocumentVerificationOverlayStrings.Builder.Key> {

        public enum Key {
            FRONT_SIDE_INSTRUCTIONS,
            BACK_SIDE_INSTRUCTIONS,
            FRONT_SIDE_SPLASH,
            BACK_SIDE_SPLASH,
            NOT_MATCHING_TITLE,
            NOT_MATCHING_MESSAGE,
            NOT_MATCHING_SIDES_TITLE,
            NOT_MATCHING_SIDES_MESSAGE,
            DATA_MISMATCH_TITLE,
            DATA_MISMATCH_MESSAGE,
            UNSUPPORTED_DOC_TITLE,
            UNSUPPORTED_DOC_MESSAGE,
            RECOGNITION_TIMEOUT_TITLE,
            RECOGNITION_TIMEOUT_MESSAGE,
            RETRY_BUTTON,
            GLARE_MESSAGE
        }

        public Builder(android.content.Context context) {
            super(context);
            llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification.LegacyDocumentVerificationOverlayStrings.Builder.Key.FRONT_SIDE_INSTRUCTIONS, llIIlIlIIl(com.microblink.blinkid.library.R.string.mb_tooltip_front_id));
            llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification.LegacyDocumentVerificationOverlayStrings.Builder.Key.BACK_SIDE_INSTRUCTIONS, llIIlIlIIl(com.microblink.blinkid.library.R.string.mb_tooltip_back_id));
            llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification.LegacyDocumentVerificationOverlayStrings.Builder.Key.FRONT_SIDE_SPLASH, llIIlIlIIl(com.microblink.blinkid.library.R.string.mb_splash_msg_id_front));
            llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification.LegacyDocumentVerificationOverlayStrings.Builder.Key.BACK_SIDE_SPLASH, llIIlIlIIl(com.microblink.blinkid.library.R.string.mb_splash_msg_id_back));
            llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification.LegacyDocumentVerificationOverlayStrings.Builder.Key.NOT_MATCHING_SIDES_TITLE, llIIlIlIIl(com.microblink.blinkid.library.R.string.mb_data_not_match_title));
            llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification.LegacyDocumentVerificationOverlayStrings.Builder.Key.NOT_MATCHING_SIDES_MESSAGE, llIIlIlIIl(com.microblink.blinkid.library.R.string.mb_data_not_match_msg));
            llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification.LegacyDocumentVerificationOverlayStrings.Builder.Key.DATA_MISMATCH_TITLE, llIIlIlIIl(com.microblink.blinkid.library.R.string.mb_something_went_wrong));
            llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification.LegacyDocumentVerificationOverlayStrings.Builder.Key.DATA_MISMATCH_MESSAGE, llIIlIlIIl(com.microblink.blinkid.library.R.string.mb_try_scanning_again));
            llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification.LegacyDocumentVerificationOverlayStrings.Builder.Key.UNSUPPORTED_DOC_TITLE, llIIlIlIIl(com.microblink.blinkid.library.R.string.mb_unsupported_document_title));
            llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification.LegacyDocumentVerificationOverlayStrings.Builder.Key.UNSUPPORTED_DOC_MESSAGE, llIIlIlIIl(com.microblink.blinkid.library.R.string.mb_unsupported_document_message));
            llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification.LegacyDocumentVerificationOverlayStrings.Builder.Key.RECOGNITION_TIMEOUT_TITLE, llIIlIlIIl(com.microblink.blinkid.library.R.string.mb_recognition_timeout_dialog_title));
            llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification.LegacyDocumentVerificationOverlayStrings.Builder.Key.RECOGNITION_TIMEOUT_MESSAGE, llIIlIlIIl(com.microblink.blinkid.library.R.string.mb_recognition_timeout_dialog_message));
            llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification.LegacyDocumentVerificationOverlayStrings.Builder.Key.RETRY_BUTTON, llIIlIlIIl(com.microblink.blinkid.library.R.string.mb_data_not_match_retry_button));
            llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification.LegacyDocumentVerificationOverlayStrings.Builder.Key.GLARE_MESSAGE, llIIlIlIIl(com.microblink.blinkid.library.R.string.mb_tooltip_glare));
        }

        public com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification.LegacyDocumentVerificationOverlayStrings build() {
            return new com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification.LegacyDocumentVerificationOverlayStrings(llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification.LegacyDocumentVerificationOverlayStrings.Builder.Key.FRONT_SIDE_INSTRUCTIONS), llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification.LegacyDocumentVerificationOverlayStrings.Builder.Key.BACK_SIDE_INSTRUCTIONS), llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification.LegacyDocumentVerificationOverlayStrings.Builder.Key.FRONT_SIDE_SPLASH), llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification.LegacyDocumentVerificationOverlayStrings.Builder.Key.BACK_SIDE_SPLASH), llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification.LegacyDocumentVerificationOverlayStrings.Builder.Key.NOT_MATCHING_SIDES_TITLE), llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification.LegacyDocumentVerificationOverlayStrings.Builder.Key.NOT_MATCHING_SIDES_MESSAGE), llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification.LegacyDocumentVerificationOverlayStrings.Builder.Key.DATA_MISMATCH_TITLE), llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification.LegacyDocumentVerificationOverlayStrings.Builder.Key.DATA_MISMATCH_MESSAGE), llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification.LegacyDocumentVerificationOverlayStrings.Builder.Key.UNSUPPORTED_DOC_TITLE), llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification.LegacyDocumentVerificationOverlayStrings.Builder.Key.UNSUPPORTED_DOC_MESSAGE), llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification.LegacyDocumentVerificationOverlayStrings.Builder.Key.RECOGNITION_TIMEOUT_TITLE), llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification.LegacyDocumentVerificationOverlayStrings.Builder.Key.RECOGNITION_TIMEOUT_MESSAGE), llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification.LegacyDocumentVerificationOverlayStrings.Builder.Key.RETRY_BUTTON), llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification.LegacyDocumentVerificationOverlayStrings.Builder.Key.GLARE_MESSAGE));
        }

        @Override // com.microblink.blinkid.fragment.overlay.OverlayStringsBuilder
        public final java.lang.Object llIIlIlIIl() {
            return this;
        }

        public com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification.LegacyDocumentVerificationOverlayStrings.Builder setBackSideInstructions(java.lang.String str) {
            return (com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification.LegacyDocumentVerificationOverlayStrings.Builder) llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification.LegacyDocumentVerificationOverlayStrings.Builder.Key.BACK_SIDE_INSTRUCTIONS, str);
        }

        public com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification.LegacyDocumentVerificationOverlayStrings.Builder setBackSideSplashText(java.lang.String str) {
            return (com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification.LegacyDocumentVerificationOverlayStrings.Builder) llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification.LegacyDocumentVerificationOverlayStrings.Builder.Key.BACK_SIDE_SPLASH, str);
        }

        public com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification.LegacyDocumentVerificationOverlayStrings.Builder setDataMismatchMessage(java.lang.String str) {
            return (com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification.LegacyDocumentVerificationOverlayStrings.Builder) llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification.LegacyDocumentVerificationOverlayStrings.Builder.Key.DATA_MISMATCH_MESSAGE, str);
        }

        public com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification.LegacyDocumentVerificationOverlayStrings.Builder setDataMismatchTitle(java.lang.String str) {
            return (com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification.LegacyDocumentVerificationOverlayStrings.Builder) llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification.LegacyDocumentVerificationOverlayStrings.Builder.Key.DATA_MISMATCH_TITLE, str);
        }

        public com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification.LegacyDocumentVerificationOverlayStrings.Builder setFrontSideInstructions(java.lang.String str) {
            return (com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification.LegacyDocumentVerificationOverlayStrings.Builder) llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification.LegacyDocumentVerificationOverlayStrings.Builder.Key.FRONT_SIDE_INSTRUCTIONS, str);
        }

        public com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification.LegacyDocumentVerificationOverlayStrings.Builder setFrontSideSplashText(java.lang.String str) {
            return (com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification.LegacyDocumentVerificationOverlayStrings.Builder) llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification.LegacyDocumentVerificationOverlayStrings.Builder.Key.FRONT_SIDE_SPLASH, str);
        }

        public com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification.LegacyDocumentVerificationOverlayStrings.Builder setGlareMessage(java.lang.String str) {
            return (com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification.LegacyDocumentVerificationOverlayStrings.Builder) llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification.LegacyDocumentVerificationOverlayStrings.Builder.Key.GLARE_MESSAGE, str);
        }

        public com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification.LegacyDocumentVerificationOverlayStrings.Builder setRecognitionTimeoutMessage(java.lang.String str) {
            return (com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification.LegacyDocumentVerificationOverlayStrings.Builder) llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification.LegacyDocumentVerificationOverlayStrings.Builder.Key.RECOGNITION_TIMEOUT_MESSAGE, str);
        }

        public com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification.LegacyDocumentVerificationOverlayStrings.Builder setRecognitionTimeoutTitle(java.lang.String str) {
            return (com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification.LegacyDocumentVerificationOverlayStrings.Builder) llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification.LegacyDocumentVerificationOverlayStrings.Builder.Key.RECOGNITION_TIMEOUT_TITLE, str);
        }

        public com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification.LegacyDocumentVerificationOverlayStrings.Builder setRetryButtonText(java.lang.String str) {
            return (com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification.LegacyDocumentVerificationOverlayStrings.Builder) llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification.LegacyDocumentVerificationOverlayStrings.Builder.Key.RETRY_BUTTON, str);
        }

        public com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification.LegacyDocumentVerificationOverlayStrings.Builder setSidesNotMatchingMessage(java.lang.String str) {
            return (com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification.LegacyDocumentVerificationOverlayStrings.Builder) llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification.LegacyDocumentVerificationOverlayStrings.Builder.Key.NOT_MATCHING_SIDES_MESSAGE, str);
        }

        public com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification.LegacyDocumentVerificationOverlayStrings.Builder setSidesNotMatchingTitle(java.lang.String str) {
            return (com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification.LegacyDocumentVerificationOverlayStrings.Builder) llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification.LegacyDocumentVerificationOverlayStrings.Builder.Key.NOT_MATCHING_SIDES_TITLE, str);
        }

        public com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification.LegacyDocumentVerificationOverlayStrings.Builder setUnsupportedDocumentMessage(java.lang.String str) {
            return (com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification.LegacyDocumentVerificationOverlayStrings.Builder) llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification.LegacyDocumentVerificationOverlayStrings.Builder.Key.UNSUPPORTED_DOC_MESSAGE, str);
        }

        public com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification.LegacyDocumentVerificationOverlayStrings.Builder setUnsupportedDocumentTitle(java.lang.String str) {
            return (com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification.LegacyDocumentVerificationOverlayStrings.Builder) llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification.LegacyDocumentVerificationOverlayStrings.Builder.Key.UNSUPPORTED_DOC_TITLE, str);
        }
    }

    LegacyDocumentVerificationOverlayStrings(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, java.lang.String str11, java.lang.String str12, java.lang.String str13, java.lang.String str14) {
        this.getOutputSizeshNQ4ISI = str;
        this.getHighSpeedVideoFpsRangesFor = str2;
        this.getHighResolutionOutputSizeshNQ4ISI = str3;
        this.getInputSizeshNQ4ISI = str4;
        this.Camera2StreamConfigurationMap = str5;
        this.getHighSpeedVideoSizesFor = str6;
        this.getOutputMinFrameDurationlomOqCM = str7;
        this.getHighSpeedVideoSizes = str8;
        this.getOutputFormats = str9;
        this.getOutputStallDuration = str10;
        this.getHighSpeedVideoFpsRanges = str11;
        this.getOutputSizes = str12;
        this.getOutputMinFrameDuration = str13;
        this.getInputFormats = str14;
    }

    public static com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification.LegacyDocumentVerificationOverlayStrings createDefault(android.content.Context context) {
        return new com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification.LegacyDocumentVerificationOverlayStrings.Builder(context).build();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.getOutputSizeshNQ4ISI);
        parcel.writeString(this.getHighSpeedVideoFpsRangesFor);
        parcel.writeString(this.getHighResolutionOutputSizeshNQ4ISI);
        parcel.writeString(this.getInputSizeshNQ4ISI);
        parcel.writeString(this.Camera2StreamConfigurationMap);
        parcel.writeString(this.getHighSpeedVideoSizesFor);
        parcel.writeString(this.getOutputMinFrameDurationlomOqCM);
        parcel.writeString(this.getHighSpeedVideoSizes);
        parcel.writeString(this.getOutputFormats);
        parcel.writeString(this.getOutputStallDuration);
        parcel.writeString(this.getHighSpeedVideoFpsRanges);
        parcel.writeString(this.getOutputSizes);
        parcel.writeString(this.getOutputMinFrameDuration);
        parcel.writeString(this.getInputFormats);
    }

    LegacyDocumentVerificationOverlayStrings(android.os.Parcel parcel) {
        this.getOutputSizeshNQ4ISI = parcel.readString();
        this.getHighSpeedVideoFpsRangesFor = parcel.readString();
        this.getHighResolutionOutputSizeshNQ4ISI = parcel.readString();
        this.getInputSizeshNQ4ISI = parcel.readString();
        this.Camera2StreamConfigurationMap = parcel.readString();
        this.getHighSpeedVideoSizesFor = parcel.readString();
        this.getOutputMinFrameDurationlomOqCM = parcel.readString();
        this.getHighSpeedVideoSizes = parcel.readString();
        this.getOutputFormats = parcel.readString();
        this.getOutputStallDuration = parcel.readString();
        this.getHighSpeedVideoFpsRanges = parcel.readString();
        this.getOutputSizes = parcel.readString();
        this.getOutputMinFrameDuration = parcel.readString();
        this.getInputFormats = parcel.readString();
    }
}
