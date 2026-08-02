package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
public abstract class AuthorAttributions implements android.os.Parcelable {
    public static com.google.android.libraries.places.api.model.AuthorAttributions newInstance(java.util.List<com.google.android.libraries.places.api.model.AuthorAttribution> list) {
        return new com.google.android.libraries.places.api.model.zzco(com.google.common.collect.ImmutableList.copyOf((java.util.Collection) list));
    }

    public abstract java.util.List<com.google.android.libraries.places.api.model.AuthorAttribution> asList();
}
