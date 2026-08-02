package com.google.android.libraries.places.widget.internal.photoviewer;

/* loaded from: classes8.dex */
public final class zzd implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.google.android.libraries.places.widget.internal.photoviewer.zzd> CREATOR = new com.google.android.libraries.places.widget.internal.photoviewer.zzc();
    private final java.lang.String zza;
    private final java.lang.String zzb;
    private final java.lang.String zzc;
    private final java.lang.String zzd;
    private final java.lang.String zze;
    private final java.lang.String zzf;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final java.lang.String zzf() {
        return this.zzf;
    }

    public final java.lang.String zze() {
        return this.zze;
    }

    public final java.lang.String zzd() {
        return this.zzd;
    }

    public final java.lang.String zzc() {
        return this.zzc;
    }

    public final java.lang.String zzb() {
        return this.zzb;
    }

    public final java.lang.String zza() {
        return this.zza;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.zza);
        parcel.writeString(this.zzb);
        parcel.writeString(this.zzc);
        parcel.writeString(this.zzd);
        parcel.writeString(this.zze);
        parcel.writeString(this.zzf);
    }

    public final java.lang.String toString() {
        java.lang.String str = this.zza;
        int length = java.lang.String.valueOf(str).length();
        java.lang.String str2 = this.zzb;
        int length2 = java.lang.String.valueOf(str2).length();
        java.lang.String str3 = this.zzc;
        int length3 = java.lang.String.valueOf(str3).length();
        java.lang.String str4 = this.zzd;
        int length4 = java.lang.String.valueOf(str4).length();
        java.lang.String str5 = this.zze;
        int length5 = java.lang.String.valueOf(str5).length();
        java.lang.String str6 = this.zzf;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 43 + length2 + 17 + length3 + 18 + length4 + 15 + length5 + 17 + java.lang.String.valueOf(str6).length() + 1);
        sb.append("PhotoPageData(photoUri=");
        sb.append(str);
        sb.append(", photoThumbnailUri=");
        sb.append(str2);
        sb.append(", reportPhotoUri=");
        sb.append(str3);
        sb.append(", userDisplayName=");
        sb.append(str4);
        sb.append(", userImageUri=");
        sb.append(str5);
        sb.append(", userProfileUri=");
        sb.append(str6);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.zza.hashCode();
        java.lang.String str = this.zzb;
        int hashCode2 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.zzc;
        int hashCode3 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.zzd;
        int hashCode4 = str3 == null ? 0 : str3.hashCode();
        java.lang.String str4 = this.zze;
        int hashCode5 = str4 == null ? 0 : str4.hashCode();
        java.lang.String str5 = this.zzf;
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (str5 != null ? str5.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.libraries.places.widget.internal.photoviewer.zzd)) {
            return false;
        }
        com.google.android.libraries.places.widget.internal.photoviewer.zzd zzdVar = (com.google.android.libraries.places.widget.internal.photoviewer.zzd) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.zza, zzdVar.zza) && kotlin.jvm.internal.Intrinsics.areEqual(this.zzb, zzdVar.zzb) && kotlin.jvm.internal.Intrinsics.areEqual(this.zzc, zzdVar.zzc) && kotlin.jvm.internal.Intrinsics.areEqual(this.zzd, zzdVar.zzd) && kotlin.jvm.internal.Intrinsics.areEqual(this.zze, zzdVar.zze) && kotlin.jvm.internal.Intrinsics.areEqual(this.zzf, zzdVar.zzf);
    }

    public zzd(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = str5;
        this.zzf = str6;
    }
}
