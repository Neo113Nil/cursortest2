package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
public abstract class ContentBlock implements android.os.Parcelable {

    public static abstract class Builder {
        public com.google.android.libraries.places.api.model.ContentBlock build() {
            java.util.List zza = zza();
            if (zza != null) {
                setReferencedPlaceResourceNames(com.google.common.collect.ImmutableList.copyOf((java.util.Collection) zza));
            }
            java.util.List zzb = zzb();
            if (zzb != null) {
                setReferencedPlaceIds(com.google.common.collect.ImmutableList.copyOf((java.util.Collection) zzb));
            }
            return zzc();
        }

        public abstract com.google.android.libraries.places.api.model.ContentBlock.Builder setContent(java.lang.String str);

        public abstract com.google.android.libraries.places.api.model.ContentBlock.Builder setContentLanguageCode(java.lang.String str);

        public abstract com.google.android.libraries.places.api.model.ContentBlock.Builder setReferencedPlaceIds(java.util.List<java.lang.String> list);

        public abstract com.google.android.libraries.places.api.model.ContentBlock.Builder setReferencedPlaceResourceNames(java.util.List<java.lang.String> list);

        abstract java.util.List zza();

        abstract java.util.List zzb();

        abstract com.google.android.libraries.places.api.model.ContentBlock zzc();
    }

    public abstract java.lang.String getContent();

    public abstract java.lang.String getContentLanguageCode();

    public abstract java.util.List<java.lang.String> getReferencedPlaceIds();

    public abstract java.util.List<java.lang.String> getReferencedPlaceResourceNames();

    public static com.google.android.libraries.places.api.model.ContentBlock.Builder builder() {
        return new com.google.android.libraries.places.api.model.zzu();
    }
}
