package com.google.android.libraries.places.api.net;

@java.lang.Deprecated
/* loaded from: classes.dex */
public abstract class FindCurrentPlaceRequest implements com.google.android.libraries.places.internal.zzmq {

    @java.lang.Deprecated
    public static abstract class Builder {
        public com.google.android.libraries.places.api.net.FindCurrentPlaceRequest build() {
            zza(com.google.common.collect.ImmutableList.copyOf((java.util.Collection) zzb().getPlaceFields()));
            return zzb();
        }

        public abstract com.google.android.gms.tasks.CancellationToken getCancellationToken();

        public abstract com.google.android.libraries.places.api.net.FindCurrentPlaceRequest.Builder setCancellationToken(com.google.android.gms.tasks.CancellationToken cancellationToken);

        abstract com.google.android.libraries.places.api.net.FindCurrentPlaceRequest.Builder zza(java.util.List list);

        abstract com.google.android.libraries.places.api.net.FindCurrentPlaceRequest zzb();
    }

    public static com.google.android.libraries.places.api.net.FindCurrentPlaceRequest.Builder builder(java.util.List<com.google.android.libraries.places.api.model.Place.Field> list) {
        com.google.android.libraries.places.api.net.zzm zzmVar = new com.google.android.libraries.places.api.net.zzm();
        zzmVar.zza(list);
        return zzmVar;
    }

    public static com.google.android.libraries.places.api.net.FindCurrentPlaceRequest newInstance(java.util.List<com.google.android.libraries.places.api.model.Place.Field> list) {
        return builder(list).build();
    }

    @Override // com.google.android.libraries.places.internal.zzmq
    public abstract com.google.android.gms.tasks.CancellationToken getCancellationToken();

    public abstract java.util.List<com.google.android.libraries.places.api.model.Place.Field> getPlaceFields();
}
