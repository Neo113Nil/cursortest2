package com.microblink.blinkid.activity.edit;

/* loaded from: classes9.dex */
public class BlinkCardEditFieldConfiguration implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.microblink.blinkid.activity.edit.BlinkCardEditFieldConfiguration> CREATOR = new android.os.Parcelable.Creator<com.microblink.blinkid.activity.edit.BlinkCardEditFieldConfiguration>() { // from class: com.microblink.blinkid.activity.edit.BlinkCardEditFieldConfiguration.1
        @Override // android.os.Parcelable.Creator
        public /* synthetic */ com.microblink.blinkid.activity.edit.BlinkCardEditFieldConfiguration createFromParcel(android.os.Parcel parcel) {
            return new com.microblink.blinkid.activity.edit.BlinkCardEditFieldConfiguration(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ com.microblink.blinkid.activity.edit.BlinkCardEditFieldConfiguration[] newArray(int i) {
            return new com.microblink.blinkid.activity.edit.BlinkCardEditFieldConfiguration[i];
        }
    };
    public boolean allowCardsWithInvalidFields;
    public boolean shouldDisplayCardNumber;
    public boolean shouldDisplayCvv;
    public boolean shouldDisplayExpiryDate;
    public boolean shouldDisplayIban;
    public boolean shouldDisplayOwner;

    public BlinkCardEditFieldConfiguration() {
        this.shouldDisplayCardNumber = true;
        this.shouldDisplayOwner = true;
        this.shouldDisplayCvv = true;
        this.shouldDisplayExpiryDate = true;
        this.shouldDisplayIban = false;
        this.allowCardsWithInvalidFields = false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean isValid() {
        return this.shouldDisplayCardNumber || this.shouldDisplayOwner || this.shouldDisplayCvv || this.shouldDisplayExpiryDate || this.shouldDisplayIban;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeByte(this.shouldDisplayCardNumber ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.shouldDisplayOwner ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.shouldDisplayCvv ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.shouldDisplayExpiryDate ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.shouldDisplayIban ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.allowCardsWithInvalidFields ? (byte) 1 : (byte) 0);
    }

    protected BlinkCardEditFieldConfiguration(android.os.Parcel parcel) {
        this.shouldDisplayCardNumber = true;
        this.shouldDisplayOwner = true;
        this.shouldDisplayCvv = true;
        this.shouldDisplayExpiryDate = true;
        this.shouldDisplayIban = false;
        this.allowCardsWithInvalidFields = false;
        this.shouldDisplayCardNumber = parcel.readByte() != 0;
        this.shouldDisplayOwner = parcel.readByte() != 0;
        this.shouldDisplayCvv = parcel.readByte() != 0;
        this.shouldDisplayExpiryDate = parcel.readByte() != 0;
        this.shouldDisplayIban = parcel.readByte() != 0;
        this.allowCardsWithInvalidFields = parcel.readByte() != 0;
    }
}
