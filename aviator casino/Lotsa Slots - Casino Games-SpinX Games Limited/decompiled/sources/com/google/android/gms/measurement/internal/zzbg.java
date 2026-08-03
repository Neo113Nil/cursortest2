package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzbg extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.measurement.internal.zzbg> CREATOR = new com.google.android.gms.measurement.internal.zzbh();
    public final java.lang.String zza;
    public final com.google.android.gms.measurement.internal.zzbe zzb;
    public final java.lang.String zzc;
    public final long zzd;

    zzbg(com.google.android.gms.measurement.internal.zzbg zzbgVar, long j) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzbgVar);
        this.zza = zzbgVar.zza;
        this.zzb = zzbgVar.zzb;
        this.zzc = zzbgVar.zzc;
        this.zzd = j;
    }

    public final java.lang.String toString() {
        java.lang.String valueOf = java.lang.String.valueOf(this.zzb);
        java.lang.String str = this.zzc;
        int length = java.lang.String.valueOf(str).length();
        java.lang.String str2 = this.zza;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 13 + java.lang.String.valueOf(str2).length() + 8 + java.lang.String.valueOf(valueOf).length());
        sb.append("origin=");
        sb.append(str);
        sb.append(",name=");
        sb.append(str2);
        sb.append(",params=");
        sb.append(valueOf);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        com.google.android.gms.measurement.internal.zzbh.zza(this, parcel, i);
    }

    public zzbg(java.lang.String str, com.google.android.gms.measurement.internal.zzbe zzbeVar, java.lang.String str2, long j) {
        this.zza = str;
        this.zzb = zzbeVar;
        this.zzc = str2;
        this.zzd = j;
    }
}
