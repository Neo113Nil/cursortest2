package com.microblink.blinkid.results.date;

/* loaded from: classes10.dex */
public class Date implements android.os.Parcelable, com.microblink.blinkid.results.date.SimpleDateResult {
    public static final android.os.Parcelable.Creator<com.microblink.blinkid.results.date.Date> CREATOR = new android.os.Parcelable.Creator<com.microblink.blinkid.results.date.Date>() { // from class: com.microblink.blinkid.results.date.Date.1
        @Override // android.os.Parcelable.Creator
        public /* synthetic */ com.microblink.blinkid.results.date.Date createFromParcel(android.os.Parcel parcel) {
            return new com.microblink.blinkid.results.date.Date(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ com.microblink.blinkid.results.date.Date[] newArray(int i) {
            return new com.microblink.blinkid.results.date.Date[i];
        }
    };
    private final java.lang.String Camera2StreamConfigurationMap;
    private final com.microblink.blinkid.results.date.SimpleDate getHighResolutionOutputSizeshNQ4ISI;
    private final boolean getHighSpeedVideoFpsRangesFor;

    private Date(com.microblink.blinkid.results.date.SimpleDate simpleDate, java.lang.String str, boolean z) {
        this.getHighResolutionOutputSizeshNQ4ISI = simpleDate;
        this.Camera2StreamConfigurationMap = str;
        this.getHighSpeedVideoFpsRangesFor = z;
    }

    public static com.microblink.blinkid.results.date.Date createFromDMY(int i, int i2, int i3, java.lang.String str, boolean z) {
        return new com.microblink.blinkid.results.date.Date(new com.microblink.blinkid.results.date.SimpleDate(i, i2, i3), str, z);
    }

    public static com.microblink.blinkid.results.date.Date createUnparsed(java.lang.String str, boolean z) {
        return new com.microblink.blinkid.results.date.Date(null, str, z);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.microblink.blinkid.results.date.SimpleDateResult
    public com.microblink.blinkid.results.date.SimpleDate getDate() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public java.lang.String getOriginalDateString() {
        return this.Camera2StreamConfigurationMap;
    }

    public boolean isFilledByDomainKnowledge() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Date: ");
        com.microblink.blinkid.results.date.SimpleDate simpleDate = this.getHighResolutionOutputSizeshNQ4ISI;
        sb.append(simpleDate == null ? "null" : simpleDate.toString());
        sb.append(", original string: ");
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append(", isFilledByDomainKnowledge: ");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
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
        parcel.writeString(this.Camera2StreamConfigurationMap);
        parcel.writeByte(this.getHighSpeedVideoFpsRangesFor ? (byte) 1 : (byte) 0);
    }

    Date(android.os.Parcel parcel) {
        if (parcel.readByte() == 1) {
            this.getHighResolutionOutputSizeshNQ4ISI = new com.microblink.blinkid.results.date.SimpleDate(parcel.readInt(), parcel.readInt(), parcel.readInt());
        } else {
            this.getHighResolutionOutputSizeshNQ4ISI = null;
        }
        this.Camera2StreamConfigurationMap = parcel.readString();
        this.getHighSpeedVideoFpsRangesFor = parcel.readByte() != 0;
    }
}
