package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
final class zzdu extends com.google.android.libraries.places.api.model.zzak {
    public static final android.os.Parcelable.Creator<com.google.android.libraries.places.api.model.zzdu> CREATOR = new com.google.android.libraries.places.api.model.zzdt();

    zzdu(android.net.Uri uri, android.net.Uri uri2, android.net.Uri uri3, android.net.Uri uri4, android.net.Uri uri5) {
        super(uri, uri2, uri3, uri4, uri5);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeParcelable(getDirectionsUri(), i);
        parcel.writeParcelable(getPlaceUri(), i);
        parcel.writeParcelable(getWriteAReviewUri(), i);
        parcel.writeParcelable(getReviewsUri(), i);
        parcel.writeParcelable(getPhotosUri(), i);
    }
}
