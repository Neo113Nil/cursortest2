package com.google.android.libraries.places.api.net;

/* loaded from: classes.dex */
public abstract class FetchPlaceRequest implements com.google.android.libraries.places.internal.zzmq {

    public static abstract class Builder {
        public com.google.android.libraries.places.api.net.FetchPlaceRequest build() {
            zzb(com.google.common.collect.ImmutableList.copyOf((java.util.Collection) zzc().getPlaceFields()));
            return zzc();
        }

        public abstract com.google.android.gms.tasks.CancellationToken getCancellationToken();

        public abstract java.lang.String getRegionCode();

        public abstract com.google.android.libraries.places.api.model.AutocompleteSessionToken getSessionToken();

        public abstract com.google.android.libraries.places.api.net.FetchPlaceRequest.Builder setCancellationToken(com.google.android.gms.tasks.CancellationToken cancellationToken);

        public abstract com.google.android.libraries.places.api.net.FetchPlaceRequest.Builder setRegionCode(java.lang.String str);

        public abstract com.google.android.libraries.places.api.net.FetchPlaceRequest.Builder setSessionToken(com.google.android.libraries.places.api.model.AutocompleteSessionToken autocompleteSessionToken);

        abstract com.google.android.libraries.places.api.net.FetchPlaceRequest.Builder zzb(java.util.List list);

        abstract com.google.android.libraries.places.api.net.FetchPlaceRequest zzc();
    }

    public static com.google.android.libraries.places.api.net.FetchPlaceRequest.Builder builder(java.lang.String str, java.util.List<com.google.android.libraries.places.api.model.Place.Field> list) {
        com.google.android.libraries.places.api.net.zzd zzdVar = new com.google.android.libraries.places.api.net.zzd();
        zzdVar.zza(str);
        zzdVar.zzb(list);
        return zzdVar;
    }

    public static com.google.android.libraries.places.api.net.FetchPlaceRequest newInstance(java.lang.String str, java.util.List<com.google.android.libraries.places.api.model.Place.Field> list) {
        return builder(str, list).build();
    }

    @Override // com.google.android.libraries.places.internal.zzmq
    public abstract com.google.android.gms.tasks.CancellationToken getCancellationToken();

    public abstract java.util.List<com.google.android.libraries.places.api.model.Place.Field> getPlaceFields();

    public abstract java.lang.String getPlaceId();

    public abstract java.lang.String getRegionCode();

    public abstract com.google.android.libraries.places.api.model.AutocompleteSessionToken getSessionToken();
}
