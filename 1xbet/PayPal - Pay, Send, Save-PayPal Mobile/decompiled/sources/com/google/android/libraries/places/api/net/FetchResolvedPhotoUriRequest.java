package com.google.android.libraries.places.api.net;

/* loaded from: classes.dex */
public abstract class FetchResolvedPhotoUriRequest implements com.google.android.libraries.places.internal.zzmq {

    public static abstract class Builder {
        public com.google.android.libraries.places.api.net.FetchResolvedPhotoUriRequest build() {
            com.google.android.libraries.places.api.model.PhotoMetadata zzb = zzb();
            java.lang.Integer maxWidth = getMaxWidth();
            java.lang.Integer maxHeight = getMaxHeight();
            boolean z = true;
            com.google.common.base.Preconditions.checkArgument(zzb.zzb() != null, "To construct the FetchResolvedPhotoUriRequest, the provided PhotoMetadata must be fetched from Places API (New). You must first call initializeWithNewPlacesApiEnabled to initialize the PlaceClient and retrieve the PhotoMetadata. Once you have the PhotoMetadata, you must pass it into the FetchResolvedPhotoUriRequest.");
            if (maxWidth != null) {
                com.google.common.base.Preconditions.checkArgument(maxWidth.intValue() > 0, "Max width must not be < 1, but was: %s.", maxWidth);
                com.google.common.base.Preconditions.checkArgument(maxWidth.intValue() <= 4800, "Max width must not be > %s, but was: %s.", 4800, (java.lang.Object) maxWidth);
            }
            if (maxHeight != null) {
                com.google.common.base.Preconditions.checkArgument(maxHeight.intValue() > 0, "Max height must not be < 1, but was: %s.", maxHeight);
                com.google.common.base.Preconditions.checkArgument(maxHeight.intValue() <= 4800, "Max height must not be > %s, but was: %s.", 4800, (java.lang.Object) maxHeight);
            }
            if (maxWidth == null && maxHeight == null) {
                int width = zzb.getWidth();
                if (width > 0) {
                    setMaxWidth(java.lang.Integer.valueOf(java.lang.Math.min(4800, width)));
                }
                int height = zzb.getHeight();
                if (height > 0) {
                    setMaxHeight(java.lang.Integer.valueOf(java.lang.Math.min(4800, height)));
                }
            }
            if (getMaxWidth() == null && getMaxHeight() == null) {
                z = false;
            }
            com.google.common.base.Preconditions.checkState(z, "Must include max width or max height in the request.");
            return zzc();
        }

        public abstract com.google.android.gms.tasks.CancellationToken getCancellationToken();

        public abstract java.lang.Integer getMaxHeight();

        public abstract java.lang.Integer getMaxWidth();

        public abstract com.google.android.libraries.places.api.net.FetchResolvedPhotoUriRequest.Builder setCancellationToken(com.google.android.gms.tasks.CancellationToken cancellationToken);

        public abstract com.google.android.libraries.places.api.net.FetchResolvedPhotoUriRequest.Builder setMaxHeight(java.lang.Integer num);

        public abstract com.google.android.libraries.places.api.net.FetchResolvedPhotoUriRequest.Builder setMaxWidth(java.lang.Integer num);

        abstract com.google.android.libraries.places.api.model.PhotoMetadata zzb();

        abstract com.google.android.libraries.places.api.net.FetchResolvedPhotoUriRequest zzc();
    }

    public static com.google.android.libraries.places.api.net.FetchResolvedPhotoUriRequest.Builder builder(com.google.android.libraries.places.api.model.PhotoMetadata photoMetadata) {
        com.google.android.libraries.places.api.net.zzg zzgVar = new com.google.android.libraries.places.api.net.zzg();
        zzgVar.zza(photoMetadata);
        return zzgVar;
    }

    public static com.google.android.libraries.places.api.net.FetchResolvedPhotoUriRequest newInstance(com.google.android.libraries.places.api.model.PhotoMetadata photoMetadata) {
        return builder(photoMetadata).build();
    }

    @Override // com.google.android.libraries.places.internal.zzmq
    public abstract com.google.android.gms.tasks.CancellationToken getCancellationToken();

    public abstract java.lang.Integer getMaxHeight();

    public abstract java.lang.Integer getMaxWidth();

    public abstract com.google.android.libraries.places.api.model.PhotoMetadata getPhotoMetadata();
}
