package com.microblink.blinkid.entities.recognizers.blinkid.generic;

/* loaded from: classes10.dex */
public class DateResult implements android.os.Parcelable, com.microblink.blinkid.results.date.SimpleDateResult {
    public static final android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.blinkid.generic.DateResult> CREATOR = new android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.blinkid.generic.DateResult>() { // from class: com.microblink.blinkid.entities.recognizers.blinkid.generic.DateResult.1
        @Override // android.os.Parcelable.Creator
        public /* synthetic */ com.microblink.blinkid.entities.recognizers.blinkid.generic.DateResult createFromParcel(android.os.Parcel parcel) {
            return new com.microblink.blinkid.entities.recognizers.blinkid.generic.DateResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ com.microblink.blinkid.entities.recognizers.blinkid.generic.DateResult[] newArray(int i) {
            return new com.microblink.blinkid.entities.recognizers.blinkid.generic.DateResult[i];
        }
    };
    private final com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult Camera2StreamConfigurationMap;
    private final com.microblink.blinkid.results.date.SimpleDate getHighResolutionOutputSizeshNQ4ISI;
    private final boolean getHighSpeedVideoFpsRanges;

    private DateResult(com.microblink.blinkid.results.date.SimpleDate simpleDate, com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult stringResult, boolean z) {
        this.getHighResolutionOutputSizeshNQ4ISI = simpleDate;
        this.Camera2StreamConfigurationMap = stringResult;
        this.getHighSpeedVideoFpsRanges = z;
    }

    public static com.microblink.blinkid.entities.recognizers.blinkid.generic.DateResult createFromDMY(int i, int i2, int i3, com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult stringResult, boolean z) {
        return new com.microblink.blinkid.entities.recognizers.blinkid.generic.DateResult(new com.microblink.blinkid.results.date.SimpleDate(i, i2, i3), stringResult, z);
    }

    public static com.microblink.blinkid.entities.recognizers.blinkid.generic.DateResult createUnparsed(com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult stringResult, boolean z) {
        return new com.microblink.blinkid.entities.recognizers.blinkid.generic.DateResult(null, stringResult, z);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.microblink.blinkid.results.date.SimpleDateResult
    public com.microblink.blinkid.results.date.SimpleDate getDate() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult getOriginalDateString() {
        return this.Camera2StreamConfigurationMap;
    }

    public boolean isFilledByDomainKnowledge() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Date: ");
        com.microblink.blinkid.results.date.SimpleDate simpleDate = this.getHighResolutionOutputSizeshNQ4ISI;
        sb.append(simpleDate == null ? "null" : simpleDate.toString());
        sb.append(", original string: ");
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append(", isFilledByDomainKnowledge: ");
        sb.append(this.getHighSpeedVideoFpsRanges);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        if (this.getHighResolutionOutputSizeshNQ4ISI != null) {
            parcel.writeByte((byte) 1);
            parcel.writeInt(this.getHighResolutionOutputSizeshNQ4ISI.getDay());
            parcel.writeInt(this.getHighResolutionOutputSizeshNQ4ISI.getMonth());
            parcel.writeInt(this.getHighResolutionOutputSizeshNQ4ISI.getYear());
        } else {
            parcel.writeByte((byte) 0);
        }
        parcel.writeParcelable(this.Camera2StreamConfigurationMap, i);
        parcel.writeByte(this.getHighSpeedVideoFpsRanges ? (byte) 1 : (byte) 0);
    }

    DateResult(android.os.Parcel parcel) {
        if (parcel.readByte() == 1) {
            this.getHighResolutionOutputSizeshNQ4ISI = new com.microblink.blinkid.results.date.SimpleDate(parcel.readInt(), parcel.readInt(), parcel.readInt());
        } else {
            this.getHighResolutionOutputSizeshNQ4ISI = null;
        }
        this.Camera2StreamConfigurationMap = (com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult) parcel.readParcelable(com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult.class.getClassLoader());
        this.getHighSpeedVideoFpsRanges = parcel.readByte() != 0;
    }
}
