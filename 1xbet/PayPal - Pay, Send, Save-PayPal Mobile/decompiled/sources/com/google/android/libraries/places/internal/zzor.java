package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public enum zzor implements android.os.Parcelable {
    FRAGMENT,
    INTENT;

    public static final android.os.Parcelable.Creator<com.google.android.libraries.places.internal.zzor> CREATOR = new android.os.Parcelable.Creator() { // from class: com.google.android.libraries.places.internal.zzoq
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
            return (com.google.android.libraries.places.internal.zzor) java.lang.Enum.valueOf(com.google.android.libraries.places.internal.zzor.class, (java.lang.String) com.google.common.base.Preconditions.checkNotNull(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ java.lang.Object[] newArray(int i) {
            return new com.google.android.libraries.places.internal.zzor[i];
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
