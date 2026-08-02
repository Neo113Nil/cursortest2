package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
abstract class zzaa extends com.google.android.libraries.places.api.model.EncodedPolyline {
    private final java.lang.String zza;

    zzaa(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null encodedPolyline");
        }
        this.zza = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.android.libraries.places.api.model.EncodedPolyline) {
            return this.zza.equals(((com.google.android.libraries.places.api.model.EncodedPolyline) obj).getEncodedPolyline());
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() ^ 1000003;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.zza;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str.length() + 33);
        sb.append("EncodedPolyline{encodedPolyline=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.libraries.places.api.model.EncodedPolyline
    public final java.lang.String getEncodedPolyline() {
        return this.zza;
    }
}
