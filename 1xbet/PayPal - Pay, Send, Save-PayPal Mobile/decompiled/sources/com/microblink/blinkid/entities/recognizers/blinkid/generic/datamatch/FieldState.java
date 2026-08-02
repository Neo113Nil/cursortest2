package com.microblink.blinkid.entities.recognizers.blinkid.generic.datamatch;

/* loaded from: classes10.dex */
public class FieldState implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.blinkid.generic.datamatch.FieldState> CREATOR = new android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.blinkid.generic.datamatch.FieldState>() { // from class: com.microblink.blinkid.entities.recognizers.blinkid.generic.datamatch.FieldState.1
        @Override // android.os.Parcelable.Creator
        public /* synthetic */ com.microblink.blinkid.entities.recognizers.blinkid.generic.datamatch.FieldState createFromParcel(android.os.Parcel parcel) {
            return new com.microblink.blinkid.entities.recognizers.blinkid.generic.datamatch.FieldState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ com.microblink.blinkid.entities.recognizers.blinkid.generic.datamatch.FieldState[] newArray(int i) {
            return new com.microblink.blinkid.entities.recognizers.blinkid.generic.datamatch.FieldState[i];
        }
    };
    private final com.microblink.blinkid.entities.recognizers.blinkid.generic.datamatch.DataMatchField getHighResolutionOutputSizeshNQ4ISI;
    private final com.microblink.blinkid.entities.recognizers.blinkid.DataMatchState getHighSpeedVideoFpsRanges;

    public FieldState(com.microblink.blinkid.entities.recognizers.blinkid.generic.datamatch.DataMatchField dataMatchField, com.microblink.blinkid.entities.recognizers.blinkid.DataMatchState dataMatchState) {
        this.getHighResolutionOutputSizeshNQ4ISI = dataMatchField;
        this.getHighSpeedVideoFpsRanges = dataMatchState;
    }

    public static com.microblink.blinkid.entities.recognizers.blinkid.generic.datamatch.FieldState createFromNative(int i, int i2) {
        return new com.microblink.blinkid.entities.recognizers.blinkid.generic.datamatch.FieldState(com.microblink.blinkid.entities.recognizers.blinkid.generic.datamatch.DataMatchField.values()[i], com.microblink.blinkid.entities.recognizers.blinkid.DataMatchState.values()[i2]);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public com.microblink.blinkid.entities.recognizers.blinkid.generic.datamatch.DataMatchField getFieldType() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public com.microblink.blinkid.entities.recognizers.blinkid.DataMatchState getState() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeInt(this.getHighResolutionOutputSizeshNQ4ISI.ordinal());
        parcel.writeInt(this.getHighSpeedVideoFpsRanges.ordinal());
    }

    FieldState(android.os.Parcel parcel) {
        this.getHighResolutionOutputSizeshNQ4ISI = com.microblink.blinkid.entities.recognizers.blinkid.generic.datamatch.DataMatchField.values()[parcel.readInt()];
        this.getHighSpeedVideoFpsRanges = com.microblink.blinkid.entities.recognizers.blinkid.DataMatchState.values()[parcel.readInt()];
    }
}
