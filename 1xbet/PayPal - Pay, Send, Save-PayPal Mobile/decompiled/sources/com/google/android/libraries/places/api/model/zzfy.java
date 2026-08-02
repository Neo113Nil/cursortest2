package com.google.android.libraries.places.api.model;

/* loaded from: classes4.dex */
final class zzfy implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return com.google.android.libraries.places.api.model.OpeningHours.HoursType.valueOf((java.lang.String) com.google.common.base.Preconditions.checkNotNull(parcel.readString()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.google.android.libraries.places.api.model.OpeningHours.HoursType[i];
    }

    zzfy() {
    }
}
