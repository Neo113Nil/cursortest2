package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
final class zzda extends com.google.android.libraries.places.api.model.zzr {
    public static final android.os.Parcelable.Creator<com.google.android.libraries.places.api.model.zzda> CREATOR = new com.google.android.libraries.places.api.model.zzcz();

    zzda(java.lang.String str, com.google.android.libraries.places.api.model.ConsumerAlertDetails consumerAlertDetails, java.lang.String str2) {
        super(str, consumerAlertDetails, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        if (getOverview() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getOverview());
        }
        parcel.writeParcelable(getDetails(), i);
        if (getLanguageCode() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getLanguageCode());
        }
    }
}
