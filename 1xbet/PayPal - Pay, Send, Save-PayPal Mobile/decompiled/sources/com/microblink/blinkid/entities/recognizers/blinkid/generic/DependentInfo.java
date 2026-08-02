package com.microblink.blinkid.entities.recognizers.blinkid.generic;

/* loaded from: classes10.dex */
public final class DependentInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.blinkid.generic.DependentInfo> CREATOR = new android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.blinkid.generic.DependentInfo>() { // from class: com.microblink.blinkid.entities.recognizers.blinkid.generic.DependentInfo.1
        @Override // android.os.Parcelable.Creator
        public /* synthetic */ com.microblink.blinkid.entities.recognizers.blinkid.generic.DependentInfo createFromParcel(android.os.Parcel parcel) {
            return new com.microblink.blinkid.entities.recognizers.blinkid.generic.DependentInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ com.microblink.blinkid.entities.recognizers.blinkid.generic.DependentInfo[] newArray(int i) {
            return new com.microblink.blinkid.entities.recognizers.blinkid.generic.DependentInfo[i];
        }
    };
    private final com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult Camera2StreamConfigurationMap;
    private final com.microblink.blinkid.entities.recognizers.blinkid.generic.DateResult getHighResolutionOutputSizeshNQ4ISI;
    private final com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult getHighSpeedVideoFpsRangesFor;
    private final com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult getHighSpeedVideoSizes;

    private DependentInfo(com.microblink.blinkid.entities.recognizers.blinkid.generic.DateResult dateResult, com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult stringResult, com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult stringResult2, com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult stringResult3) {
        this.getHighResolutionOutputSizeshNQ4ISI = dateResult;
        this.getHighSpeedVideoFpsRangesFor = stringResult;
        this.getHighSpeedVideoSizes = stringResult2;
        this.Camera2StreamConfigurationMap = stringResult3;
    }

    public static com.microblink.blinkid.entities.recognizers.blinkid.generic.DependentInfo createFromNative(com.microblink.blinkid.entities.recognizers.blinkid.generic.DateResult dateResult, com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult stringResult, com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult stringResult2, com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult stringResult3) {
        return new com.microblink.blinkid.entities.recognizers.blinkid.generic.DependentInfo(dateResult, stringResult, stringResult2, stringResult3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final com.microblink.blinkid.entities.recognizers.blinkid.generic.DateResult getDateOfBirth() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult getDocumentNumber() {
        return this.getHighSpeedVideoSizes;
    }

    public final com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult getFullName() {
        return this.Camera2StreamConfigurationMap;
    }

    public final com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult getSex() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final boolean isEmpty() {
        com.microblink.blinkid.entities.recognizers.blinkid.generic.DateResult dateResult = this.getHighResolutionOutputSizeshNQ4ISI;
        if (dateResult != null && !dateResult.getOriginalDateString().isEmpty()) {
            return false;
        }
        com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult stringResult = this.getHighSpeedVideoFpsRangesFor;
        if (stringResult != null && !stringResult.isEmpty()) {
            return false;
        }
        com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult stringResult2 = this.getHighSpeedVideoSizes;
        if (stringResult2 != null && !stringResult2.isEmpty()) {
            return false;
        }
        com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult stringResult3 = this.Camera2StreamConfigurationMap;
        return stringResult3 == null || stringResult3.isEmpty();
    }

    public final java.lang.String toString() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (this.getHighResolutionOutputSizeshNQ4ISI != null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Date of Birth: ");
            sb.append(this.getHighResolutionOutputSizeshNQ4ISI.getOriginalDateString());
            arrayList.add(sb.toString());
        }
        if (this.getHighSpeedVideoFpsRangesFor != null) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Sex: ");
            sb2.append(this.getHighSpeedVideoFpsRangesFor);
            arrayList.add(sb2.toString());
        }
        if (this.getHighSpeedVideoSizes != null) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Document number: ");
            sb3.append(this.getHighSpeedVideoSizes);
            arrayList.add(sb3.toString());
        }
        if (this.Camera2StreamConfigurationMap != null) {
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder("Full name: ");
            sb4.append(this.Camera2StreamConfigurationMap);
            arrayList.add(sb4.toString());
        }
        java.lang.StringBuilder sb5 = new java.lang.StringBuilder("{");
        sb5.append(java.lang.String.join(", ", arrayList));
        sb5.append("}");
        return sb5.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeParcelable(this.getHighResolutionOutputSizeshNQ4ISI, i);
        parcel.writeParcelable(this.getHighSpeedVideoFpsRangesFor, i);
        parcel.writeParcelable(this.getHighSpeedVideoSizes, i);
        parcel.writeParcelable(this.Camera2StreamConfigurationMap, i);
    }

    DependentInfo(android.os.Parcel parcel) {
        this.getHighResolutionOutputSizeshNQ4ISI = (com.microblink.blinkid.entities.recognizers.blinkid.generic.DateResult) parcel.readParcelable(com.microblink.blinkid.entities.recognizers.blinkid.generic.DateResult.class.getClassLoader());
        this.getHighSpeedVideoFpsRangesFor = (com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult) parcel.readParcelable(com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult.class.getClassLoader());
        this.getHighSpeedVideoSizes = (com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult) parcel.readParcelable(com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult.class.getClassLoader());
        this.Camera2StreamConfigurationMap = (com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult) parcel.readParcelable(com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult.class.getClassLoader());
    }
}
