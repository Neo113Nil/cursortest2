package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
public enum DayOfWeek implements android.os.Parcelable {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;

    public static final android.os.Parcelable.Creator<com.google.android.libraries.places.api.model.DayOfWeek> CREATOR = new android.os.Parcelable.Creator() { // from class: com.google.android.libraries.places.api.model.zzft
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ java.lang.Object[] newArray(int i) {
            return new com.google.android.libraries.places.api.model.DayOfWeek[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
            return com.google.android.libraries.places.api.model.DayOfWeek.valueOf((java.lang.String) com.google.common.base.Preconditions.checkNotNull(parcel.readString()));
        }
    };

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
