package com.google.android.libraries.places.api.net;

/* loaded from: classes8.dex */
final class zzm extends com.google.android.libraries.places.api.net.FindCurrentPlaceRequest.Builder {
    private java.util.List zza;
    private com.google.android.gms.tasks.CancellationToken zzb;

    @Override // com.google.android.libraries.places.api.net.FindCurrentPlaceRequest.Builder
    final com.google.android.libraries.places.api.net.FindCurrentPlaceRequest.Builder zza(java.util.List list) {
        if (list == null) {
            throw new java.lang.NullPointerException("Null placeFields");
        }
        this.zza = list;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.FindCurrentPlaceRequest.Builder
    final com.google.android.libraries.places.api.net.FindCurrentPlaceRequest zzb() {
        java.util.List list = this.zza;
        if (list != null) {
            return new com.google.android.libraries.places.api.net.zzn(list, this.zzb, null);
        }
        throw new java.lang.IllegalStateException("Missing required properties: placeFields");
    }

    @Override // com.google.android.libraries.places.api.net.FindCurrentPlaceRequest.Builder
    public final com.google.android.libraries.places.api.net.FindCurrentPlaceRequest.Builder setCancellationToken(com.google.android.gms.tasks.CancellationToken cancellationToken) {
        this.zzb = cancellationToken;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.FindCurrentPlaceRequest.Builder
    public final com.google.android.gms.tasks.CancellationToken getCancellationToken() {
        return this.zzb;
    }

    zzm() {
    }
}
