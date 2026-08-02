package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public enum zzow implements android.os.Parcelable {
    PABLO,
    ONE_PLATFORM,
    JWT_AND_ONE_PLATFORM;

    public static final android.os.Parcelable.Creator<com.google.android.libraries.places.internal.zzow> CREATOR = new android.os.Parcelable.Creator() { // from class: com.google.android.libraries.places.internal.zzov
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
            return (com.google.android.libraries.places.internal.zzow) java.lang.Enum.valueOf(com.google.android.libraries.places.internal.zzow.class, (java.lang.String) com.google.common.base.Preconditions.checkNotNull(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ java.lang.Object[] newArray(int i) {
            return new com.google.android.libraries.places.internal.zzow[i];
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
