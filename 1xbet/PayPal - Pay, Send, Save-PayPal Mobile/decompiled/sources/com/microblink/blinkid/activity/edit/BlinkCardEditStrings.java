package com.microblink.blinkid.activity.edit;

/* loaded from: classes9.dex */
public class BlinkCardEditStrings implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.microblink.blinkid.activity.edit.BlinkCardEditStrings> CREATOR = new android.os.Parcelable.Creator<com.microblink.blinkid.activity.edit.BlinkCardEditStrings>() { // from class: com.microblink.blinkid.activity.edit.BlinkCardEditStrings.1
        @Override // android.os.Parcelable.Creator
        public /* synthetic */ com.microblink.blinkid.activity.edit.BlinkCardEditStrings createFromParcel(android.os.Parcel parcel) {
            return new com.microblink.blinkid.activity.edit.BlinkCardEditStrings(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ com.microblink.blinkid.activity.edit.BlinkCardEditStrings[] newArray(int i) {
            return new com.microblink.blinkid.activity.edit.BlinkCardEditStrings[i];
        }
    };
    final java.lang.String Camera2StreamConfigurationMap;
    public final java.lang.String errorCardExpired;
    public final java.lang.String errorInvalidCardNumber;
    public final java.lang.String errorInvalidDate;
    public final java.lang.String errorInvalidIban;
    public final java.lang.String errorInvalidSecurityCode;
    public final java.lang.String errorRequiredFieldMissing;
    final java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    final java.lang.String getHighSpeedVideoFpsRanges;
    final java.lang.String getHighSpeedVideoFpsRangesFor;
    final java.lang.String getHighSpeedVideoSizes;
    final java.lang.String getHighSpeedVideoSizesFor;
    final java.lang.String getInputFormats;
    final java.lang.String getInputSizeshNQ4ISI;
    final java.lang.String getOutputFormats;
    final java.lang.String getOutputMinFrameDuration;

    public static class Builder {
        java.lang.String Camera2StreamConfigurationMap;
        java.lang.String getHighResolutionOutputSizeshNQ4ISI;
        java.lang.String getHighSpeedVideoFpsRanges;
        java.lang.String getHighSpeedVideoFpsRangesFor;
        java.lang.String getHighSpeedVideoSizes;
        java.lang.String getHighSpeedVideoSizesFor;
        java.lang.String getInputFormats;
        java.lang.String getInputSizeshNQ4ISI;
        java.lang.String getOutputFormats;
        java.lang.String getOutputMinFrameDuration;
        java.lang.String getOutputMinFrameDurationlomOqCM;
        java.lang.String getOutputSizes;
        java.lang.String getOutputSizeshNQ4ISI;
        java.lang.String getOutputStallDuration;
        java.lang.String getOutputStallDurationlomOqCM;
        java.lang.String toString;

        public Builder(android.content.Context context) {
            this.getOutputStallDurationlomOqCM = context.getString(com.microblink.blinkid.library.R.string.mb_edit_results_title);
            this.getHighSpeedVideoFpsRanges = context.getString(com.microblink.blinkid.library.R.string.mb_edit_results_confirm);
            this.getInputSizeshNQ4ISI = context.getString(com.microblink.blinkid.library.R.string.mb_edit_default_hint);
            this.getOutputMinFrameDurationlomOqCM = context.getString(com.microblink.blinkid.library.R.string.mb_edit_results_card_number);
            this.Camera2StreamConfigurationMap = context.getString(com.microblink.blinkid.library.R.string.mb_edit_results_expiry);
            this.getHighSpeedVideoSizesFor = context.getString(com.microblink.blinkid.library.R.string.mb_edit_results_iban);
            this.getOutputStallDuration = context.getString(com.microblink.blinkid.library.R.string.mb_edit_results_security_code);
            this.getHighSpeedVideoFpsRangesFor = context.getString(com.microblink.blinkid.library.R.string.mb_edit_results_owner);
            this.getOutputFormats = context.getString(com.microblink.blinkid.library.R.string.mb_edit_error_invalid_card_number);
            this.getOutputSizes = context.getString(com.microblink.blinkid.library.R.string.mb_edit_error_expired);
            this.getHighSpeedVideoSizes = context.getString(com.microblink.blinkid.library.R.string.mb_edit_error_invalid_expiry_date);
            this.toString = context.getString(com.microblink.blinkid.library.R.string.mb_edit_error_invalid_iban);
            this.getInputFormats = context.getString(com.microblink.blinkid.library.R.string.mb_edit_error_invalid_security_code);
            this.getOutputMinFrameDuration = context.getString(com.microblink.blinkid.library.R.string.mb_edit_error_required_field);
            this.getHighResolutionOutputSizeshNQ4ISI = context.getString(com.microblink.blinkid.library.R.string.mb_edit_error_dialog_msg);
            this.getOutputSizeshNQ4ISI = context.getString(android.R.string.ok);
        }

        public com.microblink.blinkid.activity.edit.BlinkCardEditStrings build() {
            return new com.microblink.blinkid.activity.edit.BlinkCardEditStrings(this.getOutputStallDurationlomOqCM, this.getHighSpeedVideoFpsRanges, this.getInputSizeshNQ4ISI, this.getOutputMinFrameDurationlomOqCM, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizesFor, this.getOutputStallDuration, this.getHighSpeedVideoFpsRangesFor, this.getOutputFormats, this.getOutputSizes, this.getHighSpeedVideoSizes, this.toString, this.getInputFormats, this.getOutputMinFrameDuration, this.getHighResolutionOutputSizeshNQ4ISI, this.getOutputSizeshNQ4ISI);
        }

        public com.microblink.blinkid.activity.edit.BlinkCardEditStrings.Builder setButton(java.lang.String str) {
            this.getHighSpeedVideoFpsRanges = str;
            return this;
        }

        public com.microblink.blinkid.activity.edit.BlinkCardEditStrings.Builder setErrorCardExpired(java.lang.String str) {
            this.getOutputSizes = str;
            return this;
        }

        public com.microblink.blinkid.activity.edit.BlinkCardEditStrings.Builder setErrorDialogButton(java.lang.String str) {
            this.getOutputSizeshNQ4ISI = str;
            return this;
        }

        public com.microblink.blinkid.activity.edit.BlinkCardEditStrings.Builder setErrorDialogMessage(java.lang.String str) {
            this.getHighResolutionOutputSizeshNQ4ISI = str;
            return this;
        }

        public com.microblink.blinkid.activity.edit.BlinkCardEditStrings.Builder setErrorInvalidCardNumber(java.lang.String str) {
            this.getOutputFormats = str;
            return this;
        }

        public com.microblink.blinkid.activity.edit.BlinkCardEditStrings.Builder setErrorInvalidDate(java.lang.String str) {
            this.getHighSpeedVideoSizes = str;
            return this;
        }

        public com.microblink.blinkid.activity.edit.BlinkCardEditStrings.Builder setErrorInvalidIban(java.lang.String str) {
            this.toString = str;
            return this;
        }

        public com.microblink.blinkid.activity.edit.BlinkCardEditStrings.Builder setErrorInvalidSecurityCode(java.lang.String str) {
            this.getInputFormats = str;
            return this;
        }

        public com.microblink.blinkid.activity.edit.BlinkCardEditStrings.Builder setErrorRequiredFieldMissing(java.lang.String str) {
            this.getOutputMinFrameDuration = str;
            return this;
        }

        public com.microblink.blinkid.activity.edit.BlinkCardEditStrings.Builder setLabelCardNumber(java.lang.String str) {
            this.getOutputMinFrameDurationlomOqCM = str;
            return this;
        }

        public com.microblink.blinkid.activity.edit.BlinkCardEditStrings.Builder setLabelCardholderName(java.lang.String str) {
            this.getHighSpeedVideoFpsRangesFor = str;
            return this;
        }

        public com.microblink.blinkid.activity.edit.BlinkCardEditStrings.Builder setLabelExpiryDate(java.lang.String str) {
            this.Camera2StreamConfigurationMap = str;
            return this;
        }

        public com.microblink.blinkid.activity.edit.BlinkCardEditStrings.Builder setLabelIban(java.lang.String str) {
            this.getHighSpeedVideoSizesFor = str;
            return this;
        }

        public com.microblink.blinkid.activity.edit.BlinkCardEditStrings.Builder setLabelSecurityCode(java.lang.String str) {
            this.getOutputStallDuration = str;
            return this;
        }

        public com.microblink.blinkid.activity.edit.BlinkCardEditStrings.Builder setRequiredFieldHint(java.lang.String str) {
            this.getInputSizeshNQ4ISI = str;
            return this;
        }

        public com.microblink.blinkid.activity.edit.BlinkCardEditStrings.Builder setTitle(java.lang.String str) {
            this.getOutputStallDurationlomOqCM = str;
            return this;
        }
    }

    BlinkCardEditStrings(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, java.lang.String str11, java.lang.String str12, java.lang.String str13, java.lang.String str14, java.lang.String str15, java.lang.String str16) {
        this.getOutputFormats = str;
        this.Camera2StreamConfigurationMap = str2;
        this.getHighResolutionOutputSizeshNQ4ISI = str3;
        this.getInputFormats = str4;
        this.getHighSpeedVideoSizes = str5;
        this.getOutputMinFrameDuration = str6;
        this.getHighSpeedVideoSizesFor = str7;
        this.getHighSpeedVideoFpsRanges = str8;
        this.errorInvalidCardNumber = str9;
        this.errorCardExpired = str10;
        this.errorInvalidDate = str11;
        this.errorInvalidIban = str12;
        this.errorInvalidSecurityCode = str13;
        this.errorRequiredFieldMissing = str14;
        this.getHighSpeedVideoFpsRangesFor = str15;
        this.getInputSizeshNQ4ISI = str16;
    }

    public static com.microblink.blinkid.activity.edit.BlinkCardEditStrings createDefault(android.content.Context context) {
        return new com.microblink.blinkid.activity.edit.BlinkCardEditStrings.Builder(context).build();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.getOutputFormats);
        parcel.writeString(this.Camera2StreamConfigurationMap);
        parcel.writeString(this.getHighResolutionOutputSizeshNQ4ISI);
        parcel.writeString(this.getInputFormats);
        parcel.writeString(this.getHighSpeedVideoSizes);
        parcel.writeString(this.getOutputMinFrameDuration);
        parcel.writeString(this.getHighSpeedVideoSizesFor);
        parcel.writeString(this.getHighSpeedVideoFpsRanges);
        parcel.writeString(this.errorInvalidCardNumber);
        parcel.writeString(this.errorCardExpired);
        parcel.writeString(this.errorInvalidDate);
        parcel.writeString(this.errorInvalidIban);
        parcel.writeString(this.errorInvalidSecurityCode);
        parcel.writeString(this.errorRequiredFieldMissing);
        parcel.writeString(this.getHighSpeedVideoFpsRangesFor);
        parcel.writeString(this.getInputSizeshNQ4ISI);
    }

    BlinkCardEditStrings(android.os.Parcel parcel) {
        this.getOutputFormats = parcel.readString();
        this.Camera2StreamConfigurationMap = parcel.readString();
        this.getHighResolutionOutputSizeshNQ4ISI = parcel.readString();
        this.getInputFormats = parcel.readString();
        this.getHighSpeedVideoSizes = parcel.readString();
        this.getOutputMinFrameDuration = parcel.readString();
        this.getHighSpeedVideoSizesFor = parcel.readString();
        this.getHighSpeedVideoFpsRanges = parcel.readString();
        this.errorInvalidCardNumber = parcel.readString();
        this.errorCardExpired = parcel.readString();
        this.errorInvalidDate = parcel.readString();
        this.errorInvalidIban = parcel.readString();
        this.errorInvalidSecurityCode = parcel.readString();
        this.errorRequiredFieldMissing = parcel.readString();
        this.getHighSpeedVideoFpsRangesFor = parcel.readString();
        this.getInputSizeshNQ4ISI = parcel.readString();
    }
}
