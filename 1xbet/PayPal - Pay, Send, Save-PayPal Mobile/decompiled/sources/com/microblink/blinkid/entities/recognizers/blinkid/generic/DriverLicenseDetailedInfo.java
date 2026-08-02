package com.microblink.blinkid.entities.recognizers.blinkid.generic;

/* loaded from: classes10.dex */
public final class DriverLicenseDetailedInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.blinkid.generic.DriverLicenseDetailedInfo> CREATOR = new android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.blinkid.generic.DriverLicenseDetailedInfo>() { // from class: com.microblink.blinkid.entities.recognizers.blinkid.generic.DriverLicenseDetailedInfo.1
        @Override // android.os.Parcelable.Creator
        public /* synthetic */ com.microblink.blinkid.entities.recognizers.blinkid.generic.DriverLicenseDetailedInfo createFromParcel(android.os.Parcel parcel) {
            return new com.microblink.blinkid.entities.recognizers.blinkid.generic.DriverLicenseDetailedInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ com.microblink.blinkid.entities.recognizers.blinkid.generic.DriverLicenseDetailedInfo[] newArray(int i) {
            return new com.microblink.blinkid.entities.recognizers.blinkid.generic.DriverLicenseDetailedInfo[i];
        }
    };
    private final com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult Camera2StreamConfigurationMap;
    private final com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult getHighResolutionOutputSizeshNQ4ISI;
    private final com.microblink.blinkid.entities.recognizers.blinkid.generic.VehicleClassInfo[] getHighSpeedVideoFpsRanges;
    private final com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult getHighSpeedVideoFpsRangesFor;
    private final com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult getHighSpeedVideoSizes;

    private DriverLicenseDetailedInfo(com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult stringResult, com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult stringResult2, com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult stringResult3, com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult stringResult4, com.microblink.blinkid.entities.recognizers.blinkid.generic.VehicleClassInfo[] vehicleClassInfoArr) {
        this.getHighSpeedVideoFpsRangesFor = stringResult;
        this.Camera2StreamConfigurationMap = stringResult2;
        this.getHighResolutionOutputSizeshNQ4ISI = stringResult3;
        this.getHighSpeedVideoFpsRanges = vehicleClassInfoArr;
        this.getHighSpeedVideoSizes = stringResult4;
    }

    public static com.microblink.blinkid.entities.recognizers.blinkid.generic.DriverLicenseDetailedInfo createFromNative(com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult stringResult, com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult stringResult2, com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult stringResult3, com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult stringResult4, com.microblink.blinkid.entities.recognizers.blinkid.generic.VehicleClassInfo[] vehicleClassInfoArr) {
        return new com.microblink.blinkid.entities.recognizers.blinkid.generic.DriverLicenseDetailedInfo(stringResult, stringResult2, stringResult3, stringResult4, vehicleClassInfoArr);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult getConditions() {
        return this.getHighSpeedVideoSizes;
    }

    public final com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult getEndorsements() {
        return this.Camera2StreamConfigurationMap;
    }

    public final com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult getRestrictions() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult getVehicleClass() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final com.microblink.blinkid.entities.recognizers.blinkid.generic.VehicleClassInfo[] getVehicleClassesInfo() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final boolean isEmpty() {
        com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult stringResult = this.getHighSpeedVideoFpsRangesFor;
        if (stringResult != null && !stringResult.isEmpty()) {
            return false;
        }
        com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult stringResult2 = this.Camera2StreamConfigurationMap;
        if (stringResult2 != null && !stringResult2.isEmpty()) {
            return false;
        }
        com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult stringResult3 = this.getHighResolutionOutputSizeshNQ4ISI;
        if (stringResult3 != null && !stringResult3.isEmpty()) {
            return false;
        }
        com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult stringResult4 = this.getHighSpeedVideoSizes;
        return (stringResult4 == null || stringResult4.isEmpty()) && this.getHighSpeedVideoFpsRanges.length == 0;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Restrictions: ");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append("\nEndorsements: ");
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append("\nVehicle class: ");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append("\nConditions: ");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append("\n\n");
        for (com.microblink.blinkid.entities.recognizers.blinkid.generic.VehicleClassInfo vehicleClassInfo : this.getHighSpeedVideoFpsRanges) {
            sb.append(vehicleClassInfo);
            sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeParcelable(this.getHighSpeedVideoFpsRangesFor, i);
        parcel.writeParcelable(this.Camera2StreamConfigurationMap, i);
        parcel.writeParcelable(this.getHighResolutionOutputSizeshNQ4ISI, i);
        parcel.writeParcelableArray(this.getHighSpeedVideoFpsRanges, i);
        parcel.writeParcelable(this.getHighSpeedVideoSizes, i);
    }

    DriverLicenseDetailedInfo(android.os.Parcel parcel) {
        this.getHighSpeedVideoFpsRangesFor = (com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult) parcel.readParcelable(com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult.class.getClassLoader());
        this.Camera2StreamConfigurationMap = (com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult) parcel.readParcelable(com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult.class.getClassLoader());
        this.getHighResolutionOutputSizeshNQ4ISI = (com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult) parcel.readParcelable(com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult.class.getClassLoader());
        android.os.Parcelable[] readParcelableArray = parcel.readParcelableArray(com.microblink.blinkid.entities.recognizers.blinkid.generic.VehicleClassInfo.class.getClassLoader());
        this.getHighSpeedVideoFpsRanges = new com.microblink.blinkid.entities.recognizers.blinkid.generic.VehicleClassInfo[readParcelableArray.length];
        int i = 0;
        while (true) {
            com.microblink.blinkid.entities.recognizers.blinkid.generic.VehicleClassInfo[] vehicleClassInfoArr = this.getHighSpeedVideoFpsRanges;
            if (i < vehicleClassInfoArr.length) {
                vehicleClassInfoArr[i] = (com.microblink.blinkid.entities.recognizers.blinkid.generic.VehicleClassInfo) readParcelableArray[i];
                i++;
            } else {
                this.getHighSpeedVideoSizes = (com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult) parcel.readParcelable(com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult.class.getClassLoader());
                return;
            }
        }
    }
}
