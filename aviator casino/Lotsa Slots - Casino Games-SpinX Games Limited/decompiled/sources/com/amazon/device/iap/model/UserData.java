package com.amazon.device.iap.model;

/* loaded from: classes2.dex */
public final class UserData implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.amazon.device.iap.model.UserData> CREATOR = new android.os.Parcelable.Creator<com.amazon.device.iap.model.UserData>() { // from class: com.amazon.device.iap.model.UserData.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.amazon.device.iap.model.UserData createFromParcel(android.os.Parcel parcel) {
            return new com.amazon.device.iap.model.UserData(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.amazon.device.iap.model.UserData[] newArray(int i) {
            return new com.amazon.device.iap.model.UserData[i];
        }
    };
    private static final java.lang.String MARKETPLACE = "marketplace";
    private static final java.lang.String USER_ID = "userId";
    private final java.lang.String marketplace;
    private final java.lang.String userId;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeStringArray(new java.lang.String[]{this.userId, this.marketplace});
    }

    private UserData(android.os.Parcel parcel) {
        this.userId = parcel.readString();
        this.marketplace = parcel.readString();
    }

    public java.lang.String getUserId() {
        return this.userId;
    }

    public java.lang.String getMarketplace() {
        return this.marketplace;
    }

    public org.json.JSONObject toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("userId", this.userId);
            jSONObject.put(MARKETPLACE, this.marketplace);
        } catch (org.json.JSONException unused) {
        }
        return jSONObject;
    }

    public java.lang.String toString() {
        try {
            return toJSON().toString(4);
        } catch (org.json.JSONException unused) {
            return null;
        }
    }

    public UserData(com.amazon.device.iap.internal.model.UserDataBuilder userDataBuilder) {
        this.userId = userDataBuilder.getUserId();
        this.marketplace = userDataBuilder.getMarketplace();
    }
}
