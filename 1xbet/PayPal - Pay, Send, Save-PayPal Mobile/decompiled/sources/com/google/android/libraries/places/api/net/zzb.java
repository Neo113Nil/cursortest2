package com.google.android.libraries.places.api.net;

/* loaded from: classes8.dex */
final class zzb extends com.google.android.libraries.places.api.net.FetchPhotoRequest {
    private final java.lang.Integer zza;
    private final java.lang.Integer zzb;
    private final com.google.android.libraries.places.api.model.PhotoMetadata zzc;
    private final com.google.android.gms.tasks.CancellationToken zzd;

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.libraries.places.api.net.FetchPhotoRequest)) {
            return false;
        }
        com.google.android.libraries.places.api.net.FetchPhotoRequest fetchPhotoRequest = (com.google.android.libraries.places.api.net.FetchPhotoRequest) obj;
        java.lang.Integer num = this.zza;
        if (num == null) {
            if (fetchPhotoRequest.getMaxWidth() != null) {
                return false;
            }
        } else if (!num.equals(fetchPhotoRequest.getMaxWidth())) {
            return false;
        }
        java.lang.Integer num2 = this.zzb;
        if (num2 == null) {
            if (fetchPhotoRequest.getMaxHeight() != null) {
                return false;
            }
        } else if (!num2.equals(fetchPhotoRequest.getMaxHeight())) {
            return false;
        }
        if (!this.zzc.equals(fetchPhotoRequest.getPhotoMetadata())) {
            return false;
        }
        com.google.android.gms.tasks.CancellationToken cancellationToken = this.zzd;
        if (cancellationToken == null) {
            if (fetchPhotoRequest.getCancellationToken() != null) {
                return false;
            }
        } else if (!cancellationToken.equals(fetchPhotoRequest.getCancellationToken())) {
            return false;
        }
        return true;
    }

    public final java.lang.String toString() {
        com.google.android.gms.tasks.CancellationToken cancellationToken = this.zzd;
        java.lang.String obj = this.zzc.toString();
        java.lang.String valueOf = java.lang.String.valueOf(cancellationToken);
        java.lang.Integer num = this.zza;
        int length = java.lang.String.valueOf(num).length();
        java.lang.Integer num2 = this.zzb;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 39 + java.lang.String.valueOf(num2).length() + 16 + obj.length() + 20 + java.lang.String.valueOf(valueOf).length() + 1);
        sb.append("FetchPhotoRequest{maxWidth=");
        sb.append(num);
        sb.append(", maxHeight=");
        sb.append(num2);
        sb.append(", photoMetadata=");
        sb.append(obj);
        sb.append(", cancellationToken=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.Integer num = this.zza;
        int hashCode = num == null ? 0 : num.hashCode();
        java.lang.Integer num2 = this.zzb;
        int hashCode2 = num2 == null ? 0 : num2.hashCode();
        int hashCode3 = this.zzc.hashCode();
        com.google.android.gms.tasks.CancellationToken cancellationToken = this.zzd;
        return ((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ (cancellationToken != null ? cancellationToken.hashCode() : 0);
    }

    @Override // com.google.android.libraries.places.api.net.FetchPhotoRequest
    public final com.google.android.libraries.places.api.model.PhotoMetadata getPhotoMetadata() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.api.net.FetchPhotoRequest
    public final java.lang.Integer getMaxWidth() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.net.FetchPhotoRequest
    public final java.lang.Integer getMaxHeight() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.net.FetchPhotoRequest, com.google.android.libraries.places.internal.zzmq
    public final com.google.android.gms.tasks.CancellationToken getCancellationToken() {
        return this.zzd;
    }

    /* synthetic */ zzb(java.lang.Integer num, java.lang.Integer num2, com.google.android.libraries.places.api.model.PhotoMetadata photoMetadata, com.google.android.gms.tasks.CancellationToken cancellationToken, byte[] bArr) {
        this.zza = num;
        this.zzb = num2;
        this.zzc = photoMetadata;
        this.zzd = cancellationToken;
    }
}
