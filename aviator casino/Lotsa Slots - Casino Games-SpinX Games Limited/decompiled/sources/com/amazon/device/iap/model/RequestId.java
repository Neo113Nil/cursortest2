package com.amazon.device.iap.model;

/* loaded from: classes2.dex */
public final class RequestId implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.amazon.device.iap.model.RequestId> CREATOR = new android.os.Parcelable.Creator<com.amazon.device.iap.model.RequestId>() { // from class: com.amazon.device.iap.model.RequestId.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.amazon.device.iap.model.RequestId createFromParcel(android.os.Parcel parcel) {
            return new com.amazon.device.iap.model.RequestId(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.amazon.device.iap.model.RequestId[] newArray(int i) {
            return new com.amazon.device.iap.model.RequestId[i];
        }
    };
    private static final java.lang.String ENCODED_ID = "encodedId";
    private final java.lang.String encodedId;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.encodedId);
    }

    private RequestId(android.os.Parcel parcel) {
        this.encodedId = parcel.readString();
    }

    public RequestId() {
        this.encodedId = java.util.UUID.randomUUID().toString();
    }

    private RequestId(java.lang.String str) {
        com.amazon.device.iap.internal.util.d.a((java.lang.Object) str, ENCODED_ID);
        this.encodedId = str;
    }

    public java.lang.String toString() {
        return this.encodedId;
    }

    public static com.amazon.device.iap.model.RequestId fromString(java.lang.String str) {
        return new com.amazon.device.iap.model.RequestId(str);
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.encodedId.equals(((com.amazon.device.iap.model.RequestId) obj).encodedId);
    }

    public int hashCode() {
        java.lang.String str = this.encodedId;
        return 31 + (str == null ? 0 : str.hashCode());
    }

    public org.json.JSONObject toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put(ENCODED_ID, this.encodedId);
        } catch (org.json.JSONException unused) {
        }
        return jSONObject;
    }
}
