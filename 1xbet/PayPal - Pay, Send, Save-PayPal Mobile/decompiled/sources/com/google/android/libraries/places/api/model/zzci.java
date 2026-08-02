package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
final class zzci extends com.google.android.libraries.places.api.model.zzd {
    public static final android.os.Parcelable.Creator<com.google.android.libraries.places.api.model.zzci> CREATOR = new com.google.android.libraries.places.api.model.zzch();

    zzci(java.lang.String str, java.lang.String str2, java.util.List list) {
        super(str, str2, list);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(getName());
        if (getShortName() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getShortName());
        }
        parcel.writeList(getTypes());
    }
}
