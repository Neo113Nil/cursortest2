package com.google.android.libraries.places.widget.internal.placedetails;

/* loaded from: classes8.dex */
final class zzav {
    private final com.google.android.libraries.places.api.model.PhotoMetadata zza;
    private final int zzb;
    private final androidx.view.MutableLiveData zzc;

    public final androidx.view.MutableLiveData zzc() {
        return this.zzc;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final com.google.android.libraries.places.api.model.PhotoMetadata zza() {
        return this.zza;
    }

    public final java.lang.String toString() {
        com.google.android.libraries.places.api.model.PhotoMetadata photoMetadata = this.zza;
        int length = java.lang.String.valueOf(photoMetadata).length();
        int i = this.zzb;
        int length2 = java.lang.String.valueOf(i).length();
        androidx.view.MutableLiveData mutableLiveData = this.zzc;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 40 + length2 + 14 + java.lang.String.valueOf(mutableLiveData).length() + 1);
        sb.append("PhotoUriRequest(metadata=");
        sb.append(photoMetadata);
        sb.append(", maxDimension=");
        sb.append(i);
        sb.append(", destination=");
        sb.append(mutableLiveData);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.zza.hashCode() * 31) + java.lang.Integer.hashCode(this.zzb)) * 31) + this.zzc.hashCode();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.libraries.places.widget.internal.placedetails.zzav)) {
            return false;
        }
        com.google.android.libraries.places.widget.internal.placedetails.zzav zzavVar = (com.google.android.libraries.places.widget.internal.placedetails.zzav) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.zza, zzavVar.zza) && this.zzb == zzavVar.zzb && kotlin.jvm.internal.Intrinsics.areEqual(this.zzc, zzavVar.zzc);
    }

    public zzav(com.google.android.libraries.places.api.model.PhotoMetadata photoMetadata, int i, androidx.view.MutableLiveData mutableLiveData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(photoMetadata, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutableLiveData, "");
        this.zza = photoMetadata;
        this.zzb = i;
        this.zzc = mutableLiveData;
    }
}
