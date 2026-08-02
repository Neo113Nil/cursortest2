package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
final class zznm extends com.google.android.libraries.places.internal.zznk {
    public static final android.os.Parcelable.Creator<com.google.android.libraries.places.internal.zznm> CREATOR = new com.google.android.libraries.places.internal.zznl();

    zznm(com.google.android.libraries.places.internal.zzow zzowVar, com.google.android.libraries.places.widget.model.AutocompleteActivityMode autocompleteActivityMode, com.google.common.collect.ImmutableList immutableList, com.google.android.libraries.places.internal.zzor zzorVar, com.google.android.gms.maps.model.LatLng latLng, java.lang.String str, java.lang.String str2, com.google.android.libraries.places.api.model.LocationBias locationBias, com.google.android.libraries.places.api.model.LocationRestriction locationRestriction, com.google.common.collect.ImmutableList immutableList2, com.google.common.collect.ImmutableList immutableList3, int i, int i2, java.lang.String str3, com.google.android.libraries.places.widget.model.AutocompleteUiCustomization autocompleteUiCustomization, boolean z, com.google.android.libraries.places.api.model.AutocompleteSessionToken autocompleteSessionToken) {
        super(zzowVar, autocompleteActivityMode, immutableList, zzorVar, latLng, str, str2, locationBias, locationRestriction, immutableList2, immutableList3, i, i2, str3, autocompleteUiCustomization, z, autocompleteSessionToken);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeParcelable(zza(), i);
        parcel.writeParcelable(zzb(), i);
        parcel.writeList(zzc().asList());
        parcel.writeParcelable(zzd(), i);
        parcel.writeParcelable(zze(), i);
        if (zzf() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(zzf());
        }
        if (zzg() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(zzg());
        }
        parcel.writeParcelable(zzh(), i);
        parcel.writeParcelable(zzi(), i);
        parcel.writeList(zzj().asList());
        parcel.writeList(zzk().asList());
        parcel.writeInt(zzl());
        parcel.writeInt(zzm());
        if (zzn() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(zzn());
        }
        parcel.writeParcelable(zzo(), i);
        parcel.writeInt(zzp() ? 1 : 0);
        parcel.writeParcelable(zzq(), i);
    }
}
