package com.google.android.libraries.places.api.model;

/* loaded from: classes.dex */
public abstract class PhotoMetadata implements android.os.Parcelable {

    /* loaded from: classes8.dex */
    public static abstract class Builder {
        public com.google.android.libraries.places.api.model.PhotoMetadata build() {
            com.google.android.libraries.places.api.model.PhotoMetadata zzd = zzd();
            int width = zzd.getWidth();
            com.google.common.base.Preconditions.checkArgument(width >= 0, "Width must not be < 0, but was: %s.", width);
            int height = zzd.getHeight();
            com.google.common.base.Preconditions.checkArgument(height >= 0, "Height must not be < 0, but was: %s.", height);
            com.google.common.base.Preconditions.checkArgument(!zzd.zza().isEmpty(), "PhotoReference must not be empty.");
            return zzd;
        }

        public abstract java.lang.String getAttributions();

        public abstract com.google.android.libraries.places.api.model.AuthorAttributions getAuthorAttributions();

        public abstract int getHeight();

        public abstract int getWidth();

        public abstract com.google.android.libraries.places.api.model.PhotoMetadata.Builder setAttributions(java.lang.String str);

        public abstract com.google.android.libraries.places.api.model.PhotoMetadata.Builder setAuthorAttributions(com.google.android.libraries.places.api.model.AuthorAttributions authorAttributions);

        public abstract com.google.android.libraries.places.api.model.PhotoMetadata.Builder setHeight(int i);

        public abstract com.google.android.libraries.places.api.model.PhotoMetadata.Builder setWidth(int i);

        public abstract com.google.android.libraries.places.api.model.PhotoMetadata.Builder zzb(java.lang.String str);

        public abstract com.google.android.libraries.places.api.model.PhotoMetadata.Builder zzc(android.net.Uri uri);

        abstract com.google.android.libraries.places.api.model.PhotoMetadata zzd();
    }

    public static com.google.android.libraries.places.api.model.PhotoMetadata.Builder builder(java.lang.String str) {
        com.google.android.libraries.places.api.model.zzbc zzbcVar = new com.google.android.libraries.places.api.model.zzbc();
        zzbcVar.zza(str);
        zzbcVar.setWidth(0);
        zzbcVar.setHeight(0);
        zzbcVar.setAttributions("");
        return zzbcVar;
    }

    public abstract java.lang.String getAttributions();

    public abstract com.google.android.libraries.places.api.model.AuthorAttributions getAuthorAttributions();

    public abstract int getHeight();

    public abstract int getWidth();

    public abstract java.lang.String zza();

    public abstract java.lang.String zzb();

    public abstract android.net.Uri zzc();
}
