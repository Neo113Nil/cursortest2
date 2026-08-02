package com.microblink.blinkid.entities.recognizers.blinkid.generic.barcode;

/* loaded from: classes10.dex */
public final class BarcodeVehicleClassInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.blinkid.generic.barcode.BarcodeVehicleClassInfo> CREATOR = new android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.blinkid.generic.barcode.BarcodeVehicleClassInfo>() { // from class: com.microblink.blinkid.entities.recognizers.blinkid.generic.barcode.BarcodeVehicleClassInfo.1
        @Override // android.os.Parcelable.Creator
        public /* synthetic */ com.microblink.blinkid.entities.recognizers.blinkid.generic.barcode.BarcodeVehicleClassInfo createFromParcel(android.os.Parcel parcel) {
            return new com.microblink.blinkid.entities.recognizers.blinkid.generic.barcode.BarcodeVehicleClassInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ com.microblink.blinkid.entities.recognizers.blinkid.generic.barcode.BarcodeVehicleClassInfo[] newArray(int i) {
            return new com.microblink.blinkid.entities.recognizers.blinkid.generic.barcode.BarcodeVehicleClassInfo[i];
        }
    };
    private final com.microblink.blinkid.results.date.Date Camera2StreamConfigurationMap;
    private final com.microblink.blinkid.results.date.Date getHighResolutionOutputSizeshNQ4ISI;
    private final java.lang.String getHighSpeedVideoFpsRanges;
    private final java.lang.String getHighSpeedVideoFpsRangesFor;

    private BarcodeVehicleClassInfo(com.microblink.blinkid.results.date.Date date, com.microblink.blinkid.results.date.Date date2, java.lang.String str, java.lang.String str2) {
        this.Camera2StreamConfigurationMap = date;
        this.getHighResolutionOutputSizeshNQ4ISI = date2;
        this.getHighSpeedVideoFpsRangesFor = str;
        this.getHighSpeedVideoFpsRanges = str2;
    }

    public static com.microblink.blinkid.entities.recognizers.blinkid.generic.barcode.BarcodeVehicleClassInfo createFromNative(com.microblink.blinkid.results.date.Date date, com.microblink.blinkid.results.date.Date date2, java.lang.String str, java.lang.String str2) {
        return new com.microblink.blinkid.entities.recognizers.blinkid.generic.barcode.BarcodeVehicleClassInfo(date, date2, str, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final com.microblink.blinkid.results.date.Date getEffectiveDate() {
        return this.Camera2StreamConfigurationMap;
    }

    public final com.microblink.blinkid.results.date.Date getExpiryDate() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final java.lang.String getLicenceType() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final java.lang.String getVehicleClass() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final boolean isEmpty() {
        return this.Camera2StreamConfigurationMap.getOriginalDateString().isEmpty() && this.getHighResolutionOutputSizeshNQ4ISI.getOriginalDateString().isEmpty() && this.getHighSpeedVideoFpsRangesFor.isEmpty() && this.getHighSpeedVideoFpsRanges.isEmpty();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.getHighSpeedVideoFpsRangesFor != null) {
            sb.append("Vehicle class: ");
            sb.append(this.getHighSpeedVideoFpsRangesFor);
            sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
        }
        if (this.getHighSpeedVideoFpsRanges != null) {
            sb.append("Licence type: ");
            sb.append(this.getHighSpeedVideoFpsRanges);
            sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
        }
        if (this.Camera2StreamConfigurationMap != null) {
            sb.append("Effective date: ");
            sb.append(this.Camera2StreamConfigurationMap.getOriginalDateString());
            sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
        }
        if (this.getHighResolutionOutputSizeshNQ4ISI != null) {
            sb.append("Expiry date: ");
            sb.append(this.getHighResolutionOutputSizeshNQ4ISI.getOriginalDateString());
            sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeParcelable(this.Camera2StreamConfigurationMap, i);
        parcel.writeParcelable(this.getHighResolutionOutputSizeshNQ4ISI, i);
        parcel.writeString(this.getHighSpeedVideoFpsRangesFor);
        parcel.writeString(this.getHighSpeedVideoFpsRanges);
    }

    BarcodeVehicleClassInfo(android.os.Parcel parcel) {
        this.Camera2StreamConfigurationMap = (com.microblink.blinkid.results.date.Date) parcel.readParcelable(com.microblink.blinkid.results.date.Date.class.getClassLoader());
        this.getHighResolutionOutputSizeshNQ4ISI = (com.microblink.blinkid.results.date.Date) parcel.readParcelable(com.microblink.blinkid.results.date.Date.class.getClassLoader());
        this.getHighSpeedVideoFpsRangesFor = parcel.readString();
        this.getHighSpeedVideoFpsRanges = parcel.readString();
    }
}
