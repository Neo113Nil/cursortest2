package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
final class zzeu extends com.google.android.libraries.places.api.model.zzbi {
    public static final android.os.Parcelable.Creator<com.google.android.libraries.places.api.model.zzeu> CREATOR = new com.google.android.libraries.places.api.model.zzet();

    zzeu(java.lang.String str, java.lang.String str2) {
        super(str, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        if (getCompoundCode() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getCompoundCode());
        }
        if (getGlobalCode() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getGlobalCode());
        }
    }
}
