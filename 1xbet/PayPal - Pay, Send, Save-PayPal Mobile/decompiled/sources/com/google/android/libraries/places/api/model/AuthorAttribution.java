package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
public abstract class AuthorAttribution implements android.os.Parcelable {

    public static abstract class Builder {
        public com.google.android.libraries.places.api.model.AuthorAttribution build() {
            com.google.common.base.Preconditions.checkArgument(!zzb().getName().isEmpty(), "Name must not be empty.");
            return zzb();
        }

        public abstract java.lang.String getPhotoUri();

        public abstract java.lang.String getUri();

        public abstract com.google.android.libraries.places.api.model.AuthorAttribution.Builder setPhotoUri(java.lang.String str);

        public abstract com.google.android.libraries.places.api.model.AuthorAttribution.Builder setUri(java.lang.String str);

        abstract com.google.android.libraries.places.api.model.AuthorAttribution zzb();
    }

    public static com.google.android.libraries.places.api.model.AuthorAttribution.Builder builder(java.lang.String str) {
        com.google.android.libraries.places.api.model.zzf zzfVar = new com.google.android.libraries.places.api.model.zzf();
        zzfVar.zza(str);
        return zzfVar;
    }

    public abstract java.lang.String getName();

    public abstract java.lang.String getPhotoUri();

    public abstract java.lang.String getUri();
}
