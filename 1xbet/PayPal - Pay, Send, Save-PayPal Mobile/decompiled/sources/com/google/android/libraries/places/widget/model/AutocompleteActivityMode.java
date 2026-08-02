package com.google.android.libraries.places.widget.model;

@java.lang.Deprecated
/* loaded from: classes8.dex */
public enum AutocompleteActivityMode implements android.os.Parcelable {
    FULLSCREEN,
    OVERLAY;

    public static final android.os.Parcelable.Creator<com.google.android.libraries.places.widget.model.AutocompleteActivityMode> CREATOR = new android.os.Parcelable.Creator() { // from class: com.google.android.libraries.places.widget.model.zzb
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
            return com.google.android.libraries.places.widget.model.AutocompleteActivityMode.valueOf((java.lang.String) com.google.common.base.Preconditions.checkNotNull(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ java.lang.Object[] newArray(int i) {
            return new com.google.android.libraries.places.widget.model.AutocompleteActivityMode[i];
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
