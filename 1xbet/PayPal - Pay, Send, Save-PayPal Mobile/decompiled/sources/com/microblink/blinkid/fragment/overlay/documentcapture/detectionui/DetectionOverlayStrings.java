package com.microblink.blinkid.fragment.overlay.documentcapture.detectionui;

/* loaded from: classes10.dex */
public class DetectionOverlayStrings implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.microblink.blinkid.fragment.overlay.documentcapture.detectionui.DetectionOverlayStrings> CREATOR = new android.os.Parcelable.Creator<com.microblink.blinkid.fragment.overlay.documentcapture.detectionui.DetectionOverlayStrings>() { // from class: com.microblink.blinkid.fragment.overlay.documentcapture.detectionui.DetectionOverlayStrings.1
        @Override // android.os.Parcelable.Creator
        public /* synthetic */ com.microblink.blinkid.fragment.overlay.documentcapture.detectionui.DetectionOverlayStrings createFromParcel(android.os.Parcel parcel) {
            return new com.microblink.blinkid.fragment.overlay.documentcapture.detectionui.DetectionOverlayStrings(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ com.microblink.blinkid.fragment.overlay.documentcapture.detectionui.DetectionOverlayStrings[] newArray(int i) {
            return new com.microblink.blinkid.fragment.overlay.documentcapture.detectionui.DetectionOverlayStrings[i];
        }
    };
    final java.lang.String Camera2StreamConfigurationMap;
    final java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    final java.lang.String getHighSpeedVideoFpsRanges;

    public static class Builder extends com.microblink.blinkid.fragment.overlay.OverlayStringsBuilder<com.microblink.blinkid.fragment.overlay.documentcapture.detectionui.DetectionOverlayStrings.Builder, com.microblink.blinkid.fragment.overlay.documentcapture.detectionui.DetectionOverlayStrings.Builder.Key> {

        public enum Key {
            ACTION_SEARCHING_DOCUMENT,
            ACTION_MOVE_CLOSER,
            ACTION_PROCESSING
        }

        public Builder(android.content.Context context) {
            super(context);
            llIIlIlIIl(com.microblink.blinkid.fragment.overlay.documentcapture.detectionui.DetectionOverlayStrings.Builder.Key.ACTION_SEARCHING_DOCUMENT, llIIlIlIIl(com.microblink.blinkid.library.R.string.mb_action_searching_document));
            llIIlIlIIl(com.microblink.blinkid.fragment.overlay.documentcapture.detectionui.DetectionOverlayStrings.Builder.Key.ACTION_MOVE_CLOSER, llIIlIlIIl(com.microblink.blinkid.library.R.string.mb_action_move_closer));
            llIIlIlIIl(com.microblink.blinkid.fragment.overlay.documentcapture.detectionui.DetectionOverlayStrings.Builder.Key.ACTION_PROCESSING, llIIlIlIIl(com.microblink.blinkid.library.R.string.mb_action_hold_steady));
        }

        public com.microblink.blinkid.fragment.overlay.documentcapture.detectionui.DetectionOverlayStrings build() {
            return new com.microblink.blinkid.fragment.overlay.documentcapture.detectionui.DetectionOverlayStrings(llIIlIlIIl(com.microblink.blinkid.fragment.overlay.documentcapture.detectionui.DetectionOverlayStrings.Builder.Key.ACTION_SEARCHING_DOCUMENT), llIIlIlIIl(com.microblink.blinkid.fragment.overlay.documentcapture.detectionui.DetectionOverlayStrings.Builder.Key.ACTION_MOVE_CLOSER), llIIlIlIIl(com.microblink.blinkid.fragment.overlay.documentcapture.detectionui.DetectionOverlayStrings.Builder.Key.ACTION_PROCESSING));
        }

        @Override // com.microblink.blinkid.fragment.overlay.OverlayStringsBuilder
        public final java.lang.Object llIIlIlIIl() {
            return this;
        }

        public com.microblink.blinkid.fragment.overlay.documentcapture.detectionui.DetectionOverlayStrings.Builder setActionMoveCloser(java.lang.String str) {
            return (com.microblink.blinkid.fragment.overlay.documentcapture.detectionui.DetectionOverlayStrings.Builder) llIIlIlIIl(com.microblink.blinkid.fragment.overlay.documentcapture.detectionui.DetectionOverlayStrings.Builder.Key.ACTION_MOVE_CLOSER, str);
        }

        public com.microblink.blinkid.fragment.overlay.documentcapture.detectionui.DetectionOverlayStrings.Builder setActionProcessing(java.lang.String str) {
            return (com.microblink.blinkid.fragment.overlay.documentcapture.detectionui.DetectionOverlayStrings.Builder) llIIlIlIIl(com.microblink.blinkid.fragment.overlay.documentcapture.detectionui.DetectionOverlayStrings.Builder.Key.ACTION_PROCESSING, str);
        }

        public com.microblink.blinkid.fragment.overlay.documentcapture.detectionui.DetectionOverlayStrings.Builder setActionSearchingDocument(java.lang.String str) {
            return (com.microblink.blinkid.fragment.overlay.documentcapture.detectionui.DetectionOverlayStrings.Builder) llIIlIlIIl(com.microblink.blinkid.fragment.overlay.documentcapture.detectionui.DetectionOverlayStrings.Builder.Key.ACTION_SEARCHING_DOCUMENT, str);
        }
    }

    DetectionOverlayStrings(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.Camera2StreamConfigurationMap = str;
        this.getHighSpeedVideoFpsRanges = str2;
        this.getHighResolutionOutputSizeshNQ4ISI = str3;
    }

    static com.microblink.blinkid.fragment.overlay.documentcapture.detectionui.DetectionOverlayStrings getHighSpeedVideoSizes(android.content.Context context) {
        return new com.microblink.blinkid.fragment.overlay.documentcapture.detectionui.DetectionOverlayStrings.Builder(context).build();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.Camera2StreamConfigurationMap);
        parcel.writeString(this.getHighSpeedVideoFpsRanges);
        parcel.writeString(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    DetectionOverlayStrings(android.os.Parcel parcel) {
        this.Camera2StreamConfigurationMap = parcel.readString();
        this.getHighSpeedVideoFpsRanges = parcel.readString();
        this.getHighResolutionOutputSizeshNQ4ISI = parcel.readString();
    }
}
