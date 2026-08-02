package com.google.android.libraries.places.widget.internal.placedetails;

/* loaded from: classes8.dex */
final class zzbs {
    private final int zza;
    private final boolean zzb;

    public final int zza(int i) {
        int i2 = this.zza;
        return i < i2 ? com.google.android.libraries.places.R.drawable.ratings_full_star : i == i2 ? this.zzb ? com.google.android.libraries.places.R.drawable.ratings_half_star : com.google.android.libraries.places.R.drawable.ratings_empty_star : com.google.android.libraries.places.R.drawable.ratings_empty_star;
    }

    public final java.lang.String toString() {
        int i = this.zza;
        int length = java.lang.String.valueOf(i).length();
        boolean z = this.zzb;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 40 + java.lang.String.valueOf(z).length() + 1);
        sb.append("StarsModel(numWholeStars=");
        sb.append(i);
        sb.append(", showHalfStar=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (java.lang.Integer.hashCode(this.zza) * 31) + java.lang.Boolean.hashCode(this.zzb);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.libraries.places.widget.internal.placedetails.zzbs)) {
            return false;
        }
        com.google.android.libraries.places.widget.internal.placedetails.zzbs zzbsVar = (com.google.android.libraries.places.widget.internal.placedetails.zzbs) obj;
        return this.zza == zzbsVar.zza && this.zzb == zzbsVar.zzb;
    }

    public zzbs(int i, boolean z) {
        this.zza = i;
        this.zzb = z;
    }
}
