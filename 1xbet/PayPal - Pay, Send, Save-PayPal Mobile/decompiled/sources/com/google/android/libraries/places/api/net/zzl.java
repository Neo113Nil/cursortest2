package com.google.android.libraries.places.api.net;

/* loaded from: classes8.dex */
final class zzl extends com.google.android.libraries.places.api.net.FindAutocompletePredictionsResponse {
    private final java.util.List zza;

    zzl(java.util.List list) {
        if (list == null) {
            throw new java.lang.NullPointerException("Null autocompletePredictions");
        }
        this.zza = list;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.android.libraries.places.api.net.FindAutocompletePredictionsResponse) {
            return this.zza.equals(((com.google.android.libraries.places.api.net.FindAutocompletePredictionsResponse) obj).getAutocompletePredictions());
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() ^ 1000003;
    }

    public final java.lang.String toString() {
        java.lang.String obj = this.zza.toString();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(obj.length() + 61);
        sb.append("FindAutocompletePredictionsResponse{autocompletePredictions=");
        sb.append(obj);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsResponse
    public final java.util.List<com.google.android.libraries.places.api.model.AutocompletePrediction> getAutocompletePredictions() {
        return this.zza;
    }
}
