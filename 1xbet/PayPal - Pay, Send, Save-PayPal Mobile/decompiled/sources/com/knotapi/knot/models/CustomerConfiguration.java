package com.knotapi.knot.models;

/* loaded from: classes9.dex */
public class CustomerConfiguration implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.knotapi.knot.models.CustomerConfiguration> CREATOR = new android.os.Parcelable.Creator<com.knotapi.knot.models.CustomerConfiguration>() { // from class: com.knotapi.knot.models.CustomerConfiguration.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.knotapi.knot.models.CustomerConfiguration createFromParcel(android.os.Parcel parcel) {
            return new com.knotapi.knot.models.CustomerConfiguration(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.knotapi.knot.models.CustomerConfiguration[] newArray(int i) {
            return new com.knotapi.knot.models.CustomerConfiguration[i];
        }
    };
    private final java.lang.String cardName;
    private final java.lang.String customerName;
    private final java.lang.String logoId;

    public CustomerConfiguration(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.cardName = str;
        this.customerName = str2;
        this.logoId = str3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String getCardName() {
        return this.cardName;
    }

    public java.lang.String getCustomerName() {
        return this.customerName;
    }

    public java.lang.String getLogoId() {
        return this.logoId;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.cardName);
        parcel.writeString(this.customerName);
        parcel.writeString(this.logoId);
    }

    public CustomerConfiguration(android.os.Parcel parcel) {
        this.cardName = parcel.readString();
        this.customerName = parcel.readString();
        this.logoId = parcel.readString();
    }
}
