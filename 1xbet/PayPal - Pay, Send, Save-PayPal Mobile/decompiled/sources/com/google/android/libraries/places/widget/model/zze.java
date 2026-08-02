package com.google.android.libraries.places.widget.model;

/* loaded from: classes8.dex */
public final class zze implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
        return new com.google.android.libraries.places.widget.model.AutocompleteUiIcon(parcel.readInt(), null);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.google.android.libraries.places.widget.model.AutocompleteUiIcon[i];
    }
}
