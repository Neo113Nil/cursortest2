package com.google.android.libraries.places.api.net;

/* loaded from: classes8.dex */
final class zzc extends com.google.android.libraries.places.api.net.FetchPhotoResponse {
    private final android.graphics.Bitmap zza;

    zzc(android.graphics.Bitmap bitmap) {
        if (bitmap == null) {
            throw new java.lang.NullPointerException("Null bitmap");
        }
        this.zza = bitmap;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.android.libraries.places.api.net.FetchPhotoResponse) {
            return this.zza.equals(((com.google.android.libraries.places.api.net.FetchPhotoResponse) obj).getBitmap());
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() ^ 1000003;
    }

    public final java.lang.String toString() {
        java.lang.String obj = this.zza.toString();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(obj.length() + 27);
        sb.append("FetchPhotoResponse{bitmap=");
        sb.append(obj);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.libraries.places.api.net.FetchPhotoResponse
    public final android.graphics.Bitmap getBitmap() {
        return this.zza;
    }
}
