package com.google.android.libraries.places.api.net;

/* loaded from: classes8.dex */
final class zzp extends com.google.android.libraries.places.api.net.IsOpenRequest.Builder {
    private com.google.android.libraries.places.api.model.Place zza;
    private java.lang.String zzb;
    private long zzc;
    private com.google.android.gms.tasks.CancellationToken zzd;
    private byte zze;

    @Override // com.google.android.libraries.places.api.net.IsOpenRequest.Builder
    public final long getUtcTimeMillis() {
        if (this.zze != 0) {
            return this.zzc;
        }
        throw new java.lang.IllegalStateException("Property \"utcTimeMillis\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.net.IsOpenRequest.Builder
    final com.google.android.libraries.places.api.net.IsOpenRequest zza() {
        if (this.zze == 1) {
            return new com.google.android.libraries.places.api.net.zzq(this.zza, this.zzb, this.zzc, this.zzd, null);
        }
        throw new java.lang.IllegalStateException("Missing required properties: utcTimeMillis");
    }

    @Override // com.google.android.libraries.places.api.net.IsOpenRequest.Builder
    public final com.google.android.libraries.places.api.net.IsOpenRequest.Builder setUtcTimeMillis(long j) {
        this.zzc = j;
        this.zze = (byte) 1;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.IsOpenRequest.Builder
    public final com.google.android.libraries.places.api.net.IsOpenRequest.Builder setPlaceId(java.lang.String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.IsOpenRequest.Builder
    public final com.google.android.libraries.places.api.net.IsOpenRequest.Builder setPlace(com.google.android.libraries.places.api.model.Place place) {
        this.zza = place;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.IsOpenRequest.Builder
    public final com.google.android.libraries.places.api.net.IsOpenRequest.Builder setCancellationToken(com.google.android.gms.tasks.CancellationToken cancellationToken) {
        this.zzd = cancellationToken;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.IsOpenRequest.Builder
    public final java.lang.String getPlaceId() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.net.IsOpenRequest.Builder
    public final com.google.android.libraries.places.api.model.Place getPlace() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.net.IsOpenRequest.Builder
    public final com.google.android.gms.tasks.CancellationToken getCancellationToken() {
        return this.zzd;
    }

    zzp() {
    }
}
