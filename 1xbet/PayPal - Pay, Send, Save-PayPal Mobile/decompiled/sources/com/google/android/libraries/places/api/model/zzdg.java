package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
final class zzdg extends com.google.android.libraries.places.api.model.zzx {
    public static final android.os.Parcelable.Creator<com.google.android.libraries.places.api.model.zzdg> CREATOR = new com.google.android.libraries.places.api.model.zzdf();

    zzdg(java.lang.Integer num, java.util.List list) {
        super(num, list);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeInt(getConnectorCount().intValue());
        parcel.writeList(getConnectorAggregations());
    }
}
