package com.google.android.libraries.places.api.net;

/* loaded from: classes8.dex */
final class zzn extends com.google.android.libraries.places.api.net.FindCurrentPlaceRequest {
    private final java.util.List zza;
    private final com.google.android.gms.tasks.CancellationToken zzb;

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.libraries.places.api.net.FindCurrentPlaceRequest)) {
            return false;
        }
        com.google.android.libraries.places.api.net.FindCurrentPlaceRequest findCurrentPlaceRequest = (com.google.android.libraries.places.api.net.FindCurrentPlaceRequest) obj;
        if (!this.zza.equals(findCurrentPlaceRequest.getPlaceFields())) {
            return false;
        }
        com.google.android.gms.tasks.CancellationToken cancellationToken = this.zzb;
        if (cancellationToken == null) {
            if (findCurrentPlaceRequest.getCancellationToken() != null) {
                return false;
            }
        } else if (!cancellationToken.equals(findCurrentPlaceRequest.getCancellationToken())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.zza.hashCode();
        com.google.android.gms.tasks.CancellationToken cancellationToken = this.zzb;
        return ((hashCode ^ 1000003) * 1000003) ^ (cancellationToken == null ? 0 : cancellationToken.hashCode());
    }

    public final java.lang.String toString() {
        java.lang.String obj = this.zza.toString();
        int length = obj.length();
        java.lang.String valueOf = java.lang.String.valueOf(this.zzb);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 56 + java.lang.String.valueOf(valueOf).length() + 1);
        sb.append("FindCurrentPlaceRequest{placeFields=");
        sb.append(obj);
        sb.append(", cancellationToken=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.libraries.places.api.net.FindCurrentPlaceRequest
    public final java.util.List<com.google.android.libraries.places.api.model.Place.Field> getPlaceFields() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.net.FindCurrentPlaceRequest, com.google.android.libraries.places.internal.zzmq
    public final com.google.android.gms.tasks.CancellationToken getCancellationToken() {
        return this.zzb;
    }

    /* synthetic */ zzn(java.util.List list, com.google.android.gms.tasks.CancellationToken cancellationToken, byte[] bArr) {
        this.zza = list;
        this.zzb = cancellationToken;
    }
}
