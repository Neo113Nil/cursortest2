package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
public abstract class SubDestination implements android.os.Parcelable {

    public static abstract class Builder {
        public abstract com.google.android.libraries.places.api.model.SubDestination build();

        public abstract com.google.android.libraries.places.api.model.SubDestination.Builder setId(java.lang.String str);

        public abstract com.google.android.libraries.places.api.model.SubDestination.Builder setName(java.lang.String str);
    }

    public static com.google.android.libraries.places.api.model.SubDestination newInstance(java.lang.String str, java.lang.String str2) {
        com.google.android.libraries.places.api.model.zzca zzcaVar = new com.google.android.libraries.places.api.model.zzca();
        zzcaVar.setId(str);
        zzcaVar.setName(str2);
        return zzcaVar.build();
    }

    public abstract java.lang.String getId();

    public abstract java.lang.String getName();
}
