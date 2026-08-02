package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
final class zzfe extends com.google.android.libraries.places.api.model.zzbs {
    public static final android.os.Parcelable.Creator<com.google.android.libraries.places.api.model.zzfe> CREATOR = new com.google.android.libraries.places.api.model.zzfd();

    zzfe(boolean z, boolean z2, boolean z3, boolean z4) {
        super(z, z2, z3, z4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeInt(isTollAvoided() ? 1 : 0);
        parcel.writeInt(isHighwayAvoided() ? 1 : 0);
        parcel.writeInt(isFerryAvoided() ? 1 : 0);
        parcel.writeInt(isIndoorAvoided() ? 1 : 0);
    }
}
