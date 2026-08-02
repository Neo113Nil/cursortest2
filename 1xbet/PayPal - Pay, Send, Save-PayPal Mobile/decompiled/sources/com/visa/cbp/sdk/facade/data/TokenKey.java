package com.visa.cbp.sdk.facade.data;

/* loaded from: classes5.dex */
public class TokenKey implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() { // from class: com.visa.cbp.sdk.facade.data.TokenKey.1
        @Override // android.os.Parcelable.Creator
        public java.lang.Object createFromParcel(android.os.Parcel parcel) {
            return new com.visa.cbp.sdk.facade.data.TokenKey(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public com.visa.cbp.sdk.facade.data.TokenKey[] newArray(int i) {
            return new com.visa.cbp.sdk.facade.data.TokenKey[i];
        }
    };
    public long tokenId;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public TokenKey(long j) {
        this.tokenId = j;
    }

    public TokenKey(android.os.Parcel parcel) {
        this.tokenId = parcel.readLong();
    }

    public long getTokenId() {
        return this.tokenId;
    }

    public void setTokenId(long j) {
        this.tokenId = j;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeLong(this.tokenId);
    }

    public java.lang.String toString() {
        return java.lang.Long.toString(this.tokenId);
    }

    public boolean equals(java.lang.Object obj) {
        return obj != null && (obj instanceof com.visa.cbp.sdk.facade.data.TokenKey) && this.tokenId == ((com.visa.cbp.sdk.facade.data.TokenKey) obj).tokenId;
    }

    public int hashCode() {
        return java.lang.Long.valueOf(this.tokenId).hashCode();
    }

    public /* synthetic */ TokenKey() {
    }
}
