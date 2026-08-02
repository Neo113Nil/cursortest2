package com.microblink.blinkid.hardware.camera;

/* loaded from: classes10.dex */
public enum VideoResolutionPreset implements android.os.Parcelable {
    VIDEO_RESOLUTION_DEFAULT(1080),
    VIDEO_RESOLUTION_480p(androidx.window.core.layout.WindowSizeClass.HEIGHT_DP_MEDIUM_LOWER_BOUND),
    VIDEO_RESOLUTION_720p(com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.FaceCaptureManager.IDEAL_CAPTURE_HEIGHT),
    VIDEO_RESOLUTION_1080p(1080),
    VIDEO_RESOLUTION_2160p(2160),
    VIDEO_RESOLUTION_MAX_AVAILABLE(4320);

    public static final android.os.Parcelable.Creator<com.microblink.blinkid.hardware.camera.VideoResolutionPreset> CREATOR = new android.os.Parcelable.Creator() { // from class: com.microblink.blinkid.secured.lllIllIllI
        @Override // android.os.Parcelable.Creator
        public final java.lang.Object createFromParcel(android.os.Parcel parcel) {
            return com.microblink.blinkid.hardware.camera.VideoResolutionPreset.values()[parcel.readInt()];
        }

        @Override // android.os.Parcelable.Creator
        public final java.lang.Object[] newArray(int i) {
            return new com.microblink.blinkid.hardware.camera.VideoResolutionPreset[i];
        }
    };
    private final int Camera2StreamConfigurationMap;

    VideoResolutionPreset(int i) {
        this.Camera2StreamConfigurationMap = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int getIdealHeight() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeInt(ordinal());
    }
}
