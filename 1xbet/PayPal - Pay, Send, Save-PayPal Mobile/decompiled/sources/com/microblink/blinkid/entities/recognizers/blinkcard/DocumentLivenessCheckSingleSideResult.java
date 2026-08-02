package com.microblink.blinkid.entities.recognizers.blinkcard;

/* loaded from: classes9.dex */
public final class DocumentLivenessCheckSingleSideResult implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.blinkcard.DocumentLivenessCheckSingleSideResult> CREATOR = new android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.blinkcard.DocumentLivenessCheckSingleSideResult>() { // from class: com.microblink.blinkid.entities.recognizers.blinkcard.DocumentLivenessCheckSingleSideResult.1
        @Override // android.os.Parcelable.Creator
        public /* synthetic */ com.microblink.blinkid.entities.recognizers.blinkcard.DocumentLivenessCheckSingleSideResult createFromParcel(android.os.Parcel parcel) {
            return new com.microblink.blinkid.entities.recognizers.blinkcard.DocumentLivenessCheckSingleSideResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ com.microblink.blinkid.entities.recognizers.blinkcard.DocumentLivenessCheckSingleSideResult[] newArray(int i) {
            return new com.microblink.blinkid.entities.recognizers.blinkcard.DocumentLivenessCheckSingleSideResult[i];
        }
    };
    private final com.microblink.blinkid.entities.recognizers.blinkcard.TieredCheck Camera2StreamConfigurationMap;
    private final com.microblink.blinkid.entities.recognizers.blinkcard.TieredCheck getHighSpeedVideoFpsRanges;
    private final com.microblink.blinkid.entities.recognizers.blinkcard.CheckResult getHighSpeedVideoSizes;

    private DocumentLivenessCheckSingleSideResult(com.microblink.blinkid.entities.recognizers.blinkcard.TieredCheck tieredCheck, com.microblink.blinkid.entities.recognizers.blinkcard.TieredCheck tieredCheck2, com.microblink.blinkid.entities.recognizers.blinkcard.CheckResult checkResult) {
        this.Camera2StreamConfigurationMap = tieredCheck;
        this.getHighSpeedVideoFpsRanges = tieredCheck2;
        this.getHighSpeedVideoSizes = checkResult;
    }

    public static com.microblink.blinkid.entities.recognizers.blinkcard.DocumentLivenessCheckSingleSideResult createFromNative(com.microblink.blinkid.entities.recognizers.blinkcard.TieredCheck tieredCheck, com.microblink.blinkid.entities.recognizers.blinkcard.TieredCheck tieredCheck2, int i) {
        return new com.microblink.blinkid.entities.recognizers.blinkcard.DocumentLivenessCheckSingleSideResult(tieredCheck, tieredCheck2, com.microblink.blinkid.entities.recognizers.blinkcard.CheckResult.values()[i]);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final com.microblink.blinkid.entities.recognizers.blinkcard.CheckResult getHandPresenceCheck() {
        return this.getHighSpeedVideoSizes;
    }

    public final com.microblink.blinkid.entities.recognizers.blinkcard.TieredCheck getPhotocopyCheck() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final com.microblink.blinkid.entities.recognizers.blinkcard.TieredCheck getScreenCheck() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeParcelable(this.Camera2StreamConfigurationMap, i);
        parcel.writeParcelable(this.getHighSpeedVideoFpsRanges, i);
        parcel.writeSerializable(this.getHighSpeedVideoSizes);
    }

    DocumentLivenessCheckSingleSideResult(android.os.Parcel parcel) {
        this.Camera2StreamConfigurationMap = (com.microblink.blinkid.entities.recognizers.blinkcard.TieredCheck) parcel.readParcelable(com.microblink.blinkid.entities.recognizers.blinkcard.TieredCheck.class.getClassLoader());
        this.getHighSpeedVideoFpsRanges = (com.microblink.blinkid.entities.recognizers.blinkcard.TieredCheck) parcel.readParcelable(com.microblink.blinkid.entities.recognizers.blinkcard.TieredCheck.class.getClassLoader());
        this.getHighSpeedVideoSizes = (com.microblink.blinkid.entities.recognizers.blinkcard.CheckResult) parcel.readSerializable();
    }
}
