package com.google.android.libraries.places.api.net;

@java.lang.Deprecated
/* loaded from: classes.dex */
public abstract class FetchPhotoRequest implements com.google.android.libraries.places.internal.zzmq {

    @java.lang.Deprecated
    public static abstract class Builder {
        public com.google.android.libraries.places.api.net.FetchPhotoRequest build() {
            com.google.android.libraries.places.api.model.PhotoMetadata zzb = zzb();
            if (getMaxWidth() == null && getMaxHeight() == null) {
                int width = zzb.getWidth();
                if (width > 0) {
                    setMaxWidth(java.lang.Integer.valueOf(width));
                }
                int height = zzb.getHeight();
                if (height > 0) {
                    setMaxHeight(java.lang.Integer.valueOf(height));
                }
            }
            return zzc();
        }

        public abstract com.google.android.gms.tasks.CancellationToken getCancellationToken();

        public abstract java.lang.Integer getMaxHeight();

        public abstract java.lang.Integer getMaxWidth();

        public abstract com.google.android.libraries.places.api.net.FetchPhotoRequest.Builder setCancellationToken(com.google.android.gms.tasks.CancellationToken cancellationToken);

        public abstract com.google.android.libraries.places.api.net.FetchPhotoRequest.Builder setMaxHeight(java.lang.Integer num);

        public abstract com.google.android.libraries.places.api.net.FetchPhotoRequest.Builder setMaxWidth(java.lang.Integer num);

        abstract com.google.android.libraries.places.api.model.PhotoMetadata zzb();

        abstract com.google.android.libraries.places.api.net.FetchPhotoRequest zzc();
    }

    public static com.google.android.libraries.places.api.net.FetchPhotoRequest.Builder builder(com.google.android.libraries.places.api.model.PhotoMetadata photoMetadata) {
        com.google.android.libraries.places.api.net.zza zzaVar = new com.google.android.libraries.places.api.net.zza();
        zzaVar.zza(photoMetadata);
        return zzaVar;
    }

    public static com.google.android.libraries.places.api.net.FetchPhotoRequest newInstance(com.google.android.libraries.places.api.model.PhotoMetadata photoMetadata) {
        return builder(photoMetadata).build();
    }

    @Override // com.google.android.libraries.places.internal.zzmq
    public abstract com.google.android.gms.tasks.CancellationToken getCancellationToken();

    public abstract java.lang.Integer getMaxHeight();

    public abstract java.lang.Integer getMaxWidth();

    public abstract com.google.android.libraries.places.api.model.PhotoMetadata getPhotoMetadata();
}
