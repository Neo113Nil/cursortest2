package com.microblink.blinkid.entities.recognizers.blinkid.generic;

/* loaded from: classes10.dex */
public class StringResult implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult> CREATOR = new android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult>() { // from class: com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult.1
        @Override // android.os.Parcelable.Creator
        public /* synthetic */ com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult createFromParcel(android.os.Parcel parcel) {
            return new com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult[] newArray(int i) {
            return new com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult[i];
        }
    };
    private final com.microblink.blinkid.entities.recognizers.blinkid.generic.Side[] getHighResolutionOutputSizeshNQ4ISI;
    private final com.microblink.blinkid.geometry.Rectangle[] getHighSpeedVideoFpsRanges;
    private final java.lang.String[] getHighSpeedVideoFpsRangesFor;

    public StringResult(java.lang.String[] strArr, com.microblink.blinkid.geometry.Rectangle[] rectangleArr, int[] iArr) {
        this.getHighSpeedVideoFpsRangesFor = strArr;
        this.getHighSpeedVideoFpsRanges = rectangleArr;
        com.microblink.blinkid.entities.recognizers.blinkid.generic.Side[] sideArr = new com.microblink.blinkid.entities.recognizers.blinkid.generic.Side[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            if (iArr[i] == -1) {
                sideArr[i] = null;
            } else {
                sideArr[i] = com.microblink.blinkid.entities.recognizers.blinkid.generic.Side.values()[iArr[i]];
            }
        }
        this.getHighResolutionOutputSizeshNQ4ISI = sideArr;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean isEmpty() {
        return value().isEmpty();
    }

    public com.microblink.blinkid.geometry.Rectangle location(com.microblink.blinkid.entities.recognizers.blinkid.generic.AlphabetType alphabetType) {
        return this.getHighSpeedVideoFpsRanges[alphabetType.ordinal()];
    }

    public com.microblink.blinkid.entities.recognizers.blinkid.generic.Side side(com.microblink.blinkid.entities.recognizers.blinkid.generic.AlphabetType alphabetType) {
        return this.getHighResolutionOutputSizeshNQ4ISI[alphabetType.ordinal()];
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (java.lang.String str : this.getHighSpeedVideoFpsRangesFor) {
            if (str != null && !str.isEmpty()) {
                sb.append(str);
                sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
            }
        }
        if (sb.length() != 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    public java.lang.String value() {
        for (java.lang.String str : this.getHighSpeedVideoFpsRangesFor) {
            if (!str.isEmpty()) {
                return str;
            }
        }
        return "";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeStringArray(this.getHighSpeedVideoFpsRangesFor);
        parcel.writeParcelableArray(this.getHighSpeedVideoFpsRanges, i);
        int[] iArr = new int[this.getHighResolutionOutputSizeshNQ4ISI.length];
        int i2 = 0;
        while (true) {
            com.microblink.blinkid.entities.recognizers.blinkid.generic.Side[] sideArr = this.getHighResolutionOutputSizeshNQ4ISI;
            if (i2 >= sideArr.length) {
                parcel.writeInt(sideArr.length);
                parcel.writeIntArray(iArr);
                return;
            } else {
                com.microblink.blinkid.entities.recognizers.blinkid.generic.Side side = sideArr[i2];
                if (side == null) {
                    iArr[i2] = -1;
                } else {
                    iArr[i2] = side.ordinal();
                }
                i2++;
            }
        }
    }

    public java.lang.String value(com.microblink.blinkid.entities.recognizers.blinkid.generic.AlphabetType alphabetType) {
        return this.getHighSpeedVideoFpsRangesFor[alphabetType.ordinal()];
    }

    StringResult(android.os.Parcel parcel) {
        this.getHighSpeedVideoFpsRangesFor = parcel.createStringArray();
        android.os.Parcelable[] readParcelableArray = parcel.readParcelableArray(com.microblink.blinkid.geometry.Rectangle.class.getClassLoader());
        this.getHighSpeedVideoFpsRanges = new com.microblink.blinkid.geometry.Rectangle[readParcelableArray.length];
        for (int i = 0; i < readParcelableArray.length; i++) {
            this.getHighSpeedVideoFpsRanges[i] = (com.microblink.blinkid.geometry.Rectangle) readParcelableArray[i];
        }
        int readInt = parcel.readInt();
        int[] iArr = new int[readInt];
        parcel.readIntArray(iArr);
        this.getHighResolutionOutputSizeshNQ4ISI = new com.microblink.blinkid.entities.recognizers.blinkid.generic.Side[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            if (iArr[i2] == -1) {
                this.getHighResolutionOutputSizeshNQ4ISI[i2] = null;
            } else {
                this.getHighResolutionOutputSizeshNQ4ISI[i2] = com.microblink.blinkid.entities.recognizers.blinkid.generic.Side.values()[iArr[i2]];
            }
        }
    }
}
