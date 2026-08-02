package com.google.android.libraries.places.api.net;

/* loaded from: classes8.dex */
final class zzq extends com.google.android.libraries.places.api.net.IsOpenRequest {
    private final com.google.android.libraries.places.api.model.Place zza;
    private final java.lang.String zzb;
    private final long zzc;
    private final com.google.android.gms.tasks.CancellationToken zzd;

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.libraries.places.api.net.IsOpenRequest)) {
            return false;
        }
        com.google.android.libraries.places.api.net.IsOpenRequest isOpenRequest = (com.google.android.libraries.places.api.net.IsOpenRequest) obj;
        com.google.android.libraries.places.api.model.Place place = this.zza;
        if (place == null) {
            if (isOpenRequest.getPlace() != null) {
                return false;
            }
        } else if (!place.equals(isOpenRequest.getPlace())) {
            return false;
        }
        java.lang.String str = this.zzb;
        if (str == null) {
            if (isOpenRequest.getPlaceId() != null) {
                return false;
            }
        } else if (!str.equals(isOpenRequest.getPlaceId())) {
            return false;
        }
        if (this.zzc != isOpenRequest.getUtcTimeMillis()) {
            return false;
        }
        com.google.android.gms.tasks.CancellationToken cancellationToken = this.zzd;
        if (cancellationToken == null) {
            if (isOpenRequest.getCancellationToken() != null) {
                return false;
            }
        } else if (!cancellationToken.equals(isOpenRequest.getCancellationToken())) {
            return false;
        }
        return true;
    }

    public final java.lang.String toString() {
        com.google.android.gms.tasks.CancellationToken cancellationToken = this.zzd;
        java.lang.String valueOf = java.lang.String.valueOf(this.zza);
        java.lang.String valueOf2 = java.lang.String.valueOf(cancellationToken);
        int length = java.lang.String.valueOf(valueOf).length();
        java.lang.String str = this.zzb;
        int length2 = java.lang.String.valueOf(str).length();
        long j = this.zzc;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 30 + length2 + 16 + java.lang.String.valueOf(j).length() + 20 + java.lang.String.valueOf(valueOf2).length() + 1);
        sb.append("IsOpenRequest{place=");
        sb.append(valueOf);
        sb.append(", placeId=");
        sb.append(str);
        sb.append(", utcTimeMillis=");
        sb.append(j);
        sb.append(", cancellationToken=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }

    public final int hashCode() {
        com.google.android.libraries.places.api.model.Place place = this.zza;
        int hashCode = place == null ? 0 : place.hashCode();
        java.lang.String str = this.zzb;
        int hashCode2 = str == null ? 0 : str.hashCode();
        long j = this.zzc;
        com.google.android.gms.tasks.CancellationToken cancellationToken = this.zzd;
        return ((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ (cancellationToken != null ? cancellationToken.hashCode() : 0);
    }

    @Override // com.google.android.libraries.places.api.net.IsOpenRequest
    public final long getUtcTimeMillis() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.api.net.IsOpenRequest
    public final java.lang.String getPlaceId() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.net.IsOpenRequest
    public final com.google.android.libraries.places.api.model.Place getPlace() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.net.IsOpenRequest, com.google.android.libraries.places.internal.zzmq
    public final com.google.android.gms.tasks.CancellationToken getCancellationToken() {
        return this.zzd;
    }

    /* synthetic */ zzq(com.google.android.libraries.places.api.model.Place place, java.lang.String str, long j, com.google.android.gms.tasks.CancellationToken cancellationToken, byte[] bArr) {
        this.zza = place;
        this.zzb = str;
        this.zzc = j;
        this.zzd = cancellationToken;
    }
}
