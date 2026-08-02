package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzok implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.google.android.libraries.places.internal.zzok> CREATOR = new com.google.android.libraries.places.internal.zzoj();
    private final boolean zza;
    private final boolean zzb;
    private final boolean zzc;
    private final boolean zzd;
    private final boolean zze;

    public zzok() {
        this(false, false, false, false, false);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean zze() {
        return this.zze;
    }

    public final boolean zzd() {
        return this.zzd;
    }

    public final boolean zzc() {
        return this.zzc;
    }

    public final boolean zzb() {
        return this.zzb;
    }

    public final boolean zza() {
        return this.zza;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.zza ? 1 : 0);
        parcel.writeInt(this.zzb ? 1 : 0);
        parcel.writeInt(this.zzc ? 1 : 0);
        parcel.writeInt(this.zzd ? 1 : 0);
        parcel.writeInt(this.zze ? 1 : 0);
    }

    public final java.lang.String toString() {
        boolean z = this.zza;
        int length = java.lang.String.valueOf(z).length();
        boolean z2 = this.zzb;
        int length2 = java.lang.String.valueOf(z2).length();
        boolean z3 = this.zzc;
        int length3 = java.lang.String.valueOf(z3).length();
        boolean z4 = this.zzd;
        int length4 = java.lang.String.valueOf(z4).length();
        boolean z5 = this.zze;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 80 + length2 + 29 + length3 + 23 + length4 + 29 + java.lang.String.valueOf(z5).length() + 1);
        sb.append("AutocompleteThemeCustomization(isCustomColorApplied=");
        sb.append(z);
        sb.append(", isCustomTypographyApplied=");
        sb.append(z2);
        sb.append(", isCustomMeasurementApplied=");
        sb.append(z3);
        sb.append(", isCustomShapeApplied=");
        sb.append(z4);
        sb.append(", isCustomAttributionApplied=");
        sb.append(z5);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((java.lang.Boolean.hashCode(this.zza) * 31) + java.lang.Boolean.hashCode(this.zzb)) * 31) + java.lang.Boolean.hashCode(this.zzc)) * 31) + java.lang.Boolean.hashCode(this.zzd)) * 31) + java.lang.Boolean.hashCode(this.zze);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.libraries.places.internal.zzok)) {
            return false;
        }
        com.google.android.libraries.places.internal.zzok zzokVar = (com.google.android.libraries.places.internal.zzok) obj;
        return this.zza == zzokVar.zza && this.zzb == zzokVar.zzb && this.zzc == zzokVar.zzc && this.zzd == zzokVar.zzd && this.zze == zzokVar.zze;
    }

    public zzok(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.zza = z;
        this.zzb = z2;
        this.zzc = z3;
        this.zzd = z4;
        this.zze = z5;
    }
}
