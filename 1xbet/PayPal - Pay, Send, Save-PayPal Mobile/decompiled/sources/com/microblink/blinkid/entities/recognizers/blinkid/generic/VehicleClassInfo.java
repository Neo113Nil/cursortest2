package com.microblink.blinkid.entities.recognizers.blinkid.generic;

/* loaded from: classes10.dex */
public final class VehicleClassInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.blinkid.generic.VehicleClassInfo> CREATOR = new android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.blinkid.generic.VehicleClassInfo>() { // from class: com.microblink.blinkid.entities.recognizers.blinkid.generic.VehicleClassInfo.1
        @Override // android.os.Parcelable.Creator
        public /* synthetic */ com.microblink.blinkid.entities.recognizers.blinkid.generic.VehicleClassInfo createFromParcel(android.os.Parcel parcel) {
            return new com.microblink.blinkid.entities.recognizers.blinkid.generic.VehicleClassInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ com.microblink.blinkid.entities.recognizers.blinkid.generic.VehicleClassInfo[] newArray(int i) {
            return new com.microblink.blinkid.entities.recognizers.blinkid.generic.VehicleClassInfo[i];
        }
    };
    private final com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult Camera2StreamConfigurationMap;
    private final com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult getHighResolutionOutputSizeshNQ4ISI;
    private final com.microblink.blinkid.entities.recognizers.blinkid.generic.DateResult getHighSpeedVideoFpsRangesFor;
    private final com.microblink.blinkid.entities.recognizers.blinkid.generic.DateResult getHighSpeedVideoSizes;

    private VehicleClassInfo(com.microblink.blinkid.entities.recognizers.blinkid.generic.DateResult dateResult, com.microblink.blinkid.entities.recognizers.blinkid.generic.DateResult dateResult2, com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult stringResult, com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult stringResult2) {
        this.getHighSpeedVideoFpsRangesFor = dateResult;
        this.getHighSpeedVideoSizes = dateResult2;
        this.Camera2StreamConfigurationMap = stringResult;
        this.getHighResolutionOutputSizeshNQ4ISI = stringResult2;
    }

    public static com.microblink.blinkid.entities.recognizers.blinkid.generic.VehicleClassInfo createFromNative(com.microblink.blinkid.entities.recognizers.blinkid.generic.DateResult dateResult, com.microblink.blinkid.entities.recognizers.blinkid.generic.DateResult dateResult2, com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult stringResult, com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult stringResult2) {
        return new com.microblink.blinkid.entities.recognizers.blinkid.generic.VehicleClassInfo(dateResult, dateResult2, stringResult, stringResult2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final com.microblink.blinkid.entities.recognizers.blinkid.generic.DateResult getEffectiveDate() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final com.microblink.blinkid.entities.recognizers.blinkid.generic.DateResult getExpiryDate() {
        return this.getHighSpeedVideoSizes;
    }

    public final com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult getLicenceType() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult getVehicleClass() {
        return this.Camera2StreamConfigurationMap;
    }

    public final boolean isEmpty() {
        com.microblink.blinkid.entities.recognizers.blinkid.generic.DateResult dateResult = this.getHighSpeedVideoFpsRangesFor;
        if (dateResult != null && !dateResult.getOriginalDateString().isEmpty()) {
            return false;
        }
        com.microblink.blinkid.entities.recognizers.blinkid.generic.DateResult dateResult2 = this.getHighSpeedVideoSizes;
        if (dateResult2 != null && !dateResult2.getOriginalDateString().isEmpty()) {
            return false;
        }
        com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult stringResult = this.Camera2StreamConfigurationMap;
        if (stringResult != null && !stringResult.isEmpty()) {
            return false;
        }
        com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult stringResult2 = this.getHighResolutionOutputSizeshNQ4ISI;
        return stringResult2 == null || stringResult2.isEmpty();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.Camera2StreamConfigurationMap != null) {
            sb.append("Vehicle class: ");
            sb.append(this.Camera2StreamConfigurationMap);
            sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
        }
        if (this.getHighResolutionOutputSizeshNQ4ISI != null) {
            sb.append("Licence type: ");
            sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
            sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
        }
        if (this.getHighSpeedVideoFpsRangesFor != null) {
            sb.append("Effective date: ");
            sb.append(this.getHighSpeedVideoFpsRangesFor.getOriginalDateString());
            sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
        }
        if (this.getHighSpeedVideoSizes != null) {
            sb.append("Expiry date: ");
            sb.append(this.getHighSpeedVideoSizes.getOriginalDateString());
            sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeParcelable(this.getHighSpeedVideoFpsRangesFor, i);
        parcel.writeParcelable(this.getHighSpeedVideoSizes, i);
        parcel.writeParcelable(this.Camera2StreamConfigurationMap, i);
        parcel.writeParcelable(this.getHighResolutionOutputSizeshNQ4ISI, i);
    }

    VehicleClassInfo(android.os.Parcel parcel) {
        this.getHighSpeedVideoFpsRangesFor = (com.microblink.blinkid.entities.recognizers.blinkid.generic.DateResult) parcel.readParcelable(com.microblink.blinkid.entities.recognizers.blinkid.generic.DateResult.class.getClassLoader());
        this.getHighSpeedVideoSizes = (com.microblink.blinkid.entities.recognizers.blinkid.generic.DateResult) parcel.readParcelable(com.microblink.blinkid.entities.recognizers.blinkid.generic.DateResult.class.getClassLoader());
        this.Camera2StreamConfigurationMap = (com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult) parcel.readParcelable(com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult.class.getClassLoader());
        this.getHighResolutionOutputSizeshNQ4ISI = (com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult) parcel.readParcelable(com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult.class.getClassLoader());
    }
}
