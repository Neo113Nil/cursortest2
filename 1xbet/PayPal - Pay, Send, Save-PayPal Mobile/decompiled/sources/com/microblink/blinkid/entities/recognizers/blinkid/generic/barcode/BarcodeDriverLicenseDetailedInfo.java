package com.microblink.blinkid.entities.recognizers.blinkid.generic.barcode;

/* loaded from: classes10.dex */
public final class BarcodeDriverLicenseDetailedInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.blinkid.generic.barcode.BarcodeDriverLicenseDetailedInfo> CREATOR = new android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.blinkid.generic.barcode.BarcodeDriverLicenseDetailedInfo>() { // from class: com.microblink.blinkid.entities.recognizers.blinkid.generic.barcode.BarcodeDriverLicenseDetailedInfo.1
        @Override // android.os.Parcelable.Creator
        public /* synthetic */ com.microblink.blinkid.entities.recognizers.blinkid.generic.barcode.BarcodeDriverLicenseDetailedInfo createFromParcel(android.os.Parcel parcel) {
            return new com.microblink.blinkid.entities.recognizers.blinkid.generic.barcode.BarcodeDriverLicenseDetailedInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ com.microblink.blinkid.entities.recognizers.blinkid.generic.barcode.BarcodeDriverLicenseDetailedInfo[] newArray(int i) {
            return new com.microblink.blinkid.entities.recognizers.blinkid.generic.barcode.BarcodeDriverLicenseDetailedInfo[i];
        }
    };
    private final java.lang.String Camera2StreamConfigurationMap;
    private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    private final java.lang.String getHighSpeedVideoFpsRanges;
    private final com.microblink.blinkid.entities.recognizers.blinkid.generic.barcode.BarcodeVehicleClassInfo[] getHighSpeedVideoFpsRangesFor;
    private final java.lang.String getHighSpeedVideoSizes;

    private BarcodeDriverLicenseDetailedInfo(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.microblink.blinkid.entities.recognizers.blinkid.generic.barcode.BarcodeVehicleClassInfo[] barcodeVehicleClassInfoArr) {
        this.getHighResolutionOutputSizeshNQ4ISI = str;
        this.getHighSpeedVideoFpsRanges = str2;
        this.Camera2StreamConfigurationMap = str3;
        this.getHighSpeedVideoFpsRangesFor = barcodeVehicleClassInfoArr;
        this.getHighSpeedVideoSizes = str4;
    }

    public static com.microblink.blinkid.entities.recognizers.blinkid.generic.barcode.BarcodeDriverLicenseDetailedInfo createFromNative(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.microblink.blinkid.entities.recognizers.blinkid.generic.barcode.BarcodeVehicleClassInfo[] barcodeVehicleClassInfoArr) {
        return new com.microblink.blinkid.entities.recognizers.blinkid.generic.barcode.BarcodeDriverLicenseDetailedInfo(str, str2, str3, str4, barcodeVehicleClassInfoArr);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final java.lang.String getConditions() {
        return this.getHighSpeedVideoSizes;
    }

    public final java.lang.String getEndorsements() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final java.lang.String getRestrictions() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final java.lang.String getVehicleClass() {
        return this.Camera2StreamConfigurationMap;
    }

    public final com.microblink.blinkid.entities.recognizers.blinkid.generic.barcode.BarcodeVehicleClassInfo[] getVehicleClassesInfo() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final boolean isEmpty() {
        return this.getHighResolutionOutputSizeshNQ4ISI.isEmpty() && this.getHighSpeedVideoFpsRanges.isEmpty() && this.Camera2StreamConfigurationMap.isEmpty() && this.getHighSpeedVideoSizes.isEmpty() && this.getHighSpeedVideoFpsRangesFor.length == 0;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Restrictions: ");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append("\nEndorsements: ");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append("\nVehicle class: ");
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append("\nConditions: ");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
        for (com.microblink.blinkid.entities.recognizers.blinkid.generic.barcode.BarcodeVehicleClassInfo barcodeVehicleClassInfo : this.getHighSpeedVideoFpsRangesFor) {
            sb.append(barcodeVehicleClassInfo);
            sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.getHighResolutionOutputSizeshNQ4ISI);
        parcel.writeString(this.getHighSpeedVideoFpsRanges);
        parcel.writeString(this.Camera2StreamConfigurationMap);
        parcel.writeParcelableArray(this.getHighSpeedVideoFpsRangesFor, i);
        parcel.writeString(this.getHighSpeedVideoSizes);
    }

    BarcodeDriverLicenseDetailedInfo(android.os.Parcel parcel) {
        this.getHighResolutionOutputSizeshNQ4ISI = parcel.readString();
        this.getHighSpeedVideoFpsRanges = parcel.readString();
        this.Camera2StreamConfigurationMap = parcel.readString();
        android.os.Parcelable[] readParcelableArray = parcel.readParcelableArray(com.microblink.blinkid.entities.recognizers.blinkid.generic.barcode.BarcodeVehicleClassInfo.class.getClassLoader());
        this.getHighSpeedVideoFpsRangesFor = new com.microblink.blinkid.entities.recognizers.blinkid.generic.barcode.BarcodeVehicleClassInfo[readParcelableArray.length];
        int i = 0;
        while (true) {
            com.microblink.blinkid.entities.recognizers.blinkid.generic.barcode.BarcodeVehicleClassInfo[] barcodeVehicleClassInfoArr = this.getHighSpeedVideoFpsRangesFor;
            if (i < barcodeVehicleClassInfoArr.length) {
                barcodeVehicleClassInfoArr[i] = (com.microblink.blinkid.entities.recognizers.blinkid.generic.barcode.BarcodeVehicleClassInfo) readParcelableArray[i];
                i++;
            } else {
                this.getHighSpeedVideoSizes = parcel.readString();
                return;
            }
        }
    }
}
