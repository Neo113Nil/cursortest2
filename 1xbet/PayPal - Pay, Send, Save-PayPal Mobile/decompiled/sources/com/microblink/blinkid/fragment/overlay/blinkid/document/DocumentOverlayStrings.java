package com.microblink.blinkid.fragment.overlay.blinkid.document;

@java.lang.Deprecated
/* loaded from: classes10.dex */
public class DocumentOverlayStrings implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.microblink.blinkid.fragment.overlay.blinkid.document.DocumentOverlayStrings> CREATOR = new android.os.Parcelable.Creator<com.microblink.blinkid.fragment.overlay.blinkid.document.DocumentOverlayStrings>() { // from class: com.microblink.blinkid.fragment.overlay.blinkid.document.DocumentOverlayStrings.1
        @Override // android.os.Parcelable.Creator
        public /* synthetic */ com.microblink.blinkid.fragment.overlay.blinkid.document.DocumentOverlayStrings createFromParcel(android.os.Parcel parcel) {
            return new com.microblink.blinkid.fragment.overlay.blinkid.document.DocumentOverlayStrings(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ com.microblink.blinkid.fragment.overlay.blinkid.document.DocumentOverlayStrings[] newArray(int i) {
            return new com.microblink.blinkid.fragment.overlay.blinkid.document.DocumentOverlayStrings[i];
        }
    };
    final java.lang.String Camera2StreamConfigurationMap;
    final java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    final java.lang.String getHighSpeedVideoFpsRanges;
    final java.lang.String getHighSpeedVideoFpsRangesFor;
    final java.lang.String getHighSpeedVideoSizes;
    final java.lang.String getHighSpeedVideoSizesFor;
    final java.lang.String getInputSizeshNQ4ISI;
    final java.lang.String getOutputFormats;
    final java.lang.String getOutputMinFrameDuration;

    public static class Builder extends com.microblink.blinkid.fragment.overlay.OverlayStringsBuilder<com.microblink.blinkid.fragment.overlay.blinkid.document.DocumentOverlayStrings.Builder, com.microblink.blinkid.fragment.overlay.blinkid.document.DocumentOverlayStrings.Builder.Key> {

        public enum Key {
            NOT_MATCHING_SIDES_TITLE,
            NOT_MATCHING_SIDES_MESSAGE,
            DATA_MISMATCH_TITLE,
            DATA_MISMATCH_MESSAGE,
            UNSUPPORTED_DOC_TITLE,
            UNSUPPORTED_DOC_MESSAGE,
            RECOGNITION_TIMEOUT_TITLE,
            RECOGNITION_TIMEOUT_MESSAGE,
            RETRY_BUTTON
        }

        public Builder(android.content.Context context) {
            super(context);
            llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.document.DocumentOverlayStrings.Builder.Key.NOT_MATCHING_SIDES_TITLE, llIIlIlIIl(com.microblink.blinkid.library.R.string.mb_data_not_match_title));
            llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.document.DocumentOverlayStrings.Builder.Key.NOT_MATCHING_SIDES_MESSAGE, llIIlIlIIl(com.microblink.blinkid.library.R.string.mb_data_not_match_msg));
            llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.document.DocumentOverlayStrings.Builder.Key.DATA_MISMATCH_TITLE, llIIlIlIIl(com.microblink.blinkid.library.R.string.mb_something_went_wrong));
            llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.document.DocumentOverlayStrings.Builder.Key.DATA_MISMATCH_MESSAGE, llIIlIlIIl(com.microblink.blinkid.library.R.string.mb_try_scanning_again));
            llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.document.DocumentOverlayStrings.Builder.Key.UNSUPPORTED_DOC_TITLE, llIIlIlIIl(com.microblink.blinkid.library.R.string.mb_unsupported_document_title));
            llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.document.DocumentOverlayStrings.Builder.Key.UNSUPPORTED_DOC_MESSAGE, llIIlIlIIl(com.microblink.blinkid.library.R.string.mb_unsupported_document_message));
            llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.document.DocumentOverlayStrings.Builder.Key.RECOGNITION_TIMEOUT_TITLE, llIIlIlIIl(com.microblink.blinkid.library.R.string.mb_recognition_timeout_dialog_title));
            llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.document.DocumentOverlayStrings.Builder.Key.RECOGNITION_TIMEOUT_MESSAGE, llIIlIlIIl(com.microblink.blinkid.library.R.string.mb_recognition_timeout_dialog_message));
            llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.document.DocumentOverlayStrings.Builder.Key.RETRY_BUTTON, llIIlIlIIl(com.microblink.blinkid.library.R.string.mb_data_not_match_retry_button));
        }

        public com.microblink.blinkid.fragment.overlay.blinkid.document.DocumentOverlayStrings build() {
            return new com.microblink.blinkid.fragment.overlay.blinkid.document.DocumentOverlayStrings(llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.document.DocumentOverlayStrings.Builder.Key.NOT_MATCHING_SIDES_TITLE), llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.document.DocumentOverlayStrings.Builder.Key.NOT_MATCHING_SIDES_MESSAGE), llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.document.DocumentOverlayStrings.Builder.Key.DATA_MISMATCH_TITLE), llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.document.DocumentOverlayStrings.Builder.Key.DATA_MISMATCH_MESSAGE), llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.document.DocumentOverlayStrings.Builder.Key.UNSUPPORTED_DOC_TITLE), llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.document.DocumentOverlayStrings.Builder.Key.UNSUPPORTED_DOC_MESSAGE), llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.document.DocumentOverlayStrings.Builder.Key.RECOGNITION_TIMEOUT_TITLE), llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.document.DocumentOverlayStrings.Builder.Key.RECOGNITION_TIMEOUT_MESSAGE), llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.document.DocumentOverlayStrings.Builder.Key.RETRY_BUTTON));
        }

        @Override // com.microblink.blinkid.fragment.overlay.OverlayStringsBuilder
        public final java.lang.Object llIIlIlIIl() {
            return this;
        }

        public com.microblink.blinkid.fragment.overlay.blinkid.document.DocumentOverlayStrings.Builder setDataMismatchMessage(java.lang.String str) {
            return (com.microblink.blinkid.fragment.overlay.blinkid.document.DocumentOverlayStrings.Builder) llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.document.DocumentOverlayStrings.Builder.Key.DATA_MISMATCH_MESSAGE, str);
        }

        public com.microblink.blinkid.fragment.overlay.blinkid.document.DocumentOverlayStrings.Builder setDataMismatchTitle(java.lang.String str) {
            return (com.microblink.blinkid.fragment.overlay.blinkid.document.DocumentOverlayStrings.Builder) llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.document.DocumentOverlayStrings.Builder.Key.DATA_MISMATCH_TITLE, str);
        }

        public com.microblink.blinkid.fragment.overlay.blinkid.document.DocumentOverlayStrings.Builder setRecognitionTimeoutMessage(java.lang.String str) {
            return (com.microblink.blinkid.fragment.overlay.blinkid.document.DocumentOverlayStrings.Builder) llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.document.DocumentOverlayStrings.Builder.Key.RECOGNITION_TIMEOUT_MESSAGE, str);
        }

        public com.microblink.blinkid.fragment.overlay.blinkid.document.DocumentOverlayStrings.Builder setRecognitionTimeoutTitle(java.lang.String str) {
            return (com.microblink.blinkid.fragment.overlay.blinkid.document.DocumentOverlayStrings.Builder) llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.document.DocumentOverlayStrings.Builder.Key.RECOGNITION_TIMEOUT_TITLE, str);
        }

        public com.microblink.blinkid.fragment.overlay.blinkid.document.DocumentOverlayStrings.Builder setRetryButtonText(java.lang.String str) {
            return (com.microblink.blinkid.fragment.overlay.blinkid.document.DocumentOverlayStrings.Builder) llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.document.DocumentOverlayStrings.Builder.Key.RETRY_BUTTON, str);
        }

        public com.microblink.blinkid.fragment.overlay.blinkid.document.DocumentOverlayStrings.Builder setSidesNotMatchingMessage(java.lang.String str) {
            return (com.microblink.blinkid.fragment.overlay.blinkid.document.DocumentOverlayStrings.Builder) llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.document.DocumentOverlayStrings.Builder.Key.NOT_MATCHING_SIDES_MESSAGE, str);
        }

        public com.microblink.blinkid.fragment.overlay.blinkid.document.DocumentOverlayStrings.Builder setSidesNotMatchingTitle(java.lang.String str) {
            return (com.microblink.blinkid.fragment.overlay.blinkid.document.DocumentOverlayStrings.Builder) llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.document.DocumentOverlayStrings.Builder.Key.NOT_MATCHING_SIDES_TITLE, str);
        }

        public com.microblink.blinkid.fragment.overlay.blinkid.document.DocumentOverlayStrings.Builder setUnsupportedDocumentMessage(java.lang.String str) {
            return (com.microblink.blinkid.fragment.overlay.blinkid.document.DocumentOverlayStrings.Builder) llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.document.DocumentOverlayStrings.Builder.Key.UNSUPPORTED_DOC_MESSAGE, str);
        }

        public com.microblink.blinkid.fragment.overlay.blinkid.document.DocumentOverlayStrings.Builder setUnsupportedDocumentTitle(java.lang.String str) {
            return (com.microblink.blinkid.fragment.overlay.blinkid.document.DocumentOverlayStrings.Builder) llIIlIlIIl(com.microblink.blinkid.fragment.overlay.blinkid.document.DocumentOverlayStrings.Builder.Key.UNSUPPORTED_DOC_TITLE, str);
        }
    }

    DocumentOverlayStrings(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9) {
        this.getHighSpeedVideoSizesFor = str;
        this.getHighSpeedVideoFpsRangesFor = str2;
        this.Camera2StreamConfigurationMap = str3;
        this.getOutputMinFrameDuration = str4;
        this.getHighResolutionOutputSizeshNQ4ISI = str5;
        this.getInputSizeshNQ4ISI = str6;
        this.getOutputFormats = str7;
        this.getHighSpeedVideoSizes = str8;
        this.getHighSpeedVideoFpsRanges = str9;
    }

    public static com.microblink.blinkid.fragment.overlay.blinkid.document.DocumentOverlayStrings createDefault(android.content.Context context) {
        return new com.microblink.blinkid.fragment.overlay.blinkid.document.DocumentOverlayStrings.Builder(context).build();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.getHighSpeedVideoSizesFor);
        parcel.writeString(this.getHighSpeedVideoFpsRangesFor);
        parcel.writeString(this.Camera2StreamConfigurationMap);
        parcel.writeString(this.getOutputMinFrameDuration);
        parcel.writeString(this.getHighResolutionOutputSizeshNQ4ISI);
        parcel.writeString(this.getInputSizeshNQ4ISI);
        parcel.writeString(this.getOutputFormats);
        parcel.writeString(this.getHighSpeedVideoSizes);
        parcel.writeString(this.getHighSpeedVideoFpsRanges);
    }

    DocumentOverlayStrings(android.os.Parcel parcel) {
        this.getHighSpeedVideoSizesFor = parcel.readString();
        this.getHighSpeedVideoFpsRangesFor = parcel.readString();
        this.Camera2StreamConfigurationMap = parcel.readString();
        this.getOutputMinFrameDuration = parcel.readString();
        this.getHighResolutionOutputSizeshNQ4ISI = parcel.readString();
        this.getInputSizeshNQ4ISI = parcel.readString();
        this.getOutputFormats = parcel.readString();
        this.getHighSpeedVideoSizes = parcel.readString();
        this.getHighSpeedVideoFpsRanges = parcel.readString();
    }
}
