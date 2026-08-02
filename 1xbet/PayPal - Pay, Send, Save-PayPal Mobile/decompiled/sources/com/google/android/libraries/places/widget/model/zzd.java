package com.google.android.libraries.places.widget.model;

/* loaded from: classes8.dex */
public final class zzd implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
        return new com.google.android.libraries.places.widget.model.AutocompleteUiCustomization(parcel.readInt() == 0 ? null : com.google.android.libraries.places.widget.model.AutocompleteListDensity.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : com.google.android.libraries.places.widget.model.AutocompleteUiIcon.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0 ? java.lang.Integer.valueOf(parcel.readInt()) : null, null);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.google.android.libraries.places.widget.model.AutocompleteUiCustomization[i];
    }
}
