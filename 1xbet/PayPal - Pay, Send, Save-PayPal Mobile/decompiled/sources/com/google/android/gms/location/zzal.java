package com.google.android.gms.location;

@java.lang.Deprecated
/* loaded from: classes8.dex */
public final class zzal extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.location.zzal> CREATOR = new com.google.android.gms.location.zzam();
    public final int zza;
    public final int zzb;
    public final long zzc;
    public final long zzd;

    zzal(int i, int i2, long j, long j2) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = j;
        this.zzd = j2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.location.zzal)) {
            return false;
        }
        com.google.android.gms.location.zzal zzalVar = (com.google.android.gms.location.zzal) obj;
        return this.zza == zzalVar.zza && this.zzb == zzalVar.zzb && this.zzc == zzalVar.zzc && this.zzd == zzalVar.zzd;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Integer.valueOf(this.zzb), java.lang.Integer.valueOf(this.zza), java.lang.Long.valueOf(this.zzd), java.lang.Long.valueOf(this.zzc));
    }

    public final java.lang.String toString() {
        int i = this.zza;
        int length = java.lang.String.valueOf(i).length();
        int i2 = this.zzb;
        int length2 = java.lang.String.valueOf(i2).length();
        long j = this.zzd;
        int length3 = java.lang.String.valueOf(j).length();
        long j2 = this.zzc;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 50 + length2 + 18 + length3 + 17 + java.lang.String.valueOf(j2).length());
        sb.append("NetworkLocationStatus: Wifi status: ");
        sb.append(i);
        sb.append(" Cell status: ");
        sb.append(i2);
        sb.append(" elapsed time NS: ");
        sb.append(j);
        sb.append(" system time ms: ");
        sb.append(j2);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int i2 = this.zza;
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, i2);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 3, this.zzc);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 4, this.zzd);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
