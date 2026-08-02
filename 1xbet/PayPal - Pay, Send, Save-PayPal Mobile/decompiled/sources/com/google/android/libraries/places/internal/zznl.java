package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
final class zznl implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new com.google.android.libraries.places.internal.zznm((com.google.android.libraries.places.internal.zzow) parcel.readParcelable(com.google.android.libraries.places.internal.zznq.class.getClassLoader()), (com.google.android.libraries.places.widget.model.AutocompleteActivityMode) parcel.readParcelable(com.google.android.libraries.places.internal.zznq.class.getClassLoader()), com.google.common.collect.ImmutableList.copyOf((java.util.Collection) parcel.readArrayList(com.google.android.libraries.places.api.model.Place.Field.class.getClassLoader())), (com.google.android.libraries.places.internal.zzor) parcel.readParcelable(com.google.android.libraries.places.internal.zznq.class.getClassLoader()), (com.google.android.gms.maps.model.LatLng) parcel.readParcelable(com.google.android.libraries.places.internal.zznq.class.getClassLoader()), parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, (com.google.android.libraries.places.api.model.LocationBias) parcel.readParcelable(com.google.android.libraries.places.internal.zznq.class.getClassLoader()), (com.google.android.libraries.places.api.model.LocationRestriction) parcel.readParcelable(com.google.android.libraries.places.internal.zznq.class.getClassLoader()), com.google.common.collect.ImmutableList.copyOf((java.util.Collection) parcel.readArrayList(java.lang.String.class.getClassLoader())), com.google.common.collect.ImmutableList.copyOf((java.util.Collection) parcel.readArrayList(java.lang.String.class.getClassLoader())), parcel.readInt(), parcel.readInt(), parcel.readInt() == 0 ? parcel.readString() : null, (com.google.android.libraries.places.widget.model.AutocompleteUiCustomization) parcel.readParcelable(com.google.android.libraries.places.internal.zznq.class.getClassLoader()), parcel.readInt() == 1, (com.google.android.libraries.places.api.model.AutocompleteSessionToken) parcel.readParcelable(com.google.android.libraries.places.internal.zznq.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.google.android.libraries.places.internal.zznm[i];
    }

    zznl() {
    }
}
