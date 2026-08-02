package com.microblink.blinkid.entities.recognizers.blinkid.generic.datamatch;

/* loaded from: classes10.dex */
public class DataMatchResult implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.blinkid.generic.datamatch.DataMatchResult> CREATOR = new android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.blinkid.generic.datamatch.DataMatchResult>() { // from class: com.microblink.blinkid.entities.recognizers.blinkid.generic.datamatch.DataMatchResult.1
        @Override // android.os.Parcelable.Creator
        public /* synthetic */ com.microblink.blinkid.entities.recognizers.blinkid.generic.datamatch.DataMatchResult createFromParcel(android.os.Parcel parcel) {
            return new com.microblink.blinkid.entities.recognizers.blinkid.generic.datamatch.DataMatchResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ com.microblink.blinkid.entities.recognizers.blinkid.generic.datamatch.DataMatchResult[] newArray(int i) {
            return new com.microblink.blinkid.entities.recognizers.blinkid.generic.datamatch.DataMatchResult[i];
        }
    };
    private final com.microblink.blinkid.entities.recognizers.blinkid.generic.datamatch.FieldState[] Camera2StreamConfigurationMap;
    private final com.microblink.blinkid.entities.recognizers.blinkid.DataMatchState getHighSpeedVideoSizes;

    public DataMatchResult(com.microblink.blinkid.entities.recognizers.blinkid.DataMatchState dataMatchState, com.microblink.blinkid.entities.recognizers.blinkid.generic.datamatch.FieldState[] fieldStateArr) {
        this.getHighSpeedVideoSizes = dataMatchState;
        this.Camera2StreamConfigurationMap = fieldStateArr;
    }

    public static com.microblink.blinkid.entities.recognizers.blinkid.generic.datamatch.DataMatchResult createFromNative(int i, com.microblink.blinkid.entities.recognizers.blinkid.generic.datamatch.FieldState[] fieldStateArr) {
        return new com.microblink.blinkid.entities.recognizers.blinkid.generic.datamatch.DataMatchResult(com.microblink.blinkid.entities.recognizers.blinkid.DataMatchState.values()[i], fieldStateArr);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public com.microblink.blinkid.entities.recognizers.blinkid.DataMatchState getState(com.microblink.blinkid.entities.recognizers.blinkid.generic.datamatch.DataMatchField dataMatchField) {
        return this.Camera2StreamConfigurationMap[dataMatchField.ordinal()].getState();
    }

    public com.microblink.blinkid.entities.recognizers.blinkid.DataMatchState getStateForWholeDocument() {
        return this.getHighSpeedVideoSizes;
    }

    public com.microblink.blinkid.entities.recognizers.blinkid.generic.datamatch.FieldState[] getStates() {
        return this.Camera2StreamConfigurationMap;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DocumentState : ");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
        for (com.microblink.blinkid.entities.recognizers.blinkid.generic.datamatch.FieldState fieldState : this.Camera2StreamConfigurationMap) {
            sb.append(fieldState.getFieldType());
            sb.append(" : ");
            sb.append(fieldState.getState());
            sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeInt(this.getHighSpeedVideoSizes.ordinal());
        parcel.writeParcelableArray(this.Camera2StreamConfigurationMap, i);
    }

    protected DataMatchResult(android.os.Parcel parcel) {
        this.getHighSpeedVideoSizes = com.microblink.blinkid.entities.recognizers.blinkid.DataMatchState.values()[parcel.readInt()];
        android.os.Parcelable[] readParcelableArray = parcel.readParcelableArray(com.microblink.blinkid.entities.recognizers.blinkid.generic.datamatch.FieldState.class.getClassLoader());
        this.Camera2StreamConfigurationMap = new com.microblink.blinkid.entities.recognizers.blinkid.generic.datamatch.FieldState[readParcelableArray.length];
        int i = 0;
        while (true) {
            com.microblink.blinkid.entities.recognizers.blinkid.generic.datamatch.FieldState[] fieldStateArr = this.Camera2StreamConfigurationMap;
            if (i >= fieldStateArr.length) {
                return;
            }
            fieldStateArr[i] = (com.microblink.blinkid.entities.recognizers.blinkid.generic.datamatch.FieldState) readParcelableArray[i];
            i++;
        }
    }
}
