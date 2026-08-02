package com.microblink.blinkid.entities.recognizers.blinkcard;

/* loaded from: classes9.dex */
public final class TieredCheck implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.blinkcard.TieredCheck> CREATOR = new android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.blinkcard.TieredCheck>() { // from class: com.microblink.blinkid.entities.recognizers.blinkcard.TieredCheck.1
        @Override // android.os.Parcelable.Creator
        public /* synthetic */ com.microblink.blinkid.entities.recognizers.blinkcard.TieredCheck createFromParcel(android.os.Parcel parcel) {
            return new com.microblink.blinkid.entities.recognizers.blinkcard.TieredCheck(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ com.microblink.blinkid.entities.recognizers.blinkcard.TieredCheck[] newArray(int i) {
            return new com.microblink.blinkid.entities.recognizers.blinkcard.TieredCheck[i];
        }
    };
    private final com.microblink.blinkid.entities.recognizers.blinkcard.MatchLevel Camera2StreamConfigurationMap;
    private final com.microblink.blinkid.entities.recognizers.blinkcard.CheckResult getHighSpeedVideoFpsRangesFor;

    private TieredCheck(com.microblink.blinkid.entities.recognizers.blinkcard.CheckResult checkResult, com.microblink.blinkid.entities.recognizers.blinkcard.MatchLevel matchLevel) {
        this.getHighSpeedVideoFpsRangesFor = checkResult;
        this.Camera2StreamConfigurationMap = matchLevel;
    }

    public static com.microblink.blinkid.entities.recognizers.blinkcard.TieredCheck createFromNative(int i, int i2) {
        return new com.microblink.blinkid.entities.recognizers.blinkcard.TieredCheck(com.microblink.blinkid.entities.recognizers.blinkcard.CheckResult.values()[i], com.microblink.blinkid.entities.recognizers.blinkcard.MatchLevel.values()[i2]);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final com.microblink.blinkid.entities.recognizers.blinkcard.CheckResult getCheckResult() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final com.microblink.blinkid.entities.recognizers.blinkcard.MatchLevel getMatchLevel() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeSerializable(this.getHighSpeedVideoFpsRangesFor);
        parcel.writeSerializable(this.Camera2StreamConfigurationMap);
    }

    TieredCheck(android.os.Parcel parcel) {
        this.getHighSpeedVideoFpsRangesFor = (com.microblink.blinkid.entities.recognizers.blinkcard.CheckResult) parcel.readSerializable();
        this.Camera2StreamConfigurationMap = (com.microblink.blinkid.entities.recognizers.blinkcard.MatchLevel) parcel.readSerializable();
    }
}
