package com.google.android.libraries.places.api.net;

/* loaded from: classes8.dex */
public abstract class IsOpenRequest implements com.google.android.libraries.places.internal.zzmq {

    public static abstract class Builder {
        public com.google.android.libraries.places.api.net.IsOpenRequest build() {
            com.google.android.libraries.places.api.net.IsOpenRequest zza = zza();
            com.google.android.libraries.places.api.model.Place place = zza.getPlace();
            if (place != null) {
                com.google.common.base.Preconditions.checkArgument(place.getId() != null, "Place must have a valid place id.");
            }
            return zza;
        }

        public abstract com.google.android.gms.tasks.CancellationToken getCancellationToken();

        public abstract com.google.android.libraries.places.api.model.Place getPlace();

        public abstract java.lang.String getPlaceId();

        public abstract long getUtcTimeMillis();

        public abstract com.google.android.libraries.places.api.net.IsOpenRequest.Builder setCancellationToken(com.google.android.gms.tasks.CancellationToken cancellationToken);

        public abstract com.google.android.libraries.places.api.net.IsOpenRequest.Builder setPlace(com.google.android.libraries.places.api.model.Place place);

        public abstract com.google.android.libraries.places.api.net.IsOpenRequest.Builder setPlaceId(java.lang.String str);

        public abstract com.google.android.libraries.places.api.net.IsOpenRequest.Builder setUtcTimeMillis(long j);

        abstract com.google.android.libraries.places.api.net.IsOpenRequest zza();
    }

    public static com.google.android.libraries.places.api.net.IsOpenRequest.Builder builder(com.google.android.libraries.places.api.model.Place place) {
        com.google.android.libraries.places.api.net.zzp zzpVar = new com.google.android.libraries.places.api.net.zzp();
        zzpVar.setPlace(place);
        zzpVar.setUtcTimeMillis(java.lang.System.currentTimeMillis());
        return zzpVar;
    }

    public static com.google.android.libraries.places.api.net.IsOpenRequest newInstance(com.google.android.libraries.places.api.model.Place place) {
        return builder(place).build();
    }

    @Override // com.google.android.libraries.places.internal.zzmq
    public abstract com.google.android.gms.tasks.CancellationToken getCancellationToken();

    public abstract com.google.android.libraries.places.api.model.Place getPlace();

    public abstract java.lang.String getPlaceId();

    public abstract long getUtcTimeMillis();

    public static com.google.android.libraries.places.api.net.IsOpenRequest newInstance(com.google.android.libraries.places.api.model.Place place, long j) {
        return builder(place, j).build();
    }

    public static com.google.android.libraries.places.api.net.IsOpenRequest.Builder builder(com.google.android.libraries.places.api.model.Place place, long j) {
        com.google.android.libraries.places.api.net.zzp zzpVar = new com.google.android.libraries.places.api.net.zzp();
        zzpVar.setPlace(place);
        zzpVar.setUtcTimeMillis(j);
        return zzpVar;
    }

    public static com.google.android.libraries.places.api.net.IsOpenRequest newInstance(java.lang.String str) {
        return builder(str).build();
    }

    public static com.google.android.libraries.places.api.net.IsOpenRequest.Builder builder(java.lang.String str) {
        com.google.android.libraries.places.api.net.zzp zzpVar = new com.google.android.libraries.places.api.net.zzp();
        zzpVar.setPlaceId(str);
        zzpVar.setUtcTimeMillis(java.lang.System.currentTimeMillis());
        return zzpVar;
    }

    public static com.google.android.libraries.places.api.net.IsOpenRequest newInstance(java.lang.String str, long j) {
        return builder(str, j).build();
    }

    public static com.google.android.libraries.places.api.net.IsOpenRequest.Builder builder(java.lang.String str, long j) {
        com.google.android.libraries.places.api.net.zzp zzpVar = new com.google.android.libraries.places.api.net.zzp();
        zzpVar.setPlaceId(str);
        zzpVar.setUtcTimeMillis(j);
        return zzpVar;
    }
}
