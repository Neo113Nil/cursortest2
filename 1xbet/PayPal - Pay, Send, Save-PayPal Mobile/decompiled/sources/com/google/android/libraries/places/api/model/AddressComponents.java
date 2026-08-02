package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
public abstract class AddressComponents implements android.os.Parcelable {
    public static com.google.android.libraries.places.api.model.AddressComponents newInstance(java.util.List<com.google.android.libraries.places.api.model.AddressComponent> list) {
        return new com.google.android.libraries.places.api.model.zzck(list);
    }

    public abstract java.util.List<com.google.android.libraries.places.api.model.AddressComponent> asList();
}
