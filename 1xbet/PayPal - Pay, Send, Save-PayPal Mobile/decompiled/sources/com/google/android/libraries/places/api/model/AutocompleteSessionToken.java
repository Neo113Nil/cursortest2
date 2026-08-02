package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
public abstract class AutocompleteSessionToken implements android.os.Parcelable {
    public static com.google.android.libraries.places.api.model.AutocompleteSessionToken newInstance() {
        return new com.google.android.libraries.places.api.model.zzcu(new android.os.ParcelUuid(java.util.UUID.randomUUID()));
    }

    public final java.lang.String toString() {
        return zza().toString();
    }

    abstract android.os.ParcelUuid zza();
}
